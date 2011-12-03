/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package redesp2;

import com.melloware.jspiff.jaxp.*;
import entagged.audioformats.AudioFile;
import entagged.audioformats.AudioFileFilter;
import entagged.audioformats.AudioFileIO;
import entagged.audioformats.Tag;
import entagged.audioformats.exceptions.CannotReadException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 *
 * @author leofaster
 */
public class explorador {

    // Process all files and directories under dir
    public static void visitAllDirsAndFiles(File dir, AudioFileFilter filter, XspfPlaylistTrackList tracks) throws CannotReadException {



        if (dir.isDirectory()) {
            File[] children = dir.listFiles(filter);
            for (int i = 0; i < children.length; i++) {
                // System.out.println("Directorio: " + dir.getName());
                visitAllDirsAndFiles(new File(dir, children[i].getName()), filter, tracks);
            }
        } else {

            //System.out.println(dir.getName() + " Ubicacion: "+ dir.getPath() );

            addLista(tracks, dir);

        }
    }

    public static void main(String[] args) throws CannotReadException, IOException {
        String directorio ="C:/adele" ;
        File dir = new File(directorio);
        AudioFileFilter filter = new AudioFileFilter();
        XspfPlaylist playlist = new XspfPlaylist();
        playlist.setTitle("Playlist de " +directorio);
        playlist.setDate(new Timestamp(System.currentTimeMillis()));
        XspfPlaylistTrackList tracks = new XspfPlaylistTrackList();



        visitAllDirsAndFiles(dir, filter, tracks);
        // add track to playlist
        playlist.setPlaylistTrackList(tracks);
        // Empieza impresion del documento

        final File file = new File("test.xspf");
        final OutputFormat format = OutputFormat.createPrettyPrint();
        final XMLWriter writer = new XMLWriter(new FileWriter(file), format);
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(playlist.makeTextDocument());
        } catch (DocumentException ex) {
            Logger.getLogger(explorador.class.getName()).log(Level.SEVERE, null, ex);
        }
        writer.write(doc);
        writer.close();


        // termina la impresion del documento



    }

    private static void addLista(XspfPlaylistTrackList tracks, File file) {
        AudioFile audioFile = null;
        try {
            audioFile = AudioFileIO.read(file); //Reads the given file.
        } catch (CannotReadException ex) {
            Logger.getLogger(explorador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tag tag = audioFile.getTag();

        XspfTrack track = new XspfTrack();
        track.setLocation(file.getPath());
        track.setCreator(tag.getFirstArtist());
        track.setAlbum(tag.getFirstAlbum());
        track.setTitle(tag.getFirstTitle());
        track.setAnnotation(tag.getFirstComment());
        
        

        
        XspfMeta meta = new XspfMeta();
        meta.setRel("Genre");
        meta.setContent(tag.getFirstGenre());
        track.addMeta(meta);
//        XspfMeta meta2 = new XspfMeta();
//        meta2.setRel("Track");
//        meta2.setContent(tag.getFirstTrack());
//        track.addMeta(meta2);
        
        XspfExtension extension =  new XspfExtension ();
        extension.setApplication("Track");
        track.addIdentifier(tag.getFirstYear());
        extension.addContentByString(tag.getFirstTrack());
        track.addExtension(extension);
//        
        
       // track.addIdentifier(0,tag.getFirstGenre());
       // track.addIdentifier(1, tag.getFirstYear());
        tracks.addTrack(track);


    }
}

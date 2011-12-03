
import java.util.Vector;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import nanoxml.XMLElement;
import redesp2.cancion;

public class DumpXML {

 public static void main(String[] args)
            throws Exception {
   XMLElement xml = new XMLElement();
   FileReader reader = new FileReader("test.xspf");
   xml.parseFromReader(reader);
   //System.out.println(xml);
   List lista = new LinkedList();
   cancion nueva;
     for (XMLElement playlist : (Vector<XMLElement>) xml.getChildren()) {
       for (XMLElement tracklist : (Vector<XMLElement>) playlist.getChildren()) {
            nueva = new cancion();
            // System.out.println(": " + tracklist.getName());
          for (XMLElement track : (Vector<XMLElement>) tracklist.getChildren()) {
                     //     System.out.println(track.getName());
             if (track.getName().equals("location")) {
                 nueva.setLocation(track.getContent());
               //  System.out.println("Location: " + track.getContent());
              }
             if (track.getName().equals("title")) {
              // System.out.println("title: " + track.getContent());
               nueva.setTitle(track.getContent());
              }
             if (track.getName().equals("creator")) {
             //  System.out.println("creator: " + track.getContent());
               nueva.setCreator(track.getContent());
              }
             if (track.getName().equals("album")) {
             //  System.out.println("album: " + track.getContent());
               nueva.setAlbum(track.getContent());
              }
             if (track.getName().equals("meta")) {
           //    for (XMLElement app : (Vector<XMLElement>) track.getChildren()) {
             //  System.out.println("Genero: " + track.getContent());
                nueva.setGenre(track.getContent());
             //  }
              }if (track.getName().equals("extension")) {
                 // System.out.println("Track: " + track.getContent());
                  nueva.setTrack(track.getContent());
              }if (track.getName().equals("identifier")) {
                 // System.out.println("year: " + track.getContent());
                  nueva.setYear(Integer.parseInt(track.getContent()));
                  
              }
             
          }lista.add(nueva);
        }
      }
     
     System.out.println("Tamano de la lista "+ lista.size());
     
     
   
   }
}

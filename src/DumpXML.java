
import java.util.Vector;
import java.io.FileReader;
import java.util.Enumeration;
import nanoxml.XMLElement;

public class DumpXML {

 public static void main(String[] args)
            throws Exception {
   XMLElement xml = new XMLElement();
   FileReader reader = new FileReader("amor.xspf");
   xml.parseFromReader(reader);
   System.out.println(xml);

     for (XMLElement playlist : (Vector<XMLElement>) xml.getChildren()) {
       for (XMLElement tracklist : (Vector<XMLElement>) playlist.getChildren()) {
          for (XMLElement track : (Vector<XMLElement>) tracklist.getChildren()) {
             if (track.getName().equals("location")) {
               System.out.println("Location: " + track.getContent());
              }
             if (track.getName().equals("title")) {
               System.out.println("title: " + track.getContent());
              }
             if (track.getName().equals("creator")) {
               System.out.println("creator: " + track.getContent());
              }
             if (track.getName().equals("album")) {
               System.out.println("album: " + track.getContent());
              }
             if (track.getName().equals("extension")) {
               for (XMLElement app : (Vector<XMLElement>) track.getChildren()) {
                System.out.println("Genero: " + app.getContent());
               }
             }
          }
        }
      }
   }
}

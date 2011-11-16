import java.io.FileReader;
import nanoxml.XMLElement;



public class DumpXML
{
  public static void main(String[] args)
      throws Exception
        {
	    XMLElement xml = new XMLElement();
            FileReader reader = new FileReader("amor.xspf");
	    xml.parseFromReader(reader);
            System.out.println(xml);
	  }
 }

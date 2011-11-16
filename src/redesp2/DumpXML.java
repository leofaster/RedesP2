import net.n3.nanoxml.*;
import java.io.*;
public class DumpXML
{
  public static void main(String[] args)
      throws Exception
        {
	    XMLElement xml = new XMLElement();
            FileReader reader = new FileReader("AtariAmor.xspf");
	    xml.parseFromReader(reader);
            System.out.println(xml);
	  }
 }

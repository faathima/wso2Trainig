import java.io.*;
import org.xml.sax.*;
import javax.xml.parsers.SAXParserFactory;  
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class testSax extends HandlerBase {
	public static void main(String [] args){

        if (args.length != 1) {
            System.err.println ("Usage: cmd filename");
            System.exit (1);
        }
        // Use the default (non-validating) parser
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            // Set up output stream
            out = new OutputStreamWriter (System.out, "UTF8");
            
            // Parse the input 
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse( new File(argv [0]), new Echo() );

        } catch (Throwable t) {
            t.printStackTrace ();
        }
        System.exit (0);
    }
 
    static private Writer out;
	}
public void startDocument ()
	    throws SAXException
	    {
	emit ("<?xml version='1.0' encoding='UTF-8'?>");
    nl();
	    }

	    public void endDocument ()
	    throws SAXException
	    {
	    	try {
	            nl();
	            out.flush ();
	        } catch (IOException e) {
	            throw new SAXException ("I/O error", e);
	        }
	    }

	    public void startElement (String name, AttributeList attrs)
	    throws SAXException
	    {
	    	 emit ("<"+name);
	         if (attrs != null) {
	             for (int i = 0; i < attrs.getLength (); i++) {             
	                 emit (" ");
	                 emit (attrs.getName(i)+"=\""+attrs.getValue (i)+"\"");
	             }
	         }
	         emit (">");
	    }

	    public void endElement (String name)
	    throws SAXException
	    {
	    	emit ("</"+name+">");
	    }

	    public void characters (char buf [], int offset, int len)
	    throws SAXException
	    {
	    	String s = new String(buf, offset, len);
	        emit (s);
	    }

private void emit (String s)
throws SAXException
{
    try {
        out.write (s);
        out.flush ();
    } catch (IOException e) {
        throw new SAXException ("I/O error", e);
    }
}
private void nl ()
	    throws SAXException
	    {
	        String lineEnd =  System.getProperty("line.separator");
	        try {
	            out.write (lineEnd);
	       
	        } catch (IOException e) {
	            throw new SAXException ("I/O error", e);
	        }
	    }
}


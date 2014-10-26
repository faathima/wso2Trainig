package tutorial;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class driver {
public static void main(String [] args) throws IOException, SAXException{
	XMLReader p= XMLReaderFactory.createXMLReader();
	
	p.setContentHandler(new academicHandler());
	
	p.parse("academic.xml");
}}

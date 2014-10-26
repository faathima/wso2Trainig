package tutorial;

import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class academicHandler extends DefaultHandler {



	@Override
	public void startDocument() throws SAXException {
		System.out.println("begining the documnet");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("end of documnet");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("<"+qName+">");
	}
    
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		for(int i=start;i<(start+length);i++){
			System.out.print(ch[i]);
		}
	}
	}


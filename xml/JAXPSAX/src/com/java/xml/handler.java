package com.java.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.java.xml.domain.channel;
import com.java.xml.domain.tutorial;

public class handler extends DefaultHandler {
	channel  Channel=null;
	tutorial Tutorial=null;
	
	@Override
	public void startDocument() throws SAXException {
		Channel=new channel();            
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if(qName.equals("channel")){
			channel .setName(attributes.getValue("name"));
		}else if (qName.equals("tutorial")){
		}
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
	}

	

	

}

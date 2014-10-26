package com.za.tutorial.java.xml;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.za.tutorial.java.xml.domain.Channel;
import com.za.tutorial.java.xml.domain.Tutorial;

public class ParseWithXMLReaderDriver {

	public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
		XMLReader xMLReader=SAXParserFactory.newInstance().newSAXParser().getXMLReader();
		ZAHandler zAHandler =new ZAHandler();
		xMLReader.setContentHandler(zAHandler);
		xMLReader.parse(new InputSource("zaneacademy.xml"));
		Channel channel=zAHandler.getChannel();
		System.out.println("channel(name ="+channel.getName()+")");
		Iterator<Tutorial> iterator=channel.getTutorials().iterator();
		while(iterator.hasNext()){
			//System.out.println("ffms");
			System.out.println("tutorial(name=");
			//iterator.next().getName();
			System.out.println(iterator.next().getName()) ;
		}
		//System.out.println("ffms");
	}
	}


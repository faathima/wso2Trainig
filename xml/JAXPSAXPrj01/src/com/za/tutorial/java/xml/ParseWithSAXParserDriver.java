package com.za.tutorial.java.xml;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.za.tutorial.java.xml.domain.Channel;
import com.za.tutorial.java.xml.domain.Tutorial;

public class ParseWithSAXParserDriver {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParser sAXParser=(SAXParserFactory.newInstance()).newSAXParser();
		ZAHandler zAHandler=new ZAHandler();
		sAXParser.parse(new File("zaneacademy.xml"),zAHandler);
		Channel channel=zAHandler.getChannel();
		System.out.println("channel(name ="+channel.getName()+")");
		//System.out.println("ffms");
		Iterator<Tutorial> iterator=channel.getTutorials().iterator();
		// System.out.println("ffms");
		while(iterator.hasNext()){
			//System.out.println("ffms");
			System.out.println("tutorial(name=");
			//iterator.next().getName();
			System.out.println(iterator.next().getName()) ;
		}
		//System.out.println("ffms");
	}

}
package com.ffms.xml;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class studentSAXParser {
	

	 public static void main(String[] args) {

	  try {
	   // Setup the parser
		  SAXParser sAXParser=(SAXParserFactory.newInstance()).newSAXParser();
		 /*SAXParserFactory parserFactory = SAXParserFactory.newInstance();
	     SAXParser parser = parserFactory.newSAXParser();*/
		  
		  /* Setup the handler
		   studentHandler handler = new studentHandler();
		   
		  sAXParser.parse("student.xml", handler);*/
		  sAXParser.parse("student.xml", new studentHandler());
		  
		  
		  /*Read the XML file
	   	  File inputFile = new File("student.xml");
	   	  InputStream inputStream = new FileInputStream(inputFile);
	   
	   	  // Parse the XML file using the handler
	   	  parser.parse(inputStream, handler);*/
	   
	  } catch (ParserConfigurationException | SAXException | IOException e) {
	   e.printStackTrace();
	  } 
	 }
	}


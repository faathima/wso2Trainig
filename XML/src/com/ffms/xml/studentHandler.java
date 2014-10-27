package com.ffms.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class studentHandler extends DefaultHandler  {
	public studentHandler(){
		
	}
	 
	// start Document
	 public void startDocument() throws SAXException { 
	  System.out.println("startDocument");
	 }
	 
	// start Element
		 public void startElement(String namespaceURI,
		   String sName, String qName,
		   Attributes attributes) throws SAXException { 
			 System.out.print(qName+":-");
			 int length = attributes.getLength();
			  //Each attribute
			  for (int i=0; i<length; i++) {
			  // Get names and values to each attribute
			  String name = attributes.getQName(i);
			  System.out.print(name);
			  String value = attributes.getValue(i);
			  System.out.println("\t"+value); }
		 }
	
		 
		// Character events
		 public void characters(char buf[], int offset, 
		   int len) throws SAXException {
			 for(int i=offset;i<(offset+len);i++){
					System.out.print(buf[i]);
					}
			 
		 }
		 
	public void endElement(String namespaceURI,
				   String sName, String qName ) throws SAXException {
		
				 }

	 public void endDocument() throws SAXException {
	  System.out.println("end Document");
	 }

	 	
	 
	}




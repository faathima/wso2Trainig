package com.java.xml;

import java.io.File;


// JAXP
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;


// SAX
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class saxTest{
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.err.println ("Usage: java TestSAXParsing [filename]");
                System.exit (1);
            }
            /**
             * 1. Create a SAXParser instance - vendor specific parser
             */
            // Get SAX Parser Factory
            SAXParserFactory factory = SAXParserFactory.newInstance(); //provides the method to obtain the SAX-capable parser
            // Turn on validation, and turn off namespaces
            factory.setValidating(true); //turn on the DTD validation
            factory.setNamespaceAware(false); //set namespace awareness
            SAXParser parser = factory.newSAXParser();//wraps underlying SAX parser

     
            /**
             * 3. Start parsing
             */
            parser.parse(new File(args[0]), new MyHandler());
            
            
        } catch (ParserConfigurationException e) {
            System.out.println("The underlying parser does not support " +
                               " the requested features.");
        } catch (FactoryConfigurationError e) {
            System.out.println("Error occurred obtaining SAX Parser Factory.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 * 2. Register callback implementations
 */
class MyHandler extends DefaultHandler {
    // SAX callback implementations from ContentHandler, ErrorHandler, etc.
}



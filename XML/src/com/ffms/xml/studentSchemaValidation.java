package com.ffms.xml;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class studentSchemaValidation {

	public static void main(String[] args) {
		boolean flag = true;
		try {
			validation("student.xml", "studentSchema.xsd");
		} catch (SAXException e) {
			System.out.println(e);
			flag = false;
		} catch (IOException e) {
			System.out.println(e);
			flag = false;
		}
		System.out.println("XML File is valid: " + flag);
	}

	public static void validation(String XMLFile, String validationFile)
			throws SAXException, IOException {
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		((schemaFactory.newSchema(new File(validationFile))).newValidator())
				.validate(new StreamSource(new File(XMLFile)));
	}
}

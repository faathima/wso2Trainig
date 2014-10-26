package com.axiomSample;
	import javax.xml.stream.XMLStreamException;
	import org.apache.axiom.om.OMAbstractFactory;
	import org.apache.axiom.om.OMElement;
	import org.apache.axiom.om.OMFactory;
	import org.apache.axiom.om.OMNamespace;

	public class SampleService {

	    public OMElement sayHello(OMElement element) 
	                             throws XMLStreamException {
	            element.build();
	            element.detach();

	            String rootName = element.getLocalName();
	            System.out.println("Reading "+rootName+" element");
	            
	            OMElement childElement = element.getFirstElement();
	            String personToGreet = childElement.getText();

	            OMFactory fac = OMAbstractFactory.getOMFactory();
	            OMNamespace omNs = fac.createOMNamespace(
	                    "http://example1.org/example1", "example1");
	            OMElement method = fac.createOMElement("sayHelloResponse", 
	omNs);
	            OMElement value = fac.createOMElement("greeting", omNs);
	            value.addChild(fac.createOMText(value, "Hello, "+personToGreet));
	            method.addChild(value);

	            return method;
	        }

	     private void ping(){
	     }
	    
	}


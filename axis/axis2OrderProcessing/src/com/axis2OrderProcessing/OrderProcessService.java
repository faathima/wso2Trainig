package com.axis2OrderProcessing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

import com.axis2OrderProcessing.Item;

public class OrderProcessService {

	private List<Item> itemlist;

	public OrderProcessService() {

		itemlist=new ArrayList<>();
		itemlist.add(new Item("Laptop", 100000,"A brand new Toshiba Laptop"));
		itemlist.add(new Item("Mouse", 500, "An Optical Mouse"));
		itemlist.add(new Item("Headphone", 1500,"A Sony erricson headphone"));
	}

	public OMElement pingMe(OMElement empty) throws XMLStreamException {

		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
		OMElement method = fac.createOMElement("pingResponse", omNs);
		OMElement value = fac.createOMElement("value", omNs);
		value.addChild(fac.createOMText("Hi!!"));
		method.addChild(value);
		return method;
	}
	
	public OMElement testMe(OMElement empty) throws XMLStreamException {

		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
		OMElement method = fac.createOMElement("testResponse", omNs);
		OMElement value = itemlist.get(0).getOMElement();
		method.addChild(value);
		return method;
	}

	
	
	
}


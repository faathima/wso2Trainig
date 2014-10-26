package com.axis2OrderProcessing;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

public class Item {

	
	private String name;
	private int price;
	private String description;
	
	
	
	public Item(String name, int price,String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}








	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public OMElement getOMElement() {
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
		OMElement item = fac.createOMElement("item", omNs);
		OMElement name = fac.createOMElement("name", omNs);
		OMElement price = fac.createOMElement("price", omNs);
		OMElement description = fac.createOMElement("description", omNs);
		name.addChild(fac.createOMText(this.name));
		price.addChild(fac.createOMText(this.price + ""));
		description.addChild(fac.createOMText(this.description +""));		
		item.addChild(name);
		item.addChild(price);
		item.addChild(description);
		
		return item;
    }
	
	
	
}

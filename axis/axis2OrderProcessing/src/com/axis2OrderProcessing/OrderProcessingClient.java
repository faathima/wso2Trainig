package com.axis2OrderProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;


public class OrderProcessingClient {
	

	private static EndpointReference targetEPR = new EndpointReference("http://localhost:8080/axis2/services/OrderProcessingService");

	private Options options;
	private ServiceClient sender;
	private PrintWriter writer;	
	private File debugfile=new File("./src/debug/xmloutputtest.xml");
	
	public OrderProcessingClient() {
		options = new Options();
		options.setTo(targetEPR);
		options.setTransportInProtocol(Constants.TRANSPORT_HTTP);

		try {
	        sender = new ServiceClient();
	        sender.setOptions(options);
        } catch (AxisFault e) {
	        e.printStackTrace();
        }

}


public OMElement pingMeRequest(){
	OMFactory fac = OMAbstractFactory.getOMFactory();
	OMNamespace omNs = fac.createOMNamespace("http://example1.org/example1", "example1");
	OMElement method = fac.createOMElement("pingMe", omNs);
	return method;
}


public static void main(String[] args) {
	try {
		
		OMElement payload;
		
		
		OrderProcessingClient newClient = new OrderProcessingClient();	
		
		
		Item nItem= new Item("Mouse", 500, "An Optical Mouse");
		

		

	} catch (Exception e) {
		System.out.println(e.toString());
	}
}


}

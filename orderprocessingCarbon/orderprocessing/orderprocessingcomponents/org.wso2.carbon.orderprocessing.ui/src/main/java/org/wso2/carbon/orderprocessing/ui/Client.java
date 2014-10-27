package org.wso2.carbon.orderprocessing.ui;

import java.rmi.RemoteException;

import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.orderprocessing.stub.*;
import org.wso2.carbon.orderprocessing.xsd.Product;

public class Client {
	private OrderprocessingStub orderProcessStub;
	private static Client Client;
	 String serviceURL="none";
	 
	 public static Client getOrderProcessClient() throws Exception{
	       
	        	return Client;
	    }
	 
	 
    public Client(ConfigurationContext configCtx, String backendServerURL, String cookie) throws Exception{
        serviceURL = backendServerURL + "orderprocessing";
        orderProcessStub = new OrderprocessingStub(configCtx, serviceURL);
        ServiceClient client = orderProcessStub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);
        options.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, cookie);
        Client=this;
    }
    public Product addProduct() throws Exception{
        try{
    		Product product1 = new Product();
    		product1.setProductId(1);
    		product1.setProductName("iPad");
    		product1.setUnitPrice(50000);
    		product1.setQuantity(50);
    		orderProcessStub.addProduct(product1);
    		
    		
    	
    		Product product2 = new Product();
    		product2.setProductId(2);
    		product2.setProductName("laptop");
    		product2.setUnitPrice(40000);
    		product2.setQuantity(100);
    		orderProcessStub.addProduct(product2);
    		

    		Product product3 = new Product();
    		product3.setProductId(3);
    		product3.setProductName("smartphone");
    		product3.setUnitPrice(30000);
    		product3.setQuantity(2);
    		orderProcessStub.addProduct(product3);
    		
    		return orderProcessStub.addProduct(product3);
    		
    		
        }catch (RemoteException e) {
            String msg = "Cannot get the list of product"
                    + " . Backend service which is "+serviceURL+" may be unavailable";
            throw new Exception(msg, e);
        }
    }
 
    public Product viewProduct() throws Exception{
        try{
            return orderProcessStub.viewProduct("laptop");
        }catch (RemoteException e) {
            String msg = "Cannot get the list of product"
                    + " . Backend service may be unavailable";
            throw new Exception(msg, e);
        }
    }
    
    public String addOrder(String[] productList,int[] qtyList) throws Exception{
        try{
        	return orderProcessStub.addOrder(productList, qtyList);
        }catch (RemoteException e) {
            String msg = "Cannot get the add of product"
                    + " . Backend service may be unavailable";
            throw new Exception(msg, e);
        }
    }
 
}

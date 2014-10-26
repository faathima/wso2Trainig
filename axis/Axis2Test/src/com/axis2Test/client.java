package com.axis2Test;

import com.axis2test.TestStub;

public class client {
	public static void main(String[] args) throws Exception {
		TestStub stub = new TestStub();
	    
	     //Creating the request
		com.axis2test.TestStub.Add request = new  com.axis2test.TestStub.Add();
	     request.setA(5);
	     request.setB(5);
	   
	     //Invoking the service
	     com.axis2test.TestStub.AddResponse response  = stub.add(request);
	     System.out.println("Response : " + response.get_return());
	    }
	

}

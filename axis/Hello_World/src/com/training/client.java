package com.training;
import com.training.HelloStub.SayHello;

public class client {
	
	public static void main(String[] args) throws Exception {
	     HelloStub stub = new HelloStub();
	    
	     //Creating the request
	     com.training.HelloStub.SayHello  request = new  com.training.HelloStub.SayHello();
	     request.setName("Java web");
	   
	     //Invoking the service
	     com.training.HelloStub.SayHelloResponse response  = stub.sayHello(request);
	     System.out.println("Response : " + response.get_return());
	    }
	

}

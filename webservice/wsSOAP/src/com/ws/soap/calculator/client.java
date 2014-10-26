package com.ws.soap.calculator;
import com.ws.soap.calculator.CalculatorStub.Addition;

public class client {
	public static void main(String[] args) throws Exception {
	     CalculatorStub stub = new CalculatorStub();
	    
	     //Creating the request
	     com.ws.soap.calculator.CalculatorStub.Addition  request = new  com.ws.soap.calculator.CalculatorStub.Addition();
	     request.setNum1(5);
	     request.setNum2(5);
	     
	   
	     //Invoking the service
	     com.ws.soap.calculator.CalculatorStub.AdditionResponse response  = stub.addition(request);
	     System.out.println("Response : " + response.get_return());
	    }
}

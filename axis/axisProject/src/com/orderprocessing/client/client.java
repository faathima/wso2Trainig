package com.orderprocessing.client;

import java.util.Scanner;


/*public class client {
	static String name;
	static String item;
	static int price; 
	
	public static void main(String[] args) throws Exception {

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter customer name :");
		name=scanner.nextLine();
		System.out.println(name);
		
		System.out.println("Enter item with prise :");
	
		item=scanner.nextLine();
		price=scanner.nextInt(); 		
		
		System.out.print(item + "//t");
		System.out.println(price);
		
		System.out.println("Entered");
		}
	/*public static void main(String [] args) throws Exception{
		com.orderprocessing.client.OrderprocessingStub stub = new com.orderprocessing.client.OrderprocessingStub();
		com.orderprocessing.client.*/

		


	//}


import java.rmi.RemoteException;

import com.orderprocessing.client.OrderprocessingStub.GetCurrentTotal;
import com.orderprocessing.client.OrderprocessingStub.GetCurrentTotalResponse;
import com.orderprocessing.client.OrderprocessingStub.ProcessOrder;
import com.orderprocessing.client.OrderprocessingStub.ProcessOrderResponse;

public class client {

	public static void main(String[] args) throws RemoteException {
		OrderprocessingStub orderProcessServiceStub = new OrderprocessingStub();

		GetCurrentTotal getCurrentTotalParameter = new GetCurrentTotal();

		GetCurrentTotalResponse currentTotalResponse = orderProcessServiceStub.getCurrentTotal(getCurrentTotalParameter);

		// Get the initial total
		System.out.println("Initial total is: " + currentTotalResponse.get_return());
		
		OrderprocessingStub.Order order = new OrderprocessingStub.Order();
		order.setId(1);
		order.setAmount(40.5f);
		order.setItemName("item1");

		ProcessOrder processOrderParameter = new ProcessOrder();

		// Placing a new order
		
		processOrderParameter.setOrder(order);
		

		ProcessOrderResponse processOrderResponse = orderProcessServiceStub.processOrder(processOrderParameter);

		System.out.println("Order - " + order.getItemName() + " -placing state: " + processOrderResponse.get_return());

		currentTotalResponse = orderProcessServiceStub
				.getCurrentTotal(getCurrentTotalParameter);

		// Get the new total
		System.out.println("New total is: " + currentTotalResponse.get_return());
		
	}
	
}



	
package com.orderprocessing.client;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.axis2.AxisFault;

import com.orderprocessing.client.OrderProcessingServiceStub.*;
public class OrderProcessingClient {
 public static void main(String args[]){
	 try {
		OrderProcessingServiceStub orderProcessingStub=new OrderProcessingServiceStub();
		Item item=new Item();
		item.setId(1);
		item.setName("Bicycle");
		item.setPrice(200);
		item.setDescription("This is a normal bicycle");
		
		Item item2=new Item();
		item2.setId(2);
		item2.setName("Car");
		item2.setPrice(400);
		item2.setDescription("This is a normal Car");
		
		AddItem addItem=new AddItem();
		addItem.setItem(item);
		
		AddItem addItem2=new AddItem();
		addItem2.setItem(item2);
		
		AddItemResponse response1=orderProcessingStub.addItem(addItem);
		AddItemResponse response2=orderProcessingStub.addItem(addItem2);
		
		//Operation View Item
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID to view Item \n");
		int id=sc.nextInt();
		ViewItem viewItem=new ViewItem();
		viewItem.setItemId(id);
		ViewItemResponse response=orderProcessingStub.viewItem(viewItem);
		Item responseItem=response.get_return();
		System.out.println("Name :"+responseItem.getName());
		System.out.println("Price :"+responseItem.getPrice());
		System.out.println("Description :"+responseItem.getDescription());
		
		//Operation getPrice
		/*ArrayList<Integer> itemsList = new ArrayList<Integer>(); 
		itemsList.add(1);
		itemsList.add(1);
		int[] items=new int [itemsList.size()];
		for(int i=0;i<itemsList.size();i++){
			items[i]=itemsList.get(i);
		}
		GetPrice getPrice=new GetPrice();
		getPrice.setItemList(items);
		GetPriceResponse response3=orderProcessingStub.getPrice(getPrice);
		int price=response3.get_return();
		System.out.println(price);
		System.out.println(items[0]);*/
		
		//Operation Addorder
		int number_of_items=3;
		int [] itemids=new int[number_of_items];
		int [] qty=new int[number_of_items];
		
		for(int i=0;i<number_of_items;i++){
		System.out.print("Enter Item "+(i+1)+" Item id:");
		itemids[i]=sc.nextInt();
		System.out.print("Enter Item "+(i+1)+" Quantity:");
		qty[i]=sc.nextInt();	
		}
	
		AddOrder addOrder=new AddOrder();
		addOrder.setItemList(itemids);
		addOrder.setQtyList(qty);
		AddOrderResponse response4=orderProcessingStub.addOrder(addOrder);
		int[] ids=response4.get_return();
		System.out.println("Your Order ID :" + ids[0]);
		System.out.println("Price :" + ids[1]);
		
	} catch (AxisFault e) {
		e.printStackTrace();
	} catch (RemoteException e) {
		e.printStackTrace();
	}
	 
	 
 }
}

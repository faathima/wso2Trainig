package com.axis2.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

import org.apache.axis2.AxisFault;

import com.axis2.client.*;
import com.axis2.client.OrderServiceStub.AddEntry;
import com.axis2.client.OrderServiceStub.AddEntryResponse;
import com.axis2.client.OrderServiceStub.AddOrder;
import com.axis2.client.OrderServiceStub.AddOrderResponse;
import com.axis2.client.OrderServiceStub.Entry;
import com.axis2.client.OrderServiceStub.FindItem;
import com.axis2.client.OrderServiceStub.FindItemResponse;
import com.axis2.client.OrderServiceStub.GetOrderDetails;
import com.axis2.client.OrderServiceStub.GetOrderDetailsResponse;

public class OrderClient {


		public static void main(String[] args) throws RemoteException,AxisFault {
				
			OrderServiceStub stub= new OrderServiceStub();
			AddEntry addEntry= new AddEntry();
			AddOrder addOrderRQ=new AddOrder();
			FindItem fiRequest= new FindItem();
			GetOrderDetails getOrderDetailsRQ=new GetOrderDetails();
			
			//Add the entries(Items)
			//add entry 1
			Entry entry1=new Entry();
			entry1.setName("Mouse");
			entry1.setPrice(200);
			entry1.setMadeIn("Sri Lanka");
			addEntry.setEntry(entry1);
			AddEntryResponse addResponse1=stub.addEntry(addEntry);
			System.out.println("Entry added : Mouse   : Price-"+addResponse1.get_return().getPrice());
			
			//add entry 2
			Entry entry2=new Entry();
			entry2.setName("LCD");
			entry2.setPrice(6000);
			entry2.setMadeIn("USA");
			addEntry.setEntry(entry2);
			AddEntryResponse addResponse2=stub.addEntry(addEntry);
			System.out.println("Entry added : LCD     : Price-"+addResponse2.get_return().getPrice());
			
			//add entry 3
			Entry entry3=new Entry();
			entry3.setName("Touchpad");
			entry3.setPrice(3000);
			entry3.setMadeIn("UK");		
			addEntry.setEntry(entry3);
			AddEntryResponse addResponse3=stub.addEntry(addEntry);
			System.out.println("Entry added : Touchpad: Price-"+addResponse3.get_return().getPrice()+"\n");
			
			//find an item
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the name of the item to find \navailability and price (Mouse/LCD/Touchpad): ");
			String findItem=s1.next();
			
			try{
				fiRequest.setName(findItem);
				FindItemResponse fiResponse = stub.findItem(fiRequest);
				System.out.println("Search Result=>Mouse price found now is:"+fiResponse.get_return().getPrice()+"\n" );
			}catch (NullPointerException e) {
				System.out.println("Error occured..!! The item you entered is not in the inventory.");
			}
			
			//add order
			boolean checkOd=true;
			while (checkOd) {
				ArrayList itemList=new ArrayList();
				ArrayList itemQtyList= new ArrayList();
				
				boolean check = true;
				String[] itemListStrArray;
				int[] itemQtyListArray;
				System.out.println("Enter the Details of your order.");
				System.out.println("================================");
				while (check) {

					System.out.print("Enter the item (Mouse/LCD/Touchpad): ");
					itemList.add(s1.next());
					System.out.println("Enter the required quantity of the item :");
					itemQtyList.add(s1.nextInt());
					System.out
							.println("Enter 1 to add more items to the order or enter 0 to Submit the order now.!! ");

					if (s1.nextInt() == 0) {
						check = false;
					}

				}
				itemListStrArray=new String[itemList.size()];
				itemList.toArray(itemListStrArray);
				addOrderRQ.setItemList(itemListStrArray);
				
				Integer[] arrI =new Integer[itemQtyList.size()];
				itemQtyList.toArray(arrI);
				itemQtyListArray = new int[arrI.length];
				for (int i = 0; i < arrI.length; i++) {
					itemQtyListArray[i]=arrI[i];
				}
				
				addOrderRQ.setItemQtyList(itemQtyListArray);
				
				System.out.println("Added order details\n==================.");
				AddOrderResponse addOrderRP= stub.addOrder(addOrderRQ);
				System.out.println(addOrderRP.get_return());
				
				System.out.println("\n \n Enter 1 to add more orders or enter o to get order details. ");
				int xx=s1.nextInt();
				if (xx==0){
					checkOd=false;
				}
			}
			
			//Get order details
			System.out.println("Enter the ID of order to get  details");
			int findOrderId=s1.nextInt();
			getOrderDetailsRQ.setOrderID(findOrderId);
			GetOrderDetailsResponse orderDetailRS=stub.getOrderDetails(getOrderDetailsRQ);
			System.out.println("Details of order ID :"+findOrderId);
			System.out.println("========================");
			System.out.println("Order total Price : "+ orderDetailRS.get_return());

			
		}

	}



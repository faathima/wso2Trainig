package com.axis2;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderService {
	private static HashMap itemSet=new HashMap();
	private static ArrayList orderList=new ArrayList();
	private static Order order;

	
	public Entry addEntry(Entry entry) {
		itemSet.put(entry.getName(),entry);
		return (Entry) itemSet.get(entry.getName());
	}
	
	public Entry findItem(String name) {
		return (Entry) itemSet.get(name);
	
	}

	public double getOrderDetails(int orderID) {
		System.out.println("testttt");
		return ((Order) orderList.get(orderID-1)).getOrderTotal();
	}
	
	public String addOrder(String[] itemList,int[] itemQtyList) {
		double total=0;
		int orderId;
		
		String f="";
		for (int i = 0; i < itemList.length; i++) {
			Entry x=(Entry) itemSet.get(itemList[i]);
			total+=x.getPrice()*itemQtyList[i];
			System.out.println("total on addOrder():"+total);
			f+=itemList[i]+itemQtyList[i];
		}
		
		try {
			double d=total;
			order = new Order(total);
			order.setOrderItemMap(itemList,itemQtyList);
			orderList.add(order);
			orderId=(orderList.indexOf(order))+1;
			order.setOrderId(orderId);
			return  "Order ID: "+orderId+"\nOrder Total Price :"+
				((Order)orderList.get(orderId-1)).getOrderTotal()+"Rs.";
		//	return 5;
		} catch (Exception e) {
			return e.toString();
			//return "Erroorrrr in server returned";
			
		}
		
	}
	/*//Only to debug  the server program
	public static void main(String[] args) {
		OrderService ob=new OrderService();
		Entry e1=new Entry();
		e1.setName("LCD");
		e1.setMadeIn("SL");
		e1.setPrice(2000);
		
		Entry e2=new Entry();
		e2.setName("Mouse");
		e2.setPrice(200);	
		e2.setMadeIn("USA");
		
		ob.addEntry(e1);
		ob.addEntry(e2);
		
		String[] s1=new String[]{"Mouse","LCD"};
		int[] x1=new int[]{2,3};
		System.out.println("sss");
		String sss=ob.addOrder(s1, x1);
		System.out.println(sss);
		Order xxod=(Order) orderList.get(0);
		System.out.println("end"+xxod.getOrderTotal());
	}
	*/
	

}

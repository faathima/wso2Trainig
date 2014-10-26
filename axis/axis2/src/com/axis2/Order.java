package com.axis2;

import java.util.HashMap;

public class Order {
	private int orderId;
	private HashMap orderItemMap=new HashMap();
	private double orderTotal;
	
	//set order id and order total
	public Order(double orderTotal) {
		//this.orderId=orderId;
		this.orderTotal=orderTotal;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId){
		this.orderId=orderId;
	}
	/**
	 * @return the orderTotal
	 */
	public double getOrderTotal() {
		return this.orderTotal;
	}

	/**
	 * @param orderItemMap Set the order item with its quantity
	 */
	public void setOrderItemMap(String[] orderItemArray,int[] orderItemQtyArray) {
		for (int i = 0; i < orderItemArray.length; i++) {
			this.orderItemMap.put(orderItemArray[i],orderItemQtyArray[i]);
		}
	}
	

}

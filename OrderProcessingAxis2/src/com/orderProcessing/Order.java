package com.orderProcessing;

import java.util.HashMap;

public class Order {
	private int Orderid;
	private String CustomerName;
	private HashMap productOrder = new HashMap();
	private double total;

	public Order(double total) {
		this.total = total;
	}

	public int getOrderid() {
		return Orderid;
	}

	public void setOrderid(int orderid) {
		Orderid = orderid;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setOderProduct(String[] orderItem, int[] orderItemQty) {
		for (int i = 0; i < orderItem.length; i++) {
			this.productOrder.put(orderItem[i], orderItemQty[i]);
		}

	}
}

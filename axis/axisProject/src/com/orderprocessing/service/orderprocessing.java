package com.orderprocessing.service;

import java.util.ArrayList;
import java.util.HashMap;

public class orderprocessing {
	
	private float currentTotal = 0.0f;
	private HashMap<Integer, Order> orderList = new HashMap<Integer, Order>(0);
	private Order lastProcessedOrder;

	public boolean processOrder(Order order) {
		if (order == null)
			return false;

		if (orderList.put(order.getId(), order) != null) {

			lastProcessedOrder = order;
			currentTotal += order.getAmount();

			return true;
		}

		System.out.println(order.getItemName());

		return false;
	}

	public float getCurrentTotal() {
		return currentTotal;
	}

	public void setCurrentTotal(float currentTotal) {
		this.currentTotal = currentTotal;
	}

	public Order getLastProcessedOrder() {
		return lastProcessedOrder;
	}

	public void setLastProcessedOrder(Order lastProcessedOrder) {
		this.lastProcessedOrder = lastProcessedOrder;
	}
	
	public HashMap<Integer, Order> getOrderList() {
		return orderList;
	}
	
	public void setOrderList(HashMap<Integer, Order> orderList) {
		this.orderList = orderList;
	}

	
}
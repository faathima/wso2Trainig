package com.orderpocessing.service;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Order  {
	int orderID;
	HashMap<Integer, Integer> itemList = new HashMap<Integer, Integer>();

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public HashMap<Integer, Integer> getItemList() {
		return itemList;
	}

	public void setItemList(HashMap<Integer, Integer> itemList) {
		this.itemList = itemList;
	}

}

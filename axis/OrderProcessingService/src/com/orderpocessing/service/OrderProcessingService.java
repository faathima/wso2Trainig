package com.orderpocessing.service;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderProcessingService {
	static ArrayList<Item> inventory = new ArrayList<Item>();
	static ArrayList<Order> orderList = new ArrayList<Order>();

	public Item addItem(Item item) {
		boolean exist=false;
		for(Item singleItem:inventory){
			if(singleItem.getId()==item.getId()){
				exist=true;
			}
		}
		if(!exist){
		inventory.add(item);
		}
		return inventory.get(0);
	}

	public Item viewItem(int itemId) {
		Item item = new Item();
		for (Item singleItem : inventory) {
			if (singleItem.getId() == itemId) {
				item = singleItem;
			}
		}
		return item;
	}

	public int getPrice(int[] itemList,int[] qtyList) {
		int price = 0;
		for (int i=0;i<itemList.length;i++) {
			for (Item singleItem : inventory) {
				if (singleItem.getId() == itemList[i]) {
					price += (singleItem.getPrice()*qtyList[i]);
				}
			}
		}
		return price;
	}

	public int[] addOrder(int[] itemList, int[] qtyList) {
		Order order = new Order();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < itemList.length; i++) {
			hm.put(itemList[i], qtyList[i]);
		}
		int id = 0;
		for (Order singleOrder : orderList) {
			if (id < singleOrder.getOrderID()) {
				id = singleOrder.getOrderID();
			}

		}
		id++;
		order.setOrderID(id);
		order.setItemList(hm);
		orderList.add(order);
		int [] output=new int[2];
		output[0]=id;
		output[1]=getPrice(itemList,qtyList);
		return output;
	}

}

package com.orderprocessing.service;

public class Order {

	private int id;
	private String itemName;
	private float amount;

	public int getId() {
		return id;
	}

	public float getAmount() {
		return amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}

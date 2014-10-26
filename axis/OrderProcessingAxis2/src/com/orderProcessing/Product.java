package com.orderProcessing;

import java.io.Serializable;

public class Product implements Serializable  {
	private int productId;
	private String productName;
	private int quantity;
	private float unitPrice;

	/**
	 * 
	 * @return productId
	 */

	public int getProductId() {
		return productId;
	}

	/**
	 * 
	 * @param productId
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 
	 * @return unitPrice
	 */
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * 
	 * @param unitPrice
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

}

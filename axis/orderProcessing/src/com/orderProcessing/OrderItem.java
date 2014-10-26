package com.orderProcessing;

public class OrderItem{

		private int itemId;
		private String itemName;
		private int quantity;
		private float unitPrice;

		/**
		 * 
		 * @return itemId
		 */
		public int getItemId() {
			return itemId;
		}

		/**
		 * 
		 * @param itemId
		 */
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		
		/**
		 * 
		 * @return itemName
		 */
		public String getItemName() {
			return itemName;
		}
		
		/**
		 * 
		 * @param itemName
		 */
		public void setItemName(String itemName) {
			this.itemName = itemName;
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

		public void viewItem() {
			System.out.println("\tItem Id:" + this.itemId);
			System.out.println("\tItem Name:" + this.itemName);
			System.out.println("\t\tUnit Price :"+ this.unitPrice);
			System.out.println("\t\t\tQuantity :" + this.quantity);
			System.out.println("\t\t\t\tTotel Price :" +this.unitPrice*this.quantity);
		}

	}

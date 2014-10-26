package com.orderProcessing;

public class Order {

		private int Orderid;
		private OrderItem[] items;
		private String CustomerName;
		
		/**
		 * 
		 * @return Orderid
		 */
		public int getOrderid() {
			return Orderid;
		}
		
		/**
		 * 
		 * @param orderid
		 */
		public void setOrderid(int orderid) {
			Orderid = orderid;
		}
		
		/**
		 * 
		 * @return items
		 */
		public OrderItem[] getItems() {
			return items;
		}
		
		/**
		 * 
		 * @param items
		 */
		public void setItems(OrderItem[] items) {
			this.items = items;
		}
		
		/**
		 * 
		 * @return CustomerName
		 */
		public String getCustomerName() {
			return CustomerName;
		}
		
		/**
		 * 
		 * @param customerName
		 */
		public void setCustomerName(String customerName) {
			CustomerName = customerName;
		}

		public void viewOrder() {
			System.out.println("******* Order Id :" + this.Orderid + " *******");
			System.out.println("******* Customer Name : " + this.CustomerName +"*******");
			System.out.println("items");
			if (!(items == null) && (items.length > 0)) {
				for (OrderItem item : items) // use for-each loop
				{
					item.viewItem();
				}
			}
			System.out.println("************************\n");
		}

	}

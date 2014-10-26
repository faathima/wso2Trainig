package com.orderProcessing;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderProcessingService {

	private static HashMap productList = new HashMap();
	private static ArrayList orderList = new ArrayList();
	private static Order order;

	public Product addProduct(Product product) {
		productList.put(product.getProductName(), product);
		return (Product) productList.get(product.getProductName());
	}

	public Product viewProduct(String name) {
		return (Product) productList.get(name);

	}

	public String addOrder(String[] itemList, int[] itemQtyList) {
		double total = 0;
		int orderId;

		String f = "";
		for (int i = 0; i < itemList.length; i++) {
			Product x = (Product) productList.get(itemList[i]);
			total += x.getUnitPrice() * itemQtyList[i];
			System.out.println("total on addOrder():" + total);
			f += itemList[i] + itemQtyList[i];
		}

		try {
			double d = total;
			order = new Order(total);
			order.setOderProduct(itemList, itemQtyList);
			orderList.add(order);
			orderId = (orderList.indexOf(order)) + 1;
			order.setOrderid(orderId);
			return "Order ID: " + orderId + "\nOrder Total Price :" +
			       ((Order) orderList.get(orderId - 1)).getTotal() ;
			
		} catch (Exception e) {
			return e.toString();

		}

	}

	public double viewOrder(int orderID) {
		System.out.println("orders");
		return ((Order) orderList.get(orderID - 1)).getTotal();

	}
}

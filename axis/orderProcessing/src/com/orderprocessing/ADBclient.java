package com.orderprocessing;

import java.rmi.RemoteException;

public class ADBclient {

		public static void main(String[] args) throws RemoteException {
			OrderProcessingServiceStub Stub = new OrderProcessingServiceStub();

			// Create stub items for a order
			OrderProcessingServiceStub.OrderItem item1 = createItem(1,"suger",1,(float) 100.0);
			OrderProcessingServiceStub.OrderItem item2 = createItem(2,"milk", 4,(float) 250.0);
			OrderProcessingServiceStub.OrderItem itemList[] = { item1,item2 };

			// Create Order
			OrderProcessingServiceStub.Order order = createOrder(1, itemList,"ffms");

			// Create an order request
			OrderProcessingServiceStub.CreateOrder createOrderRequest = new OrderProcessingServiceStub.CreateOrder();
			createOrderRequest.setOrder(order);

			// Place the order and get the response
			OrderProcessingServiceStub.CreateOrderResponse createOrderResponse = Stub.createOrder(createOrderRequest);
			if (createOrderResponse.get_return()) {
				System.out.println("Successfully Created Order " + order.getOrderid());
				//System.out.println(createOrderResponse.get_return());
			} else {
				System.err.println("Invalid Order Id. (Order Id already exists)");
				return;
			}

			// Preparing view Order request for order id "1"
			int requestOrderId = 1;
			OrderProcessingServiceStub.ViewOrder viewOrderRequest = new OrderProcessingServiceStub.ViewOrder();
			viewOrderRequest.setOrderId(requestOrderId);

			// view the order
			OrderProcessingServiceStub.ViewOrderResponse getOrderResponse = Stub.viewOrder(viewOrderRequest);
			order = getOrderResponse.get_return();
			 
			System.out.println("Results from get order request for Order ID: " + requestOrderId);
			if (!(order == null)) {
				printOrder(order);
			} else {
				System.err.println("Invalid Order Id");
			}

			// Request for total cost of order id @requestOrderId
			OrderProcessingServiceStub.ViewOrderCost OrderCostRequest = new OrderProcessingServiceStub.ViewOrderCost();
			OrderCostRequest.setOrderId(requestOrderId);

			OrderProcessingServiceStub.ViewOrderCostResponse getOrderCostResponse = Stub.viewOrderCost(OrderCostRequest);
					

			System.out.println("Total Cost for Order Id " + requestOrderId + " :"
					+ getOrderCostResponse.get_return());

		}
		
		public static OrderProcessingServiceStub.OrderItem createItem(int itemId, String itemName, int quantity, float unitPrize) {
			OrderProcessingServiceStub.OrderItem item = new OrderProcessingServiceStub.OrderItem();
			item.setItemId(itemId);
			item.setItemName(itemName);
			item.setQuantity(quantity);
			item.setUnitPrice(unitPrize);
			return item;
		}

		public static OrderProcessingServiceStub.Order createOrder(int orderId,OrderProcessingServiceStub.OrderItem[] items,String name) {
			OrderProcessingServiceStub.Order order = new OrderProcessingServiceStub.Order();
			order.setOrderid(orderId);
			order.setCustomerName(name);
			order.setItems(items);
			return order;
		}

		public static void printItem(OrderProcessingServiceStub.OrderItem item) {
			System.out.println("\tItem id: " + item.getItemId());
			System.out.println("\tQuantity: " + item.getQuantity());
			System.out.println("\tUnit price: " + item.getUnitPrice());
		}
		
		public static void printOrder(OrderProcessingServiceStub.Order order) {
			System.out.println("Order id: " + order.getOrderid());
			System.out.println("Name: " + order.getCustomerName());
			System.out.println("Items");
			com.orderprocessing.OrderProcessingServiceStub.OrderItem[] itemList = order.getItems();
			for (com.orderprocessing.OrderProcessingServiceStub.OrderItem item : itemList) {
				printItem(item);
				System.out.println();
			}

		}

	}


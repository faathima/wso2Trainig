package com.orderProcessing;
import java.util.HashMap;

public class OrderProcessingService {
		private static Order order;
		private static OrderItem orderItem;
		private static HashMap<Integer, Order> mapOrder;
		
		//private HashMap<Integer, OrderItem> mapItem;
		

		public OrderProcessingService() {
			mapOrder = new HashMap<Integer, Order>();
			//HashMap<Integer, OrderItem> mapItem;
		}

		/*public boolean createOrderItem(OrderItem orderItem){
			int itemId = orderItem.getItemId();
			if(!mapItem.containsKey(itemId)){
				mapItem.put(itemId, orderItem);
				return true;
			}
			return false;
			
		}*/
		public boolean createOrder(Order order) {
			int orderId = order.getOrderid();
			if (!mapOrder.containsKey(orderId)) {
				mapOrder.put(orderId, order);
				return true;
			}
			return false;

		}

		public Order viewOrder(int orderId) {
			Order order = null;
			if (mapOrder.containsKey(orderId)) {
				return (Order) mapOrder.get(orderId);
			}
			return order;
		}

		public float viewOrderCost(int orderId) {
			float orderCost = -1;
			OrderItem items[] = this.viewOrderItems(orderId);

			if (!(items == null) && (items.length > 0)) {
				orderCost = 0;
				for (OrderItem item : items) // use for-each loop
				{
					orderCost += (item.getUnitPrice() * item.getQuantity());
				}
			}
			return orderCost;

		}

		public OrderItem[] viewOrderItems(int orderId) {
			OrderItem items[] = null;
			if (mapOrder.containsKey(orderId)) {
				Order order = (Order) mapOrder.get(orderId);
				items = order.getItems();
			}
			return items;
		}

	}


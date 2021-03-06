package com.orderprocessing.client;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.axis2.Constants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;

import com.orderprocessing.client.OrderProcessingStub.*;

public class client {
	private static String SERVICE_EPR = "https://msffayaza-TECRA-M11:8243/services/orderProcessing";
	private static String CARBON_JKS_PATH =
	                                        "/home/msffayaza/wso2esb-4.8.1/repository/resources/security/wso2carbon.jks";

	public static void main(String args[]) throws Exception {
		try {
			OrderProcessingStub stub = new OrderProcessingStub(SERVICE_EPR);
			ServiceClient service = stub._getServiceClient();
			Options options = new Options();
			System.setProperty("javax.net.ssl.trustStore", CARBON_JKS_PATH);
			System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
			HttpTransportProperties.Authenticator authenticator =
			                                                      new HttpTransportProperties.Authenticator();
			authenticator.setUsername("admin");
			authenticator.setPassword("admin");
			stub._getServiceClient().getOptions()
			    .setProperty(HTTPConstants.AUTHENTICATE, authenticator);
			stub._getServiceClient().getOptions()
			    .setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);

			AddProduct addProduct = new AddProduct();
			AddOrder addOrder = new AddOrder();
			ViewProduct viewProduct = new ViewProduct();
			ViewOrder viewOrder = new ViewOrder();
			System.out.println("\t******* Available Stock Details *******");
			Product product1 = new Product();
			product1.setProductId(1);
			product1.setProductName("iPad");
			product1.setUnitPrice(50000);
			product1.setQuantity(50);
			addProduct.setProduct(product1);
			AddProductResponse addResponse1 = stub.addProduct(addProduct);
			System.out.println("Product added : " + addResponse1.get_return().getProductName() +
			                   " - Product Id : " + addResponse1.get_return().getProductId() +
			                   " - Price : " + addResponse1.get_return().getUnitPrice() +
			                   " - Available Stock : " + addResponse1.get_return().getQuantity());

			Product product2 = new Product();
			product2.setProductId(2);
			product2.setProductName("laptop");
			product2.setUnitPrice(40000);
			product2.setQuantity(100);
			addProduct.setProduct(product2);
			AddProductResponse addResponse2 = stub.addProduct(addProduct);
			System.out.println("Product added : " + addResponse2.get_return().getProductName() +
			                   " - Product Id : " + addResponse2.get_return().getProductId() +
			                   " - Price : " + addResponse2.get_return().getUnitPrice() +
			                   " - Available Stock : " + addResponse2.get_return().getQuantity());

			Product product3 = new Product();
			product3.setProductId(3);
			product3.setProductName("smartphone");
			product3.setUnitPrice(30000);
			product3.setQuantity(2);
			addProduct.setProduct(product3);
			AddProductResponse addResponse3 = stub.addProduct(addProduct);
			System.out.println("Product added : " + addResponse3.get_return().getProductName() +
			                   " - Product Id : " + addResponse3.get_return().getProductId() +
			                   " - Price : " + addResponse3.get_return().getUnitPrice() +
			                   " - Available Stock : " + addResponse3.get_return().getQuantity() +
			                   "\n");

			System.out.println("\t*****************************************" + "\n");

			Scanner scanner = new Scanner(System.in);
			System.out.println("\t******* To search products availability *******");
			System.out.println("Avalable products : (iPad/laptop/smartphone)");
			System.out.println("Enter the name of the product :");

			String searchProduct = scanner.next();

			try {
				viewProduct.setName(searchProduct);
				ViewProductResponse searchResponse = stub.viewProduct(viewProduct);
				System.out.println(searchProduct + " - Product Id : " +
				                   searchResponse.get_return().getProductId() + " : Unite Prise :" +
				                   searchResponse.get_return().getUnitPrice() + "\n");
			} catch (NullPointerException e) {
				System.out.println("The product you search is not available.");
			}
			System.out.println("\t*****************************************\n");
			System.out.println("\t******** Order List*******");

			boolean createOrder = true;

			ArrayList productNameList = new ArrayList();
			ArrayList productQtyList = new ArrayList();

			String[] productNameListArray;
			int[] productQtyListArray;

			while (createOrder) {

				System.out.print("Enter the Product Name (iPad/laptop/smartphone)s: ");
				productNameList.add(scanner.next());
				System.out.println("Enter the required quantity of the Produt :");
				productQtyList.add(scanner.nextInt());
				System.out.println("Enter 0 to Submit the order now.!! ");

				if (scanner.nextInt() == 0) {
					createOrder = false;
				}

			}
			productNameListArray = new String[productNameList.size()];
			productNameList.toArray(productNameListArray);
			addOrder.setItemList(productNameListArray);

			Integer[] arrI = new Integer[productQtyList.size()];
			productQtyList.toArray(arrI);
			productQtyListArray = new int[arrI.length];
			for (int i = 0; i < arrI.length; i++) {
				productQtyListArray[i] = arrI[i];
			}

			addOrder.setItemQtyList(productQtyListArray);

			System.out.println("Added order details");
			AddOrderResponse addOrderRP = stub.addOrder(addOrder);
			System.out.println(addOrderRP.get_return());

			System.out.println("\t***********************************\n");

			System.out.println("\t***********View order details***************");
			System.out.println("Enter the order ID : ");
			int findOrderId = scanner.nextInt();
			viewOrder.setOrderID(findOrderId);
			ViewOrderResponse viewOrderDetail = stub.viewOrder(viewOrder);
			System.out.println("order ID :" + findOrderId);
			System.out.println("Order total Price : " + viewOrderDetail.get_return());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

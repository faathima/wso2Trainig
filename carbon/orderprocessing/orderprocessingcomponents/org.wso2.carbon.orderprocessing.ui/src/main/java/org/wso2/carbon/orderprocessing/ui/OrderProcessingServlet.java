package org.wso2.carbon.orderprocessing.ui;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class OrderProcessingServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

    public OrderProcessingServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int[] itemList=new int [3];
		int[] qtyList=new int [3];
		
		for(int i=0;i<3;i++){
			String itemId=request.getParameter("item"+(i+1));
			String qty=request.getParameter("qty"+(i+1));
			itemList[i]=Integer.parseInt(itemId);
			qtyList[i]=Integer.parseInt(qty);
		}
		Client client;
        int [] output;
 
       
            try {
				client = Client.getOrderProcessClient();
				output=client.addOrder(itemList, qtyList);
				request.setAttribute("output", output);
				//response.sendRedirect("carbon/order-process/output.jsp");
				request.getRequestDispatcher("/carbon/order-process/output.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int[] itemList=new int [3];
		int[] qtyList=new int [3];
		
		for(int i=0;i<3;i++){
			String itemId=request.getParameter("item"+(i+1));
			String qty=request.getParameter("qty"+(i+1));
			itemList[i]=Integer.parseInt(itemId);
			qtyList[i]=Integer.parseInt(qty);
		}
		Client client;
        int [] output;
 
       
            try {
				client = Client.getOrderProcessClient();
				output=client.addOrder(itemList, qtyList);
				request.setAttribute("output", output);
				//response.sendRedirect("carbon/order-process/output.jsp");
				request.getRequestDispatcher("/carbon/order-process/output.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}




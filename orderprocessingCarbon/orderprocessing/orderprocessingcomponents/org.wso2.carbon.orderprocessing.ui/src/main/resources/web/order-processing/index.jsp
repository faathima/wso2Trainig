<%@ page import="org.apache.axis2.context.ConfigurationContext"%>
<%@ page import="org.wso2.carbon.CarbonConstants"%>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil"%>
<%@ page import="org.wso2.carbon.utils.ServerConstants"%>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage"%>
<%@ page import="org.wso2.carbon.orderprocessing.stub.*"%>
<%@ page import="org.wso2.carbon.orderprocessing.xsd.Product"%>
<%@ page import="org.wso2.carbon.orderprocessing.ui.Client"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar"
	prefix="carbon"%>
<%
	String serverURL = CarbonUIUtil.getServerURL(
			config.getServletContext(), session);
	ConfigurationContext configContext = (ConfigurationContext) config
			.getServletContext().getAttribute(
					CarbonConstants.CONFIGURATION_CONTEXT);
	String cookie = (String) session
			.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

	Client client;
	Product product;

	try {
		client = new Client(configContext, serverURL, cookie);
		client.addProduct();
		product = client.viewProduct();

	} catch (Exception e) {
		CarbonUIMessage.sendCarbonUIMessage(e.getMessage(),
				CarbonUIMessage.ERROR, request, e);
%>
<script type="text/javascript">
	location.href = "../admin/error.jsp";
</script>
<%
	return;
	}
%>

<div id="middle">
	<h2>Order Processor</h2>

	<div id="workArea">
		<table class="styledLeft" id="moduleTable">
			<thead>
				<tr>
					<th width="10%">ProductId</th>
					<th width="30%">ProductName</th>
					<th width="30%">UnitPrice</th>
					<th width="30%">Quantity</th>
				</tr>
			</thead>
			<tbody>
				<%
					// for(Product product:products){
				%>
				<tr>
					<td><%=product.getProductId()%></td>
					<td><%=product.getProductName()%></td>
					<td>Rs. <%=product.getUnitPrice()%> /=
					</td>
					<td><%=product.getQuantity()%></td>
				</tr>
				<%
					// }
				%>
			</tbody>
		</table>


	</div>
</div>
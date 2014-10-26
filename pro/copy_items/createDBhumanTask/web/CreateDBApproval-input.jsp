<%@ page import="org.apache.axiom.om.OMElement" %>
<%@ page import="javax.xml.namespace.QName" %>
<p>
        <%
        String DBname = "";
        String DBSInstance = "";
	String Environment = "";

        OMElement requestElement = (OMElement) request.getAttribute("taskInput");
        String ns = "http://workflow.createdb.ss.carbon.wso2.org";

        if (requestElement != null) {

            OMElement DBnameElement = requestElement.getFirstChildWithName(new QName(ns, "DatabaseName"));

            if(DBnameElement !=null){
                DBname = DBnameElement.getText();
            }

            OMElement DBSInstanceNameElement = requestElement.getFirstChildWithName(new QName(ns, "DBSInstanceName"));

            if(DBSInstanceNameElement !=null){
                DBSInstance = DBSInstanceNameElement.getText();
            }
	
	    OMElement EnvironmentElement = requestElement.getFirstChildWithName(new QName(ns, "Environment"));

            if(EnvironmentElement !=null){
                Environment = EnvironmentElement.getText();
            }
        }
    %>

<table border="0">
    <tr>
        <td>DB Name</td>
        <td><%=DBname%>
        </td>
    </tr>
    <tr>
        <td>DB Instance</td>
        <td><%=DBSInstance%>
        </td>
    </tr>
    <tr>
        <td>Environment</td>
        <td><%=Environment%>
        </td>
    </tr>
    
</table>

</p>

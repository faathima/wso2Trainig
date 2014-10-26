<%@ page import="org.apache.axiom.om.OMElement" %>
<%@ page import="javax.xml.namespace.QName" %>
<p>
         <%
        String DBname = "";
        String DBID = "";

        OMElement requestElement = (OMElement) request.getAttribute("taskInput");
        String ns = "http://www.example.com/deletedb/schema";

        if (requestElement != null) {

            OMElement DBnameElement = requestElement.getFirstChildWithName(new QName(ns, "DB_Name"));

            if(DBnameElement !=null){
                DBname = DBnameElement.getText();
            }

            OMElement DBIDElement = requestElement.getFirstChildWithName(new QName(ns, "DB_ID"));

            if(DBIDElement !=null){
                DBID = DBIDElement.getText();
            }
        }
<table border="0">
    <tr>
        <td>DB Name</td>
        <td><%=DBname%>
        </td>
    </tr>
    <tr>
        <td>DB Id</td>
        <td><%=DBID%>
        </td>
    </tr>
    
</table>

</p>

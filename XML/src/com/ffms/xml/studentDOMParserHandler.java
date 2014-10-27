package com.ffms.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class studentDOMParserHandler {
	public static void handleTag(Document document){
		System.out.println("<"+ document.getDocumentElement().getNodeName()+">");
		//System.out.println("\t<student>"+ document.getElementsByTagName("student").item(0).getTextContent()+"</student>");
		NodeList nodeList=document.getElementsByTagName("student");
		handleStudentTag(nodeList,"\t");
		System.out.println("</"+ document.getDocumentElement().getNodeName()+">");
		
		
	}
	private static void handleStudentTag(NodeList nodeList, String tab){
		for(int i=0; i<nodeList.getLength();i++){
			System.out.println(tab+"<student>");
			Node node=nodeList.item(i);
			
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element=(Element)node;
				System.out.println(handleTag("name",element,"\t\t"));
				System.out.println(handleTag("regNo",element,"\t\t"));
				System.out.println(handleTag("course",element,"\t\t"));
				System.out.println(handleTag("phone",element,"\t\t"));
				System.out.println(handleTag("mail",element,"\t\t"));
			}
			System.out.println(tab+"</student>");
		}
		
	}
	
	private static String handleTag(String tagName ,Element element, String Tab){
		StringBuffer returnvalue= new StringBuffer();
		for(int i=0;i<element.getElementsByTagName(tagName).getLength();i++){
			NodeList nodeList= element.getElementsByTagName(tagName).item(i).getChildNodes();
			Node node=(Node)nodeList.item(0);
			if(i==0)returnvalue.append(Tab+"<"+tagName+">"+node.getNodeValue()+"</"+tagName+">");
			else returnvalue.append("\n"+Tab+"<"+tagName+">"+node.getNodeValue()+"</"+tagName+">");
		}
		return returnvalue.toString();
	}

	
}

package org.wso2.bps.im;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.xmpp.util.XMPPConstants;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.addressing.EndpointReference;

import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import org.apache.axis2.util.XMLPrettyPrinter;
import org.wso2.carbon.humantask.core.api.event.HumanTaskEventListener;
import org.wso2.carbon.humantask.core.api.event.TaskEventInfo;
import org.wso2.carbon.humantask.core.dao.TaskType;
 


public class XMPPSampleClient implements HumanTaskEventListener{
   public static void main(String[] args) {
 invokeTimeService();
}

private static void invokeTimeService() {
 String endPointUrl = "xmpp://msf.fayaza89@gmail.com/" + "TimeService";

 EndpointReference targetEPR = new EndpointReference(endPointUrl);
 try {
                       ConfigurationContext ctx =
                            ConfigurationContextFactory.createConfigurationContextFromURIs(
                                XMPPSampleClient.class.getResource("axis2.xml"), null);

  OMElement payload = getPayload();
  Options options = new Options();
  options.setProperty(XMPPConstants.XMPP_SERVER_TYPE, XMPPConstants.XMPP_SERVER_TYPE_GOOGLETALK);
  options.setProperty(XMPPConstants.XMPP_SERVER_URL, XMPPConstants.GOOGLETALK_URL);
  options.setProperty(XMPPConstants.XMPP_SERVER_USERNAME, "msf.fayaza89");
  options.setProperty(XMPPConstants.XMPP_SERVER_PASSWORD, "ffms1989");

  options.setTo(targetEPR);
  options.setAction("urn:getServerTime");
  ServiceClient sender = new ServiceClient(ctx,null);

  sender.setOptions(options);
  OMElement result = sender.sendReceive(payload);
  XMLPrettyPrinter.prettify(result, System.out);
 } catch (Exception e) {
  e.printStackTrace();
 }
}

private static OMElement getPayload() {
 OMFactory fac = OMAbstractFactory.getOMFactory();
 OMNamespace omNs = fac.createOMNamespace(
   "http://example.xmpp.transports.axis2.org/example1", "example1");
       return fac.createOMElement("getServerTime", omNs);
}
}

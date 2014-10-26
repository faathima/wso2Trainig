
/**
 * SampleServiceXMLStreamExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.axiomsample;

public class SampleServiceXMLStreamExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1400821258777L;
    
    private com.axiomsample.SampleServiceStub.SampleServiceXMLStreamException faultMessage;

    
        public SampleServiceXMLStreamExceptionException() {
            super("SampleServiceXMLStreamExceptionException");
        }

        public SampleServiceXMLStreamExceptionException(java.lang.String s) {
           super(s);
        }

        public SampleServiceXMLStreamExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SampleServiceXMLStreamExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.axiomsample.SampleServiceStub.SampleServiceXMLStreamException msg){
       faultMessage = msg;
    }
    
    public com.axiomsample.SampleServiceStub.SampleServiceXMLStreamException getFaultMessage(){
       return faultMessage;
    }
}
    
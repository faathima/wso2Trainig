
/**
 * OrderprocessingCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.orderprocessing.stub;

    /**
     *  OrderprocessingCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderprocessingCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderprocessingCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderprocessingCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for addProduct method
            * override this method for handling normal response from addProduct operation
            */
           public void receiveResultaddProduct(
                    org.wso2.carbon.orderprocessing.xsd.Product result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addProduct operation
           */
            public void receiveErroraddProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewProduct method
            * override this method for handling normal response from viewProduct operation
            */
           public void receiveResultviewProduct(
                    org.wso2.carbon.orderprocessing.xsd.Product result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewProduct operation
           */
            public void receiveErrorviewProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewOrder method
            * override this method for handling normal response from viewOrder operation
            */
           public void receiveResultviewOrder(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOrder operation
           */
            public void receiveErrorviewOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addOrder method
            * override this method for handling normal response from addOrder operation
            */
           public void receiveResultaddOrder(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addOrder operation
           */
            public void receiveErroraddOrder(java.lang.Exception e) {
            }
                


    }
    
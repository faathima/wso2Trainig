
/**
 * OrderProcessingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.orderprocessing.client;

    /**
     *  OrderProcessingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderProcessingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderProcessingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderProcessingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for viewOrder method
            * override this method for handling normal response from viewOrder operation
            */
           public void receiveResultviewOrder(
                    com.orderprocessing.client.OrderProcessingServiceStub.ViewOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOrder operation
           */
            public void receiveErrorviewOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addProduct method
            * override this method for handling normal response from addProduct operation
            */
           public void receiveResultaddProduct(
                    com.orderprocessing.client.OrderProcessingServiceStub.AddProductResponse result
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
                    com.orderprocessing.client.OrderProcessingServiceStub.ViewProductResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewProduct operation
           */
            public void receiveErrorviewProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addOrder method
            * override this method for handling normal response from addOrder operation
            */
           public void receiveResultaddOrder(
                    com.orderprocessing.client.OrderProcessingServiceStub.AddOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addOrder operation
           */
            public void receiveErroraddOrder(java.lang.Exception e) {
            }
                


    }
    
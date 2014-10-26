
/**
 * OrderProcessingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.orderprocessing;

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
            * auto generated Axis2 call back method for viewOrderItems method
            * override this method for handling normal response from viewOrderItems operation
            */
           public void receiveResultviewOrderItems(
                    com.orderprocessing.OrderProcessingServiceStub.ViewOrderItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOrderItems operation
           */
            public void receiveErrorviewOrderItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewOrder method
            * override this method for handling normal response from viewOrder operation
            */
           public void receiveResultviewOrder(
                    com.orderprocessing.OrderProcessingServiceStub.ViewOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOrder operation
           */
            public void receiveErrorviewOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createOrder method
            * override this method for handling normal response from createOrder operation
            */
           public void receiveResultcreateOrder(
                    com.orderprocessing.OrderProcessingServiceStub.CreateOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createOrder operation
           */
            public void receiveErrorcreateOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewOrderCost method
            * override this method for handling normal response from viewOrderCost operation
            */
           public void receiveResultviewOrderCost(
                    com.orderprocessing.OrderProcessingServiceStub.ViewOrderCostResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOrderCost operation
           */
            public void receiveErrorviewOrderCost(java.lang.Exception e) {
            }
                


    }
    
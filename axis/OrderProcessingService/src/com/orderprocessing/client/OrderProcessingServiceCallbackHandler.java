
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
            * auto generated Axis2 call back method for viewItem method
            * override this method for handling normal response from viewItem operation
            */
           public void receiveResultviewItem(
                    com.orderprocessing.client.OrderProcessingServiceStub.ViewItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewItem operation
           */
            public void receiveErrorviewItem(java.lang.Exception e) {
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
                
           /**
            * auto generated Axis2 call back method for addItem method
            * override this method for handling normal response from addItem operation
            */
           public void receiveResultaddItem(
                    com.orderprocessing.client.OrderProcessingServiceStub.AddItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addItem operation
           */
            public void receiveErroraddItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPrice method
            * override this method for handling normal response from getPrice operation
            */
           public void receiveResultgetPrice(
                    com.orderprocessing.client.OrderProcessingServiceStub.GetPriceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPrice operation
           */
            public void receiveErrorgetPrice(java.lang.Exception e) {
            }
                


    }
    
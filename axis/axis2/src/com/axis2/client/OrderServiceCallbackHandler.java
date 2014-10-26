
/**
 * OrderServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.axis2.client;

    /**
     *  OrderServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class OrderServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public OrderServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public OrderServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getOrderDetails method
            * override this method for handling normal response from getOrderDetails operation
            */
           public void receiveResultgetOrderDetails(
                    com.axis2.client.OrderServiceStub.GetOrderDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOrderDetails operation
           */
            public void receiveErrorgetOrderDetails(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addEntry method
            * override this method for handling normal response from addEntry operation
            */
           public void receiveResultaddEntry(
                    com.axis2.client.OrderServiceStub.AddEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addEntry operation
           */
            public void receiveErroraddEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addOrder method
            * override this method for handling normal response from addOrder operation
            */
           public void receiveResultaddOrder(
                    com.axis2.client.OrderServiceStub.AddOrderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addOrder operation
           */
            public void receiveErroraddOrder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findItem method
            * override this method for handling normal response from findItem operation
            */
           public void receiveResultfindItem(
                    com.axis2.client.OrderServiceStub.FindItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findItem operation
           */
            public void receiveErrorfindItem(java.lang.Exception e) {
            }
                


    }
    


/**
 * Orderprocessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.orderprocessing.stub;

    /*
     *  Orderprocessing java interface
     */

    public interface Orderprocessing {
          

        /**
          * Auto generated method signature
          * 
                    * @param addProduct3
                
         */

         
                     public org.wso2.carbon.orderprocessing.xsd.Product addProduct(

                        org.wso2.carbon.orderprocessing.xsd.Product product4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addProduct3
            
          */
        public void startaddProduct(

            org.wso2.carbon.orderprocessing.xsd.Product product4,

            final org.wso2.carbon.orderprocessing.stub.OrderprocessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param viewProduct7
                
         */

         
                     public org.wso2.carbon.orderprocessing.xsd.Product viewProduct(

                        java.lang.String name8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param viewProduct7
            
          */
        public void startviewProduct(

            java.lang.String name8,

            final org.wso2.carbon.orderprocessing.stub.OrderprocessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param viewOrder11
                
         */

         
                     public double viewOrder(

                        int orderID12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param viewOrder11
            
          */
        public void startviewOrder(

            int orderID12,

            final org.wso2.carbon.orderprocessing.stub.OrderprocessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addOrder15
                
         */

         
                     public java.lang.String addOrder(

                        java.lang.String[] itemList16,int[] itemQtyList17)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addOrder15
            
          */
        public void startaddOrder(

            java.lang.String[] itemList16,int[] itemQtyList17,

            final org.wso2.carbon.orderprocessing.stub.OrderprocessingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
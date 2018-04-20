/**
 * ChanduService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.learn.ws;

public interface ChanduService extends javax.xml.rpc.Service {
    public java.lang.String getchanduAddress();

    public com.learn.ws.Chandu getchandu() throws javax.xml.rpc.ServiceException;

    public com.learn.ws.Chandu getchandu(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

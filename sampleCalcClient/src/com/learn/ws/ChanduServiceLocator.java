/**
 * ChanduServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.learn.ws;

public class ChanduServiceLocator extends org.apache.axis.client.Service implements com.learn.ws.ChanduService {

    public ChanduServiceLocator() {
    }


    public ChanduServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChanduServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for chandu
    private java.lang.String chandu_address = "http://localhost:8080/sampleCalc/services/chandu";

    public java.lang.String getchanduAddress() {
        return chandu_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String chanduWSDDServiceName = "chandu";

    public java.lang.String getchanduWSDDServiceName() {
        return chanduWSDDServiceName;
    }

    public void setchanduWSDDServiceName(java.lang.String name) {
        chanduWSDDServiceName = name;
    }

    public com.learn.ws.Chandu getchandu() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(chandu_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getchandu(endpoint);
    }

    public com.learn.ws.Chandu getchandu(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.learn.ws.ChanduSoapBindingStub _stub = new com.learn.ws.ChanduSoapBindingStub(portAddress, this);
            _stub.setPortName(getchanduWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setchanduEndpointAddress(java.lang.String address) {
        chandu_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.learn.ws.Chandu.class.isAssignableFrom(serviceEndpointInterface)) {
                com.learn.ws.ChanduSoapBindingStub _stub = new com.learn.ws.ChanduSoapBindingStub(new java.net.URL(chandu_address), this);
                _stub.setPortName(getchanduWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("chandu".equals(inputPortName)) {
            return getchandu();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.learn.com", "chanduService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.learn.com", "chandu"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("chandu".equals(portName)) {
            setchanduEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

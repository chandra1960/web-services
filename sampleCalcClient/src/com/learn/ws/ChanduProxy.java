package com.learn.ws;

public class ChanduProxy implements com.learn.ws.Chandu {
  private String _endpoint = null;
  private com.learn.ws.Chandu chandu = null;
  
  public ChanduProxy() {
    _initChanduProxy();
  }
  
  public ChanduProxy(String endpoint) {
    _endpoint = endpoint;
    _initChanduProxy();
  }
  
  private void _initChanduProxy() {
    try {
      chandu = (new com.learn.ws.ChanduServiceLocator()).getchandu();
      if (chandu != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)chandu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)chandu)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (chandu != null)
      ((javax.xml.rpc.Stub)chandu)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.learn.ws.Chandu getChandu() {
    if (chandu == null)
      _initChanduProxy();
    return chandu;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (chandu == null)
      _initChanduProxy();
    return chandu.add(a, b);
  }
  
  
}
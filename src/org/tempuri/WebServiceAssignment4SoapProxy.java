package org.tempuri;

public class WebServiceAssignment4SoapProxy implements org.tempuri.WebServiceAssignment4Soap {
  private String _endpoint = null;
  private org.tempuri.WebServiceAssignment4Soap webServiceAssignment4Soap = null;
  
  public WebServiceAssignment4SoapProxy() {
    _initWebServiceAssignment4SoapProxy();
  }
  
  public WebServiceAssignment4SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceAssignment4SoapProxy();
  }
  
  private void _initWebServiceAssignment4SoapProxy() {
    try {
      webServiceAssignment4Soap = (new org.tempuri.WebServiceAssignment4Locator()).getWebServiceAssignment4Soap();
      if (webServiceAssignment4Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceAssignment4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceAssignment4Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceAssignment4Soap != null)
      ((javax.xml.rpc.Stub)webServiceAssignment4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceAssignment4Soap getWebServiceAssignment4Soap() {
    if (webServiceAssignment4Soap == null)
      _initWebServiceAssignment4SoapProxy();
    return webServiceAssignment4Soap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (webServiceAssignment4Soap == null)
      _initWebServiceAssignment4SoapProxy();
    return webServiceAssignment4Soap.helloWorld();
  }
  
  public java.lang.Object[] getCustomers() throws java.rmi.RemoteException{
    if (webServiceAssignment4Soap == null)
      _initWebServiceAssignment4SoapProxy();
    return webServiceAssignment4Soap.getCustomers();
  }
  
  public java.lang.Object[] getRent() throws java.rmi.RemoteException{
    if (webServiceAssignment4Soap == null)
      _initWebServiceAssignment4SoapProxy();
    return webServiceAssignment4Soap.getRent();
  }
  
  public java.lang.Object[] getCars() throws java.rmi.RemoteException{
    if (webServiceAssignment4Soap == null)
      _initWebServiceAssignment4SoapProxy();
    return webServiceAssignment4Soap.getCars();
  }
  
  
}
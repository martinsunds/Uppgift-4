package org.tempuri;

public class WebServiceUppgift4SoapProxy implements org.tempuri.WebServiceUppgift4Soap {
  private String _endpoint = null;
  private org.tempuri.WebServiceUppgift4Soap webServiceUppgift4Soap = null;
  
  public WebServiceUppgift4SoapProxy() {
    _initWebServiceUppgift4SoapProxy();
  }
  
  public WebServiceUppgift4SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceUppgift4SoapProxy();
  }
  
  private void _initWebServiceUppgift4SoapProxy() {
    try {
      webServiceUppgift4Soap = (new org.tempuri.WebServiceUppgift4Locator()).getWebServiceUppgift4Soap();
      if (webServiceUppgift4Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceUppgift4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceUppgift4Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceUppgift4Soap != null)
      ((javax.xml.rpc.Stub)webServiceUppgift4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceUppgift4Soap getWebServiceUppgift4Soap() {
    if (webServiceUppgift4Soap == null)
      _initWebServiceUppgift4SoapProxy();
    return webServiceUppgift4Soap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (webServiceUppgift4Soap == null)
      _initWebServiceUppgift4SoapProxy();
    return webServiceUppgift4Soap.helloWorld();
  }
  
  public java.lang.Object[] getCustomers() throws java.rmi.RemoteException{
    if (webServiceUppgift4Soap == null)
      _initWebServiceUppgift4SoapProxy();
    return webServiceUppgift4Soap.getCustomers();
  }
  
  public java.lang.Object[] getRent() throws java.rmi.RemoteException{
    if (webServiceUppgift4Soap == null)
      _initWebServiceUppgift4SoapProxy();
    return webServiceUppgift4Soap.getRent();
  }
  
  public java.lang.Object[] getCars() throws java.rmi.RemoteException{
    if (webServiceUppgift4Soap == null)
      _initWebServiceUppgift4SoapProxy();
    return webServiceUppgift4Soap.getCars();
  }
  
  
}
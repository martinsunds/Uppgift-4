/**
 * WebServiceUppgift4Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebServiceUppgift4Locator extends org.apache.axis.client.Service implements org.tempuri.WebServiceUppgift4 {

    public WebServiceUppgift4Locator() {
    }


    public WebServiceUppgift4Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceUppgift4Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceUppgift4Soap
    private java.lang.String WebServiceUppgift4Soap_address = "http://localhost/WebApplicationUppgift4/WebServiceUppgift4.asmx";

    public java.lang.String getWebServiceUppgift4SoapAddress() {
        return WebServiceUppgift4Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceUppgift4SoapWSDDServiceName = "WebServiceUppgift4Soap";

    public java.lang.String getWebServiceUppgift4SoapWSDDServiceName() {
        return WebServiceUppgift4SoapWSDDServiceName;
    }

    public void setWebServiceUppgift4SoapWSDDServiceName(java.lang.String name) {
        WebServiceUppgift4SoapWSDDServiceName = name;
    }

    public org.tempuri.WebServiceUppgift4Soap getWebServiceUppgift4Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceUppgift4Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceUppgift4Soap(endpoint);
    }

    public org.tempuri.WebServiceUppgift4Soap getWebServiceUppgift4Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebServiceUppgift4SoapStub _stub = new org.tempuri.WebServiceUppgift4SoapStub(portAddress, this);
            _stub.setPortName(getWebServiceUppgift4SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceUppgift4SoapEndpointAddress(java.lang.String address) {
        WebServiceUppgift4Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebServiceUppgift4Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebServiceUppgift4SoapStub _stub = new org.tempuri.WebServiceUppgift4SoapStub(new java.net.URL(WebServiceUppgift4Soap_address), this);
                _stub.setPortName(getWebServiceUppgift4SoapWSDDServiceName());
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
        if ("WebServiceUppgift4Soap".equals(inputPortName)) {
            return getWebServiceUppgift4Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceUppgift4");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceUppgift4Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceUppgift4Soap".equals(portName)) {
            setWebServiceUppgift4SoapEndpointAddress(address);
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

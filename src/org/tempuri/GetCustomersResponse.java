/**
 * GetCustomersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCustomersResponse  implements java.io.Serializable {
    private java.lang.Object[] getCustomersResult;

    public GetCustomersResponse() {
    }

    public GetCustomersResponse(
           java.lang.Object[] getCustomersResult) {
           this.getCustomersResult = getCustomersResult;
    }


    /**
     * Gets the getCustomersResult value for this GetCustomersResponse.
     * 
     * @return getCustomersResult
     */
    public java.lang.Object[] getGetCustomersResult() {
        return getCustomersResult;
    }


    /**
     * Sets the getCustomersResult value for this GetCustomersResponse.
     * 
     * @param getCustomersResult
     */
    public void setGetCustomersResult(java.lang.Object[] getCustomersResult) {
        this.getCustomersResult = getCustomersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomersResponse)) return false;
        GetCustomersResponse other = (GetCustomersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomersResult==null && other.getGetCustomersResult()==null) || 
             (this.getCustomersResult!=null &&
              java.util.Arrays.equals(this.getCustomersResult, other.getGetCustomersResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetCustomersResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetCustomersResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetCustomersResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCustomersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCustomersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCustomersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

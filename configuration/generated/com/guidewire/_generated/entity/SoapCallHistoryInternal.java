package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SoapCallHistory.eti;SoapCallHistory.eix;SoapCallHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SoapCallHistoryInternal extends com.guidewire._generated.entity.InboundHistoryInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal {
  java.lang.String SOAPCALLHISTORYADDED_EVENT = "SoapCallHistoryAdded";
  
  java.lang.String SOAPCALLHISTORYCHANGED_EVENT = "SoapCallHistoryChanged";
  
  java.lang.String SOAPCALLHISTORYREMOVED_EVENT = "SoapCallHistoryRemoved";
  
  /**
   * Gets the value of the OperationName field.
   * The name of the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOperationName();
  
  
  /**
   * Gets the value of the ServerName field.
   * The name of the server receiving the request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerName();
  
  
  /**
   * Gets the value of the ServiceName field.
   * The name of the service.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServiceName();
  
  
  /**
   * Sets the value of the OperationName field.
   */
  public void setOperationName(java.lang.String value);
  
  
  /**
   * Sets the value of the ServerName field.
   */
  public void setServerName(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceName field.
   */
  public void setServiceName(java.lang.String value);
  
  
  
}
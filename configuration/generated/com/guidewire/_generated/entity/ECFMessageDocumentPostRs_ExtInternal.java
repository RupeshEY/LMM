package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageDocumentPostRs_Ext.eti;ECFMessageDocumentPostRs_Ext.eix;ECFMessageDocumentPostRs_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageDocumentPostRs_ExtInternal extends com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal {
  /**
   * Gets the value of the OperationStatus field.
   * Operation's status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFDocumentMsgStatus_Ext getOperationStatus();
  
  
  /**
   * Gets the value of the ReferredUUID field.
   * The UUID for the Document Message this response is for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferredUUID();
  
  
  /**
   * Sets the value of the OperationStatus field.
   */
  public void setOperationStatus(typekey.ECFDocumentMsgStatus_Ext value);
  
  
  /**
   * Sets the value of the ReferredUUID field.
   */
  public void setReferredUUID(java.lang.String value);
  
  
  
}
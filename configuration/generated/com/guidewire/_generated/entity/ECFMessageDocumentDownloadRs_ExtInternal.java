package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageDocumentDownloadRs_Ext.eti;ECFMessageDocumentDownloadRs_Ext.eix;ECFMessageDocumentDownloadRs_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageDocumentDownloadRs_ExtInternal extends com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal {
  /**
   * Gets the value of the DocumentBinary field.
   * The Binary data of the document attached to this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getDocumentBinary();
  
  
  /**
   * Gets the value of the DownloadRequestUUId field.
   * DownloadRequestUUId - Unique Universal Identifier of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDownloadRequestUUId();
  
  
  /**
   * Sets the value of the DocumentBinary field.
   */
  public void setDocumentBinary(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the DownloadRequestUUId field.
   */
  public void setDownloadRequestUUId(java.lang.String value);
  
  
  
}
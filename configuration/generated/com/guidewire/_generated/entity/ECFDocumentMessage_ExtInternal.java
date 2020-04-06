package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFDocumentMessage_Ext.eti;ECFDocumentMessage_Ext.eix;ECFDocumentMessage_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFDocumentMessage_ExtInternal extends com.guidewire._generated.entity.ECFMessage_ExtInternal {
  /**
   * Gets the value of the Document field.
   * The Document which relates to this message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDocument();
  
  
  public gw.pl.persistence.core.Key getDocumentID();
  
  
  /**
   * Sets the value of the Document field.
   */
  public void setDocument(entity.Document value);
  
  
  public void setDocumentID(gw.pl.persistence.core.Key value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageDocumentUploadRq_Ext.eti;ECFMessageDocumentUploadRq_Ext.eix;ECFMessageDocumentUploadRq_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageDocumentUploadRq_ExtInternal extends com.guidewire._generated.entity.ECFDocumentMessage_ExtInternal {
  /**
   * Adds the given element to the AccessParties array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAccessParties(entity.ECFMessageDocumentUploadAccessParty_Ext element);
  
  
  /**
   * Gets the value of the AccessParties field.
   * The access control list for this document
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageDocumentUploadAccessParty_Ext[] getAccessParties();
  
  
  /**
   * Gets the value of the UploadResponseUUId field.
   * UploadResponseUUId - Unique Universal Identifier of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUploadResponseUUId();
  
  
  /**
   * Removes the given element from the AccessParties array. This is achieved by marking the element for removal.
   */
  public void removeFromAccessParties(entity.ECFMessageDocumentUploadAccessParty_Ext element);
  
  
  /**
   * Removes the given element from the AccessParties array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAccessParties(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AccessParties field.
   */
  public void setAccessParties(entity.ECFMessageDocumentUploadAccessParty_Ext[] value);
  
  
  /**
   * Sets the value of the UploadResponseUUId field.
   */
  public void setUploadResponseUUId(java.lang.String value);
  
  
  
}
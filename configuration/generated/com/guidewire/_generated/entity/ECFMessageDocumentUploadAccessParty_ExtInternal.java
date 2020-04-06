package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageDocumentUploadAccessParty_Ext.eti;ECFMessageDocumentUploadAccessParty_Ext.eix;ECFMessageDocumentUploadAccessParty_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageDocumentUploadAccessParty_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the AccessRight field.
   * Access rights for the uploaded document. Either 'change' or 'read'
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccessRight();
  
  
  /**
   * Gets the value of the ECFMessageDocumentUploadRq field.
   * The document upload request which this access party belongs to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageDocumentUploadRq_Ext getECFMessageDocumentUploadRq();
  
  
  public gw.pl.persistence.core.Key getECFMessageDocumentUploadRqID();
  
  
  /**
   * Gets the value of the ListAction field.
   * Action to be done on the uploaded document. Either 'add' or 'remove'
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getListAction();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PartyId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyId();
  
  
  /**
   * Gets the value of the PartyName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyName();
  
  
  /**
   * Gets the value of the PartyRole field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyRole();
  
  
  /**
   * Gets the value of the CanAccess field.
   * Set by user on UI for a Document Upload Request - This identifies if the party has access to the document or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCanAccess();
  
  
  /**
   * Sets the value of the AccessRight field.
   */
  public void setAccessRight(java.lang.String value);
  
  
  /**
   * Sets the value of the CanAccess field.
   */
  public void setCanAccess(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ECFMessageDocumentUploadRq field.
   */
  public void setECFMessageDocumentUploadRq(entity.ECFMessageDocumentUploadRq_Ext value);
  
  
  public void setECFMessageDocumentUploadRqID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ListAction field.
   */
  public void setListAction(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PartyId field.
   */
  public void setPartyId(java.lang.String value);
  
  
  /**
   * Sets the value of the PartyName field.
   */
  public void setPartyName(java.lang.String value);
  
  
  /**
   * Sets the value of the PartyRole field.
   */
  public void setPartyRole(java.lang.String value);
  
  
  
}
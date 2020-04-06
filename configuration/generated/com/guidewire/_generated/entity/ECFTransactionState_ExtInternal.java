package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFTransactionState_Ext.eti;ECFTransactionState_Ext.eix;ECFTransactionState_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFTransactionState_ExtInternal extends com.guidewire._generated.entity.RetireableInternal {
  /**
   * Adds the given element to the ECFMessages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToECFMessages(entity.ECFMessageClaimData_Ext element);
  
  
  /**
   * Gets the value of the ECFMessages field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext[] getECFMessages();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReceiverId field.
   * The ID of the receiver party.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReceiverId();
  
  
  /**
   * Gets the value of the TR field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR();
  
  
  /**
   * Gets the value of the TransactionSequence field.
   * The Transaction Sequence number for this Transaction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTransactionSequence();
  
  
  /**
   * Gets the value of the UCR field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR();
  
  
  /**
   * Gets the value of the UUID field.
   * The UUID for the respondable message or null if there is no any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUUID();
  
  
  /**
   * Gets the value of the Agreed field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAgreed();
  
  
  /**
   * Removes the given element from the ECFMessages array. This is achieved by marking the element for removal.
   */
  public void removeFromECFMessages(entity.ECFMessageClaimData_Ext element);
  
  
  /**
   * Removes the given element from the ECFMessages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromECFMessages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Agreed field.
   */
  public void setAgreed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ECFMessages field.
   */
  public void setECFMessages(entity.ECFMessageClaimData_Ext[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReceiverId field.
   */
  public void setReceiverId(java.lang.String value);
  
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value);
  
  
  /**
   * Sets the value of the TransactionSequence field.
   */
  public void setTransactionSequence(java.lang.Integer value);
  
  
  /**
   * Sets the value of the UCR field.
   */
  public void setUCR(java.lang.String value);
  
  
  /**
   * Sets the value of the UUID field.
   */
  public void setUUID(java.lang.String value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageBulkClaim_Ext.eti;ECFMessageBulkClaim_Ext.eix;ECFMessageBulkClaim_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageBulkClaim_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Adds the given element to the Details array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDetails(entity.ECFMessageBulkClaimDetail_Ext element);
  
  
  /**
   * Gets the value of the Details field.
   * ECF Message Claim Notify Request Carrier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBulkClaimDetail_Ext[] getDetails();
  
  
  /**
   * Gets the value of the ECFMsg field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMsg();
  
  
  public gw.pl.persistence.core.Key getECFMsgID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossDate field.
   * The date of loss for a claim, or the first date in a loss period
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the LossName field.
   * The name of the component loss
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossName();
  
  
  /**
   * Gets the value of the TR field.
   * The Transaction reference of the component transaction which is in the header for a bulk collection
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR();
  
  
  /**
   * Gets the value of the UCR field.
   * Unique Claim Reference of the component claim which is the header for a bulk collection
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR();
  
  
  /**
   * Removes the given element from the Details array. This is achieved by marking the element for removal.
   */
  public void removeFromDetails(entity.ECFMessageBulkClaimDetail_Ext element);
  
  
  /**
   * Removes the given element from the Details array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDetails(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Details field.
   */
  public void setDetails(entity.ECFMessageBulkClaimDetail_Ext[] value);
  
  
  /**
   * Sets the value of the ECFMsg field.
   */
  public void setECFMsg(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMsgID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossName field.
   */
  public void setLossName(java.lang.String value);
  
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value);
  
  
  /**
   * Sets the value of the UCR field.
   */
  public void setUCR(java.lang.String value);
  
  
  
}
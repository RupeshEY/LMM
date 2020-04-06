package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageSoftWarning_Ext.eti;ECFMessageSoftWarning_Ext.eix;ECFMessageSoftWarning_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageSoftWarning_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Description field.
   * Warnings generated at the time the broker creates the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ECFMessage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMessage();
  
  
  public gw.pl.persistence.core.Key getECFMessageID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFMessage field.
   */
  public void setECFMessage(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMessageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}
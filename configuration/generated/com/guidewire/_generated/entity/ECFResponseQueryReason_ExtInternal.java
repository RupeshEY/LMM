package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFResponseQueryReason_Ext.eti;ECFResponseQueryReason_Ext.eix;ECFResponseQueryReason_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFResponseQueryReason_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the ECFMessageClaimResponseRq_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimResponseRq_Ext getECFMessageClaimResponseRq_Ext();
  
  
  public gw.pl.persistence.core.Key getECFMessageClaimResponseRq_ExtID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Reason field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFQueryReason_Ext getReason();
  
  
  /**
   * Sets the value of the ECFMessageClaimResponseRq_Ext field.
   */
  public void setECFMessageClaimResponseRq_Ext(entity.ECFMessageClaimResponseRq_Ext value);
  
  
  public void setECFMessageClaimResponseRq_ExtID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Reason field.
   */
  public void setReason(typekey.ECFQueryReason_Ext value);
  
  
  
}
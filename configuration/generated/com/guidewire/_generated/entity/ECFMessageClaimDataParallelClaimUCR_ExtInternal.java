package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataParallelClaimUCR_Ext.eti;ECFMessageClaimDataParallelClaimUCR_Ext.eix;ECFMessageClaimDataParallelClaimUCR_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimDataParallelClaimUCR_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the ECFMessageClaimData field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMessageClaimData();
  
  
  public gw.pl.persistence.core.Key getECFMessageClaimDataID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PUCR field.
   * Parallel Unique Claim Reference
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPUCR();
  
  
  /**
   * Sets the value of the ECFMessageClaimData field.
   */
  public void setECFMessageClaimData(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMessageClaimDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PUCR field.
   */
  public void setPUCR(java.lang.String value);
  
  
  
}
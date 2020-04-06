package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFResponseAPModification_Ext.eti;ECFResponseAPModification_Ext.eix;ECFResponseAPModification_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFResponseAPModification_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Agency field.
   * The agency of the Agreement Party that was modified
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgency();
  
  
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
   * Gets the value of the Name field.
   * The name of the Agreement Party that was modified
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the PartyId field.
   * The ID of the Agreement Party that was modified
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyId();
  
  
  /**
   * Gets the value of the Promotion field.
   * Boolean representation of a promotion/demotion. True = Promoted to AP. False = demoted to Follower
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPromotion();
  
  
  /**
   * Sets the value of the Agency field.
   */
  public void setAgency(java.lang.String value);
  
  
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
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the PartyId field.
   */
  public void setPartyId(java.lang.String value);
  
  
  /**
   * Sets the value of the Promotion field.
   */
  public void setPromotion(java.lang.Boolean value);
  
  
  
}
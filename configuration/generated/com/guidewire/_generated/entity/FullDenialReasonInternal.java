package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FullDenialReason.eti;FullDenialReason.eix;FullDenialReason.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FullDenialReasonInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the ClaimWorkComp field.
   * Associated Workers Comp Claim Info
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkComp getClaimWorkComp();
  
  
  public gw.pl.persistence.core.Key getClaimWorkCompID();
  
  
  /**
   * Gets the value of the FullDenialReasonCode field.
   * Denial reason code for the compensability decision
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FullDenialReason getFullDenialReasonCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the ClaimWorkComp field.
   */
  public void setClaimWorkComp(entity.ClaimWorkComp value);
  
  
  public void setClaimWorkCompID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FullDenialReasonCode field.
   */
  public void setFullDenialReasonCode(typekey.FullDenialReason value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}
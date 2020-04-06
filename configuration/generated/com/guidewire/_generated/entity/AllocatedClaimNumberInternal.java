package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AllocatedClaimNumber.eti;AllocatedClaimNumber.eix;AllocatedClaimNumber.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AllocatedClaimNumberInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.AllocatedClaimNumber {
  /**
   * Gets the value of the Claim field.
   * The draft claim for which this number was allocated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * The claim number that was allocated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  
}
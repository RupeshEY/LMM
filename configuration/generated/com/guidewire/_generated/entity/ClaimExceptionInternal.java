package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimException.eti;ClaimException.eix;ClaimException.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimExceptionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ClaimException {
  /**
   * Gets the value of the Claim field.
   * A foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ExCheckTime field.
   * The last time at which claim exception rules were run on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExCheckTime();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExCheckTime field.
   */
  public void setExCheckTime(java.util.Date value);
  
  
  
}
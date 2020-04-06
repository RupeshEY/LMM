package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAccess.eti;ClaimAccess.eix;ClaimAccess.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAccessInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ClaimAccessDataInternal, com.guidewire.cc.domain.claim.impl.ClaimAccessInternal, gw.cc.claim.entity.ClaimAccess {
  /**
   * Gets the value of the Claim field.
   * A foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  
}
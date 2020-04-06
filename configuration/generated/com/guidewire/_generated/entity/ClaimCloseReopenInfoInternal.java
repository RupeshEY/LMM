package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimCloseReopenInfo.eti;ClaimCloseReopenInfo.eix;ClaimCloseReopenInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimCloseReopenInfoInternal extends com.guidewire._generated.entity.CloseReopenInfoInternal, gw.cc.claim.entity.ClaimCloseReopenInfo {
  /**
   * Gets the value of the Claim field.
   * Claim that the action was applied.
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
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CloseClaimInfo.eti;CloseClaimInfo.eix;CloseClaimInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CloseClaimInfoInternal extends com.guidewire._generated.entity.ClaimCloseReopenInfoInternal, gw.cc.claim.entity.CloseClaimInfo {
  /**
   * Gets the value of the outcome field.
   * Reason claim was closed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimClosedOutcomeType getoutcome();
  
  
  /**
   * Sets the value of the outcome field.
   */
  public void setoutcome(typekey.ClaimClosedOutcomeType value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReopenClaimInfo.eti;ReopenClaimInfo.eix;ReopenClaimInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReopenClaimInfoInternal extends com.guidewire._generated.entity.ClaimCloseReopenInfoInternal, gw.cc.claim.entity.ReopenClaimInfo {
  /**
   * Gets the value of the reopenReason field.
   * Reason the claim is being reopened.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimReopenedReason getreopenReason();
  
  
  /**
   * Sets the value of the reopenReason field.
   */
  public void setreopenReason(typekey.ClaimReopenedReason value);
  
  
  
}
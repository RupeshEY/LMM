package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimTeamView.eti;ClaimTeamView.eix;ClaimTeamView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimTeamViewInternal extends com.guidewire._generated.entity.ClaimAssignmentViewInternal, gw.cc.claim.entity.ClaimTeamView {
  /**
   * Gets the value of the AssignedQueueID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getAssignedQueueID();
  
  
  /**
   * Gets the value of the AssignedUserID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getAssignedUserID();
  
  
  /**
   * Gets the value of the TotalIncurredNet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNet();
  
  
  /**
   * Sets the value of the AssignedQueueID field.
   */
  public void setAssignedQueueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedUserID field.
   */
  public void setAssignedUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value);
  
  
  
}
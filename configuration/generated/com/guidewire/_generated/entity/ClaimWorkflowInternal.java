package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimWorkflow.eti;ClaimWorkflow.eix;ClaimWorkflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimWorkflowInternal extends com.guidewire._generated.entity.WorkflowInternal, gw.cc.workflow.entity.ClaimWorkflow {
  /**
   * Gets the value of the Claim field.
   * The Claim with which this workflow is associated.
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
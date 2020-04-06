package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowActionLog.eti;WorkflowActionLog.eix;WorkflowActionLog.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowActionLogInternal extends com.guidewire._generated.entity.WorkflowLogEntryInternal, com.guidewire.pl.domain.workflow.WorkflowLogEntryPublicMethods {
  /**
   * Gets the value of the Action field.
   * The current action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActionType getAction();
  
  
  /**
   * Gets the value of the StepId field.
   * The current step of the id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStepId();
  
  
  /**
   * Sets the value of the Action field.
   */
  public void setAction(typekey.WorkflowActionType value);
  
  
  /**
   * Sets the value of the StepId field.
   */
  public void setStepId(java.lang.String value);
  
  
  
}
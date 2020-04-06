package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowUserLog.eti;WorkflowUserLog.eix;WorkflowUserLog.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowUserLogInternal extends com.guidewire._generated.entity.WorkflowLogEntryInternal, com.guidewire.pl.domain.workflow.WorkflowLogEntryPublicMethods {
  /**
   * Gets the value of the user field.
   * The user how invoked the action.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getuser();
  
  
  public gw.pl.persistence.core.Key getuserID();
  
  
  /**
   * Sets the value of the user field.
   */
  public void setuser(entity.User value);
  
  
  public void setuserID(gw.pl.persistence.core.Key value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowTextLog.eti;WorkflowTextLog.eix;WorkflowTextLog.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowTextLogInternal extends com.guidewire._generated.entity.WorkflowLogEntryInternal, com.guidewire.pl.domain.workflow.WorkflowLogEntryPublicMethods {
  /**
   * Gets the value of the Description field.
   * Optional detailed description (may include stack trace)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Summary field.
   * Short description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSummary();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Summary field.
   */
  public void setSummary(java.lang.String value);
  
  
  
}
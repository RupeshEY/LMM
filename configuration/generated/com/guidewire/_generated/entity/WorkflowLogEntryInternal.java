package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowLogEntry.eti;WorkflowLogEntry.eix;WorkflowLogEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowLogEntryInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.domain.workflow.WorkflowLogEntryPublicMethods {
  /**
   * Gets the value of the Argument field.
   * The argument for the display key
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getArgument();
  
  
  /**
   * Gets the value of the DisplayKey field.
   * The display key to construct
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDisplayKey();
  
  
  /**
   * Gets the value of the LogDate field.
   * The date when this entry was logged
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLogDate();
  
  
  /**
   * Gets the value of the SortOrder field.
   * Number of times this workflow has been polled.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSortOrder();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowLogEntry getSubtype();
  
  
  /**
   * Gets the value of the Workflow field.
   * The Workflow this log entry is for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getWorkflow();
  
  
  public gw.pl.persistence.core.Key getWorkflowID();
  
  
  /**
   * Sets the value of the Argument field.
   */
  public void setArgument(java.lang.Integer value);
  
  
  /**
   * Sets the value of the DisplayKey field.
   */
  public void setDisplayKey(java.lang.String value);
  
  
  /**
   * Sets the value of the LogDate field.
   */
  public void setLogDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SortOrder field.
   */
  public void setSortOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.WorkflowLogEntry value);
  
  
  /**
   * Sets the value of the Workflow field.
   */
  public void setWorkflow(entity.Workflow value);
  
  
  public void setWorkflowID(gw.pl.persistence.core.Key value);
  
  
  
}
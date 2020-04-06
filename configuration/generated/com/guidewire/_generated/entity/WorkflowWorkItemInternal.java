package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowWorkItem.eti;WorkflowWorkItem.eix;WorkflowWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkflowWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal, com.guidewire.pl.system.bundle.InsertCallback {
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowWorkItem getSubtype();
  
  
  /**
   * Gets the value of the Workflow field.
   * The Workflow to be advanced.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getWorkflow();
  
  
  public gw.pl.persistence.core.Key getWorkflowID();
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.WorkflowWorkItem value);
  
  
  /**
   * Sets the value of the Workflow field.
   */
  public void setWorkflow(entity.Workflow value);
  
  
  public void setWorkflowID(gw.pl.persistence.core.Key value);
  
  
  
}
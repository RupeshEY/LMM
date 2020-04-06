package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkItemSetItem.eti;WorkItemSetItem.eix;WorkItemSetItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkItemSetItemInternal extends com.guidewire._generated.entity.WorkItemInternal {
  /**
   * Gets the value of the WorkItemSetID field.
   * The work item set that owns this workitem.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getWorkItemSetID();
  
  
  /**
   * Gets the value of the WorkDone field.
   * The work item is done flag.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWorkDone();
  
  
  /**
   * Sets the value of the WorkDone field.
   */
  public void setWorkDone(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WorkItemSetID field.
   */
  public void setWorkItemSetID(java.lang.Long value);
  
  
  
}
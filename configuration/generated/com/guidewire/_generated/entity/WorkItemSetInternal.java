package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkItemSet.eti;WorkItemSet.eix;WorkItemSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkItemSetInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.workitemset.WorkItemSetPublicMethods {
  /**
   * Gets the value of the EndTime field.
   * timestamp when the last WorkItem finished processing
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the NumOpsCanceled field.
   * Number of operations that were not processed because the user canceled the WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumOpsCanceled();
  
  
  /**
   * Gets the value of the NumOpsCompleted field.
   * Number of operations completed (successfully or otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumOpsCompleted();
  
  
  /**
   * Gets the value of the NumOpsFailed field.
   * Number of operations that have failed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumOpsFailed();
  
  
  /**
   * Gets the value of the NumTotalOps field.
   * Total number of operations (WorkItems) that make up this WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumTotalOps();
  
  
  /**
   * Gets the value of the ProcessHistory field.
   * Reference to the ProcessHistory instance of the batch process that generated this WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getProcessHistory();
  
  
  /**
   * Gets the value of the StartTime field.
   * timestamp when we started processing the WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the State field.
   * The state of this WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkItemSetState getState();
  
  
  /**
   * Gets the value of the WorkItemSetType field.
   * The type of WorkItemSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getWorkItemSetType();
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the NumOpsCanceled field.
   */
  public void setNumOpsCanceled(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumOpsCompleted field.
   */
  public void setNumOpsCompleted(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumOpsFailed field.
   */
  public void setNumOpsFailed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumTotalOps field.
   */
  public void setNumTotalOps(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProcessHistory field.
   */
  public void setProcessHistory(java.lang.Long value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.WorkItemSetState value);
  
  
  /**
   * Sets the value of the WorkItemSetType field.
   */
  public void setWorkItemSetType(typekey.BatchProcessType value);
  
  
  
}
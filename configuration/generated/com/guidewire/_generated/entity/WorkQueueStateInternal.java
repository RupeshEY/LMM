package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkQueueState.eti;WorkQueueState.eix;WorkQueueState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkQueueStateInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the UpdateTime field.
   * Update time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUpdateTime();
  
  
  /**
   * Gets the value of the WorkQueueID field.
   * The related writer batch process, identifying this queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getWorkQueueID();
  
  
  /**
   * Gets the value of the Active field.
   * This Work Queue is active
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the UpdateTime field.
   */
  public void setUpdateTime(java.lang.Long value);
  
  
  /**
   * Sets the value of the WorkQueueID field.
   */
  public void setWorkQueueID(typekey.BatchProcessType value);
  
  
  
}
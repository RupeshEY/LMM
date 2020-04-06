package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "StandardWorkItem.eti;StandardWorkItem.eix;StandardWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface StandardWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal {
  /**
   * Gets the value of the QueueType field.
   * The queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getQueueType();
  
  
  /**
   * Gets the value of the Target field.
   * A handle, generally the ID, to the target.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTarget();
  
  
  /**
   * Sets the value of the QueueType field.
   */
  public void setQueueType(typekey.BatchProcessType value);
  
  
  /**
   * Sets the value of the Target field.
   */
  public void setTarget(java.lang.Long value);
  
  
  
}
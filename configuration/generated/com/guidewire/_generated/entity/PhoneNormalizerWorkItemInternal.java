package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PhoneNormalizerWorkItem.eti;PhoneNormalizerWorkItem.eix;PhoneNormalizerWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PhoneNormalizerWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal {
  /**
   * Gets the value of the EntityTypeName field.
   * Entity name for the associated ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityTypeName();
  
  
  /**
   * Gets the value of the QueueType field.
   * The queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getQueueType();
  
  
  /**
   * Gets the value of the TargetIDs field.
   * Entity IDs that contain normalizable phone data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetIDs();
  
  
  /**
   * Sets the value of the EntityTypeName field.
   */
  public void setEntityTypeName(java.lang.String value);
  
  
  /**
   * Sets the value of the QueueType field.
   */
  public void setQueueType(typekey.BatchProcessType value);
  
  
  /**
   * Sets the value of the TargetIDs field.
   */
  public void setTargetIDs(java.lang.String value);
  
  
  
}
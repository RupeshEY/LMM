package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TimedUpgraderObject.eti;TimedUpgraderObject.eix;TimedUpgraderObject.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TimedUpgraderObjectInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the timing completed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ExecDuration field.
   * Execution duration in seconds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecDuration();
  
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the timing began
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ExecDuration field.
   */
  public void setExecDuration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ScheduledJob.eti;ScheduledJob.eix;ScheduledJob.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ScheduledJobInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ActualSchedule field.
   * The actual schedule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getActualSchedule();
  
  
  /**
   * Gets the value of the ConfigSchedule field.
   * The schedule from the configuration file
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getConfigSchedule();
  
  
  /**
   * Gets the value of the NextTime field.
   * The next time when the batch process has to be started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNextTime();
  
  
  /**
   * Gets the value of the ProcessType field.
   * The batch process
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getProcessType();
  
  
  /**
   * Gets the value of the Version field.
   * The bean version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getVersion();
  
  
  /**
   * Sets the value of the ActualSchedule field.
   */
  public void setActualSchedule(java.lang.String value);
  
  
  /**
   * Sets the value of the ConfigSchedule field.
   */
  public void setConfigSchedule(java.lang.String value);
  
  
  /**
   * Sets the value of the NextTime field.
   */
  public void setNextTime(java.lang.Long value);
  
  
  /**
   * Sets the value of the ProcessType field.
   */
  public void setProcessType(typekey.BatchProcessType value);
  
  
  /**
   * Sets the value of the Version field.
   */
  public void setVersion(java.lang.Integer value);
  
  
  
}
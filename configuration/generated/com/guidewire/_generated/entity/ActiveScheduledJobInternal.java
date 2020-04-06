package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActiveScheduledJob.eti;ActiveScheduledJob.eix;ActiveScheduledJob.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActiveScheduledJobInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the JobStarted field.
   * The timestamp in UTC when the job was started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getJobStarted();
  
  
  /**
   * Gets the value of the ProcessType field.
   * The batch process
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getProcessType();
  
  
  /**
   * Gets the value of the ServerId field.
   * The server ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId();
  
  
  /**
   * Sets the value of the JobStarted field.
   */
  public void setJobStarted(java.lang.Long value);
  
  
  /**
   * Sets the value of the ProcessType field.
   */
  public void setProcessType(typekey.BatchProcessType value);
  
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value);
  
  
  
}
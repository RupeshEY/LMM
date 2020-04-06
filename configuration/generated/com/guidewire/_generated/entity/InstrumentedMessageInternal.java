package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InstrumentedMessage.eti;InstrumentedMessage.eix;InstrumentedMessage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InstrumentedMessageInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.system.entity.DoesNotValidateOnCommit {
  /**
   * Gets the value of the DestinationID field.
   * Identifies the message destination.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDestinationID();
  
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the instance was shutdown.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData();
  
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the instance was started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Sets the value of the DestinationID field.
   */
  public void setDestinationID(java.lang.Integer value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  
}
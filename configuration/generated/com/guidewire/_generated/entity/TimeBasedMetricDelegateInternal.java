package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TimeBasedMetricDelegate.eti;TimeBasedMetricDelegate.eix;TimeBasedMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TimeBasedMetricDelegateInternal extends com.guidewire._generated.entity.IntegerMetricDelegateInternal, gw.cc.metric.entity.TimeBasedMetricDelegate {
  /**
   * Gets the value of the StartTime field.
   * Starting time of the metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the IsOpen field.
   * The value of an open time based metric is now - start time, once closed it has a fixed integer value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsOpen();
  
  
  /**
   * Gets the value of the Skipped field.
   * True if the metric is closed because the normal closing event was skipped.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSkipped();
  
  
  /**
   * Sets the value of the IsOpen field.
   */
  public void setIsOpen(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Skipped field.
   */
  public void setSkipped(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceCycleTimeServiceRequestMetric.eti;ServiceCycleTimeServiceRequestMetric.eix;ServiceCycleTimeServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceCycleTimeServiceRequestMetricInternal extends com.guidewire._generated.entity.TimeBasedServiceRequestMetricInternal {
  /**
   * Gets the value of the TimeSpentWorking field.
   * The aggregate time spent NOT in progress state Specialist Waiting
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTimeSpentWorking();
  
  
  /**
   * Gets the value of the WaitingStartTime field.
   * The time the current waiting state was entered, null if not waiting
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWaitingStartTime();
  
  
  /**
   * Sets the value of the TimeSpentWorking field.
   */
  public void setTimeSpentWorking(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WaitingStartTime field.
   */
  public void setWaitingStartTime(java.util.Date value);
  
  
  
}
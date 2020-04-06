package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetricLimitTimeDelegate.eti;MetricLimitTimeDelegate.eix;MetricLimitTimeDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MetricLimitTimeDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.metric.entity.MetricLimitTimeDelegate {
  /**
   * Gets the value of the ReachRedTime field.
   * Time the red limit was or will be reached
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReachRedTime();
  
  
  /**
   * Gets the value of the ReachYellowTime field.
   * Time the yellow limit was or will be reached.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReachYellowTime();
  
  
  /**
   * Sets the value of the ReachRedTime field.
   */
  public void setReachRedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ReachYellowTime field.
   */
  public void setReachYellowTime(java.util.Date value);
  
  
  
}
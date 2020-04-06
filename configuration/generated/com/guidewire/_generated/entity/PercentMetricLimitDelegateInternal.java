package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentMetricLimitDelegate.eti;PercentMetricLimitDelegate.eix;PercentMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PercentMetricLimitDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.metric.impl.PercentMetricLimitDelegateInternal, gw.cc.metric.entity.PercentMetricLimitDelegate {
  /**
   * Gets the value of the PercentRedValue field.
   * Percent field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentRedValue();
  
  
  /**
   * Gets the value of the PercentTargetValue field.
   * Percent field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentTargetValue();
  
  
  /**
   * Gets the value of the PercentYellowValue field.
   * Percent field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentYellowValue();
  
  
  /**
   * Sets the value of the PercentRedValue field.
   */
  public void setPercentRedValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PercentTargetValue field.
   */
  public void setPercentTargetValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PercentYellowValue field.
   */
  public void setPercentYellowValue(java.math.BigDecimal value);
  
  
  
}
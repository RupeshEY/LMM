package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalMetricLimitDelegate.eti;DecimalMetricLimitDelegate.eix;DecimalMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DecimalMetricLimitDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal, gw.cc.metric.entity.DecimalMetricLimitDelegate {
  /**
   * Gets the value of the DecimalRedValue field.
   * Decimal field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalRedValue();
  
  
  /**
   * Gets the value of the DecimalTargetValue field.
   * Decimal field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalTargetValue();
  
  
  /**
   * Gets the value of the DecimalYellowValue field.
   * Decimal field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalYellowValue();
  
  
  /**
   * Sets the value of the DecimalRedValue field.
   */
  public void setDecimalRedValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DecimalTargetValue field.
   */
  public void setDecimalTargetValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DecimalYellowValue field.
   */
  public void setDecimalYellowValue(java.math.BigDecimal value);
  
  
  
}
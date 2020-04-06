package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalMetricDelegate.eti;DecimalMetricDelegate.eix;DecimalMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DecimalMetricDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.metric.entity.DecimalMetricDelegate {
  /**
   * Gets the value of the DecimalValue field.
   * Decimal field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalValue();
  
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.math.BigDecimal value);
  
  
  
}
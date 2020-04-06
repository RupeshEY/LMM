package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyMetricDelegate.eti;MoneyMetricDelegate.eix;MoneyMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MoneyMetricDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.metric.entity.MoneyMetricDelegate {
  /**
   * Gets the value of the MoneyValue field.
   * Money field to store the money value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyValue();
  
  
  /**
   * Sets the value of the MoneyValue field.
   */
  public void setMoneyValue(gw.api.financials.CurrencyAmount value);
  
  
  
}
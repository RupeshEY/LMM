package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyMetricLimitDelegate.eti;MoneyMetricLimitDelegate.eix;MoneyMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MoneyMetricLimitDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.metric.impl.MoneyMetricLimitDelegateInternal, gw.cc.metric.entity.MoneyMetricLimitDelegate {
  /**
   * Gets the value of the MoneyRedValue field.
   * Money field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyRedValue();
  
  
  /**
   * Gets the value of the MoneyTargetValue field.
   * Money field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyTargetValue();
  
  
  /**
   * Gets the value of the MoneyYellowValue field.
   * Money field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyYellowValue();
  
  
  /**
   * Sets the value of the MoneyRedValue field.
   */
  public void setMoneyRedValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MoneyTargetValue field.
   */
  public void setMoneyTargetValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MoneyYellowValue field.
   */
  public void setMoneyYellowValue(gw.api.financials.CurrencyAmount value);
  
  
  
}
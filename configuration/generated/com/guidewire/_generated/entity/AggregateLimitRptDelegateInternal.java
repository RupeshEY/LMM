package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AggregateLimitRptDelegate.eti;AggregateLimitRptDelegate.eix;AggregateLimitRptDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AggregateLimitRptDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal, gw.cc.aggregatelimit.entity.AggregateLimitRptDelegate {
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria();
  
  
  /**
   * Gets the value of the CoverageLine field.
   * The associated coverage line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine getCoverageLine();
  
  
  public gw.pl.persistence.core.Key getCoverageLineID();
  
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type: by loss date or by reported date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType();
  
  
  /**
   * Gets the value of the LimitUsed field.
   * The amount of the limit that has been used that is tracked within ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitUsed();
  
  
  /**
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which the aggregate limit is associated. This property exists because CoverageLine may be null; when CoverageLine is not null, it must equal CoverageLine.PolicyPeriodID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getPolicyPeriod();
  
  
  public gw.pl.persistence.core.Key getPolicyPeriodID();
  
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateType getValueType();
  
  
  /**
   * Gets the value of the Valid field.
   * Indicates if the limit used is up-to-date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid();
  
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value);
  
  
  /**
   * Sets the value of the CoverageLine field.
   */
  public void setCoverageLine(entity.CoverageLine value);
  
  
  public void setCoverageLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value);
  
  
  /**
   * Sets the value of the LimitUsed field.
   */
  public void setLimitUsed(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PolicyPeriod field.
   */
  public void setPolicyPeriod(entity.PolicyPeriod value);
  
  
  public void setPolicyPeriodID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Valid field.
   */
  public void setValid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(typekey.AggregateType value);
  
  
  
}
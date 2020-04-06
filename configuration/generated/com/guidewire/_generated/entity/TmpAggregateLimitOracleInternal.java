package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpAggregateLimitOracle.eti;TmpAggregateLimitOracle.eix;TmpAggregateLimitOracle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpAggregateLimitOracleInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.aggregatelimit.entity.TmpAggregateLimitOracle {
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria();
  
  
  /**
   * Gets the value of the CoverageLineID field.
   * A foreign key to the CoverageLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCoverageLineID();
  
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType();
  
  
  /**
   * Gets the value of the PolicyPeriodID field.
   * A foreign key to the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getPolicyPeriodID();
  
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateType getValueType();
  
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value);
  
  
  /**
   * Sets the value of the CoverageLineID field.
   */
  public void setCoverageLineID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value);
  
  
  /**
   * Sets the value of the PolicyPeriodID field.
   */
  public void setPolicyPeriodID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(typekey.AggregateType value);
  
  
  
}
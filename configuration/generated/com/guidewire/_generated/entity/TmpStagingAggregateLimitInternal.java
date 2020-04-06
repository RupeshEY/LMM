package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStagingAggregateLimit.eti;TmpStagingAggregateLimit.eix;TmpStagingAggregateLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpStagingAggregateLimitInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.aggregatelimit.entity.TmpStagingAggregateLimit {
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAggLimitCalcCriteria();
  
  
  /**
   * Gets the value of the CoverageLineID field.
   * Publicid of the CoverageLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoverageLineID();
  
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type code.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLimitType();
  
  
  /**
   * Gets the value of the PolicyPeriodID field.
   * Publicid of the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyPeriodID();
  
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type code: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValueType();
  
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(java.lang.String value);
  
  
  /**
   * Sets the value of the CoverageLineID field.
   */
  public void setCoverageLineID(java.lang.String value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyPeriodID field.
   */
  public void setPolicyPeriodID(java.lang.String value);
  
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(java.lang.String value);
  
  
  
}
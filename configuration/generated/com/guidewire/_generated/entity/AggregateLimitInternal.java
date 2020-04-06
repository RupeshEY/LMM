package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AggregateLimit.eti;AggregateLimit.eix;AggregateLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AggregateLimitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal, gw.cc.aggregatelimit.entity.AggregateLimit {
  /**
   * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLines(entity.CoverageLineLimit element);
  
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Contribution critiera for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the CoverageLines field.
   * Coverage lines that reference this aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineLimit[] getCoverageLines();
  
  
  /**
   * Gets the value of the LimitAmount field.
   * The amount of the aggregate limit, in the Claim Currency of Claims in the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitAmount();
  
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type: none, by loss date, or by reported date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which the aggregate limit is associated.
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
   * Indicates if the AggregateLimitRpts related to this aggregatelimit are up-to-date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid();
  
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLines(entity.CoverageLineLimit element);
  
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the CoverageLines field.
   */
  public void setCoverageLines(entity.CoverageLineLimit[] value);
  
  
  /**
   * Sets the value of the LimitAmount field.
   */
  public void setLimitAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
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
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimMetricLimit.eti;ClaimMetricLimit.eix;ClaimMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimMetricLimitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.CopyOnWriteMetricLimitDelegateInternal, com.guidewire.cc.domain.claim.metric.impl.ClaimMetricLimitInternal, gw.api.metric.MetricLimit, gw.cc.claim.metric.entity.ClaimMetricLimit {
  /**
   * Gets the value of the ClaimMetricCategory field.
   * Category of this claim metric limit, corresponds to category of metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetricCategory getClaimMetricCategory();
  
  
  /**
   * Gets the value of the ClaimMetricType field.
   * Type of claim metric to which this limit applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetric getClaimMetricType();
  
  
  /**
   * Gets the value of the ClaimTier field.
   * Claim tier to which this limit applies, or null if this is a default limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimTier getClaimTier();
  
  
  /**
   * Gets the value of the Currency field.
   * Currency for this limit, for non money based limits this is always the default currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the MetricUnit field.
   * Units for this type of metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetricUnit getMetricUnit();
  
  
  /**
   * Gets the value of the PolicyTypeMetricLimits field.
   * Back pointer to policy type metric limits object that owns this limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyTypeMetricLimits getPolicyTypeMetricLimits();
  
  
  public gw.pl.persistence.core.Key getPolicyTypeMetricLimitsID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetricLimit getSubtype();
  
  
  /**
   * Gets the value of the AscendingLimitOrder field.
   * Boolean field to indicate the direction of comparison for value validation 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAscendingLimitOrder();
  
  
  /**
   * Sets the value of the AscendingLimitOrder field.
   */
  public void setAscendingLimitOrder(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClaimMetricCategory field.
   */
  public void setClaimMetricCategory(typekey.ClaimMetricCategory value);
  
  
  /**
   * Sets the value of the ClaimMetricType field.
   */
  public void setClaimMetricType(typekey.ClaimMetric value);
  
  
  /**
   * Sets the value of the ClaimTier field.
   */
  public void setClaimTier(typekey.ClaimTier value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the MetricUnit field.
   */
  public void setMetricUnit(typekey.MetricUnit value);
  
  
  /**
   * Sets the value of the PolicyTypeMetricLimits field.
   */
  public void setPolicyTypeMetricLimits(entity.PolicyTypeMetricLimits value);
  
  
  public void setPolicyTypeMetricLimitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimMetricLimit value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureMetricLimit.eti;ExposureMetricLimit.eix;ExposureMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureMetricLimitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.CopyOnWriteMetricLimitDelegateInternal, com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal, gw.api.metric.MetricLimit, gw.cc.exposure.metric.entity.ExposureMetricLimit {
  /**
   * Gets the value of the Currency field.
   * Currency for this limit, for non money based limits this is always the default currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the ExposureMetricType field.
   * Type of exposure metric to which this limit applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureMetric getExposureMetricType();
  
  
  /**
   * Gets the value of the ExposureTier field.
   * Exposure tier to which this limit applies, or null if this is a default limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureTier getExposureTier();
  
  
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
  public typekey.ExposureMetricLimit getSubtype();
  
  
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
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ExposureMetricType field.
   */
  public void setExposureMetricType(typekey.ExposureMetric value);
  
  
  /**
   * Sets the value of the ExposureTier field.
   */
  public void setExposureTier(typekey.ExposureTier value);
  
  
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
  public void setSubtype(typekey.ExposureMetricLimit value);
  
  
  
}
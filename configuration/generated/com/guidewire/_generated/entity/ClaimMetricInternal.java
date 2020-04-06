package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimMetric.eti;ClaimMetric.eix;ClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimMetricInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.MetricLimitTimeDelegateInternal, gw.cc.claim.metric.entity.ClaimMetric {
  /**
   * Gets the value of the Claim field.
   * Claim to which this metric is related.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimMetricCategory field.
   * Category of Claim Metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetricCategory getClaimMetricCategory();
  
  
  /**
   * Gets the value of the MetricLimitDenorm field.
   * The metric limit for the metric, denormalized from the claim's inital claim metric limits array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricLimit getMetricLimitDenorm();
  
  
  public gw.pl.persistence.core.Key getMetricLimitDenormID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetric getSubtype();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimMetricCategory field.
   */
  public void setClaimMetricCategory(typekey.ClaimMetricCategory value);
  
  
  /**
   * Sets the value of the MetricLimitDenorm field.
   */
  public void setMetricLimitDenorm(entity.ClaimMetricLimit value);
  
  
  public void setMetricLimitDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimMetric value);
  
  
  
}
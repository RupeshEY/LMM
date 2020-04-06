package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimIndicatorCriterion.eti;ClaimIndicatorCriterion.eix;ClaimIndicatorCriterion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimIndicatorCriterionInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.claim.entity.ClaimIndicatorCriterion {
  /**
   * Gets the value of the ClaimIndicatorType field.
   * Type of claim indicator this search will use to check if turned on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimIndicator getClaimIndicatorType();
  
  
  /**
   * Gets the value of the ClaimSearchCriteria field.
   * Claim Search Criteria ID for this Claim Indicator Criterion.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimSearchCriteria getClaimSearchCriteria();
  
  
  public gw.pl.persistence.core.Key getClaimSearchCriteriaID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimIndicatorCriterion getSubtype();
  
  
  /**
   * Sets the value of the ClaimIndicatorType field.
   */
  public void setClaimIndicatorType(typekey.ClaimIndicator value);
  
  
  /**
   * Sets the value of the ClaimSearchCriteria field.
   */
  public void setClaimSearchCriteria(entity.ClaimSearchCriteria value);
  
  
  public void setClaimSearchCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimIndicatorCriterion value);
  
  
  
}
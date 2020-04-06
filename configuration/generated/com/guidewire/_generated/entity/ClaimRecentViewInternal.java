package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimRecentView.eti;ClaimRecentView.eix;ClaimRecentView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimRecentViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.claim.entity.ClaimRecentView {
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the ClaimantDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimantDenorm();
  
  
  /**
   * Gets the value of the InsuredDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredDenorm();
  
  
  /**
   * Gets the value of the LossType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimRecentView getSubtype();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimantDenorm field.
   */
  public void setClaimantDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredDenorm field.
   */
  public void setInsuredDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimRecentView value);
  
  
  
}
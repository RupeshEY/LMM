package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureAbstractView.eti;ExposureAbstractView.eix;ExposureAbstractView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureAbstractViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.exposure.entity.ExposureAbstractView {
  /**
   * Gets the value of the ClaimClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimClaimantName();
  
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the ClaimOrder field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimOrder();
  
  
  /**
   * Gets the value of the ExposureClaimant field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getExposureClaimant();
  
  
  public gw.pl.persistence.core.Key getExposureClaimantID();
  
  
  /**
   * Gets the value of the ExposureClaimantName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureClaimantName();
  
  
  /**
   * Gets the value of the ExposureType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureType getExposureType();
  
  
  /**
   * Gets the value of the PrimaryCoverage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getPrimaryCoverage();
  
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureState getState();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureAbstractView getSubtype();
  
  
  /**
   * Gets the value of the TotalIncurredNet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNet();
  
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight();
  
  
  /**
   * Sets the value of the ClaimClaimantName field.
   */
  public void setClaimClaimantName(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimOrder field.
   */
  public void setClaimOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExposureClaimant field.
   */
  public void setExposureClaimant(entity.Contact value);
  
  
  public void setExposureClaimantID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureClaimantName field.
   */
  public void setExposureClaimantName(java.lang.String value);
  
  
  /**
   * Sets the value of the ExposureType field.
   */
  public void setExposureType(typekey.ExposureType value);
  
  
  /**
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ExposureState value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ExposureAbstractView value);
  
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value);
  
  
  
}
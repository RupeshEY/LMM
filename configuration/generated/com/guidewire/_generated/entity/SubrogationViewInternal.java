package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubrogationView.eti;SubrogationView.eix;SubrogationView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubrogationViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.subrogation.entity.SubrogationView {
  /**
   * Gets the value of the AssignedUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser();
  
  
  public gw.pl.persistence.core.Key getAssignedUserID();
  
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the Exposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the ExposureName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureName();
  
  
  /**
   * Gets the value of the Subrogation field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Subrogation getSubrogation();
  
  
  /**
   * Gets the value of the SubrogationClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getSubrogationClaim();
  
  
  public gw.pl.persistence.core.Key getSubrogationClaimID();
  
  
  public gw.pl.persistence.core.Key getSubrogationID();
  
  
  /**
   * Gets the value of the SubrogationReferralDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSubrogationReferralDate();
  
  
  /**
   * Gets the value of the SubrogationStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubrogationStatus getSubrogationStatus();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubrogationView getSubtype();
  
  
  /**
   * Gets the value of the TotalIncurredNetClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNetClaim();
  
  
  /**
   * Gets the value of the TotalIncurredNetExposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNetExposure();
  
  
  /**
   * Sets the value of the AssignedUser field.
   */
  public void setAssignedUser(entity.User value);
  
  
  public void setAssignedUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureName field.
   */
  public void setExposureName(java.lang.String value);
  
  
  /**
   * Sets the value of the Subrogation field.
   */
  public void setSubrogation(entity.Subrogation value);
  
  
  /**
   * Sets the value of the SubrogationClaim field.
   */
  public void setSubrogationClaim(entity.Claim value);
  
  
  public void setSubrogationClaimID(gw.pl.persistence.core.Key value);
  
  
  public void setSubrogationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SubrogationReferralDate field.
   */
  public void setSubrogationReferralDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SubrogationStatus field.
   */
  public void setSubrogationStatus(typekey.SubrogationStatus value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.SubrogationView value);
  
  
  /**
   * Sets the value of the TotalIncurredNetClaim field.
   */
  public void setTotalIncurredNetClaim(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalIncurredNetExposure field.
   */
  public void setTotalIncurredNetExposure(gw.api.financials.CurrencyAmount value);
  
  
  
}
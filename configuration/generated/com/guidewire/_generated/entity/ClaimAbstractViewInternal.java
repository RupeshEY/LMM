package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAbstractView.eti;ClaimAbstractView.eix;ClaimAbstractView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAbstractViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.cc.domain.claim.impl.ClaimAbstractViewInternal, gw.cc.claim.entity.ClaimAbstractView {
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency();
  
  
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
   * Gets the value of the Flagged field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FlaggedType getFlagged();
  
  
  /**
   * Gets the value of the Insured field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getInsured();
  
  
  /**
   * Gets the value of the InsuredDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredDenorm();
  
  
  public gw.pl.persistence.core.Key getInsuredID();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LOBCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getState();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimAbstractView getSubtype();
  
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value);
  
  
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
   * Sets the value of the Flagged field.
   */
  public void setFlagged(typekey.FlaggedType value);
  
  
  /**
   * Sets the value of the Insured field.
   */
  public void setInsured(entity.Contact value);
  
  
  /**
   * Sets the value of the InsuredDenorm field.
   */
  public void setInsuredDenorm(java.lang.String value);
  
  
  public void setInsuredID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ClaimState value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimAbstractView value);
  
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value);
  
  
  
}
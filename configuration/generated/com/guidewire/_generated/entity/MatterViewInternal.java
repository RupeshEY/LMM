package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MatterView.eti;MatterView.eix;MatterView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MatterViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.matter.entity.MatterView {
  /**
   * Gets the value of the AssignedQueueDisplayName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedQueueDisplayName();
  
  
  /**
   * Gets the value of the AssignedUserDisplayName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedUserDisplayName();
  
  
  /**
   * Gets the value of the AssignmentStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus();
  
  
  /**
   * Gets the value of the CaseNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCaseNumber();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the FinalSettleCost field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFinalSettleCost();
  
  
  /**
   * Gets the value of the Matter field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  /**
   * Gets the value of the MatterClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getMatterClaim();
  
  
  public gw.pl.persistence.core.Key getMatterClaimID();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterView getSubtype();
  
  
  /**
   * Gets the value of the TrialDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTrialDate();
  
  
  /**
   * Sets the value of the AssignedQueueDisplayName field.
   */
  public void setAssignedQueueDisplayName(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignedUserDisplayName field.
   */
  public void setAssignedUserDisplayName(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  public void setAssignmentStatus(typekey.AssignmentStatus value);
  
  
  /**
   * Sets the value of the CaseNumber field.
   */
  public void setCaseNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the FinalSettleCost field.
   */
  public void setFinalSettleCost(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  /**
   * Sets the value of the MatterClaim field.
   */
  public void setMatterClaim(entity.Claim value);
  
  
  public void setMatterClaimID(gw.pl.persistence.core.Key value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.MatterView value);
  
  
  /**
   * Sets the value of the TrialDate field.
   */
  public void setTrialDate(java.util.Date value);
  
  
  
}
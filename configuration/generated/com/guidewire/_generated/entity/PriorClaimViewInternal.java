package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PriorClaimView.eti;PriorClaimView.eix;PriorClaimView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PriorClaimViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.claim.entity.PriorClaimView {
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
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LossCause field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause();
  
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the LossType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the ReportedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate();
  
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getState();
  
  
  /**
   * Gets the value of the IncidentReport field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentReport();
  
  
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
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the IncidentReport field.
   */
  public void setIncidentReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ClaimState value);
  
  
  
}
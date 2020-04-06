package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSearchCriteria.eti;ClaimSearchCriteria.eix;ClaimSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimSearchCriteriaInternal extends com.guidewire._generated.entity.ClaimInfoCriteriaInternal, gw.cc.claim.archiving.entity.ClaimInfoCriteria, gw.cc.claim.entity.ClaimSearchCriteria, java.io.Serializable {
  /**
   * Adds the given element to the ClaimIndicatorCriterion array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element);
  
  
  /**
   * Gets the value of the ArchiveDateCriterionChoice field.
   * Match claim by specific date criteria for archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getArchiveDateCriterionChoice();
  
  
  public gw.pl.persistence.core.Key getArchiveDateCriterionChoiceID();
  
  
  /**
   * Gets the value of the AssignedToGroup field.
   * Match by claim group assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getAssignedToGroup();
  
  
  public gw.pl.persistence.core.Key getAssignedToGroupID();
  
  
  /**
   * Gets the value of the AssignedToUser field.
   * Match by claim user assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedToUser();
  
  
  public gw.pl.persistence.core.Key getAssignedToUserID();
  
  
  /**
   * Gets the value of the Catastrophe field.
   * Match by catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe();
  
  
  public gw.pl.persistence.core.Key getCatastropheID();
  
  
  /**
   * Gets the value of the ClaimIndicatorCriterion field.
   * Match claim by specific claim indicator criteria
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorCriterion[] getClaimIndicatorCriterion();
  
  
  /**
   * Gets the value of the ClaimState field.
   * Match by state of claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getClaimState();
  
  
  /**
   * Gets the value of the CreatedByUser field.
   * Match by claim creator.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser();
  
  
  public gw.pl.persistence.core.Key getCreatedByUserID();
  
  
  /**
   * Gets the value of the DateCriterionChoice field.
   * Match claim by specific date criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice();
  
  
  public gw.pl.persistence.core.Key getDateCriterionChoiceID();
  
  
  /**
   * Gets the value of the Fault field.
   * Insured's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault();
  
  
  /**
   * Gets the value of the FinancialCriterion field.
   * Match claim by specific financials criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialCriterionMC getFinancialCriterion();
  
  
  public gw.pl.persistence.core.Key getFinancialCriterionID();
  
  
  /**
   * Gets the value of the FlaggedType field.
   * Match by flagged status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FlaggedType getFlaggedType();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * Match by jurisdiction. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LOBCode field.
   * Match by line of business.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the LitigationStatus field.
   * Match by litigation status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LitigationStatus getLitigationStatus();
  
  
  /**
   * Gets the value of the LossType field.
   * Match by loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the licensePlate field.
   * Match by car license plate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getlicensePlate();
  
  
  /**
   * Gets the value of the vinNumber field.
   * Match by car VIN number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getvinNumber();
  
  
  /**
   * Gets the value of the CoverageInQuestion field.
   * Match by coverage in question status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageInQuestion();
  
  
  /**
   * Gets the value of the IncidentReport field.
   * Match by incident report.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentReport();
  
  
  /**
   * Gets the value of the ReinsuranceReportable field.
   * Match claims that are resinsurance reportable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReinsuranceReportable();
  
  
  /**
   * Gets the value of the pendingAssignment field.
   * Match claims that are pending assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean ispendingAssignment();
  
  
  /**
   * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element);
  
  
  /**
   * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimIndicatorCriterion(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ArchiveDateCriterionChoice field.
   */
  public void setArchiveDateCriterionChoice(entity.DateCriterionChoice value);
  
  
  public void setArchiveDateCriterionChoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedToGroup field.
   */
  public void setAssignedToGroup(entity.GroupSearchCriterion value);
  
  
  public void setAssignedToGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedToUser field.
   */
  public void setAssignedToUser(entity.User value);
  
  
  public void setAssignedToUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value);
  
  
  public void setCatastropheID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimIndicatorCriterion field.
   */
  public void setClaimIndicatorCriterion(entity.ClaimIndicatorCriterion[] value);
  
  
  /**
   * Sets the value of the ClaimState field.
   */
  public void setClaimState(typekey.ClaimState value);
  
  
  /**
   * Sets the value of the CoverageInQuestion field.
   */
  public void setCoverageInQuestion(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value);
  
  
  public void setCreatedByUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value);
  
  
  public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FinancialCriterion field.
   */
  public void setFinancialCriterion(entity.FinancialCriterionMC value);
  
  
  public void setFinancialCriterionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FlaggedType field.
   */
  public void setFlaggedType(typekey.FlaggedType value);
  
  
  /**
   * Sets the value of the IncidentReport field.
   */
  public void setIncidentReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the LitigationStatus field.
   */
  public void setLitigationStatus(typekey.LitigationStatus value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the ReinsuranceReportable field.
   */
  public void setReinsuranceReportable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the licensePlate field.
   */
  public void setlicensePlate(java.lang.String value);
  
  
  /**
   * Sets the value of the pendingAssignment field.
   */
  public void setpendingAssignment(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the vinNumber field.
   */
  public void setvinNumber(java.lang.String value);
  
  
  
}
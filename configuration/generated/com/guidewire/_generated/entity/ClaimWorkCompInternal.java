package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimWorkComp.eti;ClaimWorkComp.eix;ClaimWorkComp.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimWorkCompInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ClaimWorkComp {
  /**
   * Adds the given element to the ClaimArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimArray(entity.Claim element);
  
  
  /**
   * Adds the given element to the FullDenialReasons array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFullDenialReasons(entity.FullDenialReason element);
  
  
  /**
   * Adds the given element to the WaitingPeriodDetails array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWaitingPeriodDetails(entity.WCWaitingPeriod element);
  
  
  /**
   * Gets the value of the AccidentPremises field.
   * A code to indicate the premises where the accident occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AccidentPremises getAccidentPremises();
  
  
  /**
   * Gets the value of the ActivityPerformed field.
   * Field to describe the specific activity the injured worker was performing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getActivityPerformed();
  
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim[] getClaimArray();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Compensable field.
   * Indicates status of the compensability decision
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CompensabilityDecision getCompensable();
  
  
  /**
   * Gets the value of the DateOfEmployeeRepresentation field.
   * Date Claim Administrator Notified of Employee Representation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfEmployeeRepresentation();
  
  
  /**
   * Gets the value of the DiscontinuedFringeBenefits field.
   * The amount of non-salary remuneration which the employer has discontinued as applicable to the calculation of benefits per the jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDiscontinuedFringeBenefits();
  
  
  /**
   * Gets the value of the EquipmentUsed field.
   * Field to describe the equipment, materials or chemicals the employee was using when event or exposure occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEquipmentUsed();
  
  
  /**
   * Gets the value of the FullDenialEffectiveDate field.
   * The date the compensability Decision (for entire claim) was set to Denied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFullDenialEffectiveDate();
  
  
  /**
   * Gets the value of the FullDenialReasons field.
   * Compensability full denial reasons when the claim compensibility was set to denied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FullDenialReason[] getFullDenialReasons();
  
  
  /**
   * Gets the value of the InitialTreatment field.
   * Initial Treatment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InitialTreatment getInitialTreatment();
  
  
  /**
   * Gets the value of the InsuredReportNumber field.
   * A number assigned by the insured to identify a specific claim. If this data is included on any FROI/SROI transaction, it should be returned on the transaction’s acknowledgment regardless of whether it is a data element collected by the jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredReportNumber();
  
  
  /**
   * Gets the value of the JurisdictionClaimNumber field.
   * Jurisdiction Claim Number will be filled once received by the Jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getJurisdictionClaimNumber();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PartialDenialReason field.
   * Indicates reason for partial denial
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PartialDenialReason getPartialDenialReason();
  
  
  /**
   * Gets the value of the WaitingPeriodDetails field.
   * Used to track the specific days indicated as the Waiting Period on a WC Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCWaitingPeriod[] getWaitingPeriodDetails();
  
  
  /**
   * Gets the value of the ClassCodeByLocation field.
   * Is Class Code filtered by Location
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClassCodeByLocation();
  
  
  /**
   * Gets the value of the DeathReport field.
   * True if this claim has a report of death of the injured worker.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDeathReport();
  
  
  /**
   * Gets the value of the EmployerLiability field.
   * True if this claim has a possible Employer's Liability aspect.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEmployerLiability();
  
  
  /**
   * Gets the value of the IllnessRelatedToExposure field.
   * Is claim being made for illness related to chemical or material exposure?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIllnessRelatedToExposure();
  
  
  /**
   * Gets the value of the MedRecReleaseAuth field.
   * An indicator that the employee's written authorization to release medical records related to the injury is on file.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMedRecReleaseAuth();
  
  
  /**
   * Gets the value of the MedicalReport field.
   * True if this is claim has a report that the injured worker requires Medical treatment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMedicalReport();
  
  
  /**
   * Gets the value of the TimeLossReport field.
   * True if this is claim has a report that the injured worker will lose time from work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTimeLossReport();
  
  
  /**
   * Gets the value of the WaitingPeriodApplied field.
   * Should the Waiting Period be applied?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaitingPeriodApplied();
  
  
  /**
   * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimArray(entity.Claim element);
  
  
  /**
   * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
   */
  public void removeFromFullDenialReasons(entity.FullDenialReason element);
  
  
  /**
   * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFullDenialReasons(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
   */
  public void removeFromWaitingPeriodDetails(entity.WCWaitingPeriod element);
  
  
  /**
   * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWaitingPeriodDetails(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AccidentPremises field.
   */
  public void setAccidentPremises(typekey.AccidentPremises value);
  
  
  /**
   * Sets the value of the ActivityPerformed field.
   */
  public void setActivityPerformed(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimArray field.
   */
  public void setClaimArray(entity.Claim[] value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClassCodeByLocation field.
   */
  public void setClassCodeByLocation(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Compensable field.
   */
  public void setCompensable(typekey.CompensabilityDecision value);
  
  
  /**
   * Sets the value of the DateOfEmployeeRepresentation field.
   */
  public void setDateOfEmployeeRepresentation(java.util.Date value);
  
  
  /**
   * Sets the value of the DeathReport field.
   */
  public void setDeathReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DiscontinuedFringeBenefits field.
   */
  public void setDiscontinuedFringeBenefits(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the EmployerLiability field.
   */
  public void setEmployerLiability(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the EquipmentUsed field.
   */
  public void setEquipmentUsed(java.lang.String value);
  
  
  /**
   * Sets the value of the FullDenialEffectiveDate field.
   */
  public void setFullDenialEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FullDenialReasons field.
   */
  public void setFullDenialReasons(entity.FullDenialReason[] value);
  
  
  /**
   * Sets the value of the IllnessRelatedToExposure field.
   */
  public void setIllnessRelatedToExposure(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InitialTreatment field.
   */
  public void setInitialTreatment(typekey.InitialTreatment value);
  
  
  /**
   * Sets the value of the InsuredReportNumber field.
   */
  public void setInsuredReportNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the JurisdictionClaimNumber field.
   */
  public void setJurisdictionClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MedRecReleaseAuth field.
   */
  public void setMedRecReleaseAuth(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MedicalReport field.
   */
  public void setMedicalReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PartialDenialReason field.
   */
  public void setPartialDenialReason(typekey.PartialDenialReason value);
  
  
  /**
   * Sets the value of the TimeLossReport field.
   */
  public void setTimeLossReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WaitingPeriodApplied field.
   */
  public void setWaitingPeriodApplied(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WaitingPeriodDetails field.
   */
  public void setWaitingPeriodDetails(entity.WCWaitingPeriod[] value);
  
  
  
}
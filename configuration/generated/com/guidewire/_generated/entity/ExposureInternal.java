package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Exposure.eti;Exposure.eix;Exposure.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.CCAssignableInternal, com.guidewire._generated.entity.WorkloadDelegateInternal, com.guidewire._generated.entity.ISOReportableInternal, com.guidewire._generated.entity.UserRoleOwnerInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.email.CCEmailSupport, com.guidewire.cc.domain.exposure.impl.ExposureInternal, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, com.guidewire.pl.system.entity.LevelAwareValidatableBean, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.api.assignment.CCAssignableMethods, gw.api.assignment.UserRoleOwner, gw.api.financials.CheckCreatorProvider, gw.cc.assignment.entity.CCAssignable, gw.cc.exposure.entity.Exposure, gw.cc.iso.entity.ISOReportable {
  java.lang.String EXPOSUREADDED_EVENT = "ExposureAdded";
  
  java.lang.String EXPOSURECHANGED_EVENT = "ExposureChanged";
  
  java.lang.String EXPOSUREREMOVED_EVENT = "ExposureRemoved";
  
  java.lang.String EXPOSUREVALID_EVENT = "ExposureValid";
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the BenefitPeriods array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBenefitPeriods(entity.BenefitPeriod element);
  
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.Document element);
  
  
  /**
   * Adds the given element to the ExposureISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureISOMatchReports(entity.ExposureISOMatchReport element);
  
  
  /**
   * Adds the given element to the ExposureMetrics array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureMetrics(entity.ExposureMetric element);
  
  
  /**
   * Adds the given element to the ExposureRptArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureRptArray(entity.ExposureRpt element);
  
  
  /**
   * Adds the given element to the ExposureSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureSynchStates(entity.ExposureSynchState element);
  
  
  /**
   * Adds the given element to the IMEPerformed array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIMEPerformed(entity.IMEPerformed element);
  
  
  /**
   * Adds the given element to the MedicalActions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalActions(entity.MedicalAction element);
  
  
  /**
   * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNotes(entity.Note element);
  
  
  /**
   * Adds the given element to the OtherCoverageDet array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherCoverageDet(entity.OtherCoverageDetail element);
  
  
  /**
   * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserveLines(entity.ReserveLine element);
  
  
  /**
   * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoleAssignments(entity.UserRoleAssignment element);
  
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element);
  
  
  /**
   * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequests(entity.ServiceRequest element);
  
  
  /**
   * Adds the given element to the Settlements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSettlements(entity.Settlement element);
  
  
  /**
   * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText(entity.ExposureText element);
  
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  public void addToTransactions(entity.Transaction element);
  
  
  /**
   * Gets the value of the Activities field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the AverageWeeklyWages field.
   * Average weekly wages; this calculation differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAverageWeeklyWages();
  
  
  /**
   * Gets the value of the BenefitPeriods field.
   * Periods of time when employee received benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BenefitPeriod[] getBenefitPeriods();
  
  
  /**
   * Gets the value of the Claim field.
   * The Claim for this Exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimOrder field.
   * Order of the exposure on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimOrder();
  
  
  /**
   * Gets the value of the ClaimantDenorm field.
   * The claimant for the exposure, denormalized from the claim's contact array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimantDenorm();
  
  
  public gw.pl.persistence.core.Key getClaimantDenormID();
  
  
  /**
   * Gets the value of the ClaimantType field.
   * Categorizes the claimant relative to policyholder.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimantType getClaimantType();
  
  
  /**
   * Gets the value of the ClosedOutcome field.
   * Outcome reached when closing the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureClosedOutcomeType getClosedOutcome();
  
  
  /**
   * Gets the value of the CompBenefits field.
   * Compensation benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getCompBenefits();
  
  
  public gw.pl.persistence.core.Key getCompBenefitsID();
  
  
  /**
   * Gets the value of the Coverage field.
   * The specific coverage for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Coverage getCoverage();
  
  
  public gw.pl.persistence.core.Key getCoverageID();
  
  
  /**
   * Gets the value of the CoverageSubType field.
   * The coverage subtype.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getCoverageSubType();
  
  
  /**
   * Gets the value of the DaysInWeek field.
   * Days in week used for benefit calculation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DaysInWeekType getDaysInWeek();
  
  
  /**
   * Gets the value of the DeathBenefits field.
   * Death benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getDeathBenefits();
  
  
  public gw.pl.persistence.core.Key getDeathBenefitsID();
  
  
  /**
   * Gets the value of the DepreciatedValue field.
   * Depreciated value of property or vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDepreciatedValue();
  
  
  /**
   * Gets the value of the DisBenefits field.
   * Disability benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getDisBenefits();
  
  
  public gw.pl.persistence.core.Key getDisBenefitsID();
  
  
  /**
   * Gets the value of the Documents field.
   * The documents associated with this exposure; for example, FNOL accord form or police report.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document[] getDocuments();
  
  
  /**
   * Gets the value of the ECFExposureId_Ext field.
   * Exposure Id is used to identify exposures in an ECF WB Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getECFExposureId_Ext();
  
  
  /**
   * Gets the value of the ExaminationDate field.
   * Date of the Examination.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExaminationDate();
  
  
  /**
   * Gets the value of the ExposureISOMatchReports field.
   * ISO match reports for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureISOMatchReport[] getExposureISOMatchReports();
  
  
  /**
   * Gets the value of the ExposureMetrics field.
   * Metrics related to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureMetric[] getExposureMetrics();
  
  
  /**
   * Array association for partition ExposureMetricsBySubtype on array ExposureMetrics
   */
  public entity.ExposureMetric getExposureMetricsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ExposureRpt field.
   * The calculated financials data for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureRpt getExposureRpt();
  
  
  /**
   * Gets the value of the ExposureRptArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureRpt[] getExposureRptArray();
  
  
  public gw.pl.persistence.core.Key getExposureRptID();
  
  
  /**
   * Gets the value of the ExposureSynchStates field.
   * Sync states related to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureSynchState[] getExposureSynchStates();
  
  
  /**
   * Gets the value of the ExposureTier field.
   * The tier of this exposure, used to decide how to rate the exposure metrics.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureTier getExposureTier();
  
  
  /**
   * Gets the value of the ExposureType field.
   * Types of exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureType getExposureType();
  
  
  /**
   * Gets the value of the HospitalDate field.
   * Date admitted to the hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHospitalDate();
  
  
  /**
   * Gets the value of the HospitalDays field.
   * Estimated days in hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHospitalDays();
  
  
  /**
   * Gets the value of the IMEPerformed field.
   * Independent medical examinations performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.IMEPerformed[] getIMEPerformed();
  
  
  /**
   * Gets the value of the Incident field.
   * Incident that caused this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * State of jurisdiction, if different than location of loss. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LastDayWorked field.
   * Last day worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastDayWorked();
  
  
  /**
   * Gets the value of the LifePensionBenefits field.
   * Life Pension benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getLifePensionBenefits();
  
  
  public gw.pl.persistence.core.Key getLifePensionBenefitsID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossCategory field.
   * Detailed category of the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCategory getLossCategory();
  
  
  /**
   * Gets the value of the LossParty field.
   * The loss party; generally either first- or third-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossPartyType getLossParty();
  
  
  /**
   * Gets the value of the LostPropertyType field.
   * ISO category of lost property, for theft losses.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LostPropertyType getLostPropertyType();
  
  
  /**
   * Gets the value of the MedicalActions field.
   * Key medical-related dates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalAction[] getMedicalActions();
  
  
  /**
   * Gets the value of the MetricLimitGeneration field.
   * Generation number, used to identify the limits for this exposure's metrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMetricLimitGeneration();
  
  
  /**
   * Gets the value of the NewEmpData field.
   * Information about a new job that the claimant has taken.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getNewEmpData();
  
  
  public gw.pl.persistence.core.Key getNewEmpDataID();
  
  
  /**
   * Gets the value of the Notes field.
   * Notes particular to this exposure. Notes can also be associated with the claim in general.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Note[] getNotes();
  
  
  /**
   * Gets the value of the OCR_Ext field.
   * The OCR is the Originating Claim Office Reference which can be found on messages such as SCMs
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOCR_Ext();
  
  
  /**
   * Gets the value of the OtherCoverageDet field.
   * Details of other coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherCoverageDetail[] getOtherCoverageDet();
  
  
  /**
   * Gets the value of the OtherCoverageInfo field.
   * Information regarding additional coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOtherCoverageInfo();
  
  
  /**
   * Gets the value of the OtherCovgChoice field.
   * Whether there is other coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getOtherCovgChoice();
  
  
  /**
   * Gets the value of the PIPDeathBenefits field.
   * Death benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPIPDeathBenefits();
  
  
  public gw.pl.persistence.core.Key getPIPDeathBenefitsID();
  
  
  /**
   * Gets the value of the PIPVocBenefits field.
   * Vocational rehab benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPIPVocBenefits();
  
  
  public gw.pl.persistence.core.Key getPIPVocBenefitsID();
  
  
  /**
   * Gets the value of the PPDBenefits field.
   * PPD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPPDBenefits();
  
  
  public gw.pl.persistence.core.Key getPPDBenefitsID();
  
  
  /**
   * Gets the value of the PTDBenefits field.
   * PTD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPTDBenefits();
  
  
  public gw.pl.persistence.core.Key getPTDBenefitsID();
  
  
  /**
   * Gets the value of the PrimaryCoverage field.
   * Coverage Type of the coverage on this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getPrimaryCoverage();
  
  
  /**
   * Gets the value of the PriorEmpData field.
   * Information about the job the claimant had at the time of injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getPriorEmpData();
  
  
  public gw.pl.persistence.core.Key getPriorEmpDataID();
  
  
  /**
   * Gets the value of the Progress field.
   * Description of the progress of an open exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureProgressType getProgress();
  
  
  /**
   * Gets the value of the RIAgreementGroup field.
   * Reinsurance group associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreementGroup getRIAgreementGroup();
  
  
  public gw.pl.persistence.core.Key getRIAgreementGroupID();
  
  
  /**
   * Gets the value of the RSBenefits field.
   * Replacement services benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getRSBenefits();
  
  
  public gw.pl.persistence.core.Key getRSBenefitsID();
  
  
  /**
   * Gets the value of the ReOpenDate field.
   * The last time an exposure was reopened. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReOpenDate();
  
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureReopenedReason getReopenedReason();
  
  
  /**
   * Gets the value of the ReplacementValue field.
   * Replacement value of the property or vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReplacementValue();
  
  
  /**
   * Gets the value of the ReserveLines field.
   * ReserveLines relating to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine[] getReserveLines();
  
  
  /**
   * Gets the value of the RoleAssignments field.
   * The user role assignments for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRoleAssignment[] getRoleAssignments();
  
  
  /**
   * Gets the value of the Roles field.
   * The contacts and their roles associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles();
  
  
  /**
   * Gets the value of the SSDIBenefits field.
   * Social security disability benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getSSDIBenefits();
  
  
  public gw.pl.persistence.core.Key getSSDIBenefitsID();
  
  
  /**
   * Gets the value of the SecurityLevel field.
   * The security level of this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureSecurityType getSecurityLevel();
  
  
  /**
   * Gets the value of the Segment field.
   * Segmentation type of the exposure. Both the claim and exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSegment getSegment();
  
  
  /**
   * Gets the value of the ServiceRequests field.
   * Service requests associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest[] getServiceRequests();
  
  
  /**
   * Gets the value of the SettleDate field.
   * Date of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSettleDate();
  
  
  /**
   * Gets the value of the SettleMethod field.
   * Method of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SettleMethod getSettleMethod();
  
  
  /**
   * Gets the value of the Settlements field.
   * Settlements with the employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Settlement[] getSettlements();
  
  
  /**
   * Gets the value of the StatLine field.
   * Statistical line associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.StatCode getStatLine();
  
  
  public gw.pl.persistence.core.Key getStatLineID();
  
  
  /**
   * Gets the value of the State field.
   * Internal state of the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureState getState();
  
  
  /**
   * Gets the value of the Strategy field.
   * Strategy type of the exposure. Both the claim and exposure may define a strategy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimStrategy getStrategy();
  
  
  /**
   * Gets the value of the TPDBenefits field.
   * TPD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getTPDBenefits();
  
  
  public gw.pl.persistence.core.Key getTPDBenefitsID();
  
  
  /**
   * Gets the value of the TTDBenefits field.
   * TTD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getTTDBenefits();
  
  
  public gw.pl.persistence.core.Key getTTDBenefitsID();
  
  
  /**
   * Gets the value of the TempLocation field.
   * Temporary location of policy holder. This is for a homeowners claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getTempLocation();
  
  
  public gw.pl.persistence.core.Key getTempLocationID();
  
  
  /**
   * Gets the value of the Text field.
   * Large text fields associated with exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureText[] getText();
  
  
  /**
   * Gets the value of the Transactions field.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level the exposure has passed (if any).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the VocBenefits field.
   * Vocational benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getVocBenefits();
  
  
  public gw.pl.persistence.core.Key getVocBenefitsID();
  
  
  /**
   * Gets the value of the WCBenefits field.
   * Workers' comp benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getWCBenefits();
  
  
  public gw.pl.persistence.core.Key getWCBenefitsID();
  
  
  /**
   * Gets the value of the WCPreexDisbltyInfo field.
   * Information about the pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCPreexDisbltyInfo();
  
  
  /**
   * Gets the value of the WageStmtRecd field.
   * Wage Statement received date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWageStmtRecd();
  
  
  /**
   * Gets the value of the WageStmtSent field.
   * Wage Statement sent date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWageStmtSent();
  
  
  /**
   * Gets the value of the BreakIn field.
   * Whether there is evidence of a break-in.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBreakIn();
  
  
  /**
   * Gets the value of the ContactPermitted field.
   * Whether contact is permitted with the claimant.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isContactPermitted();
  
  
  /**
   * Gets the value of the CurrentConditions field.
   * Current conditions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCurrentConditions();
  
  
  /**
   * Gets the value of the DiagnosticCnsistnt field.
   * Whether the diagnostic is consistent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiagnosticCnsistnt();
  
  
  /**
   * Gets the value of the ExposureLimitReached field.
   * Whether the exposure's exposure limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExposureLimitReached();
  
  
  /**
   * Gets the value of the FurtherTreatment field.
   * Whether further treatment is required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFurtherTreatment();
  
  
  /**
   * Gets the value of the IncidentLimitReached field.
   * Whether the exposure's incident limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentLimitReached();
  
  
  /**
   * Gets the value of the Locked field.
   * Whether the property or vehicle was properly locked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocked();
  
  
  /**
   * Gets the value of the OtherCoverage field.
   * True if the claimant has additional coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOtherCoverage();
  
  
  /**
   * Gets the value of the PIPClaimAggLimitReached field.
   * Whether the exposure's PIP Claim Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPClaimAggLimitReached();
  
  
  /**
   * Gets the value of the PIPESSLimitReached field.
   * Whether the exposure's PIP Replacement Services Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPESSLimitReached();
  
  
  /**
   * Gets the value of the PIPNonMedAggLimitReached field.
   * Whether the exposure's PIP Non Medical Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPNonMedAggLimitReached();
  
  
  /**
   * Gets the value of the PIPPersonAggLimitReached field.
   * Whether the exposure's PIP Per Person Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPPersonAggLimitReached();
  
  
  /**
   * Gets the value of the RIGroupSetExternally field.
   * Whether the reinsurance association was determined by an external system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRIGroupSetExternally();
  
  
  /**
   * Gets the value of the SSBenefit field.
   * Whether Social Security benefits are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSBenefit();
  
  
  /**
   * Gets the value of the SSDIEligible field.
   * Whether the exposure is eligible for SSDI.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSDIEligible();
  
  
  /**
   * Gets the value of the TreatedPatientBfr field.
   * Whether the the patient has been treated before.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTreatedPatientBfr();
  
  
  /**
   * Gets the value of the WCBenefit field.
   * Whether Workers Compensation benefits are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWCBenefit();
  
  
  /**
   * Gets the value of the WCPreexDisblty field.
   * Whether the injured person had a pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWCPreexDisblty();
  
  
  /**
   * Gets the value of the WageBenefit field.
   * Whether wage benefites are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWageBenefit();
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element);
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
   */
  public void removeFromBenefitPeriods(entity.BenefitPeriod element);
  
  
  /**
   * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBenefitPeriods(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   */
  public void removeFromDocuments(entity.Document element);
  
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocuments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureISOMatchReports(entity.ExposureISOMatchReport element);
  
  
  /**
   * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureISOMatchReports(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureMetrics(entity.ExposureMetric element);
  
  
  /**
   * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureMetrics(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ExposureRptArray array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureRptArray(entity.ExposureRpt element);
  
  
  /**
   * Removes the given element from the ExposureRptArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureRptArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureSynchStates(entity.ExposureSynchState element);
  
  
  /**
   * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureSynchStates(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
   */
  public void removeFromIMEPerformed(entity.IMEPerformed element);
  
  
  /**
   * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIMEPerformed(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalActions(entity.MedicalAction element);
  
  
  /**
   * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalActions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   */
  public void removeFromNotes(entity.Note element);
  
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNotes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherCoverageDet(entity.OtherCoverageDetail element);
  
  
  /**
   * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherCoverageDet(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
   */
  public void removeFromReserveLines(entity.ReserveLine element);
  
  
  /**
   * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReserveLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
   */
  public void removeFromRoleAssignments(entity.UserRoleAssignment element);
  
  
  /**
   * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoleAssignments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequests(entity.ServiceRequest element);
  
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
   */
  public void removeFromSettlements(entity.Settlement element);
  
  
  /**
   * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSettlements(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   */
  public void removeFromText(entity.ExposureText element);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(entity.Transaction element);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the AverageWeeklyWages field.
   */
  public void setAverageWeeklyWages(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the BenefitPeriods field.
   */
  public void setBenefitPeriods(entity.BenefitPeriod[] value);
  
  
  /**
   * Sets the value of the BreakIn field.
   */
  public void setBreakIn(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimOrder field.
   */
  public void setClaimOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimantDenorm field.
   */
  public void setClaimantDenorm(entity.Contact value);
  
  
  public void setClaimantDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantType field.
   */
  public void setClaimantType(typekey.ClaimantType value);
  
  
  /**
   * Sets the value of the ClosedOutcome field.
   */
  public void setClosedOutcome(typekey.ExposureClosedOutcomeType value);
  
  
  /**
   * Sets the value of the CompBenefits field.
   */
  public void setCompBenefits(entity.Benefits value);
  
  
  public void setCompBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContactPermitted field.
   */
  public void setContactPermitted(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Coverage field.
   */
  public void setCoverage(entity.Coverage value);
  
  
  public void setCoverageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CoverageSubType field.
   */
  public void setCoverageSubType(typekey.CoverageSubtype value);
  
  
  /**
   * Sets the value of the CurrentConditions field.
   */
  public void setCurrentConditions(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DaysInWeek field.
   */
  public void setDaysInWeek(typekey.DaysInWeekType value);
  
  
  /**
   * Sets the value of the DeathBenefits field.
   */
  public void setDeathBenefits(entity.Benefits value);
  
  
  public void setDeathBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DepreciatedValue field.
   */
  public void setDepreciatedValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the DiagnosticCnsistnt field.
   */
  public void setDiagnosticCnsistnt(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DisBenefits field.
   */
  public void setDisBenefits(entity.Benefits value);
  
  
  public void setDisBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.Document[] value);
  
  
  /**
   * Sets the value of the ECFExposureId_Ext field.
   */
  public void setECFExposureId_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the ExaminationDate field.
   */
  public void setExaminationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExposureISOMatchReports field.
   */
  public void setExposureISOMatchReports(entity.ExposureISOMatchReport[] value);
  
  
  /**
   * Sets the value of the ExposureLimitReached field.
   */
  public void setExposureLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ExposureMetrics field.
   */
  public void setExposureMetrics(entity.ExposureMetric[] value);
  
  
  /**
   * Sets the value of the ExposureRpt field.
   */
  public void setExposureRpt(entity.ExposureRpt value);
  
  
  /**
   * Sets the value of the ExposureRptArray field.
   */
  public void setExposureRptArray(entity.ExposureRpt[] value);
  
  
  public void setExposureRptID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureSynchStates field.
   */
  public void setExposureSynchStates(entity.ExposureSynchState[] value);
  
  
  /**
   * Sets the value of the ExposureTier field.
   */
  public void setExposureTier(typekey.ExposureTier value);
  
  
  /**
   * Sets the value of the ExposureType field.
   */
  public void setExposureType(typekey.ExposureType value);
  
  
  /**
   * Sets the value of the FurtherTreatment field.
   */
  public void setFurtherTreatment(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HospitalDate field.
   */
  public void setHospitalDate(java.util.Date value);
  
  
  /**
   * Sets the value of the HospitalDays field.
   */
  public void setHospitalDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the IMEPerformed field.
   */
  public void setIMEPerformed(entity.IMEPerformed[] value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IncidentLimitReached field.
   */
  public void setIncidentLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LastDayWorked field.
   */
  public void setLastDayWorked(java.util.Date value);
  
  
  /**
   * Sets the value of the LifePensionBenefits field.
   */
  public void setLifePensionBenefits(entity.Benefits value);
  
  
  public void setLifePensionBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Locked field.
   */
  public void setLocked(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LossCategory field.
   */
  public void setLossCategory(typekey.LossCategory value);
  
  
  /**
   * Sets the value of the LossParty field.
   */
  public void setLossParty(typekey.LossPartyType value);
  
  
  /**
   * Sets the value of the LostPropertyType field.
   */
  public void setLostPropertyType(typekey.LostPropertyType value);
  
  
  /**
   * Sets the value of the MedicalActions field.
   */
  public void setMedicalActions(entity.MedicalAction[] value);
  
  
  /**
   * Sets the value of the MetricLimitGeneration field.
   */
  public void setMetricLimitGeneration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NewEmpData field.
   */
  public void setNewEmpData(entity.EmploymentData value);
  
  
  public void setNewEmpDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(entity.Note[] value);
  
  
  /**
   * Sets the value of the OCR_Ext field.
   */
  public void setOCR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the OtherCoverage field.
   */
  public void setOtherCoverage(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the OtherCoverageDet field.
   */
  public void setOtherCoverageDet(entity.OtherCoverageDetail[] value);
  
  
  /**
   * Sets the value of the OtherCoverageInfo field.
   */
  public void setOtherCoverageInfo(java.lang.String value);
  
  
  /**
   * Sets the value of the OtherCovgChoice field.
   */
  public void setOtherCovgChoice(typekey.YesNo value);
  
  
  /**
   * Sets the value of the PIPClaimAggLimitReached field.
   */
  public void setPIPClaimAggLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PIPDeathBenefits field.
   */
  public void setPIPDeathBenefits(entity.Benefits value);
  
  
  public void setPIPDeathBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PIPESSLimitReached field.
   */
  public void setPIPESSLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PIPNonMedAggLimitReached field.
   */
  public void setPIPNonMedAggLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PIPPersonAggLimitReached field.
   */
  public void setPIPPersonAggLimitReached(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PIPVocBenefits field.
   */
  public void setPIPVocBenefits(entity.Benefits value);
  
  
  public void setPIPVocBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PPDBenefits field.
   */
  public void setPPDBenefits(entity.Benefits value);
  
  
  public void setPPDBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PTDBenefits field.
   */
  public void setPTDBenefits(entity.Benefits value);
  
  
  public void setPTDBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the PriorEmpData field.
   */
  public void setPriorEmpData(entity.EmploymentData value);
  
  
  public void setPriorEmpDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Progress field.
   */
  public void setProgress(typekey.ExposureProgressType value);
  
  
  /**
   * Sets the value of the RIAgreementGroup field.
   */
  public void setRIAgreementGroup(entity.RIAgreementGroup value);
  
  
  public void setRIAgreementGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RIGroupSetExternally field.
   */
  public void setRIGroupSetExternally(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RSBenefits field.
   */
  public void setRSBenefits(entity.Benefits value);
  
  
  public void setRSBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReOpenDate field.
   */
  public void setReOpenDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.ExposureReopenedReason value);
  
  
  /**
   * Sets the value of the ReplacementValue field.
   */
  public void setReplacementValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReserveLines field.
   */
  public void setReserveLines(entity.ReserveLine[] value);
  
  
  /**
   * Sets the value of the RoleAssignments field.
   */
  public void setRoleAssignments(entity.UserRoleAssignment[] value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value);
  
  
  /**
   * Sets the value of the SSBenefit field.
   */
  public void setSSBenefit(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SSDIBenefits field.
   */
  public void setSSDIBenefits(entity.Benefits value);
  
  
  public void setSSDIBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SSDIEligible field.
   */
  public void setSSDIEligible(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SecurityLevel field.
   */
  public void setSecurityLevel(typekey.ExposureSecurityType value);
  
  
  /**
   * Sets the value of the Segment field.
   */
  public void setSegment(typekey.ClaimSegment value);
  
  
  /**
   * Sets the value of the ServiceRequests field.
   */
  public void setServiceRequests(entity.ServiceRequest[] value);
  
  
  /**
   * Sets the value of the SettleDate field.
   */
  public void setSettleDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SettleMethod field.
   */
  public void setSettleMethod(typekey.SettleMethod value);
  
  
  /**
   * Sets the value of the Settlements field.
   */
  public void setSettlements(entity.Settlement[] value);
  
  
  /**
   * Sets the value of the StatLine field.
   */
  public void setStatLine(entity.StatCode value);
  
  
  public void setStatLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ExposureState value);
  
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.ClaimStrategy value);
  
  
  /**
   * Sets the value of the TPDBenefits field.
   */
  public void setTPDBenefits(entity.Benefits value);
  
  
  public void setTPDBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TTDBenefits field.
   */
  public void setTTDBenefits(entity.Benefits value);
  
  
  public void setTTDBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TempLocation field.
   */
  public void setTempLocation(entity.Address value);
  
  
  public void setTempLocationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(entity.ExposureText[] value);
  
  
  /**
   * Sets the value of the Transactions field.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  public void setTransactions(entity.Transaction[] value);
  
  
  /**
   * Sets the value of the TreatedPatientBfr field.
   */
  public void setTreatedPatientBfr(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the VocBenefits field.
   */
  public void setVocBenefits(entity.Benefits value);
  
  
  public void setVocBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the WCBenefit field.
   */
  public void setWCBenefit(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WCBenefits field.
   */
  public void setWCBenefits(entity.Benefits value);
  
  
  public void setWCBenefitsID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the WCPreexDisblty field.
   */
  public void setWCPreexDisblty(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WCPreexDisbltyInfo field.
   */
  public void setWCPreexDisbltyInfo(java.lang.String value);
  
  
  /**
   * Sets the value of the WageBenefit field.
   */
  public void setWageBenefit(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WageStmtRecd field.
   */
  public void setWageStmtRecd(java.util.Date value);
  
  
  /**
   * Sets the value of the WageStmtSent field.
   */
  public void setWageStmtSent(java.util.Date value);
  
  
  
}
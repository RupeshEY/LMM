package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Claim.eti;Claim.eix;Claim.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.CCAssignableInternal, com.guidewire._generated.entity.WorkloadDelegateInternal, com.guidewire._generated.entity.ISOReportableInternal, com.guidewire._generated.entity.UserRoleOwnerInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.claim.impl.ClaimInternal, com.guidewire.cc.domain.email.CCEmailSupport, com.guidewire.cc.domain.purging.Purgeable, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods, com.guidewire.pl.domain.contact.ContactGraphGenerator, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, com.guidewire.pl.system.entity.LevelAwareValidatableBean, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.api.assignment.CCAssignableMethods, gw.api.assignment.UserRoleOwner, gw.api.financials.CheckCreatorProvider, gw.api.heatmap.CatastropheMethods, gw.api.metric.ClaimUpdateMetricsMethods, gw.api.question.AnswerContainer, gw.api.question.AnswerSetContainer, gw.api.specialhandling.ClaimSpecialHandlingMethods, gw.cc.assignment.entity.CCAssignable, gw.cc.claim.entity.Claim, gw.cc.iso.entity.ISOReportable {
  java.lang.String CLAIMADDED_EVENT = "ClaimAdded";
  
  java.lang.String CLAIMCHANGED_EVENT = "ClaimChanged";
  
  java.lang.String CLAIMPURGED_EVENT = "ClaimPurged";
  
  java.lang.String CLAIMREMOVED_EVENT = "ClaimRemoved";
  
  java.lang.String CLAIMRESYNC_EVENT = "ClaimResync";
  
  java.lang.String CLAIMVALID_EVENT = "ClaimValid";
  
  /**
   * Adds the given element to the Access array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAccess(entity.ClaimAccess element);
  
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the AllocatedClaimNumberArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAllocatedClaimNumberArray(entity.AllocatedClaimNumber element);
  
  
  /**
   * Adds the given element to the ClaimISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimISOMatchReports(entity.ClaimISOMatchReport element);
  
  
  /**
   * Adds the given element to the ClaimIndicators array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimIndicators(entity.ClaimIndicator element);
  
  
  /**
   * Adds the given element to the ClaimInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimInfoArray(entity.ClaimInfo element);
  
  
  /**
   * Adds the given element to the ClaimMetricRecalculationTimeArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime element);
  
  
  /**
   * Adds the given element to the ClaimMetrics array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimMetrics(entity.ClaimMetric element);
  
  
  /**
   * Adds the given element to the ClaimRptArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimRptArray(entity.ClaimRpt element);
  
  
  /**
   * Adds the given element to the ClaimSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimSynchStates(entity.ClaimSynchState element);
  
  
  /**
   * Adds the given element to the ClaimempdataArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimempdataArray(entity.Claimempdata element);
  
  
  /**
   * Adds the given element to the ConcurrentEmpl array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToConcurrentEmpl(entity.ConcurrentEmployment element);
  
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContacts(entity.ClaimContact element);
  
  
  /**
   * Adds the given element to the ContribFactors array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContribFactors(entity.ContribFactor element);
  
  
  /**
   * Adds the given element to the Deductibles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeductibles(entity.Deductible element);
  
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.Document element);
  
  
  /**
   * Adds the given element to the DrugsPrescribed array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDrugsPrescribed(entity.DrugPrescribed element);
  
  
  /**
   * Adds the given element to the Evaluations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEvaluations(entity.Evaluation element);
  
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.Exposure element);
  
  
  /**
   * Adds the given element to the History array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHistory(entity.History element);
  
  
  /**
   * Adds the given element to the Incidents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIncidents(entity.Incident element);
  
  
  /**
   * Adds the given element to the LMMessages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLMMessages(entity.LMMessage_Ext element);
  
  
  /**
   * Adds the given element to the Matters array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMatters(entity.Matter element);
  
  
  /**
   * Adds the given element to the MedicalContactStatus array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalContactStatus(entity.MedicalContactStatus element);
  
  
  /**
   * Adds the given element to the MedicalTreatments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalTreatments(entity.MedicalTreatment element);
  
  
  /**
   * Adds the given element to the MetroReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMetroReports(entity.MetroReport element);
  
  
  /**
   * Adds the given element to the Negotiations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNegotiations(entity.Negotiation element);
  
  
  /**
   * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNotes(entity.Note element);
  
  
  /**
   * Adds the given element to the Officials array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOfficials(entity.Official element);
  
  
  /**
   * Adds the given element to the OtherBenefits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherBenefits(entity.OtherBenefit element);
  
  
  /**
   * Adds the given element to the PolicyLocationSummaryJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin element);
  
  
  /**
   * Adds the given element to the PropertyFireDamageArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPropertyFireDamageArray(entity.PropertyFireDamage element);
  
  
  /**
   * Adds the given element to the PropertyWaterDamageArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPropertyWaterDamageArray(entity.PropertyWaterDamage element);
  
  
  /**
   * Adds the given element to the RIAgreementGroups array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRIAgreementGroups(entity.RIAgreementGroup element);
  
  
  /**
   * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRICodings(entity.RICoding element);
  
  
  /**
   * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserveLines(entity.ReserveLine element);
  
  
  /**
   * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoleAssignments(entity.UserRoleAssignment element);
  
  
  /**
   * Adds the given element to the SIAnswerSet array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSIAnswerSet(entity.SIUAnswerSet element);
  
  
  /**
   * Adds the given element to the SITriggers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSITriggers(entity.SITrigger element);
  
  
  /**
   * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequests(entity.ServiceRequest element);
  
  
  /**
   * Adds the given element to the SpecialHandlingFinancialStateArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState element);
  
  
  /**
   * Adds the given element to the SubrogationSummaryArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubrogationSummaryArray(entity.SubrogationSummary element);
  
  
  /**
   * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText(entity.ClaimText element);
  
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  public void addToTransactions(entity.Transaction element);
  
  
  /**
   * Adds the given element to the Workflows array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWorkflows(entity.ClaimWorkflow element);
  
  
  /**
   * Gets the value of the Access field.
   * The access control objects for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAccess[] getAccess();
  
  
  /**
   * Gets the value of the AccidentType field.
   * Detailed accident type; augments LossCause.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AccidentType getAccidentType();
  
  
  /**
   * Gets the value of the Activities field.
   * The activities for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the AgencyId field.
   * An ID assigned to indicate company and office a claim is being submitted by, this data is used by ISO integration
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgencyId();
  
  
  /**
   * Gets the value of the AllocatedClaimNumber field.
   * If this claim is draft, and an attempt to save it has failed, contains the claim number that was allocated before the failure. Otherwise null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AllocatedClaimNumber getAllocatedClaimNumber();
  
  
  /**
   * Gets the value of the AllocatedClaimNumberArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AllocatedClaimNumber[] getAllocatedClaimNumberArray();
  
  
  public gw.pl.persistence.core.Key getAllocatedClaimNumberID();
  
  
  /**
   * Gets the value of the Catastrophe field.
   * Associated catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe();
  
  
  public gw.pl.persistence.core.Key getCatastropheID();
  
  
  /**
   * Gets the value of the ClaimISOMatchReports field.
   * ISO match reports for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimISOMatchReport[] getClaimISOMatchReports();
  
  
  /**
   * Gets the value of the ClaimIndicators field.
   * Indicators related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicator[] getClaimIndicators();
  
  
  /**
   * Array association for partition ClaimIndicatorsBySubtype on array ClaimIndicators
   */
  public entity.ClaimIndicator getClaimIndicatorsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ClaimInfo field.
   * The claim info is used to cache information for when this claim is archived.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  /**
   * Gets the value of the ClaimInfoArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo[] getClaimInfoArray();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the ClaimLineNumber_Ext field.
   * A Claim line number in CLASS (needed for non-uniqueness of Company/Syndicate participation)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimLineNumber_Ext();
  
  
  /**
   * Gets the value of the ClaimMetricRecalculationTime field.
   * Tracks when Claim metrics and indicators need to be recalculated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricRecalculationTime getClaimMetricRecalculationTime();
  
  
  /**
   * Gets the value of the ClaimMetricRecalculationTimeArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricRecalculationTime[] getClaimMetricRecalculationTimeArray();
  
  
  public gw.pl.persistence.core.Key getClaimMetricRecalculationTimeID();
  
  
  /**
   * Gets the value of the ClaimMetrics field.
   * Metrics related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric[] getClaimMetrics();
  
  
  /**
   * Array association for partition ClaimMetricsByClaimMetricCategorys on array ClaimMetrics
   */
  public entity.ClaimMetric[] getClaimMetricsByClaimMetricCategorys(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Array association for partition ClaimMetricsBySubtype on array ClaimMetrics
   */
  public entity.ClaimMetric getClaimMetricsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * The external identifier of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the ClaimRpt field.
   * The calculated financials data for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimRpt getClaimRpt();
  
  
  /**
   * Gets the value of the ClaimRptArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimRpt[] getClaimRptArray();
  
  
  public gw.pl.persistence.core.Key getClaimRptID();
  
  
  /**
   * Gets the value of the ClaimSource field.
   * Information about how Claim was entered into the System.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSource getClaimSource();
  
  
  /**
   * Gets the value of the ClaimSynchStates field.
   * The sync states related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimSynchState[] getClaimSynchStates();
  
  
  /**
   * Gets the value of the ClaimTier field.
   * The tier of this claim, used to decide how to rate the claim metrics.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimTier getClaimTier();
  
  
  /**
   * Gets the value of the ClaimTypeCode_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTypeCode_Ext getClaimTypeCode_Ext();
  
  
  /**
   * Gets the value of the ClaimWorkComp field.
   * Claim's worker's compensation data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkComp getClaimWorkComp();
  
  
  public gw.pl.persistence.core.Key getClaimWorkCompID();
  
  
  /**
   * Gets the value of the ClaimantDenorm field.
   * Claimant FK denorm.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimantDenorm();
  
  
  public gw.pl.persistence.core.Key getClaimantDenormID();
  
  
  /**
   * Gets the value of the ClaimantRprtdDate field.
   * Workers' Comp only. Date when the claimant reported incident to insured (employer).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getClaimantRprtdDate();
  
  
  /**
   * Gets the value of the ClaimempdataArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claimempdata[] getClaimempdataArray();
  
  
  /**
   * Gets the value of the ClosedOutcome field.
   * The outcome reached when closing the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimClosedOutcomeType getClosedOutcome();
  
  
  /**
   * Gets the value of the ConcurrentEmp field.
   * Did the employee have concurrent employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getConcurrentEmp();
  
  
  /**
   * Gets the value of the ConcurrentEmpl field.
   * Details of concurrent employment for workers' comp claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ConcurrentEmployment[] getConcurrentEmpl();
  
  
  /**
   * Gets the value of the Contacts field.
   * The contacts involved with this claim. Including indirectly involved, like Exposures contacts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact[] getContacts();
  
  
  /**
   * Gets the value of the ContribFactors field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContribFactor[] getContribFactors();
  
  
  /**
   * Gets the value of the Currency field.
   * The currency for the claim, copied from the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the DateCompDcsnDue field.
   * The date the compensability Decision (for entire claim) was Due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCompDcsnDue();
  
  
  /**
   * Gets the value of the DateCompDcsnMade field.
   * The date the compensability Decision (for entire claim) was Made.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCompDcsnMade();
  
  
  /**
   * Gets the value of the DateEligibleForArchive field.
   * The date and time that this claim will become eligible for archiving. While this field is null or set to a date in the future, this claim is not selected by the archive batch process. (Note that being passed over by the archive batch process is different from being 'skipped' or 'excluded'.)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEligibleForArchive();
  
  
  /**
   * Gets the value of the DateFormGivenToEmp field.
   * The date the work comp form was given to an employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateFormGivenToEmp();
  
  
  /**
   * Gets the value of the DateFormRetByEmp field.
   * The date the work comp form was returned by an employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateFormRetByEmp();
  
  
  /**
   * Gets the value of the DateRptdToAgent field.
   * The date the agent was notified about the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToAgent();
  
  
  /**
   * Gets the value of the DateRptdToEmployer field.
   * The date the claim was reported to the employer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToEmployer();
  
  
  /**
   * Gets the value of the DateRptdToInsured field.
   * The date the insured was notified about the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToInsured();
  
  
  /**
   * Gets the value of the DeathDate field.
   * Date of death (if injury type is death).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDeathDate();
  
  
  /**
   * Gets the value of the Deductibles field.
   * Deductibles associated with this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible[] getDeductibles();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the accident or loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Documents field.
   * The documents associated with this claim; for example, FNOL accord form or police report. Warning: do not rely on the contents of this array when the IDocumentMetadataSource plugin is enabled; use DocumentsUtil.getAllDocumentsForClaim instead.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document[] getDocuments();
  
  
  /**
   * Gets the value of the DrugsInvolved field.
   * Does the employer question the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getDrugsInvolved();
  
  
  /**
   * Gets the value of the DrugsPrescribed field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DrugPrescribed[] getDrugsPrescribed();
  
  
  /**
   * Gets the value of the ECFLastUpdateTime field.
   * The last time this Claim was updated from the ECF servers by either a Claim Notify or Claim Retrieve
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getECFLastUpdateTime();
  
  
  /**
   * Gets the value of the EEventTime_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEEventTime_Ext();
  
  
  /**
   * Gets the value of the EmpQusValidity field.
   * Does the employer question the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getEmpQusValidity();
  
  
  /**
   * Gets the value of the EmpSentMPNNotice field.
   * Date that the Employer sent out the MPN Notification.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEmpSentMPNNotice();
  
  
  /**
   * Gets the value of the EmployerValidityReason field.
   * The reason the employer questions the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmployerValidityReason();
  
  
  /**
   * Gets the value of the EmploymentData field.
   * Workers' Comp only. Details about the claimant's employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getEmploymentData();
  
  
  public gw.pl.persistence.core.Key getEmploymentDataID();
  
  
  /**
   * Gets the value of the Evaluations field.
   * The original cost estimate followed by any modifications to that estimate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Evaluation[] getEvaluations();
  
  
  /**
   * Gets the value of the ExaminationDate field.
   * Date of the Examination.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExaminationDate();
  
  
  /**
   * Gets the value of the ExposureBegan field.
   * Workers' Comp only. Date when the exposure began.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExposureBegan();
  
  
  /**
   * Gets the value of the ExposureEnded field.
   * Workers' Comp only. Date when the exposure ended.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExposureEnded();
  
  
  /**
   * Gets the value of the Exposures field.
   * The exposures related to this claim. Note: if triggersValidation is false, exposure metrics will not be run automatically.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure[] getExposures();
  
  
  /**
   * Gets the value of the Fault field.
   * Insured's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault();
  
  
  /**
   * Gets the value of the FaultRating field.
   * Indicates in the insured is at fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FaultRating getFaultRating();
  
  
  /**
   * Gets the value of the FireDeptInfo field.
   * Reports, incident number, and other information from the fire department.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFireDeptInfo();
  
  
  /**
   * Gets the value of the Flagged field.
   * This claim's status as a flagged claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FlaggedType getFlagged();
  
  
  /**
   * Gets the value of the FlaggedDate field.
   * The date and time the claim was initially flagged.  When the flag is unset, this date is set to null and will be set to a new date if a new reason for flagging the claim is found later.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFlaggedDate();
  
  
  /**
   * Gets the value of the FlaggedReason field.
   * The reason this claim is flagged.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFlaggedReason();
  
  
  /**
   * Gets the value of the History field.
   * The history events related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.History[] getHistory();
  
  
  /**
   * Gets the value of the HospitalDate field.
   * Date admitted to the hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHospitalDate();
  
  
  /**
   * Gets the value of the HospitalDays field.
   * Estimated Days in hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHospitalDays();
  
  
  /**
   * Gets the value of the HowReported field.
   * How the claim was reported.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HowReportedType getHowReported();
  
  
  /**
   * Gets the value of the Incidents field.
   * Descriptions of incidents related to this claim. Note: In Gosu, it's preferred to use Claim.VehicleIncidentsOnly and similar properties for each Incident subtype. See the Application Guide.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident[] getIncidents();
  
  
  /**
   * Gets the value of the InjWkrInMPN field.
   * Date that the injured Worker moved to MPN.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInjWkrInMPN();
  
  
  /**
   * Gets the value of the InsuredDenorm field.
   * Insured FK denorm.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getInsuredDenorm();
  
  
  public gw.pl.persistence.core.Key getInsuredDenormID();
  
  
  /**
   * Gets the value of the InsurerSentMPNNotice field.
   * Date that Insurer sent out the MPN Notification.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInsurerSentMPNNotice();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * The state of jurisdiction. This indicates jurisdiction that covers the loss, which may differ from the state in which the loss occurred. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LMMessages field.
   * Full list of LMMessage_Ext entities related to this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LMMessage_Ext[] getLMMessages();
  
  
  /**
   * Gets the value of the LOBCode field.
   * Line of Business code; typically related to the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the LargeLossNotificationStatus field.
   * The status of large loss notices.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LargeLossNotificationStatus getLargeLossNotificationStatus();
  
  
  /**
   * Gets the value of the LitigationStatus field.
   * The status of the litigation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LitigationStatus getLitigationStatus();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LocationCode field.
   * Workers' Comp only. Location at the employer's facilities where the accident occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getLocationCode();
  
  
  public gw.pl.persistence.core.Key getLocationCodeID();
  
  
  /**
   * Gets the value of the LocationOfTheft field.
   * the Location where the property was stolen.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LocationOfTheft getLocationOfTheft();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the LossCause field.
   * General cause of loss; dependent on loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause();
  
  
  /**
   * Gets the value of the LossDate field.
   * The date on which the loss occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the LossEndDate_Ext field.
   * End date of period during which a loss occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossEndDate_Ext();
  
  
  /**
   * Gets the value of the LossLocation field.
   * Location of the loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getLossLocation();
  
  
  /**
   * Gets the value of the LossLocationCode field.
   * Location Code for the Loss Location.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocationCode();
  
  
  public gw.pl.persistence.core.Key getLossLocationID();
  
  
  /**
   * Gets the value of the LossLocationSpatialDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.database.spatial.SpatialPoint getLossLocationSpatialDenorm();
  
  
  /**
   * Gets the value of the LossType field.
   * High level claim type (for example, Auto or Property).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the MMIdate field.
   * Date Maximum Medical Improvement was reached.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMMIdate();
  
  
  /**
   * Gets the value of the MainContactType field.
   * Relationship of the main contact to the insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getMainContactType();
  
  
  /**
   * Gets the value of the ManifestationDate field.
   * The manifestation date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getManifestationDate();
  
  
  /**
   * Gets the value of the Matters field.
   * The legal matters related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter[] getMatters();
  
  
  /**
   * Gets the value of the MedicalContactStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalContactStatus[] getMedicalContactStatus();
  
  
  /**
   * Gets the value of the MedicalTreatments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalTreatment[] getMedicalTreatments();
  
  
  /**
   * Gets the value of the MetroReports field.
   * Details of reports associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MetroReport[] getMetroReports();
  
  
  /**
   * Gets the value of the Negotiations field.
   * The negotiations related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Negotiation[] getNegotiations();
  
  
  /**
   * Gets the value of the Notes field.
   * The notes particular to this claim. Notes can also be associated with a particular exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Note[] getNotes();
  
  
  /**
   * Gets the value of the Officials field.
   * Details of officials associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Official[] getOfficials();
  
  
  /**
   * Gets the value of the OtherBenefits field.
   * Details of other benefits for workers comp claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherBenefit[] getOtherBenefits();
  
  
  /**
   * Gets the value of the OtherRecovStatus field.
   * The Other Recoverable status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OtherRecoverableStatus getOtherRecovStatus();
  
  
  /**
   * Gets the value of the PermissionRequired field.
   * If non-null, this is an additional permission that users are required to have to view or work on this claim. This field is used to restrict access to sensitive or private claims; for example, those involving an employee or that are under litigation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSecurityType getPermissionRequired();
  
  
  /**
   * Gets the value of the PoliceDeptInfo field.
   * Reports, incident number, and other information from the police deptartment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPoliceDeptInfo();
  
  
  /**
   * Gets the value of the Policy field.
   * The policy associated with this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the PolicyLocationSummaryJoin field.
   * Link to get the associated policy location summary (from policy system for catastrophe).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin getPolicyLocationSummaryJoin();
  
  
  /**
   * Gets the value of the PolicyLocationSummaryJoinArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin[] getPolicyLocationSummaryJoinArray();
  
  
  public gw.pl.persistence.core.Key getPolicyLocationSummaryJoinID();
  
  
  /**
   * Gets the value of the Progress field.
   * Description of the progress of an open claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimProgressType getProgress();
  
  
  /**
   * Gets the value of the PropertyFireDamage field.
   * Details of fire damage to property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyFireDamage getPropertyFireDamage();
  
  
  /**
   * Gets the value of the PropertyFireDamageArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyFireDamage[] getPropertyFireDamageArray();
  
  
  public gw.pl.persistence.core.Key getPropertyFireDamageID();
  
  
  /**
   * Gets the value of the PropertyWaterDamage field.
   * Details of water damage to property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyWaterDamage getPropertyWaterDamage();
  
  
  /**
   * Gets the value of the PropertyWaterDamageArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyWaterDamage[] getPropertyWaterDamageArray();
  
  
  public gw.pl.persistence.core.Key getPropertyWaterDamageID();
  
  
  /**
   * Gets the value of the PurgeDate field.
   * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPurgeDate();
  
  
  /**
   * Gets the value of the RIAgreementGroups field.
   * The reinsurance agreement groups for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreementGroup[] getRIAgreementGroups();
  
  
  /**
   * Gets the value of the RICodings field.
   * RICodings relating to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding[] getRICodings();
  
  
  /**
   * Gets the value of the ReOpenDate field.
   * Date claim was reopened.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReOpenDate();
  
  
  /**
   * Gets the value of the ReinsuranceFlaggedStatus field.
   * The reinsurance flagged status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReinsuranceFlaggedStatus getReinsuranceFlaggedStatus();
  
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimReopenedReason getReopenedReason();
  
  
  /**
   * Gets the value of the ReportedByType field.
   * Relationship of the person who reported the claim to the insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getReportedByType();
  
  
  /**
   * Gets the value of the ReportedDate field.
   * Date on which the loss was reported.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate();
  
  
  /**
   * Gets the value of the ReserveLines field.
   * ReserveLines relating to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine[] getReserveLines();
  
  
  /**
   * Gets the value of the RoleAssignments field.
   * The user role assignments for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRoleAssignment[] getRoleAssignments();
  
  
  /**
   * Gets the value of the SIAnswerSet field.
   * Link to Answer set for SIU
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SIUAnswerSet[] getSIAnswerSet();
  
  
  /**
   * Gets the value of the SIEscalateSIU field.
   * Escalate to SIU team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getSIEscalateSIU();
  
  
  /**
   * Gets the value of the SIEscalateSIUdate field.
   * Date escalated to SIU team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSIEscalateSIUdate();
  
  
  /**
   * Gets the value of the SIScore field.
   * Special Investigations Score.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSIScore();
  
  
  /**
   * Gets the value of the SITriggers field.
   * The triggers for Special Investigations linked to this Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SITrigger[] getSITriggers();
  
  
  /**
   * Gets the value of the SIULifeCycleState field.
   * Current state of SIU trigger rule processing for this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimLifeCycleState getSIULifeCycleState();
  
  
  /**
   * Gets the value of the SIUStatus field.
   * The SIU status for a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SIUStatus getSIUStatus();
  
  
  /**
   * Gets the value of the SalvageStatus field.
   * The salvage status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SalvageStatus getSalvageStatus();
  
  
  /**
   * Gets the value of the Segment field.
   * Segmentation type of the claim. Both the claim and the exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSegment getSegment();
  
  
  /**
   * Gets the value of the ServiceRequests field.
   * Service requests associated with this claim. Note: if triggersValidation is false, service request metrics will not be run automatically.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest[] getServiceRequests();
  
  
  /**
   * Gets the value of the ShowMedicalFirstInfo field.
   * Show Medical First info section.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getShowMedicalFirstInfo();
  
  
  /**
   * Gets the value of the SpecialHandlingFinancialState field.
   * Tracks previously calculated financial values used by AutomatedHandlerTriggers that trigger on financial thresholds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingFinancialState getSpecialHandlingFinancialState();
  
  
  /**
   * Gets the value of the SpecialHandlingFinancialStateArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingFinancialState[] getSpecialHandlingFinancialStateArray();
  
  
  public gw.pl.persistence.core.Key getSpecialHandlingFinancialStateID();
  
  
  /**
   * Gets the value of the State field.
   * Internal state of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getState();
  
  
  /**
   * Gets the value of the StateAckNumber field.
   * Acknowledgment number of the state file for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStateAckNumber();
  
  
  /**
   * Gets the value of the StateFileNumber field.
   * Number of the state file for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStateFileNumber();
  
  
  /**
   * Gets the value of the StatuteDate field.
   * Date at which the statute of limitations expires for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatuteDate();
  
  
  /**
   * Gets the value of the StorageBarCodeNum field.
   * Storage Bar Code Number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageBarCodeNum();
  
  
  /**
   * Gets the value of the StorageBoxNum field.
   * Storage Box Number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageBoxNum();
  
  
  /**
   * Gets the value of the StorageCategory field.
   * Storage Category.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StorageCategory getStorageCategory();
  
  
  /**
   * Gets the value of the StorageDate field.
   * Date file shipped to storage facility.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStorageDate();
  
  
  /**
   * Gets the value of the StorageLocationState field.
   * Storage Location State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getStorageLocationState();
  
  
  /**
   * Gets the value of the StorageType field.
   * Storage Type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StorageType getStorageType();
  
  
  /**
   * Gets the value of the StorageVolumes field.
   * Storage Volumes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageVolumes();
  
  
  /**
   * Gets the value of the Strategy field.
   * Segmentation type of the claim. Both the claim and the exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimStrategy getStrategy();
  
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Claim's subrogation-related data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary();
  
  
  /**
   * Gets the value of the SubrogationSummaryArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary[] getSubrogationSummaryArray();
  
  
  public gw.pl.persistence.core.Key getSubrogationSummaryID();
  
  
  /**
   * Gets the value of the Text field.
   * Large text fields associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimText[] getText();
  
  
  /**
   * Gets the value of the Transactions field.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions();
  
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext();
  
  
  /**
   * Gets the value of the UMR_Ext field.
   * A Unique Market Reference (UMR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the Weather field.
   * Weather conditions at the time of accident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WeatherType getWeather();
  
  
  /**
   * Gets the value of the Workflows field.
   * Set of workflows associated with this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkflow[] getWorkflows();
  
  
  /**
   * Gets the value of the BenefitsStatusDcsn field.
   * Indicates if the benefits decision has been made yet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBenefitsStatusDcsn();
  
  
  /**
   * Gets the value of the ComputerSecurity field.
   * Whether computer security issues were involved.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isComputerSecurity();
  
  
  /**
   * Gets the value of the CoverageInQuestion field.
   * Whether the claim is covered by the claimant's policies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageInQuestion();
  
  
  /**
   * Gets the value of the CurrentConditions field.
   * Current conditions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCurrentConditions();
  
  
  /**
   * Gets the value of the DiagnosticCnsistnt field.
   * Is the diagnostic consistent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiagnosticCnsistnt();
  
  
  /**
   * Gets the value of the EmploymentInjury field.
   * Workers' Comp only. Whether the injury occurred in course of employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEmploymentInjury();
  
  
  /**
   * Gets the value of the FirstNoticeSuit field.
   * Boolean field to indicate suit at the time of the first notice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFirstNoticeSuit();
  
  
  /**
   * Gets the value of the FurtherTreatment field.
   * Is further treatment required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFurtherTreatment();
  
  
  /**
   * Gets the value of the HazardousWaste field.
   * Boolean field to mark a claim as involving hazardous waste.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHazardousWaste();
  
  
  /**
   * Gets the value of the ISOEnabled field.
   * Is this field enabled for ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isISOEnabled();
  
  
  /**
   * Gets the value of the IncidentReport field.
   * True if this is an incident report only and the claim will not be processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentReport();
  
  
  /**
   * Gets the value of the InjuredOnPremises field.
   * Was the employee injured on the premesis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInjuredOnPremises();
  
  
  /**
   * Gets the value of the InjuredRegularJob field.
   * Was the employee injured while doing his or her regular job.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInjuredRegularJob();
  
  
  /**
   * Gets the value of the InsuredPremises field.
   * @deprecated True if the incident occurred on the employer's premises.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInsuredPremises();
  
  
  /**
   * Gets the value of the ModifiedDutyAvail field.
   * Is Modified Duty Available at Work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isModifiedDutyAvail();
  
  
  /**
   * Gets the value of the Mold field.
   * Boolean field to mark a claim as involving mold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMold();
  
  
  /**
   * Gets the value of the PTPinMPN field.
   * Is Primary Treating Physician in MPN?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPTPinMPN();
  
  
  /**
   * Gets the value of the PreexDisblty field.
   * Whether the injured person had a pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPreexDisblty();
  
  
  /**
   * Gets the value of the ReinsuranceReportable field.
   * True if this claim has exceeded the Reinsurance Reporting Threshold
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReinsuranceReportable();
  
  
  /**
   * Gets the value of the SafetyEquipProv field.
   * Was safety equipment provided.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSafetyEquipProv();
  
  
  /**
   * Gets the value of the SafetyEquipUsed field.
   * Was safety equipment used.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSafetyEquipUsed();
  
  
  /**
   * Gets the value of the TreatedPatientBfr field.
   * Has the patient been treated before.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTreatedPatientBfr();
  
  
  /**
   * Gets the value of the UberPrecautionaryFlag_Ext field.
   * This flag indicates if this ECF Claim is a Uber Precautionary.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isUberPrecautionaryFlag_Ext();
  
  
  /**
   * Gets the value of the VCSIndicator_Ext field.
   * Indicates if this ECF Claim is a Volume Claims Service (VCS) claim. This is indicated by the TriageCategory in an ECF message (Lloyd's only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVCSIndicator_Ext();
  
  
  /**
   * Gets the value of the WeatherRelated field.
   * Is related to weather
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWeatherRelated();
  
  
  /**
   * Removes the given element from the Access array. This is achieved by marking the element for removal.
   */
  public void removeFromAccess(entity.ClaimAccess element);
  
  
  /**
   * Removes the given element from the Access array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAccess(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the AllocatedClaimNumberArray array. This is achieved by marking the element for removal.
   */
  public void removeFromAllocatedClaimNumberArray(entity.AllocatedClaimNumber element);
  
  
  /**
   * Removes the given element from the AllocatedClaimNumberArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAllocatedClaimNumberArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimISOMatchReports(entity.ClaimISOMatchReport element);
  
  
  /**
   * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimISOMatchReports(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimIndicators(entity.ClaimIndicator element);
  
  
  /**
   * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimIndicators(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimInfoArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimInfoArray(entity.ClaimInfo element);
  
  
  /**
   * Removes the given element from the ClaimInfoArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimInfoArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimMetricRecalculationTimeArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime element);
  
  
  /**
   * Removes the given element from the ClaimMetricRecalculationTimeArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimMetricRecalculationTimeArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimMetrics(entity.ClaimMetric element);
  
  
  /**
   * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimMetrics(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimRptArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimRptArray(entity.ClaimRpt element);
  
  
  /**
   * Removes the given element from the ClaimRptArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimRptArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimSynchStates(entity.ClaimSynchState element);
  
  
  /**
   * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimSynchStates(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimempdataArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimempdataArray(entity.Claimempdata element);
  
  
  /**
   * Removes the given element from the ClaimempdataArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimempdataArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
   */
  public void removeFromConcurrentEmpl(entity.ConcurrentEmployment element);
  
  
  /**
   * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromConcurrentEmpl(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   */
  public void removeFromContacts(entity.ClaimContact element);
  
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContacts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
   */
  public void removeFromContribFactors(entity.ContribFactor element);
  
  
  /**
   * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContribFactors(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Deductibles array. This is achieved by marking the element for removal.
   */
  public void removeFromDeductibles(entity.Deductible element);
  
  
  /**
   * Removes the given element from the Deductibles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeductibles(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
   */
  public void removeFromDrugsPrescribed(entity.DrugPrescribed element);
  
  
  /**
   * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDrugsPrescribed(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
   */
  public void removeFromEvaluations(entity.Evaluation element);
  
  
  /**
   * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEvaluations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.Exposure element);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposures(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   */
  public void removeFromHistory(entity.History element);
  
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHistory(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
   */
  public void removeFromIncidents(entity.Incident element);
  
  
  /**
   * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIncidents(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
   */
  public void removeFromLMMessages(entity.LMMessage_Ext element);
  
  
  /**
   * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLMMessages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Matters array. This is achieved by marking the element for removal.
   */
  public void removeFromMatters(entity.Matter element);
  
  
  /**
   * Removes the given element from the Matters array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMatters(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalContactStatus(entity.MedicalContactStatus element);
  
  
  /**
   * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalContactStatus(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalTreatments(entity.MedicalTreatment element);
  
  
  /**
   * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalTreatments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
   */
  public void removeFromMetroReports(entity.MetroReport element);
  
  
  /**
   * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMetroReports(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
   */
  public void removeFromNegotiations(entity.Negotiation element);
  
  
  /**
   * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNegotiations(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the Officials array. This is achieved by marking the element for removal.
   */
  public void removeFromOfficials(entity.Official element);
  
  
  /**
   * Removes the given element from the Officials array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOfficials(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherBenefits(entity.OtherBenefit element);
  
  
  /**
   * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherBenefits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PolicyLocationSummaryJoinArray array. This is achieved by marking the element for removal.
   */
  public void removeFromPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin element);
  
  
  /**
   * Removes the given element from the PolicyLocationSummaryJoinArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicyLocationSummaryJoinArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PropertyFireDamageArray array. This is achieved by marking the element for removal.
   */
  public void removeFromPropertyFireDamageArray(entity.PropertyFireDamage element);
  
  
  /**
   * Removes the given element from the PropertyFireDamageArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPropertyFireDamageArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PropertyWaterDamageArray array. This is achieved by marking the element for removal.
   */
  public void removeFromPropertyWaterDamageArray(entity.PropertyWaterDamage element);
  
  
  /**
   * Removes the given element from the PropertyWaterDamageArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPropertyWaterDamageArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
   */
  public void removeFromRIAgreementGroups(entity.RIAgreementGroup element);
  
  
  /**
   * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRIAgreementGroups(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   */
  public void removeFromRICodings(entity.RICoding element);
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
   */
  public void removeFromSIAnswerSet(entity.SIUAnswerSet element);
  
  
  /**
   * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSIAnswerSet(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
   */
  public void removeFromSITriggers(entity.SITrigger element);
  
  
  /**
   * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSITriggers(gw.pl.persistence.core.Key elementID);
  
  
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
   * Removes the given element from the SpecialHandlingFinancialStateArray array. This is achieved by marking the element for removal.
   */
  public void removeFromSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState element);
  
  
  /**
   * Removes the given element from the SpecialHandlingFinancialStateArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSpecialHandlingFinancialStateArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SubrogationSummaryArray array. This is achieved by marking the element for removal.
   */
  public void removeFromSubrogationSummaryArray(entity.SubrogationSummary element);
  
  
  /**
   * Removes the given element from the SubrogationSummaryArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubrogationSummaryArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   */
  public void removeFromText(entity.ClaimText element);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
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
   * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
   */
  public void removeFromWorkflows(entity.ClaimWorkflow element);
  
  
  /**
   * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWorkflows(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Access field.
   */
  public void setAccess(entity.ClaimAccess[] value);
  
  
  /**
   * Sets the value of the AccidentType field.
   */
  public void setAccidentType(typekey.AccidentType value);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the AgencyId field.
   */
  public void setAgencyId(java.lang.String value);
  
  
  /**
   * Sets the value of the AllocatedClaimNumber field.
   */
  public void setAllocatedClaimNumber(entity.AllocatedClaimNumber value);
  
  
  /**
   * Sets the value of the AllocatedClaimNumberArray field.
   */
  public void setAllocatedClaimNumberArray(entity.AllocatedClaimNumber[] value);
  
  
  public void setAllocatedClaimNumberID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BenefitsStatusDcsn field.
   */
  public void setBenefitsStatusDcsn(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value);
  
  
  public void setCatastropheID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimISOMatchReports field.
   */
  public void setClaimISOMatchReports(entity.ClaimISOMatchReport[] value);
  
  
  /**
   * Sets the value of the ClaimIndicators field.
   */
  public void setClaimIndicators(entity.ClaimIndicator[] value);
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  /**
   * Sets the value of the ClaimInfoArray field.
   */
  public void setClaimInfoArray(entity.ClaimInfo[] value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimLineNumber_Ext field.
   */
  public void setClaimLineNumber_Ext(java.lang.Long value);
  
  
  /**
   * Sets the value of the ClaimMetricRecalculationTime field.
   */
  public void setClaimMetricRecalculationTime(entity.ClaimMetricRecalculationTime value);
  
  
  /**
   * Sets the value of the ClaimMetricRecalculationTimeArray field.
   */
  public void setClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime[] value);
  
  
  public void setClaimMetricRecalculationTimeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimMetrics field.
   */
  public void setClaimMetrics(entity.ClaimMetric[] value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimRpt field.
   */
  public void setClaimRpt(entity.ClaimRpt value);
  
  
  /**
   * Sets the value of the ClaimRptArray field.
   */
  public void setClaimRptArray(entity.ClaimRpt[] value);
  
  
  public void setClaimRptID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimSource field.
   */
  public void setClaimSource(typekey.ClaimSource value);
  
  
  /**
   * Sets the value of the ClaimSynchStates field.
   */
  public void setClaimSynchStates(entity.ClaimSynchState[] value);
  
  
  /**
   * Sets the value of the ClaimTier field.
   */
  public void setClaimTier(typekey.ClaimTier value);
  
  
  /**
   * Sets the value of the ClaimTypeCode_Ext field.
   */
  public void setClaimTypeCode_Ext(typekey.ECFClaimTypeCode_Ext value);
  
  
  /**
   * Sets the value of the ClaimWorkComp field.
   */
  public void setClaimWorkComp(entity.ClaimWorkComp value);
  
  
  public void setClaimWorkCompID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantDenorm field.
   */
  public void setClaimantDenorm(entity.Contact value);
  
  
  public void setClaimantDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantRprtdDate field.
   */
  public void setClaimantRprtdDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ClaimempdataArray field.
   */
  public void setClaimempdataArray(entity.Claimempdata[] value);
  
  
  /**
   * Sets the value of the ClosedOutcome field.
   */
  public void setClosedOutcome(typekey.ClaimClosedOutcomeType value);
  
  
  /**
   * Sets the value of the ComputerSecurity field.
   */
  public void setComputerSecurity(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ConcurrentEmp field.
   */
  public void setConcurrentEmp(typekey.YesNo value);
  
  
  /**
   * Sets the value of the ConcurrentEmpl field.
   */
  public void setConcurrentEmpl(entity.ConcurrentEmployment[] value);
  
  
  /**
   * Sets the value of the Contacts field.
   */
  public void setContacts(entity.ClaimContact[] value);
  
  
  /**
   * Sets the value of the ContribFactors field.
   */
  public void setContribFactors(entity.ContribFactor[] value);
  
  
  /**
   * Sets the value of the CoverageInQuestion field.
   */
  public void setCoverageInQuestion(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the CurrentConditions field.
   */
  public void setCurrentConditions(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DateCompDcsnDue field.
   */
  public void setDateCompDcsnDue(java.util.Date value);
  
  
  /**
   * Sets the value of the DateCompDcsnMade field.
   */
  public void setDateCompDcsnMade(java.util.Date value);
  
  
  /**
   * Sets the value of the DateEligibleForArchive field.
   */
  public void setDateEligibleForArchive(java.util.Date value);
  
  
  /**
   * Sets the value of the DateFormGivenToEmp field.
   */
  public void setDateFormGivenToEmp(java.util.Date value);
  
  
  /**
   * Sets the value of the DateFormRetByEmp field.
   */
  public void setDateFormRetByEmp(java.util.Date value);
  
  
  /**
   * Sets the value of the DateRptdToAgent field.
   */
  public void setDateRptdToAgent(java.util.Date value);
  
  
  /**
   * Sets the value of the DateRptdToEmployer field.
   */
  public void setDateRptdToEmployer(java.util.Date value);
  
  
  /**
   * Sets the value of the DateRptdToInsured field.
   */
  public void setDateRptdToInsured(java.util.Date value);
  
  
  /**
   * Sets the value of the DeathDate field.
   */
  public void setDeathDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Deductibles field.
   */
  public void setDeductibles(entity.Deductible[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DiagnosticCnsistnt field.
   */
  public void setDiagnosticCnsistnt(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.Document[] value);
  
  
  /**
   * Sets the value of the DrugsInvolved field.
   */
  public void setDrugsInvolved(typekey.YesNo value);
  
  
  /**
   * Sets the value of the DrugsPrescribed field.
   */
  public void setDrugsPrescribed(entity.DrugPrescribed[] value);
  
  
  /**
   * Sets the value of the ECFLastUpdateTime field.
   */
  public void setECFLastUpdateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the EEventTime_Ext field.
   */
  public void setEEventTime_Ext(java.util.Date value);
  
  
  /**
   * Sets the value of the EmpQusValidity field.
   */
  public void setEmpQusValidity(typekey.YesNo value);
  
  
  /**
   * Sets the value of the EmpSentMPNNotice field.
   */
  public void setEmpSentMPNNotice(java.util.Date value);
  
  
  /**
   * Sets the value of the EmployerValidityReason field.
   */
  public void setEmployerValidityReason(java.lang.String value);
  
  
  /**
   * Sets the value of the EmploymentData field.
   */
  public void setEmploymentData(entity.EmploymentData value);
  
  
  public void setEmploymentDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EmploymentInjury field.
   */
  public void setEmploymentInjury(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Evaluations field.
   */
  public void setEvaluations(entity.Evaluation[] value);
  
  
  /**
   * Sets the value of the ExaminationDate field.
   */
  public void setExaminationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExposureBegan field.
   */
  public void setExposureBegan(java.util.Date value);
  
  
  /**
   * Sets the value of the ExposureEnded field.
   */
  public void setExposureEnded(java.util.Date value);
  
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.Exposure[] value);
  
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FaultRating field.
   */
  public void setFaultRating(typekey.FaultRating value);
  
  
  /**
   * Sets the value of the FireDeptInfo field.
   */
  public void setFireDeptInfo(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNoticeSuit field.
   */
  public void setFirstNoticeSuit(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Flagged field.
   */
  public void setFlagged(typekey.FlaggedType value);
  
  
  /**
   * Sets the value of the FlaggedDate field.
   */
  public void setFlaggedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FlaggedReason field.
   */
  public void setFlaggedReason(java.lang.String value);
  
  
  /**
   * Sets the value of the FurtherTreatment field.
   */
  public void setFurtherTreatment(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HazardousWaste field.
   */
  public void setHazardousWaste(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the History field.
   */
  public void setHistory(entity.History[] value);
  
  
  /**
   * Sets the value of the HospitalDate field.
   */
  public void setHospitalDate(java.util.Date value);
  
  
  /**
   * Sets the value of the HospitalDays field.
   */
  public void setHospitalDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the HowReported field.
   */
  public void setHowReported(typekey.HowReportedType value);
  
  
  /**
   * Sets the value of the ISOEnabled field.
   */
  public void setISOEnabled(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the IncidentReport field.
   */
  public void setIncidentReport(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Incidents field.
   */
  public void setIncidents(entity.Incident[] value);
  
  
  /**
   * Sets the value of the InjWkrInMPN field.
   */
  public void setInjWkrInMPN(java.util.Date value);
  
  
  /**
   * Sets the value of the InjuredOnPremises field.
   */
  public void setInjuredOnPremises(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InjuredRegularJob field.
   */
  public void setInjuredRegularJob(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InsuredDenorm field.
   */
  public void setInsuredDenorm(entity.Contact value);
  
  
  public void setInsuredDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InsuredPremises field.
   * @deprecated True if the incident occurred on the employer's premises.
   */
  @java.lang.Deprecated
  public void setInsuredPremises(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InsurerSentMPNNotice field.
   */
  public void setInsurerSentMPNNotice(java.util.Date value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LMMessages field.
   */
  public void setLMMessages(entity.LMMessage_Ext[] value);
  
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the LargeLossNotificationStatus field.
   */
  public void setLargeLossNotificationStatus(typekey.LargeLossNotificationStatus value);
  
  
  /**
   * Sets the value of the LitigationStatus field.
   */
  public void setLitigationStatus(typekey.LitigationStatus value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LocationCode field.
   */
  public void setLocationCode(entity.PolicyLocation value);
  
  
  public void setLocationCodeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LocationOfTheft field.
   */
  public void setLocationOfTheft(typekey.LocationOfTheft value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossEndDate_Ext field.
   */
  public void setLossEndDate_Ext(java.util.Date value);
  
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(entity.Address value);
  
  
  /**
   * Sets the value of the LossLocationCode field.
   */
  public void setLossLocationCode(java.lang.String value);
  
  
  public void setLossLocationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LossLocationSpatialDenorm field.
   */
  public void setLossLocationSpatialDenorm(gw.api.database.spatial.SpatialPoint value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the MMIdate field.
   */
  public void setMMIdate(java.util.Date value);
  
  
  /**
   * Sets the value of the MainContactType field.
   */
  public void setMainContactType(typekey.PersonRelationType value);
  
  
  /**
   * Sets the value of the ManifestationDate field.
   */
  public void setManifestationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Matters field.
   */
  public void setMatters(entity.Matter[] value);
  
  
  /**
   * Sets the value of the MedicalContactStatus field.
   */
  public void setMedicalContactStatus(entity.MedicalContactStatus[] value);
  
  
  /**
   * Sets the value of the MedicalTreatments field.
   */
  public void setMedicalTreatments(entity.MedicalTreatment[] value);
  
  
  /**
   * Sets the value of the MetroReports field.
   */
  public void setMetroReports(entity.MetroReport[] value);
  
  
  /**
   * Sets the value of the ModifiedDutyAvail field.
   */
  public void setModifiedDutyAvail(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Mold field.
   */
  public void setMold(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Negotiations field.
   */
  public void setNegotiations(entity.Negotiation[] value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(entity.Note[] value);
  
  
  /**
   * Sets the value of the Officials field.
   */
  public void setOfficials(entity.Official[] value);
  
  
  /**
   * Sets the value of the OtherBenefits field.
   */
  public void setOtherBenefits(entity.OtherBenefit[] value);
  
  
  /**
   * Sets the value of the OtherRecovStatus field.
   */
  public void setOtherRecovStatus(typekey.OtherRecoverableStatus value);
  
  
  /**
   * Sets the value of the PTPinMPN field.
   */
  public void setPTPinMPN(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PermissionRequired field.
   */
  public void setPermissionRequired(typekey.ClaimSecurityType value);
  
  
  /**
   * Sets the value of the PoliceDeptInfo field.
   */
  public void setPoliceDeptInfo(java.lang.String value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicyLocationSummaryJoin field.
   */
  public void setPolicyLocationSummaryJoin(entity.PolicyLocationSummaryJoin value);
  
  
  /**
   * Sets the value of the PolicyLocationSummaryJoinArray field.
   */
  public void setPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin[] value);
  
  
  public void setPolicyLocationSummaryJoinID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PreexDisblty field.
   */
  public void setPreexDisblty(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Progress field.
   */
  public void setProgress(typekey.ClaimProgressType value);
  
  
  /**
   * Sets the value of the PropertyFireDamage field.
   */
  public void setPropertyFireDamage(entity.PropertyFireDamage value);
  
  
  /**
   * Sets the value of the PropertyFireDamageArray field.
   */
  public void setPropertyFireDamageArray(entity.PropertyFireDamage[] value);
  
  
  public void setPropertyFireDamageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PropertyWaterDamage field.
   */
  public void setPropertyWaterDamage(entity.PropertyWaterDamage value);
  
  
  /**
   * Sets the value of the PropertyWaterDamageArray field.
   */
  public void setPropertyWaterDamageArray(entity.PropertyWaterDamage[] value);
  
  
  public void setPropertyWaterDamageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PurgeDate field.
   */
  public void setPurgeDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RIAgreementGroups field.
   */
  public void setRIAgreementGroups(entity.RIAgreementGroup[] value);
  
  
  /**
   * Sets the value of the RICodings field.
   */
  public void setRICodings(entity.RICoding[] value);
  
  
  /**
   * Sets the value of the ReOpenDate field.
   */
  public void setReOpenDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReinsuranceFlaggedStatus field.
   */
  public void setReinsuranceFlaggedStatus(typekey.ReinsuranceFlaggedStatus value);
  
  
  /**
   * Sets the value of the ReinsuranceReportable field.
   */
  public void setReinsuranceReportable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.ClaimReopenedReason value);
  
  
  /**
   * Sets the value of the ReportedByType field.
   */
  public void setReportedByType(typekey.PersonRelationType value);
  
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReserveLines field.
   */
  public void setReserveLines(entity.ReserveLine[] value);
  
  
  /**
   * Sets the value of the RoleAssignments field.
   */
  public void setRoleAssignments(entity.UserRoleAssignment[] value);
  
  
  /**
   * Sets the value of the SIAnswerSet field.
   */
  public void setSIAnswerSet(entity.SIUAnswerSet[] value);
  
  
  /**
   * Sets the value of the SIEscalateSIU field.
   */
  public void setSIEscalateSIU(typekey.YesNo value);
  
  
  /**
   * Sets the value of the SIEscalateSIUdate field.
   */
  public void setSIEscalateSIUdate(java.util.Date value);
  
  
  /**
   * Sets the value of the SIScore field.
   */
  public void setSIScore(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SITriggers field.
   */
  public void setSITriggers(entity.SITrigger[] value);
  
  
  /**
   * Sets the value of the SIULifeCycleState field.
   */
  public void setSIULifeCycleState(typekey.ClaimLifeCycleState value);
  
  
  /**
   * Sets the value of the SIUStatus field.
   */
  public void setSIUStatus(typekey.SIUStatus value);
  
  
  /**
   * Sets the value of the SafetyEquipProv field.
   */
  public void setSafetyEquipProv(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SafetyEquipUsed field.
   */
  public void setSafetyEquipUsed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SalvageStatus field.
   */
  public void setSalvageStatus(typekey.SalvageStatus value);
  
  
  /**
   * Sets the value of the Segment field.
   */
  public void setSegment(typekey.ClaimSegment value);
  
  
  /**
   * Sets the value of the ServiceRequests field.
   */
  public void setServiceRequests(entity.ServiceRequest[] value);
  
  
  /**
   * Sets the value of the ShowMedicalFirstInfo field.
   */
  public void setShowMedicalFirstInfo(typekey.YesNo value);
  
  
  /**
   * Sets the value of the SpecialHandlingFinancialState field.
   */
  public void setSpecialHandlingFinancialState(entity.SpecialHandlingFinancialState value);
  
  
  /**
   * Sets the value of the SpecialHandlingFinancialStateArray field.
   */
  public void setSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState[] value);
  
  
  public void setSpecialHandlingFinancialStateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ClaimState value);
  
  
  /**
   * Sets the value of the StateAckNumber field.
   */
  public void setStateAckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the StateFileNumber field.
   */
  public void setStateFileNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the StatuteDate field.
   */
  public void setStatuteDate(java.util.Date value);
  
  
  /**
   * Sets the value of the StorageBarCodeNum field.
   */
  public void setStorageBarCodeNum(java.lang.String value);
  
  
  /**
   * Sets the value of the StorageBoxNum field.
   */
  public void setStorageBoxNum(java.lang.String value);
  
  
  /**
   * Sets the value of the StorageCategory field.
   */
  public void setStorageCategory(typekey.StorageCategory value);
  
  
  /**
   * Sets the value of the StorageDate field.
   */
  public void setStorageDate(java.util.Date value);
  
  
  /**
   * Sets the value of the StorageLocationState field.
   */
  public void setStorageLocationState(typekey.State value);
  
  
  /**
   * Sets the value of the StorageType field.
   */
  public void setStorageType(typekey.StorageType value);
  
  
  /**
   * Sets the value of the StorageVolumes field.
   */
  public void setStorageVolumes(java.lang.String value);
  
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.ClaimStrategy value);
  
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value);
  
  
  /**
   * Sets the value of the SubrogationSummaryArray field.
   */
  public void setSubrogationSummaryArray(entity.SubrogationSummary[] value);
  
  
  public void setSubrogationSummaryID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(entity.ClaimText[] value);
  
  
  /**
   * Sets the value of the Transactions field.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  public void setTransactions(entity.Transaction[] value);
  
  
  /**
   * Sets the value of the TreatedPatientBfr field.
   */
  public void setTreatedPatientBfr(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the UberPrecautionaryFlag_Ext field.
   */
  public void setUberPrecautionaryFlag_Ext(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VCSIndicator_Ext field.
   */
  public void setVCSIndicator_Ext(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the Weather field.
   */
  public void setWeather(typekey.WeatherType value);
  
  
  /**
   * Sets the value of the WeatherRelated field.
   */
  public void setWeatherRelated(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Workflows field.
   */
  public void setWorkflows(entity.ClaimWorkflow[] value);
  
  
  
}
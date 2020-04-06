package entity;

/**
 * Claim
 * 
 *       Centralizes all the information, contacts, and business activities associated with a claimant's loss. The Claim
 *       entity is the primary object in the ClaimCenter system.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Claim.eti;Claim.eix;Claim.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Claim")
public class Claim extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Extractable, entity.CCAssignable, entity.WorkloadDelegate, entity.ISOReportable, entity.UserRoleOwner, entity.ClaimContactRoleOwner, entity.EventAware, com.guidewire.cc.domain.email.CCEmailSupport, com.guidewire.cc.domain.purging.Purgeable, gw.api.assignment.CCAssignableMethods, gw.api.assignment.UserRoleOwner, gw.api.heatmap.CatastropheMethods, gw.api.metric.ClaimUpdateMetricsMethods, gw.api.question.AnswerSetContainer, gw.api.specialhandling.ClaimSpecialHandlingMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Claim> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Claim>("entity.Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACCESS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Access");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACCIDENTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AccidentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACTIVITIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Activities");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGENCYID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AgencyId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ALLOCATEDCLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AllocatedClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ALLOCATEDCLAIMNUMBERARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AllocatedClaimNumberArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNMENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignmentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSIGNMENTSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AssignmentStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BENEFITSSTATUSDCSN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BenefitsStatusDcsn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CATASTROPHE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Catastrophe");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMISOMATCHREPORTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimISOMatchReports");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMINDICATORS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimIndicators");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMINFOARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimInfoArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMLINENUMBER_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimLineNumber_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMMETRICRECALCULATIONTIME_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimMetricRecalculationTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMMETRICRECALCULATIONTIMEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimMetricRecalculationTimeArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMMETRICS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimMetrics");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMRPT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMRPTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimRptArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMSOURCE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimSource");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMSYNCHSTATES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimSynchStates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMTIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMTYPECODE_EXT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimTypeCode_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMWORKCOMP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimWorkComp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMANTDENORM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimantDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMANTRPRTDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimantRprtdDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMEMPDATAARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimempdataArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CloseDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLOSEDOUTCOME_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClosedOutcome");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPUTERSECURITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ComputerSecurity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CONCURRENTEMP_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ConcurrentEmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CONCURRENTEMPL_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ConcurrentEmpl");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CONTACTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Contacts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CONTRIBFACTORS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ContribFactors");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERAGEINQUESTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverageInQuestion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTCONDITIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentConditions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATECOMPDCSNDUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateCompDcsnDue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATECOMPDCSNMADE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateCompDcsnMade");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEELIGIBLEFORARCHIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateEligibleForArchive");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEFORMGIVENTOEMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateFormGivenToEmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEFORMRETBYEMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateFormRetByEmp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATERPTDTOAGENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateRptdToAgent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATERPTDTOEMPLOYER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateRptdToEmployer");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATERPTDTOINSURED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateRptdToInsured");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEATHDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DeathDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DEDUCTIBLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Deductibles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DIAGNOSTICCNSISTNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DiagnosticCnsistnt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DOCUMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Documents");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DRUGSINVOLVED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DrugsInvolved");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DRUGSPRESCRIBED_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DrugsPrescribed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ECFLASTUPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ECFLastUpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EEVENTTIME_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EEventTime_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EMPQUSVALIDITY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EmpQusValidity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMPSENTMPNNOTICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmpSentMPNNotice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMPLOYERVALIDITYREASON_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmployerValidityReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EMPLOYMENTDATA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "EmploymentData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMPLOYMENTINJURY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmploymentInjury");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EVALUATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Evaluations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXAMINATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExaminationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREBEGAN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureBegan");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREENDED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureEnded");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSURES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Exposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAULT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Fault");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FAULTRATING_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FaultRating");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIREDEPTINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FireDeptInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNOTICESUIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstNoticeSuit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FLAGGED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Flagged");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLAGGEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FlaggedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLAGGEDREASON_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FlaggedReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FURTHERTREATMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FurtherTreatment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HAZARDOUSWASTE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HazardousWaste");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> HISTORY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "History");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HOSPITALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HospitalDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HOSPITALDAYS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HospitalDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> HOWREPORTED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "HowReported");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOENABLED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOEnabled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOKNOWN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOKnown");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISORECEIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOReceiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ISOSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ISOStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTREPORT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INCIDENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Incidents");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INJWKRINMPN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InjWkrInMPN");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INJUREDONPREMISES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InjuredOnPremises");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INJUREDREGULARJOB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InjuredRegularJob");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INSUREDDENORM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InsuredDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDPREMISES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredPremises");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERSENTMPNNOTICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerSentMPNNotice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "JurisdictionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LMMESSAGES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "LMMessages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOBCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LOBCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LARGELOSSNOTIFICATIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LargeLossNotificationStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LITIGATIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LitigationStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOCATIONCODE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LocationCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOCATIONOFTHEFT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LocationOfTheft");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSCAUSE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossCause");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSENDDATE_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossEndDate_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOSSLOCATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LossLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSLOCATIONCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossLocationCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSLOCATIONSPATIALDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossLocationSpatialDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MMIDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MMIdate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MAINCONTACTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MainContactType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MANIFESTATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ManifestationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> MATTERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Matters");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> MEDICALCONTACTSTATUS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "MedicalContactStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> MEDICALTREATMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "MedicalTreatments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> METROREPORTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "MetroReports");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODIFIEDDUTYAVAIL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ModifiedDutyAvail");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOLD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Mold");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NEGOTIATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Negotiations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NOTES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Notes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OFFICIALS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Officials");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OTHERBENEFITS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "OtherBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OTHERRECOVSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OtherRecovStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PTPINMPN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PTPinMPN");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PERMISSIONREQUIRED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PermissionRequired");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICEDEPTINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PoliceDeptInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Policy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYLOCATIONSUMMARYJOIN_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PolicyLocationSummaryJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> POLICYLOCATIONSUMMARYJOINARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PolicyLocationSummaryJoinArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREEXDISBLTY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PreexDisblty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROGRESS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Progress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PROPERTYFIREDAMAGE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PropertyFireDamage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PROPERTYFIREDAMAGEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PropertyFireDamageArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PROPERTYWATERDAMAGE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PropertyWaterDamage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PROPERTYWATERDAMAGEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PropertyWaterDamageArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PURGEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PurgeDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RIAGREEMENTGROUPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RIAgreementGroups");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RICODINGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RICodings");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REOPENDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReOpenDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REINSURANCEFLAGGEDSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReinsuranceFlaggedStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSURANCEREPORTABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsuranceReportable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REOPENEDREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReopenedReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REPORTEDBYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReportedByType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RESERVELINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ReserveLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLEASSIGNMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RoleAssignments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SIANSWERSET_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SIAnswerSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SIESCALATESIU_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SIEscalateSIU");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SIESCALATESIUDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SIEscalateSIUdate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SISCORE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SIScore");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SITRIGGERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SITriggers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SIULIFECYCLESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SIULifeCycleState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SIUSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SIUStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SAFETYEQUIPPROV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SafetyEquipProv");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SAFETYEQUIPUSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SafetyEquipUsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SALVAGESTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SalvageStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SEGMENT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Segment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SERVICEREQUESTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ServiceRequests");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SHOWMEDICALFIRSTINFO_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ShowMedicalFirstInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SPECIALHANDLINGFINANCIALSTATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SpecialHandlingFinancialState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SPECIALHANDLINGFINANCIALSTATEARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SpecialHandlingFinancialStateArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATEACKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StateAckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATEFILENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StateFileNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATUTEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StatuteDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEBARCODENUM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageBarCodeNum");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEBOXNUM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageBoxNum");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STORAGECATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StorageCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STORAGELOCATIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StorageLocationState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STORAGETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StorageType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEVOLUMES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageVolumes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STRATEGY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Strategy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBROGATIONSUMMARY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SubrogationSummary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SUBROGATIONSUMMARYARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SubrogationSummaryArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUPPLEMENTALWORKLOADWEIGHT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SupplementalWorkloadWeight");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TEXT_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Text");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Transactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TREATEDPATIENTBFR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TreatedPatientBfr");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UCR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UCR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UMR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UMR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UBERPRECAUTIONARYFLAG_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UberPrecautionaryFlag_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VCSINDICATOR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VCSIndicator_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WEATHER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Weather");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEATHERRELATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WeatherRelated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> WORKFLOWS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Workflows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADUPDATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkloadUpdated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADWEIGHT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkloadWeight");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final java.lang.String ASSIGNMENTADDED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTADDED_EVENT;
  
  public static final java.lang.String ASSIGNMENTCHANGED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTCHANGED_EVENT;
  
  public static final java.lang.String ASSIGNMENTREMOVED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTREMOVED_EVENT;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.claim.PublicClaimFinder finder = gw.cc.claim.entity.Claim.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Claim()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Claim(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Claim(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ClaimInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds an empty ClaimContactRole to this owner. It is assumed that the Contact associated with the role
   * will be filled in later. The role must be Required or ZeroToMore.
   * @param role 
   * @throws IllegalArgumentException if the role is prohibited or exclusive
   */
  public entity.ClaimContactRole addEmptyRole(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addEmptyRole(role);
  }
  
  /**
   * Associates an event with the bean, which will be fired when the bean is
   * committed. A bean with an event is considered changed.
   * @param strEventId The event id.
   */
  public void addEvent(java.lang.String strEventId) {
    ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
  }
  
  /**
   * Add a new match report to the array of match reports on this Claim/Exposure
   * @return the newly created match report
   */
  public entity.ISOMatchReport addNewISOMatchReport() {
    return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addNewISOMatchReport();
  }
  
  /**
   * Adds a note to a claim and optional exposure.
   * @param exposure A related exposure. Optional - may be null.
   * @param topic The topic type.
   * @param strBody The body text of the note.
   * @return The new note
   */
  public entity.Note addNote(entity.Exposure exposure, typekey.NoteTopicType topic, java.lang.String strBody) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(exposure, topic, strBody);
  }
  
  /**
   * Adds a note to a claim and optional matter.
   * @param matter A related matter. Optional - may be null.
   * @param topic The topic type.
   * @param strBody The body text of the note.
   * @return The new note
   */
  public entity.Note addNote(entity.Matter matter, typekey.NoteTopicType topic, java.lang.String strBody) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(matter, topic, strBody);
  }
  
  /**
   * Adds a note to a claim and uses the default Topic
   * @param strBody The body text of the note.
   * @return The new note
   */
  public entity.Note addNote(java.lang.String strBody) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(strBody);
  }
  
  /**
   * Adds a note to a claim
   * @param topic The topic type.
   * @param strBody The body text of the note.
   * @return The new note
   */
  public entity.Note addNote(typekey.NoteTopicType topic, java.lang.String strBody) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(topic, strBody);
  }
  
  /**
   * Adds a note to a claim
   * @param topic The topic type.
   * @param subject The subject of the note.
   * @param strBody The body text of the note.
   * @return The new note
   */
  public entity.Note addNote(typekey.NoteTopicType topic, java.lang.String subject, java.lang.String strBody) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(topic, subject, strBody);
  }
  
  /**
   * Adds a role with the specified contact to this entity. This method should only be used with Required or ZeroToMore
   * roles. For Exclusive roles, just set the property with the name of the role.
   * Does nothing if the Contact already has the role.
   * @param role 
   * @param contact 
   * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
   * right type for the given role. For exclusive roles, use
   * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, gw.pl.contact.entity.Contact)} instead.
   */
  public entity.ClaimContactRole addRole(typekey.ContactRole role, entity.Contact contact) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addRole(role, contact);
  }
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element) {
    __getInternalInterface().addArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimISOMatchReports(entity.ClaimISOMatchReport element) {
    __getInternalInterface().addArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimIndicators array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimIndicators(entity.ClaimIndicator element) {
    __getInternalInterface().addArrayElement(CLAIMINDICATORS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimMetrics array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimMetrics(entity.ClaimMetric element) {
    __getInternalInterface().addArrayElement(CLAIMMETRICS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimSynchStates(entity.ClaimSynchState element) {
    __getInternalInterface().addArrayElement(CLAIMSYNCHSTATES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ConcurrentEmpl array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToConcurrentEmpl(entity.ConcurrentEmployment element) {
    __getInternalInterface().addArrayElement(CONCURRENTEMPL_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContacts(entity.ClaimContact element) {
    __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ContribFactors array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContribFactors(entity.ContribFactor element) {
    __getInternalInterface().addArrayElement(CONTRIBFACTORS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.Document element) {
    __getInternalInterface().addArrayElement(DOCUMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DrugsPrescribed array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDrugsPrescribed(entity.DrugPrescribed element) {
    __getInternalInterface().addArrayElement(DRUGSPRESCRIBED_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Evaluations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEvaluations(entity.Evaluation element) {
    __getInternalInterface().addArrayElement(EVALUATIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.Exposure element) {
    __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the History array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHistory(entity.History element) {
    __getInternalInterface().addArrayElement(HISTORY_PROP.get(), element);
  }
  
  /**
   * Add the given match report to the array of match reports on this Claim/Exposure
   * @param report the report to be added
   */
  public void addToISOMatchReports(entity.ISOMatchReport report) {
    ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addToISOMatchReports(report);
  }
  
  /**
   * Adds the given element to the Incidents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIncidents(entity.Incident element) {
    __getInternalInterface().addArrayElement(INCIDENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the LMMessages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLMMessages(entity.LMMessage_Ext element) {
    __getInternalInterface().addArrayElement(LMMESSAGES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Matters array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMatters(entity.Matter element) {
    __getInternalInterface().addArrayElement(MATTERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the MedicalContactStatus array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalContactStatus(entity.MedicalContactStatus element) {
    __getInternalInterface().addArrayElement(MEDICALCONTACTSTATUS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the MedicalTreatments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalTreatments(entity.MedicalTreatment element) {
    __getInternalInterface().addArrayElement(MEDICALTREATMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the MetroReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMetroReports(entity.MetroReport element) {
    __getInternalInterface().addArrayElement(METROREPORTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Negotiations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNegotiations(entity.Negotiation element) {
    __getInternalInterface().addArrayElement(NEGOTIATIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNotes(entity.Note element) {
    __getInternalInterface().addArrayElement(NOTES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Officials array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOfficials(entity.Official element) {
    __getInternalInterface().addArrayElement(OFFICIALS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the OtherBenefits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherBenefits(entity.OtherBenefit element) {
    __getInternalInterface().addArrayElement(OTHERBENEFITS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RIAgreementGroups array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRIAgreementGroups(entity.RIAgreementGroup element) {
    __getInternalInterface().addArrayElement(RIAGREEMENTGROUPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRICodings(entity.RICoding element) {
    __getInternalInterface().addArrayElement(RICODINGS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserveLines(entity.ReserveLine element) {
    __getInternalInterface().addArrayElement(RESERVELINES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToRoleAssignments(entity.UserRoleAssignment value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addToRoleAssignments(value);
  }
  
  /**
   * Adds the given element to the SIAnswerSet array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSIAnswerSet(entity.SIUAnswerSet element) {
    __getInternalInterface().addArrayElement(SIANSWERSET_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the SITriggers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSITriggers(entity.SITrigger element) {
    __getInternalInterface().addArrayElement(SITRIGGERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequests(entity.ServiceRequest element) {
    __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText(entity.ClaimText element) {
    __getInternalInterface().addArrayElement(TEXT_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  public void addToTransactions(entity.Transaction element) {
    __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Workflows array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWorkflows(entity.ClaimWorkflow element) {
    __getInternalInterface().addArrayElement(WORKFLOWS_PROP.get(), element);
  }
  
  /**
   * Directly assigns the entity to the specified group and user by setting the assignedGroup and assignedUser fields.
   * If user or group is null returns false and nothing is done.
   * @param group The group to which the entity should be assigned
   * @param user The user to which the entity should be assigned
   * @return true if the assignment is successful
   */
  public boolean assign(entity.Group group, entity.User user) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(group, user);
  }
  
  /**
   * <p>
   * Invokes the Assignment Engine to assign the item to the specified group and user.  If userID is null,
   * the item will be assigned using the group's assignment rules.  If
   * userID is specified, assignment will be made directly to the group and
   * user.  If the engine cannot assign the item to the requested group/user,
   * it will throw an exception indicating the reason.
   * </p>
   * If a user is specified, caller is responsible for ensuring that the
   * user is a member of group.
   * </p>
   * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
   * @param groupID The group to which the item should be assigned - must be
   *                specified.  If not known, use autoAssign(item) instead.
   * @param userID The user to which the item should be assigned; if null an
   *                appropriate user will be selected by group assignment rules.
   * @throws com.guidewire.pl.system.exception.IllegalAssignmentException if the user does not have permission
   * @throws com.guidewire.pl.system.exception.NoAssignmentFoundException if assignment could not be made
   * @deprecated Use autoAssign(Group, User) instead. Note that that method returns a boolean instead of throwing exceptions
   */
  public void assign(gw.pl.persistence.core.Key groupID, gw.pl.persistence.core.Key userID) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(groupID, userID);
  }
  
  /**
   * Assign the entity, which must be an Activity to the specified queue. (Currently, only Activities may be assigned
   * to Queues.) The current group is not a parameter - it is derived from the current
   * Assignment Engine state. As a result, this method may only be invoked from within an Assignment Rule.
   * <p/>
   * If there is no current group, nothing is done and a warning is logged. The queue must belong to the current group
   * or nothing is done.  Returns false if the assignable bean is not an activity.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param queue Queue to assign the activity to
   * @return true if the assignment is successful, false otherwise
   * @deprecated use assignActivityToQueue(AssignableQueue, Group) instead, since that method is more widely valid and
   *             is easier to understand because the group is explicit rather than implicit.
   */
  public boolean assignActivityToQueue(entity.AssignableQueue queue) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue);
  }
  
  /**
   * Assign this entity, which must be an Activity,  to the specified queue. The queue should belong to the specified group.
   * Returns false if the assignable bean is not an activity.
   * @param queue Queue to assign the activity to
   * @param group cannot be null
   * @return true if the assignment is successful
   */
  public boolean assignActivityToQueue(entity.AssignableQueue queue, entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue, group);
  }
  
  /**
   * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
   * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
   * see the preferred method for details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param attributeBasedAssignmentCriteria The criteria used to perform the search
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
   */
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria);
  }
  
  /**
   * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
   * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
   * see the preferred method for details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param attributeBasedAssignmentCriteria The criteria used to perform the search
   * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
   *                         the current group. If false, only searches users in the current group
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
   */
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups);
  }
  
  /**
   * Assigns an assignable item to a user who satisfies the constraints defined in the attributeBasedAssignmentCriteria
   * parameter. This is done by:
   * <p/>
   * 1) Find the set of users who are members of the supplied group, and optionally its subgroups, and who satisfy
   * the supplied attribute-based search criteria. (If the group parameter is null, then no group restriction applies)
   * 2) Select from the resulting set of users via the round-robin rotation mechanism. A separate round-robin state will
   * be maintained for each unique assignment criteria entity and group.
   * @param attributeBasedAssignmentCriteria the criteria to be satisfied by the selected user
   * @param includeSubGroups if true, searches  all the users in any subgroups of the group parameter as well as those in
   *                         that group. If false, only searches users in the group
   * @param group the group.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups, group);
  }
  
  /**
   * Assigns the entity to the group requested.  If group is null, nothing is done.
   * @param group the group to which the entity should be assigned
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroup(entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroup(group);
  }
  
  /**
   * Uses the group type group selector to choose the next subgroup under the "current" group (retrieved from the
   * current state of the Assignment Engine) to receive the assignable. If there is no current group, the root group
   * from the Assignment Engine is used.
   * <p/>
   * This method will search breadth-first through the group tree, starting with the current group, and will
   * return the first group found with the approriate type.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param requiredGroupType A GroupType typecode; the assignment will be restricted to a group of this type. If null, then
   *                          no group will be found.
   * @return true if the assignment is successful, false otherwise
   * @deprecated This method of assignment is deemed useless, because it always returns the first group found with the
   *             required type. Use <code>assignGroupByRoundRobin()</code> instead, so that the assignment will be rotated among
   *             the matching groups.
   */
  public boolean assignGroupByGroupType(typekey.GroupType requiredGroupType) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByGroupType(requiredGroupType);
  }
  
  /**
   * Assigns this entity to a group based on region assignments. This is done in the following manner:
   * <p/>
   * Alternative signature; see <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param groupType Only groups whose GroupType property matches this value will be considered
   * @param address An address to use for location-based assignment
   * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the current group
   *                           but also through all its subgroups.
   * @return true if the assignment is successful, false otherwise
   * @deprecated Use <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> insteaed, to make the recursion explicit.
   */
  public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly);
  }
  
  /**
   * Assigns this entity to a group based on region assignments. This is done in the following manner:
   * <p/>
   * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
   * would typically be the zip code)
   * 2) Search for the groups within the parameter group whose region assignment configuration includes that zip code.
   * 3) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
   * 4) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
   * 5) If more than one group is found, then round-robin among the resulting groups based on the zone which was used to
   * find the match.
   * <p/>
   * For example if we find no groups that match by zip but a few that match by county then
   * assignment will round robin through the ones that match by county and will ignore any others that match by state.
   * Matching is case-insensitive.
   * <p/>
   * Search is restricted to the sub-groups of the specified group and optionally all of its children. If there is no
   * specified group, then the root group is used. Note that starting from the root group is potentially costly in
   * performance time. If invoked from outside an Assignment Rule, this method will take no action and return false.
   * @param groupType Only groups whose GroupType property matches this value will be considered
   * @param address An address to use for location-based assignment
   * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the parameter
   *                           group but also through all its subgroups.
   * @param parentGroup The group whose subgroups will be considered for assignment
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly, entity.Group parentGroup) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly, parentGroup);
  }
  
  /**
   * Uses the round robin group selector to choose the next subgroup under the current group with the
   * appropriate type to be assigned to this entity.
   * <p/>
   * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
   *                          then no group will be found
   * @return true if the assignment is successful, false otherwise
   * @deprecated Use <code>assignGroupByRoundRogin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
   */
  public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType);
  }
  
  /**
   * Uses the round robin group selector to choose the next subgroup under the current group with the
   * appropriate type to be assigned to this entity.
   * <p/>
   * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
   *                          then no group will be found
   * @param includeSubGroups If true, all the user
   * @return true if the assignment is successful, false otherwise
   * @deprecated Use <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
   */
  public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType, includeSubGroups);
  }
  
  /**
   * Uses the round robin algorithm to choose the next group to receive the assignable.
   * <p/>
   * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
   * taken into account, but each Group's load factor is used to determine relative assignment frequency; essentially, a
   * group with a lower load factor than the others' is periodically skipped.
   * <p/>
   * The round-robin rotation for each group type (and boolean value) is independent of the others, so only identical
   * calls will impact the user who is "next" in the rotation.
   * <p/>
   * If no group is specified, the root group will be used instead. Note that starting from the root group is
   * potentially costly in performance time.
   * <p/>
   * When group type is specified, the load factor is <b>NOT</b> used.
   * @param groupType Only groups whose GroupType property matches this value will be considered
   * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter
   *                         group's immediate children but also through all its subgroups.
   * @param parentGroup The group whose subgroups will be considered for assignment
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroupByRoundRobin(typekey.GroupType groupType, boolean includeSubGroups, entity.Group parentGroup) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(groupType, includeSubGroups, parentGroup);
  }
  
  /**
   * Uses the supplied dynamic assignment strategy implementation to find a group assignment for the current entity. See
   * {@link gw.api.assignment.DynamicGroupAssignmentStrategy} for more details on what that implementation should look like and how it
   * is used by the implementation of this method.
   * @param dynamicGroupAssignmentStrategy the {@link gw.api.assignment.DynamicGroupAssignmentStrategy} to be used to do the assignment
   * @param parentGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
   * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignGroupDynamically(gw.api.assignment.DynamicGroupAssignmentStrategy dynamicGroupAssignmentStrategy, entity.Group parentGroup, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupDynamically(dynamicGroupAssignmentStrategy, parentGroup, includeSubGroups);
  }
  
  /**
   * Request manual assignment of the entity to the supplied user.
   * <p/>
   * Request is granted only if the responsible user has review assignment permission.
   * <p/>
   * Successful completion will cause a review activity to be created indicating that the assignment needs to be
   * completed, and that activity will be assigned to the supplied user
   * @param responsibleUser The person who should carry out the assignment
   * @return true if responsibleUser has review assignment permission, false otherwise.
   */
  public boolean assignManually(entity.User responsibleUser) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManually(responsibleUser);
  }
  
  /**
   * Request manual assignment of the entity, with the responsibilty round-robbined among members of either the
   * currently assigned group or the specified group if no group is currently assigned
   * <p/>
   * {@see assignManually} for more information about "manual" assignment.
   * @param group the group to use if this entity does not have a currently assigned group.
   * @return true if a user was found to give the manual assignment action to, false if no sure user was found
   */
  public boolean assignManuallyByRoundRobin(entity.Group group) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManuallyByRoundRobin(group);
  }
  
  /**
   * Assigns the entity to the user and group to which the associated claim is currently assigned.
   * Caller is responsible for ensuring that the entity is linked to an assigned claim. If the resulting assignment
   * is invalid for any reason, then an IllegalAssignmentException will be thrown.
   * 
   * Note that this method is currently only valid for an Activity, Exposure, or Matter.
   */
  public void assignToClaimOwner() {
    ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimOwner();
  }
  
  /**
   * Assign to the claim user with the given role. The search for a user with
   * a matching role is done in the following steps:
   * <ol>
   * <li>If assigning an activity associated with an exposure search the
   *     exposure first
   * <li>Search the claim users
   * <li>If not assigning an activity associated with an exposure, search all
   *     the exposures
   * </ol>
   * If the search finds a match at any step, it stops. If the match is unique
   * it does the assignment and returns true. If the match is not unique it
   * returns false. If the search goes through all steps without finding a
   * match it returns false
   * @param userRole the desired user role
   * @return true if a unique match was found and the assignment was made, false
   *   otherwise
   */
  public boolean assignToClaimUserWithRole(typekey.UserRole userRole) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimUserWithRole(userRole);
  }
  
  /**
   * Assigns the item to the creator of the supplied entity, and to one of the user's groups. If no group
   * is found for the user, uses the group based on the rule engine state (if available).
   * @param sourceEntity The entity to query for the id of the creator.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignToCreator(entity.Editable sourceEntity) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity);
  }
  
  /**
   * Assigns this entity to the user who created the supplied entity, and to the first group in the user's list of member groups. In the
   * unlikely case that the user does not belong to any groups, then the entity will be assigned to the supplied
   * default group.
   * <p/>
   * If the supplied entity has not been persisted yet, and therefore has no recorded creator, then the current user will be
   * used instead.
   * @param sourceEntity The entity to query for the id of its creator.
   * @param defaultGroup The default group to use if the assigned user is not a member of any group.
   * @return true if the assignment is successful, false otherwise
   * @deprecated This signature is a little confusing, because the defaultGroup parameter should almost never be
   *             necessary, since in the current system a user almost never belongs to no groups. Use assignToCreator(EditableBean)
   *             instead
   */
  public boolean assignToCreator(entity.Editable sourceEntity, entity.Group defaultGroup) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity, defaultGroup);
  }
  
  /**
   * Another name for {@link #assignToQueue()}, making it more explicit that the activity will be assigned to the FNOL
   * queue. See that method for more details.
   * @return true if the assignment is successful, false otherwise
   * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
   *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
   *             named queue.
   */
  public boolean assignToFNOLQueue() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToFNOLQueue();
  }
  
  /**
   * Assigns this entity to the user and group to which the entity's "issue" is assigned. Which entity is used
   * to find the user and group is application-dependent. For example, in CC this will assign the entity to
   * the owner of the related exposure (if any) or claim. This method is currently only meaningful for CC.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignToIssueOwner() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToIssueOwner();
  }
  
  /**
   * Assigns the entity to the previously assigned user.  The current group is kept track of for the client.  If there is no current
   * group, nothing is done and a warning is logged.
   * <p/>
   * This is no longer a very useful method, and should be considered deprecated, in favor of simply assigning directly to the
   * PreviousUser and PreviousGroup properties.
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignToPreviousOwner() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToPreviousOwner();
  }
  
  /**
   * Assign an activity to the FNOL queue of items assigned to the "current" group (retrieved from the current state of
   * the Assignment Engine). If the entity to be assigned is not an activity nothing is done,
   * false is returned and a warning is logged.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @return true if the assignment is successful, false otherwise
   * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
   *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
   *             named queue.
   */
  public boolean assignToQueue() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToQueue();
  }
  
  /**
   * Assigns the entity to the user requested within the "current" group (retrieved from the current state of
   * the Assignment Engine).  If the user is null or is not a member of the current group, nothing is done and false is returned.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param user the user to be assigned
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assign(Group, User)</code> instead
   */
  public boolean assignUser(entity.User user) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUser(user);
  }
  
  /**
   * Directly assigns the entity to the specified user and one of the groups the user belongs to.
   * <p/>
   * If the user does not have sufficient permission to accept the assignment, false is returned
   * @param user The user to which the entity should be assigned
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserAndDefaultGroup(entity.User user) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserAndDefaultGroup(user);
  }
  
  /**
   * Uses the location-based assigner to assign an Assignable based on a given address.
   * <p/>
   * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param address An address to use for location-based assignment
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
   */
  public boolean assignUserByLocation(entity.Address address) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address);
  }
  
  /**
   * Uses the location-based assigner to assign an Assignable based on a given address.
   * <p/>
   * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param address An address to use for location-based assignment
   * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
   *                         current group.
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
   */
  public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups);
  }
  
  /**
   * Assigns this entity to a user based on region assignments. This is done in the following manner:
   * <p/>
   * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
   * would typically be the zip code)
   * 2) Search for the users whose region assignment configuration includes that zip code.
   * 3) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
   * 4) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
   * 5) If more than one user is found, then round-robin among the resulting users based on the zone which was used to
   * find the match.
   * <p/>
   * For example if we find no users that match by zip but a few that match by county then
   * assignment will round robin through the ones that match by county and will ignore any others that match by state.
   * Matching is case-insensitive.
   * <p/>
   * Search is restricted to the users of the group (and optionally its subgroups). It is an error if there is no
   * group.
   * @param address An address to use for location-based assignment
   * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
   *                         that group.
   * @param group the group whose users will be considered for the assignment
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups, entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups, group);
  }
  
  /**
   * A combination of {@link #assignUserByLocation} and {@link #assignByUserAttributes} .
   * <p/>
   * Alternative signature; see <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param address An address to use for location-based assignment
   * @param attributeBasedAssignmentCriteria the user attributes to match against
   * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
   *                         current group.
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> instead.
   */
  public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups);
  }
  
  /**
   * Assigns this entity to the user matching the attribute criteria whose region assignments contain the supplied location. This method
   * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
   * once that set is determined it applies the same algorithm used by {@link #assignUserByLocation}
   * to find a user whose region assignments contain the supplied location.
   * <p/>
   * If no users match the supplied criteria, then assignment will fail and false will be returned.
   * @param address An address to use for location-based assignment
   * @param attributeBasedAssignmentCriteria the user attributes to match against
   * @param includeSubGroups if true, then include users in any sub groups of the parameter  group as well as users in
   *                         that group.
   * @param group the group whose members should be considered for the assignment
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
  }
  
  /**
   * Assigns this entity to the user matching the attribute criteria who is closest to the supplied location. This method
   * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
   * once that set is determined it applies the same algorithm used by {@link #assignUserByLocationUsingProximitySearch}
   * to choose the closest one.
   * <p/>
   * If no users match the supplied criteria, then assignment will fail and false will be returned.
   * @param address An address to use for location-based assignment
   * @param attributeBasedAssignmentCriteria the user attributes to match against
   * @param includeSubGroups if true, then include users in any sub groups of the supplied group as well as users in the
   *                         parameter group.
   * @param group The group whose users should be considered for the assignment
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByLocationUsingProximityAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximityAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
  }
  
  /**
   * Assigns this AssignmentBean to the user in the current group with the closest address to the given address,
   * measured by great-circle distance along the surface of the earth.
   * <p/>
   * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param address An address to use as the center of the proximity search
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByLocationUsingProximitySearch(entity.Address address) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address);
  }
  
  /**
   * Assigns this AssignmentBean to the user with the closest address to the given address, measured by a great-circle
   * distance along the surface of the earth.
   * <p/>
   * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param address An address to use for location-based assignment
   * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
   *                         current group.
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups);
  }
  
  /**
   * Assigns this entity to the user with the closest address to the specified address, measured by a great-circle
   * distance along the surface of the earth. This includes the following steps:
   * <p/>
   * 1) Geocode the supplied address which will serve as the center of the search. (If necessary, location may already be geocoded)
   * 2) For each user in the specified group, compute the distance from their location (using their Contact entity's primary address)
   * to the supplied location.
   * 2a) If the includeSubGroups parameter is true, repeat this process with all of the descendant groups of the specified group
   * 3) Return the user who is closest to the specified location
   * <p/>
   * If the geocoding attempt fails for the supplied location, an error will be logged and false returned
   * <p/>
   * Search begins with the users of the parameter group; it is an error if there is no group.
   * @param address An address to use for location-based assignment
   * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
   *                         that group.
   * @param group the group whose members should be considered for assignment. May not be null
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups, entity.Group group) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups, group);
  }
  
  /**
   * !WARNING! This can be very slow compared to other assignment operations.
   * <p/>
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * If there is more than one user in the returned search, selects one of them
   * based on regular round-robin search.
   * <p/>
   * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.Geocode.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
   * @param asc a valid User Search Criteria
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
   */
  public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc);
  }
  
  /**
   * !WARNING! This can be very slow compared to other assignment operations.
   * <p/>
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * If there is more than one user in the returned search, selects one of them
   * based on regular round-robin search. (To always assign to the closest user,
   * set the cap to 1.)
   * <p/>
   * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
   * @param asc a valid CC Assignment Search Criteria
   * @param includeSubGroups include subgroups in search
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
   */
  public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, boolean includeSubGroups) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, includeSubGroups);
  }
  
  /**
   * !WARNING! This can be very slow compared to other assignment operations.
   * <p/>
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * If there is more than one user in the returned search, selects one of them
   * based on regular round-robin search. (To always assign to the closest user,
   * set the cap to 1.)
   * <p/>
   * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
   * @param asc a valid User Search Criteria
   * @param cap the maximum number of users to return in the search
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
   */
  public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap);
  }
  
  /**
   * !WARNING! This can be very slow compared to other assignment operations.
   * <p/>
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * If there is more than one user in the returned search, selects one of them
   * based on regular round-robin search. (To always assign to the closest user,
   * set the cap to 1.)
   * <p/>
   * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
   * @param asc a valid CC Assignment Search Criteria
   * @param cap the maximum number of users to return in the search
   * @param includeSubGroups include subgroups in search
   * @return true if the assignment is successful
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
   */
  public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups);
  }
  
  /**
   * !WARNING! This can be very slow compared to other assignment operations.
   * <p/>
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * If there is more than one user in the returned search, selects one of them
   * based on regular round-robin search. (To always assign to the closest user,
   * set the cap to 1.)
   * <p/>
   * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * @param asc a valid CC Assignment Search Criteria
   * @param cap the maximum number of users to return in the search
   * @param includeSubGroups include subgroups in search
   * @param currentGroup the group within which the search will be performed
   * @return true if the assignment is successful
   */
  public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups, entity.Group currentGroup) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups, currentGroup);
  }
  
  /**
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * <p/>
   * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * <p/>
   * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
   * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
   * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
   * and should be used with care.
   * @param usc a valid User Search Criteria
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc);
  }
  
  /**
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * <p/>
   * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * <p/>
   * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
   * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
   * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
   * and should be used with care.
   * @param usc a valid User Search Criteria
   * @param includeSubGroups include subgroups in search
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, boolean includeSubGroups) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, includeSubGroups);
  }
  
  /**
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * <p/>
   * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * <p/>
   * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
   * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
   * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
   * and should be used with care.
   * @param usc a valid User Search Criteria
   * @param cap the maximum number of users to return in the search
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap);
  }
  
  /**
   * Assigns this AssignmentBean to a user based on a User Search by Proximity.
   * <p/>
   * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * <p/>
   * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
   * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
   * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
   * and should be used with care.
   * @param usc a valid User Search Criteria
   * @param cap the maximum number of users to return in the search
   * @param includeSubGroups include subgroups in search
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
   */
  public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups);
  }
  
  /**
   * Assigns this entity to a user based on a User Search by Proximity. This includes the following steps:
   * <p/>
   * 1) Geocode the location which will serve as the center of the search, accessed through <code>usc.getContact().getAddress()</code>.
   * (If necessary; the location may already be geocoded)
   * 2) Finds a list of users who satisfy the user search criteria, which may include proximity restrictions.
   * The specified cap is used to limit the number of users in this list; in the case of proximity restrictions, the users farthest from the search center are trimmed.
   * 3) Use the round-robin algorithm to pick one of the users. This means that repeated, identical calls to this
   * method will rotate through the resulting set of users to find the user to return.
   * <p/>
   * Note that the round-robin rotation is based on the exact UserSearchCriteria used. One implication of this is that
   * the location used should be as general as possible (such as just a city, state or zip, rather than a specific
   * street address) to get the benefit of the round-robin processing and reduce the load on the system.
   * <p/>
   * To always assign to the closest user, set the cap to 1.
   * <p/>
   * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
   * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
   * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
   * and should be used with care.
   * <p/>
   * The user search criteria should be set up via gw.api.geocode.GeocodeScriptHelper.setupUserProximitySearch()
   * in order to ensure that the proximity search criteria are set up properly.
   * <p/>
   * The group parameter may be null. If it is not null, it will be used as part of the search
   * @param usc a valid User Search Criteria, may not be null
   * @param cap If greater than zero, the maximum number of users to include for round robin from the search results.
   *                         If -1, all users from the search results will be included in the round robin.
   * @param includeSubGroups if the sub group should be used for search
   * @param group The group from where the search should be conducted
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups, entity.Group group) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups, group);
  }
  
  /**
   * Assigns a user within the "current" group (retrieved from the current state of
   * the Assignment Engine), rotating through the set of users in the group each time the method is called.
   * <p/>
   * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
   */
  public boolean assignUserByRoundRobin() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin();
  }
  
  /**
   * Assigns a user within the "current" group (retrieved from the current state of
   * the Assignment Engine), rotating through the set of users in the group each time the method is called.
   * <p/>
   * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
   * <p/>
   * If invoked from outside an Assignment Rule, will take no action and return false.
   * @param includeSubGroups if this parameter is true the selector will round-robin not only through the current group
   *                         but also through all its subgroups.
   * @return true if the assignment is successful, false otherwise
   * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
   */
  public boolean assignUserByRoundRobin(boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups);
  }
  
  /**
   * Uses the round robin algorithm to choose the next user from the specified group or to receive the assignable.
   * <p/>
   * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
   * taken into account, but each User's load factor is used to determine relative assignment frequency; essentially, a
   * user with a lower load factor than the others' is periodically skipped.
   * <p/>
   * The round-robin rotation for each group (and boolean value) is independent of the others, so only identical
   * calls will impact the user who is "next" in the rotation.
   * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter group
   *                         but also through all its subgroups.
   * @param group may not be null
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserByRoundRobin(boolean includeSubGroups, entity.Group group) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups, group);
  }
  
  /**
   * Uses the supplied dynamic assignment strategy implementation to find an assignment for the current entity. See
   * {@link gw.api.assignment.DynamicUserAssignmentStrategy} for more details on what that implementation should look like and how it
   * is used by the implementation of this method.
   * @param dynamicUserAssignmentStrategy the {@link gw.api.assignment.DynamicUserAssignmentStrategy} to be used to do the assignment
   * @param group The group to be used during the assignment (usually the group to which the entity is or should be assigned)
   * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
   * @return true if the assignment is successful, false otherwise
   */
  public boolean assignUserDynamically(gw.api.assignment.DynamicUserAssignmentStrategy dynamicUserAssignmentStrategy, entity.Group group, boolean includeSubGroups) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserDynamically(dynamicUserAssignmentStrategy, group, includeSubGroups);
  }
  
  /**
   * Assigns the given User/Group pair to the given role on this assignable object.
   * If the role is exclusive, replaces the existing assignment. Otherwise, adds a
   * new assignment for the given User/Group pair, if none already exists for that
   * role.
   * @param user 
   * @param group 
   * @param role 
   */
  public entity.UserRoleAssignment assignUserRole(entity.User user, entity.Group group, typekey.UserRole role) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).assignUserRole(user, group, role);
  }
  
  /**
   * Invokes the Assignment Engine, which will process the configured Assignment Rules to come up with an assignment
   * for the current entity.
   * <p/>
   * May not be invoked from within an Assignment Rule, since the Assignment Engine may not be invoked recursively. If invoked
   * from within an Assigment Rule, an error will be logged and false will be returned.
   * @return true if an assignment has been found, false otherwise
   */
  public boolean autoAssign() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign();
  }
  
  /**
   * <p>
   * Invokes the Assignment Enging to assign the item to the specified group and user.
   * If userID is null, the item will be assigned using the group's assignment rules.
   * If userID is specified, assignment will be made directly to the group and
   * user.  If the engine cannot assign the item to the requested group/user,
   * it will throw an exception indicating the reason.
   * </p>
   * If a user is specified, caller is responsible for ensuring that the
   * user is a member of group.
   * </p>
   * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
   * @param group The group to which the item should be assigned - must be
   *              specified.  If not known, use autoAssign(item) instead.
   * @param user The user to which the item should be assigned; if null an
   *              appropriate user will be selected by group assignment rules.
   * @return true if the assignment is successufl, false otherwise
   */
  public boolean autoAssign(entity.Group group, entity.User user) {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign(group, user);
  }
  
  /**
   * Assigns the UserRole for this assignable item.
   * This uses rules to find the right assignment
   * @param role The role to assign
   */
  public boolean autoAssignRole(typekey.UserRole role) {
    return ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).autoAssignRole(role);
  }
  
  /**
   * Returns true if this claim is in the open state and the specified
   * user is allowed to close it.
   * @param user the User whose permissions should be checked.
   * @return true if the claim can be closed by this user.
   */
  public boolean canClose(entity.User user) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canClose(user);
  }
  
  /**
   * Determines whether this owner can be edited.
   */
  public boolean canEdit() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
  }
  
  /**
   * Can the given address be edited? The address argument should be one of the addresses
   * returned by {@link #getAddresses()}. Returns false if the address belongs to a property
   * or contact on the policy and the policy is verified, otherwise returns true. Returns
   * false if address is null
   * @param address The address to check
   * @return True if can edit this address
   */
  public boolean canEditAddress(entity.Address address) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditAddress(address);
  }
  
  /**
   * Can the given property be edited? The property argument should be one of the properties
   * returned by {@link #getProperties()}. Returns false if the property belongs to the
   * policy and the policy is verified, otherwise returns true. Returns false if property
   * is null
   * @param property The property to check
   * @return True if can edit property
   */
  public boolean canEditProperty(entity.PolicyLocation property) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditProperty(property);
  }
  
  /**
   * Can the given vehicle be edited? The vehicle argument should be one of the vehicles
   * returned by {@link #getVehicles()}. Returns false if the vehicle belongs to the
   * policy and the policy is verified, otherwise returns true. Returns false if vehicle
   * is null
   * @param vehicle The vehicle to check
   * @return True if vehicle can be edited
   */
  public boolean canEditVehicle(entity.Vehicle vehicle) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditVehicle(vehicle);
  }
  
  /**
   * Determines if claim can have a claimant at the claim level by checking that the Claimant role is NOT prohibited for
   * this loss typel.
   * @return true if this claim can have a claimant at the claim level
   */
  public boolean canHaveClaimantOnClaim() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canHaveClaimantOnClaim();
  }
  
  /**
   * Returns true if the claim is flagged AND the user is allowed to clear the flag.
   * @param user the User whose permissions should be checked.
   * @return true iff the claim is flagged AND the user is allowed to clear the flag.
   */
  public boolean canRemoveFlag(entity.User user) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canRemoveFlag(user);
  }
  
  /**
   * Returns true if the claim is in the closed state and the user is allowed
   * to reopen it.
   * @param user the User whose permissions should be checked.
   * @return true iff the claim is closed AND the user is allowed to reopen the claim.
   */
  public boolean canReopen(entity.User user) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canReopen(user);
  }
  
  /**
   * Check if the given user should be able to view the given document snapshot, taken from a
   * claim snapshot. Checks the security type of the document and also whether it is associated
   * with an exposure that the user cannot view.
   * @param user the user who wants to view the document
   * @param documentSnapshot the document snapshot object
   * @throws IllegalArgumentException if the given object is not a document snapshot
   * @return true if the user can view the document snapshot, false otherwise
   */
  public boolean canViewDocumentSnapshot(entity.User user, java.lang.Object documentSnapshot) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canViewDocumentSnapshot(user, documentSnapshot);
  }
  
  /**
   * Cancel the creation of this claim that has been saved as Draft -- marks
   * the claim and its exposures for purge.
   * @throws ClaimOpenException if the indicated claim is not draft state (note
   *                               might be closed, not open, but the point is you can't cancel it).
   * @throws PurgeBlockedException if another object in the database references this Claim.
   * @throws com.guidewire.pl.system.exception.ActiveMessageException if there is an active integration message for this claim.
   * @throws EntityStateException If the claim is not in a cancellable state
   */
  public void cancelClaim() throws com.guidewire.pl.system.exception.ActiveMessageException, com.guidewire.pl.system.exception.PurgeBlockedException, com.guidewire.cc.system.exception.ClaimOpenException, gw.api.webservice.exception.EntityStateException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).cancelClaim();
  }
  
  /**
   * Checks for any active Messages against this claim or any Contacts in the claim
   * graph - including related contacts.
   * @return boolean true if any active Messages exist
   */
  public boolean checkActiveMessagesForClaimAndContacts() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).checkActiveMessagesForClaimAndContacts();
  }
  
  /**
   * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
   * object describing the problem.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkAddRole(role, contact);
  }
  
  /**
   * Determines whether or not the given role can be removed the given number of times.
   * @param role 
   * @param count number of instances of the role to be removed
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRemoveRole(role, count);
  }
  
  /**
   * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
   * of adding a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
   * instead.
   * @param role 
   * @param contact 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleAdded(role, contact);
  }
  
  /**
   * Checks the removal of the given role, after it has occurred. To check the validity
   * of removing a role before it has occurred, use
   * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
   * instead.
   * @param role 
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleRemoved(role);
  }
  
  /**
   * Clears the flag from a claim
   * @param noteString A note to add while clearing the flag.
   */
  public void clearFlag(java.lang.String noteString) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).clearFlag(noteString);
  }
  
  /**
   */
  public void clearRoleCache() {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
  }
  
  /**
   * Closes the claim.
   * @param outcome The outcome of the closed claim
   * @param reason The reason for closing the claim
   * @throws CloseException If an error occurs closing the claim
   * @throws EntityValidationException A validation exception occurs
   */
  public void close(typekey.ClaimClosedOutcomeType outcome, java.lang.String reason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).close(outcome, reason);
  }
  
  /**
   * This method is only available inside the Assignment Engine. Request manual confirmation of the entity's current assignment by the specified user.
   * <p/>
   * If the specified user does not have the review assignment permission, then does nothing and returns false.
   * Otherwise, a review Activity will be created and assigned to the user for further processing.
   * @param responsibleUser The person who should confirm the assignment
   * @return true if responsibleUser has review assignment permission, false otherwise.
   */
  public boolean confirmManually(entity.User responsibleUser) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManually(responsibleUser);
  }
  
  /**
   * Request manual confirmation of the entity's current assignment, with the responsibility round-robined among members
   * of the given group.
   * <p/>
   * Only users in the specified group (not subgroups)  who have the review assignment permission will be considered. The
   * round-robin rotation used here is independent of the rotation used by the assignUserByRoundRobin() methods.
   * <p/>
   * If no user is found, does nothing and returns false. Otherwise, a review Activity will be created and assigned to the user for further processing.
   * @param group the group whose users should be considered in the round-robin rotation
   * @return true if a user was found to give the confirmation action to, false if no such user was found
   */
  public boolean confirmManuallyByRoundRobin(entity.Group group) {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManuallyByRoundRobin(group);
  }
  
  /**
   * Convenience method; creates an activity using newActivity and the given
   * pattern, plus the following
   * <ul>
   * <li>sets the given fields</li>
   * <li>Uses activity pattern to calculate the escalation date and target date.  If the start date for the target date or escalation date
   * is null, the respective field in the activity pattern will be used for the calculation</li>
   * <li>calls {@link entity.Activity#setUp(gw.api.assignment.Assignee)} to assign it.</li>
   * </ul>
   * @param exposure exposure to create activity on
   * @param pattern the activity pattern used to create the activity
   * @param subject subject field for the activity
   * @param description description for the activity
   * @param priority priority field for the activity
   * @param mandatory mandatory field for the activity
   * @param targetStartDate If provided, this will be used as start date for the target date calculation
   * @param escalationStartDate If provided, this will be used as start date for escalation date calculation
   * @return created activity
   */
  public entity.Activity createActivity(entity.Exposure exposure, entity.ActivityPattern pattern, java.lang.String subject, java.lang.String description, typekey.Priority priority, java.lang.Boolean mandatory, java.util.Date targetStartDate, java.util.Date escalationStartDate) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createActivity(exposure, pattern, subject, description, priority, mandatory, targetStartDate, escalationStartDate);
  }
  
  /**
   * Convenience method; creates an activity using newActivity and the given
   * pattern, then calls {@link entity.Activity#setUp(gw.api.assignment.Assignee)} to assign it.
   * @param exposure The exposure
   * @param pattern The activity pattern
   * @return The created activity pattern
   */
  public entity.Activity createActivityFromPattern(entity.Exposure exposure, entity.ActivityPattern pattern) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createActivityFromPattern(exposure, pattern);
  }
  
  /**
   * Called after the assignable is assigned to create a new history event recording the assignment. May
   * return null for some assignable types, meaning that no history event was created
   * @param assignable the assignable containing details of the new assignment
   * @return the new history event, or null
   */
  public entity.History createAssignmentHistoryEvent(entity.Assignable assignable) {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentHistoryEvent(assignable);
  }
  
  /**
   * Create a new assignment review activity which represents the responsibility to assign this
   * assignable. Assignment review activities are used for manual assignment.
   * @return a new assignment review activity which refers to this assignable
   */
  public entity.Activity createAssignmentReviewActivity() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentReviewActivity();
  }
  
  /**
   * Creates a claim-level check on this claim with the given parameters.  The check
   * will contain one payment with one line item.  To create a check with a payment
   * that is coded to a particular exposure rather than being claim-level, the proper
   * method to use is one of the versions of {@link entity.Exposure#createCheck}
   * @param payee The payee of the check.
   * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other)
   * @param recipient The contact the check should be sent to
   * @param mailingAddress The address the check should be sent to
   * @param reportabilityType The reportability type of the check
   * @param costType The costtype for the payment - cannot be null, an IllegalArgumentException will be thrown.
   * @param costCategory The costcategory for the payment - cannot be null, an IllegalArgumentException will be thrown.
   * @param paymentType The paymenttype for this payment - can be null, in which case the payment type will default to 'Partial'
   * @param lineCategory The category for the payment line item
   * @param checkAmount The amount of the payment line item (and therefore the check)
   * @param comments Comments on this check
   * @param memo The memo for the check
   * @param payTo The pay to for the check
   * @param scheduledSendDate The scheduled send date of the check
   * @param requestingUser The user requesting this check @return the created check
   * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the check
   * @throws com.guidewire.pl.system.exception.WorkflowValidationException if there is a problem during workflow validation
   * @throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
   *          while trying to get the deductions.
   * @return The created check
   * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Claim and then create the check
   */
  public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
  }
  
  /**
   * Creates a claim-level check on this claim with the given parameters.  The check
   * will contain one payment with one line item.  To create a check with a payment
   * that is coded to a particular exposure rather than being claim-level, the proper
   * method to use is one of the versions of {@link Exposure#createCheck}
   * @param payee The payee of the check.
   * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other)
   * @param recipient The contact the check should be sent to
   * @param mailingAddress The address the check should be sent to
   * @param reportabilityType The reportability type of the check
   * @param costType The costtype for the payment - cannot be null, an IllegalArgumentException will be thrown.
   * @param costCategory The costcategory for the payment - cannot be null, an IllegalArgumentException will be thrown.
   * @param paymentType The paymenttype for this payment - can be null, in which case the payment type will default to 'Partial'
   * @param lineCategory The category for the payment line item
   * @param checkAmount The amount of the payment line item (and therefore the check)
   * @param checkCurrency The currency of the check. null value uses claim currency.
   * @param transToClaimExchangeRateOverride Use null for the current market rate. A positive non-null value sets Check.OverrideExchangeRate to true and sets this value as the TransToClaim exchange rate.
   * @param customExchangeRateDescription Use null if transToClaimExchangeRateOverride is null. Otherwise, describes the overriden exchange rate.
   * @param claimAmountOverride Please use null. A non-null value overrides the ClaimAmount calculated from the checkAmount and exchange rate.
   * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
   * @param comments Comments on this check
   * @param memo The memo for the check
   * @param payTo The pay to for the check
   * @param scheduledSendDate The scheduled send date of the check
   * @param requestingUser The user requesting this check @return the created check
   * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the check
   * @throws com.guidewire.pl.system.exception.WorkflowValidationException if there is a problem during workflow validation
   * @throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
   *          while trying to get the deductions.
   * @return the new check
   * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Claim and then create the check
   */
  public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, typekey.Currency checkCurrency, java.math.BigDecimal transToClaimExchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, checkCurrency, transToClaimExchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, memo, payTo, scheduledSendDate, requestingUser);
  }
  
  /**
   * Creates a new association linking to this claim. We assume the claim's bundle
   * is editable, etc.  Equivalent to calling createClaimAssociation(false)
   * @return the newly created ClaimAssociation object.
   */
  public entity.ClaimAssociation createClaimAssociation() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimAssociation();
  }
  
  /**
   * Creates a new association linking to this claim. We assume the claim's bundle
   * is editable, etc.
   * @param isPrimaryClaim true if this claim should be the primary claim in the association
   * @return the newly created ClaimAssociation object.
   */
  public entity.ClaimAssociation createClaimAssociation(boolean isPrimaryClaim) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimAssociation(isPrimaryClaim);
  }
  
  /**
   * Creates a ClaimContact for this Claim and the given Contact.
   * <p/>
   * If the Contact is linked to the Address Book, then this method does two additional things:<ol>
   * <li>The Claim's related Contact graph will be searched for a matching Contact. If a match is found, that Contact
   * will be used to create the ClaimContact instead.</li>
   * <li>The Claim's ContactContact graph will be traversed. Any ContactContacts with missing FKs but
   * matching link ID will be "materialized" with the input Contact.</li>
   * </ol>
   * <p/>
   * Note that this method is <em>not</em> suitable for use with a contact that has just been picked from the address
   * book. Use claimparties.ClaimContactUtil.createClaimContact(claim, tempContact) for contacts picked from the
   * address book.
   * @param contact The contact
   * @return The claim contact
   */
  public entity.ClaimContact createClaimContact(entity.Contact contact) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimContact(contact);
  }
  
  /**
   * Adds the custom history event to this claim.
   * @param type the custom history type
   * @param description the description
   * @return the created history event.
   */
  public entity.History createCustomHistoryEvent(typekey.CustomHistoryType type, java.lang.String description) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCustomHistoryEvent(type, description);
  }
  
  /**
   * Puts a task on a singleton document creation queue to create a document
   * on the claim in an asynchronous (from the user's perspective) manner
   * @param templateName The name of the document template
   * @param docName The document name
   * @param docType The document type
   * @param statusType The document status type
   * @param securityType The security type of the document
   * @param exposure The associated exposure
   * @param claimant The claimant contact
   * @param valuesMap The values map to set on the document creator
   * @param onErrorPattern The error activity pattern to set on the document creator
   */
  public void createDocument(java.lang.String templateName, java.lang.String docName, typekey.DocumentType docType, typekey.DocumentStatusType statusType, typekey.DocumentSecurityType securityType, entity.Exposure exposure, entity.Contact claimant, java.util.Map valuesMap, entity.ActivityPattern onErrorPattern) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createDocument(templateName, docName, docType, statusType, securityType, exposure, claimant, valuesMap, onErrorPattern);
  }
  
  /**
   * Creates a new reserve line on this claim with the given reserving currency.
   * The new reserve line's exposure, cost type, and cost category are left
   * null, meaning the new reserve line is primarily useful as a placeholder in
   * the UI. If the given reserving currency is null, it defaults to this
   * claim's currency.
   * @param reservingCurrency 
   */
  public entity.ReserveLine createDummyReserveLine(typekey.Currency reservingCurrency) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createDummyReserveLine(reservingCurrency);
  }
  
  /**
   * Creates a new History entry of the given Type related to the given Exposure
   * @param type the history type
   * @param exposure the related Exposure
   * @param description the description
   * @return the created history event.
   */
  public entity.History createExposureHistoryEvent(typekey.HistoryType type, entity.Exposure exposure, java.lang.String description) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createExposureHistoryEvent(type, exposure, description);
  }
  
  /**
   * Creates a new History entry of the given Type
   * @param type the history type
   * @param description the description
   * @return the created history event.
   */
  public entity.History createHistoryEvent(typekey.HistoryType type, java.lang.String description) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createHistoryEvent(type, description);
  }
  
  /**
   * Creates a new History entry of the given Type related to the given Matter
   * @param type the history type
   * @param matter the related Matter
   * @param description the description
   * @return the created history event.
   */
  public entity.History createMatterHistoryEvent(typekey.HistoryType type, entity.Matter matter, java.lang.String description) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createMatterHistoryEvent(type, matter, description);
  }
  
  /**
   * Generates a new policy renewal alert in the policy system, via a call to the
   * IPolicyRenewalAlertAdapter plugin
   * <p>
   * This method was added in early versions of ClaimCenter when much less could be done directly in
   * Gosu. The combination of this method and the IPolicyRenewalAlertAdapter plugin gave a way for
   * customers to call a remote policy system from rules. In the out of box product the actual
   * implementation of the plugin is empty and no code calls createPolicyRenewalAlert, so it is
   * essentially a hook which provides no intrinsic functionality but can be used as an extension
   * point. In more recent versions of ClaimCenter customers can create arbitrary custom web services
   * and call them from Gosu so there is no point in maintaining this interface as a separate
   * extension point - the interface is limiting and using a direct plugin call, rather than messaging,
   * makes it difficult to implement reliably.
   * @param severityCode Severity code of the renewal alert
   * @param description Description for the alert
   * @deprecated use messaging and a custom web service instead of this interface
   */
  public void createPolicyRenewalAlert(java.lang.String severityCode, java.lang.String description) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createPolicyRenewalAlert(severityCode, description);
  }
  
  /**
   * Creates a claim-level recovery.  The recovery is created with one line item and the Claim Currency.
   * @param payer The payer of the recovery.
   * @param costType The costtype for the recovery.  This value cannot be null.
   * @param costCategory The costcategory for the recovery  This value cannot be null.
   * @param recoveryCategory The Recovery Category for the recovery.
   * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
   * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
   * @param comments Comments on this recovery.
   * @param requestingUser The user requesting this recovery.
   * @return the created recovery
   */
  public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, java.lang.String comments, entity.User requestingUser) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, comments, requestingUser);
  }
  
  /**
   * Creates a claim-level recovery.  The recovery is created with one line item.
   * @param payer The payer of the recovery.
   * @param costType The costtype for the recovery.  This value cannot be null.
   * @param costCategory The costcategory for the recovery  This value cannot be null.
   * @param recoveryCategory The Recovery Category for the recovery.
   * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
   * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
   * @param recoveryCurrency The currency of the recoveryAmount.
   * @param exchangeRateOverride The exchange rate that is to be used to override the default rate, can be null
   * @param customExchangeRateDescription The custom exchange rate description, can be null
   * @param claimAmountOverride The claim amount to override the automatically calculated amount, can be null
   * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
   * @param comments Comments on this recovery.
   * @param requestingUser The user requesting this recovery.
   * @return the created recovery
   */
  public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, typekey.Currency recoveryCurrency, java.math.BigDecimal exchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, entity.User requestingUser) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, recoveryCurrency, exchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, requestingUser);
  }
  
  /**
   * Creates a new History entry of the given Type related to the given Subrogation
   * @param type the history type
   * @param subrogation the related Subrogation
   * @param description the description
   * @return the created history event.
   */
  public entity.History createSubrogationHistoryEvent(typekey.HistoryType type, entity.Subrogation subrogation, java.lang.String description) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createSubrogationHistoryEvent(type, subrogation, description);
  }
  
  /**
   * Add a new Subrogation summary to claim if one doesn't exist, otherwise return the existing one.
   * @return subrogation summary (new or existing) related to this claim.
   */
  public entity.SubrogationSummary createSubrogationSummaryIdempotently() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createSubrogationSummaryIdempotently();
  }
  
  /**
   * Creates a AttributeBasedAssignmentCriteria instance, which is used to collect a set of user attributes on which to search for users.
   * The matchAll flag indicates whether each attribute must be satisfied (logical AND) or whether any attribute could
   * be satisfied (logical OR).
   * @return AttributeBasedAssignmentCriteria instance
   * @deprecated Use the constructor directly.  This method is no longer necessary, since a new AttributeBasedAssignmentCriteria entity can simply
   *             be created directly in Gosu and placed in the correct bundle.
   */
  public entity.AttributeBasedAssignmentCriteria createUserAttributes() {
    return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).createUserAttributes();
  }
  
  /**
   * Creates a new warning activity for the claim and attempts to assign it to the
   * given user and group.  If the group is null, then the activity is auto-assigned.
   * @param userID the user used in assignment.
   * @param groupID the group used in assignment
   * @param patternName the activty pattern
   * @return the newly created activity
   */
  public entity.Activity createWarningActivity(gw.pl.persistence.core.Key userID, gw.pl.persistence.core.Key groupID, java.lang.String patternName) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createWarningActivity(userID, groupID, patternName);
  }
  
  /**
   * Executes a rule set (synchronously) to generate a workplan for this claim.
   */
  public void createWorkplan() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createWorkplan();
  }
  
  /**
   * Return ClaimInjuryIncident, creating one if it does not yet exist. This should be used
   * in PCFs or wherever the ClaimInjuryIncident fields may be edited, in case the CII does
   * not yet exist. See also Claim.ClaimInjuryIncident property.
   * @return The claim injury incident
   */
  public entity.InjuryIncident ensureClaimInjuryIncident() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).ensureClaimInjuryIncident();
  }
  
  /**
   * Find any existing open assignment review activities related to this assignable. Normally this will
   * return either zero or one activities. Assignment review activities are used for manual assignment.
   * @return a query result containing the open assignment review activities, if any
   */
  public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
  }
  
  public gw.api.database.IQueryBeanResult<entity.PriorClaimView> findPriorClaimsByClaimant(entity.Contact claimant, typekey.ClaimState... claimStatesToOmit) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).findPriorClaimsByClaimant(claimant, claimStatesToOmit);
  }
  
  public gw.api.database.IQueryBeanResult<entity.PriorClaimView> findPriorClaimsByPolicyNumber(java.lang.String policyNumber, typekey.ClaimState... claimStatesToOmit) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).findPriorClaimsByPolicyNumber(policyNumber, claimStatesToOmit);
  }
  
  /**
   * Forces the claim to add any missing claim indicators, claim metrics or exposure metrics. This will
   * usually occur when a new indicator or metric has been added to a pre-existing claim. This should only
   * ever be called within a batch process or exception rule.
   */
  public void forceRecalculateMetrics() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).forceRecalculateMetrics();
  }
  
  /**
   * Adds the claim's currency value to BundleCommitCondition, if the currency gets changed, current bundle
   * will not be able to commit.  If the currency is already freezed, it will not be refreezed with the current
   * value.
   */
  public void freezeCurrency() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).freezeCurrency();
  }
  
  /**
   * Adds the claim's state value to BundleCommitCondition, if the state gets changed, current bundle
   * will not be able to commit.  If the state is already frozen, it will not be refrozen with the current
   * value.
   */
  public void freezeState() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).freezeState();
  }
  
  /**
   * Assign a claim number for a draft claim by calling the claim number adapater.
   * The server will verify that the
   * number is unique and re-query the adapter if it isn't.  This method is called
   * when the claim is first created but doesn't have complete data yet.  The method
   * <code>generateNewClaimNumber(Claim)</code> will be called for a permanent
   * claim number when the claim's data is complete (and it is about to be opened).
   */
  public void generateTempClaimNumber() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).generateTempClaimNumber();
  }
  
  /**
   * Gets the value of the Access field.
   * The access control objects for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAccess[] getAccess() {
    return (entity.ClaimAccess[])__getInternalInterface().getFieldValue(ACCESS_PROP.get());
  }
  
  /**
   * Gets the value of the AccidentType field.
   * Detailed accident type; augments LossCause.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AccidentType getAccidentType() {
    return (typekey.AccidentType)__getInternalInterface().getFieldValue(ACCIDENTTYPE_PROP.get());
  }
  
  /**
   * Gets the active assignments to the given role.
   * @param userRole 
   * @return 
   */
  public entity.UserRoleAssignment[] getActiveUserRoleAssignments(typekey.UserRole userRole) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getActiveUserRoleAssignments(userRole);
  }
  
  /**
   * Gets the value of the Activities field.
   * The activities for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities() {
    return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
  }
  
  /**
   * Returns a List of Address objects (e.g., postal addresses) that are related to the Claim.
   * This is used, for example, to find possible candidates for Claim loss location.
   * This currently includes:
   * <ul>
   * <li>The addresses of any properties listed on the policy</li>
   * <li>All of the insured's addresses.</li>
   * <li>All of the policyholder's addresses.</li>
   * <li>All of the DBA's addresses.</li>
   * <li>The claim's loss location.</li>
   * </ul>
   * @return a List of Address objects related to the claim.
   */
  public entity.Address[] getAddresses() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAddresses();
  }
  
  /**
   * Gets the value of the AgencyId field.
   * An ID assigned to indicate company and office a claim is being submitted by, this data is used by ISO integration
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgencyId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENCYID_PROP.get());
  }
  
  /**
   * Returns the AggregateLimits of all PolicyPeriods associated with the policy
   * of this claim.
   * @return The aggregate limits
   */
  public entity.AggregateLimit[] getAggregateLimits() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAggregateLimits();
  }
  
  public java.util.Set<entity.ClaimContactRole> getAllClaimContactRolesByRoles(typekey.ContactRole[] roles) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllClaimContactRolesByRoles(roles);
  }
  
  /**
   * Array association accessor for key AllEscalatedActivitiesClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AllEscalatedActivitiesClaimMetric getAllEscalatedActivitiesClaimMetric() {
    return (entity.AllEscalatedActivitiesClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("AllEscalatedActivitiesClaimMetric"));
  }
  
  /**
   * Returns all of the history events for this claim in a QueryProcessor.
   * @return The query result
   */
  public gw.api.database.IQueryBeanResult<entity.History> getAllHistoryEvents() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllHistoryEvents();
  }
  
  /**
   * Get all UserRoleAssignments on the Claim, not filtered by ExposureID.
   * @return All UserRoleAssignments on the Claim including those associated with exposures.
   */
  public entity.UserRoleAssignment[] getAllRoleAssignments() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllRoleAssignments();
  }
  
  /**
   * Gets the value of the AllocatedClaimNumber field.
   * If this claim is draft, and an attempt to save it has failed, contains the claim number that was allocated before the failure. Otherwise null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AllocatedClaimNumber getAllocatedClaimNumber() {
    return (entity.AllocatedClaimNumber)__getInternalInterface().getFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AllocatedClaimNumber[] getAllocatedClaimNumberArray() {
    return (entity.AllocatedClaimNumber[])__getInternalInterface().getFieldValue(ALLOCATEDCLAIMNUMBERARRAY_PROP.get());
  }
  
  /**
   * Returns all allowed contact roles for a Claim, as defined
   * in the entityroleconstraints-config.xml file
   * @return a list of allowed contact roles for this Claim
   */
  public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllowedContactRolesForEntity();
  }
  
  /**
   * Returns a set of valid Payee Types as ContactRoles for the input "payee" parameter
   * Since not all roles for this "payee" parameter on the Claim are valid for a payee of a payment,
   * this method returns the set of allowed roles for this "payee" parameter as a payee of a payment.
   * @param payee the payee to be checked for allowed roles
   * @return an array of ContactRoles for the parameter "payee" that are allowed types of a payee on a payment
   */
  public typekey.ContactRole[] getAllowedPayeeTypes(entity.Contact payee) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllowedPayeeTypes(payee);
  }
  
  /**
   * Gets the answer to a given question.  Should never return null; instead should
   * create empty answer if necessary.  Can however throw an exception if the question
   * 
   * is not related in any way to the object.
   * @param question 
   */
  public entity.AnswerDelegate getAnswer(entity.Question question) {
    return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getAnswer(question);
  }
  
  /**
   * This class exposes the answer set functionality for external apps.
   * @param qs 
   * @return 
   */
  public entity.AnswerSet getAnswerSetForQuestionSet(entity.QuestionSet qs) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getAnswerSetForQuestionSet(qs);
  }
  
  /**
   * Gets the actual value of the answer.  If the answer is undefined on this
   * entity, use the default answer if there is one, else null.
   * @param question 
   */
  public java.lang.Object getAnswerValue(entity.Question question) {
    return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getAnswerValue(question);
  }
  
  /**
   * Get the activity patterns applicable when creating a new activity for this claim.
   * @return The activity patterns
   */
  public entity.ActivityPattern[] getApplicableActivityPatterns() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getApplicableActivityPatterns();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedByUser field.
   * User who assigned this entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDBYUSER_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedGroup field.
   * Group to which this entity is assigned; null if none assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedQueue field.
   * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getAssignedQueue() {
    return (entity.AssignableQueue)__getInternalInterface().getFieldValue(ASSIGNEDQUEUE_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedUser field.
   * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
  }
  
  /**
   * Returns a string describing the current assignee plus their group,
   * suitable for display to the user. This can be quite a long string,
   * for example "Andy Applegate (Auto1 - TeamA)". See also
   * {@link #getAssigneeDisplayString()} which omits the group name and
   * may be more appropriate if space is tight.
   * @return If the assignable is assigned to a user or queue, returns the
   * name of the user or queue plus their group (for example
   * "Andy Applegate (Auto1 - TeamA)"). If assignment is pending, returns
   * a simple string (for example "pending assignment"). If the assignable
   * is completely unassigned returns the empty string.
   */
  public java.lang.String getAssigneeAndGroupDisplayString() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeAndGroupDisplayString();
  }
  
  /**
   * Returns a string describing the current assignee, suitable for display
   * to the user. See also {@link #getAssigneeAndGroupDisplayString()}, which
   * returns a more detailed description of the assignee.
   * @return If the assignable is assigned to a user or queue, returns the
   * name of the user or queue (for example "Andy Applegate"). If assignment
   * is pending, returns a simple string (for example "pending assignment").
   * If the assignable is completely unassigned returns the empty string.
   */
  public java.lang.String getAssigneeDisplayString() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeDisplayString();
  }
  
  /**
   * Returns a string describing only the group of the current assignee,
   * suitable for display to the user. See also {@link #getAssigneeAndGroupDisplayString()},
   *  which returns a more detailed description of the assignee.
   * @return If the assignable is assigned to a user, returns the name of the
   * user's group (for example "Auto1 - TeamA"). If assignment is pending, returns
   * a simple string (for example "pending assignment"). If the assignable
   * is completely unassigned returns the empty string.
   */
  public java.lang.String getAssigneeGroupOnlyDisplayString() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeGroupOnlyDisplayString();
  }
  
  /**
   * Gets the value of the AssignmentDate field.
   * Time when entity last assigned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssignmentDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ASSIGNMENTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the AssignmentStatus field.
   * Typelist describing assignment status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus() {
    return (typekey.AssignmentStatus)__getInternalInterface().getFieldValue(ASSIGNMENTSTATUS_PROP.get());
  }
  
  /**
   * Returns an unsorted array of all ClaimAssociation objects linked to this claim.
   * @return The claim associations
   */
  public entity.ClaimAssociation[] getAssociations() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAssociations();
  }
  
  public entity.AutomatedHandler[] getAutomatedHandlers() {
    return ((gw.api.specialhandling.ClaimSpecialHandlingMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.ClaimSpecialHandlingMethods")).getAutomatedHandlers();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Explanation of benefits Decision
   * @return The explanation
   */
  public java.lang.String getBenefitsDecisionReason() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getBenefitsDecisionReason();
  }
  
  /**
   * Gets the value of the Catastrophe field.
   * Associated catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe() {
    return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
  }
  
  /**
   * Returns a new CheckCreator object for creating a check on this claim.
   * @deprecated Call newCheckCreator() method instead. This property has always
   *             returned a new CheckCreator with each access.
   */
  public gw.api.financials.CheckCreator getCheckCreator() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getCheckCreator();
  }
  
  /**
   * <p>
   * Gets all the <code>Check</code> entities for the given <code>Claim</code>. The system calculates this set
   * by looking up the <code>Check</code> for every <code>Payment</code> on the <code>Claim</code>. When you are in a
   * read-only context (i.e., none of the claim's checks are new/updated/removed and not yet committed
   * to the database) use <code>getChecksQuery()</code> in rules instead. <code>getChecksQuery</code> returns a
   * <code>QueryProcessor</code> from which you can get an <code>Iterator</code>. This is a far more efficient way to
   * get all the checks for a claim.
   * </p><p>
   * <b>Note:</b> The beans returned by <code>getChecks()</code> are not guaranteed to be in the same bundle as this
   * <code>Claim</code>, and their bundle may not be editable. To edit the beans, you should add them to an editable
   * bundle first.
   * </p>
   * @return All the checks associated with this claim
   * @deprecated Users should use {@link #getChecksIterator} in a rules context, or
   *             <code>ClaimFinancialsTransactionsUtil.getChecksQuery(Claim)</code> if populating a list view separate from the
   *             Checks list view provided in the base application configuration.
   */
  @java.lang.Deprecated
  public entity.Check[] getChecks() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecks();
  }
  
  /**
   * Constructs an Iterator to provide access to the Checks for this claim.  Either all the Checks
   * or only the new and modified Checks can be chosen for retrieval.  If all the Checks are chosen
   * for retrieval, then those Checks that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a more efficient alternative to calling {@link #getChecks()}, particularly if you are
   * only interested in new or modified Checks
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified Checks for this claim will
   *                           be returned.  This includes checks for which an associated payment or lineitem has been modified.
   *                           Otherwise, if <code>false</code> then all Checks for the claim will be returned, including
   *                           new and modified Checks, but excluding deleted Checks.
   * @return an Iterator that returns Checks
   */
  public java.util.Iterator<entity.Check> getChecksIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecksIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to retrieve all the Checks for this claim.  This is a much
   * more efficient way to get the checks for this claim than using {@link #getChecks}
   * when you are in a read-only context (i.e., none of the claim's checks are
   * new/updated/removed and not yet commited to the database)
   * @return a QueryProcessor enscapulating the checks query
   */
  public gw.api.database.IQueryBeanResult<entity.Check> getChecksQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecksQuery();
  }
  
  /**
   * Returns the child objects of the current assignable to which the new assigment should maybe be
   * cascaded. shouldCascadeAssignment will be called on each child before actually doing the cascade
   * @return child objects to which the new assignment should potentially be cascaded
   */
  public java.util.List<gw.api.assignment.CCAssignableMethods> getChildrenForCascadeAssignment() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getChildrenForCascadeAssignment();
  }
  
  /**
   * Returns the claim value.
   */
  public entity.Claim getClaim() {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getClaim();
  }
  
  /**
   * Array association accessor for key ClaimActivityMetrics on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric[] getClaimActivityMetrics() {
    return (entity.ClaimMetric[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimActivityMetrics"));
  }
  
  /**
   * Gets the ClaimContact associated with the given Contact for this Claim, or null
   * if there is no associated ClaimContact.
   * @param contact The contact to check
   * @return The associated claim contact, or null if none
   */
  public entity.ClaimContact getClaimContact(entity.Contact contact) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimContact(contact);
  }
  
  /**
   * Get the directly related ClaimContact with the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContact or null if none exists
   */
  public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactByRole(role);
  }
  
  /**
   * Gets the ClaimContactRole in the given exclusive role.
   * @param role An exclusive role
   * @throws IllegalArgumentException if the role is not exclusive
   * @return ClaimContactRole or null if none exists.
   */
  public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRoleByRole(role);
  }
  
  /**
   * Gets the directly related ClaimContactRoles in the given role.
   * @param role 
   */
  public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRolesByRole(role);
  }
  
  /**
   * Gets the directly related ClaimContacts with the given role.
   * @param role 
   */
  public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRole(role);
  }
  
  public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRoles(roles);
  }
  
  /**
   * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
   * object.
   * <br>If you need all contacts, including those that are indirectly related to the Claim, use
   * {@link entity.Claim#getContacts()}
   */
  public entity.ClaimContact[] getClaimContactsForAllRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsForAllRoles();
  }
  
  /**
   * Array association accessor for key ClaimFinancialsMetrics on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric[] getClaimFinancialsMetrics() {
    return (entity.ClaimMetric[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimFinancialsMetrics"));
  }
  
  /**
   * Gets the value of the ClaimISOMatchReports field.
   * ISO match reports for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimISOMatchReport[] getClaimISOMatchReports() {
    return (entity.ClaimISOMatchReport[])__getInternalInterface().getFieldValue(CLAIMISOMATCHREPORTS_PROP.get());
  }
  
  /**
   * Array association accessor for key ClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicator getClaimIndicator() {
    return (entity.ClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimIndicator"));
  }
  
  /**
   * Gets the value of the ClaimIndicators field.
   * Indicators related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicator[] getClaimIndicators() {
    return (entity.ClaimIndicator[])__getInternalInterface().getFieldValue(CLAIMINDICATORS_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimInfo field.
   * The claim info is used to cache information for when this claim is archived.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimInfo();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo[] getClaimInfoArray() {
    return (entity.ClaimInfo[])__getInternalInterface().getFieldValue(CLAIMINFOARRAY_PROP.get());
  }
  
  /**
   * The InjuryIncident that holds values of injury-related fields formerly on Claim.
   * Only used out-of-the-box for WorkersComp. This property should only be used in a
   * read context. See Claim.ensureClaimInjuryIncident().
   * <p/>
   * Note that the ClaimInjuryIncident, if it exists, will be present in the
   * Claim.Incidents array, but it is filtered out of Claim.InjuryIncidentsOnly
   * and Claim.RoleOwners. This is why Claim.InjuryIncidentsOnly and similar properties
   * are preferred to using Claim.Incidents.
   * @return first and only InjuryIncident on this Claim where InjuryIncident.ClaimIncident == true.
   */
  public entity.InjuryIncident getClaimInjuryIncident() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimInjuryIncident();
  }
  
  /**
   * Gets the value of the ClaimLineNumber_Ext field.
   * A Claim line number in CLASS (needed for non-uniqueness of Company/Syndicate participation)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimLineNumber_Ext() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMLINENUMBER_EXT_PROP.get());
  }
  
  /**
   * Array association accessor for key ClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric getClaimMetric() {
    return (entity.ClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimMetric"));
  }
  
  /**
   * Gets the value of the ClaimMetricRecalculationTime field.
   * Tracks when Claim metrics and indicators need to be recalculated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricRecalculationTime getClaimMetricRecalculationTime() {
    return (entity.ClaimMetricRecalculationTime)__getInternalInterface().getFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricRecalculationTime[] getClaimMetricRecalculationTimeArray() {
    return (entity.ClaimMetricRecalculationTime[])__getInternalInterface().getFieldValue(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimMetrics field.
   * Metrics related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric[] getClaimMetrics() {
    return (entity.ClaimMetric[])__getInternalInterface().getFieldValue(CLAIMMETRICS_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * The external identifier of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimRpt field.
   * The calculated financials data for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimRpt getClaimRpt() {
    return (entity.ClaimRpt)__getInternalInterface().getFieldValue(CLAIMRPT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimRpt[] getClaimRptArray() {
    return (entity.ClaimRpt[])__getInternalInterface().getFieldValue(CLAIMRPTARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimSource field.
   * Information about how Claim was entered into the System.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSource getClaimSource() {
    return (typekey.ClaimSource)__getInternalInterface().getFieldValue(CLAIMSOURCE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimSynchStates field.
   * The sync states related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimSynchState[] getClaimSynchStates() {
    return (entity.ClaimSynchState[])__getInternalInterface().getFieldValue(CLAIMSYNCHSTATES_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimTier field.
   * The tier of this claim, used to decide how to rate the claim metrics.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimTier getClaimTier() {
    return (typekey.ClaimTier)__getInternalInterface().getFieldValue(CLAIMTIER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimTypeCode_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTypeCode_Ext getClaimTypeCode_Ext() {
    return (typekey.ECFClaimTypeCode_Ext)__getInternalInterface().getFieldValue(CLAIMTYPECODE_EXT_PROP.get());
  }
  
  /**
   * Gets the ClaimUserModels which represent the user assignments and role assignments for this Claim.
   * Because this method creates non-persistent entities in this Claim's bundle, the Claim's bundle
   * must be writable.
   * @return 
   */
  public entity.ClaimUserModelSet getClaimUserModelSet() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimUserModelSet();
  }
  
  /**
   * Gets the value of the ClaimWorkComp field.
   * Claim's worker's compensation data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkComp getClaimWorkComp() {
    return (entity.ClaimWorkComp)__getInternalInterface().getFieldValue(CLAIMWORKCOMP_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimantDenorm field.
   * Claimant FK denorm.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimantDenorm() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMANTDENORM_PROP.get());
  }
  
  /**
   * Returns all claimants on a claim as well as those on related exposures.
   * @return The claimant names
   */
  public java.lang.String[] getClaimantNames() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimantNames();
  }
  
  /**
   * Gets the value of the ClaimantRprtdDate field.
   * Workers' Comp only. Date when the claimant reported incident to insured (employer).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getClaimantRprtdDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CLAIMANTRPRTDDATE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claimempdata[] getClaimempdataArray() {
    return (entity.Claimempdata[])__getInternalInterface().getFieldValue(CLAIMEMPDATAARRAY_PROP.get());
  }
  
  /**
   * Returns an unsorted array of all ClaimInAssociation which:
   * <ul>
   * <li> belong to a ClaimAssociation that this Claim belongs to
   * <li> do not refer to this Claim
   * </ul>
   * Note that this method can return multiple references to a Claim if it
   * shares more than one association with this Claim.
   * @return an array of ClaimInAssociation objects that indicate all the
   * Claims associated with this Claim, across all of this Claim's Associations.
   */
  public entity.ClaimInAssociation[] getClaimsAssociatedWith() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimsAssociatedWith();
  }
  
  /**
   * Gets the value of the CloseDate field.
   * Date and time when this entity was closed. (Not applicable to all assignable entities)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCloseDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ClosedOutcome field.
   * The outcome reached when closing the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimClosedOutcomeType getClosedOutcome() {
    return (typekey.ClaimClosedOutcomeType)__getInternalInterface().getFieldValue(CLOSEDOUTCOME_PROP.get());
  }
  
  /**
   * Gets the value of the ConcurrentEmp field.
   * Did the employee have concurrent employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getConcurrentEmp() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(CONCURRENTEMP_PROP.get());
  }
  
  /**
   * Gets the value of the ConcurrentEmpl field.
   * Details of concurrent employment for workers' comp claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ConcurrentEmployment[] getConcurrentEmpl() {
    return (entity.ConcurrentEmployment[])__getInternalInterface().getFieldValue(CONCURRENTEMPL_PROP.get());
  }
  
  /**
   * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
   * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
   * @param role 
   * @throws IllegalArgumentException if the role is not exclusive
   * @return Contact or null if none exists
   */
  public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactByRole(role);
  }
  
  /**
   * Returns the complete set of ContactRoleCategory typekeys
   * @return the compelte set of ContactRoleCategory typekeys
   */
  public typekey.ContactRoleCategory[] getContactRoleCategoryTypeKeys() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getContactRoleCategoryTypeKeys();
  }
  
  /**
   * Gets the Contact class for the given role. If the role has a specific subtype constraint, returns that subtype. IF
   * there is no constraint or there are ExceptionConstraints to the subtype constraint, returns Contact.class.
   * @param role 
   * @deprecated Use getContactTypes instead, which will return all valid contact subtypes if there are more than one.
   */
  public gw.lang.reflect.IType getContactType(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactType(role);
  }
  
  /**
   * Gets the Contact classes for the given role.  If the role has a contact subtype constraint, returns that subtype.
   * If there are ExceptionConstraints then all valid subtypes will be returned (note, this only includes the types
   * specified in the constraints -- any subtypes of those types are implicitly valid.)  Otherwise returns [Contact.class].
   * @param role 
   */
  public java.util.List<gw.entity.IEntityType> getContactTypes(typekey.ContactRole role) {
    return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactTypes(role);
  }
  
  /**
   * Gets the value of the Contacts field.
   * The contacts involved with this claim. Including indirectly involved, like Exposures contacts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact[] getContacts() {
    return (entity.ClaimContact[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
  }
  
  /**
   * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
   * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
   * @param role 
   */
  public entity.Contact[] getContactsByRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRole(role);
  }
  
  public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRoles(role);
  }
  
  /**
   * 
   * @param role 
   */
  public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRole(role);
  }
  
  public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRoles(roles);
  }
  
  /**
   * Preloads all the Contact beans into the cache and returns the same ClaimContact
   * array as getContacts() would.
   * @return The ClaimContacts on the claim (same as getClaimContacts())
   */
  public entity.ClaimContact[] getContactsWithPreload() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getContactsWithPreload();
  }
  
  /**
   * Gets the value of the ContribFactors field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContribFactor[] getContribFactors() {
    return (entity.ContribFactor[])__getInternalInterface().getFieldValue(CONTRIBFACTORS_PROP.get());
  }
  
  /**
   * Array association accessor for key CoverageInQuestionClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageInQuestionClaimIndicator getCoverageInQuestionClaimIndicator() {
    return (entity.CoverageInQuestionClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("CoverageInQuestionClaimIndicator"));
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the Currency field.
   * The currency for the claim, copied from the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * This method exists to support the notion of "secondary" assignment in the Assignment Rules. "Secondary" assignments
   * generally represented by UserRoleAssignment entities, are assignments of "roles" to users, separated from the single
   * "primary" owner of the entity.
   * <p/>
   * It is generally desirable for Assignment rule writers to be able to re-use a single set of, say, Claim Assignment rules
   * for both primary and secondary assignments. This method allows rules to be written in the form of
   * <code>Claim.CurrentAssignment.assignXXX()</code> rather than <code>Claim.assignXXX()</code>. If the primary
   * assignment is being performed, then getCurrentAssignment() will return the entity itself (in this case, the Claim).
   * If a secondary assignment is being performed, then getCurrentAssignment() will return the UserRoleAssignment which
   * is current being operated upon.
   * <p/>
   * Obviously, if an entity does not support secondary assignment (i.e. does not implement the UserRoleOwner interface),
   * then rules do not need to use this method. Secondary assignments done outside of the Assignment Rules can simplay
   * call the assignXXX methods directly on the UserRoleAssignment entity themselves, and therefore also do not require
   * this method.
   * <p/>
   * Since this method is dependent on the Assignment Engine state, calling it outside of the Assignment Rules is illegal.
   * @return the CCAssignable entity being operated on by the Assignment Engine. May be either the current entity or
   *         a UserRoleAssignment entity relating to the current entity.
   */
  public entity.CCAssignable getCurrentAssignment() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getCurrentAssignment();
  }
  
  /**
   * Returns the user role assignment for the current rule execution
   */
  public entity.UserRoleAssignment getCurrentRoleAssignment() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getCurrentRoleAssignment();
  }
  
  /**
   * Gets the value of the DateCompDcsnDue field.
   * The date the compensability Decision (for entire claim) was Due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCompDcsnDue() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATECOMPDCSNDUE_PROP.get());
  }
  
  /**
   * Gets the value of the DateCompDcsnMade field.
   * The date the compensability Decision (for entire claim) was Made.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCompDcsnMade() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATECOMPDCSNMADE_PROP.get());
  }
  
  /**
   * Gets the value of the DateEligibleForArchive field.
   * The date and time that this claim will become eligible for archiving. While this field is null or set to a date in the future, this claim is not selected by the archive batch process. (Note that being passed over by the archive batch process is different from being 'skipped' or 'excluded'.)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEligibleForArchive() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEELIGIBLEFORARCHIVE_PROP.get());
  }
  
  /**
   * Gets the value of the DateFormGivenToEmp field.
   * The date the work comp form was given to an employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateFormGivenToEmp() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEFORMGIVENTOEMP_PROP.get());
  }
  
  /**
   * Gets the value of the DateFormRetByEmp field.
   * The date the work comp form was returned by an employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateFormRetByEmp() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEFORMRETBYEMP_PROP.get());
  }
  
  /**
   * Gets the value of the DateRptdToAgent field.
   * The date the agent was notified about the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToAgent() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOAGENT_PROP.get());
  }
  
  /**
   * Gets the value of the DateRptdToEmployer field.
   * The date the claim was reported to the employer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToEmployer() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOEMPLOYER_PROP.get());
  }
  
  /**
   * Gets the value of the DateRptdToInsured field.
   * The date the insured was notified about the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateRptdToInsured() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOINSURED_PROP.get());
  }
  
  /**
   * Array association accessor for key DaysInitialContactWithInsuredClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysInitialContactWithInsuredClaimMetric getDaysInitialContactWithInsuredClaimMetric() {
    return (entity.DaysInitialContactWithInsuredClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysInitialContactWithInsuredClaimMetric"));
  }
  
  /**
   * Array association accessor for key DaysLastViewedByAdjusterClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysLastViewedByAdjusterClaimMetric getDaysLastViewedByAdjusterClaimMetric() {
    return (entity.DaysLastViewedByAdjusterClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysLastViewedByAdjusterClaimMetric"));
  }
  
  /**
   * Array association accessor for key DaysLastViewedBySupervisorClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysLastViewedBySupervisorClaimMetric getDaysLastViewedBySupervisorClaimMetric() {
    return (entity.DaysLastViewedBySupervisorClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysLastViewedBySupervisorClaimMetric"));
  }
  
  /**
   * Array association accessor for key DaysOpenClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysOpenClaimMetric getDaysOpenClaimMetric() {
    return (entity.DaysOpenClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysOpenClaimMetric"));
  }
  
  /**
   * Gets the value of the DeathDate field.
   * Date of death (if injury type is death).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDeathDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DEATHDATE_PROP.get());
  }
  
  /**
   * Array association accessor for key DecimalClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DecimalClaimMetric getDecimalClaimMetric() {
    return (entity.DecimalClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DecimalClaimMetric"));
  }
  
  /**
   * Gets the value of the Deductibles field.
   * Deductibles associated with this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible[] getDeductibles() {
    return (entity.Deductible[])__getInternalInterface().getFieldValue(DEDUCTIBLES_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * Description of the accident or loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Returns a direct inbound URL to this object; for example, an Activity might return
   * Activity.do?Activity=1
   * @return a direct inbound URL to this object
   */
  public java.lang.String getDirectURL() {
    return ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).getDirectURL();
  }
  
  /**
   * Gets the value of the Documents field.
   * The documents associated with this claim; for example, FNOL accord form or police report. Warning: do not rely on the contents of this array when the IDocumentMetadataSource plugin is enabled; use DocumentsUtil.getAllDocumentsForClaim instead.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document[] getDocuments() {
    return (entity.Document[])__getInternalInterface().getFieldValue(DOCUMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the DrugsInvolved field.
   * Does the employer question the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getDrugsInvolved() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(DRUGSINVOLVED_PROP.get());
  }
  
  /**
   * Gets the value of the DrugsPrescribed field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DrugPrescribed[] getDrugsPrescribed() {
    return (entity.DrugPrescribed[])__getInternalInterface().getFieldValue(DRUGSPRESCRIBED_PROP.get());
  }
  
  /**
   * Searches for possible duplicate claims and returns a String of the
   * claim numbers separated by commas, or null if no possible duplicates
   * were found.
   * @return A comma delimited list of claimnumbers for the claims that matched
   *         the duplicate claim search, or null if no claims matched.
   */
  public java.lang.String getDuplicateClaimNumbers() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getDuplicateClaimNumbers();
  }
  
  /**
   * Gets the value of the ECFLastUpdateTime field.
   * The last time this Claim was updated from the ECF servers by either a Claim Notify or Claim Retrieve
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getECFLastUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ECFLASTUPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the EEventTime_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEEventTime_Ext() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EEVENTTIME_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the EmpQusValidity field.
   * Does the employer question the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getEmpQusValidity() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(EMPQUSVALIDITY_PROP.get());
  }
  
  /**
   * Gets the value of the EmpSentMPNNotice field.
   * Date that the Employer sent out the MPN Notification.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEmpSentMPNNotice() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EMPSENTMPNNOTICE_PROP.get());
  }
  
  /**
   * Gets the value of the EmployerValidityReason field.
   * The reason the employer questions the validity of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmployerValidityReason() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMPLOYERVALIDITYREASON_PROP.get());
  }
  
  /**
   * Gets the value of the EmploymentData field.
   * Workers' Comp only. Details about the claimant's employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getEmploymentData() {
    return (entity.EmploymentData)__getInternalInterface().getFieldValue(EMPLOYMENTDATA_PROP.get());
  }
  
  /**
   * Gets the value of the Evaluations field.
   * The original cost estimate followed by any modifications to that estimate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Evaluation[] getEvaluations() {
    return (entity.Evaluation[])__getInternalInterface().getFieldValue(EVALUATIONS_PROP.get());
  }
  
  /**
   * Gets the value of the ExaminationDate field.
   * Date of the Examination.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExaminationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EXAMINATIONDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureBegan field.
   * Workers' Comp only. Date when the exposure began.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExposureBegan() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EXPOSUREBEGAN_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureEnded field.
   * Workers' Comp only. Date when the exposure ended.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExposureEnded() {
    return (java.util.Date)__getInternalInterface().getFieldValue(EXPOSUREENDED_PROP.get());
  }
  
  /**
   * Gets the value of the Exposures field.
   * The exposures related to this claim. Note: if triggersValidation is false, exposure metrics will not be run automatically.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure[] getExposures() {
    return (entity.Exposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
  }
  
  /**
   * This method returns the set of Exposures corresponding to
   * a particular Claimant on a particular Claim.
   * <p/>
   * For example, if Joe Smith is a claimant on claim CP-2038,
   * and he is the claimant for two exposures, then this method
   * will return a List containing two Exposure beans--the two
   * Exposures for which he is the claimant.
   * @param claimant The claimant for which exposures should be retreieved.
   * @return a List of Exposures for this claimant, ordered by claim order.
   */
  public java.util.List<entity.Exposure> getExposuresForClaimant(entity.Contact claimant) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getExposuresForClaimant(claimant);
  }
  
  /**
   * Array association accessor for key FatalityClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FatalityClaimIndicator getFatalityClaimIndicator() {
    return (entity.FatalityClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("FatalityClaimIndicator"));
  }
  
  /**
   * Gets the value of the Fault field.
   * Insured's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
  }
  
  /**
   * Gets the value of the FaultRating field.
   * Indicates in the insured is at fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FaultRating getFaultRating() {
    return (typekey.FaultRating)__getInternalInterface().getFieldValue(FAULTRATING_PROP.get());
  }
  
  /**
   * Gets the value of the FireDeptInfo field.
   * Reports, incident number, and other information from the fire department.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFireDeptInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIREDEPTINFO_PROP.get());
  }
  
  /**
   * Array association accessor for key FlagClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FlagClaimIndicator getFlagClaimIndicator() {
    return (entity.FlagClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("FlagClaimIndicator"));
  }
  
  /**
   * Gets the value of the Flagged field.
   * This claim's status as a flagged claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FlaggedType getFlagged() {
    return (typekey.FlaggedType)__getInternalInterface().getFieldValue(FLAGGED_PROP.get());
  }
  
  /**
   * Gets the value of the FlaggedDate field.
   * The date and time the claim was initially flagged.  When the flag is unset, this date is set to null and will be set to a new date if a new reason for flagging the claim is found later.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFlaggedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FLAGGEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the FlaggedReason field.
   * The reason this claim is flagged.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFlaggedReason() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FLAGGEDREASON_PROP.get());
  }
  
  /**
   * Gets the value of the History field.
   * The history events related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.History[] getHistory() {
    return (entity.History[])__getInternalInterface().getFieldValue(HISTORY_PROP.get());
  }
  
  /**
   * Preferred method of getting history for a given claim.  This resolves to a search on the database, based
   * on the claim and history type filter.  If the history type is null, all events are returned.  It's
   * assumed that if the filter selected in the UI is "none" then this method shouldn't even be called.
   * @param eventType The history event type
   * @return The query result
   */
  public gw.api.database.IQueryBeanResult<entity.History> getHistoryRecordsForHistoryType(typekey.HistoryType eventType) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getHistoryRecordsForHistoryType(eventType);
  }
  
  /**
   * Preferred method of getting history for a given claim.  This resolves to a search on the database, based
   * on the claim and history type filter.  If the history type is null, all events are returned.  It's
   * assumed that if the filter selected in the UI is "none" then this method shouldn't even be called.
   * 
   * This variation allows querying for specific history events within a given date/time range. Passing along null
   * any of the fields omits that query criteria.  Omitting either the start or end date parameter omits the
   * entire date interval filter.
   * @param eventType type of history event filter
   * @param owner Owner of history event filter.
   * @param beginDate start-of-date range interval to narrow filtering
   * @param endDate end-of-date range  to narror filtering
   * @return The query result
   */
  public gw.api.database.IQueryBeanResult<entity.History> getHistoryRecordsForHistoryType(typekey.HistoryType eventType, entity.User owner, java.util.Date beginDate, java.util.Date endDate) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getHistoryRecordsForHistoryType(eventType, owner, beginDate, endDate);
  }
  
  /**
   * Gets the value of the HospitalDate field.
   * Date admitted to the hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHospitalDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(HOSPITALDATE_PROP.get());
  }
  
  /**
   * Gets the value of the HospitalDays field.
   * Estimated Days in hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHospitalDays() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(HOSPITALDAYS_PROP.get());
  }
  
  /**
   * Gets the value of the HowReported field.
   * How the claim was reported.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HowReportedType getHowReported() {
    return (typekey.HowReportedType)__getInternalInterface().getFieldValue(HOWREPORTED_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * The claim associated with this Claim/Exposure. For a Claim, just returns itself, for an
   * exposure, returns the exposure's Claim.
   * @return the Claim
   */
  public entity.Claim getISOClaim() {
    return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOClaim();
  }
  
  /**
   * Error message if most recent ISO ClaimSearch request failed. Otherwise <code>null</code>.
   * @return the error message, or null
   */
  public java.lang.String getISOErrorMessage() {
    return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOErrorMessage();
  }
  
  /**
   * If this is an exposure, returns itself, otherwise returns null
   * @return the Exposure, or null
   */
  public entity.Exposure getISOExposure() {
    return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOExposure();
  }
  
  /**
   * Returns an array of the match reports associated with this Claim/Exposure, in random order
   * @return a non null array of match reports
   */
  public entity.ISOMatchReport[] getISOMatchReports() {
    return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOMatchReports();
  }
  
  /**
   * Gets the value of the ISOReceiveDate field.
   * The last time a response was received from ISO for this object. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOReceiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ISORECEIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ISOSendDate field.
   * The last time a search request was sent to ISO. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOSendDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ISOSENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ISOStatus field.
   * Status of exposure with ISO - for example checked, not of interest.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ISOStatus getISOStatus() {
    return (typekey.ISOStatus)__getInternalInterface().getFieldValue(ISOSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Incidents field.
   * Descriptions of incidents related to this claim. Note: In Gosu, it's preferred to use Claim.VehicleIncidentsOnly and similar properties for each Incident subtype. See the Application Guide.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident[] getIncidents() {
    return (entity.Incident[])__getInternalInterface().getFieldValue(INCIDENTS_PROP.get());
  }
  
  /**
   * Get all incidents of the given type on this claim
   * @param type incident type, must not be null and must be incident or a subtype of incident
   * @throws IllegalArgumentException if type is null or not an incident type
   * @return incidents on this claim which are instances of the given type, or an empty array if there are no such
   *          incidents. Only incidents of this exact type are returned, not any incidents which are subtypes of type. The
   *          type of the returned array is type[] - for example if type is VehicleIncident the array will be a VehicleIncident
   *          array, not just an Incident array
   */
  public entity.Incident[] getIncidentsOfType(gw.entity.IEntityType type) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getIncidentsOfType(type);
  }
  
  /**
   * Gets the value of the InjWkrInMPN field.
   * Date that the injured Worker moved to MPN.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInjWkrInMPN() {
    return (java.util.Date)__getInternalInterface().getFieldValue(INJWKRINMPN_PROP.get());
  }
  
  /**
   * Gets the insured for the Claim. This is just a shortcut for Claim.Policy.Insured.
   * @return The insured contact
   */
  public entity.Contact getInsured() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getInsured();
  }
  
  /**
   * Gets the value of the InsuredDenorm field.
   * Insured FK denorm.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getInsuredDenorm() {
    return (entity.Contact)__getInternalInterface().getFieldValue(INSUREDDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerSentMPNNotice field.
   * Date that Insurer sent out the MPN Notification.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInsurerSentMPNNotice() {
    return (java.util.Date)__getInternalInterface().getFieldValue(INSURERSENTMPNNOTICE_PROP.get());
  }
  
  /**
   * Array association accessor for key IntegerClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.IntegerClaimMetric getIntegerClaimMetric() {
    return (entity.IntegerClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("IntegerClaimMetric"));
  }
  
  /**
   * Gets the value of the JurisdictionState field.
   * The state of jurisdiction. This indicates jurisdiction that covers the loss, which may differ from the state in which the loss occurred. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState() {
    return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the LMMessages field.
   * Full list of LMMessage_Ext entities related to this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LMMessage_Ext[] getLMMessages() {
    return (entity.LMMessage_Ext[])__getInternalInterface().getFieldValue(LMMESSAGES_PROP.get());
  }
  
  /**
   * Gets the value of the LOBCode field.
   * Line of Business code; typically related to the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode() {
    return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
  }
  
  /**
   * Array association accessor for key LargeLossClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LargeLossClaimIndicator getLargeLossClaimIndicator() {
    return (entity.LargeLossClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("LargeLossClaimIndicator"));
  }
  
  /**
   * Gets the value of the LargeLossNotificationStatus field.
   * The status of large loss notices.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LargeLossNotificationStatus getLargeLossNotificationStatus() {
    return (typekey.LargeLossNotificationStatus)__getInternalInterface().getFieldValue(LARGELOSSNOTIFICATIONSTATUS_PROP.get());
  }
  
  /**
   * Array association accessor for key LitigationClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LitigationClaimIndicator getLitigationClaimIndicator() {
    return (entity.LitigationClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("LitigationClaimIndicator"));
  }
  
  /**
   * Gets the value of the LitigationStatus field.
   * The status of the litigation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LitigationStatus getLitigationStatus() {
    return (typekey.LitigationStatus)__getInternalInterface().getFieldValue(LITIGATIONSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the LocationCode field.
   * Workers' Comp only. Location at the employer's facilities where the accident occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getLocationCode() {
    return (entity.PolicyLocation)__getInternalInterface().getFieldValue(LOCATIONCODE_PROP.get());
  }
  
  /**
   * Gets the value of the LocationOfTheft field.
   * the Location where the property was stolen.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LocationOfTheft getLocationOfTheft() {
    return (typekey.LocationOfTheft)__getInternalInterface().getFieldValue(LOCATIONOFTHEFT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
  }
  
  /**
   * Gets the value of the LossCause field.
   * General cause of loss; dependent on loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause() {
    return (typekey.LossCause)__getInternalInterface().getFieldValue(LOSSCAUSE_PROP.get());
  }
  
  /**
   * Gets the value of the LossDate field.
   * The date on which the loss occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
  }
  
  /**
   * Gets the value of the LossEndDate_Ext field.
   * End date of period during which a loss occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossEndDate_Ext() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSENDDATE_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocation field.
   * Location of the loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getLossLocation() {
    return (entity.Address)__getInternalInterface().getFieldValue(LOSSLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocationCode field.
   * Location Code for the Loss Location.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocationCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocationSpatialDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.database.spatial.SpatialPoint getLossLocationSpatialDenorm() {
    return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(LOSSLOCATIONSPATIALDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the LossType field.
   * High level claim type (for example, Auto or Property).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MMIdate field.
   * Date Maximum Medical Improvement was reached.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMMIdate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MMIDATE_PROP.get());
  }
  
  /**
   * Description of Max Medical Improvement for Workers Comp Claim.
   * @return the description of the maximum medical improvement
   */
  public java.lang.String getMMInote() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMMInote();
  }
  
  /**
   * Gets the value of the MainContactType field.
   * Relationship of the main contact to the insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getMainContactType() {
    return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(MAINCONTACTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ManifestationDate field.
   * The manifestation date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getManifestationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MANIFESTATIONDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Matters field.
   * The legal matters related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter[] getMatters() {
    return (entity.Matter[])__getInternalInterface().getFieldValue(MATTERS_PROP.get());
  }
  
  /**
   * Gets the higest value of claim order for the claim
   * @return An int containing the value
   */
  public int getMaxClaimOrder() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMaxClaimOrder();
  }
  
  /**
   * Gets the value of the MedicalContactStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalContactStatus[] getMedicalContactStatus() {
    return (entity.MedicalContactStatus[])__getInternalInterface().getFieldValue(MEDICALCONTACTSTATUS_PROP.get());
  }
  
  /**
   * Description of Medical Diagnosis for Workers Comp Claim.
   * @return The medical diagnosis
   */
  public java.lang.String getMedicalDiagnosis() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMedicalDiagnosis();
  }
  
  /**
   * Gets the value of the MedicalTreatments field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalTreatment[] getMedicalTreatments() {
    return (entity.MedicalTreatment[])__getInternalInterface().getFieldValue(MEDICALTREATMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the MetroReports field.
   * Details of reports associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MetroReport[] getMetroReports() {
    return (entity.MetroReport[])__getInternalInterface().getFieldValue(METROREPORTS_PROP.get());
  }
  
  /**
   * Array association accessor for key MoneyClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MoneyClaimMetric getMoneyClaimMetric() {
    return (entity.MoneyClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("MoneyClaimMetric"));
  }
  
  /**
   * Gets the value of the Negotiations field.
   * The negotiations related to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Negotiation[] getNegotiations() {
    return (entity.Negotiation[])__getInternalInterface().getFieldValue(NEGOTIATIONS_PROP.get());
  }
  
  /**
   * Array association accessor for key NetTotalIncurredClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NetTotalIncurredClaimMetric getNetTotalIncurredClaimMetric() {
    return (entity.NetTotalIncurredClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("NetTotalIncurredClaimMetric"));
  }
  
  /**
   * Get the exposure type that will be used for a new exposure with the given
   * coverage sub type. Is used by {@link #newExposure(typekey.CoverageType, typekey.CoverageSubtype, boolean)}
   * @param coverageSubType exposure coverage sub type
   * @return the exposure type corresponding to the given coverage sub type
   */
  public typekey.ExposureType getNewExposureType(typekey.CoverageSubtype coverageSubType) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNewExposureType(coverageSubType);
  }
  
  /**
   * Return all the non-exclusive claim contact roles for this owner
   * @return a list of claim contact role objects, possibly empty but never null
   */
  public entity.ClaimContactRole[] getNonExclusiveRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
  }
  
  /**
   * Finds notes that are not confidential.
   * @return The query result
   */
  public gw.api.database.IQueryBeanResult<entity.Note> getNonconfidentialNotes() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNonconfidentialNotes();
  }
  
  /**
   * Gets the value of the Notes field.
   * The notes particular to this claim. Notes can also be associated with a particular exposure.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Note[] getNotes() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNotes();
  }
  
  /**
   * Retrieves the number of financial transactions, of all subtypes, associated with
   * this claim regardless of status.  This method should always be preferred over
   * getTransactions().length, as it does not actually retrieve the transactions in
   * full in order to count them.
   * @return the number of financial transactions associated with this claim as an int.
   */
  public int getNumTransactions() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNumTransactions();
  }
  
  /**
   * Description of Objective Findings for Workers Comp Claim.
   * @return The objective findings
   */
  public java.lang.String getObjFindings() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getObjFindings();
  }
  
  /**
   * Gets the value of the Officials field.
   * Details of officials associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Official[] getOfficials() {
    return (entity.Official[])__getInternalInterface().getFieldValue(OFFICIALS_PROP.get());
  }
  
  /**
   * Array association accessor for key OpenEscalatedActivitiesClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OpenEscalatedActivitiesClaimMetric getOpenEscalatedActivitiesClaimMetric() {
    return (entity.OpenEscalatedActivitiesClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("OpenEscalatedActivitiesClaimMetric"));
  }
  
  /**
   * Like getAnswerDelegate, but creates the Answer if it is not defined already
   * @param question 
   */
  public entity.AnswerDelegate getOrCreateAnswer(entity.Question question) {
    return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getOrCreateAnswer(question);
  }
  
  /**
   * Gets the user role assignment for that role
   * If there's no assignment for that role, creates a new one.
   * If there is more than one assignment for that role, then the first role will be returned no matter
   * whether the role is exclusive or not.
   * @param role The role for the assignment
   * @return the existing user role assignment if found, or a new one if not found
   */
  public entity.UserRoleAssignment getOrCreateUserRoleAssignmentByRole(typekey.UserRole role) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getOrCreateUserRoleAssignmentByRole(role);
  }
  
  /**
   * 
   * @return A claim's exposures ordered by the exposure's CaseOrder field
   */
  public entity.Exposure[] getOrderedExposures() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getOrderedExposures();
  }
  
  /**
   * Gets the value of the OtherBenefits field.
   * Details of other benefits for workers comp claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherBenefit[] getOtherBenefits() {
    return (entity.OtherBenefit[])__getInternalInterface().getFieldValue(OTHERBENEFITS_PROP.get());
  }
  
  public entity.OtherInstruction[] getOtherInstructions() {
    return ((gw.api.specialhandling.ClaimSpecialHandlingMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.ClaimSpecialHandlingMethods")).getOtherInstructions();
  }
  
  /**
   * Gets the value of the OtherRecovStatus field.
   * The Other Recoverable status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OtherRecoverableStatus getOtherRecovStatus() {
    return (typekey.OtherRecoverableStatus)__getInternalInterface().getFieldValue(OTHERRECOVSTATUS_PROP.get());
  }
  
  /**
   * Array association accessor for key OverallClaimMetrics on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetric[] getOverallClaimMetrics() {
    return (entity.ClaimMetric[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("OverallClaimMetrics"));
  }
  
  /**
   * Array association accessor for key OverdueActivitiesClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OverdueActivitiesClaimMetric getOverdueActivitiesClaimMetric() {
    return (entity.OverdueActivitiesClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("OverdueActivitiesClaimMetric"));
  }
  
  /**
   * Called by the "assignToClaimOwner" method to determine which assignable "owns" the current assignable
   * so the owners assignment information can be copied. The owner is nearly always just the claim though
   * there is a special case - if an activity belongs to an exposure then the exposure is the owner. If
   * this method return null the assignToClaimOwner call will return false.
   * @return the owning assignable, usually the claim
   */
  public entity.Assignable getOwningAssignable() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningAssignable();
  }
  
  /**
   * The claim that owns this assignable. If this property returns null then this assignable cannot be
   * manually assigned (because no assignment review activity can be created), cannot be assigned using
   * the "assignToClaimOwner" method and will not create history events when assigned.
   * @return the claim
   */
  public entity.Claim getOwningClaim() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningClaim();
  }
  
  /**
   * Returns the list of possible payees on the claim.  This includes all of
   * the contacts returned by #getRelatedContacts(), plus any lienholders on
   * the associated vehicles or properties.  Lienholders are added to the end
   * of the list
   * @return List of possible payees
   */
  public java.util.List<entity.Contact> getPayeeCandidates() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPayeeCandidates();
  }
  
  /**
   * Constructs an Iterator to provide access to the Payments for this claim.  Either all the Payments
   * or only the new and modified Payments can be chosen for retrieval.  If all the Payments are chosen
   * for retrieval, then those Payments that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
   * and iterating through all the transactions to find just the desired Payments.
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified Payments for this claim will
   *                           be returned.  This includes payments for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all Payments for the claim will be returned, including new and modified
   *                           Payments, but excluding deleted Payments.
   * @return an Iterator that returns Payments
   */
  public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPaymentsIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the payments for this claim.
   * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no payment view permission.
   * The payments will be returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all Payments for this claim.  The returned
   *         rows are actually {@link entity.PaymentView} entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.PaymentView> getPaymentsQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPaymentsQuery();
  }
  
  /**
   * Array association accessor for key PercentClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentClaimMetric getPercentClaimMetric() {
    return (entity.PercentClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentClaimMetric"));
  }
  
  /**
   * Array association accessor for key PercentEscalatedActivitiesClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentEscalatedActivitiesClaimMetric getPercentEscalatedActivitiesClaimMetric() {
    return (entity.PercentEscalatedActivitiesClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentEscalatedActivitiesClaimMetric"));
  }
  
  /**
   * Array association accessor for key PercentIncurredLossCostsClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentIncurredLossCostsClaimMetric getPercentIncurredLossCostsClaimMetric() {
    return (entity.PercentIncurredLossCostsClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentIncurredLossCostsClaimMetric"));
  }
  
  /**
   * Array association accessor for key PercentPaidLossCostsClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentPaidLossCostsClaimMetric getPercentPaidLossCostsClaimMetric() {
    return (entity.PercentPaidLossCostsClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentPaidLossCostsClaimMetric"));
  }
  
  /**
   * Array association accessor for key PercentReserveChangeClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentReserveChangeClaimMetric getPercentReserveChangeClaimMetric() {
    return (entity.PercentReserveChangeClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentReserveChangeClaimMetric"));
  }
  
  /**
   * Gets the value of the PermissionRequired field.
   * If non-null, this is an additional permission that users are required to have to view or work on this claim. This field is used to restrict access to sensitive or private claims; for example, those involving an employee or that are under litigation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSecurityType getPermissionRequired() {
    return (typekey.ClaimSecurityType)__getInternalInterface().getFieldValue(PERMISSIONREQUIRED_PROP.get());
  }
  
  /**
   * Gets the value of the PoliceDeptInfo field.
   * Reports, incident number, and other information from the police deptartment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPoliceDeptInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICEDEPTINFO_PROP.get());
  }
  
  /**
   * Gets the value of the Policy field.
   * The policy associated with this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy() {
    return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyLocationSummaryJoin field.
   * Link to get the associated policy location summary (from policy system for catastrophe).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin getPolicyLocationSummaryJoin() {
    return (entity.PolicyLocationSummaryJoin)__getInternalInterface().getFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin[] getPolicyLocationSummaryJoinArray() {
    return (entity.PolicyLocationSummaryJoin[])__getInternalInterface().getFieldValue(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get());
  }
  
  /**
   * 
   * @return An array of Properties associated with the claim's policy. Unlike
   *         {@link #getProperties()} this array does not include the claim's property or the
   *         properties of any of the claim's exposures.
   */
  public entity.PolicyLocation[] getPolicyProperties() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPolicyProperties();
  }
  
  /**
   * Description of Preexisting Disability Info for Workers Comp Claim.
   * @return The preexisting disability info
   */
  public java.lang.String getPreexDisbltyInfo() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPreexDisbltyInfo();
  }
  
  /**
   * Gets the value of the PreviousGroup field.
   * Group to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getPreviousGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(PREVIOUSGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the PreviousQueue field.
   * Queue to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableQueue getPreviousQueue() {
    return (entity.AssignableQueue)__getInternalInterface().getFieldValue(PREVIOUSQUEUE_PROP.get());
  }
  
  /**
   * Gets the value of the PreviousUser field.
   * User to which this entity was previously assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPreviousUser() {
    return (entity.User)__getInternalInterface().getFieldValue(PREVIOUSUSER_PROP.get());
  }
  
  /**
   * Gets the value of the Progress field.
   * Description of the progress of an open claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimProgressType getProgress() {
    return (typekey.ClaimProgressType)__getInternalInterface().getFieldValue(PROGRESS_PROP.get());
  }
  
  /**
   * 
   * @return An array of Properties associated with the claim, its exposures, and its policy.
   */
  public entity.PolicyLocation[] getProperties() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getProperties();
  }
  
  /**
   * Gets the value of the PropertyFireDamage field.
   * Details of fire damage to property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyFireDamage getPropertyFireDamage() {
    return (entity.PropertyFireDamage)__getInternalInterface().getFieldValue(PROPERTYFIREDAMAGE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyFireDamage[] getPropertyFireDamageArray() {
    return (entity.PropertyFireDamage[])__getInternalInterface().getFieldValue(PROPERTYFIREDAMAGEARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the PropertyWaterDamage field.
   * Details of water damage to property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyWaterDamage getPropertyWaterDamage() {
    return (entity.PropertyWaterDamage)__getInternalInterface().getFieldValue(PROPERTYWATERDAMAGE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyWaterDamage[] getPropertyWaterDamageArray() {
    return (entity.PropertyWaterDamage[])__getInternalInterface().getFieldValue(PROPERTYWATERDAMAGEARRAY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the PurgeDate field.
   * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPurgeDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(PURGEDATE_PROP.get());
  }
  
  public entity.QuestionSet[] getQuestionSets(entity.QuestionSet[] questionSets) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestionSets(questionSets);
  }
  
  /**
   * This function is a callback hook in case you need to filter the Questions in a
   * question set in a funky way.
   * @param questionSet 
   */
  public entity.Question[] getQuestions(entity.QuestionSet questionSet) {
    return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestions(questionSet);
  }
  
  /**
   * Gets the value of the RIAgreementGroups field.
   * The reinsurance agreement groups for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreementGroup[] getRIAgreementGroups() {
    return (entity.RIAgreementGroup[])__getInternalInterface().getFieldValue(RIAGREEMENTGROUPS_PROP.get());
  }
  
  /**
   * Gets the value of the RICodings field.
   * RICodings relating to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding[] getRICodings() {
    return (entity.RICoding[])__getInternalInterface().getFieldValue(RICODINGS_PROP.get());
  }
  
  /**
   * Gets the value of the ReOpenDate field.
   * Date claim was reopened.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReOpenDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(REOPENDATE_PROP.get());
  }
  
  /**
   * Constructs an Iterator to provide access to the Recoveries for this claim.  Either all the Recoveries
   * or only the new and modified Recoveries can be chosen for retrieval.  If all the Recoveries are chosen
   * for retrieval, then those Recoveries that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
   * and iterating through all the transactions to find just the desired Recoveries.
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified Recoveries for this claim will
   *                           be returned.  This includes recoveries for which only the line items have been modified.  Otherwise, if
   *                           <code>false</code> then all Recoveries for the claim will be returned, including new and modified
   *                           Recoveries, but excluding deleted Recoveries.
   * @return an Iterator that returns Recoveries
   */
  public java.util.Iterator<entity.Recovery> getRecoveriesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveriesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the recoveries for this claim.
   * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no recovery view permission.
   * The recoveries will be returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all Recoveries for this claim.  The returned
   *         rows are actually {@link entity.RecoveryView} entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.RecoveryView> getRecoveriesQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveriesQuery();
  }
  
  /**
   * Returns a list of RecoveryCodings for this Claim; that is, those RecoveryCodings whose ReserveLines are coded
   * to this Claim.
   * @return list of ReocveryCodings associated with this Claim
   */
  public java.util.List<entity.RecoveryCoding> getRecoveryCodings() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryCodings();
  }
  
  /**
   * Constructs an Iterator to provide access to the RecoveryReserves for this claim.  Either all the RecoveryReserves
   * or only the new and modified RecoveryReserves can be chosen for retrieval.  If all the RecoveryReserves are chosen
   * for retrieval, then those RecoveryReserves that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
   * and iterating through all the transactions to find just the desired RecoveryReserves.
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified RecoveryReserves for this claim will
   *                           be returned.  This includes recovery reserves for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all RecoveryReserves for the claim will be returned, including new and modified
   *                           RecoveryReserves, but excluding deleted RecoveryReserves.
   * @return an Iterator that returns Recoveries
   */
  public java.util.Iterator<entity.RecoveryReserve> getRecoveryReservesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryReservesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the recoveryreserves for this claim.
   * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no recoveryreserve
   * view permission. The recoveryreserves will be returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all RecoveryReserves for this claim.  The returned
   *         rows are actually {@link entity.RecoveryReserveView} entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.RecoveryReserveView> getRecoveryReservesQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryReservesQuery();
  }
  
  /**
   * Gets the value of the ReinsuranceFlaggedStatus field.
   * The reinsurance flagged status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReinsuranceFlaggedStatus getReinsuranceFlaggedStatus() {
    return (typekey.ReinsuranceFlaggedStatus)__getInternalInterface().getFieldValue(REINSURANCEFLAGGEDSTATUS_PROP.get());
  }
  
  /**
   * Description of reason for marking or unmarking a claim for reinsurance.
   * @return The reinsurance reason
   */
  public java.lang.String getReinsuranceReason() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReinsuranceReason();
  }
  
  /**
   * Returns the list of Contact objects related to a claim.  This includes
   * the insured, main contact, reported by person, the driver (if applicable),
   * and all other people associated with the claim.  It also includes
   * people covered by the associated policy.  Duplicates are eliminated,
   * and contacts are sorted alphabetically by display name.  Used to populate
   * pickers for selecting a person who might be relevant to the claim.
   * @return array of contacts associated with the claim
   */
  public entity.Contact[] getRelatedContacts() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts();
  }
  
  /**
   * Returns the list of Contact objects of a given type that are related to a claim.
   * Used to populate pickers for selecting a person who might be relevant to the claim.
   * @param subtype The subtype
   * @return array of contacts associated with the claim. The component type of the array
   *         is that of the given subtype. For example, for the subtype representing "Person" the
   *         return value will be of type Person[].
   */
  public entity.Contact[] getRelatedContacts(gw.lang.reflect.IType subtype) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts(subtype);
  }
  
  public entity.Contact[] getRelatedContacts(java.lang.Iterable<? extends gw.lang.reflect.IType> subtypes) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts(subtypes);
  }
  
  /**
   * Returns the list of contact objects for the users related to the claim: all users that are assigned to
   * either the claim, its exposures, or any of its activities.  Returns an
   * empty array if the claim is new, since new claims and their
   * activities/exposures haven't been assigned yet.
   */
  public entity.Contact[] getRelatedUserContacts() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUserContacts();
  }
  
  /**
   * Returns a map of users and groups related to the claim: all users that are assigned to
   * either the claim, its exposures, or any of its activities.  Returns an
   * empty hashmap if the claim is new, since new claims and their
   * activities/exposures haven't been assigned yet.
   * <p/>
   * The specified User is excluded from the set of returned User objects.
   * @param excludedUser The user to exclude.
   * @return a HashMap that maps assigned user to assigned group; for example,
   *         if the entry is for the exposure assigned user, the assigned user will map
   *         to the assigned group for that exposure.
   */
  public java.util.Map<entity.User, entity.Group> getRelatedUserGroupMap(entity.User excludedUser) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUserGroupMap(excludedUser);
  }
  
  /**
   * Returns the list of users related to the claim: all users that are assigned to
   * either the claim, its exposures, or any of its activities.  Returns an
   * empty array if the claim is new, since new claims and their
   * activities/exposures haven't been assigned yet.
   */
  public entity.User[] getRelatedUsers() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUsers();
  }
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimReopenedReason getReopenedReason() {
    return (typekey.ClaimReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
  }
  
  /**
   * Gets the value of the ReportedByType field.
   * Relationship of the person who reported the claim to the insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getReportedByType() {
    return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(REPORTEDBYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ReportedDate field.
   * Date on which the loss was reported.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(REPORTEDDATE_PROP.get());
  }
  
  /**
   * Array association accessor for key ReserveChangeCountClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveChangeCountClaimMetric getReserveChangeCountClaimMetric() {
    return (entity.ReserveChangeCountClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ReserveChangeCountClaimMetric"));
  }
  
  /**
   * Gets the value of the ReserveLines field.
   * ReserveLines relating to this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine[] getReserveLines() {
    return (entity.ReserveLine[])__getInternalInterface().getFieldValue(RESERVELINES_PROP.get());
  }
  
  /**
   * Constructs an Iterator to provide access to the Reserves for this claim.  Either all the Reserves
   * or only the new and modified Reserves can be chosen for retrieval.  If all the Reserves are chosen
   * for retrieval, then those Reserves that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
   * and iterating through all the transactions to find just the desired Reserves.
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified Reserves for this claim will
   *                           be returned.  This includes reserves for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all Reserves for the claim will be returned, including new and modified
   *                           Reserves, but excluding deleted Reserves.
   * @return an Iterator that returns Reserves
   */
  public java.util.Iterator<entity.Reserve> getReservesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReservesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the reserves for this claim.
   * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no reserve view permission.
   * The reserves will be returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all Reserves for this claim.  The returned
   *         rows are actually {@link entity.ReserveView} entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.ReserveView> getReservesQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReservesQuery();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the RoleAssignments field.
   * The user role assignments for this claim.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRoleAssignment[] getRoleAssignments() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRoleAssignments();
  }
  
  /**
   * Gets owners of roles on the Claim. This includes the claim, plus any owners associated with the claim (e.g., its
   * exposures, matters, etc.).
   * @return The owners of roles on the claim
   */
  public entity.ClaimContactRoleOwner[] getRoleOwners() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRoleOwners();
  }
  
  /**
   * Gets the value of the SIAnswerSet field.
   * Link to Answer set for SIU
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SIUAnswerSet[] getSIAnswerSet() {
    return (entity.SIUAnswerSet[])__getInternalInterface().getFieldValue(SIANSWERSET_PROP.get());
  }
  
  /**
   * Gets the value of the SIEscalateSIU field.
   * Escalate to SIU team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getSIEscalateSIU() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(SIESCALATESIU_PROP.get());
  }
  
  /**
   * Storage SIU Escalation note for the Claim.
   * @return The SIU Escalation note
   */
  public java.lang.String getSIEscalateSIUNote() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getSIEscalateSIUNote();
  }
  
  /**
   * Gets the value of the SIEscalateSIUdate field.
   * Date escalated to SIU team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSIEscalateSIUdate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SIESCALATESIUDATE_PROP.get());
  }
  
  /**
   * Gets the value of the SIScore field.
   * Special Investigations Score.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSIScore() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SISCORE_PROP.get());
  }
  
  /**
   * Gets the value of the SITriggers field.
   * The triggers for Special Investigations linked to this Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SITrigger[] getSITriggers() {
    return (entity.SITrigger[])__getInternalInterface().getFieldValue(SITRIGGERS_PROP.get());
  }
  
  /**
   * Array association accessor for key SIUClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SIUClaimIndicator getSIUClaimIndicator() {
    return (entity.SIUClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("SIUClaimIndicator"));
  }
  
  /**
   * Gets the value of the SIULifeCycleState field.
   * Current state of SIU trigger rule processing for this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimLifeCycleState getSIULifeCycleState() {
    return (typekey.ClaimLifeCycleState)__getInternalInterface().getFieldValue(SIULIFECYCLESTATE_PROP.get());
  }
  
  /**
   * Gets the value of the SIUStatus field.
   * The SIU status for a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SIUStatus getSIUStatus() {
    return (typekey.SIUStatus)__getInternalInterface().getFieldValue(SIUSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageStatus field.
   * The salvage status for a claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SalvageStatus getSalvageStatus() {
    return (typekey.SalvageStatus)__getInternalInterface().getFieldValue(SALVAGESTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Segment field.
   * Segmentation type of the claim. Both the claim and the exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSegment getSegment() {
    return (typekey.ClaimSegment)__getInternalInterface().getFieldValue(SEGMENT_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequests field.
   * Service requests associated with this claim. Note: if triggersValidation is false, service request metrics will not be run automatically.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest[] getServiceRequests() {
    return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
  }
  
  /**
   * Gets the value of the ShowMedicalFirstInfo field.
   * Show Medical First info section.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getShowMedicalFirstInfo() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(SHOWMEDICALFIRSTINFO_PROP.get());
  }
  
  /**
   * Gets the value of the SpecialHandlingFinancialState field.
   * Tracks previously calculated financial values used by AutomatedHandlerTriggers that trigger on financial thresholds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingFinancialState getSpecialHandlingFinancialState() {
    return (entity.SpecialHandlingFinancialState)__getInternalInterface().getFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingFinancialState[] getSpecialHandlingFinancialStateArray() {
    return (entity.SpecialHandlingFinancialState[])__getInternalInterface().getFieldValue(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * Internal state of the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getState() {
    return (typekey.ClaimState)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the StateAckNumber field.
   * Acknowledgment number of the state file for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStateAckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATEACKNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the StateFileNumber field.
   * Number of the state file for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStateFileNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATEFILENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the StatuteDate field.
   * Date at which the statute of limitations expires for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatuteDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STATUTEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the StorageBarCodeNum field.
   * Storage Bar Code Number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageBarCodeNum() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEBARCODENUM_PROP.get());
  }
  
  /**
   * Gets the value of the StorageBoxNum field.
   * Storage Box Number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageBoxNum() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEBOXNUM_PROP.get());
  }
  
  /**
   * Gets the value of the StorageCategory field.
   * Storage Category.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StorageCategory getStorageCategory() {
    return (typekey.StorageCategory)__getInternalInterface().getFieldValue(STORAGECATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the StorageDate field.
   * Date file shipped to storage facility.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStorageDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STORAGEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the StorageLocationState field.
   * Storage Location State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getStorageLocationState() {
    return (typekey.State)__getInternalInterface().getFieldValue(STORAGELOCATIONSTATE_PROP.get());
  }
  
  /**
   * Storage Notes for Claim.
   * @return The storage notes
   */
  public java.lang.String getStorageNotes() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getStorageNotes();
  }
  
  /**
   * Gets the value of the StorageType field.
   * Storage Type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StorageType getStorageType() {
    return (typekey.StorageType)__getInternalInterface().getFieldValue(STORAGETYPE_PROP.get());
  }
  
  /**
   * Gets the value of the StorageVolumes field.
   * Storage Volumes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageVolumes() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEVOLUMES_PROP.get());
  }
  
  /**
   * Gets the value of the Strategy field.
   * Segmentation type of the claim. Both the claim and the exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimStrategy getStrategy() {
    return (typekey.ClaimStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
  }
  
  /**
   * Description of Subjective Complaints for Workers Comp Claim.
   * @return the subjective complaints
   */
  public java.lang.String getSubjComplaints() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getSubjComplaints();
  }
  
  /**
   * Array association accessor for key SubrogationClaimIndicator on array ClaimIndicators
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationClaimIndicator getSubrogationClaimIndicator() {
    return (entity.SubrogationClaimIndicator)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("SubrogationClaimIndicator"));
  }
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Claim's subrogation-related data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary() {
    return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary[] getSubrogationSummaryArray() {
    return (entity.SubrogationSummary[])__getInternalInterface().getFieldValue(SUBROGATIONSUMMARYARRAY_PROP.get());
  }
  
  /**
   * Returns the suggested assignees for this entity, to be displayed in the
   * UI as the most likely assignees when the user is assigning the entity. The list of assignees
   * will depend on the type of entity, and will contain users who are somehow "involved" with the entity,
   * associated claim, or currently assigned user and group.
   * @return the list of suggested assignees, never null or empty
   */
  public gw.api.assignment.Assignee[] getSuggestedAssignees() {
    return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getSuggestedAssignees();
  }
  
  /**
   * Return all non-exclusive contact roles which are suitable for this owner's type and the
   * given contact. Used in the UI to restrict the user to suitable choices when adding a new
   * contact/role pair to the role owner
   * @param contact a contact, possibly null
   * @return an array of suitable roles, or an empty array if there are none
   */
  public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getSuitableNonExclusiveRolesFor(contact);
  }
  
  /**
   * Gets the value of the SupplementalWorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSupplementalWorkloadWeight() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get());
  }
  
  /**
   * Gets the value of the Text field.
   * Large text fields associated with claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimText[] getText() {
    return (entity.ClaimText[])__getInternalInterface().getFieldValue(TEXT_PROP.get());
  }
  
  /**
   * Array association accessor for key TimeBasedClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TimeBasedClaimMetric getTimeBasedClaimMetric() {
    return (entity.TimeBasedClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TimeBasedClaimMetric"));
  }
  
  /**
   * Array association accessor for key TimeToFirstPaymentClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TimeToFirstPaymentClaimMetric getTimeToFirstPaymentClaimMetric() {
    return (entity.TimeToFirstPaymentClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TimeToFirstPaymentClaimMetric"));
  }
  
  /**
   * Array association accessor for key TotalPaidClaimMetric on array ClaimMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TotalPaidClaimMetric getTotalPaidClaimMetric() {
    return (entity.TotalPaidClaimMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TotalPaidClaimMetric"));
  }
  
  /**
   * Gets the value of the Transactions field.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions() {
    return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
  }
  
  /**
   * Constructs an Iterator to provide access to the Transactions for this claim.  Either all the Transactions
   * or only the new and modified Transactions can be chosen for retrieval.  If all the Transactions are chosen
   * for retrieval, then those Transactions that have been removed in the current transaction will not be
   * returned by the Iterator.
   * <p/>
   * Note: This is a more efficient alternative to calling {@link entity.Claim#getTransactions()}, particularly if you are
   * only interested in new or modified transactions
   * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * @param newAndModifiedOnly if <code>true</code> then only new and modified Transactions for this claim will
   *                           be returned.  This includes transactions for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all Transactions for the claim will be returned, including new and modified
   *                           Transactions, but excluding deleted Transactions.
   * @return an Iterator that returns Transactions
   */
  public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTransactionsIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the transactions, regardless of subtype, for this claim.
   * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
   * current user's transaction view permissions.  The transactions will be returned as they currently exist
   * on the database.
   * @return a QueryProcessor that encapsulates the query to return all Transactions for this claim.  The returned
   *         rows are actually {@link entity.TransactionDefaultView} entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.TransactionDefaultView> getTransactionsQuery() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTransactionsQuery();
  }
  
  /**
   * Description of TreatmentRendered for Workers Comp Claim.
   * @return The description of the treatment rendered
   */
  public java.lang.String getTreatmentRend() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTreatmentRend();
  }
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the UMR_Ext field.
   * A Unique Market Reference (UMR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * Gets the assignment that corresponds to the given user and role, or null
   * if none matches.
   * @param user 
   * @param userRole 
   * @return 
   */
  public entity.UserRoleAssignment getUserRoleAssignment(entity.User user, typekey.UserRole userRole) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignment(user, userRole);
  }
  
  /**
   * Gets the user role assignment for that role
   * If there's no assignment for that role, returns null.
   * If there is more than one assignment for that role, then the first role will be returned.
   * Note: getUserRoleAssignmentsByRole(UserRole) should be called if multiple assignments are expected to return.
   * @param role The role for the assignment
   */
  public entity.UserRoleAssignment getUserRoleAssignmentByRole(typekey.UserRole role) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignmentByRole(role);
  }
  
  /**
   * Get the user role assignments for that role. If no assignment for that role,
   * then an empty array is returned.
   * @param role The role for the assignment
   * @return an array of user role assignments for the given role. The array is empty if no such user role assignment.
   */
  public entity.UserRoleAssignment[] getUserRoleAssignmentsByRole(typekey.UserRole role) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignmentsByRole(role);
  }
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel() {
    return (typekey.ValidationLevel)__getInternalInterface().getFieldValue(VALIDATIONLEVEL_PROP.get());
  }
  
  /**
   * Gets the validation result.
   * @return The validation result.
   */
  public gw.api.validation.ValidationResult getValidationResult() {
    return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
  }
  
  /**
   * 
   * @return An array of Vehicles associated with the claim, its exposures, and its policy.
   */
  public entity.Vehicle[] getVehicles() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getVehicles();
  }
  
  /**
   * 
   * @return returns all authors of all viewable notes.
   */
  public entity.User[] getViewableNoteAuthors() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNoteAuthors();
  }
  
  /**
   * 
   * @return returns all notes viewable by the current user.
   */
  public gw.api.database.IQueryBeanResult<entity.Note> getViewableNotes() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNotes();
  }
  
  /**
   * 
   * @param topicType The topic type
   * @return returns all notes with a specific note topic type viewable by the current user.
   */
  public gw.api.database.IQueryBeanResult<entity.Note> getViewableNotes(typekey.NoteTopicType topicType) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNotes(topicType);
  }
  
  /**
   * Gets the value of the Weather field.
   * Weather conditions at the time of accident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WeatherType getWeather() {
    return (typekey.WeatherType)__getInternalInterface().getFieldValue(WEATHER_PROP.get());
  }
  
  /**
   * Gets the value of the Workflows field.
   * Set of workflows associated with this Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkflow[] getWorkflows() {
    return (entity.ClaimWorkflow[])__getInternalInterface().getFieldValue(WORKFLOWS_PROP.get());
  }
  
  /**
   * Gets the value of the WorkloadUpdated field.
   * Last time user workload was calculated and updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWorkloadUpdated() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WORKLOADUPDATED_PROP.get());
  }
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKLOADWEIGHT_PROP.get());
  }
  
  /**
   * Tests whether this claim has at least one claim-level payment whose status is Awaiting Submission and
   * whose scheduled send date is today.
   * @return <code>true</code> if the above criteria are met, else <code>false</code>
   */
  public boolean hasAwaitingSubmissionPaymentsForToday() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasAwaitingSubmissionPaymentsForToday();
  }
  
  /**
   * 
   * @return True if there is a claimant on the claim
   * @deprecated use {@link #canHaveClaimantOnClaim} instead
   */
  public boolean hasClaimantOnClaim() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasClaimantOnClaim();
  }
  
  /**
   * Returns true if the claim has an exposure of the indicated type. If exposureType is null,
   * then it will return true if the claim has any exposures, false otherwise.
   * @param exposureType the type of the exposure to look for
   * @return true if the claim has an exposure of the given type, false otherwise
   */
  public boolean hasExposureOfType(typekey.ExposureType exposureType) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasExposureOfType(exposureType);
  }
  
  /**
   * Returns true if the claim is the owner of any open exposure.
   * @return true if the claim has an open exposure.
   */
  public boolean hasOpenExposures() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasOpenExposures();
  }
  
  /**
   * Verifies whether this claim has passed the ability to pay validation level and so can have a payment
   * created against it. The verification may potentially end up performing validation of the claim.
   * @return <code>true</code> if this claim has passed the "ability to pay" validation level,
   *         else <code>false</code>
   */
  public boolean hasPassedAbilityToPay() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasPassedAbilityToPay();
  }
  
  /**
   * Used by rules to check if the claim has reported archive problem
   * @return true if there are problems reported
   */
  public boolean hasReportedArchiveProblem() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasReportedArchiveProblem();
  }
  
  /**
   * Determines whether anyone in the specified group has worked on this claim
   * before.
   * <p/>
   * "Worked on a claim" includes the (current) claim owner, owner of
   * a exposure, owner of an activity (open or closed) related to the claim,
   * and owner of an activity (open or closed) related to a exposure.
   * @param groupId The id of a group to check on.
   * @return <tt>true</tt> if any member of the group has worked on this
   *         <tt>claim</tt>
   */
  public boolean hasWorkedOn(gw.pl.persistence.core.Key groupId) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasWorkedOn(groupId);
  }
  
  /**
   * Verifies whether this claim is at the ability to pay validation level. Note: Unlike {@link #hasPassedAbilityToPay()},
   * this API never performs validation of the claim. It only verifies against whatever validation level that has been
   * set currently on the claim.
   * @return <code>true</code> if this claim is at the "ability to pay" validation level, else <code>false</code>
   */
  public boolean isAtAbilityToPay() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isAtAbilityToPay();
  }
  
  /**
   * Gets the value of the BenefitsStatusDcsn field.
   * Indicates if the benefits decision has been made yet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBenefitsStatusDcsn() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BENEFITSSTATUSDCSN_PROP.get());
  }
  
  /**
   * Returns true if a payment can be made against this claim at the claim-level.  Specifically,
   *  returns true if:
   *  <ul>
   *  <li> Claim is closed and previous payments have been made on it
   *  <li> Claim is open and global PaymentExceedsReserves = true
   *  <li> Claim is open and no reserves have been created for the claim
   *  <li> Claim is open and has available reserves
   *  </ul>
   * @return True if claim level payment is allowed
   */
  public boolean isClaimLevelPaymentAllowed() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClaimLevelPaymentAllowed();
  }
  
  /**
   * Checks system configuration to see if claim number generation is enabled
   * @return true if EnableClaimNumberGeneration system configuration parameter is true, false otherwise
   */
  public boolean isClaimNumberGenerationEnabled() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClaimNumberGenerationEnabled();
  }
  
  /**
   * True if the claim is closed.
   * @return true if the claim is closed.
   */
  public boolean isClosed() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClosed();
  }
  
  /**
   * Gets the value of the ComputerSecurity field.
   * Whether computer security issues were involved.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isComputerSecurity() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPUTERSECURITY_PROP.get());
  }
  
  /**
   * Determines whether some data on the contact in the given role has changed.
   * @param role 
   */
  public boolean isContactInRoleChanged(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleChanged(role);
  }
  
  /**
   * Determines whether the contact in the given role is a different contact than the one originally
   * in the role.
   * @param role 
   */
  public boolean isContactInRoleDifferent(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleDifferent(role);
  }
  
  /**
   * Gets the value of the CoverageInQuestion field.
   * Whether the claim is covered by the claimant's policies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageInQuestion() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGEINQUESTION_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentConditions field.
   * Current conditions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCurrentConditions() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CURRENTCONDITIONS_PROP.get());
  }
  
  /**
   * Returns true if the claim is flagged (TC_ISFLAGGED).
   * @return True if claim is flagged
   */
  public boolean isCurrentlyFlagged() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isCurrentlyFlagged();
  }
  
  /**
   * Gets the value of the DiagnosticCnsistnt field.
   * Is the diagnostic consistent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiagnosticCnsistnt() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DIAGNOSTICCNSISTNT_PROP.get());
  }
  
  /**
   * Queries the database to see if any other claim has the same claim number as this one. Useful in
   * the new claim wizard, if claim number generation is disabled. If this claim's number is blank
   * (null, empty or all whitespace) doesn't even query database and just returns false, on the
   * assumption that no claim can have a blank claim number.
   * @return true if there is an existing claim with the same claim number, false otherwise.
   */
  public boolean isDuplicateClaimNumber() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isDuplicateClaimNumber();
  }
  
  /**
   * Gets the value of the EmploymentInjury field.
   * Workers' Comp only. Whether the injury occurred in course of employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEmploymentInjury() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EMPLOYMENTINJURY_PROP.get());
  }
  
  /**
   * Determines whether the given role is exclusive for this type of assignable object.
   * @param userRole 
   * @return 
   */
  public boolean isExclusive(typekey.UserRole userRole) {
    return ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).isExclusive(userRole);
  }
  
  /**
   * Determines whether or not the given role has the 'Exclusive' constraint on this object.
   * @param role a contact role, cannot be null
   */
  public boolean isExclusiveRole(typekey.ContactRole role) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
  }
  
  /**
   * Can exposures be added to this claim? Claims with some loss types can have a variable number of exposures,
   * while others always have a fixed set. For example in many systems Workers Compensation claims always have
   * just one or two exposures and the end user cannot add or remove exposures once the claim has been created.
   * This property reads a configuration parameter, ShowNewExposureMenuForLossTypes, and returns true if the
   * loss type of the current claim is in that list. The result of this method is used to enable and disable
   * various features in the UI - for example whether to show the new exposure menu, whether to show the
   * claim exposure list page etc.
   * @return true if this claim's loss type is such that it can have a variable number of exposures, false
   *         otherwise
   */
  public boolean isExposureListChangeable() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListChangeable();
  }
  
  /**
   * Should the exposures for this claim be displayed in the top level of the claim file?
   * @return true if this claim's loss type is such that it has a fixed set of exposures and the
   *         configuration parameter ShowFixedExposuresInLossDetails is false
   */
  public boolean isExposureListVisibleInClaimFile() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListVisibleInClaimFile();
  }
  
  /**
   * Should the exposures for this claim be displayed in the loss details area of the UI?
   * @return true if this claim's loss type is such that it has a fixed set of exposures and the
   *         configuration parameter ShowFixedExposuresInLossDetails is true
   */
  public boolean isExposureListVisibleInLossDetails() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListVisibleInLossDetails();
  }
  
  /**
   * Whether this was a first and final claim. NOTE: This property value is only valid inside the
   * FNOL wizard and is not saved to the database. It can only be relied upon in
   * code or rules which will run during the FNOL wizard.
   * @return true if this claim is a First and Final
   */
  public boolean isFirstAndFinal() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isFirstAndFinal();
  }
  
  /**
   * Gets the value of the FirstNoticeSuit field.
   * Boolean field to indicate suit at the time of the first notice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFirstNoticeSuit() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIRSTNOTICESUIT_PROP.get());
  }
  
  /**
   * Gets the value of the FurtherTreatment field.
   * Is further treatment required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFurtherTreatment() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FURTHERTREATMENT_PROP.get());
  }
  
  /**
   * 
   * @return True if there are other claims that may be duplicates of this claim.
   */
  public boolean isHasDuplicateClaimNumbers() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isHasDuplicateClaimNumbers();
  }
  
  /**
   * Gets the value of the HazardousWaste field.
   * Boolean field to mark a claim as involving hazardous waste.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHazardousWaste() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(HAZARDOUSWASTE_PROP.get());
  }
  
  /**
   * Gets the value of the ISOEnabled field.
   * Is this field enabled for ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isISOEnabled() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOENABLED_PROP.get());
  }
  
  /**
   * Gets the value of the ISOKnown field.
   * Has a search request for this object been successfully received by ISO?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isISOKnown() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOKNOWN_PROP.get());
  }
  
  /**
   * Gets the value of the IncidentReport field.
   * True if this is an incident report only and the claim will not be processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentReport() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTREPORT_PROP.get());
  }
  
  /**
   * Gets the value of the InjuredOnPremises field.
   * Was the employee injured on the premesis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInjuredOnPremises() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INJUREDONPREMISES_PROP.get());
  }
  
  /**
   * Gets the value of the InjuredRegularJob field.
   * Was the employee injured while doing his or her regular job.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInjuredRegularJob() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INJUREDREGULARJOB_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredPremises field.
   * @deprecated True if the incident occurred on the employer's premises.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInsuredPremises() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INSUREDPREMISES_PROP.get());
  }
  
  /**
   * Return true if Metro Message sink is enable.
   * @return True if metro is enabled
   */
  public boolean isMetroEnable() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isMetroEnable();
  }
  
  /**
   * Gets the value of the ModifiedDutyAvail field.
   * Is Modified Duty Available at Work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isModifiedDutyAvail() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MODIFIEDDUTYAVAIL_PROP.get());
  }
  
  /**
   * Gets the value of the Mold field.
   * Boolean field to mark a claim as involving mold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMold() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOLD_PROP.get());
  }
  
  /**
   * The value of the server parameter MulticurrencyDisplayMode.
   * Use CurrencyUtil.MultiCurrencyMode instead.
   * @return True if in multi-currency display mode
   * @deprecated Use CurrencyUtil.MultiCurrencyMode instead.
   */
  public boolean isMultiCurrencyDisplayMode() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isMultiCurrencyDisplayMode();
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * Indicates whether or not this is considered a new claim with reference to this user.  A claim is
   * considered "new" for a user if the claim has a temporary ID or if the claim is in draft state and
   * this user is the user that created the claim.
   * @param user the user to check
   * @return <code>true</code> if this is a new claim for this user, <code>false</code> otherwise
   */
  public boolean isNewForUser(entity.User user) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isNewForUser(user);
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Gets the value of the PTPinMPN field.
   * Is Primary Treating Physician in MPN?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPTPinMPN() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PTPINMPN_PROP.get());
  }
  
  /**
   * Is the activity pattern applicable to this claim?
   * @param pattern The activity pattern
   * @return True if the activity pattern is valid for the claim
   */
  public boolean isPatternValidForClaim(entity.ActivityPattern pattern) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isPatternValidForClaim(pattern);
  }
  
  /**
   * Returns true if this claim's policy is edited or replaced.  Also returns
   * true if a coverage or endorsement on the policy is added, edited, or deleted.
   * Note that false is returned for changes to all other policy related objects
   * such as vehicles, properties, and contacts.
   * @return True if policy is changed
   */
  public boolean isPolicyChanged() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isPolicyChanged();
  }
  
  /**
   * Gets the value of the PreexDisblty field.
   * Whether the injured person had a pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPreexDisblty() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PREEXDISBLTY_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuranceReportable field.
   * True if this claim has exceeded the Reinsurance Reporting Threshold
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReinsuranceReportable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(REINSURANCEREPORTABLE_PROP.get());
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * Determines whether or not the given role has the given constraint on this object.
   * @param role 
   * @param constraintType 
   */
  public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
  }
  
  /**
   * Gets the value of the SafetyEquipProv field.
   * Was safety equipment provided.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSafetyEquipProv() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SAFETYEQUIPPROV_PROP.get());
  }
  
  /**
   * Gets the value of the SafetyEquipUsed field.
   * Was safety equipment used.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSafetyEquipUsed() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SAFETYEQUIPUSED_PROP.get());
  }
  
  /**
   * True if the user specified is the note supervisor on this claim.
   * @param user the user to check.
   * @return True if the user is a note supervisor
   */
  public boolean isSupervisor(entity.User user) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isSupervisor(user);
  }
  
  /**
   * Gets the value of the TreatedPatientBfr field.
   * Has the patient been treated before.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTreatedPatientBfr() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TREATEDPATIENTBFR_PROP.get());
  }
  
  /**
   * Gets the value of the UberPrecautionaryFlag_Ext field.
   * This flag indicates if this ECF Claim is a Uber Precautionary.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isUberPrecautionaryFlag_Ext() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(UBERPRECAUTIONARYFLAG_EXT_PROP.get());
  }
  
  /**
   * Gets the value of the VCSIndicator_Ext field.
   * Indicates if this ECF Claim is a Volume Claims Service (VCS) claim. This is indicated by the TriageCategory in an ECF message (Lloyd's only).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVCSIndicator_Ext() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VCSINDICATOR_EXT_PROP.get());
  }
  
  /**
   * Returns true if this claim is valid at the specified level. Optionally
   * checks exposures too. Note this method does <i>not</i> call validation
   * rules; it simply check the claim's existing validation level.
   * @param level The level to check against.
   * @param bIncludeExposures Indicates whether or not the claim's exposures s/b
   *                          checked as well.
   * @return True if this claim is valid at the specified level.
   */
  public boolean isValid(typekey.ValidationLevel level, boolean bIncludeExposures) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValid(level, bIncludeExposures);
  }
  
  /**
   * Executes claim-closed validation rules and returns whether or not this
   * claim passes.
   * @param level The level to check
   * @return True if this claim passes.
   */
  public boolean isValidClosed(typekey.ValidationLevel level) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValidClosed(level);
  }
  
  /**
   * Executes claim-reopened validation rules and returns whether or not this
   * claim passes.
   * @param level The level to check
   * @return True if this claim passes.
   */
  public boolean isValidReopened(typekey.ValidationLevel level) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValidReopened(level);
  }
  
  /**
   * Gets the value of the WeatherRelated field.
   * Is related to weather
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWeatherRelated() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WEATHERRELATED_PROP.get());
  }
  
  /**
   * If the given limit type is AggregateLimitType.TC_ANNUALREPORTEDDATE,
   * then returns true if this claim's reported date is within or on its
   * policy's effective and expiration date.
   * <p/>
   * If the given limit type is AggregateLimitType.TC_ANNUALLOSSDATE, then
   * returns true if this claim's loss date is within or on its policy's
   * effective and expiration date.
   * <p/>
   * If the given limit type is AggregateLimitType.TC_LIFETIMELIMIT, then
   * returns true.
   * @param limitType The aggregate limit type
   * @return True or false based on the aggregate limit type (see above)
   */
  public boolean isWithinEffectivePeriod(typekey.AggregateLimitType limitType) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isWithinEffectivePeriod(limitType);
  }
  
  public void markPurgeReady(boolean purgeFromAggregateLimit) throws gw.api.webservice.exception.EntityStateException {
    ((com.guidewire.cc.domain.purging.Purgeable)__getDelegateManager().getImplementation("com.guidewire.cc.domain.purging.Purgeable")).markPurgeReady(purgeFromAggregateLimit);
  }
  
  /**
   * Creates an activity from an activity pattern.  The type of the created activity will match the type of the
   * pattern.  Fields on the activity will be populated by fields on the pattern, including the escalation date, which
   * is calculated from the estimated completion days on the pattern.
   * <p/>
   * The previousUserID field is also set with the id of the user calling this method.  In future, the rules engine and
   * other automated clients of the API will have distinct users - until then, the previousUserID will be null
   * @param pattern Pattern with with to populate a new activity
   * @param exposure Exposure to associate with the activity
   * @return A new activity populated by the pattern
   */
  public entity.Activity newActivity(entity.ActivityPattern pattern, entity.Exposure exposure) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newActivity(pattern, exposure);
  }
  
  /**
   * Returns a new CheckCreator object for creating a check on this claim.
   */
  public gw.api.financials.CheckCreator newCheckCreator() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newCheckCreator();
  }
  
  /**
   * Factory method for creating a new unpopulated EmploymentData instance in the same
   * bundle as this claim. Note that this method will correctly populate
   * the {@link EmploymentData#setClaim(entity.Claim)} foreign key link. It does NOT set
   * the {@link entity.Claim#getEmploymentData()} property on
   * this Claim.
   * @return The employment data instance
   */
  public entity.EmploymentData newEmploymentData() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newEmploymentData();
  }
  
  /**
   * Create a new blank evaluation.
   * @return Evaluation
   */
  public entity.Evaluation newEvaluation() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newEvaluation();
  }
  
  /**
   * Returns an editable Exposure in either a new bundle or the bundle of the claim. The exposure
   * is initialized with the following values:
   * <ul>
   * <li>Claim  - set to this claim
   * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
   * <li>ExposureType - set to the exposure type determined by coverageSubType
   * <li>PrimaryCoverage - set to the given coverage type
   * <li>CoverageSubType - set to the given coverage subtype
   * <li>LossParty - if there is only one possible loss party type value for the given coverage
   * subtype then the loss party will be set to that value. Otherwise it will be set to null.
   * <li>State - set to Draft
   * <li>Incident - set to a newly created incident of the appropriate type for this exposure
   * <ul>
   * Unless this method is used in the new claim wizard you will usually want to call the exposure's
   * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
   * the appropriate rules. You don't need to do this if this method is called in the new claim
   * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
   * set up the claim's draft exposures.
   * @param coverageType the exposure coverage type
   * @param coverageSubType the exposure coverage sub type
   * @param useClaimSource if true, and if the claim is in a writable bundle, then creates the
   *                        exposure in the claim's bundle. Otherwise the exposure is created in a new bundle. This
   *                        parameter should nearly always be true.
   * @return the newly created exposure
   */
  public entity.Exposure newExposure(typekey.CoverageType coverageType, typekey.CoverageSubtype coverageSubType, boolean useClaimSource) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposure(coverageType, coverageSubType, useClaimSource);
  }
  
  /**
   * Returns an editable Exposure in either a new bundle or the bundle of the claim. The exposure
   * is initialized with the following values:
   * <ul>
   * <li>Claim  - set to this claim
   * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
   * <li>ExposureType - set to the given type
   * <li>State - set to Draft
   * <li>Incident - set to a newly created incident of the appropriate type for this exposure
   * <ul>
   * Unless this method is used in the new claim wizard you will usually want to call the exposure's
   * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
   * the appropriate rules. You don't need to do this if this method is called in the new claim
   * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
   * set up the claim's draft exposures.
   * @param subtype the exposure "subtype"
   * @param useClaimSource if true, and if the claim is in a writable bundle, then creates the
   *                       exposure in the claim's bundle. Otherwise the exposure is created in a new bundle. This
   *                       parameter should nearly always be true.
   * @return the newly created exposure
   */
  public entity.Exposure newExposure(typekey.ExposureType subtype, boolean useClaimSource) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposure(subtype, useClaimSource);
  }
  
  /**
   * Creates a new Exposure in the same bundle as the claim (which must be in an
   * editable bundle). The exposure is initialized with the following values:
   * <ul>
   * <li>Claim - set to this claim,
   * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
   * <li>ExposureType - set to the exposure type determined by coverageSubType
   * <li>PrimaryCoverage - set to the given coverage type
   * <li>CoverageSubType - set to the given coverage subtype
   * <li>LossParty - if there is only one possible loss party type value for the given coverage
   * subtype then the loss party will be set to that value. Otherwise it will be set to null.
   * <li>Coverage - set to the given coverage (may be null)
   * <li>State - set to Draft
   * </ul>
   * The exposure incident is not created and is left null, so the caller can set or create the
   * incident as they wish. For example, they might:
   * <ul>
   * <li>Create a new, empty, incident using the exposure's ensureIncidentCreated() method
   * <li>Set the incident field to point at an existing incident from this claim
   * <li>Call a custom method to create the incident and then set the incident field to point at this
   * new incident
   * </ul>
   * This method gives the most control when creating a new exposure. If you use one of the other
   * newExposure methods to create a new exposure and a new incident at the same time it is tricky
   * to set the incident if you want to create or set it yourself. You will have to explicitly
   * remove the automatically created incident and then replace it with your own. If you just set
   * the incident field without doing a remove the automatically created incident will still be in
   * the bundle and will be added to the claim when it commits. But if you use this method it is
   * trivial to add a new incident if you want to, but you can also set it to an existing or custom
   * value if you wish.
   * <p/>
   * Unless this method is used in the new claim wizard you will usually want to call the exposure's
   * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
   * the appropriate rules. You don't need to do this if this method is called in the new claim
   * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
   * set up the claim's draft exposures.
   * @param coverageType the exposure coverage type, must not be null
   * @param coverageSubtype the exposure coverage sub type, must not be null
   * @param coverage the exposure coverage, can be null
   * @return the newly created exposure, with a null incident
   */
  public entity.Exposure newExposureWithNoIncident(typekey.CoverageType coverageType, typekey.CoverageSubtype coverageSubtype, entity.Coverage coverage) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposureWithNoIncident(coverageType, coverageSubtype, coverage);
  }
  
  /**
   * Create a new incident of the given type and add it to this claim's incident array
   * @param type an incident type
   * @throws IllegalArgumentException if type is null or not an incident type
   * @return a new incident
   */
  public entity.Incident newIncident(gw.entity.IEntityType type) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newIncident(type);
  }
  
  /**
   * Creates a new blank matter.
   * @return Matter
   */
  public entity.Matter newMatter() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newMatter();
  }
  
  /**
   * Create a new Metro Report on this claim.
   * @return The new metro report
   */
  public entity.MetroReport newMetroReport() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newMetroReport();
  }
  
  /**
   * Create a new blank negotiation.
   * @return Negotiation
   */
  public entity.Negotiation newNegotiation() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newNegotiation();
  }
  
  /**
   * Adds a new RITransactionSet with no RITransactions to this claim.
   * @return The transaction set
   */
  public entity.RITransactionSet newRITransactionSet() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRITransactionSet();
  }
  
  /**
   * Adds a new empty RecoveryReserveSet to this claim
   * @return The transaction set
   */
  public entity.RecoveryReserveSet newRecoveryReserveSet() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRecoveryReserveSet();
  }
  
  /**
   * Adds a new empty RecoverySet to this claim
   * @return The transaction set
   */
  public entity.RecoverySet newRecoverySet() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRecoverySet();
  }
  
  /**
   * Adds a new empty ReserveSet to this claim
   * @return The transaction set
   */
  public entity.ReserveSet newReserveSet() {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newReserveSet();
  }
  
  public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
    ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
  }
  
  /**
   * Rebuilds the ACL on the claim.  This will effectively clear the ACL and then rebuild it
   * based on the security configuration and the activities, exposures, and claim users currently
   * associated with the claim.
   */
  public void rebuildClaimACL() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).rebuildClaimACL();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Reload the claim's policy from the Policy adapter and refresh any claim-related information.
   * Retrieves policy using the current policy number and claim loss date and sets it on the claim again.
   * @throws PolicyNotFoundException If the policy can't be found
   * @throws PolicyNotUniqueException If the policy is not unique
   * @throws IllegalStateException If the Claim does not already have a Policy
   */
  public void refreshPolicy() throws com.guidewire.cc.domain.policy.impl.PolicyNotFoundException, com.guidewire.cc.domain.policy.impl.PolicyNotUniqueException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).refreshPolicy();
  }
  
  /**
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * Note that this is the fullest version of "reject"; all the others are
   * overloaded for easier use.
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Removes all roles associated with this ClaimContactRoleOwner.
   */
  public void removeAllRoles() {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
  }
  
  /**
   * Removes a problem description from the claim
   * @param flaggedReason Reason to be removed
   * @return True if claim was actually flagged
   */
  public boolean removeFlagReason(java.lang.String flaggedReason) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).removeFlagReason(flaggedReason);
  }
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimISOMatchReports(entity.ClaimISOMatchReport element) {
    __getInternalInterface().removeArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimISOMatchReports(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimIndicators(entity.ClaimIndicator element) {
    __getInternalInterface().removeArrayElement(CLAIMINDICATORS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimIndicators(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMINDICATORS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimMetrics(entity.ClaimMetric element) {
    __getInternalInterface().removeArrayElement(CLAIMMETRICS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimMetrics(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMMETRICS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimSynchStates(entity.ClaimSynchState element) {
    __getInternalInterface().removeArrayElement(CLAIMSYNCHSTATES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimSynchStates(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMSYNCHSTATES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
   */
  public void removeFromConcurrentEmpl(entity.ConcurrentEmployment element) {
    __getInternalInterface().removeArrayElement(CONCURRENTEMPL_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromConcurrentEmpl(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CONCURRENTEMPL_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   */
  public void removeFromContacts(entity.ClaimContact element) {
    __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContacts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
   */
  public void removeFromContribFactors(entity.ContribFactor element) {
    __getInternalInterface().removeArrayElement(CONTRIBFACTORS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContribFactors(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CONTRIBFACTORS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   */
  public void removeFromDocuments(entity.Document element) {
    __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocuments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
   */
  public void removeFromDrugsPrescribed(entity.DrugPrescribed element) {
    __getInternalInterface().removeArrayElement(DRUGSPRESCRIBED_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDrugsPrescribed(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DRUGSPRESCRIBED_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
   */
  public void removeFromEvaluations(entity.Evaluation element) {
    __getInternalInterface().removeArrayElement(EVALUATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEvaluations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EVALUATIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.Exposure element) {
    __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposures(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   */
  public void removeFromHistory(entity.History element) {
    __getInternalInterface().removeArrayElement(HISTORY_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHistory(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(HISTORY_PROP.get(), elementID);
  }
  
  /**
   * Remove the given match report form the array of match reports on this Claim/Exposure
   * @param report the report to be removed
   */
  public void removeFromISOMatchReports(entity.ISOMatchReport report) {
    ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).removeFromISOMatchReports(report);
  }
  
  /**
   * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
   */
  public void removeFromIncidents(entity.Incident element) {
    __getInternalInterface().removeArrayElement(INCIDENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIncidents(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INCIDENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
   */
  public void removeFromLMMessages(entity.LMMessage_Ext element) {
    __getInternalInterface().removeArrayElement(LMMESSAGES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLMMessages(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(LMMESSAGES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Matters array. This is achieved by marking the element for removal.
   */
  public void removeFromMatters(entity.Matter element) {
    __getInternalInterface().removeArrayElement(MATTERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Matters array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMatters(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(MATTERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalContactStatus(entity.MedicalContactStatus element) {
    __getInternalInterface().removeArrayElement(MEDICALCONTACTSTATUS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalContactStatus(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(MEDICALCONTACTSTATUS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalTreatments(entity.MedicalTreatment element) {
    __getInternalInterface().removeArrayElement(MEDICALTREATMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalTreatments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(MEDICALTREATMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
   */
  public void removeFromMetroReports(entity.MetroReport element) {
    __getInternalInterface().removeArrayElement(METROREPORTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMetroReports(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(METROREPORTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
   */
  public void removeFromNegotiations(entity.Negotiation element) {
    __getInternalInterface().removeArrayElement(NEGOTIATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNegotiations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(NEGOTIATIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   */
  public void removeFromNotes(entity.Note element) {
    __getInternalInterface().removeArrayElement(NOTES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNotes(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(NOTES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Officials array. This is achieved by marking the element for removal.
   */
  public void removeFromOfficials(entity.Official element) {
    __getInternalInterface().removeArrayElement(OFFICIALS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Officials array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOfficials(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(OFFICIALS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherBenefits(entity.OtherBenefit element) {
    __getInternalInterface().removeArrayElement(OTHERBENEFITS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherBenefits(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(OTHERBENEFITS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
   */
  public void removeFromRIAgreementGroups(entity.RIAgreementGroup element) {
    __getInternalInterface().removeArrayElement(RIAGREEMENTGROUPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRIAgreementGroups(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RIAGREEMENTGROUPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   */
  public void removeFromRICodings(entity.RICoding element) {
    __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
   */
  public void removeFromReserveLines(entity.ReserveLine element) {
    __getInternalInterface().removeArrayElement(RESERVELINES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReserveLines(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RESERVELINES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void removeFromRoleAssignments(entity.UserRoleAssignment value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).removeFromRoleAssignments(value);
  }
  
  /**
   * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoleAssignments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ROLEASSIGNMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
   */
  public void removeFromSIAnswerSet(entity.SIUAnswerSet element) {
    __getInternalInterface().removeArrayElement(SIANSWERSET_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSIAnswerSet(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SIANSWERSET_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
   */
  public void removeFromSITriggers(entity.SITrigger element) {
    __getInternalInterface().removeArrayElement(SITRIGGERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSITriggers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SITRIGGERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequests(entity.ServiceRequest element) {
    __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   */
  public void removeFromText(entity.ClaimText element) {
    __getInternalInterface().removeArrayElement(TEXT_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TEXT_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(entity.Transaction element) {
    __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
   */
  public void removeFromWorkflows(entity.ClaimWorkflow element) {
    __getInternalInterface().removeArrayElement(WORKFLOWS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWorkflows(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(WORKFLOWS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given ClaimContactRole from this owner.
   * @param claimContactRole 
   * @throws IllegalArgumentException if this is not the owner of the given ClaimContactRole.
   */
  public void removeRole(entity.ClaimContactRole claimContactRole) {
    ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).removeRole(claimContactRole);
  }
  
  /**
   * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
   * should only be used with Required or ZeroToMore roles.
   * @param role Role that is not exclusive
   * @param contact 
   * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
   * right type for the given role. For exclusive roles, use
   * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
   */
  public void removeRole(typekey.ContactRole role, entity.Contact contact) {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeRole(role, contact);
  }
  
  /**
   * Reopens the claim.
   * @param reopenReason The reason for re-opening the claim
   * @param noteBody The note to attach for re-opening the claim
   * @throws ReopenException If an error occurs reopening the claim
   * @throws EntityValidationException If a validation exception occurs
   */
  public void reopen(typekey.ClaimReopenedReason reopenReason, java.lang.String noteBody) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).reopen(reopenReason, noteBody);
  }
  
  /**
   * Used by rules to report archiving problems.  If a problem is reported the
   * Claim will be excluded from archive, meaning it will not be picked up again
   * by the archiving process.  To skip this Claim temporarily, use skipFromArchiving().
   * @param reason reason that this claim cannot be archived
   */
  public void reportArchiveProblem(java.lang.String reason) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).reportArchiveProblem(reason);
  }
  
  /**
   * This function resolves the relatedContact and its relationships before setting the contactContact.
   * In the case that the relatedContact is brought in from AddressBook, we have to prevent duplicated relationships
   * being added to the primaryContact (which we assumed it to be related to the claim). Therefore, any relationships
   * between the two contacts are removed.
   * @param contactContact The contact relationship
   * @param primaryContact The primary contact
   * @param relatedContact The related contact
   */
  public void resolveAndSetContactContact(entity.ContactContact contactContact, entity.Contact primaryContact, entity.Contact relatedContact) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).resolveAndSetContactContact(contactContact, primaryContact, relatedContact);
  }
  
  /**
   * Resolves the contact and its relationship to reconcile with the ClaimContacts and its related graph in the claim.
   * @param contact The contact to resolve
   * @return The resolved contact
   */
  public entity.Contact resolveContact(entity.Contact contact) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).resolveContact(contact);
  }
  
  public void saveAndSetup(gw.api.assignment.Assignee claimAssignment, gw.api.assignment.Assignee[] exposureAssignments) throws com.guidewire.pl.system.exception.ConcurrentDataChangeException, com.guidewire.pl.system.exception.IllegalAssignmentException, com.guidewire.pl.system.exception.InsufficientPermissionException, com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.cc.system.exception.ClaimNumberNotUniqueException, com.guidewire.cc.domain.claim.ClaimNumberException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).saveAndSetup(claimAssignment, exposureAssignments);
  }
  
  /**
   * If a geocoding plugin is configured, adds a work item to geocode
   * the specified address in batch mode
   * @param address 
   */
  public void scheduleGeocoding(entity.Address address) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).scheduleGeocoding(address);
  }
  
  /**
   * Ensure that the claim's metrics and indicators will be updated when the claim's bundle is
   * committed. This method does <b>not</b> calculate any metric or indicator values immediately,
   * it just arranges that they will be calculated during bundle commit. The calculations must only
   * be done once per commit and they should happen fairly late in the commit process - for example
   * the pre update rules and entity callbacks should already have been executed when the metrics
   * and indicators are calculated.
   */
  public void scheduleHealthUpdate() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).scheduleHealthUpdate();
  }
  
  /**
   * Apply segmentation to this claim.
   * (This does both segmentation and strategy.)
   */
  public void segment() {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).segment();
  }
  
  /**
   * Sends an e-mail message about this object.
   * @param to the Contact to whom the e-mail should be sent.
   * @param from the Contact from whom the e-mail should be sent.
   * @param subject the subject of the e-mail message.
   * @param template the name of the Velocity template to execute for message body generation.
   * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
   */
  public void sendEmail(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String template) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmail(to, from, subject, template);
  }
  
  /**
   * Sends an e-mail message about this object.
   * @param toName the name of the recipient
   * @param toEmailAddress the e-mail address of the recipient
   * @param fromName the name of the sender
   * @param fromEmailAddress the e-mail address of the sender
   * @param subject the subject of the e-mail message.
   * @param template the name of the Velocity template to execute for message body generation.
   * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
   */
  public void sendEmail(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String template) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmail(toName, toEmailAddress, fromName, fromEmailAddress, subject, template);
  }
  
  /**
   * Send email about an object, saving the contents of the email as a document on the parent object.
   * @param to the Contact to whom the e-mail should be sent.
   * @param from the Contact from whom the e-mail should be sent.
   * @param subject the subject of the e-mail message.
   * @param template the name of the Velocity template to execute for message body generation.
   * @param documentTemplate the name of the document template to use for document generation.
   * @param docType the type of document to create
   * @param docStatusType the doc status type?
   * @param docSecurityType 
   * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
   * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
   */
  public void sendEmailAndCreateDocument(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String template, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailAndCreateDocument(to, from, subject, template, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
  }
  
  /**
   * Send email about an object, saving the contents of the email as a document on the parent object.
   * @param toName the name of the recipient
   * @param toEmailAddress the e-mail address of the recipient
   * @param fromName the name of the sender
   * @param fromEmailAddress the e-mail address of the sender
   * @param subject the subject of the e-mail message.
   * @param template the name of the Velocity template to execute for message body generation.
   * @param documentTemplate the name of the document template to use for document generation.
   * @param docType the type of document to create
   * @param docStatusType the doc status type?
   * @param docSecurityType 
   * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
   * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
   */
  public void sendEmailAndCreateDocument(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String template, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailAndCreateDocument(toName, toEmailAddress, fromName, fromEmailAddress, subject, template, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
  }
  
  /**
   * Send email about an object, saving the contents of the email as a document on the parent object.
   * @param to the Contact to whom the e-mail should be sent.
   * @param from the Contact from whom the e-mail should be sent.
   * @param subject the subject of the e-mail message.
   * @param body the body of the e-mail message.
   * @param documentTemplate the name of the document template to use for document generation.
   * @param docType the type of document to create
   * @param docStatusType the doc status type?
   * @param docSecurityType 
   * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
   * @deprecated Now that document creation is available through Gosu, it should be a separate step. See the DocumentProduction Gosu class.
   */
  public void sendEmailWithBodyAndCreateDocument(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String body, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailWithBodyAndCreateDocument(to, from, subject, body, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
  }
  
  /**
   * Send email about an object, saving the contents of the email as a document on the parent object.
   * @param toName the name of the recipient
   * @param toEmailAddress the e-mail address of the recipient
   * @param fromName the name of the sender
   * @param fromEmailAddress the e-mail address of the sender
   * @param subject the subject of the e-mail message.
   * @param body the body of the e-mail message.
   * @param documentTemplate the name of the document template to use for document generation.
   * @param docType the type of document to create
   * @param docStatusType the doc status type?
   * @param docSecurityType 
   * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
   * @deprecated Now that document creation is available through Gosu, it should be a separate step. See the DocumentProduction Gosu class.
   */
  public void sendEmailWithBodyAndCreateDocument(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String body, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
    ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailWithBodyAndCreateDocument(toName, toEmailAddress, fromName, fromEmailAddress, subject, body, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
  }
  
  /**
   * Sets the value of the Access field.
   */
  private void setAccess(entity.ClaimAccess[] value) {
    __getInternalInterface().setFieldValue(ACCESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AccidentType field.
   */
  public void setAccidentType(typekey.AccidentType value) {
    __getInternalInterface().setFieldValue(ACCIDENTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value) {
    __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgencyId field.
   */
  public void setAgencyId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AGENCYID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllocatedClaimNumber field.
   */
  private void setAllocatedClaimNumber(entity.AllocatedClaimNumber value) {
    __getInternalInterface().setFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllocatedClaimNumberArray field.
   */
  private void setAllocatedClaimNumberArray(entity.AllocatedClaimNumber[] value) {
    __getInternalInterface().setFieldValue(ALLOCATEDCLAIMNUMBERARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedByUser field.
   */
  public void setAssignedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedGroup field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedGroup(entity.Group value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedGroup(value);
  }
  
  /**
   * Sets the value of the AssignedQueue field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedQueue(entity.AssignableQueue value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedQueue(value);
  }
  
  /**
   * Sets the value of the AssignedUser field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setAssignedUser(entity.User value) {
    ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedUser(value);
  }
  
  /**
   * Sets the value of the AssignmentDate field.
   */
  private void setAssignmentDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  private void setAssignmentStatus(typekey.AssignmentStatus value) {
    __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the available reserves for this reserve line to the given amount by creating
   * a reserve that increases or decreases the currently available reserves.
   * 
   * This method creates a new ReserveSet and Reserve transaction with the amount necessary to get the AvailableReserves
   * for the matching ReserveLine to equal the newReserveAmount.
   * This transaction amount might be positive if an increase is needed or negative if a decrease is needed.
   * The ReserveSet is not run through pre-setup rules and is immediately submitted for approval.
   * Unlike setting reserves in the UI, this method ignores any Reserve transactions on the same ReserveLine with a
   * status of Pending Approval (since the AvailableReserves calculation does not include PendingApproval reserves).
   * If the current AvailableReserves amount is already equal to newReserveAmount, then this method does not create
   * a new Reserve nor ReserveSet, and returns null.
   * @param costType The cost type for the reserve.  This value cannot be null.
   * @param costCategory The cost category for the reserve.  This value cannot be null.
   * @param newReserveAmount The amount the open reserves should be.  The amount must be non-null and zero or greater, not negative.
   * @param submittingUser User submitting this reserve.
   * @throws com.guidewire.cc.system.exception.ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
   * @throws com.guidewire.cc.system.exception.ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
   * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the reserve
   * @return the new reserve (Note: the amount of the returned reserve should not be changed).
   *         The method will return null if new reserve is not created.
   */
  public entity.Reserve setAvailableReserves(typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setAvailableReserves(costType, costCategory, newReserveAmount, submittingUser);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the Benefits decision reason.
   * @param benefitsDecisionReason The benefits decision reason to set
   */
  public void setBenefitsDecisionReason(java.lang.String benefitsDecisionReason) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setBenefitsDecisionReason(benefitsDecisionReason);
  }
  
  /**
   * Sets the value of the BenefitsStatusDcsn field.
   */
  public void setBenefitsStatusDcsn(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BENEFITSSTATUSDCSN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value) {
    __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimISOMatchReports field.
   */
  public void setClaimISOMatchReports(entity.ClaimISOMatchReport[] value) {
    __getInternalInterface().setFieldValue(CLAIMISOMATCHREPORTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimIndicators field.
   */
  public void setClaimIndicators(entity.ClaimIndicator[] value) {
    __getInternalInterface().setFieldValue(CLAIMINDICATORS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  private void setClaimInfo(entity.ClaimInfo value) {
    __getInternalInterface().setFieldValue(CLAIMINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimInfoArray field.
   */
  private void setClaimInfoArray(entity.ClaimInfo[] value) {
    __getInternalInterface().setFieldValue(CLAIMINFOARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLineNumber_Ext field.
   */
  public void setClaimLineNumber_Ext(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMLINENUMBER_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimMetricRecalculationTime field.
   */
  public void setClaimMetricRecalculationTime(entity.ClaimMetricRecalculationTime value) {
    __getInternalInterface().setFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimMetricRecalculationTimeArray field.
   */
  private void setClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime[] value) {
    __getInternalInterface().setFieldValue(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimMetrics field.
   */
  public void setClaimMetrics(entity.ClaimMetric[] value) {
    __getInternalInterface().setFieldValue(CLAIMMETRICS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setClaimNumber(java.lang.String value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setClaimNumber(value);
  }
  
  /**
   * Sets the value of the ClaimRpt field.
   */
  private void setClaimRpt(entity.ClaimRpt value) {
    __getInternalInterface().setFieldValue(CLAIMRPT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimRptArray field.
   */
  private void setClaimRptArray(entity.ClaimRpt[] value) {
    __getInternalInterface().setFieldValue(CLAIMRPTARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimSource field.
   */
  public void setClaimSource(typekey.ClaimSource value) {
    __getInternalInterface().setFieldValue(CLAIMSOURCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimSynchStates field.
   */
  public void setClaimSynchStates(entity.ClaimSynchState[] value) {
    __getInternalInterface().setFieldValue(CLAIMSYNCHSTATES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimTier field.
   */
  public void setClaimTier(typekey.ClaimTier value) {
    __getInternalInterface().setFieldValue(CLAIMTIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimTypeCode_Ext field.
   */
  public void setClaimTypeCode_Ext(typekey.ECFClaimTypeCode_Ext value) {
    __getInternalInterface().setFieldValue(CLAIMTYPECODE_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimWorkComp field.
   */
  public void setClaimWorkComp(entity.ClaimWorkComp value) {
    __getInternalInterface().setFieldValue(CLAIMWORKCOMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimantDenorm field.
   */
  public void setClaimantDenorm(entity.Contact value) {
    __getInternalInterface().setFieldValue(CLAIMANTDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimantRprtdDate field.
   */
  public void setClaimantRprtdDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CLAIMANTRPRTDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimempdataArray field.
   */
  private void setClaimempdataArray(entity.Claimempdata[] value) {
    __getInternalInterface().setFieldValue(CLAIMEMPDATAARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedOutcome field.
   */
  public void setClosedOutcome(typekey.ClaimClosedOutcomeType value) {
    __getInternalInterface().setFieldValue(CLOSEDOUTCOME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ComputerSecurity field.
   */
  public void setComputerSecurity(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COMPUTERSECURITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConcurrentEmp field.
   */
  public void setConcurrentEmp(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(CONCURRENTEMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConcurrentEmpl field.
   */
  public void setConcurrentEmpl(entity.ConcurrentEmployment[] value) {
    __getInternalInterface().setFieldValue(CONCURRENTEMPL_PROP.get(), value);
  }
  
  /**
   * Sets the Contact in the given role to the given Contact.
   * @param role 
   * @param contact 
   * @throws IllegalArgumentException if the role is not exclusive, or if the Contact is non-null and
   *                                  the role is prohibited or constrained to a different Contact type.
   */
  public void setContactByRole(typekey.ContactRole role, entity.Contact contact) {
    ((com.guidewire.cc.domain.contact.EntityContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.EntityContactRoleOwner")).setContactByRole(role, contact);
  }
  
  /**
   * Sets the value of the Contacts field.
   */
  public void setContacts(entity.ClaimContact[] value) {
    __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContribFactors field.
   */
  public void setContribFactors(entity.ContribFactor[] value) {
    __getInternalInterface().setFieldValue(CONTRIBFACTORS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageInQuestion field.
   */
  public void setCoverageInQuestion(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COVERAGEINQUESTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  private void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentConditions field.
   */
  public void setCurrentConditions(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CURRENTCONDITIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCompDcsnDue field.
   */
  public void setDateCompDcsnDue(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATECOMPDCSNDUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCompDcsnMade field.
   */
  public void setDateCompDcsnMade(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATECOMPDCSNMADE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateEligibleForArchive field.
   */
  public void setDateEligibleForArchive(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEELIGIBLEFORARCHIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateFormGivenToEmp field.
   */
  public void setDateFormGivenToEmp(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEFORMGIVENTOEMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateFormRetByEmp field.
   */
  public void setDateFormRetByEmp(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEFORMRETBYEMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateRptdToAgent field.
   */
  public void setDateRptdToAgent(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATERPTDTOAGENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateRptdToEmployer field.
   */
  public void setDateRptdToEmployer(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATERPTDTOEMPLOYER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateRptdToInsured field.
   */
  public void setDateRptdToInsured(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATERPTDTOINSURED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeathDate field.
   */
  public void setDeathDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(DEATHDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Deductibles field.
   */
  private void setDeductibles(entity.Deductible[] value) {
    __getInternalInterface().setFieldValue(DEDUCTIBLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DiagnosticCnsistnt field.
   */
  public void setDiagnosticCnsistnt(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DIAGNOSTICCNSISTNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.Document[] value) {
    __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DrugsInvolved field.
   */
  public void setDrugsInvolved(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(DRUGSINVOLVED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DrugsPrescribed field.
   */
  public void setDrugsPrescribed(entity.DrugPrescribed[] value) {
    __getInternalInterface().setFieldValue(DRUGSPRESCRIBED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFLastUpdateTime field.
   */
  public void setECFLastUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ECFLASTUPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EEventTime_Ext field.
   */
  public void setEEventTime_Ext(java.util.Date value) {
    __getInternalInterface().setFieldValue(EEVENTTIME_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmpQusValidity field.
   */
  public void setEmpQusValidity(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(EMPQUSVALIDITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmpSentMPNNotice field.
   */
  public void setEmpSentMPNNotice(java.util.Date value) {
    __getInternalInterface().setFieldValue(EMPSENTMPNNOTICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmployerValidityReason field.
   */
  public void setEmployerValidityReason(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMPLOYERVALIDITYREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmploymentData field.
   */
  public void setEmploymentData(entity.EmploymentData value) {
    __getInternalInterface().setFieldValue(EMPLOYMENTDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmploymentInjury field.
   */
  public void setEmploymentInjury(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EMPLOYMENTINJURY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Evaluations field.
   */
  public void setEvaluations(entity.Evaluation[] value) {
    __getInternalInterface().setFieldValue(EVALUATIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExaminationDate field.
   */
  public void setExaminationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXAMINATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureBegan field.
   */
  public void setExposureBegan(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXPOSUREBEGAN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureEnded field.
   */
  public void setExposureEnded(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXPOSUREENDED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.Exposure[] value) {
    __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FaultRating field.
   */
  public void setFaultRating(typekey.FaultRating value) {
    __getInternalInterface().setFieldValue(FAULTRATING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FireDeptInfo field.
   */
  public void setFireDeptInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FIREDEPTINFO_PROP.get(), value);
  }
  
  /**
   * Set whether this was a first and final claim
   * @param value True if claim should be First and Final
   */
  public void setFirstAndFinal(boolean value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setFirstAndFinal(value);
  }
  
  /**
   * Sets the value of the FirstNoticeSuit field.
   */
  public void setFirstNoticeSuit(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FIRSTNOTICESUIT_PROP.get(), value);
  }
  
  /**
   * Adds a problem description to the claim
   * @param flaggedReason The reason for the flag
   */
  public void setFlag(java.lang.String flaggedReason) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setFlag(flaggedReason);
  }
  
  /**
   * Sets the value of the Flagged field.
   */
  public void setFlagged(typekey.FlaggedType value) {
    __getInternalInterface().setFieldValue(FLAGGED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlaggedDate field.
   */
  public void setFlaggedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FLAGGEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlaggedReason field.
   */
  public void setFlaggedReason(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FLAGGEDREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FurtherTreatment field.
   */
  public void setFurtherTreatment(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FURTHERTREATMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HazardousWaste field.
   */
  public void setHazardousWaste(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(HAZARDOUSWASTE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the History field.
   */
  public void setHistory(entity.History[] value) {
    __getInternalInterface().setFieldValue(HISTORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HospitalDate field.
   */
  public void setHospitalDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(HOSPITALDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HospitalDays field.
   */
  public void setHospitalDays(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(HOSPITALDAYS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HowReported field.
   */
  public void setHowReported(typekey.HowReportedType value) {
    __getInternalInterface().setFieldValue(HOWREPORTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ISOEnabled field.
   */
  public void setISOEnabled(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ISOENABLED_PROP.get(), value);
  }
  
  /**
   * Set error message if most recent ISO ClaimSearch request failed.
   * @param isoErrorMessage the new error message
   */
  public void setISOErrorMessage(java.lang.String isoErrorMessage) {
    ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).setISOErrorMessage(isoErrorMessage);
  }
  
  /**
   * Sets the value of the ISOKnown field.
   */
  public void setISOKnown(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ISOKNOWN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ISOReceiveDate field.
   */
  public void setISOReceiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ISORECEIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ISOSendDate field.
   */
  public void setISOSendDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ISOSENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ISOStatus field.
   */
  public void setISOStatus(typekey.ISOStatus value) {
    __getInternalInterface().setFieldValue(ISOSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncidentReport field.
   */
  public void setIncidentReport(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCIDENTREPORT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incidents field.
   */
  public void setIncidents(entity.Incident[] value) {
    __getInternalInterface().setFieldValue(INCIDENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InjWkrInMPN field.
   */
  public void setInjWkrInMPN(java.util.Date value) {
    __getInternalInterface().setFieldValue(INJWKRINMPN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InjuredOnPremises field.
   */
  public void setInjuredOnPremises(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INJUREDONPREMISES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InjuredRegularJob field.
   */
  public void setInjuredRegularJob(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INJUREDREGULARJOB_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredDenorm field.
   */
  public void setInsuredDenorm(entity.Contact value) {
    __getInternalInterface().setFieldValue(INSUREDDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredPremises field.
   * @deprecated True if the incident occurred on the employer's premises.
   */
  @java.lang.Deprecated
  public void setInsuredPremises(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INSUREDPREMISES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerSentMPNNotice field.
   */
  public void setInsurerSentMPNNotice(java.util.Date value) {
    __getInternalInterface().setFieldValue(INSURERSENTMPNNOTICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value) {
    __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LMMessages field.
   */
  public void setLMMessages(entity.LMMessage_Ext[] value) {
    __getInternalInterface().setFieldValue(LMMESSAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value) {
    __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LargeLossNotificationStatus field.
   */
  public void setLargeLossNotificationStatus(typekey.LargeLossNotificationStatus value) {
    __getInternalInterface().setFieldValue(LARGELOSSNOTIFICATIONSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitigationStatus field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setLitigationStatus(typekey.LitigationStatus value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setLitigationStatus(value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LocationCode field.
   */
  public void setLocationCode(entity.PolicyLocation value) {
    __getInternalInterface().setFieldValue(LOCATIONCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LocationOfTheft field.
   */
  public void setLocationOfTheft(typekey.LocationOfTheft value) {
    __getInternalInterface().setFieldValue(LOCATIONOFTHEFT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value) {
    __getInternalInterface().setFieldValue(LOSSCAUSE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossEndDate_Ext field.
   */
  public void setLossEndDate_Ext(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSENDDATE_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(entity.Address value) {
    __getInternalInterface().setFieldValue(LOSSLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocationCode field.
   */
  public void setLossLocationCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocationSpatialDenorm field.
   */
  private void setLossLocationSpatialDenorm(gw.api.database.spatial.SpatialPoint value) {
    __getInternalInterface().setFieldValue(LOSSLOCATIONSPATIALDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MMIdate field.
   */
  public void setMMIdate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MMIDATE_PROP.get(), value);
  }
  
  /**
   * Sets the description of Max Medical Improvement for Workers Comp Claim.
   * @param mminote the description of the maximum medical improvement
   */
  public void setMMInote(java.lang.String mminote) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setMMInote(mminote);
  }
  
  /**
   * Sets the value of the MainContactType field.
   */
  public void setMainContactType(typekey.PersonRelationType value) {
    __getInternalInterface().setFieldValue(MAINCONTACTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ManifestationDate field.
   */
  public void setManifestationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MANIFESTATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Matters field.
   */
  public void setMatters(entity.Matter[] value) {
    __getInternalInterface().setFieldValue(MATTERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedicalContactStatus field.
   */
  public void setMedicalContactStatus(entity.MedicalContactStatus[] value) {
    __getInternalInterface().setFieldValue(MEDICALCONTACTSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the description of Medical Diagnosis for Workers Comp Claim.
   * @param medicalDiagnosis The medical diagnosis
   */
  public void setMedicalDiagnosis(java.lang.String medicalDiagnosis) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setMedicalDiagnosis(medicalDiagnosis);
  }
  
  /**
   * Sets the value of the MedicalTreatments field.
   */
  public void setMedicalTreatments(entity.MedicalTreatment[] value) {
    __getInternalInterface().setFieldValue(MEDICALTREATMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroReports field.
   */
  public void setMetroReports(entity.MetroReport[] value) {
    __getInternalInterface().setFieldValue(METROREPORTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ModifiedDutyAvail field.
   */
  public void setModifiedDutyAvail(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MODIFIEDDUTYAVAIL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Mold field.
   */
  public void setMold(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MOLD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Negotiations field.
   */
  public void setNegotiations(entity.Negotiation[] value) {
    __getInternalInterface().setFieldValue(NEGOTIATIONS_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(entity.Note[] value) {
    __getInternalInterface().setFieldValue(NOTES_PROP.get(), value);
  }
  
  /**
   * Sets the Objective Findings for Workers Comp Claim.
   * @param objFindings The objective findings
   */
  public void setObjFindings(java.lang.String objFindings) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setObjFindings(objFindings);
  }
  
  /**
   * Sets the value of the Officials field.
   */
  public void setOfficials(entity.Official[] value) {
    __getInternalInterface().setFieldValue(OFFICIALS_PROP.get(), value);
  }
  
  /**
   * Sets the open recovery reserves for this claim to the given amount by
   * creating a recovery reserve that increases or decreases the current open
   * recovery reserves.
   * @param costType The cost type for the recovery reserve.  This value cannot be <code>null</code>.
   * @param costCategory The cost category for the recovery reserve.  This value cannot be <code>null</code>.
   * @param recoveryCategory The recovery category for the recovery reserve.  This value cannot be <code>null</code>.
   * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
   * @param submittingUser User submitting this recovery reserve.
   * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims).
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve.
   * @throws com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException if the recovery reserve has an illegal status
   * @return the new reserve (Note: the amount of the returned reserve should not be changed).
   *         The method will return null if new reserve is not created.
   */
  public entity.RecoveryReserve setOpenRecoveryReserves(typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setOpenRecoveryReserves(costType, costCategory, recoveryCategory, newRecoveryReserveAmount, submittingUser);
  }
  
  /**
   * Sets the value of the OtherBenefits field.
   */
  public void setOtherBenefits(entity.OtherBenefit[] value) {
    __getInternalInterface().setFieldValue(OTHERBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherRecovStatus field.
   */
  public void setOtherRecovStatus(typekey.OtherRecoverableStatus value) {
    __getInternalInterface().setFieldValue(OTHERRECOVSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTPinMPN field.
   */
  public void setPTPinMPN(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PTPINMPN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PermissionRequired field.
   */
  public void setPermissionRequired(typekey.ClaimSecurityType value) {
    __getInternalInterface().setFieldValue(PERMISSIONREQUIRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PoliceDeptInfo field.
   */
  public void setPoliceDeptInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICEDEPTINFO_PROP.get(), value);
  }
  
  /**
   * Sets the policy for this claim.  This method:
   *  <ol>
   *  <li>Makes sure the policy type is applicable for this claim</li>
   *  <li>Makes sure we can edit this claim</li>
   *  <li>Copies the policy and everything in the policy's bundle into our bundle</li>
   *  <li>Adds a set policy history event</li>
   *  <li>Sets the policy ptr for this claim</li>
   *  <li>Evicts from the bundle any entities not rooted at the claim</li>
   *  </ol>
   * 
   *  NOTE: If there are objects in the claim (such as exposures) which refer to objects (such as vehicles) which are
   *  not present in the new policy, references to the missing objects will be set to null.
   * @param value the policy to set
   * @throws com.guidewire.cc.domain.policy.exception.InvalidPolicyType if the policy type is not applicable to this claim
   * @throws com.guidewire.cc.domain.policy.exception.CannotChangeCurrencyException if policy's currency is different from this claim's currency and isCurrencyEditable() returns false
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPolicy(entity.Policy value) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setPolicy(value);
  }
  
  /**
   * Sets the value of the PolicyLocationSummaryJoin field.
   */
  public void setPolicyLocationSummaryJoin(entity.PolicyLocationSummaryJoin value) {
    __getInternalInterface().setFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyLocationSummaryJoinArray field.
   */
  private void setPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin[] value) {
    __getInternalInterface().setFieldValue(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreexDisblty field.
   */
  public void setPreexDisblty(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PREEXDISBLTY_PROP.get(), value);
  }
  
  /**
   * Sets the Preexisting Disability Info for Workers Comp Claim.
   * @param preexDisbltyInfo The preexisting disability info
   */
  public void setPreexDisbltyInfo(java.lang.String preexDisbltyInfo) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setPreexDisbltyInfo(preexDisbltyInfo);
  }
  
  /**
   * Sets the value of the PreviousGroup field.
   */
  private void setPreviousGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(PREVIOUSGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviousQueue field.
   */
  private void setPreviousQueue(entity.AssignableQueue value) {
    __getInternalInterface().setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PreviousUser field.
   */
  private void setPreviousUser(entity.User value) {
    __getInternalInterface().setFieldValue(PREVIOUSUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Progress field.
   */
  public void setProgress(typekey.ClaimProgressType value) {
    __getInternalInterface().setFieldValue(PROGRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PropertyFireDamage field.
   */
  public void setPropertyFireDamage(entity.PropertyFireDamage value) {
    __getInternalInterface().setFieldValue(PROPERTYFIREDAMAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PropertyFireDamageArray field.
   */
  private void setPropertyFireDamageArray(entity.PropertyFireDamage[] value) {
    __getInternalInterface().setFieldValue(PROPERTYFIREDAMAGEARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PropertyWaterDamage field.
   */
  public void setPropertyWaterDamage(entity.PropertyWaterDamage value) {
    __getInternalInterface().setFieldValue(PROPERTYWATERDAMAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PropertyWaterDamageArray field.
   */
  private void setPropertyWaterDamageArray(entity.PropertyWaterDamage[] value) {
    __getInternalInterface().setFieldValue(PROPERTYWATERDAMAGEARRAY_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the PurgeDate field.
   */
  public void setPurgeDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(PURGEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RIAgreementGroups field.
   */
  public void setRIAgreementGroups(entity.RIAgreementGroup[] value) {
    __getInternalInterface().setFieldValue(RIAGREEMENTGROUPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RICodings field.
   */
  public void setRICodings(entity.RICoding[] value) {
    __getInternalInterface().setFieldValue(RICODINGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReOpenDate field.
   */
  public void setReOpenDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(REOPENDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuranceFlaggedStatus field.
   */
  public void setReinsuranceFlaggedStatus(typekey.ReinsuranceFlaggedStatus value) {
    __getInternalInterface().setFieldValue(REINSURANCEFLAGGEDSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the reinsurance reason.
   * @param reinsuranceReason The reason
   */
  public void setReinsuranceReason(java.lang.String reinsuranceReason) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setReinsuranceReason(reinsuranceReason);
  }
  
  /**
   * Sets the value of the ReinsuranceReportable field.
   */
  public void setReinsuranceReportable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(REINSURANCEREPORTABLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.ClaimReopenedReason value) {
    __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReportedByType field.
   */
  public void setReportedByType(typekey.PersonRelationType value) {
    __getInternalInterface().setFieldValue(REPORTEDBYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(REPORTEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReserveLines field.
   */
  public void setReserveLines(entity.ReserveLine[] value) {
    __getInternalInterface().setFieldValue(RESERVELINES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RoleAssignments field.
   */
  public void setRoleAssignments(entity.UserRoleAssignment[] value) {
    __getInternalInterface().setFieldValue(ROLEASSIGNMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SIAnswerSet field.
   */
  public void setSIAnswerSet(entity.SIUAnswerSet[] value) {
    __getInternalInterface().setFieldValue(SIANSWERSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SIEscalateSIU field.
   */
  public void setSIEscalateSIU(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(SIESCALATESIU_PROP.get(), value);
  }
  
  /**
   * Sets the storage SIU Escalation note for the Claim.
   * @param escalationNote The escalation note
   */
  public void setSIEscalateSIUNote(java.lang.String escalationNote) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setSIEscalateSIUNote(escalationNote);
  }
  
  /**
   * Sets the value of the SIEscalateSIUdate field.
   */
  public void setSIEscalateSIUdate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SIESCALATESIUDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SIScore field.
   */
  public void setSIScore(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SISCORE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SITriggers field.
   */
  public void setSITriggers(entity.SITrigger[] value) {
    __getInternalInterface().setFieldValue(SITRIGGERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SIULifeCycleState field.
   */
  public void setSIULifeCycleState(typekey.ClaimLifeCycleState value) {
    __getInternalInterface().setFieldValue(SIULIFECYCLESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SIUStatus field.
   */
  public void setSIUStatus(typekey.SIUStatus value) {
    __getInternalInterface().setFieldValue(SIUSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SafetyEquipProv field.
   */
  public void setSafetyEquipProv(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SAFETYEQUIPPROV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SafetyEquipUsed field.
   */
  public void setSafetyEquipUsed(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SAFETYEQUIPUSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageStatus field.
   */
  public void setSalvageStatus(typekey.SalvageStatus value) {
    __getInternalInterface().setFieldValue(SALVAGESTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Segment field.
   */
  public void setSegment(typekey.ClaimSegment value) {
    __getInternalInterface().setFieldValue(SEGMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequests field.
   */
  public void setServiceRequests(entity.ServiceRequest[] value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ShowMedicalFirstInfo field.
   */
  public void setShowMedicalFirstInfo(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(SHOWMEDICALFIRSTINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpecialHandlingFinancialState field.
   */
  public void setSpecialHandlingFinancialState(entity.SpecialHandlingFinancialState value) {
    __getInternalInterface().setFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpecialHandlingFinancialStateArray field.
   */
  private void setSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState[] value) {
    __getInternalInterface().setFieldValue(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  private void setState(typekey.ClaimState value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StateAckNumber field.
   */
  public void setStateAckNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STATEACKNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StateFileNumber field.
   */
  public void setStateFileNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STATEFILENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StatuteDate field.
   */
  public void setStatuteDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STATUTEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageBarCodeNum field.
   */
  public void setStorageBarCodeNum(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STORAGEBARCODENUM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageBoxNum field.
   */
  public void setStorageBoxNum(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STORAGEBOXNUM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageCategory field.
   */
  public void setStorageCategory(typekey.StorageCategory value) {
    __getInternalInterface().setFieldValue(STORAGECATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageDate field.
   */
  public void setStorageDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STORAGEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageLocationState field.
   */
  public void setStorageLocationState(typekey.State value) {
    __getInternalInterface().setFieldValue(STORAGELOCATIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the storage notes for the claim.
   * @param storageNotes The storage notes
   */
  public void setStorageNotes(java.lang.String storageNotes) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setStorageNotes(storageNotes);
  }
  
  /**
   * Sets the value of the StorageType field.
   */
  public void setStorageType(typekey.StorageType value) {
    __getInternalInterface().setFieldValue(STORAGETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageVolumes field.
   */
  public void setStorageVolumes(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STORAGEVOLUMES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.ClaimStrategy value) {
    __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
  }
  
  /**
   * Sets the subjective complaints for a workers comp claim.
   * @param subjComplaints The subjective complaints
   */
  public void setSubjComplaints(java.lang.String subjComplaints) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setSubjComplaints(subjComplaints);
  }
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value) {
    __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationSummaryArray field.
   */
  private void setSubrogationSummaryArray(entity.SubrogationSummary[] value) {
    __getInternalInterface().setFieldValue(SUBROGATIONSUMMARYARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SupplementalWorkloadWeight field.
   */
  public void setSupplementalWorkloadWeight(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(entity.ClaimText[] value) {
    __getInternalInterface().setFieldValue(TEXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Transactions field.
   * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
   */
  @java.lang.Deprecated
  public void setTransactions(entity.Transaction[] value) {
    __getInternalInterface().setFieldValue(TRANSACTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TreatedPatientBfr field.
   */
  public void setTreatedPatientBfr(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TREATEDPATIENTBFR_PROP.get(), value);
  }
  
  /**
   * Sets the description of TreatmentRendered for Workers Comp Claim.
   * @param treatmentRend The treatment rendered description
   */
  public void setTreatmentRend(java.lang.String treatmentRend) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setTreatmentRend(treatmentRend);
  }
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UCR_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UMR_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UberPrecautionaryFlag_Ext field.
   */
  public void setUberPrecautionaryFlag_Ext(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(UBERPRECAUTIONARYFLAG_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VCSIndicator_Ext field.
   */
  public void setVCSIndicator_Ext(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VCSINDICATOR_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value) {
    __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Weather field.
   */
  public void setWeather(typekey.WeatherType value) {
    __getInternalInterface().setFieldValue(WEATHER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WeatherRelated field.
   */
  public void setWeatherRelated(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WEATHERRELATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Workflows field.
   */
  public void setWorkflows(entity.ClaimWorkflow[] value) {
    __getInternalInterface().setFieldValue(WORKFLOWS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkloadUpdated field.
   */
  public void setWorkloadUpdated(java.util.Date value) {
    __getInternalInterface().setFieldValue(WORKLOADUPDATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKLOADWEIGHT_PROP.get(), value);
  }
  
  /**
   * Called on an assignable to decide if the assignment on the parent assignable should be cascaded
   * to this assignable.
   * @param parent the parent assignable
   * @param defaultOwnerUserId the id of the special default owner user, used by the assignment engine
   *   as the user of last resort if, for example, assignment rules can't find an appropriate user.
   * @param defaultGroupId the id of the root group, used by the assignment engine as the group of last
   *   resort if, for example, assignment rules can't find an appropriate group.
   * @return true if the assignment should be cascaded, false otherwise
   */
  public boolean shouldCascadeAssignment(entity.Assignable parent, gw.pl.persistence.core.Key defaultOwnerUserId, gw.pl.persistence.core.Key defaultGroupId) {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId);
  }
  
  /**
   * Skip archival of this claim. Usually called by a rule when it has determined
   * that the claim is not ready to be archived yet.  Unlike reportArchiveProblem(),
   * this method returns immediately and no more rules are processed.
   * @param reason The reason for skipping.
   */
  public void skipFromArchiving(java.lang.String reason) {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).skipFromArchiving(reason);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  /**
   * Removes the role from the given User on this assignable object.
   * @param user 
   * @param role 
   */
  public void unassignUserRole(entity.User user, typekey.UserRole role) {
    ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).unassignUserRole(user, role);
  }
  
  /**
   * Updates all claim and exposure metrics on the given claim immediately.
   * 
   * NOTE: This method is not intended be called directly.  Please use {@link com.guidewire.cc.domain.claim.impl.ClaimImpl#scheduleHealthUpdate() claim.scheduleHealthUpdate()}
   * instead to update after pre update rules and entity callbacks.
   */
  public void updateClaimMetrics() {
    ((gw.api.metric.ClaimUpdateMetricsMethods)__getDelegateManager().getImplementation("gw.api.metric.ClaimUpdateMetricsMethods")).updateClaimMetrics();
  }
  
  /**
   * Matches Claim.LossLocation against the PolicyLocationSummary data extracted from the
   * policy system for catastrophes and updates PolicyLocationSummaryJoin.
   */
  public void updatePolicyLocationSummaryJoin() {
    ((gw.api.heatmap.CatastropheMethods)__getDelegateManager().getImplementation("gw.api.heatmap.CatastropheMethods")).updatePolicyLocationSummaryJoin();
  }
  
  /**
   * Executes new claim validation rules on the supplied claim, and returns a validation object containing any errors
   * (if validation was successful, an empty validation object is returned). Note that this method has the side-effect of
   * setting the validation level, and hence requires that the current user have Claim EDIT permissions, or
   * will throw an exception.
   * @param validateExposures If true, validates the claim and all the claim's exposures. Otherwise, validates the claim only.
   * @throws InsufficientPermissionException If the current user does not have Claim EDIT permissions
   * @return The validation result
   */
  public gw.api.validation.ValidationResult validate(boolean validateExposures) {
    return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).validate(validateExposures);
  }
  
  /**
   * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
  }
  
  /**
   * Validates this claim and, if the verifyExposures flag is true, then each of its exposures.
   * Throws NewCheckAbilityToPayFailedException if the {@link typekey.ValidationLevel#TC_PAYMENT}
   * validation level is not reached for the claim.
   * @param verifyExposures if <code>true</code> then all the claim's exposure are also verified, though no EntityValidationException will be thrown even if one of
   *                        the exposures fails validation.
   * @throws EntityValidationException if the claim does not pass the payment validation level.
   * @throws InsufficientPermissionException if all exposures throw such an exception
   */
  public void verifyAbilityToPay(boolean verifyExposures) throws gw.api.validation.EntityValidationException, com.guidewire.pl.system.exception.InsufficientPermissionException {
    ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).verifyAbilityToPay(verifyExposures);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Claim.this.__getDelegateManager();
    }
    
    public void addClaimHealthUpdaterCallbackToBundleIfNotAlreadyPresent() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).addClaimHealthUpdaterCallbackToBundleIfNotAlreadyPresent();
    }
    
    /**
     * Adds an empty ClaimContactRole to this owner. It is assumed that the Contact associated with the role
     * will be filled in later. The role must be Required or ZeroToMore.
     * @param role 
     * @throws IllegalArgumentException if the role is prohibited or exclusive
     */
    public entity.ClaimContactRole addEmptyRole(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addEmptyRole(role);
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    /**
     * Add a new match report to the array of match reports on this Claim/Exposure
     * @return the newly created match report
     */
    public entity.ISOMatchReport addNewISOMatchReport() {
      return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addNewISOMatchReport();
    }
    
    /**
     * Adds a note to a claim and optional exposure.
     * @param exposure A related exposure. Optional - may be null.
     * @param topic The topic type.
     * @param strBody The body text of the note.
     * @return The new note
     */
    public entity.Note addNote(entity.Exposure exposure, typekey.NoteTopicType topic, java.lang.String strBody) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(exposure, topic, strBody);
    }
    
    /**
     * Adds a note to a claim and optional matter.
     * @param matter A related matter. Optional - may be null.
     * @param topic The topic type.
     * @param strBody The body text of the note.
     * @return The new note
     */
    public entity.Note addNote(entity.Matter matter, typekey.NoteTopicType topic, java.lang.String strBody) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(matter, topic, strBody);
    }
    
    /**
     * Adds a note to a claim and uses the default Topic
     * @param strBody The body text of the note.
     * @return The new note
     */
    public entity.Note addNote(java.lang.String strBody) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(strBody);
    }
    
    /**
     * Adds a note to a claim
     * @param topic The topic type.
     * @param strBody The body text of the note.
     * @return The new note
     */
    public entity.Note addNote(typekey.NoteTopicType topic, java.lang.String strBody) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(topic, strBody);
    }
    
    /**
     * Adds a note to a claim
     * @param topic The topic type.
     * @param subject The subject of the note.
     * @param strBody The body text of the note.
     * @return The new note
     */
    public entity.Note addNote(typekey.NoteTopicType topic, java.lang.String subject, java.lang.String strBody) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addNote(topic, subject, strBody);
    }
    
    /**
     * Adds a role with the specified contact to this entity. This method should only be used with Required or ZeroToMore
     * roles. For Exclusive roles, just set the property with the name of the role.
     * Does nothing if the Contact already has the role.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, gw.pl.contact.entity.Contact)} instead.
     */
    public entity.ClaimContactRole addRole(typekey.ContactRole role, entity.Contact contact) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addRole(role, contact);
    }
    
    public void addToAccess(com.guidewire.cc.domain.claim.impl.UnrootedClaimAccess element) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).addToAccess(element);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToAccess(entity.ClaimAccess value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).addToAccess(value);
    }
    
    public void addToAccess(entity.Group group, entity.User user, entity.SecurityZone securityZone, java.lang.Boolean anyone, typekey.ClaimAccessType permission) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).addToAccess(group, user, securityZone, anyone, permission);
    }
    
    /**
     * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToActivities(entity.Activity element) {
      __getInternalInterface().addArrayElement(ACTIVITIES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the AllocatedClaimNumberArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAllocatedClaimNumberArray(entity.AllocatedClaimNumber element) {
      __getInternalInterface().addArrayElement(ALLOCATEDCLAIMNUMBERARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimISOMatchReports(entity.ClaimISOMatchReport element) {
      __getInternalInterface().addArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimIndicators array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimIndicators(entity.ClaimIndicator element) {
      __getInternalInterface().addArrayElement(CLAIMINDICATORS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimInfoArray(entity.ClaimInfo element) {
      __getInternalInterface().addArrayElement(CLAIMINFOARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimMetricRecalculationTimeArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime element) {
      __getInternalInterface().addArrayElement(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimMetrics array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimMetrics(entity.ClaimMetric element) {
      __getInternalInterface().addArrayElement(CLAIMMETRICS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimRptArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimRptArray(entity.ClaimRpt element) {
      __getInternalInterface().addArrayElement(CLAIMRPTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimSynchStates(entity.ClaimSynchState element) {
      __getInternalInterface().addArrayElement(CLAIMSYNCHSTATES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimempdataArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimempdataArray(entity.Claimempdata element) {
      __getInternalInterface().addArrayElement(CLAIMEMPDATAARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ConcurrentEmpl array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToConcurrentEmpl(entity.ConcurrentEmployment element) {
      __getInternalInterface().addArrayElement(CONCURRENTEMPL_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContacts(entity.ClaimContact element) {
      __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ContribFactors array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContribFactors(entity.ContribFactor element) {
      __getInternalInterface().addArrayElement(CONTRIBFACTORS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Deductibles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDeductibles(entity.Deductible element) {
      __getInternalInterface().addArrayElement(DEDUCTIBLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDocuments(entity.Document element) {
      __getInternalInterface().addArrayElement(DOCUMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DrugsPrescribed array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDrugsPrescribed(entity.DrugPrescribed element) {
      __getInternalInterface().addArrayElement(DRUGSPRESCRIBED_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Evaluations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToEvaluations(entity.Evaluation element) {
      __getInternalInterface().addArrayElement(EVALUATIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposures(entity.Exposure element) {
      __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the History array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToHistory(entity.History element) {
      __getInternalInterface().addArrayElement(HISTORY_PROP.get(), element);
    }
    
    /**
     * Add the given match report to the array of match reports on this Claim/Exposure
     * @param report the report to be added
     */
    public void addToISOMatchReports(entity.ISOMatchReport report) {
      ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addToISOMatchReports(report);
    }
    
    /**
     * Adds the given element to the Incidents array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToIncidents(entity.Incident element) {
      __getInternalInterface().addArrayElement(INCIDENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the LMMessages array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLMMessages(entity.LMMessage_Ext element) {
      __getInternalInterface().addArrayElement(LMMESSAGES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Matters array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToMatters(entity.Matter element) {
      __getInternalInterface().addArrayElement(MATTERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the MedicalContactStatus array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToMedicalContactStatus(entity.MedicalContactStatus element) {
      __getInternalInterface().addArrayElement(MEDICALCONTACTSTATUS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the MedicalTreatments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToMedicalTreatments(entity.MedicalTreatment element) {
      __getInternalInterface().addArrayElement(MEDICALTREATMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the MetroReports array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToMetroReports(entity.MetroReport element) {
      __getInternalInterface().addArrayElement(METROREPORTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Negotiations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToNegotiations(entity.Negotiation element) {
      __getInternalInterface().addArrayElement(NEGOTIATIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToNotes(entity.Note element) {
      __getInternalInterface().addArrayElement(NOTES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Officials array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOfficials(entity.Official element) {
      __getInternalInterface().addArrayElement(OFFICIALS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the OtherBenefits array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOtherBenefits(entity.OtherBenefit element) {
      __getInternalInterface().addArrayElement(OTHERBENEFITS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PolicyLocationSummaryJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin element) {
      __getInternalInterface().addArrayElement(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PropertyFireDamageArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPropertyFireDamageArray(entity.PropertyFireDamage element) {
      __getInternalInterface().addArrayElement(PROPERTYFIREDAMAGEARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PropertyWaterDamageArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPropertyWaterDamageArray(entity.PropertyWaterDamage element) {
      __getInternalInterface().addArrayElement(PROPERTYWATERDAMAGEARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RIAgreementGroups array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRIAgreementGroups(entity.RIAgreementGroup element) {
      __getInternalInterface().addArrayElement(RIAGREEMENTGROUPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRICodings(entity.RICoding element) {
      __getInternalInterface().addArrayElement(RICODINGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToReserveLines(entity.ReserveLine element) {
      __getInternalInterface().addArrayElement(RESERVELINES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToRoleAssignments(entity.UserRoleAssignment value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).addToRoleAssignments(value);
    }
    
    public void addToRoleAssignments(entity.UserRoleAssignmentDelegate element) {
      ((com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods")).addToRoleAssignments(element);
    }
    
    /**
     * Adds the given element to the SIAnswerSet array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSIAnswerSet(entity.SIUAnswerSet element) {
      __getInternalInterface().addArrayElement(SIANSWERSET_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SITriggers array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSITriggers(entity.SITrigger element) {
      __getInternalInterface().addArrayElement(SITRIGGERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SpecialHandlingFinancialStateArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState element) {
      __getInternalInterface().addArrayElement(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SubrogationSummaryArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSubrogationSummaryArray(entity.SubrogationSummary element) {
      __getInternalInterface().addArrayElement(SUBROGATIONSUMMARYARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToText(entity.ClaimText element) {
      __getInternalInterface().addArrayElement(TEXT_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
     * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
     */
    @java.lang.Deprecated
    public void addToTransactions(entity.Transaction element) {
      __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Workflows array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToWorkflows(entity.ClaimWorkflow element) {
      __getInternalInterface().addArrayElement(WORKFLOWS_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public entity.KeyableBean asKeyableBean() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).asKeyableBean();
    }
    
    /**
     * Directly assigns the entity to the specified group and user by setting the assignedGroup and assignedUser fields.
     * If user or group is null returns false and nothing is done.
     * @param group The group to which the entity should be assigned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful
     */
    public boolean assign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(group, user);
    }
    
    /**
     * <p>
     * Invokes the Assignment Engine to assign the item to the specified group and user.  If userID is null,
     * the item will be assigned using the group's assignment rules.  If
     * userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param groupID The group to which the item should be assigned - must be
     *                specified.  If not known, use autoAssign(item) instead.
     * @param userID The user to which the item should be assigned; if null an
     *                appropriate user will be selected by group assignment rules.
     * @throws com.guidewire.pl.system.exception.IllegalAssignmentException if the user does not have permission
     * @throws com.guidewire.pl.system.exception.NoAssignmentFoundException if assignment could not be made
     * @deprecated Use autoAssign(Group, User) instead. Note that that method returns a boolean instead of throwing exceptions
     */
    public void assign(gw.pl.persistence.core.Key groupID, gw.pl.persistence.core.Key userID) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assign(groupID, userID);
    }
    
    /**
     * Assign the entity, which must be an Activity to the specified queue. (Currently, only Activities may be assigned
     * to Queues.) The current group is not a parameter - it is derived from the current
     * Assignment Engine state. As a result, this method may only be invoked from within an Assignment Rule.
     * <p/>
     * If there is no current group, nothing is done and a warning is logged. The queue must belong to the current group
     * or nothing is done.  Returns false if the assignable bean is not an activity.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param queue Queue to assign the activity to
     * @return true if the assignment is successful, false otherwise
     * @deprecated use assignActivityToQueue(AssignableQueue, Group) instead, since that method is more widely valid and
     *             is easier to understand because the group is explicit rather than implicit.
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue);
    }
    
    /**
     * Assign this entity, which must be an Activity,  to the specified queue. The queue should belong to the specified group.
     * Returns false if the assignable bean is not an activity.
     * @param queue Queue to assign the activity to
     * @param group cannot be null
     * @return true if the assignment is successful
     */
    public boolean assignActivityToQueue(entity.AssignableQueue queue, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignActivityToQueue(queue, group);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria);
    }
    
    /**
     * Assigns an assignable item to the user who best fits the set of user attributes defined in the attributeBasedAssignmentCriteria
     * parameter. Alternative signature which depends on the "current" group status in the Assignment Engine;
     * see the preferred method for details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param attributeBasedAssignmentCriteria The criteria used to perform the search
     * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
     *                         the current group. If false, only searches users in the current group
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignByUserAttributes(AttributeBasedAssignmentCriteria, boolean, Group)</code> instead
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns an assignable item to a user who satisfies the constraints defined in the attributeBasedAssignmentCriteria
     * parameter. This is done by:
     * <p/>
     * 1) Find the set of users who are members of the supplied group, and optionally its subgroups, and who satisfy
     * the supplied attribute-based search criteria. (If the group parameter is null, then no group restriction applies)
     * 2) Select from the resulting set of users via the round-robin rotation mechanism. A separate round-robin state will
     * be maintained for each unique assignment criteria entity and group.
     * @param attributeBasedAssignmentCriteria the criteria to be satisfied by the selected user
     * @param includeSubGroups if true, searches  all the users in any subgroups of the group parameter as well as those in
     *                         that group. If false, only searches users in the group
     * @param group the group.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignByUserAttributes(entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignByUserAttributes(attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns the entity to the group requested.  If group is null, nothing is done.
     * @param group the group to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroup(entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroup(group);
    }
    
    /**
     * Uses the group type group selector to choose the next subgroup under the "current" group (retrieved from the
     * current state of the Assignment Engine) to receive the assignable. If there is no current group, the root group
     * from the Assignment Engine is used.
     * <p/>
     * This method will search breadth-first through the group tree, starting with the current group, and will
     * return the first group found with the approriate type.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A GroupType typecode; the assignment will be restricted to a group of this type. If null, then
     *                          no group will be found.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This method of assignment is deemed useless, because it always returns the first group found with the
     *             required type. Use <code>assignGroupByRoundRobin()</code> instead, so that the assignment will be rotated among
     *             the matching groups.
     */
    public boolean assignGroupByGroupType(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByGroupType(requiredGroupType);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * Alternative signature; see <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the current group
     *                           but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByLocation(GroupType, Address, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly);
    }
    
    /**
     * Assigns this entity to a group based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the groups within the parameter group whose region assignment configuration includes that zip code.
     * 3) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no group is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one group is found, then round-robin among the resulting groups based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no groups that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the sub-groups of the specified group and optionally all of its children. If there is no
     * specified group, then the root group is used. Note that starting from the root group is potentially costly in
     * performance time. If invoked from outside an Assignment Rule, this method will take no action and return false.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param address An address to use for location-based assignment
     * @param directChildrenOnly if this parameter is false the selector will round-robin not only through the parameter
     *                           group but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByLocation(typekey.GroupType groupType, entity.Address address, boolean directChildrenOnly, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByLocation(groupType, address, directChildrenOnly, parentGroup);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRogin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType);
    }
    
    /**
     * Uses the round robin group selector to choose the next subgroup under the current group with the
     * appropriate type to be assigned to this entity.
     * <p/>
     * Alternative signature; see <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param requiredGroupType A typecode for a group; the assignment will be restricted to a group of this type. If null,
     *                          then no group will be found
     * @param includeSubGroups If true, all the user
     * @return true if the assignment is successful, false otherwise
     * @deprecated Use <code>assignGroupByRoundRobin(GroupType, boolean, Group)</code> insteaed, to make the recursion explicit.
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType requiredGroupType, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(requiredGroupType, includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next group to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each Group's load factor is used to determine relative assignment frequency; essentially, a
     * group with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group type (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * <p/>
     * If no group is specified, the root group will be used instead. Note that starting from the root group is
     * potentially costly in performance time.
     * <p/>
     * When group type is specified, the load factor is <b>NOT</b> used.
     * @param groupType Only groups whose GroupType property matches this value will be considered
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter
     *                         group's immediate children but also through all its subgroups.
     * @param parentGroup The group whose subgroups will be considered for assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupByRoundRobin(typekey.GroupType groupType, boolean includeSubGroups, entity.Group parentGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupByRoundRobin(groupType, includeSubGroups, parentGroup);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find a group assignment for the current entity. See
     * {@link gw.api.assignment.DynamicGroupAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicGroupAssignmentStrategy the {@link gw.api.assignment.DynamicGroupAssignmentStrategy} to be used to do the assignment
     * @param parentGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignGroupDynamically(gw.api.assignment.DynamicGroupAssignmentStrategy dynamicGroupAssignmentStrategy, entity.Group parentGroup, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignGroupDynamically(dynamicGroupAssignmentStrategy, parentGroup, includeSubGroups);
    }
    
    /**
     * Request manual assignment of the entity to the supplied user.
     * <p/>
     * Request is granted only if the responsible user has review assignment permission.
     * <p/>
     * Successful completion will cause a review activity to be created indicating that the assignment needs to be
     * completed, and that activity will be assigned to the supplied user
     * @param responsibleUser The person who should carry out the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean assignManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManually(responsibleUser);
    }
    
    /**
     * Request manual assignment of the entity, with the responsibilty round-robbined among members of either the
     * currently assigned group or the specified group if no group is currently assigned
     * <p/>
     * {@see assignManually} for more information about "manual" assignment.
     * @param group the group to use if this entity does not have a currently assigned group.
     * @return true if a user was found to give the manual assignment action to, false if no sure user was found
     */
    public boolean assignManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignManuallyByRoundRobin(group);
    }
    
    public void assignNewClaimExposures(entity.Exposure[] exposures, gw.api.assignment.Assignee claimAssignment, gw.api.assignment.Assignee[] exposureAssignments) throws com.guidewire.pl.system.exception.NoAssignmentFoundException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).assignNewClaimExposures(exposures, claimAssignment, exposureAssignments);
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Assigns the entity to the user and group to which the associated claim is currently assigned.
     * Caller is responsible for ensuring that the entity is linked to an assigned claim. If the resulting assignment
     * is invalid for any reason, then an IllegalAssignmentException will be thrown.
     * 
     * Note that this method is currently only valid for an Activity, Exposure, or Matter.
     */
    public void assignToClaimOwner() {
      ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimOwner();
    }
    
    /**
     * Assign to the claim user with the given role. The search for a user with
     * a matching role is done in the following steps:
     * <ol>
     * <li>If assigning an activity associated with an exposure search the
     *     exposure first
     * <li>Search the claim users
     * <li>If not assigning an activity associated with an exposure, search all
     *     the exposures
     * </ol>
     * If the search finds a match at any step, it stops. If the match is unique
     * it does the assignment and returns true. If the match is not unique it
     * returns false. If the search goes through all steps without finding a
     * match it returns false
     * @param userRole the desired user role
     * @return true if a unique match was found and the assignment was made, false
     *   otherwise
     */
    public boolean assignToClaimUserWithRole(typekey.UserRole userRole) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToClaimUserWithRole(userRole);
    }
    
    /**
     * Assigns the item to the creator of the supplied entity, and to one of the user's groups. If no group
     * is found for the user, uses the group based on the rule engine state (if available).
     * @param sourceEntity The entity to query for the id of the creator.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToCreator(entity.Editable sourceEntity) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity);
    }
    
    /**
     * Assigns this entity to the user who created the supplied entity, and to the first group in the user's list of member groups. In the
     * unlikely case that the user does not belong to any groups, then the entity will be assigned to the supplied
     * default group.
     * <p/>
     * If the supplied entity has not been persisted yet, and therefore has no recorded creator, then the current user will be
     * used instead.
     * @param sourceEntity The entity to query for the id of its creator.
     * @param defaultGroup The default group to use if the assigned user is not a member of any group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated This signature is a little confusing, because the defaultGroup parameter should almost never be
     *             necessary, since in the current system a user almost never belongs to no groups. Use assignToCreator(EditableBean)
     *             instead
     */
    public boolean assignToCreator(entity.Editable sourceEntity, entity.Group defaultGroup) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToCreator(sourceEntity, defaultGroup);
    }
    
    /**
     * Another name for {@link #assignToQueue()}, making it more explicit that the activity will be assigned to the FNOL
     * queue. See that method for more details.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToFNOLQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToFNOLQueue();
    }
    
    /**
     * Assigns this entity to the user and group to which the entity's "issue" is assigned. Which entity is used
     * to find the user and group is application-dependent. For example, in CC this will assign the entity to
     * the owner of the related exposure (if any) or claim. This method is currently only meaningful for CC.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToIssueOwner() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToIssueOwner();
    }
    
    /**
     * Assigns the entity to the previously assigned user.  The current group is kept track of for the client.  If there is no current
     * group, nothing is done and a warning is logged.
     * <p/>
     * This is no longer a very useful method, and should be considered deprecated, in favor of simply assigning directly to the
     * PreviousUser and PreviousGroup properties.
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignToPreviousOwner() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignToPreviousOwner();
    }
    
    /**
     * Assign an activity to the FNOL queue of items assigned to the "current" group (retrieved from the current state of
     * the Assignment Engine). If the entity to be assigned is not an activity nothing is done,
     * false is returned and a warning is logged.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated use {@link #assignActivityToQueue(entity.AssignableQueue)} to assign an
     *             activity to a particular queue. Note that {@link entity.Group#getQueue(String)} can be used to find a
     *             named queue.
     */
    public boolean assignToQueue() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignToQueue();
    }
    
    public void assignToQueueInternal(entity.AssignableQueue queue) throws com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.pl.system.exception.IllegalAssignmentException {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).assignToQueueInternal(queue);
    }
    
    /**
     * Assigns the entity to the user requested within the "current" group (retrieved from the current state of
     * the Assignment Engine).  If the user is null or is not a member of the current group, nothing is done and false is returned.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param user the user to be assigned
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assign(Group, User)</code> instead
     */
    public boolean assignUser(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUser(user);
    }
    
    /**
     * Directly assigns the entity to the specified user and one of the groups the user belongs to.
     * <p/>
     * If the user does not have sufficient permission to accept the assignment, false is returned
     * @param user The user to which the entity should be assigned
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserAndDefaultGroup(entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserAndDefaultGroup(user);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address);
    }
    
    /**
     * Uses the location-based assigner to assign an Assignable based on a given address.
     * <p/>
     * Alternative signature; see <code>assignUserByLocation(Address, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocation(Address, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on region assignments. This is done in the following manner:
     * <p/>
     * 1) Based on the Region configuration, get the smallest zone containing the supplied address (in the US, this
     * would typically be the zip code)
     * 2) Search for the users whose region assignment configuration includes that zip code.
     * 3) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, county)
     * 4) If no user is found, repeat steps 1 and 2 with the next largest zone (in the US, state)
     * 5) If more than one user is found, then round-robin among the resulting users based on the zone which was used to
     * find the match.
     * <p/>
     * For example if we find no users that match by zip but a few that match by county then
     * assignment will round robin through the ones that match by county and will ignore any others that match by state.
     * Matching is case-insensitive.
     * <p/>
     * Search is restricted to the users of the group (and optionally its subgroups). It is an error if there is no
     * group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose users will be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocation(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocation(address, includeSubGroups, group);
    }
    
    /**
     * A combination of {@link #assignUserByLocation} and {@link #assignByUserAttributes} .
     * <p/>
     * Alternative signature; see <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationAndAttributes(Address, AttributeBasedAssignmentCriteria, boolean, Group)</code> instead.
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria whose region assignments contain the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocation}
     * to find a user whose region assignments contain the supplied location.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the parameter  group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByLocationAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this entity to the user matching the attribute criteria who is closest to the supplied location. This method
     * first finds the users in the supplied group (and, possibly, subgroups) who match the attribute criteria, and then
     * once that set is determined it applies the same algorithm used by {@link #assignUserByLocationUsingProximitySearch}
     * to choose the closest one.
     * <p/>
     * If no users match the supplied criteria, then assignment will fail and false will be returned.
     * @param address An address to use for location-based assignment
     * @param attributeBasedAssignmentCriteria the user attributes to match against
     * @param includeSubGroups if true, then include users in any sub groups of the supplied group as well as users in the
     *                         parameter group.
     * @param group The group whose users should be considered for the assignment
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximityAndAttributes(entity.Address address, entity.AttributeBasedAssignmentCriteria attributeBasedAssignmentCriteria, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximityAndAttributes(address, attributeBasedAssignmentCriteria, includeSubGroups, group);
    }
    
    /**
     * Assigns this AssignmentBean to the user in the current group with the closest address to the given address,
     * measured by great-circle distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use as the center of the proximity search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address);
    }
    
    /**
     * Assigns this AssignmentBean to the user with the closest address to the given address, measured by a great-circle
     * distance along the surface of the earth.
     * <p/>
     * Alternative signature; see <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the current group as well as users in the
     *                         current group.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByLocationUsingProximitySearch(AddressBase, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups);
    }
    
    /**
     * Assigns this entity to the user with the closest address to the specified address, measured by a great-circle
     * distance along the surface of the earth. This includes the following steps:
     * <p/>
     * 1) Geocode the supplied address which will serve as the center of the search. (If necessary, location may already be geocoded)
     * 2) For each user in the specified group, compute the distance from their location (using their Contact entity's primary address)
     * to the supplied location.
     * 2a) If the includeSubGroups parameter is true, repeat this process with all of the descendant groups of the specified group
     * 3) Return the user who is closest to the specified location
     * <p/>
     * If the geocoding attempt fails for the supplied location, an error will be logged and false returned
     * <p/>
     * Search begins with the users of the parameter group; it is an error if there is no group.
     * @param address An address to use for location-based assignment
     * @param includeSubGroups if true, then include users in any sub groups of the parameter group as well as users in
     *                         that group.
     * @param group the group whose members should be considered for assignment. May not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByLocationUsingProximitySearch(entity.Address address, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByLocationUsingProximitySearch(address, includeSubGroups, group);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search.
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.Geocode.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * Note that this method depends on the Assignment Engine state, and should not be called outside of Assignment Rules
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithAssignmentSearchCriteria(CCAssignmentSearchCriteria, int, boolean, GroupBase)</code> instead
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups);
    }
    
    /**
     * !WARNING! This can be very slow compared to other assignment operations.
     * <p/>
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * If there is more than one user in the returned search, selects one of them
     * based on regular round-robin search. (To always assign to the closest user,
     * set the cap to 1.)
     * <p/>
     * The user search criteria should be set up via gw.api.domain.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * @param asc a valid CC Assignment Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @param currentGroup the group within which the search will be performed
     * @return true if the assignment is successful
     */
    public boolean assignUserByProximityWithAssignmentSearchCriteria(gw.api.assignment.CCAssignmentSearchCriteria asc, int cap, boolean includeSubGroups, entity.Group currentGroup) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithAssignmentSearchCriteria(asc, cap, includeSubGroups, currentGroup);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, includeSubGroups);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap);
    }
    
    /**
     * Assigns this AssignmentBean to a user based on a User Search by Proximity.
     * <p/>
     * Alternative signature; see <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * @param usc a valid User Search Criteria
     * @param cap the maximum number of users to return in the search
     * @param includeSubGroups include subgroups in search
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByProximityWithSearchCriteria(UserSearchCriteriaBase, int, boolean, GroupBase)</code> instead.
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups);
    }
    
    /**
     * Assigns this entity to a user based on a User Search by Proximity. This includes the following steps:
     * <p/>
     * 1) Geocode the location which will serve as the center of the search, accessed through <code>usc.getContact().getAddress()</code>.
     * (If necessary; the location may already be geocoded)
     * 2) Finds a list of users who satisfy the user search criteria, which may include proximity restrictions.
     * The specified cap is used to limit the number of users in this list; in the case of proximity restrictions, the users farthest from the search center are trimmed.
     * 3) Use the round-robin algorithm to pick one of the users. This means that repeated, identical calls to this
     * method will rotate through the resulting set of users to find the user to return.
     * <p/>
     * Note that the round-robin rotation is based on the exact UserSearchCriteria used. One implication of this is that
     * the location used should be as general as possible (such as just a city, state or zip, rather than a specific
     * street address) to get the benefit of the round-robin processing and reduce the load on the system.
     * <p/>
     * To always assign to the closest user, set the cap to 1.
     * <p/>
     * <b>Note:</b> while this can be used to do assignment without the proximity search parameters set (thus
     * allowing a general "assignUserBySearchCriteria" capability), this is not recommended or the intent of
     * this method.  It is computationally expensive compared to other methods of non-proximity-based assignment
     * and should be used with care.
     * <p/>
     * The user search criteria should be set up via gw.api.geocode.GeocodeScriptHelper.setupUserProximitySearch()
     * in order to ensure that the proximity search criteria are set up properly.
     * <p/>
     * The group parameter may be null. If it is not null, it will be used as part of the search
     * @param usc a valid User Search Criteria, may not be null
     * @param cap If greater than zero, the maximum number of users to include for round robin from the search results.
     *                         If -1, all users from the search results will be included in the round robin.
     * @param includeSubGroups if the sub group should be used for search
     * @param group The group from where the search should be conducted
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByProximityWithSearchCriteria(entity.UserSearchCriteria usc, int cap, boolean includeSubGroups, entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).assignUserByProximityWithSearchCriteria(usc, cap, includeSubGroups, group);
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin();
    }
    
    /**
     * Assigns a user within the "current" group (retrieved from the current state of
     * the Assignment Engine), rotating through the set of users in the group each time the method is called.
     * <p/>
     * Alternative signature; see <code>assignUserByRoundRobin(boolean, Group)</code> for more details.
     * <p/>
     * If invoked from outside an Assignment Rule, will take no action and return false.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the current group
     *                         but also through all its subgroups.
     * @return true if the assignment is successful, false otherwise
     * @deprecated depends on the Assignment Engine state; use <code>assignUserByRoundRobin(boolean, Group)</code> instead
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups);
    }
    
    /**
     * Uses the round robin algorithm to choose the next user from the specified group or to receive the assignable.
     * <p/>
     * The round-robin algorithm is basically a simple "eenie-meenie-miney-moe" rotation. No current assignment load is
     * taken into account, but each User's load factor is used to determine relative assignment frequency; essentially, a
     * user with a lower load factor than the others' is periodically skipped.
     * <p/>
     * The round-robin rotation for each group (and boolean value) is independent of the others, so only identical
     * calls will impact the user who is "next" in the rotation.
     * @param includeSubGroups if this parameter is true the selector will round-robin not only through the parameter group
     *                         but also through all its subgroups.
     * @param group may not be null
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserByRoundRobin(boolean includeSubGroups, entity.Group group) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserByRoundRobin(includeSubGroups, group);
    }
    
    /**
     * Uses the supplied dynamic assignment strategy implementation to find an assignment for the current entity. See
     * {@link gw.api.assignment.DynamicUserAssignmentStrategy} for more details on what that implementation should look like and how it
     * is used by the implementation of this method.
     * @param dynamicUserAssignmentStrategy the {@link gw.api.assignment.DynamicUserAssignmentStrategy} to be used to do the assignment
     * @param group The group to be used during the assignment (usually the group to which the entity is or should be assigned)
     * @param includeSubGroups Whether the subgroups of the supplied group should also be considered
     * @return true if the assignment is successful, false otherwise
     */
    public boolean assignUserDynamically(gw.api.assignment.DynamicUserAssignmentStrategy dynamicUserAssignmentStrategy, entity.Group group, boolean includeSubGroups) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).assignUserDynamically(dynamicUserAssignmentStrategy, group, includeSubGroups);
    }
    
    /**
     * Assigns the given User/Group pair to the given role on this assignable object.
     * If the role is exclusive, replaces the existing assignment. Otherwise, adds a
     * new assignment for the given User/Group pair, if none already exists for that
     * role.
     * @param user 
     * @param group 
     * @param role 
     */
    public entity.UserRoleAssignment assignUserRole(entity.User user, entity.Group group, typekey.UserRole role) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).assignUserRole(user, group, role);
    }
    
    public void attachNote(entity.Note note) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).attachNote(note);
    }
    
    /**
     * Invokes the Assignment Engine, which will process the configured Assignment Rules to come up with an assignment
     * for the current entity.
     * <p/>
     * May not be invoked from within an Assignment Rule, since the Assignment Engine may not be invoked recursively. If invoked
     * from within an Assigment Rule, an error will be logged and false will be returned.
     * @return true if an assignment has been found, false otherwise
     */
    public boolean autoAssign() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign();
    }
    
    /**
     * <p>
     * Invokes the Assignment Enging to assign the item to the specified group and user.
     * If userID is null, the item will be assigned using the group's assignment rules.
     * If userID is specified, assignment will be made directly to the group and
     * user.  If the engine cannot assign the item to the requested group/user,
     * it will throw an exception indicating the reason.
     * </p>
     * If a user is specified, caller is responsible for ensuring that the
     * user is a member of group.
     * </p>
     * Note that since this method invokes the Assignment Engine, it may not be called from within an Assignment rule.
     * @param group The group to which the item should be assigned - must be
     *              specified.  If not known, use autoAssign(item) instead.
     * @param user The user to which the item should be assigned; if null an
     *              appropriate user will be selected by group assignment rules.
     * @return true if the assignment is successufl, false otherwise
     */
    public boolean autoAssign(entity.Group group, entity.User user) {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).autoAssign(group, user);
    }
    
    /**
     * Assigns the UserRole for this assignable item.
     * This uses rules to find the right assignment
     * @param role The role to assign
     */
    public boolean autoAssignRole(typekey.UserRole role) {
      return ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).autoAssignRole(role);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    /**
     * Returns true if this claim is in the open state and the specified
     * user is allowed to close it.
     * @param user the User whose permissions should be checked.
     * @return true if the claim can be closed by this user.
     */
    public boolean canClose(entity.User user) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canClose(user);
    }
    
    /**
     * Determines whether this owner can be edited.
     */
    public boolean canEdit() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
    }
    
    /**
     * Can the given address be edited? The address argument should be one of the addresses
     * returned by {@link #getAddresses()}. Returns false if the address belongs to a property
     * or contact on the policy and the policy is verified, otherwise returns true. Returns
     * false if address is null
     * @param address The address to check
     * @return True if can edit this address
     */
    public boolean canEditAddress(entity.Address address) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditAddress(address);
    }
    
    /**
     * Can the given property be edited? The property argument should be one of the properties
     * returned by {@link #getProperties()}. Returns false if the property belongs to the
     * policy and the policy is verified, otherwise returns true. Returns false if property
     * is null
     * @param property The property to check
     * @return True if can edit property
     */
    public boolean canEditProperty(entity.PolicyLocation property) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditProperty(property);
    }
    
    /**
     * Can the given vehicle be edited? The vehicle argument should be one of the vehicles
     * returned by {@link #getVehicles()}. Returns false if the vehicle belongs to the
     * policy and the policy is verified, otherwise returns true. Returns false if vehicle
     * is null
     * @param vehicle The vehicle to check
     * @return True if vehicle can be edited
     */
    public boolean canEditVehicle(entity.Vehicle vehicle) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canEditVehicle(vehicle);
    }
    
    /**
     * Determines if claim can have a claimant at the claim level by checking that the Claimant role is NOT prohibited for
     * this loss typel.
     * @return true if this claim can have a claimant at the claim level
     */
    public boolean canHaveClaimantOnClaim() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canHaveClaimantOnClaim();
    }
    
    /**
     * Returns true if the claim is flagged AND the user is allowed to clear the flag.
     * @param user the User whose permissions should be checked.
     * @return true iff the claim is flagged AND the user is allowed to clear the flag.
     */
    public boolean canRemoveFlag(entity.User user) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canRemoveFlag(user);
    }
    
    /**
     * Returns true if the claim is in the closed state and the user is allowed
     * to reopen it.
     * @param user the User whose permissions should be checked.
     * @return true iff the claim is closed AND the user is allowed to reopen the claim.
     */
    public boolean canReopen(entity.User user) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canReopen(user);
    }
    
    /**
     * Check if the given user should be able to view the given document snapshot, taken from a
     * claim snapshot. Checks the security type of the document and also whether it is associated
     * with an exposure that the user cannot view.
     * @param user the user who wants to view the document
     * @param documentSnapshot the document snapshot object
     * @throws IllegalArgumentException if the given object is not a document snapshot
     * @return true if the user can view the document snapshot, false otherwise
     */
    public boolean canViewDocumentSnapshot(entity.User user, java.lang.Object documentSnapshot) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).canViewDocumentSnapshot(user, documentSnapshot);
    }
    
    /**
     * Cancel the creation of this claim that has been saved as Draft -- marks
     * the claim and its exposures for purge.
     * @throws ClaimOpenException if the indicated claim is not draft state (note
     *                               might be closed, not open, but the point is you can't cancel it).
     * @throws PurgeBlockedException if another object in the database references this Claim.
     * @throws com.guidewire.pl.system.exception.ActiveMessageException if there is an active integration message for this claim.
     * @throws EntityStateException If the claim is not in a cancellable state
     */
    public void cancelClaim() throws com.guidewire.pl.system.exception.ActiveMessageException, com.guidewire.pl.system.exception.PurgeBlockedException, com.guidewire.cc.system.exception.ClaimOpenException, gw.api.webservice.exception.EntityStateException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).cancelClaim();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    /**
     * Checks for any active Messages against this claim or any Contacts in the claim
     * graph - including related contacts.
     * @return boolean true if any active Messages exist
     */
    public boolean checkActiveMessagesForClaimAndContacts() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).checkActiveMessagesForClaimAndContacts();
    }
    
    public boolean checkActiveMessagesForClaimContacts() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).checkActiveMessagesForClaimContacts();
    }
    
    /**
     * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
     * object describing the problem.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkAddRole(role, contact);
    }
    
    public void checkForRetiredAssignee() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).checkForRetiredAssignee();
    }
    
    /**
     * Determines whether or not the given role can be removed the given number of times.
     * @param role 
     * @param count number of instances of the role to be removed
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRemoveRole(role, count);
    }
    
    /**
     * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
     * of adding a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
     * instead.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleAdded(role, contact);
    }
    
    /**
     * Checks the removal of the given role, after it has occurred. To check the validity
     * of removing a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
     * instead.
     * @param role 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleRemoved(role);
    }
    
    /**
     * Clears the flag from a claim
     * @param noteString A note to add while clearing the flag.
     */
    public void clearFlag(java.lang.String noteString) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).clearFlag(noteString);
    }
    
    /**
     */
    public void clearRoleCache() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Closes the claim.
     * @param outcome The outcome of the closed claim
     * @param reason The reason for closing the claim
     * @throws CloseException If an error occurs closing the claim
     * @throws EntityValidationException A validation exception occurs
     */
    public void close(typekey.ClaimClosedOutcomeType outcome, java.lang.String reason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).close(outcome, reason);
    }
    
    public void closeWithValidationOption(typekey.ClaimClosedOutcomeType outcome, java.lang.String reason, gw.api.validation.BundleValidationOption validationOption) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).closeWithValidationOption(outcome, reason, validationOption);
    }
    
    /**
     * This method is only available inside the Assignment Engine. Request manual confirmation of the entity's current assignment by the specified user.
     * <p/>
     * If the specified user does not have the review assignment permission, then does nothing and returns false.
     * Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param responsibleUser The person who should confirm the assignment
     * @return true if responsibleUser has review assignment permission, false otherwise.
     */
    public boolean confirmManually(entity.User responsibleUser) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManually(responsibleUser);
    }
    
    /**
     * Request manual confirmation of the entity's current assignment, with the responsibility round-robined among members
     * of the given group.
     * <p/>
     * Only users in the specified group (not subgroups)  who have the review assignment permission will be considered. The
     * round-robin rotation used here is independent of the rotation used by the assignUserByRoundRobin() methods.
     * <p/>
     * If no user is found, does nothing and returns false. Otherwise, a review Activity will be created and assigned to the user for further processing.
     * @param group the group whose users should be considered in the round-robin rotation
     * @return true if a user was found to give the confirmation action to, false if no such user was found
     */
    public boolean confirmManuallyByRoundRobin(entity.Group group) {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).confirmManuallyByRoundRobin(group);
    }
    
    public void copyPreviousAssignments(entity.Assignable source) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).copyPreviousAssignments(source);
    }
    
    /**
     * Convenience method; creates an activity using newActivity and the given
     * pattern, plus the following
     * <ul>
     * <li>sets the given fields</li>
     * <li>Uses activity pattern to calculate the escalation date and target date.  If the start date for the target date or escalation date
     * is null, the respective field in the activity pattern will be used for the calculation</li>
     * <li>calls {@link entity.Activity#setUp(gw.api.assignment.Assignee)} to assign it.</li>
     * </ul>
     * @param exposure exposure to create activity on
     * @param pattern the activity pattern used to create the activity
     * @param subject subject field for the activity
     * @param description description for the activity
     * @param priority priority field for the activity
     * @param mandatory mandatory field for the activity
     * @param targetStartDate If provided, this will be used as start date for the target date calculation
     * @param escalationStartDate If provided, this will be used as start date for escalation date calculation
     * @return created activity
     */
    public entity.Activity createActivity(entity.Exposure exposure, entity.ActivityPattern pattern, java.lang.String subject, java.lang.String description, typekey.Priority priority, java.lang.Boolean mandatory, java.util.Date targetStartDate, java.util.Date escalationStartDate) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createActivity(exposure, pattern, subject, description, priority, mandatory, targetStartDate, escalationStartDate);
    }
    
    public entity.History createActivityApprovalHistoryEvent(entity.User approvalUser, entity.TransactionSet transactionSet, java.lang.String description) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createActivityApprovalHistoryEvent(approvalUser, transactionSet, description);
    }
    
    /**
     * Convenience method; creates an activity using newActivity and the given
     * pattern, then calls {@link entity.Activity#setUp(gw.api.assignment.Assignee)} to assign it.
     * @param exposure The exposure
     * @param pattern The activity pattern
     * @return The created activity pattern
     */
    public entity.Activity createActivityFromPattern(entity.Exposure exposure, entity.ActivityPattern pattern) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createActivityFromPattern(exposure, pattern);
    }
    
    public entity.AnswerSet createAnswerSet(gw.pl.persistence.core.Bundle bundle, entity.QuestionSet qs) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createAnswerSet(bundle, qs);
    }
    
    /**
     * Called after the assignable is assigned to create a new history event recording the assignment. May
     * return null for some assignable types, meaning that no history event was created
     * @param assignable the assignable containing details of the new assignment
     * @return the new history event, or null
     */
    public entity.History createAssignmentHistoryEvent(entity.Assignable assignable) {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentHistoryEvent(assignable);
    }
    
    /**
     * Create a new assignment review activity which represents the responsibility to assign this
     * assignable. Assignment review activities are used for manual assignment.
     * @return a new assignment review activity which refers to this assignable
     */
    public entity.Activity createAssignmentReviewActivity() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).createAssignmentReviewActivity();
    }
    
    /**
     * Creates a claim-level check on this claim with the given parameters.  The check
     * will contain one payment with one line item.  To create a check with a payment
     * that is coded to a particular exposure rather than being claim-level, the proper
     * method to use is one of the versions of {@link entity.Exposure#createCheck}
     * @param payee The payee of the check.
     * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other)
     * @param recipient The contact the check should be sent to
     * @param mailingAddress The address the check should be sent to
     * @param reportabilityType The reportability type of the check
     * @param costType The costtype for the payment - cannot be null, an IllegalArgumentException will be thrown.
     * @param costCategory The costcategory for the payment - cannot be null, an IllegalArgumentException will be thrown.
     * @param paymentType The paymenttype for this payment - can be null, in which case the payment type will default to 'Partial'
     * @param lineCategory The category for the payment line item
     * @param checkAmount The amount of the payment line item (and therefore the check)
     * @param comments Comments on this check
     * @param memo The memo for the check
     * @param payTo The pay to for the check
     * @param scheduledSendDate The scheduled send date of the check
     * @param requestingUser The user requesting this check @return the created check
     * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the check
     * @throws com.guidewire.pl.system.exception.WorkflowValidationException if there is a problem during workflow validation
     * @throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
     *          while trying to get the deductions.
     * @return The created check
     * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Claim and then create the check
     */
    public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
    }
    
    /**
     * Creates a claim-level check on this claim with the given parameters.  The check
     * will contain one payment with one line item.  To create a check with a payment
     * that is coded to a particular exposure rather than being claim-level, the proper
     * method to use is one of the versions of {@link Exposure#createCheck}
     * @param payee The payee of the check.
     * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other)
     * @param recipient The contact the check should be sent to
     * @param mailingAddress The address the check should be sent to
     * @param reportabilityType The reportability type of the check
     * @param costType The costtype for the payment - cannot be null, an IllegalArgumentException will be thrown.
     * @param costCategory The costcategory for the payment - cannot be null, an IllegalArgumentException will be thrown.
     * @param paymentType The paymenttype for this payment - can be null, in which case the payment type will default to 'Partial'
     * @param lineCategory The category for the payment line item
     * @param checkAmount The amount of the payment line item (and therefore the check)
     * @param checkCurrency The currency of the check. null value uses claim currency.
     * @param transToClaimExchangeRateOverride Use null for the current market rate. A positive non-null value sets Check.OverrideExchangeRate to true and sets this value as the TransToClaim exchange rate.
     * @param customExchangeRateDescription Use null if transToClaimExchangeRateOverride is null. Otherwise, describes the overriden exchange rate.
     * @param claimAmountOverride Please use null. A non-null value overrides the ClaimAmount calculated from the checkAmount and exchange rate.
     * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
     * @param comments Comments on this check
     * @param memo The memo for the check
     * @param payTo The pay to for the check
     * @param scheduledSendDate The scheduled send date of the check
     * @param requestingUser The user requesting this check @return the created check
     * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the check
     * @throws com.guidewire.pl.system.exception.WorkflowValidationException if there is a problem during workflow validation
     * @throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
     *          while trying to get the deductions.
     * @return the new check
     * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Claim and then create the check
     */
    public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, typekey.Currency checkCurrency, java.math.BigDecimal transToClaimExchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, checkCurrency, transToClaimExchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, memo, payTo, scheduledSendDate, requestingUser);
    }
    
    /**
     * Returns a new Check Creator. Called internally by the newCheckCreator() methods.
     */
    public gw.api.financials.CheckCreator createCheckCreator() {
      return ((gw.api.financials.CheckCreatorProvider)__getDelegateManager().getImplementation("gw.api.financials.CheckCreatorProvider")).createCheckCreator();
    }
    
    public void createCheckDeletedHistoryEvent(entity.Check check) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createCheckDeletedHistoryEvent(check);
    }
    
    public void createCheckStoppedHistoryEvent(entity.Check check) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createCheckStoppedHistoryEvent(check);
    }
    
    public void createCheckTransferredHistoryEvent(entity.Check check) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createCheckTransferredHistoryEvent(check);
    }
    
    public void createCheckVoidedHistoryEvent(entity.Check check) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createCheckVoidedHistoryEvent(check);
    }
    
    public entity.History createClaimArchiveHistoryEvent(java.util.Date archiveDate) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createClaimArchiveHistoryEvent(archiveDate);
    }
    
    /**
     * Creates a new association linking to this claim. We assume the claim's bundle
     * is editable, etc.  Equivalent to calling createClaimAssociation(false)
     * @return the newly created ClaimAssociation object.
     */
    public entity.ClaimAssociation createClaimAssociation() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimAssociation();
    }
    
    /**
     * Creates a new association linking to this claim. We assume the claim's bundle
     * is editable, etc.
     * @param isPrimaryClaim true if this claim should be the primary claim in the association
     * @return the newly created ClaimAssociation object.
     */
    public entity.ClaimAssociation createClaimAssociation(boolean isPrimaryClaim) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimAssociation(isPrimaryClaim);
    }
    
    /**
     * Creates a ClaimContact for this Claim and the given Contact.
     * <p/>
     * If the Contact is linked to the Address Book, then this method does two additional things:<ol>
     * <li>The Claim's related Contact graph will be searched for a matching Contact. If a match is found, that Contact
     * will be used to create the ClaimContact instead.</li>
     * <li>The Claim's ContactContact graph will be traversed. Any ContactContacts with missing FKs but
     * matching link ID will be "materialized" with the input Contact.</li>
     * </ol>
     * <p/>
     * Note that this method is <em>not</em> suitable for use with a contact that has just been picked from the address
     * book. Use claimparties.ClaimContactUtil.createClaimContact(claim, tempContact) for contacts picked from the
     * address book.
     * @param contact The contact
     * @return The claim contact
     */
    public entity.ClaimContact createClaimContact(entity.Contact contact) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createClaimContact(contact);
    }
    
    public entity.History createClaimRestoredHistoryEvent(java.lang.String comment) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createClaimRestoredHistoryEvent(comment);
    }
    
    /**
     * Adds the custom history event to this claim.
     * @param type the custom history type
     * @param description the description
     * @return the created history event.
     */
    public entity.History createCustomHistoryEvent(typekey.CustomHistoryType type, java.lang.String description) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createCustomHistoryEvent(type, description);
    }
    
    /**
     * Puts a task on a singleton document creation queue to create a document
     * on the claim in an asynchronous (from the user's perspective) manner
     * @param templateName The name of the document template
     * @param docName The document name
     * @param docType The document type
     * @param statusType The document status type
     * @param securityType The security type of the document
     * @param exposure The associated exposure
     * @param claimant The claimant contact
     * @param valuesMap The values map to set on the document creator
     * @param onErrorPattern The error activity pattern to set on the document creator
     */
    public void createDocument(java.lang.String templateName, java.lang.String docName, typekey.DocumentType docType, typekey.DocumentStatusType statusType, typekey.DocumentSecurityType securityType, entity.Exposure exposure, entity.Contact claimant, java.util.Map valuesMap, entity.ActivityPattern onErrorPattern) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createDocument(templateName, docName, docType, statusType, securityType, exposure, claimant, valuesMap, onErrorPattern);
    }
    
    public void createDocumentSynchronously(java.lang.String templateName, java.lang.String docName, typekey.DocumentType docType, typekey.DocumentStatusType statusType, typekey.DocumentSecurityType securityType, entity.Exposure exposure, entity.Contact claimant, java.util.Map valuesMap, entity.ActivityPattern onErrorPattern) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createDocumentSynchronously(templateName, docName, docType, statusType, securityType, exposure, claimant, valuesMap, onErrorPattern);
    }
    
    /**
     * Creates a new reserve line on this claim with the given reserving currency.
     * The new reserve line's exposure, cost type, and cost category are left
     * null, meaning the new reserve line is primarily useful as a placeholder in
     * the UI. If the given reserving currency is null, it defaults to this
     * claim's currency.
     * @param reservingCurrency 
     */
    public entity.ReserveLine createDummyReserveLine(typekey.Currency reservingCurrency) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createDummyReserveLine(reservingCurrency);
    }
    
    /**
     * Creates a new History entry of the given Type related to the given Exposure
     * @param type the history type
     * @param exposure the related Exposure
     * @param description the description
     * @return the created history event.
     */
    public entity.History createExposureHistoryEvent(typekey.HistoryType type, entity.Exposure exposure, java.lang.String description) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createExposureHistoryEvent(type, exposure, description);
    }
    
    /**
     * Creates a new History entry of the given Type
     * @param type the history type
     * @param description the description
     * @return the created history event.
     */
    public entity.History createHistoryEvent(typekey.HistoryType type, java.lang.String description) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createHistoryEvent(type, description);
    }
    
    public void createInitialReservesAndRebuildACLs() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createInitialReservesAndRebuildACLs();
    }
    
    /**
     * Creates a new History entry of the given Type related to the given Matter
     * @param type the history type
     * @param matter the related Matter
     * @param description the description
     * @return the created history event.
     */
    public entity.History createMatterHistoryEvent(typekey.HistoryType type, entity.Matter matter, java.lang.String description) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createMatterHistoryEvent(type, matter, description);
    }
    
    /**
     * Generates a new policy renewal alert in the policy system, via a call to the
     * IPolicyRenewalAlertAdapter plugin
     * <p>
     * This method was added in early versions of ClaimCenter when much less could be done directly in
     * Gosu. The combination of this method and the IPolicyRenewalAlertAdapter plugin gave a way for
     * customers to call a remote policy system from rules. In the out of box product the actual
     * implementation of the plugin is empty and no code calls createPolicyRenewalAlert, so it is
     * essentially a hook which provides no intrinsic functionality but can be used as an extension
     * point. In more recent versions of ClaimCenter customers can create arbitrary custom web services
     * and call them from Gosu so there is no point in maintaining this interface as a separate
     * extension point - the interface is limiting and using a direct plugin call, rather than messaging,
     * makes it difficult to implement reliably.
     * @param severityCode Severity code of the renewal alert
     * @param description Description for the alert
     * @deprecated use messaging and a custom web service instead of this interface
     */
    public void createPolicyRenewalAlert(java.lang.String severityCode, java.lang.String description) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createPolicyRenewalAlert(severityCode, description);
    }
    
    /**
     * Creates a claim-level recovery.  The recovery is created with one line item and the Claim Currency.
     * @param payer The payer of the recovery.
     * @param costType The costtype for the recovery.  This value cannot be null.
     * @param costCategory The costcategory for the recovery  This value cannot be null.
     * @param recoveryCategory The Recovery Category for the recovery.
     * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
     * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
     * @param comments Comments on this recovery.
     * @param requestingUser The user requesting this recovery.
     * @return the created recovery
     */
    public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, java.lang.String comments, entity.User requestingUser) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, comments, requestingUser);
    }
    
    /**
     * Creates a claim-level recovery.  The recovery is created with one line item.
     * @param payer The payer of the recovery.
     * @param costType The costtype for the recovery.  This value cannot be null.
     * @param costCategory The costcategory for the recovery  This value cannot be null.
     * @param recoveryCategory The Recovery Category for the recovery.
     * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
     * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
     * @param recoveryCurrency The currency of the recoveryAmount.
     * @param exchangeRateOverride The exchange rate that is to be used to override the default rate, can be null
     * @param customExchangeRateDescription The custom exchange rate description, can be null
     * @param claimAmountOverride The claim amount to override the automatically calculated amount, can be null
     * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
     * @param comments Comments on this recovery.
     * @param requestingUser The user requesting this recovery.
     * @return the created recovery
     */
    public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, typekey.Currency recoveryCurrency, java.math.BigDecimal exchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, entity.User requestingUser) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, recoveryCurrency, exchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, requestingUser);
    }
    
    /**
     * Creates a new History entry of the given Type related to the given Subrogation
     * @param type the history type
     * @param subrogation the related Subrogation
     * @param description the description
     * @return the created history event.
     */
    public entity.History createSubrogationHistoryEvent(typekey.HistoryType type, entity.Subrogation subrogation, java.lang.String description) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createSubrogationHistoryEvent(type, subrogation, description);
    }
    
    /**
     * Add a new Subrogation summary to claim if one doesn't exist, otherwise return the existing one.
     * @return subrogation summary (new or existing) related to this claim.
     */
    public entity.SubrogationSummary createSubrogationSummaryIdempotently() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createSubrogationSummaryIdempotently();
    }
    
    public entity.Policy createUnverifiedPolicy(java.lang.String policyNumber, typekey.PolicyType type, entity.KeyableBean[] beans) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).createUnverifiedPolicy(policyNumber, type, beans);
    }
    
    /**
     * Creates a AttributeBasedAssignmentCriteria instance, which is used to collect a set of user attributes on which to search for users.
     * The matchAll flag indicates whether each attribute must be satisfied (logical AND) or whether any attribute could
     * be satisfied (logical OR).
     * @return AttributeBasedAssignmentCriteria instance
     * @deprecated Use the constructor directly.  This method is no longer necessary, since a new AttributeBasedAssignmentCriteria entity can simply
     *             be created directly in Gosu and placed in the correct bundle.
     */
    public entity.AttributeBasedAssignmentCriteria createUserAttributes() {
      return ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).createUserAttributes();
    }
    
    /**
     * Creates a new warning activity for the claim and attempts to assign it to the
     * given user and group.  If the group is null, then the activity is auto-assigned.
     * @param userID the user used in assignment.
     * @param groupID the group used in assignment
     * @param patternName the activty pattern
     * @return the newly created activity
     */
    public entity.Activity createWarningActivity(gw.pl.persistence.core.Key userID, gw.pl.persistence.core.Key groupID, java.lang.String patternName) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createWarningActivity(userID, groupID, patternName);
    }
    
    /**
     * Executes a rule set (synchronously) to generate a workplan for this claim.
     */
    public void createWorkplan() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).createWorkplan();
    }
    
    public com.guidewire.cc.domain.claim.ClaimContactSetOperationResult deleteClaimContacts(entity.ClaimContact[] claimContacts) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).deleteClaimContacts(claimContacts);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public entity.ClaimInfo ensureClaimInfoPopulated() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).ensureClaimInfoPopulated();
    }
    
    /**
     * Return ClaimInjuryIncident, creating one if it does not yet exist. This should be used
     * in PCFs or wherever the ClaimInjuryIncident fields may be edited, in case the CII does
     * not yet exist. See also Claim.ClaimInjuryIncident property.
     * @return The claim injury incident
     */
    public entity.InjuryIncident ensureClaimInjuryIncident() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).ensureClaimInjuryIncident();
    }
    
    /**
     * Find any existing open assignment review activities related to this assignable. Normally this will
     * return either zero or one activities. Assignment review activities are used for manual assignment.
     * @return a query result containing the open assignment review activities, if any
     */
    public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
    }
    
    public entity.Contact findOrCloneAndResolveContact(entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).findOrCloneAndResolveContact(contact);
    }
    
    public gw.api.database.IQueryBeanResult<entity.PriorClaimView> findPriorClaimsByClaimant(entity.Contact claimant, typekey.ClaimState... claimStatesToOmit) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).findPriorClaimsByClaimant(claimant, claimStatesToOmit);
    }
    
    public gw.api.database.IQueryBeanResult<entity.PriorClaimView> findPriorClaimsByPolicyNumber(java.lang.String policyNumber, typekey.ClaimState... claimStatesToOmit) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).findPriorClaimsByPolicyNumber(policyNumber, claimStatesToOmit);
    }
    
    public void finishAssignment() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).finishAssignment();
    }
    
    /**
     * Forces the claim to add any missing claim indicators, claim metrics or exposure metrics. This will
     * usually occur when a new indicator or metric has been added to a pre-existing claim. This should only
     * ever be called within a batch process or exception rule.
     */
    public void forceRecalculateMetrics() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).forceRecalculateMetrics();
    }
    
    /**
     * Adds the claim's currency value to BundleCommitCondition, if the currency gets changed, current bundle
     * will not be able to commit.  If the currency is already freezed, it will not be refreezed with the current
     * value.
     */
    public void freezeCurrency() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).freezeCurrency();
    }
    
    /**
     * Adds the claim's state value to BundleCommitCondition, if the state gets changed, current bundle
     * will not be able to commit.  If the state is already frozen, it will not be refrozen with the current
     * value.
     */
    public void freezeState() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).freezeState();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateAssignmentEvents() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).generateAssignmentEvents();
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    /**
     * Assign a claim number for a draft claim by calling the claim number adapater.
     * The server will verify that the
     * number is unique and re-query the adapter if it isn't.  This method is called
     * when the claim is first created but doesn't have complete data yet.  The method
     * <code>generateNewClaimNumber(Claim)</code> will be called for a permanent
     * claim number when the claim's data is complete (and it is about to be opened).
     */
    public void generateTempClaimNumber() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).generateTempClaimNumber();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the Access field.
     * The access control objects for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimAccess[] getAccess() {
      return (entity.ClaimAccess[])__getInternalInterface().getFieldValue(ACCESS_PROP.get());
    }
    
    /**
     * Gets the value of the AccidentType field.
     * Detailed accident type; augments LossCause.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AccidentType getAccidentType() {
      return (typekey.AccidentType)__getInternalInterface().getFieldValue(ACCIDENTTYPE_PROP.get());
    }
    
    /**
     * Gets the active assignments to the given role.
     * @param userRole 
     * @return 
     */
    public entity.UserRoleAssignment[] getActiveUserRoleAssignments(typekey.UserRole userRole) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getActiveUserRoleAssignments(userRole);
    }
    
    /**
     * Gets the value of the Activities field.
     * The activities for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Activity[] getActivities() {
      return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
    }
    
    /**
     * Returns a List of Address objects (e.g., postal addresses) that are related to the Claim.
     * This is used, for example, to find possible candidates for Claim loss location.
     * This currently includes:
     * <ul>
     * <li>The addresses of any properties listed on the policy</li>
     * <li>All of the insured's addresses.</li>
     * <li>All of the policyholder's addresses.</li>
     * <li>All of the DBA's addresses.</li>
     * <li>The claim's loss location.</li>
     * </ul>
     * @return a List of Address objects related to the claim.
     */
    public entity.Address[] getAddresses() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAddresses();
    }
    
    /**
     * Gets the value of the AgencyId field.
     * An ID assigned to indicate company and office a claim is being submitted by, this data is used by ISO integration
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAgencyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENCYID_PROP.get());
    }
    
    /**
     * Returns the AggregateLimits of all PolicyPeriods associated with the policy
     * of this claim.
     * @return The aggregate limits
     */
    public entity.AggregateLimit[] getAggregateLimits() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAggregateLimits();
    }
    
    public entity.ClaimContactRole[] getAllClaimContactRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getAllClaimContactRoles();
    }
    
    public java.util.Set<entity.ClaimContactRole> getAllClaimContactRolesByRoles(typekey.ContactRole[] roles) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllClaimContactRolesByRoles(roles);
    }
    
    /**
     * Returns all of the history events for this claim in a QueryProcessor.
     * @return The query result
     */
    public gw.api.database.IQueryBeanResult<entity.History> getAllHistoryEvents() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllHistoryEvents();
    }
    
    /**
     * Get all UserRoleAssignments on the Claim, not filtered by ExposureID.
     * @return All UserRoleAssignments on the Claim including those associated with exposures.
     */
    public entity.UserRoleAssignment[] getAllRoleAssignments() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllRoleAssignments();
    }
    
    /**
     * Gets the value of the AllocatedClaimNumber field.
     * If this claim is draft, and an attempt to save it has failed, contains the claim number that was allocated before the failure. Otherwise null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AllocatedClaimNumber getAllocatedClaimNumber() {
      return (entity.AllocatedClaimNumber)__getInternalInterface().getFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the AllocatedClaimNumberArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AllocatedClaimNumber[] getAllocatedClaimNumberArray() {
      return (entity.AllocatedClaimNumber[])__getInternalInterface().getFieldValue(ALLOCATEDCLAIMNUMBERARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAllocatedClaimNumberID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get());
    }
    
    /**
     * Returns all allowed contact roles for a Claim, as defined
     * in the entityroleconstraints-config.xml file
     * @return a list of allowed contact roles for this Claim
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllowedContactRolesForEntity();
    }
    
    /**
     * Returns a set of valid Payee Types as ContactRoles for the input "payee" parameter
     * Since not all roles for this "payee" parameter on the Claim are valid for a payee of a payment,
     * this method returns the set of allowed roles for this "payee" parameter as a payee of a payment.
     * @param payee the payee to be checked for allowed roles
     * @return an array of ContactRoles for the parameter "payee" that are allowed types of a payee on a payment
     */
    public typekey.ContactRole[] getAllowedPayeeTypes(entity.Contact payee) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAllowedPayeeTypes(payee);
    }
    
    /**
     * Gets the answer to a given question.  Should never return null; instead should
     * create empty answer if necessary.  Can however throw an exception if the question
     * 
     * is not related in any way to the object.
     * @param question 
     */
    public entity.AnswerDelegate getAnswer(entity.Question question) {
      return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getAnswer(question);
    }
    
    /**
     * This class exposes the answer set functionality for external apps.
     * @param qs 
     * @return 
     */
    public entity.AnswerSet getAnswerSetForQuestionSet(entity.QuestionSet qs) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getAnswerSetForQuestionSet(qs);
    }
    
    /**
     * Gets the actual value of the answer.  If the answer is undefined on this
     * entity, use the default answer if there is one, else null.
     * @param question 
     */
    public java.lang.Object getAnswerValue(entity.Question question) {
      return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getAnswerValue(question);
    }
    
    /**
     * Get the activity patterns applicable when creating a new activity for this claim.
     * @return The activity patterns
     */
    public entity.ActivityPattern[] getApplicableActivityPatterns() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getApplicableActivityPatterns();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedByUser field.
     * User who assigned this entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedGroup field.
     * Group to which this entity is assigned; null if none assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getAssignedGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedQueue field.
     * Either the Queue to which this entity is assigned (if AssignmentStatus is 'assigned'), the Queue to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getAssignedQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUser field.
     * Either the User to which this entity is assigned (if AssignmentStatus is 'assigned'), the User to which the system suggests assignment (if AssignmentStatus is 'manual'), or null if none assigned. Only one of AssignedUserID or AssignedQueueID should be non null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDUSER_PROP.get());
    }
    
    /**
     * Returns a string describing the current assignee plus their group,
     * suitable for display to the user. This can be quite a long string,
     * for example "Andy Applegate (Auto1 - TeamA)". See also
     * {@link #getAssigneeDisplayString()} which omits the group name and
     * may be more appropriate if space is tight.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue plus their group (for example
     * "Andy Applegate (Auto1 - TeamA)"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeAndGroupDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeAndGroupDisplayString();
    }
    
    /**
     * Returns a string describing the current assignee, suitable for display
     * to the user. See also {@link #getAssigneeAndGroupDisplayString()}, which
     * returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user or queue, returns the
     * name of the user or queue (for example "Andy Applegate"). If assignment
     * is pending, returns a simple string (for example "pending assignment").
     * If the assignable is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeDisplayString();
    }
    
    /**
     * Returns a string describing only the group of the current assignee,
     * suitable for display to the user. See also {@link #getAssigneeAndGroupDisplayString()},
     *  which returns a more detailed description of the assignee.
     * @return If the assignable is assigned to a user, returns the name of the
     * user's group (for example "Auto1 - TeamA"). If assignment is pending, returns
     * a simple string (for example "pending assignment"). If the assignable
     * is completely unassigned returns the empty string.
     */
    public java.lang.String getAssigneeGroupOnlyDisplayString() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getAssigneeGroupOnlyDisplayString();
    }
    
    /**
     * Gets the value of the AssignmentDate field.
     * Time when entity last assigned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssignmentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSIGNMENTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignmentStatus field.
     * Typelist describing assignment status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssignmentStatus getAssignmentStatus() {
      return (typekey.AssignmentStatus)__getInternalInterface().getFieldValue(ASSIGNMENTSTATUS_PROP.get());
    }
    
    /**
     * Returns an unsorted array of all ClaimAssociation objects linked to this claim.
     * @return The claim associations
     */
    public entity.ClaimAssociation[] getAssociations() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getAssociations();
    }
    
    public entity.AutomatedHandler[] getAutomatedHandlers() {
      return ((gw.api.specialhandling.ClaimSpecialHandlingMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.ClaimSpecialHandlingMethods")).getAutomatedHandlers();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Explanation of benefits Decision
     * @return The explanation
     */
    public java.lang.String getBenefitsDecisionReason() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getBenefitsDecisionReason();
    }
    
    /**
     * Gets the value of the Catastrophe field.
     * Associated catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Catastrophe getCatastrophe() {
      return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCatastropheID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CATASTROPHE_PROP.get());
    }
    
    /**
     * Returns a new CheckCreator object for creating a check on this claim.
     * @deprecated Call newCheckCreator() method instead. This property has always
     *             returned a new CheckCreator with each access.
     */
    public gw.api.financials.CheckCreator getCheckCreator() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getCheckCreator();
    }
    
    /**
     * <p>
     * Gets all the <code>Check</code> entities for the given <code>Claim</code>. The system calculates this set
     * by looking up the <code>Check</code> for every <code>Payment</code> on the <code>Claim</code>. When you are in a
     * read-only context (i.e., none of the claim's checks are new/updated/removed and not yet committed
     * to the database) use <code>getChecksQuery()</code> in rules instead. <code>getChecksQuery</code> returns a
     * <code>QueryProcessor</code> from which you can get an <code>Iterator</code>. This is a far more efficient way to
     * get all the checks for a claim.
     * </p><p>
     * <b>Note:</b> The beans returned by <code>getChecks()</code> are not guaranteed to be in the same bundle as this
     * <code>Claim</code>, and their bundle may not be editable. To edit the beans, you should add them to an editable
     * bundle first.
     * </p>
     * @return All the checks associated with this claim
     * @deprecated Users should use {@link #getChecksIterator} in a rules context, or
     *             <code>ClaimFinancialsTransactionsUtil.getChecksQuery(Claim)</code> if populating a list view separate from the
     *             Checks list view provided in the base application configuration.
     */
    @java.lang.Deprecated
    public entity.Check[] getChecks() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecks();
    }
    
    /**
     * Constructs an Iterator to provide access to the Checks for this claim.  Either all the Checks
     * or only the new and modified Checks can be chosen for retrieval.  If all the Checks are chosen
     * for retrieval, then those Checks that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a more efficient alternative to calling {@link #getChecks()}, particularly if you are
     * only interested in new or modified Checks
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified Checks for this claim will
     *                           be returned.  This includes checks for which an associated payment or lineitem has been modified.
     *                           Otherwise, if <code>false</code> then all Checks for the claim will be returned, including
     *                           new and modified Checks, but excluding deleted Checks.
     * @return an Iterator that returns Checks
     */
    public java.util.Iterator<entity.Check> getChecksIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecksIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to retrieve all the Checks for this claim.  This is a much
     * more efficient way to get the checks for this claim than using {@link #getChecks}
     * when you are in a read-only context (i.e., none of the claim's checks are
     * new/updated/removed and not yet commited to the database)
     * @return a QueryProcessor enscapulating the checks query
     */
    public gw.api.database.IQueryBeanResult<entity.Check> getChecksQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getChecksQuery();
    }
    
    /**
     * Returns the child objects of the current assignable to which the new assigment should maybe be
     * cascaded. shouldCascadeAssignment will be called on each child before actually doing the cascade
     * @return child objects to which the new assignment should potentially be cascaded
     */
    public java.util.List<gw.api.assignment.CCAssignableMethods> getChildrenForCascadeAssignment() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getChildrenForCascadeAssignment();
    }
    
    /**
     * Returns the claim value.
     */
    public entity.Claim getClaim() {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getClaim();
    }
    
    /**
     * Gets the ClaimContact associated with the given Contact for this Claim, or null
     * if there is no associated ClaimContact.
     * @param contact The contact to check
     * @return The associated claim contact, or null if none
     */
    public entity.ClaimContact getClaimContact(entity.Contact contact) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimContact(contact);
    }
    
    /**
     * Get the directly related ClaimContact with the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContact or null if none exists
     */
    public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactByRole(role);
    }
    
    /**
     * Gets the ClaimContactRole in the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContactRole or null if none exists.
     */
    public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRoleByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContactRoles in the given role.
     * @param role 
     */
    public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRolesByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContacts with the given role.
     * @param role 
     */
    public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRole(role);
    }
    
    public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRoles(roles);
    }
    
    /**
     * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
     * object.
     * <br>If you need all contacts, including those that are indirectly related to the Claim, use
     * {@link entity.Claim#getContacts()}
     */
    public entity.ClaimContact[] getClaimContactsForAllRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsForAllRoles();
    }
    
    public com.guidewire.cc.domain.claim.impl.ClaimHistoryHandler getClaimHistoryHandler() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getClaimHistoryHandler();
    }
    
    /**
     * Gets the value of the ClaimISOMatchReports field.
     * ISO match reports for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimISOMatchReport[] getClaimISOMatchReports() {
      return (entity.ClaimISOMatchReport[])__getInternalInterface().getFieldValue(CLAIMISOMATCHREPORTS_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimIndicators field.
     * Indicators related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimIndicator[] getClaimIndicators() {
      return (entity.ClaimIndicator[])__getInternalInterface().getFieldValue(CLAIMINDICATORS_PROP.get());
    }
    
    /**
     * Array association for partition ClaimIndicatorsBySubtype on array ClaimIndicators
     */
    public entity.ClaimIndicator getClaimIndicatorsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ClaimIndicator)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the ClaimInfo field.
     * The claim info is used to cache information for when this claim is archived.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInfo getClaimInfo() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimInfo();
    }
    
    /**
     * Gets the value of the ClaimInfoArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInfo[] getClaimInfoArray() {
      return (entity.ClaimInfo[])__getInternalInterface().getFieldValue(CLAIMINFOARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMINFO_PROP.get());
    }
    
    /**
     * The InjuryIncident that holds values of injury-related fields formerly on Claim.
     * Only used out-of-the-box for WorkersComp. This property should only be used in a
     * read context. See Claim.ensureClaimInjuryIncident().
     * <p/>
     * Note that the ClaimInjuryIncident, if it exists, will be present in the
     * Claim.Incidents array, but it is filtered out of Claim.InjuryIncidentsOnly
     * and Claim.RoleOwners. This is why Claim.InjuryIncidentsOnly and similar properties
     * are preferred to using Claim.Incidents.
     * @return first and only InjuryIncident on this Claim where InjuryIncident.ClaimIncident == true.
     */
    public entity.InjuryIncident getClaimInjuryIncident() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimInjuryIncident();
    }
    
    public entity.ReserveLine[] getClaimLevelReserveLines() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getClaimLevelReserveLines();
    }
    
    /**
     * Gets the value of the ClaimLineNumber_Ext field.
     * A Claim line number in CLASS (needed for non-uniqueness of Company/Syndicate participation)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimLineNumber_Ext() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMLINENUMBER_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimMetricRecalculationTime field.
     * Tracks when Claim metrics and indicators need to be recalculated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimMetricRecalculationTime getClaimMetricRecalculationTime() {
      return (entity.ClaimMetricRecalculationTime)__getInternalInterface().getFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimMetricRecalculationTimeArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimMetricRecalculationTime[] getClaimMetricRecalculationTimeArray() {
      return (entity.ClaimMetricRecalculationTime[])__getInternalInterface().getFieldValue(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimMetricRecalculationTimeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimMetrics field.
     * Metrics related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimMetric[] getClaimMetrics() {
      return (entity.ClaimMetric[])__getInternalInterface().getFieldValue(CLAIMMETRICS_PROP.get());
    }
    
    /**
     * Array association for partition ClaimMetricsByClaimMetricCategorys on array ClaimMetrics
     */
    public entity.ClaimMetric[] getClaimMetricsByClaimMetricCategorys(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ClaimMetric[])__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Array association for partition ClaimMetricsBySubtype on array ClaimMetrics
     */
    public entity.ClaimMetric getClaimMetricsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ClaimMetric)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * The external identifier of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimRpt field.
     * The calculated financials data for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimRpt getClaimRpt() {
      return (entity.ClaimRpt)__getInternalInterface().getFieldValue(CLAIMRPT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimRptArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimRpt[] getClaimRptArray() {
      return (entity.ClaimRpt[])__getInternalInterface().getFieldValue(CLAIMRPTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimRptID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMRPT_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimSource field.
     * Information about how Claim was entered into the System.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSource getClaimSource() {
      return (typekey.ClaimSource)__getInternalInterface().getFieldValue(CLAIMSOURCE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimSynchStates field.
     * The sync states related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimSynchState[] getClaimSynchStates() {
      return (entity.ClaimSynchState[])__getInternalInterface().getFieldValue(CLAIMSYNCHSTATES_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimTier field.
     * The tier of this claim, used to decide how to rate the claim metrics.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimTier getClaimTier() {
      return (typekey.ClaimTier)__getInternalInterface().getFieldValue(CLAIMTIER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimTypeCode_Ext field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFClaimTypeCode_Ext getClaimTypeCode_Ext() {
      return (typekey.ECFClaimTypeCode_Ext)__getInternalInterface().getFieldValue(CLAIMTYPECODE_EXT_PROP.get());
    }
    
    /**
     * Gets the ClaimUserModels which represent the user assignments and role assignments for this Claim.
     * Because this method creates non-persistent entities in this Claim's bundle, the Claim's bundle
     * must be writable.
     * @return 
     */
    public entity.ClaimUserModelSet getClaimUserModelSet() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimUserModelSet();
    }
    
    /**
     * Gets the value of the ClaimWorkComp field.
     * Claim's worker's compensation data
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimWorkComp getClaimWorkComp() {
      return (entity.ClaimWorkComp)__getInternalInterface().getFieldValue(CLAIMWORKCOMP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimWorkCompID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMWORKCOMP_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimantDenorm field.
     * Claimant FK denorm.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getClaimantDenorm() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMANTDENORM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimantDenormID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMANTDENORM_PROP.get());
    }
    
    /**
     * Returns all claimants on a claim as well as those on related exposures.
     * @return The claimant names
     */
    public java.lang.String[] getClaimantNames() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimantNames();
    }
    
    /**
     * Gets the value of the ClaimantRprtdDate field.
     * Workers' Comp only. Date when the claimant reported incident to insured (employer).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getClaimantRprtdDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLAIMANTRPRTDDATE_PROP.get());
    }
    
    public entity.Contact[] getClaimants() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getClaimants();
    }
    
    /**
     * Gets the value of the ClaimempdataArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claimempdata[] getClaimempdataArray() {
      return (entity.Claimempdata[])__getInternalInterface().getFieldValue(CLAIMEMPDATAARRAY_PROP.get());
    }
    
    /**
     * Returns an unsorted array of all ClaimInAssociation which:
     * <ul>
     * <li> belong to a ClaimAssociation that this Claim belongs to
     * <li> do not refer to this Claim
     * </ul>
     * Note that this method can return multiple references to a Claim if it
     * shares more than one association with this Claim.
     * @return an array of ClaimInAssociation objects that indicate all the
     * Claims associated with this Claim, across all of this Claim's Associations.
     */
    public entity.ClaimInAssociation[] getClaimsAssociatedWith() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getClaimsAssociatedWith();
    }
    
    /**
     * Gets the value of the CloseDate field.
     * Date and time when this entity was closed. (Not applicable to all assignable entities)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ClosedOutcome field.
     * The outcome reached when closing the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimClosedOutcomeType getClosedOutcome() {
      return (typekey.ClaimClosedOutcomeType)__getInternalInterface().getFieldValue(CLOSEDOUTCOME_PROP.get());
    }
    
    /**
     * Gets the value of the ConcurrentEmp field.
     * Did the employee have concurrent employment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getConcurrentEmp() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(CONCURRENTEMP_PROP.get());
    }
    
    /**
     * Gets the value of the ConcurrentEmpl field.
     * Details of concurrent employment for workers' comp claims.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ConcurrentEmployment[] getConcurrentEmpl() {
      return (entity.ConcurrentEmployment[])__getInternalInterface().getFieldValue(CONCURRENTEMPL_PROP.get());
    }
    
    /**
     * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
     * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
     * @param role 
     * @throws IllegalArgumentException if the role is not exclusive
     * @return Contact or null if none exists
     */
    public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactByRole(role);
    }
    
    /**
     * Returns the complete set of ContactRoleCategory typekeys
     * @return the compelte set of ContactRoleCategory typekeys
     */
    public typekey.ContactRoleCategory[] getContactRoleCategoryTypeKeys() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getContactRoleCategoryTypeKeys();
    }
    
    /**
     * Gets the Contact class for the given role. If the role has a specific subtype constraint, returns that subtype. IF
     * there is no constraint or there are ExceptionConstraints to the subtype constraint, returns Contact.class.
     * @param role 
     * @deprecated Use getContactTypes instead, which will return all valid contact subtypes if there are more than one.
     */
    public gw.lang.reflect.IType getContactType(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactType(role);
    }
    
    /**
     * Gets the Contact classes for the given role.  If the role has a contact subtype constraint, returns that subtype.
     * If there are ExceptionConstraints then all valid subtypes will be returned (note, this only includes the types
     * specified in the constraints -- any subtypes of those types are implicitly valid.)  Otherwise returns [Contact.class].
     * @param role 
     */
    public java.util.List<gw.entity.IEntityType> getContactTypes(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactTypes(role);
    }
    
    /**
     * Gets the value of the Contacts field.
     * The contacts involved with this claim. Including indirectly involved, like Exposures contacts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact[] getContacts() {
      return (entity.ClaimContact[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
    }
    
    /**
     * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
     * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
     * @param role 
     */
    public entity.Contact[] getContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRole(role);
    }
    
    public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRoles(role);
    }
    
    /**
     * 
     * @param role 
     */
    public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRole(role);
    }
    
    public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRoles(roles);
    }
    
    /**
     * Preloads all the Contact beans into the cache and returns the same ClaimContact
     * array as getContacts() would.
     * @return The ClaimContacts on the claim (same as getClaimContacts())
     */
    public entity.ClaimContact[] getContactsWithPreload() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getContactsWithPreload();
    }
    
    /**
     * Gets the value of the ContribFactors field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContribFactor[] getContribFactors() {
      return (entity.ContribFactor[])__getInternalInterface().getFieldValue(CONTRIBFACTORS_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     * The currency for the claim, copied from the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * This method exists to support the notion of "secondary" assignment in the Assignment Rules. "Secondary" assignments
     * generally represented by UserRoleAssignment entities, are assignments of "roles" to users, separated from the single
     * "primary" owner of the entity.
     * <p/>
     * It is generally desirable for Assignment rule writers to be able to re-use a single set of, say, Claim Assignment rules
     * for both primary and secondary assignments. This method allows rules to be written in the form of
     * <code>Claim.CurrentAssignment.assignXXX()</code> rather than <code>Claim.assignXXX()</code>. If the primary
     * assignment is being performed, then getCurrentAssignment() will return the entity itself (in this case, the Claim).
     * If a secondary assignment is being performed, then getCurrentAssignment() will return the UserRoleAssignment which
     * is current being operated upon.
     * <p/>
     * Obviously, if an entity does not support secondary assignment (i.e. does not implement the UserRoleOwner interface),
     * then rules do not need to use this method. Secondary assignments done outside of the Assignment Rules can simplay
     * call the assignXXX methods directly on the UserRoleAssignment entity themselves, and therefore also do not require
     * this method.
     * <p/>
     * Since this method is dependent on the Assignment Engine state, calling it outside of the Assignment Rules is illegal.
     * @return the CCAssignable entity being operated on by the Assignment Engine. May be either the current entity or
     *         a UserRoleAssignment entity relating to the current entity.
     */
    public entity.CCAssignable getCurrentAssignment() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getCurrentAssignment();
    }
    
    /**
     * Returns the user role assignment for the current rule execution
     */
    public entity.UserRoleAssignment getCurrentRoleAssignment() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getCurrentRoleAssignment();
    }
    
    /**
     * Gets the value of the DateCompDcsnDue field.
     * The date the compensability Decision (for entire claim) was Due.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateCompDcsnDue() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATECOMPDCSNDUE_PROP.get());
    }
    
    /**
     * Gets the value of the DateCompDcsnMade field.
     * The date the compensability Decision (for entire claim) was Made.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateCompDcsnMade() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATECOMPDCSNMADE_PROP.get());
    }
    
    /**
     * Gets the value of the DateEligibleForArchive field.
     * The date and time that this claim will become eligible for archiving. While this field is null or set to a date in the future, this claim is not selected by the archive batch process. (Note that being passed over by the archive batch process is different from being 'skipped' or 'excluded'.)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateEligibleForArchive() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEELIGIBLEFORARCHIVE_PROP.get());
    }
    
    /**
     * Gets the value of the DateFormGivenToEmp field.
     * The date the work comp form was given to an employee.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateFormGivenToEmp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEFORMGIVENTOEMP_PROP.get());
    }
    
    /**
     * Gets the value of the DateFormRetByEmp field.
     * The date the work comp form was returned by an employee.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateFormRetByEmp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEFORMRETBYEMP_PROP.get());
    }
    
    /**
     * Gets the value of the DateRptdToAgent field.
     * The date the agent was notified about the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateRptdToAgent() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOAGENT_PROP.get());
    }
    
    /**
     * Gets the value of the DateRptdToEmployer field.
     * The date the claim was reported to the employer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateRptdToEmployer() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOEMPLOYER_PROP.get());
    }
    
    /**
     * Gets the value of the DateRptdToInsured field.
     * The date the insured was notified about the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateRptdToInsured() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATERPTDTOINSURED_PROP.get());
    }
    
    /**
     * Gets the value of the DeathDate field.
     * Date of death (if injury type is death).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDeathDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DEATHDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Deductibles field.
     * Deductibles associated with this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Deductible[] getDeductibles() {
      return (entity.Deductible[])__getInternalInterface().getFieldValue(DEDUCTIBLES_PROP.get());
    }
    
    public typekey.ValidationLevel getDefaultValidationLevel() {
      return ((com.guidewire.pl.system.entity.LevelAwareValidatableBean)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.LevelAwareValidatableBean")).getDefaultValidationLevel();
    }
    
    /**
     * Gets the value of the Description field.
     * Description of the accident or loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Returns a direct inbound URL to this object; for example, an Activity might return
     * Activity.do?Activity=1
     * @return a direct inbound URL to this object
     */
    public java.lang.String getDirectURL() {
      return ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).getDirectURL();
    }
    
    /**
     * Gets the value of the Documents field.
     * The documents associated with this claim; for example, FNOL accord form or police report. Warning: do not rely on the contents of this array when the IDocumentMetadataSource plugin is enabled; use DocumentsUtil.getAllDocumentsForClaim instead.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Document[] getDocuments() {
      return (entity.Document[])__getInternalInterface().getFieldValue(DOCUMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the DrugsInvolved field.
     * Does the employer question the validity of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getDrugsInvolved() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(DRUGSINVOLVED_PROP.get());
    }
    
    /**
     * Gets the value of the DrugsPrescribed field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DrugPrescribed[] getDrugsPrescribed() {
      return (entity.DrugPrescribed[])__getInternalInterface().getFieldValue(DRUGSPRESCRIBED_PROP.get());
    }
    
    /**
     * Searches for possible duplicate claims and returns a String of the
     * claim numbers separated by commas, or null if no possible duplicates
     * were found.
     * @return A comma delimited list of claimnumbers for the claims that matched
     *         the duplicate claim search, or null if no claims matched.
     */
    public java.lang.String getDuplicateClaimNumbers() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getDuplicateClaimNumbers();
    }
    
    /**
     * Gets the value of the ECFLastUpdateTime field.
     * The last time this Claim was updated from the ECF servers by either a Claim Notify or Claim Retrieve
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getECFLastUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ECFLASTUPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the EEventTime_Ext field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEEventTime_Ext() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EEVENTTIME_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the EmpQusValidity field.
     * Does the employer question the validity of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getEmpQusValidity() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(EMPQUSVALIDITY_PROP.get());
    }
    
    /**
     * Gets the value of the EmpSentMPNNotice field.
     * Date that the Employer sent out the MPN Notification.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEmpSentMPNNotice() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EMPSENTMPNNOTICE_PROP.get());
    }
    
    /**
     * Gets the value of the EmployerValidityReason field.
     * The reason the employer questions the validity of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmployerValidityReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMPLOYERVALIDITYREASON_PROP.get());
    }
    
    /**
     * Gets the value of the EmploymentData field.
     * Workers' Comp only. Details about the claimant's employment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.EmploymentData getEmploymentData() {
      return (entity.EmploymentData)__getInternalInterface().getFieldValue(EMPLOYMENTDATA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getEmploymentDataID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EMPLOYMENTDATA_PROP.get());
    }
    
    /**
     * Gets the value of the Evaluations field.
     * The original cost estimate followed by any modifications to that estimate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Evaluation[] getEvaluations() {
      return (entity.Evaluation[])__getInternalInterface().getFieldValue(EVALUATIONS_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the ExaminationDate field.
     * Date of the Examination.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExaminationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXAMINATIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureBegan field.
     * Workers' Comp only. Date when the exposure began.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExposureBegan() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXPOSUREBEGAN_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureEnded field.
     * Workers' Comp only. Date when the exposure ended.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getExposureEnded() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EXPOSUREENDED_PROP.get());
    }
    
    /**
     * Gets the value of the Exposures field.
     * The exposures related to this claim. Note: if triggersValidation is false, exposure metrics will not be run automatically.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure[] getExposures() {
      return (entity.Exposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
    }
    
    /**
     * This method returns the set of Exposures corresponding to
     * a particular Claimant on a particular Claim.
     * <p/>
     * For example, if Joe Smith is a claimant on claim CP-2038,
     * and he is the claimant for two exposures, then this method
     * will return a List containing two Exposure beans--the two
     * Exposures for which he is the claimant.
     * @param claimant The claimant for which exposures should be retreieved.
     * @return a List of Exposures for this claimant, ordered by claim order.
     */
    public java.util.List<entity.Exposure> getExposuresForClaimant(entity.Contact claimant) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getExposuresForClaimant(claimant);
    }
    
    public java.util.List<entity.Exposure> getExposuresForClaimantDenorm(entity.Contact claimant) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getExposuresForClaimantDenorm(claimant);
    }
    
    /**
     * Gets the value of the Fault field.
     * Insured's probable percentage of fault.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFault() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
    }
    
    /**
     * Gets the value of the FaultRating field.
     * Indicates in the insured is at fault.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FaultRating getFaultRating() {
      return (typekey.FaultRating)__getInternalInterface().getFieldValue(FAULTRATING_PROP.get());
    }
    
    /**
     * Gets the value of the FireDeptInfo field.
     * Reports, incident number, and other information from the fire department.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFireDeptInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIREDEPTINFO_PROP.get());
    }
    
    /**
     * Gets the value of the Flagged field.
     * This claim's status as a flagged claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FlaggedType getFlagged() {
      return (typekey.FlaggedType)__getInternalInterface().getFieldValue(FLAGGED_PROP.get());
    }
    
    /**
     * Gets the value of the FlaggedDate field.
     * The date and time the claim was initially flagged.  When the flag is unset, this date is set to null and will be set to a new date if a new reason for flagging the claim is found later.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFlaggedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FLAGGEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the FlaggedReason field.
     * The reason this claim is flagged.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFlaggedReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FLAGGEDREASON_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getGroupAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getGroupAssignmentStateHelpers();
    }
    
    /**
     * Gets the value of the History field.
     * The history events related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.History[] getHistory() {
      return (entity.History[])__getInternalInterface().getFieldValue(HISTORY_PROP.get());
    }
    
    /**
     * Preferred method of getting history for a given claim.  This resolves to a search on the database, based
     * on the claim and history type filter.  If the history type is null, all events are returned.  It's
     * assumed that if the filter selected in the UI is "none" then this method shouldn't even be called.
     * @param eventType The history event type
     * @return The query result
     */
    public gw.api.database.IQueryBeanResult<entity.History> getHistoryRecordsForHistoryType(typekey.HistoryType eventType) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getHistoryRecordsForHistoryType(eventType);
    }
    
    /**
     * Preferred method of getting history for a given claim.  This resolves to a search on the database, based
     * on the claim and history type filter.  If the history type is null, all events are returned.  It's
     * assumed that if the filter selected in the UI is "none" then this method shouldn't even be called.
     * 
     * This variation allows querying for specific history events within a given date/time range. Passing along null
     * any of the fields omits that query criteria.  Omitting either the start or end date parameter omits the
     * entire date interval filter.
     * @param eventType type of history event filter
     * @param owner Owner of history event filter.
     * @param beginDate start-of-date range interval to narrow filtering
     * @param endDate end-of-date range  to narror filtering
     * @return The query result
     */
    public gw.api.database.IQueryBeanResult<entity.History> getHistoryRecordsForHistoryType(typekey.HistoryType eventType, entity.User owner, java.util.Date beginDate, java.util.Date endDate) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getHistoryRecordsForHistoryType(eventType, owner, beginDate, endDate);
    }
    
    /**
     * Gets the value of the HospitalDate field.
     * Date admitted to the hospital.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getHospitalDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(HOSPITALDATE_PROP.get());
    }
    
    /**
     * Gets the value of the HospitalDays field.
     * Estimated Days in hospital.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getHospitalDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(HOSPITALDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the HowReported field.
     * How the claim was reported.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.HowReportedType getHowReported() {
      return (typekey.HowReportedType)__getInternalInterface().getFieldValue(HOWREPORTED_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    /**
     * The claim associated with this Claim/Exposure. For a Claim, just returns itself, for an
     * exposure, returns the exposure's Claim.
     * @return the Claim
     */
    public entity.Claim getISOClaim() {
      return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOClaim();
    }
    
    /**
     * Error message if most recent ISO ClaimSearch request failed. Otherwise <code>null</code>.
     * @return the error message, or null
     */
    public java.lang.String getISOErrorMessage() {
      return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOErrorMessage();
    }
    
    /**
     * If this is an exposure, returns itself, otherwise returns null
     * @return the Exposure, or null
     */
    public entity.Exposure getISOExposure() {
      return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOExposure();
    }
    
    /**
     * Returns an array of the match reports associated with this Claim/Exposure, in random order
     * @return a non null array of match reports
     */
    public entity.ISOMatchReport[] getISOMatchReports() {
      return ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).getISOMatchReports();
    }
    
    /**
     * Gets the value of the ISOReceiveDate field.
     * The last time a response was received from ISO for this object. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getISOReceiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ISORECEIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ISOSendDate field.
     * The last time a search request was sent to ISO. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getISOSendDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ISOSENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ISOStatus field.
     * Status of exposure with ISO - for example checked, not of interest.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ISOStatus getISOStatus() {
      return (typekey.ISOStatus)__getInternalInterface().getFieldValue(ISOSTATUS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the Incidents field.
     * Descriptions of incidents related to this claim. Note: In Gosu, it's preferred to use Claim.VehicleIncidentsOnly and similar properties for each Incident subtype. See the Application Guide.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Incident[] getIncidents() {
      return (entity.Incident[])__getInternalInterface().getFieldValue(INCIDENTS_PROP.get());
    }
    
    /**
     * Get all incidents of the given type on this claim
     * @param type incident type, must not be null and must be incident or a subtype of incident
     * @throws IllegalArgumentException if type is null or not an incident type
     * @return incidents on this claim which are instances of the given type, or an empty array if there are no such
     *          incidents. Only incidents of this exact type are returned, not any incidents which are subtypes of type. The
     *          type of the returned array is type[] - for example if type is VehicleIncident the array will be a VehicleIncident
     *          array, not just an Incident array
     */
    public entity.Incident[] getIncidentsOfType(gw.entity.IEntityType type) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getIncidentsOfType(type);
    }
    
    /**
     * Gets the value of the InjWkrInMPN field.
     * Date that the injured Worker moved to MPN.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getInjWkrInMPN() {
      return (java.util.Date)__getInternalInterface().getFieldValue(INJWKRINMPN_PROP.get());
    }
    
    /**
     * Gets the insured for the Claim. This is just a shortcut for Claim.Policy.Insured.
     * @return The insured contact
     */
    public entity.Contact getInsured() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getInsured();
    }
    
    /**
     * Gets the value of the InsuredDenorm field.
     * Insured FK denorm.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getInsuredDenorm() {
      return (entity.Contact)__getInternalInterface().getFieldValue(INSUREDDENORM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInsuredDenormID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INSUREDDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerSentMPNNotice field.
     * Date that Insurer sent out the MPN Notification.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getInsurerSentMPNNotice() {
      return (java.util.Date)__getInternalInterface().getFieldValue(INSURERSENTMPNNOTICE_PROP.get());
    }
    
    /**
     * Gets the value of the JurisdictionState field.
     * The state of jurisdiction. This indicates jurisdiction that covers the loss, which may differ from the state in which the loss occurred. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getJurisdictionState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the LMMessages field.
     * Full list of LMMessage_Ext entities related to this Claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LMMessage_Ext[] getLMMessages() {
      return (entity.LMMessage_Ext[])__getInternalInterface().getFieldValue(LMMESSAGES_PROP.get());
    }
    
    /**
     * Gets the value of the LOBCode field.
     * Line of Business code; typically related to the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LOBCode getLOBCode() {
      return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
    }
    
    /**
     * Gets the value of the LargeLossNotificationStatus field.
     * The status of large loss notices.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LargeLossNotificationStatus getLargeLossNotificationStatus() {
      return (typekey.LargeLossNotificationStatus)__getInternalInterface().getFieldValue(LARGELOSSNOTIFICATIONSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the LitigationStatus field.
     * The status of the litigation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LitigationStatus getLitigationStatus() {
      return (typekey.LitigationStatus)__getInternalInterface().getFieldValue(LITIGATIONSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the LocationCode field.
     * Workers' Comp only. Location at the employer's facilities where the accident occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyLocation getLocationCode() {
      return (entity.PolicyLocation)__getInternalInterface().getFieldValue(LOCATIONCODE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLocationCodeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOCATIONCODE_PROP.get());
    }
    
    /**
     * Gets the value of the LocationOfTheft field.
     * the Location where the property was stolen.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LocationOfTheft getLocationOfTheft() {
      return (typekey.LocationOfTheft)__getInternalInterface().getFieldValue(LOCATIONOFTHEFT_PROP.get());
    }
    
    /**
     * Gets the value of the LockingColumn field.
     * Meaningless column for locking
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLockingColumn() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
    }
    
    /**
     * Gets the value of the LossCause field.
     * General cause of loss; dependent on loss type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossCause getLossCause() {
      return (typekey.LossCause)__getInternalInterface().getFieldValue(LOSSCAUSE_PROP.get());
    }
    
    /**
     * Gets the value of the LossDate field.
     * The date on which the loss occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
    }
    
    /**
     * Gets the value of the LossEndDate_Ext field.
     * End date of period during which a loss occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossEndDate_Ext() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSENDDATE_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocation field.
     * Location of the loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getLossLocation() {
      return (entity.Address)__getInternalInterface().getFieldValue(LOSSLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocationCode field.
     * Location Code for the Loss Location.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossLocationCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLossLocationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOSSLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocationSpatialDenorm field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.database.spatial.SpatialPoint getLossLocationSpatialDenorm() {
      return (gw.api.database.spatial.SpatialPoint)__getInternalInterface().getFieldValue(LOSSLOCATIONSPATIALDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the LossType field.
     * High level claim type (for example, Auto or Property).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MMIdate field.
     * Date Maximum Medical Improvement was reached.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMMIdate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MMIDATE_PROP.get());
    }
    
    /**
     * Description of Max Medical Improvement for Workers Comp Claim.
     * @return the description of the maximum medical improvement
     */
    public java.lang.String getMMInote() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMMInote();
    }
    
    /**
     * Gets the value of the MainContactType field.
     * Relationship of the main contact to the insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PersonRelationType getMainContactType() {
      return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(MAINCONTACTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ManifestationDate field.
     * The manifestation date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getManifestationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MANIFESTATIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Matters field.
     * The legal matters related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Matter[] getMatters() {
      return (entity.Matter[])__getInternalInterface().getFieldValue(MATTERS_PROP.get());
    }
    
    /**
     * Gets the higest value of claim order for the claim
     * @return An int containing the value
     */
    public int getMaxClaimOrder() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMaxClaimOrder();
    }
    
    /**
     * Gets the value of the MedicalContactStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MedicalContactStatus[] getMedicalContactStatus() {
      return (entity.MedicalContactStatus[])__getInternalInterface().getFieldValue(MEDICALCONTACTSTATUS_PROP.get());
    }
    
    /**
     * Description of Medical Diagnosis for Workers Comp Claim.
     * @return The medical diagnosis
     */
    public java.lang.String getMedicalDiagnosis() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getMedicalDiagnosis();
    }
    
    /**
     * Gets the value of the MedicalTreatments field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MedicalTreatment[] getMedicalTreatments() {
      return (entity.MedicalTreatment[])__getInternalInterface().getFieldValue(MEDICALTREATMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the MetroReports field.
     * Details of reports associated with claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MetroReport[] getMetroReports() {
      return (entity.MetroReport[])__getInternalInterface().getFieldValue(METROREPORTS_PROP.get());
    }
    
    /**
     * Gets the value of the Negotiations field.
     * The negotiations related to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Negotiation[] getNegotiations() {
      return (entity.Negotiation[])__getInternalInterface().getFieldValue(NEGOTIATIONS_PROP.get());
    }
    
    /**
     * Get the exposure type that will be used for a new exposure with the given
     * coverage sub type. Is used by {@link #newExposure(typekey.CoverageType, typekey.CoverageSubtype, boolean)}
     * @param coverageSubType exposure coverage sub type
     * @return the exposure type corresponding to the given coverage sub type
     */
    public typekey.ExposureType getNewExposureType(typekey.CoverageSubtype coverageSubType) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNewExposureType(coverageSubType);
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Finds notes that are not confidential.
     * @return The query result
     */
    public gw.api.database.IQueryBeanResult<entity.Note> getNonconfidentialNotes() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNonconfidentialNotes();
    }
    
    /**
     * Gets the value of the Notes field.
     * The notes particular to this claim. Notes can also be associated with a particular exposure.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Note[] getNotes() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNotes();
    }
    
    public int getNumPayments() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getNumPayments();
    }
    
    /**
     * Retrieves the number of financial transactions, of all subtypes, associated with
     * this claim regardless of status.  This method should always be preferred over
     * getTransactions().length, as it does not actually retrieve the transactions in
     * full in order to count them.
     * @return the number of financial transactions associated with this claim as an int.
     */
    public int getNumTransactions() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getNumTransactions();
    }
    
    /**
     * Description of Objective Findings for Workers Comp Claim.
     * @return The objective findings
     */
    public java.lang.String getObjFindings() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getObjFindings();
    }
    
    /**
     * Gets the value of the Officials field.
     * Details of officials associated with claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Official[] getOfficials() {
      return (entity.Official[])__getInternalInterface().getFieldValue(OFFICIALS_PROP.get());
    }
    
    public java.util.List<entity.Exposure> getOpenExposures() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOpenExposures();
    }
    
    /**
     * Like getAnswerDelegate, but creates the Answer if it is not defined already
     * @param question 
     */
    public entity.AnswerDelegate getOrCreateAnswer(entity.Question question) {
      return ((gw.api.question.AnswerContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerContainer")).getOrCreateAnswer(question);
    }
    
    public entity.ClaimRpt getOrCreateClaimRpt(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOrCreateClaimRpt(bundle);
    }
    
    public entity.RICoding getOrCreateRICoding(entity.RIAgreement riAgreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOrCreateRICoding(riAgreement, exposure, costType, costCategory);
    }
    
    public entity.RICoding getOrCreateRICoding(entity.RIAgreement riAgreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOrCreateRICoding(riAgreement, exposure, costType, costCategory, reservingCurrency);
    }
    
    public entity.RecoveryCoding getOrCreateRecoveryCoding(entity.ReserveLine reserveLine, typekey.RecoveryCategory recoveryCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOrCreateRecoveryCoding(reserveLine, recoveryCategory);
    }
    
    public entity.ReserveLine getOrCreateReserveLine(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency, boolean createNewIfNoMatchingFound) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOrCreateReserveLine(exposure, costType, costCategory, reservingCurrency, createNewIfNoMatchingFound);
    }
    
    /**
     * Gets the user role assignment for that role
     * If there's no assignment for that role, creates a new one.
     * If there is more than one assignment for that role, then the first role will be returned no matter
     * whether the role is exclusive or not.
     * @param role The role for the assignment
     * @return the existing user role assignment if found, or a new one if not found
     */
    public entity.UserRoleAssignment getOrCreateUserRoleAssignmentByRole(typekey.UserRole role) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getOrCreateUserRoleAssignmentByRole(role);
    }
    
    /**
     * 
     * @return A claim's exposures ordered by the exposure's CaseOrder field
     */
    public entity.Exposure[] getOrderedExposures() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getOrderedExposures();
    }
    
    public entity.Policy getOriginalPolicy() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getOriginalPolicy();
    }
    
    /**
     * Gets the value of the OtherBenefits field.
     * Details of other benefits for workers comp claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.OtherBenefit[] getOtherBenefits() {
      return (entity.OtherBenefit[])__getInternalInterface().getFieldValue(OTHERBENEFITS_PROP.get());
    }
    
    public entity.OtherInstruction[] getOtherInstructions() {
      return ((gw.api.specialhandling.ClaimSpecialHandlingMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.ClaimSpecialHandlingMethods")).getOtherInstructions();
    }
    
    /**
     * Gets the value of the OtherRecovStatus field.
     * The Other Recoverable status for a claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.OtherRecoverableStatus getOtherRecovStatus() {
      return (typekey.OtherRecoverableStatus)__getInternalInterface().getFieldValue(OTHERRECOVSTATUS_PROP.get());
    }
    
    /**
     * Called by the "assignToClaimOwner" method to determine which assignable "owns" the current assignable
     * so the owners assignment information can be copied. The owner is nearly always just the claim though
     * there is a special case - if an activity belongs to an exposure then the exposure is the owner. If
     * this method return null the assignToClaimOwner call will return false.
     * @return the owning assignable, usually the claim
     */
    public entity.Assignable getOwningAssignable() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningAssignable();
    }
    
    /**
     * The claim that owns this assignable. If this property returns null then this assignable cannot be
     * manually assigned (because no assignment review activity can be created), cannot be assigned using
     * the "assignToClaimOwner" method and will not create history events when assigned.
     * @return the claim
     */
    public entity.Claim getOwningClaim() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).getOwningClaim();
    }
    
    /**
     * Returns the list of possible payees on the claim.  This includes all of
     * the contacts returned by #getRelatedContacts(), plus any lienholders on
     * the associated vehicles or properties.  Lienholders are added to the end
     * of the list
     * @return List of possible payees
     */
    public java.util.List<entity.Contact> getPayeeCandidates() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPayeeCandidates();
    }
    
    /**
     * Constructs an Iterator to provide access to the Payments for this claim.  Either all the Payments
     * or only the new and modified Payments can be chosen for retrieval.  If all the Payments are chosen
     * for retrieval, then those Payments that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
     * and iterating through all the transactions to find just the desired Payments.
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified Payments for this claim will
     *                           be returned.  This includes payments for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all Payments for the claim will be returned, including new and modified
     *                           Payments, but excluding deleted Payments.
     * @return an Iterator that returns Payments
     */
    public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPaymentsIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the payments for this claim.
     * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no payment view permission.
     * The payments will be returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all Payments for this claim.  The returned
     *         rows are actually {@link entity.PaymentView} entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.PaymentView> getPaymentsQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPaymentsQuery();
    }
    
    /**
     * Gets the value of the PermissionRequired field.
     * If non-null, this is an additional permission that users are required to have to view or work on this claim. This field is used to restrict access to sensitive or private claims; for example, those involving an employee or that are under litigation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSecurityType getPermissionRequired() {
      return (typekey.ClaimSecurityType)__getInternalInterface().getFieldValue(PERMISSIONREQUIRED_PROP.get());
    }
    
    /**
     * Gets the value of the PoliceDeptInfo field.
     * Reports, incident number, and other information from the police deptartment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPoliceDeptInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICEDEPTINFO_PROP.get());
    }
    
    /**
     * Gets the value of the Policy field.
     * The policy associated with this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Policy getPolicy() {
      return (entity.Policy)__getInternalInterface().getFieldValue(POLICY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICY_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyLocationSummaryJoin field.
     * Link to get the associated policy location summary (from policy system for catastrophe).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyLocationSummaryJoin getPolicyLocationSummaryJoin() {
      return (entity.PolicyLocationSummaryJoin)__getInternalInterface().getFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyLocationSummaryJoinArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyLocationSummaryJoin[] getPolicyLocationSummaryJoinArray() {
      return (entity.PolicyLocationSummaryJoin[])__getInternalInterface().getFieldValue(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyLocationSummaryJoinID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get());
    }
    
    /**
     * 
     * @return An array of Properties associated with the claim's policy. Unlike
     *         {@link #getProperties()} this array does not include the claim's property or the
     *         properties of any of the claim's exposures.
     */
    public entity.PolicyLocation[] getPolicyProperties() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPolicyProperties();
    }
    
    /**
     * Description of Preexisting Disability Info for Workers Comp Claim.
     * @return The preexisting disability info
     */
    public java.lang.String getPreexDisbltyInfo() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getPreexDisbltyInfo();
    }
    
    public gw.internal.ext.org.apache.commons.collections.BidiMap getPreviousAssignments() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getPreviousAssignments();
    }
    
    /**
     * Gets the value of the PreviousGroup field.
     * Group to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getPreviousGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousQueue field.
     * Queue to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableQueue getPreviousQueue() {
      return (entity.AssignableQueue)__getInternalInterface().getFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousQueueID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the PreviousUser field.
     * User to which this entity was previously assigned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getPreviousUser() {
      return (entity.User)__getInternalInterface().getFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPreviousUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PREVIOUSUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Progress field.
     * Description of the progress of an open claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimProgressType getProgress() {
      return (typekey.ClaimProgressType)__getInternalInterface().getFieldValue(PROGRESS_PROP.get());
    }
    
    /**
     * 
     * @return An array of Properties associated with the claim, its exposures, and its policy.
     */
    public entity.PolicyLocation[] getProperties() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getProperties();
    }
    
    /**
     * Gets the value of the PropertyFireDamage field.
     * Details of fire damage to property
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PropertyFireDamage getPropertyFireDamage() {
      return (entity.PropertyFireDamage)__getInternalInterface().getFieldValue(PROPERTYFIREDAMAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PropertyFireDamageArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PropertyFireDamage[] getPropertyFireDamageArray() {
      return (entity.PropertyFireDamage[])__getInternalInterface().getFieldValue(PROPERTYFIREDAMAGEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPropertyFireDamageID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PROPERTYFIREDAMAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PropertyWaterDamage field.
     * Details of water damage to property
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PropertyWaterDamage getPropertyWaterDamage() {
      return (entity.PropertyWaterDamage)__getInternalInterface().getFieldValue(PROPERTYWATERDAMAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PropertyWaterDamageArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PropertyWaterDamage[] getPropertyWaterDamageArray() {
      return (entity.PropertyWaterDamage[])__getInternalInterface().getFieldValue(PROPERTYWATERDAMAGEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPropertyWaterDamageID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PROPERTYWATERDAMAGE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the PurgeDate field.
     * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPurgeDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(PURGEDATE_PROP.get());
    }
    
    public entity.QuestionSet[] getQuestionSets(entity.QuestionSet[] questionSets) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestionSets(questionSets);
    }
    
    /**
     * This function is a callback hook in case you need to filter the Questions in a
     * question set in a funky way.
     * @param questionSet 
     */
    public entity.Question[] getQuestions(entity.QuestionSet questionSet) {
      return ((gw.api.question.AnswerSetContainer)__getDelegateManager().getImplementation("gw.api.question.AnswerSetContainer")).getQuestions(questionSet);
    }
    
    /**
     * Gets the value of the RIAgreementGroups field.
     * The reinsurance agreement groups for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RIAgreementGroup[] getRIAgreementGroups() {
      return (entity.RIAgreementGroup[])__getInternalInterface().getFieldValue(RIAGREEMENTGROUPS_PROP.get());
    }
    
    /**
     * Gets the value of the RICodings field.
     * RICodings relating to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RICoding[] getRICodings() {
      return (entity.RICoding[])__getInternalInterface().getFieldValue(RICODINGS_PROP.get());
    }
    
    /**
     * Gets the value of the ReOpenDate field.
     * Date claim was reopened.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReOpenDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REOPENDATE_PROP.get());
    }
    
    /**
     * Constructs an Iterator to provide access to the Recoveries for this claim.  Either all the Recoveries
     * or only the new and modified Recoveries can be chosen for retrieval.  If all the Recoveries are chosen
     * for retrieval, then those Recoveries that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
     * and iterating through all the transactions to find just the desired Recoveries.
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified Recoveries for this claim will
     *                           be returned.  This includes recoveries for which only the line items have been modified.  Otherwise, if
     *                           <code>false</code> then all Recoveries for the claim will be returned, including new and modified
     *                           Recoveries, but excluding deleted Recoveries.
     * @return an Iterator that returns Recoveries
     */
    public java.util.Iterator<entity.Recovery> getRecoveriesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveriesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the recoveries for this claim.
     * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no recovery view permission.
     * The recoveries will be returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all Recoveries for this claim.  The returned
     *         rows are actually {@link entity.RecoveryView} entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.RecoveryView> getRecoveriesQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveriesQuery();
    }
    
    /**
     * Returns a list of RecoveryCodings for this Claim; that is, those RecoveryCodings whose ReserveLines are coded
     * to this Claim.
     * @return list of ReocveryCodings associated with this Claim
     */
    public java.util.List<entity.RecoveryCoding> getRecoveryCodings() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryCodings();
    }
    
    /**
     * Constructs an Iterator to provide access to the RecoveryReserves for this claim.  Either all the RecoveryReserves
     * or only the new and modified RecoveryReserves can be chosen for retrieval.  If all the RecoveryReserves are chosen
     * for retrieval, then those RecoveryReserves that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
     * and iterating through all the transactions to find just the desired RecoveryReserves.
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified RecoveryReserves for this claim will
     *                           be returned.  This includes recovery reserves for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all RecoveryReserves for the claim will be returned, including new and modified
     *                           RecoveryReserves, but excluding deleted RecoveryReserves.
     * @return an Iterator that returns Recoveries
     */
    public java.util.Iterator<entity.RecoveryReserve> getRecoveryReservesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryReservesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the recoveryreserves for this claim.
     * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no recoveryreserve
     * view permission. The recoveryreserves will be returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all RecoveryReserves for this claim.  The returned
     *         rows are actually {@link entity.RecoveryReserveView} entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.RecoveryReserveView> getRecoveryReservesQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRecoveryReservesQuery();
    }
    
    /**
     * Gets the value of the ReinsuranceFlaggedStatus field.
     * The reinsurance flagged status for a claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReinsuranceFlaggedStatus getReinsuranceFlaggedStatus() {
      return (typekey.ReinsuranceFlaggedStatus)__getInternalInterface().getFieldValue(REINSURANCEFLAGGEDSTATUS_PROP.get());
    }
    
    /**
     * Description of reason for marking or unmarking a claim for reinsurance.
     * @return The reinsurance reason
     */
    public java.lang.String getReinsuranceReason() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReinsuranceReason();
    }
    
    /**
     * Returns the list of Contact objects related to a claim.  This includes
     * the insured, main contact, reported by person, the driver (if applicable),
     * and all other people associated with the claim.  It also includes
     * people covered by the associated policy.  Duplicates are eliminated,
     * and contacts are sorted alphabetically by display name.  Used to populate
     * pickers for selecting a person who might be relevant to the claim.
     * @return array of contacts associated with the claim
     */
    public entity.Contact[] getRelatedContacts() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts();
    }
    
    /**
     * Returns the list of Contact objects of a given type that are related to a claim.
     * Used to populate pickers for selecting a person who might be relevant to the claim.
     * @param subtype The subtype
     * @return array of contacts associated with the claim. The component type of the array
     *         is that of the given subtype. For example, for the subtype representing "Person" the
     *         return value will be of type Person[].
     */
    public entity.Contact[] getRelatedContacts(gw.lang.reflect.IType subtype) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts(subtype);
    }
    
    public entity.Contact[] getRelatedContacts(java.lang.Iterable<? extends gw.lang.reflect.IType> subtypes) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedContacts(subtypes);
    }
    
    /**
     * Returns the list of contact objects for the users related to the claim: all users that are assigned to
     * either the claim, its exposures, or any of its activities.  Returns an
     * empty array if the claim is new, since new claims and their
     * activities/exposures haven't been assigned yet.
     */
    public entity.Contact[] getRelatedUserContacts() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUserContacts();
    }
    
    /**
     * Returns a map of users and groups related to the claim: all users that are assigned to
     * either the claim, its exposures, or any of its activities.  Returns an
     * empty hashmap if the claim is new, since new claims and their
     * activities/exposures haven't been assigned yet.
     * <p/>
     * The specified User is excluded from the set of returned User objects.
     * @param excludedUser The user to exclude.
     * @return a HashMap that maps assigned user to assigned group; for example,
     *         if the entry is for the exposure assigned user, the assigned user will map
     *         to the assigned group for that exposure.
     */
    public java.util.Map<entity.User, entity.Group> getRelatedUserGroupMap(entity.User excludedUser) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUserGroupMap(excludedUser);
    }
    
    /**
     * Returns the list of users related to the claim: all users that are assigned to
     * either the claim, its exposures, or any of its activities.  Returns an
     * empty array if the claim is new, since new claims and their
     * activities/exposures haven't been assigned yet.
     */
    public entity.User[] getRelatedUsers() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRelatedUsers();
    }
    
    /**
     * Gets the value of the ReopenedReason field.
     * The reason for reopening the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimReopenedReason getReopenedReason() {
      return (typekey.ClaimReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
    }
    
    /**
     * Gets the value of the ReportedByType field.
     * Relationship of the person who reported the claim to the insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PersonRelationType getReportedByType() {
      return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(REPORTEDBYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ReportedDate field.
     * Date on which the loss was reported.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReportedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REPORTEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ReserveLines field.
     * ReserveLines relating to this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReserveLine[] getReserveLines() {
      return (entity.ReserveLine[])__getInternalInterface().getFieldValue(RESERVELINES_PROP.get());
    }
    
    /**
     * Constructs an Iterator to provide access to the Reserves for this claim.  Either all the Reserves
     * or only the new and modified Reserves can be chosen for retrieval.  If all the Reserves are chosen
     * for retrieval, then those Reserves that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a much more efficient alternative to calling {@link entity.Claim#getTransactions()}
     * and iterating through all the transactions to find just the desired Reserves.
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified Reserves for this claim will
     *                           be returned.  This includes reserves for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all Reserves for the claim will be returned, including new and modified
     *                           Reserves, but excluding deleted Reserves.
     * @return an Iterator that returns Reserves
     */
    public java.util.Iterator<entity.Reserve> getReservesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReservesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the reserves for this claim.
     * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no reserve view permission.
     * The reserves will be returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all Reserves for this claim.  The returned
     *         rows are actually {@link entity.ReserveView} entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.ReserveView> getReservesQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getReservesQuery();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RoleAssignments field.
     * The user role assignments for this claim.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserRoleAssignment[] getRoleAssignments() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRoleAssignments();
    }
    
    /**
     * Gets owners of roles on the Claim. This includes the claim, plus any owners associated with the claim (e.g., its
     * exposures, matters, etc.).
     * @return The owners of roles on the claim
     */
    public entity.ClaimContactRoleOwner[] getRoleOwners() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getRoleOwners();
    }
    
    /**
     * Gets the value of the SIAnswerSet field.
     * Link to Answer set for SIU
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SIUAnswerSet[] getSIAnswerSet() {
      return (entity.SIUAnswerSet[])__getInternalInterface().getFieldValue(SIANSWERSET_PROP.get());
    }
    
    /**
     * Gets the value of the SIEscalateSIU field.
     * Escalate to SIU team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getSIEscalateSIU() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(SIESCALATESIU_PROP.get());
    }
    
    /**
     * Storage SIU Escalation note for the Claim.
     * @return The SIU Escalation note
     */
    public java.lang.String getSIEscalateSIUNote() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getSIEscalateSIUNote();
    }
    
    /**
     * Gets the value of the SIEscalateSIUdate field.
     * Date escalated to SIU team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSIEscalateSIUdate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SIESCALATESIUDATE_PROP.get());
    }
    
    /**
     * Gets the value of the SIScore field.
     * Special Investigations Score.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSIScore() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SISCORE_PROP.get());
    }
    
    /**
     * Gets the value of the SITriggers field.
     * The triggers for Special Investigations linked to this Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SITrigger[] getSITriggers() {
      return (entity.SITrigger[])__getInternalInterface().getFieldValue(SITRIGGERS_PROP.get());
    }
    
    /**
     * Gets the value of the SIULifeCycleState field.
     * Current state of SIU trigger rule processing for this Claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimLifeCycleState getSIULifeCycleState() {
      return (typekey.ClaimLifeCycleState)__getInternalInterface().getFieldValue(SIULIFECYCLESTATE_PROP.get());
    }
    
    /**
     * Gets the value of the SIUStatus field.
     * The SIU status for a claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SIUStatus getSIUStatus() {
      return (typekey.SIUStatus)__getInternalInterface().getFieldValue(SIUSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageStatus field.
     * The salvage status for a claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SalvageStatus getSalvageStatus() {
      return (typekey.SalvageStatus)__getInternalInterface().getFieldValue(SALVAGESTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Segment field.
     * Segmentation type of the claim. Both the claim and the exposure may be segmented.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSegment getSegment() {
      return (typekey.ClaimSegment)__getInternalInterface().getFieldValue(SEGMENT_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequests field.
     * Service requests associated with this claim. Note: if triggersValidation is false, service request metrics will not be run automatically.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest[] getServiceRequests() {
      return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
    }
    
    /**
     * Gets the value of the ShowMedicalFirstInfo field.
     * Show Medical First info section.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getShowMedicalFirstInfo() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(SHOWMEDICALFIRSTINFO_PROP.get());
    }
    
    /**
     * Gets the value of the SpecialHandlingFinancialState field.
     * Tracks previously calculated financial values used by AutomatedHandlerTriggers that trigger on financial thresholds
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SpecialHandlingFinancialState getSpecialHandlingFinancialState() {
      return (entity.SpecialHandlingFinancialState)__getInternalInterface().getFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the SpecialHandlingFinancialStateArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SpecialHandlingFinancialState[] getSpecialHandlingFinancialStateArray() {
      return (entity.SpecialHandlingFinancialState[])__getInternalInterface().getFieldValue(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSpecialHandlingFinancialStateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     * Internal state of the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimState getState() {
      return (typekey.ClaimState)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the StateAckNumber field.
     * Acknowledgment number of the state file for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStateAckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATEACKNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the StateFileNumber field.
     * Number of the state file for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStateFileNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATEFILENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the StatuteDate field.
     * Date at which the statute of limitations expires for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStatuteDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STATUTEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the StorageBarCodeNum field.
     * Storage Bar Code Number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStorageBarCodeNum() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEBARCODENUM_PROP.get());
    }
    
    /**
     * Gets the value of the StorageBoxNum field.
     * Storage Box Number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStorageBoxNum() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEBOXNUM_PROP.get());
    }
    
    /**
     * Gets the value of the StorageCategory field.
     * Storage Category.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.StorageCategory getStorageCategory() {
      return (typekey.StorageCategory)__getInternalInterface().getFieldValue(STORAGECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the StorageDate field.
     * Date file shipped to storage facility.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStorageDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STORAGEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the StorageLocationState field.
     * Storage Location State.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getStorageLocationState() {
      return (typekey.State)__getInternalInterface().getFieldValue(STORAGELOCATIONSTATE_PROP.get());
    }
    
    /**
     * Storage Notes for Claim.
     * @return The storage notes
     */
    public java.lang.String getStorageNotes() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getStorageNotes();
    }
    
    /**
     * Gets the value of the StorageType field.
     * Storage Type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.StorageType getStorageType() {
      return (typekey.StorageType)__getInternalInterface().getFieldValue(STORAGETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the StorageVolumes field.
     * Storage Volumes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStorageVolumes() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEVOLUMES_PROP.get());
    }
    
    /**
     * Gets the value of the Strategy field.
     * Segmentation type of the claim. Both the claim and the exposure may be segmented.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimStrategy getStrategy() {
      return (typekey.ClaimStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
    }
    
    /**
     * Description of Subjective Complaints for Workers Comp Claim.
     * @return the subjective complaints
     */
    public java.lang.String getSubjComplaints() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getSubjComplaints();
    }
    
    /**
     * Gets the value of the SubrogationSummary field.
     * Claim's subrogation-related data
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SubrogationSummary getSubrogationSummary() {
      return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationSummaryArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SubrogationSummary[] getSubrogationSummaryArray() {
      return (entity.SubrogationSummary[])__getInternalInterface().getFieldValue(SUBROGATIONSUMMARYARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubrogationSummaryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBROGATIONSUMMARY_PROP.get());
    }
    
    /**
     * Returns the suggested assignees for this entity, to be displayed in the
     * UI as the most likely assignees when the user is assigning the entity. The list of assignees
     * will depend on the type of entity, and will contain users who are somehow "involved" with the entity,
     * associated claim, or currently assigned user and group.
     * @return the list of suggested assignees, never null or empty
     */
    public gw.api.assignment.Assignee[] getSuggestedAssignees() {
      return ((gw.cc.assignment.entity.CCAssignable)__getDelegateManager().getImplementation("gw.cc.assignment.entity.CCAssignable")).getSuggestedAssignees();
    }
    
    /**
     * Return all non-exclusive contact roles which are suitable for this owner's type and the
     * given contact. Used in the UI to restrict the user to suitable choices when adding a new
     * contact/role pair to the role owner
     * @param contact a contact, possibly null
     * @return an array of suitable roles, or an empty array if there are none
     */
    public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getSuitableNonExclusiveRolesFor(contact);
    }
    
    /**
     * Gets the value of the SupplementalWorkloadWeight field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSupplementalWorkloadWeight() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get());
    }
    
    public java.util.List<typekey.SystemPermissionType> getSystemPermissionTypes(java.util.Collection<typekey.SystemPermissionType> transactionViewPermissions) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getSystemPermissionTypes(transactionViewPermissions);
    }
    
    /**
     * Gets the value of the Text field.
     * Large text fields associated with claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimText[] getText() {
      return (entity.ClaimText[])__getInternalInterface().getFieldValue(TEXT_PROP.get());
    }
    
    /**
     * Gets the value of the Transactions field.
     * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction[] getTransactions() {
      return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
    }
    
    /**
     * Constructs an Iterator to provide access to the Transactions for this claim.  Either all the Transactions
     * or only the new and modified Transactions can be chosen for retrieval.  If all the Transactions are chosen
     * for retrieval, then those Transactions that have been removed in the current transaction will not be
     * returned by the Iterator.
     * <p/>
     * Note: This is a more efficient alternative to calling {@link entity.Claim#getTransactions()}, particularly if you are
     * only interested in new or modified transactions
     * Note: When newAndModifiedOnly is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this Claim, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * @param newAndModifiedOnly if <code>true</code> then only new and modified Transactions for this claim will
     *                           be returned.  This includes transactions for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all Transactions for the claim will be returned, including new and modified
     *                           Transactions, but excluding deleted Transactions.
     * @return an Iterator that returns Transactions
     */
    public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTransactionsIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the transactions, regardless of subtype, for this claim.
     * this query is suitable for populating a ListView in the ClaimCenter UI.  The query also filters by the
     * current user's transaction view permissions.  The transactions will be returned as they currently exist
     * on the database.
     * @return a QueryProcessor that encapsulates the query to return all Transactions for this claim.  The returned
     *         rows are actually {@link entity.TransactionDefaultView} entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.TransactionDefaultView> getTransactionsQuery() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTransactionsQuery();
    }
    
    public com.guidewire.pl.system.database.Query getTransactionsQuery(com.guidewire.commons.metadata.types.IEntityTypeCache[] transactionTypesToInclude, gw.entity.IEntityType viewEntityType, java.util.Collection<typekey.SystemPermissionType> transactionViewPermissions) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getTransactionsQuery(transactionTypesToInclude, viewEntityType, transactionViewPermissions);
    }
    
    /**
     * Description of TreatmentRendered for Workers Comp Claim.
     * @return The description of the treatment rendered
     */
    public java.lang.String getTreatmentRend() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getTreatmentRend();
    }
    
    /**
     * Gets the value of the UCR_Ext field.
     * A Unique Claim Reference (UCR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUCR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the UMR_Ext field.
     * A Unique Market Reference (UMR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUMR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getUserAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getUserAssignmentStateHelpers();
    }
    
    /**
     * Gets the assignment that corresponds to the given user and role, or null
     * if none matches.
     * @param user 
     * @param userRole 
     * @return 
     */
    public entity.UserRoleAssignment getUserRoleAssignment(entity.User user, typekey.UserRole userRole) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignment(user, userRole);
    }
    
    /**
     * Gets the user role assignment for that role
     * If there's no assignment for that role, returns null.
     * If there is more than one assignment for that role, then the first role will be returned.
     * Note: getUserRoleAssignmentsByRole(UserRole) should be called if multiple assignments are expected to return.
     * @param role The role for the assignment
     */
    public entity.UserRoleAssignment getUserRoleAssignmentByRole(typekey.UserRole role) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignmentByRole(role);
    }
    
    public com.guidewire.pl.domain.assignment.UserRoleAssignmentSet[] getUserRoleAssignmentSets() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getUserRoleAssignmentSets();
    }
    
    public entity.UserRoleAssignment[] getUserRoleAssignments(entity.User user, entity.Group group) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getUserRoleAssignments(user, group);
    }
    
    /**
     * Get the user role assignments for that role. If no assignment for that role,
     * then an empty array is returned.
     * @param role The role for the assignment
     * @return an array of user role assignments for the given role. The array is empty if no such user role assignment.
     */
    public entity.UserRoleAssignment[] getUserRoleAssignmentsByRole(typekey.UserRole role) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getUserRoleAssignmentsByRole(role);
    }
    
    /**
     * Gets the value of the ValidationLevel field.
     * Validation level that this object passed (if any) before it was stored.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ValidationLevel getValidationLevel() {
      return (typekey.ValidationLevel)__getInternalInterface().getFieldValue(VALIDATIONLEVEL_PROP.get());
    }
    
    /**
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
    }
    
    /**
     * 
     * @return An array of Vehicles associated with the claim, its exposures, and its policy.
     */
    public entity.Vehicle[] getVehicles() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getVehicles();
    }
    
    /**
     * 
     * @return returns all authors of all viewable notes.
     */
    public entity.User[] getViewableNoteAuthors() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNoteAuthors();
    }
    
    /**
     * 
     * @return returns all notes viewable by the current user.
     */
    public gw.api.database.IQueryBeanResult<entity.Note> getViewableNotes() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNotes();
    }
    
    /**
     * 
     * @param topicType The topic type
     * @return returns all notes with a specific note topic type viewable by the current user.
     */
    public gw.api.database.IQueryBeanResult<entity.Note> getViewableNotes(typekey.NoteTopicType topicType) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).getViewableNotes(topicType);
    }
    
    public com.guidewire.pl.system.database.Query<entity.Note> getViewableNotesBaseQuery() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).getViewableNotesBaseQuery();
    }
    
    /**
     * Gets the value of the Weather field.
     * Weather conditions at the time of accident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WeatherType getWeather() {
      return (typekey.WeatherType)__getInternalInterface().getFieldValue(WEATHER_PROP.get());
    }
    
    /**
     * Gets the value of the Workflows field.
     * Set of workflows associated with this Claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimWorkflow[] getWorkflows() {
      return (entity.ClaimWorkflow[])__getInternalInterface().getFieldValue(WORKFLOWS_PROP.get());
    }
    
    /**
     * Gets the value of the WorkloadUpdated field.
     * Last time user workload was calculated and updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWorkloadUpdated() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WORKLOADUPDATED_PROP.get());
    }
    
    /**
     * Gets the value of the WorkloadWeight field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkloadWeight() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKLOADWEIGHT_PROP.get());
    }
    
    public void handleAssignmentCommit() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentCommit();
    }
    
    public void handleAssignmentRollback() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).handleAssignmentRollback();
    }
    
    public void handlePolicyChange() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).handlePolicyChange();
    }
    
    /**
     * Tests whether this claim has at least one claim-level payment whose status is Awaiting Submission and
     * whose scheduled send date is today.
     * @return <code>true</code> if the above criteria are met, else <code>false</code>
     */
    public boolean hasAwaitingSubmissionPaymentsForToday() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasAwaitingSubmissionPaymentsForToday();
    }
    
    public boolean hasClaimLevelApprovedFutureFinalPayment(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasClaimLevelApprovedFutureFinalPayment(costType, costCategory);
    }
    
    public boolean hasClaimLevelPendingFinalPayment(typekey.CostType costType, typekey.CostCategory costCategory, entity.Payment paymentToExclude) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasClaimLevelPendingFinalPayment(costType, costCategory, paymentToExclude);
    }
    
    public boolean hasClaimLevelPendingOrBetterFutureFinalPayment(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasClaimLevelPendingOrBetterFutureFinalPayment(costType, costCategory);
    }
    
    public boolean hasClaimLevelReserve(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasClaimLevelReserve(costType, costCategory);
    }
    
    /**
     * 
     * @return True if there is a claimant on the claim
     * @deprecated use {@link #canHaveClaimantOnClaim} instead
     */
    public boolean hasClaimantOnClaim() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasClaimantOnClaim();
    }
    
    /**
     * Returns true if the claim has an exposure of the indicated type. If exposureType is null,
     * then it will return true if the claim has any exposures, false otherwise.
     * @param exposureType the type of the exposure to look for
     * @return true if the claim has an exposure of the given type, false otherwise
     */
    public boolean hasExposureOfType(typekey.ExposureType exposureType) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasExposureOfType(exposureType);
    }
    
    /**
     * Returns true if the claim is the owner of any open exposure.
     * @return true if the claim has an open exposure.
     */
    public boolean hasOpenExposures() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasOpenExposures();
    }
    
    /**
     * Verifies whether this claim has passed the ability to pay validation level and so can have a payment
     * created against it. The verification may potentially end up performing validation of the claim.
     * @return <code>true</code> if this claim has passed the "ability to pay" validation level,
     *         else <code>false</code>
     */
    public boolean hasPassedAbilityToPay() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasPassedAbilityToPay();
    }
    
    public boolean hasPayments() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasPayments();
    }
    
    /**
     * Used by rules to check if the claim has reported archive problem
     * @return true if there are problems reported
     */
    public boolean hasReportedArchiveProblem() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasReportedArchiveProblem();
    }
    
    public boolean hasReserve(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasReserve(costType, costCategory);
    }
    
    public boolean hasSavedTransactions() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).hasSavedTransactions();
    }
    
    /**
     * Determines whether anyone in the specified group has worked on this claim
     * before.
     * <p/>
     * "Worked on a claim" includes the (current) claim owner, owner of
     * a exposure, owner of an activity (open or closed) related to the claim,
     * and owner of an activity (open or closed) related to a exposure.
     * @param groupId The id of a group to check on.
     * @return <tt>true</tt> if any member of the group has worked on this
     *         <tt>claim</tt>
     */
    public boolean hasWorkedOn(gw.pl.persistence.core.Key groupId) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).hasWorkedOn(groupId);
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
    }
    
    /**
     * Verifies whether this claim is at the ability to pay validation level. Note: Unlike {@link #hasPassedAbilityToPay()},
     * this API never performs validation of the claim. It only verifies against whatever validation level that has been
     * set currently on the claim.
     * @return <code>true</code> if this claim is at the "ability to pay" validation level, else <code>false</code>
     */
    public boolean isAtAbilityToPay() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isAtAbilityToPay();
    }
    
    /**
     * Gets the value of the BenefitsStatusDcsn field.
     * Indicates if the benefits decision has been made yet.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBenefitsStatusDcsn() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BENEFITSSTATUSDCSN_PROP.get());
    }
    
    public boolean isClaimInfoAvailable() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).isClaimInfoAvailable();
    }
    
    /**
     * Returns true if a payment can be made against this claim at the claim-level.  Specifically,
     *  returns true if:
     *  <ul>
     *  <li> Claim is closed and previous payments have been made on it
     *  <li> Claim is open and global PaymentExceedsReserves = true
     *  <li> Claim is open and no reserves have been created for the claim
     *  <li> Claim is open and has available reserves
     *  </ul>
     * @return True if claim level payment is allowed
     */
    public boolean isClaimLevelPaymentAllowed() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClaimLevelPaymentAllowed();
    }
    
    /**
     * Checks system configuration to see if claim number generation is enabled
     * @return true if EnableClaimNumberGeneration system configuration parameter is true, false otherwise
     */
    public boolean isClaimNumberGenerationEnabled() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClaimNumberGenerationEnabled();
    }
    
    /**
     * True if the claim is closed.
     * @return true if the claim is closed.
     */
    public boolean isClosed() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isClosed();
    }
    
    /**
     * Gets the value of the ComputerSecurity field.
     * Whether computer security issues were involved.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isComputerSecurity() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPUTERSECURITY_PROP.get());
    }
    
    /**
     * Determines whether some data on the contact in the given role has changed.
     * @param role 
     */
    public boolean isContactInRoleChanged(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleChanged(role);
    }
    
    /**
     * Determines whether the contact in the given role is a different contact than the one originally
     * in the role.
     * @param role 
     */
    public boolean isContactInRoleDifferent(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleDifferent(role);
    }
    
    /**
     * Gets the value of the CoverageInQuestion field.
     * Whether the claim is covered by the claimant's policies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCoverageInQuestion() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGEINQUESTION_PROP.get());
    }
    
    public boolean isCurrencyEditable() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).isCurrencyEditable();
    }
    
    /**
     * Gets the value of the CurrentConditions field.
     * Current conditions
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCurrentConditions() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CURRENTCONDITIONS_PROP.get());
    }
    
    /**
     * Returns true if the claim is flagged (TC_ISFLAGGED).
     * @return True if claim is flagged
     */
    public boolean isCurrentlyFlagged() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isCurrentlyFlagged();
    }
    
    /**
     * Gets the value of the DiagnosticCnsistnt field.
     * Is the diagnostic consistent.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDiagnosticCnsistnt() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DIAGNOSTICCNSISTNT_PROP.get());
    }
    
    /**
     * Queries the database to see if any other claim has the same claim number as this one. Useful in
     * the new claim wizard, if claim number generation is disabled. If this claim's number is blank
     * (null, empty or all whitespace) doesn't even query database and just returns false, on the
     * assumption that no claim can have a blank claim number.
     * @return true if there is an existing claim with the same claim number, false otherwise.
     */
    public boolean isDuplicateClaimNumber() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isDuplicateClaimNumber();
    }
    
    /**
     * Gets the value of the EmploymentInjury field.
     * Workers' Comp only. Whether the injury occurred in course of employment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEmploymentInjury() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EMPLOYMENTINJURY_PROP.get());
    }
    
    /**
     * Determines whether the given role is exclusive for this type of assignable object.
     * @param userRole 
     * @return 
     */
    public boolean isExclusive(typekey.UserRole userRole) {
      return ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).isExclusive(userRole);
    }
    
    /**
     * Determines whether or not the given role has the 'Exclusive' constraint on this object.
     * @param role a contact role, cannot be null
     */
    public boolean isExclusiveRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
    }
    
    /**
     * Can exposures be added to this claim? Claims with some loss types can have a variable number of exposures,
     * while others always have a fixed set. For example in many systems Workers Compensation claims always have
     * just one or two exposures and the end user cannot add or remove exposures once the claim has been created.
     * This property reads a configuration parameter, ShowNewExposureMenuForLossTypes, and returns true if the
     * loss type of the current claim is in that list. The result of this method is used to enable and disable
     * various features in the UI - for example whether to show the new exposure menu, whether to show the
     * claim exposure list page etc.
     * @return true if this claim's loss type is such that it can have a variable number of exposures, false
     *         otherwise
     */
    public boolean isExposureListChangeable() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListChangeable();
    }
    
    /**
     * Should the exposures for this claim be displayed in the top level of the claim file?
     * @return true if this claim's loss type is such that it has a fixed set of exposures and the
     *         configuration parameter ShowFixedExposuresInLossDetails is false
     */
    public boolean isExposureListVisibleInClaimFile() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListVisibleInClaimFile();
    }
    
    /**
     * Should the exposures for this claim be displayed in the loss details area of the UI?
     * @return true if this claim's loss type is such that it has a fixed set of exposures and the
     *         configuration parameter ShowFixedExposuresInLossDetails is true
     */
    public boolean isExposureListVisibleInLossDetails() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isExposureListVisibleInLossDetails();
    }
    
    /**
     * Whether this was a first and final claim. NOTE: This property value is only valid inside the
     * FNOL wizard and is not saved to the database. It can only be relied upon in
     * code or rules which will run during the FNOL wizard.
     * @return true if this claim is a First and Final
     */
    public boolean isFirstAndFinal() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isFirstAndFinal();
    }
    
    /**
     * Gets the value of the FirstNoticeSuit field.
     * Boolean field to indicate suit at the time of the first notice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFirstNoticeSuit() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIRSTNOTICESUIT_PROP.get());
    }
    
    /**
     * Gets the value of the FurtherTreatment field.
     * Is further treatment required.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFurtherTreatment() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FURTHERTREATMENT_PROP.get());
    }
    
    /**
     * 
     * @return True if there are other claims that may be duplicates of this claim.
     */
    public boolean isHasDuplicateClaimNumbers() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isHasDuplicateClaimNumbers();
    }
    
    /**
     * Gets the value of the HazardousWaste field.
     * Boolean field to mark a claim as involving hazardous waste.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isHazardousWaste() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(HAZARDOUSWASTE_PROP.get());
    }
    
    /**
     * Gets the value of the ISOEnabled field.
     * Is this field enabled for ISO.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isISOEnabled() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOENABLED_PROP.get());
    }
    
    /**
     * Gets the value of the ISOKnown field.
     * Has a search request for this object been successfully received by ISO?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isISOKnown() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOKNOWN_PROP.get());
    }
    
    /**
     * Gets the value of the IncidentReport field.
     * True if this is an incident report only and the claim will not be processed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncidentReport() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTREPORT_PROP.get());
    }
    
    /**
     * Gets the value of the InjuredOnPremises field.
     * Was the employee injured on the premesis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInjuredOnPremises() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INJUREDONPREMISES_PROP.get());
    }
    
    /**
     * Gets the value of the InjuredRegularJob field.
     * Was the employee injured while doing his or her regular job.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInjuredRegularJob() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INJUREDREGULARJOB_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredPremises field.
     * @deprecated True if the incident occurred on the employer's premises.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInsuredPremises() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INSUREDPREMISES_PROP.get());
    }
    
    /**
     * Return true if Metro Message sink is enable.
     * @return True if metro is enabled
     */
    public boolean isMetroEnable() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isMetroEnable();
    }
    
    /**
     * Gets the value of the ModifiedDutyAvail field.
     * Is Modified Duty Available at Work.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isModifiedDutyAvail() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MODIFIEDDUTYAVAIL_PROP.get());
    }
    
    /**
     * Gets the value of the Mold field.
     * Boolean field to mark a claim as involving mold.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMold() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOLD_PROP.get());
    }
    
    /**
     * The value of the server parameter MulticurrencyDisplayMode.
     * Use CurrencyUtil.MultiCurrencyMode instead.
     * @return True if in multi-currency display mode
     * @deprecated Use CurrencyUtil.MultiCurrencyMode instead.
     */
    public boolean isMultiCurrencyDisplayMode() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isMultiCurrencyDisplayMode();
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * Indicates whether or not this is considered a new claim with reference to this user.  A claim is
     * considered "new" for a user if the claim has a temporary ID or if the claim is in draft state and
     * this user is the user that created the claim.
     * @param user the user to check
     * @return <code>true</code> if this is a new claim for this user, <code>false</code> otherwise
     */
    public boolean isNewForUser(entity.User user) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isNewForUser(user);
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * Gets the value of the PTPinMPN field.
     * Is Primary Treating Physician in MPN?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPTPinMPN() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PTPINMPN_PROP.get());
    }
    
    /**
     * Is the activity pattern applicable to this claim?
     * @param pattern The activity pattern
     * @return True if the activity pattern is valid for the claim
     */
    public boolean isPatternValidForClaim(entity.ActivityPattern pattern) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isPatternValidForClaim(pattern);
    }
    
    /**
     * Returns true if this claim's policy is edited or replaced.  Also returns
     * true if a coverage or endorsement on the policy is added, edited, or deleted.
     * Note that false is returned for changes to all other policy related objects
     * such as vehicles, properties, and contacts.
     * @return True if policy is changed
     */
    public boolean isPolicyChanged() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isPolicyChanged();
    }
    
    /**
     * Gets the value of the PreexDisblty field.
     * Whether the injured person had a pre-existing disability.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPreexDisblty() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PREEXDISBLTY_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsuranceReportable field.
     * True if this claim has exceeded the Reinsurance Reporting Threshold
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReinsuranceReportable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REINSURANCEREPORTABLE_PROP.get());
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    /**
     * Determines whether or not the given role has the given constraint on this object.
     * @param role 
     * @param constraintType 
     */
    public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
    }
    
    /**
     * Gets the value of the SafetyEquipProv field.
     * Was safety equipment provided.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSafetyEquipProv() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SAFETYEQUIPPROV_PROP.get());
    }
    
    /**
     * Gets the value of the SafetyEquipUsed field.
     * Was safety equipment used.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSafetyEquipUsed() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SAFETYEQUIPUSED_PROP.get());
    }
    
    /**
     * True if the user specified is the note supervisor on this claim.
     * @param user the user to check.
     * @return True if the user is a note supervisor
     */
    public boolean isSupervisor(entity.User user) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isSupervisor(user);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TreatedPatientBfr field.
     * Has the patient been treated before.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTreatedPatientBfr() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TREATEDPATIENTBFR_PROP.get());
    }
    
    /**
     * Gets the value of the UberPrecautionaryFlag_Ext field.
     * This flag indicates if this ECF Claim is a Uber Precautionary.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isUberPrecautionaryFlag_Ext() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(UBERPRECAUTIONARYFLAG_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the VCSIndicator_Ext field.
     * Indicates if this ECF Claim is a Volume Claims Service (VCS) claim. This is indicated by the TriageCategory in an ECF message (Lloyd's only).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVCSIndicator_Ext() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VCSINDICATOR_EXT_PROP.get());
    }
    
    /**
     * Returns true if this claim is valid at the specified level. Optionally
     * checks exposures too. Note this method does <i>not</i> call validation
     * rules; it simply check the claim's existing validation level.
     * @param level The level to check against.
     * @param bIncludeExposures Indicates whether or not the claim's exposures s/b
     *                          checked as well.
     * @return True if this claim is valid at the specified level.
     */
    public boolean isValid(typekey.ValidationLevel level, boolean bIncludeExposures) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValid(level, bIncludeExposures);
    }
    
    /**
     * Executes claim-closed validation rules and returns whether or not this
     * claim passes.
     * @param level The level to check
     * @return True if this claim passes.
     */
    public boolean isValidClosed(typekey.ValidationLevel level) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValidClosed(level);
    }
    
    /**
     * Executes claim-reopened validation rules and returns whether or not this
     * claim passes.
     * @param level The level to check
     * @return True if this claim passes.
     */
    public boolean isValidReopened(typekey.ValidationLevel level) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isValidReopened(level);
    }
    
    /**
     * Gets the value of the WeatherRelated field.
     * Is related to weather
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWeatherRelated() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WEATHERRELATED_PROP.get());
    }
    
    /**
     * If the given limit type is AggregateLimitType.TC_ANNUALREPORTEDDATE,
     * then returns true if this claim's reported date is within or on its
     * policy's effective and expiration date.
     * <p/>
     * If the given limit type is AggregateLimitType.TC_ANNUALLOSSDATE, then
     * returns true if this claim's loss date is within or on its policy's
     * effective and expiration date.
     * <p/>
     * If the given limit type is AggregateLimitType.TC_LIFETIMELIMIT, then
     * returns true.
     * @param limitType The aggregate limit type
     * @return True or false based on the aggregate limit type (see above)
     */
    public boolean isWithinEffectivePeriod(typekey.AggregateLimitType limitType) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).isWithinEffectivePeriod(limitType);
    }
    
    /**
     * Produces an iterator over this object's Contact graph.
     * @return an iterator
     */
    public java.util.Iterator iterateContactGraph() {
      return ((com.guidewire.pl.domain.contact.ContactGraphGenerator)__getDelegateManager().getImplementation("com.guidewire.pl.domain.contact.ContactGraphGenerator")).iterateContactGraph();
    }
    
    public void makePolicyEditable() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).makePolicyEditable();
    }
    
    public void markClaimAsViewed() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).markClaimAsViewed();
    }
    
    public void markPurgeReady(boolean purgeFromAggregateLimit) throws gw.api.webservice.exception.EntityStateException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).markPurgeReady(purgeFromAggregateLimit);
    }
    
    /**
     * Creates an activity from an activity pattern.  The type of the created activity will match the type of the
     * pattern.  Fields on the activity will be populated by fields on the pattern, including the escalation date, which
     * is calculated from the estimated completion days on the pattern.
     * <p/>
     * The previousUserID field is also set with the id of the user calling this method.  In future, the rules engine and
     * other automated clients of the API will have distinct users - until then, the previousUserID will be null
     * @param pattern Pattern with with to populate a new activity
     * @param exposure Exposure to associate with the activity
     * @return A new activity populated by the pattern
     */
    public entity.Activity newActivity(entity.ActivityPattern pattern, entity.Exposure exposure) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newActivity(pattern, exposure);
    }
    
    public entity.Activity newActivity(gw.pl.persistence.core.Bundle bundle, entity.Exposure exposure, entity.ActivityPattern pattern, java.lang.String subject, java.lang.String description, java.lang.String approvalIssue, typekey.Priority priority, java.lang.Boolean mandatory, java.util.Date targetDate, java.util.Date escalationDate) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).newActivity(bundle, exposure, pattern, subject, description, approvalIssue, priority, mandatory, targetDate, escalationDate);
    }
    
    /**
     * Returns a new CheckCreator object for creating a check on this claim.
     */
    public gw.api.financials.CheckCreator newCheckCreator() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newCheckCreator();
    }
    
    /**
     * Factory method for creating a new unpopulated EmploymentData instance in the same
     * bundle as this claim. Note that this method will correctly populate
     * the {@link EmploymentData#setClaim(entity.Claim)} foreign key link. It does NOT set
     * the {@link entity.Claim#getEmploymentData()} property on
     * this Claim.
     * @return The employment data instance
     */
    public entity.EmploymentData newEmploymentData() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newEmploymentData();
    }
    
    /**
     * Create a new blank evaluation.
     * @return Evaluation
     */
    public entity.Evaluation newEvaluation() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newEvaluation();
    }
    
    /**
     * Returns an editable Exposure in either a new bundle or the bundle of the claim. The exposure
     * is initialized with the following values:
     * <ul>
     * <li>Claim  - set to this claim
     * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
     * <li>ExposureType - set to the exposure type determined by coverageSubType
     * <li>PrimaryCoverage - set to the given coverage type
     * <li>CoverageSubType - set to the given coverage subtype
     * <li>LossParty - if there is only one possible loss party type value for the given coverage
     * subtype then the loss party will be set to that value. Otherwise it will be set to null.
     * <li>State - set to Draft
     * <li>Incident - set to a newly created incident of the appropriate type for this exposure
     * <ul>
     * Unless this method is used in the new claim wizard you will usually want to call the exposure's
     * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
     * the appropriate rules. You don't need to do this if this method is called in the new claim
     * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
     * set up the claim's draft exposures.
     * @param coverageType the exposure coverage type
     * @param coverageSubType the exposure coverage sub type
     * @param useClaimSource if true, and if the claim is in a writable bundle, then creates the
     *                        exposure in the claim's bundle. Otherwise the exposure is created in a new bundle. This
     *                        parameter should nearly always be true.
     * @return the newly created exposure
     */
    public entity.Exposure newExposure(typekey.CoverageType coverageType, typekey.CoverageSubtype coverageSubType, boolean useClaimSource) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposure(coverageType, coverageSubType, useClaimSource);
    }
    
    /**
     * Returns an editable Exposure in either a new bundle or the bundle of the claim. The exposure
     * is initialized with the following values:
     * <ul>
     * <li>Claim  - set to this claim
     * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
     * <li>ExposureType - set to the given type
     * <li>State - set to Draft
     * <li>Incident - set to a newly created incident of the appropriate type for this exposure
     * <ul>
     * Unless this method is used in the new claim wizard you will usually want to call the exposure's
     * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
     * the appropriate rules. You don't need to do this if this method is called in the new claim
     * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
     * set up the claim's draft exposures.
     * @param subtype the exposure "subtype"
     * @param useClaimSource if true, and if the claim is in a writable bundle, then creates the
     *                       exposure in the claim's bundle. Otherwise the exposure is created in a new bundle. This
     *                       parameter should nearly always be true.
     * @return the newly created exposure
     */
    public entity.Exposure newExposure(typekey.ExposureType subtype, boolean useClaimSource) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposure(subtype, useClaimSource);
    }
    
    /**
     * Creates a new Exposure in the same bundle as the claim (which must be in an
     * editable bundle). The exposure is initialized with the following values:
     * <ul>
     * <li>Claim - set to this claim,
     * <li>ClaimOrder - set to maximum ClaimOrder of the existing exposures on the claim plus one
     * <li>ExposureType - set to the exposure type determined by coverageSubType
     * <li>PrimaryCoverage - set to the given coverage type
     * <li>CoverageSubType - set to the given coverage subtype
     * <li>LossParty - if there is only one possible loss party type value for the given coverage
     * subtype then the loss party will be set to that value. Otherwise it will be set to null.
     * <li>Coverage - set to the given coverage (may be null)
     * <li>State - set to Draft
     * </ul>
     * The exposure incident is not created and is left null, so the caller can set or create the
     * incident as they wish. For example, they might:
     * <ul>
     * <li>Create a new, empty, incident using the exposure's ensureIncidentCreated() method
     * <li>Set the incident field to point at an existing incident from this claim
     * <li>Call a custom method to create the incident and then set the incident field to point at this
     * new incident
     * </ul>
     * This method gives the most control when creating a new exposure. If you use one of the other
     * newExposure methods to create a new exposure and a new incident at the same time it is tricky
     * to set the incident if you want to create or set it yourself. You will have to explicitly
     * remove the automatically created incident and then replace it with your own. If you just set
     * the incident field without doing a remove the automatically created incident will still be in
     * the bundle and will be added to the claim when it commits. But if you use this method it is
     * trivial to add a new incident if you want to, but you can also set it to an existing or custom
     * value if you wish.
     * <p/>
     * Unless this method is used in the new claim wizard you will usually want to call the exposure's
     * saveAndSetup method before committing the new exposure, to set its state to "Open" and to run
     * the appropriate rules. You don't need to do this if this method is called in the new claim
     * wizard as the claim's saveAndSetup method (called at the end of the wizard) will also save and
     * set up the claim's draft exposures.
     * @param coverageType the exposure coverage type, must not be null
     * @param coverageSubtype the exposure coverage sub type, must not be null
     * @param coverage the exposure coverage, can be null
     * @return the newly created exposure, with a null incident
     */
    public entity.Exposure newExposureWithNoIncident(typekey.CoverageType coverageType, typekey.CoverageSubtype coverageSubtype, entity.Coverage coverage) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newExposureWithNoIncident(coverageType, coverageSubtype, coverage);
    }
    
    public entity.History newHistoryEvent(gw.pl.persistence.core.Bundle bundle, gw.pl.persistence.core.Key exposureID, gw.pl.persistence.core.Key matterID, gw.pl.persistence.core.Key userID, java.lang.String rule, typekey.HistoryType type, typekey.CustomHistoryType customType, java.lang.String description) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).newHistoryEvent(bundle, exposureID, matterID, userID, rule, type, customType, description);
    }
    
    /**
     * Create a new incident of the given type and add it to this claim's incident array
     * @param type an incident type
     * @throws IllegalArgumentException if type is null or not an incident type
     * @return a new incident
     */
    public entity.Incident newIncident(gw.entity.IEntityType type) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newIncident(type);
    }
    
    /**
     * Creates a new blank matter.
     * @return Matter
     */
    public entity.Matter newMatter() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newMatter();
    }
    
    /**
     * Create a new Metro Report on this claim.
     * @return The new metro report
     */
    public entity.MetroReport newMetroReport() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newMetroReport();
    }
    
    /**
     * Create a new blank negotiation.
     * @return Negotiation
     */
    public entity.Negotiation newNegotiation() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newNegotiation();
    }
    
    /**
     * Adds a new RITransactionSet with no RITransactions to this claim.
     * @return The transaction set
     */
    public entity.RITransactionSet newRITransactionSet() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRITransactionSet();
    }
    
    /**
     * Adds a new empty RecoveryReserveSet to this claim
     * @return The transaction set
     */
    public entity.RecoveryReserveSet newRecoveryReserveSet() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRecoveryReserveSet();
    }
    
    /**
     * Adds a new empty RecoverySet to this claim
     * @return The transaction set
     */
    public entity.RecoverySet newRecoverySet() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newRecoverySet();
    }
    
    /**
     * Adds a new empty ReserveSet to this claim
     * @return The transaction set
     */
    public entity.ReserveSet newReserveSet() {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).newReserveSet();
    }
    
    public entity.TransactionSet newTransactionSet(gw.entity.IEntityType transactionSetType) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).newTransactionSet(transactionSetType);
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void performEssentialSetup(gw.api.assignment.Assignee claimAssignment, gw.api.assignment.Assignee[] exposureAssignments) throws com.guidewire.cc.system.exception.ClaimNumberNotUniqueException, com.guidewire.cc.domain.claim.ClaimNumberException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).performEssentialSetup(claimAssignment, exposureAssignments);
    }
    
    public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
      ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Rebuilds the ACL on the claim.  This will effectively clear the ACL and then rebuild it
     * based on the security configuration and the activities, exposures, and claim users currently
     * associated with the claim.
     */
    public void rebuildClaimACL() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).rebuildClaimACL();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    /**
     * Reload the claim's policy from the Policy adapter and refresh any claim-related information.
     * Retrieves policy using the current policy number and claim loss date and sets it on the claim again.
     * @throws PolicyNotFoundException If the policy can't be found
     * @throws PolicyNotUniqueException If the policy is not unique
     * @throws IllegalStateException If the Claim does not already have a Policy
     */
    public void refreshPolicy() throws com.guidewire.cc.domain.policy.impl.PolicyNotFoundException, com.guidewire.cc.domain.policy.impl.PolicyNotUniqueException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).refreshPolicy();
    }
    
    public void refreshWithPolicy(entity.Policy policy) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).refreshWithPolicy(policy);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    /**
     * Removes all roles associated with this ClaimContactRoleOwner.
     */
    public void removeAllRoles() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
    }
    
    /**
     * Removes a problem description from the claim
     * @param flaggedReason Reason to be removed
     * @return True if claim was actually flagged
     */
    public boolean removeFlagReason(java.lang.String flaggedReason) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).removeFlagReason(flaggedReason);
    }
    
    public void removeFromAccess(com.guidewire.cc.domain.claim.impl.UnrootedClaimAccess element) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).removeFromAccess(element);
    }
    
    /**
     * Removes the given element from the Access array. This is achieved by marking the element for removal.
     */
    public void removeFromAccess(entity.ClaimAccess element) {
      __getInternalInterface().removeArrayElement(ACCESS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Access array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAccess(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ACCESS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Activities array. This is achieved by marking the element for removal.
     */
    public void removeFromActivities(entity.Activity element) {
      __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Activities array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromActivities(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the AllocatedClaimNumberArray array. This is achieved by marking the element for removal.
     */
    public void removeFromAllocatedClaimNumberArray(entity.AllocatedClaimNumber element) {
      __getInternalInterface().removeArrayElement(ALLOCATEDCLAIMNUMBERARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AllocatedClaimNumberArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAllocatedClaimNumberArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ALLOCATEDCLAIMNUMBERARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimISOMatchReports(entity.ClaimISOMatchReport element) {
      __getInternalInterface().removeArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimISOMatchReports array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimISOMatchReports(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMISOMATCHREPORTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimIndicators(entity.ClaimIndicator element) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimIndicators array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimIndicators(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimInfoArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimInfoArray(entity.ClaimInfo element) {
      __getInternalInterface().removeArrayElement(CLAIMINFOARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimInfoArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimInfoArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMINFOARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimMetricRecalculationTimeArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime element) {
      __getInternalInterface().removeArrayElement(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimMetricRecalculationTimeArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimMetricRecalculationTimeArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimMetrics(entity.ClaimMetric element) {
      __getInternalInterface().removeArrayElement(CLAIMMETRICS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimMetrics array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimMetrics(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMMETRICS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimRptArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimRptArray(entity.ClaimRpt element) {
      __getInternalInterface().removeArrayElement(CLAIMRPTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimRptArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimRptArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMRPTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimSynchStates(entity.ClaimSynchState element) {
      __getInternalInterface().removeArrayElement(CLAIMSYNCHSTATES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimSynchStates array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimSynchStates(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMSYNCHSTATES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimempdataArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimempdataArray(entity.Claimempdata element) {
      __getInternalInterface().removeArrayElement(CLAIMEMPDATAARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimempdataArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimempdataArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMEMPDATAARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
     */
    public void removeFromConcurrentEmpl(entity.ConcurrentEmployment element) {
      __getInternalInterface().removeArrayElement(CONCURRENTEMPL_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ConcurrentEmpl array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromConcurrentEmpl(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONCURRENTEMPL_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
     */
    public void removeFromContacts(entity.ClaimContact element) {
      __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContacts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTACTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
     */
    public void removeFromContribFactors(entity.ContribFactor element) {
      __getInternalInterface().removeArrayElement(CONTRIBFACTORS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ContribFactors array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContribFactors(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTRIBFACTORS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Deductibles array. This is achieved by marking the element for removal.
     */
    public void removeFromDeductibles(entity.Deductible element) {
      __getInternalInterface().removeArrayElement(DEDUCTIBLES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Deductibles array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDeductibles(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DEDUCTIBLES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Documents array. This is achieved by marking the element for removal.
     */
    public void removeFromDocuments(entity.Document element) {
      __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Documents array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDocuments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
     */
    public void removeFromDrugsPrescribed(entity.DrugPrescribed element) {
      __getInternalInterface().removeArrayElement(DRUGSPRESCRIBED_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DrugsPrescribed array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDrugsPrescribed(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DRUGSPRESCRIBED_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
     */
    public void removeFromEvaluations(entity.Evaluation element) {
      __getInternalInterface().removeArrayElement(EVALUATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Evaluations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromEvaluations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EVALUATIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     */
    public void removeFromExposures(entity.Exposure element) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposures(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the History array. This is achieved by marking the element for removal.
     */
    public void removeFromHistory(entity.History element) {
      __getInternalInterface().removeArrayElement(HISTORY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the History array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromHistory(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(HISTORY_PROP.get(), elementID);
    }
    
    /**
     * Remove the given match report form the array of match reports on this Claim/Exposure
     * @param report the report to be removed
     */
    public void removeFromISOMatchReports(entity.ISOMatchReport report) {
      ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).removeFromISOMatchReports(report);
    }
    
    /**
     * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
     */
    public void removeFromIncidents(entity.Incident element) {
      __getInternalInterface().removeArrayElement(INCIDENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Incidents array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromIncidents(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INCIDENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
     */
    public void removeFromLMMessages(entity.LMMessage_Ext element) {
      __getInternalInterface().removeArrayElement(LMMESSAGES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LMMessages array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLMMessages(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LMMESSAGES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Matters array. This is achieved by marking the element for removal.
     */
    public void removeFromMatters(entity.Matter element) {
      __getInternalInterface().removeArrayElement(MATTERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Matters array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromMatters(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(MATTERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
     */
    public void removeFromMedicalContactStatus(entity.MedicalContactStatus element) {
      __getInternalInterface().removeArrayElement(MEDICALCONTACTSTATUS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the MedicalContactStatus array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromMedicalContactStatus(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(MEDICALCONTACTSTATUS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
     */
    public void removeFromMedicalTreatments(entity.MedicalTreatment element) {
      __getInternalInterface().removeArrayElement(MEDICALTREATMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the MedicalTreatments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromMedicalTreatments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(MEDICALTREATMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
     */
    public void removeFromMetroReports(entity.MetroReport element) {
      __getInternalInterface().removeArrayElement(METROREPORTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the MetroReports array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromMetroReports(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(METROREPORTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
     */
    public void removeFromNegotiations(entity.Negotiation element) {
      __getInternalInterface().removeArrayElement(NEGOTIATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Negotiations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromNegotiations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(NEGOTIATIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Notes array. This is achieved by marking the element for removal.
     */
    public void removeFromNotes(entity.Note element) {
      __getInternalInterface().removeArrayElement(NOTES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Notes array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromNotes(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(NOTES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Officials array. This is achieved by marking the element for removal.
     */
    public void removeFromOfficials(entity.Official element) {
      __getInternalInterface().removeArrayElement(OFFICIALS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Officials array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOfficials(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OFFICIALS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
     */
    public void removeFromOtherBenefits(entity.OtherBenefit element) {
      __getInternalInterface().removeArrayElement(OTHERBENEFITS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the OtherBenefits array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOtherBenefits(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OTHERBENEFITS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PolicyLocationSummaryJoinArray array. This is achieved by marking the element for removal.
     */
    public void removeFromPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin element) {
      __getInternalInterface().removeArrayElement(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PolicyLocationSummaryJoinArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPolicyLocationSummaryJoinArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PropertyFireDamageArray array. This is achieved by marking the element for removal.
     */
    public void removeFromPropertyFireDamageArray(entity.PropertyFireDamage element) {
      __getInternalInterface().removeArrayElement(PROPERTYFIREDAMAGEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PropertyFireDamageArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPropertyFireDamageArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PROPERTYFIREDAMAGEARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PropertyWaterDamageArray array. This is achieved by marking the element for removal.
     */
    public void removeFromPropertyWaterDamageArray(entity.PropertyWaterDamage element) {
      __getInternalInterface().removeArrayElement(PROPERTYWATERDAMAGEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PropertyWaterDamageArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPropertyWaterDamageArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PROPERTYWATERDAMAGEARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
     */
    public void removeFromRIAgreementGroups(entity.RIAgreementGroup element) {
      __getInternalInterface().removeArrayElement(RIAGREEMENTGROUPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RIAgreementGroups array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRIAgreementGroups(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RIAGREEMENTGROUPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
     */
    public void removeFromRICodings(entity.RICoding element) {
      __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRICodings(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RICODINGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
     */
    public void removeFromReserveLines(entity.ReserveLine element) {
      __getInternalInterface().removeArrayElement(RESERVELINES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ReserveLines array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromReserveLines(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RESERVELINES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void removeFromRoleAssignments(entity.UserRoleAssignment value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).removeFromRoleAssignments(value);
    }
    
    /**
     * Removes the given element from the RoleAssignments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRoleAssignments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ROLEASSIGNMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
     */
    public void removeFromSIAnswerSet(entity.SIUAnswerSet element) {
      __getInternalInterface().removeArrayElement(SIANSWERSET_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SIAnswerSet array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSIAnswerSet(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SIANSWERSET_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
     */
    public void removeFromSITriggers(entity.SITrigger element) {
      __getInternalInterface().removeArrayElement(SITRIGGERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SITriggers array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSITriggers(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SITRIGGERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     */
    public void removeFromServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SpecialHandlingFinancialStateArray array. This is achieved by marking the element for removal.
     */
    public void removeFromSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState element) {
      __getInternalInterface().removeArrayElement(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SpecialHandlingFinancialStateArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSpecialHandlingFinancialStateArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SubrogationSummaryArray array. This is achieved by marking the element for removal.
     */
    public void removeFromSubrogationSummaryArray(entity.SubrogationSummary element) {
      __getInternalInterface().removeArrayElement(SUBROGATIONSUMMARYARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SubrogationSummaryArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSubrogationSummaryArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SUBROGATIONSUMMARYARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Text array. This is achieved by marking the element for removal.
     */
    public void removeFromText(entity.ClaimText element) {
      __getInternalInterface().removeArrayElement(TEXT_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Text array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromText(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TEXT_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
     * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
     */
    @java.lang.Deprecated
    public void removeFromTransactions(entity.Transaction element) {
      __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTransactions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TRANSACTIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
     */
    public void removeFromWorkflows(entity.ClaimWorkflow element) {
      __getInternalInterface().removeArrayElement(WORKFLOWS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Workflows array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromWorkflows(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(WORKFLOWS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given ClaimContactRole from this owner.
     * @param claimContactRole 
     * @throws IllegalArgumentException if this is not the owner of the given ClaimContactRole.
     */
    public void removeRole(entity.ClaimContactRole claimContactRole) {
      ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).removeRole(claimContactRole);
    }
    
    /**
     * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
     * should only be used with Required or ZeroToMore roles.
     * @param role Role that is not exclusive
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
     */
    public void removeRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeRole(role, contact);
    }
    
    public void removeUserRoleAssignments(entity.User user, entity.Group group) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).removeUserRoleAssignments(user, group);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Reopens the claim.
     * @param reopenReason The reason for re-opening the claim
     * @param noteBody The note to attach for re-opening the claim
     * @throws ReopenException If an error occurs reopening the claim
     * @throws EntityValidationException If a validation exception occurs
     */
    public void reopen(typekey.ClaimReopenedReason reopenReason, java.lang.String noteBody) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).reopen(reopenReason, noteBody);
    }
    
    public void reopenWithValidationOption(typekey.ClaimReopenedReason reopenReason, java.lang.String noteBody, gw.api.validation.BundleValidationOption validationOption) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).reopenWithValidationOption(reopenReason, noteBody, validationOption);
    }
    
    /**
     * Used by rules to report archiving problems.  If a problem is reported the
     * Claim will be excluded from archive, meaning it will not be picked up again
     * by the archiving process.  To skip this Claim temporarily, use skipFromArchiving().
     * @param reason reason that this claim cannot be archived
     */
    public void reportArchiveProblem(java.lang.String reason) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).reportArchiveProblem(reason);
    }
    
    /**
     * This function resolves the relatedContact and its relationships before setting the contactContact.
     * In the case that the relatedContact is brought in from AddressBook, we have to prevent duplicated relationships
     * being added to the primaryContact (which we assumed it to be related to the claim). Therefore, any relationships
     * between the two contacts are removed.
     * @param contactContact The contact relationship
     * @param primaryContact The primary contact
     * @param relatedContact The related contact
     */
    public void resolveAndSetContactContact(entity.ContactContact contactContact, entity.Contact primaryContact, entity.Contact relatedContact) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).resolveAndSetContactContact(contactContact, primaryContact, relatedContact);
    }
    
    /**
     * Resolves the contact and its relationship to reconcile with the ClaimContacts and its related graph in the claim.
     * @param contact The contact to resolve
     * @return The resolved contact
     */
    public entity.Contact resolveContact(entity.Contact contact) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).resolveContact(contact);
    }
    
    public void saveAndSetup(gw.api.assignment.Assignee claimAssignment, gw.api.assignment.Assignee[] exposureAssignments) throws com.guidewire.pl.system.exception.ConcurrentDataChangeException, com.guidewire.pl.system.exception.IllegalAssignmentException, com.guidewire.pl.system.exception.InsufficientPermissionException, com.guidewire.pl.system.exception.NoAssignmentFoundException, com.guidewire.cc.system.exception.ClaimNumberNotUniqueException, com.guidewire.cc.domain.claim.ClaimNumberException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).saveAndSetup(claimAssignment, exposureAssignments);
    }
    
    /**
     * If a geocoding plugin is configured, adds a work item to geocode
     * the specified address in batch mode
     * @param address 
     */
    public void scheduleGeocoding(entity.Address address) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).scheduleGeocoding(address);
    }
    
    /**
     * Ensure that the claim's metrics and indicators will be updated when the claim's bundle is
     * committed. This method does <b>not</b> calculate any metric or indicator values immediately,
     * it just arranges that they will be calculated during bundle commit. The calculations must only
     * be done once per commit and they should happen fairly late in the commit process - for example
     * the pre update rules and entity callbacks should already have been executed when the metrics
     * and indicators are calculated.
     */
    public void scheduleHealthUpdate() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).scheduleHealthUpdate();
    }
    
    /**
     * Apply segmentation to this claim.
     * (This does both segmentation and strategy.)
     */
    public void segment() {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).segment();
    }
    
    /**
     * Sends an e-mail message about this object.
     * @param to the Contact to whom the e-mail should be sent.
     * @param from the Contact from whom the e-mail should be sent.
     * @param subject the subject of the e-mail message.
     * @param template the name of the Velocity template to execute for message body generation.
     * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
     */
    public void sendEmail(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String template) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmail(to, from, subject, template);
    }
    
    /**
     * Sends an e-mail message about this object.
     * @param toName the name of the recipient
     * @param toEmailAddress the e-mail address of the recipient
     * @param fromName the name of the sender
     * @param fromEmailAddress the e-mail address of the sender
     * @param subject the subject of the e-mail message.
     * @param template the name of the Velocity template to execute for message body generation.
     * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
     */
    public void sendEmail(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String template) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmail(toName, toEmailAddress, fromName, fromEmailAddress, subject, template);
    }
    
    /**
     * Send email about an object, saving the contents of the email as a document on the parent object.
     * @param to the Contact to whom the e-mail should be sent.
     * @param from the Contact from whom the e-mail should be sent.
     * @param subject the subject of the e-mail message.
     * @param template the name of the Velocity template to execute for message body generation.
     * @param documentTemplate the name of the document template to use for document generation.
     * @param docType the type of document to create
     * @param docStatusType the doc status type?
     * @param docSecurityType 
     * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
     * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
     */
    public void sendEmailAndCreateDocument(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String template, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailAndCreateDocument(to, from, subject, template, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
    }
    
    /**
     * Send email about an object, saving the contents of the email as a document on the parent object.
     * @param toName the name of the recipient
     * @param toEmailAddress the e-mail address of the recipient
     * @param fromName the name of the sender
     * @param fromEmailAddress the e-mail address of the sender
     * @param subject the subject of the e-mail message.
     * @param template the name of the Velocity template to execute for message body generation.
     * @param documentTemplate the name of the document template to use for document generation.
     * @param docType the type of document to create
     * @param docStatusType the doc status type?
     * @param docSecurityType 
     * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
     * @deprecated Please use the sendEmailWithBody methods and generate your message body in Rules.
     */
    public void sendEmailAndCreateDocument(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String template, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailAndCreateDocument(toName, toEmailAddress, fromName, fromEmailAddress, subject, template, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
    }
    
    /**
     * Send email about an object, saving the contents of the email as a document on the parent object.
     * @param to the Contact to whom the e-mail should be sent.
     * @param from the Contact from whom the e-mail should be sent.
     * @param subject the subject of the e-mail message.
     * @param body the body of the e-mail message.
     * @param documentTemplate the name of the document template to use for document generation.
     * @param docType the type of document to create
     * @param docStatusType the doc status type?
     * @param docSecurityType 
     * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
     * @deprecated Now that document creation is available through Gosu, it should be a separate step. See the DocumentProduction Gosu class.
     */
    public void sendEmailWithBodyAndCreateDocument(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String body, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailWithBodyAndCreateDocument(to, from, subject, body, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
    }
    
    /**
     * Send email about an object, saving the contents of the email as a document on the parent object.
     * @param toName the name of the recipient
     * @param toEmailAddress the e-mail address of the recipient
     * @param fromName the name of the sender
     * @param fromEmailAddress the e-mail address of the sender
     * @param subject the subject of the e-mail message.
     * @param body the body of the e-mail message.
     * @param documentTemplate the name of the document template to use for document generation.
     * @param docType the type of document to create
     * @param docStatusType the doc status type?
     * @param docSecurityType 
     * @param onErrorPattern the activity pattern to use for activity creation if an error occurs
     * @deprecated Now that document creation is available through Gosu, it should be a separate step. See the DocumentProduction Gosu class.
     */
    public void sendEmailWithBodyAndCreateDocument(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String body, java.lang.String documentTemplate, typekey.DocumentType docType, typekey.DocumentStatusType docStatusType, typekey.DocumentSecurityType docSecurityType, entity.ActivityPattern onErrorPattern) {
      ((com.guidewire.cc.domain.email.CCEmailSupport)__getDelegateManager().getImplementation("com.guidewire.cc.domain.email.CCEmailSupport")).sendEmailWithBodyAndCreateDocument(toName, toEmailAddress, fromName, fromEmailAddress, subject, body, documentTemplate, docType, docStatusType, docSecurityType, onErrorPattern);
    }
    
    /**
     * Sets the value of the Access field.
     */
    public void setAccess(entity.ClaimAccess[] value) {
      __getInternalInterface().setFieldValue(ACCESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AccidentType field.
     */
    public void setAccidentType(typekey.AccidentType value) {
      __getInternalInterface().setFieldValue(ACCIDENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Activities field.
     */
    public void setActivities(entity.Activity[] value) {
      __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgencyId field.
     */
    public void setAgencyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AGENCYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllocatedClaimNumber field.
     */
    public void setAllocatedClaimNumber(entity.AllocatedClaimNumber value) {
      __getInternalInterface().setFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllocatedClaimNumberArray field.
     */
    public void setAllocatedClaimNumberArray(entity.AllocatedClaimNumber[] value) {
      __getInternalInterface().setFieldValue(ALLOCATEDCLAIMNUMBERARRAY_PROP.get(), value);
    }
    
    public void setAllocatedClaimNumberID(gw.pl.persistence.core.Key value) {
      setFieldValue(ALLOCATEDCLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedByUser field.
     */
    public void setAssignedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    public void setAssignedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDBYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedGroup field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroup(entity.Group value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedGroup(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedGroupID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedGroupID(value);
    }
    
    /**
     * Sets the value of the AssignedQueue field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueue(entity.AssignableQueue value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedQueue(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedQueueID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedQueueID(value);
    }
    
    /**
     * Sets the value of the AssignedUser field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUser(entity.User value) {
      ((com.guidewire.pl.domain.assignment.AssignablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AssignablePublicMethods")).setAssignedUser(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).setAssignedUserID(value);
    }
    
    /**
     * Sets the value of the AssignmentDate field.
     */
    public void setAssignmentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignmentStatus field.
     */
    public void setAssignmentStatus(typekey.AssignmentStatus value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the available reserves for this reserve line to the given amount by creating
     * a reserve that increases or decreases the currently available reserves.
     * 
     * This method creates a new ReserveSet and Reserve transaction with the amount necessary to get the AvailableReserves
     * for the matching ReserveLine to equal the newReserveAmount.
     * This transaction amount might be positive if an increase is needed or negative if a decrease is needed.
     * The ReserveSet is not run through pre-setup rules and is immediately submitted for approval.
     * Unlike setting reserves in the UI, this method ignores any Reserve transactions on the same ReserveLine with a
     * status of Pending Approval (since the AvailableReserves calculation does not include PendingApproval reserves).
     * If the current AvailableReserves amount is already equal to newReserveAmount, then this method does not create
     * a new Reserve nor ReserveSet, and returns null.
     * @param costType The cost type for the reserve.  This value cannot be null.
     * @param costCategory The cost category for the reserve.  This value cannot be null.
     * @param newReserveAmount The amount the open reserves should be.  The amount must be non-null and zero or greater, not negative.
     * @param submittingUser User submitting this reserve.
     * @throws com.guidewire.cc.system.exception.ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
     * @throws com.guidewire.cc.system.exception.ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
     * @throws com.guidewire.pl.system.exception.InsufficientAuthorityException if the submitting user does not have authority to create the reserve
     * @return the new reserve (Note: the amount of the returned reserve should not be changed).
     *         The method will return null if new reserve is not created.
     */
    public entity.Reserve setAvailableReserves(typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setAvailableReserves(costType, costCategory, newReserveAmount, submittingUser);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the Benefits decision reason.
     * @param benefitsDecisionReason The benefits decision reason to set
     */
    public void setBenefitsDecisionReason(java.lang.String benefitsDecisionReason) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setBenefitsDecisionReason(benefitsDecisionReason);
    }
    
    /**
     * Sets the value of the BenefitsStatusDcsn field.
     */
    public void setBenefitsStatusDcsn(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BENEFITSSTATUSDCSN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Catastrophe field.
     */
    public void setCatastrophe(entity.Catastrophe value) {
      __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    public void setCatastropheID(gw.pl.persistence.core.Key value) {
      setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimISOMatchReports field.
     */
    public void setClaimISOMatchReports(entity.ClaimISOMatchReport[] value) {
      __getInternalInterface().setFieldValue(CLAIMISOMATCHREPORTS_PROP.get(), value);
    }
    
    public void setClaimIdsOnObjectsInBundle() {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setClaimIdsOnObjectsInBundle();
    }
    
    /**
     * Sets the value of the ClaimIndicators field.
     */
    public void setClaimIndicators(entity.ClaimIndicator[] value) {
      __getInternalInterface().setFieldValue(CLAIMINDICATORS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaimInfo(entity.ClaimInfo value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setClaimInfo(value);
    }
    
    /**
     * Sets the value of the ClaimInfoArray field.
     */
    public void setClaimInfoArray(entity.ClaimInfo[] value) {
      __getInternalInterface().setFieldValue(CLAIMINFOARRAY_PROP.get(), value);
    }
    
    public void setClaimInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLineNumber_Ext field.
     */
    public void setClaimLineNumber_Ext(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMLINENUMBER_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimMetricRecalculationTime field.
     */
    public void setClaimMetricRecalculationTime(entity.ClaimMetricRecalculationTime value) {
      __getInternalInterface().setFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimMetricRecalculationTimeArray field.
     */
    public void setClaimMetricRecalculationTimeArray(entity.ClaimMetricRecalculationTime[] value) {
      __getInternalInterface().setFieldValue(CLAIMMETRICRECALCULATIONTIMEARRAY_PROP.get(), value);
    }
    
    public void setClaimMetricRecalculationTimeID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMMETRICRECALCULATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimMetrics field.
     */
    public void setClaimMetrics(entity.ClaimMetric[] value) {
      __getInternalInterface().setFieldValue(CLAIMMETRICS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaimNumber(java.lang.String value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setClaimNumber(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaimRpt(entity.ClaimRpt value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setClaimRpt(value);
    }
    
    /**
     * Sets the value of the ClaimRptArray field.
     */
    public void setClaimRptArray(entity.ClaimRpt[] value) {
      __getInternalInterface().setFieldValue(CLAIMRPTARRAY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaimRptID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setClaimRptID(value);
    }
    
    /**
     * Sets the value of the ClaimSource field.
     */
    public void setClaimSource(typekey.ClaimSource value) {
      __getInternalInterface().setFieldValue(CLAIMSOURCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimSynchStates field.
     */
    public void setClaimSynchStates(entity.ClaimSynchState[] value) {
      __getInternalInterface().setFieldValue(CLAIMSYNCHSTATES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimTier field.
     */
    public void setClaimTier(typekey.ClaimTier value) {
      __getInternalInterface().setFieldValue(CLAIMTIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimTypeCode_Ext field.
     */
    public void setClaimTypeCode_Ext(typekey.ECFClaimTypeCode_Ext value) {
      __getInternalInterface().setFieldValue(CLAIMTYPECODE_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimWorkComp field.
     */
    public void setClaimWorkComp(entity.ClaimWorkComp value) {
      __getInternalInterface().setFieldValue(CLAIMWORKCOMP_PROP.get(), value);
    }
    
    public void setClaimWorkCompID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMWORKCOMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimantDenorm field.
     */
    public void setClaimantDenorm(entity.Contact value) {
      __getInternalInterface().setFieldValue(CLAIMANTDENORM_PROP.get(), value);
    }
    
    public void setClaimantDenormID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMANTDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimantRprtdDate field.
     */
    public void setClaimantRprtdDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLAIMANTRPRTDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimempdataArray field.
     */
    public void setClaimempdataArray(entity.Claimempdata[] value) {
      __getInternalInterface().setFieldValue(CLAIMEMPDATAARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedOutcome field.
     */
    public void setClosedOutcome(typekey.ClaimClosedOutcomeType value) {
      __getInternalInterface().setFieldValue(CLOSEDOUTCOME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ComputerSecurity field.
     */
    public void setComputerSecurity(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COMPUTERSECURITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConcurrentEmp field.
     */
    public void setConcurrentEmp(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(CONCURRENTEMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConcurrentEmpl field.
     */
    public void setConcurrentEmpl(entity.ConcurrentEmployment[] value) {
      __getInternalInterface().setFieldValue(CONCURRENTEMPL_PROP.get(), value);
    }
    
    /**
     * Sets the Contact in the given role to the given Contact.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is not exclusive, or if the Contact is non-null and
     *                                  the role is prohibited or constrained to a different Contact type.
     */
    public void setContactByRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.contact.EntityContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.EntityContactRoleOwner")).setContactByRole(role, contact);
    }
    
    /**
     * Sets the value of the Contacts field.
     */
    public void setContacts(entity.ClaimContact[] value) {
      __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContribFactors field.
     */
    public void setContribFactors(entity.ContribFactor[] value) {
      __getInternalInterface().setFieldValue(CONTRIBFACTORS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageInQuestion field.
     */
    public void setCoverageInQuestion(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COVERAGEINQUESTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCurrency(typekey.Currency value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setCurrency(value);
    }
    
    /**
     * Sets the value of the CurrentConditions field.
     */
    public void setCurrentConditions(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CURRENTCONDITIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCompDcsnDue field.
     */
    public void setDateCompDcsnDue(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATECOMPDCSNDUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCompDcsnMade field.
     */
    public void setDateCompDcsnMade(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATECOMPDCSNMADE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateEligibleForArchive field.
     */
    public void setDateEligibleForArchive(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEELIGIBLEFORARCHIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateFormGivenToEmp field.
     */
    public void setDateFormGivenToEmp(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEFORMGIVENTOEMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateFormRetByEmp field.
     */
    public void setDateFormRetByEmp(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEFORMRETBYEMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateRptdToAgent field.
     */
    public void setDateRptdToAgent(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATERPTDTOAGENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateRptdToEmployer field.
     */
    public void setDateRptdToEmployer(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATERPTDTOEMPLOYER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateRptdToInsured field.
     */
    public void setDateRptdToInsured(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATERPTDTOINSURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeathDate field.
     */
    public void setDeathDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(DEATHDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Deductibles field.
     */
    public void setDeductibles(entity.Deductible[] value) {
      __getInternalInterface().setFieldValue(DEDUCTIBLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DiagnosticCnsistnt field.
     */
    public void setDiagnosticCnsistnt(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DIAGNOSTICCNSISTNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Documents field.
     */
    public void setDocuments(entity.Document[] value) {
      __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DrugsInvolved field.
     */
    public void setDrugsInvolved(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(DRUGSINVOLVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DrugsPrescribed field.
     */
    public void setDrugsPrescribed(entity.DrugPrescribed[] value) {
      __getInternalInterface().setFieldValue(DRUGSPRESCRIBED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFLastUpdateTime field.
     */
    public void setECFLastUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ECFLASTUPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EEventTime_Ext field.
     */
    public void setEEventTime_Ext(java.util.Date value) {
      __getInternalInterface().setFieldValue(EEVENTTIME_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmpQusValidity field.
     */
    public void setEmpQusValidity(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(EMPQUSVALIDITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmpSentMPNNotice field.
     */
    public void setEmpSentMPNNotice(java.util.Date value) {
      __getInternalInterface().setFieldValue(EMPSENTMPNNOTICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmployerValidityReason field.
     */
    public void setEmployerValidityReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMPLOYERVALIDITYREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmploymentData field.
     */
    public void setEmploymentData(entity.EmploymentData value) {
      __getInternalInterface().setFieldValue(EMPLOYMENTDATA_PROP.get(), value);
    }
    
    public void setEmploymentDataID(gw.pl.persistence.core.Key value) {
      setFieldValue(EMPLOYMENTDATA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmploymentInjury field.
     */
    public void setEmploymentInjury(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EMPLOYMENTINJURY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Evaluations field.
     */
    public void setEvaluations(entity.Evaluation[] value) {
      __getInternalInterface().setFieldValue(EVALUATIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExaminationDate field.
     */
    public void setExaminationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXAMINATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureBegan field.
     */
    public void setExposureBegan(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXPOSUREBEGAN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureEnded field.
     */
    public void setExposureEnded(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXPOSUREENDED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposures field.
     */
    public void setExposures(entity.Exposure[] value) {
      __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Fault field.
     */
    public void setFault(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FaultRating field.
     */
    public void setFaultRating(typekey.FaultRating value) {
      __getInternalInterface().setFieldValue(FAULTRATING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FireDeptInfo field.
     */
    public void setFireDeptInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FIREDEPTINFO_PROP.get(), value);
    }
    
    /**
     * Set whether this was a first and final claim
     * @param value True if claim should be First and Final
     */
    public void setFirstAndFinal(boolean value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setFirstAndFinal(value);
    }
    
    /**
     * Sets the value of the FirstNoticeSuit field.
     */
    public void setFirstNoticeSuit(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FIRSTNOTICESUIT_PROP.get(), value);
    }
    
    /**
     * Adds a problem description to the claim
     * @param flaggedReason The reason for the flag
     */
    public void setFlag(java.lang.String flaggedReason) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setFlag(flaggedReason);
    }
    
    /**
     * Sets the value of the Flagged field.
     */
    public void setFlagged(typekey.FlaggedType value) {
      __getInternalInterface().setFieldValue(FLAGGED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlaggedDate field.
     */
    public void setFlaggedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FLAGGEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlaggedReason field.
     */
    public void setFlaggedReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FLAGGEDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FurtherTreatment field.
     */
    public void setFurtherTreatment(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FURTHERTREATMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HazardousWaste field.
     */
    public void setHazardousWaste(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(HAZARDOUSWASTE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the History field.
     */
    public void setHistory(entity.History[] value) {
      __getInternalInterface().setFieldValue(HISTORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HospitalDate field.
     */
    public void setHospitalDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(HOSPITALDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HospitalDays field.
     */
    public void setHospitalDays(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(HOSPITALDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HowReported field.
     */
    public void setHowReported(typekey.HowReportedType value) {
      __getInternalInterface().setFieldValue(HOWREPORTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ISOEnabled field.
     */
    public void setISOEnabled(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ISOENABLED_PROP.get(), value);
    }
    
    /**
     * Set error message if most recent ISO ClaimSearch request failed.
     * @param isoErrorMessage the new error message
     */
    public void setISOErrorMessage(java.lang.String isoErrorMessage) {
      ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).setISOErrorMessage(isoErrorMessage);
    }
    
    /**
     * Sets the value of the ISOKnown field.
     */
    public void setISOKnown(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ISOKNOWN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ISOReceiveDate field.
     */
    public void setISOReceiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ISORECEIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ISOSendDate field.
     */
    public void setISOSendDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ISOSENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ISOStatus field.
     */
    public void setISOStatus(typekey.ISOStatus value) {
      __getInternalInterface().setFieldValue(ISOSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentReport field.
     */
    public void setIncidentReport(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCIDENTREPORT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incidents field.
     */
    public void setIncidents(entity.Incident[] value) {
      __getInternalInterface().setFieldValue(INCIDENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InjWkrInMPN field.
     */
    public void setInjWkrInMPN(java.util.Date value) {
      __getInternalInterface().setFieldValue(INJWKRINMPN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InjuredOnPremises field.
     */
    public void setInjuredOnPremises(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INJUREDONPREMISES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InjuredRegularJob field.
     */
    public void setInjuredRegularJob(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INJUREDREGULARJOB_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredDenorm field.
     */
    public void setInsuredDenorm(entity.Contact value) {
      __getInternalInterface().setFieldValue(INSUREDDENORM_PROP.get(), value);
    }
    
    public void setInsuredDenormID(gw.pl.persistence.core.Key value) {
      setFieldValue(INSUREDDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredPremises field.
     * @deprecated True if the incident occurred on the employer's premises.
     */
    @java.lang.Deprecated
    public void setInsuredPremises(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INSUREDPREMISES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerSentMPNNotice field.
     */
    public void setInsurerSentMPNNotice(java.util.Date value) {
      __getInternalInterface().setFieldValue(INSURERSENTMPNNOTICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionState field.
     */
    public void setJurisdictionState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LMMessages field.
     */
    public void setLMMessages(entity.LMMessage_Ext[] value) {
      __getInternalInterface().setFieldValue(LMMESSAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LOBCode field.
     */
    public void setLOBCode(typekey.LOBCode value) {
      __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LargeLossNotificationStatus field.
     */
    public void setLargeLossNotificationStatus(typekey.LargeLossNotificationStatus value) {
      __getInternalInterface().setFieldValue(LARGELOSSNOTIFICATIONSTATUS_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LitigationStatus field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setLitigationStatus(typekey.LitigationStatus value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setLitigationStatus(value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LocationCode field.
     */
    public void setLocationCode(entity.PolicyLocation value) {
      __getInternalInterface().setFieldValue(LOCATIONCODE_PROP.get(), value);
    }
    
    public void setLocationCodeID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOCATIONCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LocationOfTheft field.
     */
    public void setLocationOfTheft(typekey.LocationOfTheft value) {
      __getInternalInterface().setFieldValue(LOCATIONOFTHEFT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossCause field.
     */
    public void setLossCause(typekey.LossCause value) {
      __getInternalInterface().setFieldValue(LOSSCAUSE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDate field.
     */
    public void setLossDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossEndDate_Ext field.
     */
    public void setLossEndDate_Ext(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSENDDATE_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocation field.
     */
    public void setLossLocation(entity.Address value) {
      __getInternalInterface().setFieldValue(LOSSLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocationCode field.
     */
    public void setLossLocationCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get(), value);
    }
    
    public void setLossLocationID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOSSLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocationSpatialDenorm field.
     */
    public void setLossLocationSpatialDenorm(gw.api.database.spatial.SpatialPoint value) {
      __getInternalInterface().setFieldValue(LOSSLOCATIONSPATIALDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MMIdate field.
     */
    public void setMMIdate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MMIDATE_PROP.get(), value);
    }
    
    /**
     * Sets the description of Max Medical Improvement for Workers Comp Claim.
     * @param mminote the description of the maximum medical improvement
     */
    public void setMMInote(java.lang.String mminote) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setMMInote(mminote);
    }
    
    /**
     * Sets the value of the MainContactType field.
     */
    public void setMainContactType(typekey.PersonRelationType value) {
      __getInternalInterface().setFieldValue(MAINCONTACTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ManifestationDate field.
     */
    public void setManifestationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MANIFESTATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Matters field.
     */
    public void setMatters(entity.Matter[] value) {
      __getInternalInterface().setFieldValue(MATTERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedicalContactStatus field.
     */
    public void setMedicalContactStatus(entity.MedicalContactStatus[] value) {
      __getInternalInterface().setFieldValue(MEDICALCONTACTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the description of Medical Diagnosis for Workers Comp Claim.
     * @param medicalDiagnosis The medical diagnosis
     */
    public void setMedicalDiagnosis(java.lang.String medicalDiagnosis) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setMedicalDiagnosis(medicalDiagnosis);
    }
    
    /**
     * Sets the value of the MedicalTreatments field.
     */
    public void setMedicalTreatments(entity.MedicalTreatment[] value) {
      __getInternalInterface().setFieldValue(MEDICALTREATMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroReports field.
     */
    public void setMetroReports(entity.MetroReport[] value) {
      __getInternalInterface().setFieldValue(METROREPORTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ModifiedDutyAvail field.
     */
    public void setModifiedDutyAvail(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MODIFIEDDUTYAVAIL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Mold field.
     */
    public void setMold(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MOLD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Negotiations field.
     */
    public void setNegotiations(entity.Negotiation[] value) {
      __getInternalInterface().setFieldValue(NEGOTIATIONS_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Notes field.
     */
    public void setNotes(entity.Note[] value) {
      __getInternalInterface().setFieldValue(NOTES_PROP.get(), value);
    }
    
    /**
     * Sets the Objective Findings for Workers Comp Claim.
     * @param objFindings The objective findings
     */
    public void setObjFindings(java.lang.String objFindings) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setObjFindings(objFindings);
    }
    
    /**
     * Sets the value of the Officials field.
     */
    public void setOfficials(entity.Official[] value) {
      __getInternalInterface().setFieldValue(OFFICIALS_PROP.get(), value);
    }
    
    /**
     * Sets the open recovery reserves for this claim to the given amount by
     * creating a recovery reserve that increases or decreases the current open
     * recovery reserves.
     * @param costType The cost type for the recovery reserve.  This value cannot be <code>null</code>.
     * @param costCategory The cost category for the recovery reserve.  This value cannot be <code>null</code>.
     * @param recoveryCategory The recovery category for the recovery reserve.  This value cannot be <code>null</code>.
     * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
     * @param submittingUser User submitting this recovery reserve.
     * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims).
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve.
     * @throws com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException if the recovery reserve has an illegal status
     * @return the new reserve (Note: the amount of the returned reserve should not be changed).
     *         The method will return null if new reserve is not created.
     */
    public entity.RecoveryReserve setOpenRecoveryReserves(typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setOpenRecoveryReserves(costType, costCategory, recoveryCategory, newRecoveryReserveAmount, submittingUser);
    }
    
    /**
     * Sets the value of the OtherBenefits field.
     */
    public void setOtherBenefits(entity.OtherBenefit[] value) {
      __getInternalInterface().setFieldValue(OTHERBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherRecovStatus field.
     */
    public void setOtherRecovStatus(typekey.OtherRecoverableStatus value) {
      __getInternalInterface().setFieldValue(OTHERRECOVSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTPinMPN field.
     */
    public void setPTPinMPN(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PTPINMPN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PermissionRequired field.
     */
    public void setPermissionRequired(typekey.ClaimSecurityType value) {
      __getInternalInterface().setFieldValue(PERMISSIONREQUIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PoliceDeptInfo field.
     */
    public void setPoliceDeptInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICEDEPTINFO_PROP.get(), value);
    }
    
    /**
     * Sets the policy for this claim.  This method:
     *  <ol>
     *  <li>Makes sure the policy type is applicable for this claim</li>
     *  <li>Makes sure we can edit this claim</li>
     *  <li>Copies the policy and everything in the policy's bundle into our bundle</li>
     *  <li>Adds a set policy history event</li>
     *  <li>Sets the policy ptr for this claim</li>
     *  <li>Evicts from the bundle any entities not rooted at the claim</li>
     *  </ol>
     * 
     *  NOTE: If there are objects in the claim (such as exposures) which refer to objects (such as vehicles) which are
     *  not present in the new policy, references to the missing objects will be set to null.
     * @param value the policy to set
     * @throws com.guidewire.cc.domain.policy.exception.InvalidPolicyType if the policy type is not applicable to this claim
     * @throws com.guidewire.cc.domain.policy.exception.CannotChangeCurrencyException if policy's currency is different from this claim's currency and isCurrencyEditable() returns false
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPolicy(entity.Policy value) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setPolicy(value);
    }
    
    public void setPolicy(entity.Policy policy, entity.KeyableBean[] beanRoots) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setPolicy(policy, beanRoots);
    }
    
    public void setPolicyID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyLocationSummaryJoin field.
     */
    public void setPolicyLocationSummaryJoin(entity.PolicyLocationSummaryJoin value) {
      __getInternalInterface().setFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyLocationSummaryJoinArray field.
     */
    public void setPolicyLocationSummaryJoinArray(entity.PolicyLocationSummaryJoin[] value) {
      __getInternalInterface().setFieldValue(POLICYLOCATIONSUMMARYJOINARRAY_PROP.get(), value);
    }
    
    public void setPolicyLocationSummaryJoinID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICYLOCATIONSUMMARYJOIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreexDisblty field.
     */
    public void setPreexDisblty(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PREEXDISBLTY_PROP.get(), value);
    }
    
    /**
     * Sets the Preexisting Disability Info for Workers Comp Claim.
     * @param preexDisbltyInfo The preexisting disability info
     */
    public void setPreexDisbltyInfo(java.lang.String preexDisbltyInfo) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setPreexDisbltyInfo(preexDisbltyInfo);
    }
    
    /**
     * Sets the value of the PreviousGroup field.
     */
    public void setPreviousGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    public void setPreviousGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousQueue field.
     */
    public void setPreviousQueue(entity.AssignableQueue value) {
      __getInternalInterface().setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    public void setPreviousQueueID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSQUEUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PreviousUser field.
     */
    public void setPreviousUser(entity.User value) {
      __getInternalInterface().setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    public void setPreviousUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(PREVIOUSUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Progress field.
     */
    public void setProgress(typekey.ClaimProgressType value) {
      __getInternalInterface().setFieldValue(PROGRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PropertyFireDamage field.
     */
    public void setPropertyFireDamage(entity.PropertyFireDamage value) {
      __getInternalInterface().setFieldValue(PROPERTYFIREDAMAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PropertyFireDamageArray field.
     */
    public void setPropertyFireDamageArray(entity.PropertyFireDamage[] value) {
      __getInternalInterface().setFieldValue(PROPERTYFIREDAMAGEARRAY_PROP.get(), value);
    }
    
    public void setPropertyFireDamageID(gw.pl.persistence.core.Key value) {
      setFieldValue(PROPERTYFIREDAMAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PropertyWaterDamage field.
     */
    public void setPropertyWaterDamage(entity.PropertyWaterDamage value) {
      __getInternalInterface().setFieldValue(PROPERTYWATERDAMAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PropertyWaterDamageArray field.
     */
    public void setPropertyWaterDamageArray(entity.PropertyWaterDamage[] value) {
      __getInternalInterface().setFieldValue(PROPERTYWATERDAMAGEARRAY_PROP.get(), value);
    }
    
    public void setPropertyWaterDamageID(gw.pl.persistence.core.Key value) {
      setFieldValue(PROPERTYWATERDAMAGE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the PurgeDate field.
     */
    public void setPurgeDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(PURGEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RIAgreementGroups field.
     */
    public void setRIAgreementGroups(entity.RIAgreementGroup[] value) {
      __getInternalInterface().setFieldValue(RIAGREEMENTGROUPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RICodings field.
     */
    public void setRICodings(entity.RICoding[] value) {
      __getInternalInterface().setFieldValue(RICODINGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReOpenDate field.
     */
    public void setReOpenDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(REOPENDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsuranceFlaggedStatus field.
     */
    public void setReinsuranceFlaggedStatus(typekey.ReinsuranceFlaggedStatus value) {
      __getInternalInterface().setFieldValue(REINSURANCEFLAGGEDSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the reinsurance reason.
     * @param reinsuranceReason The reason
     */
    public void setReinsuranceReason(java.lang.String reinsuranceReason) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setReinsuranceReason(reinsuranceReason);
    }
    
    /**
     * Sets the value of the ReinsuranceReportable field.
     */
    public void setReinsuranceReportable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REINSURANCEREPORTABLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReopenedReason field.
     */
    public void setReopenedReason(typekey.ClaimReopenedReason value) {
      __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportedByType field.
     */
    public void setReportedByType(typekey.PersonRelationType value) {
      __getInternalInterface().setFieldValue(REPORTEDBYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportedDate field.
     */
    public void setReportedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(REPORTEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReserveLines field.
     */
    public void setReserveLines(entity.ReserveLine[] value) {
      __getInternalInterface().setFieldValue(RESERVELINES_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RoleAssignments field.
     */
    public void setRoleAssignments(entity.UserRoleAssignment[] value) {
      __getInternalInterface().setFieldValue(ROLEASSIGNMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SIAnswerSet field.
     */
    public void setSIAnswerSet(entity.SIUAnswerSet[] value) {
      __getInternalInterface().setFieldValue(SIANSWERSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SIEscalateSIU field.
     */
    public void setSIEscalateSIU(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(SIESCALATESIU_PROP.get(), value);
    }
    
    /**
     * Sets the storage SIU Escalation note for the Claim.
     * @param escalationNote The escalation note
     */
    public void setSIEscalateSIUNote(java.lang.String escalationNote) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setSIEscalateSIUNote(escalationNote);
    }
    
    /**
     * Sets the value of the SIEscalateSIUdate field.
     */
    public void setSIEscalateSIUdate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SIESCALATESIUDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SIScore field.
     */
    public void setSIScore(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SISCORE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SITriggers field.
     */
    public void setSITriggers(entity.SITrigger[] value) {
      __getInternalInterface().setFieldValue(SITRIGGERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SIULifeCycleState field.
     */
    public void setSIULifeCycleState(typekey.ClaimLifeCycleState value) {
      __getInternalInterface().setFieldValue(SIULIFECYCLESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SIUStatus field.
     */
    public void setSIUStatus(typekey.SIUStatus value) {
      __getInternalInterface().setFieldValue(SIUSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SafetyEquipProv field.
     */
    public void setSafetyEquipProv(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SAFETYEQUIPPROV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SafetyEquipUsed field.
     */
    public void setSafetyEquipUsed(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SAFETYEQUIPUSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageStatus field.
     */
    public void setSalvageStatus(typekey.SalvageStatus value) {
      __getInternalInterface().setFieldValue(SALVAGESTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Segment field.
     */
    public void setSegment(typekey.ClaimSegment value) {
      __getInternalInterface().setFieldValue(SEGMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequests field.
     */
    public void setServiceRequests(entity.ServiceRequest[] value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ShowMedicalFirstInfo field.
     */
    public void setShowMedicalFirstInfo(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(SHOWMEDICALFIRSTINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpecialHandlingFinancialState field.
     */
    public void setSpecialHandlingFinancialState(entity.SpecialHandlingFinancialState value) {
      __getInternalInterface().setFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpecialHandlingFinancialStateArray field.
     */
    public void setSpecialHandlingFinancialStateArray(entity.SpecialHandlingFinancialState[] value) {
      __getInternalInterface().setFieldValue(SPECIALHANDLINGFINANCIALSTATEARRAY_PROP.get(), value);
    }
    
    public void setSpecialHandlingFinancialStateID(gw.pl.persistence.core.Key value) {
      setFieldValue(SPECIALHANDLINGFINANCIALSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.ClaimState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StateAckNumber field.
     */
    public void setStateAckNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STATEACKNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StateFileNumber field.
     */
    public void setStateFileNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STATEFILENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatuteDate field.
     */
    public void setStatuteDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STATUTEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageBarCodeNum field.
     */
    public void setStorageBarCodeNum(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STORAGEBARCODENUM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageBoxNum field.
     */
    public void setStorageBoxNum(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STORAGEBOXNUM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageCategory field.
     */
    public void setStorageCategory(typekey.StorageCategory value) {
      __getInternalInterface().setFieldValue(STORAGECATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageDate field.
     */
    public void setStorageDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STORAGEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageLocationState field.
     */
    public void setStorageLocationState(typekey.State value) {
      __getInternalInterface().setFieldValue(STORAGELOCATIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the storage notes for the claim.
     * @param storageNotes The storage notes
     */
    public void setStorageNotes(java.lang.String storageNotes) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setStorageNotes(storageNotes);
    }
    
    /**
     * Sets the value of the StorageType field.
     */
    public void setStorageType(typekey.StorageType value) {
      __getInternalInterface().setFieldValue(STORAGETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageVolumes field.
     */
    public void setStorageVolumes(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STORAGEVOLUMES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Strategy field.
     */
    public void setStrategy(typekey.ClaimStrategy value) {
      __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
    }
    
    /**
     * Sets the subjective complaints for a workers comp claim.
     * @param subjComplaints The subjective complaints
     */
    public void setSubjComplaints(java.lang.String subjComplaints) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setSubjComplaints(subjComplaints);
    }
    
    /**
     * Sets the value of the SubrogationSummary field.
     */
    public void setSubrogationSummary(entity.SubrogationSummary value) {
      __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationSummaryArray field.
     */
    public void setSubrogationSummaryArray(entity.SubrogationSummary[] value) {
      __getInternalInterface().setFieldValue(SUBROGATIONSUMMARYARRAY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setSubrogationSummaryID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).setSubrogationSummaryID(value);
    }
    
    /**
     * Sets the value of the SupplementalWorkloadWeight field.
     */
    public void setSupplementalWorkloadWeight(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Text field.
     */
    public void setText(entity.ClaimText[] value) {
      __getInternalInterface().setFieldValue(TEXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Transactions field.
     * @deprecated Transactions relating to this claim.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the claim.
     */
    @java.lang.Deprecated
    public void setTransactions(entity.Transaction[] value) {
      __getInternalInterface().setFieldValue(TRANSACTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TreatedPatientBfr field.
     */
    public void setTreatedPatientBfr(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TREATEDPATIENTBFR_PROP.get(), value);
    }
    
    /**
     * Sets the description of TreatmentRendered for Workers Comp Claim.
     * @param treatmentRend The treatment rendered description
     */
    public void setTreatmentRend(java.lang.String treatmentRend) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).setTreatmentRend(treatmentRend);
    }
    
    /**
     * Sets the value of the UCR_Ext field.
     */
    public void setUCR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UCR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UMR_Ext field.
     */
    public void setUMR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UMR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UberPrecautionaryFlag_Ext field.
     */
    public void setUberPrecautionaryFlag_Ext(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(UBERPRECAUTIONARYFLAG_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VCSIndicator_Ext field.
     */
    public void setVCSIndicator_Ext(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VCSINDICATOR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidationLevel field.
     */
    public void setValidationLevel(typekey.ValidationLevel value) {
      __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
    }
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
    }
    
    /**
     * Sets the value of the Weather field.
     */
    public void setWeather(typekey.WeatherType value) {
      __getInternalInterface().setFieldValue(WEATHER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WeatherRelated field.
     */
    public void setWeatherRelated(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WEATHERRELATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Workflows field.
     */
    public void setWorkflows(entity.ClaimWorkflow[] value) {
      __getInternalInterface().setFieldValue(WORKFLOWS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkloadUpdated field.
     */
    public void setWorkloadUpdated(java.util.Date value) {
      __getInternalInterface().setFieldValue(WORKLOADUPDATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkloadWeight field.
     */
    public void setWorkloadWeight(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKLOADWEIGHT_PROP.get(), value);
    }
    
    /**
     * Called on an assignable to decide if the assignment on the parent assignable should be cascaded
     * to this assignable.
     * @param parent the parent assignable
     * @param defaultOwnerUserId the id of the special default owner user, used by the assignment engine
     *   as the user of last resort if, for example, assignment rules can't find an appropriate user.
     * @param defaultGroupId the id of the root group, used by the assignment engine as the group of last
     *   resort if, for example, assignment rules can't find an appropriate group.
     * @return true if the assignment should be cascaded, false otherwise
     */
    public boolean shouldCascadeAssignment(entity.Assignable parent, gw.pl.persistence.core.Key defaultOwnerUserId, gw.pl.persistence.core.Key defaultGroupId) {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).shouldCascadeAssignment(parent, defaultOwnerUserId, defaultGroupId);
    }
    
    /**
     * Skip archival of this claim. Usually called by a rule when it has determined
     * that the claim is not ready to be archived yet.  Unlike reportArchiveProblem(),
     * this method returns immediately and no more rules are processed.
     * @param reason The reason for skipping.
     */
    public void skipFromArchiving(java.lang.String reason) {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).skipFromArchiving(reason);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    /**
     * Removes the role from the given User on this assignable object.
     * @param user 
     * @param role 
     */
    public void unassignUserRole(entity.User user, typekey.UserRole role) {
      ((gw.api.assignment.UserRoleOwner)__getDelegateManager().getImplementation("gw.api.assignment.UserRoleOwner")).unassignUserRole(user, role);
    }
    
    /**
     * Updates all claim and exposure metrics on the given claim immediately.
     * 
     * NOTE: This method is not intended be called directly.  Please use {@link com.guidewire.cc.domain.claim.impl.ClaimImpl#scheduleHealthUpdate() claim.scheduleHealthUpdate()}
     * instead to update after pre update rules and entity callbacks.
     */
    public void updateClaimMetrics() {
      ((gw.api.metric.ClaimUpdateMetricsMethods)__getDelegateManager().getImplementation("gw.api.metric.ClaimUpdateMetricsMethods")).updateClaimMetrics();
    }
    
    /**
     * Matches Claim.LossLocation against the PolicyLocationSummary data extracted from the
     * policy system for catastrophes and updates PolicyLocationSummaryJoin.
     */
    public void updatePolicyLocationSummaryJoin() {
      ((gw.api.heatmap.CatastropheMethods)__getDelegateManager().getImplementation("gw.api.heatmap.CatastropheMethods")).updatePolicyLocationSummaryJoin();
    }
    
    public boolean userGrantedAccess(entity.User user, typekey.SystemPermissionType permission) {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).userGrantedAccess(user, permission);
    }
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    /**
     * Executes new claim validation rules on the supplied claim, and returns a validation object containing any errors
     * (if validation was successful, an empty validation object is returned). Note that this method has the side-effect of
     * setting the validation level, and hence requires that the current user have Claim EDIT permissions, or
     * will throw an exception.
     * @param validateExposures If true, validates the claim and all the claim's exposures. Otherwise, validates the claim only.
     * @throws InsufficientPermissionException If the current user does not have Claim EDIT permissions
     * @return The validation result
     */
    public gw.api.validation.ValidationResult validate(boolean validateExposures) {
      return ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).validate(validateExposures);
    }
    
    public com.guidewire.pl.system.locale.UserMessage[] validateAllAssignments() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).validateAllAssignments();
    }
    
    public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateAllRoles() {
      return ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).validateAllRoles();
    }
    
    public com.guidewire.pl.system.locale.UserMessage[] validateAssignments() {
      return ((com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods")).validateAssignments();
    }
    
    /**
     * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
    }
    
    /**
     * Validates this claim and, if the verifyExposures flag is true, then each of its exposures.
     * Throws NewCheckAbilityToPayFailedException if the {@link typekey.ValidationLevel#TC_PAYMENT}
     * validation level is not reached for the claim.
     * @param verifyExposures if <code>true</code> then all the claim's exposure are also verified, though no EntityValidationException will be thrown even if one of
     *                        the exposures fails validation.
     * @throws EntityValidationException if the claim does not pass the payment validation level.
     * @throws InsufficientPermissionException if all exposures throw such an exception
     */
    public void verifyAbilityToPay(boolean verifyExposures) throws gw.api.validation.EntityValidationException, com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((gw.cc.claim.entity.Claim)__getDelegateManager().getImplementation("gw.cc.claim.entity.Claim")).verifyAbilityToPay(verifyExposures);
    }
    
    public void verifyAbilityToPayOnExposures(entity.Exposure[] exposuresToCheck) throws gw.api.validation.EntityValidationException, com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((com.guidewire.cc.domain.claim.impl.ClaimInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimInternal")).verifyAbilityToPayOnExposures(exposuresToCheck);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.cc.domain.claim.impl.ClaimInternal", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.cc.domain.email.CCEmailSupport", "com.guidewire.cc.domain.claim.impl.ClaimEmailSupportImpl");
    config.put("com.guidewire.cc.domain.purging.Purgeable", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.assignment.AssignablePublicMethods", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.domain.contact.ContactGraphGenerator", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.system.entity.LevelAwareValidatableBean", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.api.assignment.CCAssignableMethods", "gw.assignment.ClaimAssignableMethodsImpl");
    config.put("gw.api.assignment.UserRoleOwner", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.api.assignment.workload.entity.WeightedWorkloadMethods", "gw.assignment.workload.entity.ClaimWeightedWorkloadMethodsImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.api.financials.CheckCreatorProvider", "gw.api.financials.CheckCreatorProviderImpl");
    config.put("gw.api.heatmap.CatastropheMethods", "gw.claim.catastrophe.CatastropheMethodsImpl");
    config.put("gw.api.metric.ClaimUpdateMetricsMethods", "gw.claim.metric.ClaimUpdateMetricsMethodsImpl");
    config.put("gw.api.question.AnswerContainer", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.api.question.AnswerSetContainer", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.api.specialhandling.ClaimSpecialHandlingMethods", "gw.specialhandling.ClaimSpecialHandlingMethodsImpl");
    config.put("gw.cc.assignment.entity.CCAssignable", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.cc.claim.entity.Claim", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.cc.iso.entity.ISOReportable", "com.guidewire.cc.domain.claim.impl.ClaimImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Claim.class, config);
    com.guidewire._generated.entity.ClaimInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Claim, com.guidewire._generated.entity.ClaimInternal>() {
      public java.lang.Object getImplementation(entity.Claim bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimInternal getInternalInterface(entity.Claim bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Claim newEmptyInstance() {
        return new entity.Claim((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
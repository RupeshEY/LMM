package entity;

/**
 * Exposure
 * 
 *       A discrete piece of a claim that involves a single type of loss (for example,
 *       vehicle damage or bodily injury) to a specific claimant. Contains data to
 *       describe the exposure and to track the current status of the exposure. Many
 *       exposure fields are specific to certain types of exposures and will be left
 *       blank on other types.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Exposure.eti;Exposure.eix;Exposure.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Exposure")
public class Exposure extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Extractable, entity.CCAssignable, entity.WorkloadDelegate, entity.ISOReportable, entity.UserRoleOwner, entity.ClaimContactRoleOwner, entity.EventAware, com.guidewire.cc.domain.email.CCEmailSupport, gw.api.assignment.CCAssignableMethods, gw.api.assignment.UserRoleOwner {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Exposure> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Exposure>("entity.Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACTIVITIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Activities");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNMENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignmentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSIGNMENTSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AssignmentStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVERAGEWEEKLYWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AverageWeeklyWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BENEFITPERIODS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BenefitPeriods");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BREAKIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BreakIn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMANTDENORM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimantDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMANTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimantType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CloseDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLOSEDOUTCOME_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClosedOutcome");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> COMPBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CompBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTPERMITTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactPermitted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> COVERAGE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Coverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVERAGESUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoverageSubType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTCONDITIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentConditions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DAYSINWEEK_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DaysInWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DEATHBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DeathBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEPRECIATEDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DepreciatedValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DIAGNOSTICCNSISTNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DiagnosticCnsistnt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DISBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DisBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DOCUMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Documents");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ECFEXPOSUREID_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ECFExposureId_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXAMINATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExaminationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSUREISOMATCHREPORTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ExposureISOMatchReports");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURELIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSUREMETRICS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ExposureMetrics");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURERPT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ExposureRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSURERPTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ExposureRptArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EXPOSURESYNCHSTATES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ExposureSynchStates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EXPOSURETIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ExposureTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EXPOSURETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ExposureType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FURTHERTREATMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FurtherTreatment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HOSPITALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HospitalDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HOSPITALDAYS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HospitalDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> IMEPERFORMED_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "IMEPerformed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOKNOWN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOKnown");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISORECEIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOReceiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ISOSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ISOSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ISOStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INCIDENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Incident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTLIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "JurisdictionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTDAYWORKED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastDayWorked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LIFEPENSIONBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LifePensionBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Locked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSPARTY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossParty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSTPROPERTYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LostPropertyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> MEDICALACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "MedicalActions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> METRICLIMITGENERATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MetricLimitGeneration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NEWEMPDATA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NewEmpData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NOTES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Notes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OCR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OCR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERCOVERAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OtherCoverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OTHERCOVERAGEDET_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "OtherCoverageDet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERCOVERAGEINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OtherCoverageInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OTHERCOVGCHOICE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OtherCovgChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PIPCLAIMAGGLIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PIPClaimAggLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PIPDEATHBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PIPDeathBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PIPESSLIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PIPESSLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PIPNONMEDAGGLIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PIPNonMedAggLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PIPPERSONAGGLIMITREACHED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PIPPersonAggLimitReached");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PIPVOCBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PIPVocBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PPDBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PPDBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PTDBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PTDBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSQUEUE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PREVIOUSUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PreviousUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PRIMARYCOVERAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PrimaryCoverage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PRIOREMPDATA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PriorEmpData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROGRESS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Progress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RIAGREEMENTGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RIAgreementGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RIGROUPSETEXTERNALLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RIGroupSetExternally");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RSBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RSBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REOPENDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReOpenDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REOPENEDREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReopenedReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPLACEMENTVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReplacementValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RESERVELINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ReserveLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLEASSIGNMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RoleAssignments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SSBENEFIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SSBenefit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SSDIBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SSDIBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SSDIELIGIBLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SSDIEligible");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SECURITYLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SecurityLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SEGMENT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Segment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SERVICEREQUESTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ServiceRequests");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettleDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettleMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SETTLEMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Settlements");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> STATLINE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "StatLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STRATEGY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Strategy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUPPLEMENTALWORKLOADWEIGHT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SupplementalWorkloadWeight");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TPDBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TPDBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TTDBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TTDBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TEMPLOCATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TempLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TEXT_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Text");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Transactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TREATEDPATIENTBFR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TreatedPatientBfr");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALIDATIONLEVEL_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValidationLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VOCBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "VocBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WCBENEFIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WCBenefit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> WCBENEFITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "WCBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WCPREEXDISBLTY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WCPreexDisblty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WCPREEXDISBLTYINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WCPreexDisbltyInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGEBENEFIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WageBenefit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGESTMTRECD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WageStmtRecd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGESTMTSENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WageStmtSent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADUPDATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkloadUpdated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADWEIGHT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkloadWeight");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ExposureInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final java.lang.String ASSIGNMENTADDED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTADDED_EVENT;
  
  public static final java.lang.String ASSIGNMENTCHANGED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTCHANGED_EVENT;
  
  public static final java.lang.String ASSIGNMENTREMOVED_EVENT = com.guidewire.pl.domain.assignment.AssignablePublicMethods.ASSIGNMENTREMOVED_EVENT;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  public static final gw.api.exposure.PublicExposureFinder finder = gw.cc.exposure.entity.Exposure.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Exposure()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Exposure(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Exposure(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ExposureInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ExposureInternal __getInternalInterface() {
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
   * Adds the given element to the BenefitPeriods array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBenefitPeriods(entity.BenefitPeriod element) {
    __getInternalInterface().addArrayElement(BENEFITPERIODS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.Document element) {
    __getInternalInterface().addArrayElement(DOCUMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ExposureISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureISOMatchReports(entity.ExposureISOMatchReport element) {
    __getInternalInterface().addArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ExposureMetrics array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureMetrics(entity.ExposureMetric element) {
    __getInternalInterface().addArrayElement(EXPOSUREMETRICS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ExposureSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureSynchStates(entity.ExposureSynchState element) {
    __getInternalInterface().addArrayElement(EXPOSURESYNCHSTATES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the IMEPerformed array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIMEPerformed(entity.IMEPerformed element) {
    __getInternalInterface().addArrayElement(IMEPERFORMED_PROP.get(), element);
  }
  
  /**
   * Add the given match report to the array of match reports on this Claim/Exposure
   * @param report the report to be added
   */
  public void addToISOMatchReports(entity.ISOMatchReport report) {
    ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addToISOMatchReports(report);
  }
  
  /**
   * Adds the given element to the MedicalActions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMedicalActions(entity.MedicalAction element) {
    __getInternalInterface().addArrayElement(MEDICALACTIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNotes(entity.Note element) {
    __getInternalInterface().addArrayElement(NOTES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the OtherCoverageDet array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherCoverageDet(entity.OtherCoverageDetail element) {
    __getInternalInterface().addArrayElement(OTHERCOVERAGEDET_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserveLines(entity.ReserveLine element) {
    __getInternalInterface().addArrayElement(RESERVELINES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoleAssignments(entity.UserRoleAssignment element) {
    __getInternalInterface().addArrayElement(ROLEASSIGNMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element) {
    __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequests(entity.ServiceRequest element) {
    __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Settlements array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSettlements(entity.Settlement element) {
    __getInternalInterface().addArrayElement(SETTLEMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText(entity.ExposureText element) {
    __getInternalInterface().addArrayElement(TEXT_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  public void addToTransactions(entity.Transaction element) {
    __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
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
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).assignUserRole(user, group, role);
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
   * Calculates the initial reserve on this exposure.
   * @param userID The requesting user of the <code>ReserveSet</code>.
   * @return the set of initial reserves created by the <code>IInitialReserveAdapter</code>.
   */
  public entity.Reserve[] calculateInitialReserve(gw.pl.persistence.core.Key userID) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).calculateInitialReserve(userID);
  }
  
  /**
   * Returns true if this exposure in the open state, has no awaiting submission,
   * future payments tied to it, and the specified user has permission to close it.
   * @param user The user whose permissions should be checked.
   * @return <code>true</code> if the specified user can close this exposure.
   */
  public boolean canClose(entity.User user) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canClose(user);
  }
  
  /**
   * Returns whether the given user can create a reserve on this exposure.
   * @param user the user to test whether he can create a reserve on this exposure.
   * @return true if current user has reserve authority and exposure is open, false otherwise.
   */
  public boolean canCreateReserve(entity.User user) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canCreateReserve(user);
  }
  
  /**
   * Determines whether this owner can be edited.
   */
  public boolean canEdit() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
  }
  
  /**
   * <p>
   * Returns true if the specified user can re-open this exposure.
   * </p>
   * This is only true if:
   * <ul>
   * <li>this exposure is currently closed</li>
   * <li>the claim is currently open</li>
   * <li>the user has permission to reopen the exposure</li>
   * </ul>
   * @param user The user whose permissions to check.
   * @return <code>true</code> iff the specified user can re-open this exposure.
   */
  public boolean canReopen(entity.User user) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canReopen(user);
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
   */
  public void clearRoleCache() {
    ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
  }
  
  /**
   * Closes the exposure and zeros out the exposure's open reserves.
   * @param outcome the outcome of the exposure
   * @param reason a string explaining the reason why this exposure is being closed
   * @throws <code>CloseException</code> if this exposure is already closed
   * @throws <code>EntityValidationException</code> thrown if the exposure itself cannot be closed (that is,  it fails validation)
   */
  public void close(typekey.ExposureClosedOutcomeType outcome, java.lang.String reason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).close(outcome, reason);
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
   * Creates a check on this exposure with the given parameters.  The check
   * will contain one partial payment with one line item.
   * @param payee The payee of the check.
   * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other).
   * @param recipient The contact the check should be sent to.
   * @param mailingAddress The address the check should be sent to.
   * @param reportabilityType The reportability type of the check.
   * @param costType The <code>CostType</code> for the payment - can be <code>null</code>, in which case a
   *                          default value of <code>Unspecified</code> is used.
   * @param costCategory The <code>CostCategory</code> for the payment - can be <code>null</code>, in which case a
   *                          default value of <code>Unspecified</code> is used.
   * @param lineCategory The category for the payment line item.
   * @param checkAmount The amount of the payment line item (and therefore the check).
   * @param comments Comments on this check.
   * @param memo The memo for the check.
   * @param payTo The pay to for the check.
   * @param scheduledSendDate The scheduled send date of the check.
   * @param requestingUser The user requesting this check.
   * @throws <code>InsufficientAuthorityException</code> if the submitting user does not have authority to create the check
   * @throws <code>WorkflowValidationException</code> if there is a problem during workflow validation
   * @throws <code>DeductionAdapterException</code> if a configured <code>IDeductionAdapter</code> is unavailable or experiences some other error
   *          while trying to get the deductions.
   * @return the created check
   * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
   */
  public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
  }
  
  /**
   * Creates a check on this exposure with the given parameters.  The check
   * will contain one payment with one line item.  The difference between this method and the
   * other very similar version is that this version allows a specific <code>PaymentType</code> to be specified
   * for the new check's payment.
   * @param payee The payee of the check.
   * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other).
   * @param recipient The contact the check should be sent to.
   * @param mailingAddress The address the check should be sent to.
   * @param reportabilityType The reportability type of the check.
   * @param costType The <code>CostType</code> for the payment - cannot be <code>null</code>, an IllegalArgumentException will be thrown.
   * @param costCategory The <code>CostCategory</code> for the payment - cannot be <code>null</code>, an IllegalArgumentException will be thrown.
   * @param paymentType The <code>PaymentType</code> for this payment - can be <code>null</code>, in which case the
   *                          payment type defaults to <code>Partial</code>.
   * @param lineCategory The category for the payment line item.
   * @param checkAmount The amount of the payment line item (and therefore the check).
   * @param comments Comments on this check.
   * @param memo The memo for the check .
   * @param payTo The pay to for the check.
   * @param scheduledSendDate The scheduled send date of the check.
   * @param requestingUser The user requesting this check
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the check
   * @throws WorkflowValidationException if there is a problem during workflow validation
   * @throws DeductionAdapterException if a configured <code>IDeductionAdapter</code> is unavailable or experiences some other error
   *                                        while trying to get the deductions.
   * @return the created check
   * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
   */
  public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
  }
  
  /**
   * Creates a check on this exposure with the given parameters.  The check
   * will contain one payment with one line item.  The difference between this method and the
   * other very similar version is that this version allows a specific <code>PaymentType</code> to be specified
   * for the new check's payment.
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
   * @param checkCurrency The Currency of the payment line item (and therefore the check). null uses Claim/Default Currency
   * @param transToClaimExchangeRateOverride Use null for a current market rate. If non-null, the custom Transaction-to-Claim Currency exhange rate to use.
   * @param transToClaimExchangeRateDescription Use null if transToClaimExchangeRateOverride is null. The custom exchange rate description.
   * @param claimAmountOverride Please use null. A non-null value overrides the ClaimAmount calculated from the checkAmount and exchange rate.
   * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
   * @param comments Comments on this check
   * @param memo The memo for the check
   * @param payTo The pay to for the check
   * @param scheduledSendDate The scheduled send date of the check
   * @param requestingUser The user requesting this check @return the created check
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the check
   * @throws WorkflowValidationException if there is a problem during workflow validation.
   * @throws DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
   *                                        while trying to get the deductions.
   * @return new check
   * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
   */
  public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, typekey.Currency checkCurrency, java.math.BigDecimal transToClaimExchangeRateOverride, java.lang.String transToClaimExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, checkCurrency, transToClaimExchangeRateOverride, transToClaimExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, memo, payTo, scheduledSendDate, requestingUser);
  }
  
  /**
   * Creates an initial reserve on this exposure.  The reserve is created with
   * one line item. The reserving currency of the new reserve is set to the
   * claim currency.
   * 
   * The Reserve that is returned by this method is still editable, so you can
   * modify its Currency or other fields.
   * 
   * <p><b>Note:</b> This method is only needed for rules. Specifically, it
   * should only be used within the Initial Reserves ruleset. Note that reserves
   * created via this method and Initial Reserves rules are not submitted for approval
   * and hence bypass authority limit checking. They are immediately updated to Submitting status.
   * @param costType The cost type for the reserve.
   * @param category The cost category for the reserve.
   * @param amount The amount of the reserve line item (and therefore the reserve).
   * @return the newly created Reserve transaction
   */
  public entity.Reserve createInitialReserve(typekey.CostType costType, typekey.CostCategory category, java.math.BigDecimal amount) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createInitialReserve(costType, category, amount);
  }
  
  /**
   * Creates a recovery on this exposure.  The recovery is created with one line item and the Claim Currency.
   * @param payer The payer of the recovery.
   * @param costType The costtype for the recovery.  This value cannot be <code>null</code>.
   * @param costCategory The costcategory for the recovery  This value cannot be <code>null</code>.
   * @param recoveryCategory The Recovery Category for the recovery.
   * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
   * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
   * @param comments Comments on this recovery.
   * @param requestingUser The user requesting this recovery.
   * @return the created recovery
   */
  public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, java.lang.String comments, entity.User requestingUser) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, comments, requestingUser);
  }
  
  /**
   * Creates a recovery on this exposure.  The recovery is created with one line item.
   * @param payer The payer of the recovery.
   * @param costType The costtype for the recovery.  This value cannot be <code>null</code>.
   * @param costCategory The costcategory for the recovery  This value cannot be <code>null</code>.
   * @param recoveryCategory The Recovery Category for the recovery.
   * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
   * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
   * @param recoveryCurrency The currency of the recoveryAmount.
   * @param exchangeRateOverride The exchange rate that is to be used to override the default rate, can be null
   * @param customExchangeRateDescription The custom exchange rate description, can be null
   * @param claimAmountOverride The claim amount to override the automatically calculated amount, can be null
   * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
   * @param comments Comments on this recovery.
   * @param requestingUser The user requesting this recovery. @return the created recovery
   */
  public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, typekey.Currency recoveryCurrency, java.math.BigDecimal exchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, entity.User requestingUser) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, recoveryCurrency, exchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, requestingUser);
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
   * Executes a rule set (synchronously) to generate a workplan for this exposure.
   */
  public void createWorkplan() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createWorkplan();
  }
  
  /**
   * Checks if this exposure already has an incident and creates a new one of the appropriate type if
   * it doesn't. If it creates a new incident, sets the incident's claim to be this exposure's claim.
   * @return the incident
   */
  public entity.Incident ensureIncidentCreated() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).ensureIncidentCreated();
  }
  
  /**
   * Find any existing open assignment review activities related to this assignable. Normally this will
   * return either zero or one activities. Assignment review activities are used for manual assignment.
   * @return a query result containing the open assignment review activities, if any
   */
  public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
    return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
  }
  
  /**
   * Freeze and remember the current state (OPEN, CLOSED, etc.) of the Exposure, to guard against concurrent changes that would
   * interfere with, for instance, Payment recodes.
   */
  public void freezeState() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).freezeState();
  }
  
  /**
   * Gets the active assignments to the given role.
   * @param userRole 
   * @return 
   */
  public entity.UserRoleAssignment[] getActiveUserRoleAssignments(typekey.UserRole userRole) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getActiveUserRoleAssignments(userRole);
  }
  
  /**
   * Gets the value of the Activities field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities() {
    return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
  }
  
  /**
   */
  public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getAllowedContactRolesForEntity();
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
   * Gets the value of the AverageWeeklyWages field.
   * Average weekly wages; this calculation differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAverageWeeklyWages() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVERAGEWEEKLYWAGES_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BenefitPeriods field.
   * Periods of time when employee received benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BenefitPeriod[] getBenefitPeriods() {
    return (entity.BenefitPeriod[])__getInternalInterface().getFieldValue(BENEFITPERIODS_PROP.get());
  }
  
  /**
   * Returns a new CheckCreator object for creating a check on this exposure.
   * @deprecated Call newCheckCreator() method instead. This property has always
   *             returned a new CheckCreator with each access.
   */
  public gw.api.financials.CheckCreator getCheckCreator() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getCheckCreator();
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
   * Gets the value of the Claim field.
   * The Claim for this Exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
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
   * Returns the Currency of this Exposure's associated Claim.
   * @return The currency of the associated Claim, as an element of the Currency typelist.
   *         Returns NULL if the Claim is currently unreachable (if, for example, the
   *         necessary entity connections have not yet been made).
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimCurrency();
  }
  
  /**
   * Gets the value of the ClaimOrder field.
   * Order of the exposure on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMORDER_PROP.get());
  }
  
  /**
   */
  public entity.Contact getClaimant() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimant();
  }
  
  /**
   * Gets the value of the ClaimantDenorm field.
   * The claimant for the exposure, denormalized from the claim's contact array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimantDenorm() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMANTDENORM_PROP.get());
  }
  
  /**
   * Gets the exposure's claimant using the denormalized fields-- first checks the exposure's <code>getClaimantDenorm()</code>
   * method, and if that returns <code>null</code> checks the claim's <code>getClaimantDenorm()</code> method.  Does
   * not check the claim type before attempting to return the <code>claim.ClaimantDenorm</code> value.
   * @return the denormalized claimant field, or <code>null</code> if none
   */
  public entity.Contact getClaimantDenormForExposure() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimantDenormForExposure();
  }
  
  /**
   * Gets the value of the ClaimantType field.
   * Categorizes the claimant relative to policyholder.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimantType getClaimantType() {
    return (typekey.ClaimantType)__getInternalInterface().getFieldValue(CLAIMANTTYPE_PROP.get());
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
   * Outcome reached when closing the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureClosedOutcomeType getClosedOutcome() {
    return (typekey.ExposureClosedOutcomeType)__getInternalInterface().getFieldValue(CLOSEDOUTCOME_PROP.get());
  }
  
  /**
   * Gets the value of the CompBenefits field.
   * Compensation benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getCompBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(COMPBENEFITS_PROP.get());
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
   * Gets the value of the Coverage field.
   * The specific coverage for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Coverage getCoverage() {
    return (entity.Coverage)__getInternalInterface().getFieldValue(COVERAGE_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageSubType field.
   * The coverage subtype.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getCoverageSubType() {
    return (typekey.CoverageSubtype)__getInternalInterface().getFieldValue(COVERAGESUBTYPE_PROP.get());
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
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getCurrentRoleAssignment();
  }
  
  /**
   * Gets the value of the DaysInWeek field.
   * Days in week used for benefit calculation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DaysInWeekType getDaysInWeek() {
    return (typekey.DaysInWeekType)__getInternalInterface().getFieldValue(DAYSINWEEK_PROP.get());
  }
  
  /**
   * Array association accessor for key DaysInitialContactWithClaimantExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysInitialContactWithClaimantExposureMetric getDaysInitialContactWithClaimantExposureMetric() {
    return (entity.DaysInitialContactWithClaimantExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysInitialContactWithClaimantExposureMetric"));
  }
  
  /**
   * Array association accessor for key DaysOpenExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DaysOpenExposureMetric getDaysOpenExposureMetric() {
    return (entity.DaysOpenExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DaysOpenExposureMetric"));
  }
  
  /**
   * Gets the value of the DeathBenefits field.
   * Death benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getDeathBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(DEATHBENEFITS_PROP.get());
  }
  
  /**
   * Array association accessor for key DecimalExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DecimalExposureMetric getDecimalExposureMetric() {
    return (entity.DecimalExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("DecimalExposureMetric"));
  }
  
  /**
   * Gets the value of the DepreciatedValue field.
   * Depreciated value of property or vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDepreciatedValue() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DEPRECIATEDVALUE_PROP.get());
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
   * Gets the value of the DisBenefits field.
   * Disability benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getDisBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(DISBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the Documents field.
   * The documents associated with this exposure; for example, FNOL accord form or police report.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document[] getDocuments() {
    return (entity.Document[])__getInternalInterface().getFieldValue(DOCUMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the ECFExposureId_Ext field.
   * Exposure Id is used to identify exposures in an ECF WB Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getECFExposureId_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ECFEXPOSUREID_EXT_PROP.get());
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
   * Gets the value of the ExposureISOMatchReports field.
   * ISO match reports for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureISOMatchReport[] getExposureISOMatchReports() {
    return (entity.ExposureISOMatchReport[])__getInternalInterface().getFieldValue(EXPOSUREISOMATCHREPORTS_PROP.get());
  }
  
  /**
   * Array association accessor for key ExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureMetric getExposureMetric() {
    return (entity.ExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ExposureMetric"));
  }
  
  /**
   * Gets the value of the ExposureMetrics field.
   * Metrics related to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureMetric[] getExposureMetrics() {
    return (entity.ExposureMetric[])__getInternalInterface().getFieldValue(EXPOSUREMETRICS_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureRpt field.
   * The calculated financials data for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureRpt getExposureRpt() {
    return (entity.ExposureRpt)__getInternalInterface().getFieldValue(EXPOSURERPT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureRpt[] getExposureRptArray() {
    return (entity.ExposureRpt[])__getInternalInterface().getFieldValue(EXPOSURERPTARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureSynchStates field.
   * Sync states related to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureSynchState[] getExposureSynchStates() {
    return (entity.ExposureSynchState[])__getInternalInterface().getFieldValue(EXPOSURESYNCHSTATES_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureTier field.
   * The tier of this exposure, used to decide how to rate the exposure metrics.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureTier getExposureTier() {
    return (typekey.ExposureTier)__getInternalInterface().getFieldValue(EXPOSURETIER_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureType field.
   * Types of exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureType getExposureType() {
    return (typekey.ExposureType)__getInternalInterface().getFieldValue(EXPOSURETYPE_PROP.get());
  }
  
  /**
   */
  public java.lang.String getFullDescription() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getFullDescription();
  }
  
  /**
   */
  public java.lang.String getFullDescriptionWithLossParty() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getFullDescriptionWithLossParty();
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
   * Estimated days in hospital.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHospitalDays() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(HOSPITALDAYS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the IMEPerformed field.
   * Independent medical examinations performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.IMEPerformed[] getIMEPerformed() {
    return (entity.IMEPerformed[])__getInternalInterface().getFieldValue(IMEPERFORMED_PROP.get());
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
   * Gets the value of the Incident field.
   * Incident that caused this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident() {
    return (entity.Incident)__getInternalInterface().getFieldValue(INCIDENT_PROP.get());
  }
  
  /**
   * Returns the initial reserve transaction of this exposure.  The initial reserve is the saved reserve with
   * a status of <code>TransactionStatus.TC_SUBMITTING</code> or <code>TransactionStatus.TC_SUBMITTED</code> that has
   * the earliest update time.  Excludes the transactions in the given <code>TransactionSet</code> if it is not <code>null</code>.
   * <p>
   * Note this method only returns one reserve, though many reserve transactions may have been initially created at the same time
   * and meet the given filter requirements. Also, this method has nothing to do with Claim Health Metrics that use
   * a concept of initial reserves.
   * <p>
   * This method used to return the Amount of the initial Reserve; add ".Amount" to the end to get the old
   * return value (this is null safe in Gosu). It would also return BigDecimal.ZERO if the Amount was null,
   * so you'll have to add a check for that null case, too. For example:
   * <pre>
   *   var amount = exposure.getInitialReserve(...).Amount
   *   amount = (amount == null ? BigDecimal.ZERO : amount)
   * </pre>
   * @param transactionSet reserves included in this <code>TransactionSet</code> is excluded from the determination of
   *                       the initial reserve
   * @param costType only reserves that have this <code>CostType</code> are considered - if <code>null</code>, then all
   *                       reserves are considered, regardless of <code>CostType</code>.
   * @param costCategory only reserves that have this <code>CostCategory</code> are considered - if <code>null</code>,
   *                       then all reserves are considered, regardless of <code>CostCategory</code>.
   * @return initial reserve of this exposure, or null if no match
   */
  public entity.Reserve getInitialReserve(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getInitialReserve(transactionSet, costType, costCategory);
  }
  
  /**
   * Array association accessor for key IntegerExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.IntegerExposureMetric getIntegerExposureMetric() {
    return (entity.IntegerExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("IntegerExposureMetric"));
  }
  
  /**
   * Gets the value of the JurisdictionState field.
   * State of jurisdiction, if different than location of loss. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState() {
    return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the LastDayWorked field.
   * Last day worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastDayWorked() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LASTDAYWORKED_PROP.get());
  }
  
  /**
   * Gets the value of the LifePensionBenefits field.
   * Life Pension benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getLifePensionBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(LIFEPENSIONBENEFITS_PROP.get());
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
   * Gets the value of the LossCategory field.
   * Detailed category of the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCategory getLossCategory() {
    return (typekey.LossCategory)__getInternalInterface().getFieldValue(LOSSCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the LossParty field.
   * The loss party; generally either first- or third-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossPartyType getLossParty() {
    return (typekey.LossPartyType)__getInternalInterface().getFieldValue(LOSSPARTY_PROP.get());
  }
  
  /**
   * Gets the value of the LostPropertyType field.
   * ISO category of lost property, for theft losses.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LostPropertyType getLostPropertyType() {
    return (typekey.LostPropertyType)__getInternalInterface().getFieldValue(LOSTPROPERTYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MedicalActions field.
   * Key medical-related dates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MedicalAction[] getMedicalActions() {
    return (entity.MedicalAction[])__getInternalInterface().getFieldValue(MEDICALACTIONS_PROP.get());
  }
  
  /**
   * Gets the value of the MetricLimitGeneration field.
   * Generation number, used to identify the limits for this exposure's metrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMetricLimitGeneration() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(METRICLIMITGENERATION_PROP.get());
  }
  
  /**
   * Array association accessor for key MoneyExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MoneyExposureMetric getMoneyExposureMetric() {
    return (entity.MoneyExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("MoneyExposureMetric"));
  }
  
  /**
   * Array association accessor for key NetTotalIncurredExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NetTotalIncurredExposureMetric getNetTotalIncurredExposureMetric() {
    return (entity.NetTotalIncurredExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("NetTotalIncurredExposureMetric"));
  }
  
  /**
   * Gets the value of the NewEmpData field.
   * Information about a new job that the claimant has taken.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getNewEmpData() {
    return (entity.EmploymentData)__getInternalInterface().getFieldValue(NEWEMPDATA_PROP.get());
  }
  
  /**
   * Return all the non-exclusive claim contact roles for this owner
   * @return a list of claim contact role objects, possibly empty but never null
   */
  public entity.ClaimContactRole[] getNonExclusiveRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
  }
  
  /**
   * Gets the value of the Notes field.
   * Notes particular to this exposure. Notes can also be associated with the claim in general.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Note[] getNotes() {
    return (entity.Note[])__getInternalInterface().getFieldValue(NOTES_PROP.get());
  }
  
  /**
   * Gets the value of the OCR_Ext field.
   * The OCR is the Originating Claim Office Reference which can be found on messages such as SCMs
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOCR_Ext() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OCR_EXT_PROP.get());
  }
  
  /**
   */
  public java.lang.String getObjectiveFindings() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getObjectiveFindings();
  }
  
  /**
   * OpenReserves calculation for this exposure.
   */
  public gw.api.financials.CurrencyAmount getOpenReserves() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getOpenReserves();
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
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getOrCreateUserRoleAssignmentByRole(role);
  }
  
  /**
   * Gets the value of the OtherCoverageDet field.
   * Details of other coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherCoverageDetail[] getOtherCoverageDet() {
    return (entity.OtherCoverageDetail[])__getInternalInterface().getFieldValue(OTHERCOVERAGEDET_PROP.get());
  }
  
  /**
   * Gets the value of the OtherCoverageInfo field.
   * Information regarding additional coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOtherCoverageInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OTHERCOVERAGEINFO_PROP.get());
  }
  
  /**
   * Gets the value of the OtherCovgChoice field.
   * Whether there is other coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getOtherCovgChoice() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(OTHERCOVGCHOICE_PROP.get());
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
   * Gets the value of the PIPDeathBenefits field.
   * Death benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPIPDeathBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(PIPDEATHBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the PIPVocBenefits field.
   * Vocational rehab benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPIPVocBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(PIPVOCBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the PPDBenefits field.
   * PPD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPPDBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(PPDBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the PTDBenefits field.
   * PTD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getPTDBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(PTDBENEFITS_PROP.get());
  }
  
  /**
   * TotalPayments calculation for this exposure.
   */
  public gw.api.financials.CurrencyAmount getPaymentAmount() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentAmount();
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the <code>Payment</code> objects for this exposure.
   * You can choose to get either all the payments or only the new and modified payments.  If you choose to get all the
   * <code>Payment</code> objects, then <code>Payment</code> objects in the current transaction are not be
   * returned by the <code>Iterator</code>. This method is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
   * and iterating through all the transactions to find just the desired <code>Payment</code> objects.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be
   * in the same bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit the beans, you
   * should add them to an editable bundle first.
   * </p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Payment</code> objects for this exposure are
   *                           returned.  This includes payments for which only the line items were modified.  Otherwise,
   *                           if <code>false</code> then all <code>Payment</code> objects for the exposure are returned, including
   *                           new and modified <code>Payment</code> objects, but excluding deleted <code>Payment</code> objects.
   * @return an <code>Iterator</code> that returns <code>Payment</code> objects.
   */
  public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentsIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the payments for this exposure. This query is suitable for populating
   * a list view in the UI.  The query also filters by the  current user's transaction view permissions, so the results
   * may be empty if the user has no payment view permissions. The payments are returned as they currently exist on the database.
   * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Payment</code> objects for
   *         this exposure.  The returned rows are actually <code>PaymentView</code> entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.PaymentView> getPaymentsQuery() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentsQuery();
  }
  
  /**
   * Array association accessor for key PercentEscalatedActivitiesExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentEscalatedActivitiesExposureMetric getPercentEscalatedActivitiesExposureMetric() {
    return (entity.PercentEscalatedActivitiesExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentEscalatedActivitiesExposureMetric"));
  }
  
  /**
   * Array association accessor for key PercentExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentExposureMetric getPercentExposureMetric() {
    return (entity.PercentExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentExposureMetric"));
  }
  
  /**
   * Array association accessor for key PercentPaidLossCostsExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PercentPaidLossCostsExposureMetric getPercentPaidLossCostsExposureMetric() {
    return (entity.PercentPaidLossCostsExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("PercentPaidLossCostsExposureMetric"));
  }
  
  /**
   * <p>
   * Returns an array containing the possible coverage subtypes for this exposure if the coverage
   * type is set to the given value. Takes into account the exposure's type and excludes any coverage
   * subtypes not available for this exposure's type. The coverage type is exposed as a parameter (rather than just
   * being the current <code>PrimaryCoverage</code> value).
   * </p><p>
   * You can use this method to ask  "if the coverage type of this exposure was X, what subtypes are possible?".
   * This may be useful in the UI for constructing reflection value ranges. For example, if the user selects a particular
   * coverage type you can set the choice of coverage subtypes appropriately via reflection.
   * </p>
   * @param coverageType the proposed coverage type. To use the current coverage type just use the
   *                     result of {@link entity.Exposure#getPrimaryCoverage()}.
   * @return the array of possible coverage subtypes, or an empty array if there are none or if
   *         the <code>coverageType</code> parameter is <code>null</code>. Never returns <code>null</code>.
   */
  public typekey.CoverageSubtype[] getPossibleCoverageSubtypes(typekey.CoverageType coverageType) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleCoverageSubtypes(coverageType);
  }
  
  /**
   * Returns an array containing the possible coverage types for this exposure, given the claim's policy type
   * and this exposure's own type. The line of business configuration (see the <code>BusinessLineConfiguration</code>
   * entity) restricts the possible choices. This method also excludes any coverage types that do not have any suitable coverage
   * subtypes. This method is useful in the UI when presenting the user with a range of choices
   * for setting an exposure's coverage type.
   * @return the array of possible coverage types, or an empty array if there are none.
   *         Never returns <code>null</code>
   */
  public typekey.CoverageType[] getPossibleCoverageTypes() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleCoverageTypes();
  }
  
  /**
   * Returns all incidents on this claim's exposure that could possibly be suitable for this exposure. Only incidents
   * whose type matches the incident type configured for this exposure (see
   * com.guidewire.cc.domain.claim.BusinessLineConfiguration.getIncidentTypeForExposureType) are returned.
   * @return all incidents on the claim whose type matches the type of this exposure. Never returns <code>null</code>, returns
   *         the empty list if there are no incidents of the right type or if this exposure does not have a type set or
   *         has a <code>null</code> claim.
   */
  public entity.Incident[] getPossibleIncidents() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleIncidents();
  }
  
  /**
   * Returns the possible loss parties for an exposure of this type. The possible loss parties for a given exposure
   * type are determined by type key filtering, see the <code>LossPartyType.xml</code> file for details. If the exposure is newly
   * created and has no type, returns all loss party types.
   * @return the possible loss parties for an exposure of this type sorted in typekey order, never <code>null</code>. Should not
   *         return an empty array (except, possibly, on configurations which do not use the loss party field at all).
   */
  public typekey.LossPartyType[] getPossibleLossParties() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleLossParties();
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
   * Gets the value of the PrimaryCoverage field.
   * Coverage Type of the coverage on this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getPrimaryCoverage() {
    return (typekey.CoverageType)__getInternalInterface().getFieldValue(PRIMARYCOVERAGE_PROP.get());
  }
  
  /**
   * Gets the value of the PriorEmpData field.
   * Information about the job the claimant had at the time of injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getPriorEmpData() {
    return (entity.EmploymentData)__getInternalInterface().getFieldValue(PRIOREMPDATA_PROP.get());
  }
  
  /**
   * Gets the value of the Progress field.
   * Description of the progress of an open exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureProgressType getProgress() {
    return (typekey.ExposureProgressType)__getInternalInterface().getFieldValue(PROGRESS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RIAgreementGroup field.
   * Reinsurance group associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreementGroup getRIAgreementGroup() {
    return (entity.RIAgreementGroup)__getInternalInterface().getFieldValue(RIAGREEMENTGROUP_PROP.get());
  }
  
  /**
   * RICodings with this Exposure.
   */
  public java.util.List<entity.RICoding> getRICodings() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRICodings();
  }
  
  /**
   * Gets the value of the RSBenefits field.
   * Replacement services benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getRSBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(RSBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the ReOpenDate field.
   * The last time an exposure was reopened. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReOpenDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(REOPENDATE_PROP.get());
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the <code>Recovery</code> objects for this exposure.
   * You can choose to retrieve all the recoveries or only the new and modified recoveries.  If you choose to retrieve
   * all the <code>Recovery</code> objects, then those recoveries that were removed in the current transaction are not
   * returned by the <code>Iterator</code>. This is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
   * and iterating through all the transactions to find just the desired Recoveries.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be in the same
   * bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit the beans, you should add them to an
   * editable bundle first.
   * </p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Recovery</code> objects for this exposure will
   *                           be returned.  This includes recoveries for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all <code>Recovery</code> objects for the exposure will be returned, including
   *                           new and modified <code>Recovery</code> objects, but excluding deleted <code>Recovery</code> objects.
   * @return an <code>Iterator</code> that returns <code>Recovery</code> objects.
   */
  public java.util.Iterator<entity.Recovery> getRecoveriesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveriesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the <code>Recovery</code> objects for this exposure.
   * This query is suitable for populating a list view in the UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no recovery view permission.
   * The recoveries are returned as they currently exist on the database.
   * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Recovery</code> objects for
   *         this exposure.  The returned rows are actually <code>RecoveryView</code> entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.RecoveryView> getRecoveriesQuery() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveriesQuery();
  }
  
  /**
   * Returns a list of RecoveryCodings for this Exposure; that is, those RecoveryCodings whose ReserveLines are coded
   * to this Exposure.
   * @return list of ReocveryCodings associated with this Exposure
   */
  public java.util.List<entity.RecoveryCoding> getRecoveryCodings() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryCodings();
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the <code>RecoveryReserve</code> objects for this exposure.
   * You can choose to retrieve either all the <code>RecoveryReserve</code> objects  or only the new and modified
   * <code>RecoveryReserve</code> objects.  If you choose to retrieve all the <code>RecoveryReserve</code> objects,
   * then those <code>RecoveryReserve</code> objects that were removed in the current transaction are not be returned by
   * the <code>Iterator</code>. This is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
   * and iterating through all the transactions to find just the desired <code>RecoveryReserve</code> objects.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is <code>false</code>, the beans returned by this iterator are
   * not guaranteed to be in the same bundle as this Exposure, and their bundle may not be editable.
   * To edit the beans, you should add them to an editable bundle first.
   * </p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified  <code>RecoveryReserve</code> objects for this exposure will
   *                           be returned.  This includes recovery reserves for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all  <code>RecoveryReserve</code> objects for the exposure will be returned, including
   *                           new and modified  <code>RecoveryReserve</code> objects, but excluding deleted  <code>RecoveryReserve</code> objects.
   * @return an Iterator that returns Recoveries
   */
  public java.util.Iterator<entity.RecoveryReserve> getRecoveryReservesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryReservesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the  <code>RecoveryReserve</code> objects for this exposure.
   * this query is suitable for populating a ListView in the UI.  The query also filters by the
   * current user's transaction view permissions, so the results may be empty if the user has no  <code>RecoveryReserve</code> objects
   * view permission. The  <code>RecoveryReserve</code> objects will be returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all  <code>RecoveryReserve</code> objects for this exposure.  The returned
   *         rows are actually <code>RecoveryReserveView</code> entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.RecoveryReserveView> getRecoveryReservesQuery() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryReservesQuery();
  }
  
  /**
   * Gets the value of the ReopenedReason field.
   * The reason for reopening the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureReopenedReason getReopenedReason() {
    return (typekey.ExposureReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
  }
  
  /**
   * Gets the value of the ReplacementValue field.
   * Replacement value of the property or vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReplacementValue() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPLACEMENTVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the ReserveLines field.
   * ReserveLines relating to this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine[] getReserveLines() {
    return (entity.ReserveLine[])__getInternalInterface().getFieldValue(RESERVELINES_PROP.get());
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the <code>Reserve</code> objects for this exposure.  You can
   * choose to retrieve either all the <code>Reserve</code> objects or only the new and modified reserves.  If you choose
   * to retreive all the  <code>Reserve</code> objects, then those <code>Reserve</code> objects that were removed in the
   * current transaction are not returned by the <code>Iterator</code>.  This method is a much more efficient alternative
   * to calling {@link entity.Exposure#getTransactions()} and iterating through all the transactions to find just the desired reserves.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is <code>false</code>, the beans returned by this iterator are not
   * guaranteed to be in the same bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit
   * the beans, you should add them to an editable bundle first.</p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Reserve</code> objects for this
   *                           exposure will be returned.  This includes reserves for which only the line items have been modified.  Otherwise,
   *                           if <code>false</code> then all <code>Reserve</code> objects for the exposure are returned, including
   *                           new and modified <code>Reserve</code> objects, but excluding deleted <code>Reserve</code> objects.
   * @return an <code>Iterator</code> that returns <code>Reserve</code> objects.
   */
  public java.util.Iterator<entity.Reserve> getReservesIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getReservesIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the reserves for this exposure. This query is suitable for populating
   * a list view in the UI.  The query also filters by the current user's transaction view permissions, so the results
   * may be empty if the user has no reserve view permission. The reserves are returned as they currently exist on the database.
   * @return a QueryProcessor that encapsulates the query to return all <code>Reserve</code> objects for this exposure.
   *         The returned rows are actually <code>ReserveView</code> entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.ReserveView> getReservesQuery() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getReservesQuery();
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
   * The user role assignments for this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UserRoleAssignment[] getRoleAssignments() {
    return (entity.UserRoleAssignment[])__getInternalInterface().getFieldValue(ROLEASSIGNMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the Roles field.
   * The contacts and their roles associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles() {
    return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
  }
  
  /**
   * Gets the value of the SSDIBenefits field.
   * Social security disability benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getSSDIBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(SSDIBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the SecurityLevel field.
   * The security level of this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureSecurityType getSecurityLevel() {
    return (typekey.ExposureSecurityType)__getInternalInterface().getFieldValue(SECURITYLEVEL_PROP.get());
  }
  
  /**
   * Gets the value of the Segment field.
   * Segmentation type of the exposure. Both the claim and exposure may be segmented.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSegment getSegment() {
    return (typekey.ClaimSegment)__getInternalInterface().getFieldValue(SEGMENT_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequests field.
   * Service requests associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest[] getServiceRequests() {
    return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
  }
  
  /**
   * Gets the value of the SettleDate field.
   * Date of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSettleDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SETTLEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the SettleMethod field.
   * Method of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SettleMethod getSettleMethod() {
    return (typekey.SettleMethod)__getInternalInterface().getFieldValue(SETTLEMETHOD_PROP.get());
  }
  
  /**
   * Gets the value of the Settlements field.
   * Settlements with the employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Settlement[] getSettlements() {
    return (entity.Settlement[])__getInternalInterface().getFieldValue(SETTLEMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the StatLine field.
   * Statistical line associated with this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.StatCode getStatLine() {
    return (entity.StatCode)__getInternalInterface().getFieldValue(STATLINE_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * Internal state of the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureState getState() {
    return (typekey.ExposureState)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the Strategy field.
   * Strategy type of the exposure. Both the claim and exposure may define a strategy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimStrategy getStrategy() {
    return (typekey.ClaimStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
  }
  
  /**
   */
  public java.lang.String getSubjectiveComplaints() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getSubjectiveComplaints();
  }
  
  /**
   * Deprecated:  Use Exposure.ExposureType instead.
   * @deprecated Use getExposureType() instead.
   */
  public typekey.ExposureType getSubtype() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getSubtype();
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
   * Gets the value of the TPDBenefits field.
   * TPD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getTPDBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(TPDBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the TTDBenefits field.
   * TTD benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getTTDBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(TTDBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the TempLocation field.
   * Temporary location of policy holder. This is for a homeowners claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getTempLocation() {
    return (entity.Address)__getInternalInterface().getFieldValue(TEMPLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the Text field.
   * Large text fields associated with exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureText[] getText() {
    return (entity.ExposureText[])__getInternalInterface().getFieldValue(TEXT_PROP.get());
  }
  
  /**
   * Array association accessor for key TimeBasedExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TimeBasedExposureMetric getTimeBasedExposureMetric() {
    return (entity.TimeBasedExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TimeBasedExposureMetric"));
  }
  
  /**
   * Array association accessor for key TimeToFirstPaymentExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TimeToFirstPaymentExposureMetric getTimeToFirstPaymentExposureMetric() {
    return (entity.TimeToFirstPaymentExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TimeToFirstPaymentExposureMetric"));
  }
  
  /**
   * Array association accessor for key TotalPaidExposureMetric on array ExposureMetrics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TotalPaidExposureMetric getTotalPaidExposureMetric() {
    return (entity.TotalPaidExposureMetric)__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("TotalPaidExposureMetric"));
  }
  
  /**
   * Return the total recoveries for this exposure.
   * @return amount of total recoveries for this exposure.
   */
  public gw.api.financials.CurrencyAmount getTotalRecoveries() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTotalRecoveries();
  }
  
  /**
   * Gets the value of the Transactions field.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions() {
    return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
  }
  
  /**
   * <p>
   * Constructs an <code>Iterator</code> to provide access to the transactions for this exposure.  This is a more efficient
   * alternative to calling {@link entity.Exposure#getTransactions()}, particularly if you are only interested in new or modified
   * transactions.  You can use this method to retrieve all the <code>Transaction</code> objects or only the new and modified objects.
   * If you choose to retrieve all the <code>Transaction</code> objects then, those transactions that were removed
   * in the current transaction are not be returned by the <code>Iterator</code>.
   * </p><p>
   * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, there is no guarantee that the beans returned by this
   * iterator may not be in the same bundle as this <code>Exposure</code>, and their bundle may not be editable.
   * To edit the beans, you should add them to an editable bundle first.</p>
   * @param newAndModifiedOnly if <code>true</code> then only new and modified transactions for this exposure are
   *                           returned.  This includes transactions for which only the line items were modified.  Otherwise,
   *                           if <code>false</code> then the method returns all transactions for the exposure, including
   *                           new and modified <code>Transaction</code> objects, but excluding deleted transactions.
   * @return an Iterator that returns transactions.
   */
  public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTransactionsIterator(newAndModifiedOnly);
  }
  
  /**
   * Constructs a query to use for retrieving all the transactions, regardless of subtype, for this exposure.
   * this query is suitable for populating a list view in the user interface.  The query also filters by the
   * current user's transaction view permissions.  The transactions are returned as they currently exist
   * on the database.
   * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Transaction</code> objects for
   *         this exposure.  The returned rows are actually <code>TransactionDefaultView</code>
   *         entities for efficiency.
   */
  public gw.api.database.IQueryBeanResult<entity.TransactionDefaultView> getTransactionsQuery() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTransactionsQuery();
  }
  
  /**
   */
  public java.lang.String getTreatmentRendered() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTreatmentRendered();
  }
  
  /**
   * Implements type safe properties for accessing incident subtypes; for example you can use <code>VehicleIncident</code>
   * to access the incident as a <code>VehicleIncident</code> (providing it really is a <code>VehicleIncident</code>).
   * This method returns <code>null</code> if the type is not a supertype of the actual incident type, or if the incident
   * is <code>null</code>.
   * @param typeName the supertype to attempt to access the incident as
   * @return the incident, or <code>null</code> if <code>typeName</code> is not a supertype of the actual incident type or if the
   *         incident is <code>null</code>
   */
  public java.lang.Object getTypedIncident(java.lang.String typeName) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTypedIncident(typeName);
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
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignment(user, userRole);
  }
  
  /**
   * Gets the user role assignment for that role
   * If there's no assignment for that role, returns null.
   * If there is more than one assignment for that role, then the first role will be returned.
   * Note: getUserRoleAssignmentsByRole(UserRole) should be called if multiple assignments are expected to return.
   * @param role The role for the assignment
   */
  public entity.UserRoleAssignment getUserRoleAssignmentByRole(typekey.UserRole role) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignmentByRole(role);
  }
  
  /**
   * Get the user role assignments for that role. If no assignment for that role,
   * then an empty array is returned.
   * @param role The role for the assignment
   * @return an array of user role assignments for the given role. The array is empty if no such user role assignment.
   */
  public entity.UserRoleAssignment[] getUserRoleAssignmentsByRole(typekey.UserRole role) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignmentsByRole(role);
  }
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level the exposure has passed (if any).
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
   * Gets the value of the VocBenefits field.
   * Vocational benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getVocBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(VOCBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the WCBenefits field.
   * Workers' comp benefits details.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Benefits getWCBenefits() {
    return (entity.Benefits)__getInternalInterface().getFieldValue(WCBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the WCPreexDisbltyInfo field.
   * Information about the pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWCPreexDisbltyInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCPREEXDISBLTYINFO_PROP.get());
  }
  
  /**
   * Gets the value of the WageStmtRecd field.
   * Wage Statement received date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWageStmtRecd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WAGESTMTRECD_PROP.get());
  }
  
  /**
   * Gets the value of the WageStmtSent field.
   * Wage Statement sent date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWageStmtSent() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WAGESTMTSENT_PROP.get());
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
   * Tests whether this exposure has at least one payment whose status is Awaiting Submission and
   * whose scheduled send date is today.
   * @return <code>true</code> if the above criteria are met, else <code>false</code>.
   */
  public boolean hasAwaitingSubmissionPaymentsForToday() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasAwaitingSubmissionPaymentsForToday();
  }
  
  /**
   * Verifies whether this exposure has passed the ability to pay validation level and so can have a payment created
   * against it. The verification may potentially end up performing validation of the exposure.
   * @return <code>true</code> if this exposure has passed the "ability to pay" validation level,
   *         else <code>false</code>
   */
  public boolean hasPassedAbilityToPay() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasPassedAbilityToPay();
  }
  
  /**
   * Returns true if this exposure has a <code>Payment</code> that matches the given cost type
   * and cost category and if the given <code>TransactionSet</code> is <code>null</code>, the <code>Payment</code> does
   * not belong to the <code>TransactionSet</code>.  The status and amount of the transactions
   * are not considered.
   * @param transactionSet <code>TransactionSet</code> to test whether this exposure has a <code>Payment</code> belongs to it.
   * @param costType <code>CostType</code> to test whether this exposure has a <code>Payment</code> that matches it.
   * @param costCategory <code>CostCategory</code> to test whether this exposure has a <code>Payment</code> that matches it.
   * @return true if this exposure has a payment that matches the given cost type and cost category and does not
   *         belong to the given transaction set.
   */
  public boolean hasPayment(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasPayment(transactionSet, costType, costCategory);
  }
  
  /**
   * Returns true if this exposure has a <code>Reserve that matches the given cost type
   * and cost category and, if the given <code>TransactionSet</code> is not <code>null</code>, the <code>Reserve<code> does
   * not belong to the <code>TransactionSet</code>.  The status and amount of the transactions
   * are not considered.
   * @param transactionSet the <code>TransactionSet</code> to test whether there is a reserve belonging to it.
   * @param costType the <code>CostType</code> to test whether there is a reserve that matches it.
   * @param costCategory the <code>CostCategory</code> to test whether there is a reserve that matches it.
   * @return true if this exposure has a reserve that matches the given cost type and cost category and does not belong
   *         to the given transaction set.
   */
  public boolean hasReserve(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasReserve(transactionSet, costType, costCategory);
  }
  
  /**
   * Returns true if this exposure should have a service period associated with it (for checks).
   * This method can return true for exposure types: WC Lost Wages, PIP, Bodily Injury, or WC Injury.
   * @return true if this exposure should have a service period associated with it, false otherwise
   */
  public boolean hasServicePeriod() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasServicePeriod();
  }
  
  /**
   * Verifies whether this exposure is at the ability to pay validation level. Note: Unlike {@link #hasPassedAbilityToPay()},
   * this API never performs validation of the exposure. It only verifies against whatever validation level that has
   * been set currently on the exposure.
   * @return <code>true</code> if this exposure is at the "ability to pay" validation level,
   *         else <code>false</code>
   */
  public boolean isAtAbilityToPay() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isAtAbilityToPay();
  }
  
  /**
   * Gets the value of the BreakIn field.
   * Whether there is evidence of a break-in.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBreakIn() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BREAKIN_PROP.get());
  }
  
  /**
   * Returns true if the claim is closed.
   * @return true if the claim is closed
   */
  public boolean isClosed() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isClosed();
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
   * Gets the value of the ContactPermitted field.
   * Whether contact is permitted with the claimant.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isContactPermitted() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONTACTPERMITTED_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentConditions field.
   * Current conditions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCurrentConditions() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CURRENTCONDITIONS_PROP.get());
  }
  
  /**
   * Gets the value of the DiagnosticCnsistnt field.
   * Whether the diagnostic is consistent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiagnosticCnsistnt() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DIAGNOSTICCNSISTNT_PROP.get());
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
   * Gets the value of the ExposureLimitReached field.
   * Whether the exposure's exposure limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExposureLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPOSURELIMITREACHED_PROP.get());
  }
  
  /**
   * Gets the value of the FurtherTreatment field.
   * Whether further treatment is required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFurtherTreatment() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FURTHERTREATMENT_PROP.get());
  }
  
  /**
   * Returns whether this exposure is enabled for ISO. True if the exposure has any ISO status other
   * than "Not of Interest" and the claim is ISO enabled, false otherwise
   * @return <code>true</code> if this exposure is enabled for ISO, <code>false</code> otherwise.
   */
  public boolean isISOEnabled() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isISOEnabled();
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
   * Gets the value of the IncidentLimitReached field.
   * Whether the exposure's incident limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTLIMITREACHED_PROP.get());
  }
  
  /**
   * Gets the value of the Locked field.
   * Whether the property or vehicle was properly locked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocked() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOCKED_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
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
   * Gets the value of the OtherCoverage field.
   * True if the claimant has additional coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOtherCoverage() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OTHERCOVERAGE_PROP.get());
  }
  
  /**
   * Gets the value of the PIPClaimAggLimitReached field.
   * Whether the exposure's PIP Claim Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPClaimAggLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPCLAIMAGGLIMITREACHED_PROP.get());
  }
  
  /**
   * Gets the value of the PIPESSLimitReached field.
   * Whether the exposure's PIP Replacement Services Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPESSLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPESSLIMITREACHED_PROP.get());
  }
  
  /**
   * Gets the value of the PIPNonMedAggLimitReached field.
   * Whether the exposure's PIP Non Medical Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPNonMedAggLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPNONMEDAGGLIMITREACHED_PROP.get());
  }
  
  /**
   * Gets the value of the PIPPersonAggLimitReached field.
   * Whether the exposure's PIP Per Person Aggregate limit has been exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPIPPersonAggLimitReached() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPPERSONAGGLIMITREACHED_PROP.get());
  }
  
  /**
   * Returns true if a payment can be made against this exposure.  Specifically,
   * returns true if:
   * <ul>
   * <li> Exposure is closed and previous payments have been made on it.</li>
   * <li> Exposure is open and global <code>PaymentExceedsReserves = true</code>.</li>
   * <li> Exposure is open and no reserves have been created for the exposure.</li>
   * <li> Exposure is open and has available reserves.</li>
   * </ul>
   * @return true if a payment can be made against this exposure, false otherwise
   */
  public boolean isPaymentAllowed() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isPaymentAllowed();
  }
  
  /**
   * Gets the value of the RIGroupSetExternally field.
   * Whether the reinsurance association was determined by an external system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRIGroupSetExternally() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RIGROUPSETEXTERNALLY_PROP.get());
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
   * Gets the value of the SSBenefit field.
   * Whether Social Security benefits are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSBenefit() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSBENEFIT_PROP.get());
  }
  
  /**
   * Gets the value of the SSDIEligible field.
   * Whether the exposure is eligible for SSDI.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSDIEligible() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSDIELIGIBLE_PROP.get());
  }
  
  /**
   * Should the given user be able to use the button to send this exposure to ISO. True iff:
   * <ol>
   * <li>The ISO message sink is enabled
   * <li>The user has permission to edit this exposure
   * <li>The exposure is ISO enabled ({@link #isISOEnabled()})
   * <li>The exposure is ISO valid
   * </ol>
   * @param user the user to test whether he can use the send to ISO button.
   * @return <code>true</code> if the given user should be able to use the button to send this exposure to ISO,
   *         <code>false</code> otherwise.
   * @deprecated Use perm.Exposure.edit(exposure) to check the permission, explicitly check the
   *   exposure ISO status and validity. Just remove the button
   *   from the PCF entirely if not using ISO
   */
  public boolean isSendToISOAvailable(entity.User user) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isSendToISOAvailable(user);
  }
  
  /**
   * Should the given user be able to see the button to send this exposure to ISO. True iff:
   * <ol>
   * <li>The ISO message sink is enabled
   * <li>The user has permission to edit this exposure
   * </ol>
   * @param user the user to test whether he can see the send to ISO button.
   * @return <code>true</code> if the given user should be able to see the button to send this exposure to ISO,
   *         <code>false</code> otherwise.
   * @deprecated Use perm.Exposure.edit(exposure) to check the permission and just remove the button
   *   from the PCF entirely if not using ISO
   */
  public boolean isSendToISOVisible(entity.User user) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isSendToISOVisible(user);
  }
  
  /**
   * Gets the value of the TreatedPatientBfr field.
   * Whether the the patient has been treated before.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTreatedPatientBfr() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TREATEDPATIENTBFR_PROP.get());
  }
  
  /**
   * Returns whether this exposure is valid at the specified level.
   * @param level the level to check.
   * @return true if this exposure is valid to at least the specified level
   */
  public boolean isValid(typekey.ValidationLevel level) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValid(level);
  }
  
  /**
   * Executes exposure-closed validation rules and returns whether or not this
   * exposure passes.
   * @param level The level to check
   * @return True if this exposure passes.
   */
  public boolean isValidClosed(typekey.ValidationLevel level) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValidClosed(level);
  }
  
  /**
   * Executes exposure-reopened validation rules and returns whether or not this
   * exposure passes.
   * @param level the level to check
   * @return true if this exposure passes
   */
  public boolean isValidReopened(typekey.ValidationLevel level) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValidReopened(level);
  }
  
  /**
   * Gets the value of the WCBenefit field.
   * Whether Workers Compensation benefits are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWCBenefit() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WCBENEFIT_PROP.get());
  }
  
  /**
   * Gets the value of the WCPreexDisblty field.
   * Whether the injured person had a pre-existing disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWCPreexDisblty() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WCPREEXDISBLTY_PROP.get());
  }
  
  /**
   * Gets the value of the WageBenefit field.
   * Whether wage benefites are being collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWageBenefit() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAGEBENEFIT_PROP.get());
  }
  
  /**
   * Returns a new CheckCreator object for creating a check on this exposure.
   */
  public gw.api.financials.CheckCreator newCheckCreator() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newCheckCreator();
  }
  
  /**
   * Creates a new instance of EmploymentData, populating the {@link entity.EmploymentData#setClaim(entity.Claim)}
   * foreign key automatically. The new instance is created in the same bundle as the exposure.
   * @return The EmploymentData instance
   */
  public entity.EmploymentData newEmploymentData() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newEmploymentData();
  }
  
  /**
   * Creates a suitable incident for this exposure. Also sets the incident's claim to be this exposure's claim.
   * @return the new incident
   */
  public entity.Incident newIncident() {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newIncident();
  }
  
  public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
    ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
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
   * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
   */
  public void removeFromBenefitPeriods(entity.BenefitPeriod element) {
    __getInternalInterface().removeArrayElement(BENEFITPERIODS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBenefitPeriods(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BENEFITPERIODS_PROP.get(), elementID);
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
   * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureISOMatchReports(entity.ExposureISOMatchReport element) {
    __getInternalInterface().removeArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureISOMatchReports(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureMetrics(entity.ExposureMetric element) {
    __getInternalInterface().removeArrayElement(EXPOSUREMETRICS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureMetrics(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EXPOSUREMETRICS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureSynchStates(entity.ExposureSynchState element) {
    __getInternalInterface().removeArrayElement(EXPOSURESYNCHSTATES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureSynchStates(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EXPOSURESYNCHSTATES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
   */
  public void removeFromIMEPerformed(entity.IMEPerformed element) {
    __getInternalInterface().removeArrayElement(IMEPERFORMED_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIMEPerformed(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(IMEPERFORMED_PROP.get(), elementID);
  }
  
  /**
   * Remove the given match report form the array of match reports on this Claim/Exposure
   * @param report the report to be removed
   */
  public void removeFromISOMatchReports(entity.ISOMatchReport report) {
    ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).removeFromISOMatchReports(report);
  }
  
  /**
   * Obsolete method, present for backwards compatibility
   * @param matchReport the id of the match report to remove
   * @deprecated use removeFromExposureISOMatchReports(ExposureISOMatchReport) instead
   */
  public void removeFromISOMatchReports(gw.pl.persistence.core.Key matchReport) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).removeFromISOMatchReports(matchReport);
  }
  
  /**
   * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
   */
  public void removeFromMedicalActions(entity.MedicalAction element) {
    __getInternalInterface().removeArrayElement(MEDICALACTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMedicalActions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(MEDICALACTIONS_PROP.get(), elementID);
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
   * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherCoverageDet(entity.OtherCoverageDetail element) {
    __getInternalInterface().removeArrayElement(OTHERCOVERAGEDET_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherCoverageDet(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(OTHERCOVERAGEDET_PROP.get(), elementID);
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
   */
  public void removeFromRoleAssignments(entity.UserRoleAssignment element) {
    __getInternalInterface().removeArrayElement(ROLEASSIGNMENTS_PROP.get(), element);
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
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element) {
    __getInternalInterface().removeArrayElement(ROLES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ROLES_PROP.get(), elementID);
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
   * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
   */
  public void removeFromSettlements(entity.Settlement element) {
    __getInternalInterface().removeArrayElement(SETTLEMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSettlements(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SETTLEMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   */
  public void removeFromText(entity.ExposureText element) {
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
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
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
   * Reopens the exposure.
   * @param reopenReason reason typekey for reopening this exposure
   * @param reason a string indicating the reason for which this exposure is being reopened
   * @throws <code>ReopenException</code> if this exposure is already open.
   * @throws <code>EntityValidationException</code> thrown if the exposure itself cannot be reopened (that is, it fails
   *                                      validation).
   */
  public void reopen(typekey.ExposureReopenedReason reopenReason, java.lang.String reason) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).reopen(reopenReason, reason);
  }
  
  /**
   * Runs postsetup rules on this exposure.
   */
  public void runPostSetupRules() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).runPostSetupRules();
  }
  
  /**
   * Runs presetup rules on this exposure.
   */
  public void runPreSetupRules() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).runPreSetupRules();
  }
  
  /**
   * Same as {@link #saveAndSetup(gw.api.assignment.Assignee)}, except it auto assigns the exposure.
   */
  public void saveAndSetup() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).saveAndSetup();
  }
  
  /**
   * <p>
   * Does all preprocessing work required to save an exposure, and then saves it.
   * saveAndSetup performs the following steps:
   * </p>
   * <ol>
   * <li>Sets the Exposure's claim order.</li>
   * <li>Runs the "Pre-assign" ruleset on the exposure.</li>
   * <li>Runs the segmentation engine on the exposure.</li>
   * <li>Runs the strategy engine on the exposure.</li>
   * <li>Runs the assignment engine on the exposure.</li>
   * <li>Runs the workplan engine on the exposure.</li>
   * <li>Runs the "Post-assign" ruleset on the exposure.</li>
   * <li>Sets the exposure's status to "open".</li>
   * <li>Create initial reserves.</li>
   * <li>Commits the exposures's bundle (which will contain the exposure,
   * activities, and other objects creating during the call).</li>
   * </ol>
   * @param assignee the target assignee to which the exposure should be assigned
   * @throws <code>IllegalStateException</code> if exposure is not in a writeable bundle.
   * @throws <code>UserDisplayableException</code> if claim is closed.
   */
  public void saveAndSetup(gw.api.assignment.Assignee assignee) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).saveAndSetup(assignee);
  }
  
  /**
   * Apply segmentation to this exposure.
   * (This does both segmentation and strategy.)
   */
  public void segment() {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).segment();
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
   * Sends an e-mail message about this object.
   * @param to the Contact to whom the e-mail should be sent.
   * @param from the Contact from whom the e-mail should be sent.
   * @param subject the subject of the e-mail message.
   * @param body the body of the e-mail message.
   */
  public void sendEmailWithBody(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String body) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).sendEmailWithBody(to, from, subject, body);
  }
  
  /**
   * Sends an e-mail message about this object.
   * @param toName the name of the recipient
   * @param toEmailAddress the e-mail address of the recipient
   * @param fromName the name of the sender
   * @param fromEmailAddress the e-mail address of the sender
   * @param subject the subject of the e-mail message.
   * @param body the body of the e-mail message.
   */
  public void sendEmailWithBody(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String body) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).sendEmailWithBody(toName, toEmailAddress, fromName, fromEmailAddress, subject, body);
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
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value) {
    __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
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
   * Sets the available reserves for this exposure to the given amount by creating
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
   * @param costType The cost type for the reserve.  This value cannot be <code>null</code>.
   * @param costCategory The cost category for the reserve.  This value cannot be <code>null</code>.
   * @param newReserveAmount The amount the available reserves should be.  The amount must be zero or greater, not negative.
   * @param submittingUser User submitting this reserve.
   * @throws ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
   * @throws ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the reserve
   * @return the new reserve (Note: the amount of the returned reserve should not be changed)
   *         The method will return null if new reserve is not created.
   */
  public entity.Reserve setAvailableReserves(typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setAvailableReserves(costType, costCategory, newReserveAmount, submittingUser);
  }
  
  /**
   * Sets the value of the AverageWeeklyWages field.
   */
  public void setAverageWeeklyWages(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(AVERAGEWEEKLYWAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BenefitPeriods field.
   */
  public void setBenefitPeriods(entity.BenefitPeriod[] value) {
    __getInternalInterface().setFieldValue(BENEFITPERIODS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BreakIn field.
   */
  public void setBreakIn(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BREAKIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimOrder field.
   */
  public void setClaimOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMORDER_PROP.get(), value);
  }
  
  /**
   * 
   * @param claimant 
   */
  public void setClaimant(entity.Contact claimant) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setClaimant(claimant);
  }
  
  /**
   * Sets the value of the ClaimantDenorm field.
   */
  public void setClaimantDenorm(entity.Contact value) {
    __getInternalInterface().setFieldValue(CLAIMANTDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimantType field.
   */
  public void setClaimantType(typekey.ClaimantType value) {
    __getInternalInterface().setFieldValue(CLAIMANTTYPE_PROP.get(), value);
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
  public void setClosedOutcome(typekey.ExposureClosedOutcomeType value) {
    __getInternalInterface().setFieldValue(CLOSEDOUTCOME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CompBenefits field.
   */
  public void setCompBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(COMPBENEFITS_PROP.get(), value);
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
   * Sets the value of the ContactPermitted field.
   */
  public void setContactPermitted(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CONTACTPERMITTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Coverage field.
   */
  public void setCoverage(entity.Coverage value) {
    __getInternalInterface().setFieldValue(COVERAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageSubType field.
   */
  public void setCoverageSubType(typekey.CoverageSubtype value) {
    __getInternalInterface().setFieldValue(COVERAGESUBTYPE_PROP.get(), value);
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
   * Sets the value of the CurrentConditions field.
   */
  public void setCurrentConditions(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CURRENTCONDITIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DaysInWeek field.
   */
  public void setDaysInWeek(typekey.DaysInWeekType value) {
    __getInternalInterface().setFieldValue(DAYSINWEEK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeathBenefits field.
   */
  public void setDeathBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(DEATHBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DepreciatedValue field.
   */
  public void setDepreciatedValue(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(DEPRECIATEDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DiagnosticCnsistnt field.
   */
  public void setDiagnosticCnsistnt(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DIAGNOSTICCNSISTNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DisBenefits field.
   */
  public void setDisBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(DISBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.Document[] value) {
    __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ECFExposureId_Ext field.
   */
  public void setECFExposureId_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ECFEXPOSUREID_EXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExaminationDate field.
   */
  public void setExaminationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(EXAMINATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureISOMatchReports field.
   */
  public void setExposureISOMatchReports(entity.ExposureISOMatchReport[] value) {
    __getInternalInterface().setFieldValue(EXPOSUREISOMATCHREPORTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureLimitReached field.
   */
  public void setExposureLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXPOSURELIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureMetrics field.
   */
  public void setExposureMetrics(entity.ExposureMetric[] value) {
    __getInternalInterface().setFieldValue(EXPOSUREMETRICS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureRpt field.
   */
  private void setExposureRpt(entity.ExposureRpt value) {
    __getInternalInterface().setFieldValue(EXPOSURERPT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureRptArray field.
   */
  private void setExposureRptArray(entity.ExposureRpt[] value) {
    __getInternalInterface().setFieldValue(EXPOSURERPTARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureSynchStates field.
   */
  public void setExposureSynchStates(entity.ExposureSynchState[] value) {
    __getInternalInterface().setFieldValue(EXPOSURESYNCHSTATES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureTier field.
   */
  public void setExposureTier(typekey.ExposureTier value) {
    __getInternalInterface().setFieldValue(EXPOSURETIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureType field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setExposureType(typekey.ExposureType value) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setExposureType(value);
  }
  
  /**
   * Sets the value of the FurtherTreatment field.
   */
  public void setFurtherTreatment(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FURTHERTREATMENT_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMEPerformed field.
   */
  public void setIMEPerformed(entity.IMEPerformed[] value) {
    __getInternalInterface().setFieldValue(IMEPERFORMED_PROP.get(), value);
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
   * Sets the value of the Incident field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setIncident(entity.Incident value) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setIncident(value);
  }
  
  /**
   * Sets the value of the IncidentLimitReached field.
   */
  public void setIncidentLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCIDENTLIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value) {
    __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastDayWorked field.
   */
  public void setLastDayWorked(java.util.Date value) {
    __getInternalInterface().setFieldValue(LASTDAYWORKED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LifePensionBenefits field.
   */
  public void setLifePensionBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(LIFEPENSIONBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Locked field.
   */
  public void setLocked(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LOCKED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossCategory field.
   */
  public void setLossCategory(typekey.LossCategory value) {
    __getInternalInterface().setFieldValue(LOSSCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossParty field.
   */
  public void setLossParty(typekey.LossPartyType value) {
    __getInternalInterface().setFieldValue(LOSSPARTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LostPropertyType field.
   */
  public void setLostPropertyType(typekey.LostPropertyType value) {
    __getInternalInterface().setFieldValue(LOSTPROPERTYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedicalActions field.
   */
  public void setMedicalActions(entity.MedicalAction[] value) {
    __getInternalInterface().setFieldValue(MEDICALACTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetricLimitGeneration field.
   */
  public void setMetricLimitGeneration(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(METRICLIMITGENERATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewEmpData field.
   */
  public void setNewEmpData(entity.EmploymentData value) {
    __getInternalInterface().setFieldValue(NEWEMPDATA_PROP.get(), value);
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
   * Sets the value of the OCR_Ext field.
   */
  public void setOCR_Ext(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OCR_EXT_PROP.get(), value);
  }
  
  /**
   * 
   * @param objectiveFindings 
   */
  public void setObjectiveFindings(java.lang.String objectiveFindings) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setObjectiveFindings(objectiveFindings);
  }
  
  /**
   * Sets the open recovery reserves for this exposure to the given amount by
   * creating a recovery reserve that increases or decreases the current open
   * recovery reserves.
   * @param costType The cost type for the recovery reserve.  This value cannot be <code>null</code>.
   * @param costCategory The cost category for the recovery reserve.  This value cannot be <code>null</code>.
   * @param recoveryCategory The recovery category for the recovery reserve.  This value cannot be <code>null</code>.
   * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
   * @param submittingUser User submitting this recovery reserve.
   * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims).
   * @throws ClosedExposureException if the exposure is closed (recovery reserves cannot be created on closed exposures).
   * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve.
   * @throws RecoveryReservesNotAllowedException if the system is not configured to allow recovery reserves, i.e.,
   *                                        the <code>UseRecoveryReserves</code> parameter is false.
   * @return the new Recovery Reserve (Note: the amount of the returned Recovery Reserve should not be changed)
   *         The method will return null if new recoveryReserve is not created.
   */
  public entity.RecoveryReserve setOpenRecoveryReserves(typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setOpenRecoveryReserves(costType, costCategory, recoveryCategory, newRecoveryReserveAmount, submittingUser);
  }
  
  /**
   * Sets the value of the OtherCoverage field.
   */
  public void setOtherCoverage(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OTHERCOVERAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherCoverageDet field.
   */
  public void setOtherCoverageDet(entity.OtherCoverageDetail[] value) {
    __getInternalInterface().setFieldValue(OTHERCOVERAGEDET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherCoverageInfo field.
   */
  public void setOtherCoverageInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OTHERCOVERAGEINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OtherCovgChoice field.
   */
  public void setOtherCovgChoice(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(OTHERCOVGCHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPClaimAggLimitReached field.
   */
  public void setPIPClaimAggLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PIPCLAIMAGGLIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPDeathBenefits field.
   */
  public void setPIPDeathBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(PIPDEATHBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPESSLimitReached field.
   */
  public void setPIPESSLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PIPESSLIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPNonMedAggLimitReached field.
   */
  public void setPIPNonMedAggLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PIPNONMEDAGGLIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPPersonAggLimitReached field.
   */
  public void setPIPPersonAggLimitReached(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PIPPERSONAGGLIMITREACHED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PIPVocBenefits field.
   */
  public void setPIPVocBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(PIPVOCBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PPDBenefits field.
   */
  public void setPPDBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(PPDBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTDBenefits field.
   */
  public void setPTDBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(PTDBENEFITS_PROP.get(), value);
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
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value) {
    __getInternalInterface().setFieldValue(PRIMARYCOVERAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PriorEmpData field.
   */
  public void setPriorEmpData(entity.EmploymentData value) {
    __getInternalInterface().setFieldValue(PRIOREMPDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Progress field.
   */
  public void setProgress(typekey.ExposureProgressType value) {
    __getInternalInterface().setFieldValue(PROGRESS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RIAgreementGroup field.
   */
  public void setRIAgreementGroup(entity.RIAgreementGroup value) {
    __getInternalInterface().setFieldValue(RIAGREEMENTGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RIGroupSetExternally field.
   */
  public void setRIGroupSetExternally(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RIGROUPSETEXTERNALLY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RSBenefits field.
   */
  public void setRSBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(RSBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReOpenDate field.
   */
  public void setReOpenDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(REOPENDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReopenedReason field.
   */
  public void setReopenedReason(typekey.ExposureReopenedReason value) {
    __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReplacementValue field.
   */
  public void setReplacementValue(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REPLACEMENTVALUE_PROP.get(), value);
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
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value) {
    __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SSBenefit field.
   */
  public void setSSBenefit(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SSBENEFIT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SSDIBenefits field.
   */
  public void setSSDIBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(SSDIBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SSDIEligible field.
   */
  public void setSSDIEligible(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SSDIELIGIBLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SecurityLevel field.
   */
  public void setSecurityLevel(typekey.ExposureSecurityType value) {
    __getInternalInterface().setFieldValue(SECURITYLEVEL_PROP.get(), value);
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
   * Sets the value of the SettleDate field.
   */
  public void setSettleDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SETTLEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SettleMethod field.
   */
  public void setSettleMethod(typekey.SettleMethod value) {
    __getInternalInterface().setFieldValue(SETTLEMETHOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Settlements field.
   */
  public void setSettlements(entity.Settlement[] value) {
    __getInternalInterface().setFieldValue(SETTLEMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StatLine field.
   */
  public void setStatLine(entity.StatCode value) {
    __getInternalInterface().setFieldValue(STATLINE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.ExposureState value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.ClaimStrategy value) {
    __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
  }
  
  /**
   * 
   * @param subjectiveComplaints 
   */
  public void setSubjectiveComplaints(java.lang.String subjectiveComplaints) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setSubjectiveComplaints(subjectiveComplaints);
  }
  
  /**
   * 
   * @param exposureType 
   * @deprecated Use setExposureType() instead.
   */
  public void setSubtype(typekey.ExposureType exposureType) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setSubtype(exposureType);
  }
  
  /**
   * Sets the value of the SupplementalWorkloadWeight field.
   */
  public void setSupplementalWorkloadWeight(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TPDBenefits field.
   */
  public void setTPDBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(TPDBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TTDBenefits field.
   */
  public void setTTDBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(TTDBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TempLocation field.
   */
  public void setTempLocation(entity.Address value) {
    __getInternalInterface().setFieldValue(TEMPLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(entity.ExposureText[] value) {
    __getInternalInterface().setFieldValue(TEXT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Transactions field.
   * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
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
   * 
   * @param treatmentRendered 
   */
  public void setTreatmentRendered(java.lang.String treatmentRendered) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setTreatmentRendered(treatmentRendered);
  }
  
  /**
   * Implements type safe properties for accessing incident subtypes; for example <code>VehicleIncident</code> can be used to
   * access the incident as a <code>VehicleIncident</code> (providing it really is a VehicleIncident!). Throws illegal argument
   * exception if the named type is not the type required for the current exposure type. Note that the setter has
   * to be stricter than the getter. You can get an incident and treat it as a supertype. But when setting an
   * incident its type must be exactly the type required by the exposure type.
   * @param typeName the incident type (not used)
   * @param value incident to attempt to set
   */
  public void setTypedIncident(java.lang.String typeName, java.lang.Object value) {
    ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setTypedIncident(typeName, value);
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
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value) {
    __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VocBenefits field.
   */
  public void setVocBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(VOCBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCBenefit field.
   */
  public void setWCBenefit(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WCBENEFIT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCBenefits field.
   */
  public void setWCBenefits(entity.Benefits value) {
    __getInternalInterface().setFieldValue(WCBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCPreexDisblty field.
   */
  public void setWCPreexDisblty(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WCPREEXDISBLTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WCPreexDisbltyInfo field.
   */
  public void setWCPreexDisbltyInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WCPREEXDISBLTYINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WageBenefit field.
   */
  public void setWageBenefit(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WAGEBENEFIT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WageStmtRecd field.
   */
  public void setWageStmtRecd(java.util.Date value) {
    __getInternalInterface().setFieldValue(WAGESTMTRECD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WageStmtSent field.
   */
  public void setWageStmtSent(java.util.Date value) {
    __getInternalInterface().setFieldValue(WAGESTMTSENT_PROP.get(), value);
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
   * Executes new exposure validation rules on the exposure, and returns a validation object containing any errors (if
   * validation was successful, an empty validation object is returned). Note that this method has the side-effect of
   * setting the validation level, and hence requires that the current user have Claim EDIT permissions, or
   * will throw an exception.
   * @param validateClaim Whether or not the exposure's claim should be validated as well.  If <code>true</code>
   *                      then the claim is validated <b>before</b> the exposure is validated.
   * @return a <code>ValidationResult</code> containing 0 or more errors found.
   */
  public gw.api.validation.ValidationResult validate(boolean validateClaim) {
    return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).validate(validateClaim);
  }
  
  /**
   * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
   */
  public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
    return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ExposureInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Exposure.this.__getDelegateManager();
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
     * Adds the given element to the BenefitPeriods array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBenefitPeriods(entity.BenefitPeriod element) {
      __getInternalInterface().addArrayElement(BENEFITPERIODS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDocuments(entity.Document element) {
      __getInternalInterface().addArrayElement(DOCUMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ExposureISOMatchReports array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposureISOMatchReports(entity.ExposureISOMatchReport element) {
      __getInternalInterface().addArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ExposureMetrics array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposureMetrics(entity.ExposureMetric element) {
      __getInternalInterface().addArrayElement(EXPOSUREMETRICS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ExposureRptArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposureRptArray(entity.ExposureRpt element) {
      __getInternalInterface().addArrayElement(EXPOSURERPTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ExposureSynchStates array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposureSynchStates(entity.ExposureSynchState element) {
      __getInternalInterface().addArrayElement(EXPOSURESYNCHSTATES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the IMEPerformed array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToIMEPerformed(entity.IMEPerformed element) {
      __getInternalInterface().addArrayElement(IMEPERFORMED_PROP.get(), element);
    }
    
    /**
     * Add the given match report to the array of match reports on this Claim/Exposure
     * @param report the report to be added
     */
    public void addToISOMatchReports(entity.ISOMatchReport report) {
      ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).addToISOMatchReports(report);
    }
    
    /**
     * Adds the given element to the MedicalActions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToMedicalActions(entity.MedicalAction element) {
      __getInternalInterface().addArrayElement(MEDICALACTIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToNotes(entity.Note element) {
      __getInternalInterface().addArrayElement(NOTES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the OtherCoverageDet array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOtherCoverageDet(entity.OtherCoverageDetail element) {
      __getInternalInterface().addArrayElement(OTHERCOVERAGEDET_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ReserveLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToReserveLines(entity.ReserveLine element) {
      __getInternalInterface().addArrayElement(RESERVELINES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RoleAssignments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoleAssignments(entity.UserRoleAssignment element) {
      __getInternalInterface().addArrayElement(ROLEASSIGNMENTS_PROP.get(), element);
    }
    
    public void addToRoleAssignments(entity.UserRoleAssignmentDelegate element) {
      ((com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods")).addToRoleAssignments(element);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Settlements array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSettlements(entity.Settlement element) {
      __getInternalInterface().addArrayElement(SETTLEMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToText(entity.ExposureText element) {
      __getInternalInterface().addArrayElement(TEXT_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
     * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
     */
    @java.lang.Deprecated
    public void addToTransactions(entity.Transaction element) {
      __getInternalInterface().addArrayElement(TRANSACTIONS_PROP.get(), element);
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
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).assignUserRole(user, group, role);
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
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    /**
     * Calculates the initial reserve on this exposure.
     * @param userID The requesting user of the <code>ReserveSet</code>.
     * @return the set of initial reserves created by the <code>IInitialReserveAdapter</code>.
     */
    public entity.Reserve[] calculateInitialReserve(gw.pl.persistence.core.Key userID) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).calculateInitialReserve(userID);
    }
    
    public entity.Reserve[] calculateInitialReserveWithAdapter(com.guidewire.cc.domain.financials.adapter.InitialReserveAdapter adapter, gw.pl.persistence.core.Key userID) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).calculateInitialReserveWithAdapter(adapter, userID);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    /**
     * Returns true if this exposure in the open state, has no awaiting submission,
     * future payments tied to it, and the specified user has permission to close it.
     * @param user The user whose permissions should be checked.
     * @return <code>true</code> if the specified user can close this exposure.
     */
    public boolean canClose(entity.User user) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canClose(user);
    }
    
    /**
     * Returns whether the given user can create a reserve on this exposure.
     * @param user the user to test whether he can create a reserve on this exposure.
     * @return true if current user has reserve authority and exposure is open, false otherwise.
     */
    public boolean canCreateReserve(entity.User user) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canCreateReserve(user);
    }
    
    /**
     * Determines whether this owner can be edited.
     */
    public boolean canEdit() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
    }
    
    /**
     * <p>
     * Returns true if the specified user can re-open this exposure.
     * </p>
     * This is only true if:
     * <ul>
     * <li>this exposure is currently closed</li>
     * <li>the claim is currently open</li>
     * <li>the user has permission to reopen the exposure</li>
     * </ul>
     * @param user The user whose permissions to check.
     * @return <code>true</code> iff the specified user can re-open this exposure.
     */
    public boolean canReopen(entity.User user) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).canReopen(user);
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
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
     */
    public void clearRoleCache() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Closes the exposure and zeros out the exposure's open reserves.
     * @param outcome the outcome of the exposure
     * @param reason a string explaining the reason why this exposure is being closed
     * @throws <code>CloseException</code> if this exposure is already closed
     * @throws <code>EntityValidationException</code> thrown if the exposure itself cannot be closed (that is,  it fails validation)
     */
    public void close(typekey.ExposureClosedOutcomeType outcome, java.lang.String reason) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).close(outcome, reason);
    }
    
    public void closeWithValidationOption(typekey.ExposureClosedOutcomeType outcome, java.lang.String reason, gw.api.validation.BundleValidationOption validationOption) throws com.guidewire.pl.system.exception.CloseException, gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).closeWithValidationOption(outcome, reason, validationOption);
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
     * Creates a check on this exposure with the given parameters.  The check
     * will contain one partial payment with one line item.
     * @param payee The payee of the check.
     * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other).
     * @param recipient The contact the check should be sent to.
     * @param mailingAddress The address the check should be sent to.
     * @param reportabilityType The reportability type of the check.
     * @param costType The <code>CostType</code> for the payment - can be <code>null</code>, in which case a
     *                          default value of <code>Unspecified</code> is used.
     * @param costCategory The <code>CostCategory</code> for the payment - can be <code>null</code>, in which case a
     *                          default value of <code>Unspecified</code> is used.
     * @param lineCategory The category for the payment line item.
     * @param checkAmount The amount of the payment line item (and therefore the check).
     * @param comments Comments on this check.
     * @param memo The memo for the check.
     * @param payTo The pay to for the check.
     * @param scheduledSendDate The scheduled send date of the check.
     * @param requestingUser The user requesting this check.
     * @throws <code>InsufficientAuthorityException</code> if the submitting user does not have authority to create the check
     * @throws <code>WorkflowValidationException</code> if there is a problem during workflow validation
     * @throws <code>DeductionAdapterException</code> if a configured <code>IDeductionAdapter</code> is unavailable or experiences some other error
     *          while trying to get the deductions.
     * @return the created check
     * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
     */
    public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
    }
    
    /**
     * Creates a check on this exposure with the given parameters.  The check
     * will contain one payment with one line item.  The difference between this method and the
     * other very similar version is that this version allows a specific <code>PaymentType</code> to be specified
     * for the new check's payment.
     * @param payee The payee of the check.
     * @param payeeRole The role of the check payee (Insured, Claimant, Vendor, Other).
     * @param recipient The contact the check should be sent to.
     * @param mailingAddress The address the check should be sent to.
     * @param reportabilityType The reportability type of the check.
     * @param costType The <code>CostType</code> for the payment - cannot be <code>null</code>, an IllegalArgumentException will be thrown.
     * @param costCategory The <code>CostCategory</code> for the payment - cannot be <code>null</code>, an IllegalArgumentException will be thrown.
     * @param paymentType The <code>PaymentType</code> for this payment - can be <code>null</code>, in which case the
     *                          payment type defaults to <code>Partial</code>.
     * @param lineCategory The category for the payment line item.
     * @param checkAmount The amount of the payment line item (and therefore the check).
     * @param comments Comments on this check.
     * @param memo The memo for the check .
     * @param payTo The pay to for the check.
     * @param scheduledSendDate The scheduled send date of the check.
     * @param requestingUser The user requesting this check
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the check
     * @throws WorkflowValidationException if there is a problem during workflow validation
     * @throws DeductionAdapterException if a configured <code>IDeductionAdapter</code> is unavailable or experiences some other error
     *                                        while trying to get the deductions.
     * @return the created check
     * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
     */
    public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, comments, memo, payTo, scheduledSendDate, requestingUser);
    }
    
    /**
     * Creates a check on this exposure with the given parameters.  The check
     * will contain one payment with one line item.  The difference between this method and the
     * other very similar version is that this version allows a specific <code>PaymentType</code> to be specified
     * for the new check's payment.
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
     * @param checkCurrency The Currency of the payment line item (and therefore the check). null uses Claim/Default Currency
     * @param transToClaimExchangeRateOverride Use null for a current market rate. If non-null, the custom Transaction-to-Claim Currency exhange rate to use.
     * @param transToClaimExchangeRateDescription Use null if transToClaimExchangeRateOverride is null. The custom exchange rate description.
     * @param claimAmountOverride Please use null. A non-null value overrides the ClaimAmount calculated from the checkAmount and exchange rate.
     * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
     * @param comments Comments on this check
     * @param memo The memo for the check
     * @param payTo The pay to for the check
     * @param scheduledSendDate The scheduled send date of the check
     * @param requestingUser The user requesting this check @return the created check
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the check
     * @throws WorkflowValidationException if there is a problem during workflow validation.
     * @throws DeductionAdapterException if a configured DeductionAdapter is unavailable or experiences some other error
     *                                        while trying to get the deductions.
     * @return new check
     * @deprecated Use <code>CheckCreator</code> instead to get a CheckCreator for the Exposure and then create the check
     */
    public entity.Check createCheck(entity.Contact payee, typekey.ContactRole payeeRole, entity.Contact recipient, entity.Address mailingAddress, typekey.ReportabilityType reportabilityType, typekey.CostType costType, typekey.CostCategory costCategory, typekey.PaymentType paymentType, typekey.LineCategory lineCategory, java.math.BigDecimal checkAmount, typekey.Currency checkCurrency, java.math.BigDecimal transToClaimExchangeRateOverride, java.lang.String transToClaimExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, java.lang.String memo, java.lang.String payTo, java.util.Date scheduledSendDate, entity.User requestingUser) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createCheck(payee, payeeRole, recipient, mailingAddress, reportabilityType, costType, costCategory, paymentType, lineCategory, checkAmount, checkCurrency, transToClaimExchangeRateOverride, transToClaimExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, memo, payTo, scheduledSendDate, requestingUser);
    }
    
    /**
     * Returns a new Check Creator. Called internally by the newCheckCreator() methods.
     */
    public gw.api.financials.CheckCreator createCheckCreator() {
      return ((gw.api.financials.CheckCreatorProvider)__getDelegateManager().getImplementation("gw.api.financials.CheckCreatorProvider")).createCheckCreator();
    }
    
    /**
     * Creates an initial reserve on this exposure.  The reserve is created with
     * one line item. The reserving currency of the new reserve is set to the
     * claim currency.
     * 
     * The Reserve that is returned by this method is still editable, so you can
     * modify its Currency or other fields.
     * 
     * <p><b>Note:</b> This method is only needed for rules. Specifically, it
     * should only be used within the Initial Reserves ruleset. Note that reserves
     * created via this method and Initial Reserves rules are not submitted for approval
     * and hence bypass authority limit checking. They are immediately updated to Submitting status.
     * @param costType The cost type for the reserve.
     * @param category The cost category for the reserve.
     * @param amount The amount of the reserve line item (and therefore the reserve).
     * @return the newly created Reserve transaction
     */
    public entity.Reserve createInitialReserve(typekey.CostType costType, typekey.CostCategory category, java.math.BigDecimal amount) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createInitialReserve(costType, category, amount);
    }
    
    /**
     * Creates a recovery on this exposure.  The recovery is created with one line item and the Claim Currency.
     * @param payer The payer of the recovery.
     * @param costType The costtype for the recovery.  This value cannot be <code>null</code>.
     * @param costCategory The costcategory for the recovery  This value cannot be <code>null</code>.
     * @param recoveryCategory The Recovery Category for the recovery.
     * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
     * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
     * @param comments Comments on this recovery.
     * @param requestingUser The user requesting this recovery.
     * @return the created recovery
     */
    public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, java.lang.String comments, entity.User requestingUser) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, comments, requestingUser);
    }
    
    /**
     * Creates a recovery on this exposure.  The recovery is created with one line item.
     * @param payer The payer of the recovery.
     * @param costType The costtype for the recovery.  This value cannot be <code>null</code>.
     * @param costCategory The costcategory for the recovery  This value cannot be <code>null</code>.
     * @param recoveryCategory The Recovery Category for the recovery.
     * @param lineCategory The category for the line item.  (We assume only one line item -- this is nullable.)
     * @param recoveryAmount The amount of the recovery line item (and therefore the recovery).  The amount must be positive.
     * @param recoveryCurrency The currency of the recoveryAmount.
     * @param exchangeRateOverride The exchange rate that is to be used to override the default rate, can be null
     * @param customExchangeRateDescription The custom exchange rate description, can be null
     * @param claimAmountOverride The claim amount to override the automatically calculated amount, can be null
     * @param reportingAmountOverride The reporting Amount to override, not used for now, MUST BE NULL
     * @param comments Comments on this recovery.
     * @param requestingUser The user requesting this recovery. @return the created recovery
     */
    public entity.Recovery createRecovery(entity.Contact payer, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.LineCategory lineCategory, java.math.BigDecimal recoveryAmount, typekey.Currency recoveryCurrency, java.math.BigDecimal exchangeRateOverride, java.lang.String customExchangeRateDescription, java.math.BigDecimal claimAmountOverride, java.math.BigDecimal reportingAmountOverride, java.lang.String comments, entity.User requestingUser) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createRecovery(payer, costType, costCategory, recoveryCategory, lineCategory, recoveryAmount, recoveryCurrency, exchangeRateOverride, customExchangeRateDescription, claimAmountOverride, reportingAmountOverride, comments, requestingUser);
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
     * Executes a rule set (synchronously) to generate a workplan for this exposure.
     */
    public void createWorkplan() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).createWorkplan();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * Checks if this exposure already has an incident and creates a new one of the appropriate type if
     * it doesn't. If it creates a new incident, sets the incident's claim to be this exposure's claim.
     * @return the incident
     */
    public entity.Incident ensureIncidentCreated() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).ensureIncidentCreated();
    }
    
    /**
     * Find any existing open assignment review activities related to this assignable. Normally this will
     * return either zero or one activities. Assignment review activities are used for manual assignment.
     * @return a query result containing the open assignment review activities, if any
     */
    public gw.api.database.IQueryResult<entity.Activity, entity.Activity> findAssignmentReviewActivities() {
      return ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).findAssignmentReviewActivities();
    }
    
    public void finishAssignment() {
      ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).finishAssignment();
    }
    
    /**
     * Freeze and remember the current state (OPEN, CLOSED, etc.) of the Exposure, to guard against concurrent changes that would
     * interfere with, for instance, Payment recodes.
     */
    public void freezeState() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).freezeState();
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
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the active assignments to the given role.
     * @param userRole 
     * @return 
     */
    public entity.UserRoleAssignment[] getActiveUserRoleAssignments(typekey.UserRole userRole) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getActiveUserRoleAssignments(userRole);
    }
    
    /**
     * Gets the value of the Activities field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Activity[] getActivities() {
      return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
    }
    
    /**
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getAllowedContactRolesForEntity();
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
     * Gets the value of the AverageWeeklyWages field.
     * Average weekly wages; this calculation differs by state.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAverageWeeklyWages() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVERAGEWEEKLYWAGES_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BenefitPeriods field.
     * Periods of time when employee received benefits.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BenefitPeriod[] getBenefitPeriods() {
      return (entity.BenefitPeriod[])__getInternalInterface().getFieldValue(BENEFITPERIODS_PROP.get());
    }
    
    /**
     * Returns a new CheckCreator object for creating a check on this exposure.
     * @deprecated Call newCheckCreator() method instead. This property has always
     *             returned a new CheckCreator with each access.
     */
    public gw.api.financials.CheckCreator getCheckCreator() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getCheckCreator();
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
     * Gets the value of the Claim field.
     * The Claim for this Exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
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
     * Returns the Currency of this Exposure's associated Claim.
     * @return The currency of the associated Claim, as an element of the Currency typelist.
     *         Returns NULL if the Claim is currently unreachable (if, for example, the
     *         necessary entity connections have not yet been made).
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimOrder field.
     * Order of the exposure on the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMORDER_PROP.get());
    }
    
    /**
     */
    public entity.Contact getClaimant() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimant();
    }
    
    /**
     * Gets the value of the ClaimantDenorm field.
     * The claimant for the exposure, denormalized from the claim's contact array.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getClaimantDenorm() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMANTDENORM_PROP.get());
    }
    
    /**
     * Gets the exposure's claimant using the denormalized fields-- first checks the exposure's <code>getClaimantDenorm()</code>
     * method, and if that returns <code>null</code> checks the claim's <code>getClaimantDenorm()</code> method.  Does
     * not check the claim type before attempting to return the <code>claim.ClaimantDenorm</code> value.
     * @return the denormalized claimant field, or <code>null</code> if none
     */
    public entity.Contact getClaimantDenormForExposure() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getClaimantDenormForExposure();
    }
    
    public gw.pl.persistence.core.Key getClaimantDenormID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMANTDENORM_PROP.get());
    }
    
    public entity.Contact getClaimantForExposure() {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).getClaimantForExposure();
    }
    
    /**
     * Gets the value of the ClaimantType field.
     * Categorizes the claimant relative to policyholder.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimantType getClaimantType() {
      return (typekey.ClaimantType)__getInternalInterface().getFieldValue(CLAIMANTTYPE_PROP.get());
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
     * Outcome reached when closing the exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureClosedOutcomeType getClosedOutcome() {
      return (typekey.ExposureClosedOutcomeType)__getInternalInterface().getFieldValue(CLOSEDOUTCOME_PROP.get());
    }
    
    /**
     * Gets the value of the CompBenefits field.
     * Compensation benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getCompBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(COMPBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCompBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(COMPBENEFITS_PROP.get());
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
     * Gets the value of the Coverage field.
     * The specific coverage for this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Coverage getCoverage() {
      return (entity.Coverage)__getInternalInterface().getFieldValue(COVERAGE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCoverageID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(COVERAGE_PROP.get());
    }
    
    public com.guidewire.cc.domain.aggregatelimit.CoverageLineMatchData getCoverageLineMatchData() {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).getCoverageLineMatchData();
    }
    
    /**
     * Gets the value of the CoverageSubType field.
     * The coverage subtype.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageSubtype getCoverageSubType() {
      return (typekey.CoverageSubtype)__getInternalInterface().getFieldValue(COVERAGESUBTYPE_PROP.get());
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
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getCurrentRoleAssignment();
    }
    
    /**
     * Gets the value of the DaysInWeek field.
     * Days in week used for benefit calculation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DaysInWeekType getDaysInWeek() {
      return (typekey.DaysInWeekType)__getInternalInterface().getFieldValue(DAYSINWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the DeathBenefits field.
     * Death benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getDeathBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(DEATHBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDeathBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DEATHBENEFITS_PROP.get());
    }
    
    public typekey.ValidationLevel getDefaultValidationLevel() {
      return ((com.guidewire.pl.system.entity.LevelAwareValidatableBean)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.LevelAwareValidatableBean")).getDefaultValidationLevel();
    }
    
    /**
     * Gets the value of the DepreciatedValue field.
     * Depreciated value of property or vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getDepreciatedValue() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DEPRECIATEDVALUE_PROP.get());
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
     * Gets the value of the DisBenefits field.
     * Disability benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getDisBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(DISBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDisBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DISBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the Documents field.
     * The documents associated with this exposure; for example, FNOL accord form or police report.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Document[] getDocuments() {
      return (entity.Document[])__getInternalInterface().getFieldValue(DOCUMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the ECFExposureId_Ext field.
     * Exposure Id is used to identify exposures in an ECF WB Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getECFExposureId_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ECFEXPOSUREID_EXT_PROP.get());
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
     * Gets the value of the ExposureISOMatchReports field.
     * ISO match reports for this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureISOMatchReport[] getExposureISOMatchReports() {
      return (entity.ExposureISOMatchReport[])__getInternalInterface().getFieldValue(EXPOSUREISOMATCHREPORTS_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureMetrics field.
     * Metrics related to this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureMetric[] getExposureMetrics() {
      return (entity.ExposureMetric[])__getInternalInterface().getFieldValue(EXPOSUREMETRICS_PROP.get());
    }
    
    /**
     * Array association for partition ExposureMetricsBySubtype on array ExposureMetrics
     */
    public entity.ExposureMetric getExposureMetricsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ExposureMetric)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the ExposureRpt field.
     * The calculated financials data for this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureRpt getExposureRpt() {
      return (entity.ExposureRpt)__getInternalInterface().getFieldValue(EXPOSURERPT_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureRptArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureRpt[] getExposureRptArray() {
      return (entity.ExposureRpt[])__getInternalInterface().getFieldValue(EXPOSURERPTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureRptID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURERPT_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureSynchStates field.
     * Sync states related to this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureSynchState[] getExposureSynchStates() {
      return (entity.ExposureSynchState[])__getInternalInterface().getFieldValue(EXPOSURESYNCHSTATES_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureTier field.
     * The tier of this exposure, used to decide how to rate the exposure metrics.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureTier getExposureTier() {
      return (typekey.ExposureTier)__getInternalInterface().getFieldValue(EXPOSURETIER_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureType field.
     * Types of exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureType getExposureType() {
      return (typekey.ExposureType)__getInternalInterface().getFieldValue(EXPOSURETYPE_PROP.get());
    }
    
    /**
     */
    public java.lang.String getFullDescription() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getFullDescription();
    }
    
    /**
     */
    public java.lang.String getFullDescriptionWithLossParty() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getFullDescriptionWithLossParty();
    }
    
    public java.util.List<com.guidewire.pl.domain.assignment.impl.AssignmentStateHelper> getGroupAssignmentStateHelpers() {
      return ((com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods")).getGroupAssignmentStateHelpers();
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
     * Estimated days in hospital.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getHospitalDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(HOSPITALDAYS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    /**
     * Gets the value of the IMEPerformed field.
     * Independent medical examinations performed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.IMEPerformed[] getIMEPerformed() {
      return (entity.IMEPerformed[])__getInternalInterface().getFieldValue(IMEPERFORMED_PROP.get());
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
     * Gets the value of the Incident field.
     * Incident that caused this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Incident getIncident() {
      return (entity.Incident)__getInternalInterface().getFieldValue(INCIDENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getIncidentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INCIDENT_PROP.get());
    }
    
    /**
     * Returns the initial reserve transaction of this exposure.  The initial reserve is the saved reserve with
     * a status of <code>TransactionStatus.TC_SUBMITTING</code> or <code>TransactionStatus.TC_SUBMITTED</code> that has
     * the earliest update time.  Excludes the transactions in the given <code>TransactionSet</code> if it is not <code>null</code>.
     * <p>
     * Note this method only returns one reserve, though many reserve transactions may have been initially created at the same time
     * and meet the given filter requirements. Also, this method has nothing to do with Claim Health Metrics that use
     * a concept of initial reserves.
     * <p>
     * This method used to return the Amount of the initial Reserve; add ".Amount" to the end to get the old
     * return value (this is null safe in Gosu). It would also return BigDecimal.ZERO if the Amount was null,
     * so you'll have to add a check for that null case, too. For example:
     * <pre>
     *   var amount = exposure.getInitialReserve(...).Amount
     *   amount = (amount == null ? BigDecimal.ZERO : amount)
     * </pre>
     * @param transactionSet reserves included in this <code>TransactionSet</code> is excluded from the determination of
     *                       the initial reserve
     * @param costType only reserves that have this <code>CostType</code> are considered - if <code>null</code>, then all
     *                       reserves are considered, regardless of <code>CostType</code>.
     * @param costCategory only reserves that have this <code>CostCategory</code> are considered - if <code>null</code>,
     *                       then all reserves are considered, regardless of <code>CostCategory</code>.
     * @return initial reserve of this exposure, or null if no match
     */
    public entity.Reserve getInitialReserve(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getInitialReserve(transactionSet, costType, costCategory);
    }
    
    /**
     * Gets the value of the JurisdictionState field.
     * State of jurisdiction, if different than location of loss. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getJurisdictionState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the LastDayWorked field.
     * Last day worked.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLastDayWorked() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LASTDAYWORKED_PROP.get());
    }
    
    /**
     * Gets the value of the LifePensionBenefits field.
     * Life Pension benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getLifePensionBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(LIFEPENSIONBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLifePensionBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LIFEPENSIONBENEFITS_PROP.get());
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
     * Gets the value of the LossCategory field.
     * Detailed category of the exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossCategory getLossCategory() {
      return (typekey.LossCategory)__getInternalInterface().getFieldValue(LOSSCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the LossParty field.
     * The loss party; generally either first- or third-party loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossPartyType getLossParty() {
      return (typekey.LossPartyType)__getInternalInterface().getFieldValue(LOSSPARTY_PROP.get());
    }
    
    /**
     * Gets the value of the LostPropertyType field.
     * ISO category of lost property, for theft losses.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LostPropertyType getLostPropertyType() {
      return (typekey.LostPropertyType)__getInternalInterface().getFieldValue(LOSTPROPERTYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MedicalActions field.
     * Key medical-related dates.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MedicalAction[] getMedicalActions() {
      return (entity.MedicalAction[])__getInternalInterface().getFieldValue(MEDICALACTIONS_PROP.get());
    }
    
    /**
     * Gets the value of the MetricLimitGeneration field.
     * Generation number, used to identify the limits for this exposure's metrics
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMetricLimitGeneration() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(METRICLIMITGENERATION_PROP.get());
    }
    
    /**
     * Gets the value of the NewEmpData field.
     * Information about a new job that the claimant has taken.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.EmploymentData getNewEmpData() {
      return (entity.EmploymentData)__getInternalInterface().getFieldValue(NEWEMPDATA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNewEmpDataID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NEWEMPDATA_PROP.get());
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Gets the value of the Notes field.
     * Notes particular to this exposure. Notes can also be associated with the claim in general.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Note[] getNotes() {
      return (entity.Note[])__getInternalInterface().getFieldValue(NOTES_PROP.get());
    }
    
    public int getNumPayments() {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).getNumPayments();
    }
    
    /**
     * Gets the value of the OCR_Ext field.
     * The OCR is the Originating Claim Office Reference which can be found on messages such as SCMs
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOCR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OCR_EXT_PROP.get());
    }
    
    /**
     */
    public java.lang.String getObjectiveFindings() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getObjectiveFindings();
    }
    
    /**
     * OpenReserves calculation for this exposure.
     */
    public gw.api.financials.CurrencyAmount getOpenReserves() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getOpenReserves();
    }
    
    public entity.ExposureRpt getOrCreateExposureRpt(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).getOrCreateExposureRpt(bundle);
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
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getOrCreateUserRoleAssignmentByRole(role);
    }
    
    /**
     * Gets the value of the OtherCoverageDet field.
     * Details of other coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.OtherCoverageDetail[] getOtherCoverageDet() {
      return (entity.OtherCoverageDetail[])__getInternalInterface().getFieldValue(OTHERCOVERAGEDET_PROP.get());
    }
    
    /**
     * Gets the value of the OtherCoverageInfo field.
     * Information regarding additional coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOtherCoverageInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OTHERCOVERAGEINFO_PROP.get());
    }
    
    /**
     * Gets the value of the OtherCovgChoice field.
     * Whether there is other coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getOtherCovgChoice() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(OTHERCOVGCHOICE_PROP.get());
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
     * Gets the value of the PIPDeathBenefits field.
     * Death benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getPIPDeathBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(PIPDEATHBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPIPDeathBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PIPDEATHBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the PIPVocBenefits field.
     * Vocational rehab benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getPIPVocBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(PIPVOCBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPIPVocBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PIPVOCBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the PPDBenefits field.
     * PPD benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getPPDBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(PPDBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPPDBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PPDBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the PTDBenefits field.
     * PTD benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getPTDBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(PTDBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPTDBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PTDBENEFITS_PROP.get());
    }
    
    /**
     * TotalPayments calculation for this exposure.
     */
    public gw.api.financials.CurrencyAmount getPaymentAmount() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentAmount();
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the <code>Payment</code> objects for this exposure.
     * You can choose to get either all the payments or only the new and modified payments.  If you choose to get all the
     * <code>Payment</code> objects, then <code>Payment</code> objects in the current transaction are not be
     * returned by the <code>Iterator</code>. This method is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
     * and iterating through all the transactions to find just the desired <code>Payment</code> objects.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be
     * in the same bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit the beans, you
     * should add them to an editable bundle first.
     * </p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Payment</code> objects for this exposure are
     *                           returned.  This includes payments for which only the line items were modified.  Otherwise,
     *                           if <code>false</code> then all <code>Payment</code> objects for the exposure are returned, including
     *                           new and modified <code>Payment</code> objects, but excluding deleted <code>Payment</code> objects.
     * @return an <code>Iterator</code> that returns <code>Payment</code> objects.
     */
    public java.util.Iterator<entity.Payment> getPaymentsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentsIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the payments for this exposure. This query is suitable for populating
     * a list view in the UI.  The query also filters by the  current user's transaction view permissions, so the results
     * may be empty if the user has no payment view permissions. The payments are returned as they currently exist on the database.
     * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Payment</code> objects for
     *         this exposure.  The returned rows are actually <code>PaymentView</code> entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.PaymentView> getPaymentsQuery() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPaymentsQuery();
    }
    
    /**
     * <p>
     * Returns an array containing the possible coverage subtypes for this exposure if the coverage
     * type is set to the given value. Takes into account the exposure's type and excludes any coverage
     * subtypes not available for this exposure's type. The coverage type is exposed as a parameter (rather than just
     * being the current <code>PrimaryCoverage</code> value).
     * </p><p>
     * You can use this method to ask  "if the coverage type of this exposure was X, what subtypes are possible?".
     * This may be useful in the UI for constructing reflection value ranges. For example, if the user selects a particular
     * coverage type you can set the choice of coverage subtypes appropriately via reflection.
     * </p>
     * @param coverageType the proposed coverage type. To use the current coverage type just use the
     *                     result of {@link entity.Exposure#getPrimaryCoverage()}.
     * @return the array of possible coverage subtypes, or an empty array if there are none or if
     *         the <code>coverageType</code> parameter is <code>null</code>. Never returns <code>null</code>.
     */
    public typekey.CoverageSubtype[] getPossibleCoverageSubtypes(typekey.CoverageType coverageType) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleCoverageSubtypes(coverageType);
    }
    
    /**
     * Returns an array containing the possible coverage types for this exposure, given the claim's policy type
     * and this exposure's own type. The line of business configuration (see the <code>BusinessLineConfiguration</code>
     * entity) restricts the possible choices. This method also excludes any coverage types that do not have any suitable coverage
     * subtypes. This method is useful in the UI when presenting the user with a range of choices
     * for setting an exposure's coverage type.
     * @return the array of possible coverage types, or an empty array if there are none.
     *         Never returns <code>null</code>
     */
    public typekey.CoverageType[] getPossibleCoverageTypes() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleCoverageTypes();
    }
    
    /**
     * Returns all incidents on this claim's exposure that could possibly be suitable for this exposure. Only incidents
     * whose type matches the incident type configured for this exposure (see
     * com.guidewire.cc.domain.claim.BusinessLineConfiguration.getIncidentTypeForExposureType) are returned.
     * @return all incidents on the claim whose type matches the type of this exposure. Never returns <code>null</code>, returns
     *         the empty list if there are no incidents of the right type or if this exposure does not have a type set or
     *         has a <code>null</code> claim.
     */
    public entity.Incident[] getPossibleIncidents() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleIncidents();
    }
    
    /**
     * Returns the possible loss parties for an exposure of this type. The possible loss parties for a given exposure
     * type are determined by type key filtering, see the <code>LossPartyType.xml</code> file for details. If the exposure is newly
     * created and has no type, returns all loss party types.
     * @return the possible loss parties for an exposure of this type sorted in typekey order, never <code>null</code>. Should not
     *         return an empty array (except, possibly, on configurations which do not use the loss party field at all).
     */
    public typekey.LossPartyType[] getPossibleLossParties() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getPossibleLossParties();
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
     * Gets the value of the PrimaryCoverage field.
     * Coverage Type of the coverage on this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageType getPrimaryCoverage() {
      return (typekey.CoverageType)__getInternalInterface().getFieldValue(PRIMARYCOVERAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PriorEmpData field.
     * Information about the job the claimant had at the time of injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.EmploymentData getPriorEmpData() {
      return (entity.EmploymentData)__getInternalInterface().getFieldValue(PRIOREMPDATA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPriorEmpDataID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PRIOREMPDATA_PROP.get());
    }
    
    /**
     * Gets the value of the Progress field.
     * Description of the progress of an open exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureProgressType getProgress() {
      return (typekey.ExposureProgressType)__getInternalInterface().getFieldValue(PROGRESS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RIAgreementGroup field.
     * Reinsurance group associated with this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RIAgreementGroup getRIAgreementGroup() {
      return (entity.RIAgreementGroup)__getInternalInterface().getFieldValue(RIAGREEMENTGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRIAgreementGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RIAGREEMENTGROUP_PROP.get());
    }
    
    /**
     * RICodings with this Exposure.
     */
    public java.util.List<entity.RICoding> getRICodings() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRICodings();
    }
    
    /**
     * Gets the value of the RSBenefits field.
     * Replacement services benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getRSBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(RSBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRSBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RSBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the ReOpenDate field.
     * The last time an exposure was reopened. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReOpenDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REOPENDATE_PROP.get());
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the <code>Recovery</code> objects for this exposure.
     * You can choose to retrieve all the recoveries or only the new and modified recoveries.  If you choose to retrieve
     * all the <code>Recovery</code> objects, then those recoveries that were removed in the current transaction are not
     * returned by the <code>Iterator</code>. This is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
     * and iterating through all the transactions to find just the desired Recoveries.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, the beans returned by this iterator are not guaranteed to be in the same
     * bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit the beans, you should add them to an
     * editable bundle first.
     * </p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Recovery</code> objects for this exposure will
     *                           be returned.  This includes recoveries for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all <code>Recovery</code> objects for the exposure will be returned, including
     *                           new and modified <code>Recovery</code> objects, but excluding deleted <code>Recovery</code> objects.
     * @return an <code>Iterator</code> that returns <code>Recovery</code> objects.
     */
    public java.util.Iterator<entity.Recovery> getRecoveriesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveriesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the <code>Recovery</code> objects for this exposure.
     * This query is suitable for populating a list view in the UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no recovery view permission.
     * The recoveries are returned as they currently exist on the database.
     * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Recovery</code> objects for
     *         this exposure.  The returned rows are actually <code>RecoveryView</code> entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.RecoveryView> getRecoveriesQuery() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveriesQuery();
    }
    
    /**
     * Returns a list of RecoveryCodings for this Exposure; that is, those RecoveryCodings whose ReserveLines are coded
     * to this Exposure.
     * @return list of ReocveryCodings associated with this Exposure
     */
    public java.util.List<entity.RecoveryCoding> getRecoveryCodings() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryCodings();
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the <code>RecoveryReserve</code> objects for this exposure.
     * You can choose to retrieve either all the <code>RecoveryReserve</code> objects  or only the new and modified
     * <code>RecoveryReserve</code> objects.  If you choose to retrieve all the <code>RecoveryReserve</code> objects,
     * then those <code>RecoveryReserve</code> objects that were removed in the current transaction are not be returned by
     * the <code>Iterator</code>. This is a much more efficient alternative to calling {@link entity.Exposure#getTransactions()}
     * and iterating through all the transactions to find just the desired <code>RecoveryReserve</code> objects.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is <code>false</code>, the beans returned by this iterator are
     * not guaranteed to be in the same bundle as this Exposure, and their bundle may not be editable.
     * To edit the beans, you should add them to an editable bundle first.
     * </p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified  <code>RecoveryReserve</code> objects for this exposure will
     *                           be returned.  This includes recovery reserves for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all  <code>RecoveryReserve</code> objects for the exposure will be returned, including
     *                           new and modified  <code>RecoveryReserve</code> objects, but excluding deleted  <code>RecoveryReserve</code> objects.
     * @return an Iterator that returns Recoveries
     */
    public java.util.Iterator<entity.RecoveryReserve> getRecoveryReservesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryReservesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the  <code>RecoveryReserve</code> objects for this exposure.
     * this query is suitable for populating a ListView in the UI.  The query also filters by the
     * current user's transaction view permissions, so the results may be empty if the user has no  <code>RecoveryReserve</code> objects
     * view permission. The  <code>RecoveryReserve</code> objects will be returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all  <code>RecoveryReserve</code> objects for this exposure.  The returned
     *         rows are actually <code>RecoveryReserveView</code> entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.RecoveryReserveView> getRecoveryReservesQuery() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getRecoveryReservesQuery();
    }
    
    /**
     * Gets the value of the ReopenedReason field.
     * The reason for reopening the exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureReopenedReason getReopenedReason() {
      return (typekey.ExposureReopenedReason)__getInternalInterface().getFieldValue(REOPENEDREASON_PROP.get());
    }
    
    /**
     * Gets the value of the ReplacementValue field.
     * Replacement value of the property or vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReplacementValue() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPLACEMENTVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the ReserveLines field.
     * ReserveLines relating to this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReserveLine[] getReserveLines() {
      return (entity.ReserveLine[])__getInternalInterface().getFieldValue(RESERVELINES_PROP.get());
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the <code>Reserve</code> objects for this exposure.  You can
     * choose to retrieve either all the <code>Reserve</code> objects or only the new and modified reserves.  If you choose
     * to retreive all the  <code>Reserve</code> objects, then those <code>Reserve</code> objects that were removed in the
     * current transaction are not returned by the <code>Iterator</code>.  This method is a much more efficient alternative
     * to calling {@link entity.Exposure#getTransactions()} and iterating through all the transactions to find just the desired reserves.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is <code>false</code>, the beans returned by this iterator are not
     * guaranteed to be in the same bundle as this <code>Exposure</code>, and their bundle may not be editable. To edit
     * the beans, you should add them to an editable bundle first.</p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified <code>Reserve</code> objects for this
     *                           exposure will be returned.  This includes reserves for which only the line items have been modified.  Otherwise,
     *                           if <code>false</code> then all <code>Reserve</code> objects for the exposure are returned, including
     *                           new and modified <code>Reserve</code> objects, but excluding deleted <code>Reserve</code> objects.
     * @return an <code>Iterator</code> that returns <code>Reserve</code> objects.
     */
    public java.util.Iterator<entity.Reserve> getReservesIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getReservesIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the reserves for this exposure. This query is suitable for populating
     * a list view in the UI.  The query also filters by the current user's transaction view permissions, so the results
     * may be empty if the user has no reserve view permission. The reserves are returned as they currently exist on the database.
     * @return a QueryProcessor that encapsulates the query to return all <code>Reserve</code> objects for this exposure.
     *         The returned rows are actually <code>ReserveView</code> entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.ReserveView> getReservesQuery() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getReservesQuery();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RoleAssignments field.
     * The user role assignments for this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UserRoleAssignment[] getRoleAssignments() {
      return (entity.UserRoleAssignment[])__getInternalInterface().getFieldValue(ROLEASSIGNMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the Roles field.
     * The contacts and their roles associated with this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContactRole[] getRoles() {
      return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the SSDIBenefits field.
     * Social security disability benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getSSDIBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(SSDIBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSSDIBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SSDIBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the SecurityLevel field.
     * The security level of this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureSecurityType getSecurityLevel() {
      return (typekey.ExposureSecurityType)__getInternalInterface().getFieldValue(SECURITYLEVEL_PROP.get());
    }
    
    /**
     * Gets the value of the Segment field.
     * Segmentation type of the exposure. Both the claim and exposure may be segmented.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSegment getSegment() {
      return (typekey.ClaimSegment)__getInternalInterface().getFieldValue(SEGMENT_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequests field.
     * Service requests associated with this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest[] getServiceRequests() {
      return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
    }
    
    /**
     * Gets the value of the SettleDate field.
     * Date of settlement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSettleDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SETTLEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the SettleMethod field.
     * Method of settlement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SettleMethod getSettleMethod() {
      return (typekey.SettleMethod)__getInternalInterface().getFieldValue(SETTLEMETHOD_PROP.get());
    }
    
    /**
     * Gets the value of the Settlements field.
     * Settlements with the employee.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Settlement[] getSettlements() {
      return (entity.Settlement[])__getInternalInterface().getFieldValue(SETTLEMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the StatLine field.
     * Statistical line associated with this exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.StatCode getStatLine() {
      return (entity.StatCode)__getInternalInterface().getFieldValue(STATLINE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getStatLineID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(STATLINE_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     * Internal state of the exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureState getState() {
      return (typekey.ExposureState)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Strategy field.
     * Strategy type of the exposure. Both the claim and exposure may define a strategy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimStrategy getStrategy() {
      return (typekey.ClaimStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
    }
    
    /**
     */
    public java.lang.String getSubjectiveComplaints() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getSubjectiveComplaints();
    }
    
    /**
     * Deprecated:  Use Exposure.ExposureType instead.
     * @deprecated Use getExposureType() instead.
     */
    public typekey.ExposureType getSubtype() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getSubtype();
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
     * Gets the value of the TPDBenefits field.
     * TPD benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getTPDBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(TPDBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTPDBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TPDBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the TTDBenefits field.
     * TTD benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getTTDBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(TTDBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTTDBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TTDBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the TempLocation field.
     * Temporary location of policy holder. This is for a homeowners claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getTempLocation() {
      return (entity.Address)__getInternalInterface().getFieldValue(TEMPLOCATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTempLocationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TEMPLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the Text field.
     * Large text fields associated with exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExposureText[] getText() {
      return (entity.ExposureText[])__getInternalInterface().getFieldValue(TEXT_PROP.get());
    }
    
    /**
     * Return the total recoveries for this exposure.
     * @return amount of total recoveries for this exposure.
     */
    public gw.api.financials.CurrencyAmount getTotalRecoveries() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTotalRecoveries();
    }
    
    /**
     * Gets the value of the Transactions field.
     * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction[] getTransactions() {
      return (entity.Transaction[])__getInternalInterface().getFieldValue(TRANSACTIONS_PROP.get());
    }
    
    /**
     * <p>
     * Constructs an <code>Iterator</code> to provide access to the transactions for this exposure.  This is a more efficient
     * alternative to calling {@link entity.Exposure#getTransactions()}, particularly if you are only interested in new or modified
     * transactions.  You can use this method to retrieve all the <code>Transaction</code> objects or only the new and modified objects.
     * If you choose to retrieve all the <code>Transaction</code> objects then, those transactions that were removed
     * in the current transaction are not be returned by the <code>Iterator</code>.
     * </p><p>
     * <b>Note:</b> When <code>newAndModifiedOnly</code> is false, there is no guarantee that the beans returned by this
     * iterator may not be in the same bundle as this <code>Exposure</code>, and their bundle may not be editable.
     * To edit the beans, you should add them to an editable bundle first.</p>
     * @param newAndModifiedOnly if <code>true</code> then only new and modified transactions for this exposure are
     *                           returned.  This includes transactions for which only the line items were modified.  Otherwise,
     *                           if <code>false</code> then the method returns all transactions for the exposure, including
     *                           new and modified <code>Transaction</code> objects, but excluding deleted transactions.
     * @return an Iterator that returns transactions.
     */
    public java.util.Iterator<entity.Transaction> getTransactionsIterator(boolean newAndModifiedOnly) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTransactionsIterator(newAndModifiedOnly);
    }
    
    /**
     * Constructs a query to use for retrieving all the transactions, regardless of subtype, for this exposure.
     * this query is suitable for populating a list view in the user interface.  The query also filters by the
     * current user's transaction view permissions.  The transactions are returned as they currently exist
     * on the database.
     * @return a <code>QueryProcessor</code> that encapsulates the query to return all <code>Transaction</code> objects for
     *         this exposure.  The returned rows are actually <code>TransactionDefaultView</code>
     *         entities for efficiency.
     */
    public gw.api.database.IQueryBeanResult<entity.TransactionDefaultView> getTransactionsQuery() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTransactionsQuery();
    }
    
    /**
     */
    public java.lang.String getTreatmentRendered() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTreatmentRendered();
    }
    
    /**
     * Implements type safe properties for accessing incident subtypes; for example you can use <code>VehicleIncident</code>
     * to access the incident as a <code>VehicleIncident</code> (providing it really is a <code>VehicleIncident</code>).
     * This method returns <code>null</code> if the type is not a supertype of the actual incident type, or if the incident
     * is <code>null</code>.
     * @param typeName the supertype to attempt to access the incident as
     * @return the incident, or <code>null</code> if <code>typeName</code> is not a supertype of the actual incident type or if the
     *         incident is <code>null</code>
     */
    public java.lang.Object getTypedIncident(java.lang.String typeName) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getTypedIncident(typeName);
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
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignment(user, userRole);
    }
    
    /**
     * Gets the user role assignment for that role
     * If there's no assignment for that role, returns null.
     * If there is more than one assignment for that role, then the first role will be returned.
     * Note: getUserRoleAssignmentsByRole(UserRole) should be called if multiple assignments are expected to return.
     * @param role The role for the assignment
     */
    public entity.UserRoleAssignment getUserRoleAssignmentByRole(typekey.UserRole role) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignmentByRole(role);
    }
    
    /**
     * Get the user role assignments for that role. If no assignment for that role,
     * then an empty array is returned.
     * @param role The role for the assignment
     * @return an array of user role assignments for the given role. The array is empty if no such user role assignment.
     */
    public entity.UserRoleAssignment[] getUserRoleAssignmentsByRole(typekey.UserRole role) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).getUserRoleAssignmentsByRole(role);
    }
    
    /**
     * Gets the value of the ValidationLevel field.
     * Validation level the exposure has passed (if any).
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
     * Gets the value of the VocBenefits field.
     * Vocational benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getVocBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(VOCBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getVocBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(VOCBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the WCBenefits field.
     * Workers' comp benefits details.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Benefits getWCBenefits() {
      return (entity.Benefits)__getInternalInterface().getFieldValue(WCBENEFITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getWCBenefitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(WCBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the WCPreexDisbltyInfo field.
     * Information about the pre-existing disability.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWCPreexDisbltyInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WCPREEXDISBLTYINFO_PROP.get());
    }
    
    /**
     * Gets the value of the WageStmtRecd field.
     * Wage Statement received date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWageStmtRecd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WAGESTMTRECD_PROP.get());
    }
    
    /**
     * Gets the value of the WageStmtSent field.
     * Wage Statement sent date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWageStmtSent() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WAGESTMTSENT_PROP.get());
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
    
    public boolean hasApprovedFutureFinalPayment(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasApprovedFutureFinalPayment(costType, costCategory);
    }
    
    /**
     * Tests whether this exposure has at least one payment whose status is Awaiting Submission and
     * whose scheduled send date is today.
     * @return <code>true</code> if the above criteria are met, else <code>false</code>.
     */
    public boolean hasAwaitingSubmissionPaymentsForToday() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasAwaitingSubmissionPaymentsForToday();
    }
    
    /**
     * Verifies whether this exposure has passed the ability to pay validation level and so can have a payment created
     * against it. The verification may potentially end up performing validation of the exposure.
     * @return <code>true</code> if this exposure has passed the "ability to pay" validation level,
     *         else <code>false</code>
     */
    public boolean hasPassedAbilityToPay() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasPassedAbilityToPay();
    }
    
    /**
     * Returns true if this exposure has a <code>Payment</code> that matches the given cost type
     * and cost category and if the given <code>TransactionSet</code> is <code>null</code>, the <code>Payment</code> does
     * not belong to the <code>TransactionSet</code>.  The status and amount of the transactions
     * are not considered.
     * @param transactionSet <code>TransactionSet</code> to test whether this exposure has a <code>Payment</code> belongs to it.
     * @param costType <code>CostType</code> to test whether this exposure has a <code>Payment</code> that matches it.
     * @param costCategory <code>CostCategory</code> to test whether this exposure has a <code>Payment</code> that matches it.
     * @return true if this exposure has a payment that matches the given cost type and cost category and does not
     *         belong to the given transaction set.
     */
    public boolean hasPayment(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasPayment(transactionSet, costType, costCategory);
    }
    
    public boolean hasPayments() {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasPayments();
    }
    
    public boolean hasPendingFinalPayment(typekey.CostType costType, entity.Payment paymentToExclude) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasPendingFinalPayment(costType, paymentToExclude);
    }
    
    public boolean hasPendingOrBetterFutureFinalPayment(typekey.CostType costType, typekey.CostCategory costCategory, entity.Payment paymentToExclude) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasPendingOrBetterFutureFinalPayment(costType, costCategory, paymentToExclude);
    }
    
    /**
     * Returns true if this exposure has a <code>Reserve that matches the given cost type
     * and cost category and, if the given <code>TransactionSet</code> is not <code>null</code>, the <code>Reserve<code> does
     * not belong to the <code>TransactionSet</code>.  The status and amount of the transactions
     * are not considered.
     * @param transactionSet the <code>TransactionSet</code> to test whether there is a reserve belonging to it.
     * @param costType the <code>CostType</code> to test whether there is a reserve that matches it.
     * @param costCategory the <code>CostCategory</code> to test whether there is a reserve that matches it.
     * @return true if this exposure has a reserve that matches the given cost type and cost category and does not belong
     *         to the given transaction set.
     */
    public boolean hasReserve(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasReserve(transactionSet, costType, costCategory);
    }
    
    public boolean hasReserve(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasReserve(costType, costCategory);
    }
    
    /**
     * Returns true if this exposure should have a service period associated with it (for checks).
     * This method can return true for exposure types: WC Lost Wages, PIP, Bodily Injury, or WC Injury.
     * @return true if this exposure should have a service period associated with it, false otherwise
     */
    public boolean hasServicePeriod() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).hasServicePeriod();
    }
    
    public boolean hasTransaction(entity.TransactionSet transactionSet, typekey.CostType costType, typekey.CostCategory costCategory, gw.entity.IEntityType transactionType) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasTransaction(transactionSet, costType, costCategory, transactionType);
    }
    
    public boolean hasTransactions() {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).hasTransactions();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
    }
    
    /**
     * Verifies whether this exposure is at the ability to pay validation level. Note: Unlike {@link #hasPassedAbilityToPay()},
     * this API never performs validation of the exposure. It only verifies against whatever validation level that has
     * been set currently on the exposure.
     * @return <code>true</code> if this exposure is at the "ability to pay" validation level,
     *         else <code>false</code>
     */
    public boolean isAtAbilityToPay() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isAtAbilityToPay();
    }
    
    /**
     * Gets the value of the BreakIn field.
     * Whether there is evidence of a break-in.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBreakIn() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BREAKIN_PROP.get());
    }
    
    /**
     * Returns true if the claim is closed.
     * @return true if the claim is closed
     */
    public boolean isClosed() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isClosed();
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
     * Gets the value of the ContactPermitted field.
     * Whether contact is permitted with the claimant.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isContactPermitted() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CONTACTPERMITTED_PROP.get());
    }
    
    /**
     * Gets the value of the CurrentConditions field.
     * Current conditions.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCurrentConditions() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CURRENTCONDITIONS_PROP.get());
    }
    
    /**
     * Gets the value of the DiagnosticCnsistnt field.
     * Whether the diagnostic is consistent.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDiagnosticCnsistnt() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DIAGNOSTICCNSISTNT_PROP.get());
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
     * Gets the value of the ExposureLimitReached field.
     * Whether the exposure's exposure limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExposureLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPOSURELIMITREACHED_PROP.get());
    }
    
    /**
     * Gets the value of the FurtherTreatment field.
     * Whether further treatment is required.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFurtherTreatment() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FURTHERTREATMENT_PROP.get());
    }
    
    /**
     * Returns whether this exposure is enabled for ISO. True if the exposure has any ISO status other
     * than "Not of Interest" and the claim is ISO enabled, false otherwise
     * @return <code>true</code> if this exposure is enabled for ISO, <code>false</code> otherwise.
     */
    public boolean isISOEnabled() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isISOEnabled();
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
     * Gets the value of the IncidentLimitReached field.
     * Whether the exposure's incident limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncidentLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTLIMITREACHED_PROP.get());
    }
    
    /**
     * Gets the value of the Locked field.
     * Whether the property or vehicle was properly locked.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLocked() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOCKED_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
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
     * Gets the value of the OtherCoverage field.
     * True if the claimant has additional coverage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isOtherCoverage() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OTHERCOVERAGE_PROP.get());
    }
    
    /**
     * Gets the value of the PIPClaimAggLimitReached field.
     * Whether the exposure's PIP Claim Aggregate limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPIPClaimAggLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPCLAIMAGGLIMITREACHED_PROP.get());
    }
    
    /**
     * Gets the value of the PIPESSLimitReached field.
     * Whether the exposure's PIP Replacement Services Aggregate limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPIPESSLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPESSLIMITREACHED_PROP.get());
    }
    
    /**
     * Gets the value of the PIPNonMedAggLimitReached field.
     * Whether the exposure's PIP Non Medical Aggregate limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPIPNonMedAggLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPNONMEDAGGLIMITREACHED_PROP.get());
    }
    
    /**
     * Gets the value of the PIPPersonAggLimitReached field.
     * Whether the exposure's PIP Per Person Aggregate limit has been exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPIPPersonAggLimitReached() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PIPPERSONAGGLIMITREACHED_PROP.get());
    }
    
    /**
     * Returns true if a payment can be made against this exposure.  Specifically,
     * returns true if:
     * <ul>
     * <li> Exposure is closed and previous payments have been made on it.</li>
     * <li> Exposure is open and global <code>PaymentExceedsReserves = true</code>.</li>
     * <li> Exposure is open and no reserves have been created for the exposure.</li>
     * <li> Exposure is open and has available reserves.</li>
     * </ul>
     * @return true if a payment can be made against this exposure, false otherwise
     */
    public boolean isPaymentAllowed() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isPaymentAllowed();
    }
    
    public boolean isPaymentAllowed(typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).isPaymentAllowed(costType, costCategory);
    }
    
    /**
     * Gets the value of the RIGroupSetExternally field.
     * Whether the reinsurance association was determined by an external system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRIGroupSetExternally() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RIGROUPSETEXTERNALLY_PROP.get());
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
     * Gets the value of the SSBenefit field.
     * Whether Social Security benefits are being collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSSBenefit() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSBENEFIT_PROP.get());
    }
    
    /**
     * Gets the value of the SSDIEligible field.
     * Whether the exposure is eligible for SSDI.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSSDIEligible() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSDIELIGIBLE_PROP.get());
    }
    
    /**
     * Should the given user be able to use the button to send this exposure to ISO. True iff:
     * <ol>
     * <li>The ISO message sink is enabled
     * <li>The user has permission to edit this exposure
     * <li>The exposure is ISO enabled ({@link #isISOEnabled()})
     * <li>The exposure is ISO valid
     * </ol>
     * @param user the user to test whether he can use the send to ISO button.
     * @return <code>true</code> if the given user should be able to use the button to send this exposure to ISO,
     *         <code>false</code> otherwise.
     * @deprecated Use perm.Exposure.edit(exposure) to check the permission, explicitly check the
     *   exposure ISO status and validity. Just remove the button
     *   from the PCF entirely if not using ISO
     */
    public boolean isSendToISOAvailable(entity.User user) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isSendToISOAvailable(user);
    }
    
    /**
     * Should the given user be able to see the button to send this exposure to ISO. True iff:
     * <ol>
     * <li>The ISO message sink is enabled
     * <li>The user has permission to edit this exposure
     * </ol>
     * @param user the user to test whether he can see the send to ISO button.
     * @return <code>true</code> if the given user should be able to see the button to send this exposure to ISO,
     *         <code>false</code> otherwise.
     * @deprecated Use perm.Exposure.edit(exposure) to check the permission and just remove the button
     *   from the PCF entirely if not using ISO
     */
    public boolean isSendToISOVisible(entity.User user) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isSendToISOVisible(user);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TreatedPatientBfr field.
     * Whether the the patient has been treated before.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTreatedPatientBfr() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TREATEDPATIENTBFR_PROP.get());
    }
    
    /**
     * Returns whether this exposure is valid at the specified level.
     * @param level the level to check.
     * @return true if this exposure is valid to at least the specified level
     */
    public boolean isValid(typekey.ValidationLevel level) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValid(level);
    }
    
    /**
     * Executes exposure-closed validation rules and returns whether or not this
     * exposure passes.
     * @param level The level to check
     * @return True if this exposure passes.
     */
    public boolean isValidClosed(typekey.ValidationLevel level) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValidClosed(level);
    }
    
    /**
     * Executes exposure-reopened validation rules and returns whether or not this
     * exposure passes.
     * @param level the level to check
     * @return true if this exposure passes
     */
    public boolean isValidReopened(typekey.ValidationLevel level) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).isValidReopened(level);
    }
    
    /**
     * Gets the value of the WCBenefit field.
     * Whether Workers Compensation benefits are being collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWCBenefit() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WCBENEFIT_PROP.get());
    }
    
    /**
     * Gets the value of the WCPreexDisblty field.
     * Whether the injured person had a pre-existing disability.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWCPreexDisblty() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WCPREEXDISBLTY_PROP.get());
    }
    
    /**
     * Gets the value of the WageBenefit field.
     * Whether wage benefites are being collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWageBenefit() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAGEBENEFIT_PROP.get());
    }
    
    /**
     * Returns a new CheckCreator object for creating a check on this exposure.
     */
    public gw.api.financials.CheckCreator newCheckCreator() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newCheckCreator();
    }
    
    /**
     * Creates a new instance of EmploymentData, populating the {@link entity.EmploymentData#setClaim(entity.Claim)}
     * foreign key automatically. The new instance is created in the same bundle as the exposure.
     * @return The EmploymentData instance
     */
    public entity.EmploymentData newEmploymentData() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newEmploymentData();
    }
    
    /**
     * Creates a suitable incident for this exposure. Also sets the incident's claim to be this exposure's claim.
     * @return the new incident
     */
    public entity.Incident newIncident() {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).newIncident();
    }
    
    public entity.Reserve newReserve(typekey.TransactionStatus status, typekey.CostType costType, typekey.CostCategory category, java.lang.String comments, java.math.BigDecimal amount, gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).newReserve(status, costType, category, comments, amount, bundle);
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void pushAssignmentPopup(java.util.List<gw.api.assignment.CCAssignableMethods> assignables) {
      ((gw.api.assignment.CCAssignableMethods)__getDelegateManager().getImplementation("gw.api.assignment.CCAssignableMethods")).pushAssignmentPopup(assignables);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
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
     * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
     */
    public void removeFromBenefitPeriods(entity.BenefitPeriod element) {
      __getInternalInterface().removeArrayElement(BENEFITPERIODS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BenefitPeriods array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBenefitPeriods(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BENEFITPERIODS_PROP.get(), elementID);
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
     * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
     */
    public void removeFromExposureISOMatchReports(entity.ExposureISOMatchReport element) {
      __getInternalInterface().removeArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ExposureISOMatchReports array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposureISOMatchReports(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSUREISOMATCHREPORTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
     */
    public void removeFromExposureMetrics(entity.ExposureMetric element) {
      __getInternalInterface().removeArrayElement(EXPOSUREMETRICS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ExposureMetrics array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposureMetrics(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSUREMETRICS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ExposureRptArray array. This is achieved by marking the element for removal.
     */
    public void removeFromExposureRptArray(entity.ExposureRpt element) {
      __getInternalInterface().removeArrayElement(EXPOSURERPTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ExposureRptArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposureRptArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSURERPTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
     */
    public void removeFromExposureSynchStates(entity.ExposureSynchState element) {
      __getInternalInterface().removeArrayElement(EXPOSURESYNCHSTATES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ExposureSynchStates array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposureSynchStates(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSURESYNCHSTATES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
     */
    public void removeFromIMEPerformed(entity.IMEPerformed element) {
      __getInternalInterface().removeArrayElement(IMEPERFORMED_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the IMEPerformed array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromIMEPerformed(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(IMEPERFORMED_PROP.get(), elementID);
    }
    
    /**
     * Remove the given match report form the array of match reports on this Claim/Exposure
     * @param report the report to be removed
     */
    public void removeFromISOMatchReports(entity.ISOMatchReport report) {
      ((gw.cc.iso.entity.ISOReportable)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOReportable")).removeFromISOMatchReports(report);
    }
    
    /**
     * Obsolete method, present for backwards compatibility
     * @param matchReport the id of the match report to remove
     * @deprecated use removeFromExposureISOMatchReports(ExposureISOMatchReport) instead
     */
    public void removeFromISOMatchReports(gw.pl.persistence.core.Key matchReport) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).removeFromISOMatchReports(matchReport);
    }
    
    /**
     * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
     */
    public void removeFromMedicalActions(entity.MedicalAction element) {
      __getInternalInterface().removeArrayElement(MEDICALACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the MedicalActions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromMedicalActions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(MEDICALACTIONS_PROP.get(), elementID);
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
     * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
     */
    public void removeFromOtherCoverageDet(entity.OtherCoverageDetail element) {
      __getInternalInterface().removeArrayElement(OTHERCOVERAGEDET_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the OtherCoverageDet array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOtherCoverageDet(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OTHERCOVERAGEDET_PROP.get(), elementID);
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
     */
    public void removeFromRoleAssignments(entity.UserRoleAssignment element) {
      __getInternalInterface().removeArrayElement(ROLEASSIGNMENTS_PROP.get(), element);
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
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     */
    public void removeFromRoles(entity.ClaimContactRole element) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRoles(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), elementID);
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
     * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
     */
    public void removeFromSettlements(entity.Settlement element) {
      __getInternalInterface().removeArrayElement(SETTLEMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Settlements array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSettlements(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SETTLEMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Text array. This is achieved by marking the element for removal.
     */
    public void removeFromText(entity.ExposureText element) {
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
     * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Reopens the exposure.
     * @param reopenReason reason typekey for reopening this exposure
     * @param reason a string indicating the reason for which this exposure is being reopened
     * @throws <code>ReopenException</code> if this exposure is already open.
     * @throws <code>EntityValidationException</code> thrown if the exposure itself cannot be reopened (that is, it fails
     *                                      validation).
     */
    public void reopen(typekey.ExposureReopenedReason reopenReason, java.lang.String reason) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).reopen(reopenReason, reason);
    }
    
    public void reopenWithValidationOption(typekey.ExposureReopenedReason reopenReason, java.lang.String reason, gw.api.validation.BundleValidationOption validationOption) throws com.guidewire.pl.system.exception.ReopenException, gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).reopenWithValidationOption(reopenReason, reason, validationOption);
    }
    
    /**
     * Runs postsetup rules on this exposure.
     */
    public void runPostSetupRules() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).runPostSetupRules();
    }
    
    /**
     * Runs presetup rules on this exposure.
     */
    public void runPreSetupRules() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).runPreSetupRules();
    }
    
    /**
     * Same as {@link #saveAndSetup(gw.api.assignment.Assignee)}, except it auto assigns the exposure.
     */
    public void saveAndSetup() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).saveAndSetup();
    }
    
    /**
     * <p>
     * Does all preprocessing work required to save an exposure, and then saves it.
     * saveAndSetup performs the following steps:
     * </p>
     * <ol>
     * <li>Sets the Exposure's claim order.</li>
     * <li>Runs the "Pre-assign" ruleset on the exposure.</li>
     * <li>Runs the segmentation engine on the exposure.</li>
     * <li>Runs the strategy engine on the exposure.</li>
     * <li>Runs the assignment engine on the exposure.</li>
     * <li>Runs the workplan engine on the exposure.</li>
     * <li>Runs the "Post-assign" ruleset on the exposure.</li>
     * <li>Sets the exposure's status to "open".</li>
     * <li>Create initial reserves.</li>
     * <li>Commits the exposures's bundle (which will contain the exposure,
     * activities, and other objects creating during the call).</li>
     * </ol>
     * @param assignee the target assignee to which the exposure should be assigned
     * @throws <code>IllegalStateException</code> if exposure is not in a writeable bundle.
     * @throws <code>UserDisplayableException</code> if claim is closed.
     */
    public void saveAndSetup(gw.api.assignment.Assignee assignee) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).saveAndSetup(assignee);
    }
    
    /**
     * Apply segmentation to this exposure.
     * (This does both segmentation and strategy.)
     */
    public void segment() {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).segment();
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
     * Sends an e-mail message about this object.
     * @param to the Contact to whom the e-mail should be sent.
     * @param from the Contact from whom the e-mail should be sent.
     * @param subject the subject of the e-mail message.
     * @param body the body of the e-mail message.
     */
    public void sendEmailWithBody(entity.Contact to, entity.Contact from, java.lang.String subject, java.lang.String body) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).sendEmailWithBody(to, from, subject, body);
    }
    
    /**
     * Sends an e-mail message about this object.
     * @param toName the name of the recipient
     * @param toEmailAddress the e-mail address of the recipient
     * @param fromName the name of the sender
     * @param fromEmailAddress the e-mail address of the sender
     * @param subject the subject of the e-mail message.
     * @param body the body of the e-mail message.
     */
    public void sendEmailWithBody(java.lang.String toName, java.lang.String toEmailAddress, java.lang.String fromName, java.lang.String fromEmailAddress, java.lang.String subject, java.lang.String body) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).sendEmailWithBody(toName, toEmailAddress, fromName, fromEmailAddress, subject, body);
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
     * Sets the value of the Activities field.
     */
    public void setActivities(entity.Activity[] value) {
      __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
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
     * Sets the available reserves for this exposure to the given amount by creating
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
     * @param costType The cost type for the reserve.  This value cannot be <code>null</code>.
     * @param costCategory The cost category for the reserve.  This value cannot be <code>null</code>.
     * @param newReserveAmount The amount the available reserves should be.  The amount must be zero or greater, not negative.
     * @param submittingUser User submitting this reserve.
     * @throws ClosedClaimException if the claim is closed (reserves cannot be created on closed claims)
     * @throws ClosedExposureException if the exposure is closed (reserves cannot be created on closed exposures)
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the reserve
     * @return the new reserve (Note: the amount of the returned reserve should not be changed)
     *         The method will return null if new reserve is not created.
     */
    public entity.Reserve setAvailableReserves(typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal newReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setAvailableReserves(costType, costCategory, newReserveAmount, submittingUser);
    }
    
    /**
     * Sets the value of the AverageWeeklyWages field.
     */
    public void setAverageWeeklyWages(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AVERAGEWEEKLYWAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BenefitPeriods field.
     */
    public void setBenefitPeriods(entity.BenefitPeriod[] value) {
      __getInternalInterface().setFieldValue(BENEFITPERIODS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BreakIn field.
     */
    public void setBreakIn(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BREAKIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimOrder field.
     */
    public void setClaimOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMORDER_PROP.get(), value);
    }
    
    /**
     * 
     * @param claimant 
     */
    public void setClaimant(entity.Contact claimant) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setClaimant(claimant);
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
     * Sets the value of the ClaimantType field.
     */
    public void setClaimantType(typekey.ClaimantType value) {
      __getInternalInterface().setFieldValue(CLAIMANTTYPE_PROP.get(), value);
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
    public void setClosedOutcome(typekey.ExposureClosedOutcomeType value) {
      __getInternalInterface().setFieldValue(CLOSEDOUTCOME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CompBenefits field.
     */
    public void setCompBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(COMPBENEFITS_PROP.get(), value);
    }
    
    public void setCompBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(COMPBENEFITS_PROP.get(), value);
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
     * Sets the value of the ContactPermitted field.
     */
    public void setContactPermitted(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CONTACTPERMITTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Coverage field.
     */
    public void setCoverage(entity.Coverage value) {
      __getInternalInterface().setFieldValue(COVERAGE_PROP.get(), value);
    }
    
    public void setCoverageID(gw.pl.persistence.core.Key value) {
      setFieldValue(COVERAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageSubType field.
     */
    public void setCoverageSubType(typekey.CoverageSubtype value) {
      __getInternalInterface().setFieldValue(COVERAGESUBTYPE_PROP.get(), value);
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
    
    /**
     * Sets the value of the CurrentConditions field.
     */
    public void setCurrentConditions(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CURRENTCONDITIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DaysInWeek field.
     */
    public void setDaysInWeek(typekey.DaysInWeekType value) {
      __getInternalInterface().setFieldValue(DAYSINWEEK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeathBenefits field.
     */
    public void setDeathBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(DEATHBENEFITS_PROP.get(), value);
    }
    
    public void setDeathBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(DEATHBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DepreciatedValue field.
     */
    public void setDepreciatedValue(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(DEPRECIATEDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DiagnosticCnsistnt field.
     */
    public void setDiagnosticCnsistnt(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DIAGNOSTICCNSISTNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DisBenefits field.
     */
    public void setDisBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(DISBENEFITS_PROP.get(), value);
    }
    
    public void setDisBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(DISBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Documents field.
     */
    public void setDocuments(entity.Document[] value) {
      __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ECFExposureId_Ext field.
     */
    public void setECFExposureId_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ECFEXPOSUREID_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExaminationDate field.
     */
    public void setExaminationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(EXAMINATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureISOMatchReports field.
     */
    public void setExposureISOMatchReports(entity.ExposureISOMatchReport[] value) {
      __getInternalInterface().setFieldValue(EXPOSUREISOMATCHREPORTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureLimitReached field.
     */
    public void setExposureLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXPOSURELIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureMetrics field.
     */
    public void setExposureMetrics(entity.ExposureMetric[] value) {
      __getInternalInterface().setFieldValue(EXPOSUREMETRICS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExposureRpt(entity.ExposureRpt value) {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).setExposureRpt(value);
    }
    
    /**
     * Sets the value of the ExposureRptArray field.
     */
    public void setExposureRptArray(entity.ExposureRpt[] value) {
      __getInternalInterface().setFieldValue(EXPOSURERPTARRAY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExposureRptID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).setExposureRptID(value);
    }
    
    /**
     * Sets the value of the ExposureSynchStates field.
     */
    public void setExposureSynchStates(entity.ExposureSynchState[] value) {
      __getInternalInterface().setFieldValue(EXPOSURESYNCHSTATES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureTier field.
     */
    public void setExposureTier(typekey.ExposureTier value) {
      __getInternalInterface().setFieldValue(EXPOSURETIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureType field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExposureType(typekey.ExposureType value) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setExposureType(value);
    }
    
    /**
     * Sets the value of the FurtherTreatment field.
     */
    public void setFurtherTreatment(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FURTHERTREATMENT_PROP.get(), value);
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
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMEPerformed field.
     */
    public void setIMEPerformed(entity.IMEPerformed[] value) {
      __getInternalInterface().setFieldValue(IMEPERFORMED_PROP.get(), value);
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
     * Sets the value of the Incident field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setIncident(entity.Incident value) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setIncident(value);
    }
    
    public void setIncidentID(gw.pl.persistence.core.Key value) {
      setFieldValue(INCIDENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentLimitReached field.
     */
    public void setIncidentLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCIDENTLIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionState field.
     */
    public void setJurisdictionState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastDayWorked field.
     */
    public void setLastDayWorked(java.util.Date value) {
      __getInternalInterface().setFieldValue(LASTDAYWORKED_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LifePensionBenefits field.
     */
    public void setLifePensionBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(LIFEPENSIONBENEFITS_PROP.get(), value);
    }
    
    public void setLifePensionBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(LIFEPENSIONBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Locked field.
     */
    public void setLocked(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOCKED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossCategory field.
     */
    public void setLossCategory(typekey.LossCategory value) {
      __getInternalInterface().setFieldValue(LOSSCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossParty field.
     */
    public void setLossParty(typekey.LossPartyType value) {
      __getInternalInterface().setFieldValue(LOSSPARTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LostPropertyType field.
     */
    public void setLostPropertyType(typekey.LostPropertyType value) {
      __getInternalInterface().setFieldValue(LOSTPROPERTYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedicalActions field.
     */
    public void setMedicalActions(entity.MedicalAction[] value) {
      __getInternalInterface().setFieldValue(MEDICALACTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetricLimitGeneration field.
     */
    public void setMetricLimitGeneration(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(METRICLIMITGENERATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewEmpData field.
     */
    public void setNewEmpData(entity.EmploymentData value) {
      __getInternalInterface().setFieldValue(NEWEMPDATA_PROP.get(), value);
    }
    
    public void setNewEmpDataID(gw.pl.persistence.core.Key value) {
      setFieldValue(NEWEMPDATA_PROP.get(), value);
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
     * Sets the value of the OCR_Ext field.
     */
    public void setOCR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OCR_EXT_PROP.get(), value);
    }
    
    /**
     * 
     * @param objectiveFindings 
     */
    public void setObjectiveFindings(java.lang.String objectiveFindings) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setObjectiveFindings(objectiveFindings);
    }
    
    /**
     * Sets the open recovery reserves for this exposure to the given amount by
     * creating a recovery reserve that increases or decreases the current open
     * recovery reserves.
     * @param costType The cost type for the recovery reserve.  This value cannot be <code>null</code>.
     * @param costCategory The cost category for the recovery reserve.  This value cannot be <code>null</code>.
     * @param recoveryCategory The recovery category for the recovery reserve.  This value cannot be <code>null</code>.
     * @param newRecoveryReserveAmount The amount the open recovery reserves should be.  The amount must be non-null and zero or greater, not negative.
     * @param submittingUser User submitting this recovery reserve.
     * @throws ClosedClaimException if the claim is closed (recovery reserves cannot be created on closed claims).
     * @throws ClosedExposureException if the exposure is closed (recovery reserves cannot be created on closed exposures).
     * @throws InsufficientAuthorityException if the submitting user does not have authority to create the recovery reserve.
     * @throws RecoveryReservesNotAllowedException if the system is not configured to allow recovery reserves, i.e.,
     *                                        the <code>UseRecoveryReserves</code> parameter is false.
     * @return the new Recovery Reserve (Note: the amount of the returned Recovery Reserve should not be changed)
     *         The method will return null if new recoveryReserve is not created.
     */
    public entity.RecoveryReserve setOpenRecoveryReserves(typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, java.math.BigDecimal newRecoveryReserveAmount, entity.User submittingUser) throws com.guidewire.cc.system.exception.ClosedClaimException, com.guidewire.cc.system.exception.ClosedExposureException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.cc.system.exception.RecoveryReservesNotAllowedException {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setOpenRecoveryReserves(costType, costCategory, recoveryCategory, newRecoveryReserveAmount, submittingUser);
    }
    
    /**
     * Sets the value of the OtherCoverage field.
     */
    public void setOtherCoverage(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OTHERCOVERAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherCoverageDet field.
     */
    public void setOtherCoverageDet(entity.OtherCoverageDetail[] value) {
      __getInternalInterface().setFieldValue(OTHERCOVERAGEDET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherCoverageInfo field.
     */
    public void setOtherCoverageInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OTHERCOVERAGEINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OtherCovgChoice field.
     */
    public void setOtherCovgChoice(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(OTHERCOVGCHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPClaimAggLimitReached field.
     */
    public void setPIPClaimAggLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PIPCLAIMAGGLIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPDeathBenefits field.
     */
    public void setPIPDeathBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(PIPDEATHBENEFITS_PROP.get(), value);
    }
    
    public void setPIPDeathBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(PIPDEATHBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPESSLimitReached field.
     */
    public void setPIPESSLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PIPESSLIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPNonMedAggLimitReached field.
     */
    public void setPIPNonMedAggLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PIPNONMEDAGGLIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPPersonAggLimitReached field.
     */
    public void setPIPPersonAggLimitReached(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PIPPERSONAGGLIMITREACHED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PIPVocBenefits field.
     */
    public void setPIPVocBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(PIPVOCBENEFITS_PROP.get(), value);
    }
    
    public void setPIPVocBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(PIPVOCBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PPDBenefits field.
     */
    public void setPPDBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(PPDBENEFITS_PROP.get(), value);
    }
    
    public void setPPDBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(PPDBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTDBenefits field.
     */
    public void setPTDBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(PTDBENEFITS_PROP.get(), value);
    }
    
    public void setPTDBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(PTDBENEFITS_PROP.get(), value);
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
     * Sets the value of the PrimaryCoverage field.
     */
    public void setPrimaryCoverage(typekey.CoverageType value) {
      __getInternalInterface().setFieldValue(PRIMARYCOVERAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PriorEmpData field.
     */
    public void setPriorEmpData(entity.EmploymentData value) {
      __getInternalInterface().setFieldValue(PRIOREMPDATA_PROP.get(), value);
    }
    
    public void setPriorEmpDataID(gw.pl.persistence.core.Key value) {
      setFieldValue(PRIOREMPDATA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Progress field.
     */
    public void setProgress(typekey.ExposureProgressType value) {
      __getInternalInterface().setFieldValue(PROGRESS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RIAgreementGroup field.
     */
    public void setRIAgreementGroup(entity.RIAgreementGroup value) {
      __getInternalInterface().setFieldValue(RIAGREEMENTGROUP_PROP.get(), value);
    }
    
    public void setRIAgreementGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(RIAGREEMENTGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RIGroupSetExternally field.
     */
    public void setRIGroupSetExternally(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RIGROUPSETEXTERNALLY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RSBenefits field.
     */
    public void setRSBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(RSBENEFITS_PROP.get(), value);
    }
    
    public void setRSBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(RSBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReOpenDate field.
     */
    public void setReOpenDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(REOPENDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReopenedReason field.
     */
    public void setReopenedReason(typekey.ExposureReopenedReason value) {
      __getInternalInterface().setFieldValue(REOPENEDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReplacementValue field.
     */
    public void setReplacementValue(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REPLACEMENTVALUE_PROP.get(), value);
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
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SSBenefit field.
     */
    public void setSSBenefit(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SSBENEFIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SSDIBenefits field.
     */
    public void setSSDIBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(SSDIBENEFITS_PROP.get(), value);
    }
    
    public void setSSDIBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(SSDIBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SSDIEligible field.
     */
    public void setSSDIEligible(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SSDIELIGIBLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SecurityLevel field.
     */
    public void setSecurityLevel(typekey.ExposureSecurityType value) {
      __getInternalInterface().setFieldValue(SECURITYLEVEL_PROP.get(), value);
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
     * Sets the value of the SettleDate field.
     */
    public void setSettleDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SETTLEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SettleMethod field.
     */
    public void setSettleMethod(typekey.SettleMethod value) {
      __getInternalInterface().setFieldValue(SETTLEMETHOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Settlements field.
     */
    public void setSettlements(entity.Settlement[] value) {
      __getInternalInterface().setFieldValue(SETTLEMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatLine field.
     */
    public void setStatLine(entity.StatCode value) {
      __getInternalInterface().setFieldValue(STATLINE_PROP.get(), value);
    }
    
    public void setStatLineID(gw.pl.persistence.core.Key value) {
      setFieldValue(STATLINE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.ExposureState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Strategy field.
     */
    public void setStrategy(typekey.ClaimStrategy value) {
      __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
    }
    
    /**
     * 
     * @param subjectiveComplaints 
     */
    public void setSubjectiveComplaints(java.lang.String subjectiveComplaints) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setSubjectiveComplaints(subjectiveComplaints);
    }
    
    /**
     * 
     * @param exposureType 
     * @deprecated Use setExposureType() instead.
     */
    public void setSubtype(typekey.ExposureType exposureType) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setSubtype(exposureType);
    }
    
    /**
     * Sets the value of the SupplementalWorkloadWeight field.
     */
    public void setSupplementalWorkloadWeight(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUPPLEMENTALWORKLOADWEIGHT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TPDBenefits field.
     */
    public void setTPDBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(TPDBENEFITS_PROP.get(), value);
    }
    
    public void setTPDBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(TPDBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TTDBenefits field.
     */
    public void setTTDBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(TTDBENEFITS_PROP.get(), value);
    }
    
    public void setTTDBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(TTDBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TempLocation field.
     */
    public void setTempLocation(entity.Address value) {
      __getInternalInterface().setFieldValue(TEMPLOCATION_PROP.get(), value);
    }
    
    public void setTempLocationID(gw.pl.persistence.core.Key value) {
      setFieldValue(TEMPLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Text field.
     */
    public void setText(entity.ExposureText[] value) {
      __getInternalInterface().setFieldValue(TEXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Transactions field.
     * @deprecated All financial transactions relating to this exposure.  For rules, it is much better to use one of the getXXXIterator() methods and for the UI it is much better to use one of the getXXXQuery() methods to retrieve all transactions or a specific subtype of Transactions for the exposure.
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
     * 
     * @param treatmentRendered 
     */
    public void setTreatmentRendered(java.lang.String treatmentRendered) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setTreatmentRendered(treatmentRendered);
    }
    
    /**
     * Implements type safe properties for accessing incident subtypes; for example <code>VehicleIncident</code> can be used to
     * access the incident as a <code>VehicleIncident</code> (providing it really is a VehicleIncident!). Throws illegal argument
     * exception if the named type is not the type required for the current exposure type. Note that the setter has
     * to be stricter than the getter. You can get an incident and treat it as a supertype. But when setting an
     * incident its type must be exactly the type required by the exposure type.
     * @param typeName the incident type (not used)
     * @param value incident to attempt to set
     */
    public void setTypedIncident(java.lang.String typeName, java.lang.Object value) {
      ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).setTypedIncident(typeName, value);
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
     * Sets the value of the ValidationLevel field.
     */
    public void setValidationLevel(typekey.ValidationLevel value) {
      __getInternalInterface().setFieldValue(VALIDATIONLEVEL_PROP.get(), value);
    }
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
    }
    
    /**
     * Sets the value of the VocBenefits field.
     */
    public void setVocBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(VOCBENEFITS_PROP.get(), value);
    }
    
    public void setVocBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(VOCBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCBenefit field.
     */
    public void setWCBenefit(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WCBENEFIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCBenefits field.
     */
    public void setWCBenefits(entity.Benefits value) {
      __getInternalInterface().setFieldValue(WCBENEFITS_PROP.get(), value);
    }
    
    public void setWCBenefitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(WCBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCPreexDisblty field.
     */
    public void setWCPreexDisblty(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WCPREEXDISBLTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WCPreexDisbltyInfo field.
     */
    public void setWCPreexDisbltyInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WCPREEXDISBLTYINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WageBenefit field.
     */
    public void setWageBenefit(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WAGEBENEFIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WageStmtRecd field.
     */
    public void setWageStmtRecd(java.util.Date value) {
      __getInternalInterface().setFieldValue(WAGESTMTRECD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WageStmtSent field.
     */
    public void setWageStmtSent(java.util.Date value) {
      __getInternalInterface().setFieldValue(WAGESTMTSENT_PROP.get(), value);
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
    
    public void submitTodaysPayments() {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).submitTodaysPayments();
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
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    /**
     * Executes new exposure validation rules on the exposure, and returns a validation object containing any errors (if
     * validation was successful, an empty validation object is returned). Note that this method has the side-effect of
     * setting the validation level, and hence requires that the current user have Claim EDIT permissions, or
     * will throw an exception.
     * @param validateClaim Whether or not the exposure's claim should be validated as well.  If <code>true</code>
     *                      then the claim is validated <b>before</b> the exposure is validated.
     * @return a <code>ValidationResult</code> containing 0 or more errors found.
     */
    public gw.api.validation.ValidationResult validate(boolean validateClaim) {
      return ((gw.cc.exposure.entity.Exposure)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Exposure")).validate(validateClaim);
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
    
    public void verifyAbilityToPay(boolean validateClaim) throws gw.api.validation.EntityValidationException {
      ((com.guidewire.cc.domain.exposure.impl.ExposureInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.impl.ExposureInternal")).verifyAbilityToPay(validateClaim);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.cc.domain.email.CCEmailSupport", "com.guidewire.cc.domain.exposure.impl.ExposureEmailSupportImpl");
    config.put("com.guidewire.cc.domain.exposure.impl.ExposureInternal", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.assignment.AssignablePublicMethods", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.domain.assignment.impl.UserRoleOwnerInternalMethods", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.system.entity.LevelAwareValidatableBean", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.api.assignment.CCAssignableMethods", "gw.assignment.ExposureAssignableMethodsImpl");
    config.put("gw.api.assignment.UserRoleOwner", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.api.assignment.workload.entity.WeightedWorkloadMethods", "gw.assignment.workload.entity.ExposureWeightedWorkloadMethodsImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.api.financials.CheckCreatorProvider", "gw.api.financials.CheckCreatorProviderImpl");
    config.put("gw.cc.assignment.entity.CCAssignable", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.cc.exposure.entity.Exposure", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.cc.iso.entity.ISOReportable", "com.guidewire.cc.domain.exposure.impl.ExposureImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Exposure.class, config);
    com.guidewire._generated.entity.ExposureInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Exposure, com.guidewire._generated.entity.ExposureInternal>() {
      public java.lang.Object getImplementation(entity.Exposure bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ExposureInternal getInternalInterface(entity.Exposure bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Exposure newEmptyInstance() {
        return new entity.Exposure((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
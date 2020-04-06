package entity;

/**
 * ClaimWorkComp
 * 
 *         Stores worker's compensation information related to a claim.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimWorkComp.eti;ClaimWorkComp.eix;ClaimWorkComp.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimWorkComp")
public class ClaimWorkComp extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimWorkComp> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimWorkComp>("entity.ClaimWorkComp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACCIDENTPREMISES_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AccidentPremises");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACTIVITYPERFORMED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ActivityPerformed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLASSCODEBYLOCATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClassCodeByLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COMPENSABLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Compensable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFEMPLOYEEREPRESENTATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfEmployeeRepresentation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEATHREPORT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DeathReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DISCONTINUEDFRINGEBENEFITS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DiscontinuedFringeBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMPLOYERLIABILITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmployerLiability");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EQUIPMENTUSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EquipmentUsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FULLDENIALEFFECTIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FullDenialEffectiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> FULLDENIALREASONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "FullDenialReasons");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ILLNESSRELATEDTOEXPOSURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IllnessRelatedToExposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> INITIALTREATMENT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "InitialTreatment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDREPORTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredReportNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> JURISDICTIONCLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "JurisdictionClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEDRECRELEASEAUTH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MedRecReleaseAuth");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEDICALREPORT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MedicalReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PARTIALDENIALREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PartialDenialReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TIMELOSSREPORT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TimeLossReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAITINGPERIODAPPLIED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaitingPeriodApplied");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> WAITINGPERIODDETAILS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "WaitingPeriodDetails");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimWorkCompInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimWorkComp()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimWorkComp(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimWorkComp(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimWorkCompInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimWorkCompInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the FullDenialReasons array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFullDenialReasons(entity.FullDenialReason element) {
    __getInternalInterface().addArrayElement(FULLDENIALREASONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the WaitingPeriodDetails array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWaitingPeriodDetails(entity.WCWaitingPeriod element) {
    __getInternalInterface().addArrayElement(WAITINGPERIODDETAILS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AccidentPremises field.
   * A code to indicate the premises where the accident occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AccidentPremises getAccidentPremises() {
    return (typekey.AccidentPremises)__getInternalInterface().getFieldValue(ACCIDENTPREMISES_PROP.get());
  }
  
  /**
   * Gets the value of the ActivityPerformed field.
   * Field to describe the specific activity the injured worker was performing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getActivityPerformed() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACTIVITYPERFORMED_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim[] getClaimArray() {
    return (entity.Claim[])__getInternalInterface().getFieldValue(CLAIMARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the Compensable field.
   * Indicates status of the compensability decision
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CompensabilityDecision getCompensable() {
    return (typekey.CompensabilityDecision)__getInternalInterface().getFieldValue(COMPENSABLE_PROP.get());
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
   * Gets the value of the DateOfEmployeeRepresentation field.
   * Date Claim Administrator Notified of Employee Representation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfEmployeeRepresentation() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFEMPLOYEEREPRESENTATION_PROP.get());
  }
  
  /**
   * Gets the value of the DiscontinuedFringeBenefits field.
   * The amount of non-salary remuneration which the employer has discontinued as applicable to the calculation of benefits per the jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDiscontinuedFringeBenefits() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DISCONTINUEDFRINGEBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the EquipmentUsed field.
   * Field to describe the equipment, materials or chemicals the employee was using when event or exposure occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEquipmentUsed() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EQUIPMENTUSED_PROP.get());
  }
  
  /**
   * Gets the value of the FullDenialEffectiveDate field.
   * The date the compensability Decision (for entire claim) was set to Denied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFullDenialEffectiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FULLDENIALEFFECTIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the FullDenialReasons field.
   * Compensability full denial reasons when the claim compensibility was set to denied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FullDenialReason[] getFullDenialReasons() {
    return (entity.FullDenialReason[])__getInternalInterface().getFieldValue(FULLDENIALREASONS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InitialTreatment field.
   * Initial Treatment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InitialTreatment getInitialTreatment() {
    return (typekey.InitialTreatment)__getInternalInterface().getFieldValue(INITIALTREATMENT_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredReportNumber field.
   * A number assigned by the insured to identify a specific claim. If this data is included on any FROI/SROI transaction, it should be returned on the transaction’s acknowledgment regardless of whether it is a data element collected by the jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredReportNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDREPORTNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the JurisdictionClaimNumber field.
   * Jurisdiction Claim Number will be filled once received by the Jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getJurisdictionClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(JURISDICTIONCLAIMNUMBER_PROP.get());
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
   * Gets the value of the PartialDenialReason field.
   * Indicates reason for partial denial
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PartialDenialReason getPartialDenialReason() {
    return (typekey.PartialDenialReason)__getInternalInterface().getFieldValue(PARTIALDENIALREASON_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * Gets the value of the WaitingPeriodDetails field.
   * Used to track the specific days indicated as the Waiting Period on a WC Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCWaitingPeriod[] getWaitingPeriodDetails() {
    return (entity.WCWaitingPeriod[])__getInternalInterface().getFieldValue(WAITINGPERIODDETAILS_PROP.get());
  }
  
  /**
   * Gets the value of the ClassCodeByLocation field.
   * Is Class Code filtered by Location
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClassCodeByLocation() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLASSCODEBYLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the DeathReport field.
   * True if this claim has a report of death of the injured worker.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDeathReport() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DEATHREPORT_PROP.get());
  }
  
  /**
   * Gets the value of the EmployerLiability field.
   * True if this claim has a possible Employer's Liability aspect.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEmployerLiability() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EMPLOYERLIABILITY_PROP.get());
  }
  
  /**
   * Gets the value of the IllnessRelatedToExposure field.
   * Is claim being made for illness related to chemical or material exposure?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIllnessRelatedToExposure() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ILLNESSRELATEDTOEXPOSURE_PROP.get());
  }
  
  /**
   * Gets the value of the MedRecReleaseAuth field.
   * An indicator that the employee's written authorization to release medical records related to the injury is on file.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMedRecReleaseAuth() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MEDRECRELEASEAUTH_PROP.get());
  }
  
  /**
   * Gets the value of the MedicalReport field.
   * True if this is claim has a report that the injured worker requires Medical treatment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMedicalReport() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MEDICALREPORT_PROP.get());
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
   * Gets the value of the TimeLossReport field.
   * True if this is claim has a report that the injured worker will lose time from work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTimeLossReport() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TIMELOSSREPORT_PROP.get());
  }
  
  /**
   * Gets the value of the WaitingPeriodApplied field.
   * Should the Waiting Period be applied?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaitingPeriodApplied() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAITINGPERIODAPPLIED_PROP.get());
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
   * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
   */
  public void removeFromFullDenialReasons(entity.FullDenialReason element) {
    __getInternalInterface().removeArrayElement(FULLDENIALREASONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFullDenialReasons(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(FULLDENIALREASONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
   */
  public void removeFromWaitingPeriodDetails(entity.WCWaitingPeriod element) {
    __getInternalInterface().removeArrayElement(WAITINGPERIODDETAILS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWaitingPeriodDetails(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(WAITINGPERIODDETAILS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AccidentPremises field.
   */
  public void setAccidentPremises(typekey.AccidentPremises value) {
    __getInternalInterface().setFieldValue(ACCIDENTPREMISES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ActivityPerformed field.
   */
  public void setActivityPerformed(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACTIVITYPERFORMED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimArray field.
   */
  private void setClaimArray(entity.Claim[] value) {
    __getInternalInterface().setFieldValue(CLAIMARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClassCodeByLocation field.
   */
  public void setClassCodeByLocation(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CLASSCODEBYLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Compensable field.
   */
  public void setCompensable(typekey.CompensabilityDecision value) {
    __getInternalInterface().setFieldValue(COMPENSABLE_PROP.get(), value);
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
   * Sets the value of the DateOfEmployeeRepresentation field.
   */
  public void setDateOfEmployeeRepresentation(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFEMPLOYEEREPRESENTATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeathReport field.
   */
  public void setDeathReport(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DEATHREPORT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DiscontinuedFringeBenefits field.
   */
  public void setDiscontinuedFringeBenefits(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(DISCONTINUEDFRINGEBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmployerLiability field.
   */
  public void setEmployerLiability(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EMPLOYERLIABILITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EquipmentUsed field.
   */
  public void setEquipmentUsed(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EQUIPMENTUSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullDenialEffectiveDate field.
   */
  public void setFullDenialEffectiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FULLDENIALEFFECTIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullDenialReasons field.
   */
  public void setFullDenialReasons(entity.FullDenialReason[] value) {
    __getInternalInterface().setFieldValue(FULLDENIALREASONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IllnessRelatedToExposure field.
   */
  public void setIllnessRelatedToExposure(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ILLNESSRELATEDTOEXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InitialTreatment field.
   */
  public void setInitialTreatment(typekey.InitialTreatment value) {
    __getInternalInterface().setFieldValue(INITIALTREATMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredReportNumber field.
   */
  public void setInsuredReportNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDREPORTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JurisdictionClaimNumber field.
   */
  public void setJurisdictionClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(JURISDICTIONCLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedRecReleaseAuth field.
   */
  public void setMedRecReleaseAuth(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MEDRECRELEASEAUTH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedicalReport field.
   */
  public void setMedicalReport(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MEDICALREPORT_PROP.get(), value);
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
   * Sets the value of the PartialDenialReason field.
   */
  public void setPartialDenialReason(typekey.PartialDenialReason value) {
    __getInternalInterface().setFieldValue(PARTIALDENIALREASON_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TimeLossReport field.
   */
  public void setTimeLossReport(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TIMELOSSREPORT_PROP.get(), value);
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
   * Sets the value of the WaitingPeriodApplied field.
   */
  public void setWaitingPeriodApplied(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WAITINGPERIODAPPLIED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaitingPeriodDetails field.
   */
  public void setWaitingPeriodDetails(entity.WCWaitingPeriod[] value) {
    __getInternalInterface().setFieldValue(WAITINGPERIODDETAILS_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimWorkCompInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimWorkComp.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ClaimArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimArray(entity.Claim element) {
      __getInternalInterface().addArrayElement(CLAIMARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the FullDenialReasons array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToFullDenialReasons(entity.FullDenialReason element) {
      __getInternalInterface().addArrayElement(FULLDENIALREASONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the WaitingPeriodDetails array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToWaitingPeriodDetails(entity.WCWaitingPeriod element) {
      __getInternalInterface().addArrayElement(WAITINGPERIODDETAILS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the AccidentPremises field.
     * A code to indicate the premises where the accident occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AccidentPremises getAccidentPremises() {
      return (typekey.AccidentPremises)__getInternalInterface().getFieldValue(ACCIDENTPREMISES_PROP.get());
    }
    
    /**
     * Gets the value of the ActivityPerformed field.
     * Field to describe the specific activity the injured worker was performing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getActivityPerformed() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACTIVITYPERFORMED_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim[] getClaimArray() {
      return (entity.Claim[])__getInternalInterface().getFieldValue(CLAIMARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the Compensable field.
     * Indicates status of the compensability decision
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CompensabilityDecision getCompensable() {
      return (typekey.CompensabilityDecision)__getInternalInterface().getFieldValue(COMPENSABLE_PROP.get());
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
     * Gets the value of the DateOfEmployeeRepresentation field.
     * Date Claim Administrator Notified of Employee Representation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateOfEmployeeRepresentation() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFEMPLOYEEREPRESENTATION_PROP.get());
    }
    
    /**
     * Gets the value of the DiscontinuedFringeBenefits field.
     * The amount of non-salary remuneration which the employer has discontinued as applicable to the calculation of benefits per the jurisdiction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getDiscontinuedFringeBenefits() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DISCONTINUEDFRINGEBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the EquipmentUsed field.
     * Field to describe the equipment, materials or chemicals the employee was using when event or exposure occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEquipmentUsed() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EQUIPMENTUSED_PROP.get());
    }
    
    /**
     * Gets the value of the FullDenialEffectiveDate field.
     * The date the compensability Decision (for entire claim) was set to Denied.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFullDenialEffectiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FULLDENIALEFFECTIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the FullDenialReasons field.
     * Compensability full denial reasons when the claim compensibility was set to denied.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FullDenialReason[] getFullDenialReasons() {
      return (entity.FullDenialReason[])__getInternalInterface().getFieldValue(FULLDENIALREASONS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the InitialTreatment field.
     * Initial Treatment
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.InitialTreatment getInitialTreatment() {
      return (typekey.InitialTreatment)__getInternalInterface().getFieldValue(INITIALTREATMENT_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredReportNumber field.
     * A number assigned by the insured to identify a specific claim. If this data is included on any FROI/SROI transaction, it should be returned on the transaction’s acknowledgment regardless of whether it is a data element collected by the jurisdiction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredReportNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDREPORTNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the JurisdictionClaimNumber field.
     * Jurisdiction Claim Number will be filled once received by the Jurisdiction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getJurisdictionClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(JURISDICTIONCLAIMNUMBER_PROP.get());
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
     * Gets the value of the PartialDenialReason field.
     * Indicates reason for partial denial
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PartialDenialReason getPartialDenialReason() {
      return (typekey.PartialDenialReason)__getInternalInterface().getFieldValue(PARTIALDENIALREASON_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
    
    /**
     * Gets the value of the WaitingPeriodDetails field.
     * Used to track the specific days indicated as the Waiting Period on a WC Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.WCWaitingPeriod[] getWaitingPeriodDetails() {
      return (entity.WCWaitingPeriod[])__getInternalInterface().getFieldValue(WAITINGPERIODDETAILS_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the ClassCodeByLocation field.
     * Is Class Code filtered by Location
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isClassCodeByLocation() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLASSCODEBYLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the DeathReport field.
     * True if this claim has a report of death of the injured worker.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDeathReport() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DEATHREPORT_PROP.get());
    }
    
    /**
     * Gets the value of the EmployerLiability field.
     * True if this claim has a possible Employer's Liability aspect.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEmployerLiability() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EMPLOYERLIABILITY_PROP.get());
    }
    
    /**
     * Gets the value of the IllnessRelatedToExposure field.
     * Is claim being made for illness related to chemical or material exposure?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIllnessRelatedToExposure() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ILLNESSRELATEDTOEXPOSURE_PROP.get());
    }
    
    /**
     * Gets the value of the MedRecReleaseAuth field.
     * An indicator that the employee's written authorization to release medical records related to the injury is on file.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMedRecReleaseAuth() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MEDRECRELEASEAUTH_PROP.get());
    }
    
    /**
     * Gets the value of the MedicalReport field.
     * True if this is claim has a report that the injured worker requires Medical treatment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMedicalReport() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MEDICALREPORT_PROP.get());
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
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TimeLossReport field.
     * True if this is claim has a report that the injured worker will lose time from work.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTimeLossReport() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TIMELOSSREPORT_PROP.get());
    }
    
    /**
     * Gets the value of the WaitingPeriodApplied field.
     * Should the Waiting Period be applied?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWaitingPeriodApplied() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAITINGPERIODAPPLIED_PROP.get());
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
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
     * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimArray(entity.Claim element) {
      __getInternalInterface().removeArrayElement(CLAIMARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
     */
    public void removeFromFullDenialReasons(entity.FullDenialReason element) {
      __getInternalInterface().removeArrayElement(FULLDENIALREASONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the FullDenialReasons array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromFullDenialReasons(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(FULLDENIALREASONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
     */
    public void removeFromWaitingPeriodDetails(entity.WCWaitingPeriod element) {
      __getInternalInterface().removeArrayElement(WAITINGPERIODDETAILS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the WaitingPeriodDetails array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromWaitingPeriodDetails(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(WAITINGPERIODDETAILS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AccidentPremises field.
     */
    public void setAccidentPremises(typekey.AccidentPremises value) {
      __getInternalInterface().setFieldValue(ACCIDENTPREMISES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ActivityPerformed field.
     */
    public void setActivityPerformed(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ACTIVITYPERFORMED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimArray field.
     */
    public void setClaimArray(entity.Claim[] value) {
      __getInternalInterface().setFieldValue(CLAIMARRAY_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClassCodeByLocation field.
     */
    public void setClassCodeByLocation(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CLASSCODEBYLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Compensable field.
     */
    public void setCompensable(typekey.CompensabilityDecision value) {
      __getInternalInterface().setFieldValue(COMPENSABLE_PROP.get(), value);
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
     * Sets the value of the DateOfEmployeeRepresentation field.
     */
    public void setDateOfEmployeeRepresentation(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFEMPLOYEEREPRESENTATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeathReport field.
     */
    public void setDeathReport(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DEATHREPORT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DiscontinuedFringeBenefits field.
     */
    public void setDiscontinuedFringeBenefits(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(DISCONTINUEDFRINGEBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmployerLiability field.
     */
    public void setEmployerLiability(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EMPLOYERLIABILITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EquipmentUsed field.
     */
    public void setEquipmentUsed(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EQUIPMENTUSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullDenialEffectiveDate field.
     */
    public void setFullDenialEffectiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FULLDENIALEFFECTIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullDenialReasons field.
     */
    public void setFullDenialReasons(entity.FullDenialReason[] value) {
      __getInternalInterface().setFieldValue(FULLDENIALREASONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IllnessRelatedToExposure field.
     */
    public void setIllnessRelatedToExposure(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ILLNESSRELATEDTOEXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InitialTreatment field.
     */
    public void setInitialTreatment(typekey.InitialTreatment value) {
      __getInternalInterface().setFieldValue(INITIALTREATMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredReportNumber field.
     */
    public void setInsuredReportNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDREPORTNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionClaimNumber field.
     */
    public void setJurisdictionClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(JURISDICTIONCLAIMNUMBER_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedRecReleaseAuth field.
     */
    public void setMedRecReleaseAuth(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MEDRECRELEASEAUTH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedicalReport field.
     */
    public void setMedicalReport(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MEDICALREPORT_PROP.get(), value);
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
     * Sets the value of the PartialDenialReason field.
     */
    public void setPartialDenialReason(typekey.PartialDenialReason value) {
      __getInternalInterface().setFieldValue(PARTIALDENIALREASON_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
     * Sets the value of the TimeLossReport field.
     */
    public void setTimeLossReport(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TIMELOSSREPORT_PROP.get(), value);
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
     * Sets the value of the WaitingPeriodApplied field.
     */
    public void setWaitingPeriodApplied(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WAITINGPERIODAPPLIED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaitingPeriodDetails field.
     */
    public void setWaitingPeriodDetails(entity.WCWaitingPeriod[] value) {
      __getInternalInterface().setFieldValue(WAITINGPERIODDETAILS_PROP.get(), value);
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.entity.ClaimWorkComp", "com.guidewire.cc.domain.claim.impl.ClaimWorkCompImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimWorkComp.class, config);
    com.guidewire._generated.entity.ClaimWorkCompInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimWorkComp, com.guidewire._generated.entity.ClaimWorkCompInternal>() {
      public java.lang.Object getImplementation(entity.ClaimWorkComp bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimWorkCompInternal getInternalInterface(entity.ClaimWorkComp bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimWorkComp newEmptyInstance() {
        return new entity.ClaimWorkComp((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
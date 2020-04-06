package entity;

/**
 * ClaimInfo
 * 
 * The stub of the claim that is left behind after the claim is archived. It contains minimal (summary) information about the claim; for example, claim number and loss location. It is also included in claim searches. Because this table is not archived, it has the potential to grow very large; care must be taken not to put too much data in it (for example, a blob) when extending it.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfo.eti;ClaimInfo.eix;ClaimInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimInfo")
public class ClaimInfo extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.RootInfo, entity.EventAware, com.guidewire.cc.domain.purging.Purgeable, gw.api.claim.PurgeClaimInfoMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimInfo> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimInfo>("entity.ClaimInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACCESS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Access");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ADJUSTER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Adjuster");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchiveDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ARCHIVEFAILURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ArchiveFailure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ARCHIVEFAILUREDETAILS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ArchiveFailureDetails");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ARCHIVESCHEMAINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ArchiveSchemaInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ARCHIVESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ArchiveState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMAGGREGATELIMITRPTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimAggregateLimitRpts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMINASSOCIATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimInAssociations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CONTACTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Contacts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> COVERAGELINEMATCHDATA_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CoverageLineMatchData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERAGELINEMATCHDATAINFOVALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverageLineMatchDataInfoValid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCLUDEREASON_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExcludeReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCLUDEDFROMARCHIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExcludedFromArchive");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "JurisdictionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOSSLOCATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LossLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LOSSLOCATIONARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "LossLocationArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSLOCATIONCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossLocationCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTICEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NoticeDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PERIODPOLICIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "PeriodPolicies");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PURGEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PurgeDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROOTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RootPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UCR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UCR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UMR_EXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UMR_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimInfoInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimInfo()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimInfo(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimInfo(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimInfoInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimInfoInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
    __getInternalInterface().addArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClaimInAssociations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimInAssociations(entity.ClaimInAssociation element) {
    __getInternalInterface().addArrayElement(CLAIMINASSOCIATIONS_PROP.get(), element);
  }
  
  /**
   * 
   * @param element 
   * @deprecated Please use ClaimInfo.addToClaimInAssociations
   */
  public void addToClaimsAssociatedWith(entity.ClaimInAssociation element) {
    ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).addToClaimsAssociatedWith(element);
  }
  
  /**
   * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContacts(entity.ContactInfo element) {
    __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the CoverageLineMatchData array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLineMatchData(entity.CoverageLineMatchDataInfo element) {
    __getInternalInterface().addArrayElement(COVERAGELINEMATCHDATA_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the PeriodPolicies array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToPeriodPolicies(entity.PeriodPolicy element) {
    __getInternalInterface().addArrayElement(PERIODPOLICIES_PROP.get(), element);
  }
  
  /**
   * This method will return true if this object can be restored at this time.  There are two possible reason why this
   * would be false.  1.  the object was not archived in the first place; 2.  The archive source is not currently available
   * @return true if okay to restore
   */
  public boolean canRestore() {
    return ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).canRestore();
  }
  
  /**
   * Gets the value of the Access field.
   * The access control objects for this claim info.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfoAccess[] getAccess() {
    return (entity.ClaimInfoAccess[])__getInternalInterface().getFieldValue(ACCESS_PROP.get());
  }
  
  /**
   * Gets the value of the Adjuster field.
   * Assigned user on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAdjuster() {
    return (entity.User)__getInternalInterface().getFieldValue(ADJUSTER_PROP.get());
  }
  
  public int getApplicationMajorVersion() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getApplicationMajorVersion();
  }
  
  public int getApplicationMinorVersion() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getApplicationMinorVersion();
  }
  
  /**
   * Gets the value of the ArchiveDate field.
   * When archiving was attempted on the root. Null if we never attempted to archive it.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getArchiveDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ARCHIVEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ArchiveFailure field.
   * Short version of the reason for a failure to archive
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArchiveFailure getArchiveFailure() {
    return (entity.ArchiveFailure)__getInternalInterface().getFieldValue(ARCHIVEFAILURE_PROP.get());
  }
  
  /**
   * Gets the value of the ArchiveFailureDetails field.
   * Full details of archive failure
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArchiveFailureDetails getArchiveFailureDetails() {
    return (entity.ArchiveFailureDetails)__getInternalInterface().getFieldValue(ARCHIVEFAILUREDETAILS_PROP.get());
  }
  
  /**
   * Gets the value of the ArchiveSchemaInfo field.
   * Schema version at which the root was archived or null if it was not archived
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDatamodelInfo getArchiveSchemaInfo() {
    return (entity.UpgradeDatamodelInfo)__getInternalInterface().getFieldValue(ARCHIVESCHEMAINFO_PROP.get());
  }
  
  /**
   * Gets the value of the ArchiveState field.
   * The archive state of the graph
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ArchiveState getArchiveState() {
    return (typekey.ArchiveState)__getInternalInterface().getFieldValue(ARCHIVESTATE_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedGroup field.
   * Assigned group on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
  }
  
  /**
   * The display name of the assignee.
   * @return The assignee display name
   */
  public java.lang.String getAssigneeDisplayName() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getAssigneeDisplayName();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAggregateLimitRpts field.
   * Denormalized data for this claim per policyperiod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts() {
    return (entity.ClaimAggregateLimitRpt[])__getInternalInterface().getFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get());
  }
  
  /**
   * Get the claim currency. For a live claim this will return the corresponding claim's currency. For an archived
   * claim it will return the value in this info's Currency field. For claims archived in 8.0 or later this field will
   * have been populated when the claim was archived. For earlier archived claims the field will be null, indicating that
   * we don't know the currency of the archived claim.
   * @return possibly null currency. If null then we cannot determine the currency of the claim
   */
  @javax.annotation.Nullable
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimCurrency();
  }
  
  /**
   * Gets the value of the ClaimInAssociations field.
   * All the ClaimInAssociation entities for the Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInAssociation[] getClaimInAssociations() {
    return (entity.ClaimInAssociation[])__getInternalInterface().getFieldValue(CLAIMINASSOCIATIONS_PROP.get());
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
   * Returns the names of the claimant Contacts on the Claim.
   * @return The claimant names
   */
  public java.lang.String[] getClaimantNames() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimantNames();
  }
  
  /**
   * 
   * @deprecated The original javadoc did not describe this method's behavior correctly.  To replecate
   * old behavior, please use ClaimInfo.ClaimInAssociations.  For a method that does what the old
   * javadoc purported this one to do, please use ClaimInfo.Claim.ClaimsAssociatedWith
   */
  public entity.ClaimInAssociation[] getClaimsAssociatedWith() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimsAssociatedWith();
  }
  
  /**
   * Gets the value of the Contacts field.
   * all the cached contacts (insured and claimant) for the archived claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactInfo[] getContacts() {
    return (entity.ContactInfo[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLineMatchData field.
   * Contains the coverage specifications for which at least one transaction exists on the archived claim. This is used to prevent future aggregate limits from being applied to coverage specifications where an archived claim's transaction would contribute, since it would no longer be possible to calculate the contribution of the archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineMatchDataInfo[] getCoverageLineMatchData() {
    return (entity.CoverageLineMatchDataInfo[])__getInternalInterface().getFieldValue(COVERAGELINEMATCHDATA_PROP.get());
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
   * The currency for the claim, copied from the claim when the claim is archived. Always null for active claims. May also be null for pre 8.0 archived claims
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the ExcludeReason field.
   * Reason for excluding or skipping the entity from archiving. If the ExcludeFromArchive bit is set, this gives the reason for excluding. Else, if this is not null, it is the reason for skipping.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExcludeReason() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXCLUDEREASON_PROP.get());
  }
  
  public int getExtensionsVersion() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getExtensionsVersion();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * The denormalized Contact for the Poilcy insured.
   * @return The Policy insured
   */
  public entity.ContactInfo getInsured() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getInsured();
  }
  
  /**
   * Gets the value of the JurisdictionState field.
   * The state of jurisdiction. Denormed from claim.JurisdictionState
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState() {
    return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
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
   * Gets the value of the LossDate field.
   * Cached LossDate on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocation field.
   * The loss location information for the archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationInfo getLossLocation() {
    return (entity.LocationInfo)__getInternalInterface().getFieldValue(LOSSLOCATION_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationInfo[] getLossLocationArray() {
    return (entity.LocationInfo[])__getInternalInterface().getFieldValue(LOSSLOCATIONARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the LossLocationCode field.
   * Location Code denormed from claim.LossLocationCode
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocationCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get());
  }
  
  /**
   * Customers should implement this method to return the IDs of beans that are
   * linked to this ClaimInfo but are outside the claim graph. The internal purge logic
   * uses the claim graph to decide what beans are part of the claim, but relies on this method for
   * information about beans outside the graph but that should still be deleted during purge.
   * The order of the returned List determines the order in which the beans will be deleted.
   * This ClaimInfo must also be included in the result (and it must be the only ClaimInfo); the
   * other beans in the result will normally be extension entities.
   * @return a List of the beans to delete (including the ClaimInfo itself), grouped by type and
   *         in the order that they should be deleted; this is actually a list of Pairs, where each
   *         Pair contains a type and the beans of that to be deleted
   */
  public java.util.List<gw.util.Pair<gw.entity.IEntityType, java.util.List<gw.pl.persistence.core.Key>>> getNonGraphBeansToPurge() {
    return ((gw.api.claim.PurgeClaimInfoMethods)__getDelegateManager().getImplementation("gw.api.claim.PurgeClaimInfoMethods")).getNonGraphBeansToPurge();
  }
  
  /**
   * Gets the value of the NoticeDate field.
   * Cached ReportedDate on Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoticeDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(NOTICEDATE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PeriodPolicy[] getPeriodPolicies() {
    return (entity.PeriodPolicy[])__getInternalInterface().getFieldValue(PERIODPOLICIES_PROP.get());
  }
  
  public int getPlatformMajorVersion() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getPlatformMajorVersion();
  }
  
  public int getPlatformMinorVersion() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getPlatformMinorVersion();
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the PolicyPeriods linked to this ClaimInfo.
   * @return the linked PolicyPeriods
   */
  public java.util.List<entity.PolicyPeriod> getPolicyPeriods() {
    return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getPolicyPeriods();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Returns the public ID of the root.
   * @return public ID of the root.
   */
  public java.lang.String getPublicIDOfRoot() {
    return ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).getPublicIDOfRoot();
  }
  
  /**
   * Gets the value of the PurgeDate field.
   * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPurgeDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(PURGEDATE_PROP.get());
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
   * Gets the value of the RootPublicID field.
   * The public ID of the root.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRootPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROOTPUBLICID_PROP.get());
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
  
  public java.lang.String getVersionString() {
    return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getVersionString();
  }
  
  /**
   * Gets the value of the CoverageLineMatchDataInfoValid field.
   * True for archived claims which have an accurate CoverageLineMatchDataInfo array, false otherwise
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageLineMatchDataInfoValid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGELINEMATCHDATAINFOVALID_PROP.get());
  }
  
  /**
   * Gets the value of the ExcludedFromArchive field.
   * Indicate if this entity should be excluded from archiving
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExcludedFromArchive() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXCLUDEDFROMARCHIVE_PROP.get());
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
  
  public void markPurgeReady(boolean purgeFromAggregateLimit) throws gw.api.webservice.exception.EntityStateException {
    ((com.guidewire.cc.domain.purging.Purgeable)__getDelegateManager().getImplementation("com.guidewire.cc.domain.purging.Purgeable")).markPurgeReady(purgeFromAggregateLimit);
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
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
    __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimInAssociations(entity.ClaimInAssociation element) {
    __getInternalInterface().removeArrayElement(CLAIMINASSOCIATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimInAssociations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMINASSOCIATIONS_PROP.get(), elementID);
  }
  
  /**
   * 
   * @param element 
   * @deprecated please use ClaimInfo.removeFromClaimInAssociations( ClaimInAssociation )
   */
  public void removeFromClaimsAssociatedWith(entity.ClaimInAssociation element) {
    ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).removeFromClaimsAssociatedWith(element);
  }
  
  /**
   * 
   * @param elementID 
   * @deprecated please use ClaimInfo.removeFromClaimInAssociations( Key )
   */
  public void removeFromClaimsAssociatedWith(gw.pl.persistence.core.Key elementID) {
    ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).removeFromClaimsAssociatedWith(elementID);
  }
  
  /**
   * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
   */
  public void removeFromContacts(entity.ContactInfo element) {
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
   * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLineMatchData(entity.CoverageLineMatchDataInfo element) {
    __getInternalInterface().removeArrayElement(COVERAGELINEMATCHDATA_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLineMatchData(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(COVERAGELINEMATCHDATA_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromPeriodPolicies(entity.PeriodPolicy element) {
    __getInternalInterface().removeArrayElement(PERIODPOLICIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPeriodPolicies(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PERIODPOLICIES_PROP.get(), elementID);
  }
  
  /**
   * Report an issue that prevents this item from being archived. Usually called by a rule when it has determined that the item is not
   * ready to be archived yet. Unlike skipFromArchiving(), this method does not return immediately and subsequent rules are processed.
   * @param message The reason for skipping.
   */
  public void reportArchiveProblem(java.lang.String message) {
    ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).reportArchiveProblem(message);
  }
  
  /**
   * Reset flag that marks the graph as excluded for archiving
   */
  public void resetToPreArchivedState() {
    ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).resetToPreArchivedState();
  }
  
  /**
   * Schedule this item for archival
   */
  public void scheduleForArchive() {
    ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).scheduleForArchive();
  }
  
  /**
   * Sets the value of the Access field.
   */
  private void setAccess(entity.ClaimInfoAccess[] value) {
    __getInternalInterface().setFieldValue(ACCESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Adjuster field.
   */
  private void setAdjuster(entity.User value) {
    __getInternalInterface().setFieldValue(ADJUSTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchiveDate field.
   */
  private void setArchiveDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ARCHIVEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchiveFailure field.
   */
  private void setArchiveFailure(entity.ArchiveFailure value) {
    __getInternalInterface().setFieldValue(ARCHIVEFAILURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchiveFailureDetails field.
   */
  private void setArchiveFailureDetails(entity.ArchiveFailureDetails value) {
    __getInternalInterface().setFieldValue(ARCHIVEFAILUREDETAILS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchiveSchemaInfo field.
   */
  private void setArchiveSchemaInfo(entity.UpgradeDatamodelInfo value) {
    __getInternalInterface().setFieldValue(ARCHIVESCHEMAINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchiveState field.
   */
  private void setArchiveState(typekey.ArchiveState value) {
    __getInternalInterface().setFieldValue(ARCHIVESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedGroup field.
   */
  private void setAssignedGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(ASSIGNEDGROUP_PROP.get(), value);
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
  private void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAggregateLimitRpts field.
   */
  private void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value) {
    __getInternalInterface().setFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimInAssociations field.
   */
  public void setClaimInAssociations(entity.ClaimInAssociation[] value) {
    __getInternalInterface().setFieldValue(CLAIMINASSOCIATIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contacts field.
   */
  public void setContacts(entity.ContactInfo[] value) {
    __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLineMatchData field.
   */
  public void setCoverageLineMatchData(entity.CoverageLineMatchDataInfo[] value) {
    __getInternalInterface().setFieldValue(COVERAGELINEMATCHDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLineMatchDataInfoValid field.
   */
  private void setCoverageLineMatchDataInfoValid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COVERAGELINEMATCHDATAINFOVALID_PROP.get(), value);
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
   * Sets the value of the ExcludeReason field.
   */
  private void setExcludeReason(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXCLUDEREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExcludedFromArchive field.
   */
  private void setExcludedFromArchive(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXCLUDEDFROMARCHIVE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value) {
    __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDate field.
   */
  private void setLossDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocation field.
   */
  private void setLossLocation(entity.LocationInfo value) {
    __getInternalInterface().setFieldValue(LOSSLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocationArray field.
   */
  private void setLossLocationArray(entity.LocationInfo[] value) {
    __getInternalInterface().setFieldValue(LOSSLOCATIONARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossLocationCode field.
   */
  public void setLossLocationCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get(), value);
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
   * Sets the value of the NoticeDate field.
   */
  private void setNoticeDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(NOTICEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PeriodPolicies field.
   */
  private void setPeriodPolicies(entity.PeriodPolicy[] value) {
    __getInternalInterface().setFieldValue(PERIODPOLICIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the root public ID to the passed value.
   * @param value value for the root public ID.
   */
  public void setPublicIDOfRoot(java.lang.String value) {
    ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).setPublicIDOfRoot(value);
  }
  
  /**
   * Sets the value of the PurgeDate field.
   */
  public void setPurgeDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(PURGEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RootPublicID field.
   */
  public void setRootPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ROOTPUBLICID_PROP.get(), value);
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
   * Skip archival of this item. Usually called by a rule when it has determined that the item is not ready to be archived yet.
   * Unlike reportArchiveProblem(), this method returns immediately and no more rules are processed.
   * @param message The reason for skipping.
   */
  public void skipFromArchiving(java.lang.String message) {
    ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).skipFromArchiving(message);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimInfoInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimInfo.this.__getDelegateManager();
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
     * Adds the given element to the Access array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAccess(entity.ClaimInfoAccess element) {
      __getInternalInterface().addArrayElement(ACCESS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
      __getInternalInterface().addArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClaimInAssociations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimInAssociations(entity.ClaimInAssociation element) {
      __getInternalInterface().addArrayElement(CLAIMINASSOCIATIONS_PROP.get(), element);
    }
    
    /**
     * 
     * @param element 
     * @deprecated Please use ClaimInfo.addToClaimInAssociations
     */
    public void addToClaimsAssociatedWith(entity.ClaimInAssociation element) {
      ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).addToClaimsAssociatedWith(element);
    }
    
    /**
     * Adds the given element to the Contacts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContacts(entity.ContactInfo element) {
      __getInternalInterface().addArrayElement(CONTACTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CoverageLineMatchData array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCoverageLineMatchData(entity.CoverageLineMatchDataInfo element) {
      __getInternalInterface().addArrayElement(COVERAGELINEMATCHDATA_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the LossLocationArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLossLocationArray(entity.LocationInfo element) {
      __getInternalInterface().addArrayElement(LOSSLOCATIONARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the PeriodPolicies array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPeriodPolicies(entity.PeriodPolicy element) {
      __getInternalInterface().addArrayElement(PERIODPOLICIES_PROP.get(), element);
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
    
    /**
     * This method will return true if this object can be restored at this time.  There are two possible reason why this
     * would be false.  1.  the object was not archived in the first place; 2.  The archive source is not currently available
     * @return true if okay to restore
     */
    public boolean canRestore() {
      return ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).canRestore();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public void checkArchiveEligibility() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).checkArchiveEligibility();
    }
    
    public void clearTraceDetails() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).clearTraceDetails();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void excludeFromArchiveBecauseOfFailure(java.lang.Exception e) {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).excludeFromArchiveBecauseOfFailure(e);
    }
    
    public void excludeFromArchiveBecauseOfRules(java.lang.String message) {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).excludeFromArchiveBecauseOfRules(message);
    }
    
    public com.guidewire.pl.system.database.Query<entity.TransactionOnset> findTransactionOnsetsToSever() {
      return ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).findTransactionOnsetsToSever();
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
     * Gets the value of the Access field.
     * The access control objects for this claim info.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInfoAccess[] getAccess() {
      return (entity.ClaimInfoAccess[])__getInternalInterface().getFieldValue(ACCESS_PROP.get());
    }
    
    /**
     * Gets the value of the Adjuster field.
     * Assigned user on Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAdjuster() {
      return (entity.User)__getInternalInterface().getFieldValue(ADJUSTER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAdjusterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ADJUSTER_PROP.get());
    }
    
    public int getApplicationMajorVersion() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getApplicationMajorVersion();
    }
    
    public int getApplicationMinorVersion() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getApplicationMinorVersion();
    }
    
    /**
     * Gets the value of the ArchiveDate field.
     * When archiving was attempted on the root. Null if we never attempted to archive it.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getArchiveDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ARCHIVEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ArchiveFailure field.
     * Short version of the reason for a failure to archive
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ArchiveFailure getArchiveFailure() {
      return (entity.ArchiveFailure)__getInternalInterface().getFieldValue(ARCHIVEFAILURE_PROP.get());
    }
    
    /**
     * Gets the value of the ArchiveFailureDetails field.
     * Full details of archive failure
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ArchiveFailureDetails getArchiveFailureDetails() {
      return (entity.ArchiveFailureDetails)__getInternalInterface().getFieldValue(ARCHIVEFAILUREDETAILS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getArchiveFailureDetailsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ARCHIVEFAILUREDETAILS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getArchiveFailureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ARCHIVEFAILURE_PROP.get());
    }
    
    /**
     * Gets the value of the ArchiveSchemaInfo field.
     * Schema version at which the root was archived or null if it was not archived
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeDatamodelInfo getArchiveSchemaInfo() {
      return (entity.UpgradeDatamodelInfo)__getInternalInterface().getFieldValue(ARCHIVESCHEMAINFO_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getArchiveSchemaInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ARCHIVESCHEMAINFO_PROP.get());
    }
    
    /**
     * Gets the value of the ArchiveState field.
     * The archive state of the graph
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ArchiveState getArchiveState() {
      return (typekey.ArchiveState)__getInternalInterface().getFieldValue(ARCHIVESTATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedGroup field.
     * Assigned group on Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getAssignedGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDGROUP_PROP.get());
    }
    
    /**
     * The display name of the assignee.
     * @return The assignee display name
     */
    public java.lang.String getAssigneeDisplayName() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getAssigneeDisplayName();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAggregateLimitRpts field.
     * Denormalized data for this claim per policyperiod.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts() {
      return (entity.ClaimAggregateLimitRpt[])__getInternalInterface().getFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get());
    }
    
    /**
     * Get the claim currency. For a live claim this will return the corresponding claim's currency. For an archived
     * claim it will return the value in this info's Currency field. For claims archived in 8.0 or later this field will
     * have been populated when the claim was archived. For earlier archived claims the field will be null, indicating that
     * we don't know the currency of the archived claim.
     * @return possibly null currency. If null then we cannot determine the currency of the claim
     */
    @javax.annotation.Nullable
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimInAssociations field.
     * All the ClaimInAssociation entities for the Claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInAssociation[] getClaimInAssociations() {
      return (entity.ClaimInAssociation[])__getInternalInterface().getFieldValue(CLAIMINASSOCIATIONS_PROP.get());
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
     * Returns the names of the claimant Contacts on the Claim.
     * @return The claimant names
     */
    public java.lang.String[] getClaimantNames() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimantNames();
    }
    
    public java.util.List<entity.ContactInfo> getClaimants() {
      return ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).getClaimants();
    }
    
    /**
     * 
     * @deprecated The original javadoc did not describe this method's behavior correctly.  To replecate
     * old behavior, please use ClaimInfo.ClaimInAssociations.  For a method that does what the old
     * javadoc purported this one to do, please use ClaimInfo.Claim.ClaimsAssociatedWith
     */
    public entity.ClaimInAssociation[] getClaimsAssociatedWith() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getClaimsAssociatedWith();
    }
    
    /**
     * Gets the value of the Contacts field.
     * all the cached contacts (insured and claimant) for the archived claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ContactInfo[] getContacts() {
      return (entity.ContactInfo[])__getInternalInterface().getFieldValue(CONTACTS_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageLineMatchData field.
     * Contains the coverage specifications for which at least one transaction exists on the archived claim. This is used to prevent future aggregate limits from being applied to coverage specifications where an archived claim's transaction would contribute, since it would no longer be possible to calculate the contribution of the archived claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CoverageLineMatchDataInfo[] getCoverageLineMatchData() {
      return (entity.CoverageLineMatchDataInfo[])__getInternalInterface().getFieldValue(COVERAGELINEMATCHDATA_PROP.get());
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
     * The currency for the claim, copied from the claim when the claim is archived. Always null for active claims. May also be null for pre 8.0 archived claims
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the ExcludeReason field.
     * Reason for excluding or skipping the entity from archiving. If the ExcludeFromArchive bit is set, this gives the reason for excluding. Else, if this is not null, it is the reason for skipping.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExcludeReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXCLUDEREASON_PROP.get());
    }
    
    public int getExtensionsVersion() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getExtensionsVersion();
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
     * The denormalized Contact for the Poilcy insured.
     * @return The Policy insured
     */
    public entity.ContactInfo getInsured() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getInsured();
    }
    
    public java.lang.String getInsuredName() {
      return ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).getInsuredName();
    }
    
    /**
     * Gets the value of the JurisdictionState field.
     * The state of jurisdiction. Denormed from claim.JurisdictionState
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getJurisdictionState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
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
     * Gets the value of the LossDate field.
     * Cached LossDate on Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocation field.
     * The loss location information for the archived claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LocationInfo getLossLocation() {
      return (entity.LocationInfo)__getInternalInterface().getFieldValue(LOSSLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocationArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LocationInfo[] getLossLocationArray() {
      return (entity.LocationInfo[])__getInternalInterface().getFieldValue(LOSSLOCATIONARRAY_PROP.get());
    }
    
    /**
     * Gets the value of the LossLocationCode field.
     * Location Code denormed from claim.LossLocationCode
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossLocationCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSLOCATIONCODE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLossLocationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOSSLOCATION_PROP.get());
    }
    
    /**
     * Customers should implement this method to return the IDs of beans that are
     * linked to this ClaimInfo but are outside the claim graph. The internal purge logic
     * uses the claim graph to decide what beans are part of the claim, but relies on this method for
     * information about beans outside the graph but that should still be deleted during purge.
     * The order of the returned List determines the order in which the beans will be deleted.
     * This ClaimInfo must also be included in the result (and it must be the only ClaimInfo); the
     * other beans in the result will normally be extension entities.
     * @return a List of the beans to delete (including the ClaimInfo itself), grouped by type and
     *         in the order that they should be deleted; this is actually a list of Pairs, where each
     *         Pair contains a type and the beans of that to be deleted
     */
    public java.util.List<gw.util.Pair<gw.entity.IEntityType, java.util.List<gw.pl.persistence.core.Key>>> getNonGraphBeansToPurge() {
      return ((gw.api.claim.PurgeClaimInfoMethods)__getDelegateManager().getImplementation("gw.api.claim.PurgeClaimInfoMethods")).getNonGraphBeansToPurge();
    }
    
    /**
     * Gets the value of the NoticeDate field.
     * Cached ReportedDate on Claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getNoticeDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(NOTICEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the PeriodPolicies field.
     * Array of PeriodPolicy beans associated with this ClaimInfo - only used internally for getting the PolicyPeriods off a Claim/Policy
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PeriodPolicy[] getPeriodPolicies() {
      return (entity.PeriodPolicy[])__getInternalInterface().getFieldValue(PERIODPOLICIES_PROP.get());
    }
    
    public int getPlatformMajorVersion() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getPlatformMajorVersion();
    }
    
    public int getPlatformMinorVersion() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getPlatformMinorVersion();
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Number of the policy (generally a string).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the PolicyPeriods linked to this ClaimInfo.
     * @return the linked PolicyPeriods
     */
    public java.util.List<entity.PolicyPeriod> getPolicyPeriods() {
      return ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).getPolicyPeriods();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Returns the public ID of the root.
     * @return public ID of the root.
     */
    public java.lang.String getPublicIDOfRoot() {
      return ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).getPublicIDOfRoot();
    }
    
    /**
     * Gets the value of the PurgeDate field.
     * Date at which the claim should be purged. Configurations can use this field to decide when to mark the claim for purge, and there are sample Claim Closed and Claim Reopened rules to set it. It is not used by the internal purge logic.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPurgeDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(PURGEDATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    public entity.Extractable getRoot() {
      return ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).getRoot();
    }
    
    /**
     * Gets the value of the RootPublicID field.
     * The public ID of the root.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRootPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROOTPUBLICID_PROP.get());
    }
    
    public java.lang.String getTraceDetails() {
      return ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).getTraceDetails();
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
    
    public java.lang.String getVersionString() {
      return ((com.guidewire.commons.metadata.internal.version.MetadataVersionProvider)__getDelegateManager().getImplementation("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider")).getVersionString();
    }
    
    public boolean hasReportedArchiveProblem() {
      return ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).hasReportedArchiveProblem();
    }
    
    public boolean hasTraceDetails() {
      return ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).hasTraceDetails();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isArchived() {
      return ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).isArchived();
    }
    
    /**
     * Gets the value of the CoverageLineMatchDataInfoValid field.
     * True for archived claims which have an accurate CoverageLineMatchDataInfo array, false otherwise
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCoverageLineMatchDataInfoValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGELINEMATCHDATAINFOVALID_PROP.get());
    }
    
    /**
     * Gets the value of the ExcludedFromArchive field.
     * Indicate if this entity should be excluded from archiving
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExcludedFromArchive() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXCLUDEDFROMARCHIVE_PROP.get());
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
    
    public void markArchived() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).markArchived();
    }
    
    public void markPurgeReady(boolean purgeFromAggregateLimit) throws gw.api.webservice.exception.EntityStateException {
      ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).markPurgeReady(purgeFromAggregateLimit);
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
     * Removes the given element from the Access array. This is achieved by marking the element for removal.
     */
    public void removeFromAccess(entity.ClaimInfoAccess element) {
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
     * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element) {
      __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMAGGREGATELIMITRPTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimInAssociations(entity.ClaimInAssociation element) {
      __getInternalInterface().removeArrayElement(CLAIMINASSOCIATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimInAssociations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimInAssociations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMINASSOCIATIONS_PROP.get(), elementID);
    }
    
    /**
     * 
     * @param element 
     * @deprecated please use ClaimInfo.removeFromClaimInAssociations( ClaimInAssociation )
     */
    public void removeFromClaimsAssociatedWith(entity.ClaimInAssociation element) {
      ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).removeFromClaimsAssociatedWith(element);
    }
    
    /**
     * 
     * @param elementID 
     * @deprecated please use ClaimInfo.removeFromClaimInAssociations( Key )
     */
    public void removeFromClaimsAssociatedWith(gw.pl.persistence.core.Key elementID) {
      ((gw.cc.claim.archiving.entity.ClaimInfo)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfo")).removeFromClaimsAssociatedWith(elementID);
    }
    
    /**
     * Removes the given element from the Contacts array. This is achieved by marking the element for removal.
     */
    public void removeFromContacts(entity.ContactInfo element) {
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
     * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
     */
    public void removeFromCoverageLineMatchData(entity.CoverageLineMatchDataInfo element) {
      __getInternalInterface().removeArrayElement(COVERAGELINEMATCHDATA_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CoverageLineMatchData array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCoverageLineMatchData(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVERAGELINEMATCHDATA_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the LossLocationArray array. This is achieved by marking the element for removal.
     */
    public void removeFromLossLocationArray(entity.LocationInfo element) {
      __getInternalInterface().removeArrayElement(LOSSLOCATIONARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LossLocationArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLossLocationArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LOSSLOCATIONARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
     */
    public void removeFromPeriodPolicies(entity.PeriodPolicy element) {
      __getInternalInterface().removeArrayElement(PERIODPOLICIES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the PeriodPolicies array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPeriodPolicies(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PERIODPOLICIES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Report an issue that prevents this item from being archived. Usually called by a rule when it has determined that the item is not
     * ready to be archived yet. Unlike skipFromArchiving(), this method does not return immediately and subsequent rules are processed.
     * @param message The reason for skipping.
     */
    public void reportArchiveProblem(java.lang.String message) {
      ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).reportArchiveProblem(message);
    }
    
    /**
     * Reset flag that marks the graph as excluded for archiving
     */
    public void resetToPreArchivedState() {
      ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).resetToPreArchivedState();
    }
    
    public entity.Claim restore(java.lang.String comment, boolean assignToCurrentUser) {
      return ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).restore(comment, assignToCurrentUser);
    }
    
    public void runArchiveWithTrace() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).runArchiveWithTrace();
    }
    
    public void runCommonArchiveEligibilityRules() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).runCommonArchiveEligibilityRules();
    }
    
    public void runCommonRequiredArchiveEligibilityChecks() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).runCommonRequiredArchiveEligibilityChecks();
    }
    
    /**
     * Schedule this item for archival
     */
    public void scheduleForArchive() {
      ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).scheduleForArchive();
    }
    
    /**
     * Sets the value of the Access field.
     */
    public void setAccess(entity.ClaimInfoAccess[] value) {
      __getInternalInterface().setFieldValue(ACCESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Adjuster field.
     */
    public void setAdjuster(entity.User value) {
      __getInternalInterface().setFieldValue(ADJUSTER_PROP.get(), value);
    }
    
    public void setAdjusterID(gw.pl.persistence.core.Key value) {
      setFieldValue(ADJUSTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveDate field.
     */
    public void setArchiveDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ARCHIVEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveFailure field.
     */
    public void setArchiveFailure(entity.ArchiveFailure value) {
      __getInternalInterface().setFieldValue(ARCHIVEFAILURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveFailureDetails field.
     */
    public void setArchiveFailureDetails(entity.ArchiveFailureDetails value) {
      __getInternalInterface().setFieldValue(ARCHIVEFAILUREDETAILS_PROP.get(), value);
    }
    
    public void setArchiveFailureDetailsID(gw.pl.persistence.core.Key value) {
      setFieldValue(ARCHIVEFAILUREDETAILS_PROP.get(), value);
    }
    
    public void setArchiveFailureID(gw.pl.persistence.core.Key value) {
      setFieldValue(ARCHIVEFAILURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveSchemaInfo field.
     */
    public void setArchiveSchemaInfo(entity.UpgradeDatamodelInfo value) {
      __getInternalInterface().setFieldValue(ARCHIVESCHEMAINFO_PROP.get(), value);
    }
    
    public void setArchiveSchemaInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(ARCHIVESCHEMAINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveState field.
     */
    public void setArchiveState(typekey.ArchiveState value) {
      __getInternalInterface().setFieldValue(ARCHIVESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedGroup field.
     */
    public void setAssignedGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(ASSIGNEDGROUP_PROP.get(), value);
    }
    
    public void setAssignedGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDGROUP_PROP.get(), value);
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
     * Sets the value of the ClaimAggregateLimitRpts field.
     */
    public void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value) {
      __getInternalInterface().setFieldValue(CLAIMAGGREGATELIMITRPTS_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimInAssociations field.
     */
    public void setClaimInAssociations(entity.ClaimInAssociation[] value) {
      __getInternalInterface().setFieldValue(CLAIMINASSOCIATIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contacts field.
     */
    public void setContacts(entity.ContactInfo[] value) {
      __getInternalInterface().setFieldValue(CONTACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLineMatchData field.
     */
    public void setCoverageLineMatchData(entity.CoverageLineMatchDataInfo[] value) {
      __getInternalInterface().setFieldValue(COVERAGELINEMATCHDATA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLineMatchDataInfoValid field.
     */
    public void setCoverageLineMatchDataInfoValid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COVERAGELINEMATCHDATAINFOVALID_PROP.get(), value);
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
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExcludeReason field.
     */
    public void setExcludeReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXCLUDEREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExcludedFromArchive field.
     */
    public void setExcludedFromArchive(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXCLUDEDFROMARCHIVE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionState field.
     */
    public void setJurisdictionState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
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
     * Sets the value of the LossDate field.
     */
    public void setLossDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocation field.
     */
    public void setLossLocation(entity.LocationInfo value) {
      __getInternalInterface().setFieldValue(LOSSLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossLocationArray field.
     */
    public void setLossLocationArray(entity.LocationInfo[] value) {
      __getInternalInterface().setFieldValue(LOSSLOCATIONARRAY_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the NoticeDate field.
     */
    public void setNoticeDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(NOTICEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PeriodPolicies field.
     */
    public void setPeriodPolicies(entity.PeriodPolicy[] value) {
      __getInternalInterface().setFieldValue(PERIODPOLICIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the root public ID to the passed value.
     * @param value value for the root public ID.
     */
    public void setPublicIDOfRoot(java.lang.String value) {
      ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).setPublicIDOfRoot(value);
    }
    
    /**
     * Sets the value of the PurgeDate field.
     */
    public void setPurgeDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(PURGEDATE_PROP.get(), value);
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
    
    public void setRoot(entity.KeyableBean root) {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).setRoot(root);
    }
    
    /**
     * Sets the value of the RootPublicID field.
     */
    public void setRootPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ROOTPUBLICID_PROP.get(), value);
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
    
    public void severCrossGraphLinks() {
      ((com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal")).severCrossGraphLinks();
    }
    
    public void skipArchivingThisTime(java.lang.String message) {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).skipArchivingThisTime(message);
    }
    
    /**
     * Skip archival of this item. Usually called by a rule when it has determined that the item is not ready to be archived yet.
     * Unlike reportArchiveProblem(), this method returns immediately and no more rules are processed.
     * @param message The reason for skipping.
     */
    public void skipFromArchiving(java.lang.String message) {
      ((com.guidewire.pl.domain.extract.RootInfoPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.RootInfoPublicMethods")).skipFromArchiving(message);
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
    
    public void updateInfoOnArchive() {
      ((com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods")).updateInfoOnArchive();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoInternal", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("com.guidewire.cc.domain.purging.Purgeable", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.metadata.internal.version.MetadataVersionProvider", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("com.guidewire.pl.domain.extract.RootInfoPublicMethods", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.claim.PurgeClaimInfoMethods", "gw.entity.PurgeClaimInfoMethodsImpl");
    config.put("gw.cc.claim.archiving.entity.ClaimInfo", "com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimInfo.class, config);
    com.guidewire._generated.entity.ClaimInfoInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimInfo, com.guidewire._generated.entity.ClaimInfoInternal>() {
      public java.lang.Object getImplementation(entity.ClaimInfo bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimInfoInternal getInternalInterface(entity.ClaimInfo bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimInfo newEmptyInstance() {
        return new entity.ClaimInfo((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
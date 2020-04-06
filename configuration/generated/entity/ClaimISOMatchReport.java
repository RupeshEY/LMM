package entity;

/**
 * ClaimISOMatchReport
 * 
 *       Details of a match for a Claim returned by the Insurance Office Services (ISO) ClaimSearch service.
 *       If ISO ClaimSearch integration is enabled then descriptions of new or changed Claims are sent to the
 *       ISO ClaimSearch service to see if any suspiciously similar claims have been filed at other companies.
 *       If ISO ClaimSearch returns a "match report", indicating that one or more similar claims have been
 *       filed, then the report is added to the claim as a document and the most important information from
 *       each reported match is stored in an ISOMatchReport entity.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimISOMatchReport.eti;ClaimISOMatchReport.eix;ClaimISOMatchReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimISOMatchReport")
public class ClaimISOMatchReport extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.ISOMatchReport {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimISOMatchReport> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimISOMatchReport>("entity.ClaimISOMatchReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFLOSS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfLoss");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS1_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddress1");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS2_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddress2");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS3_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddress3");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSCITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddressCity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSPOSTALCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddressPostalCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSSTATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAddressState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerPhone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURINGCOMPANY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuringCompany");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATCHREASONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatchReasons");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECEIVEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReceivedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimISOMatchReportInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimISOMatchReport()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimISOMatchReport(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimISOMatchReport(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimISOMatchReportInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimISOMatchReportInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
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
   * Gets the value of the DateOfLoss field.
   * Loss date of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfLoss() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFLOSS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * The claim associated with this match report
   * @return the Claim
   */
  public entity.Claim getISOClaim() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOClaim();
  }
  
  /**
   * The exposure associated with this match report, or null if this is a claim level match
   * report
   * @return the Exposure, or null
   */
  public entity.Exposure getISOExposure() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOExposure();
  }
  
  /**
   * The ISOReportable object (Claim or Exposure) that owns this match report
   * @return the owning ISOReportable object
   */
  public entity.ISOReportable getISOReportable() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOReportable();
  }
  
  /**
   * Gets the value of the InsurerAddress1 field.
   * 1st line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress1() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS1_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerAddress2 field.
   * 2nd line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress2() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS2_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerAddress3 field.
   * 3rd line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress3() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS3_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerAddressCity field.
   * City of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressCity() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSCITY_PROP.get());
  }
  
  /**
   * Returns the address of the insurer, with all parts of the address joined
   * by commas.
   * @return the address of the insurer
   */
  public java.lang.String getInsurerAddressForDisplay() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getInsurerAddressForDisplay();
  }
  
  /**
   * Gets the value of the InsurerAddressPostalCode field.
   * Postal code of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressPostalCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSPOSTALCODE_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerAddressState field.
   * State of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressState() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerPhone field.
   * Phone number of insuring company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERPHONE_PROP.get());
  }
  
  /**
   * Gets the value of the InsuringCompany field.
   * Insuring company of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuringCompany() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURINGCOMPANY_PROP.get());
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
   * Gets the value of the MatchReasons field.
   * Reasons why claim/exposure matched at ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMatchReasons() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATCHREASONS_PROP.get());
  }
  
  /**
   * Returns the reasons for the match report, formatted suitably for display
   * to the user.
   * @return the reasons for the match report
   */
  public java.lang.String getMatchReasonsForDisplay() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getMatchReasonsForDisplay();
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Policy number of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Policy type of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYTYPE_PROP.get());
  }
  
  /**
   * Returns the policy type in the match report, formatted suitably for display
   * to the user.
   * @return the policy type in the match report
   */
  public java.lang.String getPolicyTypeForDisplay() {
    return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getPolicyTypeForDisplay();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReceivedDate field.
   * Time match report was received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
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
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
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
   * Sets the value of the DateOfLoss field.
   */
  public void setDateOfLoss(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFLOSS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddress1 field.
   */
  public void setInsurerAddress1(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS1_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddress2 field.
   */
  public void setInsurerAddress2(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS2_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddress3 field.
   */
  public void setInsurerAddress3(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS3_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddressCity field.
   */
  public void setInsurerAddressCity(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSCITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddressPostalCode field.
   */
  public void setInsurerAddressPostalCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSPOSTALCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerAddressState field.
   */
  public void setInsurerAddressState(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerPhone field.
   */
  public void setInsurerPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuringCompany field.
   */
  public void setInsuringCompany(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURINGCOMPANY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatchReasons field.
   */
  public void setMatchReasons(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MATCHREASONS_PROP.get(), value);
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
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYTYPE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimISOMatchReportInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimISOMatchReport.this.__getDelegateManager();
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
     * The related claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Claim number of matching claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
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
     * Gets the value of the DateOfLoss field.
     * Loss date of matching claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateOfLoss() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFLOSS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    /**
     * The claim associated with this match report
     * @return the Claim
     */
    public entity.Claim getISOClaim() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOClaim();
    }
    
    /**
     * The exposure associated with this match report, or null if this is a claim level match
     * report
     * @return the Exposure, or null
     */
    public entity.Exposure getISOExposure() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOExposure();
    }
    
    /**
     * The ISOReportable object (Claim or Exposure) that owns this match report
     * @return the owning ISOReportable object
     */
    public entity.ISOReportable getISOReportable() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getISOReportable();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the InsurerAddress1 field.
     * 1st line of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddress1() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS1_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerAddress2 field.
     * 2nd line of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddress2() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS2_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerAddress3 field.
     * 3rd line of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddress3() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESS3_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerAddressCity field.
     * City of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddressCity() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSCITY_PROP.get());
    }
    
    /**
     * Returns the address of the insurer, with all parts of the address joined
     * by commas.
     * @return the address of the insurer
     */
    public java.lang.String getInsurerAddressForDisplay() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getInsurerAddressForDisplay();
    }
    
    /**
     * Gets the value of the InsurerAddressPostalCode field.
     * Postal code of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddressPostalCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSPOSTALCODE_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerAddressState field.
     * State of insuring company address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAddressState() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERADDRESSSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerPhone field.
     * Phone number of insuring company.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the InsuringCompany field.
     * Insuring company of matching claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuringCompany() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURINGCOMPANY_PROP.get());
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
     * Gets the value of the MatchReasons field.
     * Reasons why claim/exposure matched at ISO.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMatchReasons() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATCHREASONS_PROP.get());
    }
    
    /**
     * Returns the reasons for the match report, formatted suitably for display
     * to the user.
     * @return the reasons for the match report
     */
    public java.lang.String getMatchReasonsForDisplay() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getMatchReasonsForDisplay();
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Policy number of matching claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Policy type of matching claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYTYPE_PROP.get());
    }
    
    /**
     * Returns the policy type in the match report, formatted suitably for display
     * to the user.
     * @return the policy type in the match report
     */
    public java.lang.String getPolicyTypeForDisplay() {
      return ((gw.cc.iso.entity.ISOMatchReport)__getDelegateManager().getImplementation("gw.cc.iso.entity.ISOMatchReport")).getPolicyTypeForDisplay();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReceivedDate field.
     * Time match report was received.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReceivedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
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
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
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
     * Sets the value of the DateOfLoss field.
     */
    public void setDateOfLoss(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFLOSS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddress1 field.
     */
    public void setInsurerAddress1(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS1_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddress2 field.
     */
    public void setInsurerAddress2(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS2_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddress3 field.
     */
    public void setInsurerAddress3(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESS3_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddressCity field.
     */
    public void setInsurerAddressCity(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSCITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddressPostalCode field.
     */
    public void setInsurerAddressPostalCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSPOSTALCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerAddressState field.
     */
    public void setInsurerAddressState(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERADDRESSSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerPhone field.
     */
    public void setInsurerPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuringCompany field.
     */
    public void setInsuringCompany(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURINGCOMPANY_PROP.get(), value);
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
     * Sets the value of the MatchReasons field.
     */
    public void setMatchReasons(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MATCHREASONS_PROP.get(), value);
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
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYTYPE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReceivedDate field.
     */
    public void setReceivedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.iso.impl.ISOMatchReportInternal", "com.guidewire.cc.domain.claim.impl.ClaimISOMatchReportImpl");
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
    config.put("gw.cc.claim.entity.ClaimISOMatchReport", "com.guidewire.cc.domain.claim.impl.ClaimISOMatchReportImpl");
    config.put("gw.cc.iso.entity.ISOMatchReport", "com.guidewire.cc.domain.claim.impl.ClaimISOMatchReportImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimISOMatchReport.class, config);
    com.guidewire._generated.entity.ClaimISOMatchReportInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimISOMatchReport, com.guidewire._generated.entity.ClaimISOMatchReportInternal>() {
      public java.lang.Object getImplementation(entity.ClaimISOMatchReport bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimISOMatchReportInternal getInternalInterface(entity.ClaimISOMatchReport bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimISOMatchReport newEmptyInstance() {
        return new entity.ClaimISOMatchReport((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
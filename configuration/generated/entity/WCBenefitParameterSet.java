package entity;

/**
 * WCBenefitParameterSet
 * Reference table tracking state-specific temporary disability minimum and maximum
 *       monetary benefits for particular date ranges.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCBenefitParameterSet.eti;WCBenefitParameterSet.eix;WCBenefitParameterSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WCBenefitParameterSet")
public class WCBenefitParameterSet extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WCBenefitParameterSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WCBenefitParameterSet>("entity.WCBenefitParameterSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "JurisdictionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PPDMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PPDMax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PPDMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PPDMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PPDMINADJTOAWW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PPDMinAdjToAWW");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PPDPERCENTOFWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PPDPercentOfWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PTDMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PTDMax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PTDMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PTDMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PTDMINADJTOAWW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PTDMinAdjToAWW");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PTDPERCENTOFWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PTDPercentOfWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RATECOMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RateComments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETROACTIVEPERIOD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetroactivePeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TPDMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TPDMax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TPDMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TPDMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TPDMINADJTOAWW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TPDMinAdjToAWW");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TPDPERCENTOFWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TPDPercentOfWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TTDMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TTDMax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TTDMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TTDMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TTDMINADJTOAWW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TTDMinAdjToAWW");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TTDPERCENTOFWAGES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TTDPercentOfWages");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> WCBENEFITFACTORS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "WCBenefitFactors");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WPNOTAPPLIEDTOPPD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WPNotAppliedToPPD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WPNOTAPPLIEDTOPTD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WPNotAppliedToPTD");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAITINGPERIODDAYS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaitingPeriodDays");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.WCBenefitParameterSetInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WCBenefitParameterSet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WCBenefitParameterSet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WCBenefitParameterSet(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.WCBenefitParameterSetInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.WCBenefitParameterSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the WCBenefitFactors array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWCBenefitFactors(entity.WCBenefitFactorDetail element) {
    __getInternalInterface().addArrayElement(WCBENEFITFACTORS_PROP.get(), element);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
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
   * Gets the value of the EndDate field.
   * PD Benefit Expiration Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
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
   * Gets the value of the PPDMax field.
   * Max State PPD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDMax() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDMAX_PROP.get());
  }
  
  /**
   * Gets the value of the PPDMin field.
   * MinState PPD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDMin() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDMIN_PROP.get());
  }
  
  /**
   * Gets the value of the PPDPercentOfWages field.
   * The percentage of wages paid for  Permanent Partial Disability  (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPPDPercentOfWages() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDPERCENTOFWAGES_PROP.get());
  }
  
  /**
   * Gets the value of the PTDMax field.
   * Max State PTD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDMax() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDMAX_PROP.get());
  }
  
  /**
   * Gets the value of the PTDMin field.
   * MinState PTD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDMin() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDMIN_PROP.get());
  }
  
  /**
   * Gets the value of the PTDPercentOfWages field.
   * The percentage of wages paid for Permanent Total Disability  (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPTDPercentOfWages() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDPERCENTOFWAGES_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RateComments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRateComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RATECOMMENTS_PROP.get());
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
   * Gets the value of the RetroactivePeriod field.
   * The number of days at which the injured worker reimbursed for the Waiting Period presuming worker is still unable to work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetroactivePeriod() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(RETROACTIVEPERIOD_PROP.get());
  }
  
  /**
   * Gets the value of the StartDate field.
   * PD Benefit Effective Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the TPDMax field.
   * Max State TPD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDMax() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDMAX_PROP.get());
  }
  
  /**
   * Gets the value of the TPDMin field.
   * MinState TPD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDMin() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDMIN_PROP.get());
  }
  
  /**
   * Gets the value of the TPDPercentOfWages field.
   * The percentage of wages paid for Temporary Partial Disability (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTPDPercentOfWages() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDPERCENTOFWAGES_PROP.get());
  }
  
  /**
   * Gets the value of the TTDMax field.
   * Max State TTD limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDMax() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDMAX_PROP.get());
  }
  
  /**
   * Gets the value of the TTDMin field.
   * Min State TTD limit 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDMin() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDMIN_PROP.get());
  }
  
  /**
   * Gets the value of the TTDPercentOfWages field.
   * The percentage of wages paid for Temporary Total Disability (e.g. 80%)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTTDPercentOfWages() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDPERCENTOFWAGES_PROP.get());
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
   * Gets the value of the WCBenefitFactors field.
   * Used to track comments, notes, special exceptions, etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCBenefitFactorDetail[] getWCBenefitFactors() {
    return (entity.WCBenefitFactorDetail[])__getInternalInterface().getFieldValue(WCBENEFITFACTORS_PROP.get());
  }
  
  /**
   * Gets the value of the WaitingPeriodDays field.
   * Number of days injured worker required to wait before benefits are paid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWaitingPeriodDays() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WAITINGPERIODDAYS_PROP.get());
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
   * Gets the value of the PPDMinAdjToAWW field.
   * For PPD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPPDMinAdjToAWW() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PPDMINADJTOAWW_PROP.get());
  }
  
  /**
   * Gets the value of the PTDMinAdjToAWW field.
   * For PTD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPTDMinAdjToAWW() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PTDMINADJTOAWW_PROP.get());
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
   * Gets the value of the TPDMinAdjToAWW field.
   * For TPD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTPDMinAdjToAWW() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TPDMINADJTOAWW_PROP.get());
  }
  
  /**
   * Gets the value of the TTDMinAdjToAWW field.
   * For TTD, if true and AWW is less than Min then set Min to AWW
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTTDMinAdjToAWW() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TTDMINADJTOAWW_PROP.get());
  }
  
  /**
   * Gets the value of the WPNotAppliedToPPD field.
   * If true, Waiting Period is not applied for PPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWPNotAppliedToPPD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WPNOTAPPLIEDTOPPD_PROP.get());
  }
  
  /**
   * Gets the value of the WPNotAppliedToPTD field.
   * If true, Waiting Period is not applied for PTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWPNotAppliedToPTD() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WPNOTAPPLIEDTOPTD_PROP.get());
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
   * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
   */
  public void removeFromWCBenefitFactors(entity.WCBenefitFactorDetail element) {
    __getInternalInterface().removeArrayElement(WCBENEFITFACTORS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWCBenefitFactors(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(WCBENEFITFACTORS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
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
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the PPDMax field.
   */
  public void setPPDMax(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PPDMAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PPDMin field.
   */
  public void setPPDMin(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PPDMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PPDMinAdjToAWW field.
   */
  public void setPPDMinAdjToAWW(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PPDMINADJTOAWW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PPDPercentOfWages field.
   */
  public void setPPDPercentOfWages(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PPDPERCENTOFWAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTDMax field.
   */
  public void setPTDMax(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PTDMAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTDMin field.
   */
  public void setPTDMin(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PTDMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTDMinAdjToAWW field.
   */
  public void setPTDMinAdjToAWW(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PTDMINADJTOAWW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PTDPercentOfWages field.
   */
  public void setPTDPercentOfWages(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PTDPERCENTOFWAGES_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RateComments field.
   */
  public void setRateComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RATECOMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetroactivePeriod field.
   */
  public void setRetroactivePeriod(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(RETROACTIVEPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TPDMax field.
   */
  public void setTPDMax(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TPDMAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TPDMin field.
   */
  public void setTPDMin(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TPDMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TPDMinAdjToAWW field.
   */
  public void setTPDMinAdjToAWW(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TPDMINADJTOAWW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TPDPercentOfWages field.
   */
  public void setTPDPercentOfWages(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TPDPERCENTOFWAGES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TTDMax field.
   */
  public void setTTDMax(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TTDMAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TTDMin field.
   */
  public void setTTDMin(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TTDMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TTDMinAdjToAWW field.
   */
  public void setTTDMinAdjToAWW(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TTDMINADJTOAWW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TTDPercentOfWages field.
   */
  public void setTTDPercentOfWages(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TTDPERCENTOFWAGES_PROP.get(), value);
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
   * Sets the value of the WCBenefitFactors field.
   */
  public void setWCBenefitFactors(entity.WCBenefitFactorDetail[] value) {
    __getInternalInterface().setFieldValue(WCBENEFITFACTORS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WPNotAppliedToPPD field.
   */
  public void setWPNotAppliedToPPD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WPNOTAPPLIEDTOPPD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WPNotAppliedToPTD field.
   */
  public void setWPNotAppliedToPTD(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WPNOTAPPLIEDTOPTD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaitingPeriodDays field.
   */
  public void setWaitingPeriodDays(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WAITINGPERIODDAYS_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WCBenefitParameterSetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WCBenefitParameterSet.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the WCBenefitFactors array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToWCBenefitFactors(entity.WCBenefitFactorDetail element) {
      __getInternalInterface().addArrayElement(WCBENEFITFACTORS_PROP.get(), element);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
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
     * Gets the value of the EndDate field.
     * PD Benefit Expiration Date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
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
     * Gets the value of the JurisdictionState field.
     * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
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
     * Gets the value of the PPDMax field.
     * Max State PPD limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPPDMax() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDMAX_PROP.get());
    }
    
    /**
     * Gets the value of the PPDMin field.
     * MinState PPD limit 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPPDMin() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDMIN_PROP.get());
    }
    
    /**
     * Gets the value of the PPDPercentOfWages field.
     * The percentage of wages paid for  Permanent Partial Disability  (e.g. 80%)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPPDPercentOfWages() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PPDPERCENTOFWAGES_PROP.get());
    }
    
    /**
     * Gets the value of the PTDMax field.
     * Max State PTD limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPTDMax() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDMAX_PROP.get());
    }
    
    /**
     * Gets the value of the PTDMin field.
     * MinState PTD limit 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPTDMin() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDMIN_PROP.get());
    }
    
    /**
     * Gets the value of the PTDPercentOfWages field.
     * The percentage of wages paid for Permanent Total Disability  (e.g. 80%)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPTDPercentOfWages() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PTDPERCENTOFWAGES_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RateComments field.
     * Additional comments.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRateComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RATECOMMENTS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the RetroactivePeriod field.
     * The number of days at which the injured worker reimbursed for the Waiting Period presuming worker is still unable to work.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getRetroactivePeriod() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(RETROACTIVEPERIOD_PROP.get());
    }
    
    /**
     * Gets the value of the StartDate field.
     * PD Benefit Effective Date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the TPDMax field.
     * Max State TPD limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTPDMax() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDMAX_PROP.get());
    }
    
    /**
     * Gets the value of the TPDMin field.
     * MinState TPD limit 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTPDMin() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDMIN_PROP.get());
    }
    
    /**
     * Gets the value of the TPDPercentOfWages field.
     * The percentage of wages paid for Temporary Partial Disability (e.g. 80%)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTPDPercentOfWages() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TPDPERCENTOFWAGES_PROP.get());
    }
    
    /**
     * Gets the value of the TTDMax field.
     * Max State TTD limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTTDMax() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDMAX_PROP.get());
    }
    
    /**
     * Gets the value of the TTDMin field.
     * Min State TTD limit 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTTDMin() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDMIN_PROP.get());
    }
    
    /**
     * Gets the value of the TTDPercentOfWages field.
     * The percentage of wages paid for Temporary Total Disability (e.g. 80%)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTTDPercentOfWages() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TTDPERCENTOFWAGES_PROP.get());
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
     * Gets the value of the WCBenefitFactors field.
     * Used to track comments, notes, special exceptions, etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.WCBenefitFactorDetail[] getWCBenefitFactors() {
      return (entity.WCBenefitFactorDetail[])__getInternalInterface().getFieldValue(WCBENEFITFACTORS_PROP.get());
    }
    
    /**
     * Gets the value of the WaitingPeriodDays field.
     * Number of days injured worker required to wait before benefits are paid.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWaitingPeriodDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WAITINGPERIODDAYS_PROP.get());
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
     * Gets the value of the PPDMinAdjToAWW field.
     * For PPD, if true and AWW is less than Min then set Min to AWW
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPPDMinAdjToAWW() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PPDMINADJTOAWW_PROP.get());
    }
    
    /**
     * Gets the value of the PTDMinAdjToAWW field.
     * For PTD, if true and AWW is less than Min then set Min to AWW
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPTDMinAdjToAWW() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PTDMINADJTOAWW_PROP.get());
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
     * Gets the value of the TPDMinAdjToAWW field.
     * For TPD, if true and AWW is less than Min then set Min to AWW
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTPDMinAdjToAWW() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TPDMINADJTOAWW_PROP.get());
    }
    
    /**
     * Gets the value of the TTDMinAdjToAWW field.
     * For TTD, if true and AWW is less than Min then set Min to AWW
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTTDMinAdjToAWW() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TTDMINADJTOAWW_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the WPNotAppliedToPPD field.
     * If true, Waiting Period is not applied for PPD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWPNotAppliedToPPD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WPNOTAPPLIEDTOPPD_PROP.get());
    }
    
    /**
     * Gets the value of the WPNotAppliedToPTD field.
     * If true, Waiting Period is not applied for PTD
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWPNotAppliedToPTD() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WPNOTAPPLIEDTOPTD_PROP.get());
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
     * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
     */
    public void removeFromWCBenefitFactors(entity.WCBenefitFactorDetail element) {
      __getInternalInterface().removeArrayElement(WCBENEFITFACTORS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the WCBenefitFactors array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromWCBenefitFactors(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(WCBENEFITFACTORS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
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
     * Sets the value of the EndDate field.
     */
    public void setEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the PPDMax field.
     */
    public void setPPDMax(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PPDMAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PPDMin field.
     */
    public void setPPDMin(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PPDMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PPDMinAdjToAWW field.
     */
    public void setPPDMinAdjToAWW(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PPDMINADJTOAWW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PPDPercentOfWages field.
     */
    public void setPPDPercentOfWages(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PPDPERCENTOFWAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTDMax field.
     */
    public void setPTDMax(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PTDMAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTDMin field.
     */
    public void setPTDMin(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PTDMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTDMinAdjToAWW field.
     */
    public void setPTDMinAdjToAWW(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PTDMINADJTOAWW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PTDPercentOfWages field.
     */
    public void setPTDPercentOfWages(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PTDPERCENTOFWAGES_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RateComments field.
     */
    public void setRateComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RATECOMMENTS_PROP.get(), value);
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
     * Sets the value of the RetroactivePeriod field.
     */
    public void setRetroactivePeriod(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(RETROACTIVEPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartDate field.
     */
    public void setStartDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TPDMax field.
     */
    public void setTPDMax(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TPDMAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TPDMin field.
     */
    public void setTPDMin(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TPDMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TPDMinAdjToAWW field.
     */
    public void setTPDMinAdjToAWW(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TPDMINADJTOAWW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TPDPercentOfWages field.
     */
    public void setTPDPercentOfWages(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TPDPERCENTOFWAGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TTDMax field.
     */
    public void setTTDMax(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TTDMAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TTDMin field.
     */
    public void setTTDMin(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TTDMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TTDMinAdjToAWW field.
     */
    public void setTTDMinAdjToAWW(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TTDMINADJTOAWW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TTDPercentOfWages field.
     */
    public void setTTDPercentOfWages(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TTDPERCENTOFWAGES_PROP.get(), value);
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
     * Sets the value of the WCBenefitFactors field.
     */
    public void setWCBenefitFactors(entity.WCBenefitFactorDetail[] value) {
      __getInternalInterface().setFieldValue(WCBENEFITFACTORS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WPNotAppliedToPPD field.
     */
    public void setWPNotAppliedToPPD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WPNOTAPPLIEDTOPPD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WPNotAppliedToPTD field.
     */
    public void setWPNotAppliedToPTD(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WPNOTAPPLIEDTOPTD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaitingPeriodDays field.
     */
    public void setWaitingPeriodDays(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WAITINGPERIODDAYS_PROP.get(), value);
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
    config.put("gw.cc.exposure.entity.WCBenefitParameterSet", "com.guidewire.cc.domain.exposure.impl.WCBenefitParameterSetImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WCBenefitParameterSet.class, config);
    com.guidewire._generated.entity.WCBenefitParameterSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WCBenefitParameterSet, com.guidewire._generated.entity.WCBenefitParameterSetInternal>() {
      public java.lang.Object getImplementation(entity.WCBenefitParameterSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WCBenefitParameterSetInternal getInternalInterface(entity.WCBenefitParameterSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WCBenefitParameterSet newEmptyInstance() {
        return new entity.WCBenefitParameterSet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
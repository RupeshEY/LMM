package entity;

/**
 * Benefits
 * 
 *       Detail information about specific benefits related to an exposure. Exposures
 *       have multiple fields linking to different Benefits entities.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Benefits.eti;Benefits.eix;Benefits.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Benefits")
public class Benefits extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Benefits> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Benefits>("entity.Benefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BENEFITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BenefitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BENEFITSBEGINDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BenefitsBeginDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BENEFITSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BenefitsEndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTPAYMENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstPaymentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MMIDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MMIDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXBURIALRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaxBurialRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXCOMPRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaxCompRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINCOMPRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinCompRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONTHLYCOMPRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MonthlyCompRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMPAYMENTWEEKS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumPaymentWeeks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAIDONTIME_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaidOnTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAYMENTFREQUENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaymentFrequency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYMENTLIMIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PaymentLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTAGECOMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentageComp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTINJRYWKLYWGS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PostInjryWklyWgs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROVIDERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ProviderType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RETROPERIOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RetroPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Services");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SETTLEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SettleDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SETTLEMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SettleMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAITPRDBEGINDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaitPrdBeginDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAITPRDENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaitPrdEndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WAITINGPERIOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "WaitingPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAITINGPERIODPAID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaitingPeriodPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEEKLYCOMPRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WeeklyCompRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEEKLYCOMPRATEINFO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WeeklyCompRateInfo");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BenefitsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Benefits()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Benefits(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Benefits(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BenefitsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BenefitsInternal __getInternalInterface() {
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
   * Gets the value of the BenefitType field.
   * Type of lost wages benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LostWagesBenefitType getBenefitType() {
    return (typekey.LostWagesBenefitType)__getInternalInterface().getFieldValue(BENEFITTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the BenefitsBeginDate field.
   * Date when benefits start.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitsBeginDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITSBEGINDATE_PROP.get());
  }
  
  /**
   * Gets the value of the BenefitsEndDate field.
   * Date when benefits end.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitsEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITSENDDATE_PROP.get());
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
   * Gets the value of the Description field.
   * Additional information about benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the FirstPaymentDate field.
   * Date 1st payment made
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFirstPaymentDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(FIRSTPAYMENTDATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * Gets the value of the MMIDate field.
   * Date when maximum medical improvement was reached (when PPD benefits can start).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMMIDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MMIDATE_PROP.get());
  }
  
  /**
   * Gets the value of the MaxBurialRate field.
   * Maximum burial rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMaxBurialRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MAXBURIALRATE_PROP.get());
  }
  
  /**
   * Gets the value of the MaxCompRate field.
   * State maximum benefit amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMaxCompRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MAXCOMPRATE_PROP.get());
  }
  
  /**
   * Gets the value of the MinCompRate field.
   * State minimum benefit amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMinCompRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MINCOMPRATE_PROP.get());
  }
  
  /**
   * Gets the value of the MonthlyCompRate field.
   * Monthly compensation rate. This calculation depends on the type of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMonthlyCompRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MONTHLYCOMPRATE_PROP.get());
  }
  
  /**
   * Gets the value of the NumPaymentWeeks field.
   * Number of weeks benefits will be paid. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumPaymentWeeks() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMPAYMENTWEEKS_PROP.get());
  }
  
  /**
   * Retrieves this benefits' associated claim, if possible.  This method assumes that the Benefits entity
   * is tied to the Claim via an Exposure (i.e., Claim -> Exposure -> Benefits) as is always true in the
   * uncustomized datamodel.  If that is not the case, then this method will return NULL.
   * @return The Claim entity that owns this Benefits entity, if they are connected via an Exposure.
   *         If not, then NULL will be returned.
   */
  public entity.Claim getOwningClaimInternal() {
    return ((gw.cc.exposure.entity.Benefits)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Benefits")).getOwningClaimInternal();
  }
  
  /**
   * Gets the value of the PaidOnTime field.
   * 1st payment - whether made on time or reason why not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaidOnTime getPaidOnTime() {
    return (typekey.PaidOnTime)__getInternalInterface().getFieldValue(PAIDONTIME_PROP.get());
  }
  
  /**
   * Gets the value of the PaymentFrequency field.
   * Payment frequency for benefits. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentFrequencyType getPaymentFrequency() {
    return (typekey.PaymentFrequencyType)__getInternalInterface().getFieldValue(PAYMENTFREQUENCY_PROP.get());
  }
  
  /**
   * Gets the value of the PaymentLimit field.
   * Payment limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPaymentLimit() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PAYMENTLIMIT_PROP.get());
  }
  
  /**
   * Gets the value of the PercentageComp field.
   * Percentage compensability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPercentageComp() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PERCENTAGECOMP_PROP.get());
  }
  
  /**
   * Gets the value of the PostInjryWklyWgs field.
   * Weekly wages post-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPostInjryWklyWgs() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(POSTINJRYWKLYWGS_PROP.get());
  }
  
  /**
   * Gets the value of the ProviderType field.
   * Type of services provider.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProviderType getProviderType() {
    return (typekey.ProviderType)__getInternalInterface().getFieldValue(PROVIDERTYPE_PROP.get());
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
   * Gets the value of the RetroPeriod field.
   * Retroactive period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RetroPeriodType getRetroPeriod() {
    return (typekey.RetroPeriodType)__getInternalInterface().getFieldValue(RETROPERIOD_PROP.get());
  }
  
  /**
   * Gets the value of the Services field.
   * Services required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServices() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICES_PROP.get());
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
   * Gets the value of the WaitPrdBeginDate field.
   * Date when the waiting period begins.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWaitPrdBeginDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WAITPRDBEGINDATE_PROP.get());
  }
  
  /**
   * Gets the value of the WaitPrdEndDate field.
   * Date when the waiting period ends.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWaitPrdEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(WAITPRDENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the WaitingPeriod field.
   * Waiting period before benefits begin. This differs by state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WaitingPeriodType getWaitingPeriod() {
    return (typekey.WaitingPeriodType)__getInternalInterface().getFieldValue(WAITINGPERIOD_PROP.get());
  }
  
  /**
   * Gets the value of the WeeklyCompRate field.
   * Weekly compensation rate. This calculation depends on type of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWeeklyCompRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WEEKLYCOMPRATE_PROP.get());
  }
  
  /**
   * Gets the value of the WeeklyCompRateInfo field.
   * Rating Information
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWeeklyCompRateInfo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WEEKLYCOMPRATEINFO_PROP.get());
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
   * Gets the value of the WaitingPeriodPaid field.
   * Whether the Employer has paid the waiting period
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaitingPeriodPaid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAITINGPERIODPAID_PROP.get());
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
   * Sets the value of the BenefitType field.
   */
  public void setBenefitType(typekey.LostWagesBenefitType value) {
    __getInternalInterface().setFieldValue(BENEFITTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BenefitsBeginDate field.
   */
  public void setBenefitsBeginDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(BENEFITSBEGINDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BenefitsEndDate field.
   */
  public void setBenefitsEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(BENEFITSENDDATE_PROP.get(), value);
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
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstPaymentDate field.
   */
  public void setFirstPaymentDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(FIRSTPAYMENTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MMIDate field.
   */
  public void setMMIDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MMIDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaxBurialRate field.
   */
  public void setMaxBurialRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(MAXBURIALRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaxCompRate field.
   */
  public void setMaxCompRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(MAXCOMPRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinCompRate field.
   */
  public void setMinCompRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(MINCOMPRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MonthlyCompRate field.
   */
  public void setMonthlyCompRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(MONTHLYCOMPRATE_PROP.get(), value);
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
   * Sets the value of the NumPaymentWeeks field.
   */
  public void setNumPaymentWeeks(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMPAYMENTWEEKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidOnTime field.
   */
  public void setPaidOnTime(typekey.PaidOnTime value) {
    __getInternalInterface().setFieldValue(PAIDONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentFrequency field.
   */
  public void setPaymentFrequency(typekey.PaymentFrequencyType value) {
    __getInternalInterface().setFieldValue(PAYMENTFREQUENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentLimit field.
   */
  public void setPaymentLimit(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(PAYMENTLIMIT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PercentageComp field.
   */
  public void setPercentageComp(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PERCENTAGECOMP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PostInjryWklyWgs field.
   */
  public void setPostInjryWklyWgs(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(POSTINJRYWKLYWGS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProviderType field.
   */
  public void setProviderType(typekey.ProviderType value) {
    __getInternalInterface().setFieldValue(PROVIDERTYPE_PROP.get(), value);
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
   * Sets the value of the RetroPeriod field.
   */
  public void setRetroPeriod(typekey.RetroPeriodType value) {
    __getInternalInterface().setFieldValue(RETROPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Services field.
   */
  public void setServices(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVICES_PROP.get(), value);
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
   * Sets the value of the WaitPrdBeginDate field.
   */
  public void setWaitPrdBeginDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(WAITPRDBEGINDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaitPrdEndDate field.
   */
  public void setWaitPrdEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(WAITPRDENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaitingPeriod field.
   */
  public void setWaitingPeriod(typekey.WaitingPeriodType value) {
    __getInternalInterface().setFieldValue(WAITINGPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaitingPeriodPaid field.
   */
  public void setWaitingPeriodPaid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WAITINGPERIODPAID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WeeklyCompRate field.
   */
  public void setWeeklyCompRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(WEEKLYCOMPRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WeeklyCompRateInfo field.
   */
  public void setWeeklyCompRateInfo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WEEKLYCOMPRATEINFO_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BenefitsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Benefits.this.__getDelegateManager();
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
     * Gets the value of the BenefitType field.
     * Type of lost wages benefit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LostWagesBenefitType getBenefitType() {
      return (typekey.LostWagesBenefitType)__getInternalInterface().getFieldValue(BENEFITTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the BenefitsBeginDate field.
     * Date when benefits start.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBenefitsBeginDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITSBEGINDATE_PROP.get());
    }
    
    /**
     * Gets the value of the BenefitsEndDate field.
     * Date when benefits end.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBenefitsEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BENEFITSENDDATE_PROP.get());
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
     * Gets the value of the Description field.
     * Additional information about benefits.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the FirstPaymentDate field.
     * Date 1st payment made
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getFirstPaymentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(FIRSTPAYMENTDATE_PROP.get());
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the MMIDate field.
     * Date when maximum medical improvement was reached (when PPD benefits can start).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMMIDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MMIDATE_PROP.get());
    }
    
    /**
     * Gets the value of the MaxBurialRate field.
     * Maximum burial rate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getMaxBurialRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MAXBURIALRATE_PROP.get());
    }
    
    /**
     * Gets the value of the MaxCompRate field.
     * State maximum benefit amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getMaxCompRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MAXCOMPRATE_PROP.get());
    }
    
    /**
     * Gets the value of the MinCompRate field.
     * State minimum benefit amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getMinCompRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MINCOMPRATE_PROP.get());
    }
    
    /**
     * Gets the value of the MonthlyCompRate field.
     * Monthly compensation rate. This calculation depends on the type of benefit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getMonthlyCompRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MONTHLYCOMPRATE_PROP.get());
    }
    
    /**
     * Gets the value of the NumPaymentWeeks field.
     * Number of weeks benefits will be paid. This differs by state.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumPaymentWeeks() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMPAYMENTWEEKS_PROP.get());
    }
    
    /**
     * Retrieves this benefits' associated claim, if possible.  This method assumes that the Benefits entity
     * is tied to the Claim via an Exposure (i.e., Claim -> Exposure -> Benefits) as is always true in the
     * uncustomized datamodel.  If that is not the case, then this method will return NULL.
     * @return The Claim entity that owns this Benefits entity, if they are connected via an Exposure.
     *         If not, then NULL will be returned.
     */
    public entity.Claim getOwningClaimInternal() {
      return ((gw.cc.exposure.entity.Benefits)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Benefits")).getOwningClaimInternal();
    }
    
    /**
     * Gets the value of the PaidOnTime field.
     * 1st payment - whether made on time or reason why not
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaidOnTime getPaidOnTime() {
      return (typekey.PaidOnTime)__getInternalInterface().getFieldValue(PAIDONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the PaymentFrequency field.
     * Payment frequency for benefits. This differs by state.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaymentFrequencyType getPaymentFrequency() {
      return (typekey.PaymentFrequencyType)__getInternalInterface().getFieldValue(PAYMENTFREQUENCY_PROP.get());
    }
    
    /**
     * Gets the value of the PaymentLimit field.
     * Payment limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getPaymentLimit() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PAYMENTLIMIT_PROP.get());
    }
    
    /**
     * Gets the value of the PercentageComp field.
     * Percentage compensability.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPercentageComp() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PERCENTAGECOMP_PROP.get());
    }
    
    /**
     * Gets the value of the PostInjryWklyWgs field.
     * Weekly wages post-injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getPostInjryWklyWgs() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(POSTINJRYWKLYWGS_PROP.get());
    }
    
    /**
     * Gets the value of the ProviderType field.
     * Type of services provider.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ProviderType getProviderType() {
      return (typekey.ProviderType)__getInternalInterface().getFieldValue(PROVIDERTYPE_PROP.get());
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
     * Gets the value of the RetroPeriod field.
     * Retroactive period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RetroPeriodType getRetroPeriod() {
      return (typekey.RetroPeriodType)__getInternalInterface().getFieldValue(RETROPERIOD_PROP.get());
    }
    
    /**
     * Gets the value of the Services field.
     * Services required.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServices() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICES_PROP.get());
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
     * Gets the value of the WaitPrdBeginDate field.
     * Date when the waiting period begins.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWaitPrdBeginDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WAITPRDBEGINDATE_PROP.get());
    }
    
    /**
     * Gets the value of the WaitPrdEndDate field.
     * Date when the waiting period ends.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getWaitPrdEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(WAITPRDENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the WaitingPeriod field.
     * Waiting period before benefits begin. This differs by state.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WaitingPeriodType getWaitingPeriod() {
      return (typekey.WaitingPeriodType)__getInternalInterface().getFieldValue(WAITINGPERIOD_PROP.get());
    }
    
    /**
     * Gets the value of the WeeklyCompRate field.
     * Weekly compensation rate. This calculation depends on type of benefit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getWeeklyCompRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WEEKLYCOMPRATE_PROP.get());
    }
    
    /**
     * Gets the value of the WeeklyCompRateInfo field.
     * Rating Information
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWeeklyCompRateInfo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WEEKLYCOMPRATEINFO_PROP.get());
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
    
    /**
     * Gets the value of the WaitingPeriodPaid field.
     * Whether the Employer has paid the waiting period
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWaitingPeriodPaid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAITINGPERIODPAID_PROP.get());
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
     * Sets the value of the BenefitType field.
     */
    public void setBenefitType(typekey.LostWagesBenefitType value) {
      __getInternalInterface().setFieldValue(BENEFITTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BenefitsBeginDate field.
     */
    public void setBenefitsBeginDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(BENEFITSBEGINDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BenefitsEndDate field.
     */
    public void setBenefitsEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(BENEFITSENDDATE_PROP.get(), value);
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
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstPaymentDate field.
     */
    public void setFirstPaymentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(FIRSTPAYMENTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
     * Sets the value of the MMIDate field.
     */
    public void setMMIDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MMIDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MaxBurialRate field.
     */
    public void setMaxBurialRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(MAXBURIALRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MaxCompRate field.
     */
    public void setMaxCompRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(MAXCOMPRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinCompRate field.
     */
    public void setMinCompRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(MINCOMPRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MonthlyCompRate field.
     */
    public void setMonthlyCompRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(MONTHLYCOMPRATE_PROP.get(), value);
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
     * Sets the value of the NumPaymentWeeks field.
     */
    public void setNumPaymentWeeks(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMPAYMENTWEEKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidOnTime field.
     */
    public void setPaidOnTime(typekey.PaidOnTime value) {
      __getInternalInterface().setFieldValue(PAIDONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentFrequency field.
     */
    public void setPaymentFrequency(typekey.PaymentFrequencyType value) {
      __getInternalInterface().setFieldValue(PAYMENTFREQUENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentLimit field.
     */
    public void setPaymentLimit(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(PAYMENTLIMIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PercentageComp field.
     */
    public void setPercentageComp(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PERCENTAGECOMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PostInjryWklyWgs field.
     */
    public void setPostInjryWklyWgs(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(POSTINJRYWKLYWGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProviderType field.
     */
    public void setProviderType(typekey.ProviderType value) {
      __getInternalInterface().setFieldValue(PROVIDERTYPE_PROP.get(), value);
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
     * Sets the value of the RetroPeriod field.
     */
    public void setRetroPeriod(typekey.RetroPeriodType value) {
      __getInternalInterface().setFieldValue(RETROPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Services field.
     */
    public void setServices(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVICES_PROP.get(), value);
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
     * Sets the value of the WaitPrdBeginDate field.
     */
    public void setWaitPrdBeginDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(WAITPRDBEGINDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaitPrdEndDate field.
     */
    public void setWaitPrdEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(WAITPRDENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaitingPeriod field.
     */
    public void setWaitingPeriod(typekey.WaitingPeriodType value) {
      __getInternalInterface().setFieldValue(WAITINGPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaitingPeriodPaid field.
     */
    public void setWaitingPeriodPaid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WAITINGPERIODPAID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WeeklyCompRate field.
     */
    public void setWeeklyCompRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(WEEKLYCOMPRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WeeklyCompRateInfo field.
     */
    public void setWeeklyCompRateInfo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WEEKLYCOMPRATEINFO_PROP.get(), value);
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
    config.put("gw.cc.exposure.entity.Benefits", "com.guidewire.cc.domain.exposure.impl.BenefitsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Benefits.class, config);
    com.guidewire._generated.entity.BenefitsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Benefits, com.guidewire._generated.entity.BenefitsInternal>() {
      public java.lang.Object getImplementation(entity.Benefits bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BenefitsInternal getInternalInterface(entity.Benefits bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Benefits newEmptyInstance() {
        return new entity.Benefits((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
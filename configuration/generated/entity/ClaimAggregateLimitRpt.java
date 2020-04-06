package entity;

/**
 * ClaimAggregateLimitRpt
 * Represents denormalized aggregate limit used calculations (i.e., the amount of the limit that has been used to date) for a
 *     claim as related to a given aggregate limit and optionally, for a coverageline.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAggregateLimitRpt.eti;ClaimAggregateLimitRpt.eix;ClaimAggregateLimitRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimAggregateLimitRpt")
public class ClaimAggregateLimitRpt extends com.guidewire.pl.persistence.code.BeanBase implements entity.Editable, entity.AggregateLimitRptDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimAggregateLimitRpt> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimAggregateLimitRpt>("entity.ClaimAggregateLimitRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGGLIMITCALCCRITERIA_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AggLimitCalcCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> COVERAGELINE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CoverageLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERODINGPAYMENTTOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErodingPaymentTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREERODINGPAYMENTTOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FutureErodingPaymentTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTURENONERODINGPAYMENTTOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FutureNonErodingPaymentTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIMITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LimitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LIMITUSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LimitUsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NONERODINGPAYMENTTOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NonErodingPaymentTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYPERIOD_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PolicyPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECOVERYRESERVETOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RecoveryReserveTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECOVERYTOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RecoveryTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESERVETOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReserveTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Valid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALUETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValueType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimAggregateLimitRptInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimAggregateLimitRpt()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimAggregateLimitRpt(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimAggregateLimitRpt(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClaimAggregateLimitRptInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClaimAggregateLimitRptInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
    return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Returns the currency specified by the policy period's claim currency property. All claims in a policy period
   * are guaranteed to have the same currency.
   * @return a currency, possibly null
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimitRptDelegate)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimitRptDelegate")).getClaimCurrency();
  }
  
  /**
   * Gets the value of the ClaimInfo field.
   * ClaimInfo with which the aggregate limit is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo() {
    return (entity.ClaimInfo)__getInternalInterface().getFieldValue(CLAIMINFO_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLine field.
   * The associated coverage line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine getCoverageLine() {
    return (entity.CoverageLine)__getInternalInterface().getFieldValue(COVERAGELINE_PROP.get());
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
   * Gets the value of the ErodingPaymentTotal field.
   * The total amount of eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getErodingPaymentTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(ERODINGPAYMENTTOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the FutureErodingPaymentTotal field.
   * The total amount of future eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFutureErodingPaymentTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREERODINGPAYMENTTOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the FutureNonErodingPaymentTotal field.
   * The total amount of future non-eroding payment transactions transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFutureNonErodingPaymentTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTURENONERODINGPAYMENTTOTAL_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type: by loss date or by reported date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType() {
    return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the LimitUsed field.
   * The amount of the limit that has been used that is tracked within ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitUsed() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LIMITUSED_PROP.get());
  }
  
  /**
   * Gets the value of the NonErodingPaymentTotal field.
   * The total amount of non-eroding payment transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getNonErodingPaymentTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(NONERODINGPAYMENTTOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which the aggregate limit is associated. This property exists because CoverageLine may be null; when CoverageLine is not null, it must equal CoverageLine.PolicyPeriodID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getPolicyPeriod() {
    return (entity.PolicyPeriod)__getInternalInterface().getFieldValue(POLICYPERIOD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RecoveryReserveTotal field.
   * The total amount of recovery reserve transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRecoveryReserveTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RECOVERYRESERVETOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the RecoveryTotal field.
   * The total amount of recovery transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRecoveryTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RECOVERYTOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the ReserveTotal field.
   * The total amount of reserve transactions from this claim that apply to the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReserveTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVETOTAL_PROP.get());
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
   * Gets the value of the ValueType field.
   * Aggregate type: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateType getValueType() {
    return (typekey.AggregateType)__getInternalInterface().getFieldValue(VALUETYPE_PROP.get());
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
   * Gets the value of the Valid field.
   * Indicates if the limit used is up-to-date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VALID_PROP.get());
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
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value) {
    __getInternalInterface().setFieldValue(AGGLIMITCALCCRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value) {
    __getInternalInterface().setFieldValue(CLAIMINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLine field.
   */
  public void setCoverageLine(entity.CoverageLine value) {
    __getInternalInterface().setFieldValue(COVERAGELINE_PROP.get(), value);
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
   * Sets the value of the ErodingPaymentTotal field.
   */
  private void setErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(ERODINGPAYMENTTOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FutureErodingPaymentTotal field.
   */
  private void setFutureErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FUTUREERODINGPAYMENTTOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FutureNonErodingPaymentTotal field.
   */
  private void setFutureNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FUTURENONERODINGPAYMENTTOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value) {
    __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitUsed field.
   */
  private void setLimitUsed(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(LIMITUSED_PROP.get(), value);
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
   * Sets the value of the NonErodingPaymentTotal field.
   */
  private void setNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(NONERODINGPAYMENTTOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyPeriod field.
   */
  public void setPolicyPeriod(entity.PolicyPeriod value) {
    __getInternalInterface().setFieldValue(POLICYPERIOD_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecoveryReserveTotal field.
   */
  private void setRecoveryReserveTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RECOVERYRESERVETOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecoveryTotal field.
   */
  private void setRecoveryTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RECOVERYTOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReserveTotal field.
   */
  private void setReserveTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RESERVETOTAL_PROP.get(), value);
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
   * Sets the value of the Valid field.
   */
  public void setValid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VALID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(typekey.AggregateType value) {
    __getInternalInterface().setFieldValue(VALUETYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimAggregateLimitRptInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimAggregateLimitRpt.this.__getDelegateManager();
    }
    
    public gw.api.financials.CurrencyAmount addClaimTransactions(gw.api.financials.CurrencyAmount used, entity.Claim claim) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal")).addClaimTransactions(used, claim);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public gw.api.financials.CurrencyAmount calculateLimitUsed() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).calculateLimitUsed();
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
     * Gets the value of the AggLimitCalcCriteria field.
     * Exclusions for limit used calculations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
      return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
    }
    
    public java.util.Set<entity.AggregateLimit> getAggregateLimits() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal")).getAggregateLimits();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    public typekey.Currency getClaimCurrency() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).getClaimCurrency();
    }
    
    /**
     * Gets the value of the ClaimInfo field.
     * ClaimInfo with which the aggregate limit is associated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInfo getClaimInfo() {
      return (entity.ClaimInfo)__getInternalInterface().getFieldValue(CLAIMINFO_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMINFO_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageLine field.
     * The associated coverage line.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CoverageLine getCoverageLine() {
      return (entity.CoverageLine)__getInternalInterface().getFieldValue(COVERAGELINE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCoverageLineID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(COVERAGELINE_PROP.get());
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
     * Gets the value of the ErodingPaymentTotal field.
     * The total amount of eroding payment transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getErodingPaymentTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(ERODINGPAYMENTTOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the FutureErodingPaymentTotal field.
     * The total amount of future eroding payment transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFutureErodingPaymentTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREERODINGPAYMENTTOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the FutureNonErodingPaymentTotal field.
     * The total amount of future non-eroding payment transactions transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFutureNonErodingPaymentTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTURENONERODINGPAYMENTTOTAL_PROP.get());
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
     * Gets the value of the LimitType field.
     * Aggregate limit type: by loss date or by reported date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggregateLimitType getLimitType() {
      return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the LimitUsed field.
     * The amount of the limit that has been used that is tracked within ClaimCenter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLimitUsed() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LIMITUSED_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getLimitUsedValue() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal")).getLimitUsedValue();
    }
    
    public entity.AggregateLimitRpt getMatchingAggregateLimitRpt() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).getMatchingAggregateLimitRpt();
    }
    
    /**
     * Gets the value of the NonErodingPaymentTotal field.
     * The total amount of non-eroding payment transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getNonErodingPaymentTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(NONERODINGPAYMENTTOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyPeriod field.
     * PolicyPeriod with which the aggregate limit is associated. This property exists because CoverageLine may be null; when CoverageLine is not null, it must equal CoverageLine.PolicyPeriodID
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyPeriod getPolicyPeriod() {
      return (entity.PolicyPeriod)__getInternalInterface().getFieldValue(POLICYPERIOD_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyPeriodID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICYPERIOD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecoveryReserveTotal field.
     * The total amount of recovery reserve transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getRecoveryReserveTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RECOVERYRESERVETOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryTotal field.
     * The total amount of recovery transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getRecoveryTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RECOVERYTOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the ReserveTotal field.
     * The total amount of reserve transactions from this claim that apply to the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReserveTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVETOTAL_PROP.get());
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
     * Gets the value of the ValueType field.
     * Aggregate type: limit or deductible.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggregateType getValueType() {
      return (typekey.AggregateType)__getInternalInterface().getFieldValue(VALUETYPE_PROP.get());
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
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the Valid field.
     * Indicates if the limit used is up-to-date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VALID_PROP.get());
    }
    
    public boolean matches(entity.AggregateLimitRptDelegate other) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal")).matches(other);
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
     * Sets the value of the AggLimitCalcCriteria field.
     */
    public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value) {
      __getInternalInterface().setFieldValue(AGGLIMITCALCCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimInfo field.
     */
    public void setClaimInfo(entity.ClaimInfo value) {
      __getInternalInterface().setFieldValue(CLAIMINFO_PROP.get(), value);
    }
    
    public void setClaimInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLine field.
     */
    public void setCoverageLine(entity.CoverageLine value) {
      __getInternalInterface().setFieldValue(COVERAGELINE_PROP.get(), value);
    }
    
    public void setCoverageLineID(gw.pl.persistence.core.Key value) {
      setFieldValue(COVERAGELINE_PROP.get(), value);
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
     * Sets the value of the ErodingPaymentTotal field.
     */
    public void setErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(ERODINGPAYMENTTOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FutureErodingPaymentTotal field.
     */
    public void setFutureErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FUTUREERODINGPAYMENTTOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FutureNonErodingPaymentTotal field.
     */
    public void setFutureNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FUTURENONERODINGPAYMENTTOTAL_PROP.get(), value);
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
     * Sets the value of the LimitType field.
     */
    public void setLimitType(typekey.AggregateLimitType value) {
      __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LimitUsed field.
     */
    public void setLimitUsed(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LIMITUSED_PROP.get(), value);
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
     * Sets the value of the NonErodingPaymentTotal field.
     */
    public void setNonErodingPaymentTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(NONERODINGPAYMENTTOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyPeriod field.
     */
    public void setPolicyPeriod(entity.PolicyPeriod value) {
      __getInternalInterface().setFieldValue(POLICYPERIOD_PROP.get(), value);
    }
    
    public void setPolicyPeriodID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICYPERIOD_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecoveryReserveTotal field.
     */
    public void setRecoveryReserveTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RECOVERYRESERVETOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryTotal field.
     */
    public void setRecoveryTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RECOVERYTOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReserveTotal field.
     */
    public void setReserveTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RESERVETOTAL_PROP.get(), value);
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
     * Sets the value of the Valid field.
     */
    public void setValid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VALID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValueType field.
     */
    public void setValueType(typekey.AggregateType value) {
      __getInternalInterface().setFieldValue(VALUETYPE_PROP.get(), value);
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
    
    public void updateComponentAmountsViaAccumulation(entity.Transaction transaction) {
      ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).updateComponentAmountsViaAccumulation(transaction);
    }
    
    public void updateComponentAmountsViaDeltas(com.guidewire.cc.domain.aggregatelimit.impl.LimitHandler handler, entity.Transaction transaction) {
      ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).updateComponentAmountsViaDeltas(handler, transaction);
    }
    
    public void zeroAllAmounts() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal")).zeroAllAmounts();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitRptDelegateInternal", "com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptImpl");
    config.put("com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptInternal", "com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.aggregatelimit.entity.AggregateLimitRptDelegate", "com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptImpl");
    config.put("gw.cc.aggregatelimit.entity.ClaimAggregateLimitRpt", "com.guidewire.cc.domain.aggregatelimit.impl.ClaimAggregateLimitRptImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimAggregateLimitRpt.class, config);
    com.guidewire._generated.entity.ClaimAggregateLimitRptInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimAggregateLimitRpt, com.guidewire._generated.entity.ClaimAggregateLimitRptInternal>() {
      public java.lang.Object getImplementation(entity.ClaimAggregateLimitRpt bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimAggregateLimitRptInternal getInternalInterface(entity.ClaimAggregateLimitRpt bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimAggregateLimitRpt newEmptyInstance() {
        return new entity.ClaimAggregateLimitRpt((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
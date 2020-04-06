package entity;

/**
 * AggregateLimit
 * 
 *     Defines an annual or lifetime limit on an insurer's liability. This entity's LimitAmount value defines
 *     the maximum amount that an insurer is required to pay for a specific period. Each CoverageLine, which represents either a
 *     CoverageType or a specific Coverage, has an associated AggregateLimit and they are linked together through the CoverageLineLimit
 *     entity. The AggregateLimit.CoverageLines array contains the lines that reference a particular AggregateLimit. Each AggregateLimit
 *     is associated with a single policy period and zero or more coverage lines. If associated with multiple coverage lines, all the 
 *     lines must be unique.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AggregateLimit.eti;AggregateLimit.eix;AggregateLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "AggregateLimit")
public class AggregateLimit extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AggregateLimit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AggregateLimit>("entity.AggregateLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGGLIMITCALCCRITERIA_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AggLimitCalcCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> COVERAGELINES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CoverageLines");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LIMITAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LimitAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIMITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LimitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYPERIOD_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PolicyPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Valid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALUETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValueType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.AggregateLimitInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public AggregateLimit()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public AggregateLimit(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected AggregateLimit(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.AggregateLimitInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.AggregateLimitInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLines(entity.CoverageLineLimit element) {
    __getInternalInterface().addArrayElement(COVERAGELINES_PROP.get(), element);
  }
  
  /**
   * Checks the aggregate limit configuration in aggregatelimitused-config.xml and determines whether
   * this aggregate limit applies to the given transaction. This method only checks the configuration,
   * so even if it returns true it is possible that the limit won't apply to the transaction for other
   * reasons (e.g. if the limit's coverage lines exclude the transaction).
   * <p>
   * This method is typically only used when implementing the IAggregateLimitTransactionPlugin
   * </p>
   * @param transaction a non null transaction
   * @return true if the aggregate limit configuration specifies that this aggregate limit should apply
   *   to the given transaction
   */
  public boolean configurationAppliesTo(entity.Transaction transaction) {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).configurationAppliesTo(transaction);
  }
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Contribution critiera for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
    return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
  }
  
  /**
   * Returns the list of ClaimAggregateLimitRpts that pertain to this limit.
   */
  public entity.ClaimAggregateLimitRpt[] getApplicableClaimAggregateLimitRpts() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getApplicableClaimAggregateLimitRpts();
  }
  
  /**
   * Returns the list of non-zero ClaimAggregateLimitRpts that pertain to this limit.
   */
  public entity.ClaimAggregateLimitRpt[] getApplicableNonZeroClaimAggregateLimitRpts() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getApplicableNonZeroClaimAggregateLimitRpts();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Currency of any Claim in the PolicyPeriod. They should all have same currency,
   * if an AggLimit exists.  If the AggLimit's PolicyPeriod is null (i.e. the limit
   * is new or being edited), the default system currency is returned.
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getClaimCurrency();
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments about the aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLines field.
   * Coverage lines that reference this aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineLimit[] getCoverageLines() {
    return (entity.CoverageLineLimit[])__getInternalInterface().getFieldValue(COVERAGELINES_PROP.get());
  }
  
  /**
   * Returns a concatenation of the names of the coverage lines on this limit
   * separated by commas and with the format:
   * CoverageLine.CoverageSubtype #CoverageLine.ExposureUnitNumber.
   * @return A String containing the concatenated coverage lines information.
   */
  public java.lang.String getCoverageNames() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getCoverageNames();
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
   * This is determined by the Policy Type of the Aggregate Limit's PolicyPeriod, for Policy-Level limits
   * @return Localized description of the calculation type for this Aggregate Limit,
   * null for Account level limits because there is no guaranteed single policy type involved.
   */
  public java.lang.String getFinancialsCalculationDescription() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getFinancialsCalculationDescription();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LimitAmount field.
   * The amount of the aggregate limit, in the Claim Currency of Claims in the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LIMITAMOUNT_PROP.get());
  }
  
  /**
   * Return the remaining unused amount of this aggregate limit.  Specifically,
   * this amount is equal to the limit amount minus the amount used.
   * If the difference is negative, then zero is returned.
   */
  public gw.api.financials.CurrencyAmount getLimitRemaining() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getLimitRemaining();
  }
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type: none, by loss date, or by reported date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType() {
    return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
  }
  
  /**
   * Returns the amount used (a.k.a. realized) of this aggregate limit, in ClaimCurrency.
   */
  public gw.api.financials.CurrencyAmount getLimitUsed() {
    return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getLimitUsed();
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
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which the aggregate limit is associated.
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
   * Gets the value of the Valid field.
   * Indicates if the AggregateLimitRpts related to this aggregatelimit are up-to-date.
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
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLines(entity.CoverageLineLimit element) {
    __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), elementID);
  }
  
  /**
   * Removes all the coverage lines on this Aggregate Limit and sets the
   * PolicyPeriod and LimitType to NULL.
   * @deprecated (Since 8.0.0) Use {@link gw.api.admin.AggregateLimitHelper#resetCoveragesAndAssign(entity.AggregateLimit, typekey.PolicyPeriodType, entity.Policy)}
   * and then {@link gw.api.admin.AggregateLimitHelper#invalidateListViewCache(com.guidewire.pl.web.navigation.Location, String)} instead.
   * See AggregateLimitDetailDV for the sole example of the use of this alternative.
   */
  @java.lang.Deprecated
  public void resetCoverageLines() {
    ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).resetCoverageLines();
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
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLines field.
   */
  public void setCoverageLines(entity.CoverageLineLimit[] value) {
    __getInternalInterface().setFieldValue(COVERAGELINES_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitAmount field.
   */
  public void setLimitAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(LIMITAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value) {
    __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.AggregateLimitInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.AggregateLimit.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCoverageLines(entity.CoverageLineLimit element) {
      __getInternalInterface().addArrayElement(COVERAGELINES_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public entity.AggregateLimitRpt buildAggLimitRpt(gw.pl.persistence.core.Key coverageLineId, gw.api.financials.CurrencyAmount initialLimitUsed) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).buildAggLimitRpt(coverageLineId, initialLimitUsed);
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
    
    /**
     * Checks the aggregate limit configuration in aggregatelimitused-config.xml and determines whether
     * this aggregate limit applies to the given transaction. This method only checks the configuration,
     * so even if it returns true it is possible that the limit won't apply to the transaction for other
     * reasons (e.g. if the limit's coverage lines exclude the transaction).
     * <p>
     * This method is typically only used when implementing the IAggregateLimitTransactionPlugin
     * </p>
     * @param transaction a non null transaction
     * @return true if the aggregate limit configuration specifies that this aggregate limit should apply
     *   to the given transaction
     */
    public boolean configurationAppliesTo(entity.Transaction transaction) {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).configurationAppliesTo(transaction);
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
     * Contribution critiera for limit used calculations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
      return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
    }
    
    /**
     * Returns the list of ClaimAggregateLimitRpts that pertain to this limit.
     */
    public entity.ClaimAggregateLimitRpt[] getApplicableClaimAggregateLimitRpts() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getApplicableClaimAggregateLimitRpts();
    }
    
    public entity.AggregateLimitRpt[] getApplicableLimitRpts() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).getApplicableLimitRpts();
    }
    
    /**
     * Returns the list of non-zero ClaimAggregateLimitRpts that pertain to this limit.
     */
    public entity.ClaimAggregateLimitRpt[] getApplicableNonZeroClaimAggregateLimitRpts() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getApplicableNonZeroClaimAggregateLimitRpts();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Currency of any Claim in the PolicyPeriod. They should all have same currency,
     * if an AggLimit exists.  If the AggLimit's PolicyPeriod is null (i.e. the limit
     * is new or being edited), the default system currency is returned.
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getClaimCurrency();
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments about the aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageLines field.
     * Coverage lines that reference this aggregate limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CoverageLineLimit[] getCoverageLines() {
      return (entity.CoverageLineLimit[])__getInternalInterface().getFieldValue(COVERAGELINES_PROP.get());
    }
    
    /**
     * Returns a concatenation of the names of the coverage lines on this limit
     * separated by commas and with the format:
     * CoverageLine.CoverageSubtype #CoverageLine.ExposureUnitNumber.
     * @return A String containing the concatenated coverage lines information.
     */
    public java.lang.String getCoverageNames() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getCoverageNames();
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
     * This is determined by the Policy Type of the Aggregate Limit's PolicyPeriod, for Policy-Level limits
     * @return Localized description of the calculation type for this Aggregate Limit,
     * null for Account level limits because there is no guaranteed single policy type involved.
     */
    public java.lang.String getFinancialsCalculationDescription() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getFinancialsCalculationDescription();
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
     * Gets the value of the LimitAmount field.
     * The amount of the aggregate limit, in the Claim Currency of Claims in the PolicyPeriod.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLimitAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LIMITAMOUNT_PROP.get());
    }
    
    /**
     * Return the remaining unused amount of this aggregate limit.  Specifically,
     * this amount is equal to the limit amount minus the amount used.
     * If the difference is negative, then zero is returned.
     */
    public gw.api.financials.CurrencyAmount getLimitRemaining() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getLimitRemaining();
    }
    
    /**
     * Gets the value of the LimitType field.
     * Aggregate limit type: none, by loss date, or by reported date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggregateLimitType getLimitType() {
      return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
    }
    
    /**
     * Returns the amount used (a.k.a. realized) of this aggregate limit, in ClaimCurrency.
     */
    public gw.api.financials.CurrencyAmount getLimitUsed() {
      return ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).getLimitUsed();
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
     * Gets the value of the PolicyPeriod field.
     * PolicyPeriod with which the aggregate limit is associated.
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
    
    public boolean isApplicableLimitRpt(entity.AggregateLimitRptDelegate limitRpt) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isApplicableLimitRpt(limitRpt);
    }
    
    public boolean isExceedsLimit(java.math.BigDecimal adjustedUsed) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isExceedsLimit(adjustedUsed);
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
    
    public boolean isPolicyLevelLimit() {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isPolicyLevelLimit();
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
     * Gets the value of the Valid field.
     * Indicates if the AggregateLimitRpts related to this aggregatelimit are up-to-date.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VALID_PROP.get());
    }
    
    public boolean isWithinAdjustedLimit(java.math.BigDecimal adjustedLimit, java.math.BigDecimal adjustedUsed) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isWithinAdjustedLimit(adjustedLimit, adjustedUsed);
    }
    
    public boolean isWithinLimit(java.math.BigDecimal amount, java.math.BigDecimal adjustedUsed) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isWithinLimit(amount, adjustedUsed);
    }
    
    public boolean isWithinPercentOfLimit(java.math.BigDecimal percent, java.math.BigDecimal adjustedUsed) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).isWithinPercentOfLimit(percent, adjustedUsed);
    }
    
    public boolean matchesCoverage(entity.Coverage coverage) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).matchesCoverage(coverage);
    }
    
    public boolean matchesData(com.guidewire.cc.domain.aggregatelimit.CoverageLineMatchData coverageLineMatchData) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).matchesData(coverageLineMatchData);
    }
    
    public entity.AggregateLimitRpt newAggregateLimitRpt(gw.pl.persistence.core.Key coverageLineId, gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).newAggregateLimitRpt(coverageLineId, bundle);
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
     * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
     */
    public void removeFromCoverageLines(entity.CoverageLineLimit element) {
      __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(COVERAGELINES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Removes all the coverage lines on this Aggregate Limit and sets the
     * PolicyPeriod and LimitType to NULL.
     * @deprecated (Since 8.0.0) Use {@link gw.api.admin.AggregateLimitHelper#resetCoveragesAndAssign(entity.AggregateLimit, typekey.PolicyPeriodType, entity.Policy)}
     * and then {@link gw.api.admin.AggregateLimitHelper#invalidateListViewCache(com.guidewire.pl.web.navigation.Location, String)} instead.
     * See AggregateLimitDetailDV for the sole example of the use of this alternative.
     */
    @java.lang.Deprecated
    public void resetCoverageLines() {
      ((gw.cc.aggregatelimit.entity.AggregateLimit)__getDelegateManager().getImplementation("gw.cc.aggregatelimit.entity.AggregateLimit")).resetCoverageLines();
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
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLines field.
     */
    public void setCoverageLines(entity.CoverageLineLimit[] value) {
      __getInternalInterface().setFieldValue(COVERAGELINES_PROP.get(), value);
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
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LimitAmount field.
     */
    public void setLimitAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LIMITAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LimitType field.
     */
    public void setLimitType(typekey.AggregateLimitType value) {
      __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
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
    
    public void verify() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).verify();
    }
    
    public void verifyAllClaimsOnPolicyPeriodHaveSameCurrency() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).verifyAllClaimsOnPolicyPeriodHaveSameCurrency();
    }
    
    public void verifyIfCoverageSpecificationsMatchesSpecsOnArchivedClaims() {
      ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).verifyIfCoverageSpecificationsMatchesSpecsOnArchivedClaims();
    }
    
    public void verifyNoDuplicateCoverageLines() throws com.guidewire.cc.domain.aggregatelimit.DuplicateCoverageLineException {
      ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).verifyNoDuplicateCoverageLines();
    }
    
    public void verifyNoMixedCoverageLines() throws java.lang.IllegalArgumentException {
      ((com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal")).verifyNoMixedCoverageLines();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitInternal", "com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitImpl");
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
    config.put("gw.cc.aggregatelimit.entity.AggregateLimit", "com.guidewire.cc.domain.aggregatelimit.impl.AggregateLimitImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.AggregateLimit.class, config);
    com.guidewire._generated.entity.AggregateLimitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.AggregateLimit, com.guidewire._generated.entity.AggregateLimitInternal>() {
      public java.lang.Object getImplementation(entity.AggregateLimit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AggregateLimitInternal getInternalInterface(entity.AggregateLimit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.AggregateLimit newEmptyInstance() {
        return new entity.AggregateLimit((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
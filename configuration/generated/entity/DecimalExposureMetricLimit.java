package entity;

/**
 * DecimalExposureMetricLimit
 * Decimal based exposure metric limit.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalExposureMetricLimit.eti;DecimalExposureMetricLimit.eix;DecimalExposureMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DecimalExposureMetricLimit")
public class DecimalExposureMetricLimit extends entity.ExposureMetricLimit implements entity.DecimalMetricLimitDelegate, gw.api.metric.MetricLimit {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalExposureMetricLimit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalExposureMetricLimit>("entity.DecimalExposureMetricLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalRedValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALTARGETVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalTargetValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALYELLOWVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalYellowValue");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DecimalExposureMetricLimit()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DecimalExposureMetricLimit(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DecimalExposureMetricLimit(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.DecimalExposureMetricLimitInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.DecimalExposureMetricLimitInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.DecimalExposureMetricLimitInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the DecimalRedValue field.
   * Decimal field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalRedValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the DecimalTargetValue field.
   * Decimal field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalTargetValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALTARGETVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the DecimalYellowValue field.
   * Decimal field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalYellowValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALYELLOWVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the DecimalRedValue field.
   */
  public void setDecimalRedValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DECIMALREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DecimalTargetValue field.
   */
  public void setDecimalTargetValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DECIMALTARGETVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DecimalYellowValue field.
   */
  public void setDecimalYellowValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DECIMALYELLOWVALUE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DecimalExposureMetricLimitInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DecimalExposureMetricLimit.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public boolean attachedToMetrics() {
      return ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).attachedToMetrics();
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
    
    public entity.ExposureMetricLimit copyOnWrite() {
      return ((com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal")).copyOnWrite();
    }
    
    /**
     * Create a copy of this metric limit with the same data fields (policy type metric limits reference,
     * limit values etc.) but a different tier. The standard bookkeeping fields (version, update time/user
     * etc.) are not copied
     * @param tier the tier for the new copy
     * @return a copy of this metric limit but with the given tier, in the same bundle
     */
    public entity.ExposureMetricLimit copyWithTier(typekey.ExposureTier tier) {
      return ((gw.cc.exposure.metric.entity.ExposureMetricLimit)__getDelegateManager().getImplementation("gw.cc.exposure.metric.entity.ExposureMetricLimit")).copyWithTier(tier);
    }
    
    public gw.api.metric.EditableMetricLimitValues createEditableValues() {
      return ((com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal")).createEditableValues();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void ensureReadyToCommit() {
      ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).ensureReadyToCommit();
    }
    
    public java.util.List<entity.CopyOnWriteMetricLimitDelegate> findMatchingActiveLimits() {
      return ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).findMatchingActiveLimits();
    }
    
    public boolean forceToDefaultCurrency() {
      return ((com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal")).forceToDefaultCurrency();
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
     * The base type of this metric - either ClaimMetricLimit or ExposureMetricLimit
     * @return base type of metric, never null
     */
    public gw.entity.IEntityType getBaseType() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getBaseType();
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
     * Gets the value of the CreatedGeneration field.
     * Generation number at which this limit was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getCreatedGeneration() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CREATEDGENERATION_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     * Currency for this limit, for non money based limits this is always the default currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the DecimalRedValue field.
     * Decimal field to store the red value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDecimalRedValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALREDVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the DecimalTargetValue field.
     * Decimal field to store the target value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDecimalTargetValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALTARGETVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the DecimalYellowValue field.
     * Decimal field to store the yellow value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDecimalYellowValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALYELLOWVALUE_PROP.get());
    }
    
    /**
     * The target, yellow and red values of this metric limit, as editable values
     * @return the editable values
     */
    public gw.api.metric.EditableMetricLimitValues getEditableValues() {
      return ((gw.cc.exposure.metric.entity.ExposureMetricLimit)__getDelegateManager().getImplementation("gw.cc.exposure.metric.entity.ExposureMetricLimit")).getEditableValues();
    }
    
    /**
     * Gets the value of the ExposureMetricType field.
     * Type of exposure metric to which this limit applies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureMetric getExposureMetricType() {
      return (typekey.ExposureMetric)__getInternalInterface().getFieldValue(EXPOSUREMETRICTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureTier field.
     * Exposure tier to which this limit applies, or null if this is a default limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureTier getExposureTier() {
      return (typekey.ExposureTier)__getInternalInterface().getFieldValue(EXPOSURETIER_PROP.get());
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
     * Gets the value of the MetricUnit field.
     * Units for this type of metric.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MetricUnit getMetricUnit() {
      return (typekey.MetricUnit)__getInternalInterface().getFieldValue(METRICUNIT_PROP.get());
    }
    
    public entity.PolicyTypeMetricLimits getOwningPolicyTypeMetricLimits() {
      return ((com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal")).getOwningPolicyTypeMetricLimits();
    }
    
    /**
     * Gets the value of the PolicyTypeMetricLimits field.
     * Back pointer to policy type metric limits object that owns this limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyTypeMetricLimits getPolicyTypeMetricLimits() {
      return (entity.PolicyTypeMetricLimits)__getInternalInterface().getFieldValue(POLICYTYPEMETRICLIMITS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicyTypeMetricLimitsID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICYTYPEMETRICLIMITS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * The value at which the metric should go red
     * @return red value, or null
     */
    public java.lang.Comparable getRedValue() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getRedValue();
    }
    
    /**
     * Gets the value of the RetiredDate field.
     * Date at which this limit was retired, or null if still active.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRetiredDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RETIREDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the RetiredGeneration field.
     * Generation number at which this limit was retired, or null if still active
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getRetiredGeneration() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(RETIREDGENERATION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ExposureMetricLimit getSubtype() {
      return (typekey.ExposureMetricLimit)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * The target value for the metric
     * @return target value, or null
     */
    public java.lang.Comparable getTargetValue() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getTargetValue();
    }
    
    /**
     * The unit used to measure this metric
     * @return the unit, never null
     */
    public typekey.MetricUnit getUnit() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getUnit();
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
     * The value at which the metric should go yellow
     * @return yellow value, or null
     */
    public java.lang.Comparable getYellowValue() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getYellowValue();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AscendingLimitOrder field.
     * Boolean field to indicate the direction of comparison for value validation 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAscendingLimitOrder() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASCENDINGLIMITORDER_PROP.get());
    }
    
    /**
     * Is this the default limit for a particular metric type, the limit that will be used if there
     * is no exact match on tier or currency
     * @return true if is default, false otherwise
     */
    public boolean isDefaultLimit() {
      return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).isDefaultLimit();
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
    
    public void prepareForInsert() {
      ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).prepareForInsert();
    }
    
    public void prepareForRemove() {
      ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).prepareForRemove();
    }
    
    public void prepareForUpdate() {
      ((com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal")).prepareForUpdate();
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
     * Sets the value of the AscendingLimitOrder field.
     */
    public void setAscendingLimitOrder(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ASCENDINGLIMITORDER_PROP.get(), value);
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
     * Sets the value of the CreatedGeneration field.
     */
    public void setCreatedGeneration(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CREATEDGENERATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DecimalRedValue field.
     */
    public void setDecimalRedValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DECIMALREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DecimalTargetValue field.
     */
    public void setDecimalTargetValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DECIMALTARGETVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DecimalYellowValue field.
     */
    public void setDecimalYellowValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DECIMALYELLOWVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureMetricType field.
     */
    public void setExposureMetricType(typekey.ExposureMetric value) {
      __getInternalInterface().setFieldValue(EXPOSUREMETRICTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureTier field.
     */
    public void setExposureTier(typekey.ExposureTier value) {
      __getInternalInterface().setFieldValue(EXPOSURETIER_PROP.get(), value);
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
     * Sets the value of the MetricUnit field.
     */
    public void setMetricUnit(typekey.MetricUnit value) {
      __getInternalInterface().setFieldValue(METRICUNIT_PROP.get(), value);
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
     * Sets the value of the PolicyTypeMetricLimits field.
     */
    public void setPolicyTypeMetricLimits(entity.PolicyTypeMetricLimits value) {
      __getInternalInterface().setFieldValue(POLICYTYPEMETRICLIMITS_PROP.get(), value);
    }
    
    public void setPolicyTypeMetricLimitsID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICYTYPEMETRICLIMITS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredDate field.
     */
    public void setRetiredDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RETIREDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RetiredGeneration field.
     */
    public void setRetiredGeneration(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(RETIREDGENERATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ExposureMetricLimit value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.exposure.metric.impl.ExposureMetricLimitInternal", "com.guidewire.cc.domain.exposure.metric.impl.DecimalExposureMetricLimitImpl");
    config.put("com.guidewire.cc.domain.metric.impl.CopyOnWriteMetricLimitDelegateInternal", "com.guidewire.cc.domain.exposure.metric.impl.DecimalExposureMetricLimitImpl");
    config.put("com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal", "com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateImpl");
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
    config.put("gw.api.metric.MetricLimit", "gw.api.exposure.metric.DecimalExposureMetricLimitMethodsImpl");
    config.put("gw.api.metric.MetricLimitMethods", "gw.api.exposure.metric.DecimalExposureMetricLimitMethodsImpl");
    config.put("gw.cc.exposure.metric.entity.DecimalExposureMetricLimit", "com.guidewire.cc.domain.exposure.metric.impl.DecimalExposureMetricLimitImpl");
    config.put("gw.cc.exposure.metric.entity.ExposureMetricLimit", "com.guidewire.cc.domain.exposure.metric.impl.DecimalExposureMetricLimitImpl");
    config.put("gw.cc.metric.entity.CopyOnWriteMetricLimitDelegate", "com.guidewire.cc.domain.exposure.metric.impl.DecimalExposureMetricLimitImpl");
    config.put("gw.cc.metric.entity.DecimalMetricLimitDelegate", "com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DecimalExposureMetricLimit.class, config);
    com.guidewire._generated.entity.DecimalExposureMetricLimitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DecimalExposureMetricLimit, com.guidewire._generated.entity.DecimalExposureMetricLimitInternal>() {
      public java.lang.Object getImplementation(entity.DecimalExposureMetricLimit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DecimalExposureMetricLimitInternal getInternalInterface(entity.DecimalExposureMetricLimit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DecimalExposureMetricLimit newEmptyInstance() {
        return new entity.DecimalExposureMetricLimit((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
package entity;

/**
 * ClaimMetricLimit
 * Limits for metrics related to a claim
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimMetricLimit.eti;ClaimMetricLimit.eix;ClaimMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ClaimMetricLimit extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.CopyOnWriteMetricLimitDelegate, gw.api.metric.MetricLimit {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimMetricLimit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimMetricLimit>("entity.ClaimMetricLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASCENDINGLIMITORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AscendingLimitOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMMETRICCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimMetricCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMMETRICTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimMetricType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMTIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATEDGENERATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreatedGeneration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> METRICUNIT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MetricUnit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYTYPEMETRICLIMITS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PolicyTypeMetricLimits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDGENERATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredGeneration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClaimMetricLimitInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  protected ClaimMetricLimit(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.ClaimMetricLimitInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.ClaimMetricLimitInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Create a copy of this metric limit with the same data fields (policy type metric limits reference,
   * limit values etc.) but a different tier. The standard bookkeeping fields (version, update time/user
   * etc.) are not copied
   * @param tier the tier for the new copy
   * @return a copy of this metric limit but with the given tier, in the same bundle
   */
  public entity.ClaimMetricLimit copyWithTier(typekey.ClaimTier tier) {
    return ((gw.cc.claim.metric.entity.ClaimMetricLimit)__getDelegateManager().getImplementation("gw.cc.claim.metric.entity.ClaimMetricLimit")).copyWithTier(tier);
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
   * Gets the value of the ClaimMetricCategory field.
   * Category of this claim metric limit, corresponds to category of metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetricCategory getClaimMetricCategory() {
    return (typekey.ClaimMetricCategory)__getInternalInterface().getFieldValue(CLAIMMETRICCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimMetricType field.
   * Type of claim metric to which this limit applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetric getClaimMetricType() {
    return (typekey.ClaimMetric)__getInternalInterface().getFieldValue(CLAIMMETRICTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimTier field.
   * Claim tier to which this limit applies, or null if this is a default limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimTier getClaimTier() {
    return (typekey.ClaimTier)__getInternalInterface().getFieldValue(CLAIMTIER_PROP.get());
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
   * The target, yellow and red values of this metric limit, as editable values
   * @return the editable values
   */
  public gw.api.metric.EditableMetricLimitValues getEditableValues() {
    return ((gw.cc.claim.metric.entity.ClaimMetricLimit)__getDelegateManager().getImplementation("gw.cc.claim.metric.entity.ClaimMetricLimit")).getEditableValues();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the MetricUnit field.
   * Units for this type of metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetricUnit getMetricUnit() {
    return (typekey.MetricUnit)__getInternalInterface().getFieldValue(METRICUNIT_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyTypeMetricLimits field.
   * Back pointer to policy type metric limits object that owns this limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyTypeMetricLimits getPolicyTypeMetricLimits() {
    return (entity.PolicyTypeMetricLimits)__getInternalInterface().getFieldValue(POLICYTYPEMETRICLIMITS_PROP.get());
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
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimMetricLimit getSubtype() {
    return (typekey.ClaimMetricLimit)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
  
  /**
   * The value at which the metric should go yellow
   * @return yellow value, or null
   */
  public java.lang.Comparable getYellowValue() {
    return ((gw.api.metric.MetricLimitMethods)__getDelegateManager().getImplementation("gw.api.metric.MetricLimitMethods")).getYellowValue();
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
   * Sets the value of the AscendingLimitOrder field.
   */
  public void setAscendingLimitOrder(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ASCENDINGLIMITORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimMetricCategory field.
   */
  public void setClaimMetricCategory(typekey.ClaimMetricCategory value) {
    __getInternalInterface().setFieldValue(CLAIMMETRICCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimMetricType field.
   */
  public void setClaimMetricType(typekey.ClaimMetric value) {
    __getInternalInterface().setFieldValue(CLAIMMETRICTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimTier field.
   */
  public void setClaimTier(typekey.ClaimTier value) {
    __getInternalInterface().setFieldValue(CLAIMTIER_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.ClaimMetricLimit value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
  
  static {
    com.guidewire._generated.entity.ClaimMetricLimitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ClaimMetricLimit, com.guidewire._generated.entity.ClaimMetricLimitInternal>() {
      public java.lang.Object getImplementation(entity.ClaimMetricLimit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimMetricLimitInternal getInternalInterface(entity.ClaimMetricLimit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}
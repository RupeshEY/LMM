package entity;

/**
 * ServiceRequestMetricLimit
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestMetricLimit.eti;ServiceRequestMetricLimit.eix;ServiceRequestMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ServiceRequestMetricLimit")
public class ServiceRequestMetricLimit extends com.guidewire.pl.persistence.code.BeanBase implements entity.Editable, entity.DecimalMetricLimitDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ServiceRequestMetricLimit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ServiceRequestMetricLimit>("entity.ServiceRequestMetricLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CUSTOMERSERVICETIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CustomerServiceTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalRedValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALTARGETVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalTargetValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALYELLOWVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalYellowValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIMITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LimitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> METRICUNIT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MetricUnit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SERVICECATEGORY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ServiceCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SERVICEREQUESTMETRICTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ServiceRequestMetricType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SERVICEREQUESTTIER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ServiceRequestTier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SPECIALISTSERVICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SpecialistService");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ServiceRequestMetricLimitInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ServiceRequestMetricLimit()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ServiceRequestMetricLimit(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ServiceRequestMetricLimit(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ServiceRequestMetricLimitInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ServiceRequestMetricLimitInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Gets the value of the Currency field.
   * Currency for this limit, for non-money based limits this is always the default currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the CustomerServiceTier field.
   * Customer service tier that this limit applies to, null if it applies to any service tier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CustomerServiceTier getCustomerServiceTier() {
    return (typekey.CustomerServiceTier)__getInternalInterface().getFieldValue(CUSTOMERSERVICETIER_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LimitType field.
   * Calculation type for this limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetricLimitType getLimitType() {
    return (typekey.ServiceRequestMetricLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MetricUnit field.
   * Units for this type of metric limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetricUnit getMetricUnit() {
    return (typekey.MetricUnit)__getInternalInterface().getFieldValue(METRICUNIT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ServiceCategory field.
   * Category of service that this limit applies to, null if it applies to any category
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getServiceCategory() {
    return (entity.SpecialistService)__getInternalInterface().getFieldValue(SERVICECATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestMetricType field.
   * Type of service request metric to which this limit applies
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetric getServiceRequestMetricType() {
    return (typekey.ServiceRequestMetric)__getInternalInterface().getFieldValue(SERVICEREQUESTMETRICTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestTier field.
   * Service request tier to which this limit applies, or null if it applies to any tier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestTier getServiceRequestTier() {
    return (typekey.ServiceRequestTier)__getInternalInterface().getFieldValue(SERVICEREQUESTTIER_PROP.get());
  }
  
  /**
   * Gets the value of the SpecialistService field.
   * Fully-specified service that this limit applies to, null if it applies to any service
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getSpecialistService() {
    return (entity.SpecialistService)__getInternalInterface().getFieldValue(SPECIALISTSERVICE_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetricLimit getSubtype() {
    return (typekey.ServiceRequestMetricLimit)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CustomerServiceTier field.
   */
  public void setCustomerServiceTier(typekey.CustomerServiceTier value) {
    __getInternalInterface().setFieldValue(CUSTOMERSERVICETIER_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.ServiceRequestMetricLimitType value) {
    __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ServiceCategory field.
   */
  public void setServiceCategory(entity.SpecialistService value) {
    __getInternalInterface().setFieldValue(SERVICECATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequestMetricType field.
   */
  public void setServiceRequestMetricType(typekey.ServiceRequestMetric value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTMETRICTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequestTier field.
   */
  public void setServiceRequestTier(typekey.ServiceRequestTier value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTTIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpecialistService field.
   */
  public void setSpecialistService(entity.SpecialistService value) {
    __getInternalInterface().setFieldValue(SPECIALISTSERVICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.ServiceRequestMetricLimit value) {
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ServiceRequestMetricLimitInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ServiceRequestMetricLimit.this.__getDelegateManager();
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
    
    public gw.api.metric.EditableMetricLimitValues createEditableValues() {
      return ((com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal")).createEditableValues();
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
     * Gets the value of the Currency field.
     * Currency for this limit, for non-money based limits this is always the default currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the CustomerServiceTier field.
     * Customer service tier that this limit applies to, null if it applies to any service tier
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CustomerServiceTier getCustomerServiceTier() {
      return (typekey.CustomerServiceTier)__getInternalInterface().getFieldValue(CUSTOMERSERVICETIER_PROP.get());
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
     * Calculation type for this limit
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestMetricLimitType getLimitType() {
      return (typekey.ServiceRequestMetricLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MetricUnit field.
     * Units for this type of metric limit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MetricUnit getMetricUnit() {
      return (typekey.MetricUnit)__getInternalInterface().getFieldValue(METRICUNIT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ServiceCategory field.
     * Category of service that this limit applies to, null if it applies to any category
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SpecialistService getServiceCategory() {
      return (entity.SpecialistService)__getInternalInterface().getFieldValue(SERVICECATEGORY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getServiceCategoryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestMetricType field.
     * Type of service request metric to which this limit applies
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestMetric getServiceRequestMetricType() {
      return (typekey.ServiceRequestMetric)__getInternalInterface().getFieldValue(SERVICEREQUESTMETRICTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestTier field.
     * Service request tier to which this limit applies, or null if it applies to any tier
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestTier getServiceRequestTier() {
      return (typekey.ServiceRequestTier)__getInternalInterface().getFieldValue(SERVICEREQUESTTIER_PROP.get());
    }
    
    /**
     * Gets the value of the SpecialistService field.
     * Fully-specified service that this limit applies to, null if it applies to any service
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SpecialistService getSpecialistService() {
      return (entity.SpecialistService)__getInternalInterface().getFieldValue(SPECIALISTSERVICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSpecialistServiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SPECIALISTSERVICE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestMetricLimit getSubtype() {
      return (typekey.ServiceRequestMetricLimit)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CustomerServiceTier field.
     */
    public void setCustomerServiceTier(typekey.CustomerServiceTier value) {
      __getInternalInterface().setFieldValue(CUSTOMERSERVICETIER_PROP.get(), value);
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
    public void setLimitType(typekey.ServiceRequestMetricLimitType value) {
      __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ServiceCategory field.
     */
    public void setServiceCategory(entity.SpecialistService value) {
      __getInternalInterface().setFieldValue(SERVICECATEGORY_PROP.get(), value);
    }
    
    public void setServiceCategoryID(gw.pl.persistence.core.Key value) {
      setFieldValue(SERVICECATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequestMetricType field.
     */
    public void setServiceRequestMetricType(typekey.ServiceRequestMetric value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTMETRICTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequestTier field.
     */
    public void setServiceRequestTier(typekey.ServiceRequestTier value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTTIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpecialistService field.
     */
    public void setSpecialistService(entity.SpecialistService value) {
      __getInternalInterface().setFieldValue(SPECIALISTSERVICE_PROP.get(), value);
    }
    
    public void setSpecialistServiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(SPECIALISTSERVICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ServiceRequestMetricLimit value) {
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
    config.put("com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateInternal", "com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.metric.entity.DecimalMetricLimitDelegate", "com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ServiceRequestMetricLimit.class, config);
    com.guidewire._generated.entity.ServiceRequestMetricLimitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ServiceRequestMetricLimit, com.guidewire._generated.entity.ServiceRequestMetricLimitInternal>() {
      public java.lang.Object getImplementation(entity.ServiceRequestMetricLimit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ServiceRequestMetricLimitInternal getInternalInterface(entity.ServiceRequestMetricLimit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ServiceRequestMetricLimit newEmptyInstance() {
        return new entity.ServiceRequestMetricLimit((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
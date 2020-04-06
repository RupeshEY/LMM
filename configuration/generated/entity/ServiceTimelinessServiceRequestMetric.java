package entity;

/**
 * ServiceTimelinessServiceRequestMetric
 * Actual vs. expected service completion time.  Only applicable to quote and service and service only service requests
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceTimelinessServiceRequestMetric.eti;ServiceTimelinessServiceRequestMetric.eix;ServiceTimelinessServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ServiceTimelinessServiceRequestMetric")
public class ServiceTimelinessServiceRequestMetric extends entity.TimeBasedServiceRequestMetric implements entity.ServiceRequestMetricEscalationDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ServiceTimelinessServiceRequestMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ServiceTimelinessServiceRequestMetric>("entity.ServiceTimelinessServiceRequestMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DAYSDIFFERENTFROMEXPECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DaysDifferentFromExpected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ESCALATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Escalated");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ServiceTimelinessServiceRequestMetric()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ServiceTimelinessServiceRequestMetric(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ServiceTimelinessServiceRequestMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the DaysDifferentFromExpected field.
   * Difference (in business days) between the actual service completion date and the expected service completion date. Only filled out when service request is complete
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDaysDifferentFromExpected() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(DAYSDIFFERENTFROMEXPECTED_PROP.get());
  }
  
  /**
   * Gets the value of the Escalated field.
   * Indicates if this metric has been previously escalated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEscalated() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ESCALATED_PROP.get());
  }
  
  /**
   * Sets the value of the DaysDifferentFromExpected field.
   */
  public void setDaysDifferentFromExpected(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(DAYSDIFFERENTFROMEXPECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Escalated field.
   */
  public void setEscalated(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ESCALATED_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ServiceTimelinessServiceRequestMetric.this.__getDelegateManager();
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
     * Gets the value of the DaysDifferentFromExpected field.
     * Difference (in business days) between the actual service completion date and the expected service completion date. Only filled out when service request is complete
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getDaysDifferentFromExpected() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(DAYSDIFFERENTFROMEXPECTED_PROP.get());
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
     * Gets the value of the IntegerValue field.
     * Integer field to store the value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getIntegerValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(INTEGERVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the MetricUnit field.
     * Units for this type of metric.
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
     * Gets the value of the ReachRedTime field.
     * Time the red limit was or will be reached
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReachRedTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REACHREDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ReachYellowTime field.
     * Time the yellow limit was or will be reached.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReachYellowTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REACHYELLOWTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequest field.
     * Service Request to which this metric is related.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest getServiceRequest() {
      return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getServiceRequestID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the value of the StartTime field.
     * Starting time of the metric.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestMetric getSubtype() {
      return (typekey.ServiceRequestMetric)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
     * Gets the value of the Escalated field.
     * Indicates if this metric has been previously escalated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEscalated() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ESCALATED_PROP.get());
    }
    
    /**
     * Gets the value of the IsOpen field.
     * The value of an open time based metric is now - start time, once closed it has a fixed integer value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIsOpen() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOPEN_PROP.get());
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
     * Gets the value of the Skipped field.
     * True if the metric is closed because the normal closing event was skipped.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSkipped() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SKIPPED_PROP.get());
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
     * Sets the value of the DaysDifferentFromExpected field.
     */
    public void setDaysDifferentFromExpected(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(DAYSDIFFERENTFROMEXPECTED_PROP.get(), value);
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
     * Sets the value of the Escalated field.
     */
    public void setEscalated(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ESCALATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IntegerValue field.
     */
    public void setIntegerValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(INTEGERVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IsOpen field.
     */
    public void setIsOpen(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ISOPEN_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReachRedTime field.
     */
    public void setReachRedTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(REACHREDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReachYellowTime field.
     */
    public void setReachYellowTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(REACHYELLOWTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequest field.
     */
    public void setServiceRequest(entity.ServiceRequest value) {
      __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    public void setServiceRequestID(gw.pl.persistence.core.Key value) {
      setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Skipped field.
     */
    public void setSkipped(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SKIPPED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ServiceRequestMetric value) {
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
    config.put("gw.api.metric.CalculatedLimitMethods", "gw.vendormanagement.metric.ServiceTimelinessServiceRequestMetricMethodsImpl");
    config.put("gw.api.metric.MetricMethods", "gw.vendormanagement.metric.ServiceTimelinessServiceRequestMetricMethodsImpl");
    config.put("gw.cc.metric.entity.DecimalMetricLimitDelegate", "com.guidewire.cc.domain.metric.impl.DecimalMetricLimitDelegateImpl");
    config.put("gw.cc.metric.entity.IntegerMetricDelegate", "com.guidewire.cc.domain.metric.impl.IntegerMetricDelegateImpl");
    config.put("gw.cc.metric.entity.MetricLimitTimeDelegate", "com.guidewire.cc.domain.metric.impl.MetricLimitTimeDelegateImpl");
    config.put("gw.cc.metric.entity.TimeBasedMetricDelegate", "com.guidewire.cc.domain.metric.impl.TimeBasedMetricDelegateImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ServiceTimelinessServiceRequestMetric.class, config);
    com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ServiceTimelinessServiceRequestMetric, com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal>() {
      public java.lang.Object getImplementation(entity.ServiceTimelinessServiceRequestMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ServiceTimelinessServiceRequestMetricInternal getInternalInterface(entity.ServiceTimelinessServiceRequestMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ServiceTimelinessServiceRequestMetric newEmptyInstance() {
        return new entity.ServiceTimelinessServiceRequestMetric((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
package entity;

/**
 * ProcessHistory
 * Process run history
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProcessHistory.eti;ProcessHistory.eix;ProcessHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ProcessHistory")
public class ProcessHistory extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.EventAware, com.guidewire.commons.profiler.ProfilerDataSourceInternal {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ProcessHistory> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ProcessHistory>("entity.ProcessHistory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPLETEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CompleteDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreationDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAILEDOPS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FailedOps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAILUREREASON_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FailureReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTERNALFAILURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InternalFailure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEASEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LeaseId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTIFICATIONSENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NotificationSent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPSPERFORMED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpsPerformed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PROCESSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ProcessType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFILERDATA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfilerData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RANTOCOMPLETION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RanToCompletion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETURNVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReturnValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Scheduled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDate");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ProcessHistoryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ProcessHistory()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ProcessHistory(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ProcessHistory(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ProcessHistoryInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ProcessHistoryInternal __getInternalInterface() {
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
   * Returns an array of {@link GloballyAggregatedQuerySummary} objects,
   * one for each distinct query string found in any frame of this
   * profiler's stacks.
   */
  public gw.api.profiler.GloballyAggregatedQuerySummary[] getAggregatedQuerySummaries() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getAggregatedQuerySummaries();
  }
  
  /**
   * Gets the value of the CompleteDate field.
   * The date this process completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCompleteDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(COMPLETEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the CreationDate field.
   * The date this process has been requested to start.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONDATE_PROP.get());
  }
  
  public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
    return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
  }
  
  /**
   * Gets the value of the Description field.
   * Short description of a run.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the FailedOps field.
   * The number of operations that failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFailedOps() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FAILEDOPS_PROP.get());
  }
  
  /**
   * Gets the value of the FailureReason field.
   * If not successful, the reason the process failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFailureReason() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FAILUREREASON_PROP.get());
  }
  
  /**
   * 
   * @return Unique identifier of the object.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
  }
  
  /**
   * Gets the value of the LeaseId field.
   * The Id of the lease.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeaseId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEASEID_PROP.get());
  }
  
  /**
   * 
   * @return User-friendly name
   */
  public java.lang.String getName() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
  }
  
  /**
   * Gets the value of the OpsPerformed field.
   * The total number of operations the process performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpsPerformed() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPSPERFORMED_PROP.get());
  }
  
  /**
   * Gets the value of the ProcessType field.
   * The process this entry refers to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BatchProcessType getProcessType() {
    return (typekey.BatchProcessType)__getInternalInterface().getFieldValue(PROCESSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData() {
    return (gw.lang.Blob)__getInternalInterface().getFieldValue(PROFILERDATA_PROP.get());
  }
  
  /**
   * For all stacks in this source
   * @return 
   */
  public gw.api.profiler.ProfilerFrameGroupSource getProfilerFrameGroupSource() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerFrameGroupSource();
  }
  
  /**
   * For the given stack
   * @param stack 
   * @return 
   */
  public gw.api.profiler.ProfilerFrameGroupSource getProfilerFrameGroupSource(gw.api.profiler.ProfilerStack stack) {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerFrameGroupSource(stack);
  }
  
  /**
   * 
   * @return The stacks
   */
  public gw.api.profiler.ProfilerStack[] getProfilerStacks() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerStacks();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReturnValue field.
   * Return value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReturnValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RETURNVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the ServerId field.
   * Server id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
  }
  
  /**
   * Returns an array of {@link StackQuerySummary} objects, one for
   * each stack containing a query in any frame of this profiler's stacks.
   */
  public gw.api.profiler.StackQuerySummary[] getStackQuerySummaries() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStackQuerySummaries();
  }
  
  /**
   * 
   * @param sql 
   * @return The {@link GloballyAggregatedQuerySummary} objects with a score
   */
  public gw.api.profiler.GloballyAggregatedQuerySummary[] getStackQuerySummariesNear(java.lang.String sql) {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStackQuerySummariesNear(sql);
  }
  
  /**
   * 
   * @return stacks grouped by name
   */
  public gw.api.profiler.ProfilerStackGroup[] getStacksGroupedByName() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStacksGroupedByName();
  }
  
  /**
   * Gets the value of the StartDate field.
   * The date this process was actually started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the InternalFailure field.
   * Whether the failure was internal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInternalFailure() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INTERNALFAILURE_PROP.get());
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
   * Gets the value of the NotificationSent field.
   * Completion Notification Sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNotificationSent() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(NOTIFICATIONSENT_PROP.get());
  }
  
  /**
   * Gets the value of the RanToCompletion field.
   * Whether or not the process ran to completion, or failed or was interrupted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRanToCompletion() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RANTOCOMPLETION_PROP.get());
  }
  
  /**
   * Gets the value of the Scheduled field.
   * Whether this was a scheduled run
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduled() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULED_PROP.get());
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
   * Sets the value of the CompleteDate field.
   */
  public void setCompleteDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(COMPLETEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreationDate field.
   */
  public void setCreationDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FailedOps field.
   */
  public void setFailedOps(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FAILEDOPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FailureReason field.
   */
  public void setFailureReason(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FAILUREREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InternalFailure field.
   */
  public void setInternalFailure(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INTERNALFAILURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeaseId field.
   */
  public void setLeaseId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LEASEID_PROP.get(), value);
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
   * Sets the value of the NotificationSent field.
   */
  public void setNotificationSent(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(NOTIFICATIONSENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpsPerformed field.
   */
  public void setOpsPerformed(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPSPERFORMED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProcessType field.
   */
  public void setProcessType(typekey.BatchProcessType value) {
    __getInternalInterface().setFieldValue(PROCESSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value) {
    __getInternalInterface().setFieldValue(PROFILERDATA_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RanToCompletion field.
   */
  public void setRanToCompletion(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RANTOCOMPLETION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReturnValue field.
   */
  public void setReturnValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RETURNVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Scheduled field.
   */
  public void setScheduled(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SCHEDULED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ProcessHistoryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ProcessHistory.this.__getDelegateManager();
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
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * Returns an array of {@link GloballyAggregatedQuerySummary} objects,
     * one for each distinct query string found in any frame of this
     * profiler's stacks.
     */
    public gw.api.profiler.GloballyAggregatedQuerySummary[] getAggregatedQuerySummaries() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getAggregatedQuerySummaries();
    }
    
    /**
     * Gets the value of the CompleteDate field.
     * The date this process completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCompleteDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(COMPLETEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the CreationDate field.
     * The date this process has been requested to start.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreationDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONDATE_PROP.get());
    }
    
    public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
      return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
    }
    
    /**
     * Gets the value of the Description field.
     * Short description of a run.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the FailedOps field.
     * The number of operations that failed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFailedOps() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FAILEDOPS_PROP.get());
    }
    
    /**
     * Gets the value of the FailureReason field.
     * If not successful, the reason the process failed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFailureReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FAILUREREASON_PROP.get());
    }
    
    /**
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the LeaseId field.
     * The Id of the lease.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLeaseId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEASEID_PROP.get());
    }
    
    /**
     * 
     * @return User-friendly name
     */
    public java.lang.String getName() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
    }
    
    /**
     * Gets the value of the OpsPerformed field.
     * The total number of operations the process performed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpsPerformed() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPSPERFORMED_PROP.get());
    }
    
    public gw.api.tools.ProcessID getProcessID() {
      return ((com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods")).getProcessID();
    }
    
    /**
     * Gets the value of the ProcessType field.
     * The process this entry refers to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BatchProcessType getProcessType() {
      return (typekey.BatchProcessType)__getInternalInterface().getFieldValue(PROCESSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ProfilerData field.
     * Raw Profiler data
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getProfilerData() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(PROFILERDATA_PROP.get());
    }
    
    /**
     * For all stacks in this source
     * @return 
     */
    public gw.api.profiler.ProfilerFrameGroupSource getProfilerFrameGroupSource() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerFrameGroupSource();
    }
    
    /**
     * For the given stack
     * @param stack 
     * @return 
     */
    public gw.api.profiler.ProfilerFrameGroupSource getProfilerFrameGroupSource(gw.api.profiler.ProfilerStack stack) {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerFrameGroupSource(stack);
    }
    
    /**
     * 
     * @return The stacks
     */
    public gw.api.profiler.ProfilerStack[] getProfilerStacks() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getProfilerStacks();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReturnValue field.
     * Return value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReturnValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RETURNVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the ServerId field.
     * Server id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
    }
    
    /**
     * Returns an array of {@link StackQuerySummary} objects, one for
     * each stack containing a query in any frame of this profiler's stacks.
     */
    public gw.api.profiler.StackQuerySummary[] getStackQuerySummaries() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStackQuerySummaries();
    }
    
    /**
     * 
     * @param sql 
     * @return The {@link GloballyAggregatedQuerySummary} objects with a score
     */
    public gw.api.profiler.GloballyAggregatedQuerySummary[] getStackQuerySummariesNear(java.lang.String sql) {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStackQuerySummariesNear(sql);
    }
    
    /**
     * 
     * @return stacks grouped by name
     */
    public gw.api.profiler.ProfilerStackGroup[] getStacksGroupedByName() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getStacksGroupedByName();
    }
    
    /**
     * Gets the value of the StartDate field.
     * The date this process was actually started.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the InternalFailure field.
     * Whether the failure was internal.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInternalFailure() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INTERNALFAILURE_PROP.get());
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
     * Gets the value of the NotificationSent field.
     * Completion Notification Sent
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isNotificationSent() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(NOTIFICATIONSENT_PROP.get());
    }
    
    /**
     * Gets the value of the RanToCompletion field.
     * Whether or not the process ran to completion, or failed or was interrupted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRanToCompletion() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RANTOCOMPLETION_PROP.get());
    }
    
    /**
     * Gets the value of the Scheduled field.
     * Whether this was a scheduled run
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isScheduled() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULED_PROP.get());
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
     * Sets the value of the CompleteDate field.
     */
    public void setCompleteDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(COMPLETEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreationDate field.
     */
    public void setCreationDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FailedOps field.
     */
    public void setFailedOps(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FAILEDOPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FailureReason field.
     */
    public void setFailureReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FAILUREREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InternalFailure field.
     */
    public void setInternalFailure(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INTERNALFAILURE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LeaseId field.
     */
    public void setLeaseId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LEASEID_PROP.get(), value);
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
     * Sets the value of the NotificationSent field.
     */
    public void setNotificationSent(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(NOTIFICATIONSENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpsPerformed field.
     */
    public void setOpsPerformed(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPSPERFORMED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProcessType field.
     */
    public void setProcessType(typekey.BatchProcessType value) {
      __getInternalInterface().setFieldValue(PROCESSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProfilerData field.
     */
    public void setProfilerData(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(PROFILERDATA_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RanToCompletion field.
     */
    public void setRanToCompletion(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RANTOCOMPLETION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReturnValue field.
     */
    public void setReturnValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RETURNVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Scheduled field.
     */
    public void setScheduled(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SCHEDULED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServerId field.
     */
    public void setServerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartDate field.
     */
    public void setStartDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
    }
    
    public void truncateAndSetFailureReason(java.lang.String failureReason) {
      ((com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods")).truncateAndSetFailureReason(failureReason);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.profiler.ProfilerDataSourceInternal", "com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryImpl");
    config.put("com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryInternalMethods", "com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.profiler.ProfilerDataSource", "com.guidewire.pl.domain.batchprocessing.impl.ProcessHistoryImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ProcessHistory.class, config);
    com.guidewire._generated.entity.ProcessHistoryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ProcessHistory, com.guidewire._generated.entity.ProcessHistoryInternal>() {
      public java.lang.Object getImplementation(entity.ProcessHistory bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ProcessHistoryInternal getInternalInterface(entity.ProcessHistory bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ProcessHistory newEmptyInstance() {
        return new entity.ProcessHistory((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
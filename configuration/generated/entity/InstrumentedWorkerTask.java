package entity;

/**
 * InstrumentedWorkerTask
 * Instrumentation information for a run of a distributed worker instance.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InstrumentedWorkerTask.eti;InstrumentedWorkerTask.eix;InstrumentedWorkerTask.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "InstrumentedWorkerTask")
public class InstrumentedWorkerTask extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.system.entity.DoesNotValidateOnCommit {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.InstrumentedWorkerTask> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.InstrumentedWorkerTask>("entity.InstrumentedWorkerTask");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CDCS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Cdcs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONSECUTIVEEXCEPTIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ConsecutiveExceptions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CUSTOMINSTRUMENTATIONDATA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CustomInstrumentationData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCEPTIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Exceptions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSTANCENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InstanceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSTRUMENTEDWORKEXECUTORID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InstrumentedWorkExecutorID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MANAGEMENTELAPSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ManagementElapsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ORPHANSADOPTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OrphansAdopted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSHISTORYID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessHistoryID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFILERDATA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfilerData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RANTOCOMPLETION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RanToCompletion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKELAPSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkElapsed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSCHECKEDOUT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsCheckedOut");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSFAILED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsFailed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSPROCESSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsProcessed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSPROCESSEDAFTERCDC_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsProcessedAfterCdc");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSPROCESSEDAFTERERROR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsProcessedAfterError");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKITEMSSKIPPED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkitemsSkipped");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.InstrumentedWorkerTaskInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public InstrumentedWorkerTask()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public InstrumentedWorkerTask(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected InstrumentedWorkerTask(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.InstrumentedWorkerTaskInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.InstrumentedWorkerTaskInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Gets the value of the Cdcs field.
   * The number of exceptions caught during workitem processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCdcs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CDCS_PROP.get());
  }
  
  /**
   * Gets the value of the ConsecutiveExceptions field.
   * Count of the number of consecutive work items that resulted in an exception.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getConsecutiveExceptions() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CONSECUTIVEEXCEPTIONS_PROP.get());
  }
  
  public gw.processes.WorkQueueInstrumentation getCustomInstrumentation(java.util.Map<java.lang.String, gw.processes.WorkQueueInstrumentationFieldType> fieldTypes) {
    return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getCustomInstrumentation(fieldTypes);
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCustomInstrumentationData() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CUSTOMINSTRUMENTATIONDATA_PROP.get());
  }
  
  public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
    return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
  }
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the instance was shutdown.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Exceptions field.
   * The number of exceptions caught during workitem processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExceptions() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXCEPTIONS_PROP.get());
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
   * Gets the value of the InstanceNumber field.
   * The instance number on this app server.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getInstanceNumber() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(INSTANCENUMBER_PROP.get());
  }
  
  /**
   * Returns {@link entity.InstrumentedWorkExecutor} that runs this task.
   * @return {@link entity.InstrumentedWorkExecutor} that runs this task.
   */
  public entity.InstrumentedWorkExecutor getInstrumentedWorkExecutor() {
    return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getInstrumentedWorkExecutor();
  }
  
  /**
   * Gets the value of the InstrumentedWorkExecutorID field.
   * Executor instance that created this task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getInstrumentedWorkExecutorID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(INSTRUMENTEDWORKEXECUTORID_PROP.get());
  }
  
  /**
   * Gets the value of the ManagementElapsed field.
   * The number of milliseconds spent managing the work queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getManagementElapsed() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MANAGEMENTELAPSED_PROP.get());
  }
  
  /**
   * 
   * @return User-friendly name
   */
  public java.lang.String getName() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
  }
  
  public gw.processes.WorkQueueInstrumentation getOrCreateCustomInstrumentation(java.util.Map<java.lang.String, gw.processes.WorkQueueInstrumentationFieldType> fieldTypes) {
    return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getOrCreateCustomInstrumentation(fieldTypes);
  }
  
  /**
   * Gets the value of the OrphansAdopted field.
   * The number of orphaned workitems reclaimed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOrphansAdopted() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ORPHANSADOPTED_PROP.get());
  }
  
  /**
   * Gets the value of the ProcessHistoryID field.
   * The writer batch job that created all workitem processed by this run.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getProcessHistoryID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(PROCESSHISTORYID_PROP.get());
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
   * Gets the value of the StartTime field.
   * Timestamp when the instance was started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the WorkElapsed field.
   * The number of milliseconds spent processing work items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getWorkElapsed() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(WORKELAPSED_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsCheckedOut field.
   * The number of workitems checked out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsCheckedOut() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSCHECKEDOUT_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsFailed field.
   * The number of workitems marked as failed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsFailed() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSFAILED_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsProcessed field.
   * The number of workitems processed successfully.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessed() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSED_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsProcessedAfterCdc field.
   * The number of workitems processed after previous attempt failed with CDC.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessedAfterCdc() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSEDAFTERCDC_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsProcessedAfterError field.
   * The number of workitems processed after previous attempt failed with some kind of error (including CDC).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsProcessedAfterError() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSEDAFTERERROR_PROP.get());
  }
  
  /**
   * Gets the value of the WorkitemsSkipped field.
   * The number of workitems skipped.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkitemsSkipped() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSSKIPPED_PROP.get());
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
   * Gets the value of the RanToCompletion field.
   * Whether the worker batch ran to completion, or failed or was interrupted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRanToCompletion() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RANTOCOMPLETION_PROP.get());
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
   * Sets the value of the Cdcs field.
   */
  public void setCdcs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CDCS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConsecutiveExceptions field.
   */
  public void setConsecutiveExceptions(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CONSECUTIVEEXCEPTIONS_PROP.get(), value);
  }
  
  /**
   * Saves custom instrumentation. Returns <code>false</code> if could not convert
   * the instrumentation to JSON (e.g. it was too big). Conversion errors are expected are logged.
   * @param instrumentation custom instrumentation to save.
   */
  public boolean setCustomInstrumentation(gw.processes.WorkQueueInstrumentation instrumentation) {
    return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).setCustomInstrumentation(instrumentation);
  }
  
  /**
   * Sets the value of the CustomInstrumentationData field.
   */
  private void setCustomInstrumentationData(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CUSTOMINSTRUMENTATIONDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exceptions field.
   */
  public void setExceptions(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXCEPTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InstanceNumber field.
   */
  public void setInstanceNumber(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INSTANCENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InstrumentedWorkExecutorID field.
   */
  public void setInstrumentedWorkExecutorID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(INSTRUMENTEDWORKEXECUTORID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ManagementElapsed field.
   */
  public void setManagementElapsed(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MANAGEMENTELAPSED_PROP.get(), value);
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
   * Sets the value of the OrphansAdopted field.
   */
  public void setOrphansAdopted(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ORPHANSADOPTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProcessHistoryID field.
   */
  public void setProcessHistoryID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(PROCESSHISTORYID_PROP.get(), value);
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
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkElapsed field.
   */
  public void setWorkElapsed(java.lang.Long value) {
    __getInternalInterface().setFieldValue(WORKELAPSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsCheckedOut field.
   */
  public void setWorkitemsCheckedOut(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSCHECKEDOUT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsFailed field.
   */
  public void setWorkitemsFailed(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSFAILED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsProcessed field.
   */
  public void setWorkitemsProcessed(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSPROCESSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsProcessedAfterCdc field.
   */
  public void setWorkitemsProcessedAfterCdc(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSPROCESSEDAFTERCDC_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsProcessedAfterError field.
   */
  public void setWorkitemsProcessedAfterError(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSPROCESSEDAFTERERROR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkitemsSkipped field.
   */
  public void setWorkitemsSkipped(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WORKITEMSSKIPPED_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.InstrumentedWorkerTaskInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.InstrumentedWorkerTask.this.__getDelegateManager();
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
    
    public void complete(java.util.Date completionTime) {
      ((com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskInternalMethods")).complete(completionTime);
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
     * Returns an array of {@link GloballyAggregatedQuerySummary} objects,
     * one for each distinct query string found in any frame of this
     * profiler's stacks.
     */
    public gw.api.profiler.GloballyAggregatedQuerySummary[] getAggregatedQuerySummaries() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getAggregatedQuerySummaries();
    }
    
    /**
     * Gets the value of the Cdcs field.
     * The number of exceptions caught during workitem processing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getCdcs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CDCS_PROP.get());
    }
    
    /**
     * Gets the value of the ConsecutiveExceptions field.
     * Count of the number of consecutive work items that resulted in an exception.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getConsecutiveExceptions() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CONSECUTIVEEXCEPTIONS_PROP.get());
    }
    
    public gw.processes.WorkQueueInstrumentation getCustomInstrumentation(java.util.Map<java.lang.String, gw.processes.WorkQueueInstrumentationFieldType> fieldTypes) {
      return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getCustomInstrumentation(fieldTypes);
    }
    
    /**
     * Gets the value of the CustomInstrumentationData field.
     * Optional custom instrumentation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCustomInstrumentationData() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CUSTOMINSTRUMENTATIONDATA_PROP.get());
    }
    
    public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
      return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
    }
    
    /**
     * Gets the value of the EndTime field.
     * Timestamp when the instance was shutdown.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Exceptions field.
     * The number of exceptions caught during workitem processing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExceptions() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXCEPTIONS_PROP.get());
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
     * Gets the value of the InstanceNumber field.
     * The instance number on this app server.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getInstanceNumber() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(INSTANCENUMBER_PROP.get());
    }
    
    /**
     * Returns {@link entity.InstrumentedWorkExecutor} that runs this task.
     * @return {@link entity.InstrumentedWorkExecutor} that runs this task.
     */
    public entity.InstrumentedWorkExecutor getInstrumentedWorkExecutor() {
      return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getInstrumentedWorkExecutor();
    }
    
    /**
     * Gets the value of the InstrumentedWorkExecutorID field.
     * Executor instance that created this task.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getInstrumentedWorkExecutorID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(INSTRUMENTEDWORKEXECUTORID_PROP.get());
    }
    
    /**
     * Gets the value of the ManagementElapsed field.
     * The number of milliseconds spent managing the work queue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getManagementElapsed() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MANAGEMENTELAPSED_PROP.get());
    }
    
    /**
     * 
     * @return User-friendly name
     */
    public java.lang.String getName() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
    }
    
    public gw.processes.WorkQueueInstrumentation getOrCreateCustomInstrumentation(java.util.Map<java.lang.String, gw.processes.WorkQueueInstrumentationFieldType> fieldTypes) {
      return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).getOrCreateCustomInstrumentation(fieldTypes);
    }
    
    /**
     * Gets the value of the OrphansAdopted field.
     * The number of orphaned workitems reclaimed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOrphansAdopted() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ORPHANSADOPTED_PROP.get());
    }
    
    /**
     * Gets the value of the ProcessHistoryID field.
     * The writer batch job that created all workitem processed by this run.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getProcessHistoryID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(PROCESSHISTORYID_PROP.get());
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
     * Gets the value of the StartTime field.
     * Timestamp when the instance was started.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the WorkElapsed field.
     * The number of milliseconds spent processing work items.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getWorkElapsed() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(WORKELAPSED_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsCheckedOut field.
     * The number of workitems checked out.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsCheckedOut() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSCHECKEDOUT_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsFailed field.
     * The number of workitems marked as failed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsFailed() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSFAILED_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsProcessed field.
     * The number of workitems processed successfully.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsProcessed() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSED_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsProcessedAfterCdc field.
     * The number of workitems processed after previous attempt failed with CDC.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsProcessedAfterCdc() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSEDAFTERCDC_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsProcessedAfterError field.
     * The number of workitems processed after previous attempt failed with some kind of error (including CDC).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsProcessedAfterError() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSPROCESSEDAFTERERROR_PROP.get());
    }
    
    /**
     * Gets the value of the WorkitemsSkipped field.
     * The number of workitems skipped.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkitemsSkipped() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKITEMSSKIPPED_PROP.get());
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
    
    /**
     * Gets the value of the RanToCompletion field.
     * Whether the worker batch ran to completion, or failed or was interrupted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRanToCompletion() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RANTOCOMPLETION_PROP.get());
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
     * Sets the value of the Cdcs field.
     */
    public void setCdcs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CDCS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConsecutiveExceptions field.
     */
    public void setConsecutiveExceptions(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CONSECUTIVEEXCEPTIONS_PROP.get(), value);
    }
    
    /**
     * Saves custom instrumentation. Returns <code>false</code> if could not convert
     * the instrumentation to JSON (e.g. it was too big). Conversion errors are expected are logged.
     * @param instrumentation custom instrumentation to save.
     */
    public boolean setCustomInstrumentation(gw.processes.WorkQueueInstrumentation instrumentation) {
      return ((com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods")).setCustomInstrumentation(instrumentation);
    }
    
    /**
     * Sets the value of the CustomInstrumentationData field.
     */
    public void setCustomInstrumentationData(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CUSTOMINSTRUMENTATIONDATA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exceptions field.
     */
    public void setExceptions(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXCEPTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InstanceNumber field.
     */
    public void setInstanceNumber(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(INSTANCENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InstrumentedWorkExecutorID field.
     */
    public void setInstrumentedWorkExecutorID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(INSTRUMENTEDWORKEXECUTORID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the ManagementElapsed field.
     */
    public void setManagementElapsed(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MANAGEMENTELAPSED_PROP.get(), value);
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
     * Sets the value of the OrphansAdopted field.
     */
    public void setOrphansAdopted(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ORPHANSADOPTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProcessHistoryID field.
     */
    public void setProcessHistoryID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(PROCESSHISTORYID_PROP.get(), value);
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
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkElapsed field.
     */
    public void setWorkElapsed(java.lang.Long value) {
      __getInternalInterface().setFieldValue(WORKELAPSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsCheckedOut field.
     */
    public void setWorkitemsCheckedOut(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSCHECKEDOUT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsFailed field.
     */
    public void setWorkitemsFailed(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSFAILED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsProcessed field.
     */
    public void setWorkitemsProcessed(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSPROCESSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsProcessedAfterCdc field.
     */
    public void setWorkitemsProcessedAfterCdc(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSPROCESSEDAFTERCDC_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsProcessedAfterError field.
     */
    public void setWorkitemsProcessedAfterError(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSPROCESSEDAFTERERROR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkitemsSkipped field.
     */
    public void setWorkitemsSkipped(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKITEMSSKIPPED_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.profiler.ProfilerDataSourceInternal", "com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.workqueue.InstrumentedWorkerTaskPublicMethods", "com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskImpl");
    config.put("com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskInternalMethods", "com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.entity.DoesNotValidateOnCommit", "com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskImpl");
    config.put("gw.api.profiler.ProfilerDataSource", "com.guidewire.pl.domain.workqueue.impl.InstrumentedWorkerTaskImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.InstrumentedWorkerTask.class, config);
    com.guidewire._generated.entity.InstrumentedWorkerTaskInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.InstrumentedWorkerTask, com.guidewire._generated.entity.InstrumentedWorkerTaskInternal>() {
      public java.lang.Object getImplementation(entity.InstrumentedWorkerTask bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.InstrumentedWorkerTaskInternal getInternalInterface(entity.InstrumentedWorkerTask bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.InstrumentedWorkerTask newEmptyInstance() {
        return new entity.InstrumentedWorkerTask((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
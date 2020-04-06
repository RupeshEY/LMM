package entity;

/**
 * UpgradeInstance
 * Upgrade history.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeInstance.eti;UpgradeInstance.eix;UpgradeInstance.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UpgradeInstance")
public class UpgradeInstance extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.TimedUpgraderObject, com.guidewire.commons.profiler.ProfilerDataSourceInternal, com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider, com.guidewire.pl.system.database.upgrade.info.IUpgradeInstanceInfo {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UpgradeInstance> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UpgradeInstance>("entity.UpgradeInstance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BACKEDOUT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BackedOut");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DBMSDUMPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DBMSDumps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATABASEENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DatabaseEndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATABASESTARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DatabaseStartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEFDTASKSCOMPLETED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DefdTasksCompleted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECDURATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecDuration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAILED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Failed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMDEFDTASKSCOMPLETED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumDefdTasksCompleted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFILERDATA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfilerData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESUMED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Resumed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REVERSEMIGRATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReverseMigration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROLLING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Rolling");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEAPPMAJORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceAppMajorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEAPPMINORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceAppMinorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEBUILDVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceBuildVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEEXTENSIONSVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceExtensionsVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEPLMAJORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourcePlMajorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEPLMINORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourcePlMinorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETAPPMAJORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetAppMajorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETAPPMINORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetAppMinorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETBUILDVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetBuildVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETCHECKSUM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetChecksum");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETEXTENSIONSVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetExtensionsVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETPLMAJORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetPlMajorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETPLMINORVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetPlMinorVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALNUMDEFDTASKS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalNumDefdTasks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATESTATISTICS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateStatistics");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPGRADEDBSTORAGESETS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpgradeDBStorageSets");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPGRADEROWCOUNTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpgradeRowCounts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPGRADETABLEREGISTRIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpgradeTableRegistries");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UpgradeInstanceInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UpgradeInstance()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UpgradeInstance(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UpgradeInstance(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UpgradeInstanceInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UpgradeInstanceInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the DBMSDumps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDBMSDumps(entity.UpgradeVTDBMSDump element) {
    __getInternalInterface().addArrayElement(DBMSDUMPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpgradeDBStorageSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSets(entity.UpgradeDBStorageSet element) {
    __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpgradeRowCounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeRowCounts(entity.UpgradeRowCount element) {
    __getInternalInterface().addArrayElement(UPGRADEROWCOUNTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpgradeTableRegistries array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeTableRegistries(entity.UpgradeTableRegistry element) {
    __getInternalInterface().addArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), element);
  }
  
  /**
   * 
   * @return a "provider" for the source version
   */
  public com.guidewire.commons.metadata.internal.properties2.MetadataVersions asMetadataVersionProviderForSource() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).asMetadataVersionProviderForSource();
  }
  
  /**
   * 
   * @return a "provider" for the target version
   */
  public com.guidewire.commons.metadata.internal.properties2.MetadataVersions asMetadataVersionProviderForTarget() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).asMetadataVersionProviderForTarget();
  }
  
  /**
   * Delete all children of this key diretly with DELETE statements.  The child
   * beans of this bean cannot be cached.
   */
  public void deleteAllChildren() {
    ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).deleteAllChildren();
  }
  
  /**
   * Returns all UpgradeDBStorageSet beans for the selected UpgradeInstance
   * @param afterUpgrade 
   * @return QueryProcessor of type UpgradeDBStorageSet
   */
  public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSet> findUpgradeDBStorageSets(boolean afterUpgrade) {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeDBStorageSets(afterUpgrade);
  }
  
  /**
   * Returns all UpgradeRowCount beans for the selected UpgradeInstance in
   * time order
   * @return QueryProcessor of type UpgradeRowCount
   */
  public gw.api.database.IQueryBeanResult<entity.UpgradeRowCount> findUpgradeRowCounts() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeRowCounts();
  }
  
  /**
   * Returns all UpgradeTableRegistry beans for the selected UpgradeInstance in
   * time order
   * @return QueryProcessor of type UpgradeTableRegistry
   */
  public gw.api.database.IQueryBeanResult<entity.UpgradeTableRegistry> findUpgradeTableRegistries() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeTableRegistries();
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
   * Gets the value of the DBMSDumps field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeVTDBMSDump[] getDBMSDumps() {
    return (entity.UpgradeVTDBMSDump[])__getInternalInterface().getFieldValue(DBMSDUMPS_PROP.get());
  }
  
  /**
   * Gets the value of the DatabaseEndTime field.
   * Timestamp when the database portion of the upgrade ended
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatabaseEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATABASEENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the DatabaseStartTime field.
   * Timestamp when the database portion of the upgrade started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatabaseStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATABASESTARTTIME_PROP.get());
  }
  
  public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
    return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
  }
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the timing completed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ExecDuration field.
   * Execution duration in seconds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecDuration() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECDURATION_PROP.get());
  }
  
  public java.lang.Integer getExecDurationInSeconds() {
    return ((com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider)__getDelegateManager().getImplementation("com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider")).getExecDurationInSeconds();
  }
  
  public java.lang.String getFormattedDatabaseDuration() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getFormattedDatabaseDuration();
  }
  
  public java.lang.String getFormattedTotalDuration() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getFormattedTotalDuration();
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
  }
  
  /**
   * 
   * @return User-friendly name
   */
  public java.lang.String getName() {
    return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
  }
  
  /**
   * Gets the value of the NumDefdTasksCompleted field.
   * Number of completed deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDefdTasksCompleted() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMDEFDTASKSCOMPLETED_PROP.get());
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
   * Gets the value of the SourceAppMajorVersion field.
   * Application major version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceAppMajorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEAPPMAJORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the SourceAppMinorVersion field.
   * Application minor version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceAppMinorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEAPPMINORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the SourceBuildVersion field.
   * Build version string from source configuration which includes app version and customer version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceBuildVersion() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SOURCEBUILDVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the SourceExtensionsVersion field.
   * Extension version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceExtensionsVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEEXTENSIONSVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the SourcePlMajorVersion field.
   * Platform major version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourcePlMajorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEPLMAJORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the SourcePlMinorVersion field.
   * Platform minor version of source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourcePlMinorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEPLMINORVERSION_PROP.get());
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
   * Timestamp when the timing began
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TargetAppMajorVersion field.
   * Application major version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetAppMajorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETAPPMAJORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the TargetAppMinorVersion field.
   * Application minor version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetAppMinorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETAPPMINORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the TargetBuildVersion field.
   * Build version string from target configuration which includes app version and customer version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetBuildVersion() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETBUILDVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the TargetChecksum field.
   * Checksum of target configuration (only valid if Rolling == true)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetChecksum() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETCHECKSUM_PROP.get());
  }
  
  /**
   * Gets the value of the TargetExtensionsVersion field.
   * Extension version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetExtensionsVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETEXTENSIONSVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the TargetPlMajorVersion field.
   * Platform major version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetPlMajorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETPLMAJORVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the TargetPlMinorVersion field.
   * Platform minor version of target
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetPlMinorVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETPLMINORVERSION_PROP.get());
  }
  
  public java.lang.Integer getTotalAnalyzedDurationOfParentContainer() {
    return ((com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider)__getDelegateManager().getImplementation("com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider")).getTotalAnalyzedDurationOfParentContainer();
  }
  
  /**
   * Gets the value of the TotalNumDefdTasks field.
   * Total number of deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalNumDefdTasks() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALNUMDEFDTASKS_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeDBStorageSets field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSet[] getUpgradeDBStorageSets() {
    return (entity.UpgradeDBStorageSet[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETS_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeRowCounts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeRowCount[] getUpgradeRowCounts() {
    return (entity.UpgradeRowCount[])__getInternalInterface().getFieldValue(UPGRADEROWCOUNTS_PROP.get());
  }
  
  /**
   * Returns DatabaseParameterSets holding the UpgradeStorageSet comparisons for this UpgradeInstance in
   * time order
   * @return DatabaseParameterSet[]
   */
  public gw.api.database.DatabaseParameterSet[] getUpgradeStorageComparisons() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getUpgradeStorageComparisons();
  }
  
  /**
   * Gets the value of the UpgradeTableRegistries field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeTableRegistry[] getUpgradeTableRegistries() {
    return (entity.UpgradeTableRegistry[])__getInternalInterface().getFieldValue(UPGRADETABLEREGISTRIES_PROP.get());
  }
  
  /**
   * 
   * @return true if this object has at least one child bean
   */
  public boolean hasChild() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).hasChild();
  }
  
  /**
   * Gets the value of the BackedOut field.
   * Only applicable for a rolling upgrade. True if the rolling upgrade has been backed out
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBackedOut() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BACKEDOUT_PROP.get());
  }
  
  /**
   * Gets the value of the DefdTasksCompleted field.
   * Whether we completed the deferred upgrade tasks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDefdTasksCompleted() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DEFDTASKSCOMPLETED_PROP.get());
  }
  
  /**
   * 
   * @return Returns boolean representing whether AWR informatin should be downloaded for this upgrade instance
   */
  public boolean isDownloadAWR() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).isDownloadAWR();
  }
  
  /**
   * Gets the value of the Failed field.
   * Whether this upgrade failed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFailed() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FAILED_PROP.get());
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
   * Gets the value of the Resumed field.
   * Whether this upgrade was resumed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isResumed() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RESUMED_PROP.get());
  }
  
  /**
   * Gets the value of the ReverseMigration field.
   * Only applicable for a rolling upgrade. True if this schema migration backs out the previous upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReverseMigration() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(REVERSEMIGRATION_PROP.get());
  }
  
  /**
   * Gets the value of the Rolling field.
   * Whether this is a rolling upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRolling() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ROLLING_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateStatistics field.
   * Whether we updated statistics as part of this upgrade
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isUpdateStatistics() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(UPDATESTATISTICS_PROP.get());
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
   * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
   */
  public void removeFromDBMSDumps(entity.UpgradeVTDBMSDump element) {
    __getInternalInterface().removeArrayElement(DBMSDUMPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDBMSDumps(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DBMSDUMPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSets(entity.UpgradeDBStorageSet element) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSets(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeRowCounts(entity.UpgradeRowCount element) {
    __getInternalInterface().removeArrayElement(UPGRADEROWCOUNTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeRowCounts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPGRADEROWCOUNTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeTableRegistries(entity.UpgradeTableRegistry element) {
    __getInternalInterface().removeArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeTableRegistries(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the BackedOut field.
   */
  public void setBackedOut(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BACKEDOUT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DBMSDumps field.
   */
  public void setDBMSDumps(entity.UpgradeVTDBMSDump[] value) {
    __getInternalInterface().setFieldValue(DBMSDUMPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DatabaseEndTime field.
   */
  public void setDatabaseEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATABASEENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DatabaseStartTime field.
   */
  public void setDatabaseStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATABASESTARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DefdTasksCompleted field.
   */
  public void setDefdTasksCompleted(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DEFDTASKSCOMPLETED_PROP.get(), value);
  }
  
  /**
   * Sets boolean flag indicating whether AWR information should be downloaded for this upgrade instance
   * @param downloadAWR boolean value indicating whether AWR information should be downloaded
   */
  public void setDownloadAWR(boolean downloadAWR) {
    ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).setDownloadAWR(downloadAWR);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecDuration field.
   */
  public void setExecDuration(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXECDURATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Failed field.
   */
  public void setFailed(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FAILED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
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
   * Sets the value of the NumDefdTasksCompleted field.
   */
  public void setNumDefdTasksCompleted(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMDEFDTASKSCOMPLETED_PROP.get(), value);
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
   * Sets the value of the Resumed field.
   */
  public void setResumed(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RESUMED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReverseMigration field.
   */
  public void setReverseMigration(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(REVERSEMIGRATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Rolling field.
   */
  public void setRolling(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ROLLING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceAppMajorVersion field.
   */
  public void setSourceAppMajorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEAPPMAJORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceAppMinorVersion field.
   */
  public void setSourceAppMinorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEAPPMINORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceBuildVersion field.
   */
  public void setSourceBuildVersion(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SOURCEBUILDVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceExtensionsVersion field.
   */
  public void setSourceExtensionsVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEEXTENSIONSVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourcePlMajorVersion field.
   */
  public void setSourcePlMajorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEPLMAJORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourcePlMinorVersion field.
   */
  public void setSourcePlMinorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEPLMINORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetAppMajorVersion field.
   */
  public void setTargetAppMajorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETAPPMAJORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetAppMinorVersion field.
   */
  public void setTargetAppMinorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETAPPMINORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetBuildVersion field.
   */
  public void setTargetBuildVersion(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TARGETBUILDVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetChecksum field.
   */
  public void setTargetChecksum(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TARGETCHECKSUM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetExtensionsVersion field.
   */
  public void setTargetExtensionsVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETEXTENSIONSVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetPlMajorVersion field.
   */
  public void setTargetPlMajorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETPLMAJORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetPlMinorVersion field.
   */
  public void setTargetPlMinorVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETPLMINORVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalNumDefdTasks field.
   */
  public void setTotalNumDefdTasks(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TOTALNUMDEFDTASKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateStatistics field.
   */
  public void setUpdateStatistics(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(UPDATESTATISTICS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeDBStorageSets field.
   */
  public void setUpgradeDBStorageSets(entity.UpgradeDBStorageSet[] value) {
    __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeRowCounts field.
   */
  public void setUpgradeRowCounts(entity.UpgradeRowCount[] value) {
    __getInternalInterface().setFieldValue(UPGRADEROWCOUNTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeTableRegistries field.
   */
  public void setUpgradeTableRegistries(entity.UpgradeTableRegistry[] value) {
    __getInternalInterface().setFieldValue(UPGRADETABLEREGISTRIES_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UpgradeInstanceInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UpgradeInstance.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the DBMSDumps array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDBMSDumps(entity.UpgradeVTDBMSDump element) {
      __getInternalInterface().addArrayElement(DBMSDUMPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpgradeDBStorageSets array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpgradeDBStorageSets(entity.UpgradeDBStorageSet element) {
      __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpgradeRowCounts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpgradeRowCounts(entity.UpgradeRowCount element) {
      __getInternalInterface().addArrayElement(UPGRADEROWCOUNTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpgradeTableRegistries array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpgradeTableRegistries(entity.UpgradeTableRegistry element) {
      __getInternalInterface().addArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    /**
     * 
     * @return a "provider" for the source version
     */
    public com.guidewire.commons.metadata.internal.properties2.MetadataVersions asMetadataVersionProviderForSource() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).asMetadataVersionProviderForSource();
    }
    
    /**
     * 
     * @return a "provider" for the target version
     */
    public com.guidewire.commons.metadata.internal.properties2.MetadataVersions asMetadataVersionProviderForTarget() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).asMetadataVersionProviderForTarget();
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
    
    /**
     * Delete all children of this key diretly with DELETE statements.  The child
     * beans of this bean cannot be cached.
     */
    public void deleteAllChildren() {
      ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).deleteAllChildren();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * Returns all UpgradeDBStorageSet beans for the selected UpgradeInstance
     * @param afterUpgrade 
     * @return QueryProcessor of type UpgradeDBStorageSet
     */
    public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSet> findUpgradeDBStorageSets(boolean afterUpgrade) {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeDBStorageSets(afterUpgrade);
    }
    
    /**
     * Returns all UpgradeRowCount beans for the selected UpgradeInstance in
     * time order
     * @return QueryProcessor of type UpgradeRowCount
     */
    public gw.api.database.IQueryBeanResult<entity.UpgradeRowCount> findUpgradeRowCounts() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeRowCounts();
    }
    
    /**
     * Returns all UpgradeTableRegistry beans for the selected UpgradeInstance in
     * time order
     * @return QueryProcessor of type UpgradeTableRegistry
     */
    public gw.api.database.IQueryBeanResult<entity.UpgradeTableRegistry> findUpgradeTableRegistries() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).findUpgradeTableRegistries();
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
     * Gets the value of the DBMSDumps field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeVTDBMSDump[] getDBMSDumps() {
      return (entity.UpgradeVTDBMSDump[])__getInternalInterface().getFieldValue(DBMSDUMPS_PROP.get());
    }
    
    /**
     * Gets the value of the DatabaseEndTime field.
     * Timestamp when the database portion of the upgrade ended
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDatabaseEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATABASEENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the DatabaseStartTime field.
     * Timestamp when the database portion of the upgrade started
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDatabaseStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATABASESTARTTIME_PROP.get());
    }
    
    public gw.api.profiler.DbmsReportZipProvider getDbmsCounterZipProvider(java.lang.String reportId) {
      return ((com.guidewire.commons.profiler.ProfilerDataSourceInternal)__getDelegateManager().getImplementation("com.guidewire.commons.profiler.ProfilerDataSourceInternal")).getDbmsCounterZipProvider(reportId);
    }
    
    /**
     * Gets the value of the EndTime field.
     * Timestamp when the timing completed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ExecDuration field.
     * Execution duration in seconds
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExecDuration() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECDURATION_PROP.get());
    }
    
    public java.lang.Integer getExecDurationInSeconds() {
      return ((com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider)__getDelegateManager().getImplementation("com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider")).getExecDurationInSeconds();
    }
    
    public java.lang.String getFormattedDatabaseDuration() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getFormattedDatabaseDuration();
    }
    
    public java.lang.String getFormattedTotalDuration() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getFormattedTotalDuration();
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
     * Gets the value of the LockingColumn field.
     * Meaningless column for locking
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLockingColumn() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
    }
    
    /**
     * 
     * @return User-friendly name
     */
    public java.lang.String getName() {
      return ((gw.api.profiler.ProfilerDataSource)__getDelegateManager().getImplementation("gw.api.profiler.ProfilerDataSource")).getName();
    }
    
    /**
     * Gets the value of the NumDefdTasksCompleted field.
     * Number of completed deferred upgrade tasks
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumDefdTasksCompleted() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMDEFDTASKSCOMPLETED_PROP.get());
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
     * Gets the value of the SourceAppMajorVersion field.
     * Application major version of source
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourceAppMajorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEAPPMAJORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the SourceAppMinorVersion field.
     * Application minor version of source
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourceAppMinorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEAPPMINORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the SourceBuildVersion field.
     * Build version string from source configuration which includes app version and customer version
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSourceBuildVersion() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SOURCEBUILDVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the SourceExtensionsVersion field.
     * Extension version of source
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourceExtensionsVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEEXTENSIONSVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the SourcePlMajorVersion field.
     * Platform major version of source
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourcePlMajorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEPLMAJORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the SourcePlMinorVersion field.
     * Platform minor version of source
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourcePlMinorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEPLMINORVERSION_PROP.get());
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
     * Timestamp when the timing began
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the TargetAppMajorVersion field.
     * Application major version of target
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetAppMajorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETAPPMAJORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the TargetAppMinorVersion field.
     * Application minor version of target
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetAppMinorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETAPPMINORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the TargetBuildVersion field.
     * Build version string from target configuration which includes app version and customer version
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTargetBuildVersion() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETBUILDVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the TargetChecksum field.
     * Checksum of target configuration (only valid if Rolling == true)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTargetChecksum() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETCHECKSUM_PROP.get());
    }
    
    /**
     * Gets the value of the TargetExtensionsVersion field.
     * Extension version of target
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetExtensionsVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETEXTENSIONSVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the TargetPlMajorVersion field.
     * Platform major version of target
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetPlMajorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETPLMAJORVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the TargetPlMinorVersion field.
     * Platform minor version of target
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetPlMinorVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETPLMINORVERSION_PROP.get());
    }
    
    public java.lang.Integer getTotalAnalyzedDurationOfParentContainer() {
      return ((com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider)__getDelegateManager().getImplementation("com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider")).getTotalAnalyzedDurationOfParentContainer();
    }
    
    /**
     * Gets the value of the TotalNumDefdTasks field.
     * Total number of deferred upgrade tasks
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTotalNumDefdTasks() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALNUMDEFDTASKS_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeDBStorageSets field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeDBStorageSet[] getUpgradeDBStorageSets() {
      return (entity.UpgradeDBStorageSet[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETS_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeRowCounts field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeRowCount[] getUpgradeRowCounts() {
      return (entity.UpgradeRowCount[])__getInternalInterface().getFieldValue(UPGRADEROWCOUNTS_PROP.get());
    }
    
    /**
     * Returns DatabaseParameterSets holding the UpgradeStorageSet comparisons for this UpgradeInstance in
     * time order
     * @return DatabaseParameterSet[]
     */
    public gw.api.database.DatabaseParameterSet[] getUpgradeStorageComparisons() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).getUpgradeStorageComparisons();
    }
    
    /**
     * Gets the value of the UpgradeTableRegistries field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeTableRegistry[] getUpgradeTableRegistries() {
      return (entity.UpgradeTableRegistry[])__getInternalInterface().getFieldValue(UPGRADETABLEREGISTRIES_PROP.get());
    }
    
    /**
     * 
     * @return true if this object has at least one child bean
     */
    public boolean hasChild() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).hasChild();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the BackedOut field.
     * Only applicable for a rolling upgrade. True if the rolling upgrade has been backed out
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBackedOut() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BACKEDOUT_PROP.get());
    }
    
    /**
     * Gets the value of the DefdTasksCompleted field.
     * Whether we completed the deferred upgrade tasks
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDefdTasksCompleted() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DEFDTASKSCOMPLETED_PROP.get());
    }
    
    /**
     * 
     * @return Returns boolean representing whether AWR informatin should be downloaded for this upgrade instance
     */
    public boolean isDownloadAWR() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).isDownloadAWR();
    }
    
    /**
     * Gets the value of the Failed field.
     * Whether this upgrade failed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFailed() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FAILED_PROP.get());
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
     * Gets the value of the Resumed field.
     * Whether this upgrade was resumed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isResumed() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RESUMED_PROP.get());
    }
    
    /**
     * Gets the value of the ReverseMigration field.
     * Only applicable for a rolling upgrade. True if this schema migration backs out the previous upgrade
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReverseMigration() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REVERSEMIGRATION_PROP.get());
    }
    
    /**
     * Gets the value of the Rolling field.
     * Whether this is a rolling upgrade
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRolling() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ROLLING_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the UpdateStatistics field.
     * Whether we updated statistics as part of this upgrade
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isUpdateStatistics() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(UPDATESTATISTICS_PROP.get());
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
     * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
     */
    public void removeFromDBMSDumps(entity.UpgradeVTDBMSDump element) {
      __getInternalInterface().removeArrayElement(DBMSDUMPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DBMSDumps array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDBMSDumps(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DBMSDUMPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
     */
    public void removeFromUpgradeDBStorageSets(entity.UpgradeDBStorageSet element) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpgradeDBStorageSets array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpgradeDBStorageSets(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
     */
    public void removeFromUpgradeRowCounts(entity.UpgradeRowCount element) {
      __getInternalInterface().removeArrayElement(UPGRADEROWCOUNTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpgradeRowCounts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpgradeRowCounts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPGRADEROWCOUNTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
     */
    public void removeFromUpgradeTableRegistries(entity.UpgradeTableRegistry element) {
      __getInternalInterface().removeArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpgradeTableRegistries array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpgradeTableRegistries(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPGRADETABLEREGISTRIES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BackedOut field.
     */
    public void setBackedOut(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BACKEDOUT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DBMSDumps field.
     */
    public void setDBMSDumps(entity.UpgradeVTDBMSDump[] value) {
      __getInternalInterface().setFieldValue(DBMSDUMPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DatabaseEndTime field.
     */
    public void setDatabaseEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATABASEENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DatabaseStartTime field.
     */
    public void setDatabaseStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATABASESTARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DefdTasksCompleted field.
     */
    public void setDefdTasksCompleted(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DEFDTASKSCOMPLETED_PROP.get(), value);
    }
    
    /**
     * Sets boolean flag indicating whether AWR information should be downloaded for this upgrade instance
     * @param downloadAWR boolean value indicating whether AWR information should be downloaded
     */
    public void setDownloadAWR(boolean downloadAWR) {
      ((com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods")).setDownloadAWR(downloadAWR);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecDuration field.
     */
    public void setExecDuration(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXECDURATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Failed field.
     */
    public void setFailed(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FAILED_PROP.get(), value);
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
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
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
     * Sets the value of the NumDefdTasksCompleted field.
     */
    public void setNumDefdTasksCompleted(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMDEFDTASKSCOMPLETED_PROP.get(), value);
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
     * Sets the value of the Resumed field.
     */
    public void setResumed(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RESUMED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReverseMigration field.
     */
    public void setReverseMigration(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REVERSEMIGRATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Rolling field.
     */
    public void setRolling(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ROLLING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceAppMajorVersion field.
     */
    public void setSourceAppMajorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEAPPMAJORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceAppMinorVersion field.
     */
    public void setSourceAppMinorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEAPPMINORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceBuildVersion field.
     */
    public void setSourceBuildVersion(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SOURCEBUILDVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceExtensionsVersion field.
     */
    public void setSourceExtensionsVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEEXTENSIONSVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourcePlMajorVersion field.
     */
    public void setSourcePlMajorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEPLMAJORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourcePlMinorVersion field.
     */
    public void setSourcePlMinorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEPLMINORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetAppMajorVersion field.
     */
    public void setTargetAppMajorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETAPPMAJORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetAppMinorVersion field.
     */
    public void setTargetAppMinorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETAPPMINORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetBuildVersion field.
     */
    public void setTargetBuildVersion(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TARGETBUILDVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetChecksum field.
     */
    public void setTargetChecksum(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TARGETCHECKSUM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetExtensionsVersion field.
     */
    public void setTargetExtensionsVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETEXTENSIONSVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetPlMajorVersion field.
     */
    public void setTargetPlMajorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETPLMAJORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetPlMinorVersion field.
     */
    public void setTargetPlMinorVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETPLMINORVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalNumDefdTasks field.
     */
    public void setTotalNumDefdTasks(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TOTALNUMDEFDTASKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateStatistics field.
     */
    public void setUpdateStatistics(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(UPDATESTATISTICS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeDBStorageSets field.
     */
    public void setUpgradeDBStorageSets(entity.UpgradeDBStorageSet[] value) {
      __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeRowCounts field.
     */
    public void setUpgradeRowCounts(entity.UpgradeRowCount[] value) {
      __getInternalInterface().setFieldValue(UPGRADEROWCOUNTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeTableRegistries field.
     */
    public void setUpgradeTableRegistries(entity.UpgradeTableRegistry[] value) {
      __getInternalInterface().setFieldValue(UPGRADETABLEREGISTRIES_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.profiler.ProfilerDataSourceInternal", "com.guidewire.pl.domain.upgrader.impl.UpgradeInstanceImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.upgrader.UpgradeInstancePublicMethods", "com.guidewire.pl.domain.upgrader.impl.UpgradeInstanceImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.database.upgrade.info.IStartAndEndTimeProvider", "com.guidewire.pl.domain.upgrader.impl.UpgradeInstanceImpl");
    config.put("com.guidewire.pl.system.database.upgrade.info.IUpgradeInstanceInfo", "com.guidewire.pl.domain.upgrader.impl.UpgradeInstanceImpl");
    config.put("gw.api.profiler.ProfilerDataSource", "com.guidewire.pl.domain.upgrader.impl.UpgradeInstanceImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UpgradeInstance.class, config);
    com.guidewire._generated.entity.UpgradeInstanceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UpgradeInstance, com.guidewire._generated.entity.UpgradeInstanceInternal>() {
      public java.lang.Object getImplementation(entity.UpgradeInstance bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UpgradeInstanceInternal getInternalInterface(entity.UpgradeInstance bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UpgradeInstance newEmptyInstance() {
        return new entity.UpgradeInstance((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
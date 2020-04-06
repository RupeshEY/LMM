package entity;

/**
 * WorkflowStepStats
 * Workflow elapsed and execution time statistics aggregated by workflow step.  Elapsed time is the total time spent from step entry to completion.  Execution time is time spent on processing, excluding time spent waiting on triggers, activities, or timeouts.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowStepStats.eti;WorkflowStepStats.eix;WorkflowStepStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WorkflowStepStats")
public class WorkflowStepStats extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WorkflowStepStats> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WorkflowStepStats>("entity.WorkflowStepStats");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ELAPSEDTIMEMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ElapsedTimeMax");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ELAPSEDTIMEMEAN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ElapsedTimeMean");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ELAPSEDTIMEMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ElapsedTimeMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ELAPSEDTIMESTDDEV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ElapsedTimeStdDev");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECTIMEMEAN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecTimeMean");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECTIMEMIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecTimeMin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECTIMESTDDEV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecTimeStdDev");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECUTIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Executions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServerID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STEPNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StepName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WORKFLOWTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "WorkflowType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECTIMEMAX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "execTimeMax");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.WorkflowStepStatsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WorkflowStepStats()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WorkflowStepStats(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WorkflowStepStats(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.WorkflowStepStatsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.WorkflowStepStatsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ElapsedTimeMax field.
   * Maximum elapsed time spent processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMax() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMAX_PROP.get());
  }
  
  /**
   * Gets the value of the ElapsedTimeMean field.
   * Average elapsed time spent processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMean() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMEAN_PROP.get());
  }
  
  /**
   * Gets the value of the ElapsedTimeMin field.
   * Minimum elapsed time spent processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeMin() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMIN_PROP.get());
  }
  
  /**
   * Gets the value of the ElapsedTimeStdDev field.
   * Standard deviation of elapsed time spent processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getElapsedTimeStdDev() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMESTDDEV_PROP.get());
  }
  
  /**
   * Gets the value of the EndTime field.
   * End of the statistics aggregation period.  Statistics were computed from steps completing on or before this time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ExecTimeMean field.
   * Average system time spent actively processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeMean() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMEAN_PROP.get());
  }
  
  /**
   * Gets the value of the ExecTimeMin field.
   * Minimum system time spent actively processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeMin() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMIN_PROP.get());
  }
  
  /**
   * Gets the value of the ExecTimeStdDev field.
   * Standard deviation of system time spent actively processing occurrences of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExecTimeStdDev() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMESTDDEV_PROP.get());
  }
  
  /**
   * Gets the value of the Executions field.
   * Total number of steps that completed within the aggregation period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecutions() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECUTIONS_PROP.get());
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
   * Gets the value of the ProcessVersion field.
   * Version of the workflow process used, if this uses an internal workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getProcessVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PROCESSVERSION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ServerID field.
   * The app server ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
  }
  
  /**
   * Gets the value of the StartTime field.
   * Start of the statistics aggregation period.  Statistics were computed from steps completing after this time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the StepName field.
   * ID of the workflow step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStepName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STEPNAME_PROP.get());
  }
  
  /**
   * Gets the value of the WorkflowType field.
   * Type of the workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getWorkflowType() {
    return (typekey.Workflow)__getInternalInterface().getFieldValue(WORKFLOWTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the execTimeMax field.
   * Maximum system time spent actively processing any occurrence of this step, in millis.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getexecTimeMax() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMAX_PROP.get());
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
   * Returns the localized display name for the current step in the current locale
   */
  public java.lang.String localizedStepName() {
    return ((com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods")).localizedStepName();
  }
  
  /**
   * Returns the localized display name for the current step
   * @param language 
   */
  public java.lang.String localizedStepName(com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
    return ((com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods")).localizedStepName(language);
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
   * Sets the value of the ElapsedTimeMax field.
   */
  private void setElapsedTimeMax(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ELAPSEDTIMEMAX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ElapsedTimeMean field.
   */
  private void setElapsedTimeMean(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ELAPSEDTIMEMEAN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ElapsedTimeMin field.
   */
  private void setElapsedTimeMin(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ELAPSEDTIMEMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ElapsedTimeStdDev field.
   */
  private void setElapsedTimeStdDev(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ELAPSEDTIMESTDDEV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  private void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecTimeMean field.
   */
  private void setExecTimeMean(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXECTIMEMEAN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecTimeMin field.
   */
  private void setExecTimeMin(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXECTIMEMIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecTimeStdDev field.
   */
  private void setExecTimeStdDev(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXECTIMESTDDEV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Executions field.
   */
  private void setExecutions(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXECUTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the ProcessVersion field.
   */
  private void setProcessVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PROCESSVERSION_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ServerID field.
   */
  public void setServerID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  private void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StepName field.
   */
  private void setStepName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STEPNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkflowType field.
   */
  private void setWorkflowType(typekey.Workflow value) {
    __getInternalInterface().setFieldValue(WORKFLOWTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the execTimeMax field.
   */
  private void setexecTimeMax(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXECTIMEMAX_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WorkflowStepStatsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WorkflowStepStats.this.__getDelegateManager();
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
     * Gets the value of the ElapsedTimeMax field.
     * Maximum elapsed time spent processing any occurrence of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getElapsedTimeMax() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMAX_PROP.get());
    }
    
    /**
     * Gets the value of the ElapsedTimeMean field.
     * Average elapsed time spent processing occurrences of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getElapsedTimeMean() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMEAN_PROP.get());
    }
    
    /**
     * Gets the value of the ElapsedTimeMin field.
     * Minimum elapsed time spent processing any occurrence of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getElapsedTimeMin() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMEMIN_PROP.get());
    }
    
    /**
     * Gets the value of the ElapsedTimeStdDev field.
     * Standard deviation of elapsed time spent processing occurrences of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getElapsedTimeStdDev() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ELAPSEDTIMESTDDEV_PROP.get());
    }
    
    /**
     * Gets the value of the EndTime field.
     * End of the statistics aggregation period.  Statistics were computed from steps completing on or before this time.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ExecTimeMean field.
     * Average system time spent actively processing occurrences of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExecTimeMean() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMEAN_PROP.get());
    }
    
    /**
     * Gets the value of the ExecTimeMin field.
     * Minimum system time spent actively processing any occurrence of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExecTimeMin() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMIN_PROP.get());
    }
    
    /**
     * Gets the value of the ExecTimeStdDev field.
     * Standard deviation of system time spent actively processing occurrences of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExecTimeStdDev() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMESTDDEV_PROP.get());
    }
    
    /**
     * Gets the value of the Executions field.
     * Total number of steps that completed within the aggregation period.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExecutions() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECUTIONS_PROP.get());
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
     * Gets the value of the ProcessVersion field.
     * Version of the workflow process used, if this uses an internal workflow
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getProcessVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PROCESSVERSION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ServerID field.
     * The app server ID.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServerID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
    }
    
    /**
     * Gets the value of the StartTime field.
     * Start of the statistics aggregation period.  Statistics were computed from steps completing after this time.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the StepName field.
     * ID of the workflow step.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStepName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STEPNAME_PROP.get());
    }
    
    /**
     * Gets the value of the WorkflowType field.
     * Type of the workflow.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Workflow getWorkflowType() {
      return (typekey.Workflow)__getInternalInterface().getFieldValue(WORKFLOWTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the execTimeMax field.
     * Maximum system time spent actively processing any occurrence of this step, in millis.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getexecTimeMax() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXECTIMEMAX_PROP.get());
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
     * Returns the localized display name for the current step in the current locale
     */
    public java.lang.String localizedStepName() {
      return ((com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods")).localizedStepName();
    }
    
    /**
     * Returns the localized display name for the current step
     * @param language 
     */
    public java.lang.String localizedStepName(com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
      return ((com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods")).localizedStepName(language);
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
     * Sets the value of the ElapsedTimeMax field.
     */
    public void setElapsedTimeMax(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ELAPSEDTIMEMAX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ElapsedTimeMean field.
     */
    public void setElapsedTimeMean(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ELAPSEDTIMEMEAN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ElapsedTimeMin field.
     */
    public void setElapsedTimeMin(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ELAPSEDTIMEMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ElapsedTimeStdDev field.
     */
    public void setElapsedTimeStdDev(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ELAPSEDTIMESTDDEV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecTimeMean field.
     */
    public void setExecTimeMean(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXECTIMEMEAN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecTimeMin field.
     */
    public void setExecTimeMin(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXECTIMEMIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecTimeStdDev field.
     */
    public void setExecTimeStdDev(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXECTIMESTDDEV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Executions field.
     */
    public void setExecutions(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXECUTIONS_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the ProcessVersion field.
     */
    public void setProcessVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PROCESSVERSION_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ServerID field.
     */
    public void setServerID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StepName field.
     */
    public void setStepName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STEPNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkflowType field.
     */
    public void setWorkflowType(typekey.Workflow value) {
      __getInternalInterface().setFieldValue(WORKFLOWTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the execTimeMax field.
     */
    public void setexecTimeMax(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXECTIMEMAX_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.workflow.WorkflowStepStatsPublicMethods", "com.guidewire.pl.domain.workflow.impl.WorkflowStepStatsImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WorkflowStepStats.class, config);
    com.guidewire._generated.entity.WorkflowStepStatsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WorkflowStepStats, com.guidewire._generated.entity.WorkflowStepStatsInternal>() {
      public java.lang.Object getImplementation(entity.WorkflowStepStats bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WorkflowStepStatsInternal getInternalInterface(entity.WorkflowStepStats bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WorkflowStepStats newEmptyInstance() {
        return new entity.WorkflowStepStats((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
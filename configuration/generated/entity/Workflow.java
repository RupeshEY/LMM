package entity;

/**
 * Workflow
 * Table for workflow definitions
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Workflow.eti;Workflow.eix;Workflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class Workflow extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Workflow> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Workflow>("entity.Workflow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACTIVESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ActiveState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACTIVITIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Activities");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CALLER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Caller");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENTACTION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CurrentAction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTBRANCH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentBranch");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTSTEP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENTEREDSTEP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EnteredStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FORCETIMEOUTBRANCH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForceTimeoutBranch");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> HANDLER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Handler");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LOG_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Log");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOGENTRYCOUNTER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LogEntryCounter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MESSAGE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Message");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MESSAGEHISTORYID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MessageHistoryID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREVIOUSSTEP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PreviousStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STEPEXECTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StepExecTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SUBWORKFLOWSARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "SubWorkflowsArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TESTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TestTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TIMEOUTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TimeoutTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRIGGERINVOKED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TriggerInvoked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.WorkflowInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  protected Workflow(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.WorkflowInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.WorkflowInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToActivities(entity.Activity element) {
    __getInternalInterface().addArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Log array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToLog(entity.WorkflowLogEntry element) {
    __getInternalInterface().addArrayElement(LOG_PROP.get(), element);
  }
  
  /**
   * Handle the resuming of the Indicates to the workflow that it is okay to proceed.  It is similiar to resume, except that it
   * does nothing if the workflow is in an error state.
   */
  public void advance() {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).advance();
  }
  
  /**
   * Create and start a subflow.  If the subflow has a common super type, the common super type's properties
   * are copied into the new workflow.
   * @param type the type of subflow to create.
   * @throws IllegalArgumentException if the type is abstract
   * @return the newly created and started subflow.
   */
  public entity.Workflow createSubFlow(typekey.Workflow type) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).createSubFlow(type);
  }
  
  /**
   * Create and start a subflow of the specified version.
   * If the subflow has a common super type, the common super type's properties are copied into the new workflow.
   * @param type the type of subflow to create.
   * @param version the version
   * @throws IllegalArgumentException if the type is abstract or the process version for the specified type does not exist
   * @return the newly created and started subflow.
   */
  public entity.Workflow createSubFlow(typekey.Workflow type, java.lang.Integer version) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).createSubFlow(type, version);
  }
  
  /**
   * This will find the active work item for this workflow if it exists
   */
  public gw.api.database.IQueryBeanResult<entity.WorkflowWorkItem> findWorkflowWorkItems() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).findWorkflowWorkItems();
  }
  
  /**
   * Gets the value of the ActiveState field.
   * Specific state of this workflow if active (e.g. running, waitmanual, waitactivity).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActiveState getActiveState() {
    return (typekey.WorkflowActiveState)__getInternalInterface().getFieldValue(ACTIVESTATE_PROP.get());
  }
  
  /**
   * This will find the active work item for this workflow if it exists
   */
  public entity.WorkflowWorkItem getActiveWorkflowWorkItem() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getActiveWorkflowWorkItem();
  }
  
  /**
   * Gets the value of the Activities field.
   * Active activities on this workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities() {
    return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Returns a list of available timeouts
   */
  public java.util.List<com.guidewire.pl.system.workflow.engine.config.WorkflowTimeout> getAvailableTimeouts() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getAvailableTimeouts();
  }
  
  /**
   * Returns a list of available triggers
   */
  public java.util.List<typekey.WorkflowTriggerKey> getAvailableTriggers() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getAvailableTriggers();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Caller field.
   * What workflow called this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getCaller() {
    return (entity.Workflow)__getInternalInterface().getFieldValue(CALLER_PROP.get());
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
   * Gets the value of the CurrentAction field.
   * What action is the Workflow currently trying to take?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActionType getCurrentAction() {
    return (typekey.WorkflowActionType)__getInternalInterface().getFieldValue(CURRENTACTION_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentBranch field.
   * ID of the branch the workflow is currently trying to execute.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentBranch() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CURRENTBRANCH_PROP.get());
  }
  
  /**
   * Gets the value of the CurrentStep field.
   * ID of the workflow's current step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentStep() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CURRENTSTEP_PROP.get());
  }
  
  /**
   * Gets the current time, which is normally the time from the SystemClock, but will
   * be the value of the "testTime" field if the Workflow's handler is internal
   */
  public java.util.Date getDateTime() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getDateTime();
  }
  
  /**
   * Will return the default language from this workflow.  Note that this
   * is used by WorkflowEngine to set the locale prior to executing
   * the workflow processing in advance.
   */
  public gw.i18n.ILocale getDefaultLanguage() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getDefaultLanguage();
  }
  
  /**
   * Will return the default locale from this workflow.  Note that this
   * is used by WorkflowEngine to set the locale prior to executing
   * the workflow processing in advance.
   */
  public gw.i18n.ILocale getDefaultLocale() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getDefaultLocale();
  }
  
  /**
   * Gets the value of the EnteredStep field.
   * Time when the Workflow entered the current step
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEnteredStep() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENTEREDSTEP_PROP.get());
  }
  
  /**
   * Gets the value of the ForceTimeoutBranch field.
   * ID of the next workflow timeout branch to take.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getForceTimeoutBranch() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FORCETIMEOUTBRANCH_PROP.get());
  }
  
  /**
   * Gets the value of the Handler field.
   * What infrastructure handles this Workflow?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowHandler getHandler() {
    return (typekey.WorkflowHandler)__getInternalInterface().getFieldValue(HANDLER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Log field.
   * Log of what work this Workflow has performed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkflowLogEntry[] getLog() {
    return (entity.WorkflowLogEntry[])__getInternalInterface().getFieldValue(LOG_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLogEntryCounter() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOGENTRYCOUNTER_PROP.get());
  }
  
  /**
   * Gets the value of the Message field.
   * Integration message associated with this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Message getMessage() {
    return (entity.Message)__getInternalInterface().getFieldValue(MESSAGE_PROP.get());
  }
  
  /**
   * This will get the MessageHistory record if it exists
   * @return MessageHistory record
   */
  public entity.MessageHistory getMessageHistory() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getMessageHistory();
  }
  
  /**
   * Gets the value of the MessageHistoryID field.
   * Completed integration message associated with this workflow
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMessageHistoryID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MESSAGEHISTORYID_PROP.get());
  }
  
  /**
   * Gets the value of the PreviousStep field.
   * ID of the step the workflow was on BEFORE the current step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPreviousStep() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PREVIOUSSTEP_PROP.get());
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * State of this workflow (e.g., 'started', 'completed', etc.)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowState getState() {
    return (typekey.WorkflowState)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the StepExecTime field.
   * Total system time spent actively processing the current step, in millis.  Does not include time spent waiting on triggers, activities, or timeouts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getStepExecTime() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(STEPEXECTIME_PROP.get());
  }
  
  /**
   * Gets all subflows created by the "createSubFlow" method
   */
  public entity.Workflow[] getSubFlows() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).getSubFlows();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubWorkflows[] getSubWorkflowsArray() {
    return (entity.SubWorkflows[])__getInternalInterface().getFieldValue(SUBWORKFLOWSARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getSubtype() {
    return (typekey.Workflow)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TestTime field.
   * What time the Workflow thinks it is
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTestTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TESTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TimeoutTime field.
   * Date/time when current step will time out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimeoutTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TIMEOUTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TriggerInvoked field.
   * Marks the key of a Trigger that was invoked, or null
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowTriggerKey getTriggerInvoked() {
    return (typekey.WorkflowTriggerKey)__getInternalInterface().getFieldValue(TRIGGERINVOKED_PROP.get());
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
   * Create but do not start a subflow of the specified version.  After you have finished populating the properties
   * of the workflow you should either start or startAsynchronously (with the apporpiate version if desired)
   * If the subflow has a common super type, the common super type's properties are copied into the new workflow.
   * @param type the type of subflow to create.
   * @throws IllegalArgumentException if the type is abstract
   * @return the newly created subflow.
   */
  public entity.Workflow instantiateSubFlow(typekey.Workflow type) throws java.lang.IllegalArgumentException {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).instantiateSubFlow(type);
  }
  
  /**
   * Tries to invoke a "manual trigger" in the Workflow, meaning an action initiated from outside
   * the Workflow itself.  In the case of an external Workflow, this will just update the "triggerInvoked"
   * field; in the case of an internal Workflow it will set the "triggerInvoked" field and advance the
   * workflow synchronously.
   * <p>
   * This is equivalent to calling invokeTrigger(triggerKey, true)
   * @param triggerKey 
   */
  public void invokeTrigger(typekey.WorkflowTriggerKey triggerKey) {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).invokeTrigger(triggerKey);
  }
  
  /**
   * Like {@link #invokeTrigger(typekey.WorkflowTriggerKey)} but with an extra parameter to control whether
   * the trigger should be evaluated synchronously (i.e. immediately in the current bundle) or
   * else in the background.
   * @param triggerKey 
   * @param synchronous if true, executes trigger immediately; otherwise in the background
   */
  public void invokeTrigger(typekey.WorkflowTriggerKey triggerKey, boolean synchronous) {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).invokeTrigger(triggerKey, synchronous);
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
   * True if the given trigger is available in the Workflow; i.e. if it is OK to pass the
   * trigger ID to the invokeTrigger method
   * @param triggerKey 
   */
  public boolean isTriggerAvailable(typekey.WorkflowTriggerKey triggerKey) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).isTriggerAvailable(triggerKey);
  }
  
  /**
   * Returns the localized display name for the given branch in the given step in the current locale
   * @param stepId 
   * @param branchId 
   */
  public java.lang.String localizedBranchName(java.lang.String stepId, java.lang.String branchId) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedBranchName(stepId, branchId);
  }
  
  /**
   * Returns the localized display name for the given branch in the given step in the given locale
   * @param stepId 
   * @param branchId 
   * @param language 
   */
  public java.lang.String localizedBranchName(java.lang.String stepId, java.lang.String branchId, com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedBranchName(stepId, branchId, language);
  }
  
  /**
   * Returns the localized display name for the current step in the current locale
   */
  public java.lang.String localizedCurrentStepName() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedCurrentStepName();
  }
  
  /**
   * Returns the localized display name for the current step
   * @param language 
   */
  public java.lang.String localizedCurrentStepName(com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedCurrentStepName(language);
  }
  
  /**
   * Returns the localized display name for the previous step in the current locale
   */
  public java.lang.String localizedPreviousStepName() {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedPreviousStepName();
  }
  
  /**
   * Returns the localized display name for the previous step
   * @param language 
   */
  public java.lang.String localizedPreviousStepName(com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedPreviousStepName(language);
  }
  
  /**
   * Returns the localized display name for the given step in the current locale
   * @param stepId 
   */
  public java.lang.String localizedStepName(java.lang.String stepId) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedStepName(stepId);
  }
  
  /**
   * Returns the localized display name for the given step in the given locale
   * @param stepId 
   * @param language 
   */
  public java.lang.String localizedStepName(java.lang.String stepId, com.guidewire.commons.metadata.i18n.config.GWLanguage language) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).localizedStepName(stepId, language);
  }
  
  /**
   * Logs an item of information about the Workflow.  The entry is returned in case you want
   * to set additional fields on it.
   * @param summary a short (about 10 word max) summary of what happened
   * @param description a longer description, which may include details like a stack trace
   * @return the log entry
   */
  public entity.WorkflowLogEntry log(java.lang.String summary, java.lang.String description) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).log(summary, description);
  }
  
  /**
   * Logs a display key so that an argument can be constructed.
   * @param key the display key
   * @param arg a piece of information for the display key
   * @return the log entry
   */
  public entity.WorkflowLogEntry logAction(com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).logAction(key, arg);
  }
  
  /**
   * Logs an action after the action has been accomplished, to recapture the step and action.
   * 
   * Implementation note: the localization arguments ars are { Step, Action, arg }
   * @param stepId the step being executed
   * @param action the action being executed
   * @param key the display key
   * @param arg a piece of information for the display key
   * @return the log entry
   */
  public entity.WorkflowLogEntry logAfterAction(java.lang.String stepId, typekey.WorkflowActionType action, com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).logAfterAction(stepId, action, key, arg);
  }
  
  /**
   * Logs an item of information about the Workflow.  The entry is returned in case you want
   * to set additional fields on it.
   * 
   * Implementation note: the localization arguments are { arg, summary }
   * @param key 
   * @param arg 
   * @param summary a short (about 10 word max) summary of what happened
   * @param description a longer description, which may include details like a stack trace
   * @return the log entry
   */
  public entity.WorkflowLogEntry logText(com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg, java.lang.String summary, java.lang.String description) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).logText(key, arg, summary, description);
  }
  
  /**
   * Logs a user action display key so that an argument can be constructed.
   * 
   * Implementation note:  the localization arguments args are {User, Arg}
   * @param user the user performing the action
   * @param key the display key
   * @param arg a piece of information for the display key
   * @return the log entry
   */
  public entity.WorkflowLogEntry logUser(entity.User user, com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
    return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).logUser(user, key, arg);
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
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromActivities(entity.Activity element) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Log array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromLog(entity.WorkflowLogEntry element) {
    __getInternalInterface().removeArrayElement(LOG_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Log array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLog(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(LOG_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ActiveState field.
   */
  private void setActiveState(typekey.WorkflowActiveState value) {
    __getInternalInterface().setFieldValue(ACTIVESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Activities field.
   */
  private void setActivities(entity.Activity[] value) {
    __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Caller field.
   */
  private void setCaller(entity.Workflow value) {
    __getInternalInterface().setFieldValue(CALLER_PROP.get(), value);
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
   * Sets the value of the CurrentAction field.
   */
  private void setCurrentAction(typekey.WorkflowActionType value) {
    __getInternalInterface().setFieldValue(CURRENTACTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentBranch field.
   */
  private void setCurrentBranch(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CURRENTBRANCH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentStep field.
   */
  private void setCurrentStep(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CURRENTSTEP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EnteredStep field.
   */
  private void setEnteredStep(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENTEREDSTEP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForceTimeoutBranch field.
   */
  private void setForceTimeoutBranch(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FORCETIMEOUTBRANCH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Handler field.
   */
  private void setHandler(typekey.WorkflowHandler value) {
    __getInternalInterface().setFieldValue(HANDLER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Log field.
   */
  private void setLog(entity.WorkflowLogEntry[] value) {
    __getInternalInterface().setFieldValue(LOG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LogEntryCounter field.
   */
  private void setLogEntryCounter(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOGENTRYCOUNTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Message field.
   */
  private void setMessage(entity.Message value) {
    __getInternalInterface().setFieldValue(MESSAGE_PROP.get(), value);
  }
  
  /**
   * This will set the MessageHistory record if it exists
   * @param message 
   * @return MessageHistory record
   */
  public void setMessageHistory(entity.MessageHistory message) {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).setMessageHistory(message);
  }
  
  /**
   * Sets the value of the MessageHistoryID field.
   */
  private void setMessageHistoryID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MESSAGEHISTORYID_PROP.get(), value);
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
   * Sets the value of the PreviousStep field.
   */
  private void setPreviousStep(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PREVIOUSSTEP_PROP.get(), value);
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
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  private void setState(typekey.WorkflowState value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StepExecTime field.
   */
  private void setStepExecTime(java.lang.Long value) {
    __getInternalInterface().setFieldValue(STEPEXECTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubWorkflowsArray field.
   */
  private void setSubWorkflowsArray(entity.SubWorkflows[] value) {
    __getInternalInterface().setFieldValue(SUBWORKFLOWSARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.Workflow value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TestTime field.
   */
  private void setTestTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(TESTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TimeoutTime field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setTimeoutTime(java.util.Date value) {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).setTimeoutTime(value);
  }
  
  /**
   * Sets the value of the TriggerInvoked field.
   */
  private void setTriggerInvoked(typekey.WorkflowTriggerKey value) {
    __getInternalInterface().setFieldValue(TRIGGERINVOKED_PROP.get(), value);
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
   * Start the workflow.
   */
  public void start() {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).start();
  }
  
  /**
   * Start the workflow with the specified process version.
   * @param version the process version
   * @throws IllegalArgumentException if the process version for the workflow does not exist.
   */
  public void start(java.lang.Integer version) throws java.lang.IllegalArgumentException {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).start(version);
  }
  
  /**
   * Start the workflow asynchronously.
   */
  public void startAsynchronously() {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).startAsynchronously();
  }
  
  /**
   * Start the workflow with the specified process version asynchronously.
   * @param version the process version
   * @throws IllegalArgumentException if the process version for the workflow does not exist.
   */
  public void startAsynchronously(java.lang.Integer version) throws java.lang.IllegalArgumentException {
    ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).startAsynchronously(version);
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
    com.guidewire._generated.entity.WorkflowInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.Workflow, com.guidewire._generated.entity.WorkflowInternal>() {
      public java.lang.Object getImplementation(entity.Workflow bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WorkflowInternal getInternalInterface(entity.Workflow bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}
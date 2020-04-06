package entity;

/**
 * MetroReportWorkflow
 * Workflows related to metro reports
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReportWorkflow.eti;MetroReportWorkflow.eix;MetroReportWorkflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MetroReportWorkflow")
public class MetroReportWorkflow extends entity.ClaimWorkflow {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MetroReportWorkflow> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MetroReportWorkflow>("entity.MetroReportWorkflow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> METROREPORT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "MetroReport");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MetroReportWorkflow()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MetroReportWorkflow(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MetroReportWorkflow(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.MetroReportWorkflowInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.MetroReportWorkflowInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.MetroReportWorkflowInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the MetroReport field.
   * The Metro Report with which this workflow is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MetroReport getMetroReport() {
    return (entity.MetroReport)__getInternalInterface().getFieldValue(METROREPORT_PROP.get());
  }
  
  /**
   * Sets the value of the MetroReport field.
   */
  public void setMetroReport(entity.MetroReport value) {
    __getInternalInterface().setFieldValue(METROREPORT_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MetroReportWorkflowInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MetroReportWorkflow.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToActivities(entity.Activity element) {
      __getInternalInterface().addArrayElement(ACTIVITIES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Log array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLog(entity.WorkflowLogEntry element) {
      __getInternalInterface().addArrayElement(LOG_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SubWorkflowsArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSubWorkflowsArray(entity.SubWorkflows element) {
      __getInternalInterface().addArrayElement(SUBWORKFLOWSARRAY_PROP.get(), element);
    }
    
    /**
     * Handle the resuming of the Indicates to the workflow that it is okay to proceed.  It is similiar to resume, except that it
     * does nothing if the workflow is in an error state.
     */
    public void advance() {
      ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).advance();
    }
    
    public void advanceSynchronously() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).advanceSynchronously();
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
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
    
    public void complete() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).complete();
    }
    
    public entity.Message createMessage(int destID, java.lang.String eventName) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).createMessage(destID, eventName);
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
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * This will find the active work item for this workflow if it exists
     */
    public gw.api.database.IQueryBeanResult<entity.WorkflowWorkItem> findWorkflowWorkItems() {
      return ((com.guidewire.pl.domain.workflow.WorkflowPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowPublicMethods")).findWorkflowWorkItems();
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
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
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
    
    public gw.pl.persistence.core.Key getCallerID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CALLER_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * The Claim with which this workflow is associated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
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
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
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
     * Gets the value of the LogEntryCounter field.
     * Counter for assigning a sort order to log entries
     */
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
    
    public gw.pl.persistence.core.Key getMessageID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MESSAGE_PROP.get());
    }
    
    /**
     * Gets the value of the MetroReport field.
     * The Metro Report with which this workflow is associated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.MetroReport getMetroReport() {
      return (entity.MetroReport)__getInternalInterface().getFieldValue(METROREPORT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getMetroReportID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(METROREPORT_PROP.get());
    }
    
    public entity.WorkflowLogEntry[] getOrderedLogEntries() {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).getOrderedLogEntries();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
     * Gets the value of the SubWorkflowsArray field.
     */
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
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public void goToStep(java.lang.String nextStep) {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).goToStep(nextStep);
    }
    
    public boolean hasOpenActivities() {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).hasOpenActivities();
    }
    
    /**
     * Set defaults for the workflow's activity:
     * -status is open
     * -previous user is current user.
     * -set the claim on the activity to be the one referenced by the workflow.
     * @param activity the activity to initialize
     */
    public void initActivity(entity.Activity activity) {
      ((gw.cc.workflow.entity.ClaimWorkflow)__getDelegateManager().getImplementation("gw.cc.workflow.entity.ClaimWorkflow")).initActivity(activity);
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    public boolean isActive() {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).isActive();
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
    
    public entity.WorkflowLogEntry logActionDebug(com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).logActionDebug(key, arg);
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
    
    public entity.WorkflowLogEntry logAfterActionDebug(java.lang.String stepId, typekey.WorkflowActionType action, com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).logAfterActionDebug(stepId, action, key, arg);
    }
    
    public entity.WorkflowLogEntry logDebug(java.lang.String summary, java.lang.String description) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).logDebug(summary, description);
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
    
    public entity.WorkflowLogEntry logTextDebug(com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg, java.lang.String summary, java.lang.String description) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).logTextDebug(key, arg, summary, description);
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
    
    public entity.WorkflowLogEntry logUserDebug(entity.User user, com.guidewire.pl.system.locale.DisplayKey key, java.lang.Integer arg) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).logUserDebug(user, key, arg);
    }
    
    public entity.Activity newActivity(entity.ActivityPattern pattern) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).newActivity(pattern);
    }
    
    public entity.Activity newNotification(entity.ActivityPattern pattern) {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).newNotification(pattern);
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
    
    public void recordStepStats() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).recordStepStats();
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
     * Removes the given element from the Activities array. This is achieved by marking the element for removal.
     */
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
     */
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
     * Removes the given element from the SubWorkflowsArray array. This is achieved by marking the element for removal.
     */
    public void removeFromSubWorkflowsArray(entity.SubWorkflows element) {
      __getInternalInterface().removeArrayElement(SUBWORKFLOWSARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SubWorkflowsArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSubWorkflowsArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SUBWORKFLOWSARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void resume() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).resume();
    }
    
    /**
     * Sets the value of the ActiveState field.
     */
    public void setActiveState(typekey.WorkflowActiveState value) {
      __getInternalInterface().setFieldValue(ACTIVESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Activities field.
     */
    public void setActivities(entity.Activity[] value) {
      __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
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
     * Sets the value of the Caller field.
     */
    public void setCaller(entity.Workflow value) {
      __getInternalInterface().setFieldValue(CALLER_PROP.get(), value);
    }
    
    public void setCallerID(gw.pl.persistence.core.Key value) {
      setFieldValue(CALLER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
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
     * Sets the value of the CurrentAction field.
     */
    public void setCurrentAction(typekey.WorkflowActionType value) {
      __getInternalInterface().setFieldValue(CURRENTACTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentBranch field.
     */
    public void setCurrentBranch(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CURRENTBRANCH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentStep field.
     */
    public void setCurrentStep(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CURRENTSTEP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EnteredStep field.
     */
    public void setEnteredStep(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENTEREDSTEP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForceTimeoutBranch field.
     */
    public void setForceTimeoutBranch(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FORCETIMEOUTBRANCH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Handler field.
     */
    public void setHandler(typekey.WorkflowHandler value) {
      __getInternalInterface().setFieldValue(HANDLER_PROP.get(), value);
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
     * Sets the value of the Log field.
     */
    public void setLog(entity.WorkflowLogEntry[] value) {
      __getInternalInterface().setFieldValue(LOG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LogEntryCounter field.
     */
    public void setLogEntryCounter(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOGENTRYCOUNTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Message field.
     */
    public void setMessage(entity.Message value) {
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
    public void setMessageHistoryID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MESSAGEHISTORYID_PROP.get(), value);
    }
    
    public void setMessageID(gw.pl.persistence.core.Key value) {
      setFieldValue(MESSAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroReport field.
     */
    public void setMetroReport(entity.MetroReport value) {
      __getInternalInterface().setFieldValue(METROREPORT_PROP.get(), value);
    }
    
    public void setMetroReportID(gw.pl.persistence.core.Key value) {
      setFieldValue(METROREPORT_PROP.get(), value);
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
    public void setPreviousStep(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PREVIOUSSTEP_PROP.get(), value);
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
     * Sets the value of the State field.
     */
    public void setState(typekey.WorkflowState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StepExecTime field.
     */
    public void setStepExecTime(java.lang.Long value) {
      __getInternalInterface().setFieldValue(STEPEXECTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubWorkflowsArray field.
     */
    public void setSubWorkflowsArray(entity.SubWorkflows[] value) {
      __getInternalInterface().setFieldValue(SUBWORKFLOWSARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Workflow value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TestTime field.
     */
    public void setTestTime(java.util.Date value) {
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
    public void setTriggerInvoked(typekey.WorkflowTriggerKey value) {
      __getInternalInterface().setFieldValue(TRIGGERINVOKED_PROP.get(), value);
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
    
    public void skipAndDetachActivities() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).skipAndDetachActivities();
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
    
    public void start(typekey.WorkflowHandler handler, java.lang.Integer version) {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).start(handler, version);
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
    
    public void startStepTimerIfNotRunning() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).startStepTimerIfNotRunning();
    }
    
    public void stopStepTimer() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).stopStepTimer();
    }
    
    public void suspend() {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).suspend();
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
    
    public boolean waitingForMessageReply() {
      return ((com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods")).waitingForMessageReply();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.workflow.WorkflowPublicMethods", "com.guidewire.pl.domain.workflow.impl.WorkflowImpl");
    config.put("com.guidewire.pl.domain.workflow.impl.WorkflowInternalMethods", "com.guidewire.pl.domain.workflow.impl.WorkflowImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.pl.domain.workflow.impl.WorkflowImpl");
    config.put("gw.cc.workflow.entity.ClaimWorkflow", "com.guidewire.cc.domain.workflow.impl.MetroReportWorkflowImpl");
    config.put("gw.cc.workflow.entity.MetroReportWorkflow", "com.guidewire.cc.domain.workflow.impl.MetroReportWorkflowImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MetroReportWorkflow.class, config);
    com.guidewire._generated.entity.MetroReportWorkflowInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MetroReportWorkflow, com.guidewire._generated.entity.MetroReportWorkflowInternal>() {
      public java.lang.Object getImplementation(entity.MetroReportWorkflow bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MetroReportWorkflowInternal getInternalInterface(entity.MetroReportWorkflow bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MetroReportWorkflow newEmptyInstance() {
        return new entity.MetroReportWorkflow((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
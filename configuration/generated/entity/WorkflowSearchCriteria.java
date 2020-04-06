package entity;

/**
 * WorkflowSearchCriteria
 * Search criteria used for workflow searches.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkflowSearchCriteria.eti;WorkflowSearchCriteria.eix;WorkflowSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WorkflowSearchCriteria")
public class WorkflowSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WorkflowSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WorkflowSearchCriteria>("entity.WorkflowSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACTIVESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ActiveState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKEDOUT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckedOut");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CURRENTSTEP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CurrentStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> HANDLER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Handler");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Parent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATEFROM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDateFrom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATETO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDateTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATEDATEFROM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateDateFrom");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATEDATETO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateDateTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> WORKFLOWTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Workflowtype");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.WorkflowSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WorkflowSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WorkflowSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WorkflowSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.WorkflowSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.WorkflowSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ActiveState field.
   * The specific state of the workflow if it's active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowActiveState getActiveState() {
    return (typekey.WorkflowActiveState)__getInternalInterface().getFieldValue(ACTIVESTATE_PROP.get());
  }
  
  /**
   * Returns all the step ids available for the specified workflow subtype and version
   * @return all the step ids
   */
  public java.lang.String[] getAvailableSteps() {
    return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableSteps();
  }
  
  /**
   * Returns all the workflow subtypes that are not abstract.
   * @return all the workflow subtypes that are not abstract.
   */
  public typekey.Workflow[] getAvailableTypes() {
    return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableTypes();
  }
  
  /**
   * Returns all the versions available for the given subtype
   * @return all the versions
   */
  public java.lang.Integer[] getAvailableVersions() {
    return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableVersions();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CurrentStep field.
   * Name of the current step the workflow is on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCurrentStep() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CURRENTSTEP_PROP.get());
  }
  
  /**
   * Gets the value of the Handler field.
   * What infrastructure component is handling the workflow?
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
   * Gets the value of the Parent field.
   * The workflow's parent workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Workflow getParent() {
    return (entity.Workflow)__getInternalInterface().getFieldValue(PARENT_PROP.get());
  }
  
  /**
   * Gets the value of the ProcessVersion field.
   * The version number of the workflow definition.
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
   * Gets the value of the StartDateFrom field.
   * Start date lower bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDateFrom() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATEFROM_PROP.get());
  }
  
  /**
   * Gets the value of the StartDateTo field.
   * Start date upper bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDateTo() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATETO_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * The workflow's current state.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkflowState getState() {
    return (typekey.WorkflowState)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateDateFrom field.
   * Update date lower bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateDateFrom() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATEDATEFROM_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateDateTo field.
   * Update date upper bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateDateTo() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATEDATETO_PROP.get());
  }
  
  /**
   * Gets the value of the Workflowtype field.
   * The type of the workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getWorkflowtype() {
    return (typekey.Workflow)__getInternalInterface().getFieldValue(WORKFLOWTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the CheckedOut field.
   * Whether this workflows work item is checked out.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCheckedOut() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CHECKEDOUT_PROP.get());
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
   * Returns the step name in the given local for the step id
   * @param stepId 
   * @return the step name
   */
  public java.lang.String localizedStepName(java.lang.String stepId) {
    return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).localizedStepName(stepId);
  }
  
  /**
   * Finds all workflows that match this search criteria
   * @return a QueryProcessor of Workflow objects that match this search criteria
   */
  public gw.api.database.IQueryBeanResult performSearch() {
    return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).performSearch();
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
   * Sets the value of the ActiveState field.
   */
  public void setActiveState(typekey.WorkflowActiveState value) {
    __getInternalInterface().setFieldValue(ACTIVESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckedOut field.
   */
  public void setCheckedOut(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CHECKEDOUT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CurrentStep field.
   */
  public void setCurrentStep(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CURRENTSTEP_PROP.get(), value);
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
   * Sets the value of the Parent field.
   */
  public void setParent(entity.Workflow value) {
    __getInternalInterface().setFieldValue(PARENT_PROP.get(), value);
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
   * Sets the value of the StartDateFrom field.
   */
  public void setStartDateFrom(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATEFROM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartDateTo field.
   */
  public void setStartDateTo(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATETO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.WorkflowState value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateDateFrom field.
   */
  public void setUpdateDateFrom(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATEDATEFROM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateDateTo field.
   */
  public void setUpdateDateTo(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATEDATETO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Workflowtype field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setWorkflowtype(typekey.Workflow value) {
    ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).setWorkflowtype(value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WorkflowSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WorkflowSearchCriteria.this.__getDelegateManager();
    }
    
    public void addCriteria(com.guidewire.pl.system.database.TableObject workflow) {
      ((com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaInternalMethods")).addCriteria(workflow);
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
     * Gets the value of the ActiveState field.
     * The specific state of the workflow if it's active.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WorkflowActiveState getActiveState() {
      return (typekey.WorkflowActiveState)__getInternalInterface().getFieldValue(ACTIVESTATE_PROP.get());
    }
    
    /**
     * Returns all the step ids available for the specified workflow subtype and version
     * @return all the step ids
     */
    public java.lang.String[] getAvailableSteps() {
      return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableSteps();
    }
    
    /**
     * Returns all the workflow subtypes that are not abstract.
     * @return all the workflow subtypes that are not abstract.
     */
    public typekey.Workflow[] getAvailableTypes() {
      return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableTypes();
    }
    
    /**
     * Returns all the versions available for the given subtype
     * @return all the versions
     */
    public java.lang.Integer[] getAvailableVersions() {
      return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).getAvailableVersions();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CurrentStep field.
     * Name of the current step the workflow is on.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCurrentStep() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CURRENTSTEP_PROP.get());
    }
    
    /**
     * Gets the value of the Handler field.
     * What infrastructure component is handling the workflow?
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
     * Gets the value of the Parent field.
     * The workflow's parent workflow.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Workflow getParent() {
      return (entity.Workflow)__getInternalInterface().getFieldValue(PARENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARENT_PROP.get());
    }
    
    /**
     * Gets the value of the ProcessVersion field.
     * The version number of the workflow definition.
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
     * Gets the value of the StartDateFrom field.
     * Start date lower bound.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDateFrom() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATEFROM_PROP.get());
    }
    
    /**
     * Gets the value of the StartDateTo field.
     * Start date upper bound.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDateTo() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATETO_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     * The workflow's current state.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WorkflowState getState() {
      return (typekey.WorkflowState)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateDateFrom field.
     * Update date lower bound.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateDateFrom() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATEDATEFROM_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateDateTo field.
     * Update date upper bound.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateDateTo() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATEDATETO_PROP.get());
    }
    
    /**
     * Gets the value of the Workflowtype field.
     * The type of the workflow.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Workflow getWorkflowtype() {
      return (typekey.Workflow)__getInternalInterface().getFieldValue(WORKFLOWTYPE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the CheckedOut field.
     * Whether this workflows work item is checked out.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCheckedOut() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CHECKEDOUT_PROP.get());
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
     * Returns the step name in the given local for the step id
     * @param stepId 
     * @return the step name
     */
    public java.lang.String localizedStepName(java.lang.String stepId) {
      return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).localizedStepName(stepId);
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Finds all workflows that match this search criteria
     * @return a QueryProcessor of Workflow objects that match this search criteria
     */
    public gw.api.database.IQueryBeanResult performSearch() {
      return ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).performSearch();
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
     * Sets the value of the ActiveState field.
     */
    public void setActiveState(typekey.WorkflowActiveState value) {
      __getInternalInterface().setFieldValue(ACTIVESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckedOut field.
     */
    public void setCheckedOut(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CHECKEDOUT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CurrentStep field.
     */
    public void setCurrentStep(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CURRENTSTEP_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Parent field.
     */
    public void setParent(entity.Workflow value) {
      __getInternalInterface().setFieldValue(PARENT_PROP.get(), value);
    }
    
    public void setParentID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARENT_PROP.get(), value);
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
     * Sets the value of the StartDateFrom field.
     */
    public void setStartDateFrom(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATEFROM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartDateTo field.
     */
    public void setStartDateTo(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATETO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.WorkflowState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateDateFrom field.
     */
    public void setUpdateDateFrom(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATEDATEFROM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateDateTo field.
     */
    public void setUpdateDateTo(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATEDATETO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Workflowtype field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setWorkflowtype(typekey.Workflow value) {
      ((com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods")).setWorkflowtype(value);
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
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.workflow.WorkflowSearchCriteriaPublicMethods", "com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaImpl");
    config.put("com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaInternalMethods", "com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.pl.domain.workflow.impl.WorkflowSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WorkflowSearchCriteria.class, config);
    com.guidewire._generated.entity.WorkflowSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WorkflowSearchCriteria, com.guidewire._generated.entity.WorkflowSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.WorkflowSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WorkflowSearchCriteriaInternal getInternalInterface(entity.WorkflowSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WorkflowSearchCriteria newEmptyInstance() {
        return new entity.WorkflowSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
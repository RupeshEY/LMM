package entity;

/**
 * ActivitySearchCriteria
 * <p>Aggregates the information needed to display one activity row in the search and claim summary pages (subtype of ActivityView).</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivitySearchCriteria.eti;ActivitySearchCriteria.eix;ActivitySearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ActivitySearchCriteria")
public class ActivitySearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ActivitySearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ActivitySearchCriteria>("entity.ActivitySearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACTIVITYSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ActivityStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDTOGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedToGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDTOUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedToUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPLETEDLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CompletedLate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreatedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXTERNALOWNER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ExternalOwner");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OVERDUENOW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OverdueNow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PENDINGASSIGNMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PendingAssignment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PRIORITY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Priority");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBJECTCRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SubjectCriteria");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ActivitySearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ActivitySearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ActivitySearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ActivitySearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ActivitySearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ActivitySearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds a search criteria to this ActivitySearchCriteria.
   * @param activity TableObject representing the criteria to add
   */
  public void addCriteria(com.guidewire.pl.system.database.TableObject activity) {
    ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).addCriteria(activity);
  }
  
  /**
   * Finds the activities defined by this search criteria.
   * @return query results of activities defined by this search criteria
   */
  public com.guidewire.pl.system.database.Query<entity.Activity> findActivities() {
    return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).findActivities();
  }
  
  /**
   * Returns a query containing {@link entity.ActivitySearchView} entities
   * that match the criteria specified by this entity.
   * @return query results of ActivitySearchViews that match the specified criteria
   */
  public com.guidewire.pl.system.database.Query<entity.ActivitySearchView> findActivitySearchViews() {
    return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).findActivitySearchViews();
  }
  
  /**
   * Gets the value of the ActivityStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityStatus getActivityStatus() {
    return (typekey.ActivityStatus)__getInternalInterface().getFieldValue(ACTIVITYSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedToGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getAssignedToGroup() {
    return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(ASSIGNEDTOGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedToUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedToUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDTOUSER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the CreatedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
  }
  
  /**
   * Gets the value of the DateCriterionChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice() {
    return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the ExternalOwner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getExternalOwner() {
    return (entity.Contact)__getInternalInterface().getFieldValue(EXTERNALOWNER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Priority getPriority() {
    return (typekey.Priority)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the SubjectCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivitySubjectSearchCriteria getSubjectCriteria() {
    return (entity.ActivitySubjectSearchCriteria)__getInternalInterface().getFieldValue(SUBJECTCRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the CompletedLate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompletedLate() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPLETEDLATE_PROP.get());
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
   * Gets the value of the OverdueNow field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOverdueNow() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OVERDUENOW_PROP.get());
  }
  
  /**
   * Gets the value of the PendingAssignment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPendingAssignment() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDINGASSIGNMENT_PROP.get());
  }
  
  /**
   * Perform the search based on the criteria that have been selected.
   * @return the results of the search
   */
  public gw.api.database.IQueryBeanResult<entity.ActivitySearchView> performSearch() {
    return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).performSearch();
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
   * Sets the value of the ActivityStatus field.
   */
  public void setActivityStatus(typekey.ActivityStatus value) {
    __getInternalInterface().setFieldValue(ACTIVITYSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedToGroup field.
   */
  public void setAssignedToGroup(entity.GroupSearchCriterion value) {
    __getInternalInterface().setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedToUser field.
   */
  public void setAssignedToUser(entity.User value) {
    __getInternalInterface().setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CompletedLate field.
   */
  public void setCompletedLate(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COMPLETEDLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value) {
    __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExternalOwner field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setExternalOwner(entity.Contact value) {
    ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).setExternalOwner(value);
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
   * Sets the value of the OverdueNow field.
   */
  public void setOverdueNow(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OVERDUENOW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PendingAssignment field.
   */
  public void setPendingAssignment(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PENDINGASSIGNMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(typekey.Priority value) {
    __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the SubjectCriteria field.
   */
  public void setSubjectCriteria(entity.ActivitySubjectSearchCriteria value) {
    __getInternalInterface().setFieldValue(SUBJECTCRITERIA_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ActivitySearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ActivitySearchCriteria.this.__getDelegateManager();
    }
    
    /**
     * Adds a search criteria to this ActivitySearchCriteria.
     * @param activity TableObject representing the criteria to add
     */
    public void addCriteria(com.guidewire.pl.system.database.TableObject activity) {
      ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).addCriteria(activity);
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
    
    /**
     * Finds the activities defined by this search criteria.
     * @return query results of activities defined by this search criteria
     */
    public com.guidewire.pl.system.database.Query<entity.Activity> findActivities() {
      return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).findActivities();
    }
    
    /**
     * Returns a query containing {@link entity.ActivitySearchView} entities
     * that match the criteria specified by this entity.
     * @return query results of ActivitySearchViews that match the specified criteria
     */
    public com.guidewire.pl.system.database.Query<entity.ActivitySearchView> findActivitySearchViews() {
      return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).findActivitySearchViews();
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
     * Gets the value of the ActivityStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityStatus getActivityStatus() {
      return (typekey.ActivityStatus)__getInternalInterface().getFieldValue(ACTIVITYSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedToGroup field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupSearchCriterion getAssignedToGroup() {
      return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(ASSIGNEDTOGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedToGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDTOGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedToUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedToUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDTOUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedToUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDTOUSER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CreatedByUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreatedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreatedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the DateCriterionChoice field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateCriterionChoice getDateCriterionChoice() {
      return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDateCriterionChoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the ExternalOwner field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getExternalOwner() {
      return (entity.Contact)__getInternalInterface().getFieldValue(EXTERNALOWNER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExternalOwnerID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXTERNALOWNER_PROP.get());
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
     * Gets the value of the Priority field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Priority getPriority() {
      return (typekey.Priority)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SubjectCriteria field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivitySubjectSearchCriteria getSubjectCriteria() {
      return (entity.ActivitySubjectSearchCriteria)__getInternalInterface().getFieldValue(SUBJECTCRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubjectCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBJECTCRITERIA_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the CompletedLate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCompletedLate() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPLETEDLATE_PROP.get());
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
     * Gets the value of the OverdueNow field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isOverdueNow() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OVERDUENOW_PROP.get());
    }
    
    /**
     * Gets the value of the PendingAssignment field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPendingAssignment() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDINGASSIGNMENT_PROP.get());
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
    
    /**
     * Perform the search based on the criteria that have been selected.
     * @return the results of the search
     */
    public gw.api.database.IQueryBeanResult<entity.ActivitySearchView> performSearch() {
      return ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).performSearch();
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
     * Sets the value of the ActivityStatus field.
     */
    public void setActivityStatus(typekey.ActivityStatus value) {
      __getInternalInterface().setFieldValue(ACTIVITYSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedToGroup field.
     */
    public void setAssignedToGroup(entity.GroupSearchCriterion value) {
      __getInternalInterface().setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
    }
    
    public void setAssignedToGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedToUser field.
     */
    public void setAssignedToUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
    }
    
    public void setAssignedToUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CompletedLate field.
     */
    public void setCompletedLate(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COMPLETEDLATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreatedByUser field.
     */
    public void setCreatedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
    }
    
    public void setCreatedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEDBYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCriterionChoice field.
     */
    public void setDateCriterionChoice(entity.DateCriterionChoice value) {
      __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternalOwner field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setExternalOwner(entity.Contact value) {
      ((gw.cc.activity.entity.ActivitySearchCriteria)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivitySearchCriteria")).setExternalOwner(value);
    }
    
    public void setExternalOwnerID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXTERNALOWNER_PROP.get(), value);
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
     * Sets the value of the OverdueNow field.
     */
    public void setOverdueNow(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OVERDUENOW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PendingAssignment field.
     */
    public void setPendingAssignment(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PENDINGASSIGNMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Priority field.
     */
    public void setPriority(typekey.Priority value) {
      __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the SubjectCriteria field.
     */
    public void setSubjectCriteria(entity.ActivitySubjectSearchCriteria value) {
      __getInternalInterface().setFieldValue(SUBJECTCRITERIA_PROP.get(), value);
    }
    
    public void setSubjectCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUBJECTCRITERIA_PROP.get(), value);
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
    
    public boolean validate() {
      return ((com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal")).validate();
    }
    
    public void validateSearchCriteria() {
      ((com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal")).validateSearchCriteria();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal", "com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.activity.entity.ActivitySearchCriteria", "com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ActivitySearchCriteria.class, config);
    com.guidewire._generated.entity.ActivitySearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ActivitySearchCriteria, com.guidewire._generated.entity.ActivitySearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.ActivitySearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ActivitySearchCriteriaInternal getInternalInterface(entity.ActivitySearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ActivitySearchCriteria newEmptyInstance() {
        return new entity.ActivitySearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
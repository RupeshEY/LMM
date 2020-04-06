package entity;

/**
 * ActivityTeamView
 * <p>Aggregates the information needed to display one activity row in the activity team page (subtype of ActivityView).</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityTeamView.eti;ActivityTeamView.eix;ActivityTeamView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ActivityTeamView")
public class ActivityTeamView extends entity.ActivityView {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ActivityTeamView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ActivityTeamView>("entity.ActivityTeamView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMINSURED_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimInsured");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.api.activity.PublicActivityTeamViewFinder finder = gw.cc.activity.entity.ActivityTeamView.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ActivityTeamView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ActivityTeamView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ActivityTeamView(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ActivityTeamViewInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ActivityTeamViewInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ActivityTeamViewInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the AssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimInsured field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimInsured() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMINSURED_PROP.get());
  }
  
  /**
   * Sets the value of the AssignedUserName field.
   */
  public void setAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimInsured field.
   */
  public void setClaimInsured(entity.Contact value) {
    __getInternalInterface().setFieldValue(CLAIMINSURED_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ActivityTeamViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ActivityTeamView.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Returns a boolean indicating whether or not the given activity can be assigned.  Returns true iff:
     * <p/>
     * <ul>
     * <li> the activity is of type Approval
     * <li> the activity is of status Open
     * <li> the activity is not assigned to a queue
     * </ul> the user has the "assignactivity" permission
     * @return true if the given Activity can be assigned, false otherwise
     */
    public boolean canAssign() {
      return ((gw.cc.activity.entity.ActivityView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityView")).canAssign();
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
     * Gets the value of the Activity field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Activity getActivity() {
      return (entity.Activity)__getInternalInterface().getFieldValue(ACTIVITY_PROP.get());
    }
    
    /**
     * Returns the name of the user this activity is assigned to or the special display string "SYSTEM" if it is null.
     * @return string representing the name of the user this Activity is assigned to
     */
    public java.lang.String getActivityAssignedUser() {
      return ((gw.cc.activity.entity.ActivityView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityView")).getActivityAssignedUser();
    }
    
    public gw.pl.persistence.core.Key getActivityID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ACTIVITY_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedQueueID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getAssignedQueueID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ASSIGNEDQUEUEID_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUserID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ASSIGNEDUSERID_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the AssignmentStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssignmentStatus getAssignmentStatus() {
      return (typekey.AssignmentStatus)__getInternalInterface().getFieldValue(ASSIGNMENTSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimInsured field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getClaimInsured() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CLAIMINSURED_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimInsuredID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMINSURED_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimInsuredName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimInsuredName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMINSUREDNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CloseDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUserID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(CREATEUSERID_PROP.get());
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
     * Gets the value of the JurisdictionState field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getJurisdictionState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the LOBCode field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LOBCode getLOBCode() {
      return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
    }
    
    /**
     * Gets the value of the LastViewedDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLastViewedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LASTVIEWEDDATE_PROP.get());
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
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityStatus getStatus() {
      return (typekey.ActivityStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subject field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSubject() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SUBJECT_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityView getSubtype() {
      return (typekey.ActivityView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TargetDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTargetDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TARGETDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityType getType() {
      return (typekey.ActivityType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUserID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(UPDATEUSERID_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Escalated field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEscalated() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ESCALATED_PROP.get());
    }
    
    /**
     * Gets the value of the ExternallyOwned field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExternallyOwned() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTERNALLYOWNED_PROP.get());
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
     * Returns a boolean indicating whether or not the activity is overdue.
     * @return true if the Activity is overdue, false otherwise
     */
    public boolean isOverdue() {
      return ((gw.cc.activity.entity.ActivityView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityView")).isOverdue();
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
     * Sets the value of the Activity field.
     */
    public void setActivity(entity.Activity value) {
      __getInternalInterface().setFieldValue(ACTIVITY_PROP.get(), value);
    }
    
    public void setActivityID(gw.pl.persistence.core.Key value) {
      setFieldValue(ACTIVITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedQueueID field.
     */
    public void setAssignedQueueID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ASSIGNEDQUEUEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedUserID field.
     */
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ASSIGNEDUSERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedUserName field.
     */
    public void setAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignmentStatus field.
     */
    public void setAssignmentStatus(typekey.AssignmentStatus value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTSTATUS_PROP.get(), value);
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
     * Sets the value of the ClaimInsured field.
     */
    public void setClaimInsured(entity.Contact value) {
      __getInternalInterface().setFieldValue(CLAIMINSURED_PROP.get(), value);
    }
    
    public void setClaimInsuredID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMINSURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimInsuredName field.
     */
    public void setClaimInsuredName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMINSUREDNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUserID field.
     */
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(CREATEUSERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Escalated field.
     */
    public void setEscalated(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ESCALATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternallyOwned field.
     */
    public void setExternallyOwned(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXTERNALLYOWNED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionState field.
     */
    public void setJurisdictionState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LOBCode field.
     */
    public void setLOBCode(typekey.LOBCode value) {
      __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastViewedDate field.
     */
    public void setLastViewedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LASTVIEWEDDATE_PROP.get(), value);
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
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.ActivityStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subject field.
     */
    public void setSubject(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SUBJECT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ActivityView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetDate field.
     */
    public void setTargetDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(TARGETDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.ActivityType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUserID field.
     */
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(UPDATEUSERID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.activity.entity.ActivityTeamView", "com.guidewire.cc.domain.activity.impl.ActivityTeamViewImpl");
    config.put("gw.cc.activity.entity.ActivityView", "com.guidewire.cc.domain.activity.impl.ActivityTeamViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ActivityTeamView.class, config);
    com.guidewire._generated.entity.ActivityTeamViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ActivityTeamView, com.guidewire._generated.entity.ActivityTeamViewInternal>() {
      public java.lang.Object getImplementation(entity.ActivityTeamView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ActivityTeamViewInternal getInternalInterface(entity.ActivityTeamView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ActivityTeamView newEmptyInstance() {
        return new entity.ActivityTeamView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
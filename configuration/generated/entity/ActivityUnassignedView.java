package entity;

/**
 * ActivityUnassignedView
 * <p>Aggregates the information needed to display one activity row in the awaiting assignment page (subtype of ActivityView).</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityUnassignedView.eti;ActivityUnassignedView.eix;ActivityUnassignedView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ActivityUnassignedView")
public class ActivityUnassignedView extends entity.ActivityDesktopView {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ActivityUnassignedView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ActivityUnassignedView>("entity.ActivityUnassignedView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMASSIGNEDUSERCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAssignedUserContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREASSIGNEDUSERCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureAssignedUserContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureAssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATTERASSIGNEDUSERCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatterAssignedUserContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATTERASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatterAssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RELACTASSIGNEDUSERCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RelActAssignedUserContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RELACTASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RelActAssignedUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEREQUESTASSIGNEDUSERCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServiceRequestAssignedUserContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEREQUESTASSIGNEDUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServiceRequestAssignedUserName");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ActivityUnassignedView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ActivityUnassignedView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ActivityUnassignedView(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ActivityUnassignedViewInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ActivityUnassignedViewInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ActivityUnassignedViewInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the AssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAssignedUserContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getClaimAssignedUserContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(CLAIMASSIGNEDUSERCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureAssignedUserContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getExposureAssignedUserContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(EXPOSUREASSIGNEDUSERCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureAssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSUREASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the MatterAssignedUserContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getMatterAssignedUserContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(MATTERASSIGNEDUSERCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the MatterAssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMatterAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATTERASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the RelActAssignedUserContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getRelActAssignedUserContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(RELACTASSIGNEDUSERCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the RelActAssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRelActAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RELACTASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestAssignedUserContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getServiceRequestAssignedUserContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(SERVICEREQUESTASSIGNEDUSERCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestAssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServiceRequestAssignedUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICEREQUESTASSIGNEDUSERNAME_PROP.get());
  }
  
  /**
   * Returns the "user review status" of an unassigned Activity.
   * 
   * Logic is:
   *  - try Activity.RelatedActivity.AssignedUser
   *  - otherwise try Activity.Matter.AssignedUser
   *  - otherwise try Activity.Exposure.AssignedUser
   *  - otherwise try Activity.Claim.AssignedUser
   *  - otherwise empty string
   * @return the "user review status" of an unassigned Activity
   */
  public java.lang.String getUnassignedActivityUserReview() {
    return ((gw.cc.activity.entity.ActivityUnassignedView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityUnassignedView")).getUnassignedActivityUserReview();
  }
  
  /**
   * Sets the value of the AssignedUserName field.
   */
  public void setAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAssignedUserContactID field.
   */
  public void setClaimAssignedUserContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(CLAIMASSIGNEDUSERCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAssignedUserName field.
   */
  public void setClaimAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureAssignedUserContactID field.
   */
  public void setExposureAssignedUserContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(EXPOSUREASSIGNEDUSERCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureAssignedUserName field.
   */
  public void setExposureAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPOSUREASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterAssignedUserContactID field.
   */
  public void setMatterAssignedUserContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(MATTERASSIGNEDUSERCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterAssignedUserName field.
   */
  public void setMatterAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MATTERASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RelActAssignedUserContactID field.
   */
  public void setRelActAssignedUserContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(RELACTASSIGNEDUSERCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RelActAssignedUserName field.
   */
  public void setRelActAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RELACTASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequestAssignedUserContactID field.
   */
  public void setServiceRequestAssignedUserContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTASSIGNEDUSERCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequestAssignedUserName field.
   */
  public void setServiceRequestAssignedUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVICEREQUESTASSIGNEDUSERNAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ActivityUnassignedViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ActivityUnassignedView.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    /**
     * Returns a boolean indicating whether or not the given activity can be approved.  Returns true iff:
     * <p/>
     * 1) the activity is of type Approval
     * 2) the activity is of status Open
     * 3) the activity is Assigned
     * 4) the activity is either assigned to the given user or the user has the "approveany" permission
     * @return true if the Activity can be approved, false otherwise
     */
    public boolean canApprove() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).canApprove();
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
    
    /**
     * Returns a boolean indicating whether or not the given activity can be completed.  Returns true iff:
     * <p/>
     * 1) the activity is of type General or FNOL
     * 2) the activity is of status Open
     * 3) the activity is Assigned
     * 4) the activity is not assigned to a queue
     * 5) the user has the modify activity permission for this activity
     * <p/>
     * Note this test does not check anything particular to the activity and its
     * requirements for completion -- i.e. in the case of FNOL activities, this
     * method will return true even when the FNOL activity completion prerequisits
     * (that the claim is valid) are not met.
     * @return true if the given Activity can be completed, false otherwise
     */
    public boolean canComplete() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).canComplete();
    }
    
    /**
     * Returns true if the user can skip the activity based on the following:
     * <p/>
     * 1) the activity is a GENERAL or APPROVAL_DENIED activity
     * 2) the activity is open
     * 3) the activity is assigned
     * 4) the activity is not mandatory
     * 5) the activity is not assigned to a queue
     * 6) the user has permission to modify the activity.
     * @return true if the user can skip the Activity, false otherwise
     */
    public boolean canSkip() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).canSkip();
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
     * Gets the value of the AssignmentDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssignmentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSIGNMENTDATE_PROP.get());
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
    
    /**
     * Gets the value of the ClaimAssignedUserContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getClaimAssignedUserContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(CLAIMASSIGNEDUSERCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMASSIGNEDUSERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimClaimantName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimClaimantName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(CLAIMCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContactName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimContactName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get());
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
     * Returns the name of the Claimant associated with this activity.
     * @return the name of the Claimant associated with this activity
     */
    public java.lang.String getClaimant() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).getClaimant();
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
     * Returns the Exposure associated with this activity. If no exposure is directly associated,
     * finds all exposures owned by the Claimant associated with this activity's claim.
     * @return the Exposure associated with this Activity
     */
    public java.lang.String getExposure() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).getExposure();
    }
    
    /**
     * Gets the value of the ExposureAssignedUserContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getExposureAssignedUserContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(EXPOSUREASSIGNEDUSERCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureAssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSUREASSIGNEDUSERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureClaimantName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureClaimantName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(EXPOSUREID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURENAME_PROP.get());
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
     * Gets the value of the MatterAssignedUserContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getMatterAssignedUserContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(MATTERASSIGNEDUSERCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the MatterAssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMatterAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MATTERASSIGNEDUSERNAME_PROP.get());
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
     * Gets the value of the RelActAssignedUserContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getRelActAssignedUserContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(RELACTASSIGNEDUSERCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the RelActAssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRelActAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RELACTASSIGNEDUSERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestAssignedUserContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getServiceRequestAssignedUserContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(SERVICEREQUESTASSIGNEDUSERCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestAssignedUserName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServiceRequestAssignedUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVICEREQUESTASSIGNEDUSERNAME_PROP.get());
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
     * Returns the "user review status" of an unassigned Activity.
     * 
     * Logic is:
     *  - try Activity.RelatedActivity.AssignedUser
     *  - otherwise try Activity.Matter.AssignedUser
     *  - otherwise try Activity.Exposure.AssignedUser
     *  - otherwise try Activity.Claim.AssignedUser
     *  - otherwise empty string
     * @return the "user review status" of an unassigned Activity
     */
    public java.lang.String getUnassignedActivityUserReview() {
      return ((gw.cc.activity.entity.ActivityUnassignedView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityUnassignedView")).getUnassignedActivityUserReview();
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
    
    public boolean isAssignedToUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.system.entity.PermissionAssignableCheck)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PermissionAssignableCheck")).isAssignedToUser(userId);
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
     * Gets the value of the Mandatory field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMandatory() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MANDATORY_PROP.get());
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
    
    /**
     * Returns a boolean indicating whether or not this activity was updated since the last time it was
     * viewed. The exact sequence is:
     * <ol>
     * <li> Return false if the activity is not open
     * <li> Return false if the activity is not assigned to the current user
     * <li> Has the activity ever been viewed? If not (never viewed) return false if the current user
     *      created the activity, true otherwise
     * <li> Otherwise, return true if <em>someone else</em> has updated the activity since the current user
     *      viewed it, false otherwise
     * </ol>
     * @return true if this Activity was updated since the last time it was viewed, false otherwise
     */
    public boolean isUpdatedSinceLastViewed() {
      return ((gw.cc.activity.entity.ActivityDesktopView)__getDelegateManager().getImplementation("gw.cc.activity.entity.ActivityDesktopView")).isUpdatedSinceLastViewed();
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
     * Sets the value of the AssignmentDate field.
     */
    public void setAssignmentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSIGNMENTDATE_PROP.get(), value);
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
    
    /**
     * Sets the value of the ClaimAssignedUserContactID field.
     */
    public void setClaimAssignedUserContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(CLAIMASSIGNEDUSERCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAssignedUserName field.
     */
    public void setClaimAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMASSIGNEDUSERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimClaimantName field.
     */
    public void setClaimClaimantName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMCLAIMANTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContactID field.
     */
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContactName field.
     */
    public void setClaimContactName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMCONTACTNAME_PROP.get(), value);
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
     * Sets the value of the ExposureAssignedUserContactID field.
     */
    public void setExposureAssignedUserContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(EXPOSUREASSIGNEDUSERCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureAssignedUserName field.
     */
    public void setExposureAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSUREASSIGNEDUSERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureClaimantName field.
     */
    public void setExposureClaimantName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSURECLAIMANTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureID field.
     */
    public void setExposureID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(EXPOSUREID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureName field.
     */
    public void setExposureName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSURENAME_PROP.get(), value);
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
     * Sets the value of the Mandatory field.
     */
    public void setMandatory(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MANDATORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterAssignedUserContactID field.
     */
    public void setMatterAssignedUserContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(MATTERASSIGNEDUSERCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterAssignedUserName field.
     */
    public void setMatterAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MATTERASSIGNEDUSERNAME_PROP.get(), value);
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
     * Sets the value of the RelActAssignedUserContactID field.
     */
    public void setRelActAssignedUserContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(RELACTASSIGNEDUSERCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RelActAssignedUserName field.
     */
    public void setRelActAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RELACTASSIGNEDUSERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequestAssignedUserContactID field.
     */
    public void setServiceRequestAssignedUserContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTASSIGNEDUSERCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequestAssignedUserName field.
     */
    public void setServiceRequestAssignedUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVICEREQUESTASSIGNEDUSERNAME_PROP.get(), value);
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
    config.put("com.guidewire.pl.system.entity.PermissionAssignableCheck", "com.guidewire.cc.domain.activity.impl.ActivityUnassignedViewImpl");
    config.put("gw.cc.activity.entity.ActivityDesktopView", "com.guidewire.cc.domain.activity.impl.ActivityUnassignedViewImpl");
    config.put("gw.cc.activity.entity.ActivityUnassignedView", "com.guidewire.cc.domain.activity.impl.ActivityUnassignedViewImpl");
    config.put("gw.cc.activity.entity.ActivityView", "com.guidewire.cc.domain.activity.impl.ActivityUnassignedViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ActivityUnassignedView.class, config);
    com.guidewire._generated.entity.ActivityUnassignedViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ActivityUnassignedView, com.guidewire._generated.entity.ActivityUnassignedViewInternal>() {
      public java.lang.Object getImplementation(entity.ActivityUnassignedView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ActivityUnassignedViewInternal getInternalInterface(entity.ActivityUnassignedView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ActivityUnassignedView newEmptyInstance() {
        return new entity.ActivityUnassignedView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
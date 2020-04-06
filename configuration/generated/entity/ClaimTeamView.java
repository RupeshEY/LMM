package entity;

/**
 * ClaimTeamView
 * 
 *         Supports the efficient creation of claim lists appearing on ClaimCenter's team view. This is a virtual entity and
 *         is not stored in the database.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimTeamView.eti;ClaimTeamView.eix;ClaimTeamView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimTeamView")
public class ClaimTeamView extends entity.ClaimAssignmentView {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimTeamView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimTeamView>("entity.ClaimTeamView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNEDQUEUEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignedQueueID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNEDUSERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignedUserID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINCURREDNET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalIncurredNet");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.api.claim.PublicClaimTeamViewFinder finder = gw.cc.claim.entity.ClaimTeamView.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimTeamView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimTeamView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimTeamView(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ClaimTeamViewInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ClaimTeamViewInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ClaimTeamViewInternal)super.__getInternalInterface();
  }
  
  /**
   */
  public boolean canRemoveFlag() {
    return ((gw.cc.claim.entity.ClaimTeamView)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimTeamView")).canRemoveFlag();
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
   * Gets the value of the TotalIncurredNet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNET_PROP.get());
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
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimTeamViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimTeamView.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void attachClaimants(java.util.List<java.lang.String> claimants) {
      ((com.guidewire.cc.domain.claim.impl.ClaimAbstractViewInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.impl.ClaimAbstractViewInternal")).attachClaimants(claimants);
    }
    
    /**
     */
    public boolean canRemoveFlag() {
      return ((gw.cc.claim.entity.ClaimTeamView)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimTeamView")).canRemoveFlag();
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
     * Gets the value of the AssignedQueue field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssignedQueue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSIGNEDQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedQueueID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getAssignedQueueID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ASSIGNEDQUEUEID_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssignedUser() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSIGNEDUSER_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedUserID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getAssignedUserID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ASSIGNEDUSERID_PROP.get());
    }
    
    /**
     * Returns a string describing the claim's current assignee, suitable
     * for display to the user.
     */
    public java.lang.String getAssigneeDisplayString() {
      return ((gw.cc.claim.entity.ClaimAssignmentView)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimAssignmentView")).getAssigneeDisplayString();
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
     * Gets the value of the ClaimCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimantDenorm field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimantDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMANTDENORM_PROP.get());
    }
    
    /**
     * Returns list of names of claimants on a claim and its exposures.
     * @return 
     */
    public java.lang.String[] getClaimantNames() {
      return ((gw.cc.claim.entity.ClaimAbstractView)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimAbstractView")).getClaimantNames();
    }
    
    /**
     * Gets the value of the Flagged field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FlaggedType getFlagged() {
      return (typekey.FlaggedType)__getInternalInterface().getFieldValue(FLAGGED_PROP.get());
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
     * Gets the value of the Insured field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getInsured() {
      return (entity.Contact)__getInternalInterface().getFieldValue(INSURED_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredDenorm field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDDENORM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInsuredID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INSURED_PROP.get());
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
     * Gets the value of the LossDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the State field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimState getState() {
      return (typekey.ClaimState)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimAbstractView getSubtype() {
      return (typekey.ClaimAbstractView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TotalIncurredNet field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINCURREDNET_PROP.get());
    }
    
    /**
     * Gets the value of the WorkloadWeight field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWorkloadWeight() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WORKLOADWEIGHT_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Returns a boolean indicating whether or not this claim is currently flagged.
     * @return 
     */
    public boolean isCurrentlyFlagged() {
      return ((gw.cc.claim.entity.ClaimAbstractView)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimAbstractView")).isCurrentlyFlagged();
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
     * Sets the value of the AssignedQueue field.
     */
    public void setAssignedQueue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSIGNEDQUEUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedQueueID field.
     */
    public void setAssignedQueueID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ASSIGNEDQUEUEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedUser field.
     */
    public void setAssignedUser(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSIGNEDUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedUserID field.
     */
    public void setAssignedUserID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ASSIGNEDUSERID_PROP.get(), value);
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
     * Sets the value of the ClaimCurrency field.
     */
    public void setClaimCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimantDenorm field.
     */
    public void setClaimantDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMANTDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Flagged field.
     */
    public void setFlagged(typekey.FlaggedType value) {
      __getInternalInterface().setFieldValue(FLAGGED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Insured field.
     */
    public void setInsured(entity.Contact value) {
      __getInternalInterface().setFieldValue(INSURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredDenorm field.
     */
    public void setInsuredDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDDENORM_PROP.get(), value);
    }
    
    public void setInsuredID(gw.pl.persistence.core.Key value) {
      setFieldValue(INSURED_PROP.get(), value);
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
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LossDate field.
     */
    public void setLossDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
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
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.ClaimState value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ClaimAbstractView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalIncurredNet field.
     */
    public void setTotalIncurredNet(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkloadWeight field.
     */
    public void setWorkloadWeight(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WORKLOADWEIGHT_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.impl.ClaimAbstractViewInternal", "com.guidewire.cc.domain.claim.impl.ClaimAbstractViewImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.entity.ClaimAbstractView", "com.guidewire.cc.domain.claim.impl.ClaimTeamViewImpl");
    config.put("gw.cc.claim.entity.ClaimAssignmentView", "com.guidewire.cc.domain.claim.impl.ClaimTeamViewImpl");
    config.put("gw.cc.claim.entity.ClaimTeamView", "com.guidewire.cc.domain.claim.impl.ClaimTeamViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimTeamView.class, config);
    com.guidewire._generated.entity.ClaimTeamViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimTeamView, com.guidewire._generated.entity.ClaimTeamViewInternal>() {
      public java.lang.Object getImplementation(entity.ClaimTeamView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimTeamViewInternal getInternalInterface(entity.ClaimTeamView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimTeamView newEmptyInstance() {
        return new entity.ClaimTeamView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
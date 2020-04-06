package entity;

/**
 * ClaimIndicatorAutomatedActivityHandler
 * 
 *         A subtype of Automated Handler that generates an activity when a specified ClaimIndicator for a given Claim changes its value.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimIndicatorAutomatedActivityHandler.eti;ClaimIndicatorAutomatedActivityHandler.eix;ClaimIndicatorAutomatedActivityHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimIndicatorAutomatedActivityHandler")
public class ClaimIndicatorAutomatedActivityHandler extends entity.AutomatedActivityHandler implements gw.api.specialhandling.AutomatedHandlerMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimIndicatorAutomatedActivityHandler> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimIndicatorAutomatedActivityHandler>("entity.ClaimIndicatorAutomatedActivityHandler");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMINDICATORTRIGGER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimIndicatorTrigger");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMINDICATORTRIGGERARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimIndicatorTriggerArray");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimIndicatorAutomatedActivityHandler()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimIndicatorAutomatedActivityHandler(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimIndicatorAutomatedActivityHandler(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ClaimIndicatorTrigger field.
   * The associated ClaimIndicatorTrigger whose execution would result in an activity being generated according to the specifications of this handler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorTrigger getClaimIndicatorTrigger() {
    return (entity.ClaimIndicatorTrigger)__getInternalInterface().getFieldValue(CLAIMINDICATORTRIGGER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorTrigger[] getClaimIndicatorTriggerArray() {
    return (entity.ClaimIndicatorTrigger[])__getInternalInterface().getFieldValue(CLAIMINDICATORTRIGGERARRAY_PROP.get());
  }
  
  /**
   * Sets the value of the ClaimIndicatorTrigger field.
   */
  public void setClaimIndicatorTrigger(entity.ClaimIndicatorTrigger value) {
    __getInternalInterface().setFieldValue(CLAIMINDICATORTRIGGER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimIndicatorTriggerArray field.
   */
  private void setClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger[] value) {
    __getInternalInterface().setFieldValue(CLAIMINDICATORTRIGGERARRAY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimIndicatorAutomatedActivityHandler.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ClaimIndicatorTriggerArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger element) {
      __getInternalInterface().addArrayElement(CLAIMINDICATORTRIGGERARRAY_PROP.get(), element);
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
     * Called by an AutomatedHandler to execute the special handling action
     * (e.g., generation of an email notification or activity) when an associated trigger fires.
     * @param claim the Claim for which the special handling is being executed.
     */
    public void executeSpecialHandling(entity.Claim claim) {
      ((gw.api.specialhandling.AutomatedHandlerMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.AutomatedHandlerMethods")).executeSpecialHandling(claim);
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
     * Gets the value of the ActivityPattern field.
     * Activity pattern to use for activity generation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivityPattern getActivityPattern() {
      return (entity.ActivityPattern)__getInternalInterface().getFieldValue(ACTIVITYPATTERN_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getActivityPatternID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ACTIVITYPATTERN_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ClaimIndicatorTrigger field.
     * The associated ClaimIndicatorTrigger whose execution would result in an activity being generated according to the specifications of this handler
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimIndicatorTrigger getClaimIndicatorTrigger() {
      return (entity.ClaimIndicatorTrigger)__getInternalInterface().getFieldValue(CLAIMINDICATORTRIGGER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimIndicatorTriggerArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimIndicatorTrigger[] getClaimIndicatorTriggerArray() {
      return (entity.ClaimIndicatorTrigger[])__getInternalInterface().getFieldValue(CLAIMINDICATORTRIGGERARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimIndicatorTriggerID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMINDICATORTRIGGER_PROP.get());
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
     * Gets the value of the EmailTemplateOverride field.
     * Optional alternate template to use for activity generation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmailTemplateOverride() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILTEMPLATEOVERRIDE_PROP.get());
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
     * Returns the names of the properties that should be compared in order to test for whether
     * two handlers are equal as part of avoiding the creation of duplicate handlers.
     * @return an array of Strings representing the properties that must have equal values
     * for two handlers of this type to be considered equal.
     */
    public java.util.List<java.lang.String> getKeyProperties() {
      return ((gw.api.specialhandling.AutomatedHandlerMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.AutomatedHandlerMethods")).getKeyProperties();
    }
    
    /**
     * Gets the value of the PolicyType field.
     * If non-null, then this handler will only apply to Claims created for Policies that have this particular Policy Type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyType getPolicyType() {
      return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
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
     * Gets the value of the SpecialHandling field.
     * The instance of Special Handling that owns this Automated Handler
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SpecialHandling getSpecialHandling() {
      return (entity.SpecialHandling)__getInternalInterface().getFieldValue(SPECIALHANDLING_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSpecialHandlingID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SPECIALHANDLING_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AutomatedHandler getSubtype() {
      return (typekey.AutomatedHandler)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Retrieves the trigger to test (by calling the {@link AutomatedHandlerTrigger#shouldTrigger(Claim)}
     * for whether special handling should action should execute.
     * @return an instance of {@link AutomatedHandlerTrigger}
     */
    public gw.api.specialhandling.AutomatedHandlerTrigger getTrigger() {
      return ((gw.api.specialhandling.AutomatedHandlerMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.AutomatedHandlerMethods")).getTrigger();
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Initializes a new instance of the correct type of AutomatedHandlerTrigger for this
     * AutomatedHandler and associates it with the handler.  If the trigger has already
     * been initialized then this method does no work.
     */
    public void initializeTrigger() {
      ((gw.api.specialhandling.AutomatedHandlerMethods)__getDelegateManager().getImplementation("gw.api.specialhandling.AutomatedHandlerMethods")).initializeTrigger();
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
     * Removes the given element from the ClaimIndicatorTriggerArray array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger element) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORTRIGGERARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimIndicatorTriggerArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimIndicatorTriggerArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORTRIGGERARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ActivityPattern field.
     */
    public void setActivityPattern(entity.ActivityPattern value) {
      __getInternalInterface().setFieldValue(ACTIVITYPATTERN_PROP.get(), value);
    }
    
    public void setActivityPatternID(gw.pl.persistence.core.Key value) {
      setFieldValue(ACTIVITYPATTERN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimIndicatorTrigger field.
     */
    public void setClaimIndicatorTrigger(entity.ClaimIndicatorTrigger value) {
      __getInternalInterface().setFieldValue(CLAIMINDICATORTRIGGER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimIndicatorTriggerArray field.
     */
    public void setClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger[] value) {
      __getInternalInterface().setFieldValue(CLAIMINDICATORTRIGGERARRAY_PROP.get(), value);
    }
    
    public void setClaimIndicatorTriggerID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMINDICATORTRIGGER_PROP.get(), value);
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
     * Sets the value of the EmailTemplateOverride field.
     */
    public void setEmailTemplateOverride(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMAILTEMPLATEOVERRIDE_PROP.get(), value);
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
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(typekey.PolicyType value) {
      __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
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
     * Sets the value of the SpecialHandling field.
     */
    public void setSpecialHandling(entity.SpecialHandling value) {
      __getInternalInterface().setFieldValue(SPECIALHANDLING_PROP.get(), value);
    }
    
    public void setSpecialHandlingID(gw.pl.persistence.core.Key value) {
      setFieldValue(SPECIALHANDLING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.AutomatedHandler value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    
    /**
     * Initiates the work of this automated handler - first, the associated trigger is tested, and if it has fired
     * (e.g. a specified ClaimIndicator has turned on) then the appropriate action (e.g., generation of an email
     * notification) takes place.
     * @param claim the Claim for which this AutomatedHandler will take action if the associated trigger fires.
     */
    public void update(entity.Claim claim) {
      ((gw.cc.specialhandling.entity.AutomatedHandler)__getDelegateManager().getImplementation("gw.cc.specialhandling.entity.AutomatedHandler")).update(claim);
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
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.specialhandling.AutomatedHandlerMethods", "gw.specialhandling.ClaimIndicatorAutomatedActivityHandlerMethodsImpl");
    config.put("gw.cc.specialhandling.entity.AutomatedActivityHandler", "com.guidewire.cc.domain.specialhandling.impl.ClaimIndicatorAutomatedActivityHandlerImpl");
    config.put("gw.cc.specialhandling.entity.AutomatedHandler", "com.guidewire.cc.domain.specialhandling.impl.ClaimIndicatorAutomatedActivityHandlerImpl");
    config.put("gw.cc.specialhandling.entity.ClaimIndicatorAutomatedActivityHandler", "com.guidewire.cc.domain.specialhandling.impl.ClaimIndicatorAutomatedActivityHandlerImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimIndicatorAutomatedActivityHandler.class, config);
    com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimIndicatorAutomatedActivityHandler, com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal>() {
      public java.lang.Object getImplementation(entity.ClaimIndicatorAutomatedActivityHandler bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimIndicatorAutomatedActivityHandlerInternal getInternalInterface(entity.ClaimIndicatorAutomatedActivityHandler bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimIndicatorAutomatedActivityHandler newEmptyInstance() {
        return new entity.ClaimIndicatorAutomatedActivityHandler((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
package entity;

/**
 * ActivityRuleVersion
 * Activity Rule Version
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityRuleVersion.eti;ActivityRuleVersion.eix;ActivityRuleVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ActivityRuleVersion")
public class ActivityRuleVersion extends entity.RuleVersion {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ActivityRuleVersion> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ActivityRuleVersion>("entity.ActivityRuleVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RULE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Rule");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ActivityRuleVersion()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ActivityRuleVersion(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ActivityRuleVersion(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ActivityRuleVersionInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ActivityRuleVersionInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ActivityRuleVersionInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Rule field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRule getRule() {
    return (entity.ActivityRule)__getInternalInterface().getFieldValue(RULE_PROP.get());
  }
  
  /**
   * Sets the value of the Rule field.
   */
  public void setRule(entity.ActivityRule value) {
    __getInternalInterface().setFieldValue(RULE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ActivityRuleVersionInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ActivityRuleVersion.this.__getDelegateManager();
    }
    
    public void addParent(entity.RuleVersion arg0, boolean arg1) {
      ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).addParent(arg0, arg1);
    }
    
    /**
     * Adds the given element to the DeploymentTags array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDeploymentTags(entity.DeployedRuleTag element) {
      __getInternalInterface().addArrayElement(DEPLOYMENTTAGS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ImportRecordArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToImportRecordArray(entity.RuleImportAuditRecord element) {
      __getInternalInterface().addArrayElement(IMPORTRECORDARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ParentEdges array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToParentEdges(entity.RuleVersionParentEdge element) {
      __getInternalInterface().addArrayElement(PARENTEDGES_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void assignUniquePublicId() {
      ((com.guidewire.bizrules.management.RuleVersionAwareInternal)__getDelegateManager().getImplementation("com.guidewire.bizrules.management.RuleVersionAwareInternal")).assignUniquePublicId();
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
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
    
    public entity.RuleVersion getAuditTrailParent() {
      return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).getAuditTrailParent();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CreateSystemId field.
     * Identifier of the system on which the version was created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCreateSystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CREATESYSTEMID_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUserName field.
     * The name of the user who created this version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCreateUserName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CREATEUSERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the DeploymentTags field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DeployedRuleTag[] getDeploymentTags() {
      return (entity.DeployedRuleTag[])__getInternalInterface().getFieldValue(DEPLOYMENTTAGS_PROP.get());
    }
    
    /**
     * Gets the value of the GlobalRuleID field.
     * Identifies the RuleHead to which this version applies.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getGlobalRuleID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(GLOBALRULEID_PROP.get());
    }
    
    public java.lang.String getGlobalVersionID() {
      return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).getGlobalVersionID();
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
     * Gets the value of the ImportRecord field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleImportAuditRecord getImportRecord() {
      return (entity.RuleImportAuditRecord)__getInternalInterface().getFieldValue(IMPORTRECORD_PROP.get());
    }
    
    /**
     * Gets the value of the ImportRecordArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleImportAuditRecord[] getImportRecordArray() {
      return (entity.RuleImportAuditRecord[])__getInternalInterface().getFieldValue(IMPORTRECORDARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getImportRecordID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(IMPORTRECORD_PROP.get());
    }
    
    /**
     * Gets the value of the ParentEdges field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleVersionParentEdge[] getParentEdges() {
      return (entity.RuleVersionParentEdge[])__getInternalInterface().getFieldValue(PARENTEDGES_PROP.get());
    }
    
    public java.util.List<entity.RuleVersion> getParents() {
      return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).getParents();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Rule field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivityRule getRule() {
      return (entity.ActivityRule)__getInternalInterface().getFieldValue(RULE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRuleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RULE_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RuleStatus getStatus() {
      return (typekey.RuleStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RuleVersion getSubtype() {
      return (typekey.RuleVersion)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isEditable() {
      return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).isEditable();
    }
    
    public boolean isLocked() {
      return ((com.guidewire.bizrules.management.RuleVersionInternalMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.management.RuleVersionInternalMethods")).isLocked();
    }
    
    /**
     * Gets the value of the LockedInternal field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLockedInternal() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOCKEDINTERNAL_PROP.get());
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
    
    public void onPreInit() {
      ((com.guidewire.pl.system.entity.PreInitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PreInitCallback")).onPreInit();
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
     * Removes the given element from the DeploymentTags array. This is achieved by marking the element for removal.
     */
    public void removeFromDeploymentTags(entity.DeployedRuleTag element) {
      __getInternalInterface().removeArrayElement(DEPLOYMENTTAGS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DeploymentTags array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDeploymentTags(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DEPLOYMENTTAGS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ImportRecordArray array. This is achieved by marking the element for removal.
     */
    public void removeFromImportRecordArray(entity.RuleImportAuditRecord element) {
      __getInternalInterface().removeArrayElement(IMPORTRECORDARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ImportRecordArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromImportRecordArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(IMPORTRECORDARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ParentEdges array. This is achieved by marking the element for removal.
     */
    public void removeFromParentEdges(entity.RuleVersionParentEdge element) {
      __getInternalInterface().removeArrayElement(PARENTEDGES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ParentEdges array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromParentEdges(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PARENTEDGES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateSystemId field.
     */
    public void setCreateSystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CREATESYSTEMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUserName field.
     */
    public void setCreateUserName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CREATEUSERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeploymentTags field.
     */
    public void setDeploymentTags(entity.DeployedRuleTag[] value) {
      __getInternalInterface().setFieldValue(DEPLOYMENTTAGS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GlobalRuleID field.
     */
    public void setGlobalRuleID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(GLOBALRULEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportRecord field.
     */
    public void setImportRecord(entity.RuleImportAuditRecord value) {
      __getInternalInterface().setFieldValue(IMPORTRECORD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportRecordArray field.
     */
    public void setImportRecordArray(entity.RuleImportAuditRecord[] value) {
      __getInternalInterface().setFieldValue(IMPORTRECORDARRAY_PROP.get(), value);
    }
    
    public void setImportRecordID(gw.pl.persistence.core.Key value) {
      setFieldValue(IMPORTRECORD_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    public void setLocked(boolean arg0) {
      ((com.guidewire.bizrules.management.RuleVersionInternalMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.management.RuleVersionInternalMethods")).setLocked(arg0);
    }
    
    /**
     * Sets the value of the LockedInternal field.
     */
    public void setLockedInternal(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOCKEDINTERNAL_PROP.get(), value);
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
     * Sets the value of the ParentEdges field.
     */
    public void setParentEdges(entity.RuleVersionParentEdge[] value) {
      __getInternalInterface().setFieldValue(PARENTEDGES_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Rule field.
     */
    public void setRule(entity.ActivityRule value) {
      __getInternalInterface().setFieldValue(RULE_PROP.get(), value);
    }
    
    public void setRuleID(gw.pl.persistence.core.Key value) {
      setFieldValue(RULE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.RuleStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.RuleVersion value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    config.put("com.guidewire.bizrules.domain.RuleVersionDomainMethods", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.bizrules.management.RuleVersionAwareInternal", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.bizrules.management.RuleVersionInternalMethods", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("com.guidewire.pl.system.entity.PreInitCallback", "com.guidewire.cc.domain.bizrules.ActivityRuleVersionImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ActivityRuleVersion.class, config);
    com.guidewire._generated.entity.ActivityRuleVersionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ActivityRuleVersion, com.guidewire._generated.entity.ActivityRuleVersionInternal>() {
      public java.lang.Object getImplementation(entity.ActivityRuleVersion bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ActivityRuleVersionInternal getInternalInterface(entity.ActivityRuleVersion bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ActivityRuleVersion newEmptyInstance() {
        return new entity.ActivityRuleVersion((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
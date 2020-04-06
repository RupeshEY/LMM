package entity;

/**
 * RuleVersion
 * Business Rule Version
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleVersion.eti;RuleVersion.eix;RuleVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class RuleVersion extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, entity.RuleVersionAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RuleVersion> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RuleVersion>("entity.RuleVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATESYSTEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateSystemId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATEUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DEPLOYMENTTAGS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DeploymentTags");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GLOBALRULEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GlobalRuleID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> IMPORTRECORD_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ImportRecord");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> IMPORTRECORDARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ImportRecordArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKEDINTERNAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockedInternal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PARENTEDGES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ParentEdges");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RuleVersionInternal _internal;
  
  protected RuleVersion(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.RuleVersionInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.RuleVersionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
  
  /**
   * Gets the value of the ImportRecord field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportAuditRecord getImportRecord() {
    return (entity.RuleImportAuditRecord)__getInternalInterface().getFieldValue(IMPORTRECORD_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportAuditRecord[] getImportRecordArray() {
    return (entity.RuleImportAuditRecord[])__getInternalInterface().getFieldValue(IMPORTRECORDARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
  
  public entity.Rule getRule() {
    return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).getRule();
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
  
  public boolean isEditable() {
    return ((com.guidewire.bizrules.domain.RuleVersionDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleVersionDomainMethods")).isEditable();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateSystemId field.
   */
  private void setCreateSystemId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CREATESYSTEMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUserName field.
   */
  private void setCreateUserName(java.lang.String value) {
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
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportRecord field.
   */
  private void setImportRecord(entity.RuleImportAuditRecord value) {
    __getInternalInterface().setFieldValue(IMPORTRECORD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportRecordArray field.
   */
  private void setImportRecordArray(entity.RuleImportAuditRecord[] value) {
    __getInternalInterface().setFieldValue(IMPORTRECORDARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockedInternal field.
   */
  private void setLockedInternal(java.lang.Boolean value) {
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
  private void setParentEdges(entity.RuleVersionParentEdge[] value) {
    __getInternalInterface().setFieldValue(PARENTEDGES_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
  private void setSubtype(typekey.RuleVersion value) {
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
  
  static {
    com.guidewire._generated.entity.RuleVersionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.RuleVersion, com.guidewire._generated.entity.RuleVersionInternal>() {
      public java.lang.Object getImplementation(entity.RuleVersion bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RuleVersionInternal getInternalInterface(entity.RuleVersion bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}
package entity;

/**
 * RuleImportTaskEntry
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleImportTaskEntry.eti;RuleImportTaskEntry.eix;RuleImportTaskEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RuleImportTaskEntry")
public class RuleImportTaskEntry extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RuleImportTaskEntry> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RuleImportTaskEntry>("entity.RuleImportTaskEntry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHOSENSIDE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ChosenSide");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXISTINGVERSION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ExistingVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> HEAD_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Head");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> HEADARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "HeadArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> IMPORTEDVERSION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ImportedVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NEWHEADVERSION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NewHeadVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RULENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RuleName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TASK_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Task");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RuleImportTaskEntryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RuleImportTaskEntry()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RuleImportTaskEntry(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RuleImportTaskEntry(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.RuleImportTaskEntryInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.RuleImportTaskEntryInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ChosenSide field.
   * The NewHeadVersion is an exact copy of the given import side
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleImportSide getChosenSide() {
    return (typekey.RuleImportSide)__getInternalInterface().getFieldValue(CHOSENSIDE_PROP.get());
  }
  
  /**
   * Gets the value of the ExistingVersion field.
   * The existing version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getExistingVersion() {
    return (entity.RuleVersion)__getInternalInterface().getFieldValue(EXISTINGVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the Head field.
   * The rule head
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleHead getHead() {
    return (entity.RuleHead)__getInternalInterface().getFieldValue(HEAD_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleHead[] getHeadArray() {
    return (entity.RuleHead[])__getInternalInterface().getFieldValue(HEADARRAY_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the ImportedVersion field.
   * The imported rule version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getImportedVersion() {
    return (entity.RuleVersion)__getInternalInterface().getFieldValue(IMPORTEDVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the NewHeadVersion field.
   * The new head version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getNewHeadVersion() {
    return (entity.RuleVersion)__getInternalInterface().getFieldValue(NEWHEADVERSION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RuleName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRuleName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RULENAME_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * The current import entry status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleImportStatus getStatus() {
    return (typekey.RuleImportStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Task field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportTask getTask() {
    return (entity.RuleImportTask)__getInternalInterface().getFieldValue(TASK_PROP.get());
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ChosenSide field.
   */
  public void setChosenSide(typekey.RuleImportSide value) {
    __getInternalInterface().setFieldValue(CHOSENSIDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExistingVersion field.
   */
  public void setExistingVersion(entity.RuleVersion value) {
    __getInternalInterface().setFieldValue(EXISTINGVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Head field.
   */
  public void setHead(entity.RuleHead value) {
    __getInternalInterface().setFieldValue(HEAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HeadArray field.
   */
  private void setHeadArray(entity.RuleHead[] value) {
    __getInternalInterface().setFieldValue(HEADARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ImportedVersion field.
   */
  public void setImportedVersion(entity.RuleVersion value) {
    __getInternalInterface().setFieldValue(IMPORTEDVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewHeadVersion field.
   */
  public void setNewHeadVersion(entity.RuleVersion value) {
    __getInternalInterface().setFieldValue(NEWHEADVERSION_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RuleName field.
   */
  public void setRuleName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RULENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.RuleImportStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Task field.
   */
  public void setTask(entity.RuleImportTask value) {
    __getInternalInterface().setFieldValue(TASK_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RuleImportTaskEntryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RuleImportTaskEntry.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the HeadArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToHeadArray(entity.RuleHead element) {
      __getInternalInterface().addArrayElement(HEADARRAY_PROP.get(), element);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ChosenSide field.
     * The NewHeadVersion is an exact copy of the given import side
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RuleImportSide getChosenSide() {
      return (typekey.RuleImportSide)__getInternalInterface().getFieldValue(CHOSENSIDE_PROP.get());
    }
    
    /**
     * Gets the value of the ExistingVersion field.
     * The existing version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleVersion getExistingVersion() {
      return (entity.RuleVersion)__getInternalInterface().getFieldValue(EXISTINGVERSION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExistingVersionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXISTINGVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the Head field.
     * The rule head
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleHead getHead() {
      return (entity.RuleHead)__getInternalInterface().getFieldValue(HEAD_PROP.get());
    }
    
    /**
     * Gets the value of the HeadArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleHead[] getHeadArray() {
      return (entity.RuleHead[])__getInternalInterface().getFieldValue(HEADARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getHeadID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(HEAD_PROP.get());
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
     * Gets the value of the ImportedVersion field.
     * The imported rule version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleVersion getImportedVersion() {
      return (entity.RuleVersion)__getInternalInterface().getFieldValue(IMPORTEDVERSION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getImportedVersionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(IMPORTEDVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the NewHeadVersion field.
     * The new head version
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleVersion getNewHeadVersion() {
      return (entity.RuleVersion)__getInternalInterface().getFieldValue(NEWHEADVERSION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNewHeadVersionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NEWHEADVERSION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RuleName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRuleName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RULENAME_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * The current import entry status
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RuleImportStatus getStatus() {
      return (typekey.RuleImportStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Task field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleImportTask getTask() {
      return (entity.RuleImportTask)__getInternalInterface().getFieldValue(TASK_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTaskID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TASK_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    /**
     * Removes the given element from the HeadArray array. This is achieved by marking the element for removal.
     */
    public void removeFromHeadArray(entity.RuleHead element) {
      __getInternalInterface().removeArrayElement(HEADARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the HeadArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromHeadArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(HEADARRAY_PROP.get(), elementID);
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
     * Sets the value of the ChosenSide field.
     */
    public void setChosenSide(typekey.RuleImportSide value) {
      __getInternalInterface().setFieldValue(CHOSENSIDE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExistingVersion field.
     */
    public void setExistingVersion(entity.RuleVersion value) {
      __getInternalInterface().setFieldValue(EXISTINGVERSION_PROP.get(), value);
    }
    
    public void setExistingVersionID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXISTINGVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Head field.
     */
    public void setHead(entity.RuleHead value) {
      __getInternalInterface().setFieldValue(HEAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HeadArray field.
     */
    public void setHeadArray(entity.RuleHead[] value) {
      __getInternalInterface().setFieldValue(HEADARRAY_PROP.get(), value);
    }
    
    public void setHeadID(gw.pl.persistence.core.Key value) {
      setFieldValue(HEAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ImportedVersion field.
     */
    public void setImportedVersion(entity.RuleVersion value) {
      __getInternalInterface().setFieldValue(IMPORTEDVERSION_PROP.get(), value);
    }
    
    public void setImportedVersionID(gw.pl.persistence.core.Key value) {
      setFieldValue(IMPORTEDVERSION_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the NewHeadVersion field.
     */
    public void setNewHeadVersion(entity.RuleVersion value) {
      __getInternalInterface().setFieldValue(NEWHEADVERSION_PROP.get(), value);
    }
    
    public void setNewHeadVersionID(gw.pl.persistence.core.Key value) {
      setFieldValue(NEWHEADVERSION_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RuleName field.
     */
    public void setRuleName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RULENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.RuleImportStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Task field.
     */
    public void setTask(entity.RuleImportTask value) {
      __getInternalInterface().setFieldValue(TASK_PROP.get(), value);
    }
    
    public void setTaskID(gw.pl.persistence.core.Key value) {
      setFieldValue(TASK_PROP.get(), value);
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
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RuleImportTaskEntry.class, config);
    com.guidewire._generated.entity.RuleImportTaskEntryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RuleImportTaskEntry, com.guidewire._generated.entity.RuleImportTaskEntryInternal>() {
      public java.lang.Object getImplementation(entity.RuleImportTaskEntry bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RuleImportTaskEntryInternal getInternalInterface(entity.RuleImportTaskEntry bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RuleImportTaskEntry newEmptyInstance() {
        return new entity.RuleImportTaskEntry((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
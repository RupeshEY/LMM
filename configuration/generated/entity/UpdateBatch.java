package entity;

/**
 * UpdateBatch
 * 
 *       UpdateBatch has been deprecated since ClaimCenter 8.0 along with the IAddressBookAdapter.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpdateBatch.eti;UpdateBatch.eix;UpdateBatch.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UpdateBatch")
public class UpdateBatch extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UpdateBatch> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UpdateBatch>("entity.UpdateBatch");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CREATEUPDATEOPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CreateUpdateOps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DELETEUPDATEOPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DeleteUpdateOps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> FIELDCHANGEUPDATEOPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "FieldChangeUpdateOps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VALIDATIONWARNINGSTOIGNORE_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ValidationWarningsToIgnore");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UpdateBatchInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UpdateBatch()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UpdateBatch(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UpdateBatch(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UpdateBatchInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UpdateBatchInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the CreateUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCreateUpdateOps(entity.CreateUpdateOp element) {
    __getInternalInterface().addArrayElement(CREATEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DeleteUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeleteUpdateOps(entity.DeleteUpdateOp element) {
    __getInternalInterface().addArrayElement(DELETEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the FieldChangeUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFieldChangeUpdateOps(entity.FieldChangeUpdateOp element) {
    __getInternalInterface().addArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ValidationWarningsToIgnore array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValidationWarningsToIgnore(entity.ValidationWarning element) {
    __getInternalInterface().addArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), element);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CreateUpdateOps field.
   * List of objects to be created in the Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CreateUpdateOp[] getCreateUpdateOps() {
    return (entity.CreateUpdateOp[])__getInternalInterface().getFieldValue(CREATEUPDATEOPS_PROP.get());
  }
  
  /**
   * Gets the value of the DeleteUpdateOps field.
   * List of entities to be deleted from the Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DeleteUpdateOp[] getDeleteUpdateOps() {
    return (entity.DeleteUpdateOp[])__getInternalInterface().getFieldValue(DELETEUPDATEOPS_PROP.get());
  }
  
  /**
   * Gets the value of the FieldChangeUpdateOps field.
   * List of changes to fields' values in different entities.  Notice that in this list every entry may apply to a different entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FieldChangeUpdateOp[] getFieldChangeUpdateOps() {
    return (entity.FieldChangeUpdateOp[])__getInternalInterface().getFieldValue(FIELDCHANGEUPDATEOPS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ValidationWarningsToIgnore field.
   * List of validation warnings to be ignored by Address Book
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ValidationWarning[] getValidationWarningsToIgnore() {
    return (entity.ValidationWarning[])__getInternalInterface().getFieldValue(VALIDATIONWARNINGSTOIGNORE_PROP.get());
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
   * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromCreateUpdateOps(entity.CreateUpdateOp element) {
    __getInternalInterface().removeArrayElement(CREATEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreateUpdateOps(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CREATEUPDATEOPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromDeleteUpdateOps(entity.DeleteUpdateOp element) {
    __getInternalInterface().removeArrayElement(DELETEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeleteUpdateOps(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DELETEUPDATEOPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromFieldChangeUpdateOps(entity.FieldChangeUpdateOp element) {
    __getInternalInterface().removeArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFieldChangeUpdateOps(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
   */
  public void removeFromValidationWarningsToIgnore(entity.ValidationWarning element) {
    __getInternalInterface().removeArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValidationWarningsToIgnore(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUpdateOps field.
   */
  public void setCreateUpdateOps(entity.CreateUpdateOp[] value) {
    __getInternalInterface().setFieldValue(CREATEUPDATEOPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeleteUpdateOps field.
   */
  public void setDeleteUpdateOps(entity.DeleteUpdateOp[] value) {
    __getInternalInterface().setFieldValue(DELETEUPDATEOPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FieldChangeUpdateOps field.
   */
  public void setFieldChangeUpdateOps(entity.FieldChangeUpdateOp[] value) {
    __getInternalInterface().setFieldValue(FIELDCHANGEUPDATEOPS_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ValidationWarningsToIgnore field.
   */
  public void setValidationWarningsToIgnore(entity.ValidationWarning[] value) {
    __getInternalInterface().setFieldValue(VALIDATIONWARNINGSTOIGNORE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UpdateBatchInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UpdateBatch.this.__getDelegateManager();
    }
    
    public java.lang.String addCreateObjectUpdateOperation(entity.Versionable bean) {
      return ((com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods")).addCreateObjectUpdateOperation(bean);
    }
    
    public void addFieldChangeUpdateOperation(java.lang.String objectUId, java.lang.String objectTypeName, java.lang.String field, java.lang.String value) {
      ((com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods")).addFieldChangeUpdateOperation(objectUId, objectTypeName, field, value);
    }
    
    public void addRemoveObjectUpdateOperation(java.lang.String objectUId, java.lang.String objectTypeName) {
      ((com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods")).addRemoveObjectUpdateOperation(objectUId, objectTypeName);
    }
    
    /**
     * Adds the given element to the CreateUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCreateUpdateOps(entity.CreateUpdateOp element) {
      __getInternalInterface().addArrayElement(CREATEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DeleteUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDeleteUpdateOps(entity.DeleteUpdateOp element) {
      __getInternalInterface().addArrayElement(DELETEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the FieldChangeUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToFieldChangeUpdateOps(entity.FieldChangeUpdateOp element) {
      __getInternalInterface().addArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ValidationWarningsToIgnore array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToValidationWarningsToIgnore(entity.ValidationWarning element) {
      __getInternalInterface().addArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), element);
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
     * Gets the value of the CreateUpdateOps field.
     * List of objects to be created in the Address Book.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CreateUpdateOp[] getCreateUpdateOps() {
      return (entity.CreateUpdateOp[])__getInternalInterface().getFieldValue(CREATEUPDATEOPS_PROP.get());
    }
    
    /**
     * Gets the value of the DeleteUpdateOps field.
     * List of entities to be deleted from the Address Book.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DeleteUpdateOp[] getDeleteUpdateOps() {
      return (entity.DeleteUpdateOp[])__getInternalInterface().getFieldValue(DELETEUPDATEOPS_PROP.get());
    }
    
    /**
     * Gets the value of the FieldChangeUpdateOps field.
     * List of changes to fields' values in different entities.  Notice that in this list every entry may apply to a different entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FieldChangeUpdateOp[] getFieldChangeUpdateOps() {
      return (entity.FieldChangeUpdateOp[])__getInternalInterface().getFieldValue(FIELDCHANGEUPDATEOPS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ValidationWarningsToIgnore field.
     * List of validation warnings to be ignored by Address Book
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ValidationWarning[] getValidationWarningsToIgnore() {
      return (entity.ValidationWarning[])__getInternalInterface().getFieldValue(VALIDATIONWARNINGSTOIGNORE_PROP.get());
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
     * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
     */
    public void removeFromCreateUpdateOps(entity.CreateUpdateOp element) {
      __getInternalInterface().removeArrayElement(CREATEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCreateUpdateOps(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CREATEUPDATEOPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
     */
    public void removeFromDeleteUpdateOps(entity.DeleteUpdateOp element) {
      __getInternalInterface().removeArrayElement(DELETEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDeleteUpdateOps(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DELETEUPDATEOPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
     */
    public void removeFromFieldChangeUpdateOps(entity.FieldChangeUpdateOp element) {
      __getInternalInterface().removeArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromFieldChangeUpdateOps(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(FIELDCHANGEUPDATEOPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
     */
    public void removeFromValidationWarningsToIgnore(entity.ValidationWarning element) {
      __getInternalInterface().removeArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromValidationWarningsToIgnore(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(VALIDATIONWARNINGSTOIGNORE_PROP.get(), elementID);
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
     * Sets the value of the CreateUpdateOps field.
     */
    public void setCreateUpdateOps(entity.CreateUpdateOp[] value) {
      __getInternalInterface().setFieldValue(CREATEUPDATEOPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeleteUpdateOps field.
     */
    public void setDeleteUpdateOps(entity.DeleteUpdateOp[] value) {
      __getInternalInterface().setFieldValue(DELETEUPDATEOPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FieldChangeUpdateOps field.
     */
    public void setFieldChangeUpdateOps(entity.FieldChangeUpdateOp[] value) {
      __getInternalInterface().setFieldValue(FIELDCHANGEUPDATEOPS_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ValidationWarningsToIgnore field.
     */
    public void setValidationWarningsToIgnore(entity.ValidationWarning[] value) {
      __getInternalInterface().setFieldValue(VALIDATIONWARNINGSTOIGNORE_PROP.get(), value);
    }
    
    public java.lang.String toDebugString() {
      return ((com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods")).toDebugString();
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
    config.put("com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods", "com.guidewire.pl.domain.addressbook.impl.UpdateBatchImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UpdateBatch.class, config);
    com.guidewire._generated.entity.UpdateBatchInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UpdateBatch, com.guidewire._generated.entity.UpdateBatchInternal>() {
      public java.lang.Object getImplementation(entity.UpdateBatch bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UpdateBatchInternal getInternalInterface(entity.UpdateBatch bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UpdateBatch newEmptyInstance() {
        return new entity.UpdateBatch((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
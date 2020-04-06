package entity;

/**
 * AttributeBasedAssignmentCriteria
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AttributeBasedAssignmentCriteria.eti;AttributeBasedAssignmentCriteria.eix;AttributeBasedAssignmentCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "AttributeBasedAssignmentCriteria")
public class AttributeBasedAssignmentCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AttributeBasedAssignmentCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AttributeBasedAssignmentCriteria>("entity.AttributeBasedAssignmentCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ATTRIBUTECRITERIA_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AttributeCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public AttributeBasedAssignmentCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public AttributeBasedAssignmentCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected AttributeBasedAssignmentCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the AttributeCriteria array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAttributeCriteria(entity.AttributeCriteriaElement element) {
    __getInternalInterface().addArrayElement(ATTRIBUTECRITERIA_PROP.get(), element);
  }
  
  /**
   * Add the addtribute to the set of attributes to be matched
   * @param attribute 
   */
  public void addUserAttribute(entity.Attribute attribute) {
    ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttribute(attribute);
  }
  
  /**
   * Create a new Attribute criterion to be matched based on type, field, value, state, operator, and value
   * @param attributeType 
   * @param attributeField 
   * @param attributeValue 
   * @param state 
   * @param operator 
   * @param value 
   */
  public void addUserAttributeField(typekey.UserAttributeType attributeType, com.guidewire.pl.system.gosu.enums.AttributeFields attributeField, java.lang.String attributeValue, typekey.State state, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
    ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeField(attributeType, attributeField, attributeValue, state, operator, value);
  }
  
  /**
   * Add the attribute and state filter to the criteria to be matched
   * @param attribute 
   * @param state 
   */
  public void addUserAttributeState(entity.Attribute attribute, typekey.State state) {
    ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeState(attribute, state);
  }
  
  /**
   * attribute and state filter to the criteria to be matched according to the given operator and value
   * @param attribute 
   * @param state 
   * @param operator 
   * @param value 
   */
  public void addUserAttributeStateValue(entity.Attribute attribute, typekey.State state, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
    ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeStateValue(attribute, state, operator, value);
  }
  
  /**
   * Add the attribute to the criteria to be matched according to the given operator and value
   * @param attribute 
   * @param operator 
   * @param value 
   */
  public void addUserAttributeValue(entity.Attribute attribute, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
    ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeValue(attribute, operator, value);
  }
  
  /**
   * Gets the value of the AttributeCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AttributeCriteriaElement[] getAttributeCriteria() {
    return (entity.AttributeCriteriaElement[])__getInternalInterface().getFieldValue(ATTRIBUTECRITERIA_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Group field.
   * The Group within which the attribute-based search is being done. May be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
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
   * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
   */
  public void removeFromAttributeCriteria(entity.AttributeCriteriaElement element) {
    __getInternalInterface().removeArrayElement(ATTRIBUTECRITERIA_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAttributeCriteria(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ATTRIBUTECRITERIA_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AttributeCriteria field.
   */
  public void setAttributeCriteria(entity.AttributeCriteriaElement[] value) {
    __getInternalInterface().setFieldValue(ATTRIBUTECRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.AttributeBasedAssignmentCriteria.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the AttributeCriteria array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAttributeCriteria(entity.AttributeCriteriaElement element) {
      __getInternalInterface().addArrayElement(ATTRIBUTECRITERIA_PROP.get(), element);
    }
    
    /**
     * Add the addtribute to the set of attributes to be matched
     * @param attribute 
     */
    public void addUserAttribute(entity.Attribute attribute) {
      ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttribute(attribute);
    }
    
    /**
     * Create a new Attribute criterion to be matched based on type, field, value, state, operator, and value
     * @param attributeType 
     * @param attributeField 
     * @param attributeValue 
     * @param state 
     * @param operator 
     * @param value 
     */
    public void addUserAttributeField(typekey.UserAttributeType attributeType, com.guidewire.pl.system.gosu.enums.AttributeFields attributeField, java.lang.String attributeValue, typekey.State state, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
      ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeField(attributeType, attributeField, attributeValue, state, operator, value);
    }
    
    /**
     * Add the attribute and state filter to the criteria to be matched
     * @param attribute 
     * @param state 
     */
    public void addUserAttributeState(entity.Attribute attribute, typekey.State state) {
      ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeState(attribute, state);
    }
    
    /**
     * attribute and state filter to the criteria to be matched according to the given operator and value
     * @param attribute 
     * @param state 
     * @param operator 
     * @param value 
     */
    public void addUserAttributeStateValue(entity.Attribute attribute, typekey.State state, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
      ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeStateValue(attribute, state, operator, value);
    }
    
    /**
     * Add the attribute to the criteria to be matched according to the given operator and value
     * @param attribute 
     * @param operator 
     * @param value 
     */
    public void addUserAttributeValue(entity.Attribute attribute, com.guidewire.pl.system.gosu.enums.RelationalOperator operator, java.lang.Integer value) {
      ((com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods")).addUserAttributeValue(attribute, operator, value);
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
     * Gets the value of the AttributeCriteria field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AttributeCriteriaElement[] getAttributeCriteria() {
      return (entity.AttributeCriteriaElement[])__getInternalInterface().getFieldValue(ATTRIBUTECRITERIA_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Group field.
     * The Group within which the attribute-based search is being done. May be null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
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
     * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
     */
    public void removeFromAttributeCriteria(entity.AttributeCriteriaElement element) {
      __getInternalInterface().removeArrayElement(ATTRIBUTECRITERIA_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAttributeCriteria(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ATTRIBUTECRITERIA_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AttributeCriteria field.
     */
    public void setAttributeCriteria(entity.AttributeCriteriaElement[] value) {
      __getInternalInterface().setFieldValue(ATTRIBUTECRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Group field.
     */
    public void setGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
    }
    
    public void setGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(GROUP_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods", "com.guidewire.pl.domain.assignment.impl.AttributeBasedAssignmentCriteriaImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.AttributeBasedAssignmentCriteria.class, config);
    com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.AttributeBasedAssignmentCriteria, com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.AttributeBasedAssignmentCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AttributeBasedAssignmentCriteriaInternal getInternalInterface(entity.AttributeBasedAssignmentCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.AttributeBasedAssignmentCriteria newEmptyInstance() {
        return new entity.AttributeBasedAssignmentCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
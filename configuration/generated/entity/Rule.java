package entity;

/**
 * Rule
 * The root entity that encapsulates the definition of a business rule.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Rule.eti;Rule.eix;Rule.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class Rule extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, entity.RuleVersionDependent {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Rule> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Rule>("entity.Rule");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLETORUN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableToRun");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RULECOMMANDDEFINITIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RuleCommandDefinitions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RULECONDITION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RuleCondition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RULECONTEXTDEFINITIONKEY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RuleContextDefinitionKey");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRIGGERINGPOINTKEY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TriggeringPointKey");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATESYSTEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateSystemId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATEUSERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateUserName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATIONINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ValidationInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VALIDATIONINFOARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ValidationInfoArray");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RuleInternal _internal;
  
  protected Rule(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.RuleInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.RuleInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the RuleCommandDefinitions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToRuleCommandDefinitions(entity.RuleCommandDefinition element) {
    __getInternalInterface().addArrayElement(RULECOMMANDDEFINITIONS_PROP.get(), element);
  }
  
  public entity.RuleCommandDefinition appendRuleCommandDefinition() {
    return ((com.guidewire.bizrules.domain.RuleDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleDomainMethods")).appendRuleCommandDefinition();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  public java.util.List<entity.RuleCommandDefinition> getOrderedRuleCommandDefinitions() {
    return ((com.guidewire.bizrules.domain.RuleDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleDomainMethods")).getOrderedRuleCommandDefinitions();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandDefinition[] getRuleCommandDefinitions() {
    return (entity.RuleCommandDefinition[])__getInternalInterface().getFieldValue(RULECOMMANDDEFINITIONS_PROP.get());
  }
  
  /**
   * Gets the value of the RuleCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCondition getRuleCondition() {
    return (entity.RuleCondition)__getInternalInterface().getFieldValue(RULECONDITION_PROP.get());
  }
  
  /**
   * Gets the value of the RuleContextDefinitionKey field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleContextDefinitionKey getRuleContextDefinitionKey() {
    return (typekey.RuleContextDefinitionKey)__getInternalInterface().getFieldValue(RULECONTEXTDEFINITIONKEY_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Rule getSubtype() {
    return (typekey.Rule)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TriggeringPointKey field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TriggeringPointKey getTriggeringPointKey() {
    return (typekey.TriggeringPointKey)__getInternalInterface().getFieldValue(TRIGGERINGPOINTKEY_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateSystemId field.
   * Identifier of the system on which the rule was updated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateSystemId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UPDATESYSTEMID_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUserName field.
   * The name of the user who updated this rule.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUpdateUserName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UPDATEUSERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ValidationInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleValidationInfo getValidationInfo() {
    return (entity.RuleValidationInfo)__getInternalInterface().getFieldValue(VALIDATIONINFO_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleValidationInfo[] getValidationInfoArray() {
    return (entity.RuleValidationInfo[])__getInternalInterface().getFieldValue(VALIDATIONINFOARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the AvailableToRun field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAvailableToRun() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AVAILABLETORUN_PROP.get());
  }
  
  public boolean isEditable() {
    return ((com.guidewire.bizrules.domain.RuleDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleDomainMethods")).isEditable();
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
  
  public java.lang.Boolean isValid() {
    return ((com.guidewire.bizrules.domain.RuleDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleDomainMethods")).isValid();
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
   * Removes the given element from the RuleCommandDefinitions array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void removeFromRuleCommandDefinitions(entity.RuleCommandDefinition element) {
    __getInternalInterface().removeArrayElement(RULECOMMANDDEFINITIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RuleCommandDefinitions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRuleCommandDefinitions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RULECOMMANDDEFINITIONS_PROP.get(), elementID);
  }
  
  public void removeRuleCommandDefinition(entity.RuleCommandDefinition arg0) {
    ((com.guidewire.bizrules.domain.RuleDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleDomainMethods")).removeRuleCommandDefinition(arg0);
  }
  
  /**
   * Sets the value of the AvailableToRun field.
   */
  public void setAvailableToRun(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AVAILABLETORUN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
   * Sets the value of the RuleCommandDefinitions field.
   */
  private void setRuleCommandDefinitions(entity.RuleCommandDefinition[] value) {
    __getInternalInterface().setFieldValue(RULECOMMANDDEFINITIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RuleCondition field.
   */
  public void setRuleCondition(entity.RuleCondition value) {
    __getInternalInterface().setFieldValue(RULECONDITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RuleContextDefinitionKey field.
   */
  public void setRuleContextDefinitionKey(typekey.RuleContextDefinitionKey value) {
    __getInternalInterface().setFieldValue(RULECONTEXTDEFINITIONKEY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.Rule value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TriggeringPointKey field.
   */
  public void setTriggeringPointKey(typekey.TriggeringPointKey value) {
    __getInternalInterface().setFieldValue(TRIGGERINGPOINTKEY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateSystemId field.
   */
  private void setUpdateSystemId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UPDATESYSTEMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUserName field.
   */
  private void setUpdateUserName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UPDATEUSERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidationInfo field.
   */
  public void setValidationInfo(entity.RuleValidationInfo value) {
    __getInternalInterface().setFieldValue(VALIDATIONINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidationInfoArray field.
   */
  private void setValidationInfoArray(entity.RuleValidationInfo[] value) {
    __getInternalInterface().setFieldValue(VALIDATIONINFOARRAY_PROP.get(), value);
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
    com.guidewire._generated.entity.RuleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.Rule, com.guidewire._generated.entity.RuleInternal>() {
      public java.lang.Object getImplementation(entity.Rule bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RuleInternal getInternalInterface(entity.Rule bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}
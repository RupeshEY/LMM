package entity;

/**
 * SpecialHandling
 * 
 *         This is the parent entity for defining special handling of Claims. There may be different special handling needs for claims related to a particular Account, Brokerage or Affinity Program. All the special handling instructions and triggers are hung off the SpecialHandling entity and then different subtypes of this entity point to the owning Account, Brokerage or Program.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialHandling.eti;SpecialHandling.eix;SpecialHandling.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class SpecialHandling extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.SpecialHandling> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.SpecialHandling>("entity.SpecialHandling");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> AUTOMATEDHANDLERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AutomatedHandlers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OTHERINSTRUCTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "OtherInstructions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.SpecialHandlingInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  protected SpecialHandling(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.SpecialHandlingInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.SpecialHandlingInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the AutomatedHandlers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAutomatedHandlers(entity.AutomatedHandler element) {
    __getInternalInterface().addArrayElement(AUTOMATEDHANDLERS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the OtherInstructions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherInstructions(entity.OtherInstruction element) {
    __getInternalInterface().addArrayElement(OTHERINSTRUCTIONS_PROP.get(), element);
  }
  
  /**
   * Array association accessor for key AutomatedActivityHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedActivityHandler[] getAutomatedActivityHandler() {
    return (entity.AutomatedActivityHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("AutomatedActivityHandler"));
  }
  
  /**
   * Array association accessor for key AutomatedHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedHandler[] getAutomatedHandler() {
    return (entity.AutomatedHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("AutomatedHandler"));
  }
  
  /**
   * Gets the value of the AutomatedHandlers field.
   * An associative array of AutomatedHandlers, segmented by the AutomatedHandler subtype (i.e., AutomatedActivityHandler and AutomatedNotificationHandler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedHandler[] getAutomatedHandlers() {
    return (entity.AutomatedHandler[])__getInternalInterface().getFieldValue(AUTOMATEDHANDLERS_PROP.get());
  }
  
  /**
   * Array association accessor for key AutomatedNotificationHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedNotificationHandler[] getAutomatedNotificationHandler() {
    return (entity.AutomatedNotificationHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("AutomatedNotificationHandler"));
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Array association accessor for key ClaimIndicatorAutomatedActivityHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorAutomatedActivityHandler[] getClaimIndicatorAutomatedActivityHandler() {
    return (entity.ClaimIndicatorAutomatedActivityHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimIndicatorAutomatedActivityHandler"));
  }
  
  /**
   * Array association accessor for key ClaimIndicatorAutomatedNotificationHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorAutomatedNotificationHandler[] getClaimIndicatorAutomatedNotificationHandler() {
    return (entity.ClaimIndicatorAutomatedNotificationHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ClaimIndicatorAutomatedNotificationHandler"));
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
  
  /**
   * Array association accessor for key FinancialAutomatedActivityHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialAutomatedActivityHandler[] getFinancialAutomatedActivityHandler() {
    return (entity.FinancialAutomatedActivityHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("FinancialAutomatedActivityHandler"));
  }
  
  /**
   * Array association accessor for key FinancialAutomatedNotificationHandler on array AutomatedHandlers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialAutomatedNotificationHandler[] getFinancialAutomatedNotificationHandler() {
    return (entity.FinancialAutomatedNotificationHandler[])__getInternalInterface().getAssociativeArrayValue((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("FinancialAutomatedNotificationHandler"));
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the OtherInstructions field.
   * Related other instructions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherInstruction[] getOtherInstructions() {
    return (entity.OtherInstruction[])__getInternalInterface().getFieldValue(OTHERINSTRUCTIONS_PROP.get());
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
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SpecialHandling getSubtype() {
    return (typekey.SpecialHandling)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
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
   * Removes the given element from the AutomatedHandlers array. This is achieved by marking the element for removal.
   */
  public void removeFromAutomatedHandlers(entity.AutomatedHandler element) {
    __getInternalInterface().removeArrayElement(AUTOMATEDHANDLERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AutomatedHandlers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAutomatedHandlers(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(AUTOMATEDHANDLERS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the OtherInstructions array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherInstructions(entity.OtherInstruction element) {
    __getInternalInterface().removeArrayElement(OTHERINSTRUCTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the OtherInstructions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherInstructions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(OTHERINSTRUCTIONS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AutomatedHandlers field.
   */
  public void setAutomatedHandlers(entity.AutomatedHandler[] value) {
    __getInternalInterface().setFieldValue(AUTOMATEDHANDLERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
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
  
  /**
   * Sets the value of the OtherInstructions field.
   */
  public void setOtherInstructions(entity.OtherInstruction[] value) {
    __getInternalInterface().setFieldValue(OTHERINSTRUCTIONS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.SpecialHandling value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
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
    com.guidewire._generated.entity.SpecialHandlingInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.SpecialHandling, com.guidewire._generated.entity.SpecialHandlingInternal>() {
      public java.lang.Object getImplementation(entity.SpecialHandling bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.SpecialHandlingInternal getInternalInterface(entity.SpecialHandling bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}
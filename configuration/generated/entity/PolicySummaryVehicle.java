package entity;

/**
 * PolicySummaryVehicle
 * Summary information about a vehicle on a policy summary.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySummaryVehicle.eti;PolicySummaryVehicle.eix;PolicySummaryVehicle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PolicySummaryVehicle")
public class PolicySummaryVehicle extends entity.PolicySummaryRiskUnit {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PolicySummaryVehicle> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PolicySummaryVehicle>("entity.PolicySummaryVehicle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Color");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LICENSEPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LicensePlate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAKE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Make");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODEL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Model");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERIALNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SerialNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Vin");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PolicySummaryVehicle()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PolicySummaryVehicle(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PolicySummaryVehicle(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.PolicySummaryVehicleInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.PolicySummaryVehicleInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.PolicySummaryVehicleInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Color field.
   * Color of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColor() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLOR_PROP.get());
  }
  
  /**
   * Gets the value of the LicensePlate field.
   * License plate of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLicensePlate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSEPLATE_PROP.get());
  }
  
  /**
   * Gets the value of the Make field.
   * Make of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMake() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAKE_PROP.get());
  }
  
  /**
   * Gets the value of the Model field.
   * Model of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getModel() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MODEL_PROP.get());
  }
  
  /**
   * Gets the value of the SerialNumber field.
   * Serial number; only use if VIN is not appropriate (e.g. for boats).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSerialNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERIALNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   * State (Jurisdiction) in which the vehicle is registered. The Jurisdiction must be associated with JurisdictionType.TC_VEHICLE_REG.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getState() {
    return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleNumber field.
   * Number of the vehicle on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getVehicleNumber() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(VEHICLENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Vin field.
   * VIN of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
  }
  
  /**
   * Sets the value of the Color field.
   */
  public void setColor(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COLOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LicensePlate field.
   */
  public void setLicensePlate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LICENSEPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Make field.
   */
  public void setMake(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MAKE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Model field.
   */
  public void setModel(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MODEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SerialNumber field.
   */
  public void setSerialNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERIALNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.Jurisdiction value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleNumber field.
   */
  public void setVehicleNumber(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(VEHICLENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PolicySummaryVehicleInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PolicySummaryVehicle.this.__getDelegateManager();
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
     * Gets the value of the Color field.
     * Color of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getColor() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLOR_PROP.get());
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
     * Gets the value of the LicensePlate field.
     * License plate of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLicensePlate() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSEPLATE_PROP.get());
    }
    
    /**
     * Gets the value of the Make field.
     * Make of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMake() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAKE_PROP.get());
    }
    
    /**
     * Gets the value of the Model field.
     * Model of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getModel() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MODEL_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySummary field.
     * Related policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicySummary getPolicySummary() {
      return (entity.PolicySummary)__getInternalInterface().getFieldValue(POLICYSUMMARY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPolicySummaryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(POLICYSUMMARY_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySystemId field.
     * Identifier for the risk in an external policy system
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicySystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSYSTEMID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SerialNumber field.
     * Serial number; only use if VIN is not appropriate (e.g. for boats).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSerialNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERIALNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     * State (Jurisdiction) in which the vehicle is registered. The Jurisdiction must be associated with JurisdictionType.TC_VEHICLE_REG.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicySummaryRiskUnit getSubtype() {
      return (typekey.PolicySummaryRiskUnit)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleNumber field.
     * Number of the vehicle on the policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getVehicleNumber() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(VEHICLENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Vin field.
     * VIN of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVin() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
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
    
    /**
     * Gets the value of the Selected field.
     * Indicates whether the risk unit should be included when fetching the policy from the policy system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSelected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SELECTED_PROP.get());
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Color field.
     */
    public void setColor(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COLOR_PROP.get(), value);
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
     * Sets the value of the LicensePlate field.
     */
    public void setLicensePlate(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LICENSEPLATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Make field.
     */
    public void setMake(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MAKE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Model field.
     */
    public void setModel(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MODEL_PROP.get(), value);
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
     * Sets the value of the PolicySummary field.
     */
    public void setPolicySummary(entity.PolicySummary value) {
      __getInternalInterface().setFieldValue(POLICYSUMMARY_PROP.get(), value);
    }
    
    public void setPolicySummaryID(gw.pl.persistence.core.Key value) {
      setFieldValue(POLICYSUMMARY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySystemId field.
     */
    public void setPolicySystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSYSTEMID_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Selected field.
     */
    public void setSelected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SELECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SerialNumber field.
     */
    public void setSerialNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERIALNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.PolicySummaryRiskUnit value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleNumber field.
     */
    public void setVehicleNumber(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(VEHICLENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Vin field.
     */
    public void setVin(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
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
    config.put("gw.cc.policy.entity.PolicySummaryRiskUnit", "com.guidewire.cc.domain.policy.impl.PolicySummaryVehicleImpl");
    config.put("gw.cc.policy.entity.PolicySummaryVehicle", "com.guidewire.cc.domain.policy.impl.PolicySummaryVehicleImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PolicySummaryVehicle.class, config);
    com.guidewire._generated.entity.PolicySummaryVehicleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PolicySummaryVehicle, com.guidewire._generated.entity.PolicySummaryVehicleInternal>() {
      public java.lang.Object getImplementation(entity.PolicySummaryVehicle bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PolicySummaryVehicleInternal getInternalInterface(entity.PolicySummaryVehicle bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PolicySummaryVehicle newEmptyInstance() {
        return new entity.PolicySummaryVehicle((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
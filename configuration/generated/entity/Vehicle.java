package entity;

/**
 * Vehicle
 * 
 * A vehicle (car, boat, etc.) on a policy.  Describes the vehicle's physical
 * characteristics (make, model, VIN etc.) and relates the vehicle to its coverages.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Vehicle.eti;Vehicle.eix;Vehicle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Vehicle")
public class Vehicle extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Vehicle> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Vehicle>("entity.Vehicle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BOATTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BoatType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Color");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LICENSEPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LicensePlate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LIENHOLDERS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Lienholders");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOAN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Loan");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOANMONTHLYPAYMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoanMonthlyPayment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOANMONTHSREMAINING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoanMonthsRemaining");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOANPAYOFFAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoanPayoffAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAKE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Make");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MANUFACTURER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Manufacturer");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODEL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Model");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OFFROADSTYLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OffRoadStyle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYSYSTEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicySystemId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERIALNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SerialNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STYLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Style");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Vin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> YEAR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Year");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.VehicleInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Vehicle()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Vehicle(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Vehicle(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.VehicleInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.VehicleInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Lienholders array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLienholders(entity.VehicleOwner element) {
    __getInternalInterface().addArrayElement(LIENHOLDERS_PROP.get(), element);
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Retrieves this Vehicle's associated policy, if possible.  This method assumes that the Vehicle
   * is tied to the policy either via an Incident (i.e., Policy <- Claim -> VehicleIncident -> Vehicle)
   * or via a VehicleRU (i.e., Policy <- VehicleRU -> Vehicle) as is always true in the
   * uncustomized datamodel.  If that is not the case, then this method will return NULL.
   * @return The Policy entity associated with this Vehicle entity, if that association is as expected
   * from the uncustomized datamodel.  If not, then NULL will be returned.
   */
  public entity.Policy getAssociatedPolicyInternal() {
    return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).getAssociatedPolicyInternal();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BoatType field.
   * Type of boat; only applies if vehicle style is boat.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BoatType getBoatType() {
    return (typekey.BoatType)__getInternalInterface().getFieldValue(BOATTYPE_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * Gets the value of the Lienholders field.
   * List of lienholders for the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleOwner[] getLienholders() {
    return (entity.VehicleOwner[])__getInternalInterface().getFieldValue(LIENHOLDERS_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the LoanMonthlyPayment field.
   * Monthly loan payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLoanMonthlyPayment() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOANMONTHLYPAYMENT_PROP.get());
  }
  
  /**
   * Gets the value of the LoanMonthsRemaining field.
   * Months remaining on loan.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLoanMonthsRemaining() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOANMONTHSREMAINING_PROP.get());
  }
  
  /**
   * Gets the value of the LoanPayoffAmount field.
   * Loan payoff amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLoanPayoffAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOANPAYOFFAMOUNT_PROP.get());
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
   * Gets the value of the Manufacturer field.
   * Company that manufactured the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleManufacturer getManufacturer() {
    return (typekey.VehicleManufacturer)__getInternalInterface().getFieldValue(MANUFACTURER_PROP.get());
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
   * Gets the value of the OffRoadStyle field.
   * Style of snowmobile or ATV (wheels, tracks etc.). Used by ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OffRoadVehicleStyle getOffRoadStyle() {
    return (typekey.OffRoadVehicleStyle)__getInternalInterface().getFieldValue(OFFROADSTYLE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the vehicle in an external policy system
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
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
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
   * 
   * @return the short version of display name
   */
  public java.lang.String getShortDisplayName() {
    return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).getShortDisplayName();
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
   * Gets the value of the Style field.
   * Style of Vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleStyle getStyle() {
    return (typekey.VehicleStyle)__getInternalInterface().getFieldValue(STYLE_PROP.get());
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
   * Gets the value of the Vin field.
   * VIN of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
  }
  
  /**
   * Gets the value of the Year field.
   * Year of the vehicle's manufacture.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getYear() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(YEAR_PROP.get());
  }
  
  /**
   * Gets the value of the Loan field.
   * Whether a loan is owed for the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLoan() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOAN_PROP.get());
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
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   */
  public void removeFromLienholders(entity.VehicleOwner element) {
    __getInternalInterface().removeArrayElement(LIENHOLDERS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLienholders(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(LIENHOLDERS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BoatType field.
   */
  public void setBoatType(typekey.BoatType value) {
    __getInternalInterface().setFieldValue(BOATTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Color field.
   */
  public void setColor(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COLOR_PROP.get(), value);
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
   * Sets the value of the LicensePlate field.
   */
  public void setLicensePlate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LICENSEPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Lienholders field.
   */
  public void setLienholders(entity.VehicleOwner[] value) {
    __getInternalInterface().setFieldValue(LIENHOLDERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Loan field.
   */
  public void setLoan(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LOAN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoanMonthlyPayment field.
   */
  public void setLoanMonthlyPayment(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(LOANMONTHLYPAYMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoanMonthsRemaining field.
   */
  public void setLoanMonthsRemaining(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOANMONTHSREMAINING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoanPayoffAmount field.
   */
  public void setLoanPayoffAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(LOANPAYOFFAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Make field.
   */
  public void setMake(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MAKE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Manufacturer field.
   */
  public void setManufacturer(typekey.VehicleManufacturer value) {
    __getInternalInterface().setFieldValue(MANUFACTURER_PROP.get(), value);
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
   * Sets the value of the OffRoadStyle field.
   */
  public void setOffRoadStyle(typekey.OffRoadVehicleStyle value) {
    __getInternalInterface().setFieldValue(OFFROADSTYLE_PROP.get(), value);
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
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
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
   * Sets the value of the Style field.
   */
  public void setStyle(typekey.VehicleStyle value) {
    __getInternalInterface().setFieldValue(STYLE_PROP.get(), value);
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
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Year field.
   */
  public void setYear(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(YEAR_PROP.get(), value);
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
   * Checks that there are no duplicate lienholders in the {@link #getLienholders()} array. If
   * there are any duplicate lienholders returns an error describing the duplication. This method
   * is suitable for use as a "validationExpression" in a PCF file
   * @return null if there are no duplicate lienholders, otherwise a localized string describing
   *   the duplication
   */
  public java.lang.String validateLienholders() {
    return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).validateLienholders();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.VehicleInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Vehicle.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Lienholders array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLienholders(entity.VehicleOwner element) {
      __getInternalInterface().addArrayElement(LIENHOLDERS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
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
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Retrieves this Vehicle's associated policy, if possible.  This method assumes that the Vehicle
     * is tied to the policy either via an Incident (i.e., Policy <- Claim -> VehicleIncident -> Vehicle)
     * or via a VehicleRU (i.e., Policy <- VehicleRU -> Vehicle) as is always true in the
     * uncustomized datamodel.  If that is not the case, then this method will return NULL.
     * @return The Policy entity associated with this Vehicle entity, if that association is as expected
     * from the uncustomized datamodel.  If not, then NULL will be returned.
     */
    public entity.Policy getAssociatedPolicyInternal() {
      return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).getAssociatedPolicyInternal();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BoatType field.
     * Type of boat; only applies if vehicle style is boat.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BoatType getBoatType() {
      return (typekey.BoatType)__getInternalInterface().getFieldValue(BOATTYPE_PROP.get());
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
     * Gets the value of the Lienholders field.
     * List of lienholders for the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.VehicleOwner[] getLienholders() {
      return (entity.VehicleOwner[])__getInternalInterface().getFieldValue(LIENHOLDERS_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the LoanMonthlyPayment field.
     * Monthly loan payment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLoanMonthlyPayment() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOANMONTHLYPAYMENT_PROP.get());
    }
    
    /**
     * Gets the value of the LoanMonthsRemaining field.
     * Months remaining on loan.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLoanMonthsRemaining() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOANMONTHSREMAINING_PROP.get());
    }
    
    /**
     * Gets the value of the LoanPayoffAmount field.
     * Loan payoff amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLoanPayoffAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOANPAYOFFAMOUNT_PROP.get());
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
     * Gets the value of the Manufacturer field.
     * Company that manufactured the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehicleManufacturer getManufacturer() {
      return (typekey.VehicleManufacturer)__getInternalInterface().getFieldValue(MANUFACTURER_PROP.get());
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
     * Gets the value of the OffRoadStyle field.
     * Style of snowmobile or ATV (wheels, tracks etc.). Used by ISO.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.OffRoadVehicleStyle getOffRoadStyle() {
      return (typekey.OffRoadVehicleStyle)__getInternalInterface().getFieldValue(OFFROADSTYLE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySystemId field.
     * Identifier for the vehicle in an external policy system
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
     * 
     * @return the short version of display name
     */
    public java.lang.String getShortDisplayName() {
      return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).getShortDisplayName();
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
     * Gets the value of the Style field.
     * Style of Vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehicleStyle getStyle() {
      return (typekey.VehicleStyle)__getInternalInterface().getFieldValue(STYLE_PROP.get());
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
    
    /**
     * Gets the value of the Vin field.
     * VIN of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVin() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
    }
    
    /**
     * Gets the value of the Year field.
     * Year of the vehicle's manufacture.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getYear() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(YEAR_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Loan field.
     * Whether a loan is owed for the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLoan() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOAN_PROP.get());
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
     * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
     */
    public void removeFromLienholders(entity.VehicleOwner element) {
      __getInternalInterface().removeArrayElement(LIENHOLDERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLienholders(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LIENHOLDERS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BoatType field.
     */
    public void setBoatType(typekey.BoatType value) {
      __getInternalInterface().setFieldValue(BOATTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Color field.
     */
    public void setColor(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COLOR_PROP.get(), value);
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
     * Sets the value of the Lienholders field.
     */
    public void setLienholders(entity.VehicleOwner[] value) {
      __getInternalInterface().setFieldValue(LIENHOLDERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Loan field.
     */
    public void setLoan(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOAN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoanMonthlyPayment field.
     */
    public void setLoanMonthlyPayment(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LOANMONTHLYPAYMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoanMonthsRemaining field.
     */
    public void setLoanMonthsRemaining(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOANMONTHSREMAINING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoanPayoffAmount field.
     */
    public void setLoanPayoffAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LOANPAYOFFAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Make field.
     */
    public void setMake(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MAKE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Manufacturer field.
     */
    public void setManufacturer(typekey.VehicleManufacturer value) {
      __getInternalInterface().setFieldValue(MANUFACTURER_PROP.get(), value);
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
     * Sets the value of the OffRoadStyle field.
     */
    public void setOffRoadStyle(typekey.OffRoadVehicleStyle value) {
      __getInternalInterface().setFieldValue(OFFROADSTYLE_PROP.get(), value);
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
     * Sets the value of the Style field.
     */
    public void setStyle(typekey.VehicleStyle value) {
      __getInternalInterface().setFieldValue(STYLE_PROP.get(), value);
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
     * Sets the value of the Vin field.
     */
    public void setVin(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Year field.
     */
    public void setYear(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(YEAR_PROP.get(), value);
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
     * Checks that there are no duplicate lienholders in the {@link #getLienholders()} array. If
     * there are any duplicate lienholders returns an error describing the duplication. This method
     * is suitable for use as a "validationExpression" in a PCF file
     * @return null if there are no duplicate lienholders, otherwise a localized string describing
     *   the duplication
     */
    public java.lang.String validateLienholders() {
      return ((gw.cc.policy.entity.Vehicle)__getDelegateManager().getImplementation("gw.cc.policy.entity.Vehicle")).validateLienholders();
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.policy.impl.VehicleImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.policy.impl.VehicleImpl");
    config.put("gw.cc.policy.entity.Vehicle", "com.guidewire.cc.domain.policy.impl.VehicleImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Vehicle.class, config);
    com.guidewire._generated.entity.VehicleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Vehicle, com.guidewire._generated.entity.VehicleInternal>() {
      public java.lang.Object getImplementation(entity.Vehicle bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.VehicleInternal getInternalInterface(entity.Vehicle bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Vehicle newEmptyInstance() {
        return new entity.Vehicle((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
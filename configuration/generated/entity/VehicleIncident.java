package entity;

/**
 * VehicleIncident
 * Report of an incident involving a vehicle.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleIncident.eti;VehicleIncident.eix;VehicleIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "VehicleIncident")
public class VehicleIncident extends entity.MobilePropertyIncident {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.VehicleIncident> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.VehicleIncident>("entity.VehicleIncident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AFFDVCMPLIND_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AffdvCmplInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AIRBAGSDEPLOYED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AirbagsDeployed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AIRBAGSMISSING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AirbagsMissing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ANTITHFTIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AntiThftInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPRAISAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Appraisal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BODYSHOPSELECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BodyShopSelected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CITATIONISSUED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CitationIssued");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CITATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Citations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLLISION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Collision");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COLLISIONPOINT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CollisionPoint");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPONENTSMISSING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ComponentsMissing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATESALVAGEASSIGNED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateSalvageAssigned");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEVEHICLERECOVERED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateVehicleRecovered");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEVEHICLESOLD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateVehicleSold");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DRIVERRELTOOWNER_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DriverRelToOwner");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DRIVERRELATION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DriverRelation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EQUIPMENTFAILURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EquipmentFailure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTRICATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Extrication");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIREBURNDASH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FireBurnDash");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIREBURNENGINE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FireBurnEngine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIREBURNWINDSHIELD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FireBurnWindshield");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLOODSALTWATER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FloodSaltWater");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HITANDRUN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HitAndRun");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTERIORMISSING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InteriorMissing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCATIONIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LocationInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LotNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MILEAGE100K_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Mileage100K");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MINORONPOLICY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MinorOnPolicy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOVEPERMISSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MovePermission");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ODOMREAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OdomRead");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OWNERRETAININGSALVAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OwnerRetainingSalvage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OWNERSPERMISSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OwnersPermission");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PERCENTAGEDRIVENBYMINOR_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PercentageDrivenByMinor");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PHANTOMVEHICLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PhantomVehicle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVCLASSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecovClassType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVCONDTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecovCondType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECOVDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RecovDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVIND_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecovInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecovState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RECOVERYLOCATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RecoveryLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALAGENCY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalAgency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALBEGINDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalBeginDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALDAILYRATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalDailyRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalEndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALREQUIRED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalRequired");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RENTALRESERVENO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RentalReserveNo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPWHEREDISIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RepWhereDisInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGECOMPANY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageCompany");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGENET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageNet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGEPREP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvagePrep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGEPROCEEDS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageProceeds");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGESTORAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageStorage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGETITLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageTitle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SALVAGETOW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SalvageTow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SPEED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Speed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STORAGEACCRIND_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StorageAccrInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEFCLTY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageFclty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STORAGEFEEAMT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StorageFeeAmt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALLOSS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalLoss");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALLOSSPOINTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalLossPoints");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRAFFICVIOLATION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TrafficViolation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHCONDTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehCondType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHLOCKIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehLockInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHSTOLENIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehStolenInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHTOWEDIND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehTowedInd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VEHICLE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Vehicle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEACV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleACV");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEAGE10YEARS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleAge10Years");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEAGE5YEARS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleAge5Years");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLEDIRECTION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleDirection");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEDRIVEABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleDriveable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLELOCATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleLocation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLELOSSPARTY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleLossParty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEOPERABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleOperable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEPARKED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleParked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLEPOLSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehiclePolStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLEROLLOVER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleRollOver");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VEHICLESUBMERGED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VehicleSubmerged");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLETITLERECVD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleTitleRecvd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLETITLEREQD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleTitleReqd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VEHICLEUSEREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "VehicleUseReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WATERLEVELDASH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaterLevelDash");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WATERLEVELSEATS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WaterLevelSeats");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public VehicleIncident()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public VehicleIncident(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected VehicleIncident(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.VehicleIncidentInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.VehicleIncidentInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.VehicleIncidentInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the Citations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCitations(entity.Citation element) {
    __getInternalInterface().addArrayElement(CITATIONS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AffdvCmplInd field.
   * Affidavit completed Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getAffdvCmplInd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(AFFDVCMPLIND_PROP.get());
  }
  
  /**
   * The list of vehicles suitable for setting on this incident. Includes all the policy vehicles except those that
   * are already in use by other incidents
   * @return array of available vehicles, may be zero length but is never null
   */
  public entity.Vehicle[] getAvailableVehicles() {
    return ((gw.cc.exposure.entity.VehicleIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.VehicleIncident")).getAvailableVehicles();
  }
  
  /**
   * Gets the value of the CitationIssued field.
   * An indicator if there are citations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getCitationIssued() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(CITATIONISSUED_PROP.get());
  }
  
  /**
   * Gets the value of the Citations field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Citation[] getCitations() {
    return (entity.Citation[])__getInternalInterface().getFieldValue(CITATIONS_PROP.get());
  }
  
  /**
   * Gets the value of the CollisionPoint field.
   * Point of first impact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CollisionPoint getCollisionPoint() {
    return (typekey.CollisionPoint)__getInternalInterface().getFieldValue(COLLISIONPOINT_PROP.get());
  }
  
  /**
   * Gets the value of the DateSalvageAssigned field.
   * Date assignment made to salvage team
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateSalvageAssigned() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATESALVAGEASSIGNED_PROP.get());
  }
  
  /**
   * Gets the value of the DateVehicleRecovered field.
   * Whether vehicle has been recovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateVehicleRecovered() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEVEHICLERECOVERED_PROP.get());
  }
  
  /**
   * Gets the value of the DateVehicleSold field.
   * Whether vehicle has been sold
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateVehicleSold() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEVEHICLESOLD_PROP.get());
  }
  
  /**
   * Gets the value of the DriverRelToOwner field.
   * Relationship of the driver to the vehicle's owner. This is redundant for a first-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getDriverRelToOwner() {
    return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(DRIVERRELTOOWNER_PROP.get());
  }
  
  /**
   * Gets the value of the DriverRelation field.
   * Relationship of the driver to the insured. This is redundant for a first-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getDriverRelation() {
    return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(DRIVERRELATION_PROP.get());
  }
  
  /**
   * Gets the value of the LotNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLotNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOTNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the MinorOnPolicy field.
   * If the driver involved in accident is a minor, is he/she listed in the policy?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getMinorOnPolicy() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(MINORONPOLICY_PROP.get());
  }
  
  /**
   * Gets the value of the OdomRead field.
   * Odometer reading
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOdomRead() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ODOMREAD_PROP.get());
  }
  
  /**
   * Gets the value of the PercentageDrivenByMinor field.
   * % of time vehicle used by the minor
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PercentageDriven getPercentageDrivenByMinor() {
    return (typekey.PercentageDriven)__getInternalInterface().getFieldValue(PERCENTAGEDRIVENBYMINOR_PROP.get());
  }
  
  /**
   * Gets the value of the RecovClassType field.
   * Describes which parts or recovered vehicle were stripped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecovClassType getRecovClassType() {
    return (typekey.RecovClassType)__getInternalInterface().getFieldValue(RECOVCLASSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the RecovCondType field.
   * Describes which general condition of vehicle upon recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecovCondType getRecovCondType() {
    return (typekey.RecovCondType)__getInternalInterface().getFieldValue(RECOVCONDTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the RecovDate field.
   * Date the vehicle was recovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRecovDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RECOVDATE_PROP.get());
  }
  
  /**
   * Gets the value of the RecovInd field.
   * Recovery Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getRecovInd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(RECOVIND_PROP.get());
  }
  
  /**
   * Gets the value of the RecovState field.
   * State (aka Territory) where the vehicle upon recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getRecovState() {
    return (typekey.State)__getInternalInterface().getFieldValue(RECOVSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the RecoveryLocation field.
   * The Address at which the recovery was made.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getRecoveryLocation() {
    return (entity.Address)__getInternalInterface().getFieldValue(RECOVERYLOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the RentalAgency field.
   * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRentalAgency() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RENTALAGENCY_PROP.get());
  }
  
  /**
   * Gets the value of the RentalBeginDate field.
   * Date the vehical rental begins
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRentalBeginDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RENTALBEGINDATE_PROP.get());
  }
  
  /**
   * Gets the value of the RentalDailyRate field.
   * Vehicle Rental Daily Rate
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRentalDailyRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RENTALDAILYRATE_PROP.get());
  }
  
  /**
   * Gets the value of the RentalEndDate field.
   * date the vehicle rental ends
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRentalEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RENTALENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the RentalReserveNo field.
   * Vehicle rental Reservation Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRentalReserveNo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RENTALRESERVENO_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageCompany field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSalvageCompany() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SALVAGECOMPANY_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageNet field.
   * Net salvage recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageNet() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGENET_PROP.get());
  }
  
  /**
   * Gets the value of the SalvagePrep field.
   * Vehicle prep fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvagePrep() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGEPREP_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageProceeds field.
   * Amount vehicle was sold for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageProceeds() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGEPROCEEDS_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageStorage field.
   * Salvage storage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageStorage() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGESTORAGE_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageTitle field.
   * Title fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageTitle() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGETITLE_PROP.get());
  }
  
  /**
   * Gets the value of the SalvageTow field.
   * Towing fee
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageTow() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGETOW_PROP.get());
  }
  
  /**
   * Gets the value of the Speed field.
   * Speed of vehicle at impact, in MPH.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSpeed() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SPEED_PROP.get());
  }
  
  /**
   * Gets the value of the StorageAccrInd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getStorageAccrInd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(STORAGEACCRIND_PROP.get());
  }
  
  /**
   * Gets the value of the StorageFclty field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageFclty() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEFCLTY_PROP.get());
  }
  
  /**
   * Gets the value of the StorageFeeAmt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getStorageFeeAmt() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(STORAGEFEEAMT_PROP.get());
  }
  
  /**
   * Gets the value of the TotalLossPoints field.
   * Total Loss Calculated Points
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalLossPoints() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALLOSSPOINTS_PROP.get());
  }
  
  /**
   * Gets the value of the TrafficViolation field.
   * Did the vehicle involved in the accident violate traffic?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getTrafficViolation() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(TRAFFICVIOLATION_PROP.get());
  }
  
  /**
   * Gets the value of the VehCondType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehCondType getVehCondType() {
    return (typekey.VehCondType)__getInternalInterface().getFieldValue(VEHCONDTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Vehicle field.
   * Vehicle associated with the incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Vehicle getVehicle() {
    return (entity.Vehicle)__getInternalInterface().getFieldValue(VEHICLE_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleACV field.
   * Vehicle's actual cash value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getVehicleACV() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(VEHICLEACV_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleDirection field.
   * Direction the vehicle was traveling at impact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleDirection getVehicleDirection() {
    return (typekey.VehicleDirection)__getInternalInterface().getFieldValue(VEHICLEDIRECTION_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleLocation field.
   * Current location of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVehicleLocation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VEHICLELOCATION_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleLossParty field.
   * The loss party; generally either first- or third-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossPartyType getVehicleLossParty() {
    return (typekey.LossPartyType)__getInternalInterface().getFieldValue(VEHICLELOSSPARTY_PROP.get());
  }
  
  /**
   * Gets the value of the VehiclePolStatus field.
   * Policy Status of Vehicle
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehiclePolicyStatus getVehiclePolStatus() {
    return (typekey.VehiclePolicyStatus)__getInternalInterface().getFieldValue(VEHICLEPOLSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleTitleRecvd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getVehicleTitleRecvd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(VEHICLETITLERECVD_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleTitleReqd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getVehicleTitleReqd() {
    return (typekey.YesNo)__getInternalInterface().getFieldValue(VEHICLETITLEREQD_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleType field.
   * How the vehicle is related to the insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleType getVehicleType() {
    return (typekey.VehicleType)__getInternalInterface().getFieldValue(VEHICLETYPE_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleUseReason field.
   * Reason for vehicle use
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReasonForUse getVehicleUseReason() {
    return (typekey.ReasonForUse)__getInternalInterface().getFieldValue(VEHICLEUSEREASON_PROP.get());
  }
  
  /**
   * Gets the value of the AirbagsDeployed field.
   * Whether or not airbags deployed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAirbagsDeployed() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AIRBAGSDEPLOYED_PROP.get());
  }
  
  /**
   * Gets the value of the AirbagsMissing field.
   * Airbags Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAirbagsMissing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AIRBAGSMISSING_PROP.get());
  }
  
  /**
   * Gets the value of the AntiThftInd field.
   * Vehicle equipped with anti-theft device Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAntiThftInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ANTITHFTIND_PROP.get());
  }
  
  /**
   * Gets the value of the Appraisal field.
   * Indicator for Appraisal
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppraisal() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPRAISAL_PROP.get());
  }
  
  /**
   * Gets the value of the BodyShopSelected field.
   * Indicator for Body Shop information
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBodyShopSelected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BODYSHOPSELECTED_PROP.get());
  }
  
  /**
   * Gets the value of the Collision field.
   * Whether vehicle was involved in a collision?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCollision() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COLLISION_PROP.get());
  }
  
  /**
   * Gets the value of the ComponentsMissing field.
   * Major Components Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isComponentsMissing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPONENTSMISSING_PROP.get());
  }
  
  /**
   * Gets the value of the EquipmentFailure field.
   * Whether or not equipment failure was involved in the accident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEquipmentFailure() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EQUIPMENTFAILURE_PROP.get());
  }
  
  /**
   * Gets the value of the Extrication field.
   * Extrication Required?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExtrication() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTRICATION_PROP.get());
  }
  
  /**
   * Gets the value of the FireBurnDash field.
   * Fire Burn the Dash?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnDash() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNDASH_PROP.get());
  }
  
  /**
   * Gets the value of the FireBurnEngine field.
   * Fire Burn the Engine?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnEngine() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNENGINE_PROP.get());
  }
  
  /**
   * Gets the value of the FireBurnWindshield field.
   * Fire Burn the Windshield?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnWindshield() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNWINDSHIELD_PROP.get());
  }
  
  /**
   * Gets the value of the FloodSaltWater field.
   * Flood Occur Salt Water?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFloodSaltWater() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FLOODSALTWATER_PROP.get());
  }
  
  /**
   * Gets the value of the HitAndRun field.
   * Boolean field to indicate if a claim involves hit and run
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHitAndRun() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(HITANDRUN_PROP.get());
  }
  
  /**
   * Gets the value of the InteriorMissing field.
   * Any Of The Interior Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInteriorMissing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INTERIORMISSING_PROP.get());
  }
  
  /**
   * Gets the value of the LocationInd field.
   * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocationInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOCATIONIND_PROP.get());
  }
  
  /**
   * Gets the value of the Mileage100K field.
   * Mileage over 100K?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMileage100K() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MILEAGE100K_PROP.get());
  }
  
  /**
   * Gets the value of the MovePermission field.
   * Whether permission to move the vehicle has been received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMovePermission() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOVEPERMISSION_PROP.get());
  }
  
  /**
   * Gets the value of the OwnerRetainingSalvage field.
   * Boolean field to indicate if Owner will retain the salvaged car or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOwnerRetainingSalvage() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OWNERRETAININGSALVAGE_PROP.get());
  }
  
  /**
   * Gets the value of the OwnersPermission field.
   * Whether the vehicle was driven with the owner's permission.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOwnersPermission() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OWNERSPERMISSION_PROP.get());
  }
  
  /**
   * Gets the value of the PhantomVehicle field.
   * Unknown 3rd party vehicle involved or not(e.g. Hit and Run).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPhantomVehicle() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PHANTOMVEHICLE_PROP.get());
  }
  
  /**
   * Gets the value of the RentalRequired field.
   * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRentalRequired() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RENTALREQUIRED_PROP.get());
  }
  
  /**
   * Gets the value of the RepWhereDisInd field.
   * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRepWhereDisInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(REPWHEREDISIND_PROP.get());
  }
  
  /**
   * Gets the value of the TotalLoss field.
   * Whether the the vehicle is a total loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTotalLoss() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TOTALLOSS_PROP.get());
  }
  
  /**
   * Gets the value of the VehLockInd field.
   * Vehicle locked Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehLockInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHLOCKIND_PROP.get());
  }
  
  /**
   * Gets the value of the VehStolenInd field.
   * Vehicle stolen Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehStolenInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHSTOLENIND_PROP.get());
  }
  
  /**
   * Gets the value of the VehTowedInd field.
   * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehTowedInd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHTOWEDIND_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleAge10Years field.
   * Vehicle Ten Years Old?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleAge10Years() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEAGE10YEARS_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleAge5Years field.
   * Vehicle Five Years Old?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleAge5Years() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEAGE5YEARS_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleDriveable field.
   * Vehicle Driveable?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleDriveable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEDRIVEABLE_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleOperable field.
   * Indicator to state if a vehicle is operable or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleOperable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEOPERABLE_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleParked field.
   * Was the vehicle parked at the time of the loss?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleParked() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEPARKED_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleRollOver field.
   * Vehicle Roll Over?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleRollOver() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEROLLOVER_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleSubmerged field.
   * Vehicle Fully Submerged?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleSubmerged() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLESUBMERGED_PROP.get());
  }
  
  /**
   * Gets the value of the WaterLevelDash field.
   * Water Level Reach Dash?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaterLevelDash() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WATERLEVELDASH_PROP.get());
  }
  
  /**
   * Gets the value of the WaterLevelSeats field.
   * Water Level Reach Seats?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaterLevelSeats() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WATERLEVELSEATS_PROP.get());
  }
  
  /**
   * Removes the given element from the Citations array. This is achieved by marking the element for removal.
   */
  public void removeFromCitations(entity.Citation element) {
    __getInternalInterface().removeArrayElement(CITATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Citations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCitations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CITATIONS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AffdvCmplInd field.
   */
  public void setAffdvCmplInd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(AFFDVCMPLIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AirbagsDeployed field.
   */
  public void setAirbagsDeployed(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AIRBAGSDEPLOYED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AirbagsMissing field.
   */
  public void setAirbagsMissing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AIRBAGSMISSING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AntiThftInd field.
   */
  public void setAntiThftInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ANTITHFTIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Appraisal field.
   */
  public void setAppraisal(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPRAISAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BodyShopSelected field.
   */
  public void setBodyShopSelected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BODYSHOPSELECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CitationIssued field.
   */
  public void setCitationIssued(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(CITATIONISSUED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Citations field.
   */
  public void setCitations(entity.Citation[] value) {
    __getInternalInterface().setFieldValue(CITATIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Collision field.
   */
  public void setCollision(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COLLISION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CollisionPoint field.
   */
  public void setCollisionPoint(typekey.CollisionPoint value) {
    __getInternalInterface().setFieldValue(COLLISIONPOINT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ComponentsMissing field.
   */
  public void setComponentsMissing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COMPONENTSMISSING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateSalvageAssigned field.
   */
  public void setDateSalvageAssigned(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATESALVAGEASSIGNED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateVehicleRecovered field.
   */
  public void setDateVehicleRecovered(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEVEHICLERECOVERED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateVehicleSold field.
   */
  public void setDateVehicleSold(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEVEHICLESOLD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DriverRelToOwner field.
   */
  public void setDriverRelToOwner(typekey.PersonRelationType value) {
    __getInternalInterface().setFieldValue(DRIVERRELTOOWNER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DriverRelation field.
   */
  public void setDriverRelation(typekey.PersonRelationType value) {
    __getInternalInterface().setFieldValue(DRIVERRELATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EquipmentFailure field.
   */
  public void setEquipmentFailure(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EQUIPMENTFAILURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Extrication field.
   */
  public void setExtrication(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXTRICATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FireBurnDash field.
   */
  public void setFireBurnDash(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FIREBURNDASH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FireBurnEngine field.
   */
  public void setFireBurnEngine(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FIREBURNENGINE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FireBurnWindshield field.
   */
  public void setFireBurnWindshield(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FIREBURNWINDSHIELD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FloodSaltWater field.
   */
  public void setFloodSaltWater(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FLOODSALTWATER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HitAndRun field.
   */
  public void setHitAndRun(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(HITANDRUN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InteriorMissing field.
   */
  public void setInteriorMissing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INTERIORMISSING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LocationInd field.
   * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  public void setLocationInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LOCATIONIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LotNumber field.
   */
  public void setLotNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Mileage100K field.
   */
  public void setMileage100K(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MILEAGE100K_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinorOnPolicy field.
   */
  public void setMinorOnPolicy(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(MINORONPOLICY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MovePermission field.
   */
  public void setMovePermission(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MOVEPERMISSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OdomRead field.
   */
  public void setOdomRead(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ODOMREAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OwnerRetainingSalvage field.
   */
  public void setOwnerRetainingSalvage(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OWNERRETAININGSALVAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OwnersPermission field.
   */
  public void setOwnersPermission(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OWNERSPERMISSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PercentageDrivenByMinor field.
   */
  public void setPercentageDrivenByMinor(typekey.PercentageDriven value) {
    __getInternalInterface().setFieldValue(PERCENTAGEDRIVENBYMINOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PhantomVehicle field.
   */
  public void setPhantomVehicle(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PHANTOMVEHICLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecovClassType field.
   */
  public void setRecovClassType(typekey.RecovClassType value) {
    __getInternalInterface().setFieldValue(RECOVCLASSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecovCondType field.
   */
  public void setRecovCondType(typekey.RecovCondType value) {
    __getInternalInterface().setFieldValue(RECOVCONDTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecovDate field.
   */
  public void setRecovDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RECOVDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecovInd field.
   */
  public void setRecovInd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(RECOVIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecovState field.
   */
  public void setRecovState(typekey.State value) {
    __getInternalInterface().setFieldValue(RECOVSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecoveryLocation field.
   */
  public void setRecoveryLocation(entity.Address value) {
    __getInternalInterface().setFieldValue(RECOVERYLOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalAgency field.
   * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  public void setRentalAgency(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RENTALAGENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalBeginDate field.
   */
  public void setRentalBeginDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RENTALBEGINDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalDailyRate field.
   */
  public void setRentalDailyRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RENTALDAILYRATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalEndDate field.
   */
  public void setRentalEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RENTALENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalRequired field.
   * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  public void setRentalRequired(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RENTALREQUIRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RentalReserveNo field.
   */
  public void setRentalReserveNo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RENTALRESERVENO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RepWhereDisInd field.
   * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  public void setRepWhereDisInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(REPWHEREDISIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageCompany field.
   */
  public void setSalvageCompany(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SALVAGECOMPANY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageNet field.
   */
  public void setSalvageNet(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGENET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvagePrep field.
   */
  public void setSalvagePrep(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGEPREP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageProceeds field.
   */
  public void setSalvageProceeds(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGEPROCEEDS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageStorage field.
   */
  public void setSalvageStorage(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGESTORAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageTitle field.
   */
  public void setSalvageTitle(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGETITLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SalvageTow field.
   */
  public void setSalvageTow(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SALVAGETOW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Speed field.
   */
  public void setSpeed(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SPEED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageAccrInd field.
   */
  public void setStorageAccrInd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(STORAGEACCRIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageFclty field.
   */
  public void setStorageFclty(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STORAGEFCLTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StorageFeeAmt field.
   */
  public void setStorageFeeAmt(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(STORAGEFEEAMT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalLoss field.
   */
  public void setTotalLoss(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TOTALLOSS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalLossPoints field.
   */
  public void setTotalLossPoints(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TOTALLOSSPOINTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TrafficViolation field.
   */
  public void setTrafficViolation(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(TRAFFICVIOLATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehCondType field.
   */
  public void setVehCondType(typekey.VehCondType value) {
    __getInternalInterface().setFieldValue(VEHCONDTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehLockInd field.
   */
  public void setVehLockInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHLOCKIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehStolenInd field.
   */
  public void setVehStolenInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHSTOLENIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehTowedInd field.
   * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
   */
  @java.lang.Deprecated
  public void setVehTowedInd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHTOWEDIND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vehicle field.
   */
  public void setVehicle(entity.Vehicle value) {
    __getInternalInterface().setFieldValue(VEHICLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleACV field.
   */
  public void setVehicleACV(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(VEHICLEACV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleAge10Years field.
   */
  public void setVehicleAge10Years(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEAGE10YEARS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleAge5Years field.
   */
  public void setVehicleAge5Years(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEAGE5YEARS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleDirection field.
   */
  public void setVehicleDirection(typekey.VehicleDirection value) {
    __getInternalInterface().setFieldValue(VEHICLEDIRECTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleDriveable field.
   */
  public void setVehicleDriveable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEDRIVEABLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleLocation field.
   */
  public void setVehicleLocation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VEHICLELOCATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleLossParty field.
   */
  public void setVehicleLossParty(typekey.LossPartyType value) {
    __getInternalInterface().setFieldValue(VEHICLELOSSPARTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleOperable field.
   */
  public void setVehicleOperable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEOPERABLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleParked field.
   */
  public void setVehicleParked(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEPARKED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehiclePolStatus field.
   */
  public void setVehiclePolStatus(typekey.VehiclePolicyStatus value) {
    __getInternalInterface().setFieldValue(VEHICLEPOLSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleRollOver field.
   */
  public void setVehicleRollOver(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLEROLLOVER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleSubmerged field.
   */
  public void setVehicleSubmerged(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VEHICLESUBMERGED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleTitleRecvd field.
   */
  public void setVehicleTitleRecvd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(VEHICLETITLERECVD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleTitleReqd field.
   */
  public void setVehicleTitleReqd(typekey.YesNo value) {
    __getInternalInterface().setFieldValue(VEHICLETITLEREQD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleType field.
   */
  public void setVehicleType(typekey.VehicleType value) {
    __getInternalInterface().setFieldValue(VEHICLETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleUseReason field.
   */
  public void setVehicleUseReason(typekey.ReasonForUse value) {
    __getInternalInterface().setFieldValue(VEHICLEUSEREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaterLevelDash field.
   */
  public void setWaterLevelDash(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WATERLEVELDASH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WaterLevelSeats field.
   */
  public void setWaterLevelSeats(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WATERLEVELSEATS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.VehicleIncidentInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.VehicleIncident.this.__getDelegateManager();
    }
    
    /**
     * Adds an empty ClaimContactRole to this owner. It is assumed that the Contact associated with the role
     * will be filled in later. The role must be Required or ZeroToMore.
     * @param role 
     * @throws IllegalArgumentException if the role is prohibited or exclusive
     */
    public entity.ClaimContactRole addEmptyRole(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addEmptyRole(role);
    }
    
    /**
     * Adds a role with the specified contact to this entity. This method should only be used with Required or ZeroToMore
     * roles. For Exclusive roles, just set the property with the name of the role.
     * Does nothing if the Contact already has the role.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, gw.pl.contact.entity.Contact)} instead.
     */
    public entity.ClaimContactRole addRole(typekey.ContactRole role, entity.Contact contact) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).addRole(role, contact);
    }
    
    /**
     * Adds the given element to the Citations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCitations(entity.Citation element) {
      __getInternalInterface().addArrayElement(CITATIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ContentItemLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToContentItemLine(entity.AssessmentContentItem element) {
      __getInternalInterface().addArrayElement(CONTENTITEMLINE_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToExposures(entity.Exposure element) {
      __getInternalInterface().addArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ItemLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToItemLine(entity.AssessmentItem element) {
      __getInternalInterface().addArrayElement(ITEMLINE_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the LodgingProviders array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLodgingProviders(entity.LodgingProvider element) {
      __getInternalInterface().addArrayElement(LODGINGPROVIDERS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRoles(entity.ClaimContactRole element) {
      __getInternalInterface().addArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the SourceLine array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSourceLine(entity.AssessmentSource element) {
      __getInternalInterface().addArrayElement(SOURCELINE_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TypeofProperty array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTypeofProperty(entity.TypeofProperty element) {
      __getInternalInterface().addArrayElement(TYPEOFPROPERTY_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
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
    
    /**
     * Determines whether this owner can be edited.
     */
    public boolean canEdit() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).canEdit();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    /**
     * Determines whether or not the given role can be added to this ClaimContactRoleOwner. If not, returns a failure
     * object describing the problem.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkAddRole(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkAddRole(role, contact);
    }
    
    /**
     * Determines whether or not the given role can be removed the given number of times.
     * @param role 
     * @param count number of instances of the role to be removed
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRemoveRole(typekey.ContactRole role, int count) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRemoveRole(role, count);
    }
    
    /**
     * Checks the addition of the given role to the given contact, after it has occurred. To check the validity
     * of adding a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkAddRole(typekey.ContactRole, entity.Contact)}
     * instead.
     * @param role 
     * @param contact 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleAdded(typekey.ContactRole role, entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleAdded(role, contact);
    }
    
    /**
     * Checks the removal of the given role, after it has occurred. To check the validity
     * of removing a role before it has occurred, use
     * {@link ClaimContactRoleOwner#checkRemoveRole(typekey.ContactRole, int)}
     * instead.
     * @param role 
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure checkRoleRemoved(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).checkRoleRemoved(role);
    }
    
    /**
     */
    public void clearRoleCache() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).clearRoleCache();
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
     * Gets the value of the AffdvCmplInd field.
     * Affidavit completed Indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getAffdvCmplInd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(AFFDVCMPLIND_PROP.get());
    }
    
    /**
     * Returns all allowed contact roles for an incident
     * @return a list of allowed contact roles for an incident
     */
    public java.util.List<typekey.ContactRole> getAllowedContactRolesForEntity() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getAllowedContactRolesForEntity();
    }
    
    /**
     * Gets the value of the AppraisalFirstAppointment field.
     * @deprecated Scheduled time for the Appraisal from First Notice.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAppraisalFirstAppointment() {
      return (java.util.Date)__getInternalInterface().getFieldValue(APPRAISALFIRSTAPPOINTMENT_PROP.get());
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
     * Gets the value of the AssessmentCloseDate field.
     * Date when this Assessment is complete
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssessmentCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSESSMENTCLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentComment field.
     * Assessment Comment
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssessmentComment() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSESSMENTCOMMENT_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentName field.
     * The name or subject of this negotiation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAssessmentName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ASSESSMENTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentStatus field.
     * AssessmentStatus
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssessmentStatus getAssessmentStatus() {
      return (typekey.AssessmentStatus)__getInternalInterface().getFieldValue(ASSESSMENTSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentTargetCloseDate field.
     * Date when this Assessment is expected to be complete
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAssessmentTargetCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ASSESSMENTTARGETCLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the AssessmentType field.
     * AssessmentType
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssessmentType getAssessmentType() {
      return (typekey.AssessmentType)__getInternalInterface().getFieldValue(ASSESSMENTTYPE_PROP.get());
    }
    
    /**
     * The list of vehicles suitable for setting on this incident. Includes all the policy vehicles except those that
     * are already in use by other incidents
     * @return array of available vehicles, may be zero length but is never null
     */
    public entity.Vehicle[] getAvailableVehicles() {
      return ((gw.cc.exposure.entity.VehicleIncident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.VehicleIncident")).getAvailableVehicles();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CitationIssued field.
     * An indicator if there are citations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getCitationIssued() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(CITATIONISSUED_PROP.get());
    }
    
    /**
     * Gets the value of the Citations field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Citation[] getCitations() {
      return (entity.Citation[])__getInternalInterface().getFieldValue(CITATIONS_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * Claim to which this incident is related.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Get the directly related ClaimContact with the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContact or null if none exists
     */
    public entity.ClaimContact getClaimContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactByRole(role);
    }
    
    /**
     * Gets the ClaimContactRole in the given exclusive role.
     * @param role An exclusive role
     * @throws IllegalArgumentException if the role is not exclusive
     * @return ClaimContactRole or null if none exists.
     */
    public entity.ClaimContactRole getClaimContactRoleByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRoleByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContactRoles in the given role.
     * @param role 
     */
    public entity.ClaimContactRole[] getClaimContactRolesByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactRolesByRole(role);
    }
    
    /**
     * Gets the directly related ClaimContacts with the given role.
     * @param role 
     */
    public entity.ClaimContact[] getClaimContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRole(role);
    }
    
    public entity.ClaimContact[] getClaimContactsByRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsByRoles(roles);
    }
    
    /**
     * Gets the directly related ClaimContacts for all roles - all claim contacts owned by this
     * object.
     * <br>If you need all contacts, including those that are indirectly related to the Claim, use
     * {@link entity.Claim#getContacts()}
     */
    public entity.ClaimContact[] getClaimContactsForAllRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getClaimContactsForAllRoles();
    }
    
    /**
     * Gets this Incident's claim's currency.
     * @return the current Currency for the claim to which this incident belongs.  Returns NULL
     *         if the claim is currently unreachable (if, for example, the necessary entity
     *         connections have not yet been made).
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the CollisionPoint field.
     * Point of first impact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CollisionPoint getCollisionPoint() {
      return (typekey.CollisionPoint)__getInternalInterface().getFieldValue(COLLISIONPOINT_PROP.get());
    }
    
    /**
     * Gets the contact serving in an exclusive role on this entity. This method should only be used with Exclusive
     * roles. As an alternative to calling this method, you can read the value of the property with the name of the role.
     * @param role 
     * @throws IllegalArgumentException if the role is not exclusive
     * @return Contact or null if none exists
     */
    public entity.Contact getContactByRole(typekey.ContactRole role) throws java.lang.IllegalArgumentException {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactByRole(role);
    }
    
    /**
     * Gets the Contact class for the given role. If the role has a specific subtype constraint, returns that subtype. IF
     * there is no constraint or there are ExceptionConstraints to the subtype constraint, returns Contact.class.
     * @param role 
     * @deprecated Use getContactTypes instead, which will return all valid contact subtypes if there are more than one.
     */
    public gw.lang.reflect.IType getContactType(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactType(role);
    }
    
    /**
     * Gets the Contact classes for the given role.  If the role has a contact subtype constraint, returns that subtype.
     * If there are ExceptionConstraints then all valid subtypes will be returned (note, this only includes the types
     * specified in the constraints -- any subtypes of those types are implicitly valid.)  Otherwise returns [Contact.class].
     * @param role 
     */
    public java.util.List<gw.entity.IEntityType> getContactTypes(typekey.ContactRole role) {
      return ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).getContactTypes(role);
    }
    
    /**
     * Gets the directly related Contact in the given role on this entity. This method returns only contacts attached
     * directly to the entity. Contacts attached to the entity's sub-objects are not returned.
     * @param role 
     */
    public entity.Contact[] getContactsByRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRole(role);
    }
    
    public entity.Contact[] getContactsByRoles(typekey.ContactRole[] role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsByRoles(role);
    }
    
    /**
     * 
     * @param role 
     */
    public entity.Contact[] getContactsExcludeRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRole(role);
    }
    
    public entity.Contact[] getContactsExcludeRoles(typekey.ContactRole[] roles) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getContactsExcludeRoles(roles);
    }
    
    /**
     * Gets the value of the ContentItemLine field.
     * A list of line items for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentContentItem[] getContentItemLine() {
      return (entity.AssessmentContentItem[])__getInternalInterface().getFieldValue(CONTENTITEMLINE_PROP.get());
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
     * Gets the value of the DateSalvageAssigned field.
     * Date assignment made to salvage team
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateSalvageAssigned() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATESALVAGEASSIGNED_PROP.get());
    }
    
    /**
     * Gets the value of the DateVehicleRecovered field.
     * Whether vehicle has been recovered
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateVehicleRecovered() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEVEHICLERECOVERED_PROP.get());
    }
    
    /**
     * Gets the value of the DateVehicleSold field.
     * Whether vehicle has been sold
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateVehicleSold() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEVEHICLESOLD_PROP.get());
    }
    
    /**
     * Gets the value of the DescOther field.
     * Other Description
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescOther() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCOTHER_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * General description of the incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the DriverRelToOwner field.
     * Relationship of the driver to the vehicle's owner. This is redundant for a first-party loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PersonRelationType getDriverRelToOwner() {
      return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(DRIVERRELTOOWNER_PROP.get());
    }
    
    /**
     * Gets the value of the DriverRelation field.
     * Relationship of the driver to the insured. This is redundant for a first-party loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PersonRelationType getDriverRelation() {
      return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(DRIVERRELATION_PROP.get());
    }
    
    /**
     * Gets the value of the EstDamageType field.
     * Total estimate of damage for the event, if known, at the time that the loss was reported. 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.EstDamageType getEstDamageType() {
      return (typekey.EstDamageType)__getInternalInterface().getFieldValue(ESTDAMAGETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the EstRepairCost field.
     * Estimated Repair Cost
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getEstRepairCost() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(ESTREPAIRCOST_PROP.get());
    }
    
    /**
     * Gets the value of the EstRepairTime field.
     * Estimated Repair Time
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEstRepairTime() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ESTREPAIRTIME_PROP.get());
    }
    
    /**
     * Gets the value of the EstimatesReceived field.
     * Have the repair estimates been received
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getEstimatesReceived() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(ESTIMATESRECEIVED_PROP.get());
    }
    
    /**
     * Gets the value of the Exposures field.
     * A list of exposures for this incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure[] getExposures() {
      return (entity.Exposure[])__getInternalInterface().getFieldValue(EXPOSURES_PROP.get());
    }
    
    /**
     * Gets the value of the ExtDamagetxt field.
     * extent of damage to property text
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExtDamagetxt() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTDAMAGETXT_PROP.get());
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
     * Gets the value of the InternalUser field.
     * Internal User
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getInternalUser() {
      return (entity.User)__getInternalInterface().getFieldValue(INTERNALUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInternalUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INTERNALUSER_PROP.get());
    }
    
    /**
     * Gets the value of the ItemLine field.
     * A list of line items for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentItem[] getItemLine() {
      return (entity.AssessmentItem[])__getInternalInterface().getFieldValue(ITEMLINE_PROP.get());
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
     * Gets the value of the LocationAddress field.
     * Location address of the incident. Previous fields that made up this address described as 'Location of the Exposed Vehicle'.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getLocationAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(LOCATIONADDRESS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLocationAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOCATIONADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the LodgingProviders field.
     * Lodging providers for this incident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LodgingProvider[] getLodgingProviders() {
      return (entity.LodgingProvider[])__getInternalInterface().getFieldValue(LODGINGPROVIDERS_PROP.get());
    }
    
    /**
     * Gets the value of the LossDesc field.
     * Loss occurred if Other is selected Description needed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossDesc() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSDESC_PROP.get());
    }
    
    /**
     * Gets the value of the LossEstimate field.
     * Estimated cost of the loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLossEstimate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LOSSESTIMATE_PROP.get());
    }
    
    /**
     * Gets the value of the LossOccured field.
     * Where Loss occurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossOccured getLossOccured() {
      return (typekey.LossOccured)__getInternalInterface().getFieldValue(LOSSOCCURED_PROP.get());
    }
    
    /**
     * Gets the value of the LotNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLotNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOTNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the MealsDays field.
     * Number of days of meals
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMealsDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MEALSDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the MealsPeople field.
     * Number of people requiring meals
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMealsPeople() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MEALSPEOPLE_PROP.get());
    }
    
    /**
     * Gets the value of the MealsRate field.
     * Daily rate of meals
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getMealsRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MEALSRATE_PROP.get());
    }
    
    /**
     * Gets the value of the MinorOnPolicy field.
     * If the driver involved in accident is a minor, is he/she listed in the policy?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getMinorOnPolicy() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(MINORONPOLICY_PROP.get());
    }
    
    /**
     * Return all the non-exclusive claim contact roles for this owner
     * @return a list of claim contact role objects, possibly empty but never null
     */
    public entity.ClaimContactRole[] getNonExclusiveRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getNonExclusiveRoles();
    }
    
    /**
     * Gets the value of the OdomRead field.
     * Odometer reading
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOdomRead() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ODOMREAD_PROP.get());
    }
    
    /**
     * Returns the ContentItemLine ordered by the IncidentOrder value.
     * @return the sorted ContentItemLine array
     */
    public entity.AssessmentContentItem[] getOrderedContentItemLine() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).getOrderedContentItemLine();
    }
    
    /**
     * Gets the value of the PercentageDrivenByMinor field.
     * % of time vehicle used by the minor
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PercentageDriven getPercentageDrivenByMinor() {
      return (typekey.PercentageDriven)__getInternalInterface().getFieldValue(PERCENTAGEDRIVENBYMINOR_PROP.get());
    }
    
    /**
     * Gets the value of the PropertyDesc field.
     * Description of property
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPropertyDesc() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PROPERTYDESC_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecovClassType field.
     * Describes which parts or recovered vehicle were stripped
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RecovClassType getRecovClassType() {
      return (typekey.RecovClassType)__getInternalInterface().getFieldValue(RECOVCLASSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the RecovCondType field.
     * Describes which general condition of vehicle upon recovery
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RecovCondType getRecovCondType() {
      return (typekey.RecovCondType)__getInternalInterface().getFieldValue(RECOVCONDTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the RecovDate field.
     * Date the vehicle was recovered
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRecovDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RECOVDATE_PROP.get());
    }
    
    /**
     * Gets the value of the RecovInd field.
     * Recovery Indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getRecovInd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(RECOVIND_PROP.get());
    }
    
    /**
     * Gets the value of the RecovState field.
     * State (aka Territory) where the vehicle upon recovery
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getRecovState() {
      return (typekey.State)__getInternalInterface().getFieldValue(RECOVSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryLocation field.
     * The Address at which the recovery was made.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getRecoveryLocation() {
      return (entity.Address)__getInternalInterface().getFieldValue(RECOVERYLOCATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRecoveryLocationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RECOVERYLOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the RentalAgency field.
     * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRentalAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RENTALAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the RentalBeginDate field.
     * Date the vehical rental begins
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRentalBeginDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RENTALBEGINDATE_PROP.get());
    }
    
    /**
     * Gets the value of the RentalDailyRate field.
     * Vehicle Rental Daily Rate
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getRentalDailyRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RENTALDAILYRATE_PROP.get());
    }
    
    /**
     * Gets the value of the RentalEndDate field.
     * date the vehicle rental ends
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRentalEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RENTALENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the RentalReserveNo field.
     * Vehicle rental Reservation Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRentalReserveNo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RENTALRESERVENO_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Roles field.
     * The contacts and their roles associated with this incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContactRole[] getRoles() {
      return (entity.ClaimContactRole[])__getInternalInterface().getFieldValue(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageCompany field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSalvageCompany() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SALVAGECOMPANY_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageNet field.
     * Net salvage recovery
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvageNet() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGENET_PROP.get());
    }
    
    /**
     * Gets the value of the SalvagePrep field.
     * Vehicle prep fees
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvagePrep() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGEPREP_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageProceeds field.
     * Amount vehicle was sold for
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvageProceeds() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGEPROCEEDS_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageStorage field.
     * Salvage storage
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvageStorage() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGESTORAGE_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageTitle field.
     * Title fees
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvageTitle() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGETITLE_PROP.get());
    }
    
    /**
     * Gets the value of the SalvageTow field.
     * Towing fee
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSalvageTow() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SALVAGETOW_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequests field.
     * Service requests associated with this incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest[] getServiceRequests() {
      return (entity.ServiceRequest[])__getInternalInterface().getFieldValue(SERVICEREQUESTS_PROP.get());
    }
    
    /**
     * Gets the value of the Severity field.
     * Severity of the loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SeverityType getSeverity() {
      return (typekey.SeverityType)__getInternalInterface().getFieldValue(SEVERITY_PROP.get());
    }
    
    /**
     * Gets the value of the SourceLine field.
     * A source for this assessment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssessmentSource[] getSourceLine() {
      return (entity.AssessmentSource[])__getInternalInterface().getFieldValue(SOURCELINE_PROP.get());
    }
    
    /**
     * Gets the value of the Speed field.
     * Speed of vehicle at impact, in MPH.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSpeed() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SPEED_PROP.get());
    }
    
    /**
     * Gets the value of the StorageAccrInd field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getStorageAccrInd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(STORAGEACCRIND_PROP.get());
    }
    
    /**
     * Gets the value of the StorageFclty field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStorageFclty() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STORAGEFCLTY_PROP.get());
    }
    
    /**
     * Gets the value of the StorageFeeAmt field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getStorageFeeAmt() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(STORAGEFEEAMT_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Incident getSubtype() {
      return (typekey.Incident)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Return all non-exclusive contact roles which are suitable for this owner's type and the
     * given contact. Used in the UI to restrict the user to suitable choices when adding a new
     * contact/role pair to the role owner
     * @param contact a contact, possibly null
     * @return an array of suitable roles, or an empty array if there are none
     */
    public typekey.ContactRole[] getSuitableNonExclusiveRolesFor(entity.Contact contact) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).getSuitableNonExclusiveRolesFor(contact);
    }
    
    /**
     * Gets the value of the TotalLossPoints field.
     * Total Loss Calculated Points
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTotalLossPoints() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALLOSSPOINTS_PROP.get());
    }
    
    /**
     * Gets the value of the TrafficViolation field.
     * Did the vehicle involved in the accident violate traffic?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getTrafficViolation() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(TRAFFICVIOLATION_PROP.get());
    }
    
    /**
     * Gets the value of the TypeofProperty field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TypeofProperty[] getTypeofProperty() {
      return (entity.TypeofProperty[])__getInternalInterface().getFieldValue(TYPEOFPROPERTY_PROP.get());
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
     * Gets the value of the VehCondType field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehCondType getVehCondType() {
      return (typekey.VehCondType)__getInternalInterface().getFieldValue(VEHCONDTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Vehicle field.
     * Vehicle associated with the incident.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Vehicle getVehicle() {
      return (entity.Vehicle)__getInternalInterface().getFieldValue(VEHICLE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleACV field.
     * Vehicle's actual cash value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getVehicleACV() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(VEHICLEACV_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleDirection field.
     * Direction the vehicle was traveling at impact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehicleDirection getVehicleDirection() {
      return (typekey.VehicleDirection)__getInternalInterface().getFieldValue(VEHICLEDIRECTION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getVehicleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(VEHICLE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleLocation field.
     * Current location of the vehicle.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVehicleLocation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VEHICLELOCATION_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleLossParty field.
     * The loss party; generally either first- or third-party loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossPartyType getVehicleLossParty() {
      return (typekey.LossPartyType)__getInternalInterface().getFieldValue(VEHICLELOSSPARTY_PROP.get());
    }
    
    /**
     * Gets the value of the VehiclePolStatus field.
     * Policy Status of Vehicle
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehiclePolicyStatus getVehiclePolStatus() {
      return (typekey.VehiclePolicyStatus)__getInternalInterface().getFieldValue(VEHICLEPOLSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleTitleRecvd field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getVehicleTitleRecvd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(VEHICLETITLERECVD_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleTitleReqd field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.YesNo getVehicleTitleReqd() {
      return (typekey.YesNo)__getInternalInterface().getFieldValue(VEHICLETITLEREQD_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleType field.
     * How the vehicle is related to the insured
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.VehicleType getVehicleType() {
      return (typekey.VehicleType)__getInternalInterface().getFieldValue(VEHICLETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleUseReason field.
     * Reason for vehicle use
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReasonForUse getVehicleUseReason() {
      return (typekey.ReasonForUse)__getInternalInterface().getFieldValue(VEHICLEUSEREASON_PROP.get());
    }
    
    /**
     * Gets the value of the WhenToView field.
     * @deprecated Possible dates when the damage may be viewed.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWhenToView() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WHENTOVIEW_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AirbagsDeployed field.
     * Whether or not airbags deployed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAirbagsDeployed() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AIRBAGSDEPLOYED_PROP.get());
    }
    
    /**
     * Gets the value of the AirbagsMissing field.
     * Airbags Missing?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAirbagsMissing() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AIRBAGSMISSING_PROP.get());
    }
    
    /**
     * Gets the value of the AlreadyRepaired field.
     * Has the item been repaired already?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAlreadyRepaired() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ALREADYREPAIRED_PROP.get());
    }
    
    /**
     * Gets the value of the AntiThftInd field.
     * Vehicle equipped with anti-theft device Indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAntiThftInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ANTITHFTIND_PROP.get());
    }
    
    /**
     * Gets the value of the Appraisal field.
     * Indicator for Appraisal
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppraisal() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPRAISAL_PROP.get());
    }
    
    /**
     * Returns whether this incident is better than the given one as the first choice for a new exposure Default
     * implementation checks which of the incidents is used by an exposure (unused is better) then
     * backs off to display name ordering.
     * 
     * The implementation can assume that the other incident provided as its argument is exactly
     * the same subtype of incident as this incident (e.g. if this is a VehicleIncident then the
     * "other" parameter will also be a VehicleIncident) it is permissible to throw a ClassCastException
     * if this is not true.
     * @param other second incident to test whether this incident is better than it
     * @return true if this incident is better than the given one
     */
    public boolean isBetterForNewExposure(entity.Incident other) {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).isBetterForNewExposure(other);
    }
    
    /**
     * Gets the value of the BodyShopSelected field.
     * Indicator for Body Shop information
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBodyShopSelected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BODYSHOPSELECTED_PROP.get());
    }
    
    /**
     * Gets the value of the Collision field.
     * Whether vehicle was involved in a collision?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCollision() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COLLISION_PROP.get());
    }
    
    /**
     * Gets the value of the ComponentsMissing field.
     * Major Components Missing?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isComponentsMissing() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPONENTSMISSING_PROP.get());
    }
    
    /**
     * Determines whether some data on the contact in the given role has changed.
     * @param role 
     */
    public boolean isContactInRoleChanged(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleChanged(role);
    }
    
    /**
     * Determines whether the contact in the given role is a different contact than the one originally
     * in the role.
     * @param role 
     */
    public boolean isContactInRoleDifferent(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isContactInRoleDifferent(role);
    }
    
    /**
     * Gets the value of the EquipmentFailure field.
     * Whether or not equipment failure was involved in the accident
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEquipmentFailure() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EQUIPMENTFAILURE_PROP.get());
    }
    
    /**
     * Determines whether or not the given role has the 'Exclusive' constraint on this object.
     * @param role a contact role, cannot be null
     */
    public boolean isExclusiveRole(typekey.ContactRole role) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isExclusiveRole(role);
    }
    
    /**
     * Gets the value of the Extrication field.
     * Extrication Required?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExtrication() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTRICATION_PROP.get());
    }
    
    /**
     * Gets the value of the FireBurnDash field.
     * Fire Burn the Dash?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFireBurnDash() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNDASH_PROP.get());
    }
    
    /**
     * Gets the value of the FireBurnEngine field.
     * Fire Burn the Engine?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFireBurnEngine() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNENGINE_PROP.get());
    }
    
    /**
     * Gets the value of the FireBurnWindshield field.
     * Fire Burn the Windshield?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFireBurnWindshield() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FIREBURNWINDSHIELD_PROP.get());
    }
    
    /**
     * Gets the value of the FloodSaltWater field.
     * Flood Occur Salt Water?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isFloodSaltWater() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FLOODSALTWATER_PROP.get());
    }
    
    /**
     * Gets the value of the HitAndRun field.
     * Boolean field to indicate if a claim involves hit and run
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isHitAndRun() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(HITANDRUN_PROP.get());
    }
    
    /**
     * Gets the value of the IncludeContentLineItems field.
     * Boolean field to indicate if assessmentcontentitems are utilized
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeContentLineItems() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDECONTENTLINEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the IncludeLineItems field.
     * Boolean field to indicate if assessmentitems are utilized
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeLineItems() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDELINEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the InspectionRequired field.
     * @deprecated Is an inspection required? Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInspectionRequired() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INSPECTIONREQUIRED_PROP.get());
    }
    
    /**
     * Gets the value of the InteriorMissing field.
     * Any Of The Interior Missing?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInteriorMissing() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INTERIORMISSING_PROP.get());
    }
    
    /**
     * Gets the value of the LocationInd field.
     * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLocationInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOCATIONIND_PROP.get());
    }
    
    /**
     * Gets the value of the LossofUse field.
     * Whether there has been loss of use
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLossofUse() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LOSSOFUSE_PROP.get());
    }
    
    /**
     * Gets the value of the Mileage100K field.
     * Mileage over 100K?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMileage100K() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MILEAGE100K_PROP.get());
    }
    
    /**
     * Gets the value of the MovePermission field.
     * Whether permission to move the vehicle has been received
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMovePermission() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MOVEPERMISSION_PROP.get());
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
     * Gets the value of the OwnerRetainingSalvage field.
     * Boolean field to indicate if Owner will retain the salvaged car or not
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isOwnerRetainingSalvage() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OWNERRETAININGSALVAGE_PROP.get());
    }
    
    /**
     * Gets the value of the OwnersPermission field.
     * Whether the vehicle was driven with the owner's permission.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isOwnersPermission() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OWNERSPERMISSION_PROP.get());
    }
    
    /**
     * Gets the value of the PhantomVehicle field.
     * Unknown 3rd party vehicle involved or not(e.g. Hit and Run).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPhantomVehicle() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PHANTOMVEHICLE_PROP.get());
    }
    
    /**
     * Gets the value of the RentalRequired field.
     * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRentalRequired() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RENTALREQUIRED_PROP.get());
    }
    
    /**
     * Gets the value of the RepWhereDisInd field.
     * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRepWhereDisInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REPWHEREDISIND_PROP.get());
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
     * Determines whether or not the given role has the given constraint on this object.
     * @param role 
     * @param constraintType 
     */
    public boolean isRoleConstrained(typekey.ContactRole role, com.guidewire.cc.domain.contact.config.RoleConstraintType constraintType) {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).isRoleConstrained(role, constraintType);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TotalLoss field.
     * Whether the the vehicle is a total loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTotalLoss() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TOTALLOSS_PROP.get());
    }
    
    /**
     * Returns whether this incident is used by at least one exposure.
     * @return true if the incident is used by an exposure, false otherwise
     */
    public boolean isUsedByExposure() {
      return ((gw.cc.exposure.entity.Incident)__getDelegateManager().getImplementation("gw.cc.exposure.entity.Incident")).isUsedByExposure();
    }
    
    /**
     * Gets the value of the VehLockInd field.
     * Vehicle locked Indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehLockInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHLOCKIND_PROP.get());
    }
    
    /**
     * Gets the value of the VehStolenInd field.
     * Vehicle stolen Indicator
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehStolenInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHSTOLENIND_PROP.get());
    }
    
    /**
     * Gets the value of the VehTowedInd field.
     * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehTowedInd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHTOWEDIND_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleAge10Years field.
     * Vehicle Ten Years Old?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleAge10Years() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEAGE10YEARS_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleAge5Years field.
     * Vehicle Five Years Old?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleAge5Years() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEAGE5YEARS_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleDriveable field.
     * Vehicle Driveable?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleDriveable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEDRIVEABLE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleOperable field.
     * Indicator to state if a vehicle is operable or not
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleOperable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEOPERABLE_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleParked field.
     * Was the vehicle parked at the time of the loss?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleParked() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEPARKED_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleRollOver field.
     * Vehicle Roll Over?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleRollOver() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLEROLLOVER_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleSubmerged field.
     * Vehicle Fully Submerged?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isVehicleSubmerged() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VEHICLESUBMERGED_PROP.get());
    }
    
    /**
     * Gets the value of the WaterLevelDash field.
     * Water Level Reach Dash?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWaterLevelDash() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WATERLEVELDASH_PROP.get());
    }
    
    /**
     * Gets the value of the WaterLevelSeats field.
     * Water Level Reach Seats?
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWaterLevelSeats() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WATERLEVELSEATS_PROP.get());
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
     * Removes all roles associated with this ClaimContactRoleOwner.
     */
    public void removeAllRoles() {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeAllRoles();
    }
    
    /**
     * Removes the given element from the Citations array. This is achieved by marking the element for removal.
     */
    public void removeFromCitations(entity.Citation element) {
      __getInternalInterface().removeArrayElement(CITATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Citations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCitations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CITATIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
     */
    public void removeFromContentItemLine(entity.AssessmentContentItem element) {
      __getInternalInterface().removeArrayElement(CONTENTITEMLINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromContentItemLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CONTENTITEMLINE_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     */
    public void removeFromExposures(entity.Exposure element) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromExposures(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(EXPOSURES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
     */
    public void removeFromItemLine(entity.AssessmentItem element) {
      __getInternalInterface().removeArrayElement(ITEMLINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromItemLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ITEMLINE_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the LodgingProviders array. This is achieved by marking the element for removal.
     */
    public void removeFromLodgingProviders(entity.LodgingProvider element) {
      __getInternalInterface().removeArrayElement(LODGINGPROVIDERS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LodgingProviders array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLodgingProviders(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LODGINGPROVIDERS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     */
    public void removeFromRoles(entity.ClaimContactRole element) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Roles array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRoles(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ROLES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     */
    public void removeFromServiceRequests(entity.ServiceRequest element) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
     */
    public void removeFromSourceLine(entity.AssessmentSource element) {
      __getInternalInterface().removeArrayElement(SOURCELINE_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSourceLine(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SOURCELINE_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TypeofProperty array. This is achieved by marking the element for removal.
     */
    public void removeFromTypeofProperty(entity.TypeofProperty element) {
      __getInternalInterface().removeArrayElement(TYPEOFPROPERTY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TypeofProperty array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTypeofProperty(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TYPEOFPROPERTY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given ClaimContactRole from this owner.
     * @param claimContactRole 
     * @throws IllegalArgumentException if this is not the owner of the given ClaimContactRole.
     */
    public void removeRole(entity.ClaimContactRole claimContactRole) {
      ((gw.api.contact.ClaimContactRoleOwner)__getDelegateManager().getImplementation("gw.api.contact.ClaimContactRoleOwner")).removeRole(claimContactRole);
    }
    
    /**
     * Removes the given role from the given Contact. Does nothing if the Contact does not have the role. This method
     * should only be used with Required or ZeroToMore roles.
     * @param role Role that is not exclusive
     * @param contact 
     * @throws IllegalArgumentException if the role is exclusive or prohibited, or the Contact is null or not of the
     * right type for the given role. For exclusive roles, use
     * {@link ClaimContactRoleOwner#setContactByRole(ContactRole, Contact)} instead.
     */
    public void removeRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).removeRole(role, contact);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AffdvCmplInd field.
     */
    public void setAffdvCmplInd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(AFFDVCMPLIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AirbagsDeployed field.
     */
    public void setAirbagsDeployed(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AIRBAGSDEPLOYED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AirbagsMissing field.
     */
    public void setAirbagsMissing(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AIRBAGSMISSING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AlreadyRepaired field.
     */
    public void setAlreadyRepaired(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ALREADYREPAIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AntiThftInd field.
     */
    public void setAntiThftInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ANTITHFTIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Appraisal field.
     */
    public void setAppraisal(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPRAISAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AppraisalFirstAppointment field.
     * @deprecated Scheduled time for the Appraisal from First Notice.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    public void setAppraisalFirstAppointment(java.util.Date value) {
      __getInternalInterface().setFieldValue(APPRAISALFIRSTAPPOINTMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentCloseDate field.
     */
    public void setAssessmentCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSESSMENTCLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentComment field.
     */
    public void setAssessmentComment(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSESSMENTCOMMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentName field.
     */
    public void setAssessmentName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ASSESSMENTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentStatus field.
     */
    public void setAssessmentStatus(typekey.AssessmentStatus value) {
      __getInternalInterface().setFieldValue(ASSESSMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentTargetCloseDate field.
     */
    public void setAssessmentTargetCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ASSESSMENTTARGETCLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssessmentType field.
     */
    public void setAssessmentType(typekey.AssessmentType value) {
      __getInternalInterface().setFieldValue(ASSESSMENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BodyShopSelected field.
     */
    public void setBodyShopSelected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BODYSHOPSELECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CitationIssued field.
     */
    public void setCitationIssued(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(CITATIONISSUED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Citations field.
     */
    public void setCitations(entity.Citation[] value) {
      __getInternalInterface().setFieldValue(CITATIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Collision field.
     */
    public void setCollision(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COLLISION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CollisionPoint field.
     */
    public void setCollisionPoint(typekey.CollisionPoint value) {
      __getInternalInterface().setFieldValue(COLLISIONPOINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ComponentsMissing field.
     */
    public void setComponentsMissing(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COMPONENTSMISSING_PROP.get(), value);
    }
    
    /**
     * Sets the Contact in the given role to the given Contact.
     * @param role 
     * @param contact 
     * @throws IllegalArgumentException if the role is not exclusive, or if the Contact is non-null and
     *                                  the role is prohibited or constrained to a different Contact type.
     */
    public void setContactByRole(typekey.ContactRole role, entity.Contact contact) {
      ((com.guidewire.cc.domain.contact.EntityContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.EntityContactRoleOwner")).setContactByRole(role, contact);
    }
    
    /**
     * Sets the value of the ContentItemLine field.
     */
    public void setContentItemLine(entity.AssessmentContentItem[] value) {
      __getInternalInterface().setFieldValue(CONTENTITEMLINE_PROP.get(), value);
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
     * Sets the value of the DateSalvageAssigned field.
     */
    public void setDateSalvageAssigned(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATESALVAGEASSIGNED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateVehicleRecovered field.
     */
    public void setDateVehicleRecovered(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEVEHICLERECOVERED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateVehicleSold field.
     */
    public void setDateVehicleSold(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEVEHICLESOLD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DescOther field.
     */
    public void setDescOther(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCOTHER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DriverRelToOwner field.
     */
    public void setDriverRelToOwner(typekey.PersonRelationType value) {
      __getInternalInterface().setFieldValue(DRIVERRELTOOWNER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DriverRelation field.
     */
    public void setDriverRelation(typekey.PersonRelationType value) {
      __getInternalInterface().setFieldValue(DRIVERRELATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EquipmentFailure field.
     */
    public void setEquipmentFailure(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EQUIPMENTFAILURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EstDamageType field.
     */
    public void setEstDamageType(typekey.EstDamageType value) {
      __getInternalInterface().setFieldValue(ESTDAMAGETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EstRepairCost field.
     */
    public void setEstRepairCost(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(ESTREPAIRCOST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EstRepairTime field.
     */
    public void setEstRepairTime(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ESTREPAIRTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EstimatesReceived field.
     */
    public void setEstimatesReceived(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(ESTIMATESRECEIVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposures field.
     */
    public void setExposures(entity.Exposure[] value) {
      __getInternalInterface().setFieldValue(EXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExtDamagetxt field.
     */
    public void setExtDamagetxt(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXTDAMAGETXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Extrication field.
     */
    public void setExtrication(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXTRICATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FireBurnDash field.
     */
    public void setFireBurnDash(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FIREBURNDASH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FireBurnEngine field.
     */
    public void setFireBurnEngine(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FIREBURNENGINE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FireBurnWindshield field.
     */
    public void setFireBurnWindshield(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FIREBURNWINDSHIELD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FloodSaltWater field.
     */
    public void setFloodSaltWater(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FLOODSALTWATER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HitAndRun field.
     */
    public void setHitAndRun(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(HITANDRUN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeContentLineItems field.
     */
    public void setIncludeContentLineItems(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDECONTENTLINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeLineItems field.
     */
    public void setIncludeLineItems(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDELINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InspectionRequired field.
     * @deprecated Is an inspection required? Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    public void setInspectionRequired(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INSPECTIONREQUIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InteriorMissing field.
     */
    public void setInteriorMissing(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INTERIORMISSING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InternalUser field.
     */
    public void setInternalUser(entity.User value) {
      __getInternalInterface().setFieldValue(INTERNALUSER_PROP.get(), value);
    }
    
    public void setInternalUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(INTERNALUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ItemLine field.
     */
    public void setItemLine(entity.AssessmentItem[] value) {
      __getInternalInterface().setFieldValue(ITEMLINE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LocationAddress field.
     */
    public void setLocationAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(LOCATIONADDRESS_PROP.get(), value);
    }
    
    public void setLocationAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOCATIONADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LocationInd field.
     * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
     */
    @java.lang.Deprecated
    public void setLocationInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOCATIONIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LodgingProviders field.
     */
    public void setLodgingProviders(entity.LodgingProvider[] value) {
      __getInternalInterface().setFieldValue(LODGINGPROVIDERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDesc field.
     */
    public void setLossDesc(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSDESC_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossEstimate field.
     */
    public void setLossEstimate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LOSSESTIMATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossOccured field.
     */
    public void setLossOccured(typekey.LossOccured value) {
      __getInternalInterface().setFieldValue(LOSSOCCURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossofUse field.
     */
    public void setLossofUse(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LOSSOFUSE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LotNumber field.
     */
    public void setLotNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOTNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MealsDays field.
     */
    public void setMealsDays(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MEALSDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MealsPeople field.
     */
    public void setMealsPeople(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MEALSPEOPLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MealsRate field.
     */
    public void setMealsRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(MEALSRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Mileage100K field.
     */
    public void setMileage100K(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MILEAGE100K_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinorOnPolicy field.
     */
    public void setMinorOnPolicy(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(MINORONPOLICY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MovePermission field.
     */
    public void setMovePermission(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MOVEPERMISSION_PROP.get(), value);
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
     * Sets the value of the OdomRead field.
     */
    public void setOdomRead(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ODOMREAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OwnerRetainingSalvage field.
     */
    public void setOwnerRetainingSalvage(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OWNERRETAININGSALVAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OwnersPermission field.
     */
    public void setOwnersPermission(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OWNERSPERMISSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PercentageDrivenByMinor field.
     */
    public void setPercentageDrivenByMinor(typekey.PercentageDriven value) {
      __getInternalInterface().setFieldValue(PERCENTAGEDRIVENBYMINOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PhantomVehicle field.
     */
    public void setPhantomVehicle(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PHANTOMVEHICLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PropertyDesc field.
     */
    public void setPropertyDesc(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PROPERTYDESC_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecovClassType field.
     */
    public void setRecovClassType(typekey.RecovClassType value) {
      __getInternalInterface().setFieldValue(RECOVCLASSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecovCondType field.
     */
    public void setRecovCondType(typekey.RecovCondType value) {
      __getInternalInterface().setFieldValue(RECOVCONDTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecovDate field.
     */
    public void setRecovDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RECOVDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecovInd field.
     */
    public void setRecovInd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(RECOVIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecovState field.
     */
    public void setRecovState(typekey.State value) {
      __getInternalInterface().setFieldValue(RECOVSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryLocation field.
     */
    public void setRecoveryLocation(entity.Address value) {
      __getInternalInterface().setFieldValue(RECOVERYLOCATION_PROP.get(), value);
    }
    
    public void setRecoveryLocationID(gw.pl.persistence.core.Key value) {
      setFieldValue(RECOVERYLOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalAgency field.
     * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
     */
    @java.lang.Deprecated
    public void setRentalAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RENTALAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalBeginDate field.
     */
    public void setRentalBeginDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RENTALBEGINDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalDailyRate field.
     */
    public void setRentalDailyRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RENTALDAILYRATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalEndDate field.
     */
    public void setRentalEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RENTALENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalRequired field.
     * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
     */
    @java.lang.Deprecated
    public void setRentalRequired(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RENTALREQUIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RentalReserveNo field.
     */
    public void setRentalReserveNo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RENTALRESERVENO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RepWhereDisInd field.
     * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
     */
    @java.lang.Deprecated
    public void setRepWhereDisInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REPWHEREDISIND_PROP.get(), value);
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
     * Sets the value of the Roles field.
     */
    public void setRoles(entity.ClaimContactRole[] value) {
      __getInternalInterface().setFieldValue(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageCompany field.
     */
    public void setSalvageCompany(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SALVAGECOMPANY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageNet field.
     */
    public void setSalvageNet(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGENET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvagePrep field.
     */
    public void setSalvagePrep(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGEPREP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageProceeds field.
     */
    public void setSalvageProceeds(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGEPROCEEDS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageStorage field.
     */
    public void setSalvageStorage(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGESTORAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageTitle field.
     */
    public void setSalvageTitle(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGETITLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SalvageTow field.
     */
    public void setSalvageTow(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SALVAGETOW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequests field.
     */
    public void setServiceRequests(entity.ServiceRequest[] value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Severity field.
     */
    public void setSeverity(typekey.SeverityType value) {
      __getInternalInterface().setFieldValue(SEVERITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceLine field.
     */
    public void setSourceLine(entity.AssessmentSource[] value) {
      __getInternalInterface().setFieldValue(SOURCELINE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Speed field.
     */
    public void setSpeed(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SPEED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageAccrInd field.
     */
    public void setStorageAccrInd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(STORAGEACCRIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageFclty field.
     */
    public void setStorageFclty(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STORAGEFCLTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StorageFeeAmt field.
     */
    public void setStorageFeeAmt(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(STORAGEFEEAMT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Incident value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalLoss field.
     */
    public void setTotalLoss(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TOTALLOSS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalLossPoints field.
     */
    public void setTotalLossPoints(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TOTALLOSSPOINTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TrafficViolation field.
     */
    public void setTrafficViolation(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(TRAFFICVIOLATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TypeofProperty field.
     */
    public void setTypeofProperty(entity.TypeofProperty[] value) {
      __getInternalInterface().setFieldValue(TYPEOFPROPERTY_PROP.get(), value);
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
     * Sets the value of the VehCondType field.
     */
    public void setVehCondType(typekey.VehCondType value) {
      __getInternalInterface().setFieldValue(VEHCONDTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehLockInd field.
     */
    public void setVehLockInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHLOCKIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehStolenInd field.
     */
    public void setVehStolenInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHSTOLENIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehTowedInd field.
     * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
     */
    @java.lang.Deprecated
    public void setVehTowedInd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHTOWEDIND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Vehicle field.
     */
    public void setVehicle(entity.Vehicle value) {
      __getInternalInterface().setFieldValue(VEHICLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleACV field.
     */
    public void setVehicleACV(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(VEHICLEACV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleAge10Years field.
     */
    public void setVehicleAge10Years(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEAGE10YEARS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleAge5Years field.
     */
    public void setVehicleAge5Years(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEAGE5YEARS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleDirection field.
     */
    public void setVehicleDirection(typekey.VehicleDirection value) {
      __getInternalInterface().setFieldValue(VEHICLEDIRECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleDriveable field.
     */
    public void setVehicleDriveable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEDRIVEABLE_PROP.get(), value);
    }
    
    public void setVehicleID(gw.pl.persistence.core.Key value) {
      setFieldValue(VEHICLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleLocation field.
     */
    public void setVehicleLocation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VEHICLELOCATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleLossParty field.
     */
    public void setVehicleLossParty(typekey.LossPartyType value) {
      __getInternalInterface().setFieldValue(VEHICLELOSSPARTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleOperable field.
     */
    public void setVehicleOperable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEOPERABLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleParked field.
     */
    public void setVehicleParked(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEPARKED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehiclePolStatus field.
     */
    public void setVehiclePolStatus(typekey.VehiclePolicyStatus value) {
      __getInternalInterface().setFieldValue(VEHICLEPOLSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleRollOver field.
     */
    public void setVehicleRollOver(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLEROLLOVER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleSubmerged field.
     */
    public void setVehicleSubmerged(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VEHICLESUBMERGED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleTitleRecvd field.
     */
    public void setVehicleTitleRecvd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(VEHICLETITLERECVD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleTitleReqd field.
     */
    public void setVehicleTitleReqd(typekey.YesNo value) {
      __getInternalInterface().setFieldValue(VEHICLETITLEREQD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleType field.
     */
    public void setVehicleType(typekey.VehicleType value) {
      __getInternalInterface().setFieldValue(VEHICLETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleUseReason field.
     */
    public void setVehicleUseReason(typekey.ReasonForUse value) {
      __getInternalInterface().setFieldValue(VEHICLEUSEREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaterLevelDash field.
     */
    public void setWaterLevelDash(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WATERLEVELDASH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WaterLevelSeats field.
     */
    public void setWaterLevelSeats(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WATERLEVELSEATS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WhenToView field.
     * @deprecated Possible dates when the damage may be viewed.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
     */
    @java.lang.Deprecated
    public void setWhenToView(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WHENTOVIEW_PROP.get(), value);
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
     * Validates the ClaimContactRole assignments for this ClaimContactRoleOwner. Checks all applicable RoleConstraints.
     */
    public com.guidewire.cc.domain.claim.RoleValidationFailure[] validateRoles() {
      return ((com.guidewire.cc.domain.claim.ClaimContactRoleOwner)__getDelegateManager().getImplementation("com.guidewire.cc.domain.claim.ClaimContactRoleOwner")).validateRoles();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.claim.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("com.guidewire.cc.domain.contact.EntityContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
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
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.exposure.impl.IncidentImpl");
    config.put("gw.api.contact.ClaimContactRoleOwner", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("gw.cc.exposure.entity.Incident", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("gw.cc.exposure.entity.MobilePropertyIncident", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("gw.cc.exposure.entity.PropertyIncident", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("gw.cc.exposure.entity.VehicleIncident", "com.guidewire.cc.domain.exposure.impl.VehicleIncidentImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.VehicleIncident.class, config);
    com.guidewire._generated.entity.VehicleIncidentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.VehicleIncident, com.guidewire._generated.entity.VehicleIncidentInternal>() {
      public java.lang.Object getImplementation(entity.VehicleIncident bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.VehicleIncidentInternal getInternalInterface(entity.VehicleIncident bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.VehicleIncident newEmptyInstance() {
        return new entity.VehicleIncident((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}
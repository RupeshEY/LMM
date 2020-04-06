package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleIncident.eti;VehicleIncident.eix;VehicleIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VehicleIncidentInternal extends com.guidewire._generated.entity.MobilePropertyIncidentInternal, gw.cc.exposure.entity.VehicleIncident {
  /**
   * Adds the given element to the Citations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCitations(entity.Citation element);
  
  
  /**
   * Gets the value of the AffdvCmplInd field.
   * Affidavit completed Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getAffdvCmplInd();
  
  
  /**
   * Gets the value of the CitationIssued field.
   * An indicator if there are citations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getCitationIssued();
  
  
  /**
   * Gets the value of the Citations field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Citation[] getCitations();
  
  
  /**
   * Gets the value of the CollisionPoint field.
   * Point of first impact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CollisionPoint getCollisionPoint();
  
  
  /**
   * Gets the value of the DateSalvageAssigned field.
   * Date assignment made to salvage team
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateSalvageAssigned();
  
  
  /**
   * Gets the value of the DateVehicleRecovered field.
   * Whether vehicle has been recovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateVehicleRecovered();
  
  
  /**
   * Gets the value of the DateVehicleSold field.
   * Whether vehicle has been sold
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateVehicleSold();
  
  
  /**
   * Gets the value of the DriverRelToOwner field.
   * Relationship of the driver to the vehicle's owner. This is redundant for a first-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getDriverRelToOwner();
  
  
  /**
   * Gets the value of the DriverRelation field.
   * Relationship of the driver to the insured. This is redundant for a first-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getDriverRelation();
  
  
  /**
   * Gets the value of the LotNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLotNumber();
  
  
  /**
   * Gets the value of the MinorOnPolicy field.
   * If the driver involved in accident is a minor, is he/she listed in the policy?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getMinorOnPolicy();
  
  
  /**
   * Gets the value of the OdomRead field.
   * Odometer reading
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOdomRead();
  
  
  /**
   * Gets the value of the PercentageDrivenByMinor field.
   * % of time vehicle used by the minor
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PercentageDriven getPercentageDrivenByMinor();
  
  
  /**
   * Gets the value of the RecovClassType field.
   * Describes which parts or recovered vehicle were stripped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecovClassType getRecovClassType();
  
  
  /**
   * Gets the value of the RecovCondType field.
   * Describes which general condition of vehicle upon recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecovCondType getRecovCondType();
  
  
  /**
   * Gets the value of the RecovDate field.
   * Date the vehicle was recovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRecovDate();
  
  
  /**
   * Gets the value of the RecovInd field.
   * Recovery Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getRecovInd();
  
  
  /**
   * Gets the value of the RecovState field.
   * State (aka Territory) where the vehicle upon recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getRecovState();
  
  
  /**
   * Gets the value of the RecoveryLocation field.
   * The Address at which the recovery was made.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getRecoveryLocation();
  
  
  public gw.pl.persistence.core.Key getRecoveryLocationID();
  
  
  /**
   * Gets the value of the RentalAgency field.
   * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRentalAgency();
  
  
  /**
   * Gets the value of the RentalBeginDate field.
   * Date the vehical rental begins
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRentalBeginDate();
  
  
  /**
   * Gets the value of the RentalDailyRate field.
   * Vehicle Rental Daily Rate
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRentalDailyRate();
  
  
  /**
   * Gets the value of the RentalEndDate field.
   * date the vehicle rental ends
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRentalEndDate();
  
  
  /**
   * Gets the value of the RentalReserveNo field.
   * Vehicle rental Reservation Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRentalReserveNo();
  
  
  /**
   * Gets the value of the SalvageCompany field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSalvageCompany();
  
  
  /**
   * Gets the value of the SalvageNet field.
   * Net salvage recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageNet();
  
  
  /**
   * Gets the value of the SalvagePrep field.
   * Vehicle prep fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvagePrep();
  
  
  /**
   * Gets the value of the SalvageProceeds field.
   * Amount vehicle was sold for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageProceeds();
  
  
  /**
   * Gets the value of the SalvageStorage field.
   * Salvage storage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageStorage();
  
  
  /**
   * Gets the value of the SalvageTitle field.
   * Title fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageTitle();
  
  
  /**
   * Gets the value of the SalvageTow field.
   * Towing fee
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvageTow();
  
  
  /**
   * Gets the value of the Speed field.
   * Speed of vehicle at impact, in MPH.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSpeed();
  
  
  /**
   * Gets the value of the StorageAccrInd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getStorageAccrInd();
  
  
  /**
   * Gets the value of the StorageFclty field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStorageFclty();
  
  
  /**
   * Gets the value of the StorageFeeAmt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getStorageFeeAmt();
  
  
  /**
   * Gets the value of the TotalLossPoints field.
   * Total Loss Calculated Points
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalLossPoints();
  
  
  /**
   * Gets the value of the TrafficViolation field.
   * Did the vehicle involved in the accident violate traffic?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getTrafficViolation();
  
  
  /**
   * Gets the value of the VehCondType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehCondType getVehCondType();
  
  
  /**
   * Gets the value of the Vehicle field.
   * Vehicle associated with the incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Vehicle getVehicle();
  
  
  /**
   * Gets the value of the VehicleACV field.
   * Vehicle's actual cash value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getVehicleACV();
  
  
  /**
   * Gets the value of the VehicleDirection field.
   * Direction the vehicle was traveling at impact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleDirection getVehicleDirection();
  
  
  public gw.pl.persistence.core.Key getVehicleID();
  
  
  /**
   * Gets the value of the VehicleLocation field.
   * Current location of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVehicleLocation();
  
  
  /**
   * Gets the value of the VehicleLossParty field.
   * The loss party; generally either first- or third-party loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossPartyType getVehicleLossParty();
  
  
  /**
   * Gets the value of the VehiclePolStatus field.
   * Policy Status of Vehicle
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehiclePolicyStatus getVehiclePolStatus();
  
  
  /**
   * Gets the value of the VehicleTitleRecvd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getVehicleTitleRecvd();
  
  
  /**
   * Gets the value of the VehicleTitleReqd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getVehicleTitleReqd();
  
  
  /**
   * Gets the value of the VehicleType field.
   * How the vehicle is related to the insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleType getVehicleType();
  
  
  /**
   * Gets the value of the VehicleUseReason field.
   * Reason for vehicle use
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReasonForUse getVehicleUseReason();
  
  
  /**
   * Gets the value of the AirbagsDeployed field.
   * Whether or not airbags deployed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAirbagsDeployed();
  
  
  /**
   * Gets the value of the AirbagsMissing field.
   * Airbags Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAirbagsMissing();
  
  
  /**
   * Gets the value of the AntiThftInd field.
   * Vehicle equipped with anti-theft device Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAntiThftInd();
  
  
  /**
   * Gets the value of the Appraisal field.
   * Indicator for Appraisal
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppraisal();
  
  
  /**
   * Gets the value of the BodyShopSelected field.
   * Indicator for Body Shop information
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBodyShopSelected();
  
  
  /**
   * Gets the value of the Collision field.
   * Whether vehicle was involved in a collision?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCollision();
  
  
  /**
   * Gets the value of the ComponentsMissing field.
   * Major Components Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isComponentsMissing();
  
  
  /**
   * Gets the value of the EquipmentFailure field.
   * Whether or not equipment failure was involved in the accident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEquipmentFailure();
  
  
  /**
   * Gets the value of the Extrication field.
   * Extrication Required?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExtrication();
  
  
  /**
   * Gets the value of the FireBurnDash field.
   * Fire Burn the Dash?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnDash();
  
  
  /**
   * Gets the value of the FireBurnEngine field.
   * Fire Burn the Engine?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnEngine();
  
  
  /**
   * Gets the value of the FireBurnWindshield field.
   * Fire Burn the Windshield?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireBurnWindshield();
  
  
  /**
   * Gets the value of the FloodSaltWater field.
   * Flood Occur Salt Water?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFloodSaltWater();
  
  
  /**
   * Gets the value of the HitAndRun field.
   * Boolean field to indicate if a claim involves hit and run
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHitAndRun();
  
  
  /**
   * Gets the value of the InteriorMissing field.
   * Any Of The Interior Missing?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInteriorMissing();
  
  
  /**
   * Gets the value of the LocationInd field.
   * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocationInd();
  
  
  /**
   * Gets the value of the Mileage100K field.
   * Mileage over 100K?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMileage100K();
  
  
  /**
   * Gets the value of the MovePermission field.
   * Whether permission to move the vehicle has been received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMovePermission();
  
  
  /**
   * Gets the value of the OwnerRetainingSalvage field.
   * Boolean field to indicate if Owner will retain the salvaged car or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOwnerRetainingSalvage();
  
  
  /**
   * Gets the value of the OwnersPermission field.
   * Whether the vehicle was driven with the owner's permission.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOwnersPermission();
  
  
  /**
   * Gets the value of the PhantomVehicle field.
   * Unknown 3rd party vehicle involved or not(e.g. Hit and Run).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPhantomVehicle();
  
  
  /**
   * Gets the value of the RentalRequired field.
   * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRentalRequired();
  
  
  /**
   * Gets the value of the RepWhereDisInd field.
   * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRepWhereDisInd();
  
  
  /**
   * Gets the value of the TotalLoss field.
   * Whether the the vehicle is a total loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTotalLoss();
  
  
  /**
   * Gets the value of the VehLockInd field.
   * Vehicle locked Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehLockInd();
  
  
  /**
   * Gets the value of the VehStolenInd field.
   * Vehicle stolen Indicator
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehStolenInd();
  
  
  /**
   * Gets the value of the VehTowedInd field.
   * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehTowedInd();
  
  
  /**
   * Gets the value of the VehicleAge10Years field.
   * Vehicle Ten Years Old?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleAge10Years();
  
  
  /**
   * Gets the value of the VehicleAge5Years field.
   * Vehicle Five Years Old?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleAge5Years();
  
  
  /**
   * Gets the value of the VehicleDriveable field.
   * Vehicle Driveable?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleDriveable();
  
  
  /**
   * Gets the value of the VehicleOperable field.
   * Indicator to state if a vehicle is operable or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleOperable();
  
  
  /**
   * Gets the value of the VehicleParked field.
   * Was the vehicle parked at the time of the loss?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleParked();
  
  
  /**
   * Gets the value of the VehicleRollOver field.
   * Vehicle Roll Over?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleRollOver();
  
  
  /**
   * Gets the value of the VehicleSubmerged field.
   * Vehicle Fully Submerged?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVehicleSubmerged();
  
  
  /**
   * Gets the value of the WaterLevelDash field.
   * Water Level Reach Dash?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaterLevelDash();
  
  
  /**
   * Gets the value of the WaterLevelSeats field.
   * Water Level Reach Seats?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaterLevelSeats();
  
  
  /**
   * Removes the given element from the Citations array. This is achieved by marking the element for removal.
   */
  public void removeFromCitations(entity.Citation element);
  
  
  /**
   * Removes the given element from the Citations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCitations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AffdvCmplInd field.
   */
  public void setAffdvCmplInd(typekey.YesNo value);
  
  
  /**
   * Sets the value of the AirbagsDeployed field.
   */
  public void setAirbagsDeployed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AirbagsMissing field.
   */
  public void setAirbagsMissing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AntiThftInd field.
   */
  public void setAntiThftInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Appraisal field.
   */
  public void setAppraisal(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BodyShopSelected field.
   */
  public void setBodyShopSelected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CitationIssued field.
   */
  public void setCitationIssued(typekey.YesNo value);
  
  
  /**
   * Sets the value of the Citations field.
   */
  public void setCitations(entity.Citation[] value);
  
  
  /**
   * Sets the value of the Collision field.
   */
  public void setCollision(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CollisionPoint field.
   */
  public void setCollisionPoint(typekey.CollisionPoint value);
  
  
  /**
   * Sets the value of the ComponentsMissing field.
   */
  public void setComponentsMissing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DateSalvageAssigned field.
   */
  public void setDateSalvageAssigned(java.util.Date value);
  
  
  /**
   * Sets the value of the DateVehicleRecovered field.
   */
  public void setDateVehicleRecovered(java.util.Date value);
  
  
  /**
   * Sets the value of the DateVehicleSold field.
   */
  public void setDateVehicleSold(java.util.Date value);
  
  
  /**
   * Sets the value of the DriverRelToOwner field.
   */
  public void setDriverRelToOwner(typekey.PersonRelationType value);
  
  
  /**
   * Sets the value of the DriverRelation field.
   */
  public void setDriverRelation(typekey.PersonRelationType value);
  
  
  /**
   * Sets the value of the EquipmentFailure field.
   */
  public void setEquipmentFailure(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Extrication field.
   */
  public void setExtrication(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FireBurnDash field.
   */
  public void setFireBurnDash(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FireBurnEngine field.
   */
  public void setFireBurnEngine(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FireBurnWindshield field.
   */
  public void setFireBurnWindshield(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FloodSaltWater field.
   */
  public void setFloodSaltWater(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HitAndRun field.
   */
  public void setHitAndRun(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InteriorMissing field.
   */
  public void setInteriorMissing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LocationInd field.
   * @deprecated Whether vehicle location is different from insured's address?  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the ServiceAddress of a ServiceRequestInstruction with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  public void setLocationInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LotNumber field.
   */
  public void setLotNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Mileage100K field.
   */
  public void setMileage100K(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MinorOnPolicy field.
   */
  public void setMinorOnPolicy(typekey.YesNo value);
  
  
  /**
   * Sets the value of the MovePermission field.
   */
  public void setMovePermission(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the OdomRead field.
   */
  public void setOdomRead(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OwnerRetainingSalvage field.
   */
  public void setOwnerRetainingSalvage(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the OwnersPermission field.
   */
  public void setOwnersPermission(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PercentageDrivenByMinor field.
   */
  public void setPercentageDrivenByMinor(typekey.PercentageDriven value);
  
  
  /**
   * Sets the value of the PhantomVehicle field.
   */
  public void setPhantomVehicle(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RecovClassType field.
   */
  public void setRecovClassType(typekey.RecovClassType value);
  
  
  /**
   * Sets the value of the RecovCondType field.
   */
  public void setRecovCondType(typekey.RecovCondType value);
  
  
  /**
   * Sets the value of the RecovDate field.
   */
  public void setRecovDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RecovInd field.
   */
  public void setRecovInd(typekey.YesNo value);
  
  
  /**
   * Sets the value of the RecovState field.
   */
  public void setRecovState(typekey.State value);
  
  
  /**
   * Sets the value of the RecoveryLocation field.
   */
  public void setRecoveryLocation(entity.Address value);
  
  
  public void setRecoveryLocationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RentalAgency field.
   * @deprecated Vehicle Rental Agency. Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the Specialist of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  public void setRentalAgency(java.lang.String value);
  
  
  /**
   * Sets the value of the RentalBeginDate field.
   */
  public void setRentalBeginDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RentalDailyRate field.
   */
  public void setRentalDailyRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the RentalEndDate field.
   */
  public void setRentalEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RentalRequired field.
   * @deprecated Indicator for vehicle rental requirement.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Car rental' service.
   */
  @java.lang.Deprecated
  public void setRentalRequired(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RentalReserveNo field.
   */
  public void setRentalReserveNo(java.lang.String value);
  
  
  /**
   * Sets the value of the RepWhereDisInd field.
   * @deprecated Repaired where disabled indicator.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Inspect / Repair - Auto body' service.
   */
  @java.lang.Deprecated
  public void setRepWhereDisInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SalvageCompany field.
   */
  public void setSalvageCompany(java.lang.String value);
  
  
  /**
   * Sets the value of the SalvageNet field.
   */
  public void setSalvageNet(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SalvagePrep field.
   */
  public void setSalvagePrep(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SalvageProceeds field.
   */
  public void setSalvageProceeds(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SalvageStorage field.
   */
  public void setSalvageStorage(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SalvageTitle field.
   */
  public void setSalvageTitle(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SalvageTow field.
   */
  public void setSalvageTow(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Speed field.
   */
  public void setSpeed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StorageAccrInd field.
   */
  public void setStorageAccrInd(typekey.YesNo value);
  
  
  /**
   * Sets the value of the StorageFclty field.
   */
  public void setStorageFclty(java.lang.String value);
  
  
  /**
   * Sets the value of the StorageFeeAmt field.
   */
  public void setStorageFeeAmt(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalLoss field.
   */
  public void setTotalLoss(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TotalLossPoints field.
   */
  public void setTotalLossPoints(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TrafficViolation field.
   */
  public void setTrafficViolation(typekey.YesNo value);
  
  
  /**
   * Sets the value of the VehCondType field.
   */
  public void setVehCondType(typekey.VehCondType value);
  
  
  /**
   * Sets the value of the VehLockInd field.
   */
  public void setVehLockInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehStolenInd field.
   */
  public void setVehStolenInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehTowedInd field.
   * @deprecated Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Auto - Other - Towing service'.
   */
  @java.lang.Deprecated
  public void setVehTowedInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Vehicle field.
   */
  public void setVehicle(entity.Vehicle value);
  
  
  /**
   * Sets the value of the VehicleACV field.
   */
  public void setVehicleACV(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the VehicleAge10Years field.
   */
  public void setVehicleAge10Years(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehicleAge5Years field.
   */
  public void setVehicleAge5Years(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehicleDirection field.
   */
  public void setVehicleDirection(typekey.VehicleDirection value);
  
  
  /**
   * Sets the value of the VehicleDriveable field.
   */
  public void setVehicleDriveable(java.lang.Boolean value);
  
  
  public void setVehicleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VehicleLocation field.
   */
  public void setVehicleLocation(java.lang.String value);
  
  
  /**
   * Sets the value of the VehicleLossParty field.
   */
  public void setVehicleLossParty(typekey.LossPartyType value);
  
  
  /**
   * Sets the value of the VehicleOperable field.
   */
  public void setVehicleOperable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehicleParked field.
   */
  public void setVehicleParked(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehiclePolStatus field.
   */
  public void setVehiclePolStatus(typekey.VehiclePolicyStatus value);
  
  
  /**
   * Sets the value of the VehicleRollOver field.
   */
  public void setVehicleRollOver(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehicleSubmerged field.
   */
  public void setVehicleSubmerged(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the VehicleTitleRecvd field.
   */
  public void setVehicleTitleRecvd(typekey.YesNo value);
  
  
  /**
   * Sets the value of the VehicleTitleReqd field.
   */
  public void setVehicleTitleReqd(typekey.YesNo value);
  
  
  /**
   * Sets the value of the VehicleType field.
   */
  public void setVehicleType(typekey.VehicleType value);
  
  
  /**
   * Sets the value of the VehicleUseReason field.
   */
  public void setVehicleUseReason(typekey.ReasonForUse value);
  
  
  /**
   * Sets the value of the WaterLevelDash field.
   */
  public void setWaterLevelDash(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WaterLevelSeats field.
   */
  public void setWaterLevelSeats(java.lang.Boolean value);
  
  
  
}
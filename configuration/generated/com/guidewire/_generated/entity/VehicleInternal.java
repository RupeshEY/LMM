package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Vehicle.eti;Vehicle.eix;Vehicle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VehicleInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.policy.entity.Vehicle {
  /**
   * Adds the given element to the Lienholders array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLienholders(entity.VehicleOwner element);
  
  
  /**
   * Gets the value of the BoatType field.
   * Type of boat; only applies if vehicle style is boat.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BoatType getBoatType();
  
  
  /**
   * Gets the value of the Color field.
   * Color of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColor();
  
  
  /**
   * Gets the value of the LicensePlate field.
   * License plate of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLicensePlate();
  
  
  /**
   * Gets the value of the Lienholders field.
   * List of lienholders for the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleOwner[] getLienholders();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LoanMonthlyPayment field.
   * Monthly loan payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLoanMonthlyPayment();
  
  
  /**
   * Gets the value of the LoanMonthsRemaining field.
   * Months remaining on loan.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLoanMonthsRemaining();
  
  
  /**
   * Gets the value of the LoanPayoffAmount field.
   * Loan payoff amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLoanPayoffAmount();
  
  
  /**
   * Gets the value of the Make field.
   * Make of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMake();
  
  
  /**
   * Gets the value of the Manufacturer field.
   * Company that manufactured the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleManufacturer getManufacturer();
  
  
  /**
   * Gets the value of the Model field.
   * Model of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getModel();
  
  
  /**
   * Gets the value of the OffRoadStyle field.
   * Style of snowmobile or ATV (wheels, tracks etc.). Used by ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OffRoadVehicleStyle getOffRoadStyle();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the vehicle in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the SerialNumber field.
   * Serial number; only use if VIN is not appropriate (e.g. for boats).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSerialNumber();
  
  
  /**
   * Gets the value of the State field.
   * State (Jurisdiction) in which the vehicle is registered. The Jurisdiction must be associated with JurisdictionType.TC_VEHICLE_REG.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getState();
  
  
  /**
   * Gets the value of the Style field.
   * Style of Vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleStyle getStyle();
  
  
  /**
   * Gets the value of the Vin field.
   * VIN of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin();
  
  
  /**
   * Gets the value of the Year field.
   * Year of the vehicle's manufacture.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getYear();
  
  
  /**
   * Gets the value of the Loan field.
   * Whether a loan is owed for the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLoan();
  
  
  /**
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   */
  public void removeFromLienholders(entity.VehicleOwner element);
  
  
  /**
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLienholders(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BoatType field.
   */
  public void setBoatType(typekey.BoatType value);
  
  
  /**
   * Sets the value of the Color field.
   */
  public void setColor(java.lang.String value);
  
  
  /**
   * Sets the value of the LicensePlate field.
   */
  public void setLicensePlate(java.lang.String value);
  
  
  /**
   * Sets the value of the Lienholders field.
   */
  public void setLienholders(entity.VehicleOwner[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Loan field.
   */
  public void setLoan(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoanMonthlyPayment field.
   */
  public void setLoanMonthlyPayment(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LoanMonthsRemaining field.
   */
  public void setLoanMonthsRemaining(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoanPayoffAmount field.
   */
  public void setLoanPayoffAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Make field.
   */
  public void setMake(java.lang.String value);
  
  
  /**
   * Sets the value of the Manufacturer field.
   */
  public void setManufacturer(typekey.VehicleManufacturer value);
  
  
  /**
   * Sets the value of the Model field.
   */
  public void setModel(java.lang.String value);
  
  
  /**
   * Sets the value of the OffRoadStyle field.
   */
  public void setOffRoadStyle(typekey.OffRoadVehicleStyle value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the SerialNumber field.
   */
  public void setSerialNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the Style field.
   */
  public void setStyle(typekey.VehicleStyle value);
  
  
  /**
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value);
  
  
  /**
   * Sets the value of the Year field.
   */
  public void setYear(java.lang.Integer value);
  
  
  
}
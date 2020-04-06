package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySummaryVehicle.eti;PolicySummaryVehicle.eix;PolicySummaryVehicle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicySummaryVehicleInternal extends com.guidewire._generated.entity.PolicySummaryRiskUnitInternal, gw.cc.policy.entity.PolicySummaryVehicle {
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
   * Gets the value of the Make field.
   * Make of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMake();
  
  
  /**
   * Gets the value of the Model field.
   * Model of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getModel();
  
  
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
   * Gets the value of the VehicleNumber field.
   * Number of the vehicle on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getVehicleNumber();
  
  
  /**
   * Gets the value of the Vin field.
   * VIN of the vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin();
  
  
  /**
   * Sets the value of the Color field.
   */
  public void setColor(java.lang.String value);
  
  
  /**
   * Sets the value of the LicensePlate field.
   */
  public void setLicensePlate(java.lang.String value);
  
  
  /**
   * Sets the value of the Make field.
   */
  public void setMake(java.lang.String value);
  
  
  /**
   * Sets the value of the Model field.
   */
  public void setModel(java.lang.String value);
  
  
  /**
   * Sets the value of the SerialNumber field.
   */
  public void setSerialNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the VehicleNumber field.
   */
  public void setVehicleNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value);
  
  
  
}
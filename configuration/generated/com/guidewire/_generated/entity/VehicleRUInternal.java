package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleRU.eti;VehicleRU.eix;VehicleRU.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VehicleRUInternal extends com.guidewire._generated.entity.RiskUnitInternal, com.guidewire.pl.system.bundle.RemoveCallback, gw.cc.policy.entity.VehicleRU {
  /**
   * Gets the value of the Vehicle field.
   * Related vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Vehicle getVehicle();
  
  
  public gw.pl.persistence.core.Key getVehicleID();
  
  
  /**
   * Gets the value of the VehicleLocation field.
   * The PolicyLocation associted with this Vehicle Risk Unit, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getVehicleLocation();
  
  
  public gw.pl.persistence.core.Key getVehicleLocationID();
  
  
  /**
   * Sets the value of the Vehicle field.
   */
  public void setVehicle(entity.Vehicle value);
  
  
  public void setVehicleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VehicleLocation field.
   */
  public void setVehicleLocation(entity.PolicyLocation value);
  
  
  public void setVehicleLocationID(gw.pl.persistence.core.Key value);
  
  
  
}
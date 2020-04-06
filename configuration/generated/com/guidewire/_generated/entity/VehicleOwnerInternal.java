package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "VehicleOwner.eti;VehicleOwner.eix;VehicleOwner.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VehicleOwnerInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.policy.entity.VehicleOwner {
  /**
   * Gets the value of the Lienholder field.
   * The related lienholder.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getLienholder();
  
  
  public gw.pl.persistence.core.Key getLienholderID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the OwnerType field.
   * Whether the lienholder is a partial owner or the sole owner.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OwnerType getOwnerType();
  
  
  /**
   * Gets the value of the Vehicle field.
   * The related vehicle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Vehicle getVehicle();
  
  
  public gw.pl.persistence.core.Key getVehicleID();
  
  
  /**
   * Sets the value of the Lienholder field.
   */
  public void setLienholder(entity.Contact value);
  
  
  public void setLienholderID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OwnerType field.
   */
  public void setOwnerType(typekey.OwnerType value);
  
  
  /**
   * Sets the value of the Vehicle field.
   */
  public void setVehicle(entity.Vehicle value);
  
  
  public void setVehicleID(gw.pl.persistence.core.Key value);
  
  
  
}
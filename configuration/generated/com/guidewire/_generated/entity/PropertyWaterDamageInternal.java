package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyWaterDamage.eti;PropertyWaterDamage.eix;PropertyWaterDamage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyWaterDamageInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.PropertyWaterDamage {
  /**
   * Gets the value of the Claim field.
   * Claim that owns this damage object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the WaterSource field.
   * Where is the water entering the property from?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WaterSource getWaterSource();
  
  
  /**
   * Gets the value of the HasWaterBeenTurnedOff field.
   * Has the water to the house/room been turned off?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHasWaterBeenTurnedOff();
  
  
  /**
   * Gets the value of the IsRoofProtected field.
   * Is the roof damage protected?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsRoofProtected();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the HasWaterBeenTurnedOff field.
   */
  public void setHasWaterBeenTurnedOff(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the IsRoofProtected field.
   */
  public void setIsRoofProtected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the WaterSource field.
   */
  public void setWaterSource(typekey.WaterSource value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ZoneLink.eti;ZoneLink.eix;ZoneLink.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ZoneLinkInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Zone1 field.
   * Zone 1.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Zone getZone1();
  
  
  public gw.pl.persistence.core.Key getZone1ID();
  
  
  /**
   * Gets the value of the Zone2 field.
   * Zone 2.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Zone getZone2();
  
  
  public gw.pl.persistence.core.Key getZone2ID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Zone1 field.
   */
  public void setZone1(entity.Zone value);
  
  
  public void setZone1ID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Zone2 field.
   */
  public void setZone2(entity.Zone value);
  
  
  public void setZone2ID(gw.pl.persistence.core.Key value);
  
  
  
}
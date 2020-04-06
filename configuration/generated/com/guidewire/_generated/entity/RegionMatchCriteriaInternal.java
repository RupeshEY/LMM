package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RegionMatchCriteria.eti;RegionMatchCriteria.eix;RegionMatchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RegionMatchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Country field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the Zone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getZone();
  
  
  /**
   * Gets the value of the ZoneType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ZoneType getZoneType();
  
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the Zone field.
   */
  public void setZone(java.lang.String value);
  
  
  /**
   * Sets the value of the ZoneType field.
   */
  public void setZoneType(typekey.ZoneType value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BusinessWeekZone.eti;BusinessWeekZone.eix;BusinessWeekZone.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BusinessWeekZoneInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.calendar.BusinessWeekZonePublicMethods, com.guidewire.pl.domain.calendar.impl.BusinessWeekZoneInternalMethods {
  /**
   * Gets the value of the BusinessWeek field.
   * The businessweek.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BusinessWeek getBusinessWeek();
  
  
  public gw.pl.persistence.core.Key getBusinessWeekID();
  
  
  /**
   * Gets the value of the Code field.
   * The code for this zone, this is the value that should be used for zone lookups.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the Country field.
   * Country of this zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ZoneType field.
   * Type of this zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ZoneType getZoneType();
  
  
  /**
   * Sets the value of the BusinessWeek field.
   */
  public void setBusinessWeek(entity.BusinessWeek value);
  
  
  public void setBusinessWeekID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ZoneType field.
   */
  public void setZoneType(typekey.ZoneType value);
  
  
  
}
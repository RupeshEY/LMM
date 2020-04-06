package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "HolidayTag.eti;HolidayTag.eix;HolidayTag.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface HolidayTagInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Holiday field.
   * The holiday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Holiday getHoliday();
  
  
  public gw.pl.persistence.core.Key getHolidayID();
  
  
  /**
   * Gets the value of the HolidayTagCode field.
   * The code for this holiday tag.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HolidayTagCode getHolidayTagCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Holiday field.
   */
  public void setHoliday(entity.Holiday value);
  
  
  public void setHolidayID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the HolidayTagCode field.
   */
  public void setHolidayTagCode(typekey.HolidayTagCode value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}
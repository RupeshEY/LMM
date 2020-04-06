package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Holiday.eti;Holiday.eix;Holiday.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface HolidayInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.calendar.HolidayPublicMethods, com.guidewire.pl.domain.calendar.impl.HolidayInternalMethods {
  /**
   * Adds the given element to the HolidayTags array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHolidayTags(entity.HolidayTag element);
  
  
  /**
   * Adds the given element to the HolidayZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHolidayZones(entity.HolidayZone element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.Holiday_Name_L10N element);
  
  
  /**
   * Gets the value of the HolidayTags field.
   * The tags that observe this holiday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HolidayTag[] getHolidayTags();
  
  
  /**
   * Gets the value of the HolidayZones field.
   * The zones that observe this holiday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HolidayZone[] getHolidayZones();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * The name of a holiday in the business calendar.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Holiday_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.Holiday_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the OccurrenceDate field.
   * The date of a holiday in the business calendar.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOccurrenceDate();
  
  
  /**
   * Gets the value of the AppliesToAllZones field.
   * True if this holiday applies to all zones (in which case HolidayZones should be empty). If false and HolidayZones has elements, this holiday applies to those zones.  If false and HolidayZones is empty, this holiday doesn't apply anywhere.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToAllZones();
  
  
  /**
   * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
   */
  public void removeFromHolidayTags(entity.HolidayTag element);
  
  
  /**
   * Removes the given element from the HolidayTags array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHolidayTags(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
   */
  public void removeFromHolidayZones(entity.HolidayZone element);
  
  
  /**
   * Removes the given element from the HolidayZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHolidayZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.Holiday_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AppliesToAllZones field.
   */
  public void setAppliesToAllZones(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HolidayTags field.
   */
  public void setHolidayTags(entity.HolidayTag[] value);
  
  
  /**
   * Sets the value of the HolidayZones field.
   */
  public void setHolidayZones(entity.HolidayZone[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.Holiday_Name_L10N[] value);
  
  
  /**
   * Sets the value of the OccurrenceDate field.
   */
  public void setOccurrenceDate(java.util.Date value);
  
  
  
}
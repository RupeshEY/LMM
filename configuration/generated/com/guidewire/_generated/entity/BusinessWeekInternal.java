package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BusinessWeek.eti;BusinessWeek.eix;BusinessWeek.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BusinessWeekInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.calendar.BusinessWeekPublicMethods, com.guidewire.pl.domain.calendar.impl.BusinessWeekInternalMethods {
  /**
   * Adds the given element to the BusinessWeekZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBusinessWeekZones(entity.BusinessWeekZone element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.BusinessWeek_Name_L10N element);
  
  
  /**
   * Gets the value of the BusinessDayDemarcation field.
   * Demarcation of the business day
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBusinessDayDemarcation();
  
  
  /**
   * Gets the value of the BusinessWeekEnd field.
   * What day the business week ends.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Weekdays getBusinessWeekEnd();
  
  
  /**
   * Gets the value of the BusinessWeekZones field.
   * The zones that observe this businessweek.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BusinessWeekZone[] getBusinessWeekZones();
  
  
  /**
   * Gets the value of the FridayBusinessEnd field.
   * End of business day on Friday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFridayBusinessEnd();
  
  
  /**
   * Gets the value of the FridayBusinessStart field.
   * Start of business day on Friday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFridayBusinessStart();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MondayBusinessEnd field.
   * End of business day on Monday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMondayBusinessEnd();
  
  
  /**
   * Gets the value of the MondayBusinessStart field.
   * Start of business day on Monday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMondayBusinessStart();
  
  
  /**
   * Gets the value of the Name field.
   * The name of a businessweek in the business calendar.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BusinessWeek_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.BusinessWeek_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the SaturdayBusinessEnd field.
   * End of business day on Saturday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSaturdayBusinessEnd();
  
  
  /**
   * Gets the value of the SaturdayBusinessStart field.
   * Start of business day on Saturday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSaturdayBusinessStart();
  
  
  /**
   * Gets the value of the SundayBusinessEnd field.
   * End of business day on Sunday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSundayBusinessEnd();
  
  
  /**
   * Gets the value of the SundayBusinessStart field.
   * Start of business day on Sunday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSundayBusinessStart();
  
  
  /**
   * Gets the value of the ThursdayBusinessEnd field.
   * End of business day on Thursday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getThursdayBusinessEnd();
  
  
  /**
   * Gets the value of the ThursdayBusinessStart field.
   * Start of business day on Thursday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getThursdayBusinessStart();
  
  
  /**
   * Gets the value of the TuesdayBusinessEnd field.
   * End of business day on Tuesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTuesdayBusinessEnd();
  
  
  /**
   * Gets the value of the TuesdayBusinessStart field.
   * Start of business day on Tuesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTuesdayBusinessStart();
  
  
  /**
   * Gets the value of the WednesdayBusinessEnd field.
   * End of business day on Wednesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWednesdayBusinessEnd();
  
  
  /**
   * Gets the value of the WednesdayBusinessStart field.
   * Start of business day on Wednesday.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWednesdayBusinessStart();
  
  
  /**
   * Gets the value of the AppliesToAllZones field.
   * True if this businessweek applies to all zones (in which case BusinessWeekZones should be empty). If false and BusinessWeekZones has elements, this businessweek applies to those zones.  If false and BusinessWeekZones is empty, this businessweek doesn't apply anywhere.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToAllZones();
  
  
  /**
   * Gets the value of the FridayBusinessDay field.
   * Is Friday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFridayBusinessDay();
  
  
  /**
   * Gets the value of the MondayBusinessDay field.
   * Is Monday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMondayBusinessDay();
  
  
  /**
   * Gets the value of the SaturdayBusinessDay field.
   * Is Saturday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSaturdayBusinessDay();
  
  
  /**
   * Gets the value of the SundayBusinessDay field.
   * Is Sunday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSundayBusinessDay();
  
  
  /**
   * Gets the value of the ThursdayBusinessDay field.
   * Is Thursday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isThursdayBusinessDay();
  
  
  /**
   * Gets the value of the TuesdayBusinessDay field.
   * Is Tuesday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTuesdayBusinessDay();
  
  
  /**
   * Gets the value of the WednesdayBusinessDay field.
   * Is Wednesday a business day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWednesdayBusinessDay();
  
  
  /**
   * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
   */
  public void removeFromBusinessWeekZones(entity.BusinessWeekZone element);
  
  
  /**
   * Removes the given element from the BusinessWeekZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBusinessWeekZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.BusinessWeek_Name_L10N element);
  
  
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
   * Sets the value of the BusinessDayDemarcation field.
   */
  public void setBusinessDayDemarcation(java.util.Date value);
  
  
  /**
   * Sets the value of the BusinessWeekEnd field.
   */
  public void setBusinessWeekEnd(typekey.Weekdays value);
  
  
  /**
   * Sets the value of the BusinessWeekZones field.
   */
  public void setBusinessWeekZones(entity.BusinessWeekZone[] value);
  
  
  /**
   * Sets the value of the FridayBusinessDay field.
   */
  public void setFridayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FridayBusinessEnd field.
   */
  public void setFridayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the FridayBusinessStart field.
   */
  public void setFridayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MondayBusinessDay field.
   */
  public void setMondayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MondayBusinessEnd field.
   */
  public void setMondayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the MondayBusinessStart field.
   */
  public void setMondayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.BusinessWeek_Name_L10N[] value);
  
  
  /**
   * Sets the value of the SaturdayBusinessDay field.
   */
  public void setSaturdayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SaturdayBusinessEnd field.
   */
  public void setSaturdayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the SaturdayBusinessStart field.
   */
  public void setSaturdayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the SundayBusinessDay field.
   */
  public void setSundayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SundayBusinessEnd field.
   */
  public void setSundayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the SundayBusinessStart field.
   */
  public void setSundayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the ThursdayBusinessDay field.
   */
  public void setThursdayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ThursdayBusinessEnd field.
   */
  public void setThursdayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the ThursdayBusinessStart field.
   */
  public void setThursdayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the TuesdayBusinessDay field.
   */
  public void setTuesdayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TuesdayBusinessEnd field.
   */
  public void setTuesdayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the TuesdayBusinessStart field.
   */
  public void setTuesdayBusinessStart(java.util.Date value);
  
  
  /**
   * Sets the value of the WednesdayBusinessDay field.
   */
  public void setWednesdayBusinessDay(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WednesdayBusinessEnd field.
   */
  public void setWednesdayBusinessEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the WednesdayBusinessStart field.
   */
  public void setWednesdayBusinessStart(java.util.Date value);
  
  
  
}
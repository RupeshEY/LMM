package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DwellingIncident.eti;DwellingIncident.eix;DwellingIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DwellingIncidentInternal extends com.guidewire._generated.entity.FixedPropertyIncidentInternal, gw.cc.exposure.entity.DwellingIncident {
  /**
   * Adds the given element to the DwellingRoomDamages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDwellingRoomDamages(entity.DwellingRoomDamage element);
  
  
  /**
   * Gets the value of the DamagedAreaSize field.
   * Size of the damaged area in sq. feet, sq. meters or other units of measurement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDamagedAreaSize();
  
  
  /**
   * Gets the value of the DwellingRoomDamages field.
   * Information about rooms damaged as a result of the incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DwellingRoomDamage[] getDwellingRoomDamages();
  
  
  /**
   * Gets the value of the MaterialsDamaged field.
   * Materials damaged as a result of the incident, for instance, floor, walls etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMaterialsDamaged();
  
  
  /**
   * Gets the value of the NumberOfPeopleOnPolicy field.
   * Number of people on the policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumberOfPeopleOnPolicy();
  
  
  /**
   * Gets the value of the PropertySize field.
   * Size of the property in sq. feet, sq. meters or other units of measurement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPropertySize();
  
  
  /**
   * Gets the value of the YearBuilt field.
   * Year the property was built
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getYearBuilt();
  
  
  /**
   * Gets the value of the YearsInHome field.
   * Number of years the insured has owned the home
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getYearsInHome();
  
  
  /**
   * Gets the value of the DebrisRemovalInd field.
   * @deprecated Debris Removal Service requested.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Emergency services - Debris removal' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDebrisRemovalInd();
  
  
  /**
   * Gets the value of the EMSInd field.
   * @deprecated Emergency Management Service requested.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Home services - Emergency services - Make safe' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEMSInd();
  
  
  /**
   * Gets the value of the FireProtectionAvailable field.
   * Is fire protection available
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireProtectionAvailable();
  
  
  /**
   * Removes the given element from the DwellingRoomDamages array. This is achieved by marking the element for removal.
   */
  public void removeFromDwellingRoomDamages(entity.DwellingRoomDamage element);
  
  
  /**
   * Removes the given element from the DwellingRoomDamages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDwellingRoomDamages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the DamagedAreaSize field.
   */
  public void setDamagedAreaSize(java.lang.Integer value);
  
  
  /**
   * Sets the value of the DebrisRemovalInd field.
   * @deprecated Debris Removal Service requested.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Emergency services - Debris removal' service.
   */
  @java.lang.Deprecated
  public void setDebrisRemovalInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DwellingRoomDamages field.
   */
  public void setDwellingRoomDamages(entity.DwellingRoomDamage[] value);
  
  
  /**
   * Sets the value of the EMSInd field.
   * @deprecated Emergency Management Service requested.  Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Home services - Emergency services - Make safe' service.
   */
  @java.lang.Deprecated
  public void setEMSInd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FireProtectionAvailable field.
   */
  public void setFireProtectionAvailable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MaterialsDamaged field.
   */
  public void setMaterialsDamaged(java.lang.String value);
  
  
  /**
   * Sets the value of the NumberOfPeopleOnPolicy field.
   */
  public void setNumberOfPeopleOnPolicy(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PropertySize field.
   */
  public void setPropertySize(java.lang.Integer value);
  
  
  /**
   * Sets the value of the YearBuilt field.
   */
  public void setYearBuilt(java.util.Date value);
  
  
  /**
   * Sets the value of the YearsInHome field.
   */
  public void setYearsInHome(java.lang.Integer value);
  
  
  
}
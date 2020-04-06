package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FixedPropertyIncident.eti;FixedPropertyIncident.eix;FixedPropertyIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FixedPropertyIncidentInternal extends com.guidewire._generated.entity.PropertyIncidentInternal, gw.cc.exposure.entity.FixedPropertyIncident {
  /**
   * Gets the value of the AlarmType field.
   * Alarm Type for property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AlarmType getAlarmType();
  
  
  /**
   * Gets the value of the ClassType field.
   * Property attribute class type for Building details
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClassType getClassType();
  
  
  /**
   * Gets the value of the ExtWallMat field.
   * External Wall material at scene.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExtWallMat getExtWallMat();
  
  
  /**
   * Gets the value of the FireProtDetails field.
   * dummy field for fire details
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFireProtDetails();
  
  
  /**
   * Gets the value of the HazardInvolved field.
   * Was Hazardous Waste Involved?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getHazardInvolved();
  
  
  /**
   * Gets the value of the LossArea field.
   * Loss Area of Property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossArea getLossArea();
  
  
  /**
   * Gets the value of the MoldInvolved field.
   * Was Mold Involved?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getMoldInvolved();
  
  
  /**
   * Gets the value of the NumSprinkOper field.
   * Number of sprinklers that were operated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumSprinkOper();
  
  
  /**
   * Gets the value of the NumSprinkler field.
   * Number of Sprinklers at Scene
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumSprinkler();
  
  
  /**
   * Gets the value of the NumStories field.
   * Number of Stories in the building/property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumStories();
  
  
  /**
   * Gets the value of the OccupancyType field.
   * Where the property in question is occupied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OccupancyType getOccupancyType();
  
  
  /**
   * Gets the value of the Property field.
   * The property involved in the incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getProperty();
  
  
  public gw.pl.persistence.core.Key getPropertyID();
  
  
  /**
   * Gets the value of the RoofMaterial field.
   * Roof Deck Materials for property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RoofMaterial getRoofMaterial();
  
  
  /**
   * Gets the value of the SprinkRetServ field.
   * Sprinklers returned to service.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SprinkRetServ getSprinkRetServ();
  
  
  /**
   * Gets the value of the SprinklerType field.
   * Sprinkler type for property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SprinklerType getSprinklerType();
  
  
  /**
   * Sets the value of the AlarmType field.
   */
  public void setAlarmType(typekey.AlarmType value);
  
  
  /**
   * Sets the value of the ClassType field.
   */
  public void setClassType(typekey.ClassType value);
  
  
  /**
   * Sets the value of the ExtWallMat field.
   */
  public void setExtWallMat(typekey.ExtWallMat value);
  
  
  /**
   * Sets the value of the FireProtDetails field.
   */
  public void setFireProtDetails(java.lang.String value);
  
  
  /**
   * Sets the value of the HazardInvolved field.
   */
  public void setHazardInvolved(typekey.YesNo value);
  
  
  /**
   * Sets the value of the LossArea field.
   */
  public void setLossArea(typekey.LossArea value);
  
  
  /**
   * Sets the value of the MoldInvolved field.
   */
  public void setMoldInvolved(typekey.YesNo value);
  
  
  /**
   * Sets the value of the NumSprinkOper field.
   */
  public void setNumSprinkOper(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumSprinkler field.
   */
  public void setNumSprinkler(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumStories field.
   */
  public void setNumStories(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OccupancyType field.
   */
  public void setOccupancyType(typekey.OccupancyType value);
  
  
  /**
   * Sets the value of the Property field.
   */
  public void setProperty(entity.PolicyLocation value);
  
  
  public void setPropertyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RoofMaterial field.
   */
  public void setRoofMaterial(typekey.RoofMaterial value);
  
  
  /**
   * Sets the value of the SprinkRetServ field.
   */
  public void setSprinkRetServ(typekey.SprinkRetServ value);
  
  
  /**
   * Sets the value of the SprinklerType field.
   */
  public void setSprinklerType(typekey.SprinklerType value);
  
  
  
}
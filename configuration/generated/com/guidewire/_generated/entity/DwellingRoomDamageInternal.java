package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DwellingRoomDamage.eti;DwellingRoomDamage.eix;DwellingRoomDamage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DwellingRoomDamageInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.DwellingRoomDamage {
  /**
   * Gets the value of the Incident field.
   * The DwellingIncident this room is related to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NumberOfRooms field.
   * Count of the particular room type damaged. For instance 2 of a certain kind of room
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumberOfRooms();
  
  
  /**
   * Gets the value of the RoomType field.
   * Room types. For instance, living room, bedroom.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RoomType getRoomType();
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumberOfRooms field.
   */
  public void setNumberOfRooms(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RoomType field.
   */
  public void setRoomType(typekey.RoomType value);
  
  
  
}
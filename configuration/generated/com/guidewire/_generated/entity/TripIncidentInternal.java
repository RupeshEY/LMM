package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripIncident.eti;TripIncident.eix;TripIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripIncidentInternal extends com.guidewire._generated.entity.IncidentInternal, gw.cc.exposure.entity.TripIncident {
  /**
   * Adds the given element to the TripAccommodations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTripAccommodations(entity.TripAccommodation element);
  
  
  /**
   * Adds the given element to the TripSegments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTripSegments(entity.TripSegment element);
  
  
  /**
   * Gets the value of the TripAccommodations field.
   * All trip accommodations associated with this policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripAccommodation[] getTripAccommodations();
  
  
  /**
   * Gets the value of the TripRU field.
   * Related risk unit for this incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripRU getTripRU();
  
  
  public gw.pl.persistence.core.Key getTripRUID();
  
  
  /**
   * Gets the value of the TripSegments field.
   * All trip segments associated with this policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripSegment[] getTripSegments();
  
  
  /**
   * Removes the given element from the TripAccommodations array. This is achieved by marking the element for removal.
   */
  public void removeFromTripAccommodations(entity.TripAccommodation element);
  
  
  /**
   * Removes the given element from the TripAccommodations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTripAccommodations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TripSegments array. This is achieved by marking the element for removal.
   */
  public void removeFromTripSegments(entity.TripSegment element);
  
  
  /**
   * Removes the given element from the TripSegments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTripSegments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the TripAccommodations field.
   */
  public void setTripAccommodations(entity.TripAccommodation[] value);
  
  
  /**
   * Sets the value of the TripRU field.
   */
  public void setTripRU(entity.TripRU value);
  
  
  public void setTripRUID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TripSegments field.
   */
  public void setTripSegments(entity.TripSegment[] value);
  
  
  
}
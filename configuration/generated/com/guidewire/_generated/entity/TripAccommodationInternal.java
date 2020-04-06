package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripAccommodation.eti;TripAccommodation.eix;TripAccommodation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripAccommodationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TripAccommodationDelegateInternal, com.guidewire._generated.entity.TripExpenseCancellationDelegateInternal, gw.cc.exposure.entity.TripAccommodation, gw.cc.exposure.entity.TripExpenseCancellationDelegate, gw.cc.exposure.entity.TripExpenseDelegate {
  /**
   * Adds the given element to the AddnlTripAccommodations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAddnlTripAccommodations(entity.AddnlTripAccommodation element);
  
  
  /**
   * Gets the value of the AddnlTripAccommodations field.
   * All new/additional trip accommodations associated with this accommodation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AddnlTripAccommodation[] getAddnlTripAccommodations();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the TripIncident field.
   * Incident this accommodation is related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripIncident getTripIncident();
  
  
  public gw.pl.persistence.core.Key getTripIncidentID();
  
  
  /**
   * Gets the value of the TripSegment field.
   * Accommodation is related to this trip segment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripSegment getTripSegment();
  
  
  public gw.pl.persistence.core.Key getTripSegmentID();
  
  
  /**
   * Removes the given element from the AddnlTripAccommodations array. This is achieved by marking the element for removal.
   */
  public void removeFromAddnlTripAccommodations(entity.AddnlTripAccommodation element);
  
  
  /**
   * Removes the given element from the AddnlTripAccommodations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAddnlTripAccommodations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AddnlTripAccommodations field.
   */
  public void setAddnlTripAccommodations(entity.AddnlTripAccommodation[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TripIncident field.
   */
  public void setTripIncident(entity.TripIncident value);
  
  
  public void setTripIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TripSegment field.
   */
  public void setTripSegment(entity.TripSegment value);
  
  
  public void setTripSegmentID(gw.pl.persistence.core.Key value);
  
  
  
}
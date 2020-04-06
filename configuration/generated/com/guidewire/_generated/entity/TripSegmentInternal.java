package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripSegment.eti;TripSegment.eix;TripSegment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripSegmentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TripSegmentDelegateInternal, com.guidewire._generated.entity.TripExpenseCancellationDelegateInternal, gw.cc.exposure.entity.TripExpenseCancellationDelegate, gw.cc.exposure.entity.TripExpenseDelegate, gw.cc.exposure.entity.TripSegment {
  /**
   * Adds the given element to the AddnlTripSegments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAddnlTripSegments(entity.AddnlTripSegment element);
  
  
  /**
   * Gets the value of the AddnlTripSegments field.
   * All new/additional trip segments associated with this segment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AddnlTripSegment[] getAddnlTripSegments();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the TripIncident field.
   * Incident this schedule is related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripIncident getTripIncident();
  
  
  public gw.pl.persistence.core.Key getTripIncidentID();
  
  
  /**
   * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
   */
  public void removeFromAddnlTripSegments(entity.AddnlTripSegment element);
  
  
  /**
   * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAddnlTripSegments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AddnlTripSegments field.
   */
  public void setAddnlTripSegments(entity.AddnlTripSegment[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TripIncident field.
   */
  public void setTripIncident(entity.TripIncident value);
  
  
  public void setTripIncidentID(gw.pl.persistence.core.Key value);
  
  
  
}
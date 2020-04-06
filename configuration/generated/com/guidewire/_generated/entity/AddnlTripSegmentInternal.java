package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddnlTripSegment.eti;AddnlTripSegment.eix;AddnlTripSegment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddnlTripSegmentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TripExpenseDelegateInternal, com.guidewire._generated.entity.TripSegmentDelegateInternal, gw.cc.exposure.entity.AddnlTripSegment, gw.cc.exposure.entity.TripExpenseDelegate {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReasonForAddnlTravel field.
   * Reasons for additional travel
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForAddnlTravel();
  
  
  /**
   * Gets the value of the TripSegment field.
   * Segment on the policy being cancelled, delayed etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripSegment getTripSegment();
  
  
  public gw.pl.persistence.core.Key getTripSegmentID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReasonForAddnlTravel field.
   */
  public void setReasonForAddnlTravel(java.lang.String value);
  
  
  /**
   * Sets the value of the TripSegment field.
   */
  public void setTripSegment(entity.TripSegment value);
  
  
  public void setTripSegmentID(gw.pl.persistence.core.Key value);
  
  
  
}
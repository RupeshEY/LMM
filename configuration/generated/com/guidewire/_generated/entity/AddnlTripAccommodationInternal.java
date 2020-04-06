package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddnlTripAccommodation.eti;AddnlTripAccommodation.eix;AddnlTripAccommodation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddnlTripAccommodationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TripExpenseDelegateInternal, com.guidewire._generated.entity.TripAccommodationDelegateInternal, gw.cc.exposure.entity.AddnlTripAccommodation, gw.cc.exposure.entity.TripExpenseDelegate {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReasonForAddnlAccommodation field.
   * Reasons for additional accommodation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForAddnlAccommodation();
  
  
  /**
   * Gets the value of the TripAccommodation field.
   * Accommodation on the policy being cancelled, delayed etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripAccommodation getTripAccommodation();
  
  
  public gw.pl.persistence.core.Key getTripAccommodationID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReasonForAddnlAccommodation field.
   */
  public void setReasonForAddnlAccommodation(java.lang.String value);
  
  
  /**
   * Sets the value of the TripAccommodation field.
   */
  public void setTripAccommodation(entity.TripAccommodation value);
  
  
  public void setTripAccommodationID(gw.pl.persistence.core.Key value);
  
  
  
}
package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripAccommodationDelegate.eti;TripAccommodationDelegate.eix;TripAccommodationDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripAccommodationDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TripAccommodationDelegate {
  /**
   * Gets the value of the Address field.
   * Address for the planned accommodation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddress();
  
  
  public gw.pl.persistence.core.Key getAddressID();
  
  
  /**
   * Gets the value of the PropertyName field.
   * Name of the accommodation booked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPropertyName();
  
  
  /**
   * Sets the value of the Address field.
   */
  public void setAddress(entity.Address value);
  
  
  public void setAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PropertyName field.
   */
  public void setPropertyName(java.lang.String value);
  
  
  
}
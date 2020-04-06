package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripRU.eti;TripRU.eix;TripRU.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripRUInternal extends com.guidewire._generated.entity.RiskUnitInternal, gw.cc.policy.entity.TripRU {
  /**
   * Gets the value of the EndDate field.
   * The date this trip will end
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the GeographicalRegion field.
   * Geographical regions for travel
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GeographicalRegion getGeographicalRegion();
  
  
  /**
   * Gets the value of the StartDate field.
   * The date this trip will start
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the TripDescription field.
   * A brief description of the trip
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTripDescription();
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the GeographicalRegion field.
   */
  public void setGeographicalRegion(typekey.GeographicalRegion value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TripDescription field.
   */
  public void setTripDescription(java.lang.String value);
  
  
  
}
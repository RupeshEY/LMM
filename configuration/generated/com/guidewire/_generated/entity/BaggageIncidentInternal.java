package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BaggageIncident.eti;BaggageIncident.eix;BaggageIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BaggageIncidentInternal extends com.guidewire._generated.entity.MobilePropertyIncidentInternal, gw.cc.exposure.entity.BaggageIncident {
  /**
   * Gets the value of the BaggageMissingFrom field.
   * The date/time the baggage was discovered to be missing
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBaggageMissingFrom();
  
  
  /**
   * Gets the value of the BaggageRecoveredOn field.
   * The date/time the baggage was recovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBaggageRecoveredOn();
  
  
  /**
   * Gets the value of the BaggageType field.
   * Type of baggage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BaggageType getBaggageType();
  
  
  /**
   * Gets the value of the CarrierCompensatedAmount field.
   * Amount the carrier compensated for the baggage loss or delay
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getCarrierCompensatedAmount();
  
  
  /**
   * Gets the value of the RelatedTripRU field.
   * Related trip
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripRU getRelatedTripRU();
  
  
  public gw.pl.persistence.core.Key getRelatedTripRUID();
  
  
  /**
   * Gets the value of the CarrierCompensated field.
   * Indicates if the carrier compensated the claimant for the baggage loss or delay
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCarrierCompensated();
  
  
  /**
   * Gets the value of the DelayOnly field.
   * Indicates if this is a delay only loss
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDelayOnly();
  
  
  /**
   * Sets the value of the BaggageMissingFrom field.
   */
  public void setBaggageMissingFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the BaggageRecoveredOn field.
   */
  public void setBaggageRecoveredOn(java.util.Date value);
  
  
  /**
   * Sets the value of the BaggageType field.
   */
  public void setBaggageType(typekey.BaggageType value);
  
  
  /**
   * Sets the value of the CarrierCompensated field.
   */
  public void setCarrierCompensated(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CarrierCompensatedAmount field.
   */
  public void setCarrierCompensatedAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the DelayOnly field.
   */
  public void setDelayOnly(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RelatedTripRU field.
   */
  public void setRelatedTripRU(entity.TripRU value);
  
  
  public void setRelatedTripRUID(gw.pl.persistence.core.Key value);
  
  
  
}
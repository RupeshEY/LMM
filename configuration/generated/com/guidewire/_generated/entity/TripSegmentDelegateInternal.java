package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripSegmentDelegate.eti;TripSegmentDelegate.eix;TripSegmentDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TripSegmentDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TripSegmentDelegate {
  /**
   * Gets the value of the CarrierName field.
   * Name of the airline, cruise ship, bus etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCarrierName();
  
  
  /**
   * Gets the value of the CarrierNumber field.
   * Flight, ship, bus number etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCarrierNumber();
  
  
  /**
   * Gets the value of the PortOfDisembarkation field.
   * Arrival airport, port, city etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfDisembarkation();
  
  
  /**
   * Gets the value of the PortOfEmbarkation field.
   * Boarding airport, port, city etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfEmbarkation();
  
  
  /**
   * Gets the value of the PortOfTransit field.
   * Transit airports, ports, cities etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfTransit();
  
  
  /**
   * Gets the value of the TransportType field.
   * Type of transport, airline, cruise ship, taxi etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransportType getTransportType();
  
  
  /**
   * Sets the value of the CarrierName field.
   */
  public void setCarrierName(java.lang.String value);
  
  
  /**
   * Sets the value of the CarrierNumber field.
   */
  public void setCarrierNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PortOfDisembarkation field.
   */
  public void setPortOfDisembarkation(java.lang.String value);
  
  
  /**
   * Sets the value of the PortOfEmbarkation field.
   */
  public void setPortOfEmbarkation(java.lang.String value);
  
  
  /**
   * Sets the value of the PortOfTransit field.
   */
  public void setPortOfTransit(java.lang.String value);
  
  
  /**
   * Sets the value of the TransportType field.
   */
  public void setTransportType(typekey.TransportType value);
  
  
  
}
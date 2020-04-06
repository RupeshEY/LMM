package entity;

/**
 * TripSegmentDelegate
 * Fields common to both TripSegment and AddnlTripSegment
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripSegmentDelegate.eti;TripSegmentDelegate.eix;TripSegmentDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TripSegmentDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TripSegmentDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TripSegmentDelegate>("entity.TripSegmentDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CARRIERNAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CarrierName", "CarrierName");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CARRIERNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CarrierNumber", "CarrierNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFDISEMBARKATION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PortOfDisembarkation", "PortOfDisembarkation");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFEMBARKATION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PortOfEmbarkation", "PortOfEmbarkation");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFTRANSIT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PortOfTransit", "PortOfTransit");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRANSPORTTYPE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("TransportType", "TransportType");
  
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
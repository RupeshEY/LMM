/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TurbineAircraft_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "TurbineAircraft_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LoggedHours = new javax.xml.namespace.QName( "", "LoggedHours", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPassengers = new javax.xml.namespace.QName( "", "NumPassengers", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PassengerTypeCd = new javax.xml.namespace.QName( "", "PassengerTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaintenanceFacility = new javax.xml.namespace.QName( "", "MaintenanceFacility", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaintenanceProgram = new javax.xml.namespace.QName( "", "MaintenanceProgram", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AircraftRef = new javax.xml.namespace.QName( "", "AircraftRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.TurbineAircraft_Type" );
    }
  };

  public TurbineAircraft_Type() {
    super( -1115219557, TYPE.get() );
  }

  private TurbineAircraft_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1115219557, state );
  }

  protected TurbineAircraft_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TurbineAircraft_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.TurbineAircraft_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.TurbineAircraft_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LoggedHours> getLoggedHours() {
    return (java.util.List<xsd.acord.LoggedHours>) TYPE.get().getPropertyValue( this, "_LoggedHours" );
  }


  public final void setLoggedHours( java.util.List<xsd.acord.LoggedHours> value ) {
    TYPE.get().setPropertyValue( this, "_LoggedHours", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPassengers() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumPassengers" );
  }


  public final void setNumPassengers( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumPassengers", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPassengers getNumPassengers_elem() {
    return (xsd.acord.NumPassengers) TYPE.get().getPropertyValue( this, "_NumPassengers_elem" );
  }


  public final void setNumPassengers_elem( xsd.acord.NumPassengers value ) {
    TYPE.get().setPropertyValue( this, "_NumPassengers_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.PassengerType> getPassengerTypeCd() {
    return (java.util.List<xsd.acord.enums.PassengerType>) TYPE.get().getPropertyValue( this, "_PassengerTypeCd" );
  }


  public final void setPassengerTypeCd( java.util.List<xsd.acord.enums.PassengerType> value ) {
    TYPE.get().setPropertyValue( this, "_PassengerTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PassengerTypeCd> getPassengerTypeCd_elem() {
    return (java.util.List<xsd.acord.PassengerTypeCd>) TYPE.get().getPropertyValue( this, "_PassengerTypeCd_elem" );
  }


  public final void setPassengerTypeCd_elem( java.util.List<xsd.acord.PassengerTypeCd> value ) {
    TYPE.get().setPropertyValue( this, "_PassengerTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMaintenanceFacility() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MaintenanceFacility" );
  }


  public final void setMaintenanceFacility( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MaintenanceFacility", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaintenanceFacility getMaintenanceFacility_elem() {
    return (xsd.acord.MaintenanceFacility) TYPE.get().getPropertyValue( this, "_MaintenanceFacility_elem" );
  }


  public final void setMaintenanceFacility_elem( xsd.acord.MaintenanceFacility value ) {
    TYPE.get().setPropertyValue( this, "_MaintenanceFacility_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMaintenanceProgram() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MaintenanceProgram" );
  }


  public final void setMaintenanceProgram( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MaintenanceProgram", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaintenanceProgram getMaintenanceProgram_elem() {
    return (xsd.acord.MaintenanceProgram) TYPE.get().getPropertyValue( this, "_MaintenanceProgram_elem" );
  }


  public final void setMaintenanceProgram_elem( xsd.acord.MaintenanceProgram value ) {
    TYPE.get().setPropertyValue( this, "_MaintenanceProgram_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAircraftRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_AircraftRef" );
  }


  public final void setAircraftRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_AircraftRef", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CCPolicySummaryVehicle extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPolicySummaryVehicle", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Color = new javax.xml.namespace.QName( "", "Color", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LicensePlate = new javax.xml.namespace.QName( "", "LicensePlate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Make = new javax.xml.namespace.QName( "", "Make", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Model = new javax.xml.namespace.QName( "", "Model", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicySystemID = new javax.xml.namespace.QName( "", "PolicySystemID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SerialNumber = new javax.xml.namespace.QName( "", "SerialNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_State = new javax.xml.namespace.QName( "", "State", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_VehicleNumber = new javax.xml.namespace.QName( "", "VehicleNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Vin = new javax.xml.namespace.QName( "", "Vin", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummaryVehicle" );
    }
  };

  public CCPolicySummaryVehicle() {
    super( 286982730, TYPE.get() );
  }

  private CCPolicySummaryVehicle( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 286982730, state );
  }

  protected CCPolicySummaryVehicle( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCPolicySummaryVehicle( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummaryVehicle> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummaryVehicle get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getColor() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Color" );
  }


  public final void setColor( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Color", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLicensePlate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LicensePlate" );
  }


  public final void setLicensePlate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LicensePlate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMake() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Make" );
  }


  public final void setMake( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Make", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModel() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Model" );
  }


  public final void setModel( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Model", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicySystemID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicySystemID" );
  }


  public final void setPolicySystemID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicySystemID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSerialNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SerialNumber" );
  }


  public final void setSerialNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SerialNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getState() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_State" );
  }


  public final void setState( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getVehicleNumber() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_VehicleNumber" );
  }


  public final void setVehicleNumber( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_VehicleNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVin() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Vin" );
  }


  public final void setVin( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Vin", value );
  }

}

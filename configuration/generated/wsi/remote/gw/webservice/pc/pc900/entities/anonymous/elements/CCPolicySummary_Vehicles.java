/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CCPolicySummary_Vehicles extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Vehicles", "tns" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPolicySummary_Vehicles" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle" );
    }
  };

  public CCPolicySummary_Vehicles() {
    super( 322377416, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle() );
  }

  public CCPolicySummary_Vehicles( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle typeInstance ) {
    super( 322377416, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CCPolicySummary_Vehicles( gw.internal.xml.XmlElementState state ) {
    super( 322377416, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPolicySummary_Vehicles> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPolicySummaryVehicle typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getColor() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Color" );
  }


  public final void setColor( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Color", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLicensePlate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LicensePlate" );
  }


  public final void setLicensePlate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LicensePlate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMake() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Make" );
  }


  public final void setMake( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Make", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModel() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Model" );
  }


  public final void setModel( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Model", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicySystemID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicySystemID" );
  }


  public final void setPolicySystemID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicySystemID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSerialNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SerialNumber" );
  }


  public final void setSerialNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SerialNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getState() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_State" );
  }


  public final void setState( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getVehicleNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehicleNumber" );
  }


  public final void setVehicleNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehicleNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVin() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Vin" );
  }


  public final void setVin( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Vin", value );
  }
}

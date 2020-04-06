/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AntiTheftDeviceInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AntiTheftDeviceInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AntiTheftDeviceCd = new javax.xml.namespace.QName( "", "AntiTheftDeviceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AntiTheftProductCd = new javax.xml.namespace.QName( "", "AntiTheftProductCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AntiTheftEngravingDevMfrCd = new javax.xml.namespace.QName( "", "AntiTheftEngravingDevMfrCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AntiTheftDeviceInfo_Type" );
    }
  };

  public AntiTheftDeviceInfo_Type() {
    super( -1558563105, TYPE.get() );
  }

  private AntiTheftDeviceInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1558563105, state );
  }

  protected AntiTheftDeviceInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AntiTheftDeviceInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AntiTheftDeviceInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AntiTheftDeviceInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.AutoAntiTheftDevice getAntiTheftDeviceCd() {
    return (xsd.acord.enums.AutoAntiTheftDevice) TYPE.get().getPropertyValue( this, "_AntiTheftDeviceCd" );
  }


  public final void setAntiTheftDeviceCd( xsd.acord.enums.AutoAntiTheftDevice value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftDeviceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AntiTheftDeviceCd getAntiTheftDeviceCd_elem() {
    return (xsd.acord.AntiTheftDeviceCd) TYPE.get().getPropertyValue( this, "_AntiTheftDeviceCd_elem" );
  }


  public final void setAntiTheftDeviceCd_elem( xsd.acord.AntiTheftDeviceCd value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftDeviceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.AntiTheftProduct getAntiTheftProductCd() {
    return (xsd.acord.enums.AntiTheftProduct) TYPE.get().getPropertyValue( this, "_AntiTheftProductCd" );
  }


  public final void setAntiTheftProductCd( xsd.acord.enums.AntiTheftProduct value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftProductCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AntiTheftProductCd getAntiTheftProductCd_elem() {
    return (xsd.acord.AntiTheftProductCd) TYPE.get().getPropertyValue( this, "_AntiTheftProductCd_elem" );
  }


  public final void setAntiTheftProductCd_elem( xsd.acord.AntiTheftProductCd value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftProductCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.VehAntiTheftEngravingDevMfr getAntiTheftEngravingDevMfrCd() {
    return (xsd.acord.enums.VehAntiTheftEngravingDevMfr) TYPE.get().getPropertyValue( this, "_AntiTheftEngravingDevMfrCd" );
  }


  public final void setAntiTheftEngravingDevMfrCd( xsd.acord.enums.VehAntiTheftEngravingDevMfr value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftEngravingDevMfrCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AntiTheftEngravingDevMfrCd getAntiTheftEngravingDevMfrCd_elem() {
    return (xsd.acord.AntiTheftEngravingDevMfrCd) TYPE.get().getPropertyValue( this, "_AntiTheftEngravingDevMfrCd_elem" );
  }


  public final void setAntiTheftEngravingDevMfrCd_elem( xsd.acord.AntiTheftEngravingDevMfrCd value ) {
    TYPE.get().setPropertyValue( this, "_AntiTheftEngravingDevMfrCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
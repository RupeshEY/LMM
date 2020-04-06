/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ItemDefinition extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemTypeCd = new javax.xml.namespace.QName( "", "ItemTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Manufacturer = new javax.xml.namespace.QName( "", "Manufacturer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ManufactureMethodCd = new javax.xml.namespace.QName( "", "ManufactureMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CertifyingEntityCd = new javax.xml.namespace.QName( "", "CertifyingEntityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Model = new javax.xml.namespace.QName( "", "Model", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SerialIdNumber = new javax.xml.namespace.QName( "", "SerialIdNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModelYear = new javax.xml.namespace.QName( "", "ModelYear", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDesc = new javax.xml.namespace.QName( "", "ItemDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ManufacturerCd = new javax.xml.namespace.QName( "", "ManufacturerCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModelCd = new javax.xml.namespace.QName( "", "ModelCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BodyTypeCd = new javax.xml.namespace.QName( "", "BodyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChassisSerialNumber = new javax.xml.namespace.QName( "", "ChassisSerialNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EngineSerialNumber = new javax.xml.namespace.QName( "", "EngineSerialNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransmissionSerialNumber = new javax.xml.namespace.QName( "", "TransmissionSerialNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeasedInd = new javax.xml.namespace.QName( "", "LeasedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Registration = new javax.xml.namespace.QName( "", "Registration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Brand = new javax.xml.namespace.QName( "", "Brand", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ItemDefinition" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ItemDefinition_Type" );
    }
  };

  public ItemDefinition() {
    super( 531522362, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ItemDefinition_Type() );
  }

  public ItemDefinition( xsd.acord.types.complex.ItemDefinition_Type typeInstance ) {
    super( 531522362, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ItemDefinition( gw.internal.xml.XmlElementState state ) {
    super( 531522362, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ItemDefinition> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ItemDefinition_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ItemDefinition_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ItemDefinition_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ItemDefinition parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ItemDefinition.class );
  }

  public static xsd.acord.ItemDefinition parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ItemDefinition.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ItemDefinitionType getItemTypeCd() {
    return (xsd.acord.enums.ItemDefinitionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemTypeCd" );
  }


  public final void setItemTypeCd( xsd.acord.enums.ItemDefinitionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemTypeCd getItemTypeCd_elem() {
    return (xsd.acord.ItemTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemTypeCd_elem" );
  }


  public final void setItemTypeCd_elem( xsd.acord.ItemTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getManufacturer() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Manufacturer" );
  }


  public final void setManufacturer( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Manufacturer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Manufacturer getManufacturer_elem() {
    return (xsd.acord.Manufacturer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Manufacturer_elem" );
  }


  public final void setManufacturer_elem( xsd.acord.Manufacturer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Manufacturer_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ManufactureMethod getManufactureMethodCd() {
    return (xsd.acord.enums.ManufactureMethod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManufactureMethodCd" );
  }


  public final void setManufactureMethodCd( xsd.acord.enums.ManufactureMethod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManufactureMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ManufactureMethodCd getManufactureMethodCd_elem() {
    return (xsd.acord.ManufactureMethodCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManufactureMethodCd_elem" );
  }


  public final void setManufactureMethodCd_elem( xsd.acord.ManufactureMethodCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManufactureMethodCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CertifyingEntity getCertifyingEntityCd() {
    return (xsd.acord.enums.CertifyingEntity) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CertifyingEntityCd" );
  }


  public final void setCertifyingEntityCd( xsd.acord.enums.CertifyingEntity value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CertifyingEntityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CertifyingEntityCd getCertifyingEntityCd_elem() {
    return (xsd.acord.CertifyingEntityCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CertifyingEntityCd_elem" );
  }


  public final void setCertifyingEntityCd_elem( xsd.acord.CertifyingEntityCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CertifyingEntityCd_elem", value );
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
  public final xsd.acord.Model getModel_elem() {
    return (xsd.acord.Model) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Model_elem" );
  }


  public final void setModel_elem( xsd.acord.Model value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Model_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSerialIdNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SerialIdNumber" );
  }


  public final void setSerialIdNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SerialIdNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SerialIdNumber getSerialIdNumber_elem() {
    return (xsd.acord.SerialIdNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SerialIdNumber_elem" );
  }


  public final void setSerialIdNumber_elem( xsd.acord.SerialIdNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SerialIdNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getModelYear() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModelYear" );
  }


  public final void setModelYear( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModelYear", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModelYear getModelYear_elem() {
    return (xsd.acord.ModelYear) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModelYear_elem" );
  }


  public final void setModelYear_elem( xsd.acord.ModelYear value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModelYear_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getItemDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDesc" );
  }


  public final void setItemDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemDesc getItemDesc_elem() {
    return (xsd.acord.ItemDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDesc_elem" );
  }


  public final void setItemDesc_elem( xsd.acord.ItemDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getManufacturerCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManufacturerCd" );
  }


  public final void setManufacturerCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManufacturerCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ManufacturerCd getManufacturerCd_elem() {
    return (xsd.acord.ManufacturerCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManufacturerCd_elem" );
  }


  public final void setManufacturerCd_elem( xsd.acord.ManufacturerCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManufacturerCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModelCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModelCd" );
  }


  public final void setModelCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModelCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModelCd getModelCd_elem() {
    return (xsd.acord.ModelCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModelCd_elem" );
  }


  public final void setModelCd_elem( xsd.acord.ModelCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModelCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.VehicleBodyType getBodyTypeCd() {
    return (xsd.acord.enums.VehicleBodyType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BodyTypeCd" );
  }


  public final void setBodyTypeCd( xsd.acord.enums.VehicleBodyType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BodyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BodyTypeCd getBodyTypeCd_elem() {
    return (xsd.acord.BodyTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BodyTypeCd_elem" );
  }


  public final void setBodyTypeCd_elem( xsd.acord.BodyTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BodyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getChassisSerialNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChassisSerialNumber" );
  }


  public final void setChassisSerialNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChassisSerialNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ChassisSerialNumber getChassisSerialNumber_elem() {
    return (xsd.acord.ChassisSerialNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChassisSerialNumber_elem" );
  }


  public final void setChassisSerialNumber_elem( xsd.acord.ChassisSerialNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChassisSerialNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEngineSerialNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EngineSerialNumber" );
  }


  public final void setEngineSerialNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EngineSerialNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EngineSerialNumber getEngineSerialNumber_elem() {
    return (xsd.acord.EngineSerialNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EngineSerialNumber_elem" );
  }


  public final void setEngineSerialNumber_elem( xsd.acord.EngineSerialNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EngineSerialNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransmissionSerialNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransmissionSerialNumber" );
  }


  public final void setTransmissionSerialNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransmissionSerialNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransmissionSerialNumber getTransmissionSerialNumber_elem() {
    return (xsd.acord.TransmissionSerialNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransmissionSerialNumber_elem" );
  }


  public final void setTransmissionSerialNumber_elem( xsd.acord.TransmissionSerialNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransmissionSerialNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLeasedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeasedInd" );
  }


  public final void setLeasedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeasedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LeasedInd getLeasedInd_elem() {
    return (xsd.acord.LeasedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeasedInd_elem" );
  }


  public final void setLeasedInd_elem( xsd.acord.LeasedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeasedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Registration> getRegistration() {
    return (java.util.List<xsd.acord.Registration>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Registration" );
  }


  public final void setRegistration( java.util.List<xsd.acord.Registration> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Registration", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrand() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Brand" );
  }


  public final void setBrand( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Brand", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Brand getBrand_elem() {
    return (xsd.acord.Brand) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Brand_elem" );
  }


  public final void setBrand_elem( xsd.acord.Brand value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Brand_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
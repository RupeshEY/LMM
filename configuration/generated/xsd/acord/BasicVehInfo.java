/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BasicVehInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BasicVehInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Manufacturer = new javax.xml.namespace.QName( "", "Manufacturer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ManufacturerCd = new javax.xml.namespace.QName( "", "ManufacturerCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Model = new javax.xml.namespace.QName( "", "Model", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModelCd = new javax.xml.namespace.QName( "", "ModelCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModelYear = new javax.xml.namespace.QName( "", "ModelYear", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehBodyTypeCd = new javax.xml.namespace.QName( "", "VehBodyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehBodyTypeDesc = new javax.xml.namespace.QName( "", "VehBodyTypeDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumTotalVehRatingPoints = new javax.xml.namespace.QName( "", "NumTotalVehRatingPoints", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehTypeCd = new javax.xml.namespace.QName( "", "VehTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehLength = new javax.xml.namespace.QName( "", "VehLength", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Registration = new javax.xml.namespace.QName( "", "Registration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Width = new javax.xml.namespace.QName( "", "Width", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AntiTheftDeviceInfo = new javax.xml.namespace.QName( "", "AntiTheftDeviceInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_POLKRestraintDeviceCd = new javax.xml.namespace.QName( "", "POLKRestraintDeviceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HighTheftInd = new javax.xml.namespace.QName( "", "HighTheftInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RatedDriverRef = new javax.xml.namespace.QName( "", "RatedDriverRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RegisteredOwnerRef = new javax.xml.namespace.QName( "", "RegisteredOwnerRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BasicVehInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PCBASICVEH" );
    }
  };

  public BasicVehInfo() {
    super( 1400561485, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PCBASICVEH() );
  }

  public BasicVehInfo( xsd.acord.types.complex.PCBASICVEH typeInstance ) {
    super( 1400561485, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BasicVehInfo( gw.internal.xml.XmlElementState state ) {
    super( 1400561485, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BasicVehInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PCBASICVEH get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PCBASICVEH.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PCBASICVEH typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BasicVehInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BasicVehInfo.class );
  }

  public static xsd.acord.BasicVehInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BasicVehInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
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
  public final xsd.acord.enums.VehicleBodyType getVehBodyTypeCd() {
    return (xsd.acord.enums.VehicleBodyType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehBodyTypeCd" );
  }


  public final void setVehBodyTypeCd( xsd.acord.enums.VehicleBodyType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehBodyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VehBodyTypeCd getVehBodyTypeCd_elem() {
    return (xsd.acord.VehBodyTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehBodyTypeCd_elem" );
  }


  public final void setVehBodyTypeCd_elem( xsd.acord.VehBodyTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehBodyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVehBodyTypeDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehBodyTypeDesc" );
  }


  public final void setVehBodyTypeDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehBodyTypeDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VehBodyTypeDesc getVehBodyTypeDesc_elem() {
    return (xsd.acord.VehBodyTypeDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehBodyTypeDesc_elem" );
  }


  public final void setVehBodyTypeDesc_elem( xsd.acord.VehBodyTypeDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehBodyTypeDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumTotalVehRatingPoints() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalVehRatingPoints" );
  }


  public final void setNumTotalVehRatingPoints( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalVehRatingPoints", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumTotalVehRatingPoints getNumTotalVehRatingPoints_elem() {
    return (xsd.acord.NumTotalVehRatingPoints) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalVehRatingPoints_elem" );
  }


  public final void setNumTotalVehRatingPoints_elem( xsd.acord.NumTotalVehRatingPoints value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalVehRatingPoints_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.VehicleType getVehTypeCd() {
    return (xsd.acord.enums.VehicleType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehTypeCd" );
  }


  public final void setVehTypeCd( xsd.acord.enums.VehicleType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VehTypeCd getVehTypeCd_elem() {
    return (xsd.acord.VehTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehTypeCd_elem" );
  }


  public final void setVehTypeCd_elem( xsd.acord.VehTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VehLength getVehLength() {
    return (xsd.acord.VehLength) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehLength" );
  }


  public final void setVehLength( xsd.acord.VehLength value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehLength", value );
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
  public final xsd.acord.Width getWidth() {
    return (xsd.acord.Width) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Width" );
  }


  public final void setWidth( xsd.acord.Width value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Width", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AntiTheftDeviceInfo> getAntiTheftDeviceInfo() {
    return (java.util.List<xsd.acord.AntiTheftDeviceInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AntiTheftDeviceInfo" );
  }


  public final void setAntiTheftDeviceInfo( java.util.List<xsd.acord.AntiTheftDeviceInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AntiTheftDeviceInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPOLKRestraintDeviceCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_POLKRestraintDeviceCd" );
  }


  public final void setPOLKRestraintDeviceCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_POLKRestraintDeviceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.POLKRestraintDeviceCd getPOLKRestraintDeviceCd_elem() {
    return (xsd.acord.POLKRestraintDeviceCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_POLKRestraintDeviceCd_elem" );
  }


  public final void setPOLKRestraintDeviceCd_elem( xsd.acord.POLKRestraintDeviceCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_POLKRestraintDeviceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getHighTheftInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HighTheftInd" );
  }


  public final void setHighTheftInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HighTheftInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HighTheftInd getHighTheftInd_elem() {
    return (xsd.acord.HighTheftInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HighTheftInd_elem" );
  }


  public final void setHighTheftInd_elem( xsd.acord.HighTheftInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HighTheftInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getRatedDriverRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RatedDriverRef" );
  }


  public final void setRatedDriverRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RatedDriverRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getRegisteredOwnerRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RegisteredOwnerRef" );
  }


  public final void setRegisteredOwnerRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RegisteredOwnerRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef", value );
  }
}

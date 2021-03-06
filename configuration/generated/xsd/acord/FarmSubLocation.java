/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FarmSubLocation extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FarmSubLocation", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmRanchTypeCd = new javax.xml.namespace.QName( "", "FarmRanchTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandArea = new javax.xml.namespace.QName( "", "LandArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandUseCd = new javax.xml.namespace.QName( "", "LandUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandOwnershipCd = new javax.xml.namespace.QName( "", "LandOwnershipCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmedByCd = new javax.xml.namespace.QName( "", "FarmedByCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoStructuresInd = new javax.xml.namespace.QName( "", "NoStructuresInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HorseOperationsInfo = new javax.xml.namespace.QName( "", "HorseOperationsInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.FarmSubLocation" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FarmSubLocation_Type" );
    }
  };

  public FarmSubLocation() {
    super( 868823051, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.FarmSubLocation_Type() );
  }

  public FarmSubLocation( xsd.acord.types.complex.FarmSubLocation_Type typeInstance ) {
    super( 868823051, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FarmSubLocation( gw.internal.xml.XmlElementState state ) {
    super( 868823051, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.FarmSubLocation> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.FarmSubLocation_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.FarmSubLocation_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.FarmSubLocation_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.FarmSubLocation parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.FarmSubLocation.class );
  }

  public static xsd.acord.FarmSubLocation parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.FarmSubLocation.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.FarmRanchType> getFarmRanchTypeCd() {
    return (java.util.List<xsd.acord.enums.FarmRanchType>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FarmRanchTypeCd" );
  }


  public final void setFarmRanchTypeCd( java.util.List<xsd.acord.enums.FarmRanchType> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FarmRanchTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FarmRanchTypeCd> getFarmRanchTypeCd_elem() {
    return (java.util.List<xsd.acord.FarmRanchTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FarmRanchTypeCd_elem" );
  }


  public final void setFarmRanchTypeCd_elem( java.util.List<xsd.acord.FarmRanchTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FarmRanchTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LandArea getLandArea() {
    return (xsd.acord.LandArea) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LandArea" );
  }


  public final void setLandArea( xsd.acord.LandArea value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LandArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.LandUse> getLandUseCd() {
    return (java.util.List<xsd.acord.enums.LandUse>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LandUseCd" );
  }


  public final void setLandUseCd( java.util.List<xsd.acord.enums.LandUse> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LandUseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LandUseCd> getLandUseCd_elem() {
    return (java.util.List<xsd.acord.LandUseCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LandUseCd_elem" );
  }


  public final void setLandUseCd_elem( java.util.List<xsd.acord.LandUseCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LandUseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Ownership getLandOwnershipCd() {
    return (xsd.acord.enums.Ownership) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LandOwnershipCd" );
  }


  public final void setLandOwnershipCd( xsd.acord.enums.Ownership value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LandOwnershipCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LandOwnershipCd getLandOwnershipCd_elem() {
    return (xsd.acord.LandOwnershipCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LandOwnershipCd_elem" );
  }


  public final void setLandOwnershipCd_elem( xsd.acord.LandOwnershipCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LandOwnershipCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FarmedBy getFarmedByCd() {
    return (xsd.acord.enums.FarmedBy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FarmedByCd" );
  }


  public final void setFarmedByCd( xsd.acord.enums.FarmedBy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FarmedByCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FarmedByCd getFarmedByCd_elem() {
    return (xsd.acord.FarmedByCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FarmedByCd_elem" );
  }


  public final void setFarmedByCd_elem( xsd.acord.FarmedByCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FarmedByCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNoStructuresInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoStructuresInd" );
  }


  public final void setNoStructuresInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoStructuresInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NoStructuresInd getNoStructuresInd_elem() {
    return (xsd.acord.NoStructuresInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoStructuresInd_elem" );
  }


  public final void setNoStructuresInd_elem( xsd.acord.NoStructuresInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoStructuresInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.HorseOperationsInfo> getHorseOperationsInfo() {
    return (java.util.List<xsd.acord.HorseOperationsInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HorseOperationsInfo" );
  }


  public final void setHorseOperationsInfo( java.util.List<xsd.acord.HorseOperationsInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HorseOperationsInfo", value );
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
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubLocationRef", value );
  }
}

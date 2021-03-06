/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ExteriorWallMaterialInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ExteriorWallMaterialInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConstructionQualityCd = new javax.xml.namespace.QName( "", "ConstructionQualityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExteriorWallMaterialCd = new javax.xml.namespace.QName( "", "ExteriorWallMaterialCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExteriorWallMaterialPct = new javax.xml.namespace.QName( "", "ExteriorWallMaterialPct", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ExteriorWallMaterialInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ExteriorWallMaterialInfo_Type" );
    }
  };

  public ExteriorWallMaterialInfo() {
    super( 986383793, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ExteriorWallMaterialInfo_Type() );
  }

  public ExteriorWallMaterialInfo( xsd.acord.types.complex.ExteriorWallMaterialInfo_Type typeInstance ) {
    super( 986383793, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ExteriorWallMaterialInfo( gw.internal.xml.XmlElementState state ) {
    super( 986383793, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ExteriorWallMaterialInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ExteriorWallMaterialInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ExteriorWallMaterialInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ExteriorWallMaterialInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }

  public static xsd.acord.ExteriorWallMaterialInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ExteriorWallMaterialInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionClass getConstructionQualityCd() {
    return (xsd.acord.enums.ConstructionClass) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConstructionQualityCd" );
  }


  public final void setConstructionQualityCd( xsd.acord.enums.ConstructionClass value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConstructionQualityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConstructionQualityCd getConstructionQualityCd_elem() {
    return (xsd.acord.ConstructionQualityCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConstructionQualityCd_elem" );
  }


  public final void setConstructionQualityCd_elem( xsd.acord.ConstructionQualityCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConstructionQualityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionType getExteriorWallMaterialCd() {
    return (xsd.acord.enums.ConstructionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialCd" );
  }


  public final void setExteriorWallMaterialCd( xsd.acord.enums.ConstructionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExteriorWallMaterialCd getExteriorWallMaterialCd_elem() {
    return (xsd.acord.ExteriorWallMaterialCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialCd_elem" );
  }


  public final void setExteriorWallMaterialCd_elem( xsd.acord.ExteriorWallMaterialCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getExteriorWallMaterialPct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialPct" );
  }


  public final void setExteriorWallMaterialPct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExteriorWallMaterialPct getExteriorWallMaterialPct_elem() {
    return (xsd.acord.ExteriorWallMaterialPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialPct_elem" );
  }


  public final void setExteriorWallMaterialPct_elem( xsd.acord.ExteriorWallMaterialPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExteriorWallMaterialPct_elem", value );
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

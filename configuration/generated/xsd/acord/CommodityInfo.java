/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommodityInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommodityInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommodityDesc = new javax.xml.namespace.QName( "", "CommodityDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RevenuePct = new javax.xml.namespace.QName( "", "RevenuePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValueInfo = new javax.xml.namespace.QName( "", "ValueInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommoditiesCd = new javax.xml.namespace.QName( "", "CommoditiesCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommodityInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommodityInfo_Type" );
    }
  };

  public CommodityInfo() {
    super( 1443963015, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommodityInfo_Type() );
  }

  public CommodityInfo( xsd.acord.types.complex.CommodityInfo_Type typeInstance ) {
    super( 1443963015, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommodityInfo( gw.internal.xml.XmlElementState state ) {
    super( 1443963015, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommodityInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommodityInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommodityInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommodityInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommodityInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommodityInfo.class );
  }

  public static xsd.acord.CommodityInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommodityInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommodityDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommodityDesc" );
  }


  public final void setCommodityDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommodityDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommodityDesc getCommodityDesc_elem() {
    return (xsd.acord.CommodityDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommodityDesc_elem" );
  }


  public final void setCommodityDesc_elem( xsd.acord.CommodityDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommodityDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getRevenuePct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RevenuePct" );
  }


  public final void setRevenuePct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RevenuePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RevenuePct getRevenuePct_elem() {
    return (xsd.acord.RevenuePct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RevenuePct_elem" );
  }


  public final void setRevenuePct_elem( xsd.acord.RevenuePct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RevenuePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ValueInfo> getValueInfo() {
    return (java.util.List<xsd.acord.ValueInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValueInfo" );
  }


  public final void setValueInfo( java.util.List<xsd.acord.ValueInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValueInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Commodity getCommoditiesCd() {
    return (xsd.acord.enums.Commodity) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommoditiesCd" );
  }


  public final void setCommoditiesCd( xsd.acord.enums.Commodity value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommoditiesCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommoditiesCd getCommoditiesCd_elem() {
    return (xsd.acord.CommoditiesCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommoditiesCd_elem" );
  }


  public final void setCommoditiesCd_elem( xsd.acord.CommoditiesCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommoditiesCd_elem", value );
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
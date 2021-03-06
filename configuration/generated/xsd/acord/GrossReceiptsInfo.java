/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GrossReceiptsInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "GrossReceiptsInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossSalesAmt = new javax.xml.namespace.QName( "", "GrossSalesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_YearIdentifierCd = new javax.xml.namespace.QName( "", "YearIdentifierCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossSalesYr = new javax.xml.namespace.QName( "", "GrossSalesYr", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.GrossReceiptsInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.GrossReceiptsInfo_Type" );
    }
  };

  public GrossReceiptsInfo() {
    super( 573163001, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.GrossReceiptsInfo_Type() );
  }

  public GrossReceiptsInfo( xsd.acord.types.complex.GrossReceiptsInfo_Type typeInstance ) {
    super( 573163001, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GrossReceiptsInfo( gw.internal.xml.XmlElementState state ) {
    super( 573163001, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.GrossReceiptsInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.GrossReceiptsInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.GrossReceiptsInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.GrossReceiptsInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.GrossReceiptsInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.GrossReceiptsInfo.class );
  }

  public static xsd.acord.GrossReceiptsInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.GrossReceiptsInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GrossSalesAmt getGrossSalesAmt() {
    return (xsd.acord.GrossSalesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GrossSalesAmt" );
  }


  public final void setGrossSalesAmt( xsd.acord.GrossSalesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GrossSalesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.YearIdentifier getYearIdentifierCd() {
    return (xsd.acord.enums.YearIdentifier) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_YearIdentifierCd" );
  }


  public final void setYearIdentifierCd( xsd.acord.enums.YearIdentifier value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_YearIdentifierCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.YearIdentifierCd getYearIdentifierCd_elem() {
    return (xsd.acord.YearIdentifierCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_YearIdentifierCd_elem" );
  }


  public final void setYearIdentifierCd_elem( xsd.acord.YearIdentifierCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_YearIdentifierCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlYear getGrossSalesYr() {
    return (gw.xml.date.XmlYear) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GrossSalesYr" );
  }


  public final void setGrossSalesYr( gw.xml.date.XmlYear value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GrossSalesYr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GrossSalesYr getGrossSalesYr_elem() {
    return (xsd.acord.GrossSalesYr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GrossSalesYr_elem" );
  }


  public final void setGrossSalesYr_elem( xsd.acord.GrossSalesYr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GrossSalesYr_elem", value );
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

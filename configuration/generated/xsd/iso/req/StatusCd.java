/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class StatusCd extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "StatusCd", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.StatusCd" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.complex.AnyType", "gw.xsd.w3c.xmlschema" );
    }
  };

  public StatusCd() {
    super( -494664527, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.complex.AnyType() );
  }

  public StatusCd( gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( -494664527, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private StatusCd( gw.internal.xml.XmlElementState state ) {
    super( -494664527, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.StatusCd> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.complex.AnyType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.complex.AnyType.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.StatusCd parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.StatusCd.class );
  }

  public static xsd.iso.req.StatusCd parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.StatusCd.class );
  }
}

/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ProblemHeader extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "ProblemHeader", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2005/08/addressing", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType" );
    }
  };

  public ProblemHeader() {
    super( 682846726, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType() );
  }

  public ProblemHeader( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType typeInstance ) {
    super( 682846726, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ProblemHeader( gw.internal.xml.XmlElementState state ) {
    super( 682846726, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.AttributedAnyType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ProblemHeader.class );
  }
}
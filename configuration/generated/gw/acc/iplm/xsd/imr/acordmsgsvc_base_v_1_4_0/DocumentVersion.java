/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class DocumentVersion extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentVersion", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion" );
    }
  };

  public DocumentVersion() {
    super( -1534912016, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public DocumentVersion( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1534912016, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private DocumentVersion( gw.internal.xml.XmlElementState state ) {
    super( -1534912016, state );
  }

  public DocumentVersion( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion> get$Class() {
    return getClass();
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }

  public static gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.acordmsgsvc_base_v_1_4_0.DocumentVersion.class );
  }
}
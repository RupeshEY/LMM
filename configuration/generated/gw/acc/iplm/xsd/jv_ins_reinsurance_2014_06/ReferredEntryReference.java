/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReferredEntryReference extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredEntryReference", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference" );
    }
  };

  public ReferredEntryReference() {
    super( 1959105008, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ReferredEntryReference( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1959105008, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReferredEntryReference( gw.internal.xml.XmlElementState state ) {
    super( 1959105008, state );
  }

  public ReferredEntryReference( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference> get$Class() {
    return getClass();
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredEntryReference.class );
  }
}
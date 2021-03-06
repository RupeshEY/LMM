/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TimeStamp extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "TimeStamp", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.simple.DateTime", "gw.xsd.w3c.xmlschema" );
    }
  };

  public TimeStamp() {
    super( 1243466313, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.DateTime() );
  }

  public TimeStamp( gw.xsd.w3c.xmlschema.types.simple.DateTime typeInstance ) {
    super( 1243466313, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TimeStamp( gw.internal.xml.XmlElementState state ) {
    super( 1243466313, state );
  }

  public TimeStamp( gw.xml.date.XmlDateTime value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.simple.DateTime get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.simple.DateTime.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.simple.DateTime typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp.class );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime getValue() {
    return (gw.xml.date.XmlDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime get$Value() {
    return (gw.xml.date.XmlDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( gw.xml.date.XmlDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( gw.xml.date.XmlDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice1;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class UnsignedByte extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://schemas.microsoft.com/2003/10/Serialization/", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice1.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice1.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.simple.UnsignedByte", "gw.xsd.w3c.xmlschema" );
    }
  };

  public UnsignedByte() {
    super( -721527114, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.UnsignedByte() );
  }

  public UnsignedByte( gw.xsd.w3c.xmlschema.types.simple.UnsignedByte typeInstance ) {
    super( -721527114, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private UnsignedByte( gw.internal.xml.XmlElementState state ) {
    super( -721527114, state );
  }

  public UnsignedByte( java.lang.Short value ) {
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
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.simple.UnsignedByte get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.simple.UnsignedByte.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.simple.UnsignedByte typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.microsoft.bingmaps.routeservice1.UnsignedByte.class );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Short getValue() {
    return (java.lang.Short) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Short get$Value() {
    return (java.lang.Short) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.lang.Short value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.lang.Short value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}

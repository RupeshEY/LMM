/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class XmlToCsvResponse extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "xmlToCsvResponse", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse" );
    }
  };

  public XmlToCsvResponse() {
    super( 347994201, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse() );
  }

  public XmlToCsvResponse( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse typeInstance ) {
    super( 347994201, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private XmlToCsvResponse( gw.internal.xml.XmlElementState state ) {
    super( 347994201, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.XmlToCsvResponse typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.XmlToCsvResponse.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReturn() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Return" );
  }


  public final void setReturn( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Return", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.XmlToCsvResponse_Return getReturn_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.XmlToCsvResponse_Return) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Return_elem" );
  }


  public final void setReturn_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.XmlToCsvResponse_Return value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Return_elem", value );
  }
}

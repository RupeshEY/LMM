/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.typelisttoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetTypelistValues extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "getTypelistValues", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Typelist = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "typelist", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.typelisttoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.typelisttoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues" );
    }
  };

  public GetTypelistValues() {
    super( 2012978425, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues() );
  }

  public GetTypelistValues( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues typeInstance ) {
    super( 2012978425, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetTypelistValues( gw.internal.xml.XmlElementState state ) {
    super( 2012978425, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetTypelistValues typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }

  public static wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.typelisttoolsapi.elements.GetTypelistValues.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTypelist() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Typelist" );
  }


  public final void setTypelist( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Typelist", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetTypelistValues_Typelist getTypelist_elem() {
    return (wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetTypelistValues_Typelist) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Typelist_elem" );
  }


  public final void setTypelist_elem( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetTypelistValues_Typelist value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Typelist_elem", value );
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ImportXmlData extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "importXmlData", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XmlData = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "xmlData", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData" );
    }
  };

  public ImportXmlData() {
    super( -1262096584, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData() );
  }

  public ImportXmlData( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData typeInstance ) {
    super( -1262096584, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ImportXmlData( gw.internal.xml.XmlElementState state ) {
    super( -1262096584, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlData typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportXmlData.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getXmlData() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_XmlData" );
  }


  public final void setXmlData( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_XmlData", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlData_XmlData getXmlData_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlData_XmlData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_XmlData_elem" );
  }


  public final void setXmlData_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlData_XmlData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_XmlData_elem", value );
  }
}
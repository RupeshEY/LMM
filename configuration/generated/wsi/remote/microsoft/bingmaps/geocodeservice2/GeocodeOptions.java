/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice2;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GeocodeOptions extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "GeocodeOptions", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/geocode", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Count = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Count", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Filters = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Filters", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions" );
    }
  };

  public GeocodeOptions() {
    super( -1901433181, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions() );
  }

  public GeocodeOptions( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions typeInstance ) {
    super( -1901433181, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GeocodeOptions( gw.internal.xml.XmlElementState state ) {
    super( -1901433181, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeOptions typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice2.GeocodeOptions.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getCount() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Count" );
  }


  public final void setCount( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Count", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Count getCount_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Count) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Count_elem" );
  }


  public final void setCount_elem( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Count value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Count_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Filters getFilters() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Filters) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Filters" );
  }


  public final void setFilters( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeOptions_Filters value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Filters", value );
  }
}
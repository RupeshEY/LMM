/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RouteResult extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "RouteResult", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Legs = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Legs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RoutePath = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "RoutePath", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Summary = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Summary", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.RouteResult" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult" );
    }
  };

  public RouteResult() {
    super( -1278301041, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult() );
  }

  public RouteResult( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult typeInstance ) {
    super( -1278301041, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RouteResult( gw.internal.xml.XmlElementState state ) {
    super( -1278301041, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.RouteResult> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.RouteResult parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.RouteResult.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs getLegs() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Legs" );
  }


  public final void setLegs( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Legs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.RoutePath getRoutePath() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.RoutePath) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RoutePath" );
  }


  public final void setRoutePath( wsi.remote.microsoft.bingmaps.routeservice3.RoutePath value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RoutePath", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary getSummary() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Summary" );
  }


  public final void setSummary( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Summary", value );
  }
}
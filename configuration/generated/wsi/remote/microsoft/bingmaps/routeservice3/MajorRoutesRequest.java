/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MajorRoutesRequest extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesRequest", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Destination = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Destination", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Options = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Options", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Credentials = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Credentials", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Culture = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Culture", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionOptions = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserProfile = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "UserProfile", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest" );
    }
  };

  public MajorRoutesRequest() {
    super( -802572861, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest() );
  }

  public MajorRoutesRequest( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest typeInstance ) {
    super( -802572861, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MajorRoutesRequest( gw.internal.xml.XmlElementState state ) {
    super( -802572861, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }

  public static wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.microsoft.bingmaps.routeservice3.MajorRoutesRequest.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination getDestination() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Destination" );
  }


  public final void setDestination( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Destination", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options getOptions() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Options" );
  }


  public final void setOptions( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Options", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.Credentials getCredentials() {
    return (wsi.remote.microsoft.bingmaps.routeservice.Credentials) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Credentials" );
  }


  public final void setCredentials( wsi.remote.microsoft.bingmaps.routeservice.Credentials value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Credentials", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCulture() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Culture" );
  }


  public final void setCulture( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Culture", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.RequestBase_Culture getCulture_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.RequestBase_Culture) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Culture_elem" );
  }


  public final void setCulture_elem( wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.RequestBase_Culture value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Culture_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.ExecutionOptions getExecutionOptions() {
    return (wsi.remote.microsoft.bingmaps.routeservice.ExecutionOptions) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExecutionOptions" );
  }


  public final void setExecutionOptions( wsi.remote.microsoft.bingmaps.routeservice.ExecutionOptions value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExecutionOptions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.UserProfile getUserProfile() {
    return (wsi.remote.microsoft.bingmaps.routeservice.UserProfile) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UserProfile" );
  }


  public final void setUserProfile( wsi.remote.microsoft.bingmaps.routeservice.UserProfile value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UserProfile", value );
  }
}
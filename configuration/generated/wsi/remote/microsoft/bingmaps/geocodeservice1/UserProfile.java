/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice1;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class UserProfile extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "UserProfile", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/common", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentHeading = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "CurrentHeading", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentLocation = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "CurrentLocation", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeviceType = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "DeviceType", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceUnit = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "DistanceUnit", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IPAddress = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "IPAddress", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MapView = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "MapView", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ScreenSize = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ScreenSize", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice1.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice1.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile" );
    }
  };

  public UserProfile() {
    super( 187822362, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile() );
  }

  public UserProfile( wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile typeInstance ) {
    super( 187822362, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private UserProfile( gw.internal.xml.XmlElementState state ) {
    super( 187822362, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.UserProfile typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }

  public static wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentHeading getCurrentHeading() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentHeading) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurrentHeading" );
  }


  public final void setCurrentHeading( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentHeading value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurrentHeading", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentLocation getCurrentLocation() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentLocation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurrentLocation" );
  }


  public final void setCurrentLocation( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_CurrentLocation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurrentLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType getDeviceType() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeviceType" );
  }


  public final void setDeviceType( wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeviceType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.DeviceType getDeviceType_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.DeviceType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeviceType_elem" );
  }


  public final void setDeviceType_elem( wsi.remote.microsoft.bingmaps.geocodeservice1.DeviceType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeviceType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DistanceUnit getDistanceUnit() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DistanceUnit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DistanceUnit" );
  }


  public final void setDistanceUnit( wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DistanceUnit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DistanceUnit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.DistanceUnit getDistanceUnit_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.DistanceUnit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DistanceUnit_elem" );
  }


  public final void setDistanceUnit_elem( wsi.remote.microsoft.bingmaps.geocodeservice1.DistanceUnit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DistanceUnit_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIPAddress() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IPAddress" );
  }


  public final void setIPAddress( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IPAddress", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_IPAddress getIPAddress_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_IPAddress) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IPAddress_elem" );
  }


  public final void setIPAddress_elem( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_IPAddress value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IPAddress_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_MapView getMapView() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_MapView) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MapView" );
  }


  public final void setMapView( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_MapView value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MapView", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_ScreenSize getScreenSize() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_ScreenSize) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ScreenSize" );
  }


  public final void setScreenSize( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.UserProfile_ScreenSize value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ScreenSize", value );
  }
}

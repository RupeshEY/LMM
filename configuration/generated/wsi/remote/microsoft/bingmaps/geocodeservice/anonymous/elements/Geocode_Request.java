/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Geocode_Request extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode/contracts", "request", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/geocode/contracts", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Address", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Options = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Options", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Query = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Query", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Credentials = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Credentials", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Culture = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Culture", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionOptions = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserProfile = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "UserProfile", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements.Geocode_Request" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice.util.SchemaAccess ).getSchemaIndex().findTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest", "wsi.remote.microsoft.bingmaps.geocodeservice2" );
    }
  };

  public Geocode_Request() {
    super( 1457185599, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest() );
  }

  public Geocode_Request( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest typeInstance ) {
    super( 1457185599, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Geocode_Request( gw.internal.xml.XmlElementState state ) {
    super( 1457185599, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements.Geocode_Request> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.GeocodeRequest typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Address getAddress() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Address) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Address" );
  }


  public final void setAddress( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Address value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Options getOptions() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Options) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Options" );
  }


  public final void setOptions( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Options value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Options", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQuery() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Query" );
  }


  public final void setQuery( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Query", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Query getQuery_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Query) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Query_elem" );
  }


  public final void setQuery_elem( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.GeocodeRequest_Query value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Query_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.Credentials getCredentials() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.Credentials) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Credentials" );
  }


  public final void setCredentials( wsi.remote.microsoft.bingmaps.geocodeservice1.Credentials value ) {
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
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.RequestBase_Culture getCulture_elem() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.RequestBase_Culture) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Culture_elem" );
  }


  public final void setCulture_elem( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.RequestBase_Culture value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Culture_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.ExecutionOptions getExecutionOptions() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.ExecutionOptions) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExecutionOptions" );
  }


  public final void setExecutionOptions( wsi.remote.microsoft.bingmaps.geocodeservice1.ExecutionOptions value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExecutionOptions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile getUserProfile() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UserProfile" );
  }


  public final void setUserProfile( wsi.remote.microsoft.bingmaps.geocodeservice1.UserProfile value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UserProfile", value );
  }
}
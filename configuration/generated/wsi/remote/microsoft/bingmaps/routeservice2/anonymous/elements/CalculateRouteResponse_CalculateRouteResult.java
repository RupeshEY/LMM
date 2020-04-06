/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CalculateRouteResponse_CalculateRouteResult extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRouteResult", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route/contracts", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Result = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Result", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrandLogoUri = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "BrandLogoUri", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResponseSummary = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ResponseSummary", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRouteResponse_CalculateRouteResult" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice2.util.SchemaAccess ).getSchemaIndex().findTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse", "wsi.remote.microsoft.bingmaps.routeservice3" );
    }
  };

  public CalculateRouteResponse_CalculateRouteResult() {
    super( -1245624579, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse() );
  }

  public CalculateRouteResponse_CalculateRouteResult( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse typeInstance ) {
    super( -1245624579, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CalculateRouteResponse_CalculateRouteResult( gw.internal.xml.XmlElementState state ) {
    super( -1245624579, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRouteResponse_CalculateRouteResult> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse.class );
  }

  public final void set$TypeInstance( wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResponse typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResponse_Result getResult() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResponse_Result) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Result" );
  }


  public final void setResult( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResponse_Result value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Result", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrandLogoUri() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrandLogoUri" );
  }


  public final void setBrandLogoUri( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrandLogoUri", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri getBrandLogoUri_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrandLogoUri_elem" );
  }


  public final void setBrandLogoUri_elem( wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrandLogoUri_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary getResponseSummary() {
    return (wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ResponseSummary" );
  }


  public final void setResponseSummary( wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ResponseSummary", value );
  }
}
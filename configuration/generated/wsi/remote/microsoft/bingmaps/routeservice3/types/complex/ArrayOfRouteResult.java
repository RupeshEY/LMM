/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ArrayOfRouteResult extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "ArrayOfRouteResult", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RouteResult = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "RouteResult", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfRouteResult" );
    }
  };

  public ArrayOfRouteResult() {
    super( 271635200, TYPE.get() );
  }

  private ArrayOfRouteResult( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 271635200, state );
  }

  protected ArrayOfRouteResult( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ArrayOfRouteResult( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfRouteResult> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfRouteResult get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.RouteResult> getRouteResult() {
    return (java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.RouteResult>) TYPE.get().getPropertyValue( this, "_RouteResult" );
  }


  public final void setRouteResult( java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.RouteResult> value ) {
    TYPE.get().setPropertyValue( this, "_RouteResult", value );
  }


}

/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RouteResult extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "RouteResult", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Legs = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Legs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RoutePath = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "RoutePath", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Summary = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Summary", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult" );
    }
  };

  public RouteResult() {
    super( 1926355868, TYPE.get() );
  }

  private RouteResult( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1926355868, state );
  }

  protected RouteResult( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RouteResult( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.RouteResult get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs getLegs() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs) TYPE.get().getPropertyValue( this, "_Legs" );
  }


  public final void setLegs( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Legs value ) {
    TYPE.get().setPropertyValue( this, "_Legs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.RoutePath getRoutePath() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.RoutePath) TYPE.get().getPropertyValue( this, "_RoutePath" );
  }


  public final void setRoutePath( wsi.remote.microsoft.bingmaps.routeservice3.RoutePath value ) {
    TYPE.get().setPropertyValue( this, "_RoutePath", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary getSummary() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary) TYPE.get().getPropertyValue( this, "_Summary" );
  }


  public final void setSummary( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.RouteResult_Summary value ) {
    TYPE.get().setPropertyValue( this, "_Summary", value );
  }

}
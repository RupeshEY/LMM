/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CalculateRouteResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CalculateRouteResult = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRouteResult", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRouteResponse" );
    }
  };

  public CalculateRouteResponse() {
    super( -1810709360, TYPE.get() );
  }

  private CalculateRouteResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1810709360, state );
  }

  protected CalculateRouteResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CalculateRouteResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRouteResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRouteResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRouteResponse_CalculateRouteResult getCalculateRouteResult() {
    return (wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRouteResponse_CalculateRouteResult) TYPE.get().getPropertyValue( this, "_CalculateRouteResult" );
  }


  public final void setCalculateRouteResult( wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRouteResponse_CalculateRouteResult value ) {
    TYPE.get().setPropertyValue( this, "_CalculateRouteResult", value );
  }

}

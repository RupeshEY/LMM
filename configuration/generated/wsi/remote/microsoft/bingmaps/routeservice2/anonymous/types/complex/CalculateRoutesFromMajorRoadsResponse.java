/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CalculateRoutesFromMajorRoadsResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CalculateRoutesFromMajorRoadsResult = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRoutesFromMajorRoadsResult", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRoutesFromMajorRoadsResponse" );
    }
  };

  public CalculateRoutesFromMajorRoadsResponse() {
    super( -639395063, TYPE.get() );
  }

  private CalculateRoutesFromMajorRoadsResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -639395063, state );
  }

  protected CalculateRoutesFromMajorRoadsResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CalculateRoutesFromMajorRoadsResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRoutesFromMajorRoadsResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice2.anonymous.types.complex.CalculateRoutesFromMajorRoadsResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRoutesFromMajorRoadsResponse_CalculateRoutesFromMajorRoadsResult getCalculateRoutesFromMajorRoadsResult() {
    return (wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRoutesFromMajorRoadsResponse_CalculateRoutesFromMajorRoadsResult) TYPE.get().getPropertyValue( this, "_CalculateRoutesFromMajorRoadsResult" );
  }


  public final void setCalculateRoutesFromMajorRoadsResult( wsi.remote.microsoft.bingmaps.routeservice2.anonymous.elements.CalculateRoutesFromMajorRoadsResponse_CalculateRoutesFromMajorRoadsResult value ) {
    TYPE.get().setPropertyValue( this, "_CalculateRoutesFromMajorRoadsResult", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReverseGeocodeResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReverseGeocodeResult = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode/contracts", "ReverseGeocodeResult", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.types.complex.ReverseGeocodeResponse" );
    }
  };

  public ReverseGeocodeResponse() {
    super( 672049528, TYPE.get() );
  }

  private ReverseGeocodeResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 672049528, state );
  }

  protected ReverseGeocodeResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReverseGeocodeResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.types.complex.ReverseGeocodeResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.types.complex.ReverseGeocodeResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements.ReverseGeocodeResponse_ReverseGeocodeResult getReverseGeocodeResult() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements.ReverseGeocodeResponse_ReverseGeocodeResult) TYPE.get().getPropertyValue( this, "_ReverseGeocodeResult" );
  }


  public final void setReverseGeocodeResult( wsi.remote.microsoft.bingmaps.geocodeservice.anonymous.elements.ReverseGeocodeResponse_ReverseGeocodeResult value ) {
    TYPE.get().setPropertyValue( this, "_ReverseGeocodeResult", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.RequestBase.class)
public class ReverseGeocodeRequest extends wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.RequestBase {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "ReverseGeocodeRequest", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/geocode", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "Location", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Credentials = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Credentials", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Culture = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Culture", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionOptions = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserProfile = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "UserProfile", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.ReverseGeocodeRequest" );
    }
  };

  public ReverseGeocodeRequest() {
    super( -624368835, TYPE.get() );
  }

  private ReverseGeocodeRequest( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -624368835, state );
  }

  protected ReverseGeocodeRequest( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReverseGeocodeRequest( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.ReverseGeocodeRequest> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.ReverseGeocodeRequest get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.ReverseGeocodeRequest_Location getLocation() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.ReverseGeocodeRequest_Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( wsi.remote.microsoft.bingmaps.geocodeservice2.anonymous.elements.ReverseGeocodeRequest_Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }

}

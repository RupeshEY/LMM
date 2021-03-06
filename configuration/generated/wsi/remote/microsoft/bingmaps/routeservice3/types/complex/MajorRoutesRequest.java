/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(wsi.remote.microsoft.bingmaps.routeservice.types.complex.RequestBase.class)
public class MajorRoutesRequest extends wsi.remote.microsoft.bingmaps.routeservice.types.complex.RequestBase {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesRequest", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Destination = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Destination", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Options = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Options", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Credentials = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Credentials", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Culture = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Culture", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionOptions = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserProfile = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "UserProfile", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest" );
    }
  };

  public MajorRoutesRequest() {
    super( 1433595414, TYPE.get() );
  }

  private MajorRoutesRequest( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1433595414, state );
  }

  protected MajorRoutesRequest( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MajorRoutesRequest( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.MajorRoutesRequest get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination getDestination() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination) TYPE.get().getPropertyValue( this, "_Destination" );
  }


  public final void setDestination( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Destination value ) {
    TYPE.get().setPropertyValue( this, "_Destination", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options getOptions() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options) TYPE.get().getPropertyValue( this, "_Options" );
  }


  public final void setOptions( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.MajorRoutesRequest_Options value ) {
    TYPE.get().setPropertyValue( this, "_Options", value );
  }

}

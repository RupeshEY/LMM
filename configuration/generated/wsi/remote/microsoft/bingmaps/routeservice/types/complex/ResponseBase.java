/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ResponseBase extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ResponseBase", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/common", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrandLogoUri = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "BrandLogoUri", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResponseSummary = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "ResponseSummary", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice.types.complex.ResponseBase" );
    }
  };

  public ResponseBase() {
    super( 1188520823, TYPE.get() );
  }

  private ResponseBase( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1188520823, state );
  }

  protected ResponseBase( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ResponseBase( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice.types.complex.ResponseBase> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice.types.complex.ResponseBase get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrandLogoUri() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BrandLogoUri" );
  }


  public final void setBrandLogoUri( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BrandLogoUri", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri getBrandLogoUri_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri) TYPE.get().getPropertyValue( this, "_BrandLogoUri_elem" );
  }


  public final void setBrandLogoUri_elem( wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.ResponseBase_BrandLogoUri value ) {
    TYPE.get().setPropertyValue( this, "_BrandLogoUri_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary getResponseSummary() {
    return (wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary) TYPE.get().getPropertyValue( this, "_ResponseSummary" );
  }


  public final void setResponseSummary( wsi.remote.microsoft.bingmaps.routeservice.ResponseSummary value ) {
    TYPE.get().setPropertyValue( this, "_ResponseSummary", value );
  }

}

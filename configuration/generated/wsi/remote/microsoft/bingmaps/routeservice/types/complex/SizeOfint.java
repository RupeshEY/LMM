/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SizeOfint extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "SizeOfint", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/common", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Height = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Height", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Width = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Width", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice.types.complex.SizeOfint" );
    }
  };

  public SizeOfint() {
    super( 63901842, TYPE.get() );
  }

  private SizeOfint( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 63901842, state );
  }

  protected SizeOfint( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SizeOfint( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice.types.complex.SizeOfint> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice.types.complex.SizeOfint get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getHeight() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_Height" );
  }


  public final void setHeight( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_Height", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Height getHeight_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Height) TYPE.get().getPropertyValue( this, "_Height_elem" );
  }


  public final void setHeight_elem( wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Height value ) {
    TYPE.get().setPropertyValue( this, "_Height_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getWidth() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_Width" );
  }


  public final void setWidth( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_Width", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Width getWidth_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Width) TYPE.get().getPropertyValue( this, "_Width_elem" );
  }


  public final void setWidth_elem( wsi.remote.microsoft.bingmaps.routeservice.anonymous.elements.SizeOfint_Width value ) {
    TYPE.get().setPropertyValue( this, "_Width_elem", value );
  }

}
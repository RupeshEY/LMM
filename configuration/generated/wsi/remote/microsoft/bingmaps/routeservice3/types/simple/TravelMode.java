/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class TravelMode extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "TravelMode", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.simple.TravelMode" );
    }
  };

  public TravelMode() {
    super( -549484819, TYPE.get() );
  }

  public TravelMode( wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode value ) {
    this();
    setValue( value );
  }

  private TravelMode( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -549484819, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.simple.TravelMode> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.simple.TravelMode get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode getValue() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode get$Value() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.remote.microsoft.bingmaps.routeservice3.enums.TravelMode value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

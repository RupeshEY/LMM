/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice1.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class DeviceType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "DeviceType", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/common", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice1.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice1.types.simple.DeviceType" );
    }
  };

  public DeviceType() {
    super( -107983309, TYPE.get() );
  }

  public DeviceType( wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType value ) {
    this();
    setValue( value );
  }

  private DeviceType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -107983309, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice1.types.simple.DeviceType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.geocodeservice1.types.simple.DeviceType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType getValue() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType get$Value() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.remote.microsoft.bingmaps.geocodeservice1.enums.DeviceType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

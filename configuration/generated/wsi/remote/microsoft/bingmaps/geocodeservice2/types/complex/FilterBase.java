/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FilterBase extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/geocode", "FilterBase", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/geocode", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice2.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.FilterBase" );
    }
  };

  public FilterBase() {
    super( -486606625, TYPE.get() );
  }

  private FilterBase( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -486606625, state );
  }

  protected FilterBase( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FilterBase( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.FilterBase> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.geocodeservice2.types.complex.FilterBase get$TypeInstance() {
    return this;
  }


}

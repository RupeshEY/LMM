/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ArrayOfItineraryItem extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItem", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItineraryItem = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "ItineraryItem", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfItineraryItem" );
    }
  };

  public ArrayOfItineraryItem() {
    super( -38509704, TYPE.get() );
  }

  private ArrayOfItineraryItem( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -38509704, state );
  }

  protected ArrayOfItineraryItem( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ArrayOfItineraryItem( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfItineraryItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ArrayOfItineraryItem get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.ItineraryItem> getItineraryItem() {
    return (java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.ItineraryItem>) TYPE.get().getPropertyValue( this, "_ItineraryItem" );
  }


  public final void setItineraryItem( java.util.List<wsi.remote.microsoft.bingmaps.routeservice3.ItineraryItem> value ) {
    TYPE.get().setPropertyValue( this, "_ItineraryItem", value );
  }


}
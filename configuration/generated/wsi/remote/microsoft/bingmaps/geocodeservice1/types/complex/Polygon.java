/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.ShapeBase.class)
public class Polygon extends wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.ShapeBase {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Polygon", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/common", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Vertices = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/common", "Vertices", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice1.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.Polygon" );
    }
  };

  public Polygon() {
    super( 1439240515, TYPE.get() );
  }

  private Polygon( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1439240515, state );
  }

  protected Polygon( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Polygon( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.Polygon> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.geocodeservice1.types.complex.Polygon get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.Polygon_Vertices getVertices() {
    return (wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.Polygon_Vertices) TYPE.get().getPropertyValue( this, "_Vertices" );
  }


  public final void setVertices( wsi.remote.microsoft.bingmaps.geocodeservice1.anonymous.elements.Polygon_Vertices value ) {
    TYPE.get().setPropertyValue( this, "_Vertices", value );
  }

}
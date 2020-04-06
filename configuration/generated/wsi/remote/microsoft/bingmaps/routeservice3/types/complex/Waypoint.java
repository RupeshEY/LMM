/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Waypoint extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Waypoint", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Description", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Location", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.Waypoint" );
    }
  };

  public Waypoint() {
    super( -1392117781, TYPE.get() );
  }

  private Waypoint( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1392117781, state );
  }

  protected Waypoint( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Waypoint( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.Waypoint> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.Waypoint get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Description getDescription_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Location getLocation() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.Waypoint_Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }

}
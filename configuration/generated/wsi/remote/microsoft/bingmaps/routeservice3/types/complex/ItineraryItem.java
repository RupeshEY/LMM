/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.routeservice3.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ItineraryItem extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "ItineraryItem", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://dev.virtualearth.net/webservices/v1/route", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompassDirection = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "CompassDirection", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Hints = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Hints", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Location", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ManeuverType = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "ManeuverType", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Summary = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Summary", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Text = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Text", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Warnings = new javax.xml.namespace.QName( "http://dev.virtualearth.net/webservices/v1/route", "Warnings", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.routeservice3.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ItineraryItem" );
    }
  };

  public ItineraryItem() {
    super( 1010152724, TYPE.get() );
  }

  private ItineraryItem( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1010152724, state );
  }

  protected ItineraryItem( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ItineraryItem( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ItineraryItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.microsoft.bingmaps.routeservice3.types.complex.ItineraryItem get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompassDirection() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CompassDirection" );
  }


  public final void setCompassDirection( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CompassDirection", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_CompassDirection getCompassDirection_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_CompassDirection) TYPE.get().getPropertyValue( this, "_CompassDirection_elem" );
  }


  public final void setCompassDirection_elem( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_CompassDirection value ) {
    TYPE.get().setPropertyValue( this, "_CompassDirection_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Hints getHints() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Hints) TYPE.get().getPropertyValue( this, "_Hints" );
  }


  public final void setHints( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Hints value ) {
    TYPE.get().setPropertyValue( this, "_Hints", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Location getLocation() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.enums.ManeuverType getManeuverType() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.enums.ManeuverType) TYPE.get().getPropertyValue( this, "_ManeuverType" );
  }


  public final void setManeuverType( wsi.remote.microsoft.bingmaps.routeservice3.enums.ManeuverType value ) {
    TYPE.get().setPropertyValue( this, "_ManeuverType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.ManeuverType getManeuverType_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.ManeuverType) TYPE.get().getPropertyValue( this, "_ManeuverType_elem" );
  }


  public final void setManeuverType_elem( wsi.remote.microsoft.bingmaps.routeservice3.ManeuverType value ) {
    TYPE.get().setPropertyValue( this, "_ManeuverType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Summary getSummary() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Summary) TYPE.get().getPropertyValue( this, "_Summary" );
  }


  public final void setSummary( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Summary value ) {
    TYPE.get().setPropertyValue( this, "_Summary", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getText() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Text" );
  }


  public final void setText( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Text", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Text getText_elem() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Text) TYPE.get().getPropertyValue( this, "_Text_elem" );
  }


  public final void setText_elem( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Text value ) {
    TYPE.get().setPropertyValue( this, "_Text_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Warnings getWarnings() {
    return (wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Warnings) TYPE.get().getPropertyValue( this, "_Warnings" );
  }


  public final void setWarnings( wsi.remote.microsoft.bingmaps.routeservice3.anonymous.elements.ItineraryItem_Warnings value ) {
    TYPE.get().setPropertyValue( this, "_Warnings", value );
  }

}

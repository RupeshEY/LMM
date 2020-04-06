/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EventInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EventInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventCd = new javax.xml.namespace.QName( "", "EventCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventDt = new javax.xml.namespace.QName( "", "EventDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EventInfo_Type" );
    }
  };

  public EventInfo_Type() {
    super( -338086824, TYPE.get() );
  }

  private EventInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -338086824, state );
  }

  protected EventInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EventInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.EventInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.EventInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Event getEventCd() {
    return (xsd.acord.enums.Event) TYPE.get().getPropertyValue( this, "_EventCd" );
  }


  public final void setEventCd( xsd.acord.enums.Event value ) {
    TYPE.get().setPropertyValue( this, "_EventCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EventCd getEventCd_elem() {
    return (xsd.acord.EventCd) TYPE.get().getPropertyValue( this, "_EventCd_elem" );
  }


  public final void setEventCd_elem( xsd.acord.EventCd value ) {
    TYPE.get().setPropertyValue( this, "_EventCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEventDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EventDt" );
  }


  public final void setEventDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EventDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EventDt getEventDt_elem() {
    return (xsd.acord.EventDt) TYPE.get().getPropertyValue( this, "_EventDt_elem" );
  }


  public final void setEventDt_elem( xsd.acord.EventDt value ) {
    TYPE.get().setPropertyValue( this, "_EventDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
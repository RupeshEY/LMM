/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MatchDetails_ComIso_SIUParty_EventInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EventInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventCd = new javax.xml.namespace.QName( "", "EventCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventDt = new javax.xml.namespace.QName( "", "EventDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo" );
    }
  };

  public MatchDetails_ComIso_SIUParty_EventInfo() {
    super( 757320129, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo() );
  }

  public MatchDetails_ComIso_SIUParty_EventInfo( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo typeInstance ) {
    super( 757320129, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MatchDetails_ComIso_SIUParty_EventInfo( gw.internal.xml.XmlElementState state ) {
    super( 757320129, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.MatchDetails_ComIso_SIUParty_EventInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEventCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventCd" );
  }


  public final void setEventCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventCd getEventCd_elem() {
    return (xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventCd_elem" );
  }


  public final void setEventCd_elem( xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEventDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventDt" );
  }


  public final void setEventDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventDt getEventDt_elem() {
    return (xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventDt_elem" );
  }


  public final void setEventDt_elem( xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty_EventInfo_EventDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventDt_elem", value );
  }
}
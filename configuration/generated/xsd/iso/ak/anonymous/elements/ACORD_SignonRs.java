/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ACORD_SignonRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SignonRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustId = new javax.xml.namespace.QName( "", "CustId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClientDt = new javax.xml.namespace.QName( "", "ClientDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustLangPref = new javax.xml.namespace.QName( "", "CustLangPref", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClientApp = new javax.xml.namespace.QName( "", "ClientApp", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServerDt = new javax.xml.namespace.QName( "", "ServerDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Language = new javax.xml.namespace.QName( "", "Language", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.elements.ACORD_SignonRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs" );
    }
  };

  public ACORD_SignonRs() {
    super( 1516641949, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs() );
  }

  public ACORD_SignonRs( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs typeInstance ) {
    super( 1516641949, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ACORD_SignonRs( gw.internal.xml.XmlElementState state ) {
    super( 1516641949, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.ak.anonymous.elements.ACORD_SignonRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs.class );
  }

  public final void set$TypeInstance( xsd.iso.ak.anonymous.types.complex.ACORD_SignonRs typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status getStatus() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustId getCustId() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustId" );
  }


  public final void setCustId( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime getClientDt() {
    return (gw.xml.date.XmlDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClientDt" );
  }


  public final void setClientDt( gw.xml.date.XmlDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClientDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientDt getClientDt_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClientDt_elem" );
  }


  public final void setClientDt_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClientDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustLangPref() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustLangPref" );
  }


  public final void setCustLangPref( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustLangPref", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustLangPref getCustLangPref_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustLangPref) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustLangPref_elem" );
  }


  public final void setCustLangPref_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_CustLangPref value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustLangPref_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp getClientApp() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClientApp" );
  }


  public final void setClientApp( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ClientApp value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClientApp", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime getServerDt() {
    return (gw.xml.date.XmlDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServerDt" );
  }


  public final void setServerDt( gw.xml.date.XmlDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServerDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ServerDt getServerDt_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ServerDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServerDt_elem" );
  }


  public final void setServerDt_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_ServerDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServerDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLanguage() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Language" );
  }


  public final void setLanguage( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Language", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Language getLanguage_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Language) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Language_elem" );
  }


  public final void setLanguage_elem( xsd.iso.ak.anonymous.elements.ACORD_SignonRs_Language value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Language_elem", value );
  }
}
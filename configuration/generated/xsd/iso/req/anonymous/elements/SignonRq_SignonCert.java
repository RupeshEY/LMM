/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SignonRq_SignonCert extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SignonCert", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRoleCd = new javax.xml.namespace.QName( "", "SignonRoleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustId = new javax.xml.namespace.QName( "", "CustId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Certificate = new javax.xml.namespace.QName( "", "Certificate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GenSessKey = new javax.xml.namespace.QName( "", "GenSessKey", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.SignonRq_SignonCert" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert" );
    }
  };

  public SignonRq_SignonCert() {
    super( -591537620, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert() );
  }

  public SignonRq_SignonCert( xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert typeInstance ) {
    super( -591537620, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SignonRq_SignonCert( gw.internal.xml.XmlElementState state ) {
    super( -591537620, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.SignonRq_SignonCert> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.SignonRq_SignonCert typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSignonRoleCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRoleCd" );
  }


  public final void setSignonRoleCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignonRoleCd getSignonRoleCd_elem() {
    return (xsd.iso.req.SignonRoleCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRoleCd_elem" );
  }


  public final void setSignonRoleCd_elem( xsd.iso.req.SignonRoleCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRoleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.CustId getCustId() {
    return (xsd.iso.req.CustId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustId" );
  }


  public final void setCustId( xsd.iso.req.CustId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.SignonRq_SignonCert_Certificate getCertificate() {
    return (xsd.iso.req.anonymous.elements.SignonRq_SignonCert_Certificate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Certificate" );
  }


  public final void setCertificate( xsd.iso.req.anonymous.elements.SignonRq_SignonCert_Certificate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Certificate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGenSessKey() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GenSessKey" );
  }


  public final void setGenSessKey( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GenSessKey", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.GenSessKey getGenSessKey_elem() {
    return (xsd.iso.req.GenSessKey) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GenSessKey_elem" );
  }


  public final void setGenSessKey_elem( xsd.iso.req.GenSessKey value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GenSessKey_elem", value );
  }
}
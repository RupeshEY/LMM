/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SignonRq_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SignonRq_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonPswd = new javax.xml.namespace.QName( "", "SignonPswd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonCert = new javax.xml.namespace.QName( "", "SignonCert", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonTransport = new javax.xml.namespace.QName( "", "SignonTransport", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SessKey = new javax.xml.namespace.QName( "", "SessKey", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClientDt = new javax.xml.namespace.QName( "", "ClientDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustLangPref = new javax.xml.namespace.QName( "", "CustLangPref", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClientApp = new javax.xml.namespace.QName( "", "ClientApp", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProxyClient = new javax.xml.namespace.QName( "", "ProxyClient", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuppressEcho = new javax.xml.namespace.QName( "", "SuppressEcho", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SignonRq_Type" );
    }
  };

  public SignonRq_Type() {
    super( -321154313, TYPE.get() );
  }

  private SignonRq_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -321154313, state );
  }

  protected SignonRq_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SignonRq_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SignonRq_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SignonRq_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonPswd getSignonPswd() {
    return (xsd.acord.SignonPswd) TYPE.get().getPropertyValue( this, "_SignonPswd" );
  }


  public final void setSignonPswd( xsd.acord.SignonPswd value ) {
    TYPE.get().setPropertyValue( this, "_SignonPswd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonCert getSignonCert() {
    return (xsd.acord.SignonCert) TYPE.get().getPropertyValue( this, "_SignonCert" );
  }


  public final void setSignonCert( xsd.acord.SignonCert value ) {
    TYPE.get().setPropertyValue( this, "_SignonCert", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonTransport getSignonTransport() {
    return (xsd.acord.SignonTransport) TYPE.get().getPropertyValue( this, "_SignonTransport" );
  }


  public final void setSignonTransport( xsd.acord.SignonTransport value ) {
    TYPE.get().setPropertyValue( this, "_SignonTransport", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSessKey() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SessKey" );
  }


  public final void setSessKey( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SessKey", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SessKey getSessKey_elem() {
    return (xsd.acord.SessKey) TYPE.get().getPropertyValue( this, "_SessKey_elem" );
  }


  public final void setSessKey_elem( xsd.acord.SessKey value ) {
    TYPE.get().setPropertyValue( this, "_SessKey_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClientDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ClientDt" );
  }


  public final void setClientDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ClientDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClientDt getClientDt_elem() {
    return (xsd.acord.ClientDt) TYPE.get().getPropertyValue( this, "_ClientDt_elem" );
  }


  public final void setClientDt_elem( xsd.acord.ClientDt value ) {
    TYPE.get().setPropertyValue( this, "_ClientDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustLangPref() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CustLangPref" );
  }


  public final void setCustLangPref( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CustLangPref", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustLangPref getCustLangPref_elem() {
    return (xsd.acord.CustLangPref) TYPE.get().getPropertyValue( this, "_CustLangPref_elem" );
  }


  public final void setCustLangPref_elem( xsd.acord.CustLangPref value ) {
    TYPE.get().setPropertyValue( this, "_CustLangPref_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClientApp getClientApp() {
    return (xsd.acord.ClientApp) TYPE.get().getPropertyValue( this, "_ClientApp" );
  }


  public final void setClientApp( xsd.acord.ClientApp value ) {
    TYPE.get().setPropertyValue( this, "_ClientApp", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProxyClient getProxyClient() {
    return (xsd.acord.ProxyClient) TYPE.get().getPropertyValue( this, "_ProxyClient" );
  }


  public final void setProxyClient( xsd.acord.ProxyClient value ) {
    TYPE.get().setPropertyValue( this, "_ProxyClient", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSuppressEcho() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SuppressEcho" );
  }


  public final void setSuppressEcho( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SuppressEcho", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SuppressEcho getSuppressEcho_elem() {
    return (xsd.acord.SuppressEcho) TYPE.get().getPropertyValue( this, "_SuppressEcho_elem" );
  }


  public final void setSuppressEcho_elem( xsd.acord.SuppressEcho value ) {
    TYPE.get().setPropertyValue( this, "_SuppressEcho_elem", value );
  }

}
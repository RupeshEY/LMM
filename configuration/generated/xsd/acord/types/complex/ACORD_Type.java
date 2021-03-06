/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ACORD_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ACORD_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRq = new javax.xml.namespace.QName( "", "SignonRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuppressNotificationInd = new javax.xml.namespace.QName( "", "SuppressNotificationInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SendSPRequestsInd = new javax.xml.namespace.QName( "", "SendSPRequestsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRq = new javax.xml.namespace.QName( "", "BaseSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExtensionsSvcRq = new javax.xml.namespace.QName( "", "ExtensionsSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceSvcRq = new javax.xml.namespace.QName( "", "InsuranceSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretySvcRq = new javax.xml.namespace.QName( "", "SuretySvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRq = new javax.xml.namespace.QName( "", "ClaimsSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountingSvcRq = new javax.xml.namespace.QName( "", "AccountingSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommonSvcRq = new javax.xml.namespace.QName( "", "CommonSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRq = new javax.xml.namespace.QName( "", "SignoffRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRs = new javax.xml.namespace.QName( "", "SignonRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseInfo = new javax.xml.namespace.QName( "", "PendingResponseInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSetInfo = new javax.xml.namespace.QName( "", "MsgSetInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRs = new javax.xml.namespace.QName( "", "BaseSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExtensionsSvcRs = new javax.xml.namespace.QName( "", "ExtensionsSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceSvcRs = new javax.xml.namespace.QName( "", "InsuranceSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretySvcRs = new javax.xml.namespace.QName( "", "SuretySvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRs = new javax.xml.namespace.QName( "", "ClaimsSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountingSvcRs = new javax.xml.namespace.QName( "", "AccountingSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommonSvcRs = new javax.xml.namespace.QName( "", "CommonSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRs = new javax.xml.namespace.QName( "", "SignoffRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ACORD_Type" );
    }
  };

  public ACORD_Type() {
    super( 1198458145, TYPE.get() );
  }

  private ACORD_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1198458145, state );
  }

  protected ACORD_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ACORD_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ACORD_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ACORD_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonRq getSignonRq() {
    return (xsd.acord.SignonRq) TYPE.get().getPropertyValue( this, "_SignonRq" );
  }


  public final void setSignonRq( xsd.acord.SignonRq value ) {
    TYPE.get().setPropertyValue( this, "_SignonRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSuppressNotificationInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SuppressNotificationInd" );
  }


  public final void setSuppressNotificationInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SuppressNotificationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SuppressNotificationInd getSuppressNotificationInd_elem() {
    return (xsd.acord.SuppressNotificationInd) TYPE.get().getPropertyValue( this, "_SuppressNotificationInd_elem" );
  }


  public final void setSuppressNotificationInd_elem( xsd.acord.SuppressNotificationInd value ) {
    TYPE.get().setPropertyValue( this, "_SuppressNotificationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSendSPRequestsInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SendSPRequestsInd" );
  }


  public final void setSendSPRequestsInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SendSPRequestsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SendSPRequestsInd getSendSPRequestsInd_elem() {
    return (xsd.acord.SendSPRequestsInd) TYPE.get().getPropertyValue( this, "_SendSPRequestsInd_elem" );
  }


  public final void setSendSPRequestsInd_elem( xsd.acord.SendSPRequestsInd value ) {
    TYPE.get().setPropertyValue( this, "_SendSPRequestsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BaseSvcRq getBaseSvcRq() {
    return (xsd.acord.BaseSvcRq) TYPE.get().getPropertyValue( this, "_BaseSvcRq" );
  }


  public final void setBaseSvcRq( xsd.acord.BaseSvcRq value ) {
    TYPE.get().setPropertyValue( this, "_BaseSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExtensionsSvcRq getExtensionsSvcRq() {
    return (xsd.acord.ExtensionsSvcRq) TYPE.get().getPropertyValue( this, "_ExtensionsSvcRq" );
  }


  public final void setExtensionsSvcRq( xsd.acord.ExtensionsSvcRq value ) {
    TYPE.get().setPropertyValue( this, "_ExtensionsSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuranceSvcRq> getInsuranceSvcRq() {
    return (java.util.List<xsd.acord.InsuranceSvcRq>) TYPE.get().getPropertyValue( this, "_InsuranceSvcRq" );
  }


  public final void setInsuranceSvcRq( java.util.List<xsd.acord.InsuranceSvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretySvcRq> getSuretySvcRq() {
    return (java.util.List<xsd.acord.SuretySvcRq>) TYPE.get().getPropertyValue( this, "_SuretySvcRq" );
  }


  public final void setSuretySvcRq( java.util.List<xsd.acord.SuretySvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_SuretySvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSvcRq> getClaimsSvcRq() {
    return (java.util.List<xsd.acord.ClaimsSvcRq>) TYPE.get().getPropertyValue( this, "_ClaimsSvcRq" );
  }


  public final void setClaimsSvcRq( java.util.List<xsd.acord.ClaimsSvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountingSvcRq> getAccountingSvcRq() {
    return (java.util.List<xsd.acord.AccountingSvcRq>) TYPE.get().getPropertyValue( this, "_AccountingSvcRq" );
  }


  public final void setAccountingSvcRq( java.util.List<xsd.acord.AccountingSvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_AccountingSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommonSvcRq> getCommonSvcRq() {
    return (java.util.List<xsd.acord.CommonSvcRq>) TYPE.get().getPropertyValue( this, "_CommonSvcRq" );
  }


  public final void setCommonSvcRq( java.util.List<xsd.acord.CommonSvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_CommonSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignoffRq getSignoffRq() {
    return (xsd.acord.SignoffRq) TYPE.get().getPropertyValue( this, "_SignoffRq" );
  }


  public final void setSignoffRq( xsd.acord.SignoffRq value ) {
    TYPE.get().setPropertyValue( this, "_SignoffRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Status getStatus() {
    return (xsd.acord.Status) TYPE.get().getPropertyValue( this, "_Status" );
  }


  public final void setStatus( xsd.acord.Status value ) {
    TYPE.get().setPropertyValue( this, "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonRs getSignonRs() {
    return (xsd.acord.SignonRs) TYPE.get().getPropertyValue( this, "_SignonRs" );
  }


  public final void setSignonRs( xsd.acord.SignonRs value ) {
    TYPE.get().setPropertyValue( this, "_SignonRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PendingResponseInfo> getPendingResponseInfo() {
    return (java.util.List<xsd.acord.PendingResponseInfo>) TYPE.get().getPropertyValue( this, "_PendingResponseInfo" );
  }


  public final void setPendingResponseInfo( java.util.List<xsd.acord.PendingResponseInfo> value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MsgSetInfo> getMsgSetInfo() {
    return (java.util.List<xsd.acord.MsgSetInfo>) TYPE.get().getPropertyValue( this, "_MsgSetInfo" );
  }


  public final void setMsgSetInfo( java.util.List<xsd.acord.MsgSetInfo> value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BaseSvcRs getBaseSvcRs() {
    return (xsd.acord.BaseSvcRs) TYPE.get().getPropertyValue( this, "_BaseSvcRs" );
  }


  public final void setBaseSvcRs( xsd.acord.BaseSvcRs value ) {
    TYPE.get().setPropertyValue( this, "_BaseSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExtensionsSvcRs getExtensionsSvcRs() {
    return (xsd.acord.ExtensionsSvcRs) TYPE.get().getPropertyValue( this, "_ExtensionsSvcRs" );
  }


  public final void setExtensionsSvcRs( xsd.acord.ExtensionsSvcRs value ) {
    TYPE.get().setPropertyValue( this, "_ExtensionsSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuranceSvcRs> getInsuranceSvcRs() {
    return (java.util.List<xsd.acord.InsuranceSvcRs>) TYPE.get().getPropertyValue( this, "_InsuranceSvcRs" );
  }


  public final void setInsuranceSvcRs( java.util.List<xsd.acord.InsuranceSvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretySvcRs> getSuretySvcRs() {
    return (java.util.List<xsd.acord.SuretySvcRs>) TYPE.get().getPropertyValue( this, "_SuretySvcRs" );
  }


  public final void setSuretySvcRs( java.util.List<xsd.acord.SuretySvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_SuretySvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSvcRs> getClaimsSvcRs() {
    return (java.util.List<xsd.acord.ClaimsSvcRs>) TYPE.get().getPropertyValue( this, "_ClaimsSvcRs" );
  }


  public final void setClaimsSvcRs( java.util.List<xsd.acord.ClaimsSvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountingSvcRs> getAccountingSvcRs() {
    return (java.util.List<xsd.acord.AccountingSvcRs>) TYPE.get().getPropertyValue( this, "_AccountingSvcRs" );
  }


  public final void setAccountingSvcRs( java.util.List<xsd.acord.AccountingSvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_AccountingSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommonSvcRs> getCommonSvcRs() {
    return (java.util.List<xsd.acord.CommonSvcRs>) TYPE.get().getPropertyValue( this, "_CommonSvcRs" );
  }


  public final void setCommonSvcRs( java.util.List<xsd.acord.CommonSvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_CommonSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignoffRs getSignoffRs() {
    return (xsd.acord.SignoffRs) TYPE.get().getPropertyValue( this, "_SignoffRs" );
  }


  public final void setSignoffRs( xsd.acord.SignoffRs value ) {
    TYPE.get().setPropertyValue( this, "_SignoffRs", value );
  }

}

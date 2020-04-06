/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ACORD extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ACORD", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ACORD" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ACORD_Type" );
    }
  };

  public ACORD() {
    super( -1917326709, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ACORD_Type() );
  }

  public ACORD( xsd.acord.types.complex.ACORD_Type typeInstance ) {
    super( -1917326709, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ACORD( gw.internal.xml.XmlElementState state ) {
    super( -1917326709, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ACORD> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ACORD_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ACORD_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ACORD_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ACORD parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ACORD.class );
  }

  public static xsd.acord.ACORD parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ACORD.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonRq getSignonRq() {
    return (xsd.acord.SignonRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRq" );
  }


  public final void setSignonRq( xsd.acord.SignonRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSuppressNotificationInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuppressNotificationInd" );
  }


  public final void setSuppressNotificationInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuppressNotificationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SuppressNotificationInd getSuppressNotificationInd_elem() {
    return (xsd.acord.SuppressNotificationInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuppressNotificationInd_elem" );
  }


  public final void setSuppressNotificationInd_elem( xsd.acord.SuppressNotificationInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuppressNotificationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSendSPRequestsInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SendSPRequestsInd" );
  }


  public final void setSendSPRequestsInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SendSPRequestsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SendSPRequestsInd getSendSPRequestsInd_elem() {
    return (xsd.acord.SendSPRequestsInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SendSPRequestsInd_elem" );
  }


  public final void setSendSPRequestsInd_elem( xsd.acord.SendSPRequestsInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SendSPRequestsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BaseSvcRq getBaseSvcRq() {
    return (xsd.acord.BaseSvcRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BaseSvcRq" );
  }


  public final void setBaseSvcRq( xsd.acord.BaseSvcRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BaseSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExtensionsSvcRq getExtensionsSvcRq() {
    return (xsd.acord.ExtensionsSvcRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExtensionsSvcRq" );
  }


  public final void setExtensionsSvcRq( xsd.acord.ExtensionsSvcRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExtensionsSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuranceSvcRq> getInsuranceSvcRq() {
    return (java.util.List<xsd.acord.InsuranceSvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceSvcRq" );
  }


  public final void setInsuranceSvcRq( java.util.List<xsd.acord.InsuranceSvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretySvcRq> getSuretySvcRq() {
    return (java.util.List<xsd.acord.SuretySvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuretySvcRq" );
  }


  public final void setSuretySvcRq( java.util.List<xsd.acord.SuretySvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuretySvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSvcRq> getClaimsSvcRq() {
    return (java.util.List<xsd.acord.ClaimsSvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSvcRq" );
  }


  public final void setClaimsSvcRq( java.util.List<xsd.acord.ClaimsSvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountingSvcRq> getAccountingSvcRq() {
    return (java.util.List<xsd.acord.AccountingSvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountingSvcRq" );
  }


  public final void setAccountingSvcRq( java.util.List<xsd.acord.AccountingSvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountingSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommonSvcRq> getCommonSvcRq() {
    return (java.util.List<xsd.acord.CommonSvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommonSvcRq" );
  }


  public final void setCommonSvcRq( java.util.List<xsd.acord.CommonSvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommonSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignoffRq getSignoffRq() {
    return (xsd.acord.SignoffRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignoffRq" );
  }


  public final void setSignoffRq( xsd.acord.SignoffRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignoffRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Status getStatus() {
    return (xsd.acord.Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( xsd.acord.Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignonRs getSignonRs() {
    return (xsd.acord.SignonRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRs" );
  }


  public final void setSignonRs( xsd.acord.SignonRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PendingResponseInfo> getPendingResponseInfo() {
    return (java.util.List<xsd.acord.PendingResponseInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendingResponseInfo" );
  }


  public final void setPendingResponseInfo( java.util.List<xsd.acord.PendingResponseInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendingResponseInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MsgSetInfo> getMsgSetInfo() {
    return (java.util.List<xsd.acord.MsgSetInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgSetInfo" );
  }


  public final void setMsgSetInfo( java.util.List<xsd.acord.MsgSetInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgSetInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BaseSvcRs getBaseSvcRs() {
    return (xsd.acord.BaseSvcRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BaseSvcRs" );
  }


  public final void setBaseSvcRs( xsd.acord.BaseSvcRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BaseSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExtensionsSvcRs getExtensionsSvcRs() {
    return (xsd.acord.ExtensionsSvcRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExtensionsSvcRs" );
  }


  public final void setExtensionsSvcRs( xsd.acord.ExtensionsSvcRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExtensionsSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuranceSvcRs> getInsuranceSvcRs() {
    return (java.util.List<xsd.acord.InsuranceSvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceSvcRs" );
  }


  public final void setInsuranceSvcRs( java.util.List<xsd.acord.InsuranceSvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretySvcRs> getSuretySvcRs() {
    return (java.util.List<xsd.acord.SuretySvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuretySvcRs" );
  }


  public final void setSuretySvcRs( java.util.List<xsd.acord.SuretySvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuretySvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSvcRs> getClaimsSvcRs() {
    return (java.util.List<xsd.acord.ClaimsSvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSvcRs" );
  }


  public final void setClaimsSvcRs( java.util.List<xsd.acord.ClaimsSvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountingSvcRs> getAccountingSvcRs() {
    return (java.util.List<xsd.acord.AccountingSvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountingSvcRs" );
  }


  public final void setAccountingSvcRs( java.util.List<xsd.acord.AccountingSvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountingSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommonSvcRs> getCommonSvcRs() {
    return (java.util.List<xsd.acord.CommonSvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommonSvcRs" );
  }


  public final void setCommonSvcRs( java.util.List<xsd.acord.CommonSvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommonSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignoffRs getSignoffRs() {
    return (xsd.acord.SignoffRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignoffRs" );
  }


  public final void setSignoffRs( xsd.acord.SignoffRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignoffRs", value );
  }
}
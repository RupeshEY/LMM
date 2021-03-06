/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimsSvcRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsSvcRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPName = new javax.xml.namespace.QName( "", "SPName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSeqNumber = new javax.xml.namespace.QName( "", "MsgSeqNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsNotificationAddRs = new javax.xml.namespace.QName( "", "ClaimsNotificationAddRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusInqRs = new javax.xml.namespace.QName( "", "ClaimStatusInqRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossRunInqRs = new javax.xml.namespace.QName( "", "LossRunInqRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimInvestigationAddRs = new javax.xml.namespace.QName( "", "ClaimInvestigationAddRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSubsequentRptSubmitRs = new javax.xml.namespace.QName( "", "ClaimsSubsequentRptSubmitRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsFNOLDownloadRs = new javax.xml.namespace.QName( "", "ClaimsFNOLDownloadRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimDownloadRs = new javax.xml.namespace.QName( "", "ClaimDownloadRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimActivityNotifyRs = new javax.xml.namespace.QName( "", "ClaimActivityNotifyRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ClaimsSvcRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClaimsSvcRs_Type" );
    }
  };

  public ClaimsSvcRs() {
    super( -1591771818, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ClaimsSvcRs_Type() );
  }

  public ClaimsSvcRs( xsd.acord.types.complex.ClaimsSvcRs_Type typeInstance ) {
    super( -1591771818, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimsSvcRs( gw.internal.xml.XmlElementState state ) {
    super( -1591771818, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ClaimsSvcRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ClaimsSvcRs_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ClaimsSvcRs_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ClaimsSvcRs_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ClaimsSvcRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ClaimsSvcRs.class );
  }

  public static xsd.acord.ClaimsSvcRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ClaimsSvcRs.class );
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
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RqUID getRqUID_elem() {
    return (xsd.acord.RqUID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.acord.RqUID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName" );
  }


  public final void setSPName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPName getSPName_elem() {
    return (xsd.acord.SPName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName_elem" );
  }


  public final void setSPName_elem( xsd.acord.SPName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getMsgSeqNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgSeqNumber" );
  }


  public final void setMsgSeqNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgSeqNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgSeqNumber getMsgSeqNumber_elem() {
    return (xsd.acord.MsgSeqNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgSeqNumber_elem" );
  }


  public final void setMsgSeqNumber_elem( xsd.acord.MsgSeqNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgSeqNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsNotificationAddRs> getClaimsNotificationAddRs() {
    return (java.util.List<xsd.acord.ClaimsNotificationAddRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsNotificationAddRs" );
  }


  public final void setClaimsNotificationAddRs( java.util.List<xsd.acord.ClaimsNotificationAddRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsNotificationAddRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimStatusInqRs> getClaimStatusInqRs() {
    return (java.util.List<xsd.acord.ClaimStatusInqRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusInqRs" );
  }


  public final void setClaimStatusInqRs( java.util.List<xsd.acord.ClaimStatusInqRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusInqRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LossRunInqRs> getLossRunInqRs() {
    return (java.util.List<xsd.acord.LossRunInqRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossRunInqRs" );
  }


  public final void setLossRunInqRs( java.util.List<xsd.acord.LossRunInqRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossRunInqRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimInvestigationAddRs> getClaimInvestigationAddRs() {
    return (java.util.List<xsd.acord.ClaimInvestigationAddRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimInvestigationAddRs" );
  }


  public final void setClaimInvestigationAddRs( java.util.List<xsd.acord.ClaimInvestigationAddRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimInvestigationAddRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSubsequentRptSubmitRs> getClaimsSubsequentRptSubmitRs() {
    return (java.util.List<xsd.acord.ClaimsSubsequentRptSubmitRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSubsequentRptSubmitRs" );
  }


  public final void setClaimsSubsequentRptSubmitRs( java.util.List<xsd.acord.ClaimsSubsequentRptSubmitRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSubsequentRptSubmitRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsFNOLDownloadRs> getClaimsFNOLDownloadRs() {
    return (java.util.List<xsd.acord.ClaimsFNOLDownloadRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsFNOLDownloadRs" );
  }


  public final void setClaimsFNOLDownloadRs( java.util.List<xsd.acord.ClaimsFNOLDownloadRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsFNOLDownloadRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimDownloadRs> getClaimDownloadRs() {
    return (java.util.List<xsd.acord.ClaimDownloadRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimDownloadRs" );
  }


  public final void setClaimDownloadRs( java.util.List<xsd.acord.ClaimDownloadRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimDownloadRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimActivityNotifyRs> getClaimActivityNotifyRs() {
    return (java.util.List<xsd.acord.ClaimActivityNotifyRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimActivityNotifyRs" );
  }


  public final void setClaimActivityNotifyRs( java.util.List<xsd.acord.ClaimActivityNotifyRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimActivityNotifyRs", value );
  }

}

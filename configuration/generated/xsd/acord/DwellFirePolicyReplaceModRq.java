/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class DwellFirePolicyReplaceModRq extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DwellFirePolicyReplaceModRq", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionRequestDt = new javax.xml.namespace.QName( "", "TransactionRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionEffectiveDt = new javax.xml.namespace.QName( "", "TransactionEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CodeList = new javax.xml.namespace.QName( "", "CodeList", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConversionRate = new javax.xml.namespace.QName( "", "ConversionRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPXEditVersionApplied = new javax.xml.namespace.QName( "", "SPXEditVersionApplied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BroadLOBCd = new javax.xml.namespace.QName( "", "BroadLOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ACORDStandardVersionCd = new javax.xml.namespace.QName( "", "ACORDStandardVersionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendManualProcessingInd = new javax.xml.namespace.QName( "", "PendManualProcessingInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChangeStatus = new javax.xml.namespace.QName( "", "ChangeStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReplacementInfo = new javax.xml.namespace.QName( "", "ReplacementInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersPolicy = new javax.xml.namespace.QName( "", "PersPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DwellFireLineBusiness = new javax.xml.namespace.QName( "", "DwellFireLineBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemarkText = new javax.xml.namespace.QName( "", "RemarkText", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileAttachmentInfo = new javax.xml.namespace.QName( "", "FileAttachmentInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.DwellFirePolicyReplaceModRq" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type" );
    }
  };

  public DwellFirePolicyReplaceModRq() {
    super( 1945758099, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type() );
  }

  public DwellFirePolicyReplaceModRq( xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type typeInstance ) {
    super( 1945758099, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private DwellFirePolicyReplaceModRq( gw.internal.xml.XmlElementState state ) {
    super( 1945758099, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.DwellFirePolicyReplaceModRq> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.DwellFirePolicyReplaceModRq_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
  }

  public static xsd.acord.DwellFirePolicyReplaceModRq parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.DwellFirePolicyReplaceModRq.class );
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
  public final java.lang.String getTransactionRequestDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionRequestDt" );
  }


  public final void setTransactionRequestDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionRequestDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionRequestDt getTransactionRequestDt_elem() {
    return (xsd.acord.TransactionRequestDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionRequestDt_elem" );
  }


  public final void setTransactionRequestDt_elem( xsd.acord.TransactionRequestDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionEffectiveDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt" );
  }


  public final void setTransactionEffectiveDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionEffectiveDt getTransactionEffectiveDt_elem() {
    return (xsd.acord.TransactionEffectiveDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt_elem" );
  }


  public final void setTransactionEffectiveDt_elem( xsd.acord.TransactionEffectiveDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCurCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurCd" );
  }


  public final void setCurCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurCd getCurCd_elem() {
    return (xsd.acord.CurCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurCd_elem" );
  }


  public final void setCurCd_elem( xsd.acord.CurCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CodeList> getCodeList() {
    return (java.util.List<xsd.acord.CodeList>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CodeList" );
  }


  public final void setCodeList( java.util.List<xsd.acord.CodeList> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CodeList", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ConversionRate> getConversionRate() {
    return (java.util.List<xsd.acord.ConversionRate>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConversionRate" );
  }


  public final void setConversionRate( java.util.List<xsd.acord.ConversionRate> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConversionRate", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPXEditVersionApplied() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPXEditVersionApplied" );
  }


  public final void setSPXEditVersionApplied( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPXEditVersionApplied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPXEditVersionApplied getSPXEditVersionApplied_elem() {
    return (xsd.acord.SPXEditVersionApplied) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPXEditVersionApplied_elem" );
  }


  public final void setSPXEditVersionApplied_elem( xsd.acord.SPXEditVersionApplied value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPXEditVersionApplied_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BroadLineBusiness getBroadLOBCd() {
    return (xsd.acord.enums.BroadLineBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadLOBCd" );
  }


  public final void setBroadLOBCd( xsd.acord.enums.BroadLineBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadLOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BroadLOBCd getBroadLOBCd_elem() {
    return (xsd.acord.BroadLOBCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadLOBCd_elem" );
  }


  public final void setBroadLOBCd_elem( xsd.acord.BroadLOBCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadLOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ACORDStandardVersion getACORDStandardVersionCd() {
    return (xsd.acord.enums.ACORDStandardVersion) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ACORDStandardVersionCd" );
  }


  public final void setACORDStandardVersionCd( xsd.acord.enums.ACORDStandardVersion value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ACORDStandardVersionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ACORDStandardVersionCd getACORDStandardVersionCd_elem() {
    return (xsd.acord.ACORDStandardVersionCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ACORDStandardVersionCd_elem" );
  }


  public final void setACORDStandardVersionCd_elem( xsd.acord.ACORDStandardVersionCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ACORDStandardVersionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPendManualProcessingInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendManualProcessingInd" );
  }


  public final void setPendManualProcessingInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendManualProcessingInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PendManualProcessingInd getPendManualProcessingInd_elem() {
    return (xsd.acord.PendManualProcessingInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendManualProcessingInd_elem" );
  }


  public final void setPendManualProcessingInd_elem( xsd.acord.PendManualProcessingInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendManualProcessingInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ChangeStatus> getChangeStatus() {
    return (java.util.List<xsd.acord.ChangeStatus>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChangeStatus" );
  }


  public final void setChangeStatus( java.util.List<xsd.acord.ChangeStatus> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChangeStatus", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ReplacementInfo> getReplacementInfo() {
    return (java.util.List<xsd.acord.ReplacementInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReplacementInfo" );
  }


  public final void setReplacementInfo( java.util.List<xsd.acord.ReplacementInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReplacementInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Producer> getProducer() {
    return (java.util.List<xsd.acord.Producer>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Producer" );
  }


  public final void setProducer( java.util.List<xsd.acord.Producer> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Producer", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersPolicy getPersPolicy() {
    return (xsd.acord.PersPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersPolicy" );
  }


  public final void setPersPolicy( xsd.acord.PersPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Location> getLocation() {
    return (java.util.List<xsd.acord.Location>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Location" );
  }


  public final void setLocation( java.util.List<xsd.acord.Location> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Location", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DwellFireLineBusiness getDwellFireLineBusiness() {
    return (xsd.acord.DwellFireLineBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DwellFireLineBusiness" );
  }


  public final void setDwellFireLineBusiness( xsd.acord.DwellFireLineBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DwellFireLineBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getRemarkText() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemarkText" );
  }


  public final void setRemarkText( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemarkText", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.RemarkText> getRemarkText_elem() {
    return (java.util.List<xsd.acord.RemarkText>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemarkText_elem" );
  }


  public final void setRemarkText_elem( java.util.List<xsd.acord.RemarkText> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemarkText_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FileAttachmentInfo> getFileAttachmentInfo() {
    return (java.util.List<xsd.acord.FileAttachmentInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FileAttachmentInfo" );
  }


  public final void setFileAttachmentInfo( java.util.List<xsd.acord.FileAttachmentInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FileAttachmentInfo", value );
  }

}

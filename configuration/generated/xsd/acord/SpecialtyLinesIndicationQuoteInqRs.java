/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SpecialtyLinesIndicationQuoteInqRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SpecialtyLinesIndicationQuoteInqRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionResponseDt = new javax.xml.namespace.QName( "", "TransactionResponseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionEffectiveDt = new javax.xml.namespace.QName( "", "TransactionEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CodeList = new javax.xml.namespace.QName( "", "CodeList", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConversionRate = new javax.xml.namespace.QName( "", "ConversionRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgStatus = new javax.xml.namespace.QName( "", "MsgStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPXEditVersionApplied = new javax.xml.namespace.QName( "", "SPXEditVersionApplied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ACORDStandardVersionCd = new javax.xml.namespace.QName( "", "ACORDStandardVersionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerInterestedInd = new javax.xml.namespace.QName( "", "InsurerInterestedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RangeInfo = new javax.xml.namespace.QName( "", "RangeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlPolicy = new javax.xml.namespace.QName( "", "CommlPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialStatementInfo = new javax.xml.namespace.QName( "", "FinancialStatementInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemarkText = new javax.xml.namespace.QName( "", "RemarkText", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileAttachmentInfo = new javax.xml.namespace.QName( "", "FileAttachmentInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SpecialtyLinesIndicationQuoteInqRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type" );
    }
  };

  public SpecialtyLinesIndicationQuoteInqRs() {
    super( 818974562, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type() );
  }

  public SpecialtyLinesIndicationQuoteInqRs( xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type typeInstance ) {
    super( 818974562, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SpecialtyLinesIndicationQuoteInqRs( gw.internal.xml.XmlElementState state ) {
    super( 818974562, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SpecialtyLinesIndicationQuoteInqRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SpecialtyLinesIndicationQuoteInqRs_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
  }

  public static xsd.acord.SpecialtyLinesIndicationQuoteInqRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SpecialtyLinesIndicationQuoteInqRs.class );
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
  public final java.lang.String getTransactionResponseDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionResponseDt" );
  }


  public final void setTransactionResponseDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionResponseDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionResponseDt getTransactionResponseDt_elem() {
    return (xsd.acord.TransactionResponseDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionResponseDt_elem" );
  }


  public final void setTransactionResponseDt_elem( xsd.acord.TransactionResponseDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionResponseDt_elem", value );
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
  public final xsd.acord.MsgStatus getMsgStatus() {
    return (xsd.acord.MsgStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgStatus" );
  }


  public final void setMsgStatus( xsd.acord.MsgStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgStatus", value );
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
  public final java.lang.Boolean getInsurerInterestedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerInterestedInd" );
  }


  public final void setInsurerInterestedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerInterestedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsurerInterestedInd getInsurerInterestedInd_elem() {
    return (xsd.acord.InsurerInterestedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerInterestedInd_elem" );
  }


  public final void setInsurerInterestedInd_elem( xsd.acord.InsurerInterestedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerInterestedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RangeInfo getRangeInfo() {
    return (xsd.acord.RangeInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RangeInfo" );
  }


  public final void setRangeInfo( xsd.acord.RangeInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RangeInfo", value );
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
  public final xsd.acord.CommlPolicy getCommlPolicy() {
    return (xsd.acord.CommlPolicy) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlPolicy" );
  }


  public final void setCommlPolicy( xsd.acord.CommlPolicy value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FinancialStatementInfo getFinancialStatementInfo() {
    return (xsd.acord.FinancialStatementInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FinancialStatementInfo" );
  }


  public final void setFinancialStatementInfo( xsd.acord.FinancialStatementInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FinancialStatementInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.LineOfBusiness> getLOBCd() {
    return (java.util.List<xsd.acord.enums.LineOfBusiness>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd" );
  }


  public final void setLOBCd( java.util.List<xsd.acord.enums.LineOfBusiness> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LOBCd> getLOBCd_elem() {
    return (java.util.List<xsd.acord.LOBCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( java.util.List<xsd.acord.LOBCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd_elem", value );
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
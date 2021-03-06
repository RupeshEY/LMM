/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class WorkCompStatisticalLossInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompStatisticalLossInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsParty = new javax.xml.namespace.QName( "", "ClaimsParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingClassificationCd = new javax.xml.namespace.QName( "", "RatingClassificationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumClaims = new javax.xml.namespace.QName( "", "NumClaims", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusCd = new javax.xml.namespace.QName( "", "ClaimStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusDt = new javax.xml.namespace.QName( "", "ClaimStatusDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActualWeeklyAmt = new javax.xml.namespace.QName( "", "ActualWeeklyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SequenceNumber = new javax.xml.namespace.QName( "", "SequenceNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsFinancialSummary = new javax.xml.namespace.QName( "", "ClaimsFinancialSummary", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCondition = new javax.xml.namespace.QName( "", "LossCondition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JurisdictionCd = new javax.xml.namespace.QName( "", "JurisdictionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ManagedCareCd = new javax.xml.namespace.QName( "", "ManagedCareCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsInjury = new javax.xml.namespace.QName( "", "ClaimsInjury", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VocationalRehabInd = new javax.xml.namespace.QName( "", "VocationalRehabInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LumpSumInd = new javax.xml.namespace.QName( "", "LumpSumInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FraudulentClaimCd = new javax.xml.namespace.QName( "", "FraudulentClaimCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ICRInfo = new javax.xml.namespace.QName( "", "ICRInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.WorkCompStatisticalLossInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type" );
    }
  };

  public WorkCompStatisticalLossInfo() {
    super( -92946120, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type() );
  }

  public WorkCompStatisticalLossInfo( xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type typeInstance ) {
    super( -92946120, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private WorkCompStatisticalLossInfo( gw.internal.xml.XmlElementState state ) {
    super( -92946120, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.WorkCompStatisticalLossInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.WorkCompStatisticalLossInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }

  public static xsd.acord.WorkCompStatisticalLossInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.WorkCompStatisticalLossInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimsParty getClaimsParty() {
    return (xsd.acord.ClaimsParty) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsParty" );
  }


  public final void setClaimsParty( xsd.acord.ClaimsParty value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingClassificationCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RatingClassificationCd" );
  }


  public final void setRatingClassificationCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RatingClassificationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RatingClassificationCd getRatingClassificationCd_elem() {
    return (xsd.acord.RatingClassificationCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RatingClassificationCd_elem" );
  }


  public final void setRatingClassificationCd_elem( xsd.acord.RatingClassificationCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RatingClassificationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumClaims() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumClaims" );
  }


  public final void setNumClaims( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumClaims", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumClaims getNumClaims_elem() {
    return (xsd.acord.NumClaims) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumClaims_elem" );
  }


  public final void setNumClaims_elem( xsd.acord.NumClaims value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumClaims_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt" );
  }


  public final void setLossDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossDt getLossDt_elem() {
    return (xsd.acord.LossDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt_elem" );
  }


  public final void setLossDt_elem( xsd.acord.LossDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ClaimStatus getClaimStatusCd() {
    return (xsd.acord.enums.ClaimStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd" );
  }


  public final void setClaimStatusCd( xsd.acord.enums.ClaimStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimStatusCd getClaimStatusCd_elem() {
    return (xsd.acord.ClaimStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem" );
  }


  public final void setClaimStatusCd_elem( xsd.acord.ClaimStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimStatusDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusDt" );
  }


  public final void setClaimStatusDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimStatusDt getClaimStatusDt_elem() {
    return (xsd.acord.ClaimStatusDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusDt_elem" );
  }


  public final void setClaimStatusDt_elem( xsd.acord.ClaimStatusDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ActualWeeklyAmt getActualWeeklyAmt() {
    return (xsd.acord.ActualWeeklyAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActualWeeklyAmt" );
  }


  public final void setActualWeeklyAmt( xsd.acord.ActualWeeklyAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActualWeeklyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getSequenceNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SequenceNumber" );
  }


  public final void setSequenceNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SequenceNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SequenceNumber getSequenceNumber_elem() {
    return (xsd.acord.SequenceNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SequenceNumber_elem" );
  }


  public final void setSequenceNumber_elem( xsd.acord.SequenceNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SequenceNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsFinancialSummary> getClaimsFinancialSummary() {
    return (java.util.List<xsd.acord.ClaimsFinancialSummary>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsFinancialSummary" );
  }


  public final void setClaimsFinancialSummary( java.util.List<xsd.acord.ClaimsFinancialSummary> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsFinancialSummary", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossCondition getLossCondition() {
    return (xsd.acord.LossCondition) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossCondition" );
  }


  public final void setLossCondition( xsd.acord.LossCondition value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossCondition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJurisdictionCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JurisdictionCd" );
  }


  public final void setJurisdictionCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JurisdictionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JurisdictionCd getJurisdictionCd_elem() {
    return (xsd.acord.JurisdictionCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JurisdictionCd_elem" );
  }


  public final void setJurisdictionCd_elem( xsd.acord.JurisdictionCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JurisdictionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getManagedCareCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManagedCareCd" );
  }


  public final void setManagedCareCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManagedCareCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ManagedCareCd getManagedCareCd_elem() {
    return (xsd.acord.ManagedCareCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ManagedCareCd_elem" );
  }


  public final void setManagedCareCd_elem( xsd.acord.ManagedCareCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ManagedCareCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimsInjury getClaimsInjury() {
    return (xsd.acord.ClaimsInjury) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsInjury" );
  }


  public final void setClaimsInjury( xsd.acord.ClaimsInjury value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsInjury", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getVocationalRehabInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VocationalRehabInd" );
  }


  public final void setVocationalRehabInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VocationalRehabInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VocationalRehabInd getVocationalRehabInd_elem() {
    return (xsd.acord.VocationalRehabInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VocationalRehabInd_elem" );
  }


  public final void setVocationalRehabInd_elem( xsd.acord.VocationalRehabInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VocationalRehabInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLumpSumInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LumpSumInd" );
  }


  public final void setLumpSumInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LumpSumInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LumpSumInd getLumpSumInd_elem() {
    return (xsd.acord.LumpSumInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LumpSumInd_elem" );
  }


  public final void setLumpSumInd_elem( xsd.acord.LumpSumInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LumpSumInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFraudulentClaimCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FraudulentClaimCd" );
  }


  public final void setFraudulentClaimCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FraudulentClaimCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FraudulentClaimCd getFraudulentClaimCd_elem() {
    return (xsd.acord.FraudulentClaimCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FraudulentClaimCd_elem" );
  }


  public final void setFraudulentClaimCd_elem( xsd.acord.FraudulentClaimCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FraudulentClaimCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ICRInfo getICRInfo() {
    return (xsd.acord.ICRInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ICRInfo" );
  }


  public final void setICRInfo( xsd.acord.ICRInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ICRInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}

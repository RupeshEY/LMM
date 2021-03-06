/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class WorkCompRateState extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompRateState", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnniversaryRatingDt = new javax.xml.namespace.QName( "", "AnniversaryRatingDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepositAmt = new javax.xml.namespace.QName( "", "DepositAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RequiredDepositAmt = new javax.xml.namespace.QName( "", "RequiredDepositAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NCCIIDNumber = new javax.xml.namespace.QName( "", "NCCIIDNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParticipatingPlanInd = new javax.xml.namespace.QName( "", "ParticipatingPlanInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParticipatingPlanDescCd = new javax.xml.namespace.QName( "", "ParticipatingPlanDescCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RetrospectiveRatingPlanCd = new javax.xml.namespace.QName( "", "RetrospectiveRatingPlanCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeRetroRatingPlan = new javax.xml.namespace.QName( "", "LengthTimeRetroRatingPlan", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SafetyGroupInd = new javax.xml.namespace.QName( "", "SafetyGroupInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompLocInfo = new javax.xml.namespace.QName( "", "WorkCompLocInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPayrollAmt = new javax.xml.namespace.QName( "", "TotalPayrollAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GoverningClassCd = new javax.xml.namespace.QName( "", "GoverningClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskId = new javax.xml.namespace.QName( "", "RiskId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StatReportInfo = new javax.xml.namespace.QName( "", "StatReportInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompStatisticalLossInfo = new javax.xml.namespace.QName( "", "WorkCompStatisticalLossInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompStateStatSummary = new javax.xml.namespace.QName( "", "WorkCompStateStatSummary", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalEstimatedAnnualPremiumAmt = new javax.xml.namespace.QName( "", "TotalEstimatedAnnualPremiumAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremAmt = new javax.xml.namespace.QName( "", "MinPremAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.WorkCompRateState" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompRateState_Type" );
    }
  };

  public WorkCompRateState() {
    super( 878172861, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.WorkCompRateState_Type() );
  }

  public WorkCompRateState( xsd.acord.types.complex.WorkCompRateState_Type typeInstance ) {
    super( 878172861, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private WorkCompRateState( gw.internal.xml.XmlElementState state ) {
    super( 878172861, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.WorkCompRateState> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.WorkCompRateState_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.WorkCompRateState_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.WorkCompRateState_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.WorkCompRateState parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.WorkCompRateState.class );
  }

  public static xsd.acord.WorkCompRateState parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.WorkCompRateState.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICCd" );
  }


  public final void setNAICCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICCd getNAICCd_elem() {
    return (xsd.acord.NAICCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICCd_elem" );
  }


  public final void setNAICCd_elem( xsd.acord.NAICCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAnniversaryRatingDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnniversaryRatingDt" );
  }


  public final void setAnniversaryRatingDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnniversaryRatingDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnniversaryRatingDt getAnniversaryRatingDt_elem() {
    return (xsd.acord.AnniversaryRatingDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnniversaryRatingDt_elem" );
  }


  public final void setAnniversaryRatingDt_elem( xsd.acord.AnniversaryRatingDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnniversaryRatingDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DepositAmt getDepositAmt() {
    return (xsd.acord.DepositAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DepositAmt" );
  }


  public final void setDepositAmt( xsd.acord.DepositAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DepositAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RequiredDepositAmt getRequiredDepositAmt() {
    return (xsd.acord.RequiredDepositAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RequiredDepositAmt" );
  }


  public final void setRequiredDepositAmt( xsd.acord.RequiredDepositAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RequiredDepositAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNCCIIDNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NCCIIDNumber" );
  }


  public final void setNCCIIDNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NCCIIDNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NCCIIDNumber getNCCIIDNumber_elem() {
    return (xsd.acord.NCCIIDNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NCCIIDNumber_elem" );
  }


  public final void setNCCIIDNumber_elem( xsd.acord.NCCIIDNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NCCIIDNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getParticipatingPlanInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParticipatingPlanInd" );
  }


  public final void setParticipatingPlanInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParticipatingPlanInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ParticipatingPlanInd getParticipatingPlanInd_elem() {
    return (xsd.acord.ParticipatingPlanInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParticipatingPlanInd_elem" );
  }


  public final void setParticipatingPlanInd_elem( xsd.acord.ParticipatingPlanInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParticipatingPlanInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getParticipatingPlanDescCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParticipatingPlanDescCd" );
  }


  public final void setParticipatingPlanDescCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParticipatingPlanDescCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ParticipatingPlanDescCd getParticipatingPlanDescCd_elem() {
    return (xsd.acord.ParticipatingPlanDescCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParticipatingPlanDescCd_elem" );
  }


  public final void setParticipatingPlanDescCd_elem( xsd.acord.ParticipatingPlanDescCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParticipatingPlanDescCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRetrospectiveRatingPlanCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RetrospectiveRatingPlanCd" );
  }


  public final void setRetrospectiveRatingPlanCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RetrospectiveRatingPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RetrospectiveRatingPlanCd getRetrospectiveRatingPlanCd_elem() {
    return (xsd.acord.RetrospectiveRatingPlanCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RetrospectiveRatingPlanCd_elem" );
  }


  public final void setRetrospectiveRatingPlanCd_elem( xsd.acord.RetrospectiveRatingPlanCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RetrospectiveRatingPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeRetroRatingPlan getLengthTimeRetroRatingPlan() {
    return (xsd.acord.LengthTimeRetroRatingPlan) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LengthTimeRetroRatingPlan" );
  }


  public final void setLengthTimeRetroRatingPlan( xsd.acord.LengthTimeRetroRatingPlan value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LengthTimeRetroRatingPlan", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSafetyGroupInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafetyGroupInd" );
  }


  public final void setSafetyGroupInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafetyGroupInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SafetyGroupInd getSafetyGroupInd_elem() {
    return (xsd.acord.SafetyGroupInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafetyGroupInd_elem" );
  }


  public final void setSafetyGroupInd_elem( xsd.acord.SafetyGroupInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafetyGroupInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompLocInfo> getWorkCompLocInfo() {
    return (java.util.List<xsd.acord.WorkCompLocInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkCompLocInfo" );
  }


  public final void setWorkCompLocInfo( java.util.List<xsd.acord.WorkCompLocInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkCompLocInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPayrollAmt getTotalPayrollAmt() {
    return (xsd.acord.TotalPayrollAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalPayrollAmt" );
  }


  public final void setTotalPayrollAmt( xsd.acord.TotalPayrollAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalPayrollAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGoverningClassCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GoverningClassCd" );
  }


  public final void setGoverningClassCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GoverningClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GoverningClassCd getGoverningClassCd_elem() {
    return (xsd.acord.GoverningClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GoverningClassCd_elem" );
  }


  public final void setGoverningClassCd_elem( xsd.acord.GoverningClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GoverningClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRiskId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RiskId" );
  }


  public final void setRiskId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RiskId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiskId getRiskId_elem() {
    return (xsd.acord.RiskId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RiskId_elem" );
  }


  public final void setRiskId_elem( xsd.acord.RiskId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RiskId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StatReportInfo getStatReportInfo() {
    return (xsd.acord.StatReportInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StatReportInfo" );
  }


  public final void setStatReportInfo( xsd.acord.StatReportInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StatReportInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompStatisticalLossInfo> getWorkCompStatisticalLossInfo() {
    return (java.util.List<xsd.acord.WorkCompStatisticalLossInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkCompStatisticalLossInfo" );
  }


  public final void setWorkCompStatisticalLossInfo( java.util.List<xsd.acord.WorkCompStatisticalLossInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkCompStatisticalLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkCompStateStatSummary getWorkCompStateStatSummary() {
    return (xsd.acord.WorkCompStateStatSummary) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkCompStateStatSummary" );
  }


  public final void setWorkCompStateStatSummary( xsd.acord.WorkCompStateStatSummary value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkCompStateStatSummary", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalEstimatedAnnualPremiumAmt getTotalEstimatedAnnualPremiumAmt() {
    return (xsd.acord.TotalEstimatedAnnualPremiumAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalEstimatedAnnualPremiumAmt" );
  }


  public final void setTotalEstimatedAnnualPremiumAmt( xsd.acord.TotalEstimatedAnnualPremiumAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalEstimatedAnnualPremiumAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinPremAmt getMinPremAmt() {
    return (xsd.acord.MinPremAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinPremAmt" );
  }


  public final void setMinPremAmt( xsd.acord.MinPremAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinPremAmt", value );
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

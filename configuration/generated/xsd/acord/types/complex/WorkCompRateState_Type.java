/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompRateState_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompRateState_Type", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompRateState_Type" );
    }
  };

  public WorkCompRateState_Type() {
    super( -134864977, TYPE.get() );
  }

  private WorkCompRateState_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -134864977, state );
  }

  protected WorkCompRateState_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompRateState_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompRateState_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompRateState_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NAICCd" );
  }


  public final void setNAICCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NAICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICCd getNAICCd_elem() {
    return (xsd.acord.NAICCd) TYPE.get().getPropertyValue( this, "_NAICCd_elem" );
  }


  public final void setNAICCd_elem( xsd.acord.NAICCd value ) {
    TYPE.get().setPropertyValue( this, "_NAICCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAnniversaryRatingDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AnniversaryRatingDt" );
  }


  public final void setAnniversaryRatingDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AnniversaryRatingDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnniversaryRatingDt getAnniversaryRatingDt_elem() {
    return (xsd.acord.AnniversaryRatingDt) TYPE.get().getPropertyValue( this, "_AnniversaryRatingDt_elem" );
  }


  public final void setAnniversaryRatingDt_elem( xsd.acord.AnniversaryRatingDt value ) {
    TYPE.get().setPropertyValue( this, "_AnniversaryRatingDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DepositAmt getDepositAmt() {
    return (xsd.acord.DepositAmt) TYPE.get().getPropertyValue( this, "_DepositAmt" );
  }


  public final void setDepositAmt( xsd.acord.DepositAmt value ) {
    TYPE.get().setPropertyValue( this, "_DepositAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RequiredDepositAmt getRequiredDepositAmt() {
    return (xsd.acord.RequiredDepositAmt) TYPE.get().getPropertyValue( this, "_RequiredDepositAmt" );
  }


  public final void setRequiredDepositAmt( xsd.acord.RequiredDepositAmt value ) {
    TYPE.get().setPropertyValue( this, "_RequiredDepositAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNCCIIDNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NCCIIDNumber" );
  }


  public final void setNCCIIDNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NCCIIDNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NCCIIDNumber getNCCIIDNumber_elem() {
    return (xsd.acord.NCCIIDNumber) TYPE.get().getPropertyValue( this, "_NCCIIDNumber_elem" );
  }


  public final void setNCCIIDNumber_elem( xsd.acord.NCCIIDNumber value ) {
    TYPE.get().setPropertyValue( this, "_NCCIIDNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getParticipatingPlanInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ParticipatingPlanInd" );
  }


  public final void setParticipatingPlanInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ParticipatingPlanInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ParticipatingPlanInd getParticipatingPlanInd_elem() {
    return (xsd.acord.ParticipatingPlanInd) TYPE.get().getPropertyValue( this, "_ParticipatingPlanInd_elem" );
  }


  public final void setParticipatingPlanInd_elem( xsd.acord.ParticipatingPlanInd value ) {
    TYPE.get().setPropertyValue( this, "_ParticipatingPlanInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getParticipatingPlanDescCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ParticipatingPlanDescCd" );
  }


  public final void setParticipatingPlanDescCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ParticipatingPlanDescCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ParticipatingPlanDescCd getParticipatingPlanDescCd_elem() {
    return (xsd.acord.ParticipatingPlanDescCd) TYPE.get().getPropertyValue( this, "_ParticipatingPlanDescCd_elem" );
  }


  public final void setParticipatingPlanDescCd_elem( xsd.acord.ParticipatingPlanDescCd value ) {
    TYPE.get().setPropertyValue( this, "_ParticipatingPlanDescCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRetrospectiveRatingPlanCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RetrospectiveRatingPlanCd" );
  }


  public final void setRetrospectiveRatingPlanCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RetrospectiveRatingPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RetrospectiveRatingPlanCd getRetrospectiveRatingPlanCd_elem() {
    return (xsd.acord.RetrospectiveRatingPlanCd) TYPE.get().getPropertyValue( this, "_RetrospectiveRatingPlanCd_elem" );
  }


  public final void setRetrospectiveRatingPlanCd_elem( xsd.acord.RetrospectiveRatingPlanCd value ) {
    TYPE.get().setPropertyValue( this, "_RetrospectiveRatingPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeRetroRatingPlan getLengthTimeRetroRatingPlan() {
    return (xsd.acord.LengthTimeRetroRatingPlan) TYPE.get().getPropertyValue( this, "_LengthTimeRetroRatingPlan" );
  }


  public final void setLengthTimeRetroRatingPlan( xsd.acord.LengthTimeRetroRatingPlan value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeRetroRatingPlan", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSafetyGroupInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SafetyGroupInd" );
  }


  public final void setSafetyGroupInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SafetyGroupInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SafetyGroupInd getSafetyGroupInd_elem() {
    return (xsd.acord.SafetyGroupInd) TYPE.get().getPropertyValue( this, "_SafetyGroupInd_elem" );
  }


  public final void setSafetyGroupInd_elem( xsd.acord.SafetyGroupInd value ) {
    TYPE.get().setPropertyValue( this, "_SafetyGroupInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPE.get().getPropertyValue( this, "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPE.get().setPropertyValue( this, "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompLocInfo> getWorkCompLocInfo() {
    return (java.util.List<xsd.acord.WorkCompLocInfo>) TYPE.get().getPropertyValue( this, "_WorkCompLocInfo" );
  }


  public final void setWorkCompLocInfo( java.util.List<xsd.acord.WorkCompLocInfo> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompLocInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPayrollAmt getTotalPayrollAmt() {
    return (xsd.acord.TotalPayrollAmt) TYPE.get().getPropertyValue( this, "_TotalPayrollAmt" );
  }


  public final void setTotalPayrollAmt( xsd.acord.TotalPayrollAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalPayrollAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGoverningClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GoverningClassCd" );
  }


  public final void setGoverningClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GoverningClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GoverningClassCd getGoverningClassCd_elem() {
    return (xsd.acord.GoverningClassCd) TYPE.get().getPropertyValue( this, "_GoverningClassCd_elem" );
  }


  public final void setGoverningClassCd_elem( xsd.acord.GoverningClassCd value ) {
    TYPE.get().setPropertyValue( this, "_GoverningClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRiskId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RiskId" );
  }


  public final void setRiskId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RiskId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiskId getRiskId_elem() {
    return (xsd.acord.RiskId) TYPE.get().getPropertyValue( this, "_RiskId_elem" );
  }


  public final void setRiskId_elem( xsd.acord.RiskId value ) {
    TYPE.get().setPropertyValue( this, "_RiskId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StatReportInfo getStatReportInfo() {
    return (xsd.acord.StatReportInfo) TYPE.get().getPropertyValue( this, "_StatReportInfo" );
  }


  public final void setStatReportInfo( xsd.acord.StatReportInfo value ) {
    TYPE.get().setPropertyValue( this, "_StatReportInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompStatisticalLossInfo> getWorkCompStatisticalLossInfo() {
    return (java.util.List<xsd.acord.WorkCompStatisticalLossInfo>) TYPE.get().getPropertyValue( this, "_WorkCompStatisticalLossInfo" );
  }


  public final void setWorkCompStatisticalLossInfo( java.util.List<xsd.acord.WorkCompStatisticalLossInfo> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompStatisticalLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkCompStateStatSummary getWorkCompStateStatSummary() {
    return (xsd.acord.WorkCompStateStatSummary) TYPE.get().getPropertyValue( this, "_WorkCompStateStatSummary" );
  }


  public final void setWorkCompStateStatSummary( xsd.acord.WorkCompStateStatSummary value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompStateStatSummary", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalEstimatedAnnualPremiumAmt getTotalEstimatedAnnualPremiumAmt() {
    return (xsd.acord.TotalEstimatedAnnualPremiumAmt) TYPE.get().getPropertyValue( this, "_TotalEstimatedAnnualPremiumAmt" );
  }


  public final void setTotalEstimatedAnnualPremiumAmt( xsd.acord.TotalEstimatedAnnualPremiumAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalEstimatedAnnualPremiumAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinPremAmt getMinPremAmt() {
    return (xsd.acord.MinPremAmt) TYPE.get().getPropertyValue( this, "_MinPremAmt" );
  }


  public final void setMinPremAmt( xsd.acord.MinPremAmt value ) {
    TYPE.get().setPropertyValue( this, "_MinPremAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class OtherOrPriorPolicy_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "OtherOrPriorPolicy_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyCd = new javax.xml.namespace.QName( "", "PolicyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTypeCd = new javax.xml.namespace.QName( "", "PolicyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NameInfo = new javax.xml.namespace.QName( "", "NameInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerName = new javax.xml.namespace.QName( "", "InsurerName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractTerm = new javax.xml.namespace.QName( "", "ContractTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalInceptionDt = new javax.xml.namespace.QName( "", "OriginalInceptionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentRetroactiveDt = new javax.xml.namespace.QName( "", "CurrentRetroactiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTerminatedCd = new javax.xml.namespace.QName( "", "PolicyTerminatedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTerminatedReasonDesc = new javax.xml.namespace.QName( "", "PolicyTerminatedReasonDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTransferInd = new javax.xml.namespace.QName( "", "PolicyTransferInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeWithPreviousInsurer = new javax.xml.namespace.QName( "", "LengthTimeWithPreviousInsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyAmt = new javax.xml.namespace.QName( "", "PolicyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinimumEarnedPremiumAmt = new javax.xml.namespace.QName( "", "MinimumEarnedPremiumAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinimumEarnedPct = new javax.xml.namespace.QName( "", "MinimumEarnedPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingFactor = new javax.xml.namespace.QName( "", "RatingFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyProductCd = new javax.xml.namespace.QName( "", "CompanyProductCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConvictionDt = new javax.xml.namespace.QName( "", "ConvictionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PriorInsurerReportDt = new javax.xml.namespace.QName( "", "PriorInsurerReportDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReasonForTransferCd = new javax.xml.namespace.QName( "", "ReasonForTransferCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodWindPolicyInfo = new javax.xml.namespace.QName( "", "FloodWindPolicyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsMadeInfo = new javax.xml.namespace.QName( "", "ClaimsMadeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExperienceModInd = new javax.xml.namespace.QName( "", "ExperienceModInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimHistoryReportStatusCd = new javax.xml.namespace.QName( "", "ClaimHistoryReportStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstDollarDefenseInd = new javax.xml.namespace.QName( "", "FirstDollarDefenseInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLosses = new javax.xml.namespace.QName( "", "NumLosses", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossesDesc = new javax.xml.namespace.QName( "", "LossesDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPaidLossesAmt = new javax.xml.namespace.QName( "", "TotalPaidLossesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReserveTotalAmt = new javax.xml.namespace.QName( "", "ReserveTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancelDeclineDt = new javax.xml.namespace.QName( "", "CancelDeclineDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DriverRef = new javax.xml.namespace.QName( "", "DriverRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DriverNameRef = new javax.xml.namespace.QName( "", "DriverNameRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InsuredNameRef = new javax.xml.namespace.QName( "", "InsuredNameRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.OtherOrPriorPolicy_Type" );
    }
  };

  public OtherOrPriorPolicy_Type() {
    super( 676241065, TYPE.get() );
  }

  private OtherOrPriorPolicy_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 676241065, state );
  }

  protected OtherOrPriorPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected OtherOrPriorPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.OtherOrPriorPolicy_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.OtherOrPriorPolicy_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.OtherPolicyType getPolicyCd() {
    return (xsd.acord.enums.OtherPolicyType) TYPE.get().getPropertyValue( this, "_PolicyCd" );
  }


  public final void setPolicyCd( xsd.acord.enums.OtherPolicyType value ) {
    TYPE.get().setPropertyValue( this, "_PolicyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyCd getPolicyCd_elem() {
    return (xsd.acord.PolicyCd) TYPE.get().getPropertyValue( this, "_PolicyCd_elem" );
  }


  public final void setPolicyCd_elem( xsd.acord.PolicyCd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PolicyType getPolicyTypeCd() {
    return (xsd.acord.enums.PolicyType) TYPE.get().getPropertyValue( this, "_PolicyTypeCd" );
  }


  public final void setPolicyTypeCd( xsd.acord.enums.PolicyType value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyTypeCd getPolicyTypeCd_elem() {
    return (xsd.acord.PolicyTypeCd) TYPE.get().getPropertyValue( this, "_PolicyTypeCd_elem" );
  }


  public final void setPolicyTypeCd_elem( xsd.acord.PolicyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NameInfo getNameInfo() {
    return (xsd.acord.NameInfo) TYPE.get().getPropertyValue( this, "_NameInfo" );
  }


  public final void setNameInfo( xsd.acord.NameInfo value ) {
    TYPE.get().setPropertyValue( this, "_NameInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyNumber getPolicyNumber_elem() {
    return (xsd.acord.PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.acord.PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusiness getLOBCd() {
    return (xsd.acord.enums.LineOfBusiness) TYPE.get().getPropertyValue( this, "_LOBCd" );
  }


  public final void setLOBCd( xsd.acord.enums.LineOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBCd getLOBCd_elem() {
    return (xsd.acord.LOBCd) TYPE.get().getPropertyValue( this, "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.acord.LOBCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusinessSubCode getLOBSubCd() {
    return (xsd.acord.enums.LineOfBusinessSubCode) TYPE.get().getPropertyValue( this, "_LOBSubCd" );
  }


  public final void setLOBSubCd( xsd.acord.enums.LineOfBusinessSubCode value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBSubCd getLOBSubCd_elem() {
    return (xsd.acord.LOBSubCd) TYPE.get().getPropertyValue( this, "_LOBSubCd_elem" );
  }


  public final void setLOBSubCd_elem( xsd.acord.LOBSubCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd_elem", value );
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
  public final java.lang.String getInsurerName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerName" );
  }


  public final void setInsurerName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsurerName getInsurerName_elem() {
    return (xsd.acord.InsurerName) TYPE.get().getPropertyValue( this, "_InsurerName_elem" );
  }


  public final void setInsurerName_elem( xsd.acord.InsurerName value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractTerm getContractTerm() {
    return (xsd.acord.ContractTerm) TYPE.get().getPropertyValue( this, "_ContractTerm" );
  }


  public final void setContractTerm( xsd.acord.ContractTerm value ) {
    TYPE.get().setPropertyValue( this, "_ContractTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOriginalInceptionDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OriginalInceptionDt" );
  }


  public final void setOriginalInceptionDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OriginalInceptionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OriginalInceptionDt getOriginalInceptionDt_elem() {
    return (xsd.acord.OriginalInceptionDt) TYPE.get().getPropertyValue( this, "_OriginalInceptionDt_elem" );
  }


  public final void setOriginalInceptionDt_elem( xsd.acord.OriginalInceptionDt value ) {
    TYPE.get().setPropertyValue( this, "_OriginalInceptionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCurrentRetroactiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CurrentRetroactiveDt" );
  }


  public final void setCurrentRetroactiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CurrentRetroactiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurrentRetroactiveDt getCurrentRetroactiveDt_elem() {
    return (xsd.acord.CurrentRetroactiveDt) TYPE.get().getPropertyValue( this, "_CurrentRetroactiveDt_elem" );
  }


  public final void setCurrentRetroactiveDt_elem( xsd.acord.CurrentRetroactiveDt value ) {
    TYPE.get().setPropertyValue( this, "_CurrentRetroactiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReasonTerminated getPolicyTerminatedCd() {
    return (xsd.acord.enums.ReasonTerminated) TYPE.get().getPropertyValue( this, "_PolicyTerminatedCd" );
  }


  public final void setPolicyTerminatedCd( xsd.acord.enums.ReasonTerminated value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyTerminatedCd getPolicyTerminatedCd_elem() {
    return (xsd.acord.PolicyTerminatedCd) TYPE.get().getPropertyValue( this, "_PolicyTerminatedCd_elem" );
  }


  public final void setPolicyTerminatedCd_elem( xsd.acord.PolicyTerminatedCd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyTerminatedReasonDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyTerminatedReasonDesc" );
  }


  public final void setPolicyTerminatedReasonDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedReasonDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyTerminatedReasonDesc getPolicyTerminatedReasonDesc_elem() {
    return (xsd.acord.PolicyTerminatedReasonDesc) TYPE.get().getPropertyValue( this, "_PolicyTerminatedReasonDesc_elem" );
  }


  public final void setPolicyTerminatedReasonDesc_elem( xsd.acord.PolicyTerminatedReasonDesc value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedReasonDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPolicyTransferInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PolicyTransferInd" );
  }


  public final void setPolicyTransferInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTransferInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyTransferInd getPolicyTransferInd_elem() {
    return (xsd.acord.PolicyTransferInd) TYPE.get().getPropertyValue( this, "_PolicyTransferInd_elem" );
  }


  public final void setPolicyTransferInd_elem( xsd.acord.PolicyTransferInd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTransferInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeWithPreviousInsurer getLengthTimeWithPreviousInsurer() {
    return (xsd.acord.LengthTimeWithPreviousInsurer) TYPE.get().getPropertyValue( this, "_LengthTimeWithPreviousInsurer" );
  }


  public final void setLengthTimeWithPreviousInsurer( xsd.acord.LengthTimeWithPreviousInsurer value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeWithPreviousInsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyAmt getPolicyAmt() {
    return (xsd.acord.PolicyAmt) TYPE.get().getPropertyValue( this, "_PolicyAmt" );
  }


  public final void setPolicyAmt( xsd.acord.PolicyAmt value ) {
    TYPE.get().setPropertyValue( this, "_PolicyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinimumEarnedPremiumAmt getMinimumEarnedPremiumAmt() {
    return (xsd.acord.MinimumEarnedPremiumAmt) TYPE.get().getPropertyValue( this, "_MinimumEarnedPremiumAmt" );
  }


  public final void setMinimumEarnedPremiumAmt( xsd.acord.MinimumEarnedPremiumAmt value ) {
    TYPE.get().setPropertyValue( this, "_MinimumEarnedPremiumAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getMinimumEarnedPct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_MinimumEarnedPct" );
  }


  public final void setMinimumEarnedPct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_MinimumEarnedPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinimumEarnedPct getMinimumEarnedPct_elem() {
    return (xsd.acord.MinimumEarnedPct) TYPE.get().getPropertyValue( this, "_MinimumEarnedPct_elem" );
  }


  public final void setMinimumEarnedPct_elem( xsd.acord.MinimumEarnedPct value ) {
    TYPE.get().setPropertyValue( this, "_MinimumEarnedPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getRatingFactor() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_RatingFactor" );
  }


  public final void setRatingFactor( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_RatingFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RatingFactor getRatingFactor_elem() {
    return (xsd.acord.RatingFactor) TYPE.get().getPropertyValue( this, "_RatingFactor_elem" );
  }


  public final void setRatingFactor_elem( xsd.acord.RatingFactor value ) {
    TYPE.get().setPropertyValue( this, "_RatingFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanyProductCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CompanyProductCd" );
  }


  public final void setCompanyProductCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CompanyProductCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CompanyProductCd getCompanyProductCd_elem() {
    return (xsd.acord.CompanyProductCd) TYPE.get().getPropertyValue( this, "_CompanyProductCd_elem" );
  }


  public final void setCompanyProductCd_elem( xsd.acord.CompanyProductCd value ) {
    TYPE.get().setPropertyValue( this, "_CompanyProductCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConvictionDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ConvictionDt" );
  }


  public final void setConvictionDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ConvictionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConvictionDt getConvictionDt_elem() {
    return (xsd.acord.ConvictionDt) TYPE.get().getPropertyValue( this, "_ConvictionDt_elem" );
  }


  public final void setConvictionDt_elem( xsd.acord.ConvictionDt value ) {
    TYPE.get().setPropertyValue( this, "_ConvictionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPriorInsurerReportDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PriorInsurerReportDt" );
  }


  public final void setPriorInsurerReportDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PriorInsurerReportDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PriorInsurerReportDt getPriorInsurerReportDt_elem() {
    return (xsd.acord.PriorInsurerReportDt) TYPE.get().getPropertyValue( this, "_PriorInsurerReportDt_elem" );
  }


  public final void setPriorInsurerReportDt_elem( xsd.acord.PriorInsurerReportDt value ) {
    TYPE.get().setPropertyValue( this, "_PriorInsurerReportDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReasonForTransfer getReasonForTransferCd() {
    return (xsd.acord.enums.ReasonForTransfer) TYPE.get().getPropertyValue( this, "_ReasonForTransferCd" );
  }


  public final void setReasonForTransferCd( xsd.acord.enums.ReasonForTransfer value ) {
    TYPE.get().setPropertyValue( this, "_ReasonForTransferCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReasonForTransferCd getReasonForTransferCd_elem() {
    return (xsd.acord.ReasonForTransferCd) TYPE.get().getPropertyValue( this, "_ReasonForTransferCd_elem" );
  }


  public final void setReasonForTransferCd_elem( xsd.acord.ReasonForTransferCd value ) {
    TYPE.get().setPropertyValue( this, "_ReasonForTransferCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodWindPolicyInfo getFloodWindPolicyInfo() {
    return (xsd.acord.FloodWindPolicyInfo) TYPE.get().getPropertyValue( this, "_FloodWindPolicyInfo" );
  }


  public final void setFloodWindPolicyInfo( xsd.acord.FloodWindPolicyInfo value ) {
    TYPE.get().setPropertyValue( this, "_FloodWindPolicyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimsMadeInfo getClaimsMadeInfo() {
    return (xsd.acord.ClaimsMadeInfo) TYPE.get().getPropertyValue( this, "_ClaimsMadeInfo" );
  }


  public final void setClaimsMadeInfo( xsd.acord.ClaimsMadeInfo value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsMadeInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExperienceModInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ExperienceModInd" );
  }


  public final void setExperienceModInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ExperienceModInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExperienceModInd getExperienceModInd_elem() {
    return (xsd.acord.ExperienceModInd) TYPE.get().getPropertyValue( this, "_ExperienceModInd_elem" );
  }


  public final void setExperienceModInd_elem( xsd.acord.ExperienceModInd value ) {
    TYPE.get().setPropertyValue( this, "_ExperienceModInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ClaimHistoryReportStatus getClaimHistoryReportStatusCd() {
    return (xsd.acord.enums.ClaimHistoryReportStatus) TYPE.get().getPropertyValue( this, "_ClaimHistoryReportStatusCd" );
  }


  public final void setClaimHistoryReportStatusCd( xsd.acord.enums.ClaimHistoryReportStatus value ) {
    TYPE.get().setPropertyValue( this, "_ClaimHistoryReportStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimHistoryReportStatusCd getClaimHistoryReportStatusCd_elem() {
    return (xsd.acord.ClaimHistoryReportStatusCd) TYPE.get().getPropertyValue( this, "_ClaimHistoryReportStatusCd_elem" );
  }


  public final void setClaimHistoryReportStatusCd_elem( xsd.acord.ClaimHistoryReportStatusCd value ) {
    TYPE.get().setPropertyValue( this, "_ClaimHistoryReportStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFirstDollarDefenseInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FirstDollarDefenseInd" );
  }


  public final void setFirstDollarDefenseInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FirstDollarDefenseInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FirstDollarDefenseInd getFirstDollarDefenseInd_elem() {
    return (xsd.acord.FirstDollarDefenseInd) TYPE.get().getPropertyValue( this, "_FirstDollarDefenseInd_elem" );
  }


  public final void setFirstDollarDefenseInd_elem( xsd.acord.FirstDollarDefenseInd value ) {
    TYPE.get().setPropertyValue( this, "_FirstDollarDefenseInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLosses() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumLosses" );
  }


  public final void setNumLosses( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumLosses", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLosses getNumLosses_elem() {
    return (xsd.acord.NumLosses) TYPE.get().getPropertyValue( this, "_NumLosses_elem" );
  }


  public final void setNumLosses_elem( xsd.acord.NumLosses value ) {
    TYPE.get().setPropertyValue( this, "_NumLosses_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossesDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossesDesc" );
  }


  public final void setLossesDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossesDesc getLossesDesc_elem() {
    return (xsd.acord.LossesDesc) TYPE.get().getPropertyValue( this, "_LossesDesc_elem" );
  }


  public final void setLossesDesc_elem( xsd.acord.LossesDesc value ) {
    TYPE.get().setPropertyValue( this, "_LossesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPaidLossesAmt getTotalPaidLossesAmt() {
    return (xsd.acord.TotalPaidLossesAmt) TYPE.get().getPropertyValue( this, "_TotalPaidLossesAmt" );
  }


  public final void setTotalPaidLossesAmt( xsd.acord.TotalPaidLossesAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalPaidLossesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReserveTotalAmt getReserveTotalAmt() {
    return (xsd.acord.ReserveTotalAmt) TYPE.get().getPropertyValue( this, "_ReserveTotalAmt" );
  }


  public final void setReserveTotalAmt( xsd.acord.ReserveTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_ReserveTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCancelDeclineDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CancelDeclineDt" );
  }


  public final void setCancelDeclineDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CancelDeclineDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancelDeclineDt getCancelDeclineDt_elem() {
    return (xsd.acord.CancelDeclineDt) TYPE.get().getPropertyValue( this, "_CancelDeclineDt_elem" );
  }


  public final void setCancelDeclineDt_elem( xsd.acord.CancelDeclineDt value ) {
    TYPE.get().setPropertyValue( this, "_CancelDeclineDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getDriverRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_DriverRef" );
  }


  public final void setDriverRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_DriverRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getDriverNameRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_DriverNameRef" );
  }


  public final void setDriverNameRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_DriverNameRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getInsuredNameRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_InsuredNameRef" );
  }


  public final void setInsuredNameRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_InsuredNameRef", value );
  }

}

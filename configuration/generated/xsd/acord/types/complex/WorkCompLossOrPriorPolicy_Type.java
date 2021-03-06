/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompLossOrPriorPolicy_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompLossOrPriorPolicy_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualAmt = new javax.xml.namespace.QName( "", "AnnualAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerName = new javax.xml.namespace.QName( "", "InsurerName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyDeviationFactor = new javax.xml.namespace.QName( "", "CompanyDeviationFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MultiStateInd = new javax.xml.namespace.QName( "", "MultiStateInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaidTotalAmt = new javax.xml.namespace.QName( "", "PaidTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumTypeCd = new javax.xml.namespace.QName( "", "PremiumTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ScheduledRateFactor = new javax.xml.namespace.QName( "", "ScheduledRateFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIncurredAmt = new javax.xml.namespace.QName( "", "TotalIncurredAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIndemnityPaidAmt = new javax.xml.namespace.QName( "", "TotalIndemnityPaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumClaims = new javax.xml.namespace.QName( "", "NumClaims", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumClaimsPaid = new javax.xml.namespace.QName( "", "NumClaimsPaid", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMedicalClaimsPaid = new javax.xml.namespace.QName( "", "NumMedicalClaimsPaid", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalMedicalPaidAmt = new javax.xml.namespace.QName( "", "TotalMedicalPaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValuationDt = new javax.xml.namespace.QName( "", "ValuationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReserveTotalAmt = new javax.xml.namespace.QName( "", "ReserveTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimHistoryReportStatusCd = new javax.xml.namespace.QName( "", "ClaimHistoryReportStatusCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompLossOrPriorPolicy_Type" );
    }
  };

  public WorkCompLossOrPriorPolicy_Type() {
    super( 1086788362, TYPE.get() );
  }

  private WorkCompLossOrPriorPolicy_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1086788362, state );
  }

  protected WorkCompLossOrPriorPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompLossOrPriorPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompLossOrPriorPolicy_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompLossOrPriorPolicy_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualAmt getAnnualAmt() {
    return (xsd.acord.AnnualAmt) TYPE.get().getPropertyValue( this, "_AnnualAmt" );
  }


  public final void setAnnualAmt( xsd.acord.AnnualAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualAmt", value );
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
  public final java.math.BigDecimal getCompanyDeviationFactor() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_CompanyDeviationFactor" );
  }


  public final void setCompanyDeviationFactor( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_CompanyDeviationFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CompanyDeviationFactor getCompanyDeviationFactor_elem() {
    return (xsd.acord.CompanyDeviationFactor) TYPE.get().getPropertyValue( this, "_CompanyDeviationFactor_elem" );
  }


  public final void setCompanyDeviationFactor_elem( xsd.acord.CompanyDeviationFactor value ) {
    TYPE.get().setPropertyValue( this, "_CompanyDeviationFactor_elem", value );
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
  public final java.lang.String getExpirationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExpirationDt" );
  }


  public final void setExpirationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExpirationDt getExpirationDt_elem() {
    return (xsd.acord.ExpirationDt) TYPE.get().getPropertyValue( this, "_ExpirationDt_elem" );
  }


  public final void setExpirationDt_elem( xsd.acord.ExpirationDt value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getMultiStateInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_MultiStateInd" );
  }


  public final void setMultiStateInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_MultiStateInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MultiStateInd getMultiStateInd_elem() {
    return (xsd.acord.MultiStateInd) TYPE.get().getPropertyValue( this, "_MultiStateInd_elem" );
  }


  public final void setMultiStateInd_elem( xsd.acord.MultiStateInd value ) {
    TYPE.get().setPropertyValue( this, "_MultiStateInd_elem", value );
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
  public final xsd.acord.PaidTotalAmt getPaidTotalAmt() {
    return (xsd.acord.PaidTotalAmt) TYPE.get().getPropertyValue( this, "_PaidTotalAmt" );
  }


  public final void setPaidTotalAmt( xsd.acord.PaidTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_PaidTotalAmt", value );
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
  public final xsd.acord.enums.PremiumType getPremiumTypeCd() {
    return (xsd.acord.enums.PremiumType) TYPE.get().getPropertyValue( this, "_PremiumTypeCd" );
  }


  public final void setPremiumTypeCd( xsd.acord.enums.PremiumType value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumTypeCd getPremiumTypeCd_elem() {
    return (xsd.acord.PremiumTypeCd) TYPE.get().getPropertyValue( this, "_PremiumTypeCd_elem" );
  }


  public final void setPremiumTypeCd_elem( xsd.acord.PremiumTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getScheduledRateFactor() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_ScheduledRateFactor" );
  }


  public final void setScheduledRateFactor( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_ScheduledRateFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ScheduledRateFactor getScheduledRateFactor_elem() {
    return (xsd.acord.ScheduledRateFactor) TYPE.get().getPropertyValue( this, "_ScheduledRateFactor_elem" );
  }


  public final void setScheduledRateFactor_elem( xsd.acord.ScheduledRateFactor value ) {
    TYPE.get().setPropertyValue( this, "_ScheduledRateFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalIncurredAmt getTotalIncurredAmt() {
    return (xsd.acord.TotalIncurredAmt) TYPE.get().getPropertyValue( this, "_TotalIncurredAmt" );
  }


  public final void setTotalIncurredAmt( xsd.acord.TotalIncurredAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalIncurredAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalIndemnityPaidAmt getTotalIndemnityPaidAmt() {
    return (xsd.acord.TotalIndemnityPaidAmt) TYPE.get().getPropertyValue( this, "_TotalIndemnityPaidAmt" );
  }


  public final void setTotalIndemnityPaidAmt( xsd.acord.TotalIndemnityPaidAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalIndemnityPaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumClaims() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumClaims" );
  }


  public final void setNumClaims( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumClaims", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumClaims getNumClaims_elem() {
    return (xsd.acord.NumClaims) TYPE.get().getPropertyValue( this, "_NumClaims_elem" );
  }


  public final void setNumClaims_elem( xsd.acord.NumClaims value ) {
    TYPE.get().setPropertyValue( this, "_NumClaims_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumClaimsPaid() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumClaimsPaid" );
  }


  public final void setNumClaimsPaid( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumClaimsPaid", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumClaimsPaid getNumClaimsPaid_elem() {
    return (xsd.acord.NumClaimsPaid) TYPE.get().getPropertyValue( this, "_NumClaimsPaid_elem" );
  }


  public final void setNumClaimsPaid_elem( xsd.acord.NumClaimsPaid value ) {
    TYPE.get().setPropertyValue( this, "_NumClaimsPaid_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumMedicalClaimsPaid() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumMedicalClaimsPaid" );
  }


  public final void setNumMedicalClaimsPaid( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumMedicalClaimsPaid", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumMedicalClaimsPaid getNumMedicalClaimsPaid_elem() {
    return (xsd.acord.NumMedicalClaimsPaid) TYPE.get().getPropertyValue( this, "_NumMedicalClaimsPaid_elem" );
  }


  public final void setNumMedicalClaimsPaid_elem( xsd.acord.NumMedicalClaimsPaid value ) {
    TYPE.get().setPropertyValue( this, "_NumMedicalClaimsPaid_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalMedicalPaidAmt getTotalMedicalPaidAmt() {
    return (xsd.acord.TotalMedicalPaidAmt) TYPE.get().getPropertyValue( this, "_TotalMedicalPaidAmt" );
  }


  public final void setTotalMedicalPaidAmt( xsd.acord.TotalMedicalPaidAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalMedicalPaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValuationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ValuationDt" );
  }


  public final void setValuationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ValuationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ValuationDt getValuationDt_elem() {
    return (xsd.acord.ValuationDt) TYPE.get().getPropertyValue( this, "_ValuationDt_elem" );
  }


  public final void setValuationDt_elem( xsd.acord.ValuationDt value ) {
    TYPE.get().setPropertyValue( this, "_ValuationDt_elem", value );
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
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPE.get().getPropertyValue( this, "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPE.get().setPropertyValue( this, "_CreditOrSurcharge", value );
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
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}

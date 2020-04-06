/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PaymentOption_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PaymentOption_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentPlanCd = new javax.xml.namespace.QName( "", "PaymentPlanCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DayMonthDue = new javax.xml.namespace.QName( "", "DayMonthDue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CollectedByAgentAmt = new javax.xml.namespace.QName( "", "CollectedByAgentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MethodPaymentCd = new javax.xml.namespace.QName( "", "MethodPaymentCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NextTermPaymentPlanCd = new javax.xml.namespace.QName( "", "NextTermPaymentPlanCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepositAmt = new javax.xml.namespace.QName( "", "DepositAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DownPaymentPct = new javax.xml.namespace.QName( "", "DownPaymentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentFeeAmt = new javax.xml.namespace.QName( "", "InstallmentFeeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentPct = new javax.xml.namespace.QName( "", "InstallmentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentInfo = new javax.xml.namespace.QName( "", "InstallmentInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstPaymentDueDt = new javax.xml.namespace.QName( "", "FirstPaymentDueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentIntervalCd = new javax.xml.namespace.QName( "", "PaymentIntervalCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPayments = new javax.xml.namespace.QName( "", "NumPayments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CheckNumber = new javax.xml.namespace.QName( "", "CheckNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CheckDt = new javax.xml.namespace.QName( "", "CheckDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ElectronicFundsTransfer = new javax.xml.namespace.QName( "", "ElectronicFundsTransfer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayorPhysicalRecordInd = new javax.xml.namespace.QName( "", "PayorPhysicalRecordInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DepositMethodPaymentCd = new javax.xml.namespace.QName( "", "DepositMethodPaymentCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxExemptStateProvCd = new javax.xml.namespace.QName( "", "TaxExemptStateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingPeriod = new javax.xml.namespace.QName( "", "BillingPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignatureInfo = new javax.xml.namespace.QName( "", "SignatureInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PaymentOption_Type" );
    }
  };

  public PaymentOption_Type() {
    super( -332376827, TYPE.get() );
  }

  private PaymentOption_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -332376827, state );
  }

  protected PaymentOption_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PaymentOption_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PaymentOption_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PaymentOption_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getPaymentPlanCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_PaymentPlanCd" );
  }


  public final void setPaymentPlanCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_PaymentPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentPlanCd getPaymentPlanCd_elem() {
    return (xsd.acord.PaymentPlanCd) TYPE.get().getPropertyValue( this, "_PaymentPlanCd_elem" );
  }


  public final void setPaymentPlanCd_elem( xsd.acord.PaymentPlanCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDayMonthDue() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_DayMonthDue" );
  }


  public final void setDayMonthDue( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_DayMonthDue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DayMonthDue getDayMonthDue_elem() {
    return (xsd.acord.DayMonthDue) TYPE.get().getPropertyValue( this, "_DayMonthDue_elem" );
  }


  public final void setDayMonthDue_elem( xsd.acord.DayMonthDue value ) {
    TYPE.get().setPropertyValue( this, "_DayMonthDue_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CollectedByAgentAmt getCollectedByAgentAmt() {
    return (xsd.acord.CollectedByAgentAmt) TYPE.get().getPropertyValue( this, "_CollectedByAgentAmt" );
  }


  public final void setCollectedByAgentAmt( xsd.acord.CollectedByAgentAmt value ) {
    TYPE.get().setPropertyValue( this, "_CollectedByAgentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.MethodOfPayment getMethodPaymentCd() {
    return (xsd.acord.enums.MethodOfPayment) TYPE.get().getPropertyValue( this, "_MethodPaymentCd" );
  }


  public final void setMethodPaymentCd( xsd.acord.enums.MethodOfPayment value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MethodPaymentCd getMethodPaymentCd_elem() {
    return (xsd.acord.MethodPaymentCd) TYPE.get().getPropertyValue( this, "_MethodPaymentCd_elem" );
  }


  public final void setMethodPaymentCd_elem( xsd.acord.MethodPaymentCd value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getNextTermPaymentPlanCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_NextTermPaymentPlanCd" );
  }


  public final void setNextTermPaymentPlanCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_NextTermPaymentPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NextTermPaymentPlanCd getNextTermPaymentPlanCd_elem() {
    return (xsd.acord.NextTermPaymentPlanCd) TYPE.get().getPropertyValue( this, "_NextTermPaymentPlanCd_elem" );
  }


  public final void setNextTermPaymentPlanCd_elem( xsd.acord.NextTermPaymentPlanCd value ) {
    TYPE.get().setPropertyValue( this, "_NextTermPaymentPlanCd_elem", value );
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
  public final java.lang.Integer getDownPaymentPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_DownPaymentPct" );
  }


  public final void setDownPaymentPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_DownPaymentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DownPaymentPct getDownPaymentPct_elem() {
    return (xsd.acord.DownPaymentPct) TYPE.get().getPropertyValue( this, "_DownPaymentPct_elem" );
  }


  public final void setDownPaymentPct_elem( xsd.acord.DownPaymentPct value ) {
    TYPE.get().setPropertyValue( this, "_DownPaymentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InstallmentFeeAmt getInstallmentFeeAmt() {
    return (xsd.acord.InstallmentFeeAmt) TYPE.get().getPropertyValue( this, "_InstallmentFeeAmt" );
  }


  public final void setInstallmentFeeAmt( xsd.acord.InstallmentFeeAmt value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentFeeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getInstallmentPct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_InstallmentPct" );
  }


  public final void setInstallmentPct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InstallmentPct getInstallmentPct_elem() {
    return (xsd.acord.InstallmentPct) TYPE.get().getPropertyValue( this, "_InstallmentPct_elem" );
  }


  public final void setInstallmentPct_elem( xsd.acord.InstallmentPct value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InstallmentInfo> getInstallmentInfo() {
    return (java.util.List<xsd.acord.InstallmentInfo>) TYPE.get().getPropertyValue( this, "_InstallmentInfo" );
  }


  public final void setInstallmentInfo( java.util.List<xsd.acord.InstallmentInfo> value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstPaymentDueDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FirstPaymentDueDt" );
  }


  public final void setFirstPaymentDueDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FirstPaymentDueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FirstPaymentDueDt getFirstPaymentDueDt_elem() {
    return (xsd.acord.FirstPaymentDueDt) TYPE.get().getPropertyValue( this, "_FirstPaymentDueDt_elem" );
  }


  public final void setFirstPaymentDueDt_elem( xsd.acord.FirstPaymentDueDt value ) {
    TYPE.get().setPropertyValue( this, "_FirstPaymentDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getPaymentIntervalCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_PaymentIntervalCd" );
  }


  public final void setPaymentIntervalCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_PaymentIntervalCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentIntervalCd getPaymentIntervalCd_elem() {
    return (xsd.acord.PaymentIntervalCd) TYPE.get().getPropertyValue( this, "_PaymentIntervalCd_elem" );
  }


  public final void setPaymentIntervalCd_elem( xsd.acord.PaymentIntervalCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentIntervalCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPayments() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumPayments" );
  }


  public final void setNumPayments( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumPayments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPayments getNumPayments_elem() {
    return (xsd.acord.NumPayments) TYPE.get().getPropertyValue( this, "_NumPayments_elem" );
  }


  public final void setNumPayments_elem( xsd.acord.NumPayments value ) {
    TYPE.get().setPropertyValue( this, "_NumPayments_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Description getDescription_elem() {
    return (xsd.acord.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( xsd.acord.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCheckNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CheckNumber" );
  }


  public final void setCheckNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CheckNumber getCheckNumber_elem() {
    return (xsd.acord.CheckNumber) TYPE.get().getPropertyValue( this, "_CheckNumber_elem" );
  }


  public final void setCheckNumber_elem( xsd.acord.CheckNumber value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCheckDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CheckDt" );
  }


  public final void setCheckDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CheckDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CheckDt getCheckDt_elem() {
    return (xsd.acord.CheckDt) TYPE.get().getPropertyValue( this, "_CheckDt_elem" );
  }


  public final void setCheckDt_elem( xsd.acord.CheckDt value ) {
    TYPE.get().setPropertyValue( this, "_CheckDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ElectronicFundsTransfer getElectronicFundsTransfer() {
    return (xsd.acord.ElectronicFundsTransfer) TYPE.get().getPropertyValue( this, "_ElectronicFundsTransfer" );
  }


  public final void setElectronicFundsTransfer( xsd.acord.ElectronicFundsTransfer value ) {
    TYPE.get().setPropertyValue( this, "_ElectronicFundsTransfer", value );
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
  public final java.lang.Boolean getPayorPhysicalRecordInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PayorPhysicalRecordInd" );
  }


  public final void setPayorPhysicalRecordInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PayorPhysicalRecordInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PayorPhysicalRecordInd getPayorPhysicalRecordInd_elem() {
    return (xsd.acord.PayorPhysicalRecordInd) TYPE.get().getPropertyValue( this, "_PayorPhysicalRecordInd_elem" );
  }


  public final void setPayorPhysicalRecordInd_elem( xsd.acord.PayorPhysicalRecordInd value ) {
    TYPE.get().setPropertyValue( this, "_PayorPhysicalRecordInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.MethodOfPayment getDepositMethodPaymentCd() {
    return (xsd.acord.enums.MethodOfPayment) TYPE.get().getPropertyValue( this, "_DepositMethodPaymentCd" );
  }


  public final void setDepositMethodPaymentCd( xsd.acord.enums.MethodOfPayment value ) {
    TYPE.get().setPropertyValue( this, "_DepositMethodPaymentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DepositMethodPaymentCd getDepositMethodPaymentCd_elem() {
    return (xsd.acord.DepositMethodPaymentCd) TYPE.get().getPropertyValue( this, "_DepositMethodPaymentCd_elem" );
  }


  public final void setDepositMethodPaymentCd_elem( xsd.acord.DepositMethodPaymentCd value ) {
    TYPE.get().setPropertyValue( this, "_DepositMethodPaymentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getTaxExemptStateProvCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_TaxExemptStateProvCd" );
  }


  public final void setTaxExemptStateProvCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_TaxExemptStateProvCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TaxExemptStateProvCd> getTaxExemptStateProvCd_elem() {
    return (java.util.List<xsd.acord.TaxExemptStateProvCd>) TYPE.get().getPropertyValue( this, "_TaxExemptStateProvCd_elem" );
  }


  public final void setTaxExemptStateProvCd_elem( java.util.List<xsd.acord.TaxExemptStateProvCd> value ) {
    TYPE.get().setPropertyValue( this, "_TaxExemptStateProvCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingPeriod getBillingPeriod() {
    return (xsd.acord.BillingPeriod) TYPE.get().getPropertyValue( this, "_BillingPeriod" );
  }


  public final void setBillingPeriod( xsd.acord.BillingPeriod value ) {
    TYPE.get().setPropertyValue( this, "_BillingPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SignatureInfo> getSignatureInfo() {
    return (java.util.List<xsd.acord.SignatureInfo>) TYPE.get().getPropertyValue( this, "_SignatureInfo" );
  }


  public final void setSignatureInfo( java.util.List<xsd.acord.SignatureInfo> value ) {
    TYPE.get().setPropertyValue( this, "_SignatureInfo", value );
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
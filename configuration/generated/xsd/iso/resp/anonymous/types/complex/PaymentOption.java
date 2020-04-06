/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PaymentOption extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

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
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ElectronicFundsTransfer = new javax.xml.namespace.QName( "", "ElectronicFundsTransfer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.PaymentOption" );
    }
  };

  public PaymentOption() {
    super( -165601097, TYPE.get() );
  }

  private PaymentOption( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -165601097, state );
  }

  protected PaymentOption( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PaymentOption( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.PaymentOption> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.PaymentOption get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentPlanCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentPlanCd" );
  }


  public final void setPaymentPlanCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_PaymentPlanCd getPaymentPlanCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_PaymentPlanCd) TYPE.get().getPropertyValue( this, "_PaymentPlanCd_elem" );
  }


  public final void setPaymentPlanCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_PaymentPlanCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDayMonthDue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DayMonthDue" );
  }


  public final void setDayMonthDue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DayMonthDue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_DayMonthDue getDayMonthDue_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_DayMonthDue) TYPE.get().getPropertyValue( this, "_DayMonthDue_elem" );
  }


  public final void setDayMonthDue_elem( xsd.iso.resp.anonymous.elements.PaymentOption_DayMonthDue value ) {
    TYPE.get().setPropertyValue( this, "_DayMonthDue_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_CollectedByAgentAmt getCollectedByAgentAmt() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_CollectedByAgentAmt) TYPE.get().getPropertyValue( this, "_CollectedByAgentAmt" );
  }


  public final void setCollectedByAgentAmt( xsd.iso.resp.anonymous.elements.PaymentOption_CollectedByAgentAmt value ) {
    TYPE.get().setPropertyValue( this, "_CollectedByAgentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMethodPaymentCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MethodPaymentCd" );
  }


  public final void setMethodPaymentCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_MethodPaymentCd getMethodPaymentCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_MethodPaymentCd) TYPE.get().getPropertyValue( this, "_MethodPaymentCd_elem" );
  }


  public final void setMethodPaymentCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_MethodPaymentCd value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNextTermPaymentPlanCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NextTermPaymentPlanCd" );
  }


  public final void setNextTermPaymentPlanCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NextTermPaymentPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_NextTermPaymentPlanCd getNextTermPaymentPlanCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_NextTermPaymentPlanCd) TYPE.get().getPropertyValue( this, "_NextTermPaymentPlanCd_elem" );
  }


  public final void setNextTermPaymentPlanCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_NextTermPaymentPlanCd value ) {
    TYPE.get().setPropertyValue( this, "_NextTermPaymentPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_DepositAmt getDepositAmt() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_DepositAmt) TYPE.get().getPropertyValue( this, "_DepositAmt" );
  }


  public final void setDepositAmt( xsd.iso.resp.anonymous.elements.PaymentOption_DepositAmt value ) {
    TYPE.get().setPropertyValue( this, "_DepositAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDownPaymentPct() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DownPaymentPct" );
  }


  public final void setDownPaymentPct( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DownPaymentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_DownPaymentPct getDownPaymentPct_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_DownPaymentPct) TYPE.get().getPropertyValue( this, "_DownPaymentPct_elem" );
  }


  public final void setDownPaymentPct_elem( xsd.iso.resp.anonymous.elements.PaymentOption_DownPaymentPct value ) {
    TYPE.get().setPropertyValue( this, "_DownPaymentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentFeeAmt getInstallmentFeeAmt() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentFeeAmt) TYPE.get().getPropertyValue( this, "_InstallmentFeeAmt" );
  }


  public final void setInstallmentFeeAmt( xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentFeeAmt value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentFeeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInstallmentPct() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InstallmentPct" );
  }


  public final void setInstallmentPct( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentPct getInstallmentPct_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentPct) TYPE.get().getPropertyValue( this, "_InstallmentPct_elem" );
  }


  public final void setInstallmentPct_elem( xsd.iso.resp.anonymous.elements.PaymentOption_InstallmentPct value ) {
    TYPE.get().setPropertyValue( this, "_InstallmentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.InstallmentInfo> getInstallmentInfo() {
    return (java.util.List<xsd.iso.resp.InstallmentInfo>) TYPE.get().getPropertyValue( this, "_InstallmentInfo" );
  }


  public final void setInstallmentInfo( java.util.List<xsd.iso.resp.InstallmentInfo> value ) {
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
  public final xsd.iso.resp.anonymous.elements.PaymentOption_FirstPaymentDueDt getFirstPaymentDueDt_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_FirstPaymentDueDt) TYPE.get().getPropertyValue( this, "_FirstPaymentDueDt_elem" );
  }


  public final void setFirstPaymentDueDt_elem( xsd.iso.resp.anonymous.elements.PaymentOption_FirstPaymentDueDt value ) {
    TYPE.get().setPropertyValue( this, "_FirstPaymentDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentIntervalCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentIntervalCd" );
  }


  public final void setPaymentIntervalCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentIntervalCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_PaymentIntervalCd getPaymentIntervalCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_PaymentIntervalCd) TYPE.get().getPropertyValue( this, "_PaymentIntervalCd_elem" );
  }


  public final void setPaymentIntervalCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_PaymentIntervalCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentIntervalCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNumPayments() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NumPayments" );
  }


  public final void setNumPayments( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NumPayments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_NumPayments getNumPayments_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_NumPayments) TYPE.get().getPropertyValue( this, "_NumPayments_elem" );
  }


  public final void setNumPayments_elem( xsd.iso.resp.anonymous.elements.PaymentOption_NumPayments value ) {
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
  public final xsd.iso.resp.anonymous.elements.PaymentOption_Description getDescription_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( xsd.iso.resp.anonymous.elements.PaymentOption_Description value ) {
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
  public final xsd.iso.resp.anonymous.elements.PaymentOption_CheckNumber getCheckNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_CheckNumber) TYPE.get().getPropertyValue( this, "_CheckNumber_elem" );
  }


  public final void setCheckNumber_elem( xsd.iso.resp.anonymous.elements.PaymentOption_CheckNumber value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.ElectronicFundsTransfer getElectronicFundsTransfer() {
    return (xsd.iso.resp.ElectronicFundsTransfer) TYPE.get().getPropertyValue( this, "_ElectronicFundsTransfer" );
  }


  public final void setElectronicFundsTransfer( xsd.iso.resp.ElectronicFundsTransfer value ) {
    TYPE.get().setPropertyValue( this, "_ElectronicFundsTransfer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLOBCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LOBCd" );
  }


  public final void setLOBCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_LOBCd getLOBCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_LOBCd) TYPE.get().getPropertyValue( this, "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_LOBCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLOBSubCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LOBSubCd" );
  }


  public final void setLOBSubCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PaymentOption_LOBSubCd getLOBSubCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PaymentOption_LOBSubCd) TYPE.get().getPropertyValue( this, "_LOBSubCd_elem" );
  }


  public final void setLOBSubCd_elem( xsd.iso.resp.anonymous.elements.PaymentOption_LOBSubCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd_elem", value );
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
/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCPOLICY.class)
public class PersPolicy_Type extends xsd.acord.types.complex.PCPOLICY {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PersPolicy_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersApplicationInfo = new javax.xml.namespace.QName( "", "PersApplicationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccidentViolation = new javax.xml.namespace.QName( "", "AccidentViolation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriverVeh = new javax.xml.namespace.QName( "", "DriverVeh", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyVersion = new javax.xml.namespace.QName( "", "PolicyVersion", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyProductCd = new javax.xml.namespace.QName( "", "CompanyProductCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BroadLOBCd = new javax.xml.namespace.QName( "", "BroadLOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ControllingStateProvCd = new javax.xml.namespace.QName( "", "ControllingStateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractTerm = new javax.xml.namespace.QName( "", "ContractTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountNumber = new javax.xml.namespace.QName( "", "BillingAccountNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingMethodCd = new javax.xml.namespace.QName( "", "BillingMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustomerServicingCd = new javax.xml.namespace.QName( "", "CustomerServicingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignedDt = new javax.xml.namespace.QName( "", "SignedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupId = new javax.xml.namespace.QName( "", "GroupId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LanguageCd = new javax.xml.namespace.QName( "", "LanguageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MailingResponsibiltyCd = new javax.xml.namespace.QName( "", "MailingResponsibiltyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalInceptionDt = new javax.xml.namespace.QName( "", "OriginalInceptionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceWithCompanyCd = new javax.xml.namespace.QName( "", "OtherInsuranceWithCompanyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayorCd = new javax.xml.namespace.QName( "", "PayorCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrintedDocumentsRequestedInd = new javax.xml.namespace.QName( "", "PrintedDocumentsRequestedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RateEffectiveDt = new javax.xml.namespace.QName( "", "RateEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalBillingMethodCd = new javax.xml.namespace.QName( "", "RenewalBillingMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalPayorCd = new javax.xml.namespace.QName( "", "RenewalPayorCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalTerm = new javax.xml.namespace.QName( "", "RenewalTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShortTermPremiumMethodCd = new javax.xml.namespace.QName( "", "ShortTermPremiumMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignatureFormTypeCd = new javax.xml.namespace.QName( "", "SignatureFormTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignedByCd = new javax.xml.namespace.QName( "", "SignedByCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CounterSignature = new javax.xml.namespace.QName( "", "CounterSignature", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Binder = new javax.xml.namespace.QName( "", "Binder", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Loss = new javax.xml.namespace.QName( "", "Loss", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPaidLossAmt = new javax.xml.namespace.QName( "", "TotalPaidLossAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLosses = new javax.xml.namespace.QName( "", "NumLosses", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLossesYrs = new javax.xml.namespace.QName( "", "NumLossesYrs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherOrPriorPolicy = new javax.xml.namespace.QName( "", "OtherOrPriorPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentOption = new javax.xml.namespace.QName( "", "PaymentOption", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuoteInfo = new javax.xml.namespace.QName( "", "QuoteInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScoreInfo = new javax.xml.namespace.QName( "", "CreditScoreInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountNumberId = new javax.xml.namespace.QName( "", "AccountNumberId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignmentDt = new javax.xml.namespace.QName( "", "AssignmentDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremInd = new javax.xml.namespace.QName( "", "MinPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremAmt = new javax.xml.namespace.QName( "", "MinPremAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyStatusCd = new javax.xml.namespace.QName( "", "PolicyStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RefusingInsurerCd = new javax.xml.namespace.QName( "", "RefusingInsurerCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractSharePct = new javax.xml.namespace.QName( "", "ContractSharePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TermProcessDt = new javax.xml.namespace.QName( "", "TermProcessDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxCodeInfo = new javax.xml.namespace.QName( "", "TaxCodeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnniversaryRatingDt = new javax.xml.namespace.QName( "", "AnniversaryRatingDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTermCd = new javax.xml.namespace.QName( "", "PolicyTermCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalStatusCd = new javax.xml.namespace.QName( "", "RenewalStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnderwritingDescisionInfo = new javax.xml.namespace.QName( "", "UnderwritingDescisionInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalPolicyInceptionDt = new javax.xml.namespace.QName( "", "OriginalPolicyInceptionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaidInFullInd = new javax.xml.namespace.QName( "", "PaidInFullInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentHistoryInfo = new javax.xml.namespace.QName( "", "PaymentHistoryInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FutureEffDateInd = new javax.xml.namespace.QName( "", "FutureEffDateInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FutureEffDateNumDays = new javax.xml.namespace.QName( "", "FutureEffDateNumDays", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PersPolicy_Type" );
    }
  };

  public PersPolicy_Type() {
    super( -1021972278, TYPE.get() );
  }

  private PersPolicy_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1021972278, state );
  }

  protected PersPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PersPolicy_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PersPolicy_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PersPolicy_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersApplicationInfo getPersApplicationInfo() {
    return (xsd.acord.PersApplicationInfo) TYPE.get().getPropertyValue( this, "_PersApplicationInfo" );
  }


  public final void setPersApplicationInfo( xsd.acord.PersApplicationInfo value ) {
    TYPE.get().setPropertyValue( this, "_PersApplicationInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccidentViolation> getAccidentViolation() {
    return (java.util.List<xsd.acord.AccidentViolation>) TYPE.get().getPropertyValue( this, "_AccidentViolation" );
  }


  public final void setAccidentViolation( java.util.List<xsd.acord.AccidentViolation> value ) {
    TYPE.get().setPropertyValue( this, "_AccidentViolation", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DriverVeh> getDriverVeh() {
    return (java.util.List<xsd.acord.DriverVeh>) TYPE.get().getPropertyValue( this, "_DriverVeh" );
  }


  public final void setDriverVeh( java.util.List<xsd.acord.DriverVeh> value ) {
    TYPE.get().setPropertyValue( this, "_DriverVeh", value );
  }


}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PremiumType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAdjustableIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumAdjustableIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumRate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumCalculationBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumCalculationBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumIncomeAmountBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumIncomeAmountBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PaymentDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TermsOfTradePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TermsOfTradePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstalmentsTotalNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "InstalmentsTotalNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayableByDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PayableByDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentsDue = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PaymentsDue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentsDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PaymentsDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumTerrorismCoverType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumTerrorismCoverType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PremiumType = new javax.xml.namespace.QName( "", "PremiumType", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumType" );
    }
  };

  public PremiumType() {
    super( -1018830961, TYPE.get() );
  }

  private PremiumType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1018830961, state );
  }

  protected PremiumType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PremiumType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.PremiumType get$TypeInstance() {
    return this;
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAmount getPremiumAmount() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAmount) TYPE.get().getPropertyValue( this, "_PremiumAmount" );
  }


  public final void setPremiumAmount( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAmount value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumAdjustableIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PremiumAdjustableIndicator" );
  }


  public final void setPremiumAdjustableIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAdjustableIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator getPremiumAdjustableIndicator_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator) TYPE.get().getPropertyValue( this, "_PremiumAdjustableIndicator_elem" );
  }


  public final void setPremiumAdjustableIndicator_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumAdjustableIndicator value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAdjustableIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumRate getPremiumRate() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumRate) TYPE.get().getPropertyValue( this, "_PremiumRate" );
  }


  public final void setPremiumRate( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumRate value ) {
    TYPE.get().setPropertyValue( this, "_PremiumRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumCalculationBasis() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PremiumCalculationBasis" );
  }


  public final void setPremiumCalculationBasis( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PremiumCalculationBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumCalculationBasis getPremiumCalculationBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumCalculationBasis) TYPE.get().getPropertyValue( this, "_PremiumCalculationBasis_elem" );
  }


  public final void setPremiumCalculationBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumCalculationBasis value ) {
    TYPE.get().setPropertyValue( this, "_PremiumCalculationBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumIncomeAmountBasis() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PremiumIncomeAmountBasis" );
  }


  public final void setPremiumIncomeAmountBasis( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PremiumIncomeAmountBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumIncomeAmountBasis getPremiumIncomeAmountBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumIncomeAmountBasis) TYPE.get().getPropertyValue( this, "_PremiumIncomeAmountBasis_elem" );
  }


  public final void setPremiumIncomeAmountBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumIncomeAmountBasis value ) {
    TYPE.get().setPropertyValue( this, "_PremiumIncomeAmountBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentDate" );
  }


  public final void setPaymentDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentDate getPaymentDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentDate) TYPE.get().getPropertyValue( this, "_PaymentDate_elem" );
  }


  public final void setPaymentDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentDate value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsOfTradePeriod getTermsOfTradePeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsOfTradePeriod) TYPE.get().getPropertyValue( this, "_TermsOfTradePeriod" );
  }


  public final void setTermsOfTradePeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TermsOfTradePeriod value ) {
    TYPE.get().setPropertyValue( this, "_TermsOfTradePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentsTotalNbr getInstalmentsTotalNbr() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentsTotalNbr) TYPE.get().getPropertyValue( this, "_InstalmentsTotalNbr" );
  }


  public final void setInstalmentsTotalNbr( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.InstalmentsTotalNbr value ) {
    TYPE.get().setPropertyValue( this, "_InstalmentsTotalNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayableByDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PayableByDate" );
  }


  public final void setPayableByDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PayableByDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PayableByDate getPayableByDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PayableByDate) TYPE.get().getPropertyValue( this, "_PayableByDate_elem" );
  }


  public final void setPayableByDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PayableByDate value ) {
    TYPE.get().setPropertyValue( this, "_PayableByDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDue getPaymentsDue() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDue) TYPE.get().getPropertyValue( this, "_PaymentsDue" );
  }


  public final void setPaymentsDue( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDue value ) {
    TYPE.get().setPropertyValue( this, "_PaymentsDue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentsDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentsDescription" );
  }


  public final void setPaymentsDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentsDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDescription getPaymentsDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDescription) TYPE.get().getPropertyValue( this, "_PaymentsDescription_elem" );
  }


  public final void setPaymentsDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PaymentsDescription value ) {
    TYPE.get().setPropertyValue( this, "_PaymentsDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumTerrorismCoverType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PremiumTerrorismCoverType" );
  }


  public final void setPremiumTerrorismCoverType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTerrorismCoverType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumTerrorismCoverType getPremiumTerrorismCoverType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumTerrorismCoverType) TYPE.get().getPropertyValue( this, "_PremiumTerrorismCoverType_elem" );
  }


  public final void setPremiumTerrorismCoverType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PremiumTerrorismCoverType value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTerrorismCoverType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.PremiumType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PremiumType" );
  }


  public final void setPremiumType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PremiumType", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class IndividualClaimAmtItemType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "IndividualClaimAmtItemType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrenceYear = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrenceYear", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrencePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrencePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossRiskDetails = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossRiskDetails", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpenseIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ExpenseIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredClaimMovement = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredClaimMovement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredTechAccount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredTechAccount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Claim = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Claim", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClaimEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AmtStatus = new javax.xml.namespace.QName( "", "AmtStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_GeographicalOrigin = new javax.xml.namespace.QName( "", "GeographicalOrigin", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.IndividualClaimAmtItemType" );
    }
  };

  public IndividualClaimAmtItemType() {
    super( 1357901972, TYPE.get() );
  }

  private IndividualClaimAmtItemType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1357901972, state );
  }

  protected IndividualClaimAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected IndividualClaimAmtItemType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.IndividualClaimAmtItemType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.IndividualClaimAmtItemType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmt() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Amt" );
  }


  public final void setAmt( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt getAmt_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt) TYPE.get().getPropertyValue( this, "_Amt_elem" );
  }


  public final void setAmt_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Amt value ) {
    TYPE.get().setPropertyValue( this, "_Amt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlYear getLossOccurrenceYear() {
    return (gw.xml.date.XmlYear) TYPE.get().getPropertyValue( this, "_LossOccurrenceYear" );
  }


  public final void setLossOccurrenceYear( gw.xml.date.XmlYear value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrenceYear", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear getLossOccurrenceYear_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear) TYPE.get().getPropertyValue( this, "_LossOccurrenceYear_elem" );
  }


  public final void setLossOccurrenceYear_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrenceYear value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrenceYear_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod getLossOccurrencePeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod) TYPE.get().getPropertyValue( this, "_LossOccurrencePeriod" );
  }


  public final void setLossOccurrencePeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossOccurrencePeriod value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrencePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDate" );
  }


  public final void setAsOfDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate getAsOfDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate) TYPE.get().getPropertyValue( this, "_AsOfDate_elem" );
  }


  public final void setAsOfDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.AsOfDate value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossRiskDetails() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossRiskDetails" );
  }


  public final void setLossRiskDetails( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossRiskDetails", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossRiskDetails getLossRiskDetails_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossRiskDetails) TYPE.get().getPropertyValue( this, "_LossRiskDetails_elem" );
  }


  public final void setLossRiskDetails_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.LossRiskDetails value ) {
    TYPE.get().setPropertyValue( this, "_LossRiskDetails_elem", value );
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
  public final java.lang.String getExpenseIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExpenseIndicator" );
  }


  public final void setExpenseIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExpenseIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExpenseIndicator getExpenseIndicator_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExpenseIndicator) TYPE.get().getPropertyValue( this, "_ExpenseIndicator_elem" );
  }


  public final void setExpenseIndicator_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ExpenseIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ExpenseIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredClaimMovement getReferredClaimMovement() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredClaimMovement) TYPE.get().getPropertyValue( this, "_ReferredClaimMovement" );
  }


  public final void setReferredClaimMovement( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredClaimMovement value ) {
    TYPE.get().setPropertyValue( this, "_ReferredClaimMovement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredTechAccount getReferredTechAccount() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredTechAccount) TYPE.get().getPropertyValue( this, "_ReferredTechAccount" );
  }


  public final void setReferredTechAccount( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ReferredTechAccount value ) {
    TYPE.get().setPropertyValue( this, "_ReferredTechAccount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Claim getClaim() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Claim) TYPE.get().getPropertyValue( this, "_Claim" );
  }


  public final void setClaim( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Claim value ) {
    TYPE.get().setPropertyValue( this, "_Claim", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ClaimEntry getClaimEntry() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ClaimEntry) TYPE.get().getPropertyValue( this, "_ClaimEntry" );
  }


  public final void setClaimEntry( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.ClaimEntry value ) {
    TYPE.get().setPropertyValue( this, "_ClaimEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.IndividualClaimAmtItemType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.IndividualClaimAmtItemType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.IndividualClaimAmtItemType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmtStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AmtStatus" );
  }


  public final void setAmtStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AmtStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGeographicalOrigin() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GeographicalOrigin" );
  }


  public final void setGeographicalOrigin( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GeographicalOrigin", value );
  }

}
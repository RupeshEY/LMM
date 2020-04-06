/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimEntryFinancialAmounts", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OutstandingAmountQualifier = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "OutstandingAmountQualifier", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderOriginalSplitReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ServiceProviderOriginalSplitReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimMovementAmtItem = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClaimMovementAmtItem", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImportedServicesNarrative = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ImportedServicesNarrative", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LetterOfCreditReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LetterOfCreditReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FguNarrative = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "FguNarrative", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TargetCurrency = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "TargetCurrency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SettlementAmount = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "SettlementAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExchangeRate = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ExchangeRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialAmountInformation = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "FinancialAmountInformation", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Ccy = new javax.xml.namespace.QName( "", "Ccy", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts() {
    super( 826936881, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts() );
  }

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts typeInstance ) {
    super( 826936881, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts( gw.internal.xml.XmlElementState state ) {
    super( 826936881, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOutstandingAmountQualifier() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier" );
  }


  public final void setOutstandingAmountQualifier( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_OutstandingAmountQualifier getOutstandingAmountQualifier_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_OutstandingAmountQualifier) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier_elem" );
  }


  public final void setOutstandingAmountQualifier_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_OutstandingAmountQualifier value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getServiceProviderOriginalSplitReference() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceProviderOriginalSplitReference" );
  }


  public final void setServiceProviderOriginalSplitReference( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceProviderOriginalSplitReference", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ServiceProviderOriginalSplitReference> getServiceProviderOriginalSplitReference_elem() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ServiceProviderOriginalSplitReference>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceProviderOriginalSplitReference_elem" );
  }


  public final void setServiceProviderOriginalSplitReference_elem( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ServiceProviderOriginalSplitReference> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceProviderOriginalSplitReference_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem> getClaimMovementAmtItem() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimMovementAmtItem" );
  }


  public final void setClaimMovementAmtItem( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClaimMovementAmtItem> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimMovementAmtItem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getImportedServicesNarrative() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ImportedServicesNarrative" );
  }


  public final void setImportedServicesNarrative( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ImportedServicesNarrative", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ImportedServicesNarrative getImportedServicesNarrative_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ImportedServicesNarrative) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ImportedServicesNarrative_elem" );
  }


  public final void setImportedServicesNarrative_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ImportedServicesNarrative value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ImportedServicesNarrative_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLetterOfCreditReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LetterOfCreditReference" );
  }


  public final void setLetterOfCreditReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LetterOfCreditReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LetterOfCreditReference getLetterOfCreditReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LetterOfCreditReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LetterOfCreditReference_elem" );
  }


  public final void setLetterOfCreditReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LetterOfCreditReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LetterOfCreditReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFguNarrative() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FguNarrative" );
  }


  public final void setFguNarrative( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FguNarrative", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FguNarrative getFguNarrative_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FguNarrative) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FguNarrative_elem" );
  }


  public final void setFguNarrative_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FguNarrative value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FguNarrative_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_TargetCurrency getTargetCurrency() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_TargetCurrency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TargetCurrency" );
  }


  public final void setTargetCurrency( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_TargetCurrency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TargetCurrency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getSettlementAmount() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SettlementAmount" );
  }


  public final void setSettlementAmount( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SettlementAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount getSettlementAmount_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SettlementAmount_elem" );
  }


  public final void setSettlementAmount_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_SettlementAmount value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SettlementAmount_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getExchangeRate() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeRate" );
  }


  public final void setExchangeRate( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ExchangeRate getExchangeRate_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ExchangeRate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeRate_elem" );
  }


  public final void setExchangeRate_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_ExchangeRate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeRate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FinancialAmountInformation getFinancialAmountInformation() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FinancialAmountInformation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FinancialAmountInformation" );
  }


  public final void setFinancialAmountInformation( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts_FinancialAmountInformation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FinancialAmountInformation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCcy() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Ccy" );
  }


  public final void setCcy( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Ccy", value );
  }
}
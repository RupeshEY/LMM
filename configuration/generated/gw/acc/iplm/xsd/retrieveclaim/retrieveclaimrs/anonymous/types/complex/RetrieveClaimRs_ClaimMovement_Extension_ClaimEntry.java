/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionSequence = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "TransactionSequence", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AmendmentDetails = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "AmendmentDetails", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LloydsStatus = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "LloydsStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LirmaStatus = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "LirmaStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IluStatus = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "IluStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubClassification = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SubClassification", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerAdvisedDate = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "BrokerAdvisedDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AddedCirculatedOrAuthorisedDate = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "AddedCirculatedOrAuthorisedDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionSubCode = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "TransactionSubCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SettledIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SettledIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LinkedClaims = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "LinkedClaims", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Comments = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "Comments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimEntryFinancialAmounts = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ClaimEntryFinancialAmounts", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AggregateDetails = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "AggregateDetails", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BulkClaimInformation = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "BulkClaimInformation", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry() {
    super( 1367134615, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1367134615, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionSequence() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionSequence" );
  }


  public final void setTransactionSequence( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionSequence", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSequence getTransactionSequence_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSequence) TYPE.get().getPropertyValue( this, "_TransactionSequence_elem" );
  }


  public final void setTransactionSequence_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSequence value ) {
    TYPE.get().setPropertyValue( this, "_TransactionSequence_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmendmentDetails() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AmendmentDetails" );
  }


  public final void setAmendmentDetails( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AmendmentDetails", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AmendmentDetails getAmendmentDetails_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AmendmentDetails) TYPE.get().getPropertyValue( this, "_AmendmentDetails_elem" );
  }


  public final void setAmendmentDetails_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AmendmentDetails value ) {
    TYPE.get().setPropertyValue( this, "_AmendmentDetails_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLloydsStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LloydsStatus" );
  }


  public final void setLloydsStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LloydsStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LloydsStatus getLloydsStatus_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LloydsStatus) TYPE.get().getPropertyValue( this, "_LloydsStatus_elem" );
  }


  public final void setLloydsStatus_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LloydsStatus value ) {
    TYPE.get().setPropertyValue( this, "_LloydsStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLirmaStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LirmaStatus" );
  }


  public final void setLirmaStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LirmaStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LirmaStatus getLirmaStatus_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LirmaStatus) TYPE.get().getPropertyValue( this, "_LirmaStatus_elem" );
  }


  public final void setLirmaStatus_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LirmaStatus value ) {
    TYPE.get().setPropertyValue( this, "_LirmaStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIluStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IluStatus" );
  }


  public final void setIluStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IluStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_IluStatus getIluStatus_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_IluStatus) TYPE.get().getPropertyValue( this, "_IluStatus_elem" );
  }


  public final void setIluStatus_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_IluStatus value ) {
    TYPE.get().setPropertyValue( this, "_IluStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSubClassification() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SubClassification" );
  }


  public final void setSubClassification( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SubClassification", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SubClassification getSubClassification_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SubClassification) TYPE.get().getPropertyValue( this, "_SubClassification_elem" );
  }


  public final void setSubClassification_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SubClassification value ) {
    TYPE.get().setPropertyValue( this, "_SubClassification_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDate getBrokerAdvisedDate() {
    return (gw.xml.date.XmlDate) TYPE.get().getPropertyValue( this, "_BrokerAdvisedDate" );
  }


  public final void setBrokerAdvisedDate( gw.xml.date.XmlDate value ) {
    TYPE.get().setPropertyValue( this, "_BrokerAdvisedDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BrokerAdvisedDate getBrokerAdvisedDate_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BrokerAdvisedDate) TYPE.get().getPropertyValue( this, "_BrokerAdvisedDate_elem" );
  }


  public final void setBrokerAdvisedDate_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BrokerAdvisedDate value ) {
    TYPE.get().setPropertyValue( this, "_BrokerAdvisedDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDate getAddedCirculatedOrAuthorisedDate() {
    return (gw.xml.date.XmlDate) TYPE.get().getPropertyValue( this, "_AddedCirculatedOrAuthorisedDate" );
  }


  public final void setAddedCirculatedOrAuthorisedDate( gw.xml.date.XmlDate value ) {
    TYPE.get().setPropertyValue( this, "_AddedCirculatedOrAuthorisedDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AddedCirculatedOrAuthorisedDate getAddedCirculatedOrAuthorisedDate_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AddedCirculatedOrAuthorisedDate) TYPE.get().getPropertyValue( this, "_AddedCirculatedOrAuthorisedDate_elem" );
  }


  public final void setAddedCirculatedOrAuthorisedDate_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AddedCirculatedOrAuthorisedDate value ) {
    TYPE.get().setPropertyValue( this, "_AddedCirculatedOrAuthorisedDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionSubCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionSubCode" );
  }


  public final void setTransactionSubCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionSubCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSubCode getTransactionSubCode_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSubCode) TYPE.get().getPropertyValue( this, "_TransactionSubCode_elem" );
  }


  public final void setTransactionSubCode_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_TransactionSubCode value ) {
    TYPE.get().setPropertyValue( this, "_TransactionSubCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator getSettledIndicator() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator) TYPE.get().getPropertyValue( this, "_SettledIndicator" );
  }


  public final void setSettledIndicator( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.enums.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator value ) {
    TYPE.get().setPropertyValue( this, "_SettledIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator getSettledIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator) TYPE.get().getPropertyValue( this, "_SettledIndicator_elem" );
  }


  public final void setSettledIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_SettledIndicator value ) {
    TYPE.get().setPropertyValue( this, "_SettledIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LinkedClaims getLinkedClaims() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LinkedClaims) TYPE.get().getPropertyValue( this, "_LinkedClaims" );
  }


  public final void setLinkedClaims( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_LinkedClaims value ) {
    TYPE.get().setPropertyValue( this, "_LinkedClaims", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments getComments() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments) TYPE.get().getPropertyValue( this, "_Comments" );
  }


  public final void setComments( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_Comments value ) {
    TYPE.get().setPropertyValue( this, "_Comments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts> getClaimEntryFinancialAmounts() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts>) TYPE.get().getPropertyValue( this, "_ClaimEntryFinancialAmounts" );
  }


  public final void setClaimEntryFinancialAmounts( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_ClaimEntryFinancialAmounts> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimEntryFinancialAmounts", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AggregateDetails> getAggregateDetails() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AggregateDetails>) TYPE.get().getPropertyValue( this, "_AggregateDetails" );
  }


  public final void setAggregateDetails( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_AggregateDetails> value ) {
    TYPE.get().setPropertyValue( this, "_AggregateDetails", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation getBulkClaimInformation() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation) TYPE.get().getPropertyValue( this, "_BulkClaimInformation" );
  }


  public final void setBulkClaimInformation( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_ClaimEntry_BulkClaimInformation value ) {
    TYPE.get().setPropertyValue( this, "_BulkClaimInformation", value );
  }

}
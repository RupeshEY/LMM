/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConflictOfInterestIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ConflictOfInterestIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChaseUpIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ChaseUpIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CedantInLiquidationIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "CedantInLiquidationIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SimultaneousReinstatementRequired = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SimultaneousReinstatementRequired", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SimultaneousReinstatementProcessed = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SimultaneousReinstatementProcessed", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WarIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "WarIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NotifySalvageAssociationIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "NotifySalvageAssociationIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SoftWarnings = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SoftWarnings", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XcsToAgreeIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "XcsToAgreeIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CollectionUnlikelyIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "CollectionUnlikelyIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractualConditionsMayApplyIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ContractualConditionsMayApplyIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImmediatePartCollectionIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ImmediatePartCollectionIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoFurtherResponseIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "NoFurtherResponseIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MultipleResponseIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "MultipleResponseIndicator", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators() {
    super( 2004101000, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2004101000, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConflictOfInterestIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ConflictOfInterestIndicator" );
  }


  public final void setConflictOfInterestIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ConflictOfInterestIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ConflictOfInterestIndicator getConflictOfInterestIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ConflictOfInterestIndicator) TYPE.get().getPropertyValue( this, "_ConflictOfInterestIndicator_elem" );
  }


  public final void setConflictOfInterestIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ConflictOfInterestIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ConflictOfInterestIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ChaseUpIndicator getChaseUpIndicator() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ChaseUpIndicator) TYPE.get().getPropertyValue( this, "_ChaseUpIndicator" );
  }


  public final void setChaseUpIndicator( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ChaseUpIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ChaseUpIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCedantInLiquidationIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CedantInLiquidationIndicator" );
  }


  public final void setCedantInLiquidationIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CedantInLiquidationIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CedantInLiquidationIndicator getCedantInLiquidationIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CedantInLiquidationIndicator) TYPE.get().getPropertyValue( this, "_CedantInLiquidationIndicator_elem" );
  }


  public final void setCedantInLiquidationIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CedantInLiquidationIndicator value ) {
    TYPE.get().setPropertyValue( this, "_CedantInLiquidationIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSimultaneousReinstatementRequired() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SimultaneousReinstatementRequired" );
  }


  public final void setSimultaneousReinstatementRequired( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SimultaneousReinstatementRequired", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementRequired getSimultaneousReinstatementRequired_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementRequired) TYPE.get().getPropertyValue( this, "_SimultaneousReinstatementRequired_elem" );
  }


  public final void setSimultaneousReinstatementRequired_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementRequired value ) {
    TYPE.get().setPropertyValue( this, "_SimultaneousReinstatementRequired_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSimultaneousReinstatementProcessed() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SimultaneousReinstatementProcessed" );
  }


  public final void setSimultaneousReinstatementProcessed( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SimultaneousReinstatementProcessed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementProcessed getSimultaneousReinstatementProcessed_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementProcessed) TYPE.get().getPropertyValue( this, "_SimultaneousReinstatementProcessed_elem" );
  }


  public final void setSimultaneousReinstatementProcessed_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SimultaneousReinstatementProcessed value ) {
    TYPE.get().setPropertyValue( this, "_SimultaneousReinstatementProcessed_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWarIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WarIndicator" );
  }


  public final void setWarIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WarIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_WarIndicator getWarIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_WarIndicator) TYPE.get().getPropertyValue( this, "_WarIndicator_elem" );
  }


  public final void setWarIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_WarIndicator value ) {
    TYPE.get().setPropertyValue( this, "_WarIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNotifySalvageAssociationIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NotifySalvageAssociationIndicator" );
  }


  public final void setNotifySalvageAssociationIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NotifySalvageAssociationIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NotifySalvageAssociationIndicator getNotifySalvageAssociationIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NotifySalvageAssociationIndicator) TYPE.get().getPropertyValue( this, "_NotifySalvageAssociationIndicator_elem" );
  }


  public final void setNotifySalvageAssociationIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NotifySalvageAssociationIndicator value ) {
    TYPE.get().setPropertyValue( this, "_NotifySalvageAssociationIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings> getSoftWarnings() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>) TYPE.get().getPropertyValue( this, "_SoftWarnings" );
  }


  public final void setSoftWarnings( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_SoftWarnings> value ) {
    TYPE.get().setPropertyValue( this, "_SoftWarnings", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getXcsToAgreeIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_XcsToAgreeIndicator" );
  }


  public final void setXcsToAgreeIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_XcsToAgreeIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_XcsToAgreeIndicator getXcsToAgreeIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_XcsToAgreeIndicator) TYPE.get().getPropertyValue( this, "_XcsToAgreeIndicator_elem" );
  }


  public final void setXcsToAgreeIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_XcsToAgreeIndicator value ) {
    TYPE.get().setPropertyValue( this, "_XcsToAgreeIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCollectionUnlikelyIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CollectionUnlikelyIndicator" );
  }


  public final void setCollectionUnlikelyIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CollectionUnlikelyIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CollectionUnlikelyIndicator getCollectionUnlikelyIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CollectionUnlikelyIndicator) TYPE.get().getPropertyValue( this, "_CollectionUnlikelyIndicator_elem" );
  }


  public final void setCollectionUnlikelyIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_CollectionUnlikelyIndicator value ) {
    TYPE.get().setPropertyValue( this, "_CollectionUnlikelyIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContractualConditionsMayApplyIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContractualConditionsMayApplyIndicator" );
  }


  public final void setContractualConditionsMayApplyIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContractualConditionsMayApplyIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ContractualConditionsMayApplyIndicator getContractualConditionsMayApplyIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ContractualConditionsMayApplyIndicator) TYPE.get().getPropertyValue( this, "_ContractualConditionsMayApplyIndicator_elem" );
  }


  public final void setContractualConditionsMayApplyIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ContractualConditionsMayApplyIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ContractualConditionsMayApplyIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getImmediatePartCollectionIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ImmediatePartCollectionIndicator" );
  }


  public final void setImmediatePartCollectionIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ImmediatePartCollectionIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ImmediatePartCollectionIndicator getImmediatePartCollectionIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ImmediatePartCollectionIndicator) TYPE.get().getPropertyValue( this, "_ImmediatePartCollectionIndicator_elem" );
  }


  public final void setImmediatePartCollectionIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_ImmediatePartCollectionIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ImmediatePartCollectionIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNoFurtherResponseIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NoFurtherResponseIndicator" );
  }


  public final void setNoFurtherResponseIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NoFurtherResponseIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NoFurtherResponseIndicator getNoFurtherResponseIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NoFurtherResponseIndicator) TYPE.get().getPropertyValue( this, "_NoFurtherResponseIndicator_elem" );
  }


  public final void setNoFurtherResponseIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_NoFurtherResponseIndicator value ) {
    TYPE.get().setPropertyValue( this, "_NoFurtherResponseIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMultipleResponseIndicator() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MultipleResponseIndicator" );
  }


  public final void setMultipleResponseIndicator( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MultipleResponseIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_MultipleResponseIndicator getMultipleResponseIndicator_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_MultipleResponseIndicator) TYPE.get().getPropertyValue( this, "_MultipleResponseIndicator_elem" );
  }


  public final void setMultipleResponseIndicator_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Claim_Indicators_MultipleResponseIndicator value ) {
    TYPE.get().setPropertyValue( this, "_MultipleResponseIndicator_elem", value );
  }

}

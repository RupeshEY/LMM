/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRqType_ClaimMovement_Extension_Claim extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "Claim", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsuredClaimReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ReinsuredClaimReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimLineNumber = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimLineNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeadClaimReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LeadClaimReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeadClaimReference2 = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LeadClaimReference2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatus = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimClassification = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimClassification", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoLeadIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "CoLeadIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossPeriod = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LossPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimType = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimCategoryCode = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimCategoryCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimSubCategoryCode = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimSubCategoryCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsScheme = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ClaimsScheme", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ECFIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ECFIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TriageCategory = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "TriageCategory", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParallelUniqueClaimReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ParallelUniqueClaimReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Indicators = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "Indicators", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerClaimReference1 = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "BrokerClaimReference1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupHeaderBinderReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "GroupHeaderBinderReference", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Claim() {
    super( -115450372, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim() );
  }

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Claim( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim typeInstance ) {
    super( -115450372, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_Claim( gw.internal.xml.XmlElementState state ) {
    super( -115450372, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReinsuredClaimReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReinsuredClaimReference" );
  }


  public final void setReinsuredClaimReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReinsuredClaimReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ReinsuredClaimReference getReinsuredClaimReference_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ReinsuredClaimReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReinsuredClaimReference_elem" );
  }


  public final void setReinsuredClaimReference_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ReinsuredClaimReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReinsuredClaimReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getClaimLineNumber() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimLineNumber" );
  }


  public final void setClaimLineNumber( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimLineNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimLineNumber getClaimLineNumber_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimLineNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimLineNumber_elem" );
  }


  public final void setClaimLineNumber_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimLineNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimLineNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLeadClaimReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeadClaimReference" );
  }


  public final void setLeadClaimReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeadClaimReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference getLeadClaimReference_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeadClaimReference_elem" );
  }


  public final void setLeadClaimReference_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeadClaimReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLeadClaimReference2() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeadClaimReference2" );
  }


  public final void setLeadClaimReference2( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeadClaimReference2", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference2 getLeadClaimReference2_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference2) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeadClaimReference2_elem" );
  }


  public final void setLeadClaimReference2_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LeadClaimReference2 value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeadClaimReference2_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatus" );
  }


  public final void setClaimStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimStatus getClaimStatus_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatus_elem" );
  }


  public final void setClaimStatus_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimClassification() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimClassification" );
  }


  public final void setClaimClassification( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimClassification", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimClassification getClaimClassification_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimClassification) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimClassification_elem" );
  }


  public final void setClaimClassification_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimClassification value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimClassification_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoLeadIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoLeadIndicator" );
  }


  public final void setCoLeadIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoLeadIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_CoLeadIndicator getCoLeadIndicator_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_CoLeadIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoLeadIndicator_elem" );
  }


  public final void setCoLeadIndicator_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_CoLeadIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoLeadIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LossPeriod getLossPeriod() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LossPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossPeriod" );
  }


  public final void setLossPeriod( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_LossPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimType" );
  }


  public final void setClaimType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimType getClaimType_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimType_elem" );
  }


  public final void setClaimType_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimCategoryCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimCategoryCode" );
  }


  public final void setClaimCategoryCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimCategoryCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimCategoryCode getClaimCategoryCode_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimCategoryCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimCategoryCode_elem" );
  }


  public final void setClaimCategoryCode_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimCategoryCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimCategoryCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimSubCategoryCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimSubCategoryCode" );
  }


  public final void setClaimSubCategoryCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimSubCategoryCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimSubCategoryCode getClaimSubCategoryCode_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimSubCategoryCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimSubCategoryCode_elem" );
  }


  public final void setClaimSubCategoryCode_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimSubCategoryCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimSubCategoryCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimsScheme() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsScheme" );
  }


  public final void setClaimsScheme( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsScheme", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimsScheme getClaimsScheme_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimsScheme) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsScheme_elem" );
  }


  public final void setClaimsScheme_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ClaimsScheme value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsScheme_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator getECFIndicator() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ECFIndicator" );
  }


  public final void setECFIndicator( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ECFIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator getECFIndicator_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ECFIndicator_elem" );
  }


  public final void setECFIndicator_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ECFIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ECFIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTriageCategory() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TriageCategory" );
  }


  public final void setTriageCategory( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TriageCategory", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_TriageCategory getTriageCategory_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_TriageCategory) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TriageCategory_elem" );
  }


  public final void setTriageCategory_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_TriageCategory value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TriageCategory_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getParallelUniqueClaimReference() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParallelUniqueClaimReference" );
  }


  public final void setParallelUniqueClaimReference( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParallelUniqueClaimReference", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference> getParallelUniqueClaimReference_elem() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ParallelUniqueClaimReference_elem" );
  }


  public final void setParallelUniqueClaimReference_elem( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_ParallelUniqueClaimReference> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ParallelUniqueClaimReference_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators getIndicators() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Indicators" );
  }


  public final void setIndicators( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Indicators", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrokerClaimReference1() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrokerClaimReference1" );
  }


  public final void setBrokerClaimReference1( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrokerClaimReference1", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_BrokerClaimReference1 getBrokerClaimReference1_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_BrokerClaimReference1) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BrokerClaimReference1_elem" );
  }


  public final void setBrokerClaimReference1_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_BrokerClaimReference1 value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BrokerClaimReference1_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigInteger getGroupHeaderBinderReference() {
    return (java.math.BigInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GroupHeaderBinderReference" );
  }


  public final void setGroupHeaderBinderReference( java.math.BigInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GroupHeaderBinderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_GroupHeaderBinderReference getGroupHeaderBinderReference_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_GroupHeaderBinderReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GroupHeaderBinderReference_elem" );
  }


  public final void setGroupHeaderBinderReference_elem( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_GroupHeaderBinderReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GroupHeaderBinderReference_elem", value );
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SearchForClaimsMultiCriteriaResponse_Return_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI", "Entry", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "ClaimNumber", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimSecurityType = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "ClaimSecurityType", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FraudIndicator = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "FraudIndicator", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LargeLossIndicator = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "LargeLossIndicator", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LitigationIndicator = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "LitigationIndicator", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDate = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "LossDate", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "PolicyNumber", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTypeName = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "PolicyTypeName", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemainingReserves = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "RemainingReserves", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemainingReservesCurrency = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "RemainingReservesCurrency", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "Status", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIncurred = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "TotalIncurred", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIncurredCurrency = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/pcentities/PCClaim", "TotalIncurredCurrency", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.SearchForClaimsMultiCriteriaResponse_Return_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim" );
    }
  };

  public SearchForClaimsMultiCriteriaResponse_Return_Entry() {
    super( -291574912, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim() );
  }

  public SearchForClaimsMultiCriteriaResponse_Return_Entry( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim typeInstance ) {
    super( -291574912, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SearchForClaimsMultiCriteriaResponse_Return_Entry( gw.internal.xml.XmlElementState state ) {
    super( -291574912, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.SearchForClaimsMultiCriteriaResponse_Return_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimNumber" );
  }


  public final void setClaimNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimNumber getClaimNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimNumber_elem" );
  }


  public final void setClaimNumber_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimSecurityType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimSecurityType" );
  }


  public final void setClaimSecurityType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimSecurityType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimSecurityType getClaimSecurityType_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimSecurityType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimSecurityType_elem" );
  }


  public final void setClaimSecurityType_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_ClaimSecurityType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimSecurityType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFraudIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FraudIndicator" );
  }


  public final void setFraudIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FraudIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_FraudIndicator getFraudIndicator_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_FraudIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FraudIndicator_elem" );
  }


  public final void setFraudIndicator_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_FraudIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FraudIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLargeLossIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LargeLossIndicator" );
  }


  public final void setLargeLossIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LargeLossIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LargeLossIndicator getLargeLossIndicator_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LargeLossIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LargeLossIndicator_elem" );
  }


  public final void setLargeLossIndicator_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LargeLossIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LargeLossIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLitigationIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LitigationIndicator" );
  }


  public final void setLitigationIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LitigationIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LitigationIndicator getLitigationIndicator_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LitigationIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LitigationIndicator_elem" );
  }


  public final void setLitigationIndicator_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LitigationIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LitigationIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getLossDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDate" );
  }


  public final void setLossDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LossDate getLossDate_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LossDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDate_elem" );
  }


  public final void setLossDate_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_LossDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyNumber getPolicyNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyTypeName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyTypeName" );
  }


  public final void setPolicyTypeName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyTypeName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyTypeName getPolicyTypeName_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyTypeName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyTypeName_elem" );
  }


  public final void setPolicyTypeName_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_PolicyTypeName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyTypeName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getRemainingReserves() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemainingReserves" );
  }


  public final void setRemainingReserves( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemainingReserves", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReserves getRemainingReserves_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReserves) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemainingReserves_elem" );
  }


  public final void setRemainingReserves_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReserves value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemainingReserves_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency getRemainingReservesCurrency() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemainingReservesCurrency" );
  }


  public final void setRemainingReservesCurrency( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemainingReservesCurrency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReservesCurrency getRemainingReservesCurrency_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReservesCurrency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RemainingReservesCurrency_elem" );
  }


  public final void setRemainingReservesCurrency_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_RemainingReservesCurrency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RemainingReservesCurrency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_Status getStatus_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status_elem" );
  }


  public final void setStatus_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getTotalIncurred() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIncurred" );
  }


  public final void setTotalIncurred( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIncurred", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurred getTotalIncurred_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurred) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIncurred_elem" );
  }


  public final void setTotalIncurred_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurred value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIncurred_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency getTotalIncurredCurrency() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIncurredCurrency" );
  }


  public final void setTotalIncurredCurrency( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.enums.Currency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIncurredCurrency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurredCurrency getTotalIncurredCurrency_elem() {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurredCurrency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIncurredCurrency_elem" );
  }


  public final void setTotalIncurredCurrency_elem( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaim_TotalIncurredCurrency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIncurredCurrency_elem", value );
  }
}
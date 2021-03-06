/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompLossInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompLossInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JurisdictionCd = new javax.xml.namespace.QName( "", "JurisdictionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JurisdictionDesc = new javax.xml.namespace.QName( "", "JurisdictionDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WCClaimTypeCd = new javax.xml.namespace.QName( "", "WCClaimTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossConditionTypeCd = new javax.xml.namespace.QName( "", "LossConditionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossConditionRecoveryTypeCd = new javax.xml.namespace.QName( "", "LossConditionRecoveryTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossConditionSettlementTypeCd = new javax.xml.namespace.QName( "", "LossConditionSettlementTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondInjuryFundInd = new javax.xml.namespace.QName( "", "SecondInjuryFundInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceInd = new javax.xml.namespace.QName( "", "OtherInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FraudulentClaimCd = new javax.xml.namespace.QName( "", "FraudulentClaimCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmployeeInfo = new javax.xml.namespace.QName( "", "EmployeeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmployerInfo = new javax.xml.namespace.QName( "", "EmployerInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VesselCallId = new javax.xml.namespace.QName( "", "VesselCallId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCondition = new javax.xml.namespace.QName( "", "LossCondition", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SecondInjuryFundRef = new javax.xml.namespace.QName( "", "SecondInjuryFundRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompLossInfo_Type" );
    }
  };

  public WorkCompLossInfo_Type() {
    super( 2045949729, TYPE.get() );
  }

  private WorkCompLossInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2045949729, state );
  }

  protected WorkCompLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompLossInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompLossInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJurisdictionCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_JurisdictionCd" );
  }


  public final void setJurisdictionCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_JurisdictionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JurisdictionCd getJurisdictionCd_elem() {
    return (xsd.acord.JurisdictionCd) TYPE.get().getPropertyValue( this, "_JurisdictionCd_elem" );
  }


  public final void setJurisdictionCd_elem( xsd.acord.JurisdictionCd value ) {
    TYPE.get().setPropertyValue( this, "_JurisdictionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJurisdictionDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_JurisdictionDesc" );
  }


  public final void setJurisdictionDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_JurisdictionDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JurisdictionDesc getJurisdictionDesc_elem() {
    return (xsd.acord.JurisdictionDesc) TYPE.get().getPropertyValue( this, "_JurisdictionDesc_elem" );
  }


  public final void setJurisdictionDesc_elem( xsd.acord.JurisdictionDesc value ) {
    TYPE.get().setPropertyValue( this, "_JurisdictionDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WCClaimType getWCClaimTypeCd() {
    return (xsd.acord.enums.WCClaimType) TYPE.get().getPropertyValue( this, "_WCClaimTypeCd" );
  }


  public final void setWCClaimTypeCd( xsd.acord.enums.WCClaimType value ) {
    TYPE.get().setPropertyValue( this, "_WCClaimTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WCClaimTypeCd getWCClaimTypeCd_elem() {
    return (xsd.acord.WCClaimTypeCd) TYPE.get().getPropertyValue( this, "_WCClaimTypeCd_elem" );
  }


  public final void setWCClaimTypeCd_elem( xsd.acord.WCClaimTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_WCClaimTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossConditionTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossConditionTypeCd" );
  }


  public final void setLossConditionTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossConditionTypeCd getLossConditionTypeCd_elem() {
    return (xsd.acord.LossConditionTypeCd) TYPE.get().getPropertyValue( this, "_LossConditionTypeCd_elem" );
  }


  public final void setLossConditionTypeCd_elem( xsd.acord.LossConditionTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossConditionRecoveryTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossConditionRecoveryTypeCd" );
  }


  public final void setLossConditionRecoveryTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionRecoveryTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossConditionRecoveryTypeCd getLossConditionRecoveryTypeCd_elem() {
    return (xsd.acord.LossConditionRecoveryTypeCd) TYPE.get().getPropertyValue( this, "_LossConditionRecoveryTypeCd_elem" );
  }


  public final void setLossConditionRecoveryTypeCd_elem( xsd.acord.LossConditionRecoveryTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionRecoveryTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossConditionSettlementTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossConditionSettlementTypeCd" );
  }


  public final void setLossConditionSettlementTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionSettlementTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossConditionSettlementTypeCd getLossConditionSettlementTypeCd_elem() {
    return (xsd.acord.LossConditionSettlementTypeCd) TYPE.get().getPropertyValue( this, "_LossConditionSettlementTypeCd_elem" );
  }


  public final void setLossConditionSettlementTypeCd_elem( xsd.acord.LossConditionSettlementTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_LossConditionSettlementTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSecondInjuryFundInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SecondInjuryFundInd" );
  }


  public final void setSecondInjuryFundInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SecondInjuryFundInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SecondInjuryFundInd getSecondInjuryFundInd_elem() {
    return (xsd.acord.SecondInjuryFundInd) TYPE.get().getPropertyValue( this, "_SecondInjuryFundInd_elem" );
  }


  public final void setSecondInjuryFundInd_elem( xsd.acord.SecondInjuryFundInd value ) {
    TYPE.get().setPropertyValue( this, "_SecondInjuryFundInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOtherInsuranceInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd" );
  }


  public final void setOtherInsuranceInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherInsuranceInd getOtherInsuranceInd_elem() {
    return (xsd.acord.OtherInsuranceInd) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd_elem" );
  }


  public final void setOtherInsuranceInd_elem( xsd.acord.OtherInsuranceInd value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFraudulentClaimCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FraudulentClaimCd" );
  }


  public final void setFraudulentClaimCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FraudulentClaimCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FraudulentClaimCd getFraudulentClaimCd_elem() {
    return (xsd.acord.FraudulentClaimCd) TYPE.get().getPropertyValue( this, "_FraudulentClaimCd_elem" );
  }


  public final void setFraudulentClaimCd_elem( xsd.acord.FraudulentClaimCd value ) {
    TYPE.get().setPropertyValue( this, "_FraudulentClaimCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EmployeeInfo getEmployeeInfo() {
    return (xsd.acord.EmployeeInfo) TYPE.get().getPropertyValue( this, "_EmployeeInfo" );
  }


  public final void setEmployeeInfo( xsd.acord.EmployeeInfo value ) {
    TYPE.get().setPropertyValue( this, "_EmployeeInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EmployerInfo getEmployerInfo() {
    return (xsd.acord.EmployerInfo) TYPE.get().getPropertyValue( this, "_EmployerInfo" );
  }


  public final void setEmployerInfo( xsd.acord.EmployerInfo value ) {
    TYPE.get().setPropertyValue( this, "_EmployerInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Coverages> getCoverageCd() {
    return (java.util.List<xsd.acord.enums.Coverages>) TYPE.get().getPropertyValue( this, "_CoverageCd" );
  }


  public final void setCoverageCd( java.util.List<xsd.acord.enums.Coverages> value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CoverageCd> getCoverageCd_elem() {
    return (java.util.List<xsd.acord.CoverageCd>) TYPE.get().getPropertyValue( this, "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( java.util.List<xsd.acord.CoverageCd> value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVesselCallId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VesselCallId" );
  }


  public final void setVesselCallId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VesselCallId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VesselCallId getVesselCallId_elem() {
    return (xsd.acord.VesselCallId) TYPE.get().getPropertyValue( this, "_VesselCallId_elem" );
  }


  public final void setVesselCallId_elem( xsd.acord.VesselCallId value ) {
    TYPE.get().setPropertyValue( this, "_VesselCallId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossCondition getLossCondition() {
    return (xsd.acord.LossCondition) TYPE.get().getPropertyValue( this, "_LossCondition" );
  }


  public final void setLossCondition( xsd.acord.LossCondition value ) {
    TYPE.get().setPropertyValue( this, "_LossCondition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSecondInjuryFundRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SecondInjuryFundRef" );
  }


  public final void setSecondInjuryFundRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SecondInjuryFundRef", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BondExecution_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BondExecution_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondNumber = new javax.xml.namespace.QName( "", "BondNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondTermCd = new javax.xml.namespace.QName( "", "BondTermCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondTerm = new javax.xml.namespace.QName( "", "BondTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BulkBondInd = new javax.xml.namespace.QName( "", "BulkBondInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumItemsBulkBond = new javax.xml.namespace.QName( "", "NumItemsBulkBond", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BulkBondAggregateExposureAmt = new javax.xml.namespace.QName( "", "BulkBondAggregateExposureAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancellableInd = new javax.xml.namespace.QName( "", "CancellableInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancel = new javax.xml.namespace.QName( "", "NumDaysCancel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancellationTypeCd = new javax.xml.namespace.QName( "", "CancellationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CollateralInd = new javax.xml.namespace.QName( "", "CollateralInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionDt = new javax.xml.namespace.QName( "", "ExecutionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalMethodCd = new javax.xml.namespace.QName( "", "RenewalMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SAAClassCd = new javax.xml.namespace.QName( "", "SAAClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SAAContractTypeCd = new javax.xml.namespace.QName( "", "SAAContractTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountryCd = new javax.xml.namespace.QName( "", "CountryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProv = new javax.xml.namespace.QName( "", "StateProv", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CounterSignature = new javax.xml.namespace.QName( "", "CounterSignature", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysAdvanceRenewalNotice = new javax.xml.namespace.QName( "", "NumDaysAdvanceRenewalNotice", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreviousBondNumber = new javax.xml.namespace.QName( "", "PreviousBondNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondCloseDt = new javax.xml.namespace.QName( "", "BondCloseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BondExecution_Type" );
    }
  };

  public BondExecution_Type() {
    super( -993108021, TYPE.get() );
  }

  private BondExecution_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -993108021, state );
  }

  protected BondExecution_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BondExecution_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BondExecution_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BondExecution_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BondNumber" );
  }


  public final void setBondNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BondNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondNumber getBondNumber_elem() {
    return (xsd.acord.BondNumber) TYPE.get().getPropertyValue( this, "_BondNumber_elem" );
  }


  public final void setBondNumber_elem( xsd.acord.BondNumber value ) {
    TYPE.get().setPropertyValue( this, "_BondNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BondTerms getBondTermCd() {
    return (xsd.acord.enums.BondTerms) TYPE.get().getPropertyValue( this, "_BondTermCd" );
  }


  public final void setBondTermCd( xsd.acord.enums.BondTerms value ) {
    TYPE.get().setPropertyValue( this, "_BondTermCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondTermCd getBondTermCd_elem() {
    return (xsd.acord.BondTermCd) TYPE.get().getPropertyValue( this, "_BondTermCd_elem" );
  }


  public final void setBondTermCd_elem( xsd.acord.BondTermCd value ) {
    TYPE.get().setPropertyValue( this, "_BondTermCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondTerm getBondTerm() {
    return (xsd.acord.BondTerm) TYPE.get().getPropertyValue( this, "_BondTerm" );
  }


  public final void setBondTerm( xsd.acord.BondTerm value ) {
    TYPE.get().setPropertyValue( this, "_BondTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBulkBondInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_BulkBondInd" );
  }


  public final void setBulkBondInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_BulkBondInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BulkBondInd getBulkBondInd_elem() {
    return (xsd.acord.BulkBondInd) TYPE.get().getPropertyValue( this, "_BulkBondInd_elem" );
  }


  public final void setBulkBondInd_elem( xsd.acord.BulkBondInd value ) {
    TYPE.get().setPropertyValue( this, "_BulkBondInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumItemsBulkBond() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumItemsBulkBond" );
  }


  public final void setNumItemsBulkBond( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumItemsBulkBond", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumItemsBulkBond getNumItemsBulkBond_elem() {
    return (xsd.acord.NumItemsBulkBond) TYPE.get().getPropertyValue( this, "_NumItemsBulkBond_elem" );
  }


  public final void setNumItemsBulkBond_elem( xsd.acord.NumItemsBulkBond value ) {
    TYPE.get().setPropertyValue( this, "_NumItemsBulkBond_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BulkBondAggregateExposureAmt getBulkBondAggregateExposureAmt() {
    return (xsd.acord.BulkBondAggregateExposureAmt) TYPE.get().getPropertyValue( this, "_BulkBondAggregateExposureAmt" );
  }


  public final void setBulkBondAggregateExposureAmt( xsd.acord.BulkBondAggregateExposureAmt value ) {
    TYPE.get().setPropertyValue( this, "_BulkBondAggregateExposureAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCancellableInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_CancellableInd" );
  }


  public final void setCancellableInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_CancellableInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancellableInd getCancellableInd_elem() {
    return (xsd.acord.CancellableInd) TYPE.get().getPropertyValue( this, "_CancellableInd_elem" );
  }


  public final void setCancellableInd_elem( xsd.acord.CancellableInd value ) {
    TYPE.get().setPropertyValue( this, "_CancellableInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancel() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDaysCancel" );
  }


  public final void setNumDaysCancel( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysCancel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancel getNumDaysCancel_elem() {
    return (xsd.acord.NumDaysCancel) TYPE.get().getPropertyValue( this, "_NumDaysCancel_elem" );
  }


  public final void setNumDaysCancel_elem( xsd.acord.NumDaysCancel value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysCancel_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CancellationType getCancellationTypeCd() {
    return (xsd.acord.enums.CancellationType) TYPE.get().getPropertyValue( this, "_CancellationTypeCd" );
  }


  public final void setCancellationTypeCd( xsd.acord.enums.CancellationType value ) {
    TYPE.get().setPropertyValue( this, "_CancellationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancellationTypeCd getCancellationTypeCd_elem() {
    return (xsd.acord.CancellationTypeCd) TYPE.get().getPropertyValue( this, "_CancellationTypeCd_elem" );
  }


  public final void setCancellationTypeCd_elem( xsd.acord.CancellationTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_CancellationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCollateralInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_CollateralInd" );
  }


  public final void setCollateralInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_CollateralInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CollateralInd getCollateralInd_elem() {
    return (xsd.acord.CollateralInd) TYPE.get().getPropertyValue( this, "_CollateralInd_elem" );
  }


  public final void setCollateralInd_elem( xsd.acord.CollateralInd value ) {
    TYPE.get().setPropertyValue( this, "_CollateralInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExecutionDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExecutionDt" );
  }


  public final void setExecutionDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExecutionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExecutionDt getExecutionDt_elem() {
    return (xsd.acord.ExecutionDt) TYPE.get().getPropertyValue( this, "_ExecutionDt_elem" );
  }


  public final void setExecutionDt_elem( xsd.acord.ExecutionDt value ) {
    TYPE.get().setPropertyValue( this, "_ExecutionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RenewalMethod getRenewalMethodCd() {
    return (xsd.acord.enums.RenewalMethod) TYPE.get().getPropertyValue( this, "_RenewalMethodCd" );
  }


  public final void setRenewalMethodCd( xsd.acord.enums.RenewalMethod value ) {
    TYPE.get().setPropertyValue( this, "_RenewalMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RenewalMethodCd getRenewalMethodCd_elem() {
    return (xsd.acord.RenewalMethodCd) TYPE.get().getPropertyValue( this, "_RenewalMethodCd_elem" );
  }


  public final void setRenewalMethodCd_elem( xsd.acord.RenewalMethodCd value ) {
    TYPE.get().setPropertyValue( this, "_RenewalMethodCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSAAClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SAAClassCd" );
  }


  public final void setSAAClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SAAClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SAAClassCd getSAAClassCd_elem() {
    return (xsd.acord.SAAClassCd) TYPE.get().getPropertyValue( this, "_SAAClassCd_elem" );
  }


  public final void setSAAClassCd_elem( xsd.acord.SAAClassCd value ) {
    TYPE.get().setPropertyValue( this, "_SAAClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSAAContractTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SAAContractTypeCd" );
  }


  public final void setSAAContractTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SAAContractTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SAAContractTypeCd getSAAContractTypeCd_elem() {
    return (xsd.acord.SAAContractTypeCd) TYPE.get().getPropertyValue( this, "_SAAContractTypeCd_elem" );
  }


  public final void setSAAContractTypeCd_elem( xsd.acord.SAAContractTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_SAAContractTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountryCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CountryCd" );
  }


  public final void setCountryCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CountryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CountryCd getCountryCd_elem() {
    return (xsd.acord.CountryCd) TYPE.get().getPropertyValue( this, "_CountryCd_elem" );
  }


  public final void setCountryCd_elem( xsd.acord.CountryCd value ) {
    TYPE.get().setPropertyValue( this, "_CountryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProv() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProv" );
  }


  public final void setStateProv( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProv", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProv getStateProv_elem() {
    return (xsd.acord.StateProv) TYPE.get().getPropertyValue( this, "_StateProv_elem" );
  }


  public final void setStateProv_elem( xsd.acord.StateProv value ) {
    TYPE.get().setPropertyValue( this, "_StateProv_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CounterSignature getCounterSignature() {
    return (xsd.acord.CounterSignature) TYPE.get().getPropertyValue( this, "_CounterSignature" );
  }


  public final void setCounterSignature( xsd.acord.CounterSignature value ) {
    TYPE.get().setPropertyValue( this, "_CounterSignature", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysAdvanceRenewalNotice() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDaysAdvanceRenewalNotice" );
  }


  public final void setNumDaysAdvanceRenewalNotice( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysAdvanceRenewalNotice", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysAdvanceRenewalNotice getNumDaysAdvanceRenewalNotice_elem() {
    return (xsd.acord.NumDaysAdvanceRenewalNotice) TYPE.get().getPropertyValue( this, "_NumDaysAdvanceRenewalNotice_elem" );
  }


  public final void setNumDaysAdvanceRenewalNotice_elem( xsd.acord.NumDaysAdvanceRenewalNotice value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysAdvanceRenewalNotice_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPreviousBondNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PreviousBondNumber" );
  }


  public final void setPreviousBondNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PreviousBondNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PreviousBondNumber getPreviousBondNumber_elem() {
    return (xsd.acord.PreviousBondNumber) TYPE.get().getPropertyValue( this, "_PreviousBondNumber_elem" );
  }


  public final void setPreviousBondNumber_elem( xsd.acord.PreviousBondNumber value ) {
    TYPE.get().setPropertyValue( this, "_PreviousBondNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondCloseDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BondCloseDt" );
  }


  public final void setBondCloseDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BondCloseDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondCloseDt getBondCloseDt_elem() {
    return (xsd.acord.BondCloseDt) TYPE.get().getPropertyValue( this, "_BondCloseDt_elem" );
  }


  public final void setBondCloseDt_elem( xsd.acord.BondCloseDt value ) {
    TYPE.get().setPropertyValue( this, "_BondCloseDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NAICCd" );
  }


  public final void setNAICCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NAICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICCd getNAICCd_elem() {
    return (xsd.acord.NAICCd) TYPE.get().getPropertyValue( this, "_NAICCd_elem" );
  }


  public final void setNAICCd_elem( xsd.acord.NAICCd value ) {
    TYPE.get().setPropertyValue( this, "_NAICCd_elem", value );
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

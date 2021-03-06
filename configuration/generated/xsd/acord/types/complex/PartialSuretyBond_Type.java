/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PartialSuretyBond_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PartialSuretyBond_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondNumber = new javax.xml.namespace.QName( "", "BondNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondTerm = new javax.xml.namespace.QName( "", "BondTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondTermCd = new javax.xml.namespace.QName( "", "BondTermCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondTypeCd = new javax.xml.namespace.QName( "", "BondTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondLineDesc = new javax.xml.namespace.QName( "", "BondLineDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExecutionDt = new javax.xml.namespace.QName( "", "ExecutionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancellableInd = new javax.xml.namespace.QName( "", "CancellableInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenewalMethodCd = new javax.xml.namespace.QName( "", "RenewalMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FullTermAmt = new javax.xml.namespace.QName( "", "FullTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeAmt = new javax.xml.namespace.QName( "", "NetChangeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondAmt = new javax.xml.namespace.QName( "", "BondAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondPct = new javax.xml.namespace.QName( "", "BondPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommissionAmt = new javax.xml.namespace.QName( "", "CommissionAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeCommissionAmt = new javax.xml.namespace.QName( "", "NetChangeCommissionAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentAmt = new javax.xml.namespace.QName( "", "PaymentAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PartialSuretyBond_Type" );
    }
  };

  public PartialSuretyBond_Type() {
    super( 1151445474, TYPE.get() );
  }

  private PartialSuretyBond_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1151445474, state );
  }

  protected PartialSuretyBond_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PartialSuretyBond_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PartialSuretyBond_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PartialSuretyBond_Type get$TypeInstance() {
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
  public final xsd.acord.BondTerm getBondTerm() {
    return (xsd.acord.BondTerm) TYPE.get().getPropertyValue( this, "_BondTerm" );
  }


  public final void setBondTerm( xsd.acord.BondTerm value ) {
    TYPE.get().setPropertyValue( this, "_BondTerm", value );
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
  public final xsd.acord.enums.BondType getBondTypeCd() {
    return (xsd.acord.enums.BondType) TYPE.get().getPropertyValue( this, "_BondTypeCd" );
  }


  public final void setBondTypeCd( xsd.acord.enums.BondType value ) {
    TYPE.get().setPropertyValue( this, "_BondTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondTypeCd getBondTypeCd_elem() {
    return (xsd.acord.BondTypeCd) TYPE.get().getPropertyValue( this, "_BondTypeCd_elem" );
  }


  public final void setBondTypeCd_elem( xsd.acord.BondTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_BondTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBondLineDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BondLineDesc" );
  }


  public final void setBondLineDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BondLineDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondLineDesc getBondLineDesc_elem() {
    return (xsd.acord.BondLineDesc) TYPE.get().getPropertyValue( this, "_BondLineDesc_elem" );
  }


  public final void setBondLineDesc_elem( xsd.acord.BondLineDesc value ) {
    TYPE.get().setPropertyValue( this, "_BondLineDesc_elem", value );
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
  public final xsd.acord.CurrentTermAmt getCurrentTermAmt() {
    return (xsd.acord.CurrentTermAmt) TYPE.get().getPropertyValue( this, "_CurrentTermAmt" );
  }


  public final void setCurrentTermAmt( xsd.acord.CurrentTermAmt value ) {
    TYPE.get().setPropertyValue( this, "_CurrentTermAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FullTermAmt getFullTermAmt() {
    return (xsd.acord.FullTermAmt) TYPE.get().getPropertyValue( this, "_FullTermAmt" );
  }


  public final void setFullTermAmt( xsd.acord.FullTermAmt value ) {
    TYPE.get().setPropertyValue( this, "_FullTermAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NetChangeAmt getNetChangeAmt() {
    return (xsd.acord.NetChangeAmt) TYPE.get().getPropertyValue( this, "_NetChangeAmt" );
  }


  public final void setNetChangeAmt( xsd.acord.NetChangeAmt value ) {
    TYPE.get().setPropertyValue( this, "_NetChangeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WrittenAmt getWrittenAmt() {
    return (xsd.acord.WrittenAmt) TYPE.get().getPropertyValue( this, "_WrittenAmt" );
  }


  public final void setWrittenAmt( xsd.acord.WrittenAmt value ) {
    TYPE.get().setPropertyValue( this, "_WrittenAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondAmt getBondAmt() {
    return (xsd.acord.BondAmt) TYPE.get().getPropertyValue( this, "_BondAmt" );
  }


  public final void setBondAmt( xsd.acord.BondAmt value ) {
    TYPE.get().setPropertyValue( this, "_BondAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getBondPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_BondPct" );
  }


  public final void setBondPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_BondPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BondPct getBondPct_elem() {
    return (xsd.acord.BondPct) TYPE.get().getPropertyValue( this, "_BondPct_elem" );
  }


  public final void setBondPct_elem( xsd.acord.BondPct value ) {
    TYPE.get().setPropertyValue( this, "_BondPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommissionAmt getCommissionAmt() {
    return (xsd.acord.CommissionAmt) TYPE.get().getPropertyValue( this, "_CommissionAmt" );
  }


  public final void setCommissionAmt( xsd.acord.CommissionAmt value ) {
    TYPE.get().setPropertyValue( this, "_CommissionAmt", value );
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
  public final xsd.acord.NetChangeCommissionAmt getNetChangeCommissionAmt() {
    return (xsd.acord.NetChangeCommissionAmt) TYPE.get().getPropertyValue( this, "_NetChangeCommissionAmt" );
  }


  public final void setNetChangeCommissionAmt( xsd.acord.NetChangeCommissionAmt value ) {
    TYPE.get().setPropertyValue( this, "_NetChangeCommissionAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentAmt getPaymentAmt() {
    return (xsd.acord.PaymentAmt) TYPE.get().getPropertyValue( this, "_PaymentAmt" );
  }


  public final void setPaymentAmt( xsd.acord.PaymentAmt value ) {
    TYPE.get().setPropertyValue( this, "_PaymentAmt", value );
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

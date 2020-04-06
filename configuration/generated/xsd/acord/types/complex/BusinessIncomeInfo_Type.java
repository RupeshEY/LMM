/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BusinessIncomeInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BusinessIncomeInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InventoryAccountingMethodCd = new javax.xml.namespace.QName( "", "InventoryAccountingMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualGrossReceiptsAmt = new javax.xml.namespace.QName( "", "AnnualGrossReceiptsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualNetReceiptsAmt = new javax.xml.namespace.QName( "", "AnnualNetReceiptsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RecoveryPeriod = new javax.xml.namespace.QName( "", "RecoveryPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceToValuePct = new javax.xml.namespace.QName( "", "InsuranceToValuePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillableLostPeriod = new javax.xml.namespace.QName( "", "BillableLostPeriod", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BusinessIncomeInfo_Type" );
    }
  };

  public BusinessIncomeInfo_Type() {
    super( 1267925787, TYPE.get() );
  }

  private BusinessIncomeInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1267925787, state );
  }

  protected BusinessIncomeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BusinessIncomeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BusinessIncomeInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BusinessIncomeInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.InventoryAccountingMethod getInventoryAccountingMethodCd() {
    return (xsd.acord.enums.InventoryAccountingMethod) TYPE.get().getPropertyValue( this, "_InventoryAccountingMethodCd" );
  }


  public final void setInventoryAccountingMethodCd( xsd.acord.enums.InventoryAccountingMethod value ) {
    TYPE.get().setPropertyValue( this, "_InventoryAccountingMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InventoryAccountingMethodCd getInventoryAccountingMethodCd_elem() {
    return (xsd.acord.InventoryAccountingMethodCd) TYPE.get().getPropertyValue( this, "_InventoryAccountingMethodCd_elem" );
  }


  public final void setInventoryAccountingMethodCd_elem( xsd.acord.InventoryAccountingMethodCd value ) {
    TYPE.get().setPropertyValue( this, "_InventoryAccountingMethodCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualGrossReceiptsAmt getAnnualGrossReceiptsAmt() {
    return (xsd.acord.AnnualGrossReceiptsAmt) TYPE.get().getPropertyValue( this, "_AnnualGrossReceiptsAmt" );
  }


  public final void setAnnualGrossReceiptsAmt( xsd.acord.AnnualGrossReceiptsAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualGrossReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualNetReceiptsAmt getAnnualNetReceiptsAmt() {
    return (xsd.acord.AnnualNetReceiptsAmt) TYPE.get().getPropertyValue( this, "_AnnualNetReceiptsAmt" );
  }


  public final void setAnnualNetReceiptsAmt( xsd.acord.AnnualNetReceiptsAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualNetReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RecoveryPeriod getRecoveryPeriod() {
    return (xsd.acord.RecoveryPeriod) TYPE.get().getPropertyValue( this, "_RecoveryPeriod" );
  }


  public final void setRecoveryPeriod( xsd.acord.RecoveryPeriod value ) {
    TYPE.get().setPropertyValue( this, "_RecoveryPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getInsuranceToValuePct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_InsuranceToValuePct" );
  }


  public final void setInsuranceToValuePct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceToValuePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuranceToValuePct getInsuranceToValuePct_elem() {
    return (xsd.acord.InsuranceToValuePct) TYPE.get().getPropertyValue( this, "_InsuranceToValuePct_elem" );
  }


  public final void setInsuranceToValuePct_elem( xsd.acord.InsuranceToValuePct value ) {
    TYPE.get().setPropertyValue( this, "_InsuranceToValuePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillableLostPeriod getBillableLostPeriod() {
    return (xsd.acord.BillableLostPeriod) TYPE.get().getPropertyValue( this, "_BillableLostPeriod" );
  }


  public final void setBillableLostPeriod( xsd.acord.BillableLostPeriod value ) {
    TYPE.get().setPropertyValue( this, "_BillableLostPeriod", value );
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
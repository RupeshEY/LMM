/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PremiumBillingInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PremiumBillingInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Exposure = new javax.xml.namespace.QName( "", "Exposure", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumTypeCd = new javax.xml.namespace.QName( "", "PremiumTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAmt = new javax.xml.namespace.QName( "", "PremiumAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommissionRatePct = new javax.xml.namespace.QName( "", "CommissionRatePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommissionAmt = new javax.xml.namespace.QName( "", "CommissionAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossAmt = new javax.xml.namespace.QName( "", "GrossAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetAmt = new javax.xml.namespace.QName( "", "NetAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentOption = new javax.xml.namespace.QName( "", "PaymentOption", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PremiumBillingInfo_Type" );
    }
  };

  public PremiumBillingInfo_Type() {
    super( 308302560, TYPE.get() );
  }

  private PremiumBillingInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 308302560, state );
  }

  protected PremiumBillingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PremiumBillingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PremiumBillingInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PremiumBillingInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getExposure() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Exposure" );
  }


  public final void setExposure( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Exposure", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Exposure getExposure_elem() {
    return (xsd.acord.Exposure) TYPE.get().getPropertyValue( this, "_Exposure_elem" );
  }


  public final void setExposure_elem( xsd.acord.Exposure value ) {
    TYPE.get().setPropertyValue( this, "_Exposure_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getRate() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_Rate" );
  }


  public final void setRate( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_Rate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Rate getRate_elem() {
    return (xsd.acord.Rate) TYPE.get().getPropertyValue( this, "_Rate_elem" );
  }


  public final void setRate_elem( xsd.acord.Rate value ) {
    TYPE.get().setPropertyValue( this, "_Rate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PremiumBase getPremiumBasisCd() {
    return (xsd.acord.enums.PremiumBase) TYPE.get().getPropertyValue( this, "_PremiumBasisCd" );
  }


  public final void setPremiumBasisCd( xsd.acord.enums.PremiumBase value ) {
    TYPE.get().setPropertyValue( this, "_PremiumBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumBasisCd getPremiumBasisCd_elem() {
    return (xsd.acord.PremiumBasisCd) TYPE.get().getPropertyValue( this, "_PremiumBasisCd_elem" );
  }


  public final void setPremiumBasisCd_elem( xsd.acord.PremiumBasisCd value ) {
    TYPE.get().setPropertyValue( this, "_PremiumBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PremiumType getPremiumTypeCd() {
    return (xsd.acord.enums.PremiumType) TYPE.get().getPropertyValue( this, "_PremiumTypeCd" );
  }


  public final void setPremiumTypeCd( xsd.acord.enums.PremiumType value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumTypeCd getPremiumTypeCd_elem() {
    return (xsd.acord.PremiumTypeCd) TYPE.get().getPropertyValue( this, "_PremiumTypeCd_elem" );
  }


  public final void setPremiumTypeCd_elem( xsd.acord.PremiumTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_PremiumTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumAmt getPremiumAmt() {
    return (xsd.acord.PremiumAmt) TYPE.get().getPropertyValue( this, "_PremiumAmt" );
  }


  public final void setPremiumAmt( xsd.acord.PremiumAmt value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getCommissionRatePct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_CommissionRatePct" );
  }


  public final void setCommissionRatePct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_CommissionRatePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommissionRatePct getCommissionRatePct_elem() {
    return (xsd.acord.CommissionRatePct) TYPE.get().getPropertyValue( this, "_CommissionRatePct_elem" );
  }


  public final void setCommissionRatePct_elem( xsd.acord.CommissionRatePct value ) {
    TYPE.get().setPropertyValue( this, "_CommissionRatePct_elem", value );
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
  public final xsd.acord.GrossAmt getGrossAmt() {
    return (xsd.acord.GrossAmt) TYPE.get().getPropertyValue( this, "_GrossAmt" );
  }


  public final void setGrossAmt( xsd.acord.GrossAmt value ) {
    TYPE.get().setPropertyValue( this, "_GrossAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NetAmt getNetAmt() {
    return (xsd.acord.NetAmt) TYPE.get().getPropertyValue( this, "_NetAmt" );
  }


  public final void setNetAmt( xsd.acord.NetAmt value ) {
    TYPE.get().setPropertyValue( this, "_NetAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentOption getPaymentOption() {
    return (xsd.acord.PaymentOption) TYPE.get().getPropertyValue( this, "_PaymentOption" );
  }


  public final void setPaymentOption( xsd.acord.PaymentOption value ) {
    TYPE.get().setPropertyValue( this, "_PaymentOption", value );
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
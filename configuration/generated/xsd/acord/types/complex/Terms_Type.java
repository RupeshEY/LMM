/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Terms_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Terms_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondAmt = new javax.xml.namespace.QName( "", "BondAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BondPct = new javax.xml.namespace.QName( "", "BondPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialGuaranteesDesc = new javax.xml.namespace.QName( "", "SpecialGuaranteesDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RateTypeCd = new javax.xml.namespace.QName( "", "RateTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretyTermsTypeCd = new javax.xml.namespace.QName( "", "SuretyTermsTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rating = new javax.xml.namespace.QName( "", "Rating", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBilling = new javax.xml.namespace.QName( "", "PremiumBilling", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentAmt = new javax.xml.namespace.QName( "", "PaymentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaintenanceAmt = new javax.xml.namespace.QName( "", "MaintenanceAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SAAMaintenanceClassCd = new javax.xml.namespace.QName( "", "SAAMaintenanceClassCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Terms_Type" );
    }
  };

  public Terms_Type() {
    super( 842944537, TYPE.get() );
  }

  private Terms_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 842944537, state );
  }

  protected Terms_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Terms_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Terms_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Terms_Type get$TypeInstance() {
    return this;
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
  public final java.lang.String getSpecialGuaranteesDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SpecialGuaranteesDesc" );
  }


  public final void setSpecialGuaranteesDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SpecialGuaranteesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SpecialGuaranteesDesc getSpecialGuaranteesDesc_elem() {
    return (xsd.acord.SpecialGuaranteesDesc) TYPE.get().getPropertyValue( this, "_SpecialGuaranteesDesc_elem" );
  }


  public final void setSpecialGuaranteesDesc_elem( xsd.acord.SpecialGuaranteesDesc value ) {
    TYPE.get().setPropertyValue( this, "_SpecialGuaranteesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EffectiveDt getEffectiveDt_elem() {
    return (xsd.acord.EffectiveDt) TYPE.get().getPropertyValue( this, "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( xsd.acord.EffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRateTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RateTypeCd" );
  }


  public final void setRateTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RateTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RateTypeCd getRateTypeCd_elem() {
    return (xsd.acord.RateTypeCd) TYPE.get().getPropertyValue( this, "_RateTypeCd_elem" );
  }


  public final void setRateTypeCd_elem( xsd.acord.RateTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_RateTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SuretyTermsType getSuretyTermsTypeCd() {
    return (xsd.acord.enums.SuretyTermsType) TYPE.get().getPropertyValue( this, "_SuretyTermsTypeCd" );
  }


  public final void setSuretyTermsTypeCd( xsd.acord.enums.SuretyTermsType value ) {
    TYPE.get().setPropertyValue( this, "_SuretyTermsTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SuretyTermsTypeCd getSuretyTermsTypeCd_elem() {
    return (xsd.acord.SuretyTermsTypeCd) TYPE.get().getPropertyValue( this, "_SuretyTermsTypeCd_elem" );
  }


  public final void setSuretyTermsTypeCd_elem( xsd.acord.SuretyTermsTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_SuretyTermsTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Form getForm() {
    return (xsd.acord.Form) TYPE.get().getPropertyValue( this, "_Form" );
  }


  public final void setForm( xsd.acord.Form value ) {
    TYPE.get().setPropertyValue( this, "_Form", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Rating> getRating() {
    return (java.util.List<xsd.acord.Rating>) TYPE.get().getPropertyValue( this, "_Rating" );
  }


  public final void setRating( java.util.List<xsd.acord.Rating> value ) {
    TYPE.get().setPropertyValue( this, "_Rating", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PremiumBilling> getPremiumBilling() {
    return (java.util.List<xsd.acord.PremiumBilling>) TYPE.get().getPropertyValue( this, "_PremiumBilling" );
  }


  public final void setPremiumBilling( java.util.List<xsd.acord.PremiumBilling> value ) {
    TYPE.get().setPropertyValue( this, "_PremiumBilling", value );
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
  public final xsd.acord.MaintenanceAmt getMaintenanceAmt() {
    return (xsd.acord.MaintenanceAmt) TYPE.get().getPropertyValue( this, "_MaintenanceAmt" );
  }


  public final void setMaintenanceAmt( xsd.acord.MaintenanceAmt value ) {
    TYPE.get().setPropertyValue( this, "_MaintenanceAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSAAMaintenanceClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SAAMaintenanceClassCd" );
  }


  public final void setSAAMaintenanceClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SAAMaintenanceClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SAAMaintenanceClassCd getSAAMaintenanceClassCd_elem() {
    return (xsd.acord.SAAMaintenanceClassCd) TYPE.get().getPropertyValue( this, "_SAAMaintenanceClassCd_elem" );
  }


  public final void setSAAMaintenanceClassCd_elem( xsd.acord.SAAMaintenanceClassCd value ) {
    TYPE.get().setPropertyValue( this, "_SAAMaintenanceClassCd_elem", value );
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

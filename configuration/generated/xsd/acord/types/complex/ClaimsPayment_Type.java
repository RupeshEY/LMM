/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsPayment_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsPayment_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentTypeCd = new javax.xml.namespace.QName( "", "PaymentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPaymentCovInfo = new javax.xml.namespace.QName( "", "ClaimsPaymentCovInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPaymentAmt = new javax.xml.namespace.QName( "", "TotalPaymentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseCd = new javax.xml.namespace.QName( "", "LossCauseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MethodPaymentCd = new javax.xml.namespace.QName( "", "MethodPaymentCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CheckNumber = new javax.xml.namespace.QName( "", "CheckNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentDt = new javax.xml.namespace.QName( "", "PaymentDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceDuration = new javax.xml.namespace.QName( "", "ServiceDuration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentDesc = new javax.xml.namespace.QName( "", "PaymentDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReserveChangeInfo = new javax.xml.namespace.QName( "", "ReserveChangeInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_IdRef = new javax.xml.namespace.QName( "", "IdRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClaimsPayment_Type" );
    }
  };

  public ClaimsPayment_Type() {
    super( -1273446063, TYPE.get() );
  }

  private ClaimsPayment_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1273446063, state );
  }

  protected ClaimsPayment_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsPayment_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ClaimsPayment_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ClaimsPayment_Type get$TypeInstance() {
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
  public final xsd.acord.enums.PaymentType getPaymentTypeCd() {
    return (xsd.acord.enums.PaymentType) TYPE.get().getPropertyValue( this, "_PaymentTypeCd" );
  }


  public final void setPaymentTypeCd( xsd.acord.enums.PaymentType value ) {
    TYPE.get().setPropertyValue( this, "_PaymentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentTypeCd getPaymentTypeCd_elem() {
    return (xsd.acord.PaymentTypeCd) TYPE.get().getPropertyValue( this, "_PaymentTypeCd_elem" );
  }


  public final void setPaymentTypeCd_elem( xsd.acord.PaymentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsPaymentCovInfo> getClaimsPaymentCovInfo() {
    return (java.util.List<xsd.acord.ClaimsPaymentCovInfo>) TYPE.get().getPropertyValue( this, "_ClaimsPaymentCovInfo" );
  }


  public final void setClaimsPaymentCovInfo( java.util.List<xsd.acord.ClaimsPaymentCovInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPaymentCovInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPaymentAmt getTotalPaymentAmt() {
    return (xsd.acord.TotalPaymentAmt) TYPE.get().getPropertyValue( this, "_TotalPaymentAmt" );
  }


  public final void setTotalPaymentAmt( xsd.acord.TotalPaymentAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalPaymentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossCauseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossCauseCd" );
  }


  public final void setLossCauseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossCauseCd getLossCauseCd_elem() {
    return (xsd.acord.LossCauseCd) TYPE.get().getPropertyValue( this, "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( xsd.acord.LossCauseCd value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.MethodOfPayment getMethodPaymentCd() {
    return (xsd.acord.enums.MethodOfPayment) TYPE.get().getPropertyValue( this, "_MethodPaymentCd" );
  }


  public final void setMethodPaymentCd( xsd.acord.enums.MethodOfPayment value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MethodPaymentCd getMethodPaymentCd_elem() {
    return (xsd.acord.MethodPaymentCd) TYPE.get().getPropertyValue( this, "_MethodPaymentCd_elem" );
  }


  public final void setMethodPaymentCd_elem( xsd.acord.MethodPaymentCd value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCheckNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CheckNumber" );
  }


  public final void setCheckNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CheckNumber getCheckNumber_elem() {
    return (xsd.acord.CheckNumber) TYPE.get().getPropertyValue( this, "_CheckNumber_elem" );
  }


  public final void setCheckNumber_elem( xsd.acord.CheckNumber value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentDt" );
  }


  public final void setPaymentDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentDt getPaymentDt_elem() {
    return (xsd.acord.PaymentDt) TYPE.get().getPropertyValue( this, "_PaymentDt_elem" );
  }


  public final void setPaymentDt_elem( xsd.acord.PaymentDt value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ServiceDuration getServiceDuration() {
    return (xsd.acord.ServiceDuration) TYPE.get().getPropertyValue( this, "_ServiceDuration" );
  }


  public final void setServiceDuration( xsd.acord.ServiceDuration value ) {
    TYPE.get().setPropertyValue( this, "_ServiceDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuredOrPrincipal getInsuredOrPrincipal() {
    return (xsd.acord.InsuredOrPrincipal) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( xsd.acord.InsuredOrPrincipal value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentDesc" );
  }


  public final void setPaymentDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentDesc getPaymentDesc_elem() {
    return (xsd.acord.PaymentDesc) TYPE.get().getPropertyValue( this, "_PaymentDesc_elem" );
  }


  public final void setPaymentDesc_elem( xsd.acord.PaymentDesc value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ReserveChangeInfo> getReserveChangeInfo() {
    return (java.util.List<xsd.acord.ReserveChangeInfo>) TYPE.get().getPropertyValue( this, "_ReserveChangeInfo" );
  }


  public final void setReserveChangeInfo( java.util.List<xsd.acord.ReserveChangeInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ReserveChangeInfo", value );
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
  public final gw.xml.XmlElement getIdRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_IdRef" );
  }


  public final void setIdRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_IdRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClaimsPartyRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ClaimsPartyRef" );
  }


  public final void setClaimsPartyRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRef", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsPayment extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

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
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Idref = new javax.xml.namespace.QName( "", "idref", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimsPayment" );
    }
  };

  public ClaimsPayment() {
    super( 1271286749, TYPE.get() );
  }

  private ClaimsPayment( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1271286749, state );
  }

  protected ClaimsPayment( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsPayment( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ClaimsPayment> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ClaimsPayment get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PaymentTypeCd" );
  }


  public final void setPaymentTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PaymentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentTypeCd getPaymentTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentTypeCd) TYPE.get().getPropertyValue( this, "_PaymentTypeCd_elem" );
  }


  public final void setPaymentTypeCd_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_PaymentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsPaymentCovInfo> getClaimsPaymentCovInfo() {
    return (java.util.List<xsd.iso.req.ClaimsPaymentCovInfo>) TYPE.get().getPropertyValue( this, "_ClaimsPaymentCovInfo" );
  }


  public final void setClaimsPaymentCovInfo( java.util.List<xsd.iso.req.ClaimsPaymentCovInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPaymentCovInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_TotalPaymentAmt getTotalPaymentAmt() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_TotalPaymentAmt) TYPE.get().getPropertyValue( this, "_TotalPaymentAmt" );
  }


  public final void setTotalPaymentAmt( xsd.iso.req.anonymous.elements.ClaimsPayment_TotalPaymentAmt value ) {
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
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_LossCauseCd getLossCauseCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_LossCauseCd) TYPE.get().getPropertyValue( this, "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_LossCauseCd value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMethodPaymentCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MethodPaymentCd" );
  }


  public final void setMethodPaymentCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MethodPaymentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_MethodPaymentCd getMethodPaymentCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_MethodPaymentCd) TYPE.get().getPropertyValue( this, "_MethodPaymentCd_elem" );
  }


  public final void setMethodPaymentCd_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_MethodPaymentCd value ) {
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
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_CheckNumber getCheckNumber_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_CheckNumber) TYPE.get().getPropertyValue( this, "_CheckNumber_elem" );
  }


  public final void setCheckNumber_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_CheckNumber value ) {
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
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDt getPaymentDt_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDt) TYPE.get().getPropertyValue( this, "_PaymentDt_elem" );
  }


  public final void setPaymentDt_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDt value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_ServiceDuration getServiceDuration() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_ServiceDuration) TYPE.get().getPropertyValue( this, "_ServiceDuration" );
  }


  public final void setServiceDuration( xsd.iso.req.anonymous.elements.ClaimsPayment_ServiceDuration value ) {
    TYPE.get().setPropertyValue( this, "_ServiceDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.InsuredOrPrincipal getInsuredOrPrincipal() {
    return (xsd.iso.req.InsuredOrPrincipal) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( xsd.iso.req.InsuredOrPrincipal value ) {
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
  public final xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDesc getPaymentDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDesc) TYPE.get().getPropertyValue( this, "_PaymentDesc_elem" );
  }


  public final void setPaymentDesc_elem( xsd.iso.req.anonymous.elements.ClaimsPayment_PaymentDesc value ) {
    TYPE.get().setPropertyValue( this, "_PaymentDesc_elem", value );
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
  public final gw.xml.XmlElement getIdref() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_Idref" );
  }


  public final void setIdref( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_Idref", value );
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

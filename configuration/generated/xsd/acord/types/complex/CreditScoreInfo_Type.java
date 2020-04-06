/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CreditScoreInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CreditScoreInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferenceNumber = new javax.xml.namespace.QName( "", "ReferenceNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScore = new javax.xml.namespace.QName( "", "CreditScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScoreDt = new javax.xml.namespace.QName( "", "CreditScoreDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSPolicyTypeCd = new javax.xml.namespace.QName( "", "CSPolicyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSReasonCd = new javax.xml.namespace.QName( "", "CSReasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSReasonDesc = new javax.xml.namespace.QName( "", "CSReasonDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InsuredOrPrincipalRef = new javax.xml.namespace.QName( "", "InsuredOrPrincipalRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CreditScoreInfo_Type" );
    }
  };

  public CreditScoreInfo_Type() {
    super( 357903737, TYPE.get() );
  }

  private CreditScoreInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 357903737, state );
  }

  protected CreditScoreInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CreditScoreInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CreditScoreInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CreditScoreInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReferenceNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReferenceNumber" );
  }


  public final void setReferenceNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReferenceNumber getReferenceNumber_elem() {
    return (xsd.acord.ReferenceNumber) TYPE.get().getPropertyValue( this, "_ReferenceNumber_elem" );
  }


  public final void setReferenceNumber_elem( xsd.acord.ReferenceNumber value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreditScore() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CreditScore" );
  }


  public final void setCreditScore( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CreditScore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CreditScore getCreditScore_elem() {
    return (xsd.acord.CreditScore) TYPE.get().getPropertyValue( this, "_CreditScore_elem" );
  }


  public final void setCreditScore_elem( xsd.acord.CreditScore value ) {
    TYPE.get().setPropertyValue( this, "_CreditScore_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreditScoreDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CreditScoreDt" );
  }


  public final void setCreditScoreDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CreditScoreDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CreditScoreDt getCreditScoreDt_elem() {
    return (xsd.acord.CreditScoreDt) TYPE.get().getPropertyValue( this, "_CreditScoreDt_elem" );
  }


  public final void setCreditScoreDt_elem( xsd.acord.CreditScoreDt value ) {
    TYPE.get().setPropertyValue( this, "_CreditScoreDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCSPolicyTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CSPolicyTypeCd" );
  }


  public final void setCSPolicyTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CSPolicyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CSPolicyTypeCd getCSPolicyTypeCd_elem() {
    return (xsd.acord.CSPolicyTypeCd) TYPE.get().getPropertyValue( this, "_CSPolicyTypeCd_elem" );
  }


  public final void setCSPolicyTypeCd_elem( xsd.acord.CSPolicyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_CSPolicyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getCSReasonCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_CSReasonCd" );
  }


  public final void setCSReasonCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_CSReasonCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CSReasonCd> getCSReasonCd_elem() {
    return (java.util.List<xsd.acord.CSReasonCd>) TYPE.get().getPropertyValue( this, "_CSReasonCd_elem" );
  }


  public final void setCSReasonCd_elem( java.util.List<xsd.acord.CSReasonCd> value ) {
    TYPE.get().setPropertyValue( this, "_CSReasonCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCSReasonDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CSReasonDesc" );
  }


  public final void setCSReasonDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CSReasonDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CSReasonDesc getCSReasonDesc_elem() {
    return (xsd.acord.CSReasonDesc) TYPE.get().getPropertyValue( this, "_CSReasonDesc_elem" );
  }


  public final void setCSReasonDesc_elem( xsd.acord.CSReasonDesc value ) {
    TYPE.get().setPropertyValue( this, "_CSReasonDesc_elem", value );
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
  public final gw.xml.XmlElement getInsuredOrPrincipalRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRef" );
  }


  public final void setInsuredOrPrincipalRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRef", value );
  }

}
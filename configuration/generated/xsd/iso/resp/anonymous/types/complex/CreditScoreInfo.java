/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CreditScoreInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferenceNumber = new javax.xml.namespace.QName( "", "ReferenceNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScore = new javax.xml.namespace.QName( "", "CreditScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditScoreDt = new javax.xml.namespace.QName( "", "CreditScoreDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSPolicyTypeCd = new javax.xml.namespace.QName( "", "CSPolicyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSReasonCd = new javax.xml.namespace.QName( "", "CSReasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CSReasonDesc = new javax.xml.namespace.QName( "", "CSReasonDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.CreditScoreInfo" );
    }
  };

  public CreditScoreInfo() {
    super( 1340971779, TYPE.get() );
  }

  private CreditScoreInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1340971779, state );
  }

  protected CreditScoreInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CreditScoreInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.CreditScoreInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.CreditScoreInfo get$TypeInstance() {
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
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_ReferenceNumber getReferenceNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_ReferenceNumber) TYPE.get().getPropertyValue( this, "_ReferenceNumber_elem" );
  }


  public final void setReferenceNumber_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_ReferenceNumber value ) {
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
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScore getCreditScore_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScore) TYPE.get().getPropertyValue( this, "_CreditScore_elem" );
  }


  public final void setCreditScore_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScore value ) {
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
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScoreDt getCreditScoreDt_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScoreDt) TYPE.get().getPropertyValue( this, "_CreditScoreDt_elem" );
  }


  public final void setCreditScoreDt_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_CreditScoreDt value ) {
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
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSPolicyTypeCd getCSPolicyTypeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSPolicyTypeCd) TYPE.get().getPropertyValue( this, "_CSPolicyTypeCd_elem" );
  }


  public final void setCSPolicyTypeCd_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSPolicyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_CSPolicyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCSReasonCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CSReasonCd" );
  }


  public final void setCSReasonCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CSReasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonCd getCSReasonCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonCd) TYPE.get().getPropertyValue( this, "_CSReasonCd_elem" );
  }


  public final void setCSReasonCd_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonCd value ) {
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
  public final xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonDesc getCSReasonDesc_elem() {
    return (xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonDesc) TYPE.get().getPropertyValue( this, "_CSReasonDesc_elem" );
  }


  public final void setCSReasonDesc_elem( xsd.iso.resp.anonymous.elements.CreditScoreInfo_CSReasonDesc value ) {
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

}
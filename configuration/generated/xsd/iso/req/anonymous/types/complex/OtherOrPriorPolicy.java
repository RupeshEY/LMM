/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class OtherOrPriorPolicy extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyCd = new javax.xml.namespace.QName( "", "PolicyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerName = new javax.xml.namespace.QName( "", "InsurerName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractTerm = new javax.xml.namespace.QName( "", "ContractTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OriginalInceptionDt = new javax.xml.namespace.QName( "", "OriginalInceptionDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTerminatedCd = new javax.xml.namespace.QName( "", "PolicyTerminatedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyTransferInd = new javax.xml.namespace.QName( "", "PolicyTransferInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeWithPreviousInsurer = new javax.xml.namespace.QName( "", "LengthTimeWithPreviousInsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyAmt = new javax.xml.namespace.QName( "", "PolicyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingFactor = new javax.xml.namespace.QName( "", "RatingFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyProductCd = new javax.xml.namespace.QName( "", "CompanyProductCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.OtherOrPriorPolicy" );
    }
  };

  public OtherOrPriorPolicy() {
    super( -1043994437, TYPE.get() );
  }

  private OtherOrPriorPolicy( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1043994437, state );
  }

  protected OtherOrPriorPolicy( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected OtherOrPriorPolicy( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.OtherOrPriorPolicy> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.OtherOrPriorPolicy get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyCd" );
  }


  public final void setPolicyCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyCd getPolicyCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyCd) TYPE.get().getPropertyValue( this, "_PolicyCd_elem" );
  }


  public final void setPolicyCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyCd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyNumber getPolicyNumber_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLOBCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LOBCd" );
  }


  public final void setLOBCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBCd getLOBCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBCd) TYPE.get().getPropertyValue( this, "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLOBSubCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LOBSubCd" );
  }


  public final void setLOBSubCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBSubCd getLOBSubCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBSubCd) TYPE.get().getPropertyValue( this, "_LOBSubCd_elem" );
  }


  public final void setLOBSubCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LOBSubCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd_elem", value );
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
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_NAICCd getNAICCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_NAICCd) TYPE.get().getPropertyValue( this, "_NAICCd_elem" );
  }


  public final void setNAICCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_NAICCd value ) {
    TYPE.get().setPropertyValue( this, "_NAICCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerName" );
  }


  public final void setInsurerName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_InsurerName getInsurerName_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_InsurerName) TYPE.get().getPropertyValue( this, "_InsurerName_elem" );
  }


  public final void setInsurerName_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_InsurerName value ) {
    TYPE.get().setPropertyValue( this, "_InsurerName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_ContractTerm getContractTerm() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_ContractTerm) TYPE.get().getPropertyValue( this, "_ContractTerm" );
  }


  public final void setContractTerm( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_ContractTerm value ) {
    TYPE.get().setPropertyValue( this, "_ContractTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOriginalInceptionDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OriginalInceptionDt" );
  }


  public final void setOriginalInceptionDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OriginalInceptionDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_OriginalInceptionDt getOriginalInceptionDt_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_OriginalInceptionDt) TYPE.get().getPropertyValue( this, "_OriginalInceptionDt_elem" );
  }


  public final void setOriginalInceptionDt_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_OriginalInceptionDt value ) {
    TYPE.get().setPropertyValue( this, "_OriginalInceptionDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyTerminatedCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyTerminatedCd" );
  }


  public final void setPolicyTerminatedCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTerminatedCd getPolicyTerminatedCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTerminatedCd) TYPE.get().getPropertyValue( this, "_PolicyTerminatedCd_elem" );
  }


  public final void setPolicyTerminatedCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTerminatedCd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTerminatedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyTransferInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyTransferInd" );
  }


  public final void setPolicyTransferInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTransferInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTransferInd getPolicyTransferInd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTransferInd) TYPE.get().getPropertyValue( this, "_PolicyTransferInd_elem" );
  }


  public final void setPolicyTransferInd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyTransferInd value ) {
    TYPE.get().setPropertyValue( this, "_PolicyTransferInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LengthTimeWithPreviousInsurer getLengthTimeWithPreviousInsurer() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LengthTimeWithPreviousInsurer) TYPE.get().getPropertyValue( this, "_LengthTimeWithPreviousInsurer" );
  }


  public final void setLengthTimeWithPreviousInsurer( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_LengthTimeWithPreviousInsurer value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeWithPreviousInsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Coverage> getCoverage() {
    return (java.util.List<xsd.iso.req.Coverage>) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.iso.req.Coverage> value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyAmt getPolicyAmt() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyAmt) TYPE.get().getPropertyValue( this, "_PolicyAmt" );
  }


  public final void setPolicyAmt( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_PolicyAmt value ) {
    TYPE.get().setPropertyValue( this, "_PolicyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingFactor() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RatingFactor" );
  }


  public final void setRatingFactor( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RatingFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_RatingFactor getRatingFactor_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_RatingFactor) TYPE.get().getPropertyValue( this, "_RatingFactor_elem" );
  }


  public final void setRatingFactor_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_RatingFactor value ) {
    TYPE.get().setPropertyValue( this, "_RatingFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanyProductCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CompanyProductCd" );
  }


  public final void setCompanyProductCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CompanyProductCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_CompanyProductCd getCompanyProductCd_elem() {
    return (xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_CompanyProductCd) TYPE.get().getPropertyValue( this, "_CompanyProductCd_elem" );
  }


  public final void setCompanyProductCd_elem( xsd.iso.req.anonymous.elements.OtherOrPriorPolicy_CompanyProductCd value ) {
    TYPE.get().setPropertyValue( this, "_CompanyProductCd_elem", value );
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

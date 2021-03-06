/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class LiabilityLossInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "LiabilityLossInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubjectInsuranceCd = new javax.xml.namespace.QName( "", "SubjectInsuranceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredInterestCd = new javax.xml.namespace.QName( "", "InsuredInterestCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDesc = new javax.xml.namespace.QName( "", "ItemDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ObjectLossDesc = new javax.xml.namespace.QName( "", "ObjectLossDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereSeenDesc = new javax.xml.namespace.QName( "", "WhereSeenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceInd = new javax.xml.namespace.QName( "", "OtherInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherExposureDesc = new javax.xml.namespace.QName( "", "OtherExposureDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProbableIncurredAmt = new javax.xml.namespace.QName( "", "ProbableIncurredAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ViewItemRef = new javax.xml.namespace.QName( "", "ViewItemRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRef = new javax.xml.namespace.QName( "", "ClaimsPartyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.LiabilityLossInfo_Type" );
    }
  };

  public LiabilityLossInfo_Type() {
    super( 1331728098, TYPE.get() );
  }

  private LiabilityLossInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1331728098, state );
  }

  protected LiabilityLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected LiabilityLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.LiabilityLossInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.LiabilityLossInfo_Type get$TypeInstance() {
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
  public final java.util.List<xsd.acord.enums.Risk> getSubjectInsuranceCd() {
    return (java.util.List<xsd.acord.enums.Risk>) TYPE.get().getPropertyValue( this, "_SubjectInsuranceCd" );
  }


  public final void setSubjectInsuranceCd( java.util.List<xsd.acord.enums.Risk> value ) {
    TYPE.get().setPropertyValue( this, "_SubjectInsuranceCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SubjectInsuranceCd> getSubjectInsuranceCd_elem() {
    return (java.util.List<xsd.acord.SubjectInsuranceCd>) TYPE.get().getPropertyValue( this, "_SubjectInsuranceCd_elem" );
  }


  public final void setSubjectInsuranceCd_elem( java.util.List<xsd.acord.SubjectInsuranceCd> value ) {
    TYPE.get().setPropertyValue( this, "_SubjectInsuranceCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Interest getInsuredInterestCd() {
    return (xsd.acord.enums.Interest) TYPE.get().getPropertyValue( this, "_InsuredInterestCd" );
  }


  public final void setInsuredInterestCd( xsd.acord.enums.Interest value ) {
    TYPE.get().setPropertyValue( this, "_InsuredInterestCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuredInterestCd getInsuredInterestCd_elem() {
    return (xsd.acord.InsuredInterestCd) TYPE.get().getPropertyValue( this, "_InsuredInterestCd_elem" );
  }


  public final void setInsuredInterestCd_elem( xsd.acord.InsuredInterestCd value ) {
    TYPE.get().setPropertyValue( this, "_InsuredInterestCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getItemDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ItemDesc" );
  }


  public final void setItemDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ItemDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemDesc getItemDesc_elem() {
    return (xsd.acord.ItemDesc) TYPE.get().getPropertyValue( this, "_ItemDesc_elem" );
  }


  public final void setItemDesc_elem( xsd.acord.ItemDesc value ) {
    TYPE.get().setPropertyValue( this, "_ItemDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getObjectLossDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ObjectLossDesc" );
  }


  public final void setObjectLossDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ObjectLossDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ObjectLossDesc getObjectLossDesc_elem() {
    return (xsd.acord.ObjectLossDesc) TYPE.get().getPropertyValue( this, "_ObjectLossDesc_elem" );
  }


  public final void setObjectLossDesc_elem( xsd.acord.ObjectLossDesc value ) {
    TYPE.get().setPropertyValue( this, "_ObjectLossDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWhereSeenDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WhereSeenDesc" );
  }


  public final void setWhereSeenDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WhereSeenDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WhereSeenDesc getWhereSeenDesc_elem() {
    return (xsd.acord.WhereSeenDesc) TYPE.get().getPropertyValue( this, "_WhereSeenDesc_elem" );
  }


  public final void setWhereSeenDesc_elem( xsd.acord.WhereSeenDesc value ) {
    TYPE.get().setPropertyValue( this, "_WhereSeenDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOtherInsuranceInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd" );
  }


  public final void setOtherInsuranceInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherInsuranceInd getOtherInsuranceInd_elem() {
    return (xsd.acord.OtherInsuranceInd) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd_elem" );
  }


  public final void setOtherInsuranceInd_elem( xsd.acord.OtherInsuranceInd value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPE.get().getPropertyValue( this, "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherExposureDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherExposureDesc" );
  }


  public final void setOtherExposureDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherExposureDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherExposureDesc getOtherExposureDesc_elem() {
    return (xsd.acord.OtherExposureDesc) TYPE.get().getPropertyValue( this, "_OtherExposureDesc_elem" );
  }


  public final void setOtherExposureDesc_elem( xsd.acord.OtherExposureDesc value ) {
    TYPE.get().setPropertyValue( this, "_OtherExposureDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProbableIncurredAmt getProbableIncurredAmt() {
    return (xsd.acord.ProbableIncurredAmt) TYPE.get().getPropertyValue( this, "_ProbableIncurredAmt" );
  }


  public final void setProbableIncurredAmt( xsd.acord.ProbableIncurredAmt value ) {
    TYPE.get().setPropertyValue( this, "_ProbableIncurredAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
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
  public final gw.xml.XmlElement getViewItemRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ViewItemRef" );
  }


  public final void setViewItemRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ViewItemRef", value );
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

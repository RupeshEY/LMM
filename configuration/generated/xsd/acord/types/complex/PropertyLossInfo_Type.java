/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PropertyLossInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PropertyLossInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BldgNumberId = new javax.xml.namespace.QName( "", "BldgNumberId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemInfo = new javax.xml.namespace.QName( "", "ItemInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Watercraft = new javax.xml.namespace.QName( "", "Watercraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySchedule = new javax.xml.namespace.QName( "", "PropertySchedule", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSubjectInsuranceInfo = new javax.xml.namespace.QName( "", "ClaimsSubjectInsuranceInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RealEstateTypeCd = new javax.xml.namespace.QName( "", "RealEstateTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RealEstateTypeOtherDesc = new javax.xml.namespace.QName( "", "RealEstateTypeOtherDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubjectInsuranceCd = new javax.xml.namespace.QName( "", "SubjectInsuranceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossKindCd = new javax.xml.namespace.QName( "", "LossKindCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ObjectLossDesc = new javax.xml.namespace.QName( "", "ObjectLossDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DamageDesc = new javax.xml.namespace.QName( "", "DamageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereSeenDesc = new javax.xml.namespace.QName( "", "WhereSeenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceInd = new javax.xml.namespace.QName( "", "OtherInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MortgageeInd = new javax.xml.namespace.QName( "", "MortgageeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupancyTypeCd = new javax.xml.namespace.QName( "", "OccupancyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncendiaryFireInd = new javax.xml.namespace.QName( "", "IncendiaryFireInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TheftLocationCd = new javax.xml.namespace.QName( "", "TheftLocationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProbableIncurredAmt = new javax.xml.namespace.QName( "", "ProbableIncurredAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ViewItemRef = new javax.xml.namespace.QName( "", "ViewItemRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LossPayeeRef = new javax.xml.namespace.QName( "", "LossPayeeRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRefs = new javax.xml.namespace.QName( "", "ClaimsPartyRefs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PropertyLossInfo_Type" );
    }
  };

  public PropertyLossInfo_Type() {
    super( 127196460, TYPE.get() );
  }

  private PropertyLossInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 127196460, state );
  }

  protected PropertyLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PropertyLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PropertyLossInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PropertyLossInfo_Type get$TypeInstance() {
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
  public final java.lang.String getBldgNumberId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BldgNumberId" );
  }


  public final void setBldgNumberId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BldgNumberId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BldgNumberId getBldgNumberId_elem() {
    return (xsd.acord.BldgNumberId) TYPE.get().getPropertyValue( this, "_BldgNumberId_elem" );
  }


  public final void setBldgNumberId_elem( xsd.acord.BldgNumberId value ) {
    TYPE.get().setPropertyValue( this, "_BldgNumberId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ItemDefinition> getItemDefinition() {
    return (java.util.List<xsd.acord.ItemDefinition>) TYPE.get().getPropertyValue( this, "_ItemDefinition" );
  }


  public final void setItemDefinition( java.util.List<xsd.acord.ItemDefinition> value ) {
    TYPE.get().setPropertyValue( this, "_ItemDefinition", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ItemInfo> getItemInfo() {
    return (java.util.List<xsd.acord.ItemInfo>) TYPE.get().getPropertyValue( this, "_ItemInfo" );
  }


  public final void setItemInfo( java.util.List<xsd.acord.ItemInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ItemInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Watercraft getWatercraft() {
    return (xsd.acord.Watercraft) TYPE.get().getPropertyValue( this, "_Watercraft" );
  }


  public final void setWatercraft( xsd.acord.Watercraft value ) {
    TYPE.get().setPropertyValue( this, "_Watercraft", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PropertySchedule> getPropertySchedule() {
    return (java.util.List<xsd.acord.PropertySchedule>) TYPE.get().getPropertyValue( this, "_PropertySchedule" );
  }


  public final void setPropertySchedule( java.util.List<xsd.acord.PropertySchedule> value ) {
    TYPE.get().setPropertyValue( this, "_PropertySchedule", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSubjectInsuranceInfo> getClaimsSubjectInsuranceInfo() {
    return (java.util.List<xsd.acord.ClaimsSubjectInsuranceInfo>) TYPE.get().getPropertyValue( this, "_ClaimsSubjectInsuranceInfo" );
  }


  public final void setClaimsSubjectInsuranceInfo( java.util.List<xsd.acord.ClaimsSubjectInsuranceInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSubjectInsuranceInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RealEstateType getRealEstateTypeCd() {
    return (xsd.acord.enums.RealEstateType) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd" );
  }


  public final void setRealEstateTypeCd( xsd.acord.enums.RealEstateType value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RealEstateTypeCd getRealEstateTypeCd_elem() {
    return (xsd.acord.RealEstateTypeCd) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd_elem" );
  }


  public final void setRealEstateTypeCd_elem( xsd.acord.RealEstateTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRealEstateTypeOtherDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RealEstateTypeOtherDesc" );
  }


  public final void setRealEstateTypeOtherDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeOtherDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RealEstateTypeOtherDesc getRealEstateTypeOtherDesc_elem() {
    return (xsd.acord.RealEstateTypeOtherDesc) TYPE.get().getPropertyValue( this, "_RealEstateTypeOtherDesc_elem" );
  }


  public final void setRealEstateTypeOtherDesc_elem( xsd.acord.RealEstateTypeOtherDesc value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeOtherDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Risk getSubjectInsuranceCd() {
    return (xsd.acord.enums.Risk) TYPE.get().getPropertyValue( this, "_SubjectInsuranceCd" );
  }


  public final void setSubjectInsuranceCd( xsd.acord.enums.Risk value ) {
    TYPE.get().setPropertyValue( this, "_SubjectInsuranceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubjectInsuranceCd getSubjectInsuranceCd_elem() {
    return (xsd.acord.SubjectInsuranceCd) TYPE.get().getPropertyValue( this, "_SubjectInsuranceCd_elem" );
  }


  public final void setSubjectInsuranceCd_elem( xsd.acord.SubjectInsuranceCd value ) {
    TYPE.get().setPropertyValue( this, "_SubjectInsuranceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LossKind getLossKindCd() {
    return (xsd.acord.enums.LossKind) TYPE.get().getPropertyValue( this, "_LossKindCd" );
  }


  public final void setLossKindCd( xsd.acord.enums.LossKind value ) {
    TYPE.get().setPropertyValue( this, "_LossKindCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossKindCd getLossKindCd_elem() {
    return (xsd.acord.LossKindCd) TYPE.get().getPropertyValue( this, "_LossKindCd_elem" );
  }


  public final void setLossKindCd_elem( xsd.acord.LossKindCd value ) {
    TYPE.get().setPropertyValue( this, "_LossKindCd_elem", value );
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
  public final java.lang.String getDamageDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DamageDesc" );
  }


  public final void setDamageDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DamageDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DamageDesc getDamageDesc_elem() {
    return (xsd.acord.DamageDesc) TYPE.get().getPropertyValue( this, "_DamageDesc_elem" );
  }


  public final void setDamageDesc_elem( xsd.acord.DamageDesc value ) {
    TYPE.get().setPropertyValue( this, "_DamageDesc_elem", value );
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
  public final java.lang.Boolean getMortgageeInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_MortgageeInd" );
  }


  public final void setMortgageeInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_MortgageeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MortgageeInd getMortgageeInd_elem() {
    return (xsd.acord.MortgageeInd) TYPE.get().getPropertyValue( this, "_MortgageeInd_elem" );
  }


  public final void setMortgageeInd_elem( xsd.acord.MortgageeInd value ) {
    TYPE.get().setPropertyValue( this, "_MortgageeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.OccupancyType getOccupancyTypeCd() {
    return (xsd.acord.enums.OccupancyType) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd" );
  }


  public final void setOccupancyTypeCd( xsd.acord.enums.OccupancyType value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupancyTypeCd getOccupancyTypeCd_elem() {
    return (xsd.acord.OccupancyTypeCd) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd_elem" );
  }


  public final void setOccupancyTypeCd_elem( xsd.acord.OccupancyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIncendiaryFireInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_IncendiaryFireInd" );
  }


  public final void setIncendiaryFireInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_IncendiaryFireInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IncendiaryFireInd getIncendiaryFireInd_elem() {
    return (xsd.acord.IncendiaryFireInd) TYPE.get().getPropertyValue( this, "_IncendiaryFireInd_elem" );
  }


  public final void setIncendiaryFireInd_elem( xsd.acord.IncendiaryFireInd value ) {
    TYPE.get().setPropertyValue( this, "_IncendiaryFireInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTheftLocationCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TheftLocationCd" );
  }


  public final void setTheftLocationCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TheftLocationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TheftLocationCd getTheftLocationCd_elem() {
    return (xsd.acord.TheftLocationCd) TYPE.get().getPropertyValue( this, "_TheftLocationCd_elem" );
  }


  public final void setTheftLocationCd_elem( xsd.acord.TheftLocationCd value ) {
    TYPE.get().setPropertyValue( this, "_TheftLocationCd_elem", value );
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
  public final gw.xml.XmlElement getLossPayeeRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LossPayeeRef" );
  }


  public final void setLossPayeeRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LossPayeeRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getClaimsPartyRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_ClaimsPartyRefs" );
  }


  public final void setClaimsPartyRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRefs", value );
  }

}

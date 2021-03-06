/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PropertyLossInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BldgNumberId = new javax.xml.namespace.QName( "", "BldgNumberId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemInfo = new javax.xml.namespace.QName( "", "ItemInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Watercraft = new javax.xml.namespace.QName( "", "Watercraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySchedule = new javax.xml.namespace.QName( "", "PropertySchedule", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSubjectInsuranceInfo = new javax.xml.namespace.QName( "", "ClaimsSubjectInsuranceInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RealEstateTypeCd = new javax.xml.namespace.QName( "", "RealEstateTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RealEstateTypeOtherDesc = new javax.xml.namespace.QName( "", "RealEstateTypeOtherDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossKindCd = new javax.xml.namespace.QName( "", "LossKindCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ObjectLossDesc = new javax.xml.namespace.QName( "", "ObjectLossDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DamageDesc = new javax.xml.namespace.QName( "", "DamageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereSeenDesc = new javax.xml.namespace.QName( "", "WhereSeenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceInd = new javax.xml.namespace.QName( "", "OtherInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MortgageeInd = new javax.xml.namespace.QName( "", "MortgageeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupancyTypeCd = new javax.xml.namespace.QName( "", "OccupancyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncendiaryFireInd = new javax.xml.namespace.QName( "", "IncendiaryFireInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TheftLocationCd = new javax.xml.namespace.QName( "", "TheftLocationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ContentTheftInd = new javax.xml.namespace.QName( "", "com.iso_ContentTheftInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ViewItemRef = new javax.xml.namespace.QName( "", "ViewItemRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LossPayeeRef = new javax.xml.namespace.QName( "", "LossPayeeRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRefs = new javax.xml.namespace.QName( "", "ClaimsPartyRefs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PropertyLossInfo" );
    }
  };

  public PropertyLossInfo() {
    super( 366326552, TYPE.get() );
  }

  private PropertyLossInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 366326552, state );
  }

  protected PropertyLossInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PropertyLossInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.PropertyLossInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.PropertyLossInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_BldgNumberId getBldgNumberId() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_BldgNumberId) TYPE.get().getPropertyValue( this, "_BldgNumberId" );
  }


  public final void setBldgNumberId( xsd.iso.req.anonymous.elements.PropertyLossInfo_BldgNumberId value ) {
    TYPE.get().setPropertyValue( this, "_BldgNumberId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ItemInfo> getItemInfo() {
    return (java.util.List<xsd.iso.req.ItemInfo>) TYPE.get().getPropertyValue( this, "_ItemInfo" );
  }


  public final void setItemInfo( java.util.List<xsd.iso.req.ItemInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ItemInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Watercraft> getWatercraft() {
    return (java.util.List<xsd.iso.req.Watercraft>) TYPE.get().getPropertyValue( this, "_Watercraft" );
  }


  public final void setWatercraft( java.util.List<xsd.iso.req.Watercraft> value ) {
    TYPE.get().setPropertyValue( this, "_Watercraft", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.PropertySchedule> getPropertySchedule() {
    return (java.util.List<xsd.iso.req.PropertySchedule>) TYPE.get().getPropertyValue( this, "_PropertySchedule" );
  }


  public final void setPropertySchedule( java.util.List<xsd.iso.req.PropertySchedule> value ) {
    TYPE.get().setPropertyValue( this, "_PropertySchedule", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.PropertyLossInfo_ClaimsSubjectInsuranceInfo> getClaimsSubjectInsuranceInfo() {
    return (java.util.List<xsd.iso.req.anonymous.elements.PropertyLossInfo_ClaimsSubjectInsuranceInfo>) TYPE.get().getPropertyValue( this, "_ClaimsSubjectInsuranceInfo" );
  }


  public final void setClaimsSubjectInsuranceInfo( java.util.List<xsd.iso.req.anonymous.elements.PropertyLossInfo_ClaimsSubjectInsuranceInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSubjectInsuranceInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRealEstateTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd" );
  }


  public final void setRealEstateTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeCd getRealEstateTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeCd) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd_elem" );
  }


  public final void setRealEstateTypeCd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeCd value ) {
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
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeOtherDesc getRealEstateTypeOtherDesc_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeOtherDesc) TYPE.get().getPropertyValue( this, "_RealEstateTypeOtherDesc_elem" );
  }


  public final void setRealEstateTypeOtherDesc_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_RealEstateTypeOtherDesc value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeOtherDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossKindCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossKindCd" );
  }


  public final void setLossKindCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossKindCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_LossKindCd getLossKindCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_LossKindCd) TYPE.get().getPropertyValue( this, "_LossKindCd_elem" );
  }


  public final void setLossKindCd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_LossKindCd value ) {
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
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_ObjectLossDesc getObjectLossDesc_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_ObjectLossDesc) TYPE.get().getPropertyValue( this, "_ObjectLossDesc_elem" );
  }


  public final void setObjectLossDesc_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_ObjectLossDesc value ) {
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
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_DamageDesc getDamageDesc_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_DamageDesc) TYPE.get().getPropertyValue( this, "_DamageDesc_elem" );
  }


  public final void setDamageDesc_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_DamageDesc value ) {
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
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_WhereSeenDesc getWhereSeenDesc_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_WhereSeenDesc) TYPE.get().getPropertyValue( this, "_WhereSeenDesc_elem" );
  }


  public final void setWhereSeenDesc_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_WhereSeenDesc value ) {
    TYPE.get().setPropertyValue( this, "_WhereSeenDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherInsuranceInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd" );
  }


  public final void setOtherInsuranceInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_OtherInsuranceInd getOtherInsuranceInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_OtherInsuranceInd) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd_elem" );
  }


  public final void setOtherInsuranceInd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_OtherInsuranceInd value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMortgageeInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MortgageeInd" );
  }


  public final void setMortgageeInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MortgageeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_MortgageeInd getMortgageeInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_MortgageeInd) TYPE.get().getPropertyValue( this, "_MortgageeInd_elem" );
  }


  public final void setMortgageeInd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_MortgageeInd value ) {
    TYPE.get().setPropertyValue( this, "_MortgageeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOccupancyTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd" );
  }


  public final void setOccupancyTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_OccupancyTypeCd getOccupancyTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_OccupancyTypeCd) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd_elem" );
  }


  public final void setOccupancyTypeCd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_OccupancyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIncendiaryFireInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IncendiaryFireInd" );
  }


  public final void setIncendiaryFireInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IncendiaryFireInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_IncendiaryFireInd getIncendiaryFireInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_IncendiaryFireInd) TYPE.get().getPropertyValue( this, "_IncendiaryFireInd_elem" );
  }


  public final void setIncendiaryFireInd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_IncendiaryFireInd value ) {
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
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_TheftLocationCd getTheftLocationCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_TheftLocationCd) TYPE.get().getPropertyValue( this, "_TheftLocationCd_elem" );
  }


  public final void setTheftLocationCd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_TheftLocationCd value ) {
    TYPE.get().setPropertyValue( this, "_TheftLocationCd_elem", value );
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
  public final java.lang.String getComIso_ContentTheftInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_ContentTheftInd" );
  }


  public final void setComIso_ContentTheftInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ContentTheftInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertyLossInfo_ComIso_ContentTheftInd getComIso_ContentTheftInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertyLossInfo_ComIso_ContentTheftInd) TYPE.get().getPropertyValue( this, "_ComIso_ContentTheftInd_elem" );
  }


  public final void setComIso_ContentTheftInd_elem( xsd.iso.req.anonymous.elements.PropertyLossInfo_ComIso_ContentTheftInd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ContentTheftInd_elem", value );
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

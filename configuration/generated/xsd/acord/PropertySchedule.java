/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PropertySchedule extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PropertySchedule", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IsSummaryInd = new javax.xml.namespace.QName( "", "IsSummaryInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludedInd = new javax.xml.namespace.QName( "", "ExcludedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValuationTypeCd = new javax.xml.namespace.QName( "", "ItemValuationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValueAmt = new javax.xml.namespace.QName( "", "ItemValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyClassCd = new javax.xml.namespace.QName( "", "PropertyClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertySubClassCd = new javax.xml.namespace.QName( "", "PropertySubClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValuationTypeCd = new javax.xml.namespace.QName( "", "ValuationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnimalItemDefinition = new javax.xml.namespace.QName( "", "AnimalItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyScheduleModifications = new javax.xml.namespace.QName( "", "PropertyScheduleModifications", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptAppraisal = new javax.xml.namespace.QName( "", "SalesReceiptAppraisal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremInd = new javax.xml.namespace.QName( "", "MinPremInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PropSummaryRef = new javax.xml.namespace.QName( "", "PropSummaryRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.PropertySchedule" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PropertySchedule_Type" );
    }
  };

  public PropertySchedule() {
    super( -368200448, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PropertySchedule_Type() );
  }

  public PropertySchedule( xsd.acord.types.complex.PropertySchedule_Type typeInstance ) {
    super( -368200448, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PropertySchedule( gw.internal.xml.XmlElementState state ) {
    super( -368200448, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.PropertySchedule> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PropertySchedule_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PropertySchedule_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PropertySchedule_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.PropertySchedule parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.PropertySchedule.class );
  }

  public static xsd.acord.PropertySchedule parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.PropertySchedule.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIsSummaryInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IsSummaryInd" );
  }


  public final void setIsSummaryInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IsSummaryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IsSummaryInd getIsSummaryInd_elem() {
    return (xsd.acord.IsSummaryInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IsSummaryInd_elem" );
  }


  public final void setIsSummaryInd_elem( xsd.acord.IsSummaryInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IsSummaryInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcludedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcludedInd" );
  }


  public final void setExcludedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcludedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcludedInd getExcludedInd_elem() {
    return (xsd.acord.ExcludedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcludedInd_elem" );
  }


  public final void setExcludedInd_elem( xsd.acord.ExcludedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcludedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ValuationMethod getItemValuationTypeCd() {
    return (xsd.acord.enums.ValuationMethod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd" );
  }


  public final void setItemValuationTypeCd( xsd.acord.enums.ValuationMethod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemValuationTypeCd getItemValuationTypeCd_elem() {
    return (xsd.acord.ItemValuationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd_elem" );
  }


  public final void setItemValuationTypeCd_elem( xsd.acord.ItemValuationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemValueAmt getItemValueAmt() {
    return (xsd.acord.ItemValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValueAmt" );
  }


  public final void setItemValueAmt( xsd.acord.ItemValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Limit getLimit() {
    return (xsd.acord.Limit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Limit" );
  }


  public final void setLimit( xsd.acord.Limit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Limit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Risk getPropertyClassCd() {
    return (xsd.acord.enums.Risk) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd" );
  }


  public final void setPropertyClassCd( xsd.acord.enums.Risk value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyClassCd getPropertyClassCd_elem() {
    return (xsd.acord.PropertyClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem" );
  }


  public final void setPropertyClassCd_elem( xsd.acord.PropertyClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SubRisk getPropertySubClassCd() {
    return (xsd.acord.enums.SubRisk) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertySubClassCd" );
  }


  public final void setPropertySubClassCd( xsd.acord.enums.SubRisk value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertySubClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertySubClassCd getPropertySubClassCd_elem() {
    return (xsd.acord.PropertySubClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertySubClassCd_elem" );
  }


  public final void setPropertySubClassCd_elem( xsd.acord.PropertySubClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertySubClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTerritoryCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd" );
  }


  public final void setTerritoryCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TerritoryCd getTerritoryCd_elem() {
    return (xsd.acord.TerritoryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.acord.TerritoryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SettlementType getValuationTypeCd() {
    return (xsd.acord.enums.SettlementType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationTypeCd" );
  }


  public final void setValuationTypeCd( xsd.acord.enums.SettlementType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ValuationTypeCd getValuationTypeCd_elem() {
    return (xsd.acord.ValuationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationTypeCd_elem" );
  }


  public final void setValuationTypeCd_elem( xsd.acord.ValuationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Coverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemDefinition getItemDefinition() {
    return (xsd.acord.ItemDefinition) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDefinition" );
  }


  public final void setItemDefinition( xsd.acord.ItemDefinition value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDefinition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnimalItemDefinition getAnimalItemDefinition() {
    return (xsd.acord.AnimalItemDefinition) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnimalItemDefinition" );
  }


  public final void setAnimalItemDefinition( xsd.acord.AnimalItemDefinition value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnimalItemDefinition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyScheduleModifications getPropertyScheduleModifications() {
    return (xsd.acord.PropertyScheduleModifications) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyScheduleModifications" );
  }


  public final void setPropertyScheduleModifications( xsd.acord.PropertyScheduleModifications value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyScheduleModifications", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SalesReceiptAppraisal> getSalesReceiptAppraisal() {
    return (java.util.List<xsd.acord.SalesReceiptAppraisal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisal" );
  }


  public final void setSalesReceiptAppraisal( java.util.List<xsd.acord.SalesReceiptAppraisal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalInterest> getAdditionalInterest() {
    return (java.util.List<xsd.acord.AdditionalInterest>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( java.util.List<xsd.acord.AdditionalInterest> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalInterest", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getMinPremInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinPremInd" );
  }


  public final void setMinPremInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinPremInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinPremInd getMinPremInd_elem() {
    return (xsd.acord.MinPremInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinPremInd_elem" );
  }


  public final void setMinPremInd_elem( xsd.acord.MinPremInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinPremInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getPropSummaryRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropSummaryRef" );
  }


  public final void setPropSummaryRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropSummaryRef", value );
  }
}
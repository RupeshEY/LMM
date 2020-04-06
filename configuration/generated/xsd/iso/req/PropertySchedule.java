/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PropertySchedule extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PropertySchedule", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IsSummaryInd = new javax.xml.namespace.QName( "", "IsSummaryInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValuationTypeCd = new javax.xml.namespace.QName( "", "ItemValuationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValueAmt = new javax.xml.namespace.QName( "", "ItemValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyClassCd = new javax.xml.namespace.QName( "", "PropertyClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValuationTypeCd = new javax.xml.namespace.QName( "", "ValuationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyScheduleModifications = new javax.xml.namespace.QName( "", "PropertyScheduleModifications", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalesReceiptAppraisal = new javax.xml.namespace.QName( "", "SalesReceiptAppraisal", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.PropertySchedule" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PropertySchedule" );
    }
  };

  public PropertySchedule() {
    super( -1322847670, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.PropertySchedule() );
  }

  public PropertySchedule( xsd.iso.req.anonymous.types.complex.PropertySchedule typeInstance ) {
    super( -1322847670, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PropertySchedule( gw.internal.xml.XmlElementState state ) {
    super( -1322847670, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.PropertySchedule> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.PropertySchedule get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.PropertySchedule.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.PropertySchedule typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.PropertySchedule parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.PropertySchedule.class );
  }

  public static xsd.iso.req.PropertySchedule parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.PropertySchedule.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIsSummaryInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IsSummaryInd" );
  }


  public final void setIsSummaryInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IsSummaryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd getIsSummaryInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IsSummaryInd_elem" );
  }


  public final void setIsSummaryInd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IsSummaryInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getItemValuationTypeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd" );
  }


  public final void setItemValuationTypeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd getItemValuationTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd_elem" );
  }


  public final void setItemValuationTypeCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt getItemValueAmt() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValueAmt" );
  }


  public final void setItemValueAmt( xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Limit getLimit() {
    return (xsd.iso.req.Limit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Limit" );
  }


  public final void setLimit( xsd.iso.req.Limit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Limit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyClassCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd" );
  }


  public final void setPropertyClassCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd getPropertyClassCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem" );
  }


  public final void setPropertyClassCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyClassCd_elem", value );
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
  public final xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd getTerritoryCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValuationTypeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationTypeCd" );
  }


  public final void setValuationTypeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd getValuationTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationTypeCd_elem" );
  }


  public final void setValuationTypeCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Coverage getCoverage() {
    return (xsd.iso.req.Coverage) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Coverage" );
  }


  public final void setCoverage( xsd.iso.req.Coverage value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Coverage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemDefinition getItemDefinition() {
    return (xsd.iso.req.ItemDefinition) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDefinition" );
  }


  public final void setItemDefinition( xsd.iso.req.ItemDefinition value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDefinition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PropertyScheduleModifications getPropertyScheduleModifications() {
    return (xsd.iso.req.PropertyScheduleModifications) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyScheduleModifications" );
  }


  public final void setPropertyScheduleModifications( xsd.iso.req.PropertyScheduleModifications value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyScheduleModifications", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.SalesReceiptAppraisal> getSalesReceiptAppraisal() {
    return (java.util.List<xsd.iso.req.SalesReceiptAppraisal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisal" );
  }


  public final void setSalesReceiptAppraisal( java.util.List<xsd.iso.req.SalesReceiptAppraisal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalesReceiptAppraisal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
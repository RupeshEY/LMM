/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PropertySchedule extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PropertySchedule" );
    }
  };

  public PropertySchedule() {
    super( 1588916030, TYPE.get() );
  }

  private PropertySchedule( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1588916030, state );
  }

  protected PropertySchedule( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PropertySchedule( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.PropertySchedule> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.PropertySchedule get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIsSummaryInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IsSummaryInd" );
  }


  public final void setIsSummaryInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IsSummaryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd getIsSummaryInd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd) TYPE.get().getPropertyValue( this, "_IsSummaryInd_elem" );
  }


  public final void setIsSummaryInd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_IsSummaryInd value ) {
    TYPE.get().setPropertyValue( this, "_IsSummaryInd_elem", value );
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
  public final java.lang.String getItemValuationTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ItemValuationTypeCd" );
  }


  public final void setItemValuationTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ItemValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd getItemValuationTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd) TYPE.get().getPropertyValue( this, "_ItemValuationTypeCd_elem" );
  }


  public final void setItemValuationTypeCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_ItemValuationTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ItemValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt getItemValueAmt() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt) TYPE.get().getPropertyValue( this, "_ItemValueAmt" );
  }


  public final void setItemValueAmt( xsd.iso.req.anonymous.elements.PropertySchedule_ItemValueAmt value ) {
    TYPE.get().setPropertyValue( this, "_ItemValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Limit getLimit() {
    return (xsd.iso.req.Limit) TYPE.get().getPropertyValue( this, "_Limit" );
  }


  public final void setLimit( xsd.iso.req.Limit value ) {
    TYPE.get().setPropertyValue( this, "_Limit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PropertyClassCd" );
  }


  public final void setPropertyClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PropertyClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd getPropertyClassCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd) TYPE.get().getPropertyValue( this, "_PropertyClassCd_elem" );
  }


  public final void setPropertyClassCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_PropertyClassCd value ) {
    TYPE.get().setPropertyValue( this, "_PropertyClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTerritoryCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TerritoryCd" );
  }


  public final void setTerritoryCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TerritoryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd getTerritoryCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd) TYPE.get().getPropertyValue( this, "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_TerritoryCd value ) {
    TYPE.get().setPropertyValue( this, "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValuationTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ValuationTypeCd" );
  }


  public final void setValuationTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ValuationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd getValuationTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd) TYPE.get().getPropertyValue( this, "_ValuationTypeCd_elem" );
  }


  public final void setValuationTypeCd_elem( xsd.iso.req.anonymous.elements.PropertySchedule_ValuationTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ValuationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Coverage getCoverage() {
    return (xsd.iso.req.Coverage) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( xsd.iso.req.Coverage value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemDefinition getItemDefinition() {
    return (xsd.iso.req.ItemDefinition) TYPE.get().getPropertyValue( this, "_ItemDefinition" );
  }


  public final void setItemDefinition( xsd.iso.req.ItemDefinition value ) {
    TYPE.get().setPropertyValue( this, "_ItemDefinition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PropertyScheduleModifications getPropertyScheduleModifications() {
    return (xsd.iso.req.PropertyScheduleModifications) TYPE.get().getPropertyValue( this, "_PropertyScheduleModifications" );
  }


  public final void setPropertyScheduleModifications( xsd.iso.req.PropertyScheduleModifications value ) {
    TYPE.get().setPropertyValue( this, "_PropertyScheduleModifications", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.SalesReceiptAppraisal> getSalesReceiptAppraisal() {
    return (java.util.List<xsd.iso.req.SalesReceiptAppraisal>) TYPE.get().getPropertyValue( this, "_SalesReceiptAppraisal" );
  }


  public final void setSalesReceiptAppraisal( java.util.List<xsd.iso.req.SalesReceiptAppraisal> value ) {
    TYPE.get().setPropertyValue( this, "_SalesReceiptAppraisal", value );
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

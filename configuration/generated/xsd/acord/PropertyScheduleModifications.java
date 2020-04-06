/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PropertyScheduleModifications extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PropertyScheduleModifications", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketNumber = new javax.xml.namespace.QName( "", "BlanketNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketInd = new javax.xml.namespace.QName( "", "BlanketInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExhibitedInd = new javax.xml.namespace.QName( "", "ExhibitedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InVaultInd = new javax.xml.namespace.QName( "", "InVaultInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfessionalCommercialUseInd = new javax.xml.namespace.QName( "", "ProfessionalCommercialUseInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustomUseInd = new javax.xml.namespace.QName( "", "CustomUseInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QualifierTypeCd = new javax.xml.namespace.QName( "", "QualifierTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Measure = new javax.xml.namespace.QName( "", "Measure", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AvgValuePerUnit = new javax.xml.namespace.QName( "", "AvgValuePerUnit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportingPeriodCd = new javax.xml.namespace.QName( "", "ReportingPeriodCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.PropertyScheduleModifications" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PropertyScheduleModifications_Type" );
    }
  };

  public PropertyScheduleModifications() {
    super( -1589117641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PropertyScheduleModifications_Type() );
  }

  public PropertyScheduleModifications( xsd.acord.types.complex.PropertyScheduleModifications_Type typeInstance ) {
    super( -1589117641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PropertyScheduleModifications( gw.internal.xml.XmlElementState state ) {
    super( -1589117641, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.PropertyScheduleModifications> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PropertyScheduleModifications_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PropertyScheduleModifications_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PropertyScheduleModifications_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.PropertyScheduleModifications parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.PropertyScheduleModifications.class );
  }

  public static xsd.acord.PropertyScheduleModifications parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.PropertyScheduleModifications.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getBlanketNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber" );
  }


  public final void setBlanketNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BlanketNumber getBlanketNumber_elem() {
    return (xsd.acord.BlanketNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber_elem" );
  }


  public final void setBlanketNumber_elem( xsd.acord.BlanketNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBlanketInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketInd" );
  }


  public final void setBlanketInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BlanketInd getBlanketInd_elem() {
    return (xsd.acord.BlanketInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketInd_elem" );
  }


  public final void setBlanketInd_elem( xsd.acord.BlanketInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExhibitedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExhibitedInd" );
  }


  public final void setExhibitedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExhibitedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExhibitedInd getExhibitedInd_elem() {
    return (xsd.acord.ExhibitedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExhibitedInd_elem" );
  }


  public final void setExhibitedInd_elem( xsd.acord.ExhibitedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExhibitedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInVaultInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InVaultInd" );
  }


  public final void setInVaultInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InVaultInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InVaultInd getInVaultInd_elem() {
    return (xsd.acord.InVaultInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InVaultInd_elem" );
  }


  public final void setInVaultInd_elem( xsd.acord.InVaultInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InVaultInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getProfessionalCommercialUseInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd" );
  }


  public final void setProfessionalCommercialUseInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProfessionalCommercialUseInd getProfessionalCommercialUseInd_elem() {
    return (xsd.acord.ProfessionalCommercialUseInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd_elem" );
  }


  public final void setProfessionalCommercialUseInd_elem( xsd.acord.ProfessionalCommercialUseInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProfessionalCommercialUseInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCustomUseInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustomUseInd" );
  }


  public final void setCustomUseInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustomUseInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustomUseInd getCustomUseInd_elem() {
    return (xsd.acord.CustomUseInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustomUseInd_elem" );
  }


  public final void setCustomUseInd_elem( xsd.acord.CustomUseInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustomUseInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.RiskQualifier> getQualifierTypeCd() {
    return (java.util.List<xsd.acord.enums.RiskQualifier>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QualifierTypeCd" );
  }


  public final void setQualifierTypeCd( java.util.List<xsd.acord.enums.RiskQualifier> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QualifierTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QualifierTypeCd> getQualifierTypeCd_elem() {
    return (java.util.List<xsd.acord.QualifierTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QualifierTypeCd_elem" );
  }


  public final void setQualifierTypeCd_elem( java.util.List<xsd.acord.QualifierTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QualifierTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnits getNumUnits_elem() {
    return (xsd.acord.NumUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.acord.NumUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Measure getMeasure() {
    return (xsd.acord.Measure) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Measure" );
  }


  public final void setMeasure( xsd.acord.Measure value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Measure", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AvgValuePerUnit getAvgValuePerUnit() {
    return (xsd.acord.AvgValuePerUnit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AvgValuePerUnit" );
  }


  public final void setAvgValuePerUnit( xsd.acord.AvgValuePerUnit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AvgValuePerUnit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getReportingPeriodCd() {
    return (xsd.acord.enums.Frequency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingPeriodCd" );
  }


  public final void setReportingPeriodCd( xsd.acord.enums.Frequency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingPeriodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReportingPeriodCd getReportingPeriodCd_elem() {
    return (xsd.acord.ReportingPeriodCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingPeriodCd_elem" );
  }


  public final void setReportingPeriodCd_elem( xsd.acord.ReportingPeriodCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingPeriodCd_elem", value );
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
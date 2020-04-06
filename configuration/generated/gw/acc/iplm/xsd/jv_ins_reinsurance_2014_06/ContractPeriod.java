/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ContractPeriod extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractPeriod", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeZoneNarrative = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TimeZoneNarrative", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeDuration = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TimeDuration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocalStandardTimeAppliesIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LocalStandardTimeAppliesIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PeriodScope = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PeriodScope", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PeriodScopeDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PeriodScopeDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PeriodStatus = new javax.xml.namespace.QName( "", "PeriodStatus", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType" );
    }
  };

  public ContractPeriod() {
    super( 49563641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType() );
  }

  public ContractPeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType typeInstance ) {
    super( 49563641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ContractPeriod( gw.internal.xml.XmlElementState state ) {
    super( 49563641, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractPeriodType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractPeriod.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDate" );
  }


  public final void setStartDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate getStartDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDate_elem" );
  }


  public final void setStartDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate" );
  }


  public final void setEndDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate getEndDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate_elem" );
  }


  public final void setEndDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDateTime() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDateTime" );
  }


  public final void setStartDateTime( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime getStartDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartDateTime_elem" );
  }


  public final void setStartDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDateTime() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDateTime" );
  }


  public final void setEndDateTime( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime getEndDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDateTime_elem" );
  }


  public final void setEndDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTimeZoneNarrative() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeZoneNarrative" );
  }


  public final void setTimeZoneNarrative( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeZoneNarrative", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative getTimeZoneNarrative_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeZoneNarrative_elem" );
  }


  public final void setTimeZoneNarrative_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeZoneNarrative value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeZoneNarrative_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getTimeDuration() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeDuration" );
  }


  public final void setTimeDuration( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration getTimeDuration_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeDuration_elem" );
  }


  public final void setTimeDuration_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeDuration_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLocalStandardTimeAppliesIndicator() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator" );
  }


  public final void setLocalStandardTimeAppliesIndicator( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator getLocalStandardTimeAppliesIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator_elem" );
  }


  public final void setLocalStandardTimeAppliesIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LocalStandardTimeAppliesIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocalStandardTimeAppliesIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPeriodScope() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PeriodScope" );
  }


  public final void setPeriodScope( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PeriodScope", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScope getPeriodScope_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScope) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PeriodScope_elem" );
  }


  public final void setPeriodScope_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScope value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PeriodScope_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPeriodScopeDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PeriodScopeDescription" );
  }


  public final void setPeriodScopeDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PeriodScopeDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScopeDescription getPeriodScopeDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScopeDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PeriodScopeDescription_elem" );
  }


  public final void setPeriodScopeDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PeriodScopeDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PeriodScopeDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractPeriodType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractPeriodType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractPeriodType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPeriodStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PeriodStatus" );
  }


  public final void setPeriodStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PeriodStatus", value );
  }
}
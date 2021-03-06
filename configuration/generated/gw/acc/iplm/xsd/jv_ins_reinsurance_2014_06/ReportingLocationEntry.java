/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReportingLocationEntry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingLocationEntry", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RiskLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegulatoryLocationOfRisk = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RegulatoryLocationOfRisk", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValueAddedTaxRating = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ValueAddedTaxRating", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportingTransactionAmountEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingTransactionAmountEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType" );
    }
  };

  public ReportingLocationEntry() {
    super( -120395083, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType() );
  }

  public ReportingLocationEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType typeInstance ) {
    super( -120395083, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReportingLocationEntry( gw.internal.xml.XmlElementState state ) {
    super( -120395083, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingLocationEntryType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossLocation getLossLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossLocation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossLocation" );
  }


  public final void setLossLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossLocation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation getRiskLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RiskLocation" );
  }


  public final void setRiskLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RiskLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryLocationOfRisk> getRegulatoryLocationOfRisk() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryLocationOfRisk>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RegulatoryLocationOfRisk" );
  }


  public final void setRegulatoryLocationOfRisk( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RegulatoryLocationOfRisk> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RegulatoryLocationOfRisk", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValueAddedTaxRating() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValueAddedTaxRating" );
  }


  public final void setValueAddedTaxRating( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValueAddedTaxRating", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ValueAddedTaxRating getValueAddedTaxRating_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ValueAddedTaxRating) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValueAddedTaxRating_elem" );
  }


  public final void setValueAddedTaxRating_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ValueAddedTaxRating value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValueAddedTaxRating_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionAmountEntry> getReportingTransactionAmountEntry() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionAmountEntry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingTransactionAmountEntry" );
  }


  public final void setReportingTransactionAmountEntry( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionAmountEntry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingTransactionAmountEntry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingLocationEntryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingLocationEntryType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingLocationEntryType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}

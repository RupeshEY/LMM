/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReportingSectionEntry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingSectionEntry", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractSection = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractSection", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportingLossEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingLossEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportingTransactionEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingTransactionEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType" );
    }
  };

  public ReportingSectionEntry() {
    super( 958281877, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType() );
  }

  public ReportingSectionEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType typeInstance ) {
    super( 958281877, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReportingSectionEntry( gw.internal.xml.XmlElementState state ) {
    super( 958281877, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingSectionEntryType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingSectionEntry.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection getContractSection() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractSection" );
  }


  public final void setContractSection( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractSection", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLossEntry> getReportingLossEntry() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLossEntry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingLossEntry" );
  }


  public final void setReportingLossEntry( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLossEntry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingLossEntry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry> getReportingTransactionEntry() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingTransactionEntry" );
  }


  public final void setReportingTransactionEntry( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingTransactionEntry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingSectionEntryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingSectionEntryType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingSectionEntryType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}

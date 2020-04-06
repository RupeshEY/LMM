/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReportingTransactionEntry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingTransactionEntry", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumEffectivePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumEffectivePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountTransactionType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AccountTransactionType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredAccountTransactionType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredAccountTransactionType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TechAccountEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TechAccountEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredTechAccountEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredTechAccountEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProducingBrokerRiskReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProducingBrokerRiskReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractActor = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractActor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredReportingLossEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReferredReportingLossEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportingLocationEntry = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingLocationEntry", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType" );
    }
  };

  public ReportingTransactionEntry() {
    super( 1993618492, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType() );
  }

  public ReportingTransactionEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType typeInstance ) {
    super( 1993618492, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReportingTransactionEntry( gw.internal.xml.XmlElementState state ) {
    super( 1993618492, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }

  public static gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingTransactionEntry.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod getPremiumEffectivePeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumEffectivePeriod" );
  }


  public final void setPremiumEffectivePeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumEffectivePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAccountTransactionType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountTransactionType" );
  }


  public final void setAccountTransactionType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountTransactionType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType getAccountTransactionType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountTransactionType_elem" );
  }


  public final void setAccountTransactionType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountTransactionType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReferredAccountTransactionType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredAccountTransactionType" );
  }


  public final void setReferredAccountTransactionType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredAccountTransactionType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType getReferredAccountTransactionType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredAccountTransactionType_elem" );
  }


  public final void setReferredAccountTransactionType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredAccountTransactionType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry getTechAccountEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TechAccountEntry" );
  }


  public final void setTechAccountEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TechAccountEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry getReferredTechAccountEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredTechAccountEntry" );
  }


  public final void setReferredTechAccountEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredTechAccountEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProducingBrokerRiskReference() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProducingBrokerRiskReference" );
  }


  public final void setProducingBrokerRiskReference( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProducingBrokerRiskReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference getProducingBrokerRiskReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProducingBrokerRiskReference_elem" );
  }


  public final void setProducingBrokerRiskReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProducingBrokerRiskReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor> getContractActor() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractActor" );
  }


  public final void setContractActor( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractActor", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry getReferredReportingLossEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredReportingLossEntry" );
  }


  public final void setReferredReportingLossEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredReportingLossEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry> getReportingLocationEntry() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReportingLocationEntry" );
  }


  public final void setReportingLocationEntry( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReportingLocationEntry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
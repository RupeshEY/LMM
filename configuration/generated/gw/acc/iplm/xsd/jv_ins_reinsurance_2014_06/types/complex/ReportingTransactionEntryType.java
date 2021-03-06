/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReportingTransactionEntryType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReportingTransactionEntryType", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType" );
    }
  };

  public ReportingTransactionEntryType() {
    super( 2115073443, TYPE.get() );
  }

  private ReportingTransactionEntryType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2115073443, state );
  }

  protected ReportingTransactionEntryType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReportingTransactionEntryType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ReportingTransactionEntryType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod getPremiumEffectivePeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod) TYPE.get().getPropertyValue( this, "_PremiumEffectivePeriod" );
  }


  public final void setPremiumEffectivePeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumEffectivePeriod value ) {
    TYPE.get().setPropertyValue( this, "_PremiumEffectivePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAccountTransactionType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AccountTransactionType" );
  }


  public final void setAccountTransactionType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AccountTransactionType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType getAccountTransactionType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType) TYPE.get().getPropertyValue( this, "_AccountTransactionType_elem" );
  }


  public final void setAccountTransactionType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.AccountTransactionType value ) {
    TYPE.get().setPropertyValue( this, "_AccountTransactionType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReferredAccountTransactionType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReferredAccountTransactionType" );
  }


  public final void setReferredAccountTransactionType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReferredAccountTransactionType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType getReferredAccountTransactionType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType) TYPE.get().getPropertyValue( this, "_ReferredAccountTransactionType_elem" );
  }


  public final void setReferredAccountTransactionType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredAccountTransactionType value ) {
    TYPE.get().setPropertyValue( this, "_ReferredAccountTransactionType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry getTechAccountEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry) TYPE.get().getPropertyValue( this, "_TechAccountEntry" );
  }


  public final void setTechAccountEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TechAccountEntry value ) {
    TYPE.get().setPropertyValue( this, "_TechAccountEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry getReferredTechAccountEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry) TYPE.get().getPropertyValue( this, "_ReferredTechAccountEntry" );
  }


  public final void setReferredTechAccountEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredTechAccountEntry value ) {
    TYPE.get().setPropertyValue( this, "_ReferredTechAccountEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProducingBrokerRiskReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProducingBrokerRiskReference" );
  }


  public final void setProducingBrokerRiskReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProducingBrokerRiskReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference getProducingBrokerRiskReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference) TYPE.get().getPropertyValue( this, "_ProducingBrokerRiskReference_elem" );
  }


  public final void setProducingBrokerRiskReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProducingBrokerRiskReference value ) {
    TYPE.get().setPropertyValue( this, "_ProducingBrokerRiskReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor> getContractActor() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor>) TYPE.get().getPropertyValue( this, "_ContractActor" );
  }


  public final void setContractActor( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractActor> value ) {
    TYPE.get().setPropertyValue( this, "_ContractActor", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry getReferredReportingLossEntry() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry) TYPE.get().getPropertyValue( this, "_ReferredReportingLossEntry" );
  }


  public final void setReferredReportingLossEntry( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReferredReportingLossEntry value ) {
    TYPE.get().setPropertyValue( this, "_ReferredReportingLossEntry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry> getReportingLocationEntry() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry>) TYPE.get().getPropertyValue( this, "_ReportingLocationEntry" );
  }


  public final void setReportingLocationEntry( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReportingLocationEntry> value ) {
    TYPE.get().setPropertyValue( this, "_ReportingLocationEntry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ReportingTransactionEntryType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}

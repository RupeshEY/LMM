/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ContractReinstatementType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractReinstatementType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SequenceNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SequenceNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumRate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PremiumRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokeragePercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokeragePercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrokerageAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BrokerageAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinstatementCalculationType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinstatementCalculationType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinstatementsAllowedTotalNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinstatementsAllowedTotalNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinstatementsAllowedUnlimitedIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ReinstatementsAllowedUnlimitedIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractReinstatementType" );
    }
  };

  public ContractReinstatementType() {
    super( -2023530746, TYPE.get() );
  }

  private ContractReinstatementType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2023530746, state );
  }

  protected ContractReinstatementType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ContractReinstatementType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractReinstatementType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractReinstatementType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSequenceNbr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SequenceNbr" );
  }


  public final void setSequenceNbr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SequenceNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr getSequenceNbr_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr) TYPE.get().getPropertyValue( this, "_SequenceNbr_elem" );
  }


  public final void setSequenceNbr_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr value ) {
    TYPE.get().setPropertyValue( this, "_SequenceNbr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumAmount getPremiumAmount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumAmount) TYPE.get().getPropertyValue( this, "_PremiumAmount" );
  }


  public final void setPremiumAmount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumAmount value ) {
    TYPE.get().setPropertyValue( this, "_PremiumAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRate getPremiumRate() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRate) TYPE.get().getPropertyValue( this, "_PremiumRate" );
  }


  public final void setPremiumRate( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PremiumRate value ) {
    TYPE.get().setPropertyValue( this, "_PremiumRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokeragePercentage getBrokeragePercentage() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokeragePercentage) TYPE.get().getPropertyValue( this, "_BrokeragePercentage" );
  }


  public final void setBrokeragePercentage( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokeragePercentage value ) {
    TYPE.get().setPropertyValue( this, "_BrokeragePercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerageAmount getBrokerageAmount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerageAmount) TYPE.get().getPropertyValue( this, "_BrokerageAmount" );
  }


  public final void setBrokerageAmount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BrokerageAmount value ) {
    TYPE.get().setPropertyValue( this, "_BrokerageAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReinstatementCalculationType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReinstatementCalculationType" );
  }


  public final void setReinstatementCalculationType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReinstatementCalculationType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementCalculationType getReinstatementCalculationType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementCalculationType) TYPE.get().getPropertyValue( this, "_ReinstatementCalculationType_elem" );
  }


  public final void setReinstatementCalculationType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementCalculationType value ) {
    TYPE.get().setPropertyValue( this, "_ReinstatementCalculationType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedTotalNbr getReinstatementsAllowedTotalNbr() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedTotalNbr) TYPE.get().getPropertyValue( this, "_ReinstatementsAllowedTotalNbr" );
  }


  public final void setReinstatementsAllowedTotalNbr( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedTotalNbr value ) {
    TYPE.get().setPropertyValue( this, "_ReinstatementsAllowedTotalNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getReinstatementsAllowedUnlimitedIndicator() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ReinstatementsAllowedUnlimitedIndicator" );
  }


  public final void setReinstatementsAllowedUnlimitedIndicator( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ReinstatementsAllowedUnlimitedIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedUnlimitedIndicator getReinstatementsAllowedUnlimitedIndicator_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedUnlimitedIndicator) TYPE.get().getPropertyValue( this, "_ReinstatementsAllowedUnlimitedIndicator_elem" );
  }


  public final void setReinstatementsAllowedUnlimitedIndicator_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ReinstatementsAllowedUnlimitedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_ReinstatementsAllowedUnlimitedIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractReinstatementType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractReinstatementType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractReinstatementType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
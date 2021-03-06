/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ProfitCommissionType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnearnedPremiumReserveProfitCommissionPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UnearnedPremiumReserveProfitCommissionPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionCalculationType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionCalculationType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProfitCommissionCarryforward = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProfitCommissionCarryforward", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CalculationPeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CalculationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstCalculationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FirstCalculationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProvisionFrequency = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProvisionFrequency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ProfitCommissionType" );
    }
  };

  public ProfitCommissionType() {
    super( 1663227266, TYPE.get() );
  }

  private ProfitCommissionType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1663227266, state );
  }

  protected ProfitCommissionType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ProfitCommissionType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ProfitCommissionType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ProfitCommissionType get$TypeInstance() {
    return this;
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionPercentage getProfitCommissionPercentage() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionPercentage) TYPE.get().getPropertyValue( this, "_ProfitCommissionPercentage" );
  }


  public final void setProfitCommissionPercentage( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionPercentage value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UnearnedPremiumReserveProfitCommissionPercentage getUnearnedPremiumReserveProfitCommissionPercentage() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UnearnedPremiumReserveProfitCommissionPercentage) TYPE.get().getPropertyValue( this, "_UnearnedPremiumReserveProfitCommissionPercentage" );
  }


  public final void setUnearnedPremiumReserveProfitCommissionPercentage( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UnearnedPremiumReserveProfitCommissionPercentage value ) {
    TYPE.get().setPropertyValue( this, "_UnearnedPremiumReserveProfitCommissionPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionBasis() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProfitCommissionBasis" );
  }


  public final void setProfitCommissionBasis( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionBasis getProfitCommissionBasis_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionBasis) TYPE.get().getPropertyValue( this, "_ProfitCommissionBasis_elem" );
  }


  public final void setProfitCommissionBasis_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionBasis value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionCalculationType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProfitCommissionCalculationType" );
  }


  public final void setProfitCommissionCalculationType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionCalculationType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCalculationType getProfitCommissionCalculationType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCalculationType) TYPE.get().getPropertyValue( this, "_ProfitCommissionCalculationType_elem" );
  }


  public final void setProfitCommissionCalculationType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCalculationType value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionCalculationType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProfitCommissionCarryforward() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProfitCommissionCarryforward" );
  }


  public final void setProfitCommissionCarryforward( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionCarryforward", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCarryforward getProfitCommissionCarryforward_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCarryforward) TYPE.get().getPropertyValue( this, "_ProfitCommissionCarryforward_elem" );
  }


  public final void setProfitCommissionCarryforward_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProfitCommissionCarryforward value ) {
    TYPE.get().setPropertyValue( this, "_ProfitCommissionCarryforward_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CalculationPeriod getCalculationPeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CalculationPeriod) TYPE.get().getPropertyValue( this, "_CalculationPeriod" );
  }


  public final void setCalculationPeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CalculationPeriod value ) {
    TYPE.get().setPropertyValue( this, "_CalculationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstCalculationDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FirstCalculationDate" );
  }


  public final void setFirstCalculationDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FirstCalculationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FirstCalculationDate getFirstCalculationDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FirstCalculationDate) TYPE.get().getPropertyValue( this, "_FirstCalculationDate_elem" );
  }


  public final void setFirstCalculationDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FirstCalculationDate value ) {
    TYPE.get().setPropertyValue( this, "_FirstCalculationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProvisionFrequency() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProvisionFrequency" );
  }


  public final void setProvisionFrequency( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProvisionFrequency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProvisionFrequency getProvisionFrequency_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProvisionFrequency) TYPE.get().getPropertyValue( this, "_ProvisionFrequency_elem" );
  }


  public final void setProvisionFrequency_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProvisionFrequency value ) {
    TYPE.get().setPropertyValue( this, "_ProvisionFrequency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ProfitCommissionType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ProfitCommissionType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ProfitCommissionType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}

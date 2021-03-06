/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TaxCalculationType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "TaxCalculationType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxBaseAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "TaxBaseAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "TaxPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JvClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "JvClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NaicClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "NaicClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassOfBusinessDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "ClassOfBusinessDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskTaxBoundLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "RiskTaxBoundLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgentTaxBoundLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "AgentTaxBoundLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxCalculationType" );
    }
  };

  public TaxCalculationType() {
    super( 1748585112, TYPE.get() );
  }

  private TaxCalculationType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1748585112, state );
  }

  protected TaxCalculationType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TaxCalculationType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxCalculationType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.TaxCalculationType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxBaseAmount getTaxBaseAmount() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxBaseAmount) TYPE.get().getPropertyValue( this, "_TaxBaseAmount" );
  }


  public final void setTaxBaseAmount( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxBaseAmount value ) {
    TYPE.get().setPropertyValue( this, "_TaxBaseAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxPercentage getTaxPercentage() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxPercentage) TYPE.get().getPropertyValue( this, "_TaxPercentage" );
  }


  public final void setTaxPercentage( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.TaxPercentage value ) {
    TYPE.get().setPropertyValue( this, "_TaxPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJvClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_JvClassOfBusiness" );
  }


  public final void setJvClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_JvClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.JvClassOfBusiness getJvClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.JvClassOfBusiness) TYPE.get().getPropertyValue( this, "_JvClassOfBusiness_elem" );
  }


  public final void setJvClassOfBusiness_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.JvClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_JvClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNaicClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NaicClassOfBusiness" );
  }


  public final void setNaicClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NaicClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.NaicClassOfBusiness getNaicClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.NaicClassOfBusiness) TYPE.get().getPropertyValue( this, "_NaicClassOfBusiness_elem" );
  }


  public final void setNaicClassOfBusiness_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.NaicClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_NaicClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClassOfBusinessDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ClassOfBusinessDescription" );
  }


  public final void setClassOfBusinessDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ClassOfBusinessDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClassOfBusinessDescription getClassOfBusinessDescription_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClassOfBusinessDescription) TYPE.get().getPropertyValue( this, "_ClassOfBusinessDescription_elem" );
  }


  public final void setClassOfBusinessDescription_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClassOfBusinessDescription value ) {
    TYPE.get().setPropertyValue( this, "_ClassOfBusinessDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.RiskTaxBoundLocation getRiskTaxBoundLocation() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.RiskTaxBoundLocation) TYPE.get().getPropertyValue( this, "_RiskTaxBoundLocation" );
  }


  public final void setRiskTaxBoundLocation( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.RiskTaxBoundLocation value ) {
    TYPE.get().setPropertyValue( this, "_RiskTaxBoundLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AgentTaxBoundLocation getAgentTaxBoundLocation() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AgentTaxBoundLocation) TYPE.get().getPropertyValue( this, "_AgentTaxBoundLocation" );
  }


  public final void setAgentTaxBoundLocation( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AgentTaxBoundLocation value ) {
    TYPE.get().setPropertyValue( this, "_AgentTaxBoundLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.TaxCalculationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.TaxCalculationType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.TaxCalculationType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}

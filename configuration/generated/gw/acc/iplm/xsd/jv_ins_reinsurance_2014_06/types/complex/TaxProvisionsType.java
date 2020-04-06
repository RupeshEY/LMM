/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TaxProvisionsType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxProvisionsType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxProvision = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxProvision", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxCalculation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxCalculation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxProvisionAndPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxProvisionAndPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "Type", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxProvisionsType" );
    }
  };

  public TaxProvisionsType() {
    super( -1921162646, TYPE.get() );
  }

  private TaxProvisionsType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1921162646, state );
  }

  protected TaxProvisionsType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TaxProvisionsType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxProvisionsType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.TaxProvisionsType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvision> getTaxProvision() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvision>) TYPE.get().getPropertyValue( this, "_TaxProvision" );
  }


  public final void setTaxProvision( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvision> value ) {
    TYPE.get().setPropertyValue( this, "_TaxProvision", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxCalculation getTaxCalculation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxCalculation) TYPE.get().getPropertyValue( this, "_TaxCalculation" );
  }


  public final void setTaxCalculation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxCalculation value ) {
    TYPE.get().setPropertyValue( this, "_TaxCalculation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxAmount getTaxAmount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxAmount) TYPE.get().getPropertyValue( this, "_TaxAmount" );
  }


  public final void setTaxAmount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxAmount value ) {
    TYPE.get().setPropertyValue( this, "_TaxAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvisionAndPercentage> getTaxProvisionAndPercentage() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvisionAndPercentage>) TYPE.get().getPropertyValue( this, "_TaxProvisionAndPercentage" );
  }


  public final void setTaxProvisionAndPercentage( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TaxProvisionAndPercentage> value ) {
    TYPE.get().setPropertyValue( this, "_TaxProvisionAndPercentage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxProvisionsType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxProvisionsType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.TaxProvisionsType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ContractSectionClassType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractSectionClassType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JvClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "JvClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludedJvClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ExcludedJvClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NaicClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NaicClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludedNaicClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ExcludedNaicClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassOfBusinessDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ClassOfBusinessDescription", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractSectionClassType" );
    }
  };

  public ContractSectionClassType() {
    super( 1450860408, TYPE.get() );
  }

  private ContractSectionClassType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1450860408, state );
  }

  protected ContractSectionClassType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ContractSectionClassType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractSectionClassType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.ContractSectionClassType get$TypeInstance() {
    return this;
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness getJvClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness) TYPE.get().getPropertyValue( this, "_JvClassOfBusiness_elem" );
  }


  public final void setJvClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_JvClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExcludedJvClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExcludedJvClassOfBusiness" );
  }


  public final void setExcludedJvClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedJvClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedJvClassOfBusiness getExcludedJvClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedJvClassOfBusiness) TYPE.get().getPropertyValue( this, "_ExcludedJvClassOfBusiness_elem" );
  }


  public final void setExcludedJvClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedJvClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedJvClassOfBusiness_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness getNaicClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness) TYPE.get().getPropertyValue( this, "_NaicClassOfBusiness_elem" );
  }


  public final void setNaicClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_NaicClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExcludedNaicClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExcludedNaicClassOfBusiness" );
  }


  public final void setExcludedNaicClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedNaicClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedNaicClassOfBusiness getExcludedNaicClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedNaicClassOfBusiness) TYPE.get().getPropertyValue( this, "_ExcludedNaicClassOfBusiness_elem" );
  }


  public final void setExcludedNaicClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ExcludedNaicClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_ExcludedNaicClassOfBusiness_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClassOfBusinessDescription getClassOfBusinessDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClassOfBusinessDescription) TYPE.get().getPropertyValue( this, "_ClassOfBusinessDescription_elem" );
  }


  public final void setClassOfBusinessDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ClassOfBusinessDescription value ) {
    TYPE.get().setPropertyValue( this, "_ClassOfBusinessDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractSectionClassType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractSectionClassType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.ContractSectionClassType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
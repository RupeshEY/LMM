/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TaxApplicationType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxApplicationType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxProvision = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxProvision", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxCalculation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxCalculation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TaxAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxApplicationType" );
    }
  };

  public TaxApplicationType() {
    super( -1231653279, TYPE.get() );
  }

  private TaxApplicationType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1231653279, state );
  }

  protected TaxApplicationType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TaxApplicationType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxApplicationType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.TaxApplicationType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision getTaxProvision() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision) TYPE.get().getPropertyValue( this, "_TaxProvision" );
  }


  public final void setTaxProvision( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxProvision value ) {
    TYPE.get().setPropertyValue( this, "_TaxProvision", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxCalculation getTaxCalculation() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxCalculation) TYPE.get().getPropertyValue( this, "_TaxCalculation" );
  }


  public final void setTaxCalculation( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxCalculation value ) {
    TYPE.get().setPropertyValue( this, "_TaxCalculation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAmount getTaxAmount() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAmount) TYPE.get().getPropertyValue( this, "_TaxAmount" );
  }


  public final void setTaxAmount( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.TaxAmount value ) {
    TYPE.get().setPropertyValue( this, "_TaxAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxApplicationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxApplicationType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.TaxApplicationType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}

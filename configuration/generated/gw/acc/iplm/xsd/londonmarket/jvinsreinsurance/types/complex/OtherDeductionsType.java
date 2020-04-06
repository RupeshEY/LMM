/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class OtherDeductionsType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "OtherDeductionsType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherDeductionsPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "OtherDeductionsPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherDeductionsBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "OtherDeductionsBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.OtherDeductionsType" );
    }
  };

  public OtherDeductionsType() {
    super( -193729642, TYPE.get() );
  }

  private OtherDeductionsType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -193729642, state );
  }

  protected OtherDeductionsType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected OtherDeductionsType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.OtherDeductionsType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.OtherDeductionsType get$TypeInstance() {
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsPercentage getOtherDeductionsPercentage() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsPercentage) TYPE.get().getPropertyValue( this, "_OtherDeductionsPercentage" );
  }


  public final void setOtherDeductionsPercentage( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsPercentage value ) {
    TYPE.get().setPropertyValue( this, "_OtherDeductionsPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherDeductionsBasis() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherDeductionsBasis" );
  }


  public final void setOtherDeductionsBasis( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherDeductionsBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsBasis getOtherDeductionsBasis_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsBasis) TYPE.get().getPropertyValue( this, "_OtherDeductionsBasis_elem" );
  }


  public final void setOtherDeductionsBasis_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OtherDeductionsBasis value ) {
    TYPE.get().setPropertyValue( this, "_OtherDeductionsBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.OtherDeductionsType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.OtherDeductionsType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.OtherDeductionsType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DiscountForPromptPaymentType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DiscountForPromptPaymentType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PromptPaymentDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PromptPaymentDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DiscountPercentage = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DiscountPercentage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DiscountAmount = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DiscountAmount", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DiscountBasis = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DiscountBasis", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.DiscountForPromptPaymentType" );
    }
  };

  public DiscountForPromptPaymentType() {
    super( 1478548941, TYPE.get() );
  }

  private DiscountForPromptPaymentType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1478548941, state );
  }

  protected DiscountForPromptPaymentType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DiscountForPromptPaymentType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.DiscountForPromptPaymentType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.DiscountForPromptPaymentType get$TypeInstance() {
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
  public final java.lang.String getPromptPaymentDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PromptPaymentDate" );
  }


  public final void setPromptPaymentDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PromptPaymentDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PromptPaymentDate getPromptPaymentDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PromptPaymentDate) TYPE.get().getPropertyValue( this, "_PromptPaymentDate_elem" );
  }


  public final void setPromptPaymentDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PromptPaymentDate value ) {
    TYPE.get().setPropertyValue( this, "_PromptPaymentDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountPercentage getDiscountPercentage() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountPercentage) TYPE.get().getPropertyValue( this, "_DiscountPercentage" );
  }


  public final void setDiscountPercentage( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountPercentage value ) {
    TYPE.get().setPropertyValue( this, "_DiscountPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountAmount getDiscountAmount() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountAmount) TYPE.get().getPropertyValue( this, "_DiscountAmount" );
  }


  public final void setDiscountAmount( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountAmount value ) {
    TYPE.get().setPropertyValue( this, "_DiscountAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDiscountBasis() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DiscountBasis" );
  }


  public final void setDiscountBasis( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DiscountBasis", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountBasis getDiscountBasis_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountBasis) TYPE.get().getPropertyValue( this, "_DiscountBasis_elem" );
  }


  public final void setDiscountBasis_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.DiscountBasis value ) {
    TYPE.get().setPropertyValue( this, "_DiscountBasis_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.DiscountForPromptPaymentType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.DiscountForPromptPaymentType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.DiscountForPromptPaymentType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}

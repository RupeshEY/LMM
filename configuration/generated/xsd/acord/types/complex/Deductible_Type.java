/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCDEDUCTIBLE.class)
public class Deductible_Type extends xsd.acord.types.complex.PCDEDUCTIBLE {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Deductible_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndexAdjustment = new javax.xml.namespace.QName( "", "IndexAdjustment", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleBasisCd = new javax.xml.namespace.QName( "", "DeductibleBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleTypeCd = new javax.xml.namespace.QName( "", "DeductibleTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleAppliesToCd = new javax.xml.namespace.QName( "", "DeductibleAppliesToCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatText = new javax.xml.namespace.QName( "", "FormatText", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Deductible_Type" );
    }
  };

  public Deductible_Type() {
    super( -1989148387, TYPE.get() );
  }

  private Deductible_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1989148387, state );
  }

  protected Deductible_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Deductible_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Deductible_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Deductible_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IndexAdjustment getIndexAdjustment() {
    return (xsd.acord.IndexAdjustment) TYPE.get().getPropertyValue( this, "_IndexAdjustment" );
  }


  public final void setIndexAdjustment( xsd.acord.IndexAdjustment value ) {
    TYPE.get().setPropertyValue( this, "_IndexAdjustment", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.req.types.complex.FORMATTEDNUMBER.class)
public class PCCREDITSURCHARGE_NumericValue extends xsd.iso.req.types.complex.FORMATTEDNUMBER {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue" );
    }
  };

  public PCCREDITSURCHARGE_NumericValue() {
    super( 631747517, TYPE.get() );
  }

  private PCCREDITSURCHARGE_NumericValue( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 631747517, state );
  }

  protected PCCREDITSURCHARGE_NumericValue( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PCCREDITSURCHARGE_NumericValue( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
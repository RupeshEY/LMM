/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.resp.types.complex.CURRENCY.class)
public class PCPOLICY_TotalPaidLossAmt extends xsd.iso.resp.types.complex.CURRENCY {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ConversionRateRef = new javax.xml.namespace.QName( "", "ConversionRateRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.PCPOLICY_TotalPaidLossAmt" );
    }
  };

  public PCPOLICY_TotalPaidLossAmt() {
    super( 653348427, TYPE.get() );
  }

  private PCPOLICY_TotalPaidLossAmt( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 653348427, state );
  }

  protected PCPOLICY_TotalPaidLossAmt( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PCPOLICY_TotalPaidLossAmt( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.PCPOLICY_TotalPaidLossAmt> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.PCPOLICY_TotalPaidLossAmt get$TypeInstance() {
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

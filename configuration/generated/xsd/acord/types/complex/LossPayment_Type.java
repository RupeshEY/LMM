/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class LossPayment_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "LossPayment_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossPaymentAmt = new javax.xml.namespace.QName( "", "LossPaymentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReservedAmt = new javax.xml.namespace.QName( "", "ReservedAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.LossPayment_Type" );
    }
  };

  public LossPayment_Type() {
    super( -1067893635, TYPE.get() );
  }

  private LossPayment_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1067893635, state );
  }

  protected LossPayment_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected LossPayment_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.LossPayment_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.LossPayment_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPE.get().getPropertyValue( this, "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPE.get().setPropertyValue( this, "_Coverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossPaymentAmt getLossPaymentAmt() {
    return (xsd.acord.LossPaymentAmt) TYPE.get().getPropertyValue( this, "_LossPaymentAmt" );
  }


  public final void setLossPaymentAmt( xsd.acord.LossPaymentAmt value ) {
    TYPE.get().setPropertyValue( this, "_LossPaymentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReservedAmt getReservedAmt() {
    return (xsd.acord.ReservedAmt) TYPE.get().getPropertyValue( this, "_ReservedAmt" );
  }


  public final void setReservedAmt( xsd.acord.ReservedAmt value ) {
    TYPE.get().setPropertyValue( this, "_ReservedAmt", value );
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
/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Fee_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Fee_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FeeDesc = new javax.xml.namespace.QName( "", "FeeDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FeeAmt = new javax.xml.namespace.QName( "", "FeeAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Fee_Type" );
    }
  };

  public Fee_Type() {
    super( -954332358, TYPE.get() );
  }

  private Fee_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -954332358, state );
  }

  protected Fee_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Fee_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Fee_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Fee_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFeeDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FeeDesc" );
  }


  public final void setFeeDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FeeDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FeeDesc getFeeDesc_elem() {
    return (xsd.acord.FeeDesc) TYPE.get().getPropertyValue( this, "_FeeDesc_elem" );
  }


  public final void setFeeDesc_elem( xsd.acord.FeeDesc value ) {
    TYPE.get().setPropertyValue( this, "_FeeDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FeeAmt getFeeAmt() {
    return (xsd.acord.FeeAmt) TYPE.get().getPropertyValue( this, "_FeeAmt" );
  }


  public final void setFeeAmt( xsd.acord.FeeAmt value ) {
    TYPE.get().setPropertyValue( this, "_FeeAmt", value );
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
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.Base64Binary.class)
public class DigestValueType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "DigestValueType", "ds" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2000/09/xmldsig#", "ds" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.simple.DigestValueType" );
    }
  };

  public DigestValueType() {
    super( 1569378804, TYPE.get() );
  }

  public DigestValueType( gw.xml.BinaryData value ) {
    this();
    setValue( value );
  }

  private DigestValueType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1569378804, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.simple.DigestValueType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.simple.DigestValueType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getValue() {
    return (gw.xml.BinaryData) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData get$Value() {
    return (gw.xml.BinaryData) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.xml.BinaryData value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.xml.BinaryData value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
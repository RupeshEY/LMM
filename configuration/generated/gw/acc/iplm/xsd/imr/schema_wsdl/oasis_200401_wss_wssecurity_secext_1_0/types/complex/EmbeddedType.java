/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EmbeddedType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "EmbeddedType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ValueType = new javax.xml.namespace.QName( "", "ValueType", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.types.complex.EmbeddedType" );
    }
  };

  public EmbeddedType() {
    super( 1531944179, TYPE.get() );
  }

  private EmbeddedType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1531944179, state );
  }

  protected EmbeddedType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EmbeddedType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.types.complex.EmbeddedType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.oasis_200401_wss_wssecurity_secext_1_0.types.complex.EmbeddedType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValueType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ValueType" );
  }


  public final void setValueType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ValueType", value );
  }

}

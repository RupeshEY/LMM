/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReferenceParametersType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "ReferenceParametersType", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2005/08/addressing", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ReferenceParametersType" );
    }
  };

  public ReferenceParametersType() {
    super( -177708618, TYPE.get() );
  }

  private ReferenceParametersType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -177708618, state );
  }

  protected ReferenceParametersType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReferenceParametersType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ReferenceParametersType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.ReferenceParametersType get$TypeInstance() {
    return this;
  }


}
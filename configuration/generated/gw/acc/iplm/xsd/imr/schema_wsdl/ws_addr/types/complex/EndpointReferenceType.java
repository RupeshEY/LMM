/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EndpointReferenceType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "EndpointReferenceType", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2005/08/addressing", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "Address", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferenceParameters = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "ReferenceParameters", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Metadata = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "Metadata", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.EndpointReferenceType" );
    }
  };

  public EndpointReferenceType() {
    super( -2042852201, TYPE.get() );
  }

  private EndpointReferenceType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2042852201, state );
  }

  protected EndpointReferenceType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EndpointReferenceType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.EndpointReferenceType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.complex.EndpointReferenceType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddress() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Address" );
  }


  public final void setAddress( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.EndpointReferenceType_Address getAddress_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.EndpointReferenceType_Address) TYPE.get().getPropertyValue( this, "_Address_elem" );
  }


  public final void setAddress_elem( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.anonymous.elements.EndpointReferenceType_Address value ) {
    TYPE.get().setPropertyValue( this, "_Address_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ReferenceParameters getReferenceParameters() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ReferenceParameters) TYPE.get().getPropertyValue( this, "_ReferenceParameters" );
  }


  public final void setReferenceParameters( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.ReferenceParameters value ) {
    TYPE.get().setPropertyValue( this, "_ReferenceParameters", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Metadata getMetadata() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Metadata) TYPE.get().getPropertyValue( this, "_Metadata" );
  }


  public final void setMetadata( gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.Metadata value ) {
    TYPE.get().setPropertyValue( this, "_Metadata", value );
  }

}
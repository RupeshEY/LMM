/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.AnySimpleType.class)
public class RelationshipTypeOpenEnum extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2005/08/addressing", "RelationshipTypeOpenEnum", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2005/08/addressing", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.simple.RelationshipTypeOpenEnum" );
    }
  };

  public RelationshipTypeOpenEnum() {
    super( -1240212578, TYPE.get() );
  }

  public RelationshipTypeOpenEnum( java.lang.String value ) {
    this();
    setValue( value );
  }

  private RelationshipTypeOpenEnum( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1240212578, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.simple.RelationshipTypeOpenEnum> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.types.simple.RelationshipTypeOpenEnum get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

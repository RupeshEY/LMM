/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ObjectType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "ObjectType", "ds" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2000/09/xmldsig#", "ds" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "Id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_MimeType = new javax.xml.namespace.QName( "", "MimeType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Encoding = new javax.xml.namespace.QName( "", "Encoding", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.ObjectType" );
    }
  };

  public ObjectType() {
    super( 1025986336, TYPE.get() );
  }

  private ObjectType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1025986336, state );
  }

  protected ObjectType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ObjectType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.ObjectType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.ObjectType get$TypeInstance() {
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


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMimeType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MimeType" );
  }


  public final void setMimeType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MimeType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEncoding() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Encoding" );
  }


  public final void setEncoding( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Encoding", value );
  }

}

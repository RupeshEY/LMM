/* Generated by Guidewire XML Code Generator */

package xsd.xml_ns.attributes;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class Base {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/XML/1998/namespace", "base", "xml" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/XML/1998/namespace", "xml" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlAttributeTypeDataImpl init() {
      return (gw.internal.xml.XmlAttributeTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.xml_ns.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.xml_ns.attributes.Base" );
    }
  };

  // disable public constructor
  private Base() {
  }

  public static void set( gw.xml.XmlTypeInstance typeInstance, java.lang.String value ) {
    TYPE.get().set( typeInstance, value );
  }

  public static void set( gw.xml.XmlElement element, java.lang.String value ) {
    TYPE.get().set( element, value );
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( java.lang.String value ) {
    return TYPE.get().createSimpleValue( value );
  }

}
/* Generated by Guidewire XML Code Generator */

package xsd.acord.anonymous.attributes;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class GaragekeepersLocation_Type_LocationRef {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlAttributeTypeDataImpl init() {
      return (gw.internal.xml.XmlAttributeTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.anonymous.attributes.GaragekeepersLocation_Type_LocationRef" );
    }
  };

  // disable public constructor
  private GaragekeepersLocation_Type_LocationRef() {
  }

  public static void set( gw.xml.XmlTypeInstance typeInstance, gw.xml.XmlElement value ) {
    TYPE.get().set( typeInstance, value );
  }

  public static void set( gw.xml.XmlElement element, gw.xml.XmlElement value ) {
    TYPE.get().set( element, value );
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( gw.xml.XmlElement value ) {
    return TYPE.get().createSimpleValue( value );
  }

}

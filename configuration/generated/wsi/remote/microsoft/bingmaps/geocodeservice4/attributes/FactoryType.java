/* Generated by Guidewire XML Code Generator */

package wsi.remote.microsoft.bingmaps.geocodeservice4.attributes;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class FactoryType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.microsoft.com/2003/10/Serialization/", "FactoryType", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://schemas.microsoft.com/2003/10/Serialization/", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlAttributeTypeDataImpl init() {
      return (gw.internal.xml.XmlAttributeTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.microsoft.bingmaps.geocodeservice4.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.microsoft.bingmaps.geocodeservice4.attributes.FactoryType" );
    }
  };

  // disable public constructor
  private FactoryType() {
  }

  public static void set( gw.xml.XmlTypeInstance typeInstance, javax.xml.namespace.QName value ) {
    TYPE.get().set( typeInstance, value );
  }

  public static void set( gw.xml.XmlElement element, javax.xml.namespace.QName value ) {
    TYPE.get().set( element, value );
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( javax.xml.namespace.QName value ) {
    return TYPE.get().createSimpleValue( value );
  }

}

/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.attributes;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class BordereauType_Sender {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlAttributeTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlAttributeTypeDataImpl init() {
      return (gw.internal.xml.XmlAttributeTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.attributes.BordereauType_Sender" );
    }
  };

  // disable public constructor
  private BordereauType_Sender() {
  }

  public static void set( gw.xml.XmlTypeInstance typeInstance, gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.BordereauType_Sender value ) {
    TYPE.get().set( typeInstance, value );
  }

  public static void set( gw.xml.XmlElement element, gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.BordereauType_Sender value ) {
    TYPE.get().set( element, value );
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.BordereauType_Sender value ) {
    return TYPE.get().createSimpleValue( value );
  }

}
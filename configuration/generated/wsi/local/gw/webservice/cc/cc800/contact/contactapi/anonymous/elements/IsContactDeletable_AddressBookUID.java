/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class IsContactDeletable_AddressBookUID extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/contact/ContactAPI", "addressBookUID", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/contact/ContactAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.IsContactDeletable_AddressBookUID" );
    }
  };

  public IsContactDeletable_AddressBookUID() {
    super( -1376376045, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public IsContactDeletable_AddressBookUID( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1376376045, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private IsContactDeletable_AddressBookUID( gw.internal.xml.XmlElementState state ) {
    super( -1376376045, state );
  }

  public IsContactDeletable_AddressBookUID( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.IsContactDeletable_AddressBookUID> get$Class() {
    return getClass();
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABClientAPIPendingChangeContext_RootEntityID extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab800/ABClientAPIPendingChangeContext", "RootEntityID", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab800/ABClientAPIPendingChangeContext", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.ABClientAPIPendingChangeContext_RootEntityID" );
    }
  };

  public ABClientAPIPendingChangeContext_RootEntityID() {
    super( -492080694, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ABClientAPIPendingChangeContext_RootEntityID( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -492080694, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABClientAPIPendingChangeContext_RootEntityID( gw.internal.xml.XmlElementState state ) {
    super( -492080694, state );
  }

  public ABClientAPIPendingChangeContext_RootEntityID( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.ABClientAPIPendingChangeContext_RootEntityID> get$Class() {
    return getClass();
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ExternalDestinationConfig_PollInterval extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/messaging", "PollInterval", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/messaging", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.ExternalDestinationConfig_PollInterval" );
    }
  };

  public ExternalDestinationConfig_PollInterval() {
    super( 823096526, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public ExternalDestinationConfig_PollInterval( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( 823096526, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ExternalDestinationConfig_PollInterval( gw.internal.xml.XmlElementState state ) {
    super( 823096526, state );
  }

  public ExternalDestinationConfig_PollInterval( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.ExternalDestinationConfig_PollInterval> get$Class() {
    return getClass();
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MessageStatisticsData_Retry extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "Retry", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/messagingTools", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.MessageStatisticsData_Retry" );
    }
  };

  public MessageStatisticsData_Retry() {
    super( 505402989, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public MessageStatisticsData_Retry( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( 505402989, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MessageStatisticsData_Retry( gw.internal.xml.XmlElementState state ) {
    super( 505402989, state );
  }

  public MessageStatisticsData_Retry( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.MessageStatisticsData_Retry> get$Class() {
    return getClass();
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.profilerapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "dbmsCounterThresholdMs", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs" );
    }
  };

  public SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs() {
    super( 779381862, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( 779381862, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs( gw.internal.xml.XmlElementState state ) {
    super( 779381862, state );
  }

  public SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForStartablePlugin_DbmsCounterThresholdMs> get$Class() {
    return getClass();
  }
}
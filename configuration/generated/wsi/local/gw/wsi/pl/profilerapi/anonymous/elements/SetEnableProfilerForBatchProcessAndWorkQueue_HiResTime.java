/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.profilerapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "hiResTime", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime" );
    }
  };

  public SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime() {
    super( -1602499320, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( -1602499320, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime( gw.internal.xml.XmlElementState state ) {
    super( -1602499320, state );
  }

  public SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime> get$Class() {
    return getClass();
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.profilerapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SetEnableProfilerForWebService_DiffDbmsCounters extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "diffDbmsCounters", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForWebService_DiffDbmsCounters" );
    }
  };

  public SetEnableProfilerForWebService_DiffDbmsCounters() {
    super( 343772641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public SetEnableProfilerForWebService_DiffDbmsCounters( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( 343772641, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SetEnableProfilerForWebService_DiffDbmsCounters( gw.internal.xml.XmlElementState state ) {
    super( 343772641, state );
  }

  public SetEnableProfilerForWebService_DiffDbmsCounters( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForWebService_DiffDbmsCounters> get$Class() {
    return getClass();
  }
}

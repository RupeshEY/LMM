/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.profilerapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SetEnableProfilerForWebService_OperationName extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "operationName", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForWebService_OperationName" );
    }
  };

  public SetEnableProfilerForWebService_OperationName() {
    super( -1168031823, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public SetEnableProfilerForWebService_OperationName( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1168031823, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SetEnableProfilerForWebService_OperationName( gw.internal.xml.XmlElementState state ) {
    super( -1168031823, state );
  }

  public SetEnableProfilerForWebService_OperationName( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForWebService_OperationName> get$Class() {
    return getClass();
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class WQTaskDetails_ConsecutiveExceptions extends gw.internal.xml.simplevalues.IntXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/maintenanceTools", "ConsecutiveExceptions", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/maintenanceTools", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQTaskDetails_ConsecutiveExceptions" );
    }
  };

  public WQTaskDetails_ConsecutiveExceptions() {
    super( 466163635, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Int() );
  }

  public WQTaskDetails_ConsecutiveExceptions( gw.xsd.w3c.xmlschema.types.simple.Int typeInstance ) {
    super( 466163635, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private WQTaskDetails_ConsecutiveExceptions( gw.internal.xml.XmlElementState state ) {
    super( 466163635, state );
  }

  public WQTaskDetails_ConsecutiveExceptions( java.lang.Integer value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQTaskDetails_ConsecutiveExceptions> get$Class() {
    return getClass();
  }
}

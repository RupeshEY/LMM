/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SubmitUpdateStats_Incremental extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "incremental", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.SubmitUpdateStats_Incremental" );
    }
  };

  public SubmitUpdateStats_Incremental() {
    super( 1302533868, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public SubmitUpdateStats_Incremental( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( 1302533868, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SubmitUpdateStats_Incremental( gw.internal.xml.XmlElementState state ) {
    super( 1302533868, state );
  }

  public SubmitUpdateStats_Incremental( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.SubmitUpdateStats_Incremental> get$Class() {
    return getClass();
  }
}

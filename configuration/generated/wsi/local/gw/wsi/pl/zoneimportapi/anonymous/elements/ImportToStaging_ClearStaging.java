/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ImportToStaging_ClearStaging extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ZoneImportAPI", "clearStaging", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ZoneImportAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.zoneimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements.ImportToStaging_ClearStaging" );
    }
  };

  public ImportToStaging_ClearStaging() {
    super( 1256423180, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public ImportToStaging_ClearStaging( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( 1256423180, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ImportToStaging_ClearStaging( gw.internal.xml.XmlElementState state ) {
    super( 1256423180, state );
  }

  public ImportToStaging_ClearStaging( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.zoneimportapi.anonymous.elements.ImportToStaging_ClearStaging> get$Class() {
    return getClass();
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "clearErrorTable", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable" );
    }
  };

  public IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable() {
    super( 1740399114, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( 1740399114, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable( gw.internal.xml.XmlElementState state ) {
    super( 1740399114, state );
  }

  public IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.IntegrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess_ClearErrorTable> get$Class() {
    return getClass();
  }
}

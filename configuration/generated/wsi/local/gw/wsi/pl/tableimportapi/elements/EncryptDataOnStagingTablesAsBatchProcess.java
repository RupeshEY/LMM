/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.tableimportapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class EncryptDataOnStagingTablesAsBatchProcess extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "encryptDataOnStagingTablesAsBatchProcess", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess" );
    }
  };

  public EncryptDataOnStagingTablesAsBatchProcess() {
    super( -1229987904, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess() );
  }

  public EncryptDataOnStagingTablesAsBatchProcess( wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess typeInstance ) {
    super( -1229987904, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private EncryptDataOnStagingTablesAsBatchProcess( gw.internal.xml.XmlElementState state ) {
    super( -1229987904, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.EncryptDataOnStagingTablesAsBatchProcess typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }

  public static wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.tableimportapi.elements.EncryptDataOnStagingTablesAsBatchProcess.class );
  }
}

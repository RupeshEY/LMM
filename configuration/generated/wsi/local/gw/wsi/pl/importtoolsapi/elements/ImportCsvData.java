/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ImportCsvData extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "importCsvData", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CsvData = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "csvData", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DataSet = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "dataSet", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IgnoreNullConstraintViolations = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "ignoreNullConstraintViolations", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IgnoreAllErrors = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "ignoreAllErrors", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData" );
    }
  };

  public ImportCsvData() {
    super( 1756172711, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData() );
  }

  public ImportCsvData( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData typeInstance ) {
    super( 1756172711, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ImportCsvData( gw.internal.xml.XmlElementState state ) {
    super( 1756172711, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportCsvData typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }

  public static wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.importtoolsapi.elements.ImportCsvData.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCsvData() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CsvData" );
  }


  public final void setCsvData( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CsvData", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_CsvData getCsvData_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_CsvData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CsvData_elem" );
  }


  public final void setCsvData_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_CsvData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CsvData_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDataSet() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DataSet" );
  }


  public final void setDataSet( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DataSet", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_DataSet getDataSet_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_DataSet) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DataSet_elem" );
  }


  public final void setDataSet_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_DataSet value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DataSet_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIgnoreNullConstraintViolations() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IgnoreNullConstraintViolations" );
  }


  public final void setIgnoreNullConstraintViolations( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IgnoreNullConstraintViolations", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreNullConstraintViolations getIgnoreNullConstraintViolations_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreNullConstraintViolations) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IgnoreNullConstraintViolations_elem" );
  }


  public final void setIgnoreNullConstraintViolations_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreNullConstraintViolations value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IgnoreNullConstraintViolations_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIgnoreAllErrors() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IgnoreAllErrors" );
  }


  public final void setIgnoreAllErrors( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IgnoreAllErrors", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreAllErrors getIgnoreAllErrors_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreAllErrors) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IgnoreAllErrors_elem" );
  }


  public final void setIgnoreAllErrors_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportCsvData_IgnoreAllErrors value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IgnoreAllErrors_elem", value );
  }
}
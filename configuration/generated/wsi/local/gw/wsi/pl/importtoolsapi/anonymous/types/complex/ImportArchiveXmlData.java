/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ImportArchiveXmlData extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XmlData = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "xmlData", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportArchiveXmlData" );
    }
  };

  public ImportArchiveXmlData() {
    super( 1936913451, TYPE.get() );
  }

  private ImportArchiveXmlData( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1936913451, state );
  }

  protected ImportArchiveXmlData( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ImportArchiveXmlData( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportArchiveXmlData> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportArchiveXmlData get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getXmlData() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_XmlData" );
  }


  public final void setXmlData( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_XmlData", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportArchiveXmlData_XmlData getXmlData_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportArchiveXmlData_XmlData) TYPE.get().getPropertyValue( this, "_XmlData_elem" );
  }


  public final void setXmlData_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportArchiveXmlData_XmlData value ) {
    TYPE.get().setPropertyValue( this, "_XmlData_elem", value );
  }

}
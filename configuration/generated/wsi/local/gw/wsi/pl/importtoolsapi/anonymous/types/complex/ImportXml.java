/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ImportXml extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Xml = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "xml", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXml" );
    }
  };

  public ImportXml() {
    super( -1632993109, TYPE.get() );
  }

  private ImportXml( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1632993109, state );
  }

  protected ImportXml( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ImportXml( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXml> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXml get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXml_Xml getXml() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXml_Xml) TYPE.get().getPropertyValue( this, "_Xml" );
  }


  public final void setXml( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXml_Xml value ) {
    TYPE.get().setPropertyValue( this, "_Xml", value );
  }

}

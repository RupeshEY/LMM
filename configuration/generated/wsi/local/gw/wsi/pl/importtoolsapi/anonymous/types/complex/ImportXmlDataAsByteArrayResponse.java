/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ImportXmlDataAsByteArrayResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlDataAsByteArrayResponse" );
    }
  };

  public ImportXmlDataAsByteArrayResponse() {
    super( 1735702091, TYPE.get() );
  }

  private ImportXmlDataAsByteArrayResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1735702091, state );
  }

  protected ImportXmlDataAsByteArrayResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ImportXmlDataAsByteArrayResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlDataAsByteArrayResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.ImportXmlDataAsByteArrayResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlDataAsByteArrayResponse_Return getReturn() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlDataAsByteArrayResponse_Return) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlDataAsByteArrayResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }

}
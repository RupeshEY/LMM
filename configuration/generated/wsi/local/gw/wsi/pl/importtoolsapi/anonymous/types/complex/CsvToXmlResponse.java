/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CsvToXmlResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.CsvToXmlResponse" );
    }
  };

  public CsvToXmlResponse() {
    super( -1891323138, TYPE.get() );
  }

  private CsvToXmlResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1891323138, state );
  }

  protected CsvToXmlResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CsvToXmlResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.CsvToXmlResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.importtoolsapi.anonymous.types.complex.CsvToXmlResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReturn() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.CsvToXmlResponse_Return getReturn_elem() {
    return (wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.CsvToXmlResponse_Return) TYPE.get().getPropertyValue( this, "_Return_elem" );
  }


  public final void setReturn_elem( wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.CsvToXmlResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return_elem", value );
  }

}
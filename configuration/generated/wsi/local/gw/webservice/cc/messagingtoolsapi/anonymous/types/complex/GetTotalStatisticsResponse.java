/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetTotalStatisticsResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetTotalStatisticsResponse" );
    }
  };

  public GetTotalStatisticsResponse() {
    super( 291785740, TYPE.get() );
  }

  private GetTotalStatisticsResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 291785740, state );
  }

  protected GetTotalStatisticsResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetTotalStatisticsResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetTotalStatisticsResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetTotalStatisticsResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetTotalStatisticsResponse_Return getReturn() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetTotalStatisticsResponse_Return) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetTotalStatisticsResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetDestinationStatusResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetDestinationStatusResponse" );
    }
  };

  public GetDestinationStatusResponse() {
    super( 315229221, TYPE.get() );
  }

  private GetDestinationStatusResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 315229221, state );
  }

  protected GetDestinationStatusResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetDestinationStatusResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetDestinationStatusResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.types.complex.GetDestinationStatusResponse get$TypeInstance() {
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
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetDestinationStatusResponse_Return getReturn_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetDestinationStatusResponse_Return) TYPE.get().getPropertyValue( this, "_Return_elem" );
  }


  public final void setReturn_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.GetDestinationStatusResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return_elem", value );
  }

}
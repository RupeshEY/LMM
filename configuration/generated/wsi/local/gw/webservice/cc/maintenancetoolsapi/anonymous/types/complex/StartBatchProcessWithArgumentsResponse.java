/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class StartBatchProcessWithArgumentsResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartBatchProcessWithArgumentsResponse" );
    }
  };

  public StartBatchProcessWithArgumentsResponse() {
    super( -1933654235, TYPE.get() );
  }

  private StartBatchProcessWithArgumentsResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1933654235, state );
  }

  protected StartBatchProcessWithArgumentsResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected StartBatchProcessWithArgumentsResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartBatchProcessWithArgumentsResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartBatchProcessWithArgumentsResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartBatchProcessWithArgumentsResponse_Return getReturn() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartBatchProcessWithArgumentsResponse_Return) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartBatchProcessWithArgumentsResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }

}

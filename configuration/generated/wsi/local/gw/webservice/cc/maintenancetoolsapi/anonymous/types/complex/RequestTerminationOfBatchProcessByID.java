/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RequestTerminationOfBatchProcessByID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pid = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "pid", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.RequestTerminationOfBatchProcessByID" );
    }
  };

  public RequestTerminationOfBatchProcessByID() {
    super( -1381754274, TYPE.get() );
  }

  private RequestTerminationOfBatchProcessByID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1381754274, state );
  }

  protected RequestTerminationOfBatchProcessByID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RequestTerminationOfBatchProcessByID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.RequestTerminationOfBatchProcessByID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.RequestTerminationOfBatchProcessByID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.RequestTerminationOfBatchProcessByID_Pid getPid() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.RequestTerminationOfBatchProcessByID_Pid) TYPE.get().getPropertyValue( this, "_Pid" );
  }


  public final void setPid( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.RequestTerminationOfBatchProcessByID_Pid value ) {
    TYPE.get().setPropertyValue( this, "_Pid", value );
  }

}

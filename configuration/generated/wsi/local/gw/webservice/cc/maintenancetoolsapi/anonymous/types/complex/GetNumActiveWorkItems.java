/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetNumActiveWorkItems extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QueueName = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "queueName", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.GetNumActiveWorkItems" );
    }
  };

  public GetNumActiveWorkItems() {
    super( -1495426482, TYPE.get() );
  }

  private GetNumActiveWorkItems( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1495426482, state );
  }

  protected GetNumActiveWorkItems( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetNumActiveWorkItems( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.GetNumActiveWorkItems> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.GetNumActiveWorkItems get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getQueueName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_QueueName" );
  }


  public final void setQueueName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_QueueName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.GetNumActiveWorkItems_QueueName getQueueName_elem() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.GetNumActiveWorkItems_QueueName) TYPE.get().getPropertyValue( this, "_QueueName_elem" );
  }


  public final void setQueueName_elem( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.GetNumActiveWorkItems_QueueName value ) {
    TYPE.get().setPropertyValue( this, "_QueueName_elem", value );
  }

}
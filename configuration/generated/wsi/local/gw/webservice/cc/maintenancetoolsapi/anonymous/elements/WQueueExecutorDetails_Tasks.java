/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class WQueueExecutorDetails_Tasks extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/maintenanceTools", "Tasks", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/maintenanceTools", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/maintenanceTools", "Entry", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQueueExecutorDetails_Tasks" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks" );
    }
  };

  public WQueueExecutorDetails_Tasks() {
    super( -1865206971, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks() );
  }

  public WQueueExecutorDetails_Tasks( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks typeInstance ) {
    super( -1865206971, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private WQueueExecutorDetails_Tasks( gw.internal.xml.XmlElementState state ) {
    super( -1865206971, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQueueExecutorDetails_Tasks> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.WQueueExecutorDetails_Tasks typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQueueExecutorDetails_Tasks_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQueueExecutorDetails_Tasks_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.WQueueExecutorDetails_Tasks_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }

}
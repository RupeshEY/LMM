/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ProcessID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/tools", "ProcessID", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/tools", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pid = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/tools", "Pid", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.types.complex.ProcessID" );
    }
  };

  public ProcessID() {
    super( -13534464, TYPE.get() );
  }

  private ProcessID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -13534464, state );
  }

  protected ProcessID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ProcessID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.types.complex.ProcessID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.maintenancetoolsapi.types.complex.ProcessID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getPid() {
    return (java.lang.Long) TYPE.get().getPropertyValue( this, "_Pid" );
  }


  public final void setPid( java.lang.Long value ) {
    TYPE.get().setPropertyValue( this, "_Pid", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.ProcessID_Pid getPid_elem() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.ProcessID_Pid) TYPE.get().getPropertyValue( this, "_Pid_elem" );
  }


  public final void setPid_elem( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.ProcessID_Pid value ) {
    TYPE.get().setPropertyValue( this, "_Pid_elem", value );
  }

}
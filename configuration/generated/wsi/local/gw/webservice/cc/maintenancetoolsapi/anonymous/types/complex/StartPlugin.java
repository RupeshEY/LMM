/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class StartPlugin extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PluginName = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "pluginName", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPlugin" );
    }
  };

  public StartPlugin() {
    super( -464905622, TYPE.get() );
  }

  private StartPlugin( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -464905622, state );
  }

  protected StartPlugin( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected StartPlugin( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPlugin> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPlugin get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPluginName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PluginName" );
  }


  public final void setPluginName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PluginName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPlugin_PluginName getPluginName_elem() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPlugin_PluginName) TYPE.get().getPropertyValue( this, "_PluginName_elem" );
  }


  public final void setPluginName_elem( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPlugin_PluginName value ) {
    TYPE.get().setPropertyValue( this, "_PluginName_elem", value );
  }

}
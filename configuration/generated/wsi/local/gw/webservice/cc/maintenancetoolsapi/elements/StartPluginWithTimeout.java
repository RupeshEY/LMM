/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.maintenancetoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class StartPluginWithTimeout extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "startPluginWithTimeout", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PluginName = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "pluginName", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Timeout = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MaintenanceToolsAPI", "timeout", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.maintenancetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout" );
    }
  };

  public StartPluginWithTimeout() {
    super( 524910470, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout() );
  }

  public StartPluginWithTimeout( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout typeInstance ) {
    super( 524910470, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private StartPluginWithTimeout( gw.internal.xml.XmlElementState state ) {
    super( 524910470, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.types.complex.StartPluginWithTimeout typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }

  public static wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.maintenancetoolsapi.elements.StartPluginWithTimeout.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPluginName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PluginName" );
  }


  public final void setPluginName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PluginName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_PluginName getPluginName_elem() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_PluginName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PluginName_elem" );
  }


  public final void setPluginName_elem( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_PluginName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PluginName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getTimeout() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Timeout" );
  }


  public final void setTimeout( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Timeout", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_Timeout getTimeout_elem() {
    return (wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_Timeout) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Timeout_elem" );
  }


  public final void setTimeout_elem( wsi.local.gw.webservice.cc.maintenancetoolsapi.anonymous.elements.StartPluginWithTimeout_Timeout value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Timeout_elem", value );
  }
}

/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.profilerapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SetEnableProfilerForBatchProcessAndWorkQueue extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "setEnableProfilerForBatchProcessAndWorkQueue", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Enable = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "enable", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "type", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HiResTime = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "hiResTime", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EnableStackTracing = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "enableStackTracing", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EnableQueryOptimizerTracing = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "enableQueryOptimizerTracing", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EnableExtendedQueryTracing = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "enableExtendedQueryTracing", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DbmsCounterThresholdMs = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "dbmsCounterThresholdMs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DiffDbmsCounters = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ProfilerAPI", "diffDbmsCounters", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.profilerapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue" );
    }
  };

  public SetEnableProfilerForBatchProcessAndWorkQueue() {
    super( 59727580, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue() );
  }

  public SetEnableProfilerForBatchProcessAndWorkQueue( wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue typeInstance ) {
    super( 59727580, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SetEnableProfilerForBatchProcessAndWorkQueue( gw.internal.xml.XmlElementState state ) {
    super( 59727580, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.profilerapi.anonymous.types.complex.SetEnableProfilerForBatchProcessAndWorkQueue typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }

  public static wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.wsi.pl.profilerapi.elements.SetEnableProfilerForBatchProcessAndWorkQueue.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getEnable() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Enable" );
  }


  public final void setEnable( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Enable", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Enable getEnable_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Enable) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Enable_elem" );
  }


  public final void setEnable_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Enable value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Enable_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Type getType_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Type) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_Type value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getHiResTime() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HiResTime" );
  }


  public final void setHiResTime( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HiResTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime getHiResTime_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HiResTime_elem" );
  }


  public final void setHiResTime_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_HiResTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HiResTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getEnableStackTracing() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableStackTracing" );
  }


  public final void setEnableStackTracing( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableStackTracing", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableStackTracing getEnableStackTracing_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableStackTracing) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableStackTracing_elem" );
  }


  public final void setEnableStackTracing_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableStackTracing value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableStackTracing_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getEnableQueryOptimizerTracing() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableQueryOptimizerTracing" );
  }


  public final void setEnableQueryOptimizerTracing( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableQueryOptimizerTracing", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableQueryOptimizerTracing getEnableQueryOptimizerTracing_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableQueryOptimizerTracing) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableQueryOptimizerTracing_elem" );
  }


  public final void setEnableQueryOptimizerTracing_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableQueryOptimizerTracing value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableQueryOptimizerTracing_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getEnableExtendedQueryTracing() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableExtendedQueryTracing" );
  }


  public final void setEnableExtendedQueryTracing( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableExtendedQueryTracing", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableExtendedQueryTracing getEnableExtendedQueryTracing_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableExtendedQueryTracing) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EnableExtendedQueryTracing_elem" );
  }


  public final void setEnableExtendedQueryTracing_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_EnableExtendedQueryTracing value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EnableExtendedQueryTracing_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDbmsCounterThresholdMs() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DbmsCounterThresholdMs" );
  }


  public final void setDbmsCounterThresholdMs( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DbmsCounterThresholdMs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DbmsCounterThresholdMs getDbmsCounterThresholdMs_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DbmsCounterThresholdMs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DbmsCounterThresholdMs_elem" );
  }


  public final void setDbmsCounterThresholdMs_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DbmsCounterThresholdMs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DbmsCounterThresholdMs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDiffDbmsCounters() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DiffDbmsCounters" );
  }


  public final void setDiffDbmsCounters( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DiffDbmsCounters", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DiffDbmsCounters getDiffDbmsCounters_elem() {
    return (wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DiffDbmsCounters) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DiffDbmsCounters_elem" );
  }


  public final void setDiffDbmsCounters_elem( wsi.local.gw.wsi.pl.profilerapi.anonymous.elements.SetEnableProfilerForBatchProcessAndWorkQueue_DiffDbmsCounters value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DiffDbmsCounters_elem", value );
  }
}
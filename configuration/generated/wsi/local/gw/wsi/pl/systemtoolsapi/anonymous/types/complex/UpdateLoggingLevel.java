/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class UpdateLoggingLevel extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Logger = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "logger", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Level = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "level", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.UpdateLoggingLevel" );
    }
  };

  public UpdateLoggingLevel() {
    super( 1848476075, TYPE.get() );
  }

  private UpdateLoggingLevel( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1848476075, state );
  }

  protected UpdateLoggingLevel( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected UpdateLoggingLevel( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.UpdateLoggingLevel> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.UpdateLoggingLevel get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLogger() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Logger" );
  }


  public final void setLogger( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Logger", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Logger getLogger_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Logger) TYPE.get().getPropertyValue( this, "_Logger_elem" );
  }


  public final void setLogger_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Logger value ) {
    TYPE.get().setPropertyValue( this, "_Logger_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.SystemOutLogger_LoggingLevel getLevel() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.SystemOutLogger_LoggingLevel) TYPE.get().getPropertyValue( this, "_Level" );
  }


  public final void setLevel( wsi.local.gw.wsi.pl.systemtoolsapi.enums.SystemOutLogger_LoggingLevel value ) {
    TYPE.get().setPropertyValue( this, "_Level", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Level getLevel_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Level) TYPE.get().getPropertyValue( this, "_Level_elem" );
  }


  public final void setLevel_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.UpdateLoggingLevel_Level value ) {
    TYPE.get().setPropertyValue( this, "_Level_elem", value );
  }

}
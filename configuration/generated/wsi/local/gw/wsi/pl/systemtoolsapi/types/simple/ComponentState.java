/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class ComponentState extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ComponentState", "pogo5" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/system/cluster", "pogo5" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.types.simple.ComponentState" );
    }
  };

  public ComponentState() {
    super( 1464183826, TYPE.get() );
  }

  public ComponentState( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState value ) {
    this();
    setValue( value );
  }

  private ComponentState( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1464183826, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.types.simple.ComponentState> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.types.simple.ComponentState get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState getValue() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState get$Value() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.ricoverageapi.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class Currency extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/typekey", "Currency", "pogo3" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/typekey", "pogo3" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.ricoverageapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.ricoverageapi.types.simple.Currency" );
    }
  };

  public Currency() {
    super( 968476951, TYPE.get() );
  }

  public Currency( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency value ) {
    this();
    setValue( value );
  }

  private Currency( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 968476951, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.ricoverageapi.types.simple.Currency> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.ricoverageapi.types.simple.Currency get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency getValue() {
    return (wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency get$Value() {
    return (wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.enums.Currency value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.soapheaders.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class TransactionId extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.soapheaders.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.soapheaders.anonymous.types.complex.TransactionId" );
    }
  };

  public TransactionId() {
    super( 382623397, TYPE.get() );
  }

  public TransactionId( java.lang.String value ) {
    this();
    setValue( value );
  }

  private TransactionId( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 382623397, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.soapheaders.anonymous.types.complex.TransactionId> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.soapheaders.anonymous.types.complex.TransactionId get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
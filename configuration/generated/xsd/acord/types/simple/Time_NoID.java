/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.Time.class)
public class Time_NoID extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Time_NoID", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.simple.Time_NoID" );
    }
  };

  public Time_NoID() {
    super( 83708603, TYPE.get() );
  }

  public Time_NoID( gw.xml.date.XmlTime value ) {
    this();
    setValue( value );
  }

  private Time_NoID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 83708603, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.simple.Time_NoID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.simple.Time_NoID get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getValue() {
    return (gw.xml.date.XmlTime) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime get$Value() {
    return (gw.xml.date.XmlTime) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.xml.date.XmlTime value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.xml.date.XmlTime value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
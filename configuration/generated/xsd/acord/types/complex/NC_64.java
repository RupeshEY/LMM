/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.simple.NC_64_NoID.class)
public class NC_64 extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NC-64", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.NC_64" );
    }
  };

  public NC_64() {
    super( 1124806721, TYPE.get() );
  }

  public NC_64( java.lang.String value ) {
    this();
    setValue( value );
  }

  private NC_64( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1124806721, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.NC_64> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.NC_64 get$TypeInstance() {
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


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.xml_ns.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.NCName.class)
public class Space extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.xml_ns.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.xml_ns.anonymous.types.simple.Space" );
    }
  };

  public Space() {
    super( 1869230300, TYPE.get() );
  }

  public Space( xsd.xml_ns.enums.Space value ) {
    this();
    setValue( value );
  }

  private Space( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1869230300, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.xml_ns.anonymous.types.simple.Space> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.xml_ns.anonymous.types.simple.Space get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.xml_ns.enums.Space getValue() {
    return (xsd.xml_ns.enums.Space) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.xml_ns.enums.Space get$Value() {
    return (xsd.xml_ns.enums.Space) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( xsd.xml_ns.enums.Space value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( xsd.xml_ns.enums.Space value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
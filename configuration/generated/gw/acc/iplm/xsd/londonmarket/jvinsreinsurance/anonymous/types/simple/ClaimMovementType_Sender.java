/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.NMTOKEN.class)
public class ClaimMovementType_Sender extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.ClaimMovementType_Sender" );
    }
  };

  public ClaimMovementType_Sender() {
    super( -662931578, TYPE.get() );
  }

  public ClaimMovementType_Sender( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender value ) {
    this();
    setValue( value );
  }

  private ClaimMovementType_Sender( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -662931578, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.ClaimMovementType_Sender> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.ClaimMovementType_Sender get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender getValue() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender get$Value() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.NMTOKEN.class)
public class AmtType_Share extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.AmtType_Share" );
    }
  };

  public AmtType_Share() {
    super( -830223317, TYPE.get() );
  }

  public AmtType_Share( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share value ) {
    this();
    setValue( value );
  }

  private AmtType_Share( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -830223317, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.AmtType_Share> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.types.simple.AmtType_Share get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share getValue() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share get$Value() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.AmtType_Share value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

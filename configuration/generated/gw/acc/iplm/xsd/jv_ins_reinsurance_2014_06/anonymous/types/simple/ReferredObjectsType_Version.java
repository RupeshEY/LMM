/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.Token.class)
public class ReferredObjectsType_Version extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.types.simple.ReferredObjectsType_Version" );
    }
  };

  public ReferredObjectsType_Version() {
    super( -487912682, TYPE.get() );
  }

  public ReferredObjectsType_Version( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version value ) {
    this();
    setValue( value );
  }

  private ReferredObjectsType_Version( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -487912682, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.types.simple.ReferredObjectsType_Version> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.types.simple.ReferredObjectsType_Version get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version getValue() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version get$Value() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.enums.ReferredObjectsType_Version value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}
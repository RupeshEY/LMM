/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.DateTime.class)
public class FindPolicyLocationsWithinBoundingBox_EffDate extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.simple.FindPolicyLocationsWithinBoundingBox_EffDate" );
    }
  };

  public FindPolicyLocationsWithinBoundingBox_EffDate() {
    super( -1194397069, TYPE.get() );
  }

  public FindPolicyLocationsWithinBoundingBox_EffDate( java.util.Date value ) {
    this();
    setValue( value );
  }

  private FindPolicyLocationsWithinBoundingBox_EffDate( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1194397069, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.simple.FindPolicyLocationsWithinBoundingBox_EffDate> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.types.simple.FindPolicyLocationsWithinBoundingBox_EffDate get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getValue() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date get$Value() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CommlDriverScheduleState_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlDriverScheduleState_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDays = new javax.xml.namespace.QName( "", "NumDays", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehs = new javax.xml.namespace.QName( "", "NumVehs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HiredLiabilityCostAmt = new javax.xml.namespace.QName( "", "HiredLiabilityCostAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HiredPhysicalDamageCostAmt = new javax.xml.namespace.QName( "", "HiredPhysicalDamageCostAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlDriverScheduleState_Type" );
    }
  };

  public CommlDriverScheduleState_Type() {
    super( -701098720, TYPE.get() );
  }

  private CommlDriverScheduleState_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -701098720, state );
  }

  protected CommlDriverScheduleState_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlDriverScheduleState_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CommlDriverScheduleState_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CommlDriverScheduleState_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDays() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDays" );
  }


  public final void setNumDays( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDays", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDays getNumDays_elem() {
    return (xsd.acord.NumDays) TYPE.get().getPropertyValue( this, "_NumDays_elem" );
  }


  public final void setNumDays_elem( xsd.acord.NumDays value ) {
    TYPE.get().setPropertyValue( this, "_NumDays_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehs() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumVehs" );
  }


  public final void setNumVehs( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumVehs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehs getNumVehs_elem() {
    return (xsd.acord.NumVehs) TYPE.get().getPropertyValue( this, "_NumVehs_elem" );
  }


  public final void setNumVehs_elem( xsd.acord.NumVehs value ) {
    TYPE.get().setPropertyValue( this, "_NumVehs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HiredLiabilityCostAmt getHiredLiabilityCostAmt() {
    return (xsd.acord.HiredLiabilityCostAmt) TYPE.get().getPropertyValue( this, "_HiredLiabilityCostAmt" );
  }


  public final void setHiredLiabilityCostAmt( xsd.acord.HiredLiabilityCostAmt value ) {
    TYPE.get().setPropertyValue( this, "_HiredLiabilityCostAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HiredPhysicalDamageCostAmt getHiredPhysicalDamageCostAmt() {
    return (xsd.acord.HiredPhysicalDamageCostAmt) TYPE.get().getPropertyValue( this, "_HiredPhysicalDamageCostAmt" );
  }


  public final void setHiredPhysicalDamageCostAmt( xsd.acord.HiredPhysicalDamageCostAmt value ) {
    TYPE.get().setPropertyValue( this, "_HiredPhysicalDamageCostAmt", value );
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
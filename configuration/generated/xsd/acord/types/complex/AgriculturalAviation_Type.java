/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AgriculturalAviation_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AgriculturalAviation_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumYrsInAerialAg = new javax.xml.namespace.QName( "", "NumYrsInAerialAg", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HomeStateProvCd = new javax.xml.namespace.QName( "", "HomeStateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherStatesOperDesc = new javax.xml.namespace.QName( "", "OtherStatesOperDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SafetyProgramDt = new javax.xml.namespace.QName( "", "SafetyProgramDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumAircraft = new javax.xml.namespace.QName( "", "NumAircraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalUsesDesc = new javax.xml.namespace.QName( "", "AdditionalUsesDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AircraftRef = new javax.xml.namespace.QName( "", "AircraftRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FormerNameRefs = new javax.xml.namespace.QName( "", "FormerNameRefs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AgriculturalAviation_Type" );
    }
  };

  public AgriculturalAviation_Type() {
    super( 434428594, TYPE.get() );
  }

  private AgriculturalAviation_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 434428594, state );
  }

  protected AgriculturalAviation_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AgriculturalAviation_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AgriculturalAviation_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AgriculturalAviation_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumYrsInAerialAg() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumYrsInAerialAg" );
  }


  public final void setNumYrsInAerialAg( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumYrsInAerialAg", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumYrsInAerialAg getNumYrsInAerialAg_elem() {
    return (xsd.acord.NumYrsInAerialAg) TYPE.get().getPropertyValue( this, "_NumYrsInAerialAg_elem" );
  }


  public final void setNumYrsInAerialAg_elem( xsd.acord.NumYrsInAerialAg value ) {
    TYPE.get().setPropertyValue( this, "_NumYrsInAerialAg_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHomeStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HomeStateProvCd" );
  }


  public final void setHomeStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HomeStateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HomeStateProvCd getHomeStateProvCd_elem() {
    return (xsd.acord.HomeStateProvCd) TYPE.get().getPropertyValue( this, "_HomeStateProvCd_elem" );
  }


  public final void setHomeStateProvCd_elem( xsd.acord.HomeStateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_HomeStateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherStatesOperDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherStatesOperDesc" );
  }


  public final void setOtherStatesOperDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherStatesOperDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherStatesOperDesc getOtherStatesOperDesc_elem() {
    return (xsd.acord.OtherStatesOperDesc) TYPE.get().getPropertyValue( this, "_OtherStatesOperDesc_elem" );
  }


  public final void setOtherStatesOperDesc_elem( xsd.acord.OtherStatesOperDesc value ) {
    TYPE.get().setPropertyValue( this, "_OtherStatesOperDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSafetyProgramDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SafetyProgramDt" );
  }


  public final void setSafetyProgramDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SafetyProgramDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SafetyProgramDt getSafetyProgramDt_elem() {
    return (xsd.acord.SafetyProgramDt) TYPE.get().getPropertyValue( this, "_SafetyProgramDt_elem" );
  }


  public final void setSafetyProgramDt_elem( xsd.acord.SafetyProgramDt value ) {
    TYPE.get().setPropertyValue( this, "_SafetyProgramDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumAircraft() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumAircraft" );
  }


  public final void setNumAircraft( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumAircraft", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumAircraft getNumAircraft_elem() {
    return (xsd.acord.NumAircraft) TYPE.get().getPropertyValue( this, "_NumAircraft_elem" );
  }


  public final void setNumAircraft_elem( xsd.acord.NumAircraft value ) {
    TYPE.get().setPropertyValue( this, "_NumAircraft_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getLossDt() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_LossDt" );
  }


  public final void setLossDt( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_LossDt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LossDt> getLossDt_elem() {
    return (java.util.List<xsd.acord.LossDt>) TYPE.get().getPropertyValue( this, "_LossDt_elem" );
  }


  public final void setLossDt_elem( java.util.List<xsd.acord.LossDt> value ) {
    TYPE.get().setPropertyValue( this, "_LossDt_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAdditionalUsesDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AdditionalUsesDesc" );
  }


  public final void setAdditionalUsesDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalUsesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdditionalUsesDesc getAdditionalUsesDesc_elem() {
    return (xsd.acord.AdditionalUsesDesc) TYPE.get().getPropertyValue( this, "_AdditionalUsesDesc_elem" );
  }


  public final void setAdditionalUsesDesc_elem( xsd.acord.AdditionalUsesDesc value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalUsesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAircraftRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_AircraftRef" );
  }


  public final void setAircraftRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_AircraftRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getFormerNameRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_FormerNameRefs" );
  }


  public final void setFormerNameRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_FormerNameRefs", value );
  }

}
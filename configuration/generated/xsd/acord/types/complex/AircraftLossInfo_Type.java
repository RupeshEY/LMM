/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AircraftLossInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AircraftLossInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pilot = new javax.xml.namespace.QName( "", "Pilot", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Aircraft = new javax.xml.namespace.QName( "", "Aircraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ObjectLossDesc = new javax.xml.namespace.QName( "", "ObjectLossDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DamageDesc = new javax.xml.namespace.QName( "", "DamageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereSeenDesc = new javax.xml.namespace.QName( "", "WhereSeenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherInsuranceInd = new javax.xml.namespace.QName( "", "OtherInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyDamagedNonAircraftInd = new javax.xml.namespace.QName( "", "PropertyDamagedNonAircraftInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProbableIncurredAmt = new javax.xml.namespace.QName( "", "ProbableIncurredAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ViewItemRef = new javax.xml.namespace.QName( "", "ViewItemRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OwnerRef = new javax.xml.namespace.QName( "", "OwnerRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LossPayeeRef = new javax.xml.namespace.QName( "", "LossPayeeRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ClaimsPartyRefs = new javax.xml.namespace.QName( "", "ClaimsPartyRefs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AircraftLossInfo_Type" );
    }
  };

  public AircraftLossInfo_Type() {
    super( 1579181451, TYPE.get() );
  }

  private AircraftLossInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1579181451, state );
  }

  protected AircraftLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AircraftLossInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AircraftLossInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AircraftLossInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Pilot> getPilot() {
    return (java.util.List<xsd.acord.Pilot>) TYPE.get().getPropertyValue( this, "_Pilot" );
  }


  public final void setPilot( java.util.List<xsd.acord.Pilot> value ) {
    TYPE.get().setPropertyValue( this, "_Pilot", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Aircraft getAircraft() {
    return (xsd.acord.Aircraft) TYPE.get().getPropertyValue( this, "_Aircraft" );
  }


  public final void setAircraft( xsd.acord.Aircraft value ) {
    TYPE.get().setPropertyValue( this, "_Aircraft", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getObjectLossDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ObjectLossDesc" );
  }


  public final void setObjectLossDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ObjectLossDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ObjectLossDesc getObjectLossDesc_elem() {
    return (xsd.acord.ObjectLossDesc) TYPE.get().getPropertyValue( this, "_ObjectLossDesc_elem" );
  }


  public final void setObjectLossDesc_elem( xsd.acord.ObjectLossDesc value ) {
    TYPE.get().setPropertyValue( this, "_ObjectLossDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDamageDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DamageDesc" );
  }


  public final void setDamageDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DamageDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DamageDesc getDamageDesc_elem() {
    return (xsd.acord.DamageDesc) TYPE.get().getPropertyValue( this, "_DamageDesc_elem" );
  }


  public final void setDamageDesc_elem( xsd.acord.DamageDesc value ) {
    TYPE.get().setPropertyValue( this, "_DamageDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWhereSeenDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WhereSeenDesc" );
  }


  public final void setWhereSeenDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WhereSeenDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WhereSeenDesc getWhereSeenDesc_elem() {
    return (xsd.acord.WhereSeenDesc) TYPE.get().getPropertyValue( this, "_WhereSeenDesc_elem" );
  }


  public final void setWhereSeenDesc_elem( xsd.acord.WhereSeenDesc value ) {
    TYPE.get().setPropertyValue( this, "_WhereSeenDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOtherInsuranceInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd" );
  }


  public final void setOtherInsuranceInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherInsuranceInd getOtherInsuranceInd_elem() {
    return (xsd.acord.OtherInsuranceInd) TYPE.get().getPropertyValue( this, "_OtherInsuranceInd_elem" );
  }


  public final void setOtherInsuranceInd_elem( xsd.acord.OtherInsuranceInd value ) {
    TYPE.get().setPropertyValue( this, "_OtherInsuranceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPropertyDamagedNonAircraftInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PropertyDamagedNonAircraftInd" );
  }


  public final void setPropertyDamagedNonAircraftInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PropertyDamagedNonAircraftInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyDamagedNonAircraftInd getPropertyDamagedNonAircraftInd_elem() {
    return (xsd.acord.PropertyDamagedNonAircraftInd) TYPE.get().getPropertyValue( this, "_PropertyDamagedNonAircraftInd_elem" );
  }


  public final void setPropertyDamagedNonAircraftInd_elem( xsd.acord.PropertyDamagedNonAircraftInd value ) {
    TYPE.get().setPropertyValue( this, "_PropertyDamagedNonAircraftInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProbableIncurredAmt getProbableIncurredAmt() {
    return (xsd.acord.ProbableIncurredAmt) TYPE.get().getPropertyValue( this, "_ProbableIncurredAmt" );
  }


  public final void setProbableIncurredAmt( xsd.acord.ProbableIncurredAmt value ) {
    TYPE.get().setPropertyValue( this, "_ProbableIncurredAmt", value );
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
  public final gw.xml.XmlElement getViewItemRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ViewItemRef" );
  }


  public final void setViewItemRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ViewItemRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOwnerRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_OwnerRef" );
  }


  public final void setOwnerRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_OwnerRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLossPayeeRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LossPayeeRef" );
  }


  public final void setLossPayeeRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LossPayeeRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getClaimsPartyRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_ClaimsPartyRefs" );
  }


  public final void setClaimsPartyRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRefs", value );
  }

}
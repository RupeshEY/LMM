/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsInjuredInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossActCd = new javax.xml.namespace.QName( "", "LossActCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Age = new javax.xml.namespace.QName( "", "Age", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActivitiesDesc = new javax.xml.namespace.QName( "", "ActivitiesDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkProcessDesc = new javax.xml.namespace.QName( "", "WorkProcessDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EquipmentUsedDesc = new javax.xml.namespace.QName( "", "EquipmentUsedDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventsDesc = new javax.xml.namespace.QName( "", "EventsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FatalityInd = new javax.xml.namespace.QName( "", "FatalityInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreExistingDisabilityCd = new javax.xml.namespace.QName( "", "PreExistingDisabilityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InitialTreatmentCd = new javax.xml.namespace.QName( "", "InitialTreatmentCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ICDDiagnosticCd = new javax.xml.namespace.QName( "", "ICDDiagnosticCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_FatalityInd = new javax.xml.namespace.QName( "", "com.iso_FatalityInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_AmbulanceUsedInd = new javax.xml.namespace.QName( "", "com.iso_AmbulanceUsedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_DisabledDueToAccidentInd = new javax.xml.namespace.QName( "", "com.iso_DisabledDueToAccidentInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CPT = new javax.xml.namespace.QName( "", "com.iso_CPT", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurgeryInd = new javax.xml.namespace.QName( "", "SurgeryInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereTakenDesc = new javax.xml.namespace.QName( "", "WhereTakenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LostTimeInd = new javax.xml.namespace.QName( "", "LostTimeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeLostPeriod = new javax.xml.namespace.QName( "", "TimeLostPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RestrictedWorkPeriod = new javax.xml.namespace.QName( "", "RestrictedWorkPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventInfo = new javax.xml.namespace.QName( "", "EventInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsInjury = new javax.xml.namespace.QName( "", "ClaimsInjury", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InjuredTakenRef = new javax.xml.namespace.QName( "", "InjuredTakenRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimsInjuredInfo" );
    }
  };

  public ClaimsInjuredInfo() {
    super( -1444242426, TYPE.get() );
  }

  private ClaimsInjuredInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1444242426, state );
  }

  protected ClaimsInjuredInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsInjuredInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ClaimsInjuredInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ClaimsInjuredInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossActCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossActCd" );
  }


  public final void setLossActCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossActCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LossActCd getLossActCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LossActCd) TYPE.get().getPropertyValue( this, "_LossActCd_elem" );
  }


  public final void setLossActCd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LossActCd value ) {
    TYPE.get().setPropertyValue( this, "_LossActCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAge() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Age" );
  }


  public final void setAge( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Age", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_Age getAge_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_Age) TYPE.get().getPropertyValue( this, "_Age_elem" );
  }


  public final void setAge_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_Age value ) {
    TYPE.get().setPropertyValue( this, "_Age_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getActivitiesDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ActivitiesDesc" );
  }


  public final void setActivitiesDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ActivitiesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ActivitiesDesc getActivitiesDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ActivitiesDesc) TYPE.get().getPropertyValue( this, "_ActivitiesDesc_elem" );
  }


  public final void setActivitiesDesc_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ActivitiesDesc value ) {
    TYPE.get().setPropertyValue( this, "_ActivitiesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWorkProcessDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WorkProcessDesc" );
  }


  public final void setWorkProcessDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WorkProcessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WorkProcessDesc getWorkProcessDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WorkProcessDesc) TYPE.get().getPropertyValue( this, "_WorkProcessDesc_elem" );
  }


  public final void setWorkProcessDesc_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WorkProcessDesc value ) {
    TYPE.get().setPropertyValue( this, "_WorkProcessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEquipmentUsedDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EquipmentUsedDesc" );
  }


  public final void setEquipmentUsedDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EquipmentUsedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EquipmentUsedDesc getEquipmentUsedDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EquipmentUsedDesc) TYPE.get().getPropertyValue( this, "_EquipmentUsedDesc_elem" );
  }


  public final void setEquipmentUsedDesc_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EquipmentUsedDesc value ) {
    TYPE.get().setPropertyValue( this, "_EquipmentUsedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEventsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EventsDesc" );
  }


  public final void setEventsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EventsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EventsDesc getEventsDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EventsDesc) TYPE.get().getPropertyValue( this, "_EventsDesc_elem" );
  }


  public final void setEventsDesc_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_EventsDesc value ) {
    TYPE.get().setPropertyValue( this, "_EventsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFatalityInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FatalityInd" );
  }


  public final void setFatalityInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FatalityInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_FatalityInd getFatalityInd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_FatalityInd) TYPE.get().getPropertyValue( this, "_FatalityInd_elem" );
  }


  public final void setFatalityInd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_FatalityInd value ) {
    TYPE.get().setPropertyValue( this, "_FatalityInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPreExistingDisabilityCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PreExistingDisabilityCd" );
  }


  public final void setPreExistingDisabilityCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PreExistingDisabilityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_PreExistingDisabilityCd getPreExistingDisabilityCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_PreExistingDisabilityCd) TYPE.get().getPropertyValue( this, "_PreExistingDisabilityCd_elem" );
  }


  public final void setPreExistingDisabilityCd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_PreExistingDisabilityCd value ) {
    TYPE.get().setPropertyValue( this, "_PreExistingDisabilityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInitialTreatmentCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InitialTreatmentCd" );
  }


  public final void setInitialTreatmentCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InitialTreatmentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_InitialTreatmentCd getInitialTreatmentCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_InitialTreatmentCd) TYPE.get().getPropertyValue( this, "_InitialTreatmentCd_elem" );
  }


  public final void setInitialTreatmentCd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_InitialTreatmentCd value ) {
    TYPE.get().setPropertyValue( this, "_InitialTreatmentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getICDDiagnosticCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_ICDDiagnosticCd" );
  }


  public final void setICDDiagnosticCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_ICDDiagnosticCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ICDDiagnosticCd> getICDDiagnosticCd_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ICDDiagnosticCd>) TYPE.get().getPropertyValue( this, "_ICDDiagnosticCd_elem" );
  }


  public final void setICDDiagnosticCd_elem( java.util.List<xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ICDDiagnosticCd> value ) {
    TYPE.get().setPropertyValue( this, "_ICDDiagnosticCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_FatalityInd getComIso_FatalityInd() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_FatalityInd) TYPE.get().getPropertyValue( this, "_ComIso_FatalityInd" );
  }


  public final void setComIso_FatalityInd( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_FatalityInd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_FatalityInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_AmbulanceUsedInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_AmbulanceUsedInd" );
  }


  public final void setComIso_AmbulanceUsedInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_AmbulanceUsedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_AmbulanceUsedInd getComIso_AmbulanceUsedInd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_AmbulanceUsedInd) TYPE.get().getPropertyValue( this, "_ComIso_AmbulanceUsedInd_elem" );
  }


  public final void setComIso_AmbulanceUsedInd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_AmbulanceUsedInd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_AmbulanceUsedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_DisabledDueToAccidentInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_DisabledDueToAccidentInd" );
  }


  public final void setComIso_DisabledDueToAccidentInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_DisabledDueToAccidentInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_DisabledDueToAccidentInd getComIso_DisabledDueToAccidentInd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_DisabledDueToAccidentInd) TYPE.get().getPropertyValue( this, "_ComIso_DisabledDueToAccidentInd_elem" );
  }


  public final void setComIso_DisabledDueToAccidentInd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_DisabledDueToAccidentInd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_DisabledDueToAccidentInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_CPT() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_CPT" );
  }


  public final void setComIso_CPT( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CPT", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_CPT getComIso_CPT_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_CPT) TYPE.get().getPropertyValue( this, "_ComIso_CPT_elem" );
  }


  public final void setComIso_CPT_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_ComIso_CPT value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_CPT_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSurgeryInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SurgeryInd" );
  }


  public final void setSurgeryInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SurgeryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_SurgeryInd getSurgeryInd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_SurgeryInd) TYPE.get().getPropertyValue( this, "_SurgeryInd_elem" );
  }


  public final void setSurgeryInd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_SurgeryInd value ) {
    TYPE.get().setPropertyValue( this, "_SurgeryInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWhereTakenDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WhereTakenDesc" );
  }


  public final void setWhereTakenDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WhereTakenDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WhereTakenDesc getWhereTakenDesc_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WhereTakenDesc) TYPE.get().getPropertyValue( this, "_WhereTakenDesc_elem" );
  }


  public final void setWhereTakenDesc_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_WhereTakenDesc value ) {
    TYPE.get().setPropertyValue( this, "_WhereTakenDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLostTimeInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LostTimeInd" );
  }


  public final void setLostTimeInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LostTimeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LostTimeInd getLostTimeInd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LostTimeInd) TYPE.get().getPropertyValue( this, "_LostTimeInd_elem" );
  }


  public final void setLostTimeInd_elem( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_LostTimeInd value ) {
    TYPE.get().setPropertyValue( this, "_LostTimeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_TimeLostPeriod getTimeLostPeriod() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_TimeLostPeriod) TYPE.get().getPropertyValue( this, "_TimeLostPeriod" );
  }


  public final void setTimeLostPeriod( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_TimeLostPeriod value ) {
    TYPE.get().setPropertyValue( this, "_TimeLostPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_RestrictedWorkPeriod getRestrictedWorkPeriod() {
    return (xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_RestrictedWorkPeriod) TYPE.get().getPropertyValue( this, "_RestrictedWorkPeriod" );
  }


  public final void setRestrictedWorkPeriod( xsd.iso.req.anonymous.elements.ClaimsInjuredInfo_RestrictedWorkPeriod value ) {
    TYPE.get().setPropertyValue( this, "_RestrictedWorkPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.EventInfo> getEventInfo() {
    return (java.util.List<xsd.iso.req.EventInfo>) TYPE.get().getPropertyValue( this, "_EventInfo" );
  }


  public final void setEventInfo( java.util.List<xsd.iso.req.EventInfo> value ) {
    TYPE.get().setPropertyValue( this, "_EventInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsInjury> getClaimsInjury() {
    return (java.util.List<xsd.iso.req.ClaimsInjury>) TYPE.get().getPropertyValue( this, "_ClaimsInjury" );
  }


  public final void setClaimsInjury( java.util.List<xsd.iso.req.ClaimsInjury> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsInjury", value );
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
  public final gw.xml.XmlElement getInjuredTakenRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_InjuredTakenRef" );
  }


  public final void setInjuredTakenRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_InjuredTakenRef", value );
  }

}
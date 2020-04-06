/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimsInjuredInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsInjuredInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
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
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurgeryInd = new javax.xml.namespace.QName( "", "SurgeryInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereTakenDesc = new javax.xml.namespace.QName( "", "WhereTakenDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LostTimeInd = new javax.xml.namespace.QName( "", "LostTimeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeLostPeriod = new javax.xml.namespace.QName( "", "TimeLostPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RestrictedWorkPeriod = new javax.xml.namespace.QName( "", "RestrictedWorkPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventInfo = new javax.xml.namespace.QName( "", "EventInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsInjury = new javax.xml.namespace.QName( "", "ClaimsInjury", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InjuredTakenRef = new javax.xml.namespace.QName( "", "InjuredTakenRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ClaimsInjuredInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClaimsInjuredInfo_Type" );
    }
  };

  public ClaimsInjuredInfo() {
    super( -1985311100, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ClaimsInjuredInfo_Type() );
  }

  public ClaimsInjuredInfo( xsd.acord.types.complex.ClaimsInjuredInfo_Type typeInstance ) {
    super( -1985311100, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimsInjuredInfo( gw.internal.xml.XmlElementState state ) {
    super( -1985311100, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ClaimsInjuredInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ClaimsInjuredInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ClaimsInjuredInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ClaimsInjuredInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }

  public static xsd.acord.ClaimsInjuredInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ClaimsInjuredInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossActCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossActCd" );
  }


  public final void setLossActCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossActCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossActCd getLossActCd_elem() {
    return (xsd.acord.LossActCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossActCd_elem" );
  }


  public final void setLossActCd_elem( xsd.acord.LossActCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossActCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAge() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Age" );
  }


  public final void setAge( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Age", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Age getAge_elem() {
    return (xsd.acord.Age) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Age_elem" );
  }


  public final void setAge_elem( xsd.acord.Age value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Age_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getActivitiesDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivitiesDesc" );
  }


  public final void setActivitiesDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivitiesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ActivitiesDesc getActivitiesDesc_elem() {
    return (xsd.acord.ActivitiesDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivitiesDesc_elem" );
  }


  public final void setActivitiesDesc_elem( xsd.acord.ActivitiesDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivitiesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWorkProcessDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkProcessDesc" );
  }


  public final void setWorkProcessDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkProcessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkProcessDesc getWorkProcessDesc_elem() {
    return (xsd.acord.WorkProcessDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WorkProcessDesc_elem" );
  }


  public final void setWorkProcessDesc_elem( xsd.acord.WorkProcessDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WorkProcessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEquipmentUsedDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EquipmentUsedDesc" );
  }


  public final void setEquipmentUsedDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EquipmentUsedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EquipmentUsedDesc getEquipmentUsedDesc_elem() {
    return (xsd.acord.EquipmentUsedDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EquipmentUsedDesc_elem" );
  }


  public final void setEquipmentUsedDesc_elem( xsd.acord.EquipmentUsedDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EquipmentUsedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEventsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventsDesc" );
  }


  public final void setEventsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EventsDesc getEventsDesc_elem() {
    return (xsd.acord.EventsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventsDesc_elem" );
  }


  public final void setEventsDesc_elem( xsd.acord.EventsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFatalityInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FatalityInd" );
  }


  public final void setFatalityInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FatalityInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FatalityInd getFatalityInd_elem() {
    return (xsd.acord.FatalityInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FatalityInd_elem" );
  }


  public final void setFatalityInd_elem( xsd.acord.FatalityInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FatalityInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Response getPreExistingDisabilityCd() {
    return (xsd.acord.enums.Response) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PreExistingDisabilityCd" );
  }


  public final void setPreExistingDisabilityCd( xsd.acord.enums.Response value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PreExistingDisabilityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PreExistingDisabilityCd getPreExistingDisabilityCd_elem() {
    return (xsd.acord.PreExistingDisabilityCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PreExistingDisabilityCd_elem" );
  }


  public final void setPreExistingDisabilityCd_elem( xsd.acord.PreExistingDisabilityCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PreExistingDisabilityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.InitialTreatment getInitialTreatmentCd() {
    return (xsd.acord.enums.InitialTreatment) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InitialTreatmentCd" );
  }


  public final void setInitialTreatmentCd( xsd.acord.enums.InitialTreatment value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InitialTreatmentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InitialTreatmentCd getInitialTreatmentCd_elem() {
    return (xsd.acord.InitialTreatmentCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InitialTreatmentCd_elem" );
  }


  public final void setInitialTreatmentCd_elem( xsd.acord.InitialTreatmentCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InitialTreatmentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getICDDiagnosticCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd" );
  }


  public final void setICDDiagnosticCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ICDDiagnosticCd getICDDiagnosticCd_elem() {
    return (xsd.acord.ICDDiagnosticCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd_elem" );
  }


  public final void setICDDiagnosticCd_elem( xsd.acord.ICDDiagnosticCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSurgeryInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SurgeryInd" );
  }


  public final void setSurgeryInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SurgeryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SurgeryInd getSurgeryInd_elem() {
    return (xsd.acord.SurgeryInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SurgeryInd_elem" );
  }


  public final void setSurgeryInd_elem( xsd.acord.SurgeryInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SurgeryInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWhereTakenDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WhereTakenDesc" );
  }


  public final void setWhereTakenDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WhereTakenDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WhereTakenDesc getWhereTakenDesc_elem() {
    return (xsd.acord.WhereTakenDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WhereTakenDesc_elem" );
  }


  public final void setWhereTakenDesc_elem( xsd.acord.WhereTakenDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WhereTakenDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getLostTimeInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LostTimeInd" );
  }


  public final void setLostTimeInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LostTimeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LostTimeInd getLostTimeInd_elem() {
    return (xsd.acord.LostTimeInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LostTimeInd_elem" );
  }


  public final void setLostTimeInd_elem( xsd.acord.LostTimeInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LostTimeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TimeLostPeriod getTimeLostPeriod() {
    return (xsd.acord.TimeLostPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeLostPeriod" );
  }


  public final void setTimeLostPeriod( xsd.acord.TimeLostPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeLostPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RestrictedWorkPeriod getRestrictedWorkPeriod() {
    return (xsd.acord.RestrictedWorkPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RestrictedWorkPeriod" );
  }


  public final void setRestrictedWorkPeriod( xsd.acord.RestrictedWorkPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RestrictedWorkPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.EventInfo> getEventInfo() {
    return (java.util.List<xsd.acord.EventInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventInfo" );
  }


  public final void setEventInfo( java.util.List<xsd.acord.EventInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsInjury> getClaimsInjury() {
    return (java.util.List<xsd.acord.ClaimsInjury>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsInjury" );
  }


  public final void setClaimsInjury( java.util.List<xsd.acord.ClaimsInjury> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsInjury", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getInjuredTakenRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InjuredTakenRef" );
  }


  public final void setInjuredTakenRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InjuredTakenRef", value );
  }
}
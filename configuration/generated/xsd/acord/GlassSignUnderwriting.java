/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GlassSignUnderwriting extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "GlassSignUnderwriting", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaintedPlatesCd = new javax.xml.namespace.QName( "", "PaintedPlatesCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FixedGluedOrAngleSetPlatesInd = new javax.xml.namespace.QName( "", "FixedGluedOrAngleSetPlatesInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ObstructionsOrUnusualSettingsInd = new javax.xml.namespace.QName( "", "ObstructionsOrUnusualSettingsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnusualSettingsAmt = new javax.xml.namespace.QName( "", "UnusualSettingsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceForTapeOnGlassInd = new javax.xml.namespace.QName( "", "InsuranceForTapeOnGlassInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TapeAmt = new javax.xml.namespace.QName( "", "TapeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceForLetteringOnGlassInd = new javax.xml.namespace.QName( "", "InsuranceForLetteringOnGlassInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LetteringAmt = new javax.xml.namespace.QName( "", "LetteringAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BldgOrAreaUnderConstructionInd = new javax.xml.namespace.QName( "", "BldgOrAreaUnderConstructionInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GlassOrSignsHaveDefectsInd = new javax.xml.namespace.QName( "", "GlassOrSignsHaveDefectsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgentInspectInd = new javax.xml.namespace.QName( "", "AgentInspectInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremisesVacantInd = new javax.xml.namespace.QName( "", "PremisesVacantInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignOffPremisesNotAttachedInd = new javax.xml.namespace.QName( "", "SignOffPremisesNotAttachedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllExteriorAboveSecondFloorInd = new javax.xml.namespace.QName( "", "AllExteriorAboveSecondFloorInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllExteriorInsuredInd = new javax.xml.namespace.QName( "", "AllExteriorInsuredInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnyGlassStructuralInd = new javax.xml.namespace.QName( "", "AnyGlassStructuralInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GlassProtectedByMeshOrULGlazingInd = new javax.xml.namespace.QName( "", "GlassProtectedByMeshOrULGlazingInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllInteriorGlassInsuredInd = new javax.xml.namespace.QName( "", "AllInteriorGlassInsuredInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FactoryBuiltInsulatingGlassInd = new javax.xml.namespace.QName( "", "FactoryBuiltInsulatingGlassInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BldgUseCd = new javax.xml.namespace.QName( "", "BldgUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ScheduleTypeCd = new javax.xml.namespace.QName( "", "ScheduleTypeCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.GlassSignUnderwriting" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.GlassSignUnderwriting_Type" );
    }
  };

  public GlassSignUnderwriting() {
    super( -1058117623, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.GlassSignUnderwriting_Type() );
  }

  public GlassSignUnderwriting( xsd.acord.types.complex.GlassSignUnderwriting_Type typeInstance ) {
    super( -1058117623, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GlassSignUnderwriting( gw.internal.xml.XmlElementState state ) {
    super( -1058117623, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.GlassSignUnderwriting> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.GlassSignUnderwriting_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.GlassSignUnderwriting_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.GlassSignUnderwriting_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.GlassSignUnderwriting parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.GlassSignUnderwriting.class );
  }

  public static xsd.acord.GlassSignUnderwriting parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.GlassSignUnderwriting.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PaintedPlates getPaintedPlatesCd() {
    return (xsd.acord.enums.PaintedPlates) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaintedPlatesCd" );
  }


  public final void setPaintedPlatesCd( xsd.acord.enums.PaintedPlates value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaintedPlatesCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaintedPlatesCd getPaintedPlatesCd_elem() {
    return (xsd.acord.PaintedPlatesCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaintedPlatesCd_elem" );
  }


  public final void setPaintedPlatesCd_elem( xsd.acord.PaintedPlatesCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaintedPlatesCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFixedGluedOrAngleSetPlatesInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FixedGluedOrAngleSetPlatesInd" );
  }


  public final void setFixedGluedOrAngleSetPlatesInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FixedGluedOrAngleSetPlatesInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FixedGluedOrAngleSetPlatesInd getFixedGluedOrAngleSetPlatesInd_elem() {
    return (xsd.acord.FixedGluedOrAngleSetPlatesInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FixedGluedOrAngleSetPlatesInd_elem" );
  }


  public final void setFixedGluedOrAngleSetPlatesInd_elem( xsd.acord.FixedGluedOrAngleSetPlatesInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FixedGluedOrAngleSetPlatesInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getObstructionsOrUnusualSettingsInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ObstructionsOrUnusualSettingsInd" );
  }


  public final void setObstructionsOrUnusualSettingsInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ObstructionsOrUnusualSettingsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ObstructionsOrUnusualSettingsInd getObstructionsOrUnusualSettingsInd_elem() {
    return (xsd.acord.ObstructionsOrUnusualSettingsInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ObstructionsOrUnusualSettingsInd_elem" );
  }


  public final void setObstructionsOrUnusualSettingsInd_elem( xsd.acord.ObstructionsOrUnusualSettingsInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ObstructionsOrUnusualSettingsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnusualSettingsAmt getUnusualSettingsAmt() {
    return (xsd.acord.UnusualSettingsAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnusualSettingsAmt" );
  }


  public final void setUnusualSettingsAmt( xsd.acord.UnusualSettingsAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnusualSettingsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInsuranceForTapeOnGlassInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceForTapeOnGlassInd" );
  }


  public final void setInsuranceForTapeOnGlassInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceForTapeOnGlassInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuranceForTapeOnGlassInd getInsuranceForTapeOnGlassInd_elem() {
    return (xsd.acord.InsuranceForTapeOnGlassInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceForTapeOnGlassInd_elem" );
  }


  public final void setInsuranceForTapeOnGlassInd_elem( xsd.acord.InsuranceForTapeOnGlassInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceForTapeOnGlassInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TapeAmt getTapeAmt() {
    return (xsd.acord.TapeAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TapeAmt" );
  }


  public final void setTapeAmt( xsd.acord.TapeAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TapeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInsuranceForLetteringOnGlassInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceForLetteringOnGlassInd" );
  }


  public final void setInsuranceForLetteringOnGlassInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceForLetteringOnGlassInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuranceForLetteringOnGlassInd getInsuranceForLetteringOnGlassInd_elem() {
    return (xsd.acord.InsuranceForLetteringOnGlassInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceForLetteringOnGlassInd_elem" );
  }


  public final void setInsuranceForLetteringOnGlassInd_elem( xsd.acord.InsuranceForLetteringOnGlassInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceForLetteringOnGlassInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LetteringAmt getLetteringAmt() {
    return (xsd.acord.LetteringAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LetteringAmt" );
  }


  public final void setLetteringAmt( xsd.acord.LetteringAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LetteringAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBldgOrAreaUnderConstructionInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BldgOrAreaUnderConstructionInd" );
  }


  public final void setBldgOrAreaUnderConstructionInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BldgOrAreaUnderConstructionInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BldgOrAreaUnderConstructionInd getBldgOrAreaUnderConstructionInd_elem() {
    return (xsd.acord.BldgOrAreaUnderConstructionInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BldgOrAreaUnderConstructionInd_elem" );
  }


  public final void setBldgOrAreaUnderConstructionInd_elem( xsd.acord.BldgOrAreaUnderConstructionInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BldgOrAreaUnderConstructionInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGlassOrSignsHaveDefectsInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GlassOrSignsHaveDefectsInd" );
  }


  public final void setGlassOrSignsHaveDefectsInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GlassOrSignsHaveDefectsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GlassOrSignsHaveDefectsInd getGlassOrSignsHaveDefectsInd_elem() {
    return (xsd.acord.GlassOrSignsHaveDefectsInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GlassOrSignsHaveDefectsInd_elem" );
  }


  public final void setGlassOrSignsHaveDefectsInd_elem( xsd.acord.GlassOrSignsHaveDefectsInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GlassOrSignsHaveDefectsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAgentInspectInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AgentInspectInd" );
  }


  public final void setAgentInspectInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AgentInspectInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AgentInspectInd getAgentInspectInd_elem() {
    return (xsd.acord.AgentInspectInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AgentInspectInd_elem" );
  }


  public final void setAgentInspectInd_elem( xsd.acord.AgentInspectInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AgentInspectInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPremisesVacantInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremisesVacantInd" );
  }


  public final void setPremisesVacantInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremisesVacantInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremisesVacantInd getPremisesVacantInd_elem() {
    return (xsd.acord.PremisesVacantInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremisesVacantInd_elem" );
  }


  public final void setPremisesVacantInd_elem( xsd.acord.PremisesVacantInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremisesVacantInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSignOffPremisesNotAttachedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignOffPremisesNotAttachedInd" );
  }


  public final void setSignOffPremisesNotAttachedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignOffPremisesNotAttachedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SignOffPremisesNotAttachedInd getSignOffPremisesNotAttachedInd_elem() {
    return (xsd.acord.SignOffPremisesNotAttachedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignOffPremisesNotAttachedInd_elem" );
  }


  public final void setSignOffPremisesNotAttachedInd_elem( xsd.acord.SignOffPremisesNotAttachedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignOffPremisesNotAttachedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAllExteriorAboveSecondFloorInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllExteriorAboveSecondFloorInd" );
  }


  public final void setAllExteriorAboveSecondFloorInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllExteriorAboveSecondFloorInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AllExteriorAboveSecondFloorInd getAllExteriorAboveSecondFloorInd_elem() {
    return (xsd.acord.AllExteriorAboveSecondFloorInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllExteriorAboveSecondFloorInd_elem" );
  }


  public final void setAllExteriorAboveSecondFloorInd_elem( xsd.acord.AllExteriorAboveSecondFloorInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllExteriorAboveSecondFloorInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAllExteriorInsuredInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllExteriorInsuredInd" );
  }


  public final void setAllExteriorInsuredInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllExteriorInsuredInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AllExteriorInsuredInd getAllExteriorInsuredInd_elem() {
    return (xsd.acord.AllExteriorInsuredInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllExteriorInsuredInd_elem" );
  }


  public final void setAllExteriorInsuredInd_elem( xsd.acord.AllExteriorInsuredInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllExteriorInsuredInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAnyGlassStructuralInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnyGlassStructuralInd" );
  }


  public final void setAnyGlassStructuralInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnyGlassStructuralInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnyGlassStructuralInd getAnyGlassStructuralInd_elem() {
    return (xsd.acord.AnyGlassStructuralInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnyGlassStructuralInd_elem" );
  }


  public final void setAnyGlassStructuralInd_elem( xsd.acord.AnyGlassStructuralInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnyGlassStructuralInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGlassProtectedByMeshOrULGlazingInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GlassProtectedByMeshOrULGlazingInd" );
  }


  public final void setGlassProtectedByMeshOrULGlazingInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GlassProtectedByMeshOrULGlazingInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GlassProtectedByMeshOrULGlazingInd getGlassProtectedByMeshOrULGlazingInd_elem() {
    return (xsd.acord.GlassProtectedByMeshOrULGlazingInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GlassProtectedByMeshOrULGlazingInd_elem" );
  }


  public final void setGlassProtectedByMeshOrULGlazingInd_elem( xsd.acord.GlassProtectedByMeshOrULGlazingInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GlassProtectedByMeshOrULGlazingInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAllInteriorGlassInsuredInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllInteriorGlassInsuredInd" );
  }


  public final void setAllInteriorGlassInsuredInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllInteriorGlassInsuredInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AllInteriorGlassInsuredInd getAllInteriorGlassInsuredInd_elem() {
    return (xsd.acord.AllInteriorGlassInsuredInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllInteriorGlassInsuredInd_elem" );
  }


  public final void setAllInteriorGlassInsuredInd_elem( xsd.acord.AllInteriorGlassInsuredInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllInteriorGlassInsuredInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFactoryBuiltInsulatingGlassInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FactoryBuiltInsulatingGlassInd" );
  }


  public final void setFactoryBuiltInsulatingGlassInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FactoryBuiltInsulatingGlassInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FactoryBuiltInsulatingGlassInd getFactoryBuiltInsulatingGlassInd_elem() {
    return (xsd.acord.FactoryBuiltInsulatingGlassInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FactoryBuiltInsulatingGlassInd_elem" );
  }


  public final void setFactoryBuiltInsulatingGlassInd_elem( xsd.acord.FactoryBuiltInsulatingGlassInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FactoryBuiltInsulatingGlassInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BuildingUse getBldgUseCd() {
    return (xsd.acord.enums.BuildingUse) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BldgUseCd" );
  }


  public final void setBldgUseCd( xsd.acord.enums.BuildingUse value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BldgUseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BldgUseCd getBldgUseCd_elem() {
    return (xsd.acord.BldgUseCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BldgUseCd_elem" );
  }


  public final void setBldgUseCd_elem( xsd.acord.BldgUseCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BldgUseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ScheduleType getScheduleTypeCd() {
    return (xsd.acord.enums.ScheduleType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ScheduleTypeCd" );
  }


  public final void setScheduleTypeCd( xsd.acord.enums.ScheduleType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ScheduleTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ScheduleTypeCd getScheduleTypeCd_elem() {
    return (xsd.acord.ScheduleTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ScheduleTypeCd_elem" );
  }


  public final void setScheduleTypeCd_elem( xsd.acord.ScheduleTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ScheduleTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
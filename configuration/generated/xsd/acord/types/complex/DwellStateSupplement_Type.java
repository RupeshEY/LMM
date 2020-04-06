/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DwellStateSupplement_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DwellStateSupplement_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrushFireRate = new javax.xml.namespace.QName( "", "BrushFireRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChimneyCd = new javax.xml.namespace.QName( "", "ChimneyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassDApplicableInd = new javax.xml.namespace.QName( "", "ClassDApplicableInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassHProtectedWarrantyBInd = new javax.xml.namespace.QName( "", "ClassHProtectedWarrantyBInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContinuousRenewalInd = new javax.xml.namespace.QName( "", "ContinuousRenewalInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceToBrush = new javax.xml.namespace.QName( "", "DistanceToBrush", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceToOceanOrOtherBodyWater = new javax.xml.namespace.QName( "", "DistanceToOceanOrOtherBodyWater", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DwellInsurableAmt = new javax.xml.namespace.QName( "", "DwellInsurableAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EarthquakeCountyCd = new javax.xml.namespace.QName( "", "EarthquakeCountyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposureWarranty = new javax.xml.namespace.QName( "", "ExposureWarranty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceAboveTideOrFloodPlain = new javax.xml.namespace.QName( "", "DistanceAboveTideOrFloodPlain", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireRecordPct = new javax.xml.namespace.QName( "", "FireRecordPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FringeRateInd = new javax.xml.namespace.QName( "", "FringeRateInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HydrantLocationCd = new javax.xml.namespace.QName( "", "HydrantLocationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HydrantMunicipality = new javax.xml.namespace.QName( "", "HydrantMunicipality", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HydrantTypeCd = new javax.xml.namespace.QName( "", "HydrantTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InspectionCreditInd = new javax.xml.namespace.QName( "", "InspectionCreditInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_KeyRate = new javax.xml.namespace.QName( "", "KeyRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MineSubsidenceCd = new javax.xml.namespace.QName( "", "MineSubsidenceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEntrances = new javax.xml.namespace.QName( "", "NumEntrances", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlaceCd = new javax.xml.namespace.QName( "", "PlaceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingCd = new javax.xml.namespace.QName( "", "RatingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RenieSquare = new javax.xml.namespace.QName( "", "RenieSquare", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskNumberBrushHazard = new javax.xml.namespace.QName( "", "RiskNumberBrushHazard", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RuralFireProtectionDistrictCd = new javax.xml.namespace.QName( "", "RuralFireProtectionDistrictCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RuralProtectedInd = new javax.xml.namespace.QName( "", "RuralProtectedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SeacoastOrOtherBodyWaterProximityCd = new javax.xml.namespace.QName( "", "SeacoastOrOtherBodyWaterProximityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SingleEntryApartmentInd = new javax.xml.namespace.QName( "", "SingleEntryApartmentInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TenantsRelocationExpenseAmt = new javax.xml.namespace.QName( "", "TenantsRelocationExpenseAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WindPlanInd = new javax.xml.namespace.QName( "", "WindPlanInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BrushFireZoneCd = new javax.xml.namespace.QName( "", "BrushFireZoneCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DwellStateSupplement_Type" );
    }
  };

  public DwellStateSupplement_Type() {
    super( 1331819706, TYPE.get() );
  }

  private DwellStateSupplement_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1331819706, state );
  }

  protected DwellStateSupplement_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DwellStateSupplement_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.DwellStateSupplement_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.DwellStateSupplement_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getBrushFireRate() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_BrushFireRate" );
  }


  public final void setBrushFireRate( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_BrushFireRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BrushFireRate getBrushFireRate_elem() {
    return (xsd.acord.BrushFireRate) TYPE.get().getPropertyValue( this, "_BrushFireRate_elem" );
  }


  public final void setBrushFireRate_elem( xsd.acord.BrushFireRate value ) {
    TYPE.get().setPropertyValue( this, "_BrushFireRate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Chimney getChimneyCd() {
    return (xsd.acord.enums.Chimney) TYPE.get().getPropertyValue( this, "_ChimneyCd" );
  }


  public final void setChimneyCd( xsd.acord.enums.Chimney value ) {
    TYPE.get().setPropertyValue( this, "_ChimneyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ChimneyCd getChimneyCd_elem() {
    return (xsd.acord.ChimneyCd) TYPE.get().getPropertyValue( this, "_ChimneyCd_elem" );
  }


  public final void setChimneyCd_elem( xsd.acord.ChimneyCd value ) {
    TYPE.get().setPropertyValue( this, "_ChimneyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getClassDApplicableInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ClassDApplicableInd" );
  }


  public final void setClassDApplicableInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ClassDApplicableInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassDApplicableInd getClassDApplicableInd_elem() {
    return (xsd.acord.ClassDApplicableInd) TYPE.get().getPropertyValue( this, "_ClassDApplicableInd_elem" );
  }


  public final void setClassDApplicableInd_elem( xsd.acord.ClassDApplicableInd value ) {
    TYPE.get().setPropertyValue( this, "_ClassDApplicableInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getClassHProtectedWarrantyBInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ClassHProtectedWarrantyBInd" );
  }


  public final void setClassHProtectedWarrantyBInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ClassHProtectedWarrantyBInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassHProtectedWarrantyBInd getClassHProtectedWarrantyBInd_elem() {
    return (xsd.acord.ClassHProtectedWarrantyBInd) TYPE.get().getPropertyValue( this, "_ClassHProtectedWarrantyBInd_elem" );
  }


  public final void setClassHProtectedWarrantyBInd_elem( xsd.acord.ClassHProtectedWarrantyBInd value ) {
    TYPE.get().setPropertyValue( this, "_ClassHProtectedWarrantyBInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getContinuousRenewalInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ContinuousRenewalInd" );
  }


  public final void setContinuousRenewalInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ContinuousRenewalInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContinuousRenewalInd getContinuousRenewalInd_elem() {
    return (xsd.acord.ContinuousRenewalInd) TYPE.get().getPropertyValue( this, "_ContinuousRenewalInd_elem" );
  }


  public final void setContinuousRenewalInd_elem( xsd.acord.ContinuousRenewalInd value ) {
    TYPE.get().setPropertyValue( this, "_ContinuousRenewalInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DistanceToBrush getDistanceToBrush() {
    return (xsd.acord.DistanceToBrush) TYPE.get().getPropertyValue( this, "_DistanceToBrush" );
  }


  public final void setDistanceToBrush( xsd.acord.DistanceToBrush value ) {
    TYPE.get().setPropertyValue( this, "_DistanceToBrush", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DistanceToOceanOrOtherBodyWater getDistanceToOceanOrOtherBodyWater() {
    return (xsd.acord.DistanceToOceanOrOtherBodyWater) TYPE.get().getPropertyValue( this, "_DistanceToOceanOrOtherBodyWater" );
  }


  public final void setDistanceToOceanOrOtherBodyWater( xsd.acord.DistanceToOceanOrOtherBodyWater value ) {
    TYPE.get().setPropertyValue( this, "_DistanceToOceanOrOtherBodyWater", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DwellInsurableAmt getDwellInsurableAmt() {
    return (xsd.acord.DwellInsurableAmt) TYPE.get().getPropertyValue( this, "_DwellInsurableAmt" );
  }


  public final void setDwellInsurableAmt( xsd.acord.DwellInsurableAmt value ) {
    TYPE.get().setPropertyValue( this, "_DwellInsurableAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEarthquakeCountyCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EarthquakeCountyCd" );
  }


  public final void setEarthquakeCountyCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EarthquakeCountyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EarthquakeCountyCd getEarthquakeCountyCd_elem() {
    return (xsd.acord.EarthquakeCountyCd) TYPE.get().getPropertyValue( this, "_EarthquakeCountyCd_elem" );
  }


  public final void setEarthquakeCountyCd_elem( xsd.acord.EarthquakeCountyCd value ) {
    TYPE.get().setPropertyValue( this, "_EarthquakeCountyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getExposureWarranty() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_ExposureWarranty" );
  }


  public final void setExposureWarranty( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_ExposureWarranty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExposureWarranty getExposureWarranty_elem() {
    return (xsd.acord.ExposureWarranty) TYPE.get().getPropertyValue( this, "_ExposureWarranty_elem" );
  }


  public final void setExposureWarranty_elem( xsd.acord.ExposureWarranty value ) {
    TYPE.get().setPropertyValue( this, "_ExposureWarranty_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DistanceAboveTideOrFloodPlain getDistanceAboveTideOrFloodPlain() {
    return (xsd.acord.DistanceAboveTideOrFloodPlain) TYPE.get().getPropertyValue( this, "_DistanceAboveTideOrFloodPlain" );
  }


  public final void setDistanceAboveTideOrFloodPlain( xsd.acord.DistanceAboveTideOrFloodPlain value ) {
    TYPE.get().setPropertyValue( this, "_DistanceAboveTideOrFloodPlain", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getFireRecordPct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_FireRecordPct" );
  }


  public final void setFireRecordPct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_FireRecordPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireRecordPct getFireRecordPct_elem() {
    return (xsd.acord.FireRecordPct) TYPE.get().getPropertyValue( this, "_FireRecordPct_elem" );
  }


  public final void setFireRecordPct_elem( xsd.acord.FireRecordPct value ) {
    TYPE.get().setPropertyValue( this, "_FireRecordPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFringeRateInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FringeRateInd" );
  }


  public final void setFringeRateInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FringeRateInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FringeRateInd getFringeRateInd_elem() {
    return (xsd.acord.FringeRateInd) TYPE.get().getPropertyValue( this, "_FringeRateInd_elem" );
  }


  public final void setFringeRateInd_elem( xsd.acord.FringeRateInd value ) {
    TYPE.get().setPropertyValue( this, "_FringeRateInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LocationType getHydrantLocationCd() {
    return (xsd.acord.enums.LocationType) TYPE.get().getPropertyValue( this, "_HydrantLocationCd" );
  }


  public final void setHydrantLocationCd( xsd.acord.enums.LocationType value ) {
    TYPE.get().setPropertyValue( this, "_HydrantLocationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HydrantLocationCd getHydrantLocationCd_elem() {
    return (xsd.acord.HydrantLocationCd) TYPE.get().getPropertyValue( this, "_HydrantLocationCd_elem" );
  }


  public final void setHydrantLocationCd_elem( xsd.acord.HydrantLocationCd value ) {
    TYPE.get().setPropertyValue( this, "_HydrantLocationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHydrantMunicipality() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HydrantMunicipality" );
  }


  public final void setHydrantMunicipality( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HydrantMunicipality", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HydrantMunicipality getHydrantMunicipality_elem() {
    return (xsd.acord.HydrantMunicipality) TYPE.get().getPropertyValue( this, "_HydrantMunicipality_elem" );
  }


  public final void setHydrantMunicipality_elem( xsd.acord.HydrantMunicipality value ) {
    TYPE.get().setPropertyValue( this, "_HydrantMunicipality_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.HydrantType getHydrantTypeCd() {
    return (xsd.acord.enums.HydrantType) TYPE.get().getPropertyValue( this, "_HydrantTypeCd" );
  }


  public final void setHydrantTypeCd( xsd.acord.enums.HydrantType value ) {
    TYPE.get().setPropertyValue( this, "_HydrantTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HydrantTypeCd getHydrantTypeCd_elem() {
    return (xsd.acord.HydrantTypeCd) TYPE.get().getPropertyValue( this, "_HydrantTypeCd_elem" );
  }


  public final void setHydrantTypeCd_elem( xsd.acord.HydrantTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_HydrantTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInspectionCreditInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_InspectionCreditInd" );
  }


  public final void setInspectionCreditInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_InspectionCreditInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InspectionCreditInd getInspectionCreditInd_elem() {
    return (xsd.acord.InspectionCreditInd) TYPE.get().getPropertyValue( this, "_InspectionCreditInd_elem" );
  }


  public final void setInspectionCreditInd_elem( xsd.acord.InspectionCreditInd value ) {
    TYPE.get().setPropertyValue( this, "_InspectionCreditInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getKeyRate() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_KeyRate" );
  }


  public final void setKeyRate( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_KeyRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.KeyRate getKeyRate_elem() {
    return (xsd.acord.KeyRate) TYPE.get().getPropertyValue( this, "_KeyRate_elem" );
  }


  public final void setKeyRate_elem( xsd.acord.KeyRate value ) {
    TYPE.get().setPropertyValue( this, "_KeyRate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Response getMineSubsidenceCd() {
    return (xsd.acord.enums.Response) TYPE.get().getPropertyValue( this, "_MineSubsidenceCd" );
  }


  public final void setMineSubsidenceCd( xsd.acord.enums.Response value ) {
    TYPE.get().setPropertyValue( this, "_MineSubsidenceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MineSubsidenceCd getMineSubsidenceCd_elem() {
    return (xsd.acord.MineSubsidenceCd) TYPE.get().getPropertyValue( this, "_MineSubsidenceCd_elem" );
  }


  public final void setMineSubsidenceCd_elem( xsd.acord.MineSubsidenceCd value ) {
    TYPE.get().setPropertyValue( this, "_MineSubsidenceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEntrances() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumEntrances" );
  }


  public final void setNumEntrances( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumEntrances", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEntrances getNumEntrances_elem() {
    return (xsd.acord.NumEntrances) TYPE.get().getPropertyValue( this, "_NumEntrances_elem" );
  }


  public final void setNumEntrances_elem( xsd.acord.NumEntrances value ) {
    TYPE.get().setPropertyValue( this, "_NumEntrances_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPlaceCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PlaceCd" );
  }


  public final void setPlaceCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PlaceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PlaceCd getPlaceCd_elem() {
    return (xsd.acord.PlaceCd) TYPE.get().getPropertyValue( this, "_PlaceCd_elem" );
  }


  public final void setPlaceCd_elem( xsd.acord.PlaceCd value ) {
    TYPE.get().setPropertyValue( this, "_PlaceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RatingCd" );
  }


  public final void setRatingCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RatingCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RatingCd getRatingCd_elem() {
    return (xsd.acord.RatingCd) TYPE.get().getPropertyValue( this, "_RatingCd_elem" );
  }


  public final void setRatingCd_elem( xsd.acord.RatingCd value ) {
    TYPE.get().setPropertyValue( this, "_RatingCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRenieSquare() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RenieSquare" );
  }


  public final void setRenieSquare( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RenieSquare", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RenieSquare getRenieSquare_elem() {
    return (xsd.acord.RenieSquare) TYPE.get().getPropertyValue( this, "_RenieSquare_elem" );
  }


  public final void setRenieSquare_elem( xsd.acord.RenieSquare value ) {
    TYPE.get().setPropertyValue( this, "_RenieSquare_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRiskNumberBrushHazard() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RiskNumberBrushHazard" );
  }


  public final void setRiskNumberBrushHazard( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RiskNumberBrushHazard", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiskNumberBrushHazard getRiskNumberBrushHazard_elem() {
    return (xsd.acord.RiskNumberBrushHazard) TYPE.get().getPropertyValue( this, "_RiskNumberBrushHazard_elem" );
  }


  public final void setRiskNumberBrushHazard_elem( xsd.acord.RiskNumberBrushHazard value ) {
    TYPE.get().setPropertyValue( this, "_RiskNumberBrushHazard_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RuralFireProtectionDistrict getRuralFireProtectionDistrictCd() {
    return (xsd.acord.enums.RuralFireProtectionDistrict) TYPE.get().getPropertyValue( this, "_RuralFireProtectionDistrictCd" );
  }


  public final void setRuralFireProtectionDistrictCd( xsd.acord.enums.RuralFireProtectionDistrict value ) {
    TYPE.get().setPropertyValue( this, "_RuralFireProtectionDistrictCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RuralFireProtectionDistrictCd getRuralFireProtectionDistrictCd_elem() {
    return (xsd.acord.RuralFireProtectionDistrictCd) TYPE.get().getPropertyValue( this, "_RuralFireProtectionDistrictCd_elem" );
  }


  public final void setRuralFireProtectionDistrictCd_elem( xsd.acord.RuralFireProtectionDistrictCd value ) {
    TYPE.get().setPropertyValue( this, "_RuralFireProtectionDistrictCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getRuralProtectedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_RuralProtectedInd" );
  }


  public final void setRuralProtectedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_RuralProtectedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RuralProtectedInd getRuralProtectedInd_elem() {
    return (xsd.acord.RuralProtectedInd) TYPE.get().getPropertyValue( this, "_RuralProtectedInd_elem" );
  }


  public final void setRuralProtectedInd_elem( xsd.acord.RuralProtectedInd value ) {
    TYPE.get().setPropertyValue( this, "_RuralProtectedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SeacoastOrOtherBodyOfWaterProximity getSeacoastOrOtherBodyWaterProximityCd() {
    return (xsd.acord.enums.SeacoastOrOtherBodyOfWaterProximity) TYPE.get().getPropertyValue( this, "_SeacoastOrOtherBodyWaterProximityCd" );
  }


  public final void setSeacoastOrOtherBodyWaterProximityCd( xsd.acord.enums.SeacoastOrOtherBodyOfWaterProximity value ) {
    TYPE.get().setPropertyValue( this, "_SeacoastOrOtherBodyWaterProximityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SeacoastOrOtherBodyWaterProximityCd getSeacoastOrOtherBodyWaterProximityCd_elem() {
    return (xsd.acord.SeacoastOrOtherBodyWaterProximityCd) TYPE.get().getPropertyValue( this, "_SeacoastOrOtherBodyWaterProximityCd_elem" );
  }


  public final void setSeacoastOrOtherBodyWaterProximityCd_elem( xsd.acord.SeacoastOrOtherBodyWaterProximityCd value ) {
    TYPE.get().setPropertyValue( this, "_SeacoastOrOtherBodyWaterProximityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSingleEntryApartmentInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SingleEntryApartmentInd" );
  }


  public final void setSingleEntryApartmentInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SingleEntryApartmentInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SingleEntryApartmentInd getSingleEntryApartmentInd_elem() {
    return (xsd.acord.SingleEntryApartmentInd) TYPE.get().getPropertyValue( this, "_SingleEntryApartmentInd_elem" );
  }


  public final void setSingleEntryApartmentInd_elem( xsd.acord.SingleEntryApartmentInd value ) {
    TYPE.get().setPropertyValue( this, "_SingleEntryApartmentInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TenantsRelocationExpenseAmt getTenantsRelocationExpenseAmt() {
    return (xsd.acord.TenantsRelocationExpenseAmt) TYPE.get().getPropertyValue( this, "_TenantsRelocationExpenseAmt" );
  }


  public final void setTenantsRelocationExpenseAmt( xsd.acord.TenantsRelocationExpenseAmt value ) {
    TYPE.get().setPropertyValue( this, "_TenantsRelocationExpenseAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getWindPlanInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_WindPlanInd" );
  }


  public final void setWindPlanInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_WindPlanInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WindPlanInd getWindPlanInd_elem() {
    return (xsd.acord.WindPlanInd) TYPE.get().getPropertyValue( this, "_WindPlanInd_elem" );
  }


  public final void setWindPlanInd_elem( xsd.acord.WindPlanInd value ) {
    TYPE.get().setPropertyValue( this, "_WindPlanInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBrushFireZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BrushFireZoneCd" );
  }


  public final void setBrushFireZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BrushFireZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BrushFireZoneCd getBrushFireZoneCd_elem() {
    return (xsd.acord.BrushFireZoneCd) TYPE.get().getPropertyValue( this, "_BrushFireZoneCd_elem" );
  }


  public final void setBrushFireZoneCd_elem( xsd.acord.BrushFireZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_BrushFireZoneCd_elem", value );
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
/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Watercraft extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Watercraft", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HullDesignTypeCd = new javax.xml.namespace.QName( "", "HullDesignTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HullMaterialTypeCd = new javax.xml.namespace.QName( "", "HullMaterialTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SparMaterialCd = new javax.xml.namespace.QName( "", "SparMaterialCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NameBoat = new javax.xml.namespace.QName( "", "NameBoat", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumOperatorsUnder21Yrs = new javax.xml.namespace.QName( "", "NumOperatorsUnder21Yrs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RegistrationNumber = new javax.xml.namespace.QName( "", "RegistrationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LayUpPeriod = new javax.xml.namespace.QName( "", "LayUpPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumBeds = new javax.xml.namespace.QName( "", "NumBeds", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FuelTankCd = new javax.xml.namespace.QName( "", "FuelTankCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropulsionTypeCd = new javax.xml.namespace.QName( "", "PropulsionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrincipalOperatorInd = new javax.xml.namespace.QName( "", "PrincipalOperatorInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremInd = new javax.xml.namespace.QName( "", "MinPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimarySeasonCd = new javax.xml.namespace.QName( "", "PrimarySeasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondarySeasonCd = new javax.xml.namespace.QName( "", "SecondarySeasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurveyDt = new javax.xml.namespace.QName( "", "SurveyDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WaterUnitTypeCd = new javax.xml.namespace.QName( "", "WaterUnitTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CostNewAmt = new javax.xml.namespace.QName( "", "CostNewAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchasePriceAmt = new javax.xml.namespace.QName( "", "PurchasePriceAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchaseDt = new javax.xml.namespace.QName( "", "PurchaseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PresentValueAmt = new javax.xml.namespace.QName( "", "PresentValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Length = new javax.xml.namespace.QName( "", "Length", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Speed = new javax.xml.namespace.QName( "", "Speed", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WatersNavigatedCd = new javax.xml.namespace.QName( "", "WatersNavigatedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Horsepower = new javax.xml.namespace.QName( "", "Horsepower", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DockLocationRef = new javax.xml.namespace.QName( "", "DockLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_StorageLocationRef = new javax.xml.namespace.QName( "", "StorageLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SecondaryStorageLocationRef = new javax.xml.namespace.QName( "", "SecondaryStorageLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RatedDriverRef = new javax.xml.namespace.QName( "", "RatedDriverRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.Watercraft" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Watercraft_Type" );
    }
  };

  public Watercraft() {
    super( 1257889757, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.Watercraft_Type() );
  }

  public Watercraft( xsd.acord.types.complex.Watercraft_Type typeInstance ) {
    super( 1257889757, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Watercraft( gw.internal.xml.XmlElementState state ) {
    super( 1257889757, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.Watercraft> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.Watercraft_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.Watercraft_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.Watercraft_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.Watercraft parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.Watercraft.class );
  }

  public static xsd.acord.Watercraft parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.Watercraft.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.HullDesignType getHullDesignTypeCd() {
    return (xsd.acord.enums.HullDesignType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HullDesignTypeCd" );
  }


  public final void setHullDesignTypeCd( xsd.acord.enums.HullDesignType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HullDesignTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HullDesignTypeCd getHullDesignTypeCd_elem() {
    return (xsd.acord.HullDesignTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HullDesignTypeCd_elem" );
  }


  public final void setHullDesignTypeCd_elem( xsd.acord.HullDesignTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HullDesignTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.HullMaterialType getHullMaterialTypeCd() {
    return (xsd.acord.enums.HullMaterialType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HullMaterialTypeCd" );
  }


  public final void setHullMaterialTypeCd( xsd.acord.enums.HullMaterialType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HullMaterialTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HullMaterialTypeCd getHullMaterialTypeCd_elem() {
    return (xsd.acord.HullMaterialTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HullMaterialTypeCd_elem" );
  }


  public final void setHullMaterialTypeCd_elem( xsd.acord.HullMaterialTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HullMaterialTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SparMaterial getSparMaterialCd() {
    return (xsd.acord.enums.SparMaterial) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SparMaterialCd" );
  }


  public final void setSparMaterialCd( xsd.acord.enums.SparMaterial value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SparMaterialCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SparMaterialCd getSparMaterialCd_elem() {
    return (xsd.acord.SparMaterialCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SparMaterialCd_elem" );
  }


  public final void setSparMaterialCd_elem( xsd.acord.SparMaterialCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SparMaterialCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNameBoat() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NameBoat" );
  }


  public final void setNameBoat( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NameBoat", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NameBoat getNameBoat_elem() {
    return (xsd.acord.NameBoat) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NameBoat_elem" );
  }


  public final void setNameBoat_elem( xsd.acord.NameBoat value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NameBoat_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumOperatorsUnder21Yrs() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOperatorsUnder21Yrs" );
  }


  public final void setNumOperatorsUnder21Yrs( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOperatorsUnder21Yrs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumOperatorsUnder21Yrs getNumOperatorsUnder21Yrs_elem() {
    return (xsd.acord.NumOperatorsUnder21Yrs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOperatorsUnder21Yrs_elem" );
  }


  public final void setNumOperatorsUnder21Yrs_elem( xsd.acord.NumOperatorsUnder21Yrs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOperatorsUnder21Yrs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRegistrationNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RegistrationNumber" );
  }


  public final void setRegistrationNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RegistrationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RegistrationNumber getRegistrationNumber_elem() {
    return (xsd.acord.RegistrationNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RegistrationNumber_elem" );
  }


  public final void setRegistrationNumber_elem( xsd.acord.RegistrationNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RegistrationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LayUpPeriod getLayUpPeriod() {
    return (xsd.acord.LayUpPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LayUpPeriod" );
  }


  public final void setLayUpPeriod( xsd.acord.LayUpPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LayUpPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumBeds() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumBeds" );
  }


  public final void setNumBeds( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumBeds", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumBeds getNumBeds_elem() {
    return (xsd.acord.NumBeds) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumBeds_elem" );
  }


  public final void setNumBeds_elem( xsd.acord.NumBeds value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumBeds_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FuelTank getFuelTankCd() {
    return (xsd.acord.enums.FuelTank) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelTankCd" );
  }


  public final void setFuelTankCd( xsd.acord.enums.FuelTank value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelTankCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FuelTankCd getFuelTankCd_elem() {
    return (xsd.acord.FuelTankCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FuelTankCd_elem" );
  }


  public final void setFuelTankCd_elem( xsd.acord.FuelTankCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FuelTankCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PropulsionType getPropulsionTypeCd() {
    return (xsd.acord.enums.PropulsionType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropulsionTypeCd" );
  }


  public final void setPropulsionTypeCd( xsd.acord.enums.PropulsionType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropulsionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropulsionTypeCd getPropulsionTypeCd_elem() {
    return (xsd.acord.PropulsionTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropulsionTypeCd_elem" );
  }


  public final void setPropulsionTypeCd_elem( xsd.acord.PropulsionTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropulsionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPrincipalOperatorInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrincipalOperatorInd" );
  }


  public final void setPrincipalOperatorInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrincipalOperatorInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrincipalOperatorInd getPrincipalOperatorInd_elem() {
    return (xsd.acord.PrincipalOperatorInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrincipalOperatorInd_elem" );
  }


  public final void setPrincipalOperatorInd_elem( xsd.acord.PrincipalOperatorInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrincipalOperatorInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalInterest> getAdditionalInterest() {
    return (java.util.List<xsd.acord.AdditionalInterest>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( java.util.List<xsd.acord.AdditionalInterest> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalInterest", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Coverage> getCoverage() {
    return (java.util.List<xsd.acord.Coverage>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Coverage" );
  }


  public final void setCoverage( java.util.List<xsd.acord.Coverage> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Coverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QuestionAnswer> getQuestionAnswer() {
    return (java.util.List<xsd.acord.QuestionAnswer>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QuestionAnswer" );
  }


  public final void setQuestionAnswer( java.util.List<xsd.acord.QuestionAnswer> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QuestionAnswer", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getMinPremInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinPremInd" );
  }


  public final void setMinPremInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinPremInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinPremInd getMinPremInd_elem() {
    return (xsd.acord.MinPremInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinPremInd_elem" );
  }


  public final void setMinPremInd_elem( xsd.acord.MinPremInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinPremInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Season getPrimarySeasonCd() {
    return (xsd.acord.enums.Season) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimarySeasonCd" );
  }


  public final void setPrimarySeasonCd( xsd.acord.enums.Season value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimarySeasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrimarySeasonCd getPrimarySeasonCd_elem() {
    return (xsd.acord.PrimarySeasonCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimarySeasonCd_elem" );
  }


  public final void setPrimarySeasonCd_elem( xsd.acord.PrimarySeasonCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimarySeasonCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Season getSecondarySeasonCd() {
    return (xsd.acord.enums.Season) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecondarySeasonCd" );
  }


  public final void setSecondarySeasonCd( xsd.acord.enums.Season value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecondarySeasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SecondarySeasonCd getSecondarySeasonCd_elem() {
    return (xsd.acord.SecondarySeasonCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecondarySeasonCd_elem" );
  }


  public final void setSecondarySeasonCd_elem( xsd.acord.SecondarySeasonCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecondarySeasonCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSurveyDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SurveyDt" );
  }


  public final void setSurveyDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SurveyDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SurveyDt getSurveyDt_elem() {
    return (xsd.acord.SurveyDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SurveyDt_elem" );
  }


  public final void setSurveyDt_elem( xsd.acord.SurveyDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SurveyDt_elem", value );
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
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WaterUnitType getWaterUnitTypeCd() {
    return (xsd.acord.enums.WaterUnitType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WaterUnitTypeCd" );
  }


  public final void setWaterUnitTypeCd( xsd.acord.enums.WaterUnitType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WaterUnitTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WaterUnitTypeCd getWaterUnitTypeCd_elem() {
    return (xsd.acord.WaterUnitTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WaterUnitTypeCd_elem" );
  }


  public final void setWaterUnitTypeCd_elem( xsd.acord.WaterUnitTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WaterUnitTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnits getNumUnits_elem() {
    return (xsd.acord.NumUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.acord.NumUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemDefinition getItemDefinition() {
    return (xsd.acord.ItemDefinition) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDefinition" );
  }


  public final void setItemDefinition( xsd.acord.ItemDefinition value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDefinition", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CostNewAmt getCostNewAmt() {
    return (xsd.acord.CostNewAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CostNewAmt" );
  }


  public final void setCostNewAmt( xsd.acord.CostNewAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CostNewAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PurchasePriceAmt getPurchasePriceAmt() {
    return (xsd.acord.PurchasePriceAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PurchasePriceAmt" );
  }


  public final void setPurchasePriceAmt( xsd.acord.PurchasePriceAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PurchasePriceAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPurchaseDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PurchaseDt" );
  }


  public final void setPurchaseDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PurchaseDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PurchaseDt getPurchaseDt_elem() {
    return (xsd.acord.PurchaseDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PurchaseDt_elem" );
  }


  public final void setPurchaseDt_elem( xsd.acord.PurchaseDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PurchaseDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PresentValueAmt getPresentValueAmt() {
    return (xsd.acord.PresentValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PresentValueAmt" );
  }


  public final void setPresentValueAmt( xsd.acord.PresentValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PresentValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Length getLength() {
    return (xsd.acord.Length) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Length" );
  }


  public final void setLength( xsd.acord.Length value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Length", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Speed getSpeed() {
    return (xsd.acord.Speed) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Speed" );
  }


  public final void setSpeed( xsd.acord.Speed value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Speed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WatersNavigated getWatersNavigatedCd() {
    return (xsd.acord.enums.WatersNavigated) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WatersNavigatedCd" );
  }


  public final void setWatersNavigatedCd( xsd.acord.enums.WatersNavigated value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WatersNavigatedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WatersNavigatedCd getWatersNavigatedCd_elem() {
    return (xsd.acord.WatersNavigatedCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WatersNavigatedCd_elem" );
  }


  public final void setWatersNavigatedCd_elem( xsd.acord.WatersNavigatedCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WatersNavigatedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Horsepower getHorsepower() {
    return (xsd.acord.Horsepower) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Horsepower" );
  }


  public final void setHorsepower( xsd.acord.Horsepower value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Horsepower", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getDockLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DockLocationRef" );
  }


  public final void setDockLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DockLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getStorageLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StorageLocationRef" );
  }


  public final void setStorageLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StorageLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSecondaryStorageLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecondaryStorageLocationRef" );
  }


  public final void setSecondaryStorageLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecondaryStorageLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getRatedDriverRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RatedDriverRef" );
  }


  public final void setRatedDriverRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RatedDriverRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef", value );
  }
}

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RealEstate_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "RealEstate_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestCd = new javax.xml.namespace.QName( "", "InterestCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandArea = new javax.xml.namespace.QName( "", "LandArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDivingBoards = new javax.xml.namespace.QName( "", "NumDivingBoards", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumSwimmingPools = new javax.xml.namespace.QName( "", "NumSwimmingPools", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumApartments = new javax.xml.namespace.QName( "", "NumApartments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupancyCd = new javax.xml.namespace.QName( "", "OccupancyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupancyTypeCd = new javax.xml.namespace.QName( "", "OccupancyTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RealEstateTypeCd = new javax.xml.namespace.QName( "", "RealEstateTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_YearBuilt = new javax.xml.namespace.QName( "", "YearBuilt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumStories = new javax.xml.namespace.QName( "", "NumStories", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnimalExposureInfo = new javax.xml.namespace.QName( "", "AnimalExposureInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResidenceEmployees = new javax.xml.namespace.QName( "", "ResidenceEmployees", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.RealEstate_Type" );
    }
  };

  public RealEstate_Type() {
    super( -1714226360, TYPE.get() );
  }

  private RealEstate_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1714226360, state );
  }

  protected RealEstate_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RealEstate_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.RealEstate_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.RealEstate_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Interest> getInterestCd() {
    return (java.util.List<xsd.acord.enums.Interest>) TYPE.get().getPropertyValue( this, "_InterestCd" );
  }


  public final void setInterestCd( java.util.List<xsd.acord.enums.Interest> value ) {
    TYPE.get().setPropertyValue( this, "_InterestCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InterestCd> getInterestCd_elem() {
    return (java.util.List<xsd.acord.InterestCd>) TYPE.get().getPropertyValue( this, "_InterestCd_elem" );
  }


  public final void setInterestCd_elem( java.util.List<xsd.acord.InterestCd> value ) {
    TYPE.get().setPropertyValue( this, "_InterestCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LandArea getLandArea() {
    return (xsd.acord.LandArea) TYPE.get().getPropertyValue( this, "_LandArea" );
  }


  public final void setLandArea( xsd.acord.LandArea value ) {
    TYPE.get().setPropertyValue( this, "_LandArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDivingBoards() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDivingBoards" );
  }


  public final void setNumDivingBoards( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDivingBoards", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDivingBoards getNumDivingBoards_elem() {
    return (xsd.acord.NumDivingBoards) TYPE.get().getPropertyValue( this, "_NumDivingBoards_elem" );
  }


  public final void setNumDivingBoards_elem( xsd.acord.NumDivingBoards value ) {
    TYPE.get().setPropertyValue( this, "_NumDivingBoards_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumSwimmingPools() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumSwimmingPools" );
  }


  public final void setNumSwimmingPools( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumSwimmingPools", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumSwimmingPools getNumSwimmingPools_elem() {
    return (xsd.acord.NumSwimmingPools) TYPE.get().getPropertyValue( this, "_NumSwimmingPools_elem" );
  }


  public final void setNumSwimmingPools_elem( xsd.acord.NumSwimmingPools value ) {
    TYPE.get().setPropertyValue( this, "_NumSwimmingPools_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumApartments() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumApartments" );
  }


  public final void setNumApartments( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumApartments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumApartments getNumApartments_elem() {
    return (xsd.acord.NumApartments) TYPE.get().getPropertyValue( this, "_NumApartments_elem" );
  }


  public final void setNumApartments_elem( xsd.acord.NumApartments value ) {
    TYPE.get().setPropertyValue( this, "_NumApartments_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Occupancy getOccupancyCd() {
    return (xsd.acord.enums.Occupancy) TYPE.get().getPropertyValue( this, "_OccupancyCd" );
  }


  public final void setOccupancyCd( xsd.acord.enums.Occupancy value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupancyCd getOccupancyCd_elem() {
    return (xsd.acord.OccupancyCd) TYPE.get().getPropertyValue( this, "_OccupancyCd_elem" );
  }


  public final void setOccupancyCd_elem( xsd.acord.OccupancyCd value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.OccupancyType getOccupancyTypeCd() {
    return (xsd.acord.enums.OccupancyType) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd" );
  }


  public final void setOccupancyTypeCd( xsd.acord.enums.OccupancyType value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupancyTypeCd getOccupancyTypeCd_elem() {
    return (xsd.acord.OccupancyTypeCd) TYPE.get().getPropertyValue( this, "_OccupancyTypeCd_elem" );
  }


  public final void setOccupancyTypeCd_elem( xsd.acord.OccupancyTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RealEstateType getRealEstateTypeCd() {
    return (xsd.acord.enums.RealEstateType) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd" );
  }


  public final void setRealEstateTypeCd( xsd.acord.enums.RealEstateType value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RealEstateTypeCd getRealEstateTypeCd_elem() {
    return (xsd.acord.RealEstateTypeCd) TYPE.get().getPropertyValue( this, "_RealEstateTypeCd_elem" );
  }


  public final void setRealEstateTypeCd_elem( xsd.acord.RealEstateTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_RealEstateTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getYearBuilt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_YearBuilt" );
  }


  public final void setYearBuilt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_YearBuilt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.YearBuilt getYearBuilt_elem() {
    return (xsd.acord.YearBuilt) TYPE.get().getPropertyValue( this, "_YearBuilt_elem" );
  }


  public final void setYearBuilt_elem( xsd.acord.YearBuilt value ) {
    TYPE.get().setPropertyValue( this, "_YearBuilt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumStories() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NumStories" );
  }


  public final void setNumStories( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NumStories", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumStories getNumStories_elem() {
    return (xsd.acord.NumStories) TYPE.get().getPropertyValue( this, "_NumStories_elem" );
  }


  public final void setNumStories_elem( xsd.acord.NumStories value ) {
    TYPE.get().setPropertyValue( this, "_NumStories_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AnimalExposureInfo> getAnimalExposureInfo() {
    return (java.util.List<xsd.acord.AnimalExposureInfo>) TYPE.get().getPropertyValue( this, "_AnimalExposureInfo" );
  }


  public final void setAnimalExposureInfo( java.util.List<xsd.acord.AnimalExposureInfo> value ) {
    TYPE.get().setPropertyValue( this, "_AnimalExposureInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ResidenceEmployees> getResidenceEmployees() {
    return (java.util.List<xsd.acord.ResidenceEmployees>) TYPE.get().getPropertyValue( this, "_ResidenceEmployees" );
  }


  public final void setResidenceEmployees( java.util.List<xsd.acord.ResidenceEmployees> value ) {
    TYPE.get().setPropertyValue( this, "_ResidenceEmployees", value );
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
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_OtherOrPriorPolicyRef", value );
  }

}
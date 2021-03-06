/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Location_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Location_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CountyTownCd = new javax.xml.namespace.QName( "", "CountyTownCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskLocationCd = new javax.xml.namespace.QName( "", "RiskLocationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EarthquakeZoneCd = new javax.xml.namespace.QName( "", "EarthquakeZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxCodeInfo = new javax.xml.namespace.QName( "", "TaxCodeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubLocation = new javax.xml.namespace.QName( "", "SubLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireDistrict = new javax.xml.namespace.QName( "", "FireDistrict", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireDistrictCd = new javax.xml.namespace.QName( "", "FireDistrictCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireStation = new javax.xml.namespace.QName( "", "FireStation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Communications = new javax.xml.namespace.QName( "", "Communications", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocationName = new javax.xml.namespace.QName( "", "LocationName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocationDesc = new javax.xml.namespace.QName( "", "LocationDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CatastropheZoneCd = new javax.xml.namespace.QName( "", "CatastropheZoneCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NameInfoRef = new javax.xml.namespace.QName( "", "NameInfoRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NameInfoRefs = new javax.xml.namespace.QName( "", "NameInfoRefs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Location_Type" );
    }
  };

  public Location_Type() {
    super( -1324797123, TYPE.get() );
  }

  private Location_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1324797123, state );
  }

  protected Location_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Location_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Location_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Location_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Addr getAddr() {
    return (xsd.acord.Addr) TYPE.get().getPropertyValue( this, "_Addr" );
  }


  public final void setAddr( xsd.acord.Addr value ) {
    TYPE.get().setPropertyValue( this, "_Addr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCountyTownCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CountyTownCd" );
  }


  public final void setCountyTownCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CountyTownCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CountyTownCd getCountyTownCd_elem() {
    return (xsd.acord.CountyTownCd) TYPE.get().getPropertyValue( this, "_CountyTownCd_elem" );
  }


  public final void setCountyTownCd_elem( xsd.acord.CountyTownCd value ) {
    TYPE.get().setPropertyValue( this, "_CountyTownCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LocationType getRiskLocationCd() {
    return (xsd.acord.enums.LocationType) TYPE.get().getPropertyValue( this, "_RiskLocationCd" );
  }


  public final void setRiskLocationCd( xsd.acord.enums.LocationType value ) {
    TYPE.get().setPropertyValue( this, "_RiskLocationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiskLocationCd getRiskLocationCd_elem() {
    return (xsd.acord.RiskLocationCd) TYPE.get().getPropertyValue( this, "_RiskLocationCd_elem" );
  }


  public final void setRiskLocationCd_elem( xsd.acord.RiskLocationCd value ) {
    TYPE.get().setPropertyValue( this, "_RiskLocationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEarthquakeZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EarthquakeZoneCd" );
  }


  public final void setEarthquakeZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EarthquakeZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EarthquakeZoneCd getEarthquakeZoneCd_elem() {
    return (xsd.acord.EarthquakeZoneCd) TYPE.get().getPropertyValue( this, "_EarthquakeZoneCd_elem" );
  }


  public final void setEarthquakeZoneCd_elem( xsd.acord.EarthquakeZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_EarthquakeZoneCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TaxCodeInfo> getTaxCodeInfo() {
    return (java.util.List<xsd.acord.TaxCodeInfo>) TYPE.get().getPropertyValue( this, "_TaxCodeInfo" );
  }


  public final void setTaxCodeInfo( java.util.List<xsd.acord.TaxCodeInfo> value ) {
    TYPE.get().setPropertyValue( this, "_TaxCodeInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SubLocation> getSubLocation() {
    return (java.util.List<xsd.acord.SubLocation>) TYPE.get().getPropertyValue( this, "_SubLocation" );
  }


  public final void setSubLocation( java.util.List<xsd.acord.SubLocation> value ) {
    TYPE.get().setPropertyValue( this, "_SubLocation", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdditionalInterest> getAdditionalInterest() {
    return (java.util.List<xsd.acord.AdditionalInterest>) TYPE.get().getPropertyValue( this, "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( java.util.List<xsd.acord.AdditionalInterest> value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalInterest", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFireDistrict() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FireDistrict" );
  }


  public final void setFireDistrict( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FireDistrict", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireDistrict getFireDistrict_elem() {
    return (xsd.acord.FireDistrict) TYPE.get().getPropertyValue( this, "_FireDistrict_elem" );
  }


  public final void setFireDistrict_elem( xsd.acord.FireDistrict value ) {
    TYPE.get().setPropertyValue( this, "_FireDistrict_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFireDistrictCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FireDistrictCd" );
  }


  public final void setFireDistrictCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FireDistrictCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireDistrictCd getFireDistrictCd_elem() {
    return (xsd.acord.FireDistrictCd) TYPE.get().getPropertyValue( this, "_FireDistrictCd_elem" );
  }


  public final void setFireDistrictCd_elem( xsd.acord.FireDistrictCd value ) {
    TYPE.get().setPropertyValue( this, "_FireDistrictCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFireStation() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FireStation" );
  }


  public final void setFireStation( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FireStation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireStation getFireStation_elem() {
    return (xsd.acord.FireStation) TYPE.get().getPropertyValue( this, "_FireStation_elem" );
  }


  public final void setFireStation_elem( xsd.acord.FireStation value ) {
    TYPE.get().setPropertyValue( this, "_FireStation_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Communications getCommunications() {
    return (xsd.acord.Communications) TYPE.get().getPropertyValue( this, "_Communications" );
  }


  public final void setCommunications( xsd.acord.Communications value ) {
    TYPE.get().setPropertyValue( this, "_Communications", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLocationName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LocationName" );
  }


  public final void setLocationName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LocationName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LocationName getLocationName_elem() {
    return (xsd.acord.LocationName) TYPE.get().getPropertyValue( this, "_LocationName_elem" );
  }


  public final void setLocationName_elem( xsd.acord.LocationName value ) {
    TYPE.get().setPropertyValue( this, "_LocationName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLocationDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LocationDesc" );
  }


  public final void setLocationDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LocationDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LocationDesc getLocationDesc_elem() {
    return (xsd.acord.LocationDesc) TYPE.get().getPropertyValue( this, "_LocationDesc_elem" );
  }


  public final void setLocationDesc_elem( xsd.acord.LocationDesc value ) {
    TYPE.get().setPropertyValue( this, "_LocationDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getCatastropheZoneCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_CatastropheZoneCd" );
  }


  public final void setCatastropheZoneCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheZoneCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CatastropheZoneCd> getCatastropheZoneCd_elem() {
    return (java.util.List<xsd.acord.CatastropheZoneCd>) TYPE.get().getPropertyValue( this, "_CatastropheZoneCd_elem" );
  }


  public final void setCatastropheZoneCd_elem( java.util.List<xsd.acord.CatastropheZoneCd> value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheZoneCd_elem", value );
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
  public final gw.xml.XmlElement getNameInfoRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_NameInfoRef" );
  }


  public final void setNameInfoRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_NameInfoRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.xml.XmlElement> getNameInfoRefs() {
    return (java.util.List<gw.xml.XmlElement>) TYPE.get().getPropertyValue( this, "_NameInfoRefs" );
  }


  public final void setNameInfoRefs( java.util.List<gw.xml.XmlElement> value ) {
    TYPE.get().setPropertyValue( this, "_NameInfoRefs", value );
  }

}

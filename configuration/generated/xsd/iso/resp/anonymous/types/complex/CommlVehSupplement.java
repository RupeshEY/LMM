/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CommlVehSupplement extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualLeaseReceiptsAmt = new javax.xml.namespace.QName( "", "AnnualLeaseReceiptsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PresentValueAmt = new javax.xml.namespace.QName( "", "PresentValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchaseDt = new javax.xml.namespace.QName( "", "PurchaseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmRanchInd = new javax.xml.namespace.QName( "", "FarmRanchInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarZoneCd = new javax.xml.namespace.QName( "", "FarZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancedAmt = new javax.xml.namespace.QName( "", "FinancedAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FleetInd = new javax.xml.namespace.QName( "", "FleetInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossVehOrCombinedWeight = new javax.xml.namespace.QName( "", "GrossVehOrCombinedWeight", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeasedAmt = new javax.xml.namespace.QName( "", "LeasedAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeVehLeased = new javax.xml.namespace.QName( "", "LengthTimeVehLeased", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MotorCarrierActInd = new javax.xml.namespace.QName( "", "MotorCarrierActInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NearZoneCd = new javax.xml.namespace.QName( "", "NearZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewVehInd = new javax.xml.namespace.QName( "", "NewVehInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OptionCd = new javax.xml.namespace.QName( "", "OptionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryClassCd = new javax.xml.namespace.QName( "", "PrimaryClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryRatingFactorLiability = new javax.xml.namespace.QName( "", "PrimaryRatingFactorLiability", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrimaryRatingFactorPhysicalDamage = new javax.xml.namespace.QName( "", "PrimaryRatingFactorPhysicalDamage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RadiusUse = new javax.xml.namespace.QName( "", "RadiusUse", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RatingCreditCd = new javax.xml.namespace.QName( "", "RatingCreditCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SeatingCapacity = new javax.xml.namespace.QName( "", "SeatingCapacity", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondaryClassCd = new javax.xml.namespace.QName( "", "SecondaryClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondaryRatingFactor = new javax.xml.namespace.QName( "", "SecondaryRatingFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SelfPropelledVehInd = new javax.xml.namespace.QName( "", "SelfPropelledVehInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialClassCd = new javax.xml.namespace.QName( "", "SpecialClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpecialUseCd = new javax.xml.namespace.QName( "", "SpecialUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UseLeasedVehDesc = new javax.xml.namespace.QName( "", "UseLeasedVehDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehAlteredInd = new javax.xml.namespace.QName( "", "VehAlteredInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehLeasedCd = new javax.xml.namespace.QName( "", "VehLeasedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehUseCd = new javax.xml.namespace.QName( "", "VehUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ZoneCombinationCd = new javax.xml.namespace.QName( "", "ZoneCombinationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReplacedVehIdentificationNumber = new javax.xml.namespace.QName( "", "ReplacedVehIdentificationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DMVTransactionCd = new javax.xml.namespace.QName( "", "DMVTransactionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehTypeCd = new javax.xml.namespace.QName( "", "VehTypeCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FleetRef = new javax.xml.namespace.QName( "", "FleetRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.CommlVehSupplement" );
    }
  };

  public CommlVehSupplement() {
    super( 1123247382, TYPE.get() );
  }

  private CommlVehSupplement( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1123247382, state );
  }

  protected CommlVehSupplement( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlVehSupplement( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.CommlVehSupplement> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.CommlVehSupplement get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_AnnualLeaseReceiptsAmt getAnnualLeaseReceiptsAmt() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_AnnualLeaseReceiptsAmt) TYPE.get().getPropertyValue( this, "_AnnualLeaseReceiptsAmt" );
  }


  public final void setAnnualLeaseReceiptsAmt( xsd.iso.resp.anonymous.elements.CommlVehSupplement_AnnualLeaseReceiptsAmt value ) {
    TYPE.get().setPropertyValue( this, "_AnnualLeaseReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_PresentValueAmt getPresentValueAmt() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_PresentValueAmt) TYPE.get().getPropertyValue( this, "_PresentValueAmt" );
  }


  public final void setPresentValueAmt( xsd.iso.resp.anonymous.elements.CommlVehSupplement_PresentValueAmt value ) {
    TYPE.get().setPropertyValue( this, "_PresentValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPurchaseDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PurchaseDt" );
  }


  public final void setPurchaseDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PurchaseDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_PurchaseDt getPurchaseDt_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_PurchaseDt) TYPE.get().getPropertyValue( this, "_PurchaseDt_elem" );
  }


  public final void setPurchaseDt_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_PurchaseDt value ) {
    TYPE.get().setPropertyValue( this, "_PurchaseDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFarmRanchInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FarmRanchInd" );
  }


  public final void setFarmRanchInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FarmRanchInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarmRanchInd getFarmRanchInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarmRanchInd) TYPE.get().getPropertyValue( this, "_FarmRanchInd_elem" );
  }


  public final void setFarmRanchInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarmRanchInd value ) {
    TYPE.get().setPropertyValue( this, "_FarmRanchInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFarZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FarZoneCd" );
  }


  public final void setFarZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FarZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarZoneCd getFarZoneCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarZoneCd) TYPE.get().getPropertyValue( this, "_FarZoneCd_elem" );
  }


  public final void setFarZoneCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_FarZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_FarZoneCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_FinancedAmt getFinancedAmt() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_FinancedAmt) TYPE.get().getPropertyValue( this, "_FinancedAmt" );
  }


  public final void setFinancedAmt( xsd.iso.resp.anonymous.elements.CommlVehSupplement_FinancedAmt value ) {
    TYPE.get().setPropertyValue( this, "_FinancedAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFleetInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FleetInd" );
  }


  public final void setFleetInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FleetInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_FleetInd getFleetInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_FleetInd) TYPE.get().getPropertyValue( this, "_FleetInd_elem" );
  }


  public final void setFleetInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_FleetInd value ) {
    TYPE.get().setPropertyValue( this, "_FleetInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGrossVehOrCombinedWeight() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_GrossVehOrCombinedWeight" );
  }


  public final void setGrossVehOrCombinedWeight( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_GrossVehOrCombinedWeight", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_GrossVehOrCombinedWeight getGrossVehOrCombinedWeight_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_GrossVehOrCombinedWeight) TYPE.get().getPropertyValue( this, "_GrossVehOrCombinedWeight_elem" );
  }


  public final void setGrossVehOrCombinedWeight_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_GrossVehOrCombinedWeight value ) {
    TYPE.get().setPropertyValue( this, "_GrossVehOrCombinedWeight_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_LeasedAmt getLeasedAmt() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_LeasedAmt) TYPE.get().getPropertyValue( this, "_LeasedAmt" );
  }


  public final void setLeasedAmt( xsd.iso.resp.anonymous.elements.CommlVehSupplement_LeasedAmt value ) {
    TYPE.get().setPropertyValue( this, "_LeasedAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_LengthTimeVehLeased getLengthTimeVehLeased() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_LengthTimeVehLeased) TYPE.get().getPropertyValue( this, "_LengthTimeVehLeased" );
  }


  public final void setLengthTimeVehLeased( xsd.iso.resp.anonymous.elements.CommlVehSupplement_LengthTimeVehLeased value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeVehLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMotorCarrierActInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MotorCarrierActInd" );
  }


  public final void setMotorCarrierActInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MotorCarrierActInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_MotorCarrierActInd getMotorCarrierActInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_MotorCarrierActInd) TYPE.get().getPropertyValue( this, "_MotorCarrierActInd_elem" );
  }


  public final void setMotorCarrierActInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_MotorCarrierActInd value ) {
    TYPE.get().setPropertyValue( this, "_MotorCarrierActInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNearZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NearZoneCd" );
  }


  public final void setNearZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NearZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_NearZoneCd getNearZoneCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_NearZoneCd) TYPE.get().getPropertyValue( this, "_NearZoneCd_elem" );
  }


  public final void setNearZoneCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_NearZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_NearZoneCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNewVehInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NewVehInd" );
  }


  public final void setNewVehInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NewVehInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_NewVehInd getNewVehInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_NewVehInd) TYPE.get().getPropertyValue( this, "_NewVehInd_elem" );
  }


  public final void setNewVehInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_NewVehInd value ) {
    TYPE.get().setPropertyValue( this, "_NewVehInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOptionCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OptionCd" );
  }


  public final void setOptionCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OptionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_OptionCd getOptionCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_OptionCd) TYPE.get().getPropertyValue( this, "_OptionCd_elem" );
  }


  public final void setOptionCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_OptionCd value ) {
    TYPE.get().setPropertyValue( this, "_OptionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PrimaryClassCd" );
  }


  public final void setPrimaryClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryClassCd getPrimaryClassCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryClassCd) TYPE.get().getPropertyValue( this, "_PrimaryClassCd_elem" );
  }


  public final void setPrimaryClassCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryClassCd value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryRatingFactorLiability() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PrimaryRatingFactorLiability" );
  }


  public final void setPrimaryRatingFactorLiability( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryRatingFactorLiability", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorLiability getPrimaryRatingFactorLiability_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorLiability) TYPE.get().getPropertyValue( this, "_PrimaryRatingFactorLiability_elem" );
  }


  public final void setPrimaryRatingFactorLiability_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorLiability value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryRatingFactorLiability_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryRatingFactorPhysicalDamage() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PrimaryRatingFactorPhysicalDamage" );
  }


  public final void setPrimaryRatingFactorPhysicalDamage( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryRatingFactorPhysicalDamage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorPhysicalDamage getPrimaryRatingFactorPhysicalDamage_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorPhysicalDamage) TYPE.get().getPropertyValue( this, "_PrimaryRatingFactorPhysicalDamage_elem" );
  }


  public final void setPrimaryRatingFactorPhysicalDamage_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_PrimaryRatingFactorPhysicalDamage value ) {
    TYPE.get().setPropertyValue( this, "_PrimaryRatingFactorPhysicalDamage_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_RadiusUse getRadiusUse() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_RadiusUse) TYPE.get().getPropertyValue( this, "_RadiusUse" );
  }


  public final void setRadiusUse( xsd.iso.resp.anonymous.elements.CommlVehSupplement_RadiusUse value ) {
    TYPE.get().setPropertyValue( this, "_RadiusUse", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRatingCreditCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RatingCreditCd" );
  }


  public final void setRatingCreditCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RatingCreditCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_RatingCreditCd getRatingCreditCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_RatingCreditCd) TYPE.get().getPropertyValue( this, "_RatingCreditCd_elem" );
  }


  public final void setRatingCreditCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_RatingCreditCd value ) {
    TYPE.get().setPropertyValue( this, "_RatingCreditCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSeatingCapacity() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SeatingCapacity" );
  }


  public final void setSeatingCapacity( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SeatingCapacity", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SeatingCapacity getSeatingCapacity_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SeatingCapacity) TYPE.get().getPropertyValue( this, "_SeatingCapacity_elem" );
  }


  public final void setSeatingCapacity_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SeatingCapacity value ) {
    TYPE.get().setPropertyValue( this, "_SeatingCapacity_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSecondaryClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SecondaryClassCd" );
  }


  public final void setSecondaryClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryClassCd getSecondaryClassCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryClassCd) TYPE.get().getPropertyValue( this, "_SecondaryClassCd_elem" );
  }


  public final void setSecondaryClassCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryClassCd value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSecondaryRatingFactor() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SecondaryRatingFactor" );
  }


  public final void setSecondaryRatingFactor( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryRatingFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryRatingFactor getSecondaryRatingFactor_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryRatingFactor) TYPE.get().getPropertyValue( this, "_SecondaryRatingFactor_elem" );
  }


  public final void setSecondaryRatingFactor_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SecondaryRatingFactor value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryRatingFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSelfPropelledVehInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SelfPropelledVehInd" );
  }


  public final void setSelfPropelledVehInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SelfPropelledVehInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SelfPropelledVehInd getSelfPropelledVehInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SelfPropelledVehInd) TYPE.get().getPropertyValue( this, "_SelfPropelledVehInd_elem" );
  }


  public final void setSelfPropelledVehInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SelfPropelledVehInd value ) {
    TYPE.get().setPropertyValue( this, "_SelfPropelledVehInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSpecialClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SpecialClassCd" );
  }


  public final void setSpecialClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SpecialClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialClassCd getSpecialClassCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialClassCd) TYPE.get().getPropertyValue( this, "_SpecialClassCd_elem" );
  }


  public final void setSpecialClassCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialClassCd value ) {
    TYPE.get().setPropertyValue( this, "_SpecialClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSpecialUseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SpecialUseCd" );
  }


  public final void setSpecialUseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SpecialUseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialUseCd getSpecialUseCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialUseCd) TYPE.get().getPropertyValue( this, "_SpecialUseCd_elem" );
  }


  public final void setSpecialUseCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_SpecialUseCd value ) {
    TYPE.get().setPropertyValue( this, "_SpecialUseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUseLeasedVehDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UseLeasedVehDesc" );
  }


  public final void setUseLeasedVehDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UseLeasedVehDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_UseLeasedVehDesc getUseLeasedVehDesc_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_UseLeasedVehDesc) TYPE.get().getPropertyValue( this, "_UseLeasedVehDesc_elem" );
  }


  public final void setUseLeasedVehDesc_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_UseLeasedVehDesc value ) {
    TYPE.get().setPropertyValue( this, "_UseLeasedVehDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVehAlteredInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VehAlteredInd" );
  }


  public final void setVehAlteredInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VehAlteredInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehAlteredInd getVehAlteredInd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehAlteredInd) TYPE.get().getPropertyValue( this, "_VehAlteredInd_elem" );
  }


  public final void setVehAlteredInd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehAlteredInd value ) {
    TYPE.get().setPropertyValue( this, "_VehAlteredInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVehLeasedCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VehLeasedCd" );
  }


  public final void setVehLeasedCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VehLeasedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehLeasedCd getVehLeasedCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehLeasedCd) TYPE.get().getPropertyValue( this, "_VehLeasedCd_elem" );
  }


  public final void setVehLeasedCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehLeasedCd value ) {
    TYPE.get().setPropertyValue( this, "_VehLeasedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVehUseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VehUseCd" );
  }


  public final void setVehUseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VehUseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehUseCd getVehUseCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehUseCd) TYPE.get().getPropertyValue( this, "_VehUseCd_elem" );
  }


  public final void setVehUseCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehUseCd value ) {
    TYPE.get().setPropertyValue( this, "_VehUseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getZoneCombinationCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ZoneCombinationCd" );
  }


  public final void setZoneCombinationCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ZoneCombinationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_ZoneCombinationCd getZoneCombinationCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_ZoneCombinationCd) TYPE.get().getPropertyValue( this, "_ZoneCombinationCd_elem" );
  }


  public final void setZoneCombinationCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_ZoneCombinationCd value ) {
    TYPE.get().setPropertyValue( this, "_ZoneCombinationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.Addr getAddr() {
    return (xsd.iso.resp.Addr) TYPE.get().getPropertyValue( this, "_Addr" );
  }


  public final void setAddr( xsd.iso.resp.Addr value ) {
    TYPE.get().setPropertyValue( this, "_Addr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReplacedVehIdentificationNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReplacedVehIdentificationNumber" );
  }


  public final void setReplacedVehIdentificationNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReplacedVehIdentificationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_ReplacedVehIdentificationNumber getReplacedVehIdentificationNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_ReplacedVehIdentificationNumber) TYPE.get().getPropertyValue( this, "_ReplacedVehIdentificationNumber_elem" );
  }


  public final void setReplacedVehIdentificationNumber_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_ReplacedVehIdentificationNumber value ) {
    TYPE.get().setPropertyValue( this, "_ReplacedVehIdentificationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDMVTransactionCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DMVTransactionCd" );
  }


  public final void setDMVTransactionCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DMVTransactionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_DMVTransactionCd getDMVTransactionCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_DMVTransactionCd) TYPE.get().getPropertyValue( this, "_DMVTransactionCd_elem" );
  }


  public final void setDMVTransactionCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_DMVTransactionCd value ) {
    TYPE.get().setPropertyValue( this, "_DMVTransactionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVehTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VehTypeCd" );
  }


  public final void setVehTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VehTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehTypeCd getVehTypeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehTypeCd) TYPE.get().getPropertyValue( this, "_VehTypeCd_elem" );
  }


  public final void setVehTypeCd_elem( xsd.iso.resp.anonymous.elements.CommlVehSupplement_VehTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_VehTypeCd_elem", value );
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
  public final gw.xml.XmlElement getFleetRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_FleetRef" );
  }


  public final void setFleetRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_FleetRef", value );
  }

}

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PersApplicationInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PersApplicationInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentResidenceDt = new javax.xml.namespace.QName( "", "CurrentResidenceDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreviousResidenceDt = new javax.xml.namespace.QName( "", "PreviousResidenceDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnyLossesAccidentsConvictionsInd = new javax.xml.namespace.QName( "", "AnyLossesAccidentsConvictionsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HouseholdIncomeAmt = new javax.xml.namespace.QName( "", "HouseholdIncomeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_KnownSinceDt = new javax.xml.namespace.QName( "", "KnownSinceDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResidenceOwnedRentedCd = new javax.xml.namespace.QName( "", "ResidenceOwnedRentedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumResidentsInHousehold = new javax.xml.namespace.QName( "", "NumResidentsInHousehold", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsInHousehold = new javax.xml.namespace.QName( "", "NumVehsInHousehold", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumNonChargeableLosses = new javax.xml.namespace.QName( "", "NumNonChargeableLosses", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumViolations = new javax.xml.namespace.QName( "", "NumViolations", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResidenceTypeCd = new javax.xml.namespace.QName( "", "ResidenceTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeCurrentAddr = new javax.xml.namespace.QName( "", "LengthTimeCurrentAddr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimePreviousAddr = new javax.xml.namespace.QName( "", "LengthTimePreviousAddr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApplicationReceivedByAgencyDt = new javax.xml.namespace.QName( "", "ApplicationReceivedByAgencyDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ApplicationWriitenDt = new javax.xml.namespace.QName( "", "ApplicationWriitenDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlParentOrSubsidiaryInfo = new javax.xml.namespace.QName( "", "CommlParentOrSubsidiaryInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PersApplicationInfo_Type" );
    }
  };

  public PersApplicationInfo_Type() {
    super( 739172792, TYPE.get() );
  }

  private PersApplicationInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 739172792, state );
  }

  protected PersApplicationInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PersApplicationInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PersApplicationInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PersApplicationInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCurrentResidenceDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CurrentResidenceDt" );
  }


  public final void setCurrentResidenceDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CurrentResidenceDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurrentResidenceDt getCurrentResidenceDt_elem() {
    return (xsd.acord.CurrentResidenceDt) TYPE.get().getPropertyValue( this, "_CurrentResidenceDt_elem" );
  }


  public final void setCurrentResidenceDt_elem( xsd.acord.CurrentResidenceDt value ) {
    TYPE.get().setPropertyValue( this, "_CurrentResidenceDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPreviousResidenceDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PreviousResidenceDt" );
  }


  public final void setPreviousResidenceDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PreviousResidenceDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PreviousResidenceDt getPreviousResidenceDt_elem() {
    return (xsd.acord.PreviousResidenceDt) TYPE.get().getPropertyValue( this, "_PreviousResidenceDt_elem" );
  }


  public final void setPreviousResidenceDt_elem( xsd.acord.PreviousResidenceDt value ) {
    TYPE.get().setPropertyValue( this, "_PreviousResidenceDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAnyLossesAccidentsConvictionsInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AnyLossesAccidentsConvictionsInd" );
  }


  public final void setAnyLossesAccidentsConvictionsInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AnyLossesAccidentsConvictionsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnyLossesAccidentsConvictionsInd getAnyLossesAccidentsConvictionsInd_elem() {
    return (xsd.acord.AnyLossesAccidentsConvictionsInd) TYPE.get().getPropertyValue( this, "_AnyLossesAccidentsConvictionsInd_elem" );
  }


  public final void setAnyLossesAccidentsConvictionsInd_elem( xsd.acord.AnyLossesAccidentsConvictionsInd value ) {
    TYPE.get().setPropertyValue( this, "_AnyLossesAccidentsConvictionsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HouseholdIncomeAmt getHouseholdIncomeAmt() {
    return (xsd.acord.HouseholdIncomeAmt) TYPE.get().getPropertyValue( this, "_HouseholdIncomeAmt" );
  }


  public final void setHouseholdIncomeAmt( xsd.acord.HouseholdIncomeAmt value ) {
    TYPE.get().setPropertyValue( this, "_HouseholdIncomeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getKnownSinceDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_KnownSinceDt" );
  }


  public final void setKnownSinceDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_KnownSinceDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.KnownSinceDt getKnownSinceDt_elem() {
    return (xsd.acord.KnownSinceDt) TYPE.get().getPropertyValue( this, "_KnownSinceDt_elem" );
  }


  public final void setKnownSinceDt_elem( xsd.acord.KnownSinceDt value ) {
    TYPE.get().setPropertyValue( this, "_KnownSinceDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Ownership getResidenceOwnedRentedCd() {
    return (xsd.acord.enums.Ownership) TYPE.get().getPropertyValue( this, "_ResidenceOwnedRentedCd" );
  }


  public final void setResidenceOwnedRentedCd( xsd.acord.enums.Ownership value ) {
    TYPE.get().setPropertyValue( this, "_ResidenceOwnedRentedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ResidenceOwnedRentedCd getResidenceOwnedRentedCd_elem() {
    return (xsd.acord.ResidenceOwnedRentedCd) TYPE.get().getPropertyValue( this, "_ResidenceOwnedRentedCd_elem" );
  }


  public final void setResidenceOwnedRentedCd_elem( xsd.acord.ResidenceOwnedRentedCd value ) {
    TYPE.get().setPropertyValue( this, "_ResidenceOwnedRentedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumResidentsInHousehold() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumResidentsInHousehold" );
  }


  public final void setNumResidentsInHousehold( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumResidentsInHousehold", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumResidentsInHousehold getNumResidentsInHousehold_elem() {
    return (xsd.acord.NumResidentsInHousehold) TYPE.get().getPropertyValue( this, "_NumResidentsInHousehold_elem" );
  }


  public final void setNumResidentsInHousehold_elem( xsd.acord.NumResidentsInHousehold value ) {
    TYPE.get().setPropertyValue( this, "_NumResidentsInHousehold_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsInHousehold() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumVehsInHousehold" );
  }


  public final void setNumVehsInHousehold( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumVehsInHousehold", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsInHousehold getNumVehsInHousehold_elem() {
    return (xsd.acord.NumVehsInHousehold) TYPE.get().getPropertyValue( this, "_NumVehsInHousehold_elem" );
  }


  public final void setNumVehsInHousehold_elem( xsd.acord.NumVehsInHousehold value ) {
    TYPE.get().setPropertyValue( this, "_NumVehsInHousehold_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumNonChargeableLosses() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumNonChargeableLosses" );
  }


  public final void setNumNonChargeableLosses( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumNonChargeableLosses", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumNonChargeableLosses getNumNonChargeableLosses_elem() {
    return (xsd.acord.NumNonChargeableLosses) TYPE.get().getPropertyValue( this, "_NumNonChargeableLosses_elem" );
  }


  public final void setNumNonChargeableLosses_elem( xsd.acord.NumNonChargeableLosses value ) {
    TYPE.get().setPropertyValue( this, "_NumNonChargeableLosses_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumViolations() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumViolations" );
  }


  public final void setNumViolations( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumViolations", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumViolations getNumViolations_elem() {
    return (xsd.acord.NumViolations) TYPE.get().getPropertyValue( this, "_NumViolations_elem" );
  }


  public final void setNumViolations_elem( xsd.acord.NumViolations value ) {
    TYPE.get().setPropertyValue( this, "_NumViolations_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ResidenceType getResidenceTypeCd() {
    return (xsd.acord.enums.ResidenceType) TYPE.get().getPropertyValue( this, "_ResidenceTypeCd" );
  }


  public final void setResidenceTypeCd( xsd.acord.enums.ResidenceType value ) {
    TYPE.get().setPropertyValue( this, "_ResidenceTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ResidenceTypeCd getResidenceTypeCd_elem() {
    return (xsd.acord.ResidenceTypeCd) TYPE.get().getPropertyValue( this, "_ResidenceTypeCd_elem" );
  }


  public final void setResidenceTypeCd_elem( xsd.acord.ResidenceTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ResidenceTypeCd_elem", value );
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
  public final xsd.acord.LengthTimeCurrentAddr getLengthTimeCurrentAddr() {
    return (xsd.acord.LengthTimeCurrentAddr) TYPE.get().getPropertyValue( this, "_LengthTimeCurrentAddr" );
  }


  public final void setLengthTimeCurrentAddr( xsd.acord.LengthTimeCurrentAddr value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeCurrentAddr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimePreviousAddr getLengthTimePreviousAddr() {
    return (xsd.acord.LengthTimePreviousAddr) TYPE.get().getPropertyValue( this, "_LengthTimePreviousAddr" );
  }


  public final void setLengthTimePreviousAddr( xsd.acord.LengthTimePreviousAddr value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimePreviousAddr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getApplicationReceivedByAgencyDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ApplicationReceivedByAgencyDt" );
  }


  public final void setApplicationReceivedByAgencyDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationReceivedByAgencyDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ApplicationReceivedByAgencyDt getApplicationReceivedByAgencyDt_elem() {
    return (xsd.acord.ApplicationReceivedByAgencyDt) TYPE.get().getPropertyValue( this, "_ApplicationReceivedByAgencyDt_elem" );
  }


  public final void setApplicationReceivedByAgencyDt_elem( xsd.acord.ApplicationReceivedByAgencyDt value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationReceivedByAgencyDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getApplicationWriitenDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ApplicationWriitenDt" );
  }


  public final void setApplicationWriitenDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationWriitenDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ApplicationWriitenDt getApplicationWriitenDt_elem() {
    return (xsd.acord.ApplicationWriitenDt) TYPE.get().getPropertyValue( this, "_ApplicationWriitenDt_elem" );
  }


  public final void setApplicationWriitenDt_elem( xsd.acord.ApplicationWriitenDt value ) {
    TYPE.get().setPropertyValue( this, "_ApplicationWriitenDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo> getCommlParentOrSubsidiaryInfo() {
    return (java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo>) TYPE.get().getPropertyValue( this, "_CommlParentOrSubsidiaryInfo" );
  }


  public final void setCommlParentOrSubsidiaryInfo( java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo> value ) {
    TYPE.get().setPropertyValue( this, "_CommlParentOrSubsidiaryInfo", value );
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
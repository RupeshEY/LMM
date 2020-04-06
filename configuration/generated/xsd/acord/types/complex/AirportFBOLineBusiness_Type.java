/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCLINEBUSINESS.class)
public class AirportFBOLineBusiness_Type extends xsd.acord.types.complex.PCLINEBUSINESS {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AirportFBOLineBusiness_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Airport = new javax.xml.namespace.QName( "", "Airport", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossReceipts = new javax.xml.namespace.QName( "", "GrossReceipts", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Fueling = new javax.xml.namespace.QName( "", "Fueling", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TieDownHangaring = new javax.xml.namespace.QName( "", "TieDownHangaring", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Hangar = new javax.xml.namespace.QName( "", "Hangar", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pilot = new javax.xml.namespace.QName( "", "Pilot", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehElevatorAircraft = new javax.xml.namespace.QName( "", "VehElevatorAircraft", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICCd = new javax.xml.namespace.QName( "", "NAICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyProductCd = new javax.xml.namespace.QName( "", "CompanyProductCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NetChangeAmt = new javax.xml.namespace.QName( "", "NetChangeAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WrittenAmt = new javax.xml.namespace.QName( "", "WrittenAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GroupId = new javax.xml.namespace.QName( "", "GroupId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PMACd = new javax.xml.namespace.QName( "", "PMACd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RateEffectiveDt = new javax.xml.namespace.QName( "", "RateEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinPremInd = new javax.xml.namespace.QName( "", "MinPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AuditInfo = new javax.xml.namespace.QName( "", "AuditInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HazardGradeCd = new javax.xml.namespace.QName( "", "HazardGradeCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AirportFBOLineBusiness_Type" );
    }
  };

  public AirportFBOLineBusiness_Type() {
    super( 1104810294, TYPE.get() );
  }

  private AirportFBOLineBusiness_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1104810294, state );
  }

  protected AirportFBOLineBusiness_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AirportFBOLineBusiness_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.AirportFBOLineBusiness_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.AirportFBOLineBusiness_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Airport> getAirport() {
    return (java.util.List<xsd.acord.Airport>) TYPE.get().getPropertyValue( this, "_Airport" );
  }


  public final void setAirport( java.util.List<xsd.acord.Airport> value ) {
    TYPE.get().setPropertyValue( this, "_Airport", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.GrossReceipts> getGrossReceipts() {
    return (java.util.List<xsd.acord.GrossReceipts>) TYPE.get().getPropertyValue( this, "_GrossReceipts" );
  }


  public final void setGrossReceipts( java.util.List<xsd.acord.GrossReceipts> value ) {
    TYPE.get().setPropertyValue( this, "_GrossReceipts", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Fueling> getFueling() {
    return (java.util.List<xsd.acord.Fueling>) TYPE.get().getPropertyValue( this, "_Fueling" );
  }


  public final void setFueling( java.util.List<xsd.acord.Fueling> value ) {
    TYPE.get().setPropertyValue( this, "_Fueling", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TieDownHangaring> getTieDownHangaring() {
    return (java.util.List<xsd.acord.TieDownHangaring>) TYPE.get().getPropertyValue( this, "_TieDownHangaring" );
  }


  public final void setTieDownHangaring( java.util.List<xsd.acord.TieDownHangaring> value ) {
    TYPE.get().setPropertyValue( this, "_TieDownHangaring", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Hangar> getHangar() {
    return (java.util.List<xsd.acord.Hangar>) TYPE.get().getPropertyValue( this, "_Hangar" );
  }


  public final void setHangar( java.util.List<xsd.acord.Hangar> value ) {
    TYPE.get().setPropertyValue( this, "_Hangar", value );
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
  public final java.util.List<xsd.acord.VehElevatorAircraft> getVehElevatorAircraft() {
    return (java.util.List<xsd.acord.VehElevatorAircraft>) TYPE.get().getPropertyValue( this, "_VehElevatorAircraft" );
  }


  public final void setVehElevatorAircraft( java.util.List<xsd.acord.VehElevatorAircraft> value ) {
    TYPE.get().setPropertyValue( this, "_VehElevatorAircraft", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QuestionAnswer> getQuestionAnswer() {
    return (java.util.List<xsd.acord.QuestionAnswer>) TYPE.get().getPropertyValue( this, "_QuestionAnswer" );
  }


  public final void setQuestionAnswer( java.util.List<xsd.acord.QuestionAnswer> value ) {
    TYPE.get().setPropertyValue( this, "_QuestionAnswer", value );
  }


}
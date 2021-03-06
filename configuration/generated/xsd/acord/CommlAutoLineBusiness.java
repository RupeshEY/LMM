/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommlAutoLineBusiness extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlAutoLineBusiness", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlAutoPolicyInfo = new javax.xml.namespace.QName( "", "CommlAutoPolicyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlVehFiling = new javax.xml.namespace.QName( "", "CommlVehFiling", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoveredAutoSymbol = new javax.xml.namespace.QName( "", "CoveredAutoSymbol", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlRateState = new javax.xml.namespace.QName( "", "CommlRateState", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TruckersZone = new javax.xml.namespace.QName( "", "TruckersZone", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TruckersSupplement = new javax.xml.namespace.QName( "", "TruckersSupplement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlDriver = new javax.xml.namespace.QName( "", "CommlDriver", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlVehFleetInfo = new javax.xml.namespace.QName( "", "CommlVehFleetInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GarageKeepersLocation = new javax.xml.namespace.QName( "", "GarageKeepersLocation", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommlAutoLineBusiness" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlAutoLineBusiness_Type" );
    }
  };

  public CommlAutoLineBusiness() {
    super( 1426013487, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommlAutoLineBusiness_Type() );
  }

  public CommlAutoLineBusiness( xsd.acord.types.complex.CommlAutoLineBusiness_Type typeInstance ) {
    super( 1426013487, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommlAutoLineBusiness( gw.internal.xml.XmlElementState state ) {
    super( 1426013487, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommlAutoLineBusiness> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommlAutoLineBusiness_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommlAutoLineBusiness_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommlAutoLineBusiness_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }

  public static xsd.acord.CommlAutoLineBusiness parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommlAutoLineBusiness.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlAutoPolicyInfo getCommlAutoPolicyInfo() {
    return (xsd.acord.CommlAutoPolicyInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlAutoPolicyInfo" );
  }


  public final void setCommlAutoPolicyInfo( xsd.acord.CommlAutoPolicyInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlAutoPolicyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlVehFiling> getCommlVehFiling() {
    return (java.util.List<xsd.acord.CommlVehFiling>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlVehFiling" );
  }


  public final void setCommlVehFiling( java.util.List<xsd.acord.CommlVehFiling> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlVehFiling", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CoveredAutoSymbol getCoveredAutoSymbol() {
    return (xsd.acord.CoveredAutoSymbol) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoveredAutoSymbol" );
  }


  public final void setCoveredAutoSymbol( xsd.acord.CoveredAutoSymbol value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoveredAutoSymbol", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlRateState> getCommlRateState() {
    return (java.util.List<xsd.acord.CommlRateState>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlRateState" );
  }


  public final void setCommlRateState( java.util.List<xsd.acord.CommlRateState> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlRateState", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TruckersZone> getTruckersZone() {
    return (java.util.List<xsd.acord.TruckersZone>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TruckersZone" );
  }


  public final void setTruckersZone( java.util.List<xsd.acord.TruckersZone> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TruckersZone", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Location> getLocation() {
    return (java.util.List<xsd.acord.Location>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Location" );
  }


  public final void setLocation( java.util.List<xsd.acord.Location> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Location", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TruckersSupplement getTruckersSupplement() {
    return (xsd.acord.TruckersSupplement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TruckersSupplement" );
  }


  public final void setTruckersSupplement( xsd.acord.TruckersSupplement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TruckersSupplement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlDriver> getCommlDriver() {
    return (java.util.List<xsd.acord.CommlDriver>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlDriver" );
  }


  public final void setCommlDriver( java.util.List<xsd.acord.CommlDriver> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlDriver", value );
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
  public final java.util.List<xsd.acord.Form> getForm() {
    return (java.util.List<xsd.acord.Form>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Form" );
  }


  public final void setForm( java.util.List<xsd.acord.Form> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Form", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlVehFleetInfo> getCommlVehFleetInfo() {
    return (java.util.List<xsd.acord.CommlVehFleetInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlVehFleetInfo" );
  }


  public final void setCommlVehFleetInfo( java.util.List<xsd.acord.CommlVehFleetInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlVehFleetInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.GarageKeepersLocation> getGarageKeepersLocation() {
    return (java.util.List<xsd.acord.GarageKeepersLocation>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GarageKeepersLocation" );
  }


  public final void setGarageKeepersLocation( java.util.List<xsd.acord.GarageKeepersLocation> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GarageKeepersLocation", value );
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
  public final xsd.acord.enums.LineOfBusiness getLOBCd() {
    return (xsd.acord.enums.LineOfBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd" );
  }


  public final void setLOBCd( xsd.acord.enums.LineOfBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBCd getLOBCd_elem() {
    return (xsd.acord.LOBCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.acord.LOBCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusinessSubCode getLOBSubCd() {
    return (xsd.acord.enums.LineOfBusinessSubCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBSubCd" );
  }


  public final void setLOBSubCd( xsd.acord.enums.LineOfBusinessSubCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBSubCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBSubCd getLOBSubCd_elem() {
    return (xsd.acord.LOBSubCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBSubCd_elem" );
  }


  public final void setLOBSubCd_elem( xsd.acord.LOBSubCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBSubCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICCd" );
  }


  public final void setNAICCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICCd getNAICCd_elem() {
    return (xsd.acord.NAICCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICCd_elem" );
  }


  public final void setNAICCd_elem( xsd.acord.NAICCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanyProductCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CompanyProductCd" );
  }


  public final void setCompanyProductCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CompanyProductCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CompanyProductCd getCompanyProductCd_elem() {
    return (xsd.acord.CompanyProductCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CompanyProductCd_elem" );
  }


  public final void setCompanyProductCd_elem( xsd.acord.CompanyProductCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CompanyProductCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurrentTermAmt getCurrentTermAmt() {
    return (xsd.acord.CurrentTermAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurrentTermAmt" );
  }


  public final void setCurrentTermAmt( xsd.acord.CurrentTermAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurrentTermAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NetChangeAmt getNetChangeAmt() {
    return (xsd.acord.NetChangeAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NetChangeAmt" );
  }


  public final void setNetChangeAmt( xsd.acord.NetChangeAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NetChangeAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WrittenAmt getWrittenAmt() {
    return (xsd.acord.WrittenAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_WrittenAmt" );
  }


  public final void setWrittenAmt( xsd.acord.WrittenAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_WrittenAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGroupId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GroupId" );
  }


  public final void setGroupId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GroupId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GroupId getGroupId_elem() {
    return (xsd.acord.GroupId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GroupId_elem" );
  }


  public final void setGroupId_elem( xsd.acord.GroupId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GroupId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPMACd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PMACd" );
  }


  public final void setPMACd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PMACd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PMACd getPMACd_elem() {
    return (xsd.acord.PMACd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PMACd_elem" );
  }


  public final void setPMACd_elem( xsd.acord.PMACd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PMACd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRateEffectiveDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RateEffectiveDt" );
  }


  public final void setRateEffectiveDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RateEffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RateEffectiveDt getRateEffectiveDt_elem() {
    return (xsd.acord.RateEffectiveDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RateEffectiveDt_elem" );
  }


  public final void setRateEffectiveDt_elem( xsd.acord.RateEffectiveDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RateEffectiveDt_elem", value );
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
  public final java.util.List<xsd.acord.AuditInfo> getAuditInfo() {
    return (java.util.List<xsd.acord.AuditInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AuditInfo" );
  }


  public final void setAuditInfo( java.util.List<xsd.acord.AuditInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AuditInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHazardGradeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HazardGradeCd" );
  }


  public final void setHazardGradeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HazardGradeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HazardGradeCd getHazardGradeCd_elem() {
    return (xsd.acord.HazardGradeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HazardGradeCd_elem" );
  }


  public final void setHazardGradeCd_elem( xsd.acord.HazardGradeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HazardGradeCd_elem", value );
  }
}

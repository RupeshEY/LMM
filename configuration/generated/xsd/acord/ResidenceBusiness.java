/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ResidenceBusiness extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ResidenceBusiness", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCd = new javax.xml.namespace.QName( "", "ClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LegalEntityCd = new javax.xml.namespace.QName( "", "LegalEntityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralLiabilityCd = new javax.xml.namespace.QName( "", "GeneralLiabilityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICSCd = new javax.xml.namespace.QName( "", "NAICSCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NatureBusinessCd = new javax.xml.namespace.QName( "", "NatureBusinessCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessStartDt = new javax.xml.namespace.QName( "", "BusinessStartDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessArea = new javax.xml.namespace.QName( "", "BusinessArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualSalesAmt = new javax.xml.namespace.QName( "", "AnnualSalesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPayrollAmt = new javax.xml.namespace.QName( "", "TotalPayrollAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVisitors = new javax.xml.namespace.QName( "", "NumVisitors", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesPartTime = new javax.xml.namespace.QName( "", "NumEmployeesPartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesFullTime = new javax.xml.namespace.QName( "", "NumEmployeesFullTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessHoursStartTime = new javax.xml.namespace.QName( "", "BusinessHoursStartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessHoursCloseTime = new javax.xml.namespace.QName( "", "BusinessHoursCloseTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLosses = new javax.xml.namespace.QName( "", "NumLosses", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLossesYrs = new javax.xml.namespace.QName( "", "NumLossesYrs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessDesc = new javax.xml.namespace.QName( "", "BusinessDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxIdentity = new javax.xml.namespace.QName( "", "TaxIdentity", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupplementaryNameInfo = new javax.xml.namespace.QName( "", "SupplementaryNameInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverage = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InspectionContactRef = new javax.xml.namespace.QName( "", "InspectionContactRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ResidenceBusiness" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ResidenceBusiness_Type" );
    }
  };

  public ResidenceBusiness() {
    super( -1050787342, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ResidenceBusiness_Type() );
  }

  public ResidenceBusiness( xsd.acord.types.complex.ResidenceBusiness_Type typeInstance ) {
    super( -1050787342, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ResidenceBusiness( gw.internal.xml.XmlElementState state ) {
    super( -1050787342, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ResidenceBusiness> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ResidenceBusiness_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ResidenceBusiness_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ResidenceBusiness_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ResidenceBusiness parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ResidenceBusiness.class );
  }

  public static xsd.acord.ResidenceBusiness parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ResidenceBusiness.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClassCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCd" );
  }


  public final void setClassCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassCd getClassCd_elem() {
    return (xsd.acord.ClassCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCd_elem" );
  }


  public final void setClassCd_elem( xsd.acord.ClassCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LegalEntity getLegalEntityCd() {
    return (xsd.acord.enums.LegalEntity) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LegalEntityCd" );
  }


  public final void setLegalEntityCd( xsd.acord.enums.LegalEntity value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LegalEntityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LegalEntityCd getLegalEntityCd_elem() {
    return (xsd.acord.LegalEntityCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LegalEntityCd_elem" );
  }


  public final void setLegalEntityCd_elem( xsd.acord.LegalEntityCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LegalEntityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getGeneralLiabilityCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeneralLiabilityCd" );
  }


  public final void setGeneralLiabilityCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeneralLiabilityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GeneralLiabilityCd getGeneralLiabilityCd_elem() {
    return (xsd.acord.GeneralLiabilityCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeneralLiabilityCd_elem" );
  }


  public final void setGeneralLiabilityCd_elem( xsd.acord.GeneralLiabilityCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeneralLiabilityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICSCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICSCd" );
  }


  public final void setNAICSCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICSCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICSCd getNAICSCd_elem() {
    return (xsd.acord.NAICSCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NAICSCd_elem" );
  }


  public final void setNAICSCd_elem( xsd.acord.NAICSCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NAICSCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.NatureOfBusiness getNatureBusinessCd() {
    return (xsd.acord.enums.NatureOfBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NatureBusinessCd" );
  }


  public final void setNatureBusinessCd( xsd.acord.enums.NatureOfBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NatureBusinessCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NatureBusinessCd getNatureBusinessCd_elem() {
    return (xsd.acord.NatureBusinessCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NatureBusinessCd_elem" );
  }


  public final void setNatureBusinessCd_elem( xsd.acord.NatureBusinessCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NatureBusinessCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBusinessStartDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessStartDt" );
  }


  public final void setBusinessStartDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessStartDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessStartDt getBusinessStartDt_elem() {
    return (xsd.acord.BusinessStartDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessStartDt_elem" );
  }


  public final void setBusinessStartDt_elem( xsd.acord.BusinessStartDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessStartDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessArea getBusinessArea() {
    return (xsd.acord.BusinessArea) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessArea" );
  }


  public final void setBusinessArea( xsd.acord.BusinessArea value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualSalesAmt getAnnualSalesAmt() {
    return (xsd.acord.AnnualSalesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualSalesAmt" );
  }


  public final void setAnnualSalesAmt( xsd.acord.AnnualSalesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualSalesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPayrollAmt getTotalPayrollAmt() {
    return (xsd.acord.TotalPayrollAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalPayrollAmt" );
  }


  public final void setTotalPayrollAmt( xsd.acord.TotalPayrollAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalPayrollAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVisitors() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVisitors" );
  }


  public final void setNumVisitors( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVisitors", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVisitors getNumVisitors_elem() {
    return (xsd.acord.NumVisitors) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVisitors_elem" );
  }


  public final void setNumVisitors_elem( xsd.acord.NumVisitors value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVisitors_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesPartTime() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime" );
  }


  public final void setNumEmployeesPartTime( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesPartTime getNumEmployeesPartTime_elem() {
    return (xsd.acord.NumEmployeesPartTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime_elem" );
  }


  public final void setNumEmployeesPartTime_elem( xsd.acord.NumEmployeesPartTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesFullTime() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime" );
  }


  public final void setNumEmployeesFullTime( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesFullTime getNumEmployeesFullTime_elem() {
    return (xsd.acord.NumEmployeesFullTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime_elem" );
  }


  public final void setNumEmployeesFullTime_elem( xsd.acord.NumEmployeesFullTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursStartTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime" );
  }


  public final void setBusinessHoursStartTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursStartTime getBusinessHoursStartTime_elem() {
    return (xsd.acord.BusinessHoursStartTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime_elem" );
  }


  public final void setBusinessHoursStartTime_elem( xsd.acord.BusinessHoursStartTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursStartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlTime getBusinessHoursCloseTime() {
    return (gw.xml.date.XmlTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime" );
  }


  public final void setBusinessHoursCloseTime( gw.xml.date.XmlTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessHoursCloseTime getBusinessHoursCloseTime_elem() {
    return (xsd.acord.BusinessHoursCloseTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime_elem" );
  }


  public final void setBusinessHoursCloseTime_elem( xsd.acord.BusinessHoursCloseTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessHoursCloseTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLosses() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLosses" );
  }


  public final void setNumLosses( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLosses", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLosses getNumLosses_elem() {
    return (xsd.acord.NumLosses) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLosses_elem" );
  }


  public final void setNumLosses_elem( xsd.acord.NumLosses value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLosses_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLossesYrs() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLossesYrs" );
  }


  public final void setNumLossesYrs( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLossesYrs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLossesYrs getNumLossesYrs_elem() {
    return (xsd.acord.NumLossesYrs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLossesYrs_elem" );
  }


  public final void setNumLossesYrs_elem( xsd.acord.NumLossesYrs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLossesYrs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBusinessDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessDesc" );
  }


  public final void setBusinessDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessDesc getBusinessDesc_elem() {
    return (xsd.acord.BusinessDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessDesc_elem" );
  }


  public final void setBusinessDesc_elem( xsd.acord.BusinessDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TaxIdentity> getTaxIdentity() {
    return (java.util.List<xsd.acord.TaxIdentity>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxIdentity" );
  }


  public final void setTaxIdentity( java.util.List<xsd.acord.TaxIdentity> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxIdentity", value );
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
  public final java.util.List<xsd.acord.SupplementaryNameInfo> getSupplementaryNameInfo() {
    return (java.util.List<xsd.acord.SupplementaryNameInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupplementaryNameInfo" );
  }


  public final void setSupplementaryNameInfo( java.util.List<xsd.acord.SupplementaryNameInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupplementaryNameInfo", value );
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
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
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
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubLocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getInspectionContactRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InspectionContactRef" );
  }


  public final void setInspectionContactRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InspectionContactRef", value );
  }
}

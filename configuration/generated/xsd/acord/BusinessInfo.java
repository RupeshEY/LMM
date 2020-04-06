/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BusinessInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BusinessInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SICCd = new javax.xml.namespace.QName( "", "SICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICSCd = new javax.xml.namespace.QName( "", "NAICSCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralLiabilityCd = new javax.xml.namespace.QName( "", "GeneralLiabilityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxExemptStatusInd = new javax.xml.namespace.QName( "", "TaxExemptStatusInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NatureBusinessCd = new javax.xml.namespace.QName( "", "NatureBusinessCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesFullTime = new javax.xml.namespace.QName( "", "NumEmployeesFullTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesPartTime = new javax.xml.namespace.QName( "", "NumEmployeesPartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDomesticLocations = new javax.xml.namespace.QName( "", "NumDomesticLocations", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumForeignLocations = new javax.xml.namespace.QName( "", "NumForeignLocations", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NCCIIDNumber = new javax.xml.namespace.QName( "", "NCCIIDNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMembersManagers = new javax.xml.namespace.QName( "", "NumMembersManagers", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActiveInd = new javax.xml.namespace.QName( "", "ActiveInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessStartDt = new javax.xml.namespace.QName( "", "BusinessStartDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OwnedPct = new javax.xml.namespace.QName( "", "OwnedPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumOwners = new javax.xml.namespace.QName( "", "NumOwners", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_USBasedOperationsInd = new javax.xml.namespace.QName( "", "USBasedOperationsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlParentOrSubsidiaryInfo = new javax.xml.namespace.QName( "", "CommlParentOrSubsidiaryInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FinancialStatementInfo = new javax.xml.namespace.QName( "", "FinancialStatementInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BusinessInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BusinessInfo_Type" );
    }
  };

  public BusinessInfo() {
    super( -1644029950, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BusinessInfo_Type() );
  }

  public BusinessInfo( xsd.acord.types.complex.BusinessInfo_Type typeInstance ) {
    super( -1644029950, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BusinessInfo( gw.internal.xml.XmlElementState state ) {
    super( -1644029950, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BusinessInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BusinessInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BusinessInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BusinessInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BusinessInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BusinessInfo.class );
  }

  public static xsd.acord.BusinessInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BusinessInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSICCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SICCd" );
  }


  public final void setSICCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SICCd getSICCd_elem() {
    return (xsd.acord.SICCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SICCd_elem" );
  }


  public final void setSICCd_elem( xsd.acord.SICCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SICCd_elem", value );
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
  public final java.lang.Boolean getTaxExemptStatusInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxExemptStatusInd" );
  }


  public final void setTaxExemptStatusInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxExemptStatusInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TaxExemptStatusInd getTaxExemptStatusInd_elem() {
    return (xsd.acord.TaxExemptStatusInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxExemptStatusInd_elem" );
  }


  public final void setTaxExemptStatusInd_elem( xsd.acord.TaxExemptStatusInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxExemptStatusInd_elem", value );
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
  public final java.lang.Integer getNumEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployees" );
  }


  public final void setNumEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployees getNumEmployees_elem() {
    return (xsd.acord.NumEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployees_elem" );
  }


  public final void setNumEmployees_elem( xsd.acord.NumEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployees_elem", value );
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
  public final java.lang.Integer getNumDomesticLocations() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDomesticLocations" );
  }


  public final void setNumDomesticLocations( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDomesticLocations", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDomesticLocations getNumDomesticLocations_elem() {
    return (xsd.acord.NumDomesticLocations) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDomesticLocations_elem" );
  }


  public final void setNumDomesticLocations_elem( xsd.acord.NumDomesticLocations value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDomesticLocations_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumForeignLocations() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumForeignLocations" );
  }


  public final void setNumForeignLocations( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumForeignLocations", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumForeignLocations getNumForeignLocations_elem() {
    return (xsd.acord.NumForeignLocations) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumForeignLocations_elem" );
  }


  public final void setNumForeignLocations_elem( xsd.acord.NumForeignLocations value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumForeignLocations_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNCCIIDNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NCCIIDNumber" );
  }


  public final void setNCCIIDNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NCCIIDNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NCCIIDNumber getNCCIIDNumber_elem() {
    return (xsd.acord.NCCIIDNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NCCIIDNumber_elem" );
  }


  public final void setNCCIIDNumber_elem( xsd.acord.NCCIIDNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NCCIIDNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumMembersManagers() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMembersManagers" );
  }


  public final void setNumMembersManagers( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMembersManagers", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumMembersManagers getNumMembersManagers_elem() {
    return (xsd.acord.NumMembersManagers) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumMembersManagers_elem" );
  }


  public final void setNumMembersManagers_elem( xsd.acord.NumMembersManagers value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumMembersManagers_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getActiveInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActiveInd" );
  }


  public final void setActiveInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActiveInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ActiveInd getActiveInd_elem() {
    return (xsd.acord.ActiveInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActiveInd_elem" );
  }


  public final void setActiveInd_elem( xsd.acord.ActiveInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActiveInd_elem", value );
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
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getOwnedPct() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OwnedPct" );
  }


  public final void setOwnedPct( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OwnedPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OwnedPct getOwnedPct_elem() {
    return (xsd.acord.OwnedPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OwnedPct_elem" );
  }


  public final void setOwnedPct_elem( xsd.acord.OwnedPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OwnedPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumOwners() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOwners" );
  }


  public final void setNumOwners( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOwners", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumOwners getNumOwners_elem() {
    return (xsd.acord.NumOwners) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOwners_elem" );
  }


  public final void setNumOwners_elem( xsd.acord.NumOwners value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOwners_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getUSBasedOperationsInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_USBasedOperationsInd" );
  }


  public final void setUSBasedOperationsInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_USBasedOperationsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.USBasedOperationsInd getUSBasedOperationsInd_elem() {
    return (xsd.acord.USBasedOperationsInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_USBasedOperationsInd_elem" );
  }


  public final void setUSBasedOperationsInd_elem( xsd.acord.USBasedOperationsInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_USBasedOperationsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo> getCommlParentOrSubsidiaryInfo() {
    return (java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlParentOrSubsidiaryInfo" );
  }


  public final void setCommlParentOrSubsidiaryInfo( java.util.List<xsd.acord.CommlParentOrSubsidiaryInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlParentOrSubsidiaryInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FinancialStatementInfo> getFinancialStatementInfo() {
    return (java.util.List<xsd.acord.FinancialStatementInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FinancialStatementInfo" );
  }


  public final void setFinancialStatementInfo( java.util.List<xsd.acord.FinancialStatementInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FinancialStatementInfo", value );
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
/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommlParentOrSubsidiaryInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlParentOrSubsidiaryInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICSCd = new javax.xml.namespace.QName( "", "NAICSCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NatureBusinessCd = new javax.xml.namespace.QName( "", "NatureBusinessCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SICCd = new javax.xml.namespace.QName( "", "SICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumYrsInBusiness = new javax.xml.namespace.QName( "", "NumYrsInBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RevenuePct = new javax.xml.namespace.QName( "", "RevenuePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JurisdictionIncorporation = new javax.xml.namespace.QName( "", "JurisdictionIncorporation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubsidiarysAdditionalOwnership = new javax.xml.namespace.QName( "", "SubsidiarysAdditionalOwnership", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OwnedPct = new javax.xml.namespace.QName( "", "OwnedPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubsidiaryAcquiredOrCreatedDt = new javax.xml.namespace.QName( "", "SubsidiaryAcquiredOrCreatedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessStartDt = new javax.xml.namespace.QName( "", "BusinessStartDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessEndDt = new javax.xml.namespace.QName( "", "BusinessEndDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherOrPriorPolicy = new javax.xml.namespace.QName( "", "OtherOrPriorPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPayrollAmt = new javax.xml.namespace.QName( "", "TotalPayrollAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualGrossReceiptsAmt = new javax.xml.namespace.QName( "", "AnnualGrossReceiptsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ForeignGrossSalesAmt = new javax.xml.namespace.QName( "", "ForeignGrossSalesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RelationshipDesc = new javax.xml.namespace.QName( "", "RelationshipDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommlParentOrSubsidiaryInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type" );
    }
  };

  public CommlParentOrSubsidiaryInfo() {
    super( -1027409452, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type() );
  }

  public CommlParentOrSubsidiaryInfo( xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type typeInstance ) {
    super( -1027409452, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommlParentOrSubsidiaryInfo( gw.internal.xml.XmlElementState state ) {
    super( -1027409452, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommlParentOrSubsidiaryInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommlParentOrSubsidiaryInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }

  public static xsd.acord.CommlParentOrSubsidiaryInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommlParentOrSubsidiaryInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
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
  public final java.lang.Integer getNumYrsInBusiness() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumYrsInBusiness" );
  }


  public final void setNumYrsInBusiness( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumYrsInBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumYrsInBusiness getNumYrsInBusiness_elem() {
    return (xsd.acord.NumYrsInBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumYrsInBusiness_elem" );
  }


  public final void setNumYrsInBusiness_elem( xsd.acord.NumYrsInBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumYrsInBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getRevenuePct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RevenuePct" );
  }


  public final void setRevenuePct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RevenuePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RevenuePct getRevenuePct_elem() {
    return (xsd.acord.RevenuePct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RevenuePct_elem" );
  }


  public final void setRevenuePct_elem( xsd.acord.RevenuePct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RevenuePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJurisdictionIncorporation() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JurisdictionIncorporation" );
  }


  public final void setJurisdictionIncorporation( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JurisdictionIncorporation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JurisdictionIncorporation getJurisdictionIncorporation_elem() {
    return (xsd.acord.JurisdictionIncorporation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JurisdictionIncorporation_elem" );
  }


  public final void setJurisdictionIncorporation_elem( xsd.acord.JurisdictionIncorporation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JurisdictionIncorporation_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getSubsidiarysAdditionalOwnership() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubsidiarysAdditionalOwnership" );
  }


  public final void setSubsidiarysAdditionalOwnership( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubsidiarysAdditionalOwnership", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SubsidiarysAdditionalOwnership> getSubsidiarysAdditionalOwnership_elem() {
    return (java.util.List<xsd.acord.SubsidiarysAdditionalOwnership>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubsidiarysAdditionalOwnership_elem" );
  }


  public final void setSubsidiarysAdditionalOwnership_elem( java.util.List<xsd.acord.SubsidiarysAdditionalOwnership> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubsidiarysAdditionalOwnership_elem", value );
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
  public final java.lang.String getSubsidiaryAcquiredOrCreatedDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubsidiaryAcquiredOrCreatedDt" );
  }


  public final void setSubsidiaryAcquiredOrCreatedDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubsidiaryAcquiredOrCreatedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubsidiaryAcquiredOrCreatedDt getSubsidiaryAcquiredOrCreatedDt_elem() {
    return (xsd.acord.SubsidiaryAcquiredOrCreatedDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubsidiaryAcquiredOrCreatedDt_elem" );
  }


  public final void setSubsidiaryAcquiredOrCreatedDt_elem( xsd.acord.SubsidiaryAcquiredOrCreatedDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubsidiaryAcquiredOrCreatedDt_elem", value );
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
  public final java.lang.String getBusinessEndDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessEndDt" );
  }


  public final void setBusinessEndDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessEndDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessEndDt getBusinessEndDt_elem() {
    return (xsd.acord.BusinessEndDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessEndDt_elem" );
  }


  public final void setBusinessEndDt_elem( xsd.acord.BusinessEndDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessEndDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.OtherOrPriorPolicy> getOtherOrPriorPolicy() {
    return (java.util.List<xsd.acord.OtherOrPriorPolicy>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicy" );
  }


  public final void setOtherOrPriorPolicy( java.util.List<xsd.acord.OtherOrPriorPolicy> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicy", value );
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
  public final xsd.acord.TotalPayrollAmt getTotalPayrollAmt() {
    return (xsd.acord.TotalPayrollAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalPayrollAmt" );
  }


  public final void setTotalPayrollAmt( xsd.acord.TotalPayrollAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalPayrollAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualGrossReceiptsAmt getAnnualGrossReceiptsAmt() {
    return (xsd.acord.AnnualGrossReceiptsAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualGrossReceiptsAmt" );
  }


  public final void setAnnualGrossReceiptsAmt( xsd.acord.AnnualGrossReceiptsAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualGrossReceiptsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ForeignGrossSalesAmt getForeignGrossSalesAmt() {
    return (xsd.acord.ForeignGrossSalesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ForeignGrossSalesAmt" );
  }


  public final void setForeignGrossSalesAmt( xsd.acord.ForeignGrossSalesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ForeignGrossSalesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRelationshipDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RelationshipDesc" );
  }


  public final void setRelationshipDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RelationshipDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RelationshipDesc getRelationshipDesc_elem() {
    return (xsd.acord.RelationshipDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RelationshipDesc_elem" );
  }


  public final void setRelationshipDesc_elem( xsd.acord.RelationshipDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RelationshipDesc_elem", value );
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

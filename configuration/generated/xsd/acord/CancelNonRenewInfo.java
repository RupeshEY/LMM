/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CancelNonRenewInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CancelNonRenewInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessPurposeTypeCd = new javax.xml.namespace.QName( "", "BusinessPurposeTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RequestorCd = new javax.xml.namespace.QName( "", "RequestorCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancelReasonCd = new javax.xml.namespace.QName( "", "CancelReasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancelEvidenceObtainedCd = new javax.xml.namespace.QName( "", "CancelEvidenceObtainedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancellationTypeCd = new javax.xml.namespace.QName( "", "CancellationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CancellationMailedToEmployerDt = new javax.xml.namespace.QName( "", "CancellationMailedToEmployerDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubjectToAuditInd = new javax.xml.namespace.QName( "", "SubjectToAuditInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnearnedFactor = new javax.xml.namespace.QName( "", "UnearnedFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubjectToMinPremInd = new javax.xml.namespace.QName( "", "SubjectToMinPremInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyPaidToDt = new javax.xml.namespace.QName( "", "PolicyPaidToDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NFSActivityInd = new javax.xml.namespace.QName( "", "NFSActivityInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancelLegal = new javax.xml.namespace.QName( "", "NumDaysCancelLegal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancelMail = new javax.xml.namespace.QName( "", "NumDaysCancelMail", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancel = new javax.xml.namespace.QName( "", "NumDaysCancel", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CancelNonRenewInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CancelNonRenewInfo_Type" );
    }
  };

  public CancelNonRenewInfo() {
    super( -635980644, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CancelNonRenewInfo_Type() );
  }

  public CancelNonRenewInfo( xsd.acord.types.complex.CancelNonRenewInfo_Type typeInstance ) {
    super( -635980644, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CancelNonRenewInfo( gw.internal.xml.XmlElementState state ) {
    super( -635980644, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CancelNonRenewInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CancelNonRenewInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CancelNonRenewInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CancelNonRenewInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CancelNonRenewInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CancelNonRenewInfo.class );
  }

  public static xsd.acord.CancelNonRenewInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CancelNonRenewInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CycleBusinessPurpose getBusinessPurposeTypeCd() {
    return (xsd.acord.enums.CycleBusinessPurpose) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessPurposeTypeCd" );
  }


  public final void setBusinessPurposeTypeCd( xsd.acord.enums.CycleBusinessPurpose value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessPurposeTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessPurposeTypeCd getBusinessPurposeTypeCd_elem() {
    return (xsd.acord.BusinessPurposeTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessPurposeTypeCd_elem" );
  }


  public final void setBusinessPurposeTypeCd_elem( xsd.acord.BusinessPurposeTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessPurposeTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RequestorType getRequestorCd() {
    return (xsd.acord.enums.RequestorType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RequestorCd" );
  }


  public final void setRequestorCd( xsd.acord.enums.RequestorType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RequestorCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RequestorCd getRequestorCd_elem() {
    return (xsd.acord.RequestorCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RequestorCd_elem" );
  }


  public final void setRequestorCd_elem( xsd.acord.RequestorCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RequestorCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CancellationReason getCancelReasonCd() {
    return (xsd.acord.enums.CancellationReason) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancelReasonCd" );
  }


  public final void setCancelReasonCd( xsd.acord.enums.CancellationReason value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancelReasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancelReasonCd getCancelReasonCd_elem() {
    return (xsd.acord.CancelReasonCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancelReasonCd_elem" );
  }


  public final void setCancelReasonCd_elem( xsd.acord.CancelReasonCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancelReasonCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CancelEvidenceObtained getCancelEvidenceObtainedCd() {
    return (xsd.acord.enums.CancelEvidenceObtained) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancelEvidenceObtainedCd" );
  }


  public final void setCancelEvidenceObtainedCd( xsd.acord.enums.CancelEvidenceObtained value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancelEvidenceObtainedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancelEvidenceObtainedCd getCancelEvidenceObtainedCd_elem() {
    return (xsd.acord.CancelEvidenceObtainedCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancelEvidenceObtainedCd_elem" );
  }


  public final void setCancelEvidenceObtainedCd_elem( xsd.acord.CancelEvidenceObtainedCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancelEvidenceObtainedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CancellationType getCancellationTypeCd() {
    return (xsd.acord.enums.CancellationType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancellationTypeCd" );
  }


  public final void setCancellationTypeCd( xsd.acord.enums.CancellationType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancellationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancellationTypeCd getCancellationTypeCd_elem() {
    return (xsd.acord.CancellationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancellationTypeCd_elem" );
  }


  public final void setCancellationTypeCd_elem( xsd.acord.CancellationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancellationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCancellationMailedToEmployerDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancellationMailedToEmployerDt" );
  }


  public final void setCancellationMailedToEmployerDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancellationMailedToEmployerDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CancellationMailedToEmployerDt getCancellationMailedToEmployerDt_elem() {
    return (xsd.acord.CancellationMailedToEmployerDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CancellationMailedToEmployerDt_elem" );
  }


  public final void setCancellationMailedToEmployerDt_elem( xsd.acord.CancellationMailedToEmployerDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CancellationMailedToEmployerDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSubjectToAuditInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectToAuditInd" );
  }


  public final void setSubjectToAuditInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectToAuditInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubjectToAuditInd getSubjectToAuditInd_elem() {
    return (xsd.acord.SubjectToAuditInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectToAuditInd_elem" );
  }


  public final void setSubjectToAuditInd_elem( xsd.acord.SubjectToAuditInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectToAuditInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getUnearnedFactor() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnearnedFactor" );
  }


  public final void setUnearnedFactor( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnearnedFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnearnedFactor getUnearnedFactor_elem() {
    return (xsd.acord.UnearnedFactor) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnearnedFactor_elem" );
  }


  public final void setUnearnedFactor_elem( xsd.acord.UnearnedFactor value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnearnedFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSubjectToMinPremInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectToMinPremInd" );
  }


  public final void setSubjectToMinPremInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectToMinPremInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubjectToMinPremInd getSubjectToMinPremInd_elem() {
    return (xsd.acord.SubjectToMinPremInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectToMinPremInd_elem" );
  }


  public final void setSubjectToMinPremInd_elem( xsd.acord.SubjectToMinPremInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectToMinPremInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyPaidToDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyPaidToDt" );
  }


  public final void setPolicyPaidToDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyPaidToDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyPaidToDt getPolicyPaidToDt_elem() {
    return (xsd.acord.PolicyPaidToDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyPaidToDt_elem" );
  }


  public final void setPolicyPaidToDt_elem( xsd.acord.PolicyPaidToDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyPaidToDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNFSActivityInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NFSActivityInd" );
  }


  public final void setNFSActivityInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NFSActivityInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NFSActivityInd getNFSActivityInd_elem() {
    return (xsd.acord.NFSActivityInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NFSActivityInd_elem" );
  }


  public final void setNFSActivityInd_elem( xsd.acord.NFSActivityInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NFSActivityInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancelLegal() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancelLegal" );
  }


  public final void setNumDaysCancelLegal( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancelLegal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancelLegal getNumDaysCancelLegal_elem() {
    return (xsd.acord.NumDaysCancelLegal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancelLegal_elem" );
  }


  public final void setNumDaysCancelLegal_elem( xsd.acord.NumDaysCancelLegal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancelLegal_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancelMail() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancelMail" );
  }


  public final void setNumDaysCancelMail( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancelMail", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancelMail getNumDaysCancelMail_elem() {
    return (xsd.acord.NumDaysCancelMail) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancelMail_elem" );
  }


  public final void setNumDaysCancelMail_elem( xsd.acord.NumDaysCancelMail value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancelMail_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancel() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancel" );
  }


  public final void setNumDaysCancel( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancel getNumDaysCancel_elem() {
    return (xsd.acord.NumDaysCancel) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumDaysCancel_elem" );
  }


  public final void setNumDaysCancel_elem( xsd.acord.NumDaysCancel value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumDaysCancel_elem", value );
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
/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1 extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_CovInfo1", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CMSIncidentDt = new javax.xml.namespace.QName( "", "com.iso_CMSIncidentDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_NFLTLimit = new javax.xml.namespace.QName( "", "com.iso_NFLTLimit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ExhaustDt = new javax.xml.namespace.QName( "", "com.iso_ExhaustDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ORMInd = new javax.xml.namespace.QName( "", "com.iso_ORMInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ORMDt = new javax.xml.namespace.QName( "", "com.iso_ORMDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TPOCDt = new javax.xml.namespace.QName( "", "com.iso_TPOCDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TPOCAmt = new javax.xml.namespace.QName( "", "com.iso_TPOCAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_TPOCStartDt = new javax.xml.namespace.QName( "", "com.iso_TPOCStartDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ICDDiagnosticCd = new javax.xml.namespace.QName( "", "ICDDiagnosticCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ICD10Cd = new javax.xml.namespace.QName( "", "com.iso_ICD10Cd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InjuryNatureDesc = new javax.xml.namespace.QName( "", "InjuryNatureDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CauseofInjuryCd = new javax.xml.namespace.QName( "", "com.iso_CauseofInjuryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_DeleteFromCMS = new javax.xml.namespace.QName( "", "com.iso_DeleteFromCMS", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_NotSendCovCMS = new javax.xml.namespace.QName( "", "com.iso_NotSendCovCMS", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ItemRef = new javax.xml.namespace.QName( "", "ItemRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1" );
    }
  };

  public ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1() {
    super( 1446603436, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1() );
  }

  public ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1( xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1 typeInstance ) {
    super( 1446603436, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1( gw.internal.xml.XmlElementState state ) {
    super( 1446603436, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1 get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1 typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CMSIncidentDt getComIso_CMSIncidentDt() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CMSIncidentDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CMSIncidentDt" );
  }


  public final void setComIso_CMSIncidentDt( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CMSIncidentDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CMSIncidentDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_Addr getAddr() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_Addr) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Addr" );
  }


  public final void setAddr( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_Addr value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Addr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NFLTLimit getComIso_NFLTLimit() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NFLTLimit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_NFLTLimit" );
  }


  public final void setComIso_NFLTLimit( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NFLTLimit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_NFLTLimit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ExhaustDt getComIso_ExhaustDt() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ExhaustDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_ExhaustDt" );
  }


  public final void setComIso_ExhaustDt( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ExhaustDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_ExhaustDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMInd getComIso_ORMInd() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_ORMInd" );
  }


  public final void setComIso_ORMInd( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_ORMInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMDt getComIso_ORMDt() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_ORMDt" );
  }


  public final void setComIso_ORMDt( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ORMDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_ORMDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt> getComIso_TPOCDt() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TPOCDt" );
  }


  public final void setComIso_TPOCDt( java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCDt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TPOCDt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCAmt> getComIso_TPOCAmt() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCAmt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TPOCAmt" );
  }


  public final void setComIso_TPOCAmt( java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCAmt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TPOCAmt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCStartDt> getComIso_TPOCStartDt() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCStartDt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_TPOCStartDt" );
  }


  public final void setComIso_TPOCStartDt( java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_TPOCStartDt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_TPOCStartDt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ICDDiagnosticCd> getICDDiagnosticCd() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ICDDiagnosticCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd" );
  }


  public final void setICDDiagnosticCd( java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ICDDiagnosticCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ICDDiagnosticCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ICD10Cd> getComIso_ICD10Cd() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ICD10Cd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_ICD10Cd" );
  }


  public final void setComIso_ICD10Cd( java.util.List<xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_ICD10Cd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_ICD10Cd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc getInjuryNatureDesc() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InjuryNatureDesc" );
  }


  public final void setInjuryNatureDesc( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_InjuryNatureDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InjuryNatureDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CauseofInjuryCd getComIso_CauseofInjuryCd() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CauseofInjuryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CauseofInjuryCd" );
  }


  public final void setComIso_CauseofInjuryCd( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_CauseofInjuryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CauseofInjuryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_DeleteFromCMS getComIso_DeleteFromCMS() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_DeleteFromCMS) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_DeleteFromCMS" );
  }


  public final void setComIso_DeleteFromCMS( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_DeleteFromCMS value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_DeleteFromCMS", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NotSendCovCMS getComIso_NotSendCovCMS() {
    return (xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NotSendCovCMS) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_NotSendCovCMS" );
  }


  public final void setComIso_NotSendCovCMS( xsd.iso.req.anonymous.elements.ClaimInvestigationAddRs_ComIso_AddCovInfo_ComIso_CovInfo1_ComIso_NotSendCovCMS value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_NotSendCovCMS", value );
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
  public final gw.xml.XmlElement getItemRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemRef" );
  }


  public final void setItemRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemRef", value );
  }
}
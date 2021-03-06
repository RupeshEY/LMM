/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SelfInsuredWorkCompBond extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SelfInsuredWorkCompBond", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LongTermDisabilityReservesAmt = new javax.xml.namespace.QName( "", "LongTermDisabilityReservesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcessWorkCompAggregateStopLossProvisionInd = new javax.xml.namespace.QName( "", "ExcessWorkCompAggregateStopLossProvisionInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcessWorkCompInsurer = new javax.xml.namespace.QName( "", "ExcessWorkCompInsurer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcessWorkCompDeductible = new javax.xml.namespace.QName( "", "ExcessWorkCompDeductible", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcessWorkCompInsuranceInd = new javax.xml.namespace.QName( "", "ExcessWorkCompInsuranceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcessWorkCompLimits = new javax.xml.namespace.QName( "", "ExcessWorkCompLimits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoReservesEstablishedInd = new javax.xml.namespace.QName( "", "NoReservesEstablishedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReserveFundingStatusCd = new javax.xml.namespace.QName( "", "ReserveFundingStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReservesStatusInFinancialStatementsCd = new javax.xml.namespace.QName( "", "ReservesStatusInFinancialStatementsCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StopLossAmt = new javax.xml.namespace.QName( "", "StopLossAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalClaimsAmt = new javax.xml.namespace.QName( "", "TotalClaimsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIndemnityPaidAmt = new javax.xml.namespace.QName( "", "TotalIndemnityPaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalIndemnityReservedAmt = new javax.xml.namespace.QName( "", "TotalIndemnityReservedAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalMedicalPaidAmt = new javax.xml.namespace.QName( "", "TotalMedicalPaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalMedicalReservedAmt = new javax.xml.namespace.QName( "", "TotalMedicalReservedAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumTotalClaims = new javax.xml.namespace.QName( "", "NumTotalClaims", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumTotalOpenClaims = new javax.xml.namespace.QName( "", "NumTotalOpenClaims", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SelfInsuredWorkCompBond" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SelfInsuredWorkCompBond_Type" );
    }
  };

  public SelfInsuredWorkCompBond() {
    super( 441537485, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SelfInsuredWorkCompBond_Type() );
  }

  public SelfInsuredWorkCompBond( xsd.acord.types.complex.SelfInsuredWorkCompBond_Type typeInstance ) {
    super( 441537485, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SelfInsuredWorkCompBond( gw.internal.xml.XmlElementState state ) {
    super( 441537485, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SelfInsuredWorkCompBond> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SelfInsuredWorkCompBond_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SelfInsuredWorkCompBond_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SelfInsuredWorkCompBond_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }

  public static xsd.acord.SelfInsuredWorkCompBond parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SelfInsuredWorkCompBond.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LongTermDisabilityReservesAmt getLongTermDisabilityReservesAmt() {
    return (xsd.acord.LongTermDisabilityReservesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LongTermDisabilityReservesAmt" );
  }


  public final void setLongTermDisabilityReservesAmt( xsd.acord.LongTermDisabilityReservesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LongTermDisabilityReservesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcessWorkCompAggregateStopLossProvisionInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompAggregateStopLossProvisionInd" );
  }


  public final void setExcessWorkCompAggregateStopLossProvisionInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompAggregateStopLossProvisionInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcessWorkCompAggregateStopLossProvisionInd getExcessWorkCompAggregateStopLossProvisionInd_elem() {
    return (xsd.acord.ExcessWorkCompAggregateStopLossProvisionInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompAggregateStopLossProvisionInd_elem" );
  }


  public final void setExcessWorkCompAggregateStopLossProvisionInd_elem( xsd.acord.ExcessWorkCompAggregateStopLossProvisionInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompAggregateStopLossProvisionInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExcessWorkCompInsurer() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsurer" );
  }


  public final void setExcessWorkCompInsurer( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsurer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcessWorkCompInsurer getExcessWorkCompInsurer_elem() {
    return (xsd.acord.ExcessWorkCompInsurer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsurer_elem" );
  }


  public final void setExcessWorkCompInsurer_elem( xsd.acord.ExcessWorkCompInsurer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsurer_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcessWorkCompDeductible getExcessWorkCompDeductible() {
    return (xsd.acord.ExcessWorkCompDeductible) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompDeductible" );
  }


  public final void setExcessWorkCompDeductible( xsd.acord.ExcessWorkCompDeductible value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompDeductible", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcessWorkCompInsuranceInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsuranceInd" );
  }


  public final void setExcessWorkCompInsuranceInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsuranceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcessWorkCompInsuranceInd getExcessWorkCompInsuranceInd_elem() {
    return (xsd.acord.ExcessWorkCompInsuranceInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsuranceInd_elem" );
  }


  public final void setExcessWorkCompInsuranceInd_elem( xsd.acord.ExcessWorkCompInsuranceInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompInsuranceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExcessWorkCompLimits getExcessWorkCompLimits() {
    return (xsd.acord.ExcessWorkCompLimits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcessWorkCompLimits" );
  }


  public final void setExcessWorkCompLimits( xsd.acord.ExcessWorkCompLimits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcessWorkCompLimits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNoReservesEstablishedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoReservesEstablishedInd" );
  }


  public final void setNoReservesEstablishedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoReservesEstablishedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NoReservesEstablishedInd getNoReservesEstablishedInd_elem() {
    return (xsd.acord.NoReservesEstablishedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoReservesEstablishedInd_elem" );
  }


  public final void setNoReservesEstablishedInd_elem( xsd.acord.NoReservesEstablishedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoReservesEstablishedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReserveFundingStatus getReserveFundingStatusCd() {
    return (xsd.acord.enums.ReserveFundingStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReserveFundingStatusCd" );
  }


  public final void setReserveFundingStatusCd( xsd.acord.enums.ReserveFundingStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReserveFundingStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReserveFundingStatusCd getReserveFundingStatusCd_elem() {
    return (xsd.acord.ReserveFundingStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReserveFundingStatusCd_elem" );
  }


  public final void setReserveFundingStatusCd_elem( xsd.acord.ReserveFundingStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReserveFundingStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReservesStatusInFinancialStatements getReservesStatusInFinancialStatementsCd() {
    return (xsd.acord.enums.ReservesStatusInFinancialStatements) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReservesStatusInFinancialStatementsCd" );
  }


  public final void setReservesStatusInFinancialStatementsCd( xsd.acord.enums.ReservesStatusInFinancialStatements value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReservesStatusInFinancialStatementsCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReservesStatusInFinancialStatementsCd getReservesStatusInFinancialStatementsCd_elem() {
    return (xsd.acord.ReservesStatusInFinancialStatementsCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReservesStatusInFinancialStatementsCd_elem" );
  }


  public final void setReservesStatusInFinancialStatementsCd_elem( xsd.acord.ReservesStatusInFinancialStatementsCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReservesStatusInFinancialStatementsCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StopLossAmt getStopLossAmt() {
    return (xsd.acord.StopLossAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StopLossAmt" );
  }


  public final void setStopLossAmt( xsd.acord.StopLossAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StopLossAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalClaimsAmt getTotalClaimsAmt() {
    return (xsd.acord.TotalClaimsAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalClaimsAmt" );
  }


  public final void setTotalClaimsAmt( xsd.acord.TotalClaimsAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalClaimsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalIndemnityPaidAmt getTotalIndemnityPaidAmt() {
    return (xsd.acord.TotalIndemnityPaidAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIndemnityPaidAmt" );
  }


  public final void setTotalIndemnityPaidAmt( xsd.acord.TotalIndemnityPaidAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIndemnityPaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalIndemnityReservedAmt getTotalIndemnityReservedAmt() {
    return (xsd.acord.TotalIndemnityReservedAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalIndemnityReservedAmt" );
  }


  public final void setTotalIndemnityReservedAmt( xsd.acord.TotalIndemnityReservedAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalIndemnityReservedAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalMedicalPaidAmt getTotalMedicalPaidAmt() {
    return (xsd.acord.TotalMedicalPaidAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalMedicalPaidAmt" );
  }


  public final void setTotalMedicalPaidAmt( xsd.acord.TotalMedicalPaidAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalMedicalPaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalMedicalReservedAmt getTotalMedicalReservedAmt() {
    return (xsd.acord.TotalMedicalReservedAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalMedicalReservedAmt" );
  }


  public final void setTotalMedicalReservedAmt( xsd.acord.TotalMedicalReservedAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalMedicalReservedAmt", value );
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
  public final java.lang.Integer getNumTotalClaims() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalClaims" );
  }


  public final void setNumTotalClaims( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalClaims", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumTotalClaims getNumTotalClaims_elem() {
    return (xsd.acord.NumTotalClaims) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalClaims_elem" );
  }


  public final void setNumTotalClaims_elem( xsd.acord.NumTotalClaims value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalClaims_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumTotalOpenClaims() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalOpenClaims" );
  }


  public final void setNumTotalOpenClaims( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalOpenClaims", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumTotalOpenClaims getNumTotalOpenClaims_elem() {
    return (xsd.acord.NumTotalOpenClaims) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTotalOpenClaims_elem" );
  }


  public final void setNumTotalOpenClaims_elem( xsd.acord.NumTotalOpenClaims value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTotalOpenClaims_elem", value );
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

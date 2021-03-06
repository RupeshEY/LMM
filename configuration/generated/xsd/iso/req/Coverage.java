/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Coverage extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Coverage", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IterationNumber = new javax.xml.namespace.QName( "", "IterationNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageDesc = new javax.xml.namespace.QName( "", "CoverageDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Deductible = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Option = new javax.xml.namespace.QName( "", "Option", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurrentTermAmt = new javax.xml.namespace.QName( "", "CurrentTermAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDt = new javax.xml.namespace.QName( "", "EffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDt = new javax.xml.namespace.QName( "", "ExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Form = new javax.xml.namespace.QName( "", "Form", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.Coverage" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.Coverage" );
    }
  };

  public Coverage() {
    super( 2129843878, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.Coverage() );
  }

  public Coverage( xsd.iso.req.anonymous.types.complex.Coverage typeInstance ) {
    super( 2129843878, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Coverage( gw.internal.xml.XmlElementState state ) {
    super( 2129843878, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.Coverage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.Coverage get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.Coverage.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.Coverage typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.Coverage parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.Coverage.class );
  }

  public static xsd.iso.req.Coverage parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.Coverage.class );
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
  public final java.lang.String getCoverageCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageCd" );
  }


  public final void setCoverageCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageCd getCoverageCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIterationNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber" );
  }


  public final void setIterationNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IterationNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_IterationNumber getIterationNumber_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_IterationNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IterationNumber_elem" );
  }


  public final void setIterationNumber_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_IterationNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IterationNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageDesc" );
  }


  public final void setCoverageDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageDesc getCoverageDesc_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageDesc_elem" );
  }


  public final void setCoverageDesc_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_CoverageDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Limit> getLimit() {
    return (java.util.List<xsd.iso.req.Limit>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Limit" );
  }


  public final void setLimit( java.util.List<xsd.iso.req.Limit> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Limit", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Deductible> getDeductible() {
    return (java.util.List<xsd.iso.req.Deductible>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Deductible" );
  }


  public final void setDeductible( java.util.List<xsd.iso.req.Deductible> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Deductible", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Option> getOption() {
    return (java.util.List<xsd.iso.req.Option>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Option" );
  }


  public final void setOption( java.util.List<xsd.iso.req.Option> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Option", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_CurrentTermAmt getCurrentTermAmt() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_CurrentTermAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CurrentTermAmt" );
  }


  public final void setCurrentTermAmt( xsd.iso.req.anonymous.elements.PCCOVERAGE_CurrentTermAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CurrentTermAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_CreditOrSurcharge>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_CreditOrSurcharge> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getEffectiveDt() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt" );
  }


  public final void setEffectiveDt( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_EffectiveDt> getEffectiveDt_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_EffectiveDt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDt_elem" );
  }


  public final void setEffectiveDt_elem( java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_EffectiveDt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDt_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getExpirationDt() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpirationDt" );
  }


  public final void setExpirationDt( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpirationDt", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_ExpirationDt> getExpirationDt_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_ExpirationDt>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpirationDt_elem" );
  }


  public final void setExpirationDt_elem( java.util.List<xsd.iso.req.anonymous.elements.PCCOVERAGE_ExpirationDt> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpirationDt_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Rate" );
  }


  public final void setRate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Rate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_Rate getRate_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_Rate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Rate_elem" );
  }


  public final void setRate_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_Rate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Rate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPremiumBasisCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumBasisCd" );
  }


  public final void setPremiumBasisCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_PremiumBasisCd getPremiumBasisCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_PremiumBasisCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumBasisCd_elem" );
  }


  public final void setPremiumBasisCd_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_PremiumBasisCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTerritoryCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd" );
  }


  public final void setTerritoryCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCCOVERAGE_TerritoryCd getTerritoryCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCCOVERAGE_TerritoryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.iso.req.anonymous.elements.PCCOVERAGE_TerritoryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Form getForm() {
    return (xsd.iso.req.Form) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Form" );
  }


  public final void setForm( xsd.iso.req.Form value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Form", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.MiscParty> getMiscParty() {
    return (java.util.List<xsd.iso.req.MiscParty>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.iso.req.MiscParty> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
  }

}

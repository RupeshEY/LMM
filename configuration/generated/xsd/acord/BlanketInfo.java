/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BlanketInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BlanketInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketNumber = new javax.xml.namespace.QName( "", "BlanketNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BlanketTypeCd = new javax.xml.namespace.QName( "", "BlanketTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValuationCd = new javax.xml.namespace.QName( "", "ValuationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoinsurancePct = new javax.xml.namespace.QName( "", "CoinsurancePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgreedValueInd = new javax.xml.namespace.QName( "", "AgreedValueInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalInsuredValueAmt = new javax.xml.namespace.QName( "", "TotalInsuredValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Limit = new javax.xml.namespace.QName( "", "Limit", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Deductible = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceToValuePct = new javax.xml.namespace.QName( "", "InsuranceToValuePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerSharePct = new javax.xml.namespace.QName( "", "InsurerSharePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerShareAmt = new javax.xml.namespace.QName( "", "InsurerShareAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BlanketInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BlanketInfo_Type" );
    }
  };

  public BlanketInfo() {
    super( -1817372067, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BlanketInfo_Type() );
  }

  public BlanketInfo( xsd.acord.types.complex.BlanketInfo_Type typeInstance ) {
    super( -1817372067, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BlanketInfo( gw.internal.xml.XmlElementState state ) {
    super( -1817372067, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BlanketInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BlanketInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BlanketInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BlanketInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BlanketInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BlanketInfo.class );
  }

  public static xsd.acord.BlanketInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BlanketInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getBlanketNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber" );
  }


  public final void setBlanketNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BlanketNumber getBlanketNumber_elem() {
    return (xsd.acord.BlanketNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketNumber_elem" );
  }


  public final void setBlanketNumber_elem( xsd.acord.BlanketNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Risk> getBlanketTypeCd() {
    return (java.util.List<xsd.acord.enums.Risk>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketTypeCd" );
  }


  public final void setBlanketTypeCd( java.util.List<xsd.acord.enums.Risk> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BlanketTypeCd> getBlanketTypeCd_elem() {
    return (java.util.List<xsd.acord.BlanketTypeCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BlanketTypeCd_elem" );
  }


  public final void setBlanketTypeCd_elem( java.util.List<xsd.acord.BlanketTypeCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BlanketTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ValuationType getValuationCd() {
    return (xsd.acord.enums.ValuationType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationCd" );
  }


  public final void setValuationCd( xsd.acord.enums.ValuationType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ValuationCd getValuationCd_elem() {
    return (xsd.acord.ValuationCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValuationCd_elem" );
  }


  public final void setValuationCd_elem( xsd.acord.ValuationCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValuationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getCoinsurancePct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoinsurancePct" );
  }


  public final void setCoinsurancePct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoinsurancePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CoinsurancePct getCoinsurancePct_elem() {
    return (xsd.acord.CoinsurancePct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoinsurancePct_elem" );
  }


  public final void setCoinsurancePct_elem( xsd.acord.CoinsurancePct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoinsurancePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAgreedValueInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AgreedValueInd" );
  }


  public final void setAgreedValueInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AgreedValueInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AgreedValueInd getAgreedValueInd_elem() {
    return (xsd.acord.AgreedValueInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AgreedValueInd_elem" );
  }


  public final void setAgreedValueInd_elem( xsd.acord.AgreedValueInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AgreedValueInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalInsuredValueAmt getTotalInsuredValueAmt() {
    return (xsd.acord.TotalInsuredValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalInsuredValueAmt" );
  }


  public final void setTotalInsuredValueAmt( xsd.acord.TotalInsuredValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalInsuredValueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getRate() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Rate" );
  }


  public final void setRate( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Rate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Rate getRate_elem() {
    return (xsd.acord.Rate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Rate_elem" );
  }


  public final void setRate_elem( xsd.acord.Rate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Rate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Limit getLimit() {
    return (xsd.acord.Limit) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Limit" );
  }


  public final void setLimit( xsd.acord.Limit value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Limit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Deductible getDeductible() {
    return (xsd.acord.Deductible) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Deductible" );
  }


  public final void setDeductible( xsd.acord.Deductible value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Deductible", value );
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
  public final java.lang.Integer getInsuranceToValuePct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceToValuePct" );
  }


  public final void setInsuranceToValuePct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceToValuePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuranceToValuePct getInsuranceToValuePct_elem() {
    return (xsd.acord.InsuranceToValuePct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceToValuePct_elem" );
  }


  public final void setInsuranceToValuePct_elem( xsd.acord.InsuranceToValuePct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceToValuePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getInsurerSharePct() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerSharePct" );
  }


  public final void setInsurerSharePct( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerSharePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsurerSharePct getInsurerSharePct_elem() {
    return (xsd.acord.InsurerSharePct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerSharePct_elem" );
  }


  public final void setInsurerSharePct_elem( xsd.acord.InsurerSharePct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerSharePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsurerShareAmt getInsurerShareAmt() {
    return (xsd.acord.InsurerShareAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsurerShareAmt" );
  }


  public final void setInsurerShareAmt( xsd.acord.InsurerShareAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsurerShareAmt", value );
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

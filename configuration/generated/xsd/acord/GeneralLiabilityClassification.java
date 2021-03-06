/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GeneralLiabilityClassification extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "GeneralLiabilityClassification", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SublineCd = new javax.xml.namespace.QName( "", "SublineCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCd = new javax.xml.namespace.QName( "", "ClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCdDesc = new javax.xml.namespace.QName( "", "ClassCdDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Exposure = new javax.xml.namespace.QName( "", "Exposure", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InterestIdNumber = new javax.xml.namespace.QName( "", "InterestIdNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumBasisCd = new javax.xml.namespace.QName( "", "PremiumBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AlternateWordingCd = new javax.xml.namespace.QName( "", "AlternateWordingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuffixCd = new javax.xml.namespace.QName( "", "SuffixCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremOpRate = new javax.xml.namespace.QName( "", "PremOpRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProdRate = new javax.xml.namespace.QName( "", "ProdRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IfAnyRatingBasisInd = new javax.xml.namespace.QName( "", "IfAnyRatingBasisInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.GeneralLiabilityClassification" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.GeneralLiabilityClassification_Type" );
    }
  };

  public GeneralLiabilityClassification() {
    super( 1503054527, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.GeneralLiabilityClassification_Type() );
  }

  public GeneralLiabilityClassification( xsd.acord.types.complex.GeneralLiabilityClassification_Type typeInstance ) {
    super( 1503054527, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GeneralLiabilityClassification( gw.internal.xml.XmlElementState state ) {
    super( 1503054527, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.GeneralLiabilityClassification> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.GeneralLiabilityClassification_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.GeneralLiabilityClassification_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.GeneralLiabilityClassification_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }

  public static xsd.acord.GeneralLiabilityClassification parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.GeneralLiabilityClassification.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSublineCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SublineCd" );
  }


  public final void setSublineCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SublineCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SublineCd getSublineCd_elem() {
    return (xsd.acord.SublineCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SublineCd_elem" );
  }


  public final void setSublineCd_elem( xsd.acord.SublineCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SublineCd_elem", value );
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
  public final java.lang.String getClassCdDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCdDesc" );
  }


  public final void setClassCdDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCdDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClassCdDesc getClassCdDesc_elem() {
    return (xsd.acord.ClassCdDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCdDesc_elem" );
  }


  public final void setClassCdDesc_elem( xsd.acord.ClassCdDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCdDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getExposure() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Exposure" );
  }


  public final void setExposure( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Exposure", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Exposure getExposure_elem() {
    return (xsd.acord.Exposure) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Exposure_elem" );
  }


  public final void setExposure_elem( xsd.acord.Exposure value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Exposure_elem", value );
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
  public final xsd.acord.TerritoryCd getTerritoryCd_elem() {
    return (xsd.acord.TerritoryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.acord.TerritoryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getInterestIdNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestIdNumber" );
  }


  public final void setInterestIdNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestIdNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InterestIdNumber getInterestIdNumber_elem() {
    return (xsd.acord.InterestIdNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InterestIdNumber_elem" );
  }


  public final void setInterestIdNumber_elem( xsd.acord.InterestIdNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InterestIdNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PremiumBase getPremiumBasisCd() {
    return (xsd.acord.enums.PremiumBase) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumBasisCd" );
  }


  public final void setPremiumBasisCd( xsd.acord.enums.PremiumBase value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremiumBasisCd getPremiumBasisCd_elem() {
    return (xsd.acord.PremiumBasisCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumBasisCd_elem" );
  }


  public final void setPremiumBasisCd_elem( xsd.acord.PremiumBasisCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAlternateWordingCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AlternateWordingCd" );
  }


  public final void setAlternateWordingCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AlternateWordingCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AlternateWordingCd getAlternateWordingCd_elem() {
    return (xsd.acord.AlternateWordingCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AlternateWordingCd_elem" );
  }


  public final void setAlternateWordingCd_elem( xsd.acord.AlternateWordingCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AlternateWordingCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSuffixCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuffixCd" );
  }


  public final void setSuffixCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuffixCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SuffixCd getSuffixCd_elem() {
    return (xsd.acord.SuffixCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuffixCd_elem" );
  }


  public final void setSuffixCd_elem( xsd.acord.SuffixCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuffixCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getPremOpRate() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremOpRate" );
  }


  public final void setPremOpRate( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremOpRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PremOpRate getPremOpRate_elem() {
    return (xsd.acord.PremOpRate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremOpRate_elem" );
  }


  public final void setPremOpRate_elem( xsd.acord.PremOpRate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremOpRate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getProdRate() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProdRate" );
  }


  public final void setProdRate( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProdRate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProdRate getProdRate_elem() {
    return (xsd.acord.ProdRate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProdRate_elem" );
  }


  public final void setProdRate_elem( xsd.acord.ProdRate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProdRate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIfAnyRatingBasisInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IfAnyRatingBasisInd" );
  }


  public final void setIfAnyRatingBasisInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IfAnyRatingBasisInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IfAnyRatingBasisInd getIfAnyRatingBasisInd_elem() {
    return (xsd.acord.IfAnyRatingBasisInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IfAnyRatingBasisInd_elem" );
  }


  public final void setIfAnyRatingBasisInd_elem( xsd.acord.IfAnyRatingBasisInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IfAnyRatingBasisInd_elem", value );
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
}

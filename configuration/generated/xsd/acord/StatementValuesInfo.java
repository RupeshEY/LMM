/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class StatementValuesInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "StatementValuesInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubjectInsuranceCd = new javax.xml.namespace.QName( "", "SubjectInsuranceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValuationCd = new javax.xml.namespace.QName( "", "ValuationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCd = new javax.xml.namespace.QName( "", "ClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDesc = new javax.xml.namespace.QName( "", "ItemDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemValueAmt = new javax.xml.namespace.QName( "", "ItemValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Rate = new javax.xml.namespace.QName( "", "Rate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PremiumAmt = new javax.xml.namespace.QName( "", "PremiumAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoinsurancePct = new javax.xml.namespace.QName( "", "CoinsurancePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDt = new javax.xml.namespace.QName( "", "AsOfDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.StatementValuesInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.StatementValuesInfo_Type" );
    }
  };

  public StatementValuesInfo() {
    super( 1676898763, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.StatementValuesInfo_Type() );
  }

  public StatementValuesInfo( xsd.acord.types.complex.StatementValuesInfo_Type typeInstance ) {
    super( 1676898763, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private StatementValuesInfo( gw.internal.xml.XmlElementState state ) {
    super( 1676898763, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.StatementValuesInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.StatementValuesInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.StatementValuesInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.StatementValuesInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.StatementValuesInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.StatementValuesInfo.class );
  }

  public static xsd.acord.StatementValuesInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.StatementValuesInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Risk getSubjectInsuranceCd() {
    return (xsd.acord.enums.Risk) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectInsuranceCd" );
  }


  public final void setSubjectInsuranceCd( xsd.acord.enums.Risk value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectInsuranceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubjectInsuranceCd getSubjectInsuranceCd_elem() {
    return (xsd.acord.SubjectInsuranceCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SubjectInsuranceCd_elem" );
  }


  public final void setSubjectInsuranceCd_elem( xsd.acord.SubjectInsuranceCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SubjectInsuranceCd_elem", value );
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
  public final java.lang.String getItemDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDesc" );
  }


  public final void setItemDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemDesc getItemDesc_elem() {
    return (xsd.acord.ItemDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDesc_elem" );
  }


  public final void setItemDesc_elem( xsd.acord.ItemDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemValueAmt getItemValueAmt() {
    return (xsd.acord.ItemValueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemValueAmt" );
  }


  public final void setItemValueAmt( xsd.acord.ItemValueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemValueAmt", value );
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
  public final xsd.acord.PremiumAmt getPremiumAmt() {
    return (xsd.acord.PremiumAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PremiumAmt" );
  }


  public final void setPremiumAmt( xsd.acord.PremiumAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PremiumAmt", value );
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
  public final java.lang.String getAsOfDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDt" );
  }


  public final void setAsOfDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AsOfDt getAsOfDt_elem() {
    return (xsd.acord.AsOfDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDt_elem" );
  }


  public final void setAsOfDt_elem( xsd.acord.AsOfDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDt_elem", value );
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
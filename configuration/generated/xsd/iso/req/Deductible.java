/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Deductible extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Deductible", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IndexAdjustment = new javax.xml.namespace.QName( "", "IndexAdjustment", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleBasisCd = new javax.xml.namespace.QName( "", "DeductibleBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleTypeCd = new javax.xml.namespace.QName( "", "DeductibleTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeductibleAppliesToCd = new javax.xml.namespace.QName( "", "DeductibleAppliesToCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.Deductible" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.Deductible" );
    }
  };

  public Deductible() {
    super( -1623759661, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.Deductible() );
  }

  public Deductible( xsd.iso.req.anonymous.types.complex.Deductible typeInstance ) {
    super( -1623759661, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Deductible( gw.internal.xml.XmlElementState state ) {
    super( -1623759661, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.Deductible> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.Deductible get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.Deductible.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.Deductible typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.Deductible parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.Deductible.class );
  }

  public static xsd.iso.req.Deductible parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.Deductible.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.IndexAdjustment getIndexAdjustment() {
    return (xsd.iso.req.IndexAdjustment) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IndexAdjustment" );
  }


  public final void setIndexAdjustment( xsd.iso.req.IndexAdjustment value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IndexAdjustment", value );
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
  public final java.lang.String getDeductibleBasisCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleBasisCd" );
  }


  public final void setDeductibleBasisCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleBasisCd getDeductibleBasisCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleBasisCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleBasisCd_elem" );
  }


  public final void setDeductibleBasisCd_elem( xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleBasisCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDeductibleTypeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleTypeCd" );
  }


  public final void setDeductibleTypeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleTypeCd getDeductibleTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleTypeCd_elem" );
  }


  public final void setDeductibleTypeCd_elem( xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDeductibleAppliesToCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleAppliesToCd" );
  }


  public final void setDeductibleAppliesToCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleAppliesToCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleAppliesToCd getDeductibleAppliesToCd_elem() {
    return (xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleAppliesToCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DeductibleAppliesToCd_elem" );
  }


  public final void setDeductibleAppliesToCd_elem( xsd.iso.req.anonymous.elements.PCDEDUCTIBLE_DeductibleAppliesToCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DeductibleAppliesToCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatInteger() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatInteger" );
  }


  public final void setFormatInteger( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatInteger", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger getFormatInteger_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatInteger_elem" );
  }


  public final void setFormatInteger_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatInteger_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt getFormatCurrencyAmt() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatCurrencyAmt" );
  }


  public final void setFormatCurrencyAmt( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatCurrencyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatModFactor() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatModFactor" );
  }


  public final void setFormatModFactor( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatModFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor getFormatModFactor_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatModFactor_elem" );
  }


  public final void setFormatModFactor_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatModFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatPct() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatPct" );
  }


  public final void setFormatPct( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct getFormatPct_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatPct_elem" );
  }


  public final void setFormatPct_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatPct_elem", value );
  }
}
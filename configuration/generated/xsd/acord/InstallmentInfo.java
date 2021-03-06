/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class InstallmentInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "InstallmentInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentAmt = new javax.xml.namespace.QName( "", "InstallmentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentDueDt = new javax.xml.namespace.QName( "", "InstallmentDueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InstallmentNumber = new javax.xml.namespace.QName( "", "InstallmentNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FirstInstallmentPct = new javax.xml.namespace.QName( "", "FirstInstallmentPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxAmt = new javax.xml.namespace.QName( "", "TaxAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxIncludedInFirstInstallmentInd = new javax.xml.namespace.QName( "", "TaxIncludedInFirstInstallmentInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.InstallmentInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.InstallmentInfo_Type" );
    }
  };

  public InstallmentInfo() {
    super( -1654889005, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.InstallmentInfo_Type() );
  }

  public InstallmentInfo( xsd.acord.types.complex.InstallmentInfo_Type typeInstance ) {
    super( -1654889005, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private InstallmentInfo( gw.internal.xml.XmlElementState state ) {
    super( -1654889005, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.InstallmentInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.InstallmentInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.InstallmentInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.InstallmentInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.InstallmentInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.InstallmentInfo.class );
  }

  public static xsd.acord.InstallmentInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.InstallmentInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InstallmentAmt getInstallmentAmt() {
    return (xsd.acord.InstallmentAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentAmt" );
  }


  public final void setInstallmentAmt( xsd.acord.InstallmentAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInstallmentDueDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentDueDt" );
  }


  public final void setInstallmentDueDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentDueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InstallmentDueDt getInstallmentDueDt_elem() {
    return (xsd.acord.InstallmentDueDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentDueDt_elem" );
  }


  public final void setInstallmentDueDt_elem( xsd.acord.InstallmentDueDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getInstallmentNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentNumber" );
  }


  public final void setInstallmentNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InstallmentNumber getInstallmentNumber_elem() {
    return (xsd.acord.InstallmentNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InstallmentNumber_elem" );
  }


  public final void setInstallmentNumber_elem( xsd.acord.InstallmentNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InstallmentNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getFirstInstallmentPct() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstInstallmentPct" );
  }


  public final void setFirstInstallmentPct( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstInstallmentPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FirstInstallmentPct getFirstInstallmentPct_elem() {
    return (xsd.acord.FirstInstallmentPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstInstallmentPct_elem" );
  }


  public final void setFirstInstallmentPct_elem( xsd.acord.FirstInstallmentPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstInstallmentPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TaxAmt getTaxAmt() {
    return (xsd.acord.TaxAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxAmt" );
  }


  public final void setTaxAmt( xsd.acord.TaxAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getTaxIncludedInFirstInstallmentInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxIncludedInFirstInstallmentInd" );
  }


  public final void setTaxIncludedInFirstInstallmentInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxIncludedInFirstInstallmentInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TaxIncludedInFirstInstallmentInd getTaxIncludedInFirstInstallmentInd_elem() {
    return (xsd.acord.TaxIncludedInFirstInstallmentInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxIncludedInFirstInstallmentInd_elem" );
  }


  public final void setTaxIncludedInFirstInstallmentInd_elem( xsd.acord.TaxIncludedInFirstInstallmentInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxIncludedInFirstInstallmentInd_elem", value );
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

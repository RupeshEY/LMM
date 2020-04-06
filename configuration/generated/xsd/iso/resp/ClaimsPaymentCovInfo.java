/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimsPaymentCovInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClaimsPaymentCovInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentReasonCd = new javax.xml.namespace.QName( "", "PaymentReasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentAmt = new javax.xml.namespace.QName( "", "PaymentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusCd = new javax.xml.namespace.QName( "", "ClaimStatusCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.ClaimsPaymentCovInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo" );
    }
  };

  public ClaimsPaymentCovInfo() {
    super( -1629278983, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo() );
  }

  public ClaimsPaymentCovInfo( xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo typeInstance ) {
    super( -1629278983, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimsPaymentCovInfo( gw.internal.xml.XmlElementState state ) {
    super( -1629278983, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.ClaimsPaymentCovInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.ClaimsPaymentCovInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
  }

  public static xsd.iso.resp.ClaimsPaymentCovInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.ClaimsPaymentCovInfo.class );
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
  public final xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_CoverageCd getCoverageCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_CoverageCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_CoverageCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentReasonCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentReasonCd" );
  }


  public final void setPaymentReasonCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentReasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentReasonCd getPaymentReasonCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentReasonCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentReasonCd_elem" );
  }


  public final void setPaymentReasonCd_elem( xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentReasonCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentReasonCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentAmt getPaymentAmt() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentAmt" );
  }


  public final void setPaymentAmt( xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_PaymentAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimStatusCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd" );
  }


  public final void setClaimStatusCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_ClaimStatusCd getClaimStatusCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_ClaimStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem" );
  }


  public final void setClaimStatusCd_elem( xsd.iso.resp.anonymous.elements.ClaimsPaymentCovInfo_ClaimStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem", value );
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
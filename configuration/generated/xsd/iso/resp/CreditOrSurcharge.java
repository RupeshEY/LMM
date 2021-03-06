/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CreditOrSurcharge extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeDt = new javax.xml.namespace.QName( "", "CreditSurchargeDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeCd = new javax.xml.namespace.QName( "", "CreditSurchargeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumericValue = new javax.xml.namespace.QName( "", "NumericValue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondaryCd = new javax.xml.namespace.QName( "", "SecondaryCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.CreditOrSurcharge" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge" );
    }
  };

  public CreditOrSurcharge() {
    super( 1215008440, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge() );
  }

  public CreditOrSurcharge( xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge typeInstance ) {
    super( 1215008440, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CreditOrSurcharge( gw.internal.xml.XmlElementState state ) {
    super( 1215008440, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.CreditOrSurcharge> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.CreditOrSurcharge typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.CreditOrSurcharge.class );
  }

  public static xsd.iso.resp.CreditOrSurcharge parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.CreditOrSurcharge.class );
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
  public final java.lang.String getCreditSurchargeDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditSurchargeDt" );
  }


  public final void setCreditSurchargeDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditSurchargeDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeDt getCreditSurchargeDt_elem() {
    return (xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditSurchargeDt_elem" );
  }


  public final void setCreditSurchargeDt_elem( xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditSurchargeDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreditSurchargeCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditSurchargeCd" );
  }


  public final void setCreditSurchargeCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditSurchargeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeCd getCreditSurchargeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreditSurchargeCd_elem" );
  }


  public final void setCreditSurchargeCd_elem( xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_CreditSurchargeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreditSurchargeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_NumericValue> getNumericValue() {
    return (java.util.List<xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_NumericValue>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumericValue" );
  }


  public final void setNumericValue( java.util.List<xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_NumericValue> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumericValue", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSecondaryCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecondaryCd" );
  }


  public final void setSecondaryCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecondaryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_SecondaryCd getSecondaryCd_elem() {
    return (xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_SecondaryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecondaryCd_elem" );
  }


  public final void setSecondaryCd_elem( xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_SecondaryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecondaryCd_elem", value );
  }
}

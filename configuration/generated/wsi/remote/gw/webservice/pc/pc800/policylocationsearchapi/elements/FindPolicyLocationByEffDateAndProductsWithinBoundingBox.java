/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FindPolicyLocationByEffDateAndProductsWithinBoundingBox extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "findPolicyLocationByEffDateAndProductsWithinBoundingBox", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffDate = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "effDate", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductCodes = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "productCodes", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TopLeftLat = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "topLeftLat", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TopLeftLong = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "topLeftLong", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BottomRightLat = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "bottomRightLat", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BottomRightLong = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "bottomRightLong", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox" );
    }
  };

  public FindPolicyLocationByEffDateAndProductsWithinBoundingBox() {
    super( 827732567, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox() );
  }

  public FindPolicyLocationByEffDateAndProductsWithinBoundingBox( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox typeInstance ) {
    super( 827732567, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FindPolicyLocationByEffDateAndProductsWithinBoundingBox( gw.internal.xml.XmlElementState state ) {
    super( 827732567, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.FindPolicyLocationByEffDateAndProductsWithinBoundingBox typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getEffDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffDate" );
  }


  public final void setEffDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_EffDate getEffDate_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_EffDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffDate_elem" );
  }


  public final void setEffDate_elem( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_EffDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_ProductCodes getProductCodes() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_ProductCodes) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductCodes" );
  }


  public final void setProductCodes( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_ProductCodes value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductCodes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getTopLeftLat() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TopLeftLat" );
  }


  public final void setTopLeftLat( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TopLeftLat", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLat getTopLeftLat_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLat) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TopLeftLat_elem" );
  }


  public final void setTopLeftLat_elem( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLat value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TopLeftLat_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getTopLeftLong() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TopLeftLong" );
  }


  public final void setTopLeftLong( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TopLeftLong", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLong getTopLeftLong_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLong) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TopLeftLong_elem" );
  }


  public final void setTopLeftLong_elem( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_TopLeftLong value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TopLeftLong_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getBottomRightLat() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BottomRightLat" );
  }


  public final void setBottomRightLat( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BottomRightLat", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLat getBottomRightLat_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLat) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BottomRightLat_elem" );
  }


  public final void setBottomRightLat_elem( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLat value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BottomRightLat_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getBottomRightLong() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BottomRightLong" );
  }


  public final void setBottomRightLong( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BottomRightLong", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLong getBottomRightLong_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLong) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BottomRightLong_elem" );
  }


  public final void setBottomRightLong_elem( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.elements.FindPolicyLocationByEffDateAndProductsWithinBoundingBox_BottomRightLong value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BottomRightLong_elem", value );
  }
}

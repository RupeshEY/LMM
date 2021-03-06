/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ProductCompletedOpsInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ProductCompletedOpsInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductDesc = new javax.xml.namespace.QName( "", "ProductDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualSalesAmt = new javax.xml.namespace.QName( "", "AnnualSalesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductInMarket = new javax.xml.namespace.QName( "", "ProductInMarket", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpectedLife = new javax.xml.namespace.QName( "", "ExpectedLife", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IntendedUseDesc = new javax.xml.namespace.QName( "", "IntendedUseDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrincipalComponentsDesc = new javax.xml.namespace.QName( "", "PrincipalComponentsDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ProductCompletedOpsInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ProductCompletedOpsInfo_Type" );
    }
  };

  public ProductCompletedOpsInfo() {
    super( -874092336, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ProductCompletedOpsInfo_Type() );
  }

  public ProductCompletedOpsInfo( xsd.acord.types.complex.ProductCompletedOpsInfo_Type typeInstance ) {
    super( -874092336, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ProductCompletedOpsInfo( gw.internal.xml.XmlElementState state ) {
    super( -874092336, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ProductCompletedOpsInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ProductCompletedOpsInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ProductCompletedOpsInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ProductCompletedOpsInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }

  public static xsd.acord.ProductCompletedOpsInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ProductCompletedOpsInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductDesc" );
  }


  public final void setProductDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductDesc getProductDesc_elem() {
    return (xsd.acord.ProductDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductDesc_elem" );
  }


  public final void setProductDesc_elem( xsd.acord.ProductDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualSalesAmt getAnnualSalesAmt() {
    return (xsd.acord.AnnualSalesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualSalesAmt" );
  }


  public final void setAnnualSalesAmt( xsd.acord.AnnualSalesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualSalesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnits getNumUnits_elem() {
    return (xsd.acord.NumUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.acord.NumUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductInMarket getProductInMarket() {
    return (xsd.acord.ProductInMarket) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductInMarket" );
  }


  public final void setProductInMarket( xsd.acord.ProductInMarket value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductInMarket", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExpectedLife getExpectedLife() {
    return (xsd.acord.ExpectedLife) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpectedLife" );
  }


  public final void setExpectedLife( xsd.acord.ExpectedLife value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpectedLife", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIntendedUseDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IntendedUseDesc" );
  }


  public final void setIntendedUseDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IntendedUseDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IntendedUseDesc getIntendedUseDesc_elem() {
    return (xsd.acord.IntendedUseDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IntendedUseDesc_elem" );
  }


  public final void setIntendedUseDesc_elem( xsd.acord.IntendedUseDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IntendedUseDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrincipalComponentsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrincipalComponentsDesc" );
  }


  public final void setPrincipalComponentsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrincipalComponentsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrincipalComponentsDesc getPrincipalComponentsDesc_elem() {
    return (xsd.acord.PrincipalComponentsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrincipalComponentsDesc_elem" );
  }


  public final void setPrincipalComponentsDesc_elem( xsd.acord.PrincipalComponentsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrincipalComponentsDesc_elem", value );
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

/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class StockInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "StockInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExchangeTradedCd = new javax.xml.namespace.QName( "", "ExchangeTradedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExchangeTickerSymbol = new javax.xml.namespace.QName( "", "ExchangeTickerSymbol", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DurationPeriod = new javax.xml.namespace.QName( "", "DurationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StockHighAmt = new javax.xml.namespace.QName( "", "StockHighAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StockLowAmt = new javax.xml.namespace.QName( "", "StockLowAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SharesInfo = new javax.xml.namespace.QName( "", "SharesInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.StockInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.StockInfo_Type" );
    }
  };

  public StockInfo() {
    super( -833271312, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.StockInfo_Type() );
  }

  public StockInfo( xsd.acord.types.complex.StockInfo_Type typeInstance ) {
    super( -833271312, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private StockInfo( gw.internal.xml.XmlElementState state ) {
    super( -833271312, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.StockInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.StockInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.StockInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.StockInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.StockInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.StockInfo.class );
  }

  public static xsd.acord.StockInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.StockInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ExchangeTraded getExchangeTradedCd() {
    return (xsd.acord.enums.ExchangeTraded) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeTradedCd" );
  }


  public final void setExchangeTradedCd( xsd.acord.enums.ExchangeTraded value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeTradedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExchangeTradedCd getExchangeTradedCd_elem() {
    return (xsd.acord.ExchangeTradedCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeTradedCd_elem" );
  }


  public final void setExchangeTradedCd_elem( xsd.acord.ExchangeTradedCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeTradedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExchangeTickerSymbol() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeTickerSymbol" );
  }


  public final void setExchangeTickerSymbol( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeTickerSymbol", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ExchangeTickerSymbol getExchangeTickerSymbol_elem() {
    return (xsd.acord.ExchangeTickerSymbol) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExchangeTickerSymbol_elem" );
  }


  public final void setExchangeTickerSymbol_elem( xsd.acord.ExchangeTickerSymbol value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExchangeTickerSymbol_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DurationPeriod getDurationPeriod() {
    return (xsd.acord.DurationPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DurationPeriod" );
  }


  public final void setDurationPeriod( xsd.acord.DurationPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DurationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StockHighAmt getStockHighAmt() {
    return (xsd.acord.StockHighAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StockHighAmt" );
  }


  public final void setStockHighAmt( xsd.acord.StockHighAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StockHighAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StockLowAmt getStockLowAmt() {
    return (xsd.acord.StockLowAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StockLowAmt" );
  }


  public final void setStockLowAmt( xsd.acord.StockLowAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StockLowAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SharesInfo getSharesInfo() {
    return (xsd.acord.SharesInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SharesInfo" );
  }


  public final void setSharesInfo( xsd.acord.SharesInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SharesInfo", value );
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

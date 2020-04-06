/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TransportationDetail extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "TransportationDetail", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShipmentDt = new javax.xml.namespace.QName( "", "ShipmentDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShippingInfo = new javax.xml.namespace.QName( "", "ShippingInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualGrossSalesFOBPct = new javax.xml.namespace.QName( "", "AnnualGrossSalesFOBPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContingentCoverageFOBInd = new javax.xml.namespace.QName( "", "ContingentCoverageFOBInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.TransportationDetail" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.TransportationDetail_Type" );
    }
  };

  public TransportationDetail() {
    super( 1538475089, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.TransportationDetail_Type() );
  }

  public TransportationDetail( xsd.acord.types.complex.TransportationDetail_Type typeInstance ) {
    super( 1538475089, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TransportationDetail( gw.internal.xml.XmlElementState state ) {
    super( 1538475089, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.TransportationDetail> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.TransportationDetail_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.TransportationDetail_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.TransportationDetail_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.TransportationDetail parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.TransportationDetail.class );
  }

  public static xsd.acord.TransportationDetail parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.TransportationDetail.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getShipmentDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShipmentDt" );
  }


  public final void setShipmentDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShipmentDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ShipmentDt getShipmentDt_elem() {
    return (xsd.acord.ShipmentDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShipmentDt_elem" );
  }


  public final void setShipmentDt_elem( xsd.acord.ShipmentDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShipmentDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ShippingInfo> getShippingInfo() {
    return (java.util.List<xsd.acord.ShippingInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShippingInfo" );
  }


  public final void setShippingInfo( java.util.List<xsd.acord.ShippingInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShippingInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getAnnualGrossSalesFOBPct() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualGrossSalesFOBPct" );
  }


  public final void setAnnualGrossSalesFOBPct( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualGrossSalesFOBPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AnnualGrossSalesFOBPct getAnnualGrossSalesFOBPct_elem() {
    return (xsd.acord.AnnualGrossSalesFOBPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AnnualGrossSalesFOBPct_elem" );
  }


  public final void setAnnualGrossSalesFOBPct_elem( xsd.acord.AnnualGrossSalesFOBPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AnnualGrossSalesFOBPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getContingentCoverageFOBInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContingentCoverageFOBInd" );
  }


  public final void setContingentCoverageFOBInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContingentCoverageFOBInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContingentCoverageFOBInd getContingentCoverageFOBInd_elem() {
    return (xsd.acord.ContingentCoverageFOBInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContingentCoverageFOBInd_elem" );
  }


  public final void setContingentCoverageFOBInd_elem( xsd.acord.ContingentCoverageFOBInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContingentCoverageFOBInd_elem", value );
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
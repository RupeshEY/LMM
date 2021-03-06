/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TransportationInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "TransportationInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShippingInterestCd = new javax.xml.namespace.QName( "", "ShippingInterestCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceInfo = new javax.xml.namespace.QName( "", "DistanceInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossReceiptsInfo = new javax.xml.namespace.QName( "", "GrossReceiptsInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OpenReportingInd = new javax.xml.namespace.QName( "", "OpenReportingInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShipmentTypeCd = new javax.xml.namespace.QName( "", "ShipmentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehsOperatedInfo = new javax.xml.namespace.QName( "", "VehsOperatedInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlDriver = new javax.xml.namespace.QName( "", "CommlDriver", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlVeh = new javax.xml.namespace.QName( "", "CommlVeh", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransportationDetail = new javax.xml.namespace.QName( "", "TransportationDetail", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MotorTruckCargoDetail = new javax.xml.namespace.QName( "", "MotorTruckCargoDetail", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PackingCd = new javax.xml.namespace.QName( "", "PackingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConsolidationInd = new javax.xml.namespace.QName( "", "ConsolidationInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiggingInfo = new javax.xml.namespace.QName( "", "RiggingInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QuestionAnswer = new javax.xml.namespace.QName( "", "QuestionAnswer", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.TransportationInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.TransportationInfo_Type" );
    }
  };

  public TransportationInfo() {
    super( 64327854, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.TransportationInfo_Type() );
  }

  public TransportationInfo( xsd.acord.types.complex.TransportationInfo_Type typeInstance ) {
    super( 64327854, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TransportationInfo( gw.internal.xml.XmlElementState state ) {
    super( 64327854, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.TransportationInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.TransportationInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.TransportationInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.TransportationInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.TransportationInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.TransportationInfo.class );
  }

  public static xsd.acord.TransportationInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.TransportationInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ShippingInterest getShippingInterestCd() {
    return (xsd.acord.enums.ShippingInterest) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShippingInterestCd" );
  }


  public final void setShippingInterestCd( xsd.acord.enums.ShippingInterest value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShippingInterestCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ShippingInterestCd getShippingInterestCd_elem() {
    return (xsd.acord.ShippingInterestCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShippingInterestCd_elem" );
  }


  public final void setShippingInterestCd_elem( xsd.acord.ShippingInterestCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShippingInterestCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DistanceInfo> getDistanceInfo() {
    return (java.util.List<xsd.acord.DistanceInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DistanceInfo" );
  }


  public final void setDistanceInfo( java.util.List<xsd.acord.DistanceInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DistanceInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.GrossReceiptsInfo> getGrossReceiptsInfo() {
    return (java.util.List<xsd.acord.GrossReceiptsInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GrossReceiptsInfo" );
  }


  public final void setGrossReceiptsInfo( java.util.List<xsd.acord.GrossReceiptsInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GrossReceiptsInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOpenReportingInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OpenReportingInd" );
  }


  public final void setOpenReportingInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OpenReportingInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OpenReportingInd getOpenReportingInd_elem() {
    return (xsd.acord.OpenReportingInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OpenReportingInd_elem" );
  }


  public final void setOpenReportingInd_elem( xsd.acord.OpenReportingInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OpenReportingInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ShipmentType getShipmentTypeCd() {
    return (xsd.acord.enums.ShipmentType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShipmentTypeCd" );
  }


  public final void setShipmentTypeCd( xsd.acord.enums.ShipmentType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShipmentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ShipmentTypeCd getShipmentTypeCd_elem() {
    return (xsd.acord.ShipmentTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ShipmentTypeCd_elem" );
  }


  public final void setShipmentTypeCd_elem( xsd.acord.ShipmentTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ShipmentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.VehsOperatedInfo> getVehsOperatedInfo() {
    return (java.util.List<xsd.acord.VehsOperatedInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehsOperatedInfo" );
  }


  public final void setVehsOperatedInfo( java.util.List<xsd.acord.VehsOperatedInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehsOperatedInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlDriver> getCommlDriver() {
    return (java.util.List<xsd.acord.CommlDriver>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlDriver" );
  }


  public final void setCommlDriver( java.util.List<xsd.acord.CommlDriver> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlDriver", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlVeh> getCommlVeh() {
    return (java.util.List<xsd.acord.CommlVeh>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CommlVeh" );
  }


  public final void setCommlVeh( java.util.List<xsd.acord.CommlVeh> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CommlVeh", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransportationDetail getTransportationDetail() {
    return (xsd.acord.TransportationDetail) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransportationDetail" );
  }


  public final void setTransportationDetail( xsd.acord.TransportationDetail value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransportationDetail", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MotorTruckCargoDetail getMotorTruckCargoDetail() {
    return (xsd.acord.MotorTruckCargoDetail) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MotorTruckCargoDetail" );
  }


  public final void setMotorTruckCargoDetail( xsd.acord.MotorTruckCargoDetail value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MotorTruckCargoDetail", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Packing getPackingCd() {
    return (xsd.acord.enums.Packing) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PackingCd" );
  }


  public final void setPackingCd( xsd.acord.enums.Packing value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PackingCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PackingCd getPackingCd_elem() {
    return (xsd.acord.PackingCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PackingCd_elem" );
  }


  public final void setPackingCd_elem( xsd.acord.PackingCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PackingCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getConsolidationInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsolidationInd" );
  }


  public final void setConsolidationInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsolidationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConsolidationInd getConsolidationInd_elem() {
    return (xsd.acord.ConsolidationInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConsolidationInd_elem" );
  }


  public final void setConsolidationInd_elem( xsd.acord.ConsolidationInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConsolidationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.RiggingInfo> getRiggingInfo() {
    return (java.util.List<xsd.acord.RiggingInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RiggingInfo" );
  }


  public final void setRiggingInfo( java.util.List<xsd.acord.RiggingInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RiggingInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.QuestionAnswer> getQuestionAnswer() {
    return (java.util.List<xsd.acord.QuestionAnswer>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QuestionAnswer" );
  }


  public final void setQuestionAnswer( java.util.List<xsd.acord.QuestionAnswer> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QuestionAnswer", value );
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

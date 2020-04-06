/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BuildersRiskInstallationInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BuildersRiskInstallationInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JobBasisCd = new javax.xml.namespace.QName( "", "JobBasisCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Region = new javax.xml.namespace.QName( "", "Region", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchasePriceAmt = new javax.xml.namespace.QName( "", "PurchasePriceAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConstructionStartedInd = new javax.xml.namespace.QName( "", "ConstructionStartedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SafeguardsUsedInd = new javax.xml.namespace.QName( "", "SafeguardsUsedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SiteLightingInd = new javax.xml.namespace.QName( "", "SiteLightingInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PerimeterFenceInd = new javax.xml.namespace.QName( "", "PerimeterFenceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GrossReceiptsInfo = new javax.xml.namespace.QName( "", "GrossReceiptsInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JobValueInfo = new javax.xml.namespace.QName( "", "JobValueInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiggingInfo = new javax.xml.namespace.QName( "", "RiggingInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StorageInfo = new javax.xml.namespace.QName( "", "StorageInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecurityDesc = new javax.xml.namespace.QName( "", "SecurityDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BuildersRiskTransportationInfo = new javax.xml.namespace.QName( "", "BuildersRiskTransportationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JobNumber = new javax.xml.namespace.QName( "", "JobNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BuildersRiskInstallationInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BuildersRiskInstallationInfo_Type" );
    }
  };

  public BuildersRiskInstallationInfo() {
    super( -714563901, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BuildersRiskInstallationInfo_Type() );
  }

  public BuildersRiskInstallationInfo( xsd.acord.types.complex.BuildersRiskInstallationInfo_Type typeInstance ) {
    super( -714563901, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BuildersRiskInstallationInfo( gw.internal.xml.XmlElementState state ) {
    super( -714563901, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BuildersRiskInstallationInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BuildersRiskInstallationInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BuildersRiskInstallationInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BuildersRiskInstallationInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }

  public static xsd.acord.BuildersRiskInstallationInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BuildersRiskInstallationInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.JobBasis getJobBasisCd() {
    return (xsd.acord.enums.JobBasis) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JobBasisCd" );
  }


  public final void setJobBasisCd( xsd.acord.enums.JobBasis value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JobBasisCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JobBasisCd getJobBasisCd_elem() {
    return (xsd.acord.JobBasisCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JobBasisCd_elem" );
  }


  public final void setJobBasisCd_elem( xsd.acord.JobBasisCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JobBasisCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRegion() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Region" );
  }


  public final void setRegion( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Region", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Region getRegion_elem() {
    return (xsd.acord.Region) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Region_elem" );
  }


  public final void setRegion_elem( xsd.acord.Region value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Region_elem", value );
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
  public final xsd.acord.PurchasePriceAmt getPurchasePriceAmt() {
    return (xsd.acord.PurchasePriceAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PurchasePriceAmt" );
  }


  public final void setPurchasePriceAmt( xsd.acord.PurchasePriceAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PurchasePriceAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getConstructionStartedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConstructionStartedInd" );
  }


  public final void setConstructionStartedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConstructionStartedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConstructionStartedInd getConstructionStartedInd_elem() {
    return (xsd.acord.ConstructionStartedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ConstructionStartedInd_elem" );
  }


  public final void setConstructionStartedInd_elem( xsd.acord.ConstructionStartedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ConstructionStartedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSafeguardsUsedInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafeguardsUsedInd" );
  }


  public final void setSafeguardsUsedInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafeguardsUsedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SafeguardsUsedInd getSafeguardsUsedInd_elem() {
    return (xsd.acord.SafeguardsUsedInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafeguardsUsedInd_elem" );
  }


  public final void setSafeguardsUsedInd_elem( xsd.acord.SafeguardsUsedInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafeguardsUsedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSiteLightingInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SiteLightingInd" );
  }


  public final void setSiteLightingInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SiteLightingInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SiteLightingInd getSiteLightingInd_elem() {
    return (xsd.acord.SiteLightingInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SiteLightingInd_elem" );
  }


  public final void setSiteLightingInd_elem( xsd.acord.SiteLightingInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SiteLightingInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPerimeterFenceInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PerimeterFenceInd" );
  }


  public final void setPerimeterFenceInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PerimeterFenceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PerimeterFenceInd getPerimeterFenceInd_elem() {
    return (xsd.acord.PerimeterFenceInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PerimeterFenceInd_elem" );
  }


  public final void setPerimeterFenceInd_elem( xsd.acord.PerimeterFenceInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PerimeterFenceInd_elem", value );
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
  public final java.util.List<xsd.acord.JobValueInfo> getJobValueInfo() {
    return (java.util.List<xsd.acord.JobValueInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JobValueInfo" );
  }


  public final void setJobValueInfo( java.util.List<xsd.acord.JobValueInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JobValueInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RiggingInfo getRiggingInfo() {
    return (xsd.acord.RiggingInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RiggingInfo" );
  }


  public final void setRiggingInfo( xsd.acord.RiggingInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RiggingInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StorageInfo getStorageInfo() {
    return (xsd.acord.StorageInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StorageInfo" );
  }


  public final void setStorageInfo( xsd.acord.StorageInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StorageInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSecurityDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecurityDesc" );
  }


  public final void setSecurityDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecurityDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SecurityDesc getSecurityDesc_elem() {
    return (xsd.acord.SecurityDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SecurityDesc_elem" );
  }


  public final void setSecurityDesc_elem( xsd.acord.SecurityDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SecurityDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BuildersRiskTransportationInfo getBuildersRiskTransportationInfo() {
    return (xsd.acord.BuildersRiskTransportationInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BuildersRiskTransportationInfo" );
  }


  public final void setBuildersRiskTransportationInfo( xsd.acord.BuildersRiskTransportationInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BuildersRiskTransportationInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJobNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JobNumber" );
  }


  public final void setJobNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JobNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.JobNumber getJobNumber_elem() {
    return (xsd.acord.JobNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_JobNumber_elem" );
  }


  public final void setJobNumber_elem( xsd.acord.JobNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_JobNumber_elem", value );
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
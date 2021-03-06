/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ProductInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ProductInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductDesignedDesc = new javax.xml.namespace.QName( "", "ProductDesignedDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductMfgDesc = new javax.xml.namespace.QName( "", "ProductMfgDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DiscontinuedDesc = new javax.xml.namespace.QName( "", "DiscontinuedDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModificationDesc = new javax.xml.namespace.QName( "", "ModificationDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ModificationReason = new javax.xml.namespace.QName( "", "ModificationReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LiquidChemDesc = new javax.xml.namespace.QName( "", "LiquidChemDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HazardDesc = new javax.xml.namespace.QName( "", "HazardDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RepairOperationsDesc = new javax.xml.namespace.QName( "", "RepairOperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AircraftOwnedServiced = new javax.xml.namespace.QName( "", "AircraftOwnedServiced", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceContractDesc = new javax.xml.namespace.QName( "", "ServiceContractDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractHarmlessDesc = new javax.xml.namespace.QName( "", "ContractHarmlessDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SpacecraftInfo = new javax.xml.namespace.QName( "", "SpacecraftInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProductManufacturing = new javax.xml.namespace.QName( "", "ProductManufacturing", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ProductInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ProductInfo_Type" );
    }
  };

  public ProductInfo() {
    super( -1938917303, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ProductInfo_Type() );
  }

  public ProductInfo( xsd.acord.types.complex.ProductInfo_Type typeInstance ) {
    super( -1938917303, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ProductInfo( gw.internal.xml.XmlElementState state ) {
    super( -1938917303, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ProductInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ProductInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ProductInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ProductInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ProductInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ProductInfo.class );
  }

  public static xsd.acord.ProductInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ProductInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductDesignedDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductDesignedDesc" );
  }


  public final void setProductDesignedDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductDesignedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductDesignedDesc getProductDesignedDesc_elem() {
    return (xsd.acord.ProductDesignedDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductDesignedDesc_elem" );
  }


  public final void setProductDesignedDesc_elem( xsd.acord.ProductDesignedDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductDesignedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductMfgDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductMfgDesc" );
  }


  public final void setProductMfgDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductMfgDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductMfgDesc getProductMfgDesc_elem() {
    return (xsd.acord.ProductMfgDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductMfgDesc_elem" );
  }


  public final void setProductMfgDesc_elem( xsd.acord.ProductMfgDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductMfgDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDiscontinuedDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DiscontinuedDesc" );
  }


  public final void setDiscontinuedDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DiscontinuedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DiscontinuedDesc getDiscontinuedDesc_elem() {
    return (xsd.acord.DiscontinuedDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DiscontinuedDesc_elem" );
  }


  public final void setDiscontinuedDesc_elem( xsd.acord.DiscontinuedDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DiscontinuedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModificationDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModificationDesc" );
  }


  public final void setModificationDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModificationDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModificationDesc getModificationDesc_elem() {
    return (xsd.acord.ModificationDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModificationDesc_elem" );
  }


  public final void setModificationDesc_elem( xsd.acord.ModificationDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModificationDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModificationReason() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModificationReason" );
  }


  public final void setModificationReason( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModificationReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModificationReason getModificationReason_elem() {
    return (xsd.acord.ModificationReason) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ModificationReason_elem" );
  }


  public final void setModificationReason_elem( xsd.acord.ModificationReason value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ModificationReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLiquidChemDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LiquidChemDesc" );
  }


  public final void setLiquidChemDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LiquidChemDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LiquidChemDesc getLiquidChemDesc_elem() {
    return (xsd.acord.LiquidChemDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LiquidChemDesc_elem" );
  }


  public final void setLiquidChemDesc_elem( xsd.acord.LiquidChemDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LiquidChemDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHazardDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HazardDesc" );
  }


  public final void setHazardDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HazardDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HazardDesc getHazardDesc_elem() {
    return (xsd.acord.HazardDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_HazardDesc_elem" );
  }


  public final void setHazardDesc_elem( xsd.acord.HazardDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_HazardDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRepairOperationsDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RepairOperationsDesc" );
  }


  public final void setRepairOperationsDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RepairOperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RepairOperationsDesc getRepairOperationsDesc_elem() {
    return (xsd.acord.RepairOperationsDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RepairOperationsDesc_elem" );
  }


  public final void setRepairOperationsDesc_elem( xsd.acord.RepairOperationsDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RepairOperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AircraftOwnedServiced> getAircraftOwnedServiced() {
    return (java.util.List<xsd.acord.AircraftOwnedServiced>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AircraftOwnedServiced" );
  }


  public final void setAircraftOwnedServiced( java.util.List<xsd.acord.AircraftOwnedServiced> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AircraftOwnedServiced", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceContractDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceContractDesc" );
  }


  public final void setServiceContractDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceContractDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ServiceContractDesc getServiceContractDesc_elem() {
    return (xsd.acord.ServiceContractDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceContractDesc_elem" );
  }


  public final void setServiceContractDesc_elem( xsd.acord.ServiceContractDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceContractDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContractHarmlessDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractHarmlessDesc" );
  }


  public final void setContractHarmlessDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractHarmlessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractHarmlessDesc getContractHarmlessDesc_elem() {
    return (xsd.acord.ContractHarmlessDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContractHarmlessDesc_elem" );
  }


  public final void setContractHarmlessDesc_elem( xsd.acord.ContractHarmlessDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContractHarmlessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SpacecraftInfo> getSpacecraftInfo() {
    return (java.util.List<xsd.acord.SpacecraftInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SpacecraftInfo" );
  }


  public final void setSpacecraftInfo( java.util.List<xsd.acord.SpacecraftInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SpacecraftInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ProductManufacturing> getProductManufacturing() {
    return (java.util.List<xsd.acord.ProductManufacturing>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductManufacturing" );
  }


  public final void setProductManufacturing( java.util.List<xsd.acord.ProductManufacturing> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductManufacturing", value );
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

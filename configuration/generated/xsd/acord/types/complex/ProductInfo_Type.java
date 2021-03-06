/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ProductInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ProductInfo_Type", "" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ProductInfo_Type" );
    }
  };

  public ProductInfo_Type() {
    super( 1906729955, TYPE.get() );
  }

  private ProductInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1906729955, state );
  }

  protected ProductInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ProductInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ProductInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ProductInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductDesignedDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProductDesignedDesc" );
  }


  public final void setProductDesignedDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProductDesignedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductDesignedDesc getProductDesignedDesc_elem() {
    return (xsd.acord.ProductDesignedDesc) TYPE.get().getPropertyValue( this, "_ProductDesignedDesc_elem" );
  }


  public final void setProductDesignedDesc_elem( xsd.acord.ProductDesignedDesc value ) {
    TYPE.get().setPropertyValue( this, "_ProductDesignedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductMfgDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProductMfgDesc" );
  }


  public final void setProductMfgDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProductMfgDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProductMfgDesc getProductMfgDesc_elem() {
    return (xsd.acord.ProductMfgDesc) TYPE.get().getPropertyValue( this, "_ProductMfgDesc_elem" );
  }


  public final void setProductMfgDesc_elem( xsd.acord.ProductMfgDesc value ) {
    TYPE.get().setPropertyValue( this, "_ProductMfgDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDiscontinuedDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DiscontinuedDesc" );
  }


  public final void setDiscontinuedDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DiscontinuedDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DiscontinuedDesc getDiscontinuedDesc_elem() {
    return (xsd.acord.DiscontinuedDesc) TYPE.get().getPropertyValue( this, "_DiscontinuedDesc_elem" );
  }


  public final void setDiscontinuedDesc_elem( xsd.acord.DiscontinuedDesc value ) {
    TYPE.get().setPropertyValue( this, "_DiscontinuedDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModificationDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ModificationDesc" );
  }


  public final void setModificationDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ModificationDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModificationDesc getModificationDesc_elem() {
    return (xsd.acord.ModificationDesc) TYPE.get().getPropertyValue( this, "_ModificationDesc_elem" );
  }


  public final void setModificationDesc_elem( xsd.acord.ModificationDesc value ) {
    TYPE.get().setPropertyValue( this, "_ModificationDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getModificationReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ModificationReason" );
  }


  public final void setModificationReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ModificationReason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ModificationReason getModificationReason_elem() {
    return (xsd.acord.ModificationReason) TYPE.get().getPropertyValue( this, "_ModificationReason_elem" );
  }


  public final void setModificationReason_elem( xsd.acord.ModificationReason value ) {
    TYPE.get().setPropertyValue( this, "_ModificationReason_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLiquidChemDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LiquidChemDesc" );
  }


  public final void setLiquidChemDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LiquidChemDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LiquidChemDesc getLiquidChemDesc_elem() {
    return (xsd.acord.LiquidChemDesc) TYPE.get().getPropertyValue( this, "_LiquidChemDesc_elem" );
  }


  public final void setLiquidChemDesc_elem( xsd.acord.LiquidChemDesc value ) {
    TYPE.get().setPropertyValue( this, "_LiquidChemDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getHazardDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_HazardDesc" );
  }


  public final void setHazardDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_HazardDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HazardDesc getHazardDesc_elem() {
    return (xsd.acord.HazardDesc) TYPE.get().getPropertyValue( this, "_HazardDesc_elem" );
  }


  public final void setHazardDesc_elem( xsd.acord.HazardDesc value ) {
    TYPE.get().setPropertyValue( this, "_HazardDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRepairOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RepairOperationsDesc" );
  }


  public final void setRepairOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RepairOperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RepairOperationsDesc getRepairOperationsDesc_elem() {
    return (xsd.acord.RepairOperationsDesc) TYPE.get().getPropertyValue( this, "_RepairOperationsDesc_elem" );
  }


  public final void setRepairOperationsDesc_elem( xsd.acord.RepairOperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_RepairOperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AircraftOwnedServiced> getAircraftOwnedServiced() {
    return (java.util.List<xsd.acord.AircraftOwnedServiced>) TYPE.get().getPropertyValue( this, "_AircraftOwnedServiced" );
  }


  public final void setAircraftOwnedServiced( java.util.List<xsd.acord.AircraftOwnedServiced> value ) {
    TYPE.get().setPropertyValue( this, "_AircraftOwnedServiced", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceContractDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServiceContractDesc" );
  }


  public final void setServiceContractDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServiceContractDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ServiceContractDesc getServiceContractDesc_elem() {
    return (xsd.acord.ServiceContractDesc) TYPE.get().getPropertyValue( this, "_ServiceContractDesc_elem" );
  }


  public final void setServiceContractDesc_elem( xsd.acord.ServiceContractDesc value ) {
    TYPE.get().setPropertyValue( this, "_ServiceContractDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContractHarmlessDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContractHarmlessDesc" );
  }


  public final void setContractHarmlessDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContractHarmlessDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractHarmlessDesc getContractHarmlessDesc_elem() {
    return (xsd.acord.ContractHarmlessDesc) TYPE.get().getPropertyValue( this, "_ContractHarmlessDesc_elem" );
  }


  public final void setContractHarmlessDesc_elem( xsd.acord.ContractHarmlessDesc value ) {
    TYPE.get().setPropertyValue( this, "_ContractHarmlessDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SpacecraftInfo> getSpacecraftInfo() {
    return (java.util.List<xsd.acord.SpacecraftInfo>) TYPE.get().getPropertyValue( this, "_SpacecraftInfo" );
  }


  public final void setSpacecraftInfo( java.util.List<xsd.acord.SpacecraftInfo> value ) {
    TYPE.get().setPropertyValue( this, "_SpacecraftInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ProductManufacturing> getProductManufacturing() {
    return (java.util.List<xsd.acord.ProductManufacturing>) TYPE.get().getPropertyValue( this, "_ProductManufacturing" );
  }


  public final void setProductManufacturing( java.util.List<xsd.acord.ProductManufacturing> value ) {
    TYPE.get().setPropertyValue( this, "_ProductManufacturing", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}

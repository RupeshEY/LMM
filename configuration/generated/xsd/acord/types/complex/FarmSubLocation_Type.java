/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FarmSubLocation_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FarmSubLocation_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmRanchTypeCd = new javax.xml.namespace.QName( "", "FarmRanchTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandArea = new javax.xml.namespace.QName( "", "LandArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandUseCd = new javax.xml.namespace.QName( "", "LandUseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LandOwnershipCd = new javax.xml.namespace.QName( "", "LandOwnershipCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarmedByCd = new javax.xml.namespace.QName( "", "FarmedByCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoStructuresInd = new javax.xml.namespace.QName( "", "NoStructuresInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HorseOperationsInfo = new javax.xml.namespace.QName( "", "HorseOperationsInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FarmSubLocation_Type" );
    }
  };

  public FarmSubLocation_Type() {
    super( -356068383, TYPE.get() );
  }

  private FarmSubLocation_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -356068383, state );
  }

  protected FarmSubLocation_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FarmSubLocation_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.FarmSubLocation_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.FarmSubLocation_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.FarmRanchType> getFarmRanchTypeCd() {
    return (java.util.List<xsd.acord.enums.FarmRanchType>) TYPE.get().getPropertyValue( this, "_FarmRanchTypeCd" );
  }


  public final void setFarmRanchTypeCd( java.util.List<xsd.acord.enums.FarmRanchType> value ) {
    TYPE.get().setPropertyValue( this, "_FarmRanchTypeCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FarmRanchTypeCd> getFarmRanchTypeCd_elem() {
    return (java.util.List<xsd.acord.FarmRanchTypeCd>) TYPE.get().getPropertyValue( this, "_FarmRanchTypeCd_elem" );
  }


  public final void setFarmRanchTypeCd_elem( java.util.List<xsd.acord.FarmRanchTypeCd> value ) {
    TYPE.get().setPropertyValue( this, "_FarmRanchTypeCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPE.get().getPropertyValue( this, "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LandArea getLandArea() {
    return (xsd.acord.LandArea) TYPE.get().getPropertyValue( this, "_LandArea" );
  }


  public final void setLandArea( xsd.acord.LandArea value ) {
    TYPE.get().setPropertyValue( this, "_LandArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.LandUse> getLandUseCd() {
    return (java.util.List<xsd.acord.enums.LandUse>) TYPE.get().getPropertyValue( this, "_LandUseCd" );
  }


  public final void setLandUseCd( java.util.List<xsd.acord.enums.LandUse> value ) {
    TYPE.get().setPropertyValue( this, "_LandUseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LandUseCd> getLandUseCd_elem() {
    return (java.util.List<xsd.acord.LandUseCd>) TYPE.get().getPropertyValue( this, "_LandUseCd_elem" );
  }


  public final void setLandUseCd_elem( java.util.List<xsd.acord.LandUseCd> value ) {
    TYPE.get().setPropertyValue( this, "_LandUseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Ownership getLandOwnershipCd() {
    return (xsd.acord.enums.Ownership) TYPE.get().getPropertyValue( this, "_LandOwnershipCd" );
  }


  public final void setLandOwnershipCd( xsd.acord.enums.Ownership value ) {
    TYPE.get().setPropertyValue( this, "_LandOwnershipCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LandOwnershipCd getLandOwnershipCd_elem() {
    return (xsd.acord.LandOwnershipCd) TYPE.get().getPropertyValue( this, "_LandOwnershipCd_elem" );
  }


  public final void setLandOwnershipCd_elem( xsd.acord.LandOwnershipCd value ) {
    TYPE.get().setPropertyValue( this, "_LandOwnershipCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FarmedBy getFarmedByCd() {
    return (xsd.acord.enums.FarmedBy) TYPE.get().getPropertyValue( this, "_FarmedByCd" );
  }


  public final void setFarmedByCd( xsd.acord.enums.FarmedBy value ) {
    TYPE.get().setPropertyValue( this, "_FarmedByCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FarmedByCd getFarmedByCd_elem() {
    return (xsd.acord.FarmedByCd) TYPE.get().getPropertyValue( this, "_FarmedByCd_elem" );
  }


  public final void setFarmedByCd_elem( xsd.acord.FarmedByCd value ) {
    TYPE.get().setPropertyValue( this, "_FarmedByCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNoStructuresInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_NoStructuresInd" );
  }


  public final void setNoStructuresInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_NoStructuresInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NoStructuresInd getNoStructuresInd_elem() {
    return (xsd.acord.NoStructuresInd) TYPE.get().getPropertyValue( this, "_NoStructuresInd_elem" );
  }


  public final void setNoStructuresInd_elem( xsd.acord.NoStructuresInd value ) {
    TYPE.get().setPropertyValue( this, "_NoStructuresInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.HorseOperationsInfo> getHorseOperationsInfo() {
    return (java.util.List<xsd.acord.HorseOperationsInfo>) TYPE.get().getPropertyValue( this, "_HorseOperationsInfo" );
  }


  public final void setHorseOperationsInfo( java.util.List<xsd.acord.HorseOperationsInfo> value ) {
    TYPE.get().setPropertyValue( this, "_HorseOperationsInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubLocationRef", value );
  }

}
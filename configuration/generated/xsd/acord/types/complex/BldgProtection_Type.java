/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BldgProtection_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BldgProtection_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumFireDivisions = new javax.xml.namespace.QName( "", "NumFireDivisions", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnitsInFireDivisions = new javax.xml.namespace.QName( "", "NumUnitsInFireDivisions", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireProtectionClassCd = new javax.xml.namespace.QName( "", "FireProtectionClassCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceToFireStation = new javax.xml.namespace.QName( "", "DistanceToFireStation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DistanceToHydrant = new javax.xml.namespace.QName( "", "DistanceToHydrant", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FireExtinguisherInd = new javax.xml.namespace.QName( "", "FireExtinguisherInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionDeviceBurglarCd = new javax.xml.namespace.QName( "", "ProtectionDeviceBurglarCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionDeviceFireCd = new javax.xml.namespace.QName( "", "ProtectionDeviceFireCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionDeviceSmokeCd = new javax.xml.namespace.QName( "", "ProtectionDeviceSmokeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionDeviceSprinklerCd = new javax.xml.namespace.QName( "", "ProtectionDeviceSprinklerCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionClassGradeCd = new javax.xml.namespace.QName( "", "ProtectionClassGradeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectionClassImprovedInd = new javax.xml.namespace.QName( "", "ProtectionClassImprovedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DoorLockCd = new javax.xml.namespace.QName( "", "DoorLockCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SprinkleredPct = new javax.xml.namespace.QName( "", "SprinkleredPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SoleUnitInFireDivisionInd = new javax.xml.namespace.QName( "", "SoleUnitInFireDivisionInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumSmokeAlarms = new javax.xml.namespace.QName( "", "NumSmokeAlarms", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ElectricalProtectionCd = new javax.xml.namespace.QName( "", "ElectricalProtectionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherProtectionDesc = new javax.xml.namespace.QName( "", "OtherProtectionDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_KitchenProtectionInfo = new javax.xml.namespace.QName( "", "KitchenProtectionInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WaterSourceCd = new javax.xml.namespace.QName( "", "WaterSourceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WaterQuantityCd = new javax.xml.namespace.QName( "", "WaterQuantityCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BldgProtection_Type" );
    }
  };

  public BldgProtection_Type() {
    super( 570899916, TYPE.get() );
  }

  private BldgProtection_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 570899916, state );
  }

  protected BldgProtection_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BldgProtection_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BldgProtection_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BldgProtection_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumFireDivisions() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumFireDivisions" );
  }


  public final void setNumFireDivisions( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumFireDivisions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumFireDivisions getNumFireDivisions_elem() {
    return (xsd.acord.NumFireDivisions) TYPE.get().getPropertyValue( this, "_NumFireDivisions_elem" );
  }


  public final void setNumFireDivisions_elem( xsd.acord.NumFireDivisions value ) {
    TYPE.get().setPropertyValue( this, "_NumFireDivisions_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumUnitsInFireDivisions() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumUnitsInFireDivisions" );
  }


  public final void setNumUnitsInFireDivisions( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumUnitsInFireDivisions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnitsInFireDivisions getNumUnitsInFireDivisions_elem() {
    return (xsd.acord.NumUnitsInFireDivisions) TYPE.get().getPropertyValue( this, "_NumUnitsInFireDivisions_elem" );
  }


  public final void setNumUnitsInFireDivisions_elem( xsd.acord.NumUnitsInFireDivisions value ) {
    TYPE.get().setPropertyValue( this, "_NumUnitsInFireDivisions_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFireProtectionClassCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FireProtectionClassCd" );
  }


  public final void setFireProtectionClassCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FireProtectionClassCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireProtectionClassCd getFireProtectionClassCd_elem() {
    return (xsd.acord.FireProtectionClassCd) TYPE.get().getPropertyValue( this, "_FireProtectionClassCd_elem" );
  }


  public final void setFireProtectionClassCd_elem( xsd.acord.FireProtectionClassCd value ) {
    TYPE.get().setPropertyValue( this, "_FireProtectionClassCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DistanceToFireStation getDistanceToFireStation() {
    return (xsd.acord.DistanceToFireStation) TYPE.get().getPropertyValue( this, "_DistanceToFireStation" );
  }


  public final void setDistanceToFireStation( xsd.acord.DistanceToFireStation value ) {
    TYPE.get().setPropertyValue( this, "_DistanceToFireStation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DistanceToHydrant getDistanceToHydrant() {
    return (xsd.acord.DistanceToHydrant) TYPE.get().getPropertyValue( this, "_DistanceToHydrant" );
  }


  public final void setDistanceToHydrant( xsd.acord.DistanceToHydrant value ) {
    TYPE.get().setPropertyValue( this, "_DistanceToHydrant", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFireExtinguisherInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FireExtinguisherInd" );
  }


  public final void setFireExtinguisherInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FireExtinguisherInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FireExtinguisherInd getFireExtinguisherInd_elem() {
    return (xsd.acord.FireExtinguisherInd) TYPE.get().getPropertyValue( this, "_FireExtinguisherInd_elem" );
  }


  public final void setFireExtinguisherInd_elem( xsd.acord.FireExtinguisherInd value ) {
    TYPE.get().setPropertyValue( this, "_FireExtinguisherInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ProtectionDevice getProtectionDeviceBurglarCd() {
    return (xsd.acord.enums.ProtectionDevice) TYPE.get().getPropertyValue( this, "_ProtectionDeviceBurglarCd" );
  }


  public final void setProtectionDeviceBurglarCd( xsd.acord.enums.ProtectionDevice value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceBurglarCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionDeviceBurglarCd getProtectionDeviceBurglarCd_elem() {
    return (xsd.acord.ProtectionDeviceBurglarCd) TYPE.get().getPropertyValue( this, "_ProtectionDeviceBurglarCd_elem" );
  }


  public final void setProtectionDeviceBurglarCd_elem( xsd.acord.ProtectionDeviceBurglarCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceBurglarCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ProtectionDevice getProtectionDeviceFireCd() {
    return (xsd.acord.enums.ProtectionDevice) TYPE.get().getPropertyValue( this, "_ProtectionDeviceFireCd" );
  }


  public final void setProtectionDeviceFireCd( xsd.acord.enums.ProtectionDevice value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceFireCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionDeviceFireCd getProtectionDeviceFireCd_elem() {
    return (xsd.acord.ProtectionDeviceFireCd) TYPE.get().getPropertyValue( this, "_ProtectionDeviceFireCd_elem" );
  }


  public final void setProtectionDeviceFireCd_elem( xsd.acord.ProtectionDeviceFireCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceFireCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ProtectionDevice getProtectionDeviceSmokeCd() {
    return (xsd.acord.enums.ProtectionDevice) TYPE.get().getPropertyValue( this, "_ProtectionDeviceSmokeCd" );
  }


  public final void setProtectionDeviceSmokeCd( xsd.acord.enums.ProtectionDevice value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceSmokeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionDeviceSmokeCd getProtectionDeviceSmokeCd_elem() {
    return (xsd.acord.ProtectionDeviceSmokeCd) TYPE.get().getPropertyValue( this, "_ProtectionDeviceSmokeCd_elem" );
  }


  public final void setProtectionDeviceSmokeCd_elem( xsd.acord.ProtectionDeviceSmokeCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceSmokeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ProtectionDevice getProtectionDeviceSprinklerCd() {
    return (xsd.acord.enums.ProtectionDevice) TYPE.get().getPropertyValue( this, "_ProtectionDeviceSprinklerCd" );
  }


  public final void setProtectionDeviceSprinklerCd( xsd.acord.enums.ProtectionDevice value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceSprinklerCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionDeviceSprinklerCd getProtectionDeviceSprinklerCd_elem() {
    return (xsd.acord.ProtectionDeviceSprinklerCd) TYPE.get().getPropertyValue( this, "_ProtectionDeviceSprinklerCd_elem" );
  }


  public final void setProtectionDeviceSprinklerCd_elem( xsd.acord.ProtectionDeviceSprinklerCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionDeviceSprinklerCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProtectionClassGradeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProtectionClassGradeCd" );
  }


  public final void setProtectionClassGradeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionClassGradeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionClassGradeCd getProtectionClassGradeCd_elem() {
    return (xsd.acord.ProtectionClassGradeCd) TYPE.get().getPropertyValue( this, "_ProtectionClassGradeCd_elem" );
  }


  public final void setProtectionClassGradeCd_elem( xsd.acord.ProtectionClassGradeCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionClassGradeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getProtectionClassImprovedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ProtectionClassImprovedInd" );
  }


  public final void setProtectionClassImprovedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionClassImprovedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectionClassImprovedInd getProtectionClassImprovedInd_elem() {
    return (xsd.acord.ProtectionClassImprovedInd) TYPE.get().getPropertyValue( this, "_ProtectionClassImprovedInd_elem" );
  }


  public final void setProtectionClassImprovedInd_elem( xsd.acord.ProtectionClassImprovedInd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectionClassImprovedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DoorLockType getDoorLockCd() {
    return (xsd.acord.enums.DoorLockType) TYPE.get().getPropertyValue( this, "_DoorLockCd" );
  }


  public final void setDoorLockCd( xsd.acord.enums.DoorLockType value ) {
    TYPE.get().setPropertyValue( this, "_DoorLockCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DoorLockCd getDoorLockCd_elem() {
    return (xsd.acord.DoorLockCd) TYPE.get().getPropertyValue( this, "_DoorLockCd_elem" );
  }


  public final void setDoorLockCd_elem( xsd.acord.DoorLockCd value ) {
    TYPE.get().setPropertyValue( this, "_DoorLockCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getSprinkleredPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_SprinkleredPct" );
  }


  public final void setSprinkleredPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_SprinkleredPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SprinkleredPct getSprinkleredPct_elem() {
    return (xsd.acord.SprinkleredPct) TYPE.get().getPropertyValue( this, "_SprinkleredPct_elem" );
  }


  public final void setSprinkleredPct_elem( xsd.acord.SprinkleredPct value ) {
    TYPE.get().setPropertyValue( this, "_SprinkleredPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSoleUnitInFireDivisionInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_SoleUnitInFireDivisionInd" );
  }


  public final void setSoleUnitInFireDivisionInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_SoleUnitInFireDivisionInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SoleUnitInFireDivisionInd getSoleUnitInFireDivisionInd_elem() {
    return (xsd.acord.SoleUnitInFireDivisionInd) TYPE.get().getPropertyValue( this, "_SoleUnitInFireDivisionInd_elem" );
  }


  public final void setSoleUnitInFireDivisionInd_elem( xsd.acord.SoleUnitInFireDivisionInd value ) {
    TYPE.get().setPropertyValue( this, "_SoleUnitInFireDivisionInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumSmokeAlarms() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumSmokeAlarms" );
  }


  public final void setNumSmokeAlarms( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumSmokeAlarms", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumSmokeAlarms getNumSmokeAlarms_elem() {
    return (xsd.acord.NumSmokeAlarms) TYPE.get().getPropertyValue( this, "_NumSmokeAlarms_elem" );
  }


  public final void setNumSmokeAlarms_elem( xsd.acord.NumSmokeAlarms value ) {
    TYPE.get().setPropertyValue( this, "_NumSmokeAlarms_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.ElectricalProtection> getElectricalProtectionCd() {
    return (java.util.List<xsd.acord.enums.ElectricalProtection>) TYPE.get().getPropertyValue( this, "_ElectricalProtectionCd" );
  }


  public final void setElectricalProtectionCd( java.util.List<xsd.acord.enums.ElectricalProtection> value ) {
    TYPE.get().setPropertyValue( this, "_ElectricalProtectionCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ElectricalProtectionCd> getElectricalProtectionCd_elem() {
    return (java.util.List<xsd.acord.ElectricalProtectionCd>) TYPE.get().getPropertyValue( this, "_ElectricalProtectionCd_elem" );
  }


  public final void setElectricalProtectionCd_elem( java.util.List<xsd.acord.ElectricalProtectionCd> value ) {
    TYPE.get().setPropertyValue( this, "_ElectricalProtectionCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherProtectionDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OtherProtectionDesc" );
  }


  public final void setOtherProtectionDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OtherProtectionDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherProtectionDesc getOtherProtectionDesc_elem() {
    return (xsd.acord.OtherProtectionDesc) TYPE.get().getPropertyValue( this, "_OtherProtectionDesc_elem" );
  }


  public final void setOtherProtectionDesc_elem( xsd.acord.OtherProtectionDesc value ) {
    TYPE.get().setPropertyValue( this, "_OtherProtectionDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.KitchenProtectionInfo getKitchenProtectionInfo() {
    return (xsd.acord.KitchenProtectionInfo) TYPE.get().getPropertyValue( this, "_KitchenProtectionInfo" );
  }


  public final void setKitchenProtectionInfo( xsd.acord.KitchenProtectionInfo value ) {
    TYPE.get().setPropertyValue( this, "_KitchenProtectionInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WaterSource getWaterSourceCd() {
    return (xsd.acord.enums.WaterSource) TYPE.get().getPropertyValue( this, "_WaterSourceCd" );
  }


  public final void setWaterSourceCd( xsd.acord.enums.WaterSource value ) {
    TYPE.get().setPropertyValue( this, "_WaterSourceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WaterSourceCd getWaterSourceCd_elem() {
    return (xsd.acord.WaterSourceCd) TYPE.get().getPropertyValue( this, "_WaterSourceCd_elem" );
  }


  public final void setWaterSourceCd_elem( xsd.acord.WaterSourceCd value ) {
    TYPE.get().setPropertyValue( this, "_WaterSourceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WaterQuantity getWaterQuantityCd() {
    return (xsd.acord.enums.WaterQuantity) TYPE.get().getPropertyValue( this, "_WaterQuantityCd" );
  }


  public final void setWaterQuantityCd( xsd.acord.enums.WaterQuantity value ) {
    TYPE.get().setPropertyValue( this, "_WaterQuantityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WaterQuantityCd getWaterQuantityCd_elem() {
    return (xsd.acord.WaterQuantityCd) TYPE.get().getPropertyValue( this, "_WaterQuantityCd_elem" );
  }


  public final void setWaterQuantityCd_elem( xsd.acord.WaterQuantityCd value ) {
    TYPE.get().setPropertyValue( this, "_WaterQuantityCd_elem", value );
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
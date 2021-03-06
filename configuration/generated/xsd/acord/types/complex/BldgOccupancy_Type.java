/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BldgOccupancy_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BldgOccupancy_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnitsOwnerOccupied = new javax.xml.namespace.QName( "", "NumUnitsOwnerOccupied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VacantUnoccupiedCd = new javax.xml.namespace.QName( "", "VacantUnoccupiedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupiedPct = new javax.xml.namespace.QName( "", "OccupiedPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AreaOccupied = new javax.xml.namespace.QName( "", "AreaOccupied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AreaUnoccupied = new javax.xml.namespace.QName( "", "AreaUnoccupied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AreaOpenToPublic = new javax.xml.namespace.QName( "", "AreaOpenToPublic", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupancyDesc = new javax.xml.namespace.QName( "", "OccupancyDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NatureBusinessCd = new javax.xml.namespace.QName( "", "NatureBusinessCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesFullTime = new javax.xml.namespace.QName( "", "NumEmployeesFullTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesPartTime = new javax.xml.namespace.QName( "", "NumEmployeesPartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RepairServiceDesc = new javax.xml.namespace.QName( "", "RepairServiceDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeOccupancyType = new javax.xml.namespace.QName( "", "LengthTimeOccupancyType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PriorNatureBusinessCd = new javax.xml.namespace.QName( "", "PriorNatureBusinessCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupiedDuringConstructionInd = new javax.xml.namespace.QName( "", "OccupiedDuringConstructionInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AreaLeasedInd = new javax.xml.namespace.QName( "", "AreaLeasedInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BldgOccupancy_Type" );
    }
  };

  public BldgOccupancy_Type() {
    super( -1809257024, TYPE.get() );
  }

  private BldgOccupancy_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1809257024, state );
  }

  protected BldgOccupancy_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BldgOccupancy_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BldgOccupancy_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BldgOccupancy_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumUnitsOwnerOccupied() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumUnitsOwnerOccupied" );
  }


  public final void setNumUnitsOwnerOccupied( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumUnitsOwnerOccupied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnitsOwnerOccupied getNumUnitsOwnerOccupied_elem() {
    return (xsd.acord.NumUnitsOwnerOccupied) TYPE.get().getPropertyValue( this, "_NumUnitsOwnerOccupied_elem" );
  }


  public final void setNumUnitsOwnerOccupied_elem( xsd.acord.NumUnitsOwnerOccupied value ) {
    TYPE.get().setPropertyValue( this, "_NumUnitsOwnerOccupied_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.VacantOccupiedIndicator getVacantUnoccupiedCd() {
    return (xsd.acord.enums.VacantOccupiedIndicator) TYPE.get().getPropertyValue( this, "_VacantUnoccupiedCd" );
  }


  public final void setVacantUnoccupiedCd( xsd.acord.enums.VacantOccupiedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_VacantUnoccupiedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VacantUnoccupiedCd getVacantUnoccupiedCd_elem() {
    return (xsd.acord.VacantUnoccupiedCd) TYPE.get().getPropertyValue( this, "_VacantUnoccupiedCd_elem" );
  }


  public final void setVacantUnoccupiedCd_elem( xsd.acord.VacantUnoccupiedCd value ) {
    TYPE.get().setPropertyValue( this, "_VacantUnoccupiedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getOccupiedPct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_OccupiedPct" );
  }


  public final void setOccupiedPct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_OccupiedPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupiedPct getOccupiedPct_elem() {
    return (xsd.acord.OccupiedPct) TYPE.get().getPropertyValue( this, "_OccupiedPct_elem" );
  }


  public final void setOccupiedPct_elem( xsd.acord.OccupiedPct value ) {
    TYPE.get().setPropertyValue( this, "_OccupiedPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AreaOccupied getAreaOccupied() {
    return (xsd.acord.AreaOccupied) TYPE.get().getPropertyValue( this, "_AreaOccupied" );
  }


  public final void setAreaOccupied( xsd.acord.AreaOccupied value ) {
    TYPE.get().setPropertyValue( this, "_AreaOccupied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AreaUnoccupied getAreaUnoccupied() {
    return (xsd.acord.AreaUnoccupied) TYPE.get().getPropertyValue( this, "_AreaUnoccupied" );
  }


  public final void setAreaUnoccupied( xsd.acord.AreaUnoccupied value ) {
    TYPE.get().setPropertyValue( this, "_AreaUnoccupied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AreaOpenToPublic getAreaOpenToPublic() {
    return (xsd.acord.AreaOpenToPublic) TYPE.get().getPropertyValue( this, "_AreaOpenToPublic" );
  }


  public final void setAreaOpenToPublic( xsd.acord.AreaOpenToPublic value ) {
    TYPE.get().setPropertyValue( this, "_AreaOpenToPublic", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOccupancyDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OccupancyDesc" );
  }


  public final void setOccupancyDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupancyDesc getOccupancyDesc_elem() {
    return (xsd.acord.OccupancyDesc) TYPE.get().getPropertyValue( this, "_OccupancyDesc_elem" );
  }


  public final void setOccupancyDesc_elem( xsd.acord.OccupancyDesc value ) {
    TYPE.get().setPropertyValue( this, "_OccupancyDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.NatureOfBusiness> getNatureBusinessCd() {
    return (java.util.List<xsd.acord.enums.NatureOfBusiness>) TYPE.get().getPropertyValue( this, "_NatureBusinessCd" );
  }


  public final void setNatureBusinessCd( java.util.List<xsd.acord.enums.NatureOfBusiness> value ) {
    TYPE.get().setPropertyValue( this, "_NatureBusinessCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.NatureBusinessCd> getNatureBusinessCd_elem() {
    return (java.util.List<xsd.acord.NatureBusinessCd>) TYPE.get().getPropertyValue( this, "_NatureBusinessCd_elem" );
  }


  public final void setNatureBusinessCd_elem( java.util.List<xsd.acord.NatureBusinessCd> value ) {
    TYPE.get().setPropertyValue( this, "_NatureBusinessCd_elem", value );
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
  public final java.lang.Integer getNumEmployees() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumEmployees" );
  }


  public final void setNumEmployees( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployees getNumEmployees_elem() {
    return (xsd.acord.NumEmployees) TYPE.get().getPropertyValue( this, "_NumEmployees_elem" );
  }


  public final void setNumEmployees_elem( xsd.acord.NumEmployees value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesFullTime() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumEmployeesFullTime" );
  }


  public final void setNumEmployeesFullTime( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployeesFullTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesFullTime getNumEmployeesFullTime_elem() {
    return (xsd.acord.NumEmployeesFullTime) TYPE.get().getPropertyValue( this, "_NumEmployeesFullTime_elem" );
  }


  public final void setNumEmployeesFullTime_elem( xsd.acord.NumEmployeesFullTime value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployeesFullTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesPartTime() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumEmployeesPartTime" );
  }


  public final void setNumEmployeesPartTime( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployeesPartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesPartTime getNumEmployeesPartTime_elem() {
    return (xsd.acord.NumEmployeesPartTime) TYPE.get().getPropertyValue( this, "_NumEmployeesPartTime_elem" );
  }


  public final void setNumEmployeesPartTime_elem( xsd.acord.NumEmployeesPartTime value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployeesPartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRepairServiceDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RepairServiceDesc" );
  }


  public final void setRepairServiceDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RepairServiceDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RepairServiceDesc getRepairServiceDesc_elem() {
    return (xsd.acord.RepairServiceDesc) TYPE.get().getPropertyValue( this, "_RepairServiceDesc_elem" );
  }


  public final void setRepairServiceDesc_elem( xsd.acord.RepairServiceDesc value ) {
    TYPE.get().setPropertyValue( this, "_RepairServiceDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthTimeOccupancyType getLengthTimeOccupancyType() {
    return (xsd.acord.LengthTimeOccupancyType) TYPE.get().getPropertyValue( this, "_LengthTimeOccupancyType" );
  }


  public final void setLengthTimeOccupancyType( xsd.acord.LengthTimeOccupancyType value ) {
    TYPE.get().setPropertyValue( this, "_LengthTimeOccupancyType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.NatureOfBusiness getPriorNatureBusinessCd() {
    return (xsd.acord.enums.NatureOfBusiness) TYPE.get().getPropertyValue( this, "_PriorNatureBusinessCd" );
  }


  public final void setPriorNatureBusinessCd( xsd.acord.enums.NatureOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_PriorNatureBusinessCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PriorNatureBusinessCd getPriorNatureBusinessCd_elem() {
    return (xsd.acord.PriorNatureBusinessCd) TYPE.get().getPropertyValue( this, "_PriorNatureBusinessCd_elem" );
  }


  public final void setPriorNatureBusinessCd_elem( xsd.acord.PriorNatureBusinessCd value ) {
    TYPE.get().setPropertyValue( this, "_PriorNatureBusinessCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOccupiedDuringConstructionInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OccupiedDuringConstructionInd" );
  }


  public final void setOccupiedDuringConstructionInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OccupiedDuringConstructionInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OccupiedDuringConstructionInd getOccupiedDuringConstructionInd_elem() {
    return (xsd.acord.OccupiedDuringConstructionInd) TYPE.get().getPropertyValue( this, "_OccupiedDuringConstructionInd_elem" );
  }


  public final void setOccupiedDuringConstructionInd_elem( xsd.acord.OccupiedDuringConstructionInd value ) {
    TYPE.get().setPropertyValue( this, "_OccupiedDuringConstructionInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAreaLeasedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AreaLeasedInd" );
  }


  public final void setAreaLeasedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AreaLeasedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AreaLeasedInd getAreaLeasedInd_elem() {
    return (xsd.acord.AreaLeasedInd) TYPE.get().getPropertyValue( this, "_AreaLeasedInd_elem" );
  }


  public final void setAreaLeasedInd_elem( xsd.acord.AreaLeasedInd value ) {
    TYPE.get().setPropertyValue( this, "_AreaLeasedInd_elem", value );
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

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReplCostDetail_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ReplCostDetail_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DetachedStructureTotalAmt = new javax.xml.namespace.QName( "", "DetachedStructureTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EquipmentTotalAmt = new javax.xml.namespace.QName( "", "EquipmentTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LaborTotalAmt = new javax.xml.namespace.QName( "", "LaborTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MaterialTotalAmt = new javax.xml.namespace.QName( "", "MaterialTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubTotalAmt = new javax.xml.namespace.QName( "", "SubTotalAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalInsurableReplCostAmt = new javax.xml.namespace.QName( "", "TotalInsurableReplCostAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DetailCost = new javax.xml.namespace.QName( "", "DetailCost", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ReplCostDetail_Type" );
    }
  };

  public ReplCostDetail_Type() {
    super( -2012374043, TYPE.get() );
  }

  private ReplCostDetail_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2012374043, state );
  }

  protected ReplCostDetail_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReplCostDetail_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ReplCostDetail_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ReplCostDetail_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DetachedStructureTotalAmt getDetachedStructureTotalAmt() {
    return (xsd.acord.DetachedStructureTotalAmt) TYPE.get().getPropertyValue( this, "_DetachedStructureTotalAmt" );
  }


  public final void setDetachedStructureTotalAmt( xsd.acord.DetachedStructureTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_DetachedStructureTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EquipmentTotalAmt getEquipmentTotalAmt() {
    return (xsd.acord.EquipmentTotalAmt) TYPE.get().getPropertyValue( this, "_EquipmentTotalAmt" );
  }


  public final void setEquipmentTotalAmt( xsd.acord.EquipmentTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_EquipmentTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LaborTotalAmt getLaborTotalAmt() {
    return (xsd.acord.LaborTotalAmt) TYPE.get().getPropertyValue( this, "_LaborTotalAmt" );
  }


  public final void setLaborTotalAmt( xsd.acord.LaborTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_LaborTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MaterialTotalAmt getMaterialTotalAmt() {
    return (xsd.acord.MaterialTotalAmt) TYPE.get().getPropertyValue( this, "_MaterialTotalAmt" );
  }


  public final void setMaterialTotalAmt( xsd.acord.MaterialTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_MaterialTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SubTotalAmt getSubTotalAmt() {
    return (xsd.acord.SubTotalAmt) TYPE.get().getPropertyValue( this, "_SubTotalAmt" );
  }


  public final void setSubTotalAmt( xsd.acord.SubTotalAmt value ) {
    TYPE.get().setPropertyValue( this, "_SubTotalAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalInsurableReplCostAmt getTotalInsurableReplCostAmt() {
    return (xsd.acord.TotalInsurableReplCostAmt) TYPE.get().getPropertyValue( this, "_TotalInsurableReplCostAmt" );
  }


  public final void setTotalInsurableReplCostAmt( xsd.acord.TotalInsurableReplCostAmt value ) {
    TYPE.get().setPropertyValue( this, "_TotalInsurableReplCostAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.DetailCost> getDetailCost() {
    return (java.util.List<xsd.acord.DetailCost>) TYPE.get().getPropertyValue( this, "_DetailCost" );
  }


  public final void setDetailCost( java.util.List<xsd.acord.DetailCost> value ) {
    TYPE.get().setPropertyValue( this, "_DetailCost", value );
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

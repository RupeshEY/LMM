/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GarageInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "GarageInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GarageTypeCd = new javax.xml.namespace.QName( "", "GarageTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachedInd = new javax.xml.namespace.QName( "", "AttachedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BasementUnderGarageInd = new javax.xml.namespace.QName( "", "BasementUnderGarageInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGarages = new javax.xml.namespace.QName( "", "NumGarages", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehs = new javax.xml.namespace.QName( "", "NumVehs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurfaceArea = new javax.xml.namespace.QName( "", "SurfaceArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodOpeningsInd = new javax.xml.namespace.QName( "", "FloodOpeningsInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPermanentOpenings = new javax.xml.namespace.QName( "", "NumPermanentOpenings", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PermanentOpeningsArea = new javax.xml.namespace.QName( "", "PermanentOpeningsArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonGarageUseInd = new javax.xml.namespace.QName( "", "NonGarageUseInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EquipmentInd = new javax.xml.namespace.QName( "", "EquipmentInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.GarageInfo_Type" );
    }
  };

  public GarageInfo_Type() {
    super( -1379598275, TYPE.get() );
  }

  private GarageInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1379598275, state );
  }

  protected GarageInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GarageInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.GarageInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.GarageInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.GarageType getGarageTypeCd() {
    return (xsd.acord.enums.GarageType) TYPE.get().getPropertyValue( this, "_GarageTypeCd" );
  }


  public final void setGarageTypeCd( xsd.acord.enums.GarageType value ) {
    TYPE.get().setPropertyValue( this, "_GarageTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GarageTypeCd getGarageTypeCd_elem() {
    return (xsd.acord.GarageTypeCd) TYPE.get().getPropertyValue( this, "_GarageTypeCd_elem" );
  }


  public final void setGarageTypeCd_elem( xsd.acord.GarageTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_GarageTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAttachedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AttachedInd" );
  }


  public final void setAttachedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AttachedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AttachedInd getAttachedInd_elem() {
    return (xsd.acord.AttachedInd) TYPE.get().getPropertyValue( this, "_AttachedInd_elem" );
  }


  public final void setAttachedInd_elem( xsd.acord.AttachedInd value ) {
    TYPE.get().setPropertyValue( this, "_AttachedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBasementUnderGarageInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_BasementUnderGarageInd" );
  }


  public final void setBasementUnderGarageInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_BasementUnderGarageInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BasementUnderGarageInd getBasementUnderGarageInd_elem() {
    return (xsd.acord.BasementUnderGarageInd) TYPE.get().getPropertyValue( this, "_BasementUnderGarageInd_elem" );
  }


  public final void setBasementUnderGarageInd_elem( xsd.acord.BasementUnderGarageInd value ) {
    TYPE.get().setPropertyValue( this, "_BasementUnderGarageInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGarages() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumGarages" );
  }


  public final void setNumGarages( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumGarages", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGarages getNumGarages_elem() {
    return (xsd.acord.NumGarages) TYPE.get().getPropertyValue( this, "_NumGarages_elem" );
  }


  public final void setNumGarages_elem( xsd.acord.NumGarages value ) {
    TYPE.get().setPropertyValue( this, "_NumGarages_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehs() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumVehs" );
  }


  public final void setNumVehs( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumVehs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehs getNumVehs_elem() {
    return (xsd.acord.NumVehs) TYPE.get().getPropertyValue( this, "_NumVehs_elem" );
  }


  public final void setNumVehs_elem( xsd.acord.NumVehs value ) {
    TYPE.get().setPropertyValue( this, "_NumVehs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SurfaceArea getSurfaceArea() {
    return (xsd.acord.SurfaceArea) TYPE.get().getPropertyValue( this, "_SurfaceArea" );
  }


  public final void setSurfaceArea( xsd.acord.SurfaceArea value ) {
    TYPE.get().setPropertyValue( this, "_SurfaceArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFloodOpeningsInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FloodOpeningsInd" );
  }


  public final void setFloodOpeningsInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FloodOpeningsInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodOpeningsInd getFloodOpeningsInd_elem() {
    return (xsd.acord.FloodOpeningsInd) TYPE.get().getPropertyValue( this, "_FloodOpeningsInd_elem" );
  }


  public final void setFloodOpeningsInd_elem( xsd.acord.FloodOpeningsInd value ) {
    TYPE.get().setPropertyValue( this, "_FloodOpeningsInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPermanentOpenings() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumPermanentOpenings" );
  }


  public final void setNumPermanentOpenings( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumPermanentOpenings", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPermanentOpenings getNumPermanentOpenings_elem() {
    return (xsd.acord.NumPermanentOpenings) TYPE.get().getPropertyValue( this, "_NumPermanentOpenings_elem" );
  }


  public final void setNumPermanentOpenings_elem( xsd.acord.NumPermanentOpenings value ) {
    TYPE.get().setPropertyValue( this, "_NumPermanentOpenings_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PermanentOpeningsArea getPermanentOpeningsArea() {
    return (xsd.acord.PermanentOpeningsArea) TYPE.get().getPropertyValue( this, "_PermanentOpeningsArea" );
  }


  public final void setPermanentOpeningsArea( xsd.acord.PermanentOpeningsArea value ) {
    TYPE.get().setPropertyValue( this, "_PermanentOpeningsArea", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getNonGarageUseInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_NonGarageUseInd" );
  }


  public final void setNonGarageUseInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_NonGarageUseInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NonGarageUseInd getNonGarageUseInd_elem() {
    return (xsd.acord.NonGarageUseInd) TYPE.get().getPropertyValue( this, "_NonGarageUseInd_elem" );
  }


  public final void setNonGarageUseInd_elem( xsd.acord.NonGarageUseInd value ) {
    TYPE.get().setPropertyValue( this, "_NonGarageUseInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getEquipmentInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_EquipmentInd" );
  }


  public final void setEquipmentInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_EquipmentInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EquipmentInd getEquipmentInd_elem() {
    return (xsd.acord.EquipmentInd) TYPE.get().getPropertyValue( this, "_EquipmentInd_elem" );
  }


  public final void setEquipmentInd_elem( xsd.acord.EquipmentInd value ) {
    TYPE.get().setPropertyValue( this, "_EquipmentInd_elem", value );
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

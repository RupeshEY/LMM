/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DetachedStructuresInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DetachedStructuresInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DetachedStructureTypeCd = new javax.xml.namespace.QName( "", "DetachedStructureTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthHandrail = new javax.xml.namespace.QName( "", "LengthHandrail", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDetachedStructures = new javax.xml.namespace.QName( "", "NumDetachedStructures", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlayingSurfaceCd = new javax.xml.namespace.QName( "", "PlayingSurfaceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SurfaceArea = new javax.xml.namespace.QName( "", "SurfaceArea", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UseCd = new javax.xml.namespace.QName( "", "UseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Construction = new javax.xml.namespace.QName( "", "Construction", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HeatingUnitInfo = new javax.xml.namespace.QName( "", "HeatingUnitInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DetachedStructuresInfo_Type" );
    }
  };

  public DetachedStructuresInfo_Type() {
    super( 705585106, TYPE.get() );
  }

  private DetachedStructuresInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 705585106, state );
  }

  protected DetachedStructuresInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DetachedStructuresInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.DetachedStructuresInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.DetachedStructuresInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DetachedStructureType getDetachedStructureTypeCd() {
    return (xsd.acord.enums.DetachedStructureType) TYPE.get().getPropertyValue( this, "_DetachedStructureTypeCd" );
  }


  public final void setDetachedStructureTypeCd( xsd.acord.enums.DetachedStructureType value ) {
    TYPE.get().setPropertyValue( this, "_DetachedStructureTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DetachedStructureTypeCd getDetachedStructureTypeCd_elem() {
    return (xsd.acord.DetachedStructureTypeCd) TYPE.get().getPropertyValue( this, "_DetachedStructureTypeCd_elem" );
  }


  public final void setDetachedStructureTypeCd_elem( xsd.acord.DetachedStructureTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_DetachedStructureTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LengthHandrail getLengthHandrail() {
    return (xsd.acord.LengthHandrail) TYPE.get().getPropertyValue( this, "_LengthHandrail" );
  }


  public final void setLengthHandrail( xsd.acord.LengthHandrail value ) {
    TYPE.get().setPropertyValue( this, "_LengthHandrail", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDetachedStructures() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDetachedStructures" );
  }


  public final void setNumDetachedStructures( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDetachedStructures", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDetachedStructures getNumDetachedStructures_elem() {
    return (xsd.acord.NumDetachedStructures) TYPE.get().getPropertyValue( this, "_NumDetachedStructures_elem" );
  }


  public final void setNumDetachedStructures_elem( xsd.acord.NumDetachedStructures value ) {
    TYPE.get().setPropertyValue( this, "_NumDetachedStructures_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PlayingSurface getPlayingSurfaceCd() {
    return (xsd.acord.enums.PlayingSurface) TYPE.get().getPropertyValue( this, "_PlayingSurfaceCd" );
  }


  public final void setPlayingSurfaceCd( xsd.acord.enums.PlayingSurface value ) {
    TYPE.get().setPropertyValue( this, "_PlayingSurfaceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PlayingSurfaceCd getPlayingSurfaceCd_elem() {
    return (xsd.acord.PlayingSurfaceCd) TYPE.get().getPropertyValue( this, "_PlayingSurfaceCd_elem" );
  }


  public final void setPlayingSurfaceCd_elem( xsd.acord.PlayingSurfaceCd value ) {
    TYPE.get().setPropertyValue( this, "_PlayingSurfaceCd_elem", value );
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
  public final xsd.acord.enums.Use getUseCd() {
    return (xsd.acord.enums.Use) TYPE.get().getPropertyValue( this, "_UseCd" );
  }


  public final void setUseCd( xsd.acord.enums.Use value ) {
    TYPE.get().setPropertyValue( this, "_UseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UseCd getUseCd_elem() {
    return (xsd.acord.UseCd) TYPE.get().getPropertyValue( this, "_UseCd_elem" );
  }


  public final void setUseCd_elem( xsd.acord.UseCd value ) {
    TYPE.get().setPropertyValue( this, "_UseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Construction getConstruction() {
    return (xsd.acord.Construction) TYPE.get().getPropertyValue( this, "_Construction" );
  }


  public final void setConstruction( xsd.acord.Construction value ) {
    TYPE.get().setPropertyValue( this, "_Construction", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HeatingUnitInfo getHeatingUnitInfo() {
    return (xsd.acord.HeatingUnitInfo) TYPE.get().getPropertyValue( this, "_HeatingUnitInfo" );
  }


  public final void setHeatingUnitInfo( xsd.acord.HeatingUnitInfo value ) {
    TYPE.get().setPropertyValue( this, "_HeatingUnitInfo", value );
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
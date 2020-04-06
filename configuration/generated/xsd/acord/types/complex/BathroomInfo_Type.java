/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BathroomInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BathroomInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumBathrooms = new javax.xml.namespace.QName( "", "NumBathrooms", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConstructionQualityCd = new javax.xml.namespace.QName( "", "ConstructionQualityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BathroomTypeCd = new javax.xml.namespace.QName( "", "BathroomTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumAdditionalFixtures = new javax.xml.namespace.QName( "", "NumAdditionalFixtures", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BathroomInfo_Type" );
    }
  };

  public BathroomInfo_Type() {
    super( -1149718858, TYPE.get() );
  }

  private BathroomInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1149718858, state );
  }

  protected BathroomInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BathroomInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BathroomInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BathroomInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumBathrooms() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumBathrooms" );
  }


  public final void setNumBathrooms( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumBathrooms", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumBathrooms getNumBathrooms_elem() {
    return (xsd.acord.NumBathrooms) TYPE.get().getPropertyValue( this, "_NumBathrooms_elem" );
  }


  public final void setNumBathrooms_elem( xsd.acord.NumBathrooms value ) {
    TYPE.get().setPropertyValue( this, "_NumBathrooms_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionClass getConstructionQualityCd() {
    return (xsd.acord.enums.ConstructionClass) TYPE.get().getPropertyValue( this, "_ConstructionQualityCd" );
  }


  public final void setConstructionQualityCd( xsd.acord.enums.ConstructionClass value ) {
    TYPE.get().setPropertyValue( this, "_ConstructionQualityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConstructionQualityCd getConstructionQualityCd_elem() {
    return (xsd.acord.ConstructionQualityCd) TYPE.get().getPropertyValue( this, "_ConstructionQualityCd_elem" );
  }


  public final void setConstructionQualityCd_elem( xsd.acord.ConstructionQualityCd value ) {
    TYPE.get().setPropertyValue( this, "_ConstructionQualityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BathroomType getBathroomTypeCd() {
    return (xsd.acord.enums.BathroomType) TYPE.get().getPropertyValue( this, "_BathroomTypeCd" );
  }


  public final void setBathroomTypeCd( xsd.acord.enums.BathroomType value ) {
    TYPE.get().setPropertyValue( this, "_BathroomTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BathroomTypeCd getBathroomTypeCd_elem() {
    return (xsd.acord.BathroomTypeCd) TYPE.get().getPropertyValue( this, "_BathroomTypeCd_elem" );
  }


  public final void setBathroomTypeCd_elem( xsd.acord.BathroomTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_BathroomTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumAdditionalFixtures() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumAdditionalFixtures" );
  }


  public final void setNumAdditionalFixtures( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumAdditionalFixtures", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumAdditionalFixtures getNumAdditionalFixtures_elem() {
    return (xsd.acord.NumAdditionalFixtures) TYPE.get().getPropertyValue( this, "_NumAdditionalFixtures_elem" );
  }


  public final void setNumAdditionalFixtures_elem( xsd.acord.NumAdditionalFixtures value ) {
    TYPE.get().setPropertyValue( this, "_NumAdditionalFixtures_elem", value );
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
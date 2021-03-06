/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FloodEquipmentInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FloodEquipmentInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodEquipmentStorageLocationCd = new javax.xml.namespace.QName( "", "FloodEquipmentStorageLocationCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StoredEquipmentTypeCd = new javax.xml.namespace.QName( "", "StoredEquipmentTypeCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FloodEquipmentInfo_Type" );
    }
  };

  public FloodEquipmentInfo_Type() {
    super( 1686236500, TYPE.get() );
  }

  private FloodEquipmentInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1686236500, state );
  }

  protected FloodEquipmentInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FloodEquipmentInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.FloodEquipmentInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.FloodEquipmentInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FloodEquipmentStorageLocation getFloodEquipmentStorageLocationCd() {
    return (xsd.acord.enums.FloodEquipmentStorageLocation) TYPE.get().getPropertyValue( this, "_FloodEquipmentStorageLocationCd" );
  }


  public final void setFloodEquipmentStorageLocationCd( xsd.acord.enums.FloodEquipmentStorageLocation value ) {
    TYPE.get().setPropertyValue( this, "_FloodEquipmentStorageLocationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodEquipmentStorageLocationCd getFloodEquipmentStorageLocationCd_elem() {
    return (xsd.acord.FloodEquipmentStorageLocationCd) TYPE.get().getPropertyValue( this, "_FloodEquipmentStorageLocationCd_elem" );
  }


  public final void setFloodEquipmentStorageLocationCd_elem( xsd.acord.FloodEquipmentStorageLocationCd value ) {
    TYPE.get().setPropertyValue( this, "_FloodEquipmentStorageLocationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.StoredEquipment getStoredEquipmentTypeCd() {
    return (xsd.acord.enums.StoredEquipment) TYPE.get().getPropertyValue( this, "_StoredEquipmentTypeCd" );
  }


  public final void setStoredEquipmentTypeCd( xsd.acord.enums.StoredEquipment value ) {
    TYPE.get().setPropertyValue( this, "_StoredEquipmentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StoredEquipmentTypeCd getStoredEquipmentTypeCd_elem() {
    return (xsd.acord.StoredEquipmentTypeCd) TYPE.get().getPropertyValue( this, "_StoredEquipmentTypeCd_elem" );
  }


  public final void setStoredEquipmentTypeCd_elem( xsd.acord.StoredEquipmentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_StoredEquipmentTypeCd_elem", value );
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

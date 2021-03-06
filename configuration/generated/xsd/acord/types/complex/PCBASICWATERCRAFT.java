/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.PCBASICWATERCRAFT_NoID.class)
public class PCBASICWATERCRAFT extends xsd.acord.types.complex.PCBASICWATERCRAFT_NoID {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PCBASICWATERCRAFT", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WaterUnitTypeCd = new javax.xml.namespace.QName( "", "WaterUnitTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CostNewAmt = new javax.xml.namespace.QName( "", "CostNewAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchasePriceAmt = new javax.xml.namespace.QName( "", "PurchasePriceAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PurchaseDt = new javax.xml.namespace.QName( "", "PurchaseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PresentValueAmt = new javax.xml.namespace.QName( "", "PresentValueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Length = new javax.xml.namespace.QName( "", "Length", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Speed = new javax.xml.namespace.QName( "", "Speed", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WatersNavigatedCd = new javax.xml.namespace.QName( "", "WatersNavigatedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Horsepower = new javax.xml.namespace.QName( "", "Horsepower", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DockLocationRef = new javax.xml.namespace.QName( "", "DockLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_StorageLocationRef = new javax.xml.namespace.QName( "", "StorageLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SecondaryStorageLocationRef = new javax.xml.namespace.QName( "", "SecondaryStorageLocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RatedDriverRef = new javax.xml.namespace.QName( "", "RatedDriverRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PCBASICWATERCRAFT" );
    }
  };

  public PCBASICWATERCRAFT() {
    super( -260895523, TYPE.get() );
  }

  private PCBASICWATERCRAFT( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -260895523, state );
  }

  protected PCBASICWATERCRAFT( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PCBASICWATERCRAFT( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PCBASICWATERCRAFT> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PCBASICWATERCRAFT get$TypeInstance() {
    return this;
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

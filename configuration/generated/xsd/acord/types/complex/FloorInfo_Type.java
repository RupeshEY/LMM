/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FloorInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FloorInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Floor = new javax.xml.namespace.QName( "", "Floor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RangeInfo = new javax.xml.namespace.QName( "", "RangeInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FloorInfo_Type" );
    }
  };

  public FloorInfo_Type() {
    super( 1977287462, TYPE.get() );
  }

  private FloorInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1977287462, state );
  }

  protected FloorInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FloorInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.FloorInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.FloorInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFloor() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Floor" );
  }


  public final void setFloor( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Floor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Floor getFloor_elem() {
    return (xsd.acord.Floor) TYPE.get().getPropertyValue( this, "_Floor_elem" );
  }


  public final void setFloor_elem( xsd.acord.Floor value ) {
    TYPE.get().setPropertyValue( this, "_Floor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RangeInfo getRangeInfo() {
    return (xsd.acord.RangeInfo) TYPE.get().getPropertyValue( this, "_RangeInfo" );
  }


  public final void setRangeInfo( xsd.acord.RangeInfo value ) {
    TYPE.get().setPropertyValue( this, "_RangeInfo", value );
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
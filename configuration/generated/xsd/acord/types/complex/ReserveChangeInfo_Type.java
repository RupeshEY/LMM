/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ReserveChangeInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ReserveChangeInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReservePositionTypeCd = new javax.xml.namespace.QName( "", "ReservePositionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReserveAmt = new javax.xml.namespace.QName( "", "ReserveAmt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ReserveChangeInfo_Type" );
    }
  };

  public ReserveChangeInfo_Type() {
    super( 2140344486, TYPE.get() );
  }

  private ReserveChangeInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2140344486, state );
  }

  protected ReserveChangeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ReserveChangeInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ReserveChangeInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ReserveChangeInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReservePositionType getReservePositionTypeCd() {
    return (xsd.acord.enums.ReservePositionType) TYPE.get().getPropertyValue( this, "_ReservePositionTypeCd" );
  }


  public final void setReservePositionTypeCd( xsd.acord.enums.ReservePositionType value ) {
    TYPE.get().setPropertyValue( this, "_ReservePositionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReservePositionTypeCd getReservePositionTypeCd_elem() {
    return (xsd.acord.ReservePositionTypeCd) TYPE.get().getPropertyValue( this, "_ReservePositionTypeCd_elem" );
  }


  public final void setReservePositionTypeCd_elem( xsd.acord.ReservePositionTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ReservePositionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReserveAmt getReserveAmt() {
    return (xsd.acord.ReserveAmt) TYPE.get().getPropertyValue( this, "_ReserveAmt" );
  }


  public final void setReserveAmt( xsd.acord.ReserveAmt value ) {
    TYPE.get().setPropertyValue( this, "_ReserveAmt", value );
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

/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.acord.types.complex.OpenEnum.class)
public class ReservePositionType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ReservePositionType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CodeListRef = new javax.xml.namespace.QName( "", "CodeListRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ReservePositionType" );
    }
  };

  public ReservePositionType() {
    super( -1771618888, TYPE.get() );
  }

  public ReservePositionType( xsd.acord.enums.ReservePositionType value ) {
    this();
    setValue( value );
  }

  private ReservePositionType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1771618888, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ReservePositionType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ReservePositionType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReservePositionType getValue() {
    return (xsd.acord.enums.ReservePositionType) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ReservePositionType get$Value() {
    return (xsd.acord.enums.ReservePositionType) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( xsd.acord.enums.ReservePositionType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( xsd.acord.enums.ReservePositionType value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getCodeListRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_CodeListRef" );
  }


  public final void setCodeListRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_CodeListRef", value );
  }

}
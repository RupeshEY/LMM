/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.AnyURI.class)
public class PartyIdType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "PartyIdType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TokenId = new javax.xml.namespace.QName( "", "TokenId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.PartyIdType" );
    }
  };

  public PartyIdType() {
    super( -1574947503, TYPE.get() );
  }

  public PartyIdType( java.lang.String value ) {
    this();
    setValue( value );
  }

  private PartyIdType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1574947503, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.PartyIdType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.PartyIdType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getTokenId() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_TokenId" );
  }


  public final void setTokenId( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_TokenId", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.acord4all.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimSettlingAgentType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/ACORD4ALLEDI/xml", "ClaimSettlingAgent_type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/ACORD4ALLEDI/xml", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Party", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contact = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Address", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acord4all.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimSettlingAgentType" );
    }
  };

  public ClaimSettlingAgentType() {
    super( -1644459958, TYPE.get() );
  }

  private ClaimSettlingAgentType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1644459958, state );
  }

  protected ClaimSettlingAgentType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimSettlingAgentType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimSettlingAgentType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.acord4all.types.complex.ClaimSettlingAgentType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party getParty() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party) TYPE.get().getPropertyValue( this, "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party value ) {
    TYPE.get().setPropertyValue( this, "_Party", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact getContact() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact) TYPE.get().getPropertyValue( this, "_Contact" );
  }


  public final void setContact( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact value ) {
    TYPE.get().setPropertyValue( this, "_Contact", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address getAddress() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address) TYPE.get().getPropertyValue( this, "_Address" );
  }


  public final void setAddress( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address value ) {
    TYPE.get().setPropertyValue( this, "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acord4all.anonymous.elements.ClaimSettlingAgentType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.acord4all.anonymous.elements.ClaimSettlingAgentType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.acord4all.anonymous.elements.ClaimSettlingAgentType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
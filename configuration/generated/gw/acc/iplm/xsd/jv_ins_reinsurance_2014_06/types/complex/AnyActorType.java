/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AnyActorType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "AnyActorType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PartyType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyRole = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PartyRole", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProcessParticipantFunction = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ProcessParticipantFunction", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Party", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contact = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Address", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FiscalIdentification = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FiscalIdentification", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyActorType" );
    }
  };

  public AnyActorType() {
    super( 1264329372, TYPE.get() );
  }

  private AnyActorType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1264329372, state );
  }

  protected AnyActorType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AnyActorType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyActorType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.AnyActorType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PartyType" );
  }


  public final void setPartyType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PartyType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyType getPartyType_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyType) TYPE.get().getPropertyValue( this, "_PartyType_elem" );
  }


  public final void setPartyType_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyType value ) {
    TYPE.get().setPropertyValue( this, "_PartyType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyRole() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PartyRole" );
  }


  public final void setPartyRole( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PartyRole", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyRole getPartyRole_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyRole) TYPE.get().getPropertyValue( this, "_PartyRole_elem" );
  }


  public final void setPartyRole_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.PartyRole value ) {
    TYPE.get().setPropertyValue( this, "_PartyRole_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProcessParticipantFunction() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProcessParticipantFunction" );
  }


  public final void setProcessParticipantFunction( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProcessParticipantFunction", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProcessParticipantFunction getProcessParticipantFunction_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProcessParticipantFunction) TYPE.get().getPropertyValue( this, "_ProcessParticipantFunction_elem" );
  }


  public final void setProcessParticipantFunction_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ProcessParticipantFunction value ) {
    TYPE.get().setPropertyValue( this, "_ProcessParticipantFunction_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party getParty() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party) TYPE.get().getPropertyValue( this, "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party value ) {
    TYPE.get().setPropertyValue( this, "_Party", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact getContact() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact) TYPE.get().getPropertyValue( this, "_Contact" );
  }


  public final void setContact( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Contact value ) {
    TYPE.get().setPropertyValue( this, "_Contact", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Address getAddress() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Address) TYPE.get().getPropertyValue( this, "_Address" );
  }


  public final void setAddress( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Address value ) {
    TYPE.get().setPropertyValue( this, "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FiscalIdentification getFiscalIdentification() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FiscalIdentification) TYPE.get().getPropertyValue( this, "_FiscalIdentification" );
  }


  public final void setFiscalIdentification( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.FiscalIdentification value ) {
    TYPE.get().setPropertyValue( this, "_FiscalIdentification", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AnyActorType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AnyActorType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.AnyActorType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Participant extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Participant", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyType = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PartyType", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyRole = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "PartyRole", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Party = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Party", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Contact = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Contact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Address", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FiscalIdentification = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "FiscalIdentification", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType" );
    }
  };

  public Participant() {
    super( 1000775556, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType() );
  }

  public Participant( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType typeInstance ) {
    super( 1000775556, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Participant( gw.internal.xml.XmlElementState state ) {
    super( 1000775556, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.AnyActorType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Participant.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyType" );
  }


  public final void setPartyType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyType getPartyType_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyType_elem" );
  }


  public final void setPartyType_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyType_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyRole() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyRole" );
  }


  public final void setPartyRole( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyRole", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyRole getPartyRole_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyRole) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyRole_elem" );
  }


  public final void setPartyRole_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.PartyRole value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyRole_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party getParty() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Party" );
  }


  public final void setParty( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Party", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact getContact() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Contact" );
  }


  public final void setContact( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Contact value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Contact", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address getAddress() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Address" );
  }


  public final void setAddress( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Address value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FiscalIdentification getFiscalIdentification() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FiscalIdentification) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FiscalIdentification" );
  }


  public final void setFiscalIdentification( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.FiscalIdentification value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FiscalIdentification", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyActorType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyActorType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.AnyActorType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
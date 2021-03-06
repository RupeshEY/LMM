/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.acordrepository;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PartyContact extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "PartyContact", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Telephone = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Telephone", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Fax = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Fax", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Email = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Email", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TokenId = new javax.xml.namespace.QName( "", "TokenId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acordrepository.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acordrepository.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact" );
    }
  };

  public PartyContact() {
    super( -103413895, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact() );
  }

  public PartyContact( gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact typeInstance ) {
    super( -103413895, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PartyContact( gw.internal.xml.XmlElementState state ) {
    super( -103413895, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.acordrepository.anonymous.types.complex.PartyContact typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.acordrepository.PartyContact.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordrepository.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordrepository.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.acordrepository.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTelephone() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Telephone" );
  }


  public final void setTelephone( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Telephone", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordrepository.Telephone getTelephone_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordrepository.Telephone) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Telephone_elem" );
  }


  public final void setTelephone_elem( gw.acc.iplm.xsd.londonmarket.acordrepository.Telephone value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Telephone_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFax() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Fax" );
  }


  public final void setFax( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Fax", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordrepository.Fax getFax_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordrepository.Fax) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Fax_elem" );
  }


  public final void setFax_elem( gw.acc.iplm.xsd.londonmarket.acordrepository.Fax value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Fax_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEmail() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Email" );
  }


  public final void setEmail( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Email", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordrepository.Email getEmail_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordrepository.Email) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Email_elem" );
  }


  public final void setEmail_elem( gw.acc.iplm.xsd.londonmarket.acordrepository.Email value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Email_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getTokenId() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TokenId" );
  }


  public final void setTokenId( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TokenId", value );
  }
}

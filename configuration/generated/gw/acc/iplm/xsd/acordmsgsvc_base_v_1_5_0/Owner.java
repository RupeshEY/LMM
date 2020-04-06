/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Owner extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Owner", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "PartyId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyRoleCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "PartyRoleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyName = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "PartyName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartyContact = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "PartyContact", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type" );
    }
  };

  public Owner() {
    super( -289974777, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type() );
  }

  public Owner( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type typeInstance ) {
    super( -289974777, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Owner( gw.internal.xml.XmlElementState state ) {
    super( -289974777, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.types.complex.GENERALPARTY_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }

  public static gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.Owner.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyId" );
  }


  public final void setPartyId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyId getPartyId_elem() {
    return (gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyId_elem" );
  }


  public final void setPartyId_elem( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyRoleCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyRoleCd" );
  }


  public final void setPartyRoleCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyRoleCd getPartyRoleCd_elem() {
    return (gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyRoleCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyRoleCd_elem" );
  }


  public final void setPartyRoleCd_elem( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyRoleCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyRoleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPartyName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyName" );
  }


  public final void setPartyName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyName getPartyName_elem() {
    return (gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyName_elem" );
  }


  public final void setPartyName_elem( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyContact getPartyContact() {
    return (gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyContact) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartyContact" );
  }


  public final void setPartyContact( gw.acc.iplm.xsd.acordmsgsvc_base_v_1_5_0.PartyContact value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartyContact", value );
  }
}
/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MiscParty extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SIUInfo = new javax.xml.namespace.QName( "", "com.iso_SIUInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_AddInfo = new javax.xml.namespace.QName( "", "com.iso_AddInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscPartyInfo = new javax.xml.namespace.QName( "", "MiscPartyInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.MiscParty" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.MiscParty" );
    }
  };

  public MiscParty() {
    super( 382857308, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.MiscParty() );
  }

  public MiscParty( xsd.iso.req.anonymous.types.complex.MiscParty typeInstance ) {
    super( 382857308, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MiscParty( gw.internal.xml.XmlElementState state ) {
    super( 382857308, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.MiscParty> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.MiscParty get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.MiscParty.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.MiscParty typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.MiscParty parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.MiscParty.class );
  }

  public static xsd.iso.req.MiscParty parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.MiscParty.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.MiscParty_ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.anonymous.elements.MiscParty_ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.anonymous.elements.MiscParty_ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.GeneralPartyInfo getGeneralPartyInfo() {
    return (xsd.iso.req.GeneralPartyInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeneralPartyInfo" );
  }


  public final void setGeneralPartyInfo( xsd.iso.req.GeneralPartyInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeneralPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.MiscParty_ComIso_SIUInfo getComIso_SIUInfo() {
    return (xsd.iso.req.anonymous.elements.MiscParty_ComIso_SIUInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_SIUInfo" );
  }


  public final void setComIso_SIUInfo( xsd.iso.req.anonymous.elements.MiscParty_ComIso_SIUInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_SIUInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.MiscParty_ComIso_AddInfo getComIso_AddInfo() {
    return (xsd.iso.req.anonymous.elements.MiscParty_ComIso_AddInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_AddInfo" );
  }


  public final void setComIso_AddInfo( xsd.iso.req.anonymous.elements.MiscParty_ComIso_AddInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_AddInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.MiscPartyInfo> getMiscPartyInfo() {
    return (java.util.List<xsd.iso.req.MiscPartyInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscPartyInfo" );
  }


  public final void setMiscPartyInfo( java.util.List<xsd.iso.req.MiscPartyInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscPartyInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}

/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AdjusterParty extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "AdjusterParty", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdjusterPartyInfo = new javax.xml.namespace.QName( "", "AdjusterPartyInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.AdjusterParty" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.AdjusterParty_Type" );
    }
  };

  public AdjusterParty() {
    super( -34501930, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.AdjusterParty_Type() );
  }

  public AdjusterParty( xsd.acord.types.complex.AdjusterParty_Type typeInstance ) {
    super( -34501930, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AdjusterParty( gw.internal.xml.XmlElementState state ) {
    super( -34501930, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.AdjusterParty> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.AdjusterParty_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.AdjusterParty_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.AdjusterParty_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.AdjusterParty parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.AdjusterParty.class );
  }

  public static xsd.acord.AdjusterParty parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.AdjusterParty.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GeneralPartyInfo getGeneralPartyInfo() {
    return (xsd.acord.GeneralPartyInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GeneralPartyInfo" );
  }


  public final void setGeneralPartyInfo( xsd.acord.GeneralPartyInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GeneralPartyInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AdjusterPartyInfo> getAdjusterPartyInfo() {
    return (java.util.List<xsd.acord.AdjusterPartyInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdjusterPartyInfo" );
  }


  public final void setAdjusterPartyInfo( java.util.List<xsd.acord.AdjusterPartyInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdjusterPartyInfo", value );
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
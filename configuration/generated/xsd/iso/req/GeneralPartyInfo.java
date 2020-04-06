/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GeneralPartyInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NameInfo = new javax.xml.namespace.QName( "", "NameInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Addr = new javax.xml.namespace.QName( "", "Addr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreferredContact = new javax.xml.namespace.QName( "", "PreferredContact", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Communications = new javax.xml.namespace.QName( "", "Communications", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.GeneralPartyInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.GeneralPartyInfo" );
    }
  };

  public GeneralPartyInfo() {
    super( 239890282, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.GeneralPartyInfo() );
  }

  public GeneralPartyInfo( xsd.iso.req.anonymous.types.complex.GeneralPartyInfo typeInstance ) {
    super( 239890282, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GeneralPartyInfo( gw.internal.xml.XmlElementState state ) {
    super( 239890282, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.GeneralPartyInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.GeneralPartyInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.GeneralPartyInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.GeneralPartyInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }

  public static xsd.iso.req.GeneralPartyInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.GeneralPartyInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.NameInfo> getNameInfo() {
    return (java.util.List<xsd.iso.req.NameInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NameInfo" );
  }


  public final void setNameInfo( java.util.List<xsd.iso.req.NameInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NameInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.Addr> getAddr() {
    return (java.util.List<xsd.iso.req.Addr>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Addr" );
  }


  public final void setAddr( java.util.List<xsd.iso.req.Addr> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Addr", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact> getPreferredContact() {
    return (java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PreferredContact" );
  }


  public final void setPreferredContact( java.util.List<xsd.iso.req.anonymous.elements.GeneralPartyInfo_PreferredContact> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PreferredContact", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Communications getCommunications() {
    return (xsd.iso.req.Communications) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Communications" );
  }


  public final void setCommunications( xsd.iso.req.Communications value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Communications", value );
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
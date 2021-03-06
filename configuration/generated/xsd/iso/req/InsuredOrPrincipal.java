/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class InsuredOrPrincipal extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GeneralPartyInfo = new javax.xml.namespace.QName( "", "GeneralPartyInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalInfo = new javax.xml.namespace.QName( "", "InsuredOrPrincipalInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LengthTimeKnownByAgentBroker = new javax.xml.namespace.QName( "", "LengthTimeKnownByAgentBroker", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.InsuredOrPrincipal" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal" );
    }
  };

  public InsuredOrPrincipal() {
    super( -1587382913, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal() );
  }

  public InsuredOrPrincipal( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal typeInstance ) {
    super( -1587382913, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private InsuredOrPrincipal( gw.internal.xml.XmlElementState state ) {
    super( -1587382913, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.InsuredOrPrincipal> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipal typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }

  public static xsd.iso.req.InsuredOrPrincipal parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.InsuredOrPrincipal.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
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
  public final xsd.iso.req.InsuredOrPrincipalInfo getInsuredOrPrincipalInfo() {
    return (xsd.iso.req.InsuredOrPrincipalInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalInfo" );
  }


  public final void setInsuredOrPrincipalInfo( xsd.iso.req.InsuredOrPrincipalInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker getLengthTimeKnownByAgentBroker() {
    return (xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LengthTimeKnownByAgentBroker" );
  }


  public final void setLengthTimeKnownByAgentBroker( xsd.iso.req.anonymous.elements.InsuredOrPrincipal_LengthTimeKnownByAgentBroker value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LengthTimeKnownByAgentBroker", value );
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

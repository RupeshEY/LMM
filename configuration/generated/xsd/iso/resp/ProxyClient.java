/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ProxyClient extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ProxyClient", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Org = new javax.xml.namespace.QName( "", "Org", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Name = new javax.xml.namespace.QName( "", "Name", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Version = new javax.xml.namespace.QName( "", "Version", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.ProxyClient" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ProxyClient" );
    }
  };

  public ProxyClient() {
    super( 1082309865, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.ProxyClient() );
  }

  public ProxyClient( xsd.iso.resp.anonymous.types.complex.ProxyClient typeInstance ) {
    super( 1082309865, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ProxyClient( gw.internal.xml.XmlElementState state ) {
    super( 1082309865, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.ProxyClient> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.ProxyClient get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.ProxyClient.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.ProxyClient typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.ProxyClient parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.ProxyClient.class );
  }

  public static xsd.iso.resp.ProxyClient parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.ProxyClient.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOrg() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Org" );
  }


  public final void setOrg( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Org", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.Org getOrg_elem() {
    return (xsd.iso.resp.Org) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Org_elem" );
  }


  public final void setOrg_elem( xsd.iso.resp.Org value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Org_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ProxyClient_Name getName_elem() {
    return (xsd.iso.resp.anonymous.elements.ProxyClient_Name) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name_elem" );
  }


  public final void setName_elem( xsd.iso.resp.anonymous.elements.ProxyClient_Name value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVersion() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Version" );
  }


  public final void setVersion( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Version", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.Version getVersion_elem() {
    return (xsd.iso.resp.Version) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Version_elem" );
  }


  public final void setVersion_elem( xsd.iso.resp.Version value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Version_elem", value );
  }
}
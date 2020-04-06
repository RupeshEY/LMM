/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab800.soapheaders;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Authentication extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "authentication", "gwsoap" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ws/soapheaders", "gwsoap" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Username = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "username", "gwsoap" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Password = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "password", "gwsoap" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab800.soapheaders.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab800.soapheaders.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication" );
    }
  };

  public Authentication() {
    super( 2134616985, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication() );
  }

  public Authentication( wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication typeInstance ) {
    super( 2134616985, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Authentication( gw.internal.xml.XmlElementState state ) {
    super( 2134616985, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.types.complex.Authentication typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }

  public static wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.gw.webservice.ab.ab800.soapheaders.Authentication.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUsername() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Username" );
  }


  public final void setUsername( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Username", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Username getUsername_elem() {
    return (wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Username) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Username_elem" );
  }


  public final void setUsername_elem( wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Username value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Username_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPassword() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Password" );
  }


  public final void setPassword( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Password", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Password getPassword_elem() {
    return (wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Password) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Password_elem" );
  }


  public final void setPassword_elem( wsi.remote.gw.webservice.ab.ab800.soapheaders.anonymous.elements.Authentication_Password value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Password_elem", value );
  }
}
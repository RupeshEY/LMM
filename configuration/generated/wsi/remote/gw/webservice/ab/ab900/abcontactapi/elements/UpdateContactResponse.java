/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class UpdateContactResponse extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "updateContactResponse", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse" );
    }
  };

  public UpdateContactResponse() {
    super( -2012761657, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse() );
  }

  public UpdateContactResponse( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse typeInstance ) {
    super( -2012761657, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private UpdateContactResponse( gw.internal.xml.XmlElementState state ) {
    super( -2012761657, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.UpdateContactResponse typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.UpdateContactResponse.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.UpdateContactResponse_Return getReturn() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.UpdateContactResponse_Return) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Return" );
  }


  public final void setReturn( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.UpdateContactResponse_Return value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Return", value );
  }
}

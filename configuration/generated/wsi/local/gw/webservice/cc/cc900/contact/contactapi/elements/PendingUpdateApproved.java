/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PendingUpdateApproved extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "pendingUpdateApproved", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Context = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "context", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbuidContainer = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "abuidContainer", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved" );
    }
  };

  public PendingUpdateApproved() {
    super( 5349014, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved() );
  }

  public PendingUpdateApproved( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved typeInstance ) {
    super( 5349014, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PendingUpdateApproved( gw.internal.xml.XmlElementState state ) {
    super( 5349014, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.PendingUpdateApproved.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context getContext() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Context" );
  }


  public final void setContext( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Context", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer getAbuidContainer() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AbuidContainer" );
  }


  public final void setAbuidContainer( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AbuidContainer", value );
  }
}
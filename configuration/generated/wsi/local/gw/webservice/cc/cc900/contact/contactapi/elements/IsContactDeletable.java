/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class IsContactDeletable extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "isContactDeletable", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AddressBookUID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "addressBookUID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable" );
    }
  };

  public IsContactDeletable() {
    super( -1269951169, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable() );
  }

  public IsContactDeletable( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable typeInstance ) {
    super( -1269951169, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private IsContactDeletable( gw.internal.xml.XmlElementState state ) {
    super( -1269951169, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.IsContactDeletable typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.elements.IsContactDeletable.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressBookUID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressBookUID" );
  }


  public final void setAddressBookUID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressBookUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.IsContactDeletable_AddressBookUID getAddressBookUID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.IsContactDeletable_AddressBookUID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressBookUID_elem" );
  }


  public final void setAddressBookUID_elem( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.IsContactDeletable_AddressBookUID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressBookUID_elem", value );
  }
}

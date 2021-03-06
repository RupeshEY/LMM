/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveDocumentsForContact extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "retrieveDocumentsForContact", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactLinkID = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "contactLinkID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbContactAPIDocumentSearchCriteria = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "abContactAPIDocumentSearchCriteria", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbContactAPIDocumentSearchSpec = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "abContactAPIDocumentSearchSpec", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact" );
    }
  };

  public RetrieveDocumentsForContact() {
    super( 595911714, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact() );
  }

  public RetrieveDocumentsForContact( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact typeInstance ) {
    super( 595911714, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveDocumentsForContact( gw.internal.xml.XmlElementState state ) {
    super( 595911714, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveDocumentsForContact typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }

  public static wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.elements.RetrieveDocumentsForContact.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContactLinkID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContactLinkID" );
  }


  public final void setContactLinkID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContactLinkID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_ContactLinkID getContactLinkID_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_ContactLinkID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ContactLinkID_elem" );
  }


  public final void setContactLinkID_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_ContactLinkID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ContactLinkID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchCriteria getAbContactAPIDocumentSearchCriteria() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchCriteria) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AbContactAPIDocumentSearchCriteria" );
  }


  public final void setAbContactAPIDocumentSearchCriteria( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchCriteria value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AbContactAPIDocumentSearchCriteria", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec getAbContactAPIDocumentSearchSpec() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AbContactAPIDocumentSearchSpec" );
  }


  public final void setAbContactAPIDocumentSearchSpec( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AbContactAPIDocumentSearchSpec", value );
  }
}

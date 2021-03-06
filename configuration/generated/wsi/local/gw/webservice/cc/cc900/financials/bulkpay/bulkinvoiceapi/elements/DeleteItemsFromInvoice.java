/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class DeleteItemsFromInvoice extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "deleteItemsFromInvoice", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InvoiceID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "invoiceID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InvoiceItemIDsToDelete = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "invoiceItemIDsToDelete", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice" );
    }
  };

  public DeleteItemsFromInvoice() {
    super( 1287450018, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice() );
  }

  public DeleteItemsFromInvoice( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice typeInstance ) {
    super( 1287450018, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private DeleteItemsFromInvoice( gw.internal.xml.XmlElementState state ) {
    super( 1287450018, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.DeleteItemsFromInvoice typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.DeleteItemsFromInvoice.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInvoiceID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InvoiceID" );
  }


  public final void setInvoiceID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InvoiceID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceID getInvoiceID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InvoiceID_elem" );
  }


  public final void setInvoiceID_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InvoiceID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceItemIDsToDelete getInvoiceItemIDsToDelete() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceItemIDsToDelete) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InvoiceItemIDsToDelete" );
  }


  public final void setInvoiceItemIDsToDelete( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.DeleteItemsFromInvoice_InvoiceItemIDsToDelete value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InvoiceItemIDsToDelete", value );
  }
}

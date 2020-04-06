/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetItemsForInvoiceAndClaimAndAmount extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "getItemsForInvoiceAndClaimAndAmount", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InvoiceID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "invoiceID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "claimID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amount = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "amount", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount" );
    }
  };

  public GetItemsForInvoiceAndClaimAndAmount() {
    super( 499583656, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount() );
  }

  public GetItemsForInvoiceAndClaimAndAmount( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount typeInstance ) {
    super( 499583656, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetItemsForInvoiceAndClaimAndAmount( gw.internal.xml.XmlElementState state ) {
    super( 499583656, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.GetItemsForInvoiceAndClaimAndAmount typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.elements.GetItemsForInvoiceAndClaimAndAmount.class );
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
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_InvoiceID getInvoiceID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_InvoiceID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InvoiceID_elem" );
  }


  public final void setInvoiceID_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_InvoiceID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InvoiceID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimID" );
  }


  public final void setClaimID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_ClaimID getClaimID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_ClaimID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimID_elem" );
  }


  public final void setClaimID_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_ClaimID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getAmount() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amount" );
  }


  public final void setAmount( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_Amount getAmount_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_Amount) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Amount_elem" );
  }


  public final void setAmount_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.GetItemsForInvoiceAndClaimAndAmount_Amount value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Amount_elem", value );
  }
}
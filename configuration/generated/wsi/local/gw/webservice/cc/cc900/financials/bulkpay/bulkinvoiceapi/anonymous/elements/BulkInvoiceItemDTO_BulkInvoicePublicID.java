/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BulkInvoiceItemDTO_BulkInvoicePublicID extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceItemDTO", "BulkInvoicePublicID", "pogo4" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceItemDTO", "pogo4" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.BulkInvoiceItemDTO_BulkInvoicePublicID" );
    }
  };

  public BulkInvoiceItemDTO_BulkInvoicePublicID() {
    super( 1890158628, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public BulkInvoiceItemDTO_BulkInvoicePublicID( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1890158628, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BulkInvoiceItemDTO_BulkInvoicePublicID( gw.internal.xml.XmlElementState state ) {
    super( 1890158628, state );
  }

  public BulkInvoiceItemDTO_BulkInvoicePublicID( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.BulkInvoiceItemDTO_BulkInvoicePublicID> get$Class() {
    return getClass();
  }
}
/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BulkInvoiceDTO_Status extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceDTO", "Status", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceDTO", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.BulkInvoiceDTO_Status" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus" );
    }
  };

  public BulkInvoiceDTO_Status() {
    super( -1091777446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus() );
  }

  public BulkInvoiceDTO_Status( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus typeInstance ) {
    super( -1091777446, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BulkInvoiceDTO_Status( gw.internal.xml.XmlElementState state ) {
    super( -1091777446, state );
  }

  public BulkInvoiceDTO_Status( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.BulkInvoiceDTO_Status> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.types.simple.BulkInvoiceStatus typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus getValue() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}
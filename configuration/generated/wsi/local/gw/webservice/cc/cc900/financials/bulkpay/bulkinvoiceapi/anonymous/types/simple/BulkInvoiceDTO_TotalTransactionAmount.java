/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.simple;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.simple.String.class)
public class BulkInvoiceDTO_TotalTransactionAmount extends gw.xml.XmlTypeInstance {

  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.simple.BulkInvoiceDTO_TotalTransactionAmount" );
    }
  };

  public BulkInvoiceDTO_TotalTransactionAmount() {
    super( -2112219094, TYPE.get() );
  }

  public BulkInvoiceDTO_TotalTransactionAmount( gw.api.financials.CurrencyAmount value ) {
    this();
    setValue( value );
  }

  private BulkInvoiceDTO_TotalTransactionAmount( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2112219094, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.simple.BulkInvoiceDTO_TotalTransactionAmount> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.simple.BulkInvoiceDTO_TotalTransactionAmount get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.api.financials.CurrencyAmount getValue() {
    return (gw.api.financials.CurrencyAmount) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.api.financials.CurrencyAmount get$Value() {
    return (gw.api.financials.CurrencyAmount) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( gw.api.financials.CurrencyAmount value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( gw.api.financials.CurrencyAmount value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

}

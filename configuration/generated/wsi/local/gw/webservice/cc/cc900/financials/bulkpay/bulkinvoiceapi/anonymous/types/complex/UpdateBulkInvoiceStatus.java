/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class UpdateBulkInvoiceStatus extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InvoiceID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "invoiceID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CheckNumber = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "checkNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IssueDate = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "issueDate", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/bulkpay/BulkInvoiceAPI", "status", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.UpdateBulkInvoiceStatus" );
    }
  };

  public UpdateBulkInvoiceStatus() {
    super( -77371699, TYPE.get() );
  }

  private UpdateBulkInvoiceStatus( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -77371699, state );
  }

  protected UpdateBulkInvoiceStatus( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected UpdateBulkInvoiceStatus( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.UpdateBulkInvoiceStatus> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.types.complex.UpdateBulkInvoiceStatus get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInvoiceID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InvoiceID" );
  }


  public final void setInvoiceID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InvoiceID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_InvoiceID getInvoiceID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_InvoiceID) TYPE.get().getPropertyValue( this, "_InvoiceID_elem" );
  }


  public final void setInvoiceID_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_InvoiceID value ) {
    TYPE.get().setPropertyValue( this, "_InvoiceID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCheckNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CheckNumber" );
  }


  public final void setCheckNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_CheckNumber getCheckNumber_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_CheckNumber) TYPE.get().getPropertyValue( this, "_CheckNumber_elem" );
  }


  public final void setCheckNumber_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_CheckNumber value ) {
    TYPE.get().setPropertyValue( this, "_CheckNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getIssueDate() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_IssueDate" );
  }


  public final void setIssueDate( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_IssueDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_IssueDate getIssueDate_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_IssueDate) TYPE.get().getPropertyValue( this, "_IssueDate_elem" );
  }


  public final void setIssueDate_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_IssueDate value ) {
    TYPE.get().setPropertyValue( this, "_IssueDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus getStatus() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus) TYPE.get().getPropertyValue( this, "_Status" );
  }


  public final void setStatus( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.enums.BulkInvoiceStatus value ) {
    TYPE.get().setPropertyValue( this, "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_Status getStatus_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_Status) TYPE.get().getPropertyValue( this, "_Status_elem" );
  }


  public final void setStatus_elem( wsi.local.gw.webservice.cc.cc900.financials.bulkpay.bulkinvoiceapi.anonymous.elements.UpdateBulkInvoiceStatus_Status value ) {
    TYPE.get().setPropertyValue( this, "_Status_elem", value );
  }

}

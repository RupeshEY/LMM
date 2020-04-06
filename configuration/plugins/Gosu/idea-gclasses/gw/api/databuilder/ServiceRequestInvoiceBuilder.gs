package gw.api.databuilder
uses java.util.Date

@Export
class ServiceRequestInvoiceBuilder extends ServiceRequestStatementBuilder<ServiceRequestInvoice, ServiceRequestInvoiceBuilder> {

  /**
   * Sets:
   * <ul>
   * <li>Status - Waiting for approval
   * <li>Description - a non-null string
   * <li>Amount - $100 (USD)
   * <li>StatementCreationTime - now
   * </ul>
   */
  construct() {
    super(ServiceRequestInvoice)
    set(ServiceRequestInvoice#Status, ServiceRequestInvoiceStatus.TC_WAITINGFORAPPROVAL)
  }

  /**
   * Sets the invoice status of this invoice in its life cycle.
   * @param invoiceStatus the desired value
   * @return the modified builder
   */  
  function withStatus(invoiceStatus : ServiceRequestInvoiceStatus) : ServiceRequestInvoiceBuilder {
    set(ServiceRequestInvoice#Status, invoiceStatus)
    return this
  }

  /**
   * Sets the payment date of this invoice.
   * @param date the payment date
   * @return the modified builder
   */
  function withPaymentDate(date : Date) : ServiceRequestInvoiceBuilder {
    set(ServiceRequestInvoice#PaymentDate, date)
    return this
  }

  /**
   * Sets the check of this invoice.
   * @param check the payment date
   * @return the modified builder
   */
  function withCheck(check : Check) : ServiceRequestInvoiceBuilder {
    set(ServiceRequestInvoice#Check, check)
    return this
  }

  /**
   * Sets the check of this invoice.
   * @param check the payment date
   * @return the modified builder
   */
  function withCheck(check : ValueGenerator< Check >) : ServiceRequestInvoiceBuilder {
    set(ServiceRequestInvoice#Check, check)
    return this
  }

}

package gw.webservice.cc.cc900.vendormanagement

uses gw.xml.ws.annotation.WsiExportable

uses java.lang.Integer

@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestSearchCriteria")
final class ServiceRequestSearchCriteria {

  /**
   * If non-empty, restricts the results to ServiceRequests on the Claim with the specified ClaimNumber.
   */
  var _claimNumber : String as ClaimNumber

  /**
   * if non-empty, restricts the results to ServiceRequests with the specified ServiceRequestReferenceNumber.
   */
  var _serviceRequestReferenceNumber : String as ServiceRequestReferenceNumber


  /**
   * If true, restricts the results to ServiceRequests that either:
   * <ul>
   * <li>have a non-terminal Progress value,
   * <li>are in WORKCOMPLETE but have an unpaid invoice, or
   * <li>are in WORKCOMPLETE, have no paid or unpaid invoices (i.e., any invoices are either WITHDRAWN or REJECTED),
   *     and have been updated recently (as defined by the "ServiceRequestAPIMaxDaysKeepActiveWithoutInvoice" configuration parameter)
   * </ul>
   */
  var _onlyActive : Boolean as OnlyActive = false

  /**
   * If true, restricts the results to ServiceRequests with a terminal Progress value.
   */
  var _onlyInactive : Boolean as OnlyInactive = false

  /**
   * If true, restricts the results to ServiceRequests where the specialist is waiting, such as when they are waiting for:
   * <ul>
   * <li>quote approval,
   * <li>a customer to perform an action or a part to arrive, or
   * <li>an invoice to be approved or paid after work is complete.
   * </ul>
   */
  var _onlyWaiting : Boolean as OnlyWaiting = false

  /**
   * If true, restricts the results to ServiceRequests where the specialist has not performed an action by the expected
   * completion date.
   */
  var _onlyOverdue : Boolean as OnlyOverdue = false

  /**
   * If true, restricts the results to ServiceRequests where the Progress value is WAITINGFORQUOTE.
   */
  var _onlyWaitingForQuote : Boolean as OnlyWaitingForQuote = false

  /**
   * If true, restricts the results to ServiceRequests where the Progress value is either CANCELED or DECLINED.
   */
  var _onlyCanceledAndDeclined : Boolean as OnlyCanceledAndDeclined = false

  /**
   * If true, restricts the results to ServiceRequests containing invoices that are either waiting for approval or
   * waiting to be paid and where the Progress value of the ServiceRequest is either non-terminal or is WORKCOMPLETE.
   */
  var _onlyUnpaidInvoices : Boolean as OnlyUnpaidInvoices = false

  /**
   * If true, restricts the results to ServiceRequests where the Progress value is WORKCOMPLETE and where there are no
   * WAITINGFORAPPROVAL, APPROVED, or PAID invoices.
   */
  var _onlyCompleteWaitingForInvoice : Boolean as OnlyCompleteWaitingForInvoice = false

  /**
   * If true, restricts the results to ServiceRequests where the Progress value became CANCELED within the last
   * CanceledWithinDays and is still CANCELED. CanceledWithinDays must be specified if this parameter is true.
   * Note that search results will follow their normal ordering, which may differ from the order that they
   * were canceled.
   */
  var _onlyRecentlyCanceled : Boolean as OnlyRecentlyCanceled = false

  /**
   * Used in conjunction with OnlyRencentlyCanceled. Controls the number of days of recently canceled ServiceRequests to return.
   */
  var _canceledWithinDays : Integer as CanceledWithinDays = null

}

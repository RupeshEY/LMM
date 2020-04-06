package gw.plugin.vendormanagement

uses gw.api.locale.DisplayKey
uses gw.vendormanagement.ServiceRequestActivityPattern

uses java.math.BigDecimal
uses java.util.Map

/**
 * Helper to process invoices that require approval.
 */
@Export
class InvoiceAutoApprovalHelper extends AbstractInvoiceAutomaticStateTransitionHelper {
  static var _instance = new InvoiceAutoApprovalHelper()

  /**
   * @return The singleton instance of this class.
   */
  static property get Instance(): InvoiceAutoApprovalHelper {
    return _instance
  }

  protected construct() {}

  /**
   * Returns a map of Service Request currencies to (non-negative) amounts. An invoice for less than or equal to the
   * threshold for that currency is a candidate for auto-approval.
   **/
  static property get SmallAmountThresholds(): Map<Currency, BigDecimal> {
    return {
        Currency.TC_CAD -> 600bd,
        Currency.TC_USD -> 500bd
    }
  }

  /**
   * Returns all invoices in the supplied collection that are waiting for approval.<p/>
   * @param invoices A collection of invoices.
   * @return A list of the invoices to process.
   */
  override function getRelevantInvoices(invoices: List<ServiceRequestInvoice>): List<ServiceRequestInvoice> {
    return invoices.where(\ invoice -> invoice.IsWaitingForApproval)
  }

  /**
   * Returns a list of the reasons the supplied invoice is NOT qualified. If the collection is empty no objections
   * could be found.
   **/
  override protected function getFailedToQualifyReasons(invoice: ServiceRequestInvoice): List<String> {
    var serviceRequest = invoice.ServiceRequest
    var claim          = serviceRequest.Claim

    var failureReasons: List<String> = {}

    if (claim.State == ClaimState.TC_CLOSED) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.ClaimIsClosed"))
    }

    if (claim.SIUStatus == SIUStatus.TC_UNDER_INVESTIGATION) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.ClaimHasActiveSIU"))
    }

    if (claim.applyFinancialHolds()) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.ClaimIsUnderFinancialHold"))
    }

    if (!invoice.operationAvailable(TC_APPROVEINVOICE, false, null)) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.OperationUnavailable"))
    }

    var latestQuote = invoice.ServiceRequest.LatestQuote
    if (latestQuote != null and !latestQuote.IsApproved) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.QuotePendingApproval"))
    }

    var anotherInvoiceWaitingForManualApproval = false
    var sumOfInvoices = invoice.Amount.Amount
    for (ivc in serviceRequest.Invoices) {
      if (ivc != invoice and ivc.IsActive) {
        sumOfInvoices += ivc.Amount.Amount
        if (ivc.IsWaitingForManualApproval) {
          anotherInvoiceWaitingForManualApproval = true
        }
      }
    }

    if (anotherInvoiceWaitingForManualApproval) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AnotherInvoiceAwaitingApproval"))
    }

    var amountExceedsApprovedQuote = serviceRequest.QuoteStatus != TC_APPROVED or sumOfInvoices > serviceRequest.LatestQuote.Amount.Amount

    if (amountExceedsApprovedQuote) {
      var smallAmountThreshold = SmallAmountThresholds[invoice.Amount.Currency]
      if (smallAmountThreshold == null) {
        failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.CannotAutoApproveCurrency", invoice.Amount.Currency.DisplayName))
      }
      else if (invoice.Amount.Amount > smallAmountThreshold) {
        failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AmountExceedsThreshold"))
      }
    }

    return failureReasons
  }

  /**
   * Approves the supplied invoice. This should only be called if {@link #getFailedToQualifyReasons} succeeded.
   * @param invoice The invoice.
   * @param checkResult A summary of the results of the qualification step.
   */
  override function performAction(invoice: ServiceRequestInvoice, checkResult: InvoiceAutomaticProcessingQualificationCheckResult) {
    invoice.performOperation(
        :operation         = ServiceRequestOperation.TC_APPROVEINVOICE,
        :context           = null,
        :performedBySystem = true
    )
  }

  /**
   * Records the fact that this invoice failed to qualify for auto-approval by updating invoice.DeclinedReason, and
   * creating an INVOICE_NOT_AUTO_APPROVED activity to notify the user (unless an open activity of this type already
   * exists).
   */
  override function registerFailure(invoice: ServiceRequestInvoice, checkResult: InvoiceAutomaticProcessingQualificationCheckResult) {
    super.registerFailure(invoice, checkResult)

    if (invoice.Source != StatementSource.TC_MANUAL) {
      var serviceRequest = invoice.ServiceRequest
      var pattern = ServiceRequestActivityPattern.INVOICE_NOT_AUTO_APPROVED.Pattern

      // create a new activity unless one is already open
      if (!serviceRequest.Activities.hasMatch(\ act -> act.Status == ActivityStatus.TC_OPEN and act.ActivityPattern == pattern)) {
        serviceRequest.createNewActivity(pattern)
      }
    }
  }

  /**
   * @return A general-purpose failure message to be used when the underlying reason is not end-user displayable
   * (for instance because it is an internal error).
   */
  override protected property get FailedToQualifyGenericMessageForNoReason(): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoApprovalFailed")
  }

  /**
   * Converts the supplied reason into a message suitable for display to the end user. For instance it could use a
   * DisplayKey to prepend "The operation failed because " to the supplied reason.
   * @param reason The reason the operation failed.
   * @return A user-friendly message based on that reason.
   */
  override protected function getFailedToQualifyMessageForSingleReason(reason: String): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoApprovalFailedBecauseSingleReason", reason.uncapitalize())
  }

  /**
   * Converts the supplied reasons into a message suitable for display to the end user. For instance an implementation
   * might use a DisplayKey like "The operation failed because: {0}" and pass in the reasons.
   * @param reasons The reasons the operation failed.
   * @return A user-friendly message based on that reason.
   */
  override protected function getFailedToQualifyMessageForMultipleReasons(reasons: String): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoApprovalFailedBecause", reasons)
  }
}

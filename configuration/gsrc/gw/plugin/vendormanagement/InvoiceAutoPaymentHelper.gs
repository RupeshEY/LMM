package gw.plugin.vendormanagement

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.api.financials.PaymentExceedsReservesException
uses gw.api.locale.DisplayKey
uses gw.util.Pair
uses gw.vendormanagement.ServiceRequestActivityPattern
uses gw.vendormanagement.SpecialistServiceCodeConstants

uses java.lang.IllegalArgumentException
uses java.lang.Integer
uses java.lang.Throwable
uses java.util.ArrayList
uses java.util.HashMap
uses java.util.Map
uses java.util.TreeSet

/**
 * Helper to process invoices that require payment.
 */
@Export
class InvoiceAutoPaymentHelper extends AbstractInvoiceAutomaticStateTransitionHelper {
  static var _instance = new InvoiceAutoPaymentHelper()

  /**
   * This explicit map of service codes to CostType/CostCategory pairs is used to select the relevant ReserveLines.
   * This is a good solution when you want to auto-pay a small number of services, but it may become unwieldy as that
   * number increases. In that case you should design a different mechanism.
   */
  static var _serviceCodeMappings = {
    SpecialistServiceCodeConstants.AUTOBODYREPAIR	     -> Pair.make(CostType.TC_CLAIMCOST,  CostCategory.TC_BODY),
    SpecialistServiceCodeConstants.AUTOINSPREPAIRGLASS -> Pair.make(CostType.TC_CLAIMCOST,	CostCategory.TC_AUTOGLASS),
    SpecialistServiceCodeConstants.AUTORENTAL	         -> Pair.make(CostType.TC_CLAIMCOST,	CostCategory.TC_RENTAL),
    SpecialistServiceCodeConstants.AUTOTOWING	         -> Pair.make(CostType.TC_CLAIMCOST,	CostCategory.TC_TOWING),
    SpecialistServiceCodeConstants.MEDICALCARE		     -> Pair.make(CostType.TC_CLAIMCOST,	CostCategory.TC_MEDICAL)
  }

  static property get DefaultServiceCodeMapping(): Pair<CostType, CostCategory> {
    return Pair.make(CostType.TC_CLAIMCOST, CostCategory.TC_UNSPECIFIED)
  }

  static property get ServiceCodeMappings(): Map<String, Pair<CostType, CostCategory>> {
    return _serviceCodeMappings
  }


  /**
   * @return The singleton instance of this class.
   */
  static property get Instance(): InvoiceAutoPaymentHelper {
    return _instance
  }

  protected construct() {}

  /**
   * Returns all invoices in the supplied collection that are waiting for payment.<p/>
   * @param invoices A collection of invoices.
   * @return A list of the invoices to process.
   */
  override function getRelevantInvoices(invoices: List<ServiceRequestInvoice>): List<ServiceRequestInvoice> {
    return invoices.where(\ invoice -> invoice.IsWaitingForPayment)
  }

  /**
   * A variable of type ReserveLinesOwner can hold either a Claim or an Exposure.
   */
  structure ReserveLinesOwner {
    property get ReserveLines(): ReserveLine[]
  }

  /**
   * Returns a list of the objects that owns the candidate ReserveLines, determined by the following algorithm:
   *   - If the ServiceRequest is related to an Exposure, return a list containing only that Exposure
   *   - Else if it is related to an Incident, return the Incident's Exposures sorted by ClaimOrder
   *   - Else return a list containing only the Claim
   */
  protected function getAllReserveLineOwners(invoice: ServiceRequestInvoice): List<ReserveLinesOwner> {
    var answer: List<ReserveLinesOwner> = {}

    if (invoice.ServiceRequest.Exposure != null) {
      answer.add(invoice.ServiceRequest.Exposure)
    }
    else {
      var exposures = invoice.ServiceRequest.Incident.Exposures
      if (exposures.HasElements) {
        var listWithExposuresFromIncident = {
            exposures.sortBy(\exp -> exp.ClaimOrder).first()  // By default we'll just grab the first exposure
        }
        answer = listWithExposuresFromIncident
      }
      else {
        answer = { invoice.ServiceRequest.Claim }
      }
    }
    return answer
  }

  /**
   * Filters the List of all owners down to the subset we actually care about.
   *
   * The default implementation is to keep only the first element of the original List. It is expected that customers
   * will change this logic to suit their business needs.
   */
  protected function getFilteredReserveLineOwners(invoice: ServiceRequestInvoice): List<ReserveLinesOwner> {
    var answer = getAllReserveLineOwners(invoice)

    if (answer.HasElements) {
      answer = answer.subList(0, 1)
    }

    return answer
  }

  private function getAllReserveLinesFromOwners(owners: List<ReserveLinesOwner>): List<ReserveLine> {
    var answer = new ArrayList<ReserveLine>()
    var lineIsRelevant: block(line: ReserveLine): boolean

    for (owner in owners) {
      var lineOwnedByExposure = owner typeis Exposure
      var ownedLines          = owner.ReserveLines

      for (line in ownedLines) {
        // if we either got this from an Exposure, or (we got it from the Claim and) it's not on any of the Claim's Exposures
        if (lineOwnedByExposure or line.Exposure == null) {
          answer.add(line)
        }
      }
    }

    return answer
  }

  /**
   * Manages a mapping of CostCategory to CostType.
   */
  interface ICostCategoryToTypeMap {
    /** @param pair The [CostType, CostCategory] pair to add to the collection. */
    function addPair(pair: Pair<CostType, CostCategory>)
    /** @return the accumulated mapping */
    property get Map(): Map<CostCategory, CostType>
  }

  /**
   * Manages a mapping of CostCategory to CostType.
   */
  class CostCategoryToTypeMap implements ICostCategoryToTypeMap {
    private var _mapping: Map<CostCategory, CostType>

    override function addPair(pair: Pair<CostType, CostCategory>) {
      _mapping[pair.Second] = pair.First
    }

    override property get Map(): Map<CostCategory, CostType> {
      return _mapping
    }
  }

  /**
   * Manages a mapping of CostCategory to CostType that contains at most 1 such mapping. Only the first mapping added is
   * is kept. If a new (nonequivalent) mapping is "added", the first mapping is replaced by the default mapping.
   */
  class SingleCostCategoryToTypeMap implements ICostCategoryToTypeMap {
    private var _soleMapping: Pair<CostType, CostCategory>

    override function addPair(pair: Pair<CostType, CostCategory>) {
      if (_soleMapping == null) {
        _soleMapping = pair  // save the first non-null pair received
      }
      else if (_soleMapping == pair) {
        // ignore duplicate "adds"
      }
      else {  // if more than one distinct CostType/CostCategory, map the whole thing to the DefaultMapping
        _soleMapping = DefaultServiceCodeMapping
      }
    }

    override property get Map(): Map<CostCategory, CostType> {
      return { _soleMapping.Second -> _soleMapping.First }
    }
  }

  /**
   * @return the CostType/CostCategory (if any) for each SRInstructionService on this ServiceRequest. Since
   * CostType:CostCategory is 1:M we eliminate collisions by hashing on the latter.
   */
  private function getCostCategoriesForInstructionServices(invoice: ServiceRequestInvoice): Map<CostCategory, CostType> {
    var answer = new SingleCostCategoryToTypeMap()  // by default we just keep a single cost category

    for (sriService in invoice.ServiceRequest.Instruction.Services) {
      var costTypeAndCategory = ServiceCodeMappings[sriService.Service.Code] ?: DefaultServiceCodeMapping
      answer.addPair(costTypeAndCategory)
    }

    return answer.Map
  }

  /**
   * A Map of ReserveLine to CurrencyAmount that keeps a total amount and tracks how much of it has been distributed.
   */
  private class CurrencyAmountDistribution extends HashMap<ReserveLine, CurrencyAmount> {
    /** The amount to be distributed across ReserveLines. */
    var _totalAmount:     CurrencyAmount as readonly TotalAmount
    /** The amount that remains to be distributed to ReserveLines. */
    var _remainingAmount: CurrencyAmount as readonly RemainingAmount

    construct(totalAmount: CurrencyAmount) {
      super()
      _totalAmount     = totalAmount
      _remainingAmount = totalAmount
    }

    /** The amount that has been distributed across the ReserveLines. */
    property get DistributedAmount(): CurrencyAmount {
      return TotalAmount.subtract(RemainingAmount)
    }

    override function put(line: ReserveLine, amount: CurrencyAmount): CurrencyAmount {
      if (_remainingAmount < amount) {
        throw new IllegalArgumentException("The amount total exceeds the invoice amount!")
      }
      _remainingAmount -= amount
      var newAmount = containsKey(line) ? this[line] + amount : amount
      return super.put(line, newAmount)
    }
  }

  /**
   * @param invoice The Invoice to be paid
   * @param reserveLinesOwners A list that may include the Claim, some Exposures, both, or neither.
   * @return a mapping of ReserveLines for this Invoice to the CurrencyAmounts to be drawn from them.
   */
  function getReserveLineAmountDistribution(invoice: ServiceRequestInvoice, reserveLinesOwners: List<ReserveLinesOwner>): Map<ReserveLine, CurrencyAmount> {
    var reserveLineDistribution = new CurrencyAmountDistribution(invoice.Amount)

    // Gather all of the ReserveLines from the owners
    var candidateReserveLines = getAllReserveLinesFromOwners(reserveLinesOwners)

    if (candidateReserveLines.HasElements) {
      // 3. Handle any special cases
      /* For instance:
       * - If it is a Florida policy and an injury incident with a PIP exposure and a MedPay
       *   exposure, pay 80% out of PIP reserve and 20% out of Med Pay reserve.
       *
       * - If it is a New Jersey policy and an injury incident with a PIP exposure and a MedPay
       *   exposure, pay 100% out of PIP if the coverage limit has not been exhausted; otherwise,
       *   pay from a Medpay exposure reserve line.
       */

      // Collect all CostCategory->CostType mappings (if any) that may apply to this SR
      var costCatToType = getCostCategoriesForInstructionServices(invoice)

      // Narrow down the ReserveLines to ...
      for (reserveLine in candidateReserveLines) {
        if (
          // those whose CostType/CostCategory are in that mapping
          reserveLine.CostType == costCatToType[reserveLine.CostCategory]

          // and whose reserving currency matches the SR/Invoice currency
           and reserveLine.ReservingCurrency == invoice.ServiceRequest.Currency
        ) {
          reserveLineDistribution[reserveLine] = reserveLineDistribution.RemainingAmount

          // The default behavior is to just take the first one. If you want to select more than one line you will need
          // to implement an algorithm that decides how to distribute the total amount.
          break
        }
      }
    }

    return reserveLineDistribution
  }

  /**
   * Returns a list of the reasons the supplied invoice is NOT qualified. If the collection is empty no objections
   * could be found.
   **/
  override protected function getFailedToQualifyReasons(invoice: ServiceRequestInvoice): List<String> {
    final var failureReasons = new ArrayList<String>()
    final var serviceRequest = invoice.ServiceRequest
    final var owners         = getFilteredReserveLineOwners(invoice)
    final var claim          = serviceRequest.Claim

    if (!serviceRequest.Claim.AtAbilityToPay) {
      failureReasons.add(DisplayKey.get("Rules.TransactionApproval.ClaimNotAtAbilityToPay"))
    }

    // Are owners AtAbilityToPay?
    var exposuresNotAtPayment = new TreeSet<Integer>()
    for (owner in owners) {
      if (owner typeis Exposure and !owner.AtAbilityToPay) {
        exposuresNotAtPayment.add(owner.ClaimOrder)
      }
    }
    if (exposuresNotAtPayment.HasElements) {
      failureReasons.add(DisplayKey.get("Java.Rules.TransactionApproval.ExposuresNotAtAbilityToPay", exposuresNotAtPayment.join(", ")))
    }

    // Has this invoice ever had any unpay operations?
    var finalUnpayOperation: ServiceRequestChange
    for (change in invoice.ServiceRequest.History) {
      if (change.RelatedStatement == invoice and change.Operation == ServiceRequestOperation.TC_UNPAYINVOICE) {
        // save the one with the highest sequence
        if (finalUnpayOperation == null or finalUnpayOperation.Sequence < change.Sequence) {
          finalUnpayOperation = change
        }
      }
    }

    if (finalUnpayOperation != null) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.PreviousUnpayOperation", finalUnpayOperation.Timestamp))
    }

    // For Exposure-level ServiceRequests
    if (serviceRequest.Exposure == null) {
      //We'll skip the check below if the ServiceRequest has an Exposure, since the Exposure will be specified.
      if (serviceRequest.Incident != null) {
        // Do we have the right number of exposures?
        var numExposures = serviceRequest.Incident.Exposures.Count
        if (numExposures == 0) {
          failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.RelatedIncidentHasNoExposure"))
        }
        else if (numExposures > 1) {
          failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.RelatedIncidentHasMultipleExposures"))
        }
      }
    }

    // Was reserve line determined?
    final var reserveLineMap = getReserveLineAmountDistribution(invoice, owners)
    if (reserveLineMap.Empty) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.CouldNotDetermineReserveLine"))
    }

    // Do we have enough reserves?
    var reserveCalc = FinancialsCalculations.RemainingReserves
    for (reserveLine in reserveLineMap.Keys) {
      var toBePaidFromThisLine = reserveLineMap[reserveLine]
      var availInThisLine = reserveCalc.withReserveLine(reserveLine).Amount

      if (availInThisLine < toBePaidFromThisLine) {
        failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.InvoiceExceedsReservesOnReserveLine", reserveLine.DisplayName))
      }
    }

    // Is the Specialist able to receive a check?
    if (serviceRequest.Specialist.PrimaryAddress == null) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.VendorMissingPrimaryAddress"))
    }

    // Is the payment amount a non-negative number?
    if (invoice.Amount != null and invoice.Amount.Amount < 0) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.CheckAmountMustBeNonNegative"))
    }

    // WC stop payment when compensability is not determined
    if (claim.LossType == LossType.TC_WC and !claim.isWCCompensabilityDetermined()) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.CompensabilityNotDetermined"))
    }

    // Is the operation available?
    if (!invoice.operationAvailable(TC_PAYINVOICE, false, null)) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.OperationUnavailable"))
    }

    // Is this Claim under Financial Hold?
    if (claim.applyFinancialHolds()) {
      failureReasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.ClaimIsUnderFinancialHold"))
    }

    return failureReasons
  }

  /**
   * Pays the supplied invoice.  This should only be called if {@link #getFailedToQualifyReasons} succeeded.
   * @param invoice The invoice.
   * @param checkResult A summary of the results of the qualification step.
   */
  override function performAction(invoice: ServiceRequestInvoice, checkResult: InvoiceAutomaticProcessingQualificationCheckResult) {
    var payee = invoice.ServiceRequest.Specialist

    // Only write a check if the amount is non-negative.
    if (invoice.Amount != null and invoice.Amount.Amount > 0) {
      var reservesDistribution  = getReserveLineAmountDistribution(invoice, getFilteredReserveLineOwners(invoice))
      var someReserveLine       = reservesDistribution.Keys.first()     // choose one arbitrarily
      var someReserveLineAmount = reservesDistribution[someReserveLine]

      var creator = someReserveLine.Exposure == null
          ? someReserveLine.Claim.newCheckCreator()
          : someReserveLine.Exposure.newCheckCreator()

      creator
          .withInvoice(invoice)
          .withPayee(payee)
          .withPayeeRole(ContactRole.TC_VENDOR)
          .withPaymentType(PaymentType.TC_PARTIAL)
          .withCostType(someReserveLine.CostType)
          .withCostCategory(someReserveLine.CostCategory)
          .withCheckAmount(someReserveLineAmount)
      reservesDistribution.remove(someReserveLine)             // don't double process it

      var check = creator.createCheck()

      //Only map across line items if we had only a single reserve line.  Otherwise, we just give each payment a single
      //uncategorized line item for its portion of the distribution
      if (reservesDistribution.Empty) {
        mapServiceRequestStatementLineItemsIntoPayment(invoice, check.Payments[0], someReserveLine)
      } else {
        // now process the distribution that remains
        reservesDistribution.eachKeyAndValue(\ reserveLine, amount -> {
          var payment = check.addNewPayment(reserveLine.Exposure, reserveLine.CostType, reserveLine.CostCategory)
          payment.addNewLineItem(amount, null, null)
        })
      }

      creator.prepareForCommit()
    }

    invoice.performOperation(
        :operation         = ServiceRequestOperation.TC_PAYINVOICE,
        :context           = null,
        :performedBySystem = true
    )
  }

  private function mapServiceRequestStatementLineItemsIntoPayment(invoice: ServiceRequestInvoice, payment : Payment, reserveLine : ReserveLine) {
    payment.removeFromLineItems(payment.LineItems[0])

    for (var lineItem in invoice.LineItems) {
      var lineCat : LineCategory
      if (lineItem.Category != null) {
        //assume 1-1 mapping into LineCategory
        var lineCats = lineItem.Category?.Categories.where( \cat -> cat typeis LineCategory)
        lineCat = lineCats.first() as LineCategory
        if (lineCats.IsEmpty) {
          Logger.warn(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.LineItemWithNoLineCategory", lineItem.Category))
        } else if (lineCats.Count > 1) {
          Logger.warn(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.LineItemWithMultipleLineCategories", lineItem.Category))
        }

        if (lineCat != null) {
          //Warn if the line category is not compatible with the reserve line
          if (!(lineCat.hasCategory(reserveLine.CostType))) {
            Logger.warn(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.LineItemWithIncompatibleCostType", lineItem.Category, reserveLine.CostType))
          } else if (!(lineCat.hasCategory(reserveLine.CostCategory))) {
            Logger.warn(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.LineItemWithIncompatibleCostCategory", lineItem.Category, reserveLine.CostCategory))
          }
        }
      }

      payment.addNewLineItem(lineItem.Amount, null, lineCat)
    }
  }

  /**
   * Records the fact that this invoice failed to qualify auto-payment by updating the invoice.DeclinedReason, and
   * creating an INVOICE_NOT_AUTO_PAID activity to notify the user (unless an open activity of this type already
   * exists).
   */
  override function registerFailure(invoice: ServiceRequestInvoice, checkResult: InvoiceAutomaticProcessingQualificationCheckResult) {
    super.registerFailure(invoice, checkResult)
    if (invoice.Source != StatementSource.TC_MANUAL) {
      var serviceRequest = invoice.ServiceRequest
      var pattern = ServiceRequestActivityPattern.INVOICE_NOT_AUTO_PAID.Pattern

      // create a new activity unless one is already open
      if (!serviceRequest.Activities.hasMatch(\act -> act.Status == ActivityStatus.TC_OPEN and act.ActivityPattern == pattern)) {
        serviceRequest.createNewActivity(pattern)
      }
    }
  }

  /**
   * @return A general-purpose failure message to be used when the underlying reason is not end-user displayable
   * (for instance because it is an internal error).
   */
  override protected property get FailedToQualifyGenericMessageForNoReason(): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaymentFailed")
  }

  /**
   * Converts the supplied reason into a message suitable for display to the end user. For instance it could use a
   * DisplayKey to prepend "The operation failed because " to the supplied reason.
   * @param reason The reason the operation failed.
   * @return A user-friendly message based on that reason.
   */
  override protected function getFailedToQualifyMessageForSingleReason(reason: String): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaymentFailedBecauseSingleReason", reason.uncapitalize())
  }

  /**
   * Converts the supplied reasons into a message suitable for display to the end user. For instance an implementation
   * might use a DisplayKey like "The operation failed because: {0}" and pass in the reasons.
   * @param reasons The reasons the operation failed.
   * @return A user-friendly message based on that reason.
   */
  override protected function getFailedToQualifyMessageForMultipleReasons(reasons: String): String {
    return DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.AutoPaymentFailedBecause", reasons)
  }

  /**
   * Converts the supplied Throwable into <i>specific</i> messages suitable for display to the end user.
   * @param ex The exception that was caught.
   * @return A List of <i>specific</i> user-friendly error messages to display to the user for that exception, or an
   * empty List if there are none.
   */
  override function getSpecificFailedToQualifyReasonsForException(ex: Throwable): List<String> {
    var reasons: List<String> = {}

    if (ex typeis PaymentExceedsReservesException) {
      reasons.add(DisplayKey.get("Web.Plugin.InvoiceAutoApproveAutoPayPlugin.InvoiceExceedsReserves"))
    }
    else {
      reasons = super.getSpecificFailedToQualifyReasonsForException(ex)
    }

    return reasons
  }

}

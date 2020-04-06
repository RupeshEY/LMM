package gw.api.financials

uses gw.api.system.CCConfigParameters
uses java.util.Set

/**
 * An abstract ReserveLineInputSetStrategy implementation appropriate for
 * payment-related screens, enforcing the rules for selecting reserve lines and
 * exposures when editing payments, ensuring that exposures match any service
 * request invoices on the check, and ensuring that all payments on a check have
 * the same reserving currency.
 */
@Export
abstract class ReserveLineInputSetStrategyForPaymentBase
    extends ReserveLineInputSetStrategyThatPreservesExchangeRate {

  // A set of Service Request(s) that linked to this check
  var _filteringServiceRequests : Set<ServiceRequest>
  var _manualCheck : boolean

  construct(check : Check, doNotFilterOnServiceRequests: boolean = false) {
    super(check.TransToReservingExchangeRate)

    if (doNotFilterOnServiceRequests) {
      // Make filteringServiceRequests an empty set if filtering is turned off
      // it will not go through filtering logic in isCompatibleWithServiceRequests()
      _filteringServiceRequests = {}
    } else {
      // Only do filtering when intended to
      _filteringServiceRequests = check.ServiceRequestInvoices*.ServiceRequest.toSet()
    }
    _manualCheck = check.ManualCheck
  }

  // A service request is compatible with a reserve line if
  // a) the service request is not linked to an incident or exposure,
  // b) the reserve line is not linked to an exposure,
  // c) the service request is linked to the reserve line's exposure, or
  // d) the service request is not linked to an exposure and the reserve line's exposure refers to the same incident as the service request.

  private function isCompatibleWithServiceRequests(exposure: Exposure): boolean {
    // Only do filtering when there is exactly one Service Request and
    if (_filteringServiceRequests.Count == 1) {
      var serviceRequest = _filteringServiceRequests.single()
      // a) the invoice' service request is not linked to an incident or exposure
      if (serviceRequest.RelatedTo typeis Claim) {
        return true
      } else {
        // c) the service request is linked to the reserve line's exposure, or
        // d) the reserve line's exposure refers to the same incident as the service request.
        return serviceRequest.RelatedTo == exposure or serviceRequest.RelatedTo == exposure.Incident
      }
    } else {
      // No filtering when there are multiple or no Service Requests
      return true;
    }
  }

  override final function allowExistingReserveLine(reserveLine : ReserveLine) : boolean {
    // b) the reserve line is not linked to an exposure
    if (reserveLine.Exposure == null) {
      return allowExistingClaimLevelReserveLine(reserveLine.Claim, reserveLine)
    } else {
      return allowExistingExposureLevelReserveLine(reserveLine.Exposure, reserveLine)
    }
  }

  protected function allowExistingClaimLevelReserveLine(claim : Claim, reserveLine : ReserveLine) : boolean {
    if (not claim.hasPassedAbilityToPay()) {
      return false
    } else if (not claim.Closed) {
      return (AllowPaymentsExceedReservesLimits and hasAnyReserves(reserveLine)) or hasAvailableReserves(reserveLine)
    } else {
      return AllowNoPriorPaymentSupplement or hasAnyLevelPayments(claim)
    }
  }

  protected function allowExistingExposureLevelReserveLine(exposure : Exposure, reserveLine : ReserveLine) : boolean {
    if (not isCompatibleWithServiceRequests(exposure) or not exposure.hasPassedAbilityToPay()) {
      return false
    } else if (not exposure.Closed) {
      return (AllowPaymentsExceedReservesLimits and hasAnyReserves(reserveLine)) or hasAvailableReserves(reserveLine)
    } else {
      return AllowNoPriorPaymentSupplement or hasExposureLevelPayments(exposure)
    }
  }

  override function allowNewClaimLevelReserveLine(claim : Claim) : boolean {
    // b) the reserve line is not linked to an exposure
    if (not claim.hasPassedAbilityToPay()) {
      return false
    } else if (not claim.Closed) {
      return _manualCheck or AllowPaymentsExceedReservesLimits or not hasClaimLevelReserves(claim)
    } else {
      return AllowNoPriorPaymentSupplement
    }
  }

  override function allowNewExposureLevelReserveLine(exposure : Exposure) : boolean {
    if (not isCompatibleWithServiceRequests(exposure) or not exposure.hasPassedAbilityToPay()) {
      return false
    } else if (not exposure.Closed) {
      return _manualCheck or AllowPaymentsExceedReservesLimits or not hasExposureLevelReserves(exposure)
    } else {
      return AllowNoPriorPaymentSupplement
    }
  }

  override function restrictReservingCurrency(transaction : Transaction) : Currency {
    var payment = transaction as Payment
    for (otherPayment in payment.Check.Payments) {
      if (otherPayment != payment and otherPayment.ReservingCurrency != null) {
        return otherPayment.ReservingCurrency
      }
    }
    return null
  }

  private static property get AllowPaymentsExceedReservesLimits() : boolean {
    return CCConfigParameters.AllowPaymentsExceedReservesLimits.Value
  }

  private static property get AllowNoPriorPaymentSupplement() : boolean {
    return CCConfigParameters.AllowNoPriorPaymentSupplement.Value
  }

  private static function hasAnyLevelPayments(claim : Claim) : boolean {
    return FinancialsCalculations.getTotalPaymentsWithPending()
            .withClaim(claim)
            .hasContributingTransactions()
  }

  private static function hasClaimLevelPayments(claim : Claim) : boolean {
    return FinancialsCalculations.getTotalPaymentsWithPending()
            .withClaim(claim)
            .useClaimLevelReserves()
            .hasContributingTransactions()
  }

  private static function hasExposureLevelPayments(exposure : Exposure) : boolean {
    return FinancialsCalculations.getTotalPaymentsWithPending()
            .withExposure(exposure)
            .hasContributingTransactions()
  }

  private static function hasAnyLevelReserves(claim : Claim) : boolean {
    return FinancialsCalculations.getTotalReservesWithPending()
            .withClaim(claim)
            .hasContributingTransactions()
  }

  private static function hasClaimLevelReserves(claim : Claim) : boolean {
    return FinancialsCalculations.getTotalReservesWithPending()
            .withClaim(claim)
            .useClaimLevelReserves()
            .hasContributingTransactions()
  }

  private static function hasExposureLevelReserves(exposure : Exposure) : boolean {
    return FinancialsCalculations.getTotalReservesWithPending()
            .withExposure(exposure)
            .hasContributingTransactions()
  }

  private static function hasAnyReserves(reserveLine : ReserveLine) : boolean {
    return FinancialsCalculations.getTotalReservesWithPending()
            .withReserveLine(reserveLine)
            .hasContributingTransactions()
  }

  private static function hasAvailableReserves(reserveLine : ReserveLine) : boolean {
    return FinancialsCalculations.getAvailableReserves()
            .noNulls()
            .withReserveLine(reserveLine)
            .ReservingAmount
            .signum() > 0
  }

}
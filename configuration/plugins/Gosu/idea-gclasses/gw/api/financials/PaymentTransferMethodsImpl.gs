package gw.api.financials

uses gw.api.database.Queries
uses org.apache.commons.lang3.ObjectUtils

@Export
class PaymentTransferMethodsImpl implements PaymentTransferMethods {

  var _payment: Payment

  construct(payment : Payment) {
    this._payment = payment
  }

  override function findMatchingTargetExposureForTransfer(claim: Claim) : Exposure {
    var exposureToMatch = _payment.Exposure
    if (exposureToMatch == null) {
      return null;
    }

    var targetExposures = claim.Exposures
    if (targetExposures.Count == 0) {
      return null;
    }

    return targetExposures.firstWhere( \ targetExposure ->
            exposureToMatch.PrimaryCoverage == targetExposure.PrimaryCoverage and
            ObjectUtils.equals(exposureToMatch.LossParty, targetExposure.LossParty)
    )
  }

  override function findMatchingTargetReserveLineForTransfer(targetReservingCurrency: Currency): ReserveLine {
    return (Queries.createQuery(ReserveLine)
            .compare(ReserveLine#Claim, Equals, _payment.Claim)
            .compare(ReserveLine#Exposure, Equals, _payment.Exposure)
            .compare(ReserveLine#CostType, Equals, _payment.CostType)
            .compare(ReserveLine#CostCategory, Equals, _payment.CostCategory)
            .compare(ReserveLine#ReservingCurrency, Equals, targetReservingCurrency)
            .select()
            .AtMostOneRow) as ReserveLine
  }

}
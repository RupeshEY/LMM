package gw.plugin.authoritylimits.sum

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration
uses gw.plugin.authoritylimits.AuthorityLimitsUtil.AmountTypeEnum

uses java.math.BigDecimal
uses java.math.RoundingMode

@Export
class PaymentsExceedReservesSum extends AbstractAuthoritySum {

  override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(bean typeis CheckSet ? null : "The ApprovableBean must be a CheckSet not " + bean.IntrinsicType.Name)
    Assert.check(limit.LimitType == AuthorityLimitType ? null : "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var checkSet = bean as CheckSet
    var newPayments = checkSet.PrimaryCheck.Payments
    Assert.check(newPayments.length > 0 ? null : "A check must have at least one payment.")

    var costType = limit.CostType
    var reservesCalculator = FinancialsCalculations.AvailableReserves
    var exposures = AuthorityLimitsConfiguration.getExposures(checkSet.Claim, limit)

    // calculate the available reserves and new payments for each reserve line independently
    for (var reserveLine in getReserveLines(checkSet)) {
      var costTypeMatches = costType == null || (costType == reserveLine.CostType)
      var exposureMatches = exposures == null || exposures.contains(reserveLine.Exposure)
      if (costTypeMatches && exposureMatches) {
        var availReservesAmount = reservesCalculator.withReserveLine(reserveLine).Amount
        if (availReservesAmount == null) {
          availReservesAmount = CurrencyAmount.getStrict(BigDecimal.ZERO, newPayments[0].Claim.Currency)
        }
        var offsetReservesAmount = sumReserves(checkSet, reserveLine)
        availReservesAmount = availReservesAmount.subtractStrict(offsetReservesAmount)

        var paymentAmount = sumPaymentsAmount(checkSet, AmountTypeEnum.CLAIM, reserveLine)
        if (paymentAmount.compareTo(availReservesAmount) > 0) {
          var sum = paymentAmount.subtractStrict(availReservesAmount)
          var limitAmount = limit.LimitAmount
          if (sum.Currency != limitAmount.Currency) {
            limitAmount = limitAmount.convert(sum.Currency, RoundingMode.UP)
          }
          if (sum.compareTo(limitAmount) > 0) {
            return true
          }
        }
      }
    }
    return false
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_PER
  }
}
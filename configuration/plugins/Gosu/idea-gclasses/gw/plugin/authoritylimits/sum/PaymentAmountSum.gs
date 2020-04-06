package gw.plugin.authoritylimits.sum

uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration
uses gw.plugin.authoritylimits.AuthorityLimitsUtil.AmountTypeEnum

uses java.math.RoundingMode

@Export
class PaymentAmountSum extends AbstractAuthoritySum {

  override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(bean typeis CheckSet ? null : "Bean must be a CheckSet")
    Assert.check(limit.LimitType == AuthorityLimitType ? null :
        "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var checkSet = bean as CheckSet
    var exposures = AuthorityLimitsConfiguration.getExposures(checkSet.Claim, limit)
    var claimSum = sumPaymentsAmount(checkSet, AmountTypeEnum.CLAIM, exposures, limit.CostType)
    var transactionSum = sumPaymentsAmount(checkSet, AmountTypeEnum.TRANSACTION, exposures, limit.CostType)

    var limitAmount = limit.LimitAmount
    if (transactionSum.Currency == limitAmount.Currency) {
      return (transactionSum.compareTo(limitAmount) > 0)
    }
    if (claimSum.Currency != limitAmount.Currency) {
      limitAmount = limitAmount.convert(claimSum.Currency, RoundingMode.UP)
    }
    return (claimSum.compareTo(limitAmount) > 0)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_PA
  }
}
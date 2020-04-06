package gw.plugin.authoritylimits.sum

uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration

uses java.math.RoundingMode

@Export
class ReserveChangeSum extends AbstractAuthoritySum {

  override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(bean typeis ReserveSet ? null : "Bean must be a ReserveSet")
    Assert.check(limit.LimitType == AuthorityLimitType ? null : "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var reserves = (bean as ReserveSet).Reserves
    Assert.check(reserves.length > 0 ? null : "There must be at least one reserve in the ReserveSet.")
    var claim = reserves[0].Claim

    var exposures = AuthorityLimitsConfiguration.getExposures(claim, limit)
    var sum = sumReserves(reserves, exposures, limit)

    var limitAmount = limit.LimitAmount
    if (sum.Currency != limitAmount.Currency) {
      limitAmount = limitAmount.convert(sum.Currency, RoundingMode.UP)
    }
    return (sum.absStrict().compareTo(limitAmount) > 0)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_RCS
  }
}
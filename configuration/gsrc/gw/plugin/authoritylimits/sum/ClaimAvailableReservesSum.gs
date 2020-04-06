package gw.plugin.authoritylimits.sum

uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration

@Export
class ClaimAvailableReservesSum extends AbstractAuthoritySum {

  override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(bean typeis ReserveSet ? null : "The ApprovableBean must be a ReserveSet not " + bean.IntrinsicType.Name)
    Assert.check(limit.LimitType == AuthorityLimitType ? null : "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var theSet = bean as ReserveSet
    var newReserves = theSet.Reserves
    Assert.check(newReserves.length > 0 ? null : "There must be at least one reserve in the ReserveSet.")

    var claim = newReserves[0].Claim

    var exposures = AuthorityLimitsConfiguration.getExposures(claim, limit)
    var sum = sumExisting(FinancialsCalculations.AvailableReserves, claim, limit, exposures)
    sum = sum.addStrict(sumReserves(newReserves, exposures, limit))
    return testLimit(sum, limit)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_CAR
  }
}
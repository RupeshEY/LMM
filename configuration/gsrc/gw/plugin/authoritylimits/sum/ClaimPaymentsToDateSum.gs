package gw.plugin.authoritylimits.sum

uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration
uses gw.plugin.authoritylimits.AuthorityLimitsUtil.AmountTypeEnum

@Export
class ClaimPaymentsToDateSum extends AbstractAuthoritySum {

  override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(bean typeis CheckSet ? null : "Bean must be a CheckSet")
    Assert.check(limit.LimitType == AuthorityLimitType ? null : "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var checkSet = bean as CheckSet

    var claimId = checkSet.Claim.ID
    var claim: Claim
    if (!claimId.Temporary) {
      var bundle = gw.transaction.Transaction.newBundle()
      claim = bundle.loadBean(claimId) as Claim
    } else {
      claim = checkSet.Claim
    }

    var exposures = AuthorityLimitsConfiguration.getExposures(claim, limit)
    var sum = sumExisting(FinancialsCalculations.TotalPaymentsWithPending, claim, limit, exposures)
    sum = sum.addStrict(sumPaymentsChangeAmount(checkSet, AmountTypeEnum.CLAIM, exposures, limit.CostType))
    return testLimit(sum, limit)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_CPTD
  }
}
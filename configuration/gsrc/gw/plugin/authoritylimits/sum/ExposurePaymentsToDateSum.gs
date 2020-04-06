package gw.plugin.authoritylimits.sum

uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsUtil.AmountTypeEnum

@Export
class ExposurePaymentsToDateSum extends AbstractExposureAuthoritySum {

  override protected function getTransactions(batch: TransactionSet): Transaction[] {
    Assert.check(batch typeis CheckSet ? null : "The TransactionSet must be a CheckSet not " + batch.IntrinsicType.Name)
    return (batch as CheckSet).PrimaryCheck.Payments
  }

  override protected function exceedsLimit(batch: TransactionSet, limit: AuthorityLimit, exposure: Exposure): boolean {
    var costType = limit.CostType

    var cachedExposure: Exposure = null
    if (!exposure.isNew()) {
      var bundle = gw.transaction.Transaction.newBundle()
      cachedExposure = bundle.loadBean(exposure.ID) as Exposure
    } else {
      cachedExposure = exposure
    }
    var sum = sumExisting(FinancialsCalculations.TotalPaymentsWithPending, cachedExposure, limit)
    sum = sum.addStrict(sumPaymentsChangeAmount(batch, AmountTypeEnum.CLAIM, exposure, costType))
    return testLimit(sum, limit)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_EPTD
  }
}
package gw.plugin.authoritylimits.sum

uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert

@Export
class ExposureTotalReservesSum extends AbstractExposureAuthoritySum {

  override function getTransactions(batch: TransactionSet): Transaction[] {
    Assert.check(batch typeis ReserveSet ? null : "The TransactionSet must be a ReserveSet not " + batch.IntrinsicType.Name)
    return (batch as ReserveSet).Transactions
  }

  override function exceedsLimit(batch: TransactionSet, limit: AuthorityLimit, exposure: Exposure): boolean {
    var sum = sumExisting(FinancialsCalculations.TotalReserves, exposure, limit)
    sum = sum.addStrict(sumReserves((batch as ReserveSet).Reserves, {exposure}, limit))
    return testLimit(sum, limit)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_ETR
  }
}
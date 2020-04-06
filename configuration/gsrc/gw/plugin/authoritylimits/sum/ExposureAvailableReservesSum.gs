package gw.plugin.authoritylimits.sum

uses gw.api.financials.FinancialsCalculations
uses gw.pl.util.Assert

@Export
class ExposureAvailableReservesSum extends AbstractExposureAuthoritySum {

  override function getTransactions(theSet: TransactionSet): Transaction[] {
    Assert.check(theSet typeis ReserveSet ? null : "The TransactionSet must be a ReserveSet not " + theSet.IntrinsicType.Name)
    return (theSet as ReserveSet).Reserves
  }

  override function exceedsLimit(theSet: TransactionSet, limit: AuthorityLimit, exposure: Exposure): boolean {
    var sum = sumExisting(FinancialsCalculations.AvailableReserves, exposure, limit)
    sum = sum.addStrict(sumReserves((theSet as ReserveSet).Reserves, {exposure}, limit))
    return testLimit(sum, limit)
  }

  override property get AuthorityLimitType(): AuthorityLimitType {
    return typekey.AuthorityLimitType.TC_EAR
  }
}
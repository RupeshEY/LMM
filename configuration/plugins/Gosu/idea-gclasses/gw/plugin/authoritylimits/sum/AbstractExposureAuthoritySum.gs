package gw.plugin.authoritylimits.sum

uses gw.pl.util.Assert
uses gw.plugin.authoritylimits.AuthorityLimitsConfiguration

@Export
/**
 * Abstract implementation of exposure-level authority limit sums.
 * Authority limits that are calculated per exposure may extend this class to simplify implementation.
 */
abstract class AbstractExposureAuthoritySum extends AbstractAuthoritySum {

  final override function exceedsLimit(bean: Approvable, limit: AuthorityLimit): boolean {
    Assert.check(limit.LimitType == AuthorityLimitType ? null : "The limit must be of type " + AuthorityLimitType + " not " + limit.LimitType)

    var transactionSet = bean as TransactionSet
    var claimId = transactionSet.Claim.ID
    var claim: Claim
    if (!claimId.Temporary) {
      var bundle = gw.transaction.Transaction.newBundle()
      claim = bundle.loadBean(claimId) as Claim
    } else {
      claim = transactionSet.Claim
    }

    var validExposuresFromLimit = AuthorityLimitsConfiguration.getExposures(claim, limit)
    var exposuresToTest = getTransactions(transactionSet)*.Exposure.where(\ e -> e != null and (validExposuresFromLimit == null or validExposuresFromLimit.contains(e))).toSet()
    for (var exposure in exposuresToTest) {
      if (exceedsLimit(transactionSet, limit, exposure)) {
        return true
      }
    }
    return false
  }

  abstract protected function getTransactions(batch: TransactionSet): Transaction[]

  abstract protected function exceedsLimit(batch: TransactionSet, limit: AuthorityLimit, exposure: Exposure): boolean
}

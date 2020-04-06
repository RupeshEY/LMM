package gw.api.financials

/**
 * A ReserveLineInputSetStrategy implementation appropriate for recovery-related
 * screens, providing common on-change behavior when editing recoveries. There
 * is no filtering of reserve lines or exposures when editing recoveries, so the
 * various allow...() methods are not overridden.
 */
@Export
class ReserveLineInputSetStrategyForRecovery extends ReserveLineInputSetStrategyThatPreservesExchangeRate {

  internal construct(originalTransToReservingExchangeRate : ExchangeRate) {
    super(originalTransToReservingExchangeRate)
  }

  override function afterReserveLineChange(transaction : Transaction) {
    FinancialsUtil.ensureRecoveryHasOneLineItem(transaction as Recovery)
  }

  static function newHelper(originalTransToReservingExchangeRate : ExchangeRate) : ReserveLineInputSetHelper {
    var strategy = new ReserveLineInputSetStrategyForRecovery(originalTransToReservingExchangeRate)
    return new ReserveLineInputSetHelper(strategy)
  }
}

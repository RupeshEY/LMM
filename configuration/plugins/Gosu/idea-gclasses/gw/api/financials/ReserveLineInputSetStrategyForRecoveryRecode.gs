package gw.api.financials

uses gw.lang.Export

/**
 * A ReserveLineInputSetStrategy implementation appropriate for recovery
 * recode screens, disallowing the user from changing the reserving currency
 * when recoding a recovery.
 */
@Export
class ReserveLineInputSetStrategyForRecoveryRecode extends ReserveLineInputSetStrategyForRecovery {

  internal construct(originalTransToReservingExchangeRate : ExchangeRate) {
    super(originalTransToReservingExchangeRate)
  }

  static function newHelper(originalTransToReservingExchangeRate : ExchangeRate) : ReserveLineInputSetHelper {
    var strategy = new ReserveLineInputSetStrategyForRecoveryRecode(originalTransToReservingExchangeRate)
    return new ReserveLineInputSetHelper(strategy)
  }

  override function restrictReservingCurrency(transaction: Transaction) : Currency {
    return transaction.ReservingCurrency
  }

}
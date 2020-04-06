package gw.api.financials

uses gw.lang.Export

/**
 * An abstract ReserveLineInputSetStrategy implementation that restores the
 * TransToReservingExchangeRate on the transaction being edited to its
 * previously saved value whenever the transaction's reserving currency is
 * changed in the UI back to its previously saved reserving currency, either by
 * selecting a reserve line with that reserving currency or by selecting that
 * reserving currency explicitly for a new reserve line, as long as the
 * transaction currency also matches the previously saved transaction currency.
 *
 * <p>NOTE: If the transaction is itself newly created, and therefore has no
 * previously saved exchange rate, this strategy simply does nothing. The
 * default behavior whenever the reserving currency on a transaction changes is
 * to get the appropriate market rate.
 */
@Export
abstract class ReserveLineInputSetStrategyThatPreservesExchangeRate extends ReserveLineInputSetStrategy {

  var _originalTransToReservingExchangeRate : ExchangeRate

  internal construct(originalTransToReservingExchangeRate : ExchangeRate) {
    _originalTransToReservingExchangeRate = originalTransToReservingExchangeRate
  }

  override function afterReservingCurrencyChange(transaction: Transaction) {
    super.afterReservingCurrencyChange(transaction)

    // If the Transaction is being set to a RL with same Reserving Currency as that of the original
    // TransToReservingExchangeRate -and- the Transaction currency hasn't changed...
    if(transaction.ReservingCurrency.equals(_originalTransToReservingExchangeRate.PriceCurrency) and
        transaction.Currency.equals(_originalTransToReservingExchangeRate.BaseCurrency)) {
      // ...then, restore the original TransToReservingCurrencyExchangeRate
      transaction.TransToReservingExchangeRate = _originalTransToReservingExchangeRate
    }
  }
}

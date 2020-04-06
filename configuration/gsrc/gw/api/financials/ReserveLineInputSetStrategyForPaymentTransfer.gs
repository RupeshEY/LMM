package gw.api.financials

/**
 * A ReserveLineInputSetStrategy appropriate for the transfer check screen,
 * restricting the reserving currency even for a single payment.
 */
@Export
class ReserveLineInputSetStrategyForPaymentTransfer extends ReserveLineInputSetStrategyForPaymentTransferAndRecode {

  static function newHelper(check : Check) : ReserveLineInputSetHelper {
    return new ReserveLineInputSetHelper(new ReserveLineInputSetStrategyForPaymentTransfer(check))
  }

  private construct(check : Check) {
    super(check, true)
  }

  /**
   * The parent implementation doesn't restrict by Reserving Currency if the check has only single payment on it.
   * This shouldn't be the case for Check Transfers, where the user chooses a Target Reserving Currency upfront and
   * hence would expect the Reserve Lines to be always filtered by that chosen Reserving Currency, irrespective of
   * whether the Check has single or multiple payments on it.
  */
  override function restrictReservingCurrency(transaction: Transaction): Currency {
    var currencyToRestrictTo = super.restrictReservingCurrency(transaction)

    return (currencyToRestrictTo == null) ? transaction?.ReservingCurrency : currencyToRestrictTo
  }
}
package gw.api.financials

/**
 * A ReserveLineInputSetStrategy implementation appropriate for the payment
 * recode screen, not providing any additional behavior over the common behavior
 * inherited from its abstract superclass.
 */
@Export
class ReserveLineInputSetStrategyForPaymentRecode extends ReserveLineInputSetStrategyForPaymentTransferAndRecode {

  static function newHelper(check : Check) : ReserveLineInputSetHelper {
    return new ReserveLineInputSetHelper(new ReserveLineInputSetStrategyForPaymentRecode(check))
  }

  private construct(check : Check) {
    super(check, true)
  }
}
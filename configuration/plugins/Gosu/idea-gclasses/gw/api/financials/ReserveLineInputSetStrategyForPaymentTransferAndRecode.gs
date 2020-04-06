package gw.api.financials

/**
 * An abstract ReserveLineInputSetStrategy implementation providing common
 * on-change behavior for both check transfer and recode payment screens.
 */
@Export
abstract class ReserveLineInputSetStrategyForPaymentTransferAndRecode
        extends ReserveLineInputSetStrategyForPaymentBase {

  protected construct(check : Check, doNotFilterOnServiceRequests: boolean) {
    super(check, doNotFilterOnServiceRequests)
  }

  private function afterAnyChange(payment : Payment) {
    FinancialsUtil.validateCostCategoryAndTransactionLines(payment)
    FinancialsUtil.refreshPaymentType(payment)
  }

  override function afterReserveLineChange(transaction : Transaction) {
    afterAnyChange(transaction as Payment)
  }

  override function afterExposureChange(transaction : Transaction) {
    afterAnyChange(transaction as Payment)
  }

  override function afterCostTypeChange(transaction : Transaction) {
    afterAnyChange(transaction as Payment)
  }

  override function afterCostCategoryChange(transaction : Transaction) {
    afterAnyChange(transaction as Payment)
  }

}

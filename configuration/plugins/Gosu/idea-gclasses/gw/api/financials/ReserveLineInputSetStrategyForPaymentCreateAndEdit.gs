package gw.api.financials

/**
 * A ReserveLineInputSetStrategy implementation appropriate for the various
 * check wizards (e.g. normal, manual, quick, and edit), providing common
 * on-change behavior when creating and editing payments.
 */
@Export
class ReserveLineInputSetStrategyForPaymentCreateAndEdit extends ReserveLineInputSetStrategyForPaymentBase {

  static function newHelper(wizard : CheckWizardInfo) : ReserveLineInputSetHelper {
    return new ReserveLineInputSetHelper(new ReserveLineInputSetStrategyForPaymentCreateAndEdit(wizard))
  }

  var _wizard : CheckWizardInfo

  construct(wizard : CheckWizardInfo) {
    super(wizard.Check, wizard.EditingCheck)
    _wizard = wizard
  }

  override function beforeReserveLineChange(transaction : Transaction) {
    var payment = transaction as Payment
    payment.unapplyAndRemoveDeductibleLineItem(payment.SharedDeductible)
  }

  override function afterReserveLineChange(transaction : Transaction) {
    var payment = transaction as Payment
    payment.PaymentType = null
    payment.ErodesReserves = true
  }

  override function beforeExposureChange(transaction : Transaction) {
    var payment = transaction as Payment
    payment.unapplyAndRemoveDeductibleLineItem(payment.SharedDeductible)
  }

  override function afterReservingCurrencyChange(transaction : Transaction) {
    super.afterReservingCurrencyChange(transaction)

    _wizard.DefaultCurrency = transaction.ReservingCurrency
  }

}

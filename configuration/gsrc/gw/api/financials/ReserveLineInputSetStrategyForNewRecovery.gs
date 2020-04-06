package gw.api.financials

uses gw.lang.Export

/**
 * A ReserveLineInputSetStrategy implementation appropriate for recovery
 * creation screens, providing additional on-change behavior.
 */
@Export
class ReserveLineInputSetStrategyForNewRecovery extends ReserveLineInputSetStrategyForRecovery {

  var _recoveryHelper : RecoveryHelper

  construct(recoveryHelper : RecoveryHelper) {
    super(:originalTransToReservingExchangeRate = null)

    this._recoveryHelper = recoveryHelper
  }

  static function newHelper(recoveryHelper : RecoveryHelper) : ReserveLineInputSetHelper {
    return new ReserveLineInputSetHelper(new ReserveLineInputSetStrategyForNewRecovery(recoveryHelper))
  }

  override function afterReservingCurrencyChange(transaction: Transaction) {
    super.afterReservingCurrencyChange(transaction)
    _recoveryHelper.autoSetRecoveryCurrency()
  }

}

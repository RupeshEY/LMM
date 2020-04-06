package gw.api.financials

/**
 * This class provides helpful methods for the NewRecoverySet page.
 */
@Export
class RecoveryHelper {

  var _recoveryCurrencySetExplicitly = false
  var _recovery : Recovery

  construct(recovery : Recovery) {
    this._recovery = recovery
  }

  property get RecoveryCurrency() : Currency {
    return _recovery.Currency
  }

  /**
   * Serves as a wrapper for Recovery.Currency. By having the NewRecoverySet pcf to refer to this property, instead of
   * accessing Recovery.Currency directly, we are able to detect whether the Recovery Currency has been explicitly set
   * by the user. Knowing this helps us to skip the automatic setting of the Recovery Currency to default value.
  */
  property set RecoveryCurrency(newCurrency : Currency) {
    _recovery.Currency = newCurrency
    _recoveryCurrencySetExplicitly = true
  }

  /**
   * Sets the Recovery Currency to a default value, <em>only if a value hasn't already been explicitly set by the user</em>.
   * As of now, this method is triggered whenever the Recovery's Payer or Reserve Line is selected.
   *
   * The default value is determined in the following fashion:
   * <ul>
   *   <li>If the Recovery's Payer has a Preferred Currency set, then always uses that as the default value.</li>
   *   <li>Else:</li>
   *   <ul>
   *     <li>If a Reserve Line has been selected, defaults to the Reserving Currency of that line.</li>
   *     <li>Else, leaves as-is (i.e. Claim Currency).</li>
   *   </ul>
   * </ul>
  */
  function autoSetRecoveryCurrency() {
    if(_recoveryCurrencySetExplicitly) {
      return
    }

    var preferredCurrency = _recovery.Payer.PreferredCurrency;
    if (preferredCurrency != null) {
      _recovery.Currency = preferredCurrency
    } else if(_recovery.ReserveLine != null) {
      _recovery.Currency = _recovery.ReservingCurrency
    } else {
      _recovery.Currency = _recovery.Claim.Currency
    }
  }

}
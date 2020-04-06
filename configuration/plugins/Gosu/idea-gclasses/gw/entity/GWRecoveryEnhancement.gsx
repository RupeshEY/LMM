package gw.entity

uses gw.api.util.CurrencyUtil

@Export
enhancement GWRecoveryEnhancement: Recovery {

  /**
   * Returns the Transaction Amount as a String with the right currency code
   */
  property get TransactionAmountDisplayValue() : String {
    return CurrencyUtil.renderAsCurrency(this.TransactionAmount)
  }
}

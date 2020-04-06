package gw.claim

uses gw.api.financials.CurrencyAmount

@Export
enhancement GWClaimLimitUsedAmountEnhancement : ClaimLimitUsedAmount {
  //These properties can be customized to return linear combinations of different components, as needed.
  property get NetIncurredContribution() : CurrencyAmount {
    return this.ReserveTotal
        .add(this.NonErodingPaymentTotal)
        .subtract(this.RecoveryTotal)
        .add(this.FutureNonErodingPaymentTotal)
  }

  property get NetPaidContribution() : CurrencyAmount {
    return this.ErodingPaymentTotal
        .add(this.NonErodingPaymentTotal)
        .subtract(this.RecoveryTotal)
        .add(this.FutureNonErodingPaymentTotal)
        .add(this.FutureErodingPaymentTotal)
  }
}

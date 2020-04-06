package gw.entity

uses gw.api.util.CurrencyUtil

@Export
enhancement GWEmploymentDataEnhancement : entity.EmploymentData
{
  /**
   * Retrieves the currency of the claim that owns this EmploymentData object.
   * @return The associated Claim's currency, or the default currency
   */
  property get ClaimCurrency() : Currency {
    var currency = this.Claim.Currency
    return currency!=null ? currency : CurrencyUtil.getDefaultCurrency()
  }
}

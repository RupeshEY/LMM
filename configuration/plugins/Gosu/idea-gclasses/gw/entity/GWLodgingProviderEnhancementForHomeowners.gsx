package gw.entity
uses gw.api.util.DateUtil
uses gw.datatype.annotation.DataType
uses gw.datatype.annotation.Parameter
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWLodgingProviderEnhancementForHomeowners : entity.LodgingProvider
{

  /**
   * Days between StartDate and EndDate. If either date is null, then returns LodgingNights.
   */
  property get Days() : java.lang.Integer {
    if (this.StartDate != null and this.EndDate != null) {
      return DateUtil.daysBetween( this.StartDate, this.EndDate )
    } else {
      return this.LodgingNights
    }
  }

  /**
   * LodgingRate * Days. null if either is null.
   */
  @DataType("currencyamount", {
    new Parameter("currencyProperty", "ClaimCurrency")
  })     
  property get LodgingTotal() : gw.api.financials.CurrencyAmount  {
    if(this.LodgingRate == null or this.Days == null) {
      return new CurrencyAmount(0, this.ClaimCurrency)
    } else {
      return (this.LodgingRate * this.Days)
    }
  }
}

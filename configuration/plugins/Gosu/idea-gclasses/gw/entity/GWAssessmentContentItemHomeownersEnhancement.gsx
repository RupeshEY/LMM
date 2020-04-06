package gw.entity
uses java.util.Date
uses java.math.BigDecimal
uses gw.api.util.DateUtil
uses gw.api.util.CurrencyUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.IMoney
uses gw.datatype.annotation.DataType
uses gw.datatype.annotation.Parameter
uses gw.api.util.CCCurrencyUtil

/**
 * Methods used in the context of a PropertyContentsIncident where the AssessmentContentItem
 * has ContentSchedule == "homeowners".
 */
@Export
enhancement GWAssessmentContentItemHomeownersEnhancement : entity.AssessmentContentItem
{
  private function calculateAge(dateAcquired : Date) : BigDecimal {
    if( dateAcquired != null ) {
      var lossDate = this.Incident.Claim.LossDate
      if( lossDate == null ) {
        lossDate = DateUtil.currentDate()
      }
      var daysOld = DateUtil.differenceInDays( dateAcquired, lossDate )
      return BigDecimal.valueOf( daysOld / 365.0 ).setScale( 2, BigDecimal.ROUND_HALF_UP )
    } else {
      return null
    }
  }
  
  property get Age() : BigDecimal {
    return calculateAge(this.DateAcquired)
  }

  private function calculateActualCashValue( replacementValue : IMoney, deprPercent : BigDecimal, dateAcquired : Date ) : CurrencyAmount {
    var depreciationAmt = getCalculatedDepreciationAmount(replacementValue, deprPercent, dateAcquired)
    if( replacementValue != null and depreciationAmt != null ) {
      var acv = replacementValue.Amount.subtract(depreciationAmt)
      return roundForCurrency(CCCurrencyUtil.getStrict(acv.max(BigDecimal.ZERO), ClaimOrDefaultCurrency))
    } else {
      return null
    }
  }

  /**
   * Calculates total ACV as:
   *   ACV = RCV - (ReplacementValue * DepreciationPercentage * Age)
   * If any of the values involved is null, returns null.  Minimum value is 0.
   */  
  @DataType("currencyamount", {
    new Parameter("currencyProperty", "ClaimOrDefaultCurrency")
  })
  property get ActualCashValue() : CurrencyAmount {
    return calculateActualCashValue( this.ReplacementValue, this.DepreciationPercentage, this.DateAcquired)
  }
  
  /**
   * Calculates the DepreciationAmount as:
   *   DepreciationAmount = ReplacementValue * DepreciationPercentage * Age
   * Note that this is not the same as the Depreciation property, which is a persistant db field.
   */
  @DataType("currencyamount", {
    new Parameter("currencyProperty", "ClaimOrDefaultCurrency")
  })
  public property get CalculatedDepreciationAmount() : CurrencyAmount {
    return getCalculatedDepreciationAmount( this.ReplacementValue, this.DepreciationPercentage, this.DateAcquired )
  }
  
  private function getCalculatedDepreciationAmount( replacementValue : IMoney, deprPercent : BigDecimal, dateAcquired : Date ) : CurrencyAmount {
    var yrsOld = calculateAge(dateAcquired)
    if( replacementValue.Amount != null and deprPercent != null and yrsOld != null ) {
      // DeprAmt = (RCV * DepreciationPercentage/100.0 * Age)
      var deprPercentAsDecimal = deprPercent.divide( 100.0 )
      var perYearDepreciation = replacementValue.Amount.multiply(deprPercentAsDecimal)
      var totalDepreciation = (perYearDepreciation.multiply( yrsOld))
      var roundedValue = roundForCurrency( totalDepreciation.ofCurrency(ClaimOrDefaultCurrency) )
      return roundForCurrency(CCCurrencyUtil.getStrict(roundedValue, ClaimOrDefaultCurrency))
    } else {
      return null
    }
  }
  
  /**
   * Round the BigDecimal amount to the proper number of decimal places for a currency value.  The currency
   * is either the Claim's currency if set or the system default currency.
   */
  public function roundForCurrency(value : CurrencyAmount) : CurrencyAmount {
    return CurrencyUtil.roundToCurrencyScale( value, ClaimOrDefaultCurrency, CurrencyUtil.getRoundingMode() )
  }
  
  /**
   * Gets the ClaimCurrency or, if it is null, the DefaultCurrency.
   */
  public property get ClaimOrDefaultCurrency() : Currency {
    var c = this.ClaimCurrency
    if( c != null ) {
      return c
    } else {
      return CurrencyUtil.getDefaultCurrency()
    }
  }
 
}

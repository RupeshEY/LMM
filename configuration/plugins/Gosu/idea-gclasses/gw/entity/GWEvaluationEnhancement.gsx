package gw.entity
uses gw.api.financials.CurrencyAmount
uses java.math.BigDecimal
uses gw.api.util.CurrencyUtil
uses gw.datatype.annotation.Parameter
uses gw.datatype.annotation.DataType

@Export
enhancement GWEvaluationEnhancement : entity.Evaluation
{
  private function addToResult(result : CurrencyAmount, amount : CurrencyAmount) : CurrencyAmount {
    //return null if both amount and result are null
    //return result if amount is null and return amount if result is null
    //return amount + result if both not null
    return result == null ? amount : (amount == null ? result : amount + result)
  }

  @DataType("currencyamount", {
    new Parameter("currencyProperty", "ClaimCurrency")
  })  
  property get TotalEconomicDamages() : CurrencyAmount {
    var result = new CurrencyAmount( 0, this.ClaimCurrency )
    result = addToResult(result, this.HospitalER)
    result = addToResult(result, this.TreatingPhysician)
    result = addToResult(result, this.PhysicalTherapy)
    result = addToResult(result, this.Diagnostic)
    result = addToResult(result, this.MedicalEquipment)
    result = addToResult(result, this.FutureMedical)
    result = addToResult(result, this.ClmtOutOfPocket)
    result = addToResult(result, this.Other)
    return result
  }
  
  function calculateTotalValue(val1 : BigDecimal, val2 : BigDecimal, val3 : BigDecimal) : CurrencyAmount {
    var value = ((gw.api.util.Math.Nz(val1) + gw.api.util.Math.Nz(val2)) * gw.api.util.Math.Nz(val3) / 100)
    if (value != null) {
      return CurrencyUtil.roundToCurrencyScale(value, this.ClaimCurrency, CurrencyUtil.getRoundingMode())
    }
    return new CurrencyAmount(BigDecimal.ZERO , this.ClaimCurrency)
  }
}

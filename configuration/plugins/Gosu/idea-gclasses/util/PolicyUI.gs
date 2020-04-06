package util

uses gw.api.locale.DisplayKey

@Export
class PolicyUI {

  construct() {
  }

  static function handleCoverageCurrencyUpdate(coverage : Coverage) : String {
    if (coverage.ClaimDeductible != null && coverage.isFieldChanged(Coverage#Currency)) {
      gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Deductible.Info.CurrencyUpdatedForDeductible"))
    }

    return null
  }
  
  static function handleCoverageDeductibleUpdate(coverage: Coverage) : String {
    if (coverage.ClaimDeductible != null && coverage.isFieldChanged(Coverage#Deductible)) {
      var infoMessage : String = null
      var deductible = coverage.ClaimDeductible

      if (deductible.Paid) {
        infoMessage = DisplayKey.get("Deductible.Info.AmountUpdatedForPaidDeductible")
      } else if (deductible.Overridden) {
        infoMessage = DisplayKey.get("Deductible.Info.AmountUpdatedForOverriddenDeductible")
      } else {
        infoMessage = DisplayKey.get("Deductible.Info.AmountUpdatedForUnpaidDeductible")
      }

      gw.api.util.LocationUtil.addRequestScopedInfoMessage(infoMessage)
    }

    return null
  }

}

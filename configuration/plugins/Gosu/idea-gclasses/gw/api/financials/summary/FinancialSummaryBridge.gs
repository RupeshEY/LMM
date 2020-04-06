package gw.api.financials.summary

uses gw.api.financials.summary.variants.ClaimCostOnlyVariant
uses gw.api.financials.summary.variants.ClaimantVariant
uses gw.api.financials.summary.variants.CoverageVariant
uses gw.api.financials.summary.variants.ExposureOnlyVariant
uses gw.api.financials.summary.variants.ExposureVariant
uses gw.api.financials.summary.variants.FinancialSummaryVariant
uses gw.api.financials.summary.variants.RecoveryCategoryVariant
uses gw.api.financials.summary.variants.ReservingCurrencyVariant

uses java.util.Map

/* This class is the bridge between the PCF and the FinancialsSummaryEngine */

@Export
class FinancialSummaryBridge extends FinancialSummaryBridgeBase {

  //Note: configurations that want to implement their own new Variants must register them in this map.
  //The key must match a value in the AvailableFilterOptions property in ClaimFinancialsSummary.pcf code block
  override property get FilterOptionMapping(): Map<String, FinancialSummaryVariant> {
    return {
        "ClaimCostOnly"-> new ClaimCostOnlyVariant(),
        "ExposureOnly"-> new ExposureOnlyVariant(),
        "Coverage"-> new CoverageVariant(),
        "Claimant"-> new ClaimantVariant(),
        "Exposure"-> new ExposureVariant(),
        "ReservingCurrency" -> new ReservingCurrencyVariant(),
        "RecoveryCategory" -> new RecoveryCategoryVariant ()}
  }

  construct(c: Claim, initialFilterOption: String) {
    super(c, initialFilterOption)
  }
}
package gw.api.financials.summary

/**
* Defines options such as whether fixed or market rates (useFloatingFinancials) should be used during calculations.
* Extend this class with more methods if other options/properties are added to the FinancialsSummaryScreen page
 */

@Export
interface FinancialSummaryCalculationOptions {
  property get UseFloatingFinancials() : boolean
  property set UseFloatingFinancials(b : boolean)
}
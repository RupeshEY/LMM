package gw.api.financials.summary

uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.FinancialsExpression

uses java.lang.IllegalStateException
uses java.util.Map
uses java.util.List

@Export
class FinancialsSummaryColumnConstants {

  //Use these constants in the FinancialsSummaryLV instead of bare strings, to avoid misspelling errors.  They
  //correspond the the columns in the FinancialsSummaryScreen.
  public static final var OPEN_RECOVERY_RESERVES : String = "OpenRecoveryReserves"
  public static final var REMAINING_RESERVES : String = "RemainingReserves"
  public static final var FUTURE_PAYMENTS : String = "FuturePayments"
  public static final var TOTAL_PAYMENTS : String = "TotalPayments"
  public static final var TOTAL_RECOVERIES : String = "TotalRecoveries"
  public static final var TOTAL_INCURRED_NET_RECOVERIES : String = "TotalIncurredNetRecoveries"
  public static final var TOTAL_RECOVERY_RESERVES : String = "TotalRecoveryReserves"


  //Many of the variants need to use a FinancialsCalculation to obtain an amount for an expression.  This map
  //allows us to centralize the obtaining of such expressions.  Variants are NOT limited to using FinancialsExpressions,
  //and they can choose to use a value from the TAccountOwnerDelegate directly instead.  In that case,
  //just implement gw.api.financials.summary.Leaf.calculateAmounts
  //to do what needs to be done to obtain an amount.
  static var expressionMap : Map<String, FinancialsExpression> = {
      OPEN_RECOVERY_RESERVES -> FinancialsCalculationUtil.OpenRecoveryReservesExpression,
      REMAINING_RESERVES -> FinancialsCalculationUtil.RemainingReservesExpression,
      FUTURE_PAYMENTS -> FinancialsCalculationUtil.FuturePaymentsExpression,
      TOTAL_PAYMENTS -> FinancialsCalculationUtil.TotalPaymentsExpression,
      TOTAL_RECOVERIES -> FinancialsCalculationUtil.TotalRecoveriesExpression,
      TOTAL_INCURRED_NET_RECOVERIES -> FinancialsCalculationUtil.TotalIncurredNetRecoveriesExpression,
      TOTAL_RECOVERY_RESERVES -> FinancialsCalculationUtil.TotalRecoveryReservesExpression
  }

  public static function obtainFinancialsExpressionFor(expressionName : String) : FinancialsExpression {
    if (not expressionMap.containsKey(expressionName)) {
      throw new IllegalStateException("FinancialsSummaryColumnConstants: no Financials Expression defined for expression: " + expressionName)
    }
    return expressionMap.get(expressionName)
  }

  //Out of the box, many of the variants use this set of columns on the FinancialsSummaryScreen.
  //If you have a special variant that does not use the standard set of columns, then implement the Columns property
  //of the FinancialsSummaryVariant interface yourself, by returning a list of strings using the constants above.
  //The order of the columns in the list does not matter with respect to the columns displayed on the PCF.  But they
  //will be calculated (in leaf nodes) and summed (in non-leaf nodes) in the order listed.
  public static function useDefaultSummaryColumnConstantsList() : List<String> {
    return {
      OPEN_RECOVERY_RESERVES,
      REMAINING_RESERVES,
      FUTURE_PAYMENTS,
      TOTAL_PAYMENTS,
      TOTAL_RECOVERIES,
      TOTAL_INCURRED_NET_RECOVERIES
    }

  }
}
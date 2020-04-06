package gw.api.financials.summary

uses gw.api.financials.CurrencyAmount

uses java.util.ArrayList
uses java.util.Map
uses java.util.List

/**
 * An FSRow holds the data for the LV that is shown on the FinancialsSummaryScreen.  The label is the
 * string used for the "bucket" and includes both leaf nodes and summary nodes as well as the claim total.
 * The Amounts store the column values to be shown on the screen.
 * Each Node class is responsible for knowing how to "build" a corresponding FSRow instance.
 * The Node classes form the configurable parts used by the FinancialsSummaryEngine, while the FSRow
 * is passed to the UI, via the LV.
 */
@Export
class FSRowBase {

  public var claim : Claim as Claim
  public var label: String as Label
  public var level: int as Level
  public var amount: Map<String, PotentiallyInvalid<CurrencyAmount>> as Amounts
  public var leaf: boolean as Leaf
  private var _children : List<FSRowBase> as Children = new ArrayList<FSRowBase>()

  public var taccountOwnerDelegates: List<TAccountOwnerDelegate> as TAccountOwnerDelegates

  public function getValue(financialsExpression: String): CurrencyAmount {
    var potentiallyInvalidAmount = Amounts.get(financialsExpression)
    return potentiallyInvalidAmount.Valid ? potentiallyInvalidAmount.Value : null
  }

}
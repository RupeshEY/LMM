package gw.api.financials.summary.variants

uses com.google.common.collect.Lists
uses gw.api.financials.summary.FinancialsSummaryColumnConstants
uses gw.api.financials.summary.LeafBuilder
uses gw.api.financials.summary.Node
uses java.util.List

@Export
class ReservingCurrencyVariant implements FinancialSummaryVariant {

  override property get LeafBuilder(): LeafBuilder {
    return new FinSumReservingCurrencyLeafBuilder ()
  }

  //The reservingCurrency variant omits the Claim Total row from the LV, by design.
  //This is intentional because if there are multiple reserving currencies involved in a claim,
  //then the totaling of those currency amounts makes no sense- since you cannot sum two currency amounts of
  //differing currencies. (This variant is not shown in the claim currency- its the reserving currency).
  //And if all reserving currencies on the claim happen to match, then the first level under the root-node
  //is a single summary node which contains the totals for that single reserving currency anyway. The
  //FinSumReservingCurrencyReservingCurrency node is a child of the root node for this variant.

  override function includeRowBuiltFrom(node : Node) : boolean {
    return node.Level != 1
  }

  override function useRowBuiltFromThisAsRoot(node: Node): boolean {
    return node.Level == 2
  }

  override function getTAccountOwnerDelegates(claim: Claim): List<TAccountOwnerDelegate> {
    return Lists.newArrayList(claim.ReserveLines)
  }

  override property get Columns(): List<String> {
    return FinancialsSummaryColumnConstants.useDefaultSummaryColumnConstantsList()
  }
}
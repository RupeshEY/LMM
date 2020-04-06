package gw.api.financials.summary.variants

uses com.google.common.collect.Lists
uses gw.api.financials.summary.FinancialsSummaryColumnConstants
uses gw.api.financials.summary.LeafBuilder
uses gw.api.financials.summary.Node
uses java.util.List

@Export
class ClaimCostOnlyVariant implements FinancialSummaryVariant {

  override property get LeafBuilder(): LeafBuilder {
    return new FinSumClaimCostOnlyLeafBuilder ()
  }

  override function includeRowBuiltFrom(node : Node) : boolean {
    return true
  }

  override function useRowBuiltFromThisAsRoot(node: Node): boolean {
    return node.Level == 1
  }

  override function getTAccountOwnerDelegates(claim: Claim): List<TAccountOwnerDelegate> {
    return Lists.newArrayList(claim.ReserveLines)
  }

  override property get Columns(): List<String> {
    return FinancialsSummaryColumnConstants.useDefaultSummaryColumnConstantsList()
  }
}
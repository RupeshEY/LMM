package gw.api.financials.summary.variants

uses gw.api.financials.summary.LeafBuilder
uses gw.api.financials.summary.Node
uses com.google.common.collect.Lists
uses gw.api.financials.summary.FinancialsSummaryColumnConstants
uses java.util.List

@Export
class RecoveryCategoryVariant implements FinancialSummaryVariant {

  override property get LeafBuilder(): LeafBuilder {
    return new FinSumRecoveryLeafBuilder ()
  }

  override function includeRowBuiltFrom(node : Node) : boolean {
    return true
  }

  override function useRowBuiltFromThisAsRoot(node: Node): boolean {
    return node.Level == 1
  }

  override function getTAccountOwnerDelegates(claim: Claim): List<TAccountOwnerDelegate> {
    return Lists.newArrayList(claim.RecoveryCodings)
  }

  override property get Columns(): List<String> {
    return {
        FinancialsSummaryColumnConstants.TOTAL_RECOVERIES,
        FinancialsSummaryColumnConstants.OPEN_RECOVERY_RESERVES,
        FinancialsSummaryColumnConstants.TOTAL_RECOVERY_RESERVES
    }
  }

}
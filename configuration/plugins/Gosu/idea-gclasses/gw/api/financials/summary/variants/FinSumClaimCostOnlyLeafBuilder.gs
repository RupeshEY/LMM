package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumClaimCostOnlyLeafBuilder implements LeafBuilder {

  //only builds Leaf Nodes for reserve lines that are for claim costs.  Others are ignored
  // and therefore omitted from all totals
  override function build(rl: TAccountOwnerDelegate): Leaf {
    if (rl typeis ReserveLine) {
      if (rl.CostType != TC_CLAIMCOST) {
        return null
      }
      return new FinSumClaimCostOnlyLeaf (rl)
    }
    return null
  }
}
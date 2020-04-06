package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumCoverageLeafBuilder implements LeafBuilder {
  override function build(rl: TAccountOwnerDelegate): Leaf {
    if (rl typeis ReserveLine) {
      //exclude claim-level RL because they have no exposure
      if (rl.Exposure == null) {
        return null
      }
      return new FinSumCoverageLeaf (rl)
    }
    return null
  }
}
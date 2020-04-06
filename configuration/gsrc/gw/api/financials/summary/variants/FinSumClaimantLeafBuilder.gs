package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumClaimantLeafBuilder implements LeafBuilder {
  override function build(rl: TAccountOwnerDelegate): Leaf {
    // we don't include financials in this variant unless its under a claimant.
    if (rl typeis ReserveLine) {
      if (rl.Exposure?.Claimant == null) {
        return null
      }
      return new FinSumClaimantLeaf (rl)
    }
    return null
  }
}
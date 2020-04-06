package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumExposureOnlyLeafBuilder implements LeafBuilder {
  override function build(rl: TAccountOwnerDelegate): Leaf {
    if (rl typeis ReserveLine) {
      if (rl.Exposure == null) {
        return null
      }
      return new FinSumExposureOnlyLeaf (rl)
    }
    return null
  }
}
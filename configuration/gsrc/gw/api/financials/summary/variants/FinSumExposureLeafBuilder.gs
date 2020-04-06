package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumExposureLeafBuilder implements LeafBuilder {
  override function build(rl: TAccountOwnerDelegate): Leaf {
    if (rl typeis ReserveLine) {
      return new FinSumExposureLeaf (rl)
    }
    return null
  }
}
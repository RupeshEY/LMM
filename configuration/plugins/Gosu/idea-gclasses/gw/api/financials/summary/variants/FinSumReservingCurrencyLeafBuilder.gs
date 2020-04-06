package gw.api.financials.summary.variants

uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.LeafBuilder

@Export
class FinSumReservingCurrencyLeafBuilder implements LeafBuilder {
  override function build(rl: TAccountOwnerDelegate): Leaf {
    if (rl typeis ReserveLine) {
      return new FinSumReservingCurrencyLeaf (rl)
    }
    return null
  }
}
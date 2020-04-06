package gw.api.financials.summary.variants

uses gw.api.financials.summary.LeafBuilder
uses gw.api.financials.summary.Leaf
uses java.lang.IllegalArgumentException

@Export
class FinSumRecoveryLeafBuilder implements LeafBuilder {
  override function build(t: TAccountOwnerDelegate): Leaf {
    if (t typeis RecoveryCoding) {
      return new FinSumRecoveryLeaf (t)
    }
    throw new IllegalArgumentException("Instances of type RecoveryCoding should be passed into the SummaryNodeRecoveryLeafBuilder")
  }
}
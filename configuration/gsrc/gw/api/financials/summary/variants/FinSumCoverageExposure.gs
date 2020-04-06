package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses gw.api.locale.DisplayKey
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumCoverageExposure extends FinSumCoverageCoverage implements Node {
  protected var _exposure: Optional<Exposure> //cant be null because of FinSumCoverageLeafBuilder
  public construct(exposure: Optional<Exposure>, claim: Claim) {
    super(exposure.get().PrimaryCoverage, claim)
    _exposure = exposure
  }

  override function buildSummaryInstance(): Node {
    return new FinSumCoverageCoverage (_exposure.get().PrimaryCoverage, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumCoverageExposure
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._exposure.get().ClaimOrder, node._exposure.get().ClaimOrder) //cant be null
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumCoverageExposure )) {
      return false
    }
    var rhs = obj as FinSumCoverageExposure
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_exposure.orNull(), rhs._exposure.orNull())
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_exposure.orNull())
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return DisplayKey.get("Java.Financials.Summary.Exposure", _exposure.get().DisplayName, _exposure.get().PrimaryCoverage.DisplayName)
  }

  override public property get Level(): int {
    return 3
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.Exposure = _exposure
  }
}
package gw.api.financials.summary.variants

uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumCoverageCoverage extends RootNode implements Node {
  protected var _coverageType: CoverageType as CoverageType
  public construct(coverageType: typekey.CoverageType, claim: Claim) {
    super(claim)
    _coverageType = coverageType
  }

  override function buildSummaryInstance(): Node {
    return new RootNode (_claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumCoverageCoverage
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._coverageType, node._coverageType)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumCoverageCoverage )) {
      return false
    }
    var rhs = obj as FinSumCoverageCoverage
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_coverageType, rhs._coverageType)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .append(_coverageType)
        .appendSuper(super.hashCode())
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return CoverageType.DisplayName
  }

  override public property get Level(): int {
    return 2
  }


}
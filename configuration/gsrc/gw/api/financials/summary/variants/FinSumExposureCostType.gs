package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumExposureCostType extends FinSumExposureExposure implements Node {
  protected var _costType: CostType
  public construct(costType: CostType, exposure: Optional<Exposure>, claim: Claim) {
    super(exposure, claim)
    _costType = costType
  }

  override function buildSummaryInstance(): Node {
    return new FinSumExposureExposure (_exposure, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumExposureCostType
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._costType, node._costType)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumExposureCostType )) {
      return false
    }
    var rhs = obj as FinSumExposureCostType
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_costType, rhs._costType)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_costType)
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return "${_costType.DisplayName}"
  }

  override public property get Level(): int {
    return 3
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.CostType = _costType
  }
}
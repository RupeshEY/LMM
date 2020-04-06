package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses java.lang.Integer
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder
uses gw.api.locale.DisplayKey
uses gw.api.financials.summary.FSRow

@Export
class FinSumRecoveryExposure extends RootNode implements Node {
  protected var _exposure: Optional<Exposure>
  public construct(exposure: Optional<Exposure>, claim: Claim) {
    super(claim)
    _exposure = exposure
  }

  override function buildSummaryInstance(): Node {
    return new RootNode(_claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumRecoveryExposure
    var i1 = this._exposure.Present ? this._exposure.get().ClaimOrder : Integer.MAX_VALUE
    var i2 = node._exposure.Present ? node._exposure.get().ClaimOrder : Integer.MAX_VALUE
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(i1, i2)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumRecoveryExposure )) {
      return false
    }
    var rhs = obj as FinSumRecoveryExposure
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
    if (!_exposure.Present) {
      return DisplayKey.get("Java.Financials.Summary.NoExposure")
    }
    return DisplayKey.get("Java.Financials.Summary.Exposure", _exposure.get().DisplayName, _exposure.get().PrimaryCoverage.DisplayName)
  }

  override public property get Level(): int {
    return 2
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.Exposure = _exposure
  }
}
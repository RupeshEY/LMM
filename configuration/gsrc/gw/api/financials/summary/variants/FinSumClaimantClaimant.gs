package gw.api.financials.summary.variants

uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumClaimantClaimant extends RootNode implements Node {
  protected var _claimant: Contact
  public construct(claimant: Contact, claim: Claim) {
    super(claim)
    _claimant = claimant
  }

  override function buildSummaryInstance(): Node {
    return new RootNode(_claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumClaimantClaimant
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._claimant, node._claimant)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumClaimantClaimant )) {
      return false
    }
    var rhs = obj as FinSumClaimantClaimant
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_claimant, rhs._claimant)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .append(_claimant)
        .appendSuper(super.hashCode())
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return "${_claimant.DisplayName}"
  }

  override public property get Level(): int {
    return 2
  }


}
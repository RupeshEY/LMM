package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumReservingCurrencyCostType extends FinSumReservingCurrencyExposure implements Node {
  protected var _costType: CostType
  public construct(costType : CostType, exposure : Optional<Exposure>, reservingCurrency : typekey.Currency, claim: Claim) {
    super(exposure, reservingCurrency, claim)
    _costType = costType
  }

  override function buildSummaryInstance(): Node {
    return new FinSumReservingCurrencyExposure (_exposure, _reservingCurrency, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumReservingCurrencyCostType
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
    if (!(obj typeis FinSumReservingCurrencyCostType )) {
      return false
    }
    var rhs = obj as FinSumReservingCurrencyCostType
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
    return _costType.DisplayName
  }

  override public property get Level(): int {
    return 4
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.CostType = _costType
  }
}
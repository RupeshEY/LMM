package gw.api.financials.summary.variants

uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class FinSumReservingCurrencyReservingCurrency extends RootNode implements Node {

  protected var _reservingCurrency: typekey.Currency
  public construct(reservingCurrency: typekey.Currency, claim: Claim) {
    super(claim)
    _reservingCurrency = reservingCurrency
  }

  override function buildSummaryInstance(): Node {
    return new RootNode(_claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumReservingCurrencyReservingCurrency
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._reservingCurrency, node._reservingCurrency)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumReservingCurrencyReservingCurrency )) {
      return false
    }
    var rhs = obj as FinSumReservingCurrencyReservingCurrency
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_reservingCurrency, rhs._reservingCurrency)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_reservingCurrency)
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return _reservingCurrency.DisplayName
  }

  override public property get Level(): int {
    return 2
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.ReservingCurrency = _reservingCurrency
  }
}
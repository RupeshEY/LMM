package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Node
uses gw.api.locale.DisplayKey
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

uses java.lang.Integer

@Export
class FinSumReservingCurrencyExposure extends FinSumReservingCurrencyReservingCurrency implements Node {
  protected var _exposure: Optional<Exposure> //can be null
  public construct(exposure: Optional<Exposure>, reservingCurrency : typekey.Currency, claim : Claim) {
    super(reservingCurrency, claim)
    _exposure = exposure
  }

  override function buildSummaryInstance(): Node {
    return new FinSumReservingCurrencyReservingCurrency (_reservingCurrency, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumReservingCurrencyExposure
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
    if (!(obj typeis FinSumReservingCurrencyExposure )) {
      return false
    }
    var rhs = obj as FinSumReservingCurrencyExposure
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
    return 3
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.Exposure = _exposure
  }
}
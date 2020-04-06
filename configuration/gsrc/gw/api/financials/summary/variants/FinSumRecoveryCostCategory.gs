package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder
uses gw.api.financials.summary.FSRow
uses gw.api.locale.DisplayKey

@Export
class FinSumRecoveryCostCategory extends FinSumRecoveryExposure implements Node {
  protected var _costCategory: CostCategory
  protected var _reservingCurrency: typekey.Currency
  protected var _costType: CostType

  public construct(costCategory : CostCategory, reservingCurrency : typekey.Currency, costType : CostType, exposure : Optional<Exposure>, claim: Claim) {
    super(exposure, claim)
    _costCategory = costCategory
    _reservingCurrency = reservingCurrency
    _costType = costType
  }

  override function buildSummaryInstance(): Node {
    return new FinSumRecoveryExposure( _exposure, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumRecoveryCostCategory
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._costCategory, node._costCategory)
        .append(this._reservingCurrency, node._reservingCurrency)
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
    if (!(obj typeis FinSumRecoveryCostCategory )) {
      return false
    }
    var rhs = obj as FinSumRecoveryCostCategory
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_costCategory, rhs._costCategory)
        .append(_reservingCurrency, rhs._reservingCurrency)
        .append(_costType, rhs._costType)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_costCategory)
        .append(_reservingCurrency)
        .append(_costType)
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return DisplayKey.get("Java.Financials.Summary.CostTypeAndCostCategoryAndReservingCurrency", _costType, _costCategory, _reservingCurrency)
  }

  override public property get Level(): int {
    return 3
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.CostCategory = _costCategory
    fsRow.ReservingCurrency = _reservingCurrency
    fsRow.CostType = _costType
  }
}
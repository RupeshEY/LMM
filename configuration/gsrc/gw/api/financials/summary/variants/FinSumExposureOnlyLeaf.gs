package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.FinancialsSummaryColumnConstants
uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.Node
uses gw.api.financials.summary.PotentiallyInvalid
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder
uses gw.api.locale.DisplayKey
uses java.util.List

@Export
class FinSumExposureOnlyLeaf extends FinSumExposureOnlyExposure implements Leaf {
  //1st level up: [costtype, costCategory and reserving currency]
  protected var _costType: CostType
  protected var _costCategory: CostCategory
  protected var _reservingCurrency: typekey.Currency
  protected var _reserveLine: ReserveLine
  construct(rl: ReserveLine) {
    super(Optional.fromNullable(rl.Exposure), rl.Claim)
    _reserveLine = rl
    _costCategory = rl.CostCategory
    _reservingCurrency = rl.ReservingCurrency
    _costType = rl.CostType
  }

  override function calculateAmounts(columns : List<String>) {
    columns.each(\column -> {
      var financialsExpression = FinancialsSummaryColumnConstants.obtainFinancialsExpressionFor(column)
      var f = obtainUnrestrictedFinancialsCalculator(financialsExpression)
          .withExposure(_exposure.get()) //exposure only: excludes claim-level.
          .withCostType(_costType)
          .withCostCategory(_costCategory)
          .withReservingCurrency(_reservingCurrency)
      var amount = PotentiallyInvalid.of(f.ClaimAmount)
      storeAmount(column, amount)
    })
  }

  override function toString() : String {
    return("...${_costType} ${_costCategory} ${_reservingCurrency} ${_exposure} " +
        getDisplayValue(retrieveAmount(FinancialsSummaryColumnConstants.REMAINING_RESERVES)))
  }

  override function buildSummaryInstance(): Node {
    return new FinSumExposureOnlyExposure (_exposure, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumExposureOnlyLeaf
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._costType, node._costType)
        .append(this._costCategory, node._costCategory)
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
    if (!(obj typeis FinSumExposureOnlyLeaf )) {
      return false
    }
    var rhs = obj as FinSumExposureOnlyLeaf
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_costType, rhs._costType)
        .append(_costCategory, rhs._costCategory)
        .append(_reservingCurrency, rhs._reservingCurrency)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .append(_costType)
        .append(_costCategory)
        .append(_reservingCurrency)
        .appendSuper(super.hashCode())
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return DisplayKey.get("Java.Financials.Summary.CostTypeAndCostCategoryAndReservingCurrency", _costType, _costCategory, _reservingCurrency)
  }

  override public property get Level(): int {
    return 3
  }

  override property get TAccountOwnerDelegates(): List<TAccountOwnerDelegate> {
    return {_reserveLine}
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.CostType = _costType
    fsRow.CostCategory = _costCategory
    fsRow.ReservingCurrency = _reservingCurrency
    fsRow.Leaf = true
  }
}
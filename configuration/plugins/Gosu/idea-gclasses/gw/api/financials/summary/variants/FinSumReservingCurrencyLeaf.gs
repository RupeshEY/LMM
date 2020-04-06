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
uses java.util.List

@Export
class FinSumReservingCurrencyLeaf extends FinSumReservingCurrencyCostType implements Leaf {

  protected var _costCategory: CostCategory
  private var _reserveLine : ReserveLine
  public construct(rl: ReserveLine) {
    super(rl.CostType, Optional.fromNullable(rl.Exposure), rl.ReservingCurrency, rl.Claim)
    _costCategory = rl.CostCategory
    _reserveLine = rl
  }

  override function buildSummaryInstance(): Node {
    return new FinSumReservingCurrencyCostType (_costType, _exposure, _reservingCurrency, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumReservingCurrencyLeaf
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._costCategory, node._costCategory)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumReservingCurrencyLeaf )) {
      return false
    }
    var rhs = obj as FinSumReservingCurrencyLeaf
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_costCategory, rhs._costCategory)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_costCategory)
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return _costCategory.DisplayName
  }

  override property get TAccountOwnerDelegates(): List<TAccountOwnerDelegate> {
    return {_reserveLine}
  }

  override public property get Level(): int {
    return 5
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.CostCategory = _costCategory
    fsRow.Leaf = true
  }

  override function toString() : String {
    return("...${_costType} ${_costCategory} ${_reservingCurrency} ${_exposure} " +
        getDisplayValue(retrieveAmount(FinancialsSummaryColumnConstants.REMAINING_RESERVES)))
  }

  //this calculator is special: unlike the other Variants, this one produces reserving amounts as opposed to claim amounts.
  override function calculateAmounts(columns : List<String>) {
    columns.each(\column -> {
      var financialsExpression = FinancialsSummaryColumnConstants.obtainFinancialsExpressionFor(column)
      var f = obtainUnrestrictedFinancialsCalculator(financialsExpression)
      if (_exposure.Present) {
        f.withExposure(_exposure.get())
      } else {
        f.useClaimLevelReserves()
      }
      f.withCostType(_costType)
       .withCostCategory(_costCategory)
      var calculatorWithReservingAmount = f.withReservingCurrency(_reservingCurrency)
      var amount = PotentiallyInvalid.of(calculatorWithReservingAmount.ReservingAmount)
      storeAmount(column, amount)
    })
  }
}
package gw.subrogation.financials

uses gw.util.CCConfigUtil
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

@Export
class SubroFinsClaimCostCategoryNode extends SubroFinsExposureNode {
  private var _costType : CostType as CostType
  private var _costCategory : CostCategory as CostCategory

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty) {
    this(reserveLine, adverseParty, null)
  }

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) {
    super(reserveLine, adverseParty, subrogation)
    _costType = _reserveLine.CostType
    _costCategory = _reserveLine.CostCategory
    doCalculations()
  }

  private function doCalculations() {
    for(var calc in SubrogationCalculationsEnum.getAllValues()) {
      _calculations.put(calc, calc.getCalculationValue(_reserveLine, _adverseParty, _subrogation))
    }
  }


  override function equals(obj : Object) : boolean {
    if(obj === this) return true
    return obj != null
        && obj typeis SubroFinsClaimCostCategoryNode
        && _costType.equals(obj.CostType)
        && _costCategory.equals(obj.CostCategory)
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_costType)
        .append(_costCategory)
        .toHashCode()
  }

  override function compareTo(o : Object): int {
    var row = o as SubroFinsClaimCostCategoryNode
    return new CompareToBuilder()
        .appendSuper(super.compareTo(row))
        .append(this._costType, row.CostType)
        .append(this._costCategory, row.CostCategory)
        .toComparison()
  }

  override property get SummaryRow() : AbstractSubroFinsNode {
    return new SubroFinsExposureNode(_reserveLine, _adverseParty, _subrogation)
  }

  override property get Level() : int {
    return 2
  }

  override property get Label() : String {
    if(_label == null || _label.isEmpty()) {
      _label = "${_costType.DisplayName}/${_costCategory.DisplayName}"
      if(CCConfigUtil.isEnableMulticurrencyReserving()) {
        _label += " ${_reserveLine.ReservingCurrency.DisplayName}"
      }
    }
    return _label
  }
}
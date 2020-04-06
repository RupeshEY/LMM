package gw.api.financials

uses java.util.ArrayList
uses gw.pl.persistence.core.Key

/**
 * A wrapper around a transaction used by ReserveLineInputSet. Every property of
 * the transaction that is shown in that input set is wrapped in a property on
 * this class.
 *
 * <p>Wrappers are always created by calling ReserveLineInputSetHelper.wrap().
 *
 * <p>ReserveLine and Exposure values manipulated by this class are also
 * wrapped, by the ReserveLineOption and ExposureOption classes in this package.
 *
 * <p>Whereas the ReserveLineInputSetHelper is responsible for caching data at
 * the claim level, this class is responsible for additional filtering or
 * manipulation of that data with regard to a specific transaction. For example,
 * the ReserveLineOptions property delegates to the ReserveLineInputSetHelper to
 * get the list of all eligible reserve lines on the claim and then modifies
 * that list based on requirements of the current transaction.
 */
@Export
class ReserveLineInputSetWrapper {

  var _helper : ReserveLineInputSetHelper
  var _strategy : ReserveLineInputSetStrategy
  var _transaction : Transaction

  internal construct(helper : ReserveLineInputSetHelper, transaction : Transaction) {
    _helper = helper
    _strategy = helper.Strategy
    _transaction = transaction
    refresh()
  }

  /**
   * Called when a wrapper is first constructed and again every time the page is
   * refreshed (via ReserveLineInputSetHelper.wrap()). Enforces that the
   * initially-selected reserve line and other components are actually allowed.
   */
  internal final function refresh() {
    if (_transaction.ReserveLine != null and _transaction.ReserveLine.New) {
      if (not _helper.getReserveLineOptions(_transaction.Claim).contains(ReserveLineOption.NEW_OPTION)) {
        _transaction.ReserveLine = null
      }

      if (_transaction.Exposure != null
              and not this.ExposureOptions.contains(ExposureOption.optionFor(_transaction.Exposure))) {
        _transaction.Exposure = null
      }

      if (_transaction.CostType != null and not this.CostTypeOptions.contains(_transaction.CostType)) {
        _transaction.CostType = null
      }

      if (_transaction.CostCategory != null and not this.CostCategoryOptions.contains(_transaction.CostCategory)) {
        _transaction.CostCategory = null
      }

      var reservingCurrencyRestriction = _strategy.restrictReservingCurrency(_transaction)
      if (reservingCurrencyRestriction != null and _transaction.ReservingCurrency != reservingCurrencyRestriction) {
        _transaction.ReservingCurrency = reservingCurrencyRestriction
      }
    }
  }

  private function enforceCostType() {
    if (not this.CostTypeOptions.contains(_transaction.CostType)) {
      _transaction.CostType = null
    }
  }

  private function enforceCostCategory() {
    if (not this.CostCategoryOptions.contains(_transaction.CostCategory)) {
      _transaction.CostCategory = null
    }
  }

  private function loadByKey(key : Key) : KeyableBean {
    return _transaction.Bundle.loadBean(key)
  }

  property get ReserveLineOptions() : List<ReserveLineOption> {
    var reserveLineOptionsForClaim = _helper.getReserveLineOptions(_transaction.Claim)
    var reservingCurrencyRestriction = _strategy.restrictReservingCurrency(_transaction)

    var needToAddCurrentReserveLine =
            _transaction.ReserveLine != null
            and not _transaction.ReserveLine.New
            and not reserveLineOptionsForClaim.hasMatch(
                    \ o -> o.ReserveLineID == _transaction.ReserveLine.ID)

    var needToFilterByReservingCurrency =
            reservingCurrencyRestriction != null
            and reserveLineOptionsForClaim.hasMatch(
                    \ o -> o != ReserveLineOption.NEW_OPTION and o.ReservingCurrency != reservingCurrencyRestriction)

    if (not needToAddCurrentReserveLine and not needToFilterByReservingCurrency) {
      return reserveLineOptionsForClaim
    } else {
      var amendedReserveLineOptions = new ArrayList<ReserveLineOption>()

      if (needToAddCurrentReserveLine) {
        amendedReserveLineOptions.add(ReserveLineOption.optionFor(_transaction.ReserveLine))
      }

      if (needToFilterByReservingCurrency) {
        amendedReserveLineOptions.addAll(reserveLineOptionsForClaim.where(
                \ o -> o == ReserveLineOption.NEW_OPTION or o.ReservingCurrency == reservingCurrencyRestriction))
      } else {
        amendedReserveLineOptions.addAll(reserveLineOptionsForClaim)
      }

      return amendedReserveLineOptions
    }
  }

  property get ReserveLine() : ReserveLineOption {
    if (_transaction.ReserveLine == null) {
      return null
    } else if (_transaction.ReserveLine.New) {
      return ReserveLineOption.NEW_OPTION
    } else {
      return ReserveLineOption.optionFor(_transaction.ReserveLine)
    }
  }

  property set ReserveLine(value : ReserveLineOption) {
    var oldReservingCurrency = _transaction.ReservingCurrency
    _strategy.beforeReserveLineChange(_transaction)

    if (value == null) {
      _transaction.ReserveLine = null
    } else if (value == ReserveLineOption.NEW_OPTION) {
      var reservingCurrencyRestriction = _strategy.restrictReservingCurrency(_transaction)
      _transaction.ReserveLine = _transaction.Claim.createDummyReserveLine(reservingCurrencyRestriction)
    } else {
      _transaction.ReserveLine = loadByKey(value.ReserveLineID) as ReserveLine
    }

    _strategy.afterReserveLineChange(_transaction)
    var newReservingCurrency = _transaction.ReservingCurrency

    if (newReservingCurrency != oldReservingCurrency) {
      _strategy.afterReservingCurrencyChange(_transaction)
    }
  }

  property get NewReserveLineSelected() : boolean {
    return _transaction.ReserveLine != null and _transaction.ReserveLine.New
  }

  property get ExposureOptions() : List<ExposureOption> {
    return _helper.getExposureOptions(_transaction.Claim)
  }

  property get Exposure() : ExposureOption {
    if (_transaction.Exposure != null) {
      return ExposureOption.optionFor(_transaction.Exposure)
    } else if (this.ExposureOptions.contains(ExposureOption.CLAIM_LEVEL_OPTION)) {
      return ExposureOption.CLAIM_LEVEL_OPTION
    } else {
      return null
    }
  }

  property set Exposure(value : ExposureOption) {
    _strategy.beforeExposureChange(_transaction)
    if (value == null or value == ExposureOption.CLAIM_LEVEL_OPTION) {
      _transaction.Exposure = null
    } else {
      _transaction.Exposure = loadByKey(value.ExposureID) as Exposure
    }
    enforceCostType()
    enforceCostCategory()
    _strategy.afterExposureChange(_transaction)
  }

  property get Coverage() : CoverageType {
    return _transaction.Exposure?.PrimaryCoverage
  }

  property get MatterVisible() : boolean {
    return _transaction typeis Payment
            and ScriptParameters.UtilizeMatterBudget
            and _transaction.CostCategory == typekey.CostCategory.TC_LEGAL
  }

  property get MatterOptions() : List<Matter> {
    return _transaction.Claim.Matters.toList()
  }

  property get Matter() : Matter {
    return (_transaction as Payment).Matter
  }

  property set Matter(value : Matter) {
    (_transaction as Payment).Matter = value
  }

  property get CostTypeOptions() : List<CostType> {
    return _helper.getCostTypeOptions(_transaction.Claim.Policy.PolicyType, _transaction.Exposure?.PrimaryCoverage)
  }

  property get CostType() : CostType {
    return _transaction.CostType
  }

  property set CostType(value : CostType) {
    _transaction.CostType = value
    enforceCostCategory()
    _strategy.afterCostTypeChange(_transaction)
  }

  property get CostCategoryOptions() : List<CostCategory> {
    return _helper.getCostCategoryOptions(
            _transaction.Claim.Policy.PolicyType, _transaction.Exposure?.PrimaryCoverage, _transaction.CostType)
  }

  property get CostCategory() : CostCategory {
    return _transaction.CostCategory
  }

  property set CostCategory(value : CostCategory) {
    _transaction.CostCategory = value
    _strategy.afterCostCategoryChange(_transaction)
  }

  property get ReservingCurrencyEditable() : boolean {
    return _strategy.restrictReservingCurrency(_transaction) == null
  }

  property get ReservingCurrency() : Currency {
    return _transaction.ReservingCurrency
  }

  property set ReservingCurrency(value : Currency) {
    if (_transaction.ReservingCurrency != value) {
      _transaction.ReservingCurrency = value
      _strategy.afterReservingCurrencyChange(_transaction)
    }
  }

}

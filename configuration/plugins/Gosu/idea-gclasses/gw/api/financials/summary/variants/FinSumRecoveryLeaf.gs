package gw.api.financials.summary.variants

uses com.google.common.base.Optional
uses gw.api.financials.summary.Node
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.EqualsBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder
uses gw.api.financials.summary.FSRow
uses gw.api.financials.summary.Leaf
uses gw.api.financials.summary.PotentiallyInvalid
uses gw.api.financials.summary.FinancialsSummaryColumnConstants
uses java.util.List

@Export
class FinSumRecoveryLeaf extends FinSumRecoveryCostCategory implements Leaf {
  protected var _recoveryCategory : typekey.RecoveryCategory
  private var _recoveryCoding : RecoveryCoding

  public construct(rc: RecoveryCoding) {
    super(rc.ReserveLine.CostCategory,
        rc.ReserveLine.ReservingCurrency,
        rc.ReserveLine.CostType,
        Optional.fromNullable(rc.ReserveLine.Exposure),
        rc.ReserveLine.Claim)
    _recoveryCategory = rc.RecoveryCategory
    _recoveryCoding = rc
  }

  override function buildSummaryInstance(): Node {
    return new FinSumRecoveryCostCategory (_costCategory, _reservingCurrency, _costType, _exposure, _claim)
  }

  override function compareTo(o: Node): int {
    var node = o as FinSumRecoveryLeaf
    return new CompareToBuilder()
        .appendSuper(super.compareTo(node))
        .append(this._recoveryCategory, node._recoveryCategory)
        .toComparison()
  }

  override function equals(obj: Object): boolean {
    if (obj == null) {
      return false
    }
    if (obj === this) {
      return true
    }
    if (!(obj typeis FinSumRecoveryLeaf )) {
      return false
    }
    var rhs = obj as FinSumRecoveryLeaf
    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(_recoveryCategory, rhs._recoveryCategory)
        .isEquals()
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_recoveryCategory)
        .toHashCode()
  }

  override public property get FSRowLabel(): String {
    return "${_recoveryCategory.DisplayName}"
  }

  override public property get Level(): int {
    return 4
  }

  override function populateFSRow(fsRow: FSRow) {
    super.populateFSRow(fsRow)
    fsRow.Leaf = true
  }

  override function calculateAmounts(columns: List<String>) {
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
      .withReservingCurrency(_reservingCurrency)
      .withRecoveryCategory(_recoveryCategory)

      var amount = PotentiallyInvalid.of(f.ClaimAmount)
      storeAmount(column, amount)
    })
  }

  override property get TAccountOwnerDelegates(): List<TAccountOwnerDelegate> {
    return {_recoveryCoding}
  }
}
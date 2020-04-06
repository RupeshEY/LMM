package gw.subrogation.financials

uses gw.api.locale.DisplayKey
uses gw.api.util.StringUtil
uses org.apache.commons.lang.builder.CompareToBuilder
uses org.apache.commons.lang.builder.HashCodeBuilder

uses java.lang.Integer

@Export
class SubroFinsExposureNode extends SubroFinsRootNode {
  protected var _exposure : Exposure as Exposure
  protected var _subrogation : Subrogation as Subrogation

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty) {
    this(reserveLine, adverseParty, null)
  }

  construct(reserveLine : ReserveLine, adverseParty : SubroAdverseParty, subrogation : Subrogation) {
    super(reserveLine, adverseParty)
    _exposure = _reserveLine.Exposure
    _subrogation = subrogation
  }

  override function hashCode(): int {
    return new HashCodeBuilder()
        .appendSuper(super.hashCode())
        .append(_exposure)
        .toHashCode()
  }

  override function equals(obj : Object) : boolean {
    if(obj === this) return true

    return obj != null
        && obj typeis SubroFinsExposureNode
        && ((_exposure == null && obj.Exposure == null) || _exposure.equals(obj.Exposure))
  }

  override function compareTo(o : Object): int {
    var row = o as SubroFinsExposureNode
    //Claim-level reserve summaries need to be sent to the bottom
    var i1 = _exposure != null ? this._exposure.ClaimOrder : Integer.MAX_VALUE
    var i2 = row.Exposure != null ? row.Exposure.ClaimOrder : Integer.MAX_VALUE
    return new CompareToBuilder()
        .appendSuper(super.compareTo(row))
        .append(i1, i2)
        .toComparison()
  }

  override property get SummaryRow() : AbstractSubroFinsNode {
    return new SubroFinsRootNode(_reserveLine, _adverseParty)
  }

  override property get Level() : int {
    return 1
  }

  override property get Label() : String {
    if(_label == null || _label.isEmpty()) {
      if(_exposure != null) {
        _label = "${_exposure.DisplayName} - ${StringUtil.formatPercentagePoints(SubrogationFinancialsHelper.getExpectedRecoveryFor(_subrogation, _adverseParty).doubleValue(), 1)}"
      } else {
        if(_adverseParty != null) {
          _label = DisplayKey.get("Web.Subrogation.Financials.ClaimLevel", StringUtil.formatPercentagePoints(_adverseParty.ExpectedRecovery?.doubleValue(), 1))
        } else {
          _label = DisplayKey.get("Web.Subrogation.Financials.ClaimLevel", StringUtil.formatPercentagePoints(_subrogation.TotalExpectedRecoveryPercent.doubleValue(), 1))
        }
      }
    }
    return _label
  }
}
package gw.api.financials

uses gw.api.locale.DisplayKey
uses gw.pl.persistence.core.Key
uses java.lang.NullPointerException

/**
 * A wrapper object used by ReserveLineInputSet in order to allow distinguishing
 * between new claim-level reserve lines and new exposure-level reserve lines in
 * the UI. This class also makes it possible for ReserveLineInputSetHelper to
 * cache information about exposures even if they get evicted from the bundle
 * (such as when a pop-up is canceled).
 *
 * <p>Instances of this class are immutable, and are considered equal to one
 * another if their ExposureID properties are equal.
 */
@Export
class ExposureOption {

  public static function optionFor(exposure : Exposure) : ExposureOption {
    if (exposure == null) {
      throw new NullPointerException("exposure is null")
    }
    return new ExposureOption(exposure)
  }

  public static final var CLAIM_LEVEL_OPTION : ExposureOption = new ExposureOption()

  var _exposureID : Key
  var _optionText : String

  private construct(e : Exposure) {
    _exposureID = e.ID
    _optionText = e.DisplayName
  }

  private construct() {
    _exposureID = null
    _optionText = null
  }

  /**
   * The exposure that this option is associated with. Null if and only if this
   * is CLAIM_LEVEL_OPTION.
   */
  property get ExposureID() : Key {
    return _exposureID
  }

  /**
   * Returns either "none (Claim-level)" if this is CLAIM_LEVEL_OPTION or the
   * associated exposure's DisplayName property otherwise.
   */
  override function toString() : String {
    return _optionText ?: DisplayKey.get("Web.Financials.ReserveLineInputSet.Exposure.ClaimLevel")
  }

  override function equals(o : Object) : boolean {
    return o typeis ExposureOption and o._exposureID == this._exposureID
  }

  override function hashCode() : int {
    return _exposureID == null ? 0 : _exposureID.hashCode()
  }

}

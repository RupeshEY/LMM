package gw.api.financials

uses gw.api.locale.DisplayKey
uses java.lang.NullPointerException
uses gw.pl.persistence.core.Key

/**
 * A wrapper object used by ReserveLineInputSet in order to allow distinguishing
 * between new reserve lines and existing reserve lines in the UI. This class
 * also makes it possible for ReserveLineInputSetHelper to cache information
 * about reserve lines even if they get evicted from the bundle (such as when a
 * pop-up is canceled).
 *
 * <p>Instances of this class are immutable, and are considered equal to one
 * another if their ReserveLineID properties are equal.
 */
@Export
class ReserveLineOption {

  public static function optionFor(reserveLine : ReserveLine) : ReserveLineOption {
    if (reserveLine == null) {
      throw new NullPointerException("reserveLine is null")
    }
    return new ReserveLineOption(reserveLine)
  }

  public static final var NEW_OPTION : ReserveLineOption = new ReserveLineOption()

  var _reserveLineID : Key
  var _optionText : String
  var _reservingCurrency : Currency

  private construct(r : ReserveLine) {
    _reserveLineID = r.ID
    _optionText = r.DisplayName
    _reservingCurrency = r.ReservingCurrency
  }

  private construct() {
    _reserveLineID = null
    _optionText = null
    _reservingCurrency = null
  }

  /**
   * The reserve line that this option is associated with. Null if and only if
   * this is NEW_OPTION.
   */
  property get ReserveLineID() : Key {
    return _reserveLineID
  }

  /**
   * The reserving currency of the reserve line that this option is associated
   * with. Null if and only if this is NEW_OPTION.
   */
  property get ReservingCurrency() : Currency {
    return _reservingCurrency
  }

  /**
   * Returns either "New..." if this is NEW_OPTION or the associated reserve
   * line's DisplayName property otherwise.
   */
  override function toString() : String {
    return _optionText ?: DisplayKey.get("Web.Financials.ReserveLineInputSet.ReserveLine.New")
  }

  override function equals(o : Object) : boolean {
    return o typeis ReserveLineOption and o._reserveLineID == this._reserveLineID
  }

  override function hashCode() : int {
    return _reserveLineID == null ? 0 : _reserveLineID.hashCode()
  }

}

package gw.api.financials.summary

uses java.lang.RuntimeException

/**
 * Wraps a value which could potentially be invalid, such as the result of adding two CurrencyAmount instances
 * with differing currencies.
 */
@Export
public class PotentiallyInvalid<T> {

  var valid = false
  var wrappedValue: T

  /**
   * returns a instance which is Valid and can therefore be unwrapped safely with get()
   */
  public static function of<X>(reference: X) : PotentiallyInvalid<X> {
    return new PotentiallyInvalid<X>(reference)
  }

  /**
   * returns an instance representing an invalid value.  Do not call get() on the result or you will get an exception.
   * @returns an instance that is not Valid.
   *
   */
  public static function buildInvalid<X>() : PotentiallyInvalid<X> {
    return new PotentiallyInvalid<X>()
  }

  private construct(reference : T) {
    valid = true
    wrappedValue = reference
  }


  /**
  * makes an invalid instance unless you call of() on the result.
   */
  private construct() {}

  /**
   * returns whether the wrapped value is valid or not
   */
  property get Valid() :  boolean {
    return valid
  }

/**
 * returns the underlying wrapped instance: make sure you can do this safely by checking the Valid property first.
 *
 */
  property get Value() : T {
    if (not valid) {
      throw new RuntimeException("attempt to access invalid value")
    }
    return wrappedValue
  }

}
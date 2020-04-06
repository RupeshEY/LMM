package gw.api.financials

/**
 * An interface for customizing the behavior of ReserveLineInputSet.
 *
 * <p>See the documentation of ReserveLineInputSetHelper for details on how that
 * class relates to this abstract class and its subclasses.
 */
@Export
abstract class ReserveLineInputSetStrategy {

  /**
   * Determines which existing reserve lines are allowed. This method will be
   * called by ReserveLineInputSetHelper for every existing reserve line on a
   * particular claim, and will allow the user to select only those reserve
   * lines for which this method returns true.
   *
   * <p>NOTE: If you only need to restrict reserve lines based on their
   * reserving currency, you don't need to override this method. Override
   * restrictReservingCurrency() instead, which will be called by
   * ReserveLineInputSetWrapper to further filter the allowed reserve line
   * options.
   */
  function allowExistingReserveLine(reserveLine : ReserveLine) : boolean { return true }

  /**
   * Determines whether new claim-level reserve lines are allowed. This method
   * will be called by ReserveLineInputSetHelper for a particular claim, and
   * will allow the user to create a new claim-level reserve line on that claim
   * only if this method returns true.
   */
  function allowNewClaimLevelReserveLine(claim : Claim) : boolean { return true }

  /**
   * Determines whether new exposure-level reserve lines are allowed. This
   * method will be called by ReserveLineInputSetHelper for every exposure on a
   * particular claim, and will allow the user to create a new exposure-level
   * reserve line on that exposure only if this method returns true.
   */
  function allowNewExposureLevelReserveLine(exposure : Exposure) : boolean { return true }

  /**
   * Determines whether there is any restriction on the reserving currency
   * allowed for the given transaction. A non-null return value indicates that
   * the user may select only those existing reserve lines having the same
   * reserving currency as the returned value and that the returned value should
   * be the only reserving currency option allowed when the user creates a new
   * reserve line.
   *
   * <p>NOTE: Since ReserveLineInputSetWrapper calls this method and enforces
   * its return value on existing as well as new reserve line options, the
   * allowExistingReserveLine() method usually does not need to take reserving
   * currency into account.
   */
  function restrictReservingCurrency(transaction : Transaction) : Currency { return null }

  /**
   * Called by ReserveLineInputSetWrapper just before setting a new reserve line
   * on the transaction. Overriding this method allows customizing the on-change
   * behavior of ReserveLineInputSet without modifying the PCF itself.
   */
  function beforeReserveLineChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just after setting a new reserve line
   * on the transaction. Overriding this method allows customizing the on-change
   * behavior of ReserveLineInputSet without modifying the PCF itself.
   */
  function afterReserveLineChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just before setting a new exposure on
   * the transaction. NOT called before setting a new reserve line on the
   * transaction, even though that causes a new exposure to be set as well.
   * Overriding this method allows customizing the on-change behavior of
   * ReserveLineInputSet without modifying the PCF itself.
   */
  function beforeExposureChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just after setting a new exposure on
   * the transaction. NOT called after setting a new reserve line on the
   * transaction, even though that causes a new exposure to be set as well.
   * Overriding this method allows customizing the on-change behavior of
   * ReserveLineInputSet without modifying the PCF itself.
   */
  function afterExposureChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just after setting a new cost type on
   * the transaction. NOT called after setting a new reserve line on the
   * transaction, even though that causes a new cost type to be set as well.
   * Overriding this method allows customizing the on-change behavior of
   * ReserveLineInputSet without modifying the PCF itself.
   */
  function afterCostTypeChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just after setting a new cost category
   * on the transaction. NOT called after setting a new reserve line on the
   * transaction, even though that causes a new cost category to be set as well.
   * Overriding this method allows customizing the on-change behavior of
   * ReserveLineInputSet without modifying the PCF itself.
   */
  function afterCostCategoryChange(transaction : Transaction) {}

  /**
   * Called by ReserveLineInputSetWrapper just after setting a new reserving
   * currency on the transaction. This may be due to switching to a reserve line
   * with a different reserving currency or due to the reserving currency itself
   * being explicitly changed. Overriding this method allows customizing the
   * on-change behavior of ReserveLineInputSet without modifying the PCF itself.
   */
  function afterReservingCurrencyChange(transaction : Transaction) {}

}

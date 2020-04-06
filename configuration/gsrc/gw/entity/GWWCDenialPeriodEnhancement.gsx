package gw.entity

uses gw.api.database.IQueryBeanResult
uses gw.api.database.Query
uses gw.api.database.Relop

uses java.util.Date

/**
 * Set of helpful Denial Period utility methods.
 */
@Export
enhancement GWWCDenialPeriodEnhancement : entity.WCDenialPeriod {
  /**
   * Finds and returns all available Denial Periods.
   */
  public static function findAllDenialPeriods() : IQueryBeanResult<WCDenialPeriod> {
    return Query.make(WCDenialPeriod).select()
  }

  /**
   * Finds and returns all Denial Periods that apply to a given Jurisdiction.
   *
   * @param jurisdiction Jurisdiction in which to narrow search for Denial Periods
   *
   * @return search result of all Denial Periods that apply to a given Jurisdiction
   */
  public static function findDenialPeriods(final jurisdiction : Jurisdiction): IQueryBeanResult<WCDenialPeriod> {
    return Query.make(WCDenialPeriod).compare(WCDenialPeriod#JurisdictionState, Equals, jurisdiction).select()
  }

  /**
   * Finds and returns all effective Denial Periods that apply to a given Jurisdiction.  A Denial Period is considered
   * in effect if a given Date falls between the Denial Period's EffectiveDate (start date) and Expiry Date (end date).
   *
   * @param jurisdiction Jurisdiction which Denial Period applies
   * @param date Date which Denial Period needs to be in effect
   *
   * @return Denial Period in effect for a given Jurisdiction for a given Date
   */
  public static function findEffectiveDenialPeriod(final jurisdiction : Jurisdiction, final date : Date): WCDenialPeriod {
    return Query.make(WCDenialPeriod)
        .compare(WCDenialPeriod#JurisdictionState, Equals, jurisdiction)
        .compare(WCDenialPeriod#EffectiveDate, Relop.LessThanOrEquals, date)
        .compare(WCDenialPeriod#ExpiryDate, Relop.GreaterThanOrEquals, date)
        .select().getAtMostOneRow()
  }

  /**
   * Finds the Denial Period in effect for a given claim. This is based on the claim's Jurisdiction and
   * LossDate.
   *
   * @param claim Claim which sought out Denial Period applies
   *
   * @return Denial Period which is effective for given claim
   */
  public static function findEffectiveDenialPeriod(final claim : Claim) : WCDenialPeriod {
    return findEffectiveDenialPeriod(claim.JurisdictionState, claim.LossDate)
  }

  /**
   * Checks whether this Denial Period would be in effect for a given date, not considering other factors.
   *
   * @param Date date to check against Denial Period effective time
   *
   * @return true if Denial Period would be in effect for a given time.
   */
  public function isInEffect(final date : Date): boolean {
    return date.compareTo(this.EffectiveDate) >= 0 and date.compareTo(this.ExpiryDate) <= 0
  }

  /**
   * Checks whether this Denial Period is in effect for a given claim. This is check is based on the
   * claim's loss date and jurisdiction.
   *
   * @param claim Claim check against this Denial Period
   *
   * @return true if this Denial Period is in effect for this claim.
   *
   */
  public function isInEffect(claim : Claim): boolean {
    return isInEffect(claim.LossDate)
  }

}

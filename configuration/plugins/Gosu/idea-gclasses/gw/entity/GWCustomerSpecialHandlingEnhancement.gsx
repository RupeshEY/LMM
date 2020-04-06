package gw.entity

/**
 * Extended utilty methods for use with CustomerServiceTierSpecialHandling entity
 */
@Export
enhancement GWCustomerSpecialHandlingEnhancement : CustomerServiceTierSpecialHandling {

  /**
   * Finds the CustomerServiceTierSpecialHandling entity associated with a particular CustomerServiceTier.
   *
   * @param serviceTier the CustomerServiceTier typecode to match against
   * @returns the matching CustomerServiceTierSpecialHandling or null if none are associated with the typecode.
   */
  public static function findServiceHandlingForCustomerServiceTier(serviceTier: CustomerServiceTier) : CustomerServiceTierSpecialHandling {
    // if no service tier given, then just return null right away.
    if (serviceTier == null) {
      return null
    }

    // find the special handling associated with this service tier. One and only one exist.
    return gw.api.database.Query.make(CustomerServiceTierSpecialHandling)
        .compare(CustomerServiceTierSpecialHandling#CustomerServiceTier, Equals, serviceTier).select().AtMostOneRow
  }
}

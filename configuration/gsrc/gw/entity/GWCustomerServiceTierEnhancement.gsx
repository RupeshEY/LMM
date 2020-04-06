package gw.entity

uses gw.api.database.Query

uses java.util.ArrayList
uses java.util.List

/**
 * Set of utility methods for working with Customer Service Tiers.
 */
@Export
enhancement GWCustomerServiceTierEnhancement : typekey.CustomerServiceTier {

  /**
   * Returns the set of all customer service tiers that have been registered.
   */
  public static function findAvailableCustomerTiers() : List<CustomerServiceTier> {
    var results = new ArrayList<CustomerServiceTier>()
    var iter = Query.make(CustomerServiceTierSpecialHandling).select().iterator()
    while (iter.hasNext()) {
      results.add(iter.next().CustomerServiceTier)
    }

    return results
  }

  /**
   * Returns CustomerServiceTierSpecialHandling for this CustomerServiceTier.
   */
  public function findServiceHandlingForCustomerServiceTier() : CustomerServiceTierSpecialHandling {
    return CustomerServiceTierSpecialHandling.findServiceHandlingForCustomerServiceTier(this)
  }
}

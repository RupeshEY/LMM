package gw.api.financials.summary

uses com.google.common.collect.Maps
uses gw.api.financials.summary.variants.FinancialSummaryVariant

uses java.lang.IllegalArgumentException
uses java.util.Map
uses java.util.List

/* This class is the bridge between the PCF and the FinancialsSummaryEngine */

@Export
abstract class FinancialSummaryBridgeBase {

  private var eng : FinancialsSummaryEngine
  private var claim : Claim
  private var paymentAllowedCache = new PaymentAllowedCache()
  property get PaymentAllowedCache() : PaymentAllowedCache {
    return paymentAllowedCache
  }

  construct(c: Claim, initialFilterOption: String) {
    claim = c
    var options = new FinancialSummaryCalculationOptionsImpl()
    options.UseFloatingFinancials = false
    eng = new FinancialsSummaryEngine(claim, FilterOptionMapping.get(initialFilterOption), options)
    eng.process()
  }

  abstract property get FilterOptionMapping(): Map<String, FinancialSummaryVariant>

  public function changeFilterOption(filterOption: String, useFloatingFinancials: boolean) {
    var variant = FilterOptionMapping.get(filterOption)
    if (variant == null) {
      throw new IllegalArgumentException("no FinancialSummaryVariant found for " + filterOption)
    }
    var options = new FinancialSummaryCalculationOptionsImpl()
    options.UseFloatingFinancials = useFloatingFinancials
    //yes, we need to construct a new engine each time the parameters for variant or useFloatingFinancials has
    //changed.  But the other field in this class, paymentAllowedCache, can remain the same across this operation,
    eng = new FinancialsSummaryEngine(claim, variant, options)
    eng.process()
  }

  property get SummaryRows(): List<FSRow> {
    return eng.SummaryRows
  }

  property get RootRows(): List<FSRow> {
    return eng.Roots
  }

  /**
   * Cache that stores whether a payment can be made on a given claim or exposure.
   * Checking if a payment could be made turned out to be a very time consuming process
   * that grew significantly the more reserves were on the claim. This directly affected
   * the time to load the Financial Summary screen, as every reserve entry tried to verify
   * whether a payment or reserve could be made to render the QuickMenu. Since every row in
   * the Financial Summary screen had to run the same method to verify payments allowed on
   * the claim and exposure level, we decided to cache the value the first time, so all subsequent
   * rows could directly access the value without executing the method every time. There could
   * potentially be a problem with this approach if customers decide to add a link to a popup page
   * that affects whether payments are allowed. In this case, the cache will be out of date and
   * show incorrect data until the Financial Summary screen is refreshed.
   *
   * The Scope of the cache is limited to this instance of the FinancialSummaryBridge,
   * which is constructed each time a user enters the FinancialSummaryScreen
   */
  static class PaymentAllowedCache {
    private var _values = Maps.newHashMap<KeyableBean,Boolean>()

    function isPaymentAllowedOnClaim(claim : Claim ) : boolean {
      var result = _values.get(claim)
      if (result == null) {
        result = claim.isClaimLevelPaymentAllowed()
        _values.put(claim, result)
      }
      return result
    }

    function isPaymentAllowedOnExposure( exposure: Exposure): boolean  {
      var result = _values.get(exposure)
      if (result == null) {
        result = exposure.isPaymentAllowed()
        _values.put(exposure, result)
      }
      return result
    }
  } //PaymentAllowedCache
}
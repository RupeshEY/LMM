package gw.api.financials.summary

uses com.google.common.base.Optional

/**
 * an FSRow holds the data for the LV that is shown on the FinancialsSummaryScreen.  The label is the
 * string used for the "bucket" and includes both leaf nodes and summary nodes as well as the claim total.
 * The Amounts store the column values to be shown on the screen.
 * Each Node class is responsible for knowing how to "build" a corresponding FSRow instance.
 * The Node classes form the configurable parts used by the FinancialsSummaryEngine, while the FSRow
 * is more about the UI, via the LV.
 *
 * FSRowBase contains the properties and methods that are common to all variants.  FSRow contains the properties
 * and methods which are specific to the nodes defined by several variants in the configuration.
 **/
@Export
class FSRow extends FSRowBase {

  //These values are defined by the nodes and used by the PCF in the Variants.  Add more as needed in configuration.
  public var exposure : Optional<Exposure> as Exposure //can be null for claim-level financials.
  public var costType : CostType as CostType
  public var costCategory : CostCategory as CostCategory
  public var reservingCurrency : Currency as ReservingCurrency

  public function canCreateReserve() : boolean {
    //You need:
    // (1) ReserveAuthority (AuthorityProfile)
    // (2) The Exposure not to be closed, unless the reserveline is claim-level, and if so the claim not be closed
    // (3) Permission for this user to create reserves on this claim via the ClaimACL
    var currentUser: User = User.util.CurrentUser
    return  (currentUser.hasReserveAuthority() &&
        !(exposure.Present ? exposure.get().isClosed() : claim.isClosed()) &&
        perm.Claim.createreserve(claim))
  }

  public function canCreatePayment(fsb : FinancialSummaryBridge) : boolean {
    var currentUser: User = User.util.CurrentUser
    return currentUser.hasPaymentAuthority() &&
        perm.Claim.createpayment(claim) &&
        isPaymentAllowed(fsb)
  }

  function isPaymentAllowed(fsb : FinancialSummaryBridge) : boolean {
    var cache = fsb.getPaymentAllowedCache()
    return exposure.Present ? cache.isPaymentAllowedOnExposure(exposure.get()) : cache.isPaymentAllowedOnClaim(claim)
  }

}
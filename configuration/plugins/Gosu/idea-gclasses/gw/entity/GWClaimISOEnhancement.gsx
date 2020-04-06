package gw.entity
uses gw.api.iso.ISOProperties
uses gw.pl.persistence.core.Key

@Export
enhancement GWClaimISOEnhancement : Claim {
  
  /**
   * Should ISO ClaimSearch  messages be sent at the claim level (as opposed to the exposure level) for this
   * claim? The default implementation checks the following:
   * <ol>
   * <li>Is claim level messaging enabled in the ISO properties file? If not then return false
   * <li>Has this claim already been sent to ISO (is its ISOSendDate non null)? If so then return true. This
   *     check is really an optimization so we don't have to check all the exposures for claims that have
   *     already been sent to ISO
   * <li>Have any exposures already been sent to ISO individually (that is, do any of them have a
   *     non null ISOSendDate). If so return false
   * <li>Otherwise return true
   * </ol>
   * Customers can configure this property as necessary. For example they could choose to send messages
   * at the claim level for particular loss types.
   */
  property get ISOClaimLevelMessaging() : boolean {
    return ISOProperties.instance().ClaimLevelMessaging
       and (this.ISOSendDate != null or !this.Exposures.hasMatch(\ e -> e.ISOSendDate != null))
  }

  /**
   * If ISO messages are sent at the claim level, this property is used to determine in which order
   * the exposures on the claim will be processed when constructing an ISO ClaimSearch request. This can
   * be important as there are some occasions when not all exposures can be added to the request, for
   * example if more than one exposure would need a PropertyLossInfo aggregate, which can only appear
   * once. In such situations a loss section will be added for the first exposure and the later one
   * will be ignored.
   * <p>
   * The default implementation just orders by the ClaimOrder field on the exposures
   */
  property get ISOOrderedExposures() : Exposure[] {
    return this.OrderedExposures  
  }

  /**
   * Return the policy number as it was before any changes were made to this claim in the current
   * bundle. Has to check if the claim used to refer to a different policy or if the claim has the
   * same policy but the policy number changed
   */
  property get OriginalPolicyNumber() : String {
    var originalPolicyID = this.getOriginalValue("Policy") as Key
    var originalPolicy = this.Bundle.loadBean(originalPolicyID)
    return originalPolicy.getOriginalValue("PolicyNumber") as String
  }

  /** Used on the claim loss details page to decide whether the ISO buttons should be visible */
  property get ISOButtonsVisible() : boolean {
    return perm.Claim.edit(this) and this.ISOClaimLevelMessaging
  }

  /** Used on the claim loss details page to decide whether the ISO buttons should be available */
  property get ISOButtonsAvailable() : boolean {
    return ISOButtonsVisible and this.ISOEnabled and this.isValid(TC_ISO, true) and this.ISOOrderedExposures.length > 0
  }
}

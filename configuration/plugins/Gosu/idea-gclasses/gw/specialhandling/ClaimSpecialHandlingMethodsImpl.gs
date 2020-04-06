package gw.specialhandling
uses gw.api.specialhandling.ClaimSpecialHandlingMethods
uses java.util.ArrayList

@Export
class ClaimSpecialHandlingMethodsImpl implements ClaimSpecialHandlingMethods {
  private var _claim : Claim as readonly ClaimForSpecialHandling

  construct(claim : Claim) {
    _claim = claim
  }

  /**
   * Aggregates all the AutomatedHandlers to be processed for changes to this claim and returns them for
   * further action.  Out of the box, AutomatedHandlers are only associated with a Claim via the Claim's
   * Policy's Account, if one exists.  However this function can be modified to also return AutomatedHandlers
   * associated with a claim in some customer defined manner.
   *
   * The AutomatedHandlers should be filtered by the PolicyType of the Claim's Policy.  That is, only
   * AutomatedHandlers created with a matching PolicyType or created for all PolicyTypes should be included in the
   * aggregated list.
   * 
   * @Return an array of AutomatedHandler instances associated with this Claim, filtered by PolicyType
   */
  override property get AutomatedHandlers() : AutomatedHandler[] {
    var policy = ClaimForSpecialHandling.Policy
    var policyType = policy.PolicyType
    var handlers = new ArrayList<AutomatedHandler>()
    
    // add AutomatedHandlers associated via a Policy Account
    var policyAccount = policy.PolicyAccount
    if (null != policyAccount and null != policyAccount.SpecialHandling) {
      handlers.addAll(policyAccount.SpecialHandling.AutomatedHandlers.where(\ o -> o.PolicyType== null or o.PolicyType == policyType)?.toList())
    }

    // Add AutomatedHandlers associated via a Policy ServiceTier
    var serviceTier = policy.CustomerServiceTier
    var specialHandling  = CustomerServiceTierSpecialHandling.findServiceHandlingForCustomerServiceTier(serviceTier)
    if (null != specialHandling and null != serviceTier) {
      handlers.addAll(specialHandling.AutomatedHandlers.where(\ o -> o.PolicyType== null or o.PolicyType == policyType)?.toList())
    }
    
    return handlers.toTypedArray()
  }

  /**
   * Aggregates and returns all the OtherInstructions associated with this Claim.  Out of the box, OtherInstructions
   * are only associated with a Claim via the Claim's Policy's Account.
   *
   * @return a List of OtherInstruction instances associated with this Claim, filtered by PolicyType
   */
  override property get OtherInstructions() : OtherInstruction[] {
    var policy = ClaimForSpecialHandling.Policy
    var policyType = policy.PolicyType
    var instructions = new ArrayList<OtherInstruction>()
    
    // add OtherInstructions associated via a Policy Account
    var policyAccount = policy.PolicyAccount
    if (null != policyAccount and null != policyAccount.SpecialHandling) {
      instructions.addAll(policyAccount.SpecialHandling.OtherInstructions.where(\ o -> o.PolicyType== null or o.PolicyType == policyType)?.toList())
    }
    
    // add OtherInstructions associated via a Policy ServiceTier
    var serviceTier = policy.CustomerServiceTier
    var specialHandling  = CustomerServiceTierSpecialHandling.findServiceHandlingForCustomerServiceTier(serviceTier)
    if (null != CustomerServiceTier and null != specialHandling) {
        // Check for any special handling rules
        instructions.addAll(specialHandling.OtherInstructions.where(\ o -> o.PolicyType== null or o.PolicyType == policyType)?.toList())
    }

    return instructions.toTypedArray()
  }
  
}
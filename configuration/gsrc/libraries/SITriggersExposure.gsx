package libraries

@Export
enhancement SITriggersExposure : entity.Exposure {

  /**
   * Called by Exposure Pre-update SI triggers rules. First checks that there is not already an SITrigger with
   * the same description and information. If there is not such an existing trigger then a new SITrigger is
   * added, with the given description, information, exposure and point value, and the point value is also
   * added to the claim's SIScore. Returns the new SITrigger, or null if no new trigger was created.
   */
  function siTriggersLogicExposure(triggerDescription : String, additionalInformation: String, pointValue: int) : SITrigger {
    var result = this.Claim.siTriggersLogicClaim(triggerDescription, additionalInformation, pointValue)
    if (result != null) {
      result.Exposure = this
    }
    return result
  }

}
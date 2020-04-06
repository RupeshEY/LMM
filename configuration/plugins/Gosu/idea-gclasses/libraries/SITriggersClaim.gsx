package libraries

@Export
enhancement SITriggersClaim : entity.Claim {

  /**
   * Called by Claim Pre-update SI triggers rules. First checks that there is not already an SITrigger with
   * the same description and information. If there is not such an existing trigger then a new SITrigger is
   * added, with the given description, information and point value, and the point value is also added to the
   * claim's SIScore. Returns the new SITrigger, or null if no new trigger was created.
   */
  function siTriggersLogicClaim(triggerDescription : String, additionalInformation: String, pointValue: int) : SITrigger {
    var result : SITrigger = null
    if (not this.SITriggers.hasMatch(\ t ->
            t.TriggerDescription == triggerDescription and t.AdditionalInformation == additionalInformation)) {
      var trigger = new SITrigger(this);
      trigger.Claim = this;
      trigger.TriggerDescription = triggerDescription
      trigger.AdditionalInformation = additionalInformation
      trigger.PointValue = pointValue
      this.addToSITriggers(trigger)
      this.SIScore += trigger.PointValue
      result = trigger
    }
    return result
  }

}
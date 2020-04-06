package gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns

class IPLMAddActivityPatternForConflictOfInterestTrigger extends AbstractIPLMAddActivityPatternTrigger {

  private static final var ECF_COI_ACTIVITY = "ecf_coi_activity"
  internal var PATTERN_DETAILS_LIST : List<IPLMActivityPatternCreateDetails> = new ArrayList<IPLMActivityPatternCreateDetails>()

  public construct(minorVersionWhenTriggerIsApplicable : int) {
    super(minorVersionWhenTriggerIsApplicable)
    addActivityPattern(createPatternDetails(ECF_COI_ACTIVITY, "A Conflict of Interest has been identified on this Claim.", "A Conflict of Interest has been identified on this Claim."));
  }

  private function addActivityPattern(patternDetails : IPLMActivityPatternCreateDetails) : void {
    PATTERN_DETAILS_LIST.add(patternDetails)
  }

  private function createPatternDetails(patternCode : String, subject : String, description : String) : IPLMActivityPatternCreateDetails {
    return new IPLMActivityPatternCreateDetails()
        .setPatternCode(patternCode)
        .setActivityClass("task")
        .setActivityType("warning")
        .setCategory("approval")
        .setSubject(subject)
        .setDescription(description)
        .setMandatory(false)
        .setPriority("high")
        .setImportance("notOnCalendar")
        .setRecurring(false)
        .setTargetDays(1)
        .setTargetIncludeDays("businessdays")
        .setTargetStartPoint("activitycreation")
        .setTargetBusCalTag("companyholidays")
        .setEscalationDays(3)
        .setEscalationInclDays("businessdays")
        .setEscalationStartPt("activitycreation")
        .setEscalationBusCalTag("companyholidays")
        .setAutomatedOnly(false)
        .setClosedClaimAvlble(false)
        .setExternallyOwnded(false)
  }

  protected function getPatternDetailsList() : List<IPLMActivityPatternCreateDetails> {
    return PATTERN_DETAILS_LIST
  }

  override property get Description() : String {
    return "Insert activity pattern for ECF Conflict Of Interest."
  }
}
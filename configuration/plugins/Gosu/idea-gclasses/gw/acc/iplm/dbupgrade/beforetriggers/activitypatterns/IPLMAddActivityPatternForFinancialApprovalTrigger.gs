package gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns

class IPLMAddActivityPatternForFinancialApprovalTrigger extends AbstractIPLMAddActivityPatternTrigger {

  private static final var APPROVE_ECF_TRANSACTION = "approve_ecf_transaction"
  internal var PATTERN_DETAILS_LIST : List<IPLMActivityPatternCreateDetails> = new ArrayList<IPLMActivityPatternCreateDetails>()

  public construct(minorVersionWhenTriggerIsApplicable : int) {
    super(minorVersionWhenTriggerIsApplicable)
    addActivityPattern(createPatternDetails(APPROVE_ECF_TRANSACTION, "Review and approve ECF Transaction", ""));
  }

  private function addActivityPattern(patternDetails : IPLMActivityPatternCreateDetails) : void {
    PATTERN_DETAILS_LIST.add(patternDetails)
  }

  private function createPatternDetails(patternCode : String, subject : String, description : String) : IPLMActivityPatternCreateDetails {
    return new IPLMActivityPatternCreateDetails()
        .setPatternCode(patternCode)
        .setActivityClass("task")
        .setActivityType("approval")
        .setCategory("approval")
        .setSubject(subject)
        .setDescription(description)
        .setMandatory(true)
        .setPriority("high")
        .setImportance("notOnCalendar")
        .setRecurring(false)
        .setTargetDays(0)
        .setTargetIncludeDays("businessdays")
        .setTargetStartPoint("activitycreation")
        .setTargetBusCalTag("companyholidays")
        .setEscalationDays(2)
        .setEscalationInclDays("businessdays")
        .setEscalationStartPt("activitycreation")
        .setEscalationBusCalTag("companyholidays")
        .setAutomatedOnly(true)
        .setClosedClaimAvlble(false)
        .setExternallyOwnded(false)
  }

  protected function getPatternDetailsList() : List<IPLMActivityPatternCreateDetails> {
    return PATTERN_DETAILS_LIST
  }

  override property get Description() : String {
    return "Insert activity pattern to authorise ECF Claim Response financials."
  }
}
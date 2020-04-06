package gw.entity

uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
uses gw.util.Pair
uses java.util.HashSet
uses gw.api.util.DisplayableException

/**
 * Utility methods for Worker's Compensation type Claims.
 */
@Export
enhancement GWClaimWorkCompEnhancement: entity.Claim {

  private static property get COMPLETED_ICON(): String {
    return "activity_status_green.png"
  }
  private static property get OVERDUE_ICON(): String {
    return "activity_status_red.png"
  }
  private static property get IN_PROGRESS_ICON(): String {
    return "activity_status_blue.png"
  }

  /**
   * @return the first open claim_acceptance activity, or null if there is none.
   */
  property get CompensableActivity() : Activity {
    return this.Activities.firstWhere(\ a -> a.ActivityPattern.Code == "claim_acceptance" and a.Status == ActivityStatus.TC_OPEN)
  }

  property get CompensableDocument(): String {
    var dayOfLoss = this.LossDate.trimToMidnight()

    var denialPeriod = Query.make(entity.WCDenialPeriod)
        .compare(WCDenialPeriod#JurisdictionState, Equals, this.JurisdictionState)
        .and(\ andRes -> andRes
            .or(\ orRes -> orRes
                .compare(WCDenialPeriod#EffectiveDate, LessThanOrEquals,    dayOfLoss)
                .compare(WCDenialPeriod#EffectiveDate, Equals,              null))
            .or(\ orRes -> orRes
                .compare(WCDenialPeriod#ExpiryDate,    GreaterThanOrEquals, dayOfLoss)
                .compare(WCDenialPeriod#ExpiryDate,    Equals,              null))
        )
        .select()
        .AtMostOneRow

    var docName: String
    if (denialPeriod != null) {
      if (this.Compensable == CompensabilityDecision.TC_ACCEPTED) {
        docName = denialPeriod.AcceptDocumentTemplate
      }
      else if (this.Compensable == CompensabilityDecision.TC_DENIED) {
        docName = denialPeriod.RejectDocumentTemplate
      }
    }
    return docName
  }

  /**
   * @return true if the compensability of the claim has been accepted
   */
  function isWCCompensabilityDetermined(): boolean {
    return this.Compensable == CompensabilityDecision.TC_ACCEPTED
  }

  /**
   * Returns true if the minimum set of compensable factor questions have been answered by the
   * user, false otherwise.
   */
  public function isAllWCCompensabilityFactorsAnswered(): boolean {

    return this.EmploymentInjury != null
      and this.InjuredRegularJob != null
      and this.EmpQusValidity != null
      and this.SafetyEquipProv != null
      and this.SafetyEquipUsed != null
      and this.DrugsInvolved != null
  }

  /**
   * <p>For Worker's Comp claims, returns the icon/tooltip which summarizes the status of the 3-Point Contact activity notification for
   * Employer.  This is used to represent the status of this activity on the Claim Summary page.</p>
   *
   * <p>States are:
   * <ul>
   * <li>Green -> complete or addressed (cancelled, skipped or some other custom ActivityStatus)</li>
   *  <li>Red -> open and overdue</li>
   *  <li>Blue -> open still in progress</li>
   * </ul></p>
   *
   * <p>@return Pair which contains the icon filename (first) and tooltip (second)</p>
   */
  public function getWCContactEmployerActivityStatus() : Pair<String, String> {
    return this.LossType == LossType.TC_WC
        ? getWCThreePointContactActivityStatus(EmployerContactActivityPatternCode)
        : null
  }

  /**
   * <p>For Worker's Comp claims, returns the icon/tooltip which summarizes the status of the 3-Point Contact activity notification for
   * Employee.  This is used to represent the status of this activity on the Claim Summary page.</p>
   *
   * <p>States are:
   * <ul>
   * <li>Green -> complete or addressed (cancelled, skipped or some other custom ActivityStatus)</li>
   *  <li>Red -> open and overdue</li>
   *  <li>Blue -> open still in progress</li>
   * </ul></p>
   *
   * <p>@return Pair which contains the icon filename (first) and tooltip (second)</p>
   */
  public function getWCContactEmployeeActivityStatus() : Pair<String, String> {
    return this.LossType == LossType.TC_WC
        ? getWCThreePointContactActivityStatus(EmployeeContactActivityPatternCode)
        : null
  }

  /**
   * <p>For Worker's Comp claims, returns the icon/tooltip which summarizes the status of the 3-Point Contact activity notification for
   * Medical Provider.  This is used to represent the status of this activity on the Claim Summary page.</p>
   *
   * <p>States are:
   * <ul>
    * <li>Green -> complete or addressed (cancelled, skipped or some other custom ActivityStatus)</li>
   *  <li>Red -> open and overdue</li>
   *  <li>Blue -> open still in progress</li>
   * </ul></p>
   *
   * <p>@return Pair which contains the icon filename (first) and tooltip (second)</p>
   */
  public function getWCContactMedProviderActivityStatus() : Pair<String, String> {
    return this.LossType == LossType.TC_WC
        ? getWCThreePointContactActivityStatus(MedProviderContactActivityPatternCode)
        : null
  }

  private function getWCThreePointContactActivityStatus(final code: String) : Pair<String, String> {
    final var contactTypeMap = {
        EmployeeContactActivityPatternCode    -> DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.Employee"),
        EmployerContactActivityPatternCode    -> DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.Employer"),
        MedProviderContactActivityPatternCode -> DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.MedicalProvider")
    }

    var activity = this.Activities.firstWhere(\ act -> act.ActivityPattern.Code == code)

    // in the case that the claim is WC but requested 3-point contact activity is undefined (legacy claims for example),
    // there is neither an icon nor a tooltip
    var icon    = ""
    var tooltip = ""

    if (activity.Status == ActivityStatus.TC_OPEN) {
      if (DateUtil.currentDate().compareIgnoreTime(activity.TargetDate) > 0) {
        icon    = OVERDUE_ICON
        tooltip = DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.Overdue", contactTypeMap.get(code))
      }
      else {
        icon    = IN_PROGRESS_ICON
        tooltip = DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.Open", contactTypeMap.get(code))
      }
    }
    else if (activity != null) {
      icon    = COMPLETED_ICON                // it's cancelled, skipped or some custom value
      tooltip = DisplayKey.get("Web.ClaimSummary.Headline.ThreePointContact.Completed", contactTypeMap.get(code))
    }

    return new Pair<String, String>(icon, tooltip)
  }


  /**
   * Returns true if the 3-Point Contact Activity section should be displayed or not.
   */
  public function shouldShowWCThreePointContactActivities() : boolean {
    return hasWCThreePointContactActivities()
          and // all 3pt contact activities NOT have "completed" status (green icon)
          not (getWCContactEmployeeActivityStatus().First.contentEquals(COMPLETED_ICON)
                and getWCContactEmployerActivityStatus().First.contentEquals(COMPLETED_ICON)
                and getWCContactMedProviderActivityStatus().First.contentEquals(COMPLETED_ICON))
  }


  /**
   * <p>For Worker's Comp claims, returns true if the claim has 3-Point Contact activities. A claim must have one of each of the three different
   * 3pt activity patterns ("three_point_contact_employer", "three_point_contact_employee" and "three_point_contact_medical_provider") for this to return
   * true.</p>
   *
   * @returns true if this Claim has all 3-point Contact activities present and is a WC claim, false otherwise.
   */
  private function hasWCThreePointContactActivities() : boolean {
    if (this.LossType == LossType.TC_WC) {
      var activities = this.Activities
      if (not activities.IsEmpty) {
        var claimActivityPatterns = activities.map( \ a -> a.ActivityPattern.Code).toSet()
        return claimActivityPatterns.containsAll({EmployerContactActivityPatternCode, EmployeeContactActivityPatternCode, MedProviderContactActivityPatternCode})
      }
    }

    return false
  }

  /**
   * Returns activity pattern code for 3-point Contact - Employer
   */
  private property get EmployerContactActivityPatternCode() : String {
    return "three_point_contact_employer"
  }

  /**
   * Returns activity pattern code for 3-point Contact - Employee
   */
  private property get EmployeeContactActivityPatternCode() : String {
    return "three_point_contact_employee"
  }

  /**
   * Returns activity pattern code for 3-point Contact - Medical Provider
   */
  private property get MedProviderContactActivityPatternCode() : String {
    return "three_point_contact_medical_provider"
  }
}

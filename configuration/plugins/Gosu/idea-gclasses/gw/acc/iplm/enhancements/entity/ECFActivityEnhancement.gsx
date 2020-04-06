package gw.acc.iplm.enhancements.entity

uses entity.Activity
uses gw.acc.iplm.utils.ECFConstants

enhancement ECFActivityEnhancement: Activity {


  /**
   * Checks if this Activity is an ECF Transaction Approval activity
   *
   * @return true if the Activity is for an ECF Transaction Approval
   */
  property get ECFApproval(): boolean {
    return this.ActivityPattern.Code == ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN
  }

  /**
   * Returns if a given Activity has been rejected
   *
   * @return Activity is Rejected
   */
  property get Rejected(): Boolean {
    return this.Complete and not this.Approved
  }

  /**
   * Checks if Activity has a status of Complete
   *
   * @return Activity is Complete
   */
  property get Complete(): Boolean {
    return this.Status == ActivityStatus.TC_COMPLETE
  }
}
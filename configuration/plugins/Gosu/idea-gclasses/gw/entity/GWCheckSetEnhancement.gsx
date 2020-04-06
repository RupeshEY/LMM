package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil

@Export
enhancement GWCheckSetEnhancement : entity.CheckSet {

  function validateAllScheduledSendDatesOnBusinessDays() {
    for (check in this.Checks) {
      var sendDate = check.ScheduledSendDate
      if (sendDate != null and
          !DateUtil.isBusinessDay(sendDate, check.getBusinessCalendarAddress())) {
        this.reject(ValidationLevel.TC_PAYMENT, DisplayKey.get("Rules.Validation.Transaction.ScheduledSendDateNotWeekendOrHoliday", check.ScheduledSendDate.format("short")),  null, null)
      }
    }
  }
  
  /**
   * Check voiding, stopping, denial and deletion should not have the financial holds message displayed.
   * This method is called from the TransactionSet Validation Rules.
   */
  function checksetHasDeletedOrCancelledChecks(): Boolean {
    var deletedChecks  = this.getRemovedArrayElements("Checks")
    if(deletedChecks.Count > 0) {
      return true
    }
    var modifiedChecks = this.Checks.where(\ c -> c.Changed)
    if(modifiedChecks.firstWhere(\ c -> c.Voided == true) != null) {
      return true
    }
    if(modifiedChecks.firstWhere(\ c -> c.Stopped == true) != null) {
      return true
    }
    if(modifiedChecks.firstWhere(\ c -> c.Status == TransactionStatus.TC_DENIED) != null) {
      return true
    }
    return false  
  }

}

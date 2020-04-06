package gw.entity

@Export
enhancement GWRITransactionSetEnhancement : entity.RITransactionSet {
  /**
   * Rejects this RITransactionSet with the given error reason,
   * unless its bundle also contains normal Transactions
   * (to be inserted or updated). In that case, this RITransactionSet
   * is not rejected, but an Activity to review RI adjustments
   * will be created.
   * 
   * @param msg the error message with which to reject this RITRansactionSet
   */
  function rejectOrCreateActivity(msg : String) {
    if (this.Bundle.getInsertedAndUpdatedBeansOfType(Transaction).Empty) {
      this.rejectField("RITransactions", TC_NEWLOSS, msg, null, null)
    } else {
      var pattern = ActivityPattern.finder.getActivityPatternByCode("reinsurance_review")
      if (!this.Claim.Activities.hasMatch(\ a -> a.ActivityPattern == pattern && a.Status == ActivityStatus.TC_OPEN)) {
        this.Claim.createActivityFromPattern(null, pattern)
      }
    }
  }

  /**
   * Rejects this RITransactionSet with the given error reason,
   * unless its bundle also contains normal Transactions
   * (to be inserted or updated). In that case, this RITransactionSet
   * is not rejected, but an Activity to review RI adjustments
   * will be created.
   * 
   * @param msg the error message with which to reject this RITRansactionSet
   */
  function warnOrCreateActivity(msg : String) {
    if (this.Bundle.getInsertedAndUpdatedBeansOfType(Transaction).Empty) {
      this.rejectField("RITransactions", null, null, TC_NEWLOSS, msg)
    } else {
      var pattern = ActivityPattern.finder.getActivityPatternByCode("reinsurance_review")
      if (!this.Claim.Activities.hasMatch(\ a -> a.ActivityPattern == pattern && a.Status == ActivityStatus.TC_OPEN)) {
        this.Claim.createActivityFromPattern(null, pattern)
      }
    }
  }

}

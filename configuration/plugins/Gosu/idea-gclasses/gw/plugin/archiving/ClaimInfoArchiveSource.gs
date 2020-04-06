package gw.plugin.archiving
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
uses gw.api.util.DateUtil
uses gw.api.system.CCConfigParameters
uses gw.api.database.Relop
uses gw.api.archiving.upgrade.Issue
uses java.util.List

/**
 * This subclass of ArchiveSource extends the example IArchiveSource implementation with logic that assumes that the
 * RootInfo is an instance of ClaimInfo, which is always the case in ClaimCenter.
 */
@Export
class ClaimInfoArchiveSource extends ArchiveSource {

  override function updateInfoOnStore(info : RootInfo) {
    super.updateInfoOnStore(info)
    removeMessageHistoriesForClaim(info)
    clearPolicyLocationSummaryJoinEntry(info)
  }

  function removeMessageHistoriesForClaim(info : RootInfo) {
    // Find all the MessageHistories for this claim and remove them; they must be removed to prevent
    // FK violations when the Claim is deleted from the database
    var q = Query.make(MessageHistory).compare("Claim", Equals, (info as ClaimInfo).Claim.ID).select()
    for(messageHistory in q) {
      messageHistory = info.Bundle.add(messageHistory)
      messageHistory.remove()
    }
  }

  function clearPolicyLocationSummaryJoinEntry(info : RootInfo) {
    // Omit references to PolicyLocationSummaryJoin from the archive
    var query = Query.make(PolicyLocationSummaryJoin)
                         .join("Claim")
                         .compare("Claim.ID", Relop.Equals, (info as ClaimInfo).Claim.ID)
                         .select()
                         
    for (var plsJoin in query) {                         
      plsJoin = info.Bundle.add(plsJoin)
      plsJoin.remove()
    }
  }

  override function updateInfoOnRetrieve(info : RootInfo) {
    super.updateInfoOnRetrieve(info)
    var claim = (info as entity.ClaimInfo).Claim
    for (var biii in claim.Bundle.getInsertedAndUpdatedBeansOfType(BulkInvoiceItemInfo)) {
      biii.BulkInvoiceItem.ReservingCurrency = biii.ReserveLineWrapper.ReserveLine.ReservingCurrency
    }
    claim.DateEligibleForArchive = DateUtil.addDays(DateUtil.currentDate(), CCConfigParameters.DaysRetrievedBeforeArchive.Value)
  }

  override function handleUpgradeIssues(info : RootInfo, root : KeyableBean, issues : List<Issue>) {
    var note = new Note(info)
    note.Confidential = (false)
    note.Subject = DisplayKey.get("Java.Archive.API.Warn.UpgradeIssues")
    note.Body = issues.join("\n")
    note.Claim = root as Claim
  }
}

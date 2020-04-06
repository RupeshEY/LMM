package gw.util

uses gw.api.locale.DisplayKey
uses gw.processes.BatchProcessBase
uses gw.api.system.CCConfigParameters
uses gw.api.system.PLLoggerCategory
uses gw.api.util.DateUtil
uses java.lang.Exception
uses java.lang.UnsupportedOperationException
uses gw.api.database.Query
uses gw.api.database.IQueryBeanResult

@Export
class CatastropheClaimFinderBatch extends BatchProcessBase {

  var _catActivityPattern = ActivityPattern.finder.getActivityPatternByCode("catastrophe_review")
  static final var MAX_CLAIM_RESULTS = CCConfigParameters.MaxCatastropheClaimFinderSearchResults.Value
  static final var SYSTEM_USER_NAME = "sys"

  construct() {
    super(BatchProcessType.TC_CATASTROPHECLAIMFINDER)
  }

  override function doWork() {
    var catastrophes = findMarkedCatastrophes()
    var historyDescription = ""
    var catClaims : java.util.List<entity.Claim>

    for (catastrophe in catastrophes) {
      var claimsProcessedCount = 0
      try {
        if(_catActivityPattern == null) {
          throw new UnsupportedOperationException(DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.ActivityDoesNotExist", _catActivityPattern.Subject))
        }
        catClaims = catastrophe.findClaimsByCatastropheZone().toList().where(\ c -> !c.Activities.hasMatch(\ a -> a.ActivityPattern == _catActivityPattern))
        for (claim in catClaims) {
          // creates a 'review for catastrophe' activity if one does not already exist
          createReviewForCatastropheActivity(claim)
          claimsProcessedCount++
          // does not process any claims over the result limit. the result limit is based off the MaxCatastropheClaimFinderSearchResults config parameter.
          if (catClaims.Count > MAX_CLAIM_RESULTS and claimsProcessedCount >= MAX_CLAIM_RESULTS) {
            PLLoggerCategory.SERVER_BATCHPROCESS.info(DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.ExceedsNumClaimResults", MAX_CLAIM_RESULTS, claimsProcessedCount, catClaims.Count))
            break
          }
        }
        historyDescription = getHistoryDescription(claimsProcessedCount, catClaims.Count)
      } catch (e : Exception) {
        historyDescription = DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.ErrorOccurred") + e.Message
      }
      createAndAddCatastropheClaimsHistory(catastrophe, historyDescription)
      if (catClaims.Count < MAX_CLAIM_RESULTS) {
        clearScheduleBatch(catastrophe)
      }
    }
  }

  override function checkInitialConditions() : boolean {
    return true
  }

  private function findMarkedCatastrophes() : IQueryBeanResult<Catastrophe> {
    return Query.make(entity.Catastrophe).compare("ScheduleBatch", Equals, Boolean.TRUE).select()
  }

  private function createReviewForCatastropheActivity(claim : Claim) {
    gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
      var c = bundle.add(claim)
      var activity = c.createActivityFromPattern(null, _catActivityPattern);
      activity.Description = DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.ReviewMatchesOnClaim")
    }, SYSTEM_USER_NAME)
  }

  private function getHistoryDescription(numClaimsProcessed : int, numClaimsMatched : int) : String {
    if(numClaimsProcessed == 0) {
      return DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.NoClaimsMatched")
    } else {
      return DisplayKey.get("Web.InternalTools.BatchProcess.CatastropheClaimFinder.ClaimsMatched", numClaimsMatched, _catActivityPattern.Subject, numClaimsProcessed)
    }
  }

  private function createAndAddCatastropheClaimsHistory(catastrophe : Catastrophe, historyDescription : String) {
    gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
      var cat = bundle.add(catastrophe)
      var claimsHistory = new CatastropheClaimsHistory()
      claimsHistory.EventTimestamp = DateUtil.currentDate()
      claimsHistory.Description = historyDescription
      cat.addToClaimsHistory(claimsHistory)
    }, SYSTEM_USER_NAME)
  }

  private function clearScheduleBatch(catastrophe : Catastrophe) {
    gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
      var cat = bundle.add(catastrophe)
      cat.ScheduleBatch = false
    }, SYSTEM_USER_NAME)
  }
}

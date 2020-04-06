package gw.util
uses gw.api.database.QuerySelectColumns
uses gw.api.locale.DisplayKey
uses com.google.common.collect.Iterables
uses gw.api.path.Paths
uses gw.processes.BatchProcessBase
uses java.util.Date
uses gw.api.system.CCConfigParameters
uses gw.api.system.PLLoggerCategory
uses gw.api.database.Query
uses java.lang.Math
uses gw.api.database.IQueryBeanResult
uses java.lang.Exception

/**
 * Batch process which adds metrics and indicators to any claims that do not have them. It's possible that a very large
 * number of claims don't have metrics (for example after an upgrade or load from staging tables) so this process has a
 * configurable limit on the number of claims it will process at a time. It would typically be run nightly so that it
 * would add metrics to all the claims that need them over time. The query to find the claims that need metrics orders
 * them by loss date so that more recent claims will be processed first.
 * <p>
 * There are some unexpected problems which make the implementation of this process a little more complex than you might
 * expect:
 * <ul>
 * <li> The query to find the claims that need metrics and indicators should always be chunked, that is setPageSize
 *      should be set so it returns the data in chunks rather than as one big query result. If the query is not chunked
 *      then it will read all the claims with no metrics into memory at once which is potentially extremely expensive
 *      and might even crash the server.
 * <li> Using a chunking query is tricky when you are altering the data returned by the query. Our query finds claims
 *      with no metrics or indicators but as our process works through the query results it adds metrics and indicators
 *      to those claims, which confuses the chunking queries. For example if the chunk size is 1000 then the query to
 *      find the second chunk would find all claims with no metrics or indicators between rows 1001 and 2000; but by the
 *      time we execute this query we've already processed the first 1000 claims so the query will end up skipping 1000
 *      claims that we actually need to process. So we use chunking to avoid reading all the claims into memory at once,
 *      but we also have to re-issue the query from the start each time because the data is changing under its feet.
 * </ul>
 */
@Export
class ClaimHealthCalculatorBatch extends BatchProcessBase {

  static final var DEFAULT_CHUNK_SIZE = 1000

  var _chunkSize : int

  construct() {
    this(DEFAULT_CHUNK_SIZE)
  }

  /** This constructor is used for testing and allows a configurable chunk size; the default chunk size is used in production */
  construct(chunkSize : int) {
    super(BatchProcessType.TC_CLAIMHEALTHCALC)
    _chunkSize = chunkSize
  }

  override function doWork() : void {
    var claimsToProcess = findNumberOfClaimsToProcess()
    var processedSoFar = 0
    while (processedSoFar < claimsToProcess) {
      var chunkSize = getChunkSize(claimsToProcess, processedSoFar)
      if (processChunk(chunkSize)) {
        processedSoFar += chunkSize
      } else {
        // Rare case: some other user/process added metrics to a claim so we don't have the expected number to process
        break
      }
    }
  }

  private function findNumberOfClaimsToProcess() : int {
    final var claimsWithNoMetricsCount = findClaims().getCount()
    final var maxClaimResults = CCConfigParameters.MaxClaimResultsPerClaimHealthCalcBatch.Value
    var claimsToProcess = claimsWithNoMetricsCount
    if (maxClaimResults < claimsWithNoMetricsCount) {
      PLLoggerCategory.SERVER_BATCHPROCESS.info(DisplayKey.get("Web.InternalTools.BatchProcess.ClaimHealthCalculator.ExceedsNumClaimResults", maxClaimResults, maxClaimResults, claimsWithNoMetricsCount))
      claimsToProcess = maxClaimResults
    }
    return claimsToProcess
  }

  /**
   * Normally returns the chunk size specified in the constructor but may return less on the very last chunk when we're about to
   * run out of claims to process.
   */
  private function getChunkSize(claimsToProcess : int, processedSoFar : int) : int {
    var remainingClaimsToProcess = claimsToProcess - processedSoFar
    return Math.min(_chunkSize, remainingClaimsToProcess)
  }

  /**
   * Process a chunk of claims. Returns true if it processes all the claims, false if it runs out of claims to process. It only
   * runs out of claims in the rare case that some other process or user interaction has added indicators and metrics to a claim
   * that didn't have them when we originally counted the number of claims to process. In this rare case the query will return
   * less claims than we are expecting so we have to finish early.
   */
  private function processChunk(chunkSize : int) : boolean {
    var chunkQuery = findClaims()
    chunkQuery.setPageSize(chunkSize)
    var count = 0
    for (claim in Iterables.limit(chunkQuery, chunkSize)) {
      processClaim(claim)
      count = count + 1
    }
    var entireChunkProcessed = count == chunkSize
    return entireChunkProcessed
  }

  private function findClaims() : IQueryBeanResult<Claim> {
    final var lossDateThreshold = Date.CurrentDate.addYears(CCConfigParameters.ClaimHealthCalcMaxLossDateInYears.Value * -1)
    var query = Query.make(Claim)
    query.compareNotIn("State", {ClaimState.TC_DRAFT, ClaimState.TC_ARCHIVED})
    query.compare("LossDate", LessThanOrEquals, Date.CurrentDate)
    query.compare("LossDate", GreaterThanOrEquals, lossDateThreshold)
    query.compare("ClaimMetricRecalculationTime", Equals, null)
    var queryResult = query.select()
    queryResult.orderByDescending(QuerySelectColumns.path(Paths.make(Claim#LossDate)))
    return queryResult
  }

  private function processClaim(claim : Claim) {
    try {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        bundle.add(claim).scheduleHealthUpdate()
      })
    } catch (e : Exception) {
      PLLoggerCategory.SERVER_BATCHPROCESS.warn(DisplayKey.get("Web.InternalTools.BatchProcess.ClaimHealthCalculator.UpdateFailed", claim), e)
    }
  }
}

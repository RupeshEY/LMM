package gw.acc.iplm.services.financial

uses com.google.common.collect.ImmutableMap
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.api.financials.FinancialsCalculator
uses gw.api.locale.DisplayKey

uses java.math.RoundingMode

class FinancialAuthorisationService {

  private var LOGGER = ECFConstants.LOGGER_BLOCK()

  private final var calculators: ImmutableMap<AuthorityLimitType, FinancialsCalculator> = ImmutableMap.of(
      AuthorityLimitType.TC_CTR, FinancialsCalculations.TotalReserves,
      AuthorityLimitType.TC_CAR, FinancialsCalculations.AvailableReserves
  )

  private var _msgSum: CurrencyAmount

  /**
   * Processes Financial Authorisation for an ECF Claim Response message.
   * The User is the user sending this Claim Response message.
   * Authorisation is confirmed through the user's Authority Limits.
   *
   * @param msg The Claim Response message the user is trying to send
   * @return a boolean if the user is authorised for this message or not
   */
  public function isMessageAuthorised(msg: ECFMessageClaimResponseRq_Ext): boolean {
    var user = User.util.CurrentUser
    var limits = user.AuthorityLimits
    var limitExceeded = false
    var issues = new StringBuilder()

    for (limit in limits.where(\limit ->
        calculators.Keys.contains(limit.LimitType)
            and (limit.CoverageType == CoverageType.TC_IPLM_EXT or limit.CoverageType == null))) {
      if (exceedsLimit(msg, limit)) {
        LOGGER.debug("Transaction amount of {} is not authorised for this user for Cost Type {}", _msgSum, limit.CostType)
        var issue = DisplayKey.get("AuthorityLimit." + limit.LimitType.Code, limit.LimitAmount.DisplayValue)
        issues.append(issue)
        limitExceeded = true
      }
    }
    msg.ApprovalIssue = issues.toString()
    return not limitExceeded
  }

  /**
   * Check if the total amounts on the ECF Transaction for this message, plus the applicable Reserves on the Claim,
   * exceed the amount specified by the given Authority Limit
   * - Claim Reserves are filtered by the type in limit.LimitType
   * - Claim Reserves are filtered by the type in limit.CostType
   * - msg amounts are converted to the currency in limit.Currency before calculation
   *
   * @param msg   the message the user is trying to send for this Transaction
   * @param limit the Authority limit to check the financials against
   * @return a true / false if the calculated financials for this message exceed the applicable limit amount
   */
  protected function exceedsLimit(msg: ECFMessageClaimResponseRq_Ext, limit: AuthorityLimit): boolean {
    _msgSum = _msgSum?:msg.carrierShareOfTransactionFinancialsInCurrency(limit.Currency)
    if (_msgSum.Amount == 0) {
      return false
    }

    var claimSum = getClaimSum(msg.Claim, limit)
    var total = claimSum.add(_msgSum)
    LOGGER.debug("Attempting to agree a Transaction amount of {} to a Claim which already has reserves of {}. Total amount is {}. The Authority Limit is {}", {_msgSum, claimSum, total, limit.LimitAmount})
    return exceedsLimit(total, limit)
  }

  /**
   * Fetch the sum of Reserves on the Claim associated with msg
   *
   * @param claim The Claim to check the associated Claim Reserves on
   * @param limit The Authority Limit to use to filter the type of reserves to check
   * @return
   */
  protected function getClaimSum(claim: Claim, limit: AuthorityLimit): CurrencyAmount {
    var calculator = calculators.get(limit.LimitType)
    calculator?.withClaim(claim)?.withCostType(limit.CostType)?.withCoverageType(limit.CoverageType)?.noNulls()
    return calculator?.Amount?.convert(limit.Currency, RoundingMode.UP)?:new CurrencyAmount(0, limit.Currency)
  }

  /**
   * Determining whether a sum exceeds an authority limit amount
   *
   * @param sum   the sum
   * @param limit the authority limit
   * @return an boolean true if the sum exceeds the authority limit
   */
  protected function exceedsLimit(sum: CurrencyAmount, limit: AuthorityLimit): boolean {
    var limitAmount = limit.LimitAmount
    return sum.compareTo(limitAmount) > 0
  }
}
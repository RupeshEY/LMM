package gw.plugin.authoritylimits

uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
uses gw.pl.util.Assert
uses gw.pl.persistence.core.Key
uses gw.plugin.approval.ApprovalResult

uses java.util.ArrayList
uses java.util.HashMap
uses java.util.HashSet
uses java.util.Set
uses java.util.SortedSet
uses java.util.TreeSet

@Export
abstract class AuthorityLimitTester implements IAuthorityLimitTester {

  public static var AUTHORITY_LIMIT_COMPARATOR: AuthorityLimitsConfiguration.AuthorityLimitComparator =
      new AuthorityLimitsConfiguration.AuthorityLimitComparator ()
  private final var _userID: Key
  private final var _transactionSet: TransactionSet

  protected construct(userID: Key, transactionSet: TransactionSet) {
    _userID = userID
    _transactionSet = transactionSet
  }

  /**
   * A TransactionSet requires approval if no limits apply or if any of the
   * limits that do apply are exceeded.
   */
  override function requiresApproval(): ApprovalResult {
    var limits = ApplicableLimits
    if (limits.isEmpty()) {
      return ApprovalResult.NO_AUTHORITY
    }

    var requiresApproval = false
    var messages = new ArrayList<String>()
    for (var limit in limits) {
      var limitType = limit.LimitType
      assert limitType != null: "LimitType cannot be null"
      var sum = AuthorityLimitsConfiguration.AuthoritySumByLimitTypeMap.get(limitType)
      assert sum != null: "Authority sum cannot be null"
      if (sum.exceedsLimit(_transactionSet, limit)) {
        requiresApproval = true
        messages.add(DisplayKey.get("AuthorityLimit." + limit.LimitType.Code).formatMessage(new Object[]{CurrencyUtil.renderAsCurrency(limit.LimitAmount)}))
      }
    }
    return requiresApproval ?
        new ApprovalResult(true, true, messages.toArray(new String[messages.size()])) :
        ApprovalResult.NO_APPROVAL_REQUIRED
  }

  override property get TransactionSet(): TransactionSet {
    return _transactionSet
  }

  /**
   * @return The transactions in the TransactionSet. For a CheckSet, this includes
   *         ONLY the payments that belong to the primary check of the CheckSet.
   *         This does NOT include transactions belonging to recurring checks.
   */
  override property get TransactionsInvolved(): Transaction[] {
    return TransactionSet.Transactions
  }

  /**
   * @return All the limits assigned to the user that apply to the
   *         transactions in the TransactionSet
   */
  private property get ApplicableLimits(): Set<AuthorityLimit> {
    var numLimits = 0

    var user = TransactionSet.Bundle.loadBean(_userID) as entity.User
    var limits = user.AuthorityLimits
    var limitsByType = new HashMap<AuthorityLimitType, SortedSet<AuthorityLimit>>()
    for (var limit in limits) {
      if (limitTypeApplies(limit.LimitType)) {
        var theSet = limitsByType.get(limit.LimitType)
        if (theSet == null) {
          theSet = new TreeSet<AuthorityLimit>(AUTHORITY_LIMIT_COMPARATOR)
          limitsByType.put(limit.LimitType, theSet)
        }
        //    See comments in AuthorityLimit.etx before uncommenting this code.
        //if (limit.Claim.ID == null || TransactionSet.Claim.ID == limit.Claim.ID) {
          theSet.add(limit)
        //}
        numLimits += 1
      }
    }

    var applicableLimits = new HashSet<AuthorityLimit>(numLimits)
    for (var transaction in TransactionsInvolved) {
      var limitFound = false
      for (var limitType in limitsByType.keySet()) {
        for (var limit in limitsByType.get(limitType)) {
          if (AuthorityLimitsConfiguration.limitApplies(limit, transaction)) {
            limitFound = true
            applicableLimits.add(limit)
            break
          }
        }
      }
      if (!limitFound) {
        return new HashSet<AuthorityLimit>()
      }
    }
    return applicableLimits
  }

  static function newLimitTester(userID: Key, transactionSet: TransactionSet): IAuthorityLimitTester {
    if (transactionSet typeis ReserveSet) {
      return new ReserveLimitTester(userID, transactionSet)
    } else if (transactionSet typeis CheckSet) {
      var checkSet = transactionSet
      var check = checkSet.PrimaryCheck
      if (PaymentMethod.TC_MANUAL == check.PaymentMethod) {
        return new ManualPaymentLimitTester(userID, checkSet)
      } else {
        return new PaymentLimitTester(userID, checkSet)
      }
    } else if (transactionSet typeis RecoverySet) {
      return new RecoveryLimitTester(userID, transactionSet)
    } else if (transactionSet typeis RecoveryReserveSet) {
      return new RecoveryReserveLimitTester(userID, transactionSet)
    } else {
      Assert.check("Unrecognized transaction set type")
      return null
    }
  }

  override function limitTypeApplies(type: AuthorityLimitType): boolean {
    return false
  }
}

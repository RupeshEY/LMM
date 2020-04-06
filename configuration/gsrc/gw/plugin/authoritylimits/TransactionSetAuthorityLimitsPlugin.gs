package gw.plugin.authoritylimits

uses gw.api.system.CCConfigParameters
uses gw.plugin.approval.ApprovalResult

@Export
public class TransactionSetAuthorityLimitsPlugin implements ITransactionSetAuthorityLimitsPlugin {

  private function newLimitTester(user: User, transactionSet: TransactionSet): IAuthorityLimitTester {
    return AuthorityLimitTester.newLimitTester(user.ID, transactionSet)
  }

  override function requiresApproval(user: User, transactionSet: entity.TransactionSet): ApprovalResult {
    return newLimitTester(user, transactionSet).requiresApproval()
  }

  override function hasPaymentAuthority(user: User): boolean {
    if (!CCConfigParameters.CheckAuthorityLimits.Value) {
      return true
    }

    var profile = user.AuthorityProfile
    if (profile == null) {
      return false
    }

    var limits = profile.Limits
    if (limits == null || limits.length == 0) {
      return false
    }

    var allowPaymentExceedReserves = CCConfigParameters.AllowPaymentsExceedReservesLimits.Value

    for (var limit in limits) {
      var limitType = limit.LimitType
      if (!AuthorityLimitsConfiguration.isPaymentLimitType(limitType)) {
        continue
      }

      if (limitType != AuthorityLimitType.TC_PER) {
        return true
      }

      if (allowPaymentExceedReserves) {
        return true
      }
    }

    return false
  }

  override function hasReserveAuthority(user: User): boolean {
    if (!CCConfigParameters.CheckAuthorityLimits.Value) {
      return true
    }

    var profile = user.AuthorityProfile
    if (profile == null) {
      return false
    }

    var limits = profile.Limits
    if (limits == null || limits.length == 0) {
      return false
    }

    for (var limit in limits) {
      var limitType = limit.LimitType
      if (AuthorityLimitsConfiguration.isReserveLimitType(limitType)) {
        return true
      }
    }

    return false
  }
}
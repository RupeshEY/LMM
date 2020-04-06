package gw.plugin.authoritylimits

uses gw.plugin.approval.ApprovalResult
uses gw.pl.persistence.core.Key

@Export
class RecoveryReserveLimitTester extends AuthorityLimitTester {

  construct(userID: Key, recoveryReserveSet: RecoveryReserveSet) {
    super(userID, recoveryReserveSet)
  }

  override function requiresApproval(): ApprovalResult {
    return ApprovalResult.NO_APPROVAL_REQUIRED
  }

  override function limitTypeApplies(type: AuthorityLimitType): boolean {
    return AuthorityLimitsConfiguration.isRecoveryReserveLimitType(type)
  }
}
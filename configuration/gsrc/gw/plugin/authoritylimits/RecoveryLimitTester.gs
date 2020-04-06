package gw.plugin.authoritylimits

uses gw.plugin.approval.ApprovalResult
uses gw.pl.persistence.core.Key

@Export
class RecoveryLimitTester extends AuthorityLimitTester {

  construct(userID: Key, recoverySet: RecoverySet) {
    super(userID, recoverySet)
  }

  override function requiresApproval(): ApprovalResult {
    return ApprovalResult.NO_APPROVAL_REQUIRED
  }

  override function limitTypeApplies(type: AuthorityLimitType): boolean {
    return AuthorityLimitsConfiguration.isRecoveryLimitType(type)
  }
}
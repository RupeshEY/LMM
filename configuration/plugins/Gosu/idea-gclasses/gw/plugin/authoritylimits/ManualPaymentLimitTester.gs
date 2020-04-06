package gw.plugin.authoritylimits

uses gw.plugin.approval.ApprovalResult
uses gw.pl.persistence.core.Key

@Export
class ManualPaymentLimitTester extends AuthorityLimitTester {

  construct(userID: Key, checkSet: CheckSet) {
    super(userID, checkSet)
  }

  override function requiresApproval(): ApprovalResult {
    return ApprovalResult.NO_APPROVAL_REQUIRED
  }

  override property get TransactionsInvolved(): entity.Transaction[] {
    return (TransactionSet as CheckSet).PrimaryCheck.Payments
  }
}

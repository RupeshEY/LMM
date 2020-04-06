package gw.plugin.authoritylimits

uses gw.api.system.CCConfigParameters
uses gw.pl.persistence.core.Key

@Export
class PaymentLimitTester extends AuthorityLimitTester {

  construct(userID: Key, checkSet: CheckSet) {
    super(userID, checkSet)
  }

  override property get TransactionsInvolved(): Transaction[] {
    return (TransactionSet as CheckSet).PrimaryCheck.Payments
  }

  override function limitTypeApplies(type: AuthorityLimitType): boolean {
    if (!AuthorityLimitsConfiguration.isPaymentLimitType(type)) {
      return false
    }

    // If the limit type is AuthorityLimitType.TC_PAYMENTS_EXCEED_RESERVES
    // then the AllowPaymentsExceedReservesLimits parameter must also be true.
    if (type != AuthorityLimitType.TC_PER) {
      return true
    }

    return CCConfigParameters.AllowPaymentsExceedReservesLimits.Value
  }
}

package gw.plugin.authoritylimits

uses gw.pl.persistence.core.Key

@Export
class ReserveLimitTester extends AuthorityLimitTester {

  public construct(userID: Key, reserveSet: ReserveSet) {
    super(userID, reserveSet)
  }

  override function limitTypeApplies(type: AuthorityLimitType): boolean {
    return AuthorityLimitsConfiguration.isReserveLimitType(type)
  }
}

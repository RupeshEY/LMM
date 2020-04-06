package gw.acc.iplm.testutils

uses gw.api.databuilder.AuthorityLimitBuilder
uses gw.api.databuilder.AuthorityLimitProfileBuilder
uses gw.api.financials.CurrencyAmount

class LMMUserUtil {

  public static function setUpUserForReserves() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var user = bundle.add(User.util.UnrestrictedUser)

      var limit = new AuthorityLimitBuilder()
          .withLimitAmount(new CurrencyAmount(20000000, Currency.TC_EUR))
          .withLimitType(AuthorityLimitType.TC_CTR)
          .onNewProfile()
          .create()

      var authProfile = new AuthorityLimitProfileBuilder()
          .withLimit(limit)
          .withCurrency(Currency.TC_EUR)
          .create()

      user.setAuthorityProfile(authProfile)
    }, User.util.UnrestrictedUser)
  }

}
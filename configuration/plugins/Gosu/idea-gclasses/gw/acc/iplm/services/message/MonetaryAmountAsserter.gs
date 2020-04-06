package gw.acc.iplm.services.message

uses gw.pl.currency.MonetaryAmount
uses junit.framework.TestCase

class MonetaryAmountAsserter {

  public static final var DELTA: double = 001d

  public static function checkMonetaryAmount(final expectedAmt: double, final mamt: MonetaryAmount,
                                             final expectedCcy: typekey.Currency) {
    TestCase.assertEquals(expectedAmt, mamt.Amount.doubleValue(), DELTA)
    TestCase.assertEquals(expectedCcy, mamt.Currency)
  }
}
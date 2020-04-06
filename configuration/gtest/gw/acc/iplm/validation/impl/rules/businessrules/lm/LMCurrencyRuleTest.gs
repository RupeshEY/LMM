package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMCurrencyRuleTest extends GUnitTestClass {

  private var _validation : LMCurrencyRule

  override function beforeMethod() {
    super.beforeMethod()
    _validation = new LMCurrencyRule()
  }

  function testValidMessage() {
    var message = createMessage(Currency.TC_EUR, Currency.TC_GBP)

    // If this is a valid message, this message should run without throwing an exception
    _validation.validate(message)
  }

  function testMessageWithInvalidOriginalCurrency(): void {
    var message = createMessage(null, Currency.TC_GBP)
    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.UNKNOWN_ORIGINAL_CURRENCY)
  }

  function testMessageWithInvalidSettlementCurrency(): void {
    var message = createMessage(Currency.TC_EUR, null)
    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.UNKNOWN_SETTLEMENT_CURRENCY)
  }

  private function createMessage(originalCurrency: Currency, settlementCurrency: Currency): LMMessageLloydsSCM_Ext {
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    Mockito.when(message.OriginalCurrency).thenReturn(originalCurrency)
    Mockito.when(message.SettlementCurrency).thenReturn(settlementCurrency)

    return message
  }
}
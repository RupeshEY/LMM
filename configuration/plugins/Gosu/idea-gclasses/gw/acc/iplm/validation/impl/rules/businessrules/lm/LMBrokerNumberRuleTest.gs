package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMBrokerNumberRuleTest extends GUnitTestClass {

  final var LLOYDS_COMPANY_BUREAU = "lloyds"
  final var LLOYDS_COMPANY_ID = "2623"
  final var LIRMA_COMPANY_BUREAU = "lirma"
  final var LIRMA_COMPANY_ID = "C1104"

  private var _validation : LMBrokerNumberRule

  override function beforeMethod() {
    super.beforeMethod()
    _validation = new LMBrokerNumberRule()
  }

  function testValidMessage() {
    var message = createMessage(LLOYDS_COMPANY_BUREAU, LLOYDS_COMPANY_ID)

    _validation.validate(message)
  }

  function testLirmaBureau() {
    var message = createMessage(LIRMA_COMPANY_BUREAU, LIRMA_COMPANY_ID)

    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
  }

  function testNoBureau() {
    var message = createMessage(null, LLOYDS_COMPANY_ID)

    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
  }

  function testBlankBureau() {
    var message = createMessage("   ", LLOYDS_COMPANY_ID)

    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
  }

  function testNoID() {
    var message = createMessage(LLOYDS_COMPANY_BUREAU, null)

    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
  }

  function testBlankID() {
    var message = createMessage(LLOYDS_COMPANY_BUREAU, "   ")

    AssertUtils.assertCausesLMExceptionWithType(\-> _validation.validate(message), LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
  }

  private function createMessage(bureau: String, id: String): LMMessageLloydsSCM_Ext {
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(contactData.BrokerPartyId).thenReturn(id)
    Mockito.when(contactData.BrokerPartyAgency).thenReturn(bureau)

    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)

    return message
  }
}
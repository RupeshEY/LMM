package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.testutils.AssertUtils
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFInsurerDetailsRuleTest extends GUnitTestClass {

  private var _rule = new ECFInsurerDetailsRule()
  private var _message: ECFMessageClaimNotifyRq_Ext
  private var _partyId = "urn:ilu:402801"
  private var _partyName = "Zurich 402801"
  private var _bureau = ECFBureauType_Ext.TC_ILU

  override function beforeMethod(){
    super.beforeMethod()
    _message = mockECFClaimNotifyMessage()
  }

  public function testValidInsurerDetails_IdMatch() {
    try {
      _rule.validate(_message)
    } catch (e: IllegalArgumentException) {
      fail("The XML had a valid ActionParticipant, but still failed validation rule")
    }
  }

  public function testInvalidInsurerDetails_IdNull() {
    Mockito.when(_message.ECFContractMarkets[0].PartyID).thenReturn(null)
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }

  public function testInvalidInsurerDetails_BureauNull() {
    Mockito.when(_message.ECFContractMarkets[0].Bureau).thenReturn(null)
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }

  public function testInvalidInsurerDetails_IdNotMatch() {
    Mockito.when(_message.ECFContractMarkets[0].PartyID).thenReturn("ImDifferent")
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }

  public function testInvalidInsurerDetails_BureauNotMatch() {
    Mockito.when(_message.ECFContractMarkets[0].Bureau).thenReturn(ECFBureauType_Ext.TC_LIRMA)
    assertCausesException(\-> {
      _rule.validate(_message)
    }, ECFException)
  }

  public function testInvalidRetrieveMessage() {
    var message = mockECFClaimRetrieveMessage()
    Mockito.when(message.ECFContractMarkets[0].PartyID).thenReturn(null)

    AssertUtils.assertCausesECFExceptionWithType(\-> _rule.validate(message), CLAIM_NOTIFY_INSURER_DETAILS_NOT_FOUND_ERROR)
  }

  private function mockECFClaimNotifyMessage(): ECFMessageClaimNotifyRq_Ext {
    var message = Mockito.mock(ECFMessageClaimNotifyRq_Ext)

    var contractMarket1 = Mockito.mock(ECFContractMarket_Ext)
    Mockito.when(contractMarket1.PartyID).thenReturn(_partyId)
    Mockito.when(contractMarket1.PartyName).thenReturn(_partyName)
    Mockito.when(contractMarket1.Bureau).thenReturn(_bureau)

    Mockito.when(message.ReceiverPartyName).thenReturn(_partyName)
    Mockito.when(message.ReceiverPartyId).thenReturn(_partyId)
    Mockito.when(message.ReceiverPartyAgency).thenReturn(_bureau.Code)
    Mockito.when(message.ECFContractMarkets).thenReturn({ contractMarket1 })

    return message
  }

  private function mockECFClaimRetrieveMessage(): ECFMessageClaimRetrieveRs_Ext {
    var message = Mockito.mock(ECFMessageClaimRetrieveRs_Ext)

    var contractMarket1 = Mockito.mock(ECFContractMarket_Ext)
    Mockito.when(contractMarket1.PartyID).thenReturn(_partyId)
    Mockito.when(contractMarket1.PartyName).thenReturn(_partyName)
    Mockito.when(contractMarket1.Bureau).thenReturn(_bureau)

    Mockito.when(message.ReceiverPartyName).thenReturn(_partyName)
    Mockito.when(message.ReceiverPartyId).thenReturn(_partyId)
    Mockito.when(message.ReceiverPartyAgency).thenReturn(_bureau.Code)
    Mockito.when(message.ECFContractMarkets).thenReturn({ contractMarket1 })

    return message
  }
}
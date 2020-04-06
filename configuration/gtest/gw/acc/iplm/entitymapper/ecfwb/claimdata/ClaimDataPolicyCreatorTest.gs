package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.services.message.MonetaryAmountAsserter
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimDataPolicyCreatorTest extends GUnitTestClass {

  public static final var DELTA: double = 001d
  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqWithDocuments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
        assertEquals("xxxxxx", ecfMessage.Insured)
        assertEquals("OP", ecfMessage.Policyholder)
        assertEquals("B0001OCT28SP2FOF", ecfMessage.UMR)
        assertEquals("54-123456", ecfMessage.PolicyNumber)
        assertEquals("10-123456", ecfMessage.RiskReference)
        assertEquals("abc", ecfMessage.BrokerReference)
        assertEquals("TEST", ecfMessage.RiskDescription)
        assertEquals("TEST", ecfMessage.RiskLocation)
        assertEquals("testing stuff", ecfMessage.PolicyType)
        assertEquals("surplus", ecfMessage.CoverType)
        assertEquals(ECFRiskCode_Ext.TC_XT, ecfMessage.RiskCode)
        assertEquals(ECFBureauType_Ext.TC_LLOYDS, ecfMessage.BureauType)
        assertEquals("GW0001", ecfMessage.BrokerId)
        assertEquals("TEST BROKER 0001", ecfMessage.BrokerName)
        assertEquals("xxxxx", ecfMessage.BrokerContact)
        assertEquals("1234", ecfMessage.BrokerPhone)
        assertEquals("abc@edf.com", ecfMessage.BrokerEmail)
        assertEquals("N", ecfMessage.CoLeadIndicator)
        assertEquals("Beazley 0623", ecfMessage.LeadName)

        assertEquals(4, ecfMessage.Carriers.length)
        final var carrierBeazley = ecfMessage.Carriers.firstWhere(\crr -> crr.Name == "Beazley 0623")
        assertEquals("PxxxNxxx", carrierBeazley.Contact)
        assertEquals("Lloyd's", carrierBeazley.Market)
        assertEquals("xx@xx.xx", carrierBeazley.Email)
        assertEquals("123456", carrierBeazley.Phone)
        assertEquals(50.0000000d, carrierBeazley.Share.doubleValue(), DELTA)
        assertEquals("REFERENCE 01", carrierBeazley.Reference1)
        assertEquals("REFERENCE 02", carrierBeazley.Reference2)
        assertEquals(ECFParticipantFunction_Ext.TC_LEAD, carrierBeazley.Role)
        assertEquals("1010E", carrierBeazley.Code)
        assertEquals("6", carrierBeazley.Consortium)
        assertEquals(1d, carrierBeazley.ClaimLineNumber.doubleValue())
        final var carrierAgreementParty = ecfMessage.Carriers.firstWhere(\crr -> crr.Name == "Chubb C1104")
        assertEquals(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY, carrierAgreementParty.Role)

        final var marketFinancialAmt = carrierBeazley.MarketFinancialAmounts[0]
        MonetaryAmountAsserter.checkMonetaryAmount(1234567980123.12d, marketFinancialAmt.CashSettlementAmount, Currency.TC_GBP)
        MonetaryAmountAsserter.checkMonetaryAmount(55.01d, marketFinancialAmt.LetterOfCreditAmount, Currency.TC_GBP)
      })
    })
  }
}
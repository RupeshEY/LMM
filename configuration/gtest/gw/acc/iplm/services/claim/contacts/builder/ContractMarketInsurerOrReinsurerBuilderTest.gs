package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ECFContactFactory
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Id
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.testharness.v3.GUnitTestClass
uses gw.transaction.Transaction

class ContractMarketInsurerOrReinsurerBuilderTest extends GUnitTestClass {

  private var _agency = "lloyds"
  private var _carrierId = "urn:lloyds:0623"
  private var _carrierName = "Beazley 0623"
  private var _nonCarrierId = "iortest"
  private var _nonCarrierName = "noncarrier"
  private var _role = ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT

  public function testCreateContactsAddsNonCarrierAndSkipsCarrier() {
    var claim = ClaimBuilderHelper.createClaim()

    var claimNotify = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotify.ClaimMovement.Extension.Contract.ContractMarket = new ArrayList<ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket>()

    var contractMarket = new ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket()
    contractMarket.Agency = _agency
    contractMarket.InsurerOrReinsurer = new ArrayList<ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer>()

    var carrier = new ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer()
    carrier.Party = new Party()
    carrier.Party.Id_elem = new ArrayList<Id>()
    var carrierIdElem = new Id(_carrierId)
    carrierIdElem.Agency = _agency
    carrier.Party.Id_elem.add(carrierIdElem)
    carrier.Party.Name = _carrierName
    carrier.ParticipantFunction = "Lead"

    var noncarrier = new ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer()
    noncarrier.Party = new Party()
    noncarrier.Party.Id_elem = new ArrayList<Id>()
    var noncarrierIdElem = new Id(_nonCarrierId)
    noncarrierIdElem.Agency = _agency
    noncarrier.Party.Id_elem.add(noncarrierIdElem)
    noncarrier.Party.Name = _nonCarrierName
    noncarrier.ParticipantFunction = "Agreement Party"

    contractMarket.InsurerOrReinsurer.add(carrier)
    contractMarket.InsurerOrReinsurer.add(noncarrier)
    claimNotify.ClaimMovement.Extension.Contract.ContractMarket.add(contractMarket)
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)
    var result: List<ClaimContact>
    Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      result = ECFContactFactory.createContacts(_role, claim, ecfMessage)
    }, User.util.UnrestrictedUser)
    assertEquals(1, result.size())
    assertEquals(_nonCarrierName, result.first().DisplayName)
    assertEquals(_nonCarrierId, result.first().Contact.LMContactID_Ext)
  }

}
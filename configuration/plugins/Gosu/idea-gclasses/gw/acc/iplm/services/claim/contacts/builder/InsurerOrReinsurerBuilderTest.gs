package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses gw.acc.iplm.services.claim.contacts.mapper.ECFContactDetailsMapper
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Id
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Reinsurer
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class InsurerOrReinsurerBuilderTest extends GUnitTestClass {

  private static var _insurerOrReinsurerBuilder: InsurerOrReinsurerBuilder
  private static var _agency = "lloyds"
  private static var _carrierId = "urn:lloyds:0623"
  private static var _carrierName = "Beazley 0623"
  private static var _nonCarrierId = "iortest"
  private static var _nonCarrierName = "noncarrier"
  private var _contactDetailsDto: List<ContactDetailsDTO>

  override function beforeMethod() {
    _insurerOrReinsurerBuilder = new InsurerOrReinsurerBuilder()
    _contactDetailsDto = new ArrayList<ContactDetailsDTO>()
  }

  public function testCreateContactsAddsNonCarrierInsurer() {
    var role = ContactRole.TC_ECFINSURER_EXT
    var claim = ClaimBuilderHelper.createClaim()

    var noncarrierParty = new Party()
    noncarrierParty.Name = _nonCarrierName
    var noncarrierIdElem = new Id(_nonCarrierId)
    noncarrierIdElem.Agency = _agency
    noncarrierParty.Id_elem.add(noncarrierIdElem)

    var claimNotify = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotify.ClaimMovement.Reinsurer = null
    claimNotify.ClaimMovement.Insurer = new Insurer()
    claimNotify.ClaimMovement.Insurer.Party = noncarrierParty
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)

    var result: List<ClaimContact>
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        _contactDetailsDto.add(ECFContactDetailsMapper.createInsurerOrReinsurerContactDetails(ecfMessage))
        result = _insurerOrReinsurerBuilder.createNewClaimContacts(role, claim, _contactDetailsDto)
      })
    })

    assertEquals(1, result.size())
    assertEquals(_nonCarrierName, result.first().DisplayName)
    assertEquals(_nonCarrierId, result.first().Contact.LMContactID_Ext)
  }

  public function testCreateContactsSkipsCarrierInsurer() {
    var role = ContactRole.TC_ECFINSURER_EXT
    var claim = ClaimBuilderHelper.createClaim()

    var carrierParty = new Party()
    carrierParty.Name = _carrierName
    var carrierIdElem = new Id(_carrierId)
    carrierIdElem.Agency = _agency
    carrierParty.Id_elem.add(carrierIdElem)

    var claimNotify = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotify.ClaimMovement.Reinsurer = null
    claimNotify.ClaimMovement.Insurer = new Insurer()
    claimNotify.ClaimMovement.Insurer.Party = carrierParty
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)

    var result: List<ClaimContact>
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _contactDetailsDto.add(ECFContactDetailsMapper.createInsurerOrReinsurerContactDetails(ecfMessage))
        result = _insurerOrReinsurerBuilder.createNewClaimContacts(role, claim, _contactDetailsDto)
      })
    })

    assertTrue(result.Empty)
  }

  public function testCreateContactsAddsNoncarrierReinsurer() {
    var role = ContactRole.TC_ECFREINSURER_EXT
    var claim = ClaimBuilderHelper.createClaim()

    var noncarrierParty = new Party()
    noncarrierParty.Name = _nonCarrierName
    var noncarrierIdElem = new Id(_nonCarrierId)
    noncarrierIdElem.Agency = _agency
    noncarrierParty.Id_elem.add(noncarrierIdElem)

    var claimNotify = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotify.ClaimMovement.Insurer = null
    claimNotify.ClaimMovement.Reinsurer = new Reinsurer()
    claimNotify.ClaimMovement.Reinsurer.Party = noncarrierParty
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)
    var result: List<ClaimContact>
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        claim = bundle.add(claim)
        _contactDetailsDto.add(ECFContactDetailsMapper.createInsurerOrReinsurerContactDetails(ecfMessage))
        result = _insurerOrReinsurerBuilder.createNewClaimContacts(role, claim, _contactDetailsDto)
      })
    })

    assertEquals(1, result.size())
    assertEquals(_nonCarrierName, result.first().DisplayName)
    assertEquals(_nonCarrierId, result.first().Contact.LMContactID_Ext)
  }

  public function testCreateContactsSkipsCarrierReinsurer() {
    var role = ContactRole.TC_ECFREINSURER_EXT
    var claim = ClaimBuilderHelper.createClaim()

    var carrierParty = new Party()
    carrierParty.Name = _carrierName
    var carrierIdElem = new Id(_carrierId)
    carrierIdElem.Agency = _agency
    carrierParty.Id_elem.add(carrierIdElem)

    var claimNotify = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotify.ClaimMovement.Insurer = null
    claimNotify.ClaimMovement.Reinsurer = new Reinsurer()
    claimNotify.ClaimMovement.Reinsurer.Party = carrierParty
    var ecfMessage = ECFMessageEntityUtil.createClaimNotifyRq(claimNotify)
    var result: List<ClaimContact>
    var bundle = TestDataUtil.createNonPersistentBundle()
    TestDataUtil.runWithExistingBundleNoCommit(bundle, \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        _contactDetailsDto.add(ECFContactDetailsMapper.createInsurerOrReinsurerContactDetails(ecfMessage))
        result = _insurerOrReinsurerBuilder.createNewClaimContacts(role, claim, _contactDetailsDto)
      })
    })

    assertTrue(result.Empty)
  }

}
package gw.acc.iplm.utils

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.testharness.v3.GUnitTestClass


class ECFUtilsTest extends GUnitTestClass {

  function testFindClaimByMessageUUID() {
    var newClaim = ClaimBuilderHelper.createClaim()
    var sampleDocSearchRq = ECFMessageUtil.createNewDocumentSearchRq()
    var dsRqMsg = ECFMessageEntityUtil.createDocumentSearchRq(sampleDocSearchRq)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      dsRqMsg = bundle.add(dsRqMsg)
      newClaim = bundle.add(newClaim)
      dsRqMsg.Claim = newClaim
    }, User.util.UnrestrictedUser)
    var foundClaim = ECFUtils.findClaimByMessageUUID(dsRqMsg.UUID)
    assertNotNull("Claim should not be null", foundClaim)
  }


  public function testStripPrefixesFromID() {
    var sampleID = "urn:lloyds:1234"
    var strippedID = "1234"

    var result = ECFUtils.stripPrefixesFromID(sampleID)
    assertEquals(strippedID, result)
  }

  public function testStripPrefixesFromID_SmallID() {
    var sampleID = ":1234"
    var strippedID = "1234"

    var result = ECFUtils.stripPrefixesFromID(sampleID)
    assertEquals(strippedID, result)
  }

  public function testStripPrefixesFromID_NoPrefix() {
    var sampleID = "1234"
    var strippedID = "1234"

    var result = ECFUtils.stripPrefixesFromID(sampleID)
    assertEquals(strippedID, result)
  }

  public function testStripPrefixesFromID_NullID() {
    var sampleID: String = null

    assertCausesException(\-> {
      ECFUtils.stripPrefixesFromID(sampleID)
    }, NullPointerException)
  }

  public function testStripPrefixesFromID_BlankID() {
    var sampleID = ""
    var strippedID = ""

    var result = ECFUtils.stripPrefixesFromID(sampleID)
    assertEquals(strippedID, result)
  }

  public function testBuildLongPartyID_Lloyds() {
    final var bureau = "lloyds"
    final var id = "2623"
    final var expectedID = "urn:lloyds:2623"

    assertEquals(expectedID, ECFUtils.buildLongPartyID(bureau, id))
  }

  public function testBuildLongPartyID_Lirma() {
    final var bureau = "lirma"
    final var id = "C1104"
    final var expectedID = "urn:lirma:C1104"

    assertEquals(expectedID, ECFUtils.buildLongPartyID(bureau, id))
  }

  public function testBuildLongPartyID_Ilu() {
    final var bureau = "ilu"
    final var id = "402801"
    final var expectedID = "urn:ilu:402801"

    assertEquals(expectedID, ECFUtils.buildLongPartyID(bureau, id))
  }
  private function assertData(ecfMessage: ECFMessage_Ext, repositoryOperationRq: RepositoryOperationRq) {
    assertEquals("ClaimNotifyRq Sender must match repositoryOperationRq Receiver role", ECFMessageConstants.SERVICEPROVIDER_ROLE, repositoryOperationRq.Receiver.PartyRoleCd)
    assertEquals("ClaimNotifyRq Receiver must match repositoryOperationRq Sender role", ecfMessage.ReceiverPartyRoleCd.capitalize(), repositoryOperationRq.Sender.PartyRoleCd)
    assertEquals("ClaimNotifyRq Insurer Party Id must match repositoryOperationRq Sender Party Id", ecfMessage.ReceiverPartyId, repositoryOperationRq.Sender.PartyId)
    assertEquals("ClaimNotifyRq Insurer Party Name must match repositoryOperationRq Sender Party Name", ecfMessage.ReceiverPartyName, repositoryOperationRq.Sender.PartyName)
    assertEquals("ClaimNotifyRq ServiceProvider Party Id must match repositoryOperationRq Receiver Party Id", ecfMessage.SenderPartyId, repositoryOperationRq.Receiver.PartyId)
    assertEquals("ClaimNotifyRq ServiceProvider Party Name must match repositoryOperationRq Receiver Party Name", ecfMessage.SenderPartyName, repositoryOperationRq.Receiver.PartyName)
  }
}
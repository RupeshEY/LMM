package gw.acc.iplm.entitymapper.ecfwb.claimresponse

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class ClaimResponseRsEntityMapperTest extends GUnitTestClass {
  private var _claimResponseRs: ECFMessageClaimResponseRs_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _claimResponseRs = getClaimResponseRs()
  }

  private function getClaimResponseRs(): ECFMessageClaimResponseRs_Ext {
    var responseRsEntity: ECFMessage_Ext
    var ecfMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT, ECFMessageUtil.createNewClaimResponseRs(), null)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      responseRsEntity = new ClaimResponseRsEntityMapper().createNewLMMessage(ecfMessageDTO)
      responseRsEntity.Content = new Blob("tempContent".Bytes)
    }, ECFConstants.ECF_SUPER_USER)

    return responseRsEntity as ECFMessageClaimResponseRs_Ext
  }

  public function testCorrectMessageType() {
    assertNotNull(_claimResponseRs)
  }

  public function testIncorrectMessageType() {
    assertFalse(new ClaimResponseRsEntityMapper().isCorrectMessageType(ECFMessageUtil.createNewClaimResponseRq()))
  }

  public function testMandatoryFieldsAreNotNull() {
    assertNotNull(_claimResponseRs.Content)
    assertNotNull(_claimResponseRs.UUID)
    assertNotNull(_claimResponseRs.ReferredMessageUUId)
    assertNotNull(_claimResponseRs.OriginTimeStamp)
  }

  public function testMessageTypeIsCorrect() {
    assertEquals(ECFMessageType_Ext.TC_CLAIMRESPOND, _claimResponseRs.MessageType)
  }

  public function testMapSenderData() {
    assertEquals("urn:duns:236196817", _claimResponseRs.SenderPartyId)
    assertEquals("Xchanging", _claimResponseRs.SenderPartyName)
    assertEquals("serviceprovider", _claimResponseRs.SenderPartyRoleCd)
    assertEquals("DUNS_dun_and_bradstreet", _claimResponseRs.SenderPartyAgency)
  }

  public function testMapReceiverData() {
    assertEquals("urn:lloyds:0623", _claimResponseRs.ReceiverPartyId)
    assertEquals("Beazley 0623", _claimResponseRs.ReceiverPartyName)
    assertEquals("insurer", _claimResponseRs.ReceiverPartyRoleCd)
    assertEquals("lloyds", _claimResponseRs.ReceiverPartyAgency)
  }

  public function testMapResponse() {
    assertEquals(ECFAcknowledgementStatus_Ext.TC_ACKNOWLEDGED, _claimResponseRs.ResponseAcknowledgement.AcknowledgementStatus)
    assertEquals("translation_validation", _claimResponseRs.ResponseAcknowledgement.AcknowledgementLevelIndicator)
    assertEquals("Request has been queued", _claimResponseRs.ResponseAcknowledgement.ResponseDescription)
    assertNull(_claimResponseRs.ResponseAcknowledgement.ErrorCode)
  }

  public function testErrorsWarnings() {
    assertTrue(_claimResponseRs.getErrorsOrWarnings().IsEmpty)
  }
}
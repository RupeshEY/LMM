package gw.acc.iplm.entitymapper.ecfwb.claimretrieve

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.testharness.v3.GUnitTestClass

class ClaimRetrieveRqEntityMapperTest extends GUnitTestClass {

  private static var _entity: ECFMessageClaimRetrieveRq_Ext
  private static var _entityWithClaim: ECFMessageClaimRetrieveRq_Ext
  private static var _claim: Claim

  override function beforeClass() {
    super.beforeClass()
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _entity = ClaimRetrieveRqEntityMapper.createClaimRetrieveRqEntity(null, bundle)

      _claim = ClaimBuilderHelper.createClaim(true)
      _entityWithClaim = ClaimRetrieveRqEntityMapper.createClaimRetrieveRqEntity(_claim, bundle)
    })
  }

  function testUUIDNotNull() {
    assertNotNull(_entity.UUID)
  }

  function testOriginTimestampNotNull() {
    assertNotNull(_entity.OriginTimeStamp)
  }

  function testUCR() {
    assertEquals(_claim.UCR_Ext, _entityWithClaim.UCR)
    assertNull(_entity.UCR)
  }

  function testUMR() {
    assertEquals(_claim.UMR_Ext, _entityWithClaim.UMR)
    assertNull(_entity.UMR)
  }

  function testClaim() {
    assertEquals(_claim, _entityWithClaim.Claim)
    assertNull(_entity.Claim)
  }

  function testSenderPartyRoleCd() {
    assertEquals(ECFMessageConstants.INSURER_ROLE, _entity.SenderPartyRoleCd)
  }

  function testReceiverPartyRoleCd() {
    assertEquals(ECFConstants.XCHANGING_ROLE, _entity.ReceiverPartyRoleCd)
  }

  function testReceiverPartyId() {
    assertEquals(ECFConstants.XCHANGING_ID, _entity.ReceiverPartyId)
  }

  function testReceiverPartyName() {
    assertEquals(ECFConstants.XCHANGING_NAME, _entity.ReceiverPartyName)
  }

  function testReceiverPartyAgency() {
    assertEquals(ECFConstants.XCHANGING_AGENCY, _entity.ReceiverPartyAgency)
  }

}
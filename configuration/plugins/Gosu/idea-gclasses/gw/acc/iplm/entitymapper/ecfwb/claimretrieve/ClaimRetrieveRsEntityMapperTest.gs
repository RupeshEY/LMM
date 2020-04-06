package gw.acc.iplm.entitymapper.ecfwb.claimretrieve

uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.testharness.v3.GUnitTestClass

class ClaimRetrieveRsEntityMapperTest extends GUnitTestClass {

  private var _entityMapperService = new EntityMapperService()

  private final var YES = ECFIndicatorEnum.Y.IntegrationCode
  private final var NO = ECFIndicatorEnum.N.IntegrationCode

  function testNewClaimRetrieveRsWithBrokerInformation() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      final var ecfMessage = getClaimRetrieveRs()
      assertEquals("urn:lloyds:0001", ecfMessage.BrokerId)
      assertEquals("G2 TEST 31AP", ecfMessage.BrokerName)
      assertEquals("XXXXX", ecfMessage.BrokerContact)
      assertEquals("123566", ecfMessage.BrokerPhone)
    })
  }

  function testNewClaimRetrieveRs() {
    var newMessage = getClaimRetrieveRs()
    assertEquals(ECFMessageClaimRetrieveRs_Ext.TYPE.Name, newMessage.Subtype.getEntityType().Name)
    assertNotNull("UUID should not be null", newMessage.UUID)
    assertNotNull("Content should not be null", newMessage.Content)
    assertNotNull("UCR should not be null", newMessage.UCR)
    assertNotNull("Status should not be null", newMessage.Status)
    assertNotNull("OriginTimeStamp should not be null", newMessage.OriginTimeStamp)
    assertNotNull("MessageType should not be null", newMessage.MessageType)
    assertNotNull("Suspended should not be null", newMessage.Suspended)
    assertNotNull("AsOfDate should not be null", newMessage.AsOfDate)
    assertNotNull("TransactionSequence should not be null", newMessage.TransactionSequence)
    assertNotNull("TransactionType should not be null", newMessage.TransactionType)
    assertNull(newMessage.AmendmentDetails)
    assertNull(newMessage.InsurerReference)
    assertNotNull("InsuredName should not be null", newMessage.InsuredName)
    assertNotNull("ECFContractMarkets should not be null", newMessage.ECFContractMarkets)
    assertNotNull("TransactionStatus should not be null", newMessage.TransactionStatus)
    assertNotNull("SenderPartyId should not be null", newMessage.SenderPartyId)
    assertNotNull("ClaimRetrieveReqReferredUUId should not be null", newMessage.ClaimRetrieveReqReferredUUId)
    assertNull(newMessage.InsuredId)
    assertNotNull("ClaimStatus should not be null", newMessage.ClaimStatus)
    assertEquals(4, newMessage.ECFContractMarkets.length)
    assertEquals(1, newMessage.Financials.length)
    assertEquals(4, newMessage.Carriers.length)
    assertEquals(1, newMessage.AggregateDetails.length)
    assertNotNull("InsurerSharePercentage should not be null", newMessage.InsurerSharePercentage)
    assertEquals("2010", newMessage.ClaimsScheme?.DisplayName)
    assertEquals(ECFClaimCategoryCode_Ext.TC_A, newMessage.CategoryCode)
    assertEquals(ECFClaimSubCatCode_Ext.TC_AB, newMessage.SubCategoryCode)
  }

  function testNewClaimNotifyRqComments() {
    var newMessage = getClaimRetrieveRs()
    assertEquals(1, newMessage.BrokerComments.length)
    assertEquals(1, newMessage.SlipLeadComments.length)
    assertEquals(2, newMessage.PublicComments.length)
    assertEquals(2, newMessage.PrivateComments.length)
    assertEquals(3, newMessage.CrossMarketPublicComments.length)
    assertEquals(1, newMessage.CrossMarketPrivateComments.length)
  }

  function testNewClaimNotifyRqLossDetails() {
    var newMessage = getClaimRetrieveRs()
    assertEquals("XXXXX", newMessage.LossLocation)
    assertNotNull("LossStartDate should not be null", newMessage.LossStartDate)
    assertNotNull("LossEndDate should not be null", newMessage.LossEndDate)
    assertNotNull("LossDetails should not be null", newMessage.LossDetails)
  }

  function testNewClaimNotifyRqSenderDetails() {
    var newMessage = getClaimRetrieveRs()
    assertNotNull("SenderPartyName should not be null", newMessage.SenderPartyName)
    assertNotNull("SenderPartyRoleCd should not be null", newMessage.SenderPartyRoleCd)
    assertNotNull("SenderPartyAgency should not be null", newMessage.SenderPartyAgency)
  }

  function testNewClaimNotifyRqReceiverDetails() {
    var newMessage = getClaimRetrieveRs()
    assertNotNull("ReceiverPartyId should not be null", newMessage.ReceiverPartyId)
    assertNotNull("ReceiverPartyName should not be null", newMessage.ReceiverPartyName)
    assertNotNull("ReceiverPartyRoleCd should not be null", newMessage.ReceiverPartyRoleCd)
    assertNotNull("ReceiverPartyAgency should not be null", newMessage.ReceiverPartyAgency)
  }

  function testNewClaimNotifyRqCrossMarketDetails() {
    var newMessage = getClaimRetrieveRs()
    var ecfContractMarket1 = newMessage.ECFContractMarkets.where(\elt ->
        elt.IsPrimaryRole == true)
    var ecfContractMarket2 = newMessage.ECFContractMarkets.where(\elt ->
        elt.IsPrimaryRole == false)
    assertEquals(1, ecfContractMarket1.length)
    assertEquals(3, ecfContractMarket2.length)
    var lloydsRole = newMessage.ECFContractMarkets.where(\elt -> elt.Bureau == ECFBureauType_Ext.TC_LLOYDS
        and elt.PartyID == "urn:lloyds:2032")
    lloydsRole.each(\elt -> {
      assertEquals("LLOYD'S 2032 SYND", elt.PartyName)
      assertEquals(ECFBureauType_Ext.TC_LLOYDS, elt.Bureau)
      assertEquals(ECFParticipantFunction_Ext.TC_LEAD, elt.ParticipantFunction)
    })
  }

  function testNewClaimNotifyRqWithBrokerInformation() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
      final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
      assertEquals("GW0001", ecfMessage.BrokerId)
      assertEquals("TEST BROKER 0001", ecfMessage.BrokerName)
      assertEquals("xxxxx", ecfMessage.BrokerContact)
      assertEquals("1234", ecfMessage.BrokerPhone)
    })
  }

  function testConfictOfInterestInd() {
    var ecfMessage = getClaimRetrieveRs()
    assertTrue(ecfMessage.ConflictOfInterestInd)
  }

  function testSimultaneousReinstatementReqBoolean() {
    var ecfMessage = getClaimRetrieveRs()
    assertTrue(ecfMessage.SimultaneousReinstatementReqBoolean)
  }

  function testChaseUpIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(YES, ecfMessage.ChaseUpIndicator)
  }

  function testChaseUpIndicatorInterval() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(21, ecfMessage.ChaseUpIndicatorInterval)
  }

  function testCedantInLiquidationIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(NO, ecfMessage.CedantInLiquidationIndicator)
  }

  function testSimultaneousReinstatementReq() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(YES, ecfMessage.SimultaneousReinstatementReq)
  }

  function testSimultaneousReinstatementProcd() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(YES, ecfMessage.SimultaneousReinstatementProcd)
  }

  function testXcsToAgreeIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(NO, ecfMessage.XcsToAgreeIndicator)
  }

  function testContractualConditionsIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(YES, ecfMessage.ContractualConditionsIndicator)
  }

  function testImmediatePartCollectionInd() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(NO, ecfMessage.ImmediatePartCollectionInd)
  }

  function testNoFurtherResponseIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(NO, ecfMessage.NoFurtherResponseIndicator)
  }

  function testMultipleResponseIndicator() {
    var ecfMessage = getClaimRetrieveRs()
    assertEquals(YES, ecfMessage.MultipleResponseIndicator)
  }

  function testNewClaimRetrieveRsSucessfullAcknowledge() {
    var newMessage = getClaimRetrieveRs()

    assertEquals("Acknowledge Level is incorrect", "application_validation", newMessage.ResponseAcknowledgement.AcknowledgementLevelIndicator)
    assertEquals("Acknowledge Status is incorrect", ECFAcknowledgementStatus_Ext.TC_ACKNOWLEDGED, newMessage.ResponseAcknowledgement.AcknowledgementStatus)
    assertEquals("Response Description is incorrect", ECFAckLevelCode_Ext.TC_SUCCESS.DisplayName, newMessage.ResponseAcknowledgement.ResponseDescription)
    assertNull("Error code should be null", newMessage.ResponseAcknowledgement.ErrorCode)
  }

  function testNewClaimRetrieveRsRejectedAcknowledge() {
    var newMessage = getRejectedClaimRetrieveRs()

    assertEquals("Acknowledge Level is incorrect", "application_validation", newMessage.ResponseAcknowledgement.AcknowledgementLevelIndicator)
    assertEquals("Acknowledge Status is incorrect", ECFAcknowledgementStatus_Ext.TC_REJECTED, newMessage.ResponseAcknowledgement.AcknowledgementStatus)
    assertEquals("Response Description is incorrect", ECFAckLevelCode_Ext.TC_UNAVAILABLE.DisplayName, newMessage.ResponseAcknowledgement.ResponseDescription)
    assertEquals("Error code is incorrect", 131, newMessage.ResponseAcknowledgement.ErrorCode)
  }

  function testMapDataFromReferredUUId_WhenRejected() {
    var referredCRRq = ECFMessageEntityUtil.createClaimRetrieveRq()
    var xmlPayload = ECFMessageUtil.createNewClaimRetrieveRs()
    xmlPayload.Response.AcknowledgementLevelIndicator = "application_validation"
    xmlPayload.Response.AcknowledgementStatus = "rejected"
    xmlPayload.Response.ResponseDescription = "Central Systems Unavailable"
    xmlPayload.ReferredUUId = referredCRRq.UUID
    var result = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimRetrieveRs_Ext

    assertEquals(referredCRRq.UMR, result.UMR)
    assertEquals(referredCRRq.UCR, result.UCR)
    assertEquals(referredCRRq.TR, result.TR)
  }

  function testMapDataFromReferredUUId_WhenNoClaimData() {
    var referredCRRq = ECFMessageEntityUtil.createClaimRetrieveRq()
    var xmlPayload = ECFMessageUtil.createNewClaimRetrieveRs()
    xmlPayload.Response.ResponseDescription = "Partial Response - CLASS Unavailable/Unable to retrieve CLASS data"
    xmlPayload.ReferredUUId = referredCRRq.UUID
    var result = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimRetrieveRs_Ext

    assertEquals(referredCRRq.UMR, result.UMR)
    assertEquals(referredCRRq.UCR, result.UCR)
    assertEquals(referredCRRq.TR, result.TR)
  }

  private function getClaimRetrieveRs(): ECFMessageClaimRetrieveRs_Ext {
    var xmlPayload = ECFMessageUtil.createNewClaimRetrieveRs()
    return _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimRetrieveRs_Ext
  }

  private function getRejectedClaimRetrieveRs(): ECFMessageClaimRetrieveRs_Ext {
    var xmlPayload = ECFMessageUtil.createNewClaimRetrieveRs()
    xmlPayload.Response.AcknowledgementLevelIndicator = "application_validation"
    xmlPayload.Response.AcknowledgementStatus = "rejected"
    xmlPayload.Response.ResponseDescription = "Central Systems Unavailable"
    return _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimRetrieveRs_Ext
  }
}

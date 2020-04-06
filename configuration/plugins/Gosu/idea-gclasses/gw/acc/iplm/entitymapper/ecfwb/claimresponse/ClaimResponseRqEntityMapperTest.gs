package gw.acc.iplm.entitymapper.ecfwb.claimresponse

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.testharness.v3.GUnitTestClass

class ClaimResponseRqEntityMapperTest extends GUnitTestClass {
  var claimNotify: entity.ECFMessageClaimNotifyRq_Ext
  var claimResponseRq: entity.ECFMessageClaimResponseRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    claimNotify = ECFMessageEntityUtil.createClaimNotifyRq()
    claimResponseRq = getClaimResponseRq(claimNotify)
  }

  private function getClaimResponseRq(claimData: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    var responseRqEntity: ECFMessageClaimResponseRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      responseRqEntity = ClaimResponseRqEntityMapper.createClaimResponseRqEntity(claimData, bundle)
      responseRqEntity.Content = new Blob("tempContent".Bytes)
    }, ECFConstants.ECF_SUPER_USER)

    return responseRqEntity
  }

  function testUUIDExists() {
    assertNotNull(claimResponseRq.UUID)
  }

  function testContentExists() {
    assertNotNull(claimResponseRq.Content)
  }

  function testOriginTimeStampExists() {
    assertNotNull(claimResponseRq.OriginTimeStamp)
  }

  function testSuspendedExists() {
    assertNotNull(claimResponseRq.Suspended)
  }

  function testSuspendedFalse() {
    assertFalse(claimResponseRq.Suspended)
  }

  function testResponseCodeExists() {
    assertNull(claimResponseRq.ResponseCode)
  }

  function testPcsCatastropheCodeExists() {
    assertNull(claimResponseRq.PcsCatastropheCode)
  }

  function testLcoCatastropheCodeExists() {
    assertNull(claimResponseRq.LcoCatastropheCode)
  }

  function testInsuredIdExists() {
    assertNull(claimResponseRq.InsuredId)
  }

  function testInsurerTransactionReferenceExists() {
    assertNull(claimResponseRq.InsurerTransactionReference)
  }

  function testUMRSet() {
    assertEquals(claimNotify.UMR, claimResponseRq.UMR)
  }

  function testUCRSet() {
    assertEquals(claimNotify.UCR, claimResponseRq.UCR)
  }

  function testTRSet() {
    assertEquals(claimNotify.TR, claimResponseRq.TR)
  }

  function testReferredUUIDSet() {
    assertEquals(claimNotify.UUID, claimResponseRq.ReferredUUID)
  }

  function testMessageTypeSet() {
    assertEquals(ECFMessageType_Ext.TC_CLAIMRESPOND, claimResponseRq.MessageType)
  }

  function testParticipantFunctionSet() {
    assertEquals(ECFParticipantFunction_Ext.TC_LEAD, claimResponseRq.ParticipantFunction)
  }

  function testClaimSet() {
    assertEquals(claimNotify.Claim.ClaimNumber, claimResponseRq.Claim.ClaimNumber)
  }

  function testSenderPartyIdSet() {
    assertEquals(claimNotify.ReceiverPartyId, claimResponseRq.SenderPartyId)
  }

  function testSenderPartyAgencySet() {
    assertEquals(claimNotify.ReceiverPartyAgency, claimResponseRq.SenderPartyAgency)
  }

  function testSenderPartyNameSet() {
    assertEquals(claimNotify.ReceiverPartyName, claimResponseRq.SenderPartyName)
  }

  function testSenderPartyRoleSet() {
    assertEquals(claimNotify.ReceiverPartyRoleCd, claimResponseRq.SenderPartyRoleCd)
  }

  function testReceiverPartyIdSet() {
    assertEquals(claimNotify.SenderPartyId, claimResponseRq.ReceiverPartyId)
  }

  function testReceiverPartyAgencySet() {
    assertEquals(claimNotify.SenderPartyAgency, claimResponseRq.ReceiverPartyAgency)
  }

  function testReceiverPartyNameSet() {
    assertEquals(claimNotify.SenderPartyName, claimResponseRq.ReceiverPartyName)
  }

  function testReceiverPartyRoleSet() {
    assertEquals(claimNotify.SenderPartyRoleCd, claimResponseRq.ReceiverPartyRoleCd)
  }

  function testAsOfDateSet() {
    assertEquals(claimNotify.AsOfDate, claimResponseRq.AsOfDate)
  }

  function testBureauTypeSet() {
    assertEquals(claimNotify.BureauType, claimResponseRq.BureauType)
  }

  function testClaimLineNumberSet() {
    assertEquals(claimNotify.ClaimLineNumber, claimResponseRq.ClaimLineNumber)
  }

  function testClaimTypeSet() {
    assertEquals(claimNotify.ClaimType, claimResponseRq.ClaimType)
  }

  function testClaimsSchemeSet() {
    assertEquals(claimNotify.ClaimsScheme, claimResponseRq.ClaimsScheme)
  }

  function testClaimsParticipantRolesSet() {
    assertEquals("There should be one less ParticipantRole than ContractMarket (as the receiver is being excluded)", claimNotify.ECFContractMarkets.Count - 1, claimResponseRq.ClaimParticipantRoles.Count)
    assertNull("The Claim Notify Receiver should not be in the Participant Roles.", claimResponseRq.ClaimParticipantRoles.firstWhere(\elt -> elt.PartyID == claimNotify.ReceiverPartyId))
  }

  function testNoAgreementPartyModificationsSet() {
    assertEquals(0, claimResponseRq.AgreementPartyModifications?.length)
  }

  function testIsSimultaneousRIPIndicatorSet() {
    assertFalse(claimResponseRq.IsSimultaneousRIPIndicator)
  }

  function testTriageCategoryExists() {
    assertNull(claimResponseRq.TriageCategory)
  }

  function testCauseOfLossCodeExists() {
    assertNull(claimResponseRq.CauseOfLossCode)
  }

  function testOutstandingQualifierCodeExists() {
    assertNull(claimResponseRq.OutstandingQualifierCode)
  }

  function testMinorPrecautionaryIndicatorWhenCollectionUnlikelyNull() {
    claimNotify.setCollectionUnlikelyIndicator(null)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapMinorPrecautionaryIndicator(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.MinorPrecautionaryIndicator)
  }

  function testMinorPrecautionaryIndicatorWhenCollectionUnlikelyY() {
    claimNotify.setCollectionUnlikelyIndicator(ECFIndicatorEnum.Y.IntegrationCode)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapMinorPrecautionaryIndicator(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, claimResponseRq.MinorPrecautionaryIndicator)
  }

  function testMinorPrecautionaryIndicatorWhenCollectionUnlikelyN() {
    claimNotify.setCollectionUnlikelyIndicator(ECFIndicatorEnum.N.IntegrationCode)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapMinorPrecautionaryIndicator(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.MinorPrecautionaryIndicator)
  }

  function testAllUnderwritersToSeeFileInd_Null() {
    claimResponseRq.AllUnderwritersToSeeFileInd = null
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapAllUnderwritersToSeeFileIndicator(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.AllUnderwritersToSeeFileInd)
  }

  function testAllUnderwritersToSeeFileInd_LastResponseIndicatorSet() {
    var claimResponse1 = getClaimResponseRq(claimNotify)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotify = bundle.add(claimNotify)
      claimResponse1 = bundle.add(claimResponse1)

      claimNotify.Claim = ClaimBuilderHelper.createClaimWithUCR(claimNotify.UCR)
      claimResponse1.Claim = claimNotify.Claim
      claimResponse1 .AllUnderwritersToSeeFileInd = ECFIndicatorEnum.Y.IntegrationCode
    }, User.util.UnrestrictedUser)

    claimResponseRq.AllUnderwritersToSeeFileInd = null
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapAllUnderwritersToSeeFileIndicator(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, claimResponseRq.AllUnderwritersToSeeFileInd)
  }

  function testAllUnderwritersToSeeFileInd_OtherBureau() {
    claimResponseRq.AllUnderwritersToSeeFileInd = null
    setMode(ECFBureauType_Ext.TC_LLOYDS, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapAllUnderwritersToSeeFileIndicator(claimResponseRq, claimNotify)
    assertNull(claimResponseRq.AllUnderwritersToSeeFileInd)
  }

  private function setMode(bureauType : ECFBureauType_Ext, participantFunction : ECFParticipantFunction_Ext) {
    claimNotify.BureauType = bureauType
    claimNotify.Role = participantFunction
  }

  function testNoFurtherResponseIndicatorWhenLead() {
    claimNotify.setNoFurtherResponseIndicator(null)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_LEAD)
    ClaimResponseRqEntityMapper.mapNoFurtherResponse(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.NoFurtherResponseIndicator)
  }

  function testNoFurtherResponseIndicatorWhenNull() {
    claimNotify.setNoFurtherResponseIndicator(null)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    ClaimResponseRqEntityMapper.mapNoFurtherResponse(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.NoFurtherResponseIndicator)
  }

  function testNoFurtherResponseIndicatorWhenY() {
    claimNotify.setNoFurtherResponseIndicator(ECFIndicatorEnum.Y.IntegrationCode)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    ClaimResponseRqEntityMapper.mapNoFurtherResponse(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.Y.IntegrationCode, claimResponseRq.NoFurtherResponseIndicator)
  }

  function testNoFurtherResponseIndicatorWhenN() {
    claimNotify.setNoFurtherResponseIndicator(ECFIndicatorEnum.N.IntegrationCode)
    setMode(ECFBureauType_Ext.TC_LIRMA, ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    ClaimResponseRqEntityMapper.mapNoFurtherResponse(claimResponseRq, claimNotify)
    assertEquals(ECFIndicatorEnum.N.IntegrationCode, claimResponseRq.NoFurtherResponseIndicator)
  }

  function testNoFurtherResponseIndicatorWhenNotLirma() {
    claimNotify.setNoFurtherResponseIndicator(null)
    setMode(ECFBureauType_Ext.TC_LLOYDS, ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    ClaimResponseRqEntityMapper.mapNoFurtherResponse(claimResponseRq, claimNotify)
    assertNull(claimResponseRq.NoFurtherResponseIndicator)
  }

  function testCreateLeadClaimEntryAmounts_UseSortedFinancials() {
    var expectedFinancials = claimNotify.FinancialsSortedByCurrency

    assertEquals(expectedFinancials[0].Currency, claimResponseRq.Currency1)
    assertEquals(expectedFinancials[1].Currency, claimResponseRq.Currency2)
    assertEquals(expectedFinancials[2].Currency, claimResponseRq.Currency3)
  }
}
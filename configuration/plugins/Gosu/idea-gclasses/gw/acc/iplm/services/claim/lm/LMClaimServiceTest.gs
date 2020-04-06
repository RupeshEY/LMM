package gw.acc.iplm.services.claim.lm

uses gw.acc.iplm.services.claim.lm.mapper.SCMReserveMapper
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass
uses gw.transaction.Transaction
uses org.mockito.AdditionalAnswers
uses org.mockito.Mockito

class LMClaimServiceTest extends GUnitTestClass {

  private static var _claimService : LMClaimService

  override function beforeMethod() {
    _claimService = new LMClaimService()
    setMockReserveMapper(Mockito.mock(SCMReserveMapper))
  }

  override function afterMethod(error : Throwable) {
    ECFMessageEntityUtil.deleteAllLMMessagesFromDB()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var allClaims = Query.make(Claim).select().toList()

      allClaims.each(\claim -> {
        bundle.delete(claim.Policy)
        bundle.delete(claim)
      })
    }, User.util.UnrestrictedUser)
  }

  function testCreateClaim_CreatesClaim() {
    var scmMessage = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claim = _claimService.createClaim(scmMessage)
      assertNotNull(claim)
    }, User.util.UnrestrictedUser)
  }

  function testCreateClaim_MapsDetails() {
    var scmMessage = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claim = _claimService.createClaim(scmMessage)

      assertEquals(scmMessage.LossStartDate, claim.LossDate)
      assertEquals(scmMessage.LossEndDate, claim.LossEndDate_Ext)
      assertEquals(scmMessage.LossDescription, claim.Description)
      assertEquals(scmMessage.LossLocation, claim.LossLocation.Description)
    }, User.util.UnrestrictedUser)
  }

  function testCreateClaim_MapsExposure() {
    var scmMessage = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var claim : Claim

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = _claimService.createClaim(scmMessage)
    }, User.util.UnrestrictedUser)

    assertTrue(claim.Exposures.HasElements)
    assertTrue(claim.Exposures.hasMatch(\elt1 -> elt1.CoverageSubType == CoverageSubtype.TC_IPLM_EXT))

    var iplmExposures = claim.Exposures.where(\elt1 -> elt1.CoverageSubType == CoverageSubtype.TC_IPLM_EXT)

    iplmExposures.each(\iplmExposure -> {
      assertEquals(ExposureState.TC_OPEN, iplmExposure.State)
    })
  }

  function testCreateClaim_MapNewExposure() {
    var claim : Claim
    var scmMessage1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var scmMessage2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var newUCR = String.valueOf(System.currentTimeMillis())

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage1 = bundle.add(scmMessage1)
      scmMessage2 = bundle.add(scmMessage2)

      scmMessage1.UCR = newUCR
      scmMessage1.OCR = "101"

      scmMessage2.UCR = newUCR
      scmMessage2.OCR = "102"
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = _claimService.createClaim(scmMessage1)
    }, User.util.UnrestrictedUser)

    assertTrue(claim.Exposures.HasElements)

    var exposureCountAfterFirstMessage = claim.Exposures.Count

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim = _claimService.mapClaimDetails(scmMessage2, claim)
    }, User.util.UnrestrictedUser)

    assertEquals("The amount of exposures should have increased by one as a new OCR was used in the second message",
        (exposureCountAfterFirstMessage + 1), claim.Exposures.Count)

    var iplmExposures = claim.Exposures.where(\elt1 -> elt1.CoverageSubType == CoverageSubtype.TC_IPLM_EXT)

    iplmExposures.each(\iplmExposure -> {
      assertEquals(ExposureState.TC_OPEN, iplmExposure.State)
    })
  }

  function testCreateClaim_MapExistingExposure() {
    var claim : Claim
    var scmMessage1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var scmMessage2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage1 = bundle.add(scmMessage1)
      scmMessage2 = bundle.add(scmMessage2)

      scmMessage1.OCR = "101"
      scmMessage2.OCR = "101"
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = _claimService.createClaim(scmMessage1)
    }, User.util.UnrestrictedUser)

    assertTrue(claim.Exposures.HasElements)

    var exposureCountAfterFirstMessage = claim.Exposures.Count


    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim = _claimService.mapClaimDetails(scmMessage2, claim)
    }, User.util.UnrestrictedUser)

    assertEquals("The amount of exposures should not have increased as the same OCR was used in the second message",
        exposureCountAfterFirstMessage, claim.Exposures.Count)

    var iplmExposures = claim.Exposures.where(\elt1 -> elt1.CoverageSubType == CoverageSubtype.TC_IPLM_EXT)

    iplmExposures.each(\iplmExposure -> {
      assertEquals(ExposureState.TC_OPEN, iplmExposure.State)
    })
  }

  function testCreateClaim_MapReserve() {
    var spyReserveMapper = Mockito.spy(new SCMReserveMapper())
    setMockReserveMapper(spyReserveMapper)

    var claim = ClaimBuilderHelper.createClaim()
    var scm = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    Transaction.runWithNewBundle(\bundle -> {
      claim = _claimService.createClaim(scm)
    }, User.util.UnrestrictedUser)

    Mockito.verify(spyReserveMapper, Mockito.times(1)).mapReserve(scm, claim)
  }

  private function setMockReserveMapper(mock : SCMReserveMapper) {
    Mockito.when(mock.mapReserve(Mockito.any(LMMessageLloydsSCM_Ext), Mockito.any(Claim))).then(AdditionalAnswers.returnsSecondArg())
    var reserveMapper = _claimService.Class.getDeclaredField("_scmReserveMapper")
    reserveMapper.setAccessible(true)
    reserveMapper.set(_claimService, mock)
  }
}
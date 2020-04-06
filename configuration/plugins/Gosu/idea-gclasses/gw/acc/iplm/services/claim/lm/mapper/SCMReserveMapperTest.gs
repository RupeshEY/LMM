package gw.acc.iplm.services.claim.lm.mapper

uses gw.acc.iplm.services.claim.lm.mapper.SCMReserveMapper
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.LMMUserUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.api.util.CurrencyUtil
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass
uses gw.transaction.Transaction

uses java.math.RoundingMode

class SCMReserveMapperTest extends GUnitTestClass {

  var _reserveMapper : SCMReserveMapper

  override function beforeMethod() {
    _reserveMapper = new SCMReserveMapper()
  }

  override function beforeClass() {
    CurrencyUtil.invokeMarketExchangeRateSetPlugin()
    LMMUserUtil.setUpUserForReserves()
  }

  function testCreateClaim_MapReserve() {
    var claim = ClaimBuilderHelper.createClaim()
    var scm = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, scm.OCR)
      claim = _reserveMapper.mapReserve(scm, claim)
    }, User.util.UnrestrictedUser)

    assertTrue(claim.ReserveLines.HasElements)
    assertTrue(claim.ReserveLines.hasMatch(\res -> res.CostCategory == CostCategory.TC_IPLMINDEMNITY or res.CostCategory == CostCategory.TC_IPLMFEE))
  }

  function testCreateClaim_UpdateExistingReserve() {
    var claim = ClaimBuilderHelper.createClaim()
    var ocr = "101"
    var scmMessage1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var scmMessage2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage1 = bundle.add(scmMessage1)
      scmMessage2 = bundle.add(scmMessage2)

      scmMessage1.OCR = ocr
      scmMessage2.OCR = ocr
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, ocr)
      claim = _reserveMapper.mapReserve(scmMessage1, claim)
    }, User.util.UnrestrictedUser)

    var reserveCountAfterFirstMessage = claim.ReserveLines.Count
    var firstMessageReserveTotal = FinancialsCalculations.TotalReserves.withClaim(claim).Amount

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage2 = bundle.add(scmMessage2)
      scmMessage2.OutstandingIndemnity = scmMessage2.OutstandingIndemnity.add(new MonetaryAmount(1000bd, scmMessage2.OutstandingIndemnity.Currency))
      claim = bundle.add(claim)
      claim = _reserveMapper.mapReserve(scmMessage2, claim)
    }, User.util.UnrestrictedUser)

    assertEquals("The amount of reserves should not have increased as the same OCR was used in the second message",
        reserveCountAfterFirstMessage, claim.ReserveLines.Count)

    var afterNewMessageReserveTotal = FinancialsCalculations.TotalReserves.withClaim(claim).Amount
    assertTrue(afterNewMessageReserveTotal > firstMessageReserveTotal)
  }

  function testCreateClaim_UpdateExistingReserve_LessThanValue() {
    var claim = ClaimBuilderHelper.createClaim()
    var ocr = "101"
    var scmMessage1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var scmMessage2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage1 = bundle.add(scmMessage1)
      scmMessage2 = bundle.add(scmMessage2)

      scmMessage1.OCR = ocr
      scmMessage1.OutstandingFees = new MonetaryAmount(0bd, scmMessage2.OutstandingIndemnity.Currency)

      scmMessage2.OCR = ocr
      scmMessage2.OutstandingFees = new MonetaryAmount(0bd, scmMessage2.OutstandingIndemnity.Currency)
      scmMessage2.OutstandingIndemnity = scmMessage2.OutstandingIndemnity.subtract(new MonetaryAmount(1000bd, scmMessage2.OutstandingIndemnity.Currency))
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, ocr)
      claim = _reserveMapper.mapReserve(scmMessage1, claim)
    }, User.util.UnrestrictedUser)

    var reserveCountAfterFirstMessage = claim.ReserveLines.Count
    var firstMessageReserveTotal = FinancialsCalculations.TotalReserves.withClaim(claim).withCostCategory(CostCategory.TC_IPLMINDEMNITY).Amount

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim = _reserveMapper.mapReserve(scmMessage2, claim)
    }, User.util.UnrestrictedUser)

    assertEquals("The amount of reserves should not have increased as the same OCR was used in the second message",
        reserveCountAfterFirstMessage, claim.ReserveLines.Count)

    var afterNewMessageReserveTotal = FinancialsCalculations.TotalReserves.withClaim(claim).withCostCategory(CostCategory.TC_IPLMINDEMNITY).Amount
    assertTrue("Amount after - ${afterNewMessageReserveTotal} should be less than amount before - ${firstMessageReserveTotal}", afterNewMessageReserveTotal < firstMessageReserveTotal)
  }

  function testCreateClaim_MapNewReserve() {
    var claim = ClaimBuilderHelper.createClaim()
    var scmMessage1 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var scmMessage2 = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var newUCR = String.valueOf(System.currentTimeMillis())

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessage1 = bundle.add(scmMessage1)
      scmMessage2 = bundle.add(scmMessage2)

      scmMessage1.UCR = newUCR
      scmMessage1.OCR = "101"
      scmMessage1.OutstandingFees = new MonetaryAmount(0bd, scmMessage2.OriginalCurrency)

      scmMessage2.UCR = newUCR
      scmMessage2.OCR = "102"
      scmMessage2.OutstandingFees = new MonetaryAmount(0bd, scmMessage2.OriginalCurrency)
    }, User.util.UnrestrictedUser)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, scmMessage1.OCR)
      setUpExposureOnClaim(claim, scmMessage2.OCR)
      claim = _reserveMapper.mapReserve(scmMessage1, claim)
    }, User.util.UnrestrictedUser)

    assertTrue(claim.ReserveLines.HasElements)

    var reserveCountAfterFirstMessage = claim.ReserveLines.Count

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claim = bundle.add(claim)
      claim = _reserveMapper.mapReserve(scmMessage2, claim)
    }, User.util.UnrestrictedUser)

    assertEquals("The amount of reserves should have increased by one as a new OCR was used in the second message",
        (reserveCountAfterFirstMessage + 1), claim.ReserveLines.Count)

    var syndicateShareAmt = (scmMessage1.OutstandingIndemnity.add(scmMessage2.OutstandingIndemnity).Amount * scmMessage1.ReceiverShare / 100).setScale(2, RoundingMode.HALF_UP)
    var expectedIPLMReserveTotal = CurrencyUtil.convertAmount(syndicateShareAmt, scmMessage1.OutstandingIndemnity.Currency, claim.Currency, null)
    var actualIPLMReserveTotal = FinancialsCalculations.TotalReserves.withClaim(claim).withCostCategory(CostCategory.TC_IPLMINDEMNITY).Amount
    assertEquals(expectedIPLMReserveTotal, actualIPLMReserveTotal)
  }

  function testCreateClaim_MapReserve_Indemnity() {
    var claim = ClaimBuilderHelper.createClaim()
    var scm = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var indAmt = new CurrencyAmount(54000bd, scm.OriginalCurrency)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scm = bundle.add(scm)
      scm.OutstandingIndemnity = new MonetaryAmount(indAmt, scm.OriginalCurrency)
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, scm.OCR)
      claim = _reserveMapper.mapReserve(scm, claim)
    }, User.util.UnrestrictedUser)

    var syndicateShareIndAmtInClaimCur = (indAmt * scm.ReceiverShare / 100).setScale(2, RoundingMode.HALF_UP).convert(claim.Currency, RoundingMode.HALF_UP)
    var amountOnReserve = FinancialsCalculations.TotalReserves.withClaim(claim).withCostCategory(CostCategory.TC_IPLMINDEMNITY).Amount
    assertEquals(syndicateShareIndAmtInClaimCur, amountOnReserve)
  }

  function testCreateClaim_MapReserve_Fees() {
    var claim = ClaimBuilderHelper.createClaim()
    var scm = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
    var feeAmt = new CurrencyAmount(12000bd, scm.OriginalCurrency)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scm = bundle.add(scm)
      scm.OutstandingFees =  new MonetaryAmount(feeAmt, scm.OriginalCurrency)
      claim = bundle.add(claim)
      setUpExposureOnClaim(claim, scm.OCR)
      claim = _reserveMapper.mapReserve(scm, claim)
    }, User.util.UnrestrictedUser)

    var syndicateShareFeeAmtInClaimCur = (feeAmt * scm.ReceiverShare / 100).setScale(2, RoundingMode.HALF_UP).convert(claim.Currency, RoundingMode.HALF_UP)
    var amountOnReserve = FinancialsCalculations.TotalReserves.withClaim(claim).withCostCategory(CostCategory.TC_IPLMFEE).Amount
    assertEquals(syndicateShareFeeAmtInClaimCur, amountOnReserve)
  }

  private function setUpExposureOnClaim(claim : Claim, ocr : String){
    var exposure = claim.newExposure(typekey.ExposureType.TC_IPLM_EXT, true)
    exposure.OCR_Ext = ocr
    exposure.PrimaryCoverage = typekey.CoverageType.TC_IPLM_EXT
    exposure.CoverageSubType = typekey.CoverageSubtype.TC_IPLM_EXT
    exposure.State = ExposureState.TC_OPEN
    exposure.autoAssign()
  }
}
package gw.acc.iplm.services

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimDataFinancial_ExtBuilder
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass

class UberPrecautionaryServiceTest extends GUnitTestClass {

  private static final var ZERO_AMOUNT = new MonetaryAmount(0.00bd, Currency.TC_USD)
  private static final var NON_ZERO_AMOUNT = new MonetaryAmount(0.01bd, Currency.TC_USD)


  function testClaimResponseRequestWith_QualifierCode_S() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    claimResponseRq.BureauType = ECFBureauType_Ext.TC_LLOYDS
    claimResponseRq.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_S
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The QualifierCode is not U but still failed Uber Precautionary validation rule. "+e)
    }
  }

  function testNonFirstAdvice() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The transaction type is not First Advice but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testFirstAdvice_NotLloyds() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    claimResponseRq.BureauType = ECFBureauType_Ext.TC_LIRMA
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Bureau type is not Lloyd but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testFirstAdvice_NotLloydsLead() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    claimResponseRq.BureauType = ECFBureauType_Ext.TC_LLOYDS
    claimResponseRq.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Lloyd's participant role is not Lead but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidClaimScheme_2010() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2010, ECFTriageCode_Ext.TC_CTP_STANDARD)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Claim Scheme and Triage Category are valid but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidClaimScheme_2006AndPrior() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2006ANDPRIOR, ECFTriageCode_Ext.TC_STANDARD)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Claim Scheme and Triage Category are valid but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }


  function testClaimResponseRequestFinancialsAre_ZeroAmount() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ZERO_AMOUNT)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      claimResponseRq.LeadReserveAmount1 = ZERO_AMOUNT
      claimResponseRq.LeadReserveAmount2 = ZERO_AMOUNT
      claimResponseRq.LeadReserveAmount3 = ZERO_AMOUNT
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Financials are zero but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testClaimDataFinancialsAre_ZeroAmount() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ZERO_AMOUNT)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Financials are zero but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testClaimResponseRequestFinancialsAre_WithNullAmounts() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, null)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      claimResponseRq.LeadReserveAmount1 = null
      claimResponseRq.LeadReserveAmount2 = null
      claimResponseRq.LeadReserveAmount3 = null
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Financials are zero or null but still failed Uber precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidOutstandingQualifierCode_U() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_U)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {

      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is U which is valid but still failed Uber precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidOutstandingQualifierCode_F() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_F)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {

      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is F which is valid but still failed Uber precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidOutstandingQualifierCode_P() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_P)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is P which is valid but still failed Uber precautionary validation rule. "+e)
    }
  }

  function testValidOutstandingQualifierCode_D() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_D)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is D which is valid but still failed Uber precautionary validation rule. "+e)
    }
  }

  function testValidOutstandingQualifierCode_L() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_L)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is L which is valid but still failed uber precautionary validation rule. "+e)
    }
  }

  function testValidOutstandingQualifierCode_N() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_N)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is N which is valid but still failed uber precautionary validation rule. "+e)
      throw e
    }
  }

  function testValidOutstandingQualifierCode_T() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_T)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Outstanding Qualifier code is T which is valid but still failed uber precautionary validation rule. "+e)
    }
  }

  function testClaimResponseRequestFinancialsAre_WithNullFinancials() {
    var claimResponseRq = getClaimResponseRqWithNoFinancials()
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("There are no financials, but still failed uber precautionary validation rule.")
      throw e
    }
  }

  function testInValidOutstandingQualifierCode_C() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_C)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testInValidOutstandingQualifierCode_R() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_R)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testInValidOutstandingQualifierCode_S() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_S)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testInValidOutstandingQualifierCode_V() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_V)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }


  function testInValidClaimScheme_2006AndPrior_Complex() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2006ANDPRIOR, ECFTriageCode_Ext.TC_COMPLEX)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }


  function testInValidClaimScheme_2010_CTP_COMPLEX() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2010, ECFTriageCode_Ext.TC_CTP_COMPLEX)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testValidClaimScheme_2010_VCS_IsBlank() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2010, null)
    var ub = new UberPrecautionaryService(claimResponseRq)
    try {
      ub.validateDataIntegrityForUberClaim()
    } catch (e: DisplayableException) {
      fail("The Claim Scheme and Triage Category is null but still failed Uber Precautionary validation rule. "+e)
      throw e
    }
  }

  function testClaimDataFinancialsAre_NonZeroAmount() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, NON_ZERO_AMOUNT)
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }


  function testClaimResponseRequestFinancialsAre_NonZeroAmount() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ZERO_AMOUNT)
    var ub = new UberPrecautionaryService(claimResponseRq)
    claimResponseRq.LeadReserveAmount1 = ZERO_AMOUNT
    claimResponseRq.LeadReserveAmount2 = ZERO_AMOUNT
    claimResponseRq.LeadReserveAmount3 = NON_ZERO_AMOUNT
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testInValid_WithAllIssues() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    var ub = new UberPrecautionaryService(claimResponseRq)
    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
  }

  function testConsolidationOfMessages_WithAllIssues() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    var ub = new UberPrecautionaryService(claimResponseRq)

    var finZero = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.FinancialsAreGreaterThanZero")
    var claimSchemeError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.TriageCategoryIsComplex")
    var outstandingQualifierError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.InvalidQualifierCode")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", finZero + ", " + claimSchemeError + ", and " + outstandingQualifierError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  function testConsolidationOfMessages_WithInvalidFinsOnly() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, NON_ZERO_AMOUNT)

    var ub = new UberPrecautionaryService(claimResponseRq)

    var finZero = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.FinancialsAreGreaterThanZero")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", finZero)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  function testConsolidationOfMessages_WithInvalidFinsAndClaimScheme() {
    var claimResponseRq = getClaimResponseRqWithFinancials(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, NON_ZERO_AMOUNT)
    claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2006ANDPRIOR
    claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_COMPLEX

    var ub = new UberPrecautionaryService(claimResponseRq)
    var finZero = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.FinancialsAreGreaterThanZero")
    var claimSchemeError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.TriageCategoryIsComplex")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", finZero + " and " + claimSchemeError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  function testConsolidationOfMessages_WithInvalidFinsAndQulifierCode() {
    var claimResponseRq = getClaimResponseRqWithAllIssues()
    claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2006ANDPRIOR
    claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_VCS_XCS
    var ub = new UberPrecautionaryService(claimResponseRq)

    var finZero = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.FinancialsAreGreaterThanZero")
    var outstandingQualifierError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.InvalidQualifierCode")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", finZero + " and " + outstandingQualifierError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }


  function testConsolidationOfMessages_WithInvalidClaimSchemeOnly() {
    var claimResponseRq = getClaimResponseRqWithClaimScheme(ECFClaimTransactionType_Ext.TC_FIRSTADVICE,
        ECFScheme_Ext.TC_2006ANDPRIOR, ECFTriageCode_Ext.TC_COMPLEX)
    var ub = new UberPrecautionaryService(claimResponseRq)

    var claimSchemeError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.TriageCategoryIsComplex")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", claimSchemeError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  function testConsolidationOfMessages_WithInvalidClaimSchemeAndQulifierCode() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_V)
    claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2006ANDPRIOR
    claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_COMPLEX
    var ub = new UberPrecautionaryService(claimResponseRq)

    var claimSchemeError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.TriageCategoryIsComplex")
    var outstandingQualifierError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.InvalidQualifierCode")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", claimSchemeError + " and " + outstandingQualifierError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  function testConsolidationOfMessages_WithQulifierCodeOnly() {
    var claimResponseRq = getClaimResponseRqWithOutstandingQualifier(ECFClaimTransactionType_Ext.TC_FIRSTADVICE, ECFOutstandingQualifierCode_Ext.TC_S)
    var ub = new UberPrecautionaryService(claimResponseRq)

    var outstandingQualifierError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.InvalidQualifierCode")
    var expectedError = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", outstandingQualifierError)

    var  error = ub.validateDataIntegrityForUberClaim()
    assertNotNull(error)
    assertEquals(expectedError, error)
  }

  private function getClaimResponseRqWithFinancials(transactionType: ECFClaimTransactionType_Ext, amountFromTest: MonetaryAmount): ECFMessageClaimResponseRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_P
      claimNotifyRq.Financials.each(\elt -> {
        elt.remove()
      })
      var fin1 = new ECFMessageClaimDataFinancial_ExtBuilder().withCurrency(Currency.TC_USD)
          .withIncurred(ZERO_AMOUNT)
          .withPreviouslyPaid(ZERO_AMOUNT)
          .withOutstanding(ZERO_AMOUNT)
          .withLeadReserveAmount(ZERO_AMOUNT).create()
      var fin2 = new ECFMessageClaimDataFinancial_ExtBuilder().withCurrency(Currency.TC_USD)
          .withIncurred(ZERO_AMOUNT)
          .withPreviouslyPaid(ZERO_AMOUNT)
          .withOutstanding(ZERO_AMOUNT)
          .withLeadReserveAmount(ZERO_AMOUNT).create()
      var fin3 = new ECFMessageClaimDataFinancial_ExtBuilder().withCurrency(Currency.TC_USD)
          .withIncurred(ZERO_AMOUNT)
          .withPreviouslyPaid(ZERO_AMOUNT)
          .withOutstanding(amountFromTest)
          .withLeadReserveAmount(ZERO_AMOUNT).create()

      claimNotifyRq.addToFinancials(fin1)
      claimNotifyRq.addToFinancials(fin2)
      claimNotifyRq.addToFinancials(fin3)

      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.TransactionType = claimNotifyRq.TransactionType
      claimResponseRq.TransactionType = transactionType
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_U
      claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2010
      claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_CTP_STANDARD

      bundle.commit()
    }, User.util.UnrestrictedUser)

    return claimResponseRq
  }

  private function getClaimResponseRqWithClaimScheme(transactionType: ECFClaimTransactionType_Ext, claimsScheme: ECFScheme_Ext, triageCategory: ECFTriageCode_Ext): ECFMessageClaimResponseRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Financials.each(\elt -> {
        elt.remove()
      })
      claimNotifyRq.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_P
      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.TransactionType = claimNotifyRq.TransactionType
      claimResponseRq.TransactionType = transactionType
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ClaimsScheme = claimsScheme
      claimResponseRq.TriageCategory = triageCategory
      claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_U

      bundle.commit()
    }, User.util.UnrestrictedUser)

    return claimResponseRq
  }

  private function getClaimResponseRqWithOutstandingQualifier(transactionType: ECFClaimTransactionType_Ext, outstandingQualifierCode: ECFOutstandingQualifierCode_Ext): ECFMessageClaimResponseRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Financials.each(\elt -> {
        elt.remove()
      })
      claimNotifyRq.OutstandingAmountQualifier = outstandingQualifierCode
      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.TransactionType = claimNotifyRq.TransactionType
      claimResponseRq.TransactionType = transactionType
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_U
      claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2010
      claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_VCS_CRAWFORD

      bundle.commit()
    }, User.util.UnrestrictedUser)

    return claimResponseRq
  }

  private function getClaimResponseRqWithNoFinancials(): ECFMessageClaimResponseRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.Financials.each(\elt -> {
        elt.remove()
      })
      claimNotifyRq.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_P
      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.TransactionType = claimNotifyRq.TransactionType
      claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_U
      claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2010
      claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_CTP_STANDARD

      bundle.commit()
    }, User.util.UnrestrictedUser)

    return claimResponseRq
  }

  private function getClaimResponseRqWithAllIssues(): ECFMessageClaimResponseRq_Ext {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    var claimResponseRq: ECFMessageClaimResponseRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage)
      claimNotifyRq = bundle.add(claimNotifyRq)
      claimNotifyRq.OutstandingAmountQualifier = ECFOutstandingQualifierCode_Ext.TC_V
      var claimResponseMessage = ECFMessageUtil.createNewClaimResponseRq()
      claimResponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimResponseMessage)
      claimResponseRq = bundle.add(claimResponseRq)
      claimResponseRq.TransactionType = claimNotifyRq.TransactionType
      claimResponseRq.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
      claimResponseRq.ReferredUUID = claimNotifyRq.UUID
      claimResponseRq.ClaimsScheme = ECFScheme_Ext.TC_2010
      claimResponseRq.TriageCategory = ECFTriageCode_Ext.TC_CTP_COMPLEX
      claimResponseRq.OutstandingQualifierCode = ECFOutstandingQualifierCode_Ext.TC_U

      bundle.commit()
    }, User.util.UnrestrictedUser)

    return claimResponseRq
  }
}
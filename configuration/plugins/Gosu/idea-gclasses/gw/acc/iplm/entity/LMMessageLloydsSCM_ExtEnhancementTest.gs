package gw.acc.iplm.entity

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.pl.currency.MonetaryAmount
uses gw.testharness.v3.GUnitTestClass

uses java.text.DecimalFormat

class LMMessageLloydsSCM_ExtEnhancementTest extends GUnitTestClass {

  function testApplicableToPolicy() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.Suspended = true
      entity.ValidationErrorCode = LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND.ErrorCode
      assertTrue(entity.ApplicableToPolicy)
    })
  }

  function testApplicableToPolicy_NotSuspended() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.Suspended = false
      entity.ValidationErrorCode = LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND.ErrorCode
      assertFalse(entity.ApplicableToPolicy)
    })
  }

  function testApplicableToPolicy_WrongErrorCode() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.Suspended = true
      entity.ValidationErrorCode = LMErrorCodeType.CLAIM_HAS_NO_MESSAGES.ErrorCode
      assertFalse(entity.ApplicableToPolicy)
    })
  }

  function testApplicableToPolicy_ValidMessage() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      assertFalse(entity.ApplicableToPolicy)
    })
  }

  function testSumPaidThisTime_IndemnityOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = new MonetaryAmount(expectedAmount, TC_USD)
      entity.PaidThisTimeFees = null
      assertEquals(expectedAmount, entity.SumPaidThisTime)
    })
  }

  function testSumPaidThisTime_FeesOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = null
      entity.PaidThisTimeFees = new MonetaryAmount(expectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumPaidThisTime)
    })
  }

  function testSumPaidThisTime_FeesAndIndemnity() {
    final var expectedAmount = 200.00bd
    final var halfExpectedAmount = expectedAmount / 2

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = new MonetaryAmount(halfExpectedAmount, TC_USD)
      entity.PaidThisTimeFees = new MonetaryAmount(halfExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumPaidThisTime)
    })
  }

  function testSumPaidThisTime_NoFeesOrIndemnity() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = null
      entity.PaidThisTimeFees = null
      assertNull(entity.SumPaidThisTime)
    })
  }

  function testSumPaidToDate_IndemnityOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidToDateIndemnity = new MonetaryAmount(expectedAmount, TC_USD)
      entity.PaidToDateFees = null
      assertEquals(expectedAmount, entity.SumPaidToDate)
    })
  }

  function testSumPaidToDate_FeesOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidToDateIndemnity = null
      entity.PaidToDateFees = new MonetaryAmount(expectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumPaidToDate)
    })
  }

  function testSumPaidToDate_FeesAndIndemnity() {
    final var expectedAmount = 200.00bd
    final var halfExpectedAmount = expectedAmount / 2

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidToDateIndemnity = new MonetaryAmount(halfExpectedAmount, TC_USD)
      entity.PaidToDateFees = new MonetaryAmount(halfExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumPaidToDate)
    })
  }

  function testSumPaidToDate_NoFeesOrIndemnity() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidToDateIndemnity = null
      entity.PaidToDateFees = null
      assertNull(entity.SumPaidToDate)
    })
  }

  function testSumOutstandingAmount_IndemnityOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.OutstandingIndemnity = new MonetaryAmount(expectedAmount, TC_USD)
      entity.OutstandingFees = null
      assertEquals(expectedAmount, entity.SumOutstandingAmount)
    })
  }

  function testSumOutstandingAmount_FeesOnly() {
    final var expectedAmount = 100.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.OutstandingIndemnity = null
      entity.OutstandingFees = new MonetaryAmount(expectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumOutstandingAmount)
    })
  }

  function testSumOutstandingAmount_FeesAndIndemnity() {
    final var expectedAmount = 200.00bd
    final var halfExpectedAmount = expectedAmount / 2

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.OutstandingIndemnity = new MonetaryAmount(halfExpectedAmount, TC_USD)
      entity.OutstandingFees = new MonetaryAmount(halfExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumOutstandingAmount)
    })
  }

  function testSumOutstandingAmount_NoFeesOrIndemnity() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.OutstandingIndemnity = null
      entity.OutstandingFees = null
      assertNull(entity.SumOutstandingAmount)
    })
  }

  function testSumTotalIncurredIndemnity() {
    final var expectedAmount = 300.00bd
    final var thirdExpectedAmount = expectedAmount / 3

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      entity.PaidToDateIndemnity = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      entity.OutstandingIndemnity = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumTotalIncurredIndemity)
    })
  }

  function testSumTotalIncurredFees() {
    final var expectedAmount = 300.00bd
    final var thirdExpectedAmount = expectedAmount / 3

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeFees = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      entity.PaidToDateFees = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      entity.OutstandingFees = new MonetaryAmount(thirdExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumTotalIncurredFees)
    })
  }

  function testSumTotalIncurred() {
    final var expectedAmount = 600.00bd
    final var sixthExpectedAmount = expectedAmount / 6

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.PaidThisTimeIndemnity = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      entity.PaidToDateIndemnity = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      entity.OutstandingIndemnity = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      entity.PaidThisTimeFees = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      entity.PaidToDateFees = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      entity.OutstandingFees = new MonetaryAmount(sixthExpectedAmount, TC_USD)
      assertEquals(expectedAmount, entity.SumTotalIncurred)
    })
  }

  function testCalculateReceiverShare_OneHundredPercent() {
    final var oneHundredPercentShare = 600.00bd
    final var receiverShare = 100.00bd
    final var expectedAmount = 600.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.ReceiverShare = receiverShare
      assertEquals(expectedAmount, entity.calculateReceiverShare(oneHundredPercentShare))
    })
  }

  function testCalculateReceiverShare_ZeroPercent() {
    final var oneHundredPercentShare = 600.00bd
    final var receiverShare = 0.00bd
    final var expectedAmount = 0.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.ReceiverShare = receiverShare
      assertEquals(expectedAmount, entity.calculateReceiverShare(oneHundredPercentShare))
    })
  }

  function testCalculateReceiverShare_FiftyPercent() {
    final var oneHundredPercentShare = 600.00bd
    final var receiverShare = 50.00bd
    final var expectedAmount = 300.00bd

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      entity.ReceiverShare = receiverShare
      assertEquals(expectedAmount, entity.calculateReceiverShare(oneHundredPercentShare))
    })
  }

  function testFinancialAmountFormatPattern_NotNull() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      assertNotNull(entity.FinancialAmountFormatPattern)
    })
  }

  function testFinancialAmountFormatPattern_LargeAmount() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      final var amountToFormat = 1000000000000.0000000bd
      var decFormatter = new DecimalFormat(entity.FinancialAmountFormatPattern)
      assertEquals("1,000,000,000,000.00", decFormatter.format(amountToFormat))
    })
  }

  function testFinancialAmountFormatPattern_AverageAmount() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      final var amountToFormat = 5500000.00bd
      var decFormatter = new DecimalFormat(entity.FinancialAmountFormatPattern)
      assertEquals("5,500,000.00", decFormatter.format(amountToFormat))
    })
  }

  function testFinancialAmountFormatPattern_ZeroAmount() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      final var amountToFormat = 0.00bd
      var decFormatter = new DecimalFormat(entity.FinancialAmountFormatPattern)
      assertEquals("0.00", decFormatter.format(amountToFormat))
    })
  }

  function testFinancialAmountFormatPattern_ZeroAmountNoDecimal() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = ECFMessageEntityUtil.createNewLMMessageLloydsSCM()
      final var amountToFormat = 0bd
      var decFormatter = new DecimalFormat(entity.FinancialAmountFormatPattern)
      assertEquals("0.00", decFormatter.format(amountToFormat))
    })
  }

}
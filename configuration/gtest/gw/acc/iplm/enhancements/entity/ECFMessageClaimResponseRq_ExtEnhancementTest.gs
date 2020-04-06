package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class ECFMessageClaimResponseRq_ExtEnhancementTest extends GUnitTestClass {

  private var newClaimNotify: ECFMessageClaimNotifyRq_Ext
  private var newClaimResponse: ECFMessageClaimResponseRq_Ext

  private final var PUBLIC_COMMENT = "PublicComment"
  private final var PRIVATE_COMMENT = "PrivateComment"
  private final var PUBLIC_COMMENT_LIMIT = 15
  private final var PRIVATE_COMMENT_LIMIT = 15
  private final var LIRMA_COMMENT_LIMIT = 6
  private final var QUERY_REASON_LIMIT = 10

  function beforeMethod() {
    super.beforeMethod()
    newClaimNotify = ECFMessageEntityUtil.createClaimNotifyRqWithLinkedClaim()
    newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
    newClaimResponse = ECFMessageEntityUtil.createClaimResponseRq()
    newClaimResponse.ReferredUUID = newClaimNotify.UUID
  }

  function afterMethod(t: Throwable) {
    super.afterMethod(t)
    newClaimNotify = null
    newClaimResponse = null
  }

  function testClaimDataResponded() {
    assertEquals(newClaimNotify.UUID, newClaimResponse.ClaimDataResponded.UUID)
  }

  function testClaimDataRespondedWithNullReferredId() {
    newClaimResponse.ReferredUUID = null
    assertNull(newClaimResponse.ClaimDataResponded)
  }

  function testIsFinalResponse() {
    newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY
    assertTrue(newClaimResponse.FinalResponse)
  }

  function testIsNotFinalResponse() {
    newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_QUERY_RETURN
    assertFalse(newClaimResponse.FinalResponse)
  }

  function testQueryReasonAvailable() {
    assertTrue(newClaimResponse.QueryReasonAvailable)
  }

  function testQueryReasonNotAvailable() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      for (1..QUERY_REASON_LIMIT) {
        var newQueryReason = new ECFResponseQueryReason_Ext()
        newQueryReason.ECFMessageClaimResponseRq_Ext = newClaimResponse
        newQueryReason.Reason = ECFQueryReason_Ext.TC_1
        newClaimResponse.addToQueryReasons(newQueryReason)
      }
      assertFalse(newClaimResponse.QueryReasonAvailable)
    })
  }

  function testPublicCommentNotAvailable() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      for (1..PUBLIC_COMMENT_LIMIT) {
        var newComment = new ECFMessagePublicComment_Ext()
        newComment.Detail = PUBLIC_COMMENT
        newClaimResponse.addToPublicComments(newComment)
      }
      assertFalse(newClaimResponse.PublicCommentAvailable)
    })
  }

  function testPublicCommentNotAvailableForLirma() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      for (1..LIRMA_COMMENT_LIMIT) {
        var newComment = new ECFMessagePublicComment_Ext()
        newComment.Detail = PUBLIC_COMMENT
        newClaimResponse.addToPublicComments(newComment)
      }
      assertFalse(newClaimResponse.PublicCommentAvailable)
    })
  }

  function testPrivateCommentAvailable() {
    assertTrue(newClaimResponse.PrivateCommentAvailable)
  }

  function testPrivateCommentNotAvailable() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      for (1..PRIVATE_COMMENT_LIMIT) {
        var newComment = new ECFMessagePrivateComment_Ext()
        newComment.Detail = PRIVATE_COMMENT
        newClaimResponse.addToPrivateComments(newComment)
      }
      assertFalse(newClaimResponse.PrivateCommentAvailable)
    })
  }

  function testPrivateCommentNotAvailableForLirma() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {

      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      assertFalse(newClaimResponse.PrivateCommentAvailable)
    })
  }

  function testAvailableResponseCodesForLloydsLeadAdvice() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LLOYDSLEADADVICE.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLloydsLeadSettlement() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LLOYDSLEADSETTLEMENT.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLloydsSAPAdvice() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LLOYDSSAPADVICE.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLloydsSAPSettlement() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LLOYDSSAPSETTLEMENT.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLirmaLead() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LIRMALEAD.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLirmaSAPAdvice() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LIRMASAPADVICE.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForLirmaSAPSettlement() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_LIRMASAPSETTLEMENT.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testAvailableResponseCodesForILU() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_ILU
    }, User.util.getUnrestrictedUser())
    assertTrue(ECFResponseCode_Ext.TF_ILU.getTypeKeys().containsAll(newClaimResponse.AvailableResponseCodes))
  }

  function testValidateAtLeastOneCommentForLloyds() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      var newComment = new ECFMessagePrivateComment_Ext()
      newComment.Detail = PRIVATE_COMMENT
      newClaimResponse.addToPrivateComments(newComment)
      assertNull(newClaimResponse.validateAtLeastOneComment())
    })
  }

  function testValidateAtLeastOneCommentForLloydsErrorCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.PublicComments = new ECFMessagePublicComment_Ext[]{}
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[]{}
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_PUBLIC_COMMENT_OR_ONE_PRIVATE_COMMENT.toString(), newClaimResponse.validateAtLeastOneComment())
  }

  function testValidateAtLeastOneCommentForLirma() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      var newComment = new ECFMessagePublicComment_Ext()
      newComment.Detail = PUBLIC_COMMENT
      newClaimResponse.addToPublicComments(newComment)
      assertNull(newClaimResponse.validateAtLeastOneComment())
    })
  }

  function testValidateAtLeastOneCommentForLirmaErrorCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.PublicComments = new ECFMessagePublicComment_Ext[]{}
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[]{}
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_COMMENT.toString(), newClaimResponse.validateAtLeastOneComment())
  }

  function testGetCategoryCodeTypeKey() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CategoryCode = ECFClaimCategoryCode_Ext.TC_A
      newClaimResponse.CategoryCode = null
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFClaimCategoryCode_Ext.TC_A, newClaimResponse.CategoryCodeTypeKey)
  }

  function testSetSameCategoryCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CategoryCode = ECFClaimCategoryCode_Ext.TC_A
      newClaimResponse.CategoryCode = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CategoryCodeTypeKey = ECFClaimCategoryCode_Ext.TC_A
    assertEquals(ECFClaimCategoryCode_Ext.TC_A, newClaimResponse.CategoryCode)
  }

  function testSetDiffCategoryCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.CategoryCode = ECFClaimCategoryCode_Ext.TC_A
      newClaimResponse.CategoryCode = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.CategoryCodeTypeKey = ECFClaimCategoryCode_Ext.TC_B
    assertEquals(ECFClaimCategoryCode_Ext.TC_B, newClaimResponse.CategoryCode)
  }

  function testGetSubCategoryCodeTypeKey() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SubCategoryCode = ECFClaimSubCatCode_Ext.TC_AB
      newClaimResponse.SubCategoryCode = null
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFClaimSubCatCode_Ext.TC_AB, newClaimResponse.SubCategoryCodeTypeKey)
  }

  function testSetSameSubCategoryCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SubCategoryCode = ECFClaimSubCatCode_Ext.TC_AB
      newClaimResponse.SubCategoryCode = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SubCategoryCodeTypeKey = ECFClaimSubCatCode_Ext.TC_AB
    assertEquals(ECFClaimSubCatCode_Ext.TC_AB, newClaimResponse.SubCategoryCode)
  }

  function testSetDiffSubCategoryCode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimNotify.SubCategoryCode = ECFClaimSubCatCode_Ext.TC_AB
      newClaimResponse.SubCategoryCode = null
    }, User.util.getUnrestrictedUser())
    newClaimResponse.SubCategoryCodeTypeKey = ECFClaimSubCatCode_Ext.TC_AD
    assertEquals(ECFClaimSubCatCode_Ext.TC_AD, newClaimResponse.SubCategoryCode)
  }

  function testClassOfBusinessRequiredLLoydsShouldBeFalse() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
    }, User.util.getUnrestrictedUser())
    assertFalse("Class of Business should not be required for Lloyds", newClaimResponse.ClassOfBusinessRequired)
  }

  function testClassOfBusinessRequiredILUShouldBeFalseWhenInBulkMode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_ILU
      newClaimNotify.ClaimType = ECFClaimTypeCode_Ext.TC_001
    }, User.util.getUnrestrictedUser())
    assertFalse("Class of Business should not be required for ILU in Bulk Mode", newClaimResponse.ClassOfBusinessRequired)
  }

  function testClassOfBusinessRequiredILUShouldBeTrueWhenNotInBulkMode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_ILU
      newClaimNotify.ClaimType = ECFClaimTypeCode_Ext.TC_000
    }, User.util.getUnrestrictedUser())
    assertTrue("Class of Business should be required for ILU not in Bulk Mode", newClaimResponse.ClassOfBusinessRequired)
  }

  function testClassOfBusinessRequiredLIRMAShouldBeFalseWhenInBulkMode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimNotify.ClaimType = ECFClaimTypeCode_Ext.TC_001
    }, User.util.getUnrestrictedUser())
    assertFalse("Class of Business should not be required for LIRMA in Bulk Mode", newClaimResponse.ClassOfBusinessRequired)
  }

  function testClassOfBusinessRequiredLIRMAShouldBeTrueWhenNotInBulkMode() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimNotify.ClaimType = ECFClaimTypeCode_Ext.TC_000
    }, User.util.getUnrestrictedUser())
    assertTrue("Class of Business should be required for LIRMA not in Bulk Mode", newClaimResponse.ClassOfBusinessRequired)
  }

  function testSetNewPrivateComments() {
    var commentString = "This is a comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals(commentString, newClaimResponse.PrivateComments.first().Detail)
      assertEquals(1, newClaimResponse.PrivateComments.first().LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_TwoCommentsWithNewLine() {
    var commentString = "This is a comment\nThis is a second comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals("This is a comment", newClaimResponse.PrivateComments[0].Detail)
      assertEquals("This is a second comment", newClaimResponse.PrivateComments[1].Detail)
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PrivateComments[1].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_TwoCommentsOver70Chars() {
    var commentString = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbThis is a comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", newClaimResponse.PrivateComments[0].Detail)
      assertEquals("This is a comment", newClaimResponse.PrivateComments[1].Detail)
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PrivateComments[1].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_TwoCommentsWithSpecialChars() {
    var commentString = "<This is a Special Comment & this is supposed to return two lines>"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
      assertEquals("<This is a Special Comment & this is supposed to return two lin", newClaimResponse.PrivateComments[0].Detail)
      assertEquals(2, newClaimResponse.PrivateComments[1].LineNumber)
      assertEquals("es>", newClaimResponse.PrivateComments[1].Detail)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_15CommentsWithMixedLineBreaks() {
    var commentString = "test1" +
        "\ntest2" +
        "\ntest3" +
        "\ntesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestteblahblahblahblahblahblahblahblahblahblahblahblahblahblah" +
        "\ntest5" +
        "\ntesttesttest6" +
        "\ntesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest" +
        "\ntest7" +
        "\ntest8" +
        "\ntest9" +
        "\ntest10" +
        "\ntest2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2"

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals("test1", newClaimResponse.PrivateComments[0].Detail)
      assertEquals("test2", newClaimResponse.PrivateComments[1].Detail)
      assertEquals("test3", newClaimResponse.PrivateComments[2].Detail)
      assertEquals("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestte", newClaimResponse.PrivateComments[3].Detail)
      assertEquals("blahblahblahblahblahblahblahblahblahblahblahblahblahblah", newClaimResponse.PrivateComments[4].Detail)
      assertEquals("test5", newClaimResponse.PrivateComments[5].Detail)
      assertEquals("testtesttest6", newClaimResponse.PrivateComments[6].Detail)
      assertEquals("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestte", newClaimResponse.PrivateComments[7].Detail)
      assertEquals("sttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest", newClaimResponse.PrivateComments[8].Detail)
      assertEquals("test7", newClaimResponse.PrivateComments[9].Detail)
      assertEquals("test8", newClaimResponse.PrivateComments[10].Detail)
      assertEquals("test9", newClaimResponse.PrivateComments[11].Detail)
      assertEquals("test10", newClaimResponse.PrivateComments[12].Detail)
      assertEquals("test2test2test2test2test2test2test2test2test2test2test2test2test2test2", newClaimResponse.PrivateComments[13].Detail)
      assertEquals("test2test2test2test2test2test2test2test2test2test2test2test2test2test2", newClaimResponse.PrivateComments[14].Detail)

      for (i in 0..14) {
        assertEquals(i + 1, newClaimResponse.PrivateComments[i].LineNumber)
      }
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_UserDeletesACommentLine() {
    var comment1 = "This is a comment"
    var comment2 = "This is a second comment"
    var commentString = comment1 + "\n" + comment2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals(comment1, newClaimResponse.PrivateComments[0].Detail)
      assertEquals(comment2, newClaimResponse.PrivateComments[1].Detail)
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PrivateComments[1].LineNumber)

      newClaimResponse.NewPrivateComments = comment2

      assertEquals(1, newClaimResponse.PrivateComments.Count)
      assertEquals(comment2, newClaimResponse.PrivateComments[0].Detail)
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPrivateComments_UserDeletesAllComments() {
    var comment1 = "This is a comment"
    var comment2 = "This is a second comment"
    var commentString = comment1 + "\n" + comment2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPrivateComments = commentString
      assertEquals(comment1, newClaimResponse.PrivateComments[0].Detail)
      assertEquals(comment2, newClaimResponse.PrivateComments[1].Detail)
      assertEquals(1, newClaimResponse.PrivateComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PrivateComments[1].LineNumber)

      newClaimResponse.NewPrivateComments = ""

      assertEquals(0, newClaimResponse.PrivateComments.Count)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments() {
    var commentString = "This is a comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals(commentString, newClaimResponse.PublicComments.first().Detail)
      assertEquals(1, newClaimResponse.PublicComments.first().LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments_TwoCommentsWithNewLine() {
    var commentString = "This is a comment\nThis is a second comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals("This is a comment", newClaimResponse.PublicComments[0].Detail)
      assertEquals("This is a second comment", newClaimResponse.PublicComments[1].Detail)
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PublicComments[1].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments_TwoCommentsWithSpecialChars() {
    var commentString = "<This is a Special Comment & this is supposed to return two lines>"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
      assertEquals("<This is a Special Comment & this is supposed to return two lin", newClaimResponse.PublicComments[0].Detail)
      assertEquals(2, newClaimResponse.PublicComments[1].LineNumber)
      assertEquals("es>", newClaimResponse.PublicComments[1].Detail)
    }, User.util.getUnrestrictedUser())
  }


  function testSetNewPublicComments_TwoCommentsOver70Chars() {
    var commentString = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbThis is a comment"
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", newClaimResponse.PublicComments[0].Detail)
      assertEquals("This is a comment", newClaimResponse.PublicComments[1].Detail)
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PublicComments[1].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments_15CommentsWithMixedLineBreaks() {
    var commentString = "test1" +
        "\ntest2" +
        "\ntest3" +
        "\ntesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestteblahblahblahblahblahblahblahblahblahblahblahblahblahblah" +
        "\ntest5" +
        "\ntesttesttest6" +
        "\ntesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest" +
        "\ntest7" +
        "\ntest8" +
        "\ntest9" +
        "\ntest10" +
        "\ntest2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2test2"

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals("test1", newClaimResponse.PublicComments[0].Detail)
      assertEquals("test2", newClaimResponse.PublicComments[1].Detail)
      assertEquals("test3", newClaimResponse.PublicComments[2].Detail)
      assertEquals("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestte", newClaimResponse.PublicComments[3].Detail)
      assertEquals("blahblahblahblahblahblahblahblahblahblahblahblahblahblah", newClaimResponse.PublicComments[4].Detail)
      assertEquals("test5", newClaimResponse.PublicComments[5].Detail)
      assertEquals("testtesttest6", newClaimResponse.PublicComments[6].Detail)
      assertEquals("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestte", newClaimResponse.PublicComments[7].Detail)
      assertEquals("sttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest", newClaimResponse.PublicComments[8].Detail)
      assertEquals("test7", newClaimResponse.PublicComments[9].Detail)
      assertEquals("test8", newClaimResponse.PublicComments[10].Detail)
      assertEquals("test9", newClaimResponse.PublicComments[11].Detail)
      assertEquals("test10", newClaimResponse.PublicComments[12].Detail)
      assertEquals("test2test2test2test2test2test2test2test2test2test2test2test2test2test2", newClaimResponse.PublicComments[13].Detail)
      assertEquals("test2test2test2test2test2test2test2test2test2test2test2test2test2test2", newClaimResponse.PublicComments[14].Detail)

      for (i in 0..14) {
        assertEquals(i + 1, newClaimResponse.PublicComments[i].LineNumber)
      }
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments_UserDeletesACommentLine() {
    var comment1 = "This is a comment"
    var comment2 = "This is a second comment"
    var commentString = comment1 + "\n" + comment2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals(comment1, newClaimResponse.PublicComments[0].Detail)
      assertEquals(comment2, newClaimResponse.PublicComments[1].Detail)
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PublicComments[1].LineNumber)

      newClaimResponse.NewPublicComments = comment2

      assertEquals(1, newClaimResponse.PublicComments.Count)
      assertEquals(comment2, newClaimResponse.PublicComments[0].Detail)
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
    }, User.util.getUnrestrictedUser())
  }

  function testSetNewPublicComments_UserDeletesAllComments() {
    var comment1 = "This is a comment"
    var comment2 = "This is a second comment"
    var commentString = comment1 + "\n" + comment2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.NewPublicComments = commentString
      assertEquals(comment1, newClaimResponse.PublicComments[0].Detail)
      assertEquals(comment2, newClaimResponse.PublicComments[1].Detail)
      assertEquals(1, newClaimResponse.PublicComments[0].LineNumber)
      assertEquals(2, newClaimResponse.PublicComments[1].LineNumber)

      newClaimResponse.NewPublicComments = ""

      assertEquals(0, newClaimResponse.PublicComments.Count)
    }, User.util.getUnrestrictedUser())
  }

  function testPublicCommentEditable_WithZeroPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = new ECFMessagePublicComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertEquals(PUBLIC_COMMENT_LIMIT, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertTrue("Public comments should be editable since there are no previous comments.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithZeroPreviousCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(LIRMA_COMMENT_LIMIT, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertTrue("Public comments should be editable since there are no previous comments.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithFullPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertFalse("Public comments shouldn't be editable since previous comments are filling the limit.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithFullPreviousCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(LIRMA_COMMENT_LIMIT)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertFalse("Public comments shouldn't be editable since previous comments are filling the limit.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithExceedingPreviousComments() {
    var exceedingLineCount = PUBLIC_COMMENT_LIMIT + 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(exceedingLineCount)
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.PublicCommentAvailableLineCountForResponse < 0)
    assertFalse("Public comments shouldn't be editable since previous comments are exceeding the limit.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithExceedingPreviousCommentsForLirma() {
    var exceedingLineCount = LIRMA_COMMENT_LIMIT + 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(exceedingLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.PublicCommentAvailableLineCountForResponse < 0)
    assertFalse("Public comments shouldn't be editable since previous comments are exceeding the limit.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithHalfFullPreviousComments() {
    var halfFullLineCount = PUBLIC_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(halfFullLineCount)
    }, User.util.getUnrestrictedUser())
    assertEquals(PUBLIC_COMMENT_LIMIT - halfFullLineCount, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertTrue("Public comments should be editable since previous comments are just filling the half.", newClaimResponse.PublicCommentEditable)
  }

  function testPublicCommentEditable_WithHalfFullPreviousCommentsForLirma() {
    var halfFullLineCount = LIRMA_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(halfFullLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(LIRMA_COMMENT_LIMIT - halfFullLineCount, newClaimResponse.PublicCommentAvailableLineCountForResponse)
    assertTrue("Public comments should be editable since previous comments are just filling the half.", newClaimResponse.PublicCommentEditable)
  }

  function testPrivateCommentEditable_WithZeroPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = new ECFMessagePrivateComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertEquals(PRIVATE_COMMENT_LIMIT, newClaimResponse.PrivateCommentAvailableLineCountForResponse)
    assertTrue("Private comments should be editable since there are no previous comments.", newClaimResponse.PrivateCommentEditable)
  }

  function testPrivateCommentEditable_WithZeroPreviousCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = new ECFMessagePrivateComment_Ext[0]
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.PrivateCommentAvailableLineCountForResponse)
    assertFalse("Private comments should not be editable for Lirma.", newClaimResponse.PrivateCommentEditable)
  }

  function testPrivateCommentEditable_WithFullPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.PrivateCommentAvailableLineCountForResponse)
    assertFalse("Private comments shouldn't be editable since previous comments are filling the limit.", newClaimResponse.PrivateCommentEditable)
  }

  function testPrivateCommentEditable_WithExceedingPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT + 2)
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.PrivateCommentAvailableLineCountForResponse < 0)
    assertFalse("Private comments shouldn't be editable since previous comments are exceeding the limit.", newClaimResponse.PrivateCommentEditable)
  }

  function testPrivateCommentEditable_WithHalfFullPreviousComments() {
    var halfFullLineCount = PRIVATE_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(halfFullLineCount)
    }, User.util.getUnrestrictedUser())
    assertEquals(PRIVATE_COMMENT_LIMIT - halfFullLineCount, newClaimResponse.PrivateCommentAvailableLineCountForResponse)
    assertTrue("Private comments should be editable since previous comments are just filling the half.", newClaimResponse.PrivateCommentEditable)
  }

  private function createPublicComments(lineNumber: int): ECFMessagePublicComment_Ext[] {
    var comments = new ECFMessagePublicComment_Ext[lineNumber]
    for (0..lineNumber - 1index idx) {
      var newComment = new ECFMessagePublicComment_Ext()
      newComment.Detail = PUBLIC_COMMENT
      comments[idx] = newComment
    }
    return comments
  }

  private function createPrivateComments(lineNumber: int): ECFMessagePrivateComment_Ext[] {
    var comments = new ECFMessagePrivateComment_Ext[lineNumber]
    for (0..lineNumber - 1index idx) {
      var newComment = new ECFMessagePrivateComment_Ext()
      newComment.Detail = PRIVATE_COMMENT
      comments[idx] = newComment
    }
    return comments
  }

  function testRemainingPublicLineCount_WithZeroPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = new ECFMessagePublicComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertEquals(PUBLIC_COMMENT_LIMIT, newClaimResponse.RemainingPublicLineCount)
  }

  function testRemainingPublicLineCount_WithFullComments() {
    var halfFullLineCount = PUBLIC_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(halfFullLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT - halfFullLineCount)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.RemainingPublicLineCount)
  }

  function testRemainingPublicLineCount_WithExceedingComments() {
    var halfFullLineCount = PUBLIC_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(halfFullLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.RemainingPublicLineCount)
  }

  function testRemainingPublicLineCount_WithHalfFullPreviousComments() {
    var halfFullLineCountForPreviousComment = PUBLIC_COMMENT_LIMIT / 4
    var halfFullLineCountForCurrentComments = PUBLIC_COMMENT_LIMIT / 4
    var remaining = PUBLIC_COMMENT_LIMIT - halfFullLineCountForPreviousComment - halfFullLineCountForCurrentComments
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(halfFullLineCountForPreviousComment)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(halfFullLineCountForCurrentComments)
    }, User.util.getUnrestrictedUser())
    assertEquals(remaining, newClaimResponse.RemainingPublicLineCount)
  }

  function testRemainingPrivateLineCount_WithZeroPreviousComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = new ECFMessagePrivateComment_Ext[0]
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertEquals(PRIVATE_COMMENT_LIMIT, newClaimResponse.RemainingPrivateLineCount)
  }

  function testRemainingPrivateLineCount_WithFullComments() {
    var halfFullLineCount = PRIVATE_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(halfFullLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT - halfFullLineCount)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.RemainingPrivateLineCount)
  }

  function testRemainingPrivateLineCount_WithExceedingComments() {
    var halfFullLineCount = PRIVATE_COMMENT_LIMIT / 2
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(halfFullLineCount)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
    }, User.util.getUnrestrictedUser())
    assertEquals(0, newClaimResponse.RemainingPrivateLineCount)
  }

  function testRemainingPrivateLineCount_WithHalfFullPreviousComments() {
    var halfFullLineCountForPreviousComment = PRIVATE_COMMENT_LIMIT / 4
    var halfFullLineCountForCurrentComments = PRIVATE_COMMENT_LIMIT / 4
    var remaining = PRIVATE_COMMENT_LIMIT - halfFullLineCountForPreviousComment - halfFullLineCountForCurrentComments
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PrivateComments = createPrivateComments(halfFullLineCountForPreviousComment)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = createPrivateComments(halfFullLineCountForCurrentComments)
    }, User.util.getUnrestrictedUser())
    assertEquals(remaining, newClaimResponse.RemainingPrivateLineCount)
  }

  function testValidatePublicComments_WithZeroComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_PUBLIC_COMMENT_OR_ONE_PRIVATE_COMMENT.toString(), newClaimResponse.validatePublicComments())
  }

  function testValidatePublicComments_WithZeroCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[0]
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_COMMENT.toString(), newClaimResponse.validatePublicComments())
  }

  function testValidatePublicComments_WithExceedingComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT + 2)
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_PUBLIC_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
        .prepareMessage({String.valueOf(newClaimResponse.PublicCommentAvailableLineCountForResponse)}).toString(),
        newClaimResponse.validatePublicComments())
  }

  function testValidatePublicComments_WithExceedingCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(LIRMA_COMMENT_LIMIT + 2)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
        .prepareMessage({String.valueOf(newClaimResponse.PublicCommentAvailableLineCountForResponse)}).toString(),
        newClaimResponse.validatePublicComments())
  }

  function testValidatePublicComments_WithHalfFullComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT / 2)
    }, User.util.getUnrestrictedUser())
    assertNull(newClaimResponse.validatePublicComments())
  }

  function testValidatePublicComments_WithHalfFullCommentsForLirma() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PublicComments = createPublicComments(LIRMA_COMMENT_LIMIT / 2)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
    }, User.util.getUnrestrictedUser())
    assertNull(newClaimResponse.validatePublicComments())
  }

  function testValidatePrivateComments_WithZeroComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = new ECFMessagePrivateComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertNull(newClaimResponse.validatePrivateComments())
  }

  function testValidatePrivateComments_WithExceedingComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT + 2)
    }, User.util.getUnrestrictedUser())
    assertEquals(ECFErrorCodeType.ECF_PRIVATE_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
        .prepareMessage({String.valueOf(newClaimResponse.PrivateCommentAvailableLineCountForResponse)}).toString(),
        newClaimResponse.validatePrivateComments())
  }

  function testValidatePrivateComments_WithHalfFullComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT / 2)
    }, User.util.getUnrestrictedUser())
    assertNull(newClaimResponse.validatePrivateComments())
  }

  function testCommentsLimitReachedByIncomingMessage_WithRespondableMessageAndZeroPrevComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimNotify.PrivateComments = new ECFMessagePrivateComment_Ext[0]
      newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testCommentsLimitReachedByIncomingMessage_WithRespondableMessageAndFullPrevComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testCommentsLimitReachedByIncomingMessage_WithRespondableMessageAndFullPrevCommentsAndLloydsSAP() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testCommentsLimitReachedByIncomingMessage_WithRespondableMessageAndFullPrevCommentsAndLirmaLead() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testCommentsLimitReachedByIncomingMessage_WithRespondableMessageAndFullPrevCommentsButLirmaSAP() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimNotify.ECFTransactionState = createTransactionState(newClaimNotify)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testCommentsLimitReachedByIncomingMessage_WithNotRespondableMessageAndFullPrevComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimNotify.ECFTransactionState.Agreed = true
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.commentsLimitReachedByIncomingMessage())
  }

  function testResponseSendAvailable_WithZeroPrevComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = new ECFMessagePublicComment_Ext[0]
      newClaimNotify.PrivateComments = new ECFMessagePrivateComment_Ext[0]
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.responseSendAvailable())
  }

  function testResponseSendAvailable_WithFullPrevComments() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.responseSendAvailable())
  }

  function testResponseSendAvailable_WithFullPrevCommentsAndLloydsSAP() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.responseSendAvailable())
  }

  function testResponseSendAvailable_WithFullPrevCommentsAndLirmaLead() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    }, User.util.getUnrestrictedUser())
    assertFalse(newClaimResponse.responseSendAvailable())
  }

  function testResponseSendAvailable_WithFullPrevCommentsAndLirmaLeadWithCompanyActions() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.LIRMALeadActions = false
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.responseSendAvailable())
  }

  function testResponseSendAvailable_WithFullPrevCommentsButLirmaSAP() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
      newClaimNotify.PrivateComments = createPrivateComments(PRIVATE_COMMENT_LIMIT)
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    }, User.util.getUnrestrictedUser())
    assertTrue(newClaimResponse.responseSendAvailable())
  }

  function testPopulateLeadContacts_LeadAndFirstAdvice() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE

      prepareContactDetails()

      newClaimResponse.processBeforeValidate()

      assertEquals(newClaimResponse.ContactName, newClaimResponse.LeadContactName)
      assertEquals(newClaimResponse.ContactEmail, newClaimResponse.LeadContactEmail)
      assertEquals(newClaimResponse.ContactTelephone, newClaimResponse.LeadContactTelephone)
    })
  }

  function testPopulateLeadContacts_SAPAndFirstAdvice() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE

      prepareContactDetails()

      newClaimResponse.processBeforeValidate()

      assertNull(newClaimResponse.LeadContactName)
      assertNull(newClaimResponse.LeadContactEmail)
      assertNull(newClaimResponse.LeadContactTelephone)
    })
  }

  function testPopulateLeadContacts_LeadAndFirstAdviceAndSettlement() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICEANDSETTLEMENT

      prepareContactDetails()

      newClaimResponse.processBeforeValidate()

      assertNull(newClaimResponse.LeadContactName)
      assertNull(newClaimResponse.LeadContactEmail)
      assertNull(newClaimResponse.LeadContactTelephone)
    })
  }

  function testPopulateLeadContacts_LirmaLeadActions() {
    changeClaimNotify(ECFBureauType_Ext.TC_LIRMA, ECFTransactionStatus_Ext.TC_20_CIRCULATED)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE

      prepareContactDetails()

      newClaimResponse.processBeforeValidate()

      assertEquals(newClaimResponse.ContactName, newClaimResponse.LeadContactName)
      assertEquals(newClaimResponse.ContactEmail, newClaimResponse.LeadContactEmail)
      assertEquals(newClaimResponse.ContactTelephone, newClaimResponse.LeadContactTelephone)
    })
  }

  function testPopulateLeadContacts_LirmaCompanyActions() {
    changeClaimNotify(ECFBureauType_Ext.TC_LIRMA, ECFTransactionStatus_Ext.TC_20_CIRCULATED)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = false
      newClaimResponse.TransactionType = ECFClaimTransactionType_Ext.TC_FIRSTADVICE

      prepareContactDetails()

      newClaimResponse.processBeforeValidate()

      assertNull(newClaimResponse.LeadContactName)
      assertNull(newClaimResponse.LeadContactEmail)
      assertNull(newClaimResponse.LeadContactTelephone)
    })
  }

  function testClearLirmaLeadUnusedActions_LirmaLead(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      prepareActions()
      newClaimResponse.processBeforeValidate()

      assertNull(newClaimResponse.InsurerOrReinsurerClaimRef1)
      assertNull(newClaimResponse.InsurerOrReinsurerClaimRef2)
      assertNull(newClaimResponse.RequestToBroker1)
      assertNull(newClaimResponse.RequestToBroker2)
      assertNull(newClaimResponse.PrivateFootnote)
      assertNull(newClaimResponse.NoFurtherResponseIndicator)
      assertNull(newClaimResponse.ImmediatePartCollectionInd)
      assertNull(newClaimResponse.MultipleResponseIndicator)
    })
  }

  function testClearLirmaLeadUnusedActions_LirmaLeadCompanyActions(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.LIRMALeadActions = false

      newClaimResponse.ContactName = "Other Name"
      newClaimResponse.ContactEmail = "Other Email"
      newClaimResponse.ContactTelephone = "Other Telephone"
      newClaimResponse.LeadReserveAmount1 = newClaimNotify.Financials[0].LeadReserveAmount * 10

      prepareActions()
      newClaimResponse.processBeforeValidate()

      var currentUser = User.util.CurrentUser

      assertEquals(currentUser.Contact.DisplayName, newClaimResponse.ContactName)
      assertEquals(currentUser.Contact.EmailAddress1?:currentUser.Contact.EmailAddress1, newClaimResponse.ContactEmail)
      assertEquals(currentUser.Contact.PrimaryPhoneValue?:currentUser.Contact.CellPhone, newClaimResponse.ContactTelephone)
      assertNull(newClaimResponse.ClassOfBusiness)
      assertNull(newClaimResponse.CategoryCode)
      assertNull(newClaimResponse.SubCategoryCode)
      assertNull(newClaimResponse.CedantInLiquidationIndicator)
      assertNull(newClaimResponse.SimultaneousRIPIndicator)
      assertNull(newClaimResponse.MinorPrecautionaryIndicator)
      assertNull(newClaimResponse.ChaseUpIndicator)
      assertNull(newClaimResponse.ChaseUpIndicatorInterval)
      assertNull(newClaimResponse.ContractConditionsApplyInd)
      assertNull(newClaimResponse.AllUnderwritersToSeeFileInd)
      assertZero(newClaimResponse.PublicComments.Count)
      assertEquals(newClaimNotify.FinancialsSortedByCurrency[0].LeadReserveAmount, newClaimResponse.LeadReserveAmount1)
      assertNull(newClaimResponse.ImportedServicesNarrative1)
    })
  }

  function testClearLirmaLeadUnusedActions_LirmaSAP(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      prepareActions()
      newClaimResponse.processBeforeValidate()

      assertNotNull(newClaimResponse.ContactName)
      assertNotNull(newClaimResponse.ContactEmail)
      assertNotNull(newClaimResponse.ContactTelephone)
      assertNotNull(newClaimResponse.ClassOfBusiness)
      assertNotNull(newClaimResponse.CategoryCode)
      assertNotNull(newClaimResponse.SubCategoryCode)
      assertNotNull(newClaimResponse.CedantInLiquidationIndicator)
      assertNotNull(newClaimResponse.SimultaneousRIPIndicator)
      assertNotNull(newClaimResponse.MinorPrecautionaryIndicator)
      assertNotNull(newClaimResponse.ChaseUpIndicator)
      assertNotNull(newClaimResponse.ChaseUpIndicatorInterval)
      assertNotNull(newClaimResponse.ContractConditionsApplyInd)
      assertNotNull(newClaimResponse.AllUnderwritersToSeeFileInd)
      assertEquals(PUBLIC_COMMENT_LIMIT, newClaimResponse.PublicComments.Count)
      assertNotNull(newClaimResponse.InsurerOrReinsurerClaimRef1)
      assertNotNull(newClaimResponse.InsurerOrReinsurerClaimRef2)
      assertNotNull(newClaimResponse.RequestToBroker1)
      assertNotNull(newClaimResponse.RequestToBroker2)
      assertNotNull(newClaimResponse.PrivateFootnote)
      assertNotNull(newClaimResponse.NoFurtherResponseIndicator)
      assertNotNull(newClaimResponse.ImmediatePartCollectionInd)
      assertNotNull(newClaimResponse.MultipleResponseIndicator)
      assertNotNull(newClaimResponse.ImportedServicesNarrative1)
      assertEquals(newClaimNotify.Financials[0].LeadReserveAmount, newClaimResponse.LeadReserveAmount1)
    })
  }

  function testClearLirmaLeadUnusedActions_LLoydsLead(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      prepareActions()
      newClaimResponse.processBeforeValidate()

      assertNotNull(newClaimResponse.ContactName)
      assertNotNull(newClaimResponse.ContactEmail)
      assertNotNull(newClaimResponse.ContactTelephone)
      assertNotNull(newClaimResponse.ClassOfBusiness)
      assertNotNull(newClaimResponse.CategoryCode)
      assertNotNull(newClaimResponse.SubCategoryCode)
      assertNotNull(newClaimResponse.CedantInLiquidationIndicator)
      assertNotNull(newClaimResponse.SimultaneousRIPIndicator)
      assertNotNull(newClaimResponse.MinorPrecautionaryIndicator)
      assertNotNull(newClaimResponse.ChaseUpIndicator)
      assertNotNull(newClaimResponse.ChaseUpIndicatorInterval)
      assertNotNull(newClaimResponse.ContractConditionsApplyInd)
      assertNotNull(newClaimResponse.AllUnderwritersToSeeFileInd)
      assertEquals(PUBLIC_COMMENT_LIMIT, newClaimResponse.PublicComments.Count)
      assertNotNull(newClaimResponse.InsurerOrReinsurerClaimRef1)
      assertNotNull(newClaimResponse.InsurerOrReinsurerClaimRef2)
      assertNotNull(newClaimResponse.RequestToBroker1)
      assertNotNull(newClaimResponse.RequestToBroker2)
      assertNotNull(newClaimResponse.PrivateFootnote)
      assertNotNull(newClaimResponse.NoFurtherResponseIndicator)
      assertNotNull(newClaimResponse.ImmediatePartCollectionInd)
      assertNotNull(newClaimResponse.MultipleResponseIndicator)
      assertNotNull(newClaimResponse.ImportedServicesNarrative1)
      assertEquals(newClaimNotify.Financials[0].LeadReserveAmount, newClaimResponse.LeadReserveAmount1)
    })
  }

  function testLirmaLeadResponseKeys_LeadAction() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertEquals(newClaimResponse.AvailableResponseCodes, ECFResponseCode_Ext.TF_LIRMALEAD.TypeKeys)
    })
  }

  function testLirmaLeadResponseKeys_LeadAction_Circulated() {
    changeClaimNotify(ECFBureauType_Ext.TC_LIRMA, ECFTransactionStatus_Ext.TC_20_CIRCULATED)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertEquals(newClaimResponse.AvailableResponseCodes, ECFResponseCode_Ext.TF_LIRMALEADCIRCULATED.TypeKeys)
    })
  }

  function testLirmaLeadResponseKeys_SAPAction() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = false

      assertEquals(newClaimResponse.AvailableResponseCodes, ECFResponseCode_Ext.TF_LIRMASAPSETTLEMENT.TypeKeys)
    })
  }

  function testLirmaResponse_LLoyds() {
    assertFalse(newClaimResponse.LirmaResponse)
  }

  function testLirmaResponse_LIRMA() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA

      assertTrue(newClaimResponse.LirmaResponse)
    })
  }

  function testLirmaLeadWithCompanyActions() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = false

      assertTrue(newClaimResponse.LirmaLeadWithCompanyActions)
    })
  }

  function testLirmaLeadWithCompanyActions_LeadActions() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertFalse(newClaimResponse.LirmaLeadWithCompanyActions)
    })
  }

  function testLirmaLeadWithCompanyActions_LirmaAgreementParty() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      newClaimResponse.LIRMALeadActions = true

      assertFalse(newClaimResponse.LirmaLeadWithCompanyActions)
    })
  }

  function testLirmaLeadWithCompanyActions_LloydsLead() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertFalse(newClaimResponse.LirmaLeadWithCompanyActions)
    })
  }

  function testRespondAsParticipantFunction_LirmaLeadWithCompanyActions(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = false

      assertEquals(ECFParticipantFunction_Ext.TC_AGREEMENTPARTY, newClaimResponse.RespondAsParticipantFunction)
    })
  }

  function testRespondAsParticipantFunction_LirmaLeadWithLeadActions(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LIRMA
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertEquals(ECFParticipantFunction_Ext.TC_LEAD, newClaimResponse.RespondAsParticipantFunction)
    })
  }

  function testRespondAsParticipantFunction_LloydsLead(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.BureauType = ECFBureauType_Ext.TC_LLOYDS
      newClaimResponse.ParticipantFunction = ECFParticipantFunction_Ext.TC_LEAD
      newClaimResponse.LIRMALeadActions = true

      assertEquals(ECFParticipantFunction_Ext.TC_LEAD, newClaimResponse.RespondAsParticipantFunction)
    })
  }

  function testIsAgreement_SeenAction(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_SEEN_ACTION

      assertTrue(newClaimResponse.Agreement)
    })
  }

  function testIsAgreement_AgreePay(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_AGREE_PAY

      assertTrue(newClaimResponse.Agreement)
    })
  }

  function testIsAgreement_CAA(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_CAA

      assertTrue(newClaimResponse.Agreement)
    })
  }

  function testIsAgreement_YES(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_YES

      assertTrue(newClaimResponse.Agreement)
    })
  }

  function testIsAgreement_AUT(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_AUT

      assertTrue(newClaimResponse.Agreement)
    })
  }

  function testIsAgreement_False(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_QUERY_RETURN

      assertFalse(newClaimResponse.Agreement)
    })
  }

  function testCheckFinancialAuthorisation_TrueWhenNotAgreement(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_QUERY_RETURN

      assertTrue(newClaimResponse.checkFinancialAuthorisation())
    })
  }

  function testCheckFinancialAuthorisation_TrueWhenZeroShare(): void {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.ResponseCode = ECFResponseCode_Ext.TC_AUT

      var claimData = bundle.add(newClaimResponse.ClaimDataResponded)
      claimData.ECFContractMarkets.
          firstWhere(\elt -> elt.PartyID == newClaimResponse.ClaimDataResponded.ReceiverPartyId)
          .InsurerSharePercentage = 0

      assertTrue(newClaimResponse.checkFinancialAuthorisation())
    })
  }

  function testApprovalHistory() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.Claim = ClaimBuilderHelper.createClaim()

      new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).createActivity()
      new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).withActivityPatternName(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN).createActivity()
      new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).withActivityPatternName(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN).createActivity()

      assertEquals(2, newClaimResponse.ApprovalHistory.length)
    })
  }

  function testApprovalActivity() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      newClaimResponse = bundle.add(newClaimResponse)
      newClaimResponse.Claim = ClaimBuilderHelper.createClaim()

      var act1 = new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).createActivity()
      var act2 = new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).withActivityPatternName(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN).createActivity()
      var act3 = new ActivityBuilder(newClaimResponse.Claim).withMessage(newClaimResponse).withActivityPatternName(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN).createActivity()

      assertEquals(act3, newClaimResponse.ApprovalActivity)
    })
  }

  private function createTransactionState(message: ECFMessageClaimData_Ext): ECFTransactionState_Ext {
    var transactionState: ECFTransactionState_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      transactionState = new ECFTransactionState_Ext(bundle)
      transactionState.UUID = message.UUID
      transactionState.TransactionSequence = Integer.parseInt(message.TransactionSequence)
      transactionState.ReceiverId = message.ReceiverPartyId
      transactionState.Agreed = false
    }, User.util.getUnrestrictedUser())
    return transactionState
  }

  private function changeClaimNotify(bureau: ECFBureauType_Ext, transactionStatus: ECFTransactionStatus_Ext) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaimNotify = bundle.add(newClaimNotify)
      newClaimNotify.ECFContactData.InsurerAgency = bureau.getCode()
      newClaimNotify.TransactionStatus = transactionStatus
    }, User.util.UnrestrictedUser)
  }

  private function prepareContactDetails() {
    newClaimResponse.ContactName = "ContactName"
    newClaimResponse.ContactEmail = "email@guidewire.com"
    newClaimResponse.ContactTelephone = "001"
    newClaimResponse.LeadContactName = null
    newClaimResponse.LeadContactEmail = null
    newClaimResponse.LeadContactTelephone = null
  }

  private function prepareActions() {
    // Lead Actions
    newClaimResponse.ContactName = "ContactName"
    newClaimResponse.ContactEmail = "ContactEmail"
    newClaimResponse.ContactTelephone = "ContactTelephone"
    newClaimResponse.ClassOfBusiness = ECFClassOfBusiness_Ext.TC_A
    newClaimResponse.CategoryCode = ECFClaimCategoryCode_Ext.TC_A
    newClaimResponse.SubCategoryCode = ECFClaimSubCatCode_Ext.TC_AB
    newClaimResponse.CedantInLiquidationIndicator = "Y"
    newClaimResponse.SimultaneousRIPIndicator = "Y"
    newClaimResponse.MinorPrecautionaryIndicator = "Y"
    newClaimResponse.ChaseUpIndicator = "Y"
    newClaimResponse.ChaseUpIndicatorInterval = 9
    newClaimResponse.ContractConditionsApplyInd = ECFContractConditions_Ext.TC_Y
    newClaimResponse.AllUnderwritersToSeeFileInd = "Y"
    newClaimResponse.PublicComments = createPublicComments(PUBLIC_COMMENT_LIMIT)
    newClaimResponse.ImportedServicesNarrative1 = "Narrative"
    newClaimResponse.LeadReserveAmount1 = newClaimNotify.Financials[0].LeadReserveAmount
    // SAP Actions
    newClaimResponse.InsurerOrReinsurerClaimRef1 = "ClaimRef1"
    newClaimResponse.InsurerOrReinsurerClaimRef2 = "ClaimRef2"
    newClaimResponse.RequestToBroker1 = "Broker1"
    newClaimResponse.RequestToBroker2 = "Broker2"
    newClaimResponse.PrivateFootnote = "PrivateFootnote"
    newClaimResponse.NoFurtherResponseIndicator = "Y"
    newClaimResponse.ImmediatePartCollectionInd = "Y"
    newClaimResponse.MultipleResponseIndicator = "Y"
  }
}
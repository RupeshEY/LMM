package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass

class ECFEMessageResponseAcknowledgement_ExtEnhancementTest extends GUnitTestClass {

  public function testErrorCodeWhenNullErrorCode() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_ACKNOWLEDGED
      responseAck.AcknowledgementLevelIndicator = "application_validation"
      responseAck.ResponseDescription = ECFAckLevelCode_Ext.TC_SUCCESS.DisplayName
      responseAck.ErrorCode = null

      assertNull("Message should be null when no errors occur", responseAck.ErrorMessage)
    })
  }

  public function testErrorCodeReturnsMessage() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED
      responseAck.AcknowledgementLevelIndicator = "application_validation"
      responseAck.ResponseDescription = ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS.DisplayName
      responseAck.ErrorCode = 123

      assertEquals("Message format is incorrect", "[123] Partial Response - CLASS Unavailable/Unable to retrieve CLASS data", responseAck.ErrorMessage)
    })
  }

  public function testIsRejectedShouldBeFalseForNullStatus() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AcknowledgementStatus = null

      assertFalse("Rejected should be false", responseAck.IsRejected)
    })
  }

  public function testIsRejectedShouldBeTrueForRejectedResponses() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_REJECTED

      assertTrue("Rejected should be true", responseAck.IsRejected)
    })
  }

  public function testIsRejectedShouldBeFalseForAcknowledgedResponses() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.TC_ACKNOWLEDGED

      assertFalse("Rejected should be false", responseAck.IsRejected)
    })
  }

  public function testHasNoClaimData() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AckLevel = ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS
      assertTrue("Response should have no claim data", responseAck.HasNoClaimData)
    })
  }

  public function testHasNoClaimData_False() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\ -> {
      var responseAck = new ECFMessageResponseAcknowledgement_Ext()
      responseAck.AckLevel = ECFAckLevelCode_Ext.TC_SUCCESS
      assertFalse("Response should have no claim data", responseAck.HasNoClaimData)
    })
  }
}
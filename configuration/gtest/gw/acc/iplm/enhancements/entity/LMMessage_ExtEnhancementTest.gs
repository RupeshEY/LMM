package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.testutils.EntityUtil
uses gw.testharness.v3.GUnitTestClass

class LMMessage_ExtEnhancementTest extends GUnitTestClass {

  public function testSetTransactionStatusType_ExactCode() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      message.TransactionStatusType = "17-COND-AUTHORISED"
      assertEquals(ECFTransactionStatus_Ext.TC_17_COND_AUTHORISED, message.TransactionStatus)
    })
  }

  public function testSetTransactionStatusType_CodeWithSpaces() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      message.TransactionStatusType = "17- COND - AUTHORISED"
      assertNull(message.TransactionStatus)
    })
  }

  public function testSetTransactionStatusType_ExactName() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      message.TransactionStatusType = "10-AWAITING/QUERIED"
      assertEquals(ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED, message.TransactionStatus)
    })
  }

  public function testSetTransactionStatusType_NameWithSpaces() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      message.TransactionStatusType = "12-PENDED/ REJECTED"
      assertEquals(ECFTransactionStatus_Ext.TC_12_PENDED_REJECTED, message.TransactionStatus)
    })
  }

  public function testSetTransactionStatusType_NoMatch() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      message.TransactionStatusType = "NOT A VALID NAME OR CODE"
      assertNull(message.TransactionStatus)
    })
  }

  public function testGetMessageTypeString_ClaimNotifyRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimNotifyRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_ClaimResponseRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimResponseRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_ClaimResponseRs() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimResponseRs_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_ClaimRetrieveRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimRetrieveRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_ClaimRetrieveRs() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimRetrieveRs_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentUploadRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentUploadRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentUploadRs() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentUploadRs_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentDownloadRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentDownloadRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentDownloadRs() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentDownloadRs_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentSearchRq() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentSearchRq_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentSearchRs() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentSearchRs_Ext()
      assertEquals(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_ClaimData() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimData_Ext()
      assertNull(message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentDownloadReceipt() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentPostRs_Ext()
      message.MessageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOADRECEIPT
      assertEquals(LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentUploadReceipt() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentPostRs_Ext()
      message.MessageType = ECFMessageType_Ext.TC_REPOSITORYUPLOADRECEIPT
      assertEquals(LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageTypeString_DocumentSearchReceipt() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageDocumentPostRs_Ext()
      message.MessageType = ECFMessageType_Ext.TC_REPOSITORYSEARCHRECEIPT
      assertEquals(LMMessageTypeString_Ext.TC_REPOSITORYSEARCHRECEIPT.DisplayName, message.MessageTypeString)
    })
  }

  public function testGetMessageDirectionType_ClaimData() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\-> {
      var message = new ECFMessageClaimData_Ext()
      assertNull(message.MessageDirection)
    })
  }

}